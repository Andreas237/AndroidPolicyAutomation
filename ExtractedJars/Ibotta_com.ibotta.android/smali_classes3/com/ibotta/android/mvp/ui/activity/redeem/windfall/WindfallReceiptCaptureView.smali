.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;
.super Ljava/lang/Object;
.source "WindfallReceiptCaptureView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract capturePhoto()V
.end method

.method public abstract confirmCapture(Lcom/microblink/BitmapResult;)V
.end method

.method public abstract destroyReceiptGuide()V
.end method

.method public abstract destroyRecognizer()V
.end method

.method public abstract finishScan()V
.end method

.method public abstract finishWithFailure()V
.end method

.method public abstract finishWithSuccessResult(I)V
.end method

.method public abstract getButtonCaptureMode()Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;
.end method

.method public abstract getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation
.end method

.method public abstract hideMoveCloserMessage()V
.end method

.method public abstract initWithScanOptions(Lcom/microblink/ScanOptions;)V
.end method

.method public abstract pauseReceiptGuide()V
.end method

.method public abstract pauseRecognizer()V
.end method

.method public abstract releaseCapturedPhoto()V
.end method

.method public abstract resumeRecognizer()V
.end method

.method public abstract setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V
.end method

.method public abstract setCanSubmit(Z)V
.end method

.method public abstract setCaptureAllowed(Z)V
.end method

.method public abstract setCaptureCount(I)V
.end method

.method public abstract setCapturedReceiptBitmap(Lcom/microblink/BitmapResult;)V
.end method

.method public abstract setup(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
.end method

.method public abstract showCaptureFailed()V
.end method

.method public abstract showInitFailed()V
.end method

.method public abstract showMoveCloserMessage()V
.end method

.method public abstract showPreviousReceipt(Lcom/microblink/BitmapResult;)V
.end method

.method public abstract showRebatesFound(I)V
.end method

.method public abstract showReceiptImageSaveFailed()V
.end method

.method public abstract showScanFailed()V
.end method

.method public abstract startRecognizer()V
.end method

.method public abstract stopRecognizer()V
.end method
