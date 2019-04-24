.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;
.super Ljava/lang/Object;
.source "ReceiptScanPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end method

.method public abstract onTakePhotoInsteadClicked()V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method
