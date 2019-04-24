.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;
.super Ljava/lang/Object;
.source "GalleryPresenterHelper.java"


# virtual methods
.method public abstract clearBuyableGiftCardModels()V
.end method

.method public abstract createBannersRow(Ljava/util/List;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/Integer;)Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;"
        }
    .end annotation
.end method

.method public abstract createOffersMap(Ljava/util/List;)Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract createOffersRows(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;"
        }
    .end annotation
.end method

.method public abstract createSpecialConditionsRows(Ljava/util/List;Ljava/lang/String;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            ")",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;"
        }
    .end annotation
.end method

.method public abstract createTitleBarRow(Ljava/util/List;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;"
        }
    .end annotation
.end method

.method public abstract getBuyableGiftCardModels()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getContentModels()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCopyOfferCategoryItems()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCustomGallerySection()Lcom/ibotta/android/view/model/GallerySection;
.end method

.method public abstract getGalleryParcelFeatures()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getGallerySections()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
.end method

.method public abstract getRetailerParcelFromRetailerModel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end method

.method public abstract setModels(Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;)V
.end method

.method public abstract setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract setupAllSubSections(ILcom/ibotta/api/model/OfferCategoryModel;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;)Z
.end method
