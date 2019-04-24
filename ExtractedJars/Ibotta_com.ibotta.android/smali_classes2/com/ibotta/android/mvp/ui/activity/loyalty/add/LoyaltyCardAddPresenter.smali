.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;
.super Ljava/lang/Object;
.source "LoyaltyCardAddPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onAddCardClicked()V
.end method

.method public abstract onBarcodeScanned([Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
.end method

.method public abstract onCardNumberChanged(Ljava/lang/String;)V
.end method

.method public abstract onHelpCenterClicked()V
.end method

.method public abstract onHelpClicked()V
.end method

.method public abstract onHelpInstructionsClicked()V
.end method

.method public abstract onScanClicked()V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method
