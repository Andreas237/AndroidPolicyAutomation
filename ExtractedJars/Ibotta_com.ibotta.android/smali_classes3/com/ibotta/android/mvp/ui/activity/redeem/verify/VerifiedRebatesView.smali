.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;
.super Ljava/lang/Object;
.source "VerifiedRebatesView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setCollectButtonEnabled(Z)V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setVerificationOfferQuantityStates(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setVerificationSummary(ZILjava/lang/String;)V
.end method

.method public abstract showAddRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showChangeQuantityForResult(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract showExitConfirmation()V
.end method

.method public abstract showProductVerifiedSuccess()V
.end method

.method public abstract showRemoveConfirmation(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract showSubmitReceipt(Lcom/ibotta/android/fragment/retailer/RetailerParcel;F)V
.end method
