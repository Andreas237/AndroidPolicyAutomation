.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;
.super Ljava/lang/Object;
.source "LinkedOfferView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract finishWithCancel()V
.end method

.method public abstract finishWithError()V
.end method

.method public abstract finishWithSuccess()V
.end method

.method public abstract initForOffer(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract launchNewOffer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
.end method
