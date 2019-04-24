.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedPresenter;
.super Ljava/lang/Object;
.source "FeaturedPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/search/SearchMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/search/SearchMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getCurrentBalanceViewState()Lcom/ibotta/android/views/featured/CurrentBalanceViewState;
.end method

.method public abstract getRetailerModel(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/RetailerModel;
.end method

.method public abstract onActionClicked(Lcom/ibotta/api/model/base/Actionable;)V
.end method

.method public abstract onActivityClicked()V
.end method

.method public abstract onBonusClicked(Lcom/ibotta/api/model/base/Routable;)V
.end method

.method public abstract onCategoryClicked(Lcom/ibotta/api/model/retailer/Category;)V
.end method

.method public abstract onCustomerNotificationReceived()V
.end method

.method public abstract onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
.end method

.method public abstract onLocationPermissionsGranted()V
.end method

.method public abstract onQuestClicked(Lcom/ibotta/api/model/BonusModel;)V
.end method

.method public abstract onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onRetailerViewAllClicked(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
.end method

.method public abstract onTrackContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
.end method

.method public abstract onTrackUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
.end method

.method public abstract onTrackUnlocked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V
.end method

.method public abstract setOfferTag(Ljava/lang/String;)V
.end method

.method public abstract setResetViewStatesOnRefreshDisabled()V
.end method

.method public abstract setSearch(Ljava/lang/String;)V
.end method

.method public abstract showAmountBadge()Z
.end method

.method public abstract unfavorite(I)V
.end method
