.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;
.super Ljava/lang/Object;
.source "VerifyRebatesPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onAddClicked()V
.end method

.method public abstract onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
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

.method public abstract onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract setExcludedOfferIds([I)V
    .param p1    # [I
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setShowVerifiedOnFinish(Z)V
.end method
