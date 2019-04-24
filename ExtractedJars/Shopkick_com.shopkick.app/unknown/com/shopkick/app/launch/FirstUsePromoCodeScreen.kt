package com.shopkick.app.launch

import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import com.shopkick.app.R
import com.shopkick.app.account.UserAccountDataSource
import com.shopkick.app.application.ScreenGlobals
import com.shopkick.app.fetchers.api.IAPIObject
import com.shopkick.app.fetchers.api.SKAPI
import com.shopkick.app.fetchers.api.skapi.*
import com.shopkick.app.screens.AppScreen
import com.shopkick.app.util.TypeUtils
import com.shopkick.app.widget.SKButton
import com.shopkick.fetchers.ClientError
import com.shopkick.fetchers.DataResponse
import com.shopkick.fetchers.api.APIManager
import com.shopkick.fetchers.api.IAPICallback

class FirstUsePromoCodeScreen : AppScreen(), View.OnClickListener, TextWatcher, IAPICallback {

    // Constant values for animation
    private val ANIMATION_DURATION = 200L
    private val ALPHA_DISABLED = 0.4f
    private val DELAY_AFTER_APPLIED = 1000L
    private val MESSAGE_TO_AVOID = "Something"

    // ScreenGlobal object references
    private var apiManager: APIManager? = null
    private var userAccountDataSource: UserAccountDataSource? = null

    // Views
    private var promoCodeText: EditText? = null
    private var promoCodeInputLayout: TextInputLayout? = null
    private var verificationIcon: ImageView? = null
    private var progressBar: View? = null
    private var nextButton: SKButton? = null
    private var skipButton: SKButton? = null

    // Request object to send promo code to the server
    private var redeemMarketingPromoCodeRequest: RedeemMarketingPromoCodeRequest? = null
    private var redeemPromoCodeRequest: RedeemPromoCodeRequest? = null
    private var prevErrorMessage: String? = null

    // SkURL to the next screen
    private var buttonUrl: String? = null

    // Request state
    private var requestState: RequestState = RequestState.INITIAL_STATE
    enum class RequestState {
        INITIAL_STATE,
        ONE_REQUEST_FAILED,
        REQUEST_SUCCEEDED
    }

    override fun init(screenGlobals: ScreenGlobals?, params: MutableMap<String, String>?) {
        apiManager = screenGlobals?.apiManagerV2
        userAccountDataSource = screenGlobals?.userAccountDataSource
        buttonUrl = params?.get(FirstUseControllerV2.FIRST_USE_SCREEN_PARAM_BUTTON_URL)
    }

    override fun updateScreenParams(clientLogRecordToUpdate: ClientLogRecord) {
        super.updateScreenParams(clientLogRecordToUpdate)

        // Add flowId to AppScreen logging
        val flowId = params[FirstUseControllerV2.FIRST_USE_SCREENS_PARAM_FLOW_ID]
        if (!TypeUtils.isEmptyString(flowId)) {
            clientLogRecordToUpdate.flowId = flowId
        }
    }

    override fun createScreen(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.first_use_promo_code_screen, container, false)

        promoCodeText = view.findViewById(R.id.promo_code_text)
        promoCodeInputLayout = view.findViewById(R.id.promo_code_input_layout)
        verificationIcon = view.findViewById(R.id.verification_icon)
        progressBar = view.findViewById(R.id.loading_spinner)
        nextButton = view.findViewById(R.id.next_button)
        skipButton = view.findViewById(R.id.skip_button)

        promoCodeText?.addTextChangedListener(this)
        nextButton?.setOnClickListener(this)
        skipButton?.setOnClickListener(this)

        setupLogging()

        // Since there is no text in promoCodeText, disable the button
        nextButton?.isEnabled = false
        nextButton?.alpha = ALPHA_DISABLED

        return view
    }

    override fun shouldHideBack(): Boolean {
        return true
    }

    override fun shouldDisplayAppScreenHeader(): Boolean {
        return false
    }

    override fun onDestroy() {
        super.onDestroy()
        cancelAllRequests()
    }

    override fun onScreenDidShow() {
        super.onScreenDidShow()
        // Give focus only if EditText is enabled
        if (promoCodeText?.isEnabled == true) {
            promoCodeText?.requestFocus()
            showKeyboard()
        }
    }

    private fun setupLogging() {
        nextButton?.setupEventLog(ClientLogRecord(SKAPI.ElementNextButton, SKAPI.ActionShowDetail), eventLogger, null)
        skipButton?.setupEventLog(ClientLogRecord(SKAPI.ElementSkipButton, SKAPI.ActionShowDetail), eventLogger, null)
    }

    // Send requests to server
    private fun validatePromoCode() {
        val promoCode = promoCodeText?.text.toString().trim()
        if (TypeUtils.isEmptyString(promoCode)) return

        promoCodeText?.isEnabled = false
        promoCodeText?.clearFocus()
        hideKeyboard()

        cancelAllRequests()

        promoCodeText?.isEnabled = false
        promoCodeInputLayout?.error = null

        progressBar?.visibility = View.VISIBLE
        nextButton?.setButtonText(null)
        nextButton?.isEnabled = false

        redeemPromoCodeRequest = userAccountDataSource?.makeRedeemPromoCodeRequest(promoCode, this)
        redeemMarketingPromoCodeRequest = userAccountDataSource?.makeRedeemMarketingPromoCodeRequest(promoCode, this)
    }

    // Cancel all requests
    private fun cancelAllRequests() {
        redeemMarketingPromoCodeRequest?.let {
            apiManager?.cancel(it, this@FirstUsePromoCodeScreen)
        }

        redeemPromoCodeRequest?.let {
            apiManager?.cancel(it, this@FirstUsePromoCodeScreen)
        }

        redeemMarketingPromoCodeRequest = null
        redeemPromoCodeRequest = null

        requestState = RequestState.INITIAL_STATE
    }

    // Set the status of the applied code to indicate the code has been applied.
    private fun setCodeAppliedState() {
        cancelAllRequests()

        val context: Context = nextButton?.context ?: return

        nextButton?.setButtonTextColor(context.getColor(R.color.white))
        nextButton?.setButtonText(R.string.first_use_promo_code_screen_code_applied)
        nextButton?.isEnabled = false

        disableView(skipButton)

        verificationIcon?.setImageResource(R.drawable.first_use_promo_code_check_icon)
        verificationIcon?.visibility = View.VISIBLE

        progressBar?.visibility = View.GONE

        // Animate next button color to green
        val dstColor = getResourceColor(R.color.green)
        val buttonColorAnimator = ObjectAnimator.ofFloat(0f, 1f)
        buttonColorAnimator.addUpdateListener {
            val alphaDstColor = adjustAlpha(dstColor, it.animatedValue as Float)
            nextButton?.background?.setColorFilter(alphaDstColor, PorterDuff.Mode.SRC_ATOP)
        }
        buttonColorAnimator.duration = ANIMATION_DURATION
        buttonColorAnimator.start()

        // Proceed to the next flow
        nextButton?.postDelayed(this::triggerNextScreen, ANIMATION_DURATION + DELAY_AFTER_APPLIED)
    }

    private fun setCodeAppliedErrorState(errorMessage: String?) {
        // Pick more meaningful error message between two
        val message = when (prevErrorMessage?.contains(MESSAGE_TO_AVOID)) {
            false -> prevErrorMessage
            else -> errorMessage
        }

        prevErrorMessage = null
        cancelAllRequests()

        promoCodeText?.isEnabled = true
        promoCodeText?.requestFocus()
        promoCodeInputLayout?.error = message ?: return
        showKeyboard()

        nextButton?.setButtonText(R.string.first_use_promo_code_screen_apply_code)
        disableView(nextButton)
        enableView(skipButton)

        verificationIcon?.setImageResource(R.drawable.first_use_promo_code_error_icon)
        verificationIcon?.visibility = View.VISIBLE

        progressBar?.visibility = View.GONE
    }

    private fun triggerNextScreen() {
        cancelAllRequests()
        buttonUrl?.let {
            val urlDispatcher = screenGlobals.urlDispatcherFactory.dispatcher()
            urlDispatcher.dispatchURL(it)
        } ?: popScreen()
    }


    ///////////////////////////////////
    // View helper methods
    ///////////////////////////////////

    private fun adjustAlpha(color: Int, factor: Float): Int {
        val alpha = Math.round(Color.alpha(color) * factor)
        val red = Color.red(color)
        val green = Color.green(color)
        val blue = Color.blue(color)
        return Color.argb(alpha, red, green, blue)
    }

    private fun enableView(view: View?) {
        view?.isEnabled = true
        view?.clearAnimation()
        view?.animate()?.alpha(1.0f)?.setDuration(ANIMATION_DURATION)?.start()
    }

    private fun disableView(view: View?) {
        view?.isEnabled = false
        view?.clearAnimation()
        view?.animate()?.alpha(ALPHA_DISABLED)?.setDuration(ANIMATION_DURATION)?.start()
    }


    ///////////////////////////////////
    // View.OnClickListener methods
    ///////////////////////////////////

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.next_button -> validatePromoCode()
            R.id.skip_button -> triggerNextScreen()
        }
    }


    ///////////////////////////////////
    // TextWatcher methods
    ///////////////////////////////////

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        // Do nothing
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        // Do nothing
    }

    override fun afterTextChanged(s: Editable?) {
        val newPromoCode = promoCodeText?.text.toString()

        // Disable Next button if EditText is empty
        if (TypeUtils.isEmptyString(newPromoCode)) {
            disableView(nextButton)
        } else {
            enableView(nextButton)
        }

        // Reset error state
        enableView(skipButton)
        promoCodeInputLayout?.error = null
        verificationIcon?.visibility = View.GONE
    }


    ///////////////////////////////////
    // IAPICallback methods
    ///////////////////////////////////

    override fun receivedResponse(request: IAPIObject?, response: DataResponse?) {
        // Do nothing
    }

    override fun completedResponse(request: IAPIObject?, response: DataResponse?) {
        // Do nothing if previous request already succeeded
        if (requestState == RequestState.REQUEST_SUCCEEDED) return

        val context: Context? = nextButton?.context ?: return
        var errorMessage: String? = null

        if (response?.success == false || response?.responseData == null) {
            // If error returns, store error message
            errorMessage = when (response?.clientError) {
                ClientError.NO_NETWORK_ERROR -> context?.getString(R.string.redeem_promo_code_offline_message)
                else -> context?.getString(R.string.invite_promo_code_screen_server_offline_detail)
            }

        } else {
            // Check redeem was successful or store error message
            when (response.responseData) {
                is RedeemPromoCodeResponse -> {
                    (response.responseData as RedeemPromoCodeResponse).let{
                        when (it.redemptionStatus) {
                            SKAPI.PromoCodeRedemptionStatusSuccess -> requestState = RequestState.REQUEST_SUCCEEDED
                            else -> errorMessage = it.errorMessage
                        }
                    }
                }
                is RedeemMarketingPromoCodeResponse -> {
                    (response.responseData as RedeemMarketingPromoCodeResponse).let{
                        when (it.redemptionStatus) {
                            SKAPI.PromoCodeRedemptionStatusSuccess -> requestState = RequestState.REQUEST_SUCCEEDED
                            else -> errorMessage = it.errorMessage
                        }
                    }
                }
                else -> errorMessage = context?.getString(R.string.invite_promo_code_screen_server_offline_detail)
            }
        }

        when (requestState) {
            RequestState.ONE_REQUEST_FAILED -> setCodeAppliedErrorState(errorMessage)
            RequestState.REQUEST_SUCCEEDED -> setCodeAppliedState()
            RequestState.INITIAL_STATE -> {
                prevErrorMessage = errorMessage
                requestState = RequestState.ONE_REQUEST_FAILED
            }
        }
    }
}