.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;
.super Ljava/lang/Object;
.source "MyOffersGalleryView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# virtual methods
.method public abstract finishWithAllRebatesRemoved()V
.end method

.method public abstract hideRemovingRebatesMessage()V
.end method

.method public abstract navigateBack()V
.end method

.method public abstract selectCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)V
.end method

.method public abstract setEditAllowed(Z)V
.end method

.method public abstract setEditing(Z)V
.end method

.method public abstract showRemoveConfirmation(I)V
.end method

.method public abstract showRemovedRebatesSuccess()V
.end method

.method public abstract showRemovingRebatesMessage()V
.end method
