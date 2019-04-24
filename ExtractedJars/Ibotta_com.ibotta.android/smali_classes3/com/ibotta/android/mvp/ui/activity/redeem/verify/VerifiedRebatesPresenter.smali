.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;
.super Ljava/lang/Object;
.source "VerifiedRebatesPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onAddRebatesClicked()V
.end method

.method public abstract onBackPressed()V
.end method

.method public abstract onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract onCollectClicked()V
.end method

.method public abstract onExitConfirmationCancelled()V
.end method

.method public abstract onExitConfirmationConfirmed()V
.end method

.method public abstract onProductVerificationFailed()V
.end method

.method public abstract onProductVerificationSuccess()V
.end method

.method public abstract onQuantityDecreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract onQuantityIncreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract onQuantityNoChange(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract onRemoveConfirmationCancelled(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract onRemoveConfirmationConfirmed(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract setInfo(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;",
            ">;)V"
        }
    .end annotation
.end method
