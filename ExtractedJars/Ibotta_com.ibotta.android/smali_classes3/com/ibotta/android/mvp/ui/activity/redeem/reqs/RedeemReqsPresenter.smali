.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;
.super Ljava/lang/Object;
.source "RedeemReqsPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract onContinueClicked()V
.end method

.method public abstract onNoSavedState()V
.end method

.method public abstract onOcrReceiptCaptureCancelled()V
.end method

.method public abstract onOcrReceiptCaptureSuccess(I)V
.end method

.method public abstract onRebatesFoundDisplayed()V
.end method

.method public abstract onReceiptBarcodeCaptureCancelled()V
.end method

.method public abstract onReceiptBarcodeCapturedSuccess([Ljava/lang/String;)V
.end method

.method public abstract onStandardReceiptCaptureCancelled()V
.end method

.method public abstract onStandardReceiptCaptureSuccess()V
.end method

.method public abstract onTakePhotoInstead([Ljava/lang/String;)V
.end method

.method public abstract onWalmartQrCodeProcessedFailed(Ljava/lang/Throwable;)V
.end method

.method public abstract onWalmartQrCodeProcessedSuccessfully(Lcom/microblink/ScanResults;)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method
