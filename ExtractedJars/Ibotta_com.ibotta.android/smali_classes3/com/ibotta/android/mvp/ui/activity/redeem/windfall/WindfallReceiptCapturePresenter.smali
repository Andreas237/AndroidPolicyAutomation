.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;
.super Ljava/lang/Object;
.source "WindfallReceiptCapturePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getCaptureCount()I
.end method

.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end method

.method public abstract onBitmapResultReceived(Lcom/microblink/BitmapResult;)V
.end method

.method public abstract onCameraFrameFailed()V
.end method

.method public abstract onCaptureFailedDisplayed()V
.end method

.method public abstract onInitFailed()V
.end method

.method public abstract onInitWithScanOptionsFailed()V
.end method

.method public abstract onLoadState(ZLcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onPreviewStarted()V
.end method

.method public abstract onReadyForSetup()V
.end method

.method public abstract onRebatesFoundDisplayed()V
.end method

.method public abstract onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
.end method

.method public abstract onReceiptImageSufficientlyClose()V
.end method

.method public abstract onReceiptImageTooFarAway()V
.end method

.method public abstract onScanFailed(Ljava/lang/Throwable;)V
.end method

.method public abstract onScanFailedDisplayed()V
.end method

.method public abstract onScanSuccess(Lcom/microblink/Media;Lcom/microblink/ScanResults;)V
.end method
