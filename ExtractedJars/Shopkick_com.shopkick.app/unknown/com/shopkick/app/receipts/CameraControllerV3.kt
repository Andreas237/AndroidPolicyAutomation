package com.shopkick.app.receipts

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Matrix
import android.media.MediaActionSound
import android.util.Log
import android.view.View
import com.shopkick.app.BuildConfig
import com.shopkick.app.R
import com.shopkick.app.application.ScreenGlobals
import com.shopkick.app.util.TypeUtils
import io.fotoapparat.Fotoapparat
import io.fotoapparat.configuration.CameraConfiguration
import io.fotoapparat.parameter.Resolution
import io.fotoapparat.parameter.ScaleType
import io.fotoapparat.result.BitmapPhoto
import io.fotoapparat.selector.*
import io.fotoapparat.view.CameraView

class CameraControllerV3(
        appScreen: ReceiptScanScreen?,
        screenGlobals: ScreenGlobals?,
        params: MutableMap<String, String>?,
        mainView: View) : AbstractCameraController(appScreen, screenGlobals, params) {

    private val LOG_TAG = CameraControllerV3::class.java.simpleName

    private var context: Context? = null
    private var cameraView: CameraView? = null
    private var fotoapparat: Fotoapparat? = null
    private var cameraState: CameraState = CameraState.STATE_INITIAL
    private var mediaActionSound: MediaActionSound? = null

    private var captureInProgress = false

    private var alignHereImage: Bitmap? = null
    private var oldAlignHereImage: Bitmap? = null

    enum class CameraState {
        // Camera state: Initial. Haven't started anything yet.
        STATE_INITIAL,
        // Camera state: Ready to take an image
        STATE_READY_TO_TAKE_FIRST_PHOTO,
        // Camera state: A picture has been taken. Show the captured image.
        STATE_PICTURE_TAKEN,
        // Camera state: Ready to take another photo
        STATE_READY_TO_TAKE_ANOTHER_PHOTO,
        // Camera state: Something bad has happened. Try to fail gracefully.
        STATE_ERROR
    }

    init {
        cameraView = (mainView.findViewById(R.id.cameraUISurface) as CameraView).apply {
            visibility = View.VISIBLE
            fotoapparat = Fotoapparat(
                    context = mainView.context,
                    view = this,
                    scaleType = ScaleType.CenterCrop,
                    lensPosition = back(),
                    cameraConfiguration = CameraConfiguration(
                            flashMode = autoFlash(),
                            pictureResolution = { bestResolution(this) },
                            previewResolution = lowestResolution(),
                            jpegQuality = manualJpegQuality(jpegCompressionLevel)
                    ),
                    cameraErrorCallback = { cameraException ->
                        log(cameraException.message)
                        updateCameraUI(CameraState.STATE_ERROR)
                    }
            )
        }

        context = mainView.context.applicationContext
        scanCount = 0
        ReceiptScanImageCache.getInstance().clearCache(context)
    }

    // Called on onScreenWillShow
    // Start camera and update UI
    override fun performResumeActions() {
        super.performResumeActions()
        // Load shutter sound
        mediaActionSound = MediaActionSound()
        mediaActionSound?.load(MediaActionSound.SHUTTER_CLICK)

        // Start Fotoapparat
        fotoapparat?.start()
        updateCameraUI(cameraState)
    }

    // Called on onScreenDidHide
    // Close cameara and free resources
    override fun freeResourcesForPause() {
        super.freeResourcesForPause()
        mediaActionSound?.release()
        fotoapparat?.stop()
        captureInProgress = false
    }

    override fun isCameraReady(): Boolean {
        return fotoapparat?.isAvailable(back()) ?: false
    }

    override fun canCancel(): Boolean {
        if (hasValidFragment()) return cameraState == CameraState.STATE_READY_TO_TAKE_FIRST_PHOTO
        return cameraState == CameraState.STATE_READY_TO_TAKE_FIRST_PHOTO || cameraState == CameraState.STATE_INITIAL
    }

    override fun takePhoto() {
        if (captureInProgress) return

        // Play mediaActionSound sound
        mediaActionSound?.play(MediaActionSound.SHUTTER_CLICK)

        // Take a picture
        val photoResult = fotoapparat?.autoFocus()?.takePicture() ?: return
        captureInProgress = true

        photoResult.toBitmap().whenAvailable { bitmapPhoto ->
            onImageAvailable(bitmapPhoto)
            captureInProgress = false
        }
    }

    override fun addSection() {
        if (scanCount >= maxScanCount) {
            receiptScanScreenFragment.get()?.showDialogScanCountThreshold()
        } else {
            scanCount++
            updateCameraUI(CameraState.STATE_READY_TO_TAKE_ANOTHER_PHOTO)
        }
    }

    override fun retake() {
        // Delete the most recent addition to the image cache.
        if (lastImageCache != null) {
            ReceiptScanImageCache.getInstance().deleteImage(context, lastImageCache)
            if (oldAlignHereImage != null && hasValidFragment()) {
                alignHereImage = oldAlignHereImage
                receiptScanScreenFragment.get()?.setTempAlignHerePreviewBitmap(alignHereImage)
            }
            lastImageCache = null
        }

        // Update UI state
        updateCameraUI(when (scanCount) {
            0 -> CameraState.STATE_READY_TO_TAKE_FIRST_PHOTO
            else -> CameraState.STATE_READY_TO_TAKE_ANOTHER_PHOTO
        })
    }

    private fun onImageAvailable(bitmapPhoto: BitmapPhoto?) {
        if (bitmapPhoto == null) {
            isProcessingInitialImage = false
            return
        }

        log("Captured image: " + bitmapPhoto.bitmap.width + "x" + bitmapPhoto.bitmap.height)

        var bitmap = bitmapPhoto.bitmap

        // Rotate image before saving & cutting as we need to rotate image for both of AlignHereImage & storing
        if (bitmapPhoto.rotationDegrees != 0) {
            log("Try rotation. Current degrees: " + bitmapPhoto.rotationDegrees)
            val matrix = Matrix()
            matrix.postRotate(360f - bitmapPhoto.rotationDegrees.toFloat())
            bitmap = Bitmap.createBitmap(bitmap,
                    0,
                    0,
                    bitmap.width,
                    bitmap.height,
                    matrix,
                    true)

            // Recycle original bitmap after rotation
            bitmapPhoto.bitmap.recycle()
        }

        ReceiptScanImageCache.getInstance().run{
            lastWidth = bitmap.width
            lastHeight = bitmap.height
        }

        // Start analyzing bitmapPhoto using OCR reader
        if (!TypeUtils.isTrue(clientFlagsManager.clientFlags.disableOcrProcessing, true)) {
            Thread(Runnable { analyzeReceipt(bitmap) }).start()
        }

        // Replace the old alignHereImage with the new one, in advance of replacing the current one with a new cutting.
        updateAlignHereImage(bitmap)

        // Store image byte array to ReceiptScanImageCache - rotation = 0 since we already did it
        // TODO: we may remove ReceiptScanImageCache and store to disk directly when deprecating CameraControllerV1 and V2
        lastImageCache = ReceiptScanImageCache.getInstance().addImage(context, bitmap, jpegCompressionLevel, 0, true)
        isProcessingInitialImage = false

        // Update UI
        updateCameraUI(CameraState.STATE_PICTURE_TAKEN)
        if (alignHereImage != null) {
            receiptScanScreenFragment.get()?.setTempAlignHerePreviewBitmap(alignHereImage)
        }
    }

    // Generate a bitmap for AlignHere image
    private fun updateAlignHereImage(bitmap: Bitmap?) {
        if (bitmap == null || bitmap.width == 0 || bitmap.height == 0) return

        val widthScale = (cameraView?.width?.toFloat() ?: return) / bitmap.width.toFloat()
        val heightScale = (cameraView?.height?.toFloat() ?: return) / bitmap.height.toFloat()
        val matrix = Matrix()
        matrix.postScale(widthScale, heightScale)

        oldAlignHereImage = alignHereImage

        receiptScanScreenFragment.get()?.getAlignHereHeight()?.let {
            val alignHereHeightBeforeScale = Math.round(it.toFloat() / heightScale)
            alignHereImage = Bitmap.createBitmap(bitmap,
                    0,
                    bitmap.height - alignHereHeightBeforeScale,
                    bitmap.width,
                    alignHereHeightBeforeScale,
                    matrix,
                    true)

            log("AlignHereImage cutting: " + alignHereHeightBeforeScale + " from " + bitmap.height + ", scale ratio: " + widthScale + "/" + heightScale)
        }
    }

    // Update camera UI on main thread
    private fun updateCameraUI(state: CameraState) {
        cameraView?.post {
            receiptScanScreenFragment.get()?.updateUIFromState(when (state) {
                CameraState.STATE_INITIAL -> ReceiptScanScreen.READY_TO_TAKE
                CameraState.STATE_PICTURE_TAKEN -> ReceiptScanScreen.PREVIEW_AND_ASK_USER
                CameraState.STATE_READY_TO_TAKE_FIRST_PHOTO -> ReceiptScanScreen.READY_TO_TAKE
                CameraState.STATE_READY_TO_TAKE_ANOTHER_PHOTO -> ReceiptScanScreen.TAKE_ANOTHER
                CameraState.STATE_ERROR -> ReceiptScanScreen.ERROR
            })
        }
        cameraState = state
    }

    // Pick best fit resolution from provided resolution list
    private fun bestResolution(iterable: Iterable<Resolution>): Resolution? {
        // Extension to get rounded aspect ratio easily
        fun Resolution.roundedRatio(): Float = Math.round(aspectRatio * 100) / 100f

        val resolutionList = iterable.asSequence().sortedBy(Resolution::area)
        var bestResolutionWithRatio: Resolution? = null
        var bestResolutionWithoutRatio: Resolution? = null

        val expectedRatio = Math.round(requestedImageSize.width.toFloat() / requestedImageSize.height.toFloat() * 100) / 100f
        val expectedArea = requestedImageSize.width * requestedImageSize.height

        run loop@{
            resolutionList.forEach {
                if (it.area <= expectedArea) {
                    bestResolutionWithoutRatio = it

                    if (it.roundedRatio() == expectedRatio) {
                        bestResolutionWithRatio = it
                    }
                } else {
                    return@loop
                }
            }
        }

        log("Requested resolution: " + expectedRatio + " at " + requestedImageSize.width + "x" + requestedImageSize.height + ", picked: "
                + (bestResolutionWithRatio?.roundedRatio() ?: bestResolutionWithoutRatio?.roundedRatio()) + " at "
                + (bestResolutionWithRatio?.width ?: bestResolutionWithoutRatio?.width) + "x" + (bestResolutionWithRatio?.height ?: bestResolutionWithoutRatio?.height))

        return bestResolutionWithRatio ?: bestResolutionWithoutRatio ?: resolutionList.last()
    }

    private fun log(message: String?) {
        if (BuildConfig.DEBUG && message != null) {
            Log.d(LOG_TAG, message)
        }
    }
}