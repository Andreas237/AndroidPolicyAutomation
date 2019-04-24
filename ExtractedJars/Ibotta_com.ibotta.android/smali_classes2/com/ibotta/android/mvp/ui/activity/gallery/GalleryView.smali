.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;
.super Ljava/lang/Object;
.source "GalleryView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/search/SearchMvpView;


# virtual methods
.method public abstract getRetailerCategoryId()Ljava/lang/Integer;
.end method

.method public abstract getRetailerId()I
.end method

.method public abstract hideSearch()V
.end method

.method public abstract launchRoute(Ljava/lang/String;)V
.end method

.method public abstract selectCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)V
.end method

.method public abstract setDataMap(Ljava/util/LinkedHashMap;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract setFavorited(Z)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Lcom/ibotta/api/model/customer/Customer;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;Z)V"
        }
    .end annotation
.end method

.method public abstract showGcsFeatureDisabled()V
.end method

.method public abstract showMenuFavorited(Z)V
.end method

.method public abstract showRetailerNotFound()V
.end method

.method public abstract showSearch()V
.end method

.method public abstract showSpecialConditionsLearnMore(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method
