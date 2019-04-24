.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;
.super Ljava/lang/Object;
.source "LoyaltyCardAddView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract finishWithSuccess(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V
.end method

.method public abstract setAddCardAllowed(Z)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract setScannedBarcode(Ljava/lang/String;)V
.end method

.method public abstract setup(Ljava/lang/String;Ljava/lang/String;ZZ)V
.end method

.method public abstract showAddCardFailed()V
.end method

.method public abstract showHelp()V
.end method

.method public abstract showHelpCenter()V
.end method

.method public abstract showHelpInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showLoyaltyBarcodeScanner(Lcom/ibotta/android/barcode/ScanType;)V
.end method
