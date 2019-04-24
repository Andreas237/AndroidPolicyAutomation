.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;
.super Ljava/lang/Object;
.source "VerifyScanView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;


# virtual methods
.method public abstract finishWithGaveUp(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;I)V
.end method

.method public abstract finishWithSuccess(I)V
.end method

.method public abstract getBarcodeScanInstructions()Ljava/lang/String;
.end method

.method public abstract setup(Ljava/lang/String;Ljava/lang/String;II)V
.end method

.method public abstract showAlreadyMatched()V
.end method

.method public abstract showMatch()V
.end method

.method public abstract showMismatch()V
.end method
