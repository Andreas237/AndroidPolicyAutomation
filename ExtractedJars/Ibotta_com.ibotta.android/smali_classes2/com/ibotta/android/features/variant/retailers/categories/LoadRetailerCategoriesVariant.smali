.class public interface abstract Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;
.super Ljava/lang/Object;
.source "LoadRetailerCategoriesVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/Variant;


# virtual methods
.method public abstract getCategories(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCategoryById(Lcom/ibotta/api/ApiResponse;I)Lcom/ibotta/api/model/retailer/Category;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getFavoriteRetailers(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailerCategoriesJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract getRetailerCategoryJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract getRetailerCategoryTabs(Lcom/ibotta/api/ApiResponse;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiResponse;",
            "I",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
            ")",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/android/views/list/IbottaListViewState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailerContentModelByContentId(Lcom/ibotta/api/ApiResponse;Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/ContentModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
