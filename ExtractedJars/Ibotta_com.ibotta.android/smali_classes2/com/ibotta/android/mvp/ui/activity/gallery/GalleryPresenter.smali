.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;
.super Ljava/lang/Object;
.source "GalleryPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/search/SearchMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/search/SearchMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract initSearch()V
.end method

.method public abstract onCreateOptionsMenu()V
.end method

.method public abstract onFavoriteClicked()V
.end method

.method public abstract onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
.end method

.method public abstract onHeaderBuyIgcClicked()V
.end method

.method public abstract onHeaderImCardClicked()V
.end method

.method public abstract onHeaderLoyaltyCardClicked()V
.end method

.method public abstract onHeaderRedeemClicked()V
.end method

.method public abstract onSearchClicked()V
.end method

.method public abstract onSearchFeatureClicked(Ljava/lang/String;)V
.end method

.method public abstract onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract onUnfavoriteClicked()V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract setSearch(Ljava/lang/String;)V
.end method

.method public abstract setSelectedCategoryId(Ljava/lang/Integer;)V
.end method

.method public abstract trackRetailerView()V
.end method
