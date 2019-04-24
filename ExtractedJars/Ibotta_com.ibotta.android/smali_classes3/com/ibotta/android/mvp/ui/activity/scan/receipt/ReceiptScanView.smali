.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;
.super Ljava/lang/Object;
.source "ReceiptScanView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;


# virtual methods
.method public abstract finishWithSuccess([Ljava/lang/String;)V
.end method

.method public abstract finishWithTakePhotoInstead([Ljava/lang/String;)V
.end method

.method public abstract getInstructions()Ljava/lang/String;
.end method

.method public abstract setFooter(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract showInvalidBarcode()V
.end method
