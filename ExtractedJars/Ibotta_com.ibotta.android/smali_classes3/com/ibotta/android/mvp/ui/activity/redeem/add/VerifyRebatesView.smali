.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;
.super Ljava/lang/Object;
.source "VerifyRebatesView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setAddButtonEnabled(Z)V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setVerificationSummary(ZILjava/lang/String;)V
.end method

.method public abstract showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showChangeQuantityForResult(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract showProductVerifiedSuccess()V
.end method

.method public abstract showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method
