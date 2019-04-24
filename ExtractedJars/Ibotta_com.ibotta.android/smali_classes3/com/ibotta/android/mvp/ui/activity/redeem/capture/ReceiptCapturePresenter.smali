.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;
.super Ljava/lang/Object;
.source "ReceiptCapturePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpPresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;"
    }
.end annotation


# virtual methods
.method public abstract getCaptureCount()I
.end method

.method public abstract getRetailerOptional()Ljava9/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Optional<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onBackPressed()V
.end method

.method public abstract onCameraConfigured()V
.end method

.method public abstract onCameraError()V
.end method

.method public abstract onCameraOpened()V
.end method

.method public abstract onCameraOpening()V
.end method

.method public abstract onFailureDialogDismissed()V
.end method

.method public abstract onFinishConfirmed()V
.end method

.method public abstract onFocusDetermined(Z)V
.end method

.method public abstract onFocusFail()V
.end method

.method public abstract onFocusing()V
.end method

.method public abstract onLoadState(ZLcom/ibotta/android/fragment/retailer/RetailerParcel;IZ)V
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onManualOverride()V
.end method

.method public abstract onOrientationDetermined(I)V
.end method

.method public abstract onPictureTaken([B)V
.end method

.method public abstract onPostCaptureAction(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
.end method

.method public abstract onPreviewStarted(Z)V
.end method

.method public abstract onPreviewStopped()V
.end method

.method public abstract onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
.end method
