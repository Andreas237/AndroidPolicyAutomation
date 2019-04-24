.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;
.super Ljava/lang/Object;
.source "LoyaltyScanView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;


# virtual methods
.method public abstract finishWithBarcodes(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getInstructions()Ljava/lang/String;
.end method
