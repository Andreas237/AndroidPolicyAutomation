.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;
.super Ljava/lang/Object;
.source "LinkedOfferPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getOfferModel()Lcom/ibotta/api/model/OfferModel;
.end method

.method public abstract getRetailerParcelIfAvailableAtOrigin()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end method

.method public abstract onCloseClicked()V
.end method

.method public abstract onNoThanksClicked()V
.end method

.method public abstract onViewRebateClicked()V
.end method

.method public abstract setOfferInfo(Ljava/lang/Integer;IJ)V
.end method
