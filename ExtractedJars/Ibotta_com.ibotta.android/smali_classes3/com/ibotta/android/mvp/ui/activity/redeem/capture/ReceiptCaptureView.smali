.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;
.super Ljava/lang/Object;
.source "ReceiptCaptureView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpView;


# virtual methods
.method public abstract confirmFinish(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract finishWithFailure()V
.end method

.method public abstract finishWithSuccess()V
.end method

.method public abstract getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation
.end method

.method public abstract pauseCamera()V
.end method

.method public abstract prepareGuide(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract resumeCamera()V
.end method

.method public abstract setCanSubmit(Z)V
.end method

.method public abstract setCaptureAllowed(Z)V
.end method

.method public abstract setReceiptCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V
.end method

.method public abstract showCameraError()V
.end method

.method public abstract showCaptureFailedError()V
.end method

.method public abstract showFocusFailedWarning()V
.end method

.method public abstract showInitializingWarning()V
.end method

.method public abstract showPleaseHoldWarning()V
.end method

.method public abstract showPostCapture(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract takePhoto(Z)V
.end method
