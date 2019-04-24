.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;
.super Ljava/lang/Object;
.source "RedeemReqsView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract disableContinueButton()V
.end method

.method public abstract finish()V
.end method

.method public abstract hideProcessingWalmartQrCode()V
.end method

.method public abstract recognizeWalmartQR(Lcom/microblink/Recognizer;Landroid/net/Uri;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;)V
.end method

.method public abstract setGeneralInstructions(I)V
.end method

.method public abstract setGeneralInstructionsTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract setImage(I)V
.end method

.method public abstract showOcrReceiptCaptureForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showProcessingWalmartQrCode()V
.end method

.method public abstract showRebatesFound(I)V
.end method

.method public abstract showReceiptScannerForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showStandardReceiptCaptureForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showVerifyRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method
