.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedView;
.super Ljava/lang/Object;
.source "FeaturedView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/search/SearchMvpView;


# virtual methods
.method public abstract launchRoute(Ljava/lang/String;)V
.end method

.method public abstract onCustomerLoaded(Lcom/ibotta/api/model/customer/Customer;)V
.end method

.method public abstract onTrackContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
.end method

.method public abstract onTrackShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
.end method

.method public abstract onTrackUnlockClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
.end method

.method public abstract onTrackUnlockedClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
.end method

.method public abstract promptForLocationPermissions()V
.end method

.method public abstract resetViewStates()V
.end method

.method public abstract routeToDeepLink(Ljava/lang/String;)V
.end method

.method public abstract setFeaturedRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showActivity()V
.end method

.method public abstract showBonusDetailQuest(Ljava/lang/String;I)V
.end method

.method public abstract showCategoryGallery(I)V
.end method

.method public abstract showRetailerUnfavoritedFailed()V
.end method

.method public abstract showRetailerUnfavoritedSuccess()V
.end method

.method public abstract updateNotificationCount(I)V
.end method
