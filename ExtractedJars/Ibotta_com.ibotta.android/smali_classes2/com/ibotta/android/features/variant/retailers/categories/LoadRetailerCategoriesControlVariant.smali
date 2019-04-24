.class public Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;
.super Ljava/lang/Object;
.source "LoadRetailerCategoriesControlVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private collectRetailerIds(Ljava/util/List;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 263
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 264
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$KMrm9GfkQ1dHJy3ovOelzPq9T6Y;

    invoke-direct {v1, v0}, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$KMrm9GfkQ1dHJy3ovOelzPq9T6Y;-><init>(Ljava/util/Set;)V

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-object v0
.end method

.method private createComparator(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            ")",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 235
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    if-ne p1, v0, :cond_0

    .line 236
    new-instance p1, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;

    invoke-direct {p1, p2}, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;-><init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    goto :goto_0

    .line 238
    :cond_0
    new-instance p1, Lcom/ibotta/android/collection/AlphaRetailerModelComparator;

    invoke-direct {p1}, Lcom/ibotta/android/collection/AlphaRetailerModelComparator;-><init>()V

    :goto_0
    return-object p1
.end method

.method private doTabsHaveSameContent(Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;>;)Z"
        }
    .end annotation

    .line 252
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 254
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$FxEaLZR-VWqDU2HmrFgGz6ysbtY;->INSTANCE:Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$FxEaLZR-VWqDU2HmrFgGz6ysbtY;

    .line 255
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$WWWHl9wZvpqVzE6YZWyO65l7mw0;

    invoke-direct {v1, p0}, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$WWWHl9wZvpqVzE6YZWyO65l7mw0;-><init>(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;)V

    .line 256
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$eCUj13CM8gMzIuyj9fHJKFLb_tU;

    invoke-direct {v1, v0}, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$eCUj13CM8gMzIuyj9fHJKFLb_tU;-><init>(Ljava/util/Set;)V

    .line 257
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 259
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private generateCategories(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 180
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 181
    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getCategoryTypeEnum()Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/retailer/CategoryType;->NORMAL:Lcom/ibotta/api/model/retailer/CategoryType;

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    .line 184
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 188
    :cond_2
    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->generateNormalCategories(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private generateNormalCategories(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    .line 193
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 195
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 198
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/RetailerModel;

    .line 199
    invoke-interface {v3}, Lcom/ibotta/api/model/RetailerModel;->getCategoryIds()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 200
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private getContentTrackingPayload(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 269
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->builder(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v0

    .line 270
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->retailerCategoryId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 271
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private getFeaturedRetailers(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/retailer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 245
    new-instance v0, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;-><init>(Ljava/lang/Integer;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;->filter(Ljava/util/List;)V

    .line 246
    new-instance p1, Lcom/ibotta/android/view/retailer/FeaturedRetailerModelFilter;

    invoke-direct {p1}, Lcom/ibotta/android/view/retailer/FeaturedRetailerModelFilter;-><init>()V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/view/retailer/FeaturedRetailerModelFilter;->filter(Ljava/util/List;)V

    .line 248
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private getRetailerCategories(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    .line 172
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->generateCategories(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 173
    new-instance p2, Lcom/ibotta/android/collection/RetailerCategoryComparator;

    invoke-direct {p2}, Lcom/ibotta/android/collection/RetailerCategoryComparator;-><init>()V

    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object p1
.end method

.method private getRetailerCategoryTabs(Ljava/util/List;Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/retailer/Category;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
            ")",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/android/views/list/IbottaListViewState;",
            ">;"
        }
    .end annotation

    .line 104
    invoke-direct {p0, p2, p1, p3}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getRetailerModelsForTabs(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/Map;

    move-result-object v1

    .line 105
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getFeaturedRetailers(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 103
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->populateTabs(Ljava/util/Map;Ljava/util/List;Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private getRetailerModelsForTab(Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/retailer/Category;",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 215
    invoke-static {p3}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p3

    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    .line 216
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 218
    :goto_0
    new-instance v1, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;-><init>(Ljava/lang/Integer;)V

    invoke-virtual {v1, p3}, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;->filter(Ljava/util/List;)V

    if-eqz v0, :cond_1

    .line 222
    new-instance p1, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;

    invoke-direct {p1}, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;-><init>()V

    invoke-virtual {p1, p3}, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;->filter(Ljava/util/List;)V

    .line 225
    :cond_1
    invoke-direct {p0, p2, p4}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->createComparator(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/Comparator;

    move-result-object p1

    .line 226
    invoke-static {p3, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object p3
.end method

.method private getRetailerModelsForTabs(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/retailer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            ")",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;>;"
        }
    .end annotation

    .line 161
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 163
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->values()[Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 165
    invoke-direct {p0, p1, v4, p2, p3}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getRetailerModelsForTab(Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/List;

    move-result-object v5

    .line 164
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getRetailers(Lcom/ibotta/api/call/home/HomeResponse;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/call/home/HomeResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$collectRetailerIds$3(Ljava/util/Set;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 264
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic lambda$doTabsHaveSameContent$0(Ljava/util/Map$Entry;)Ljava/util/List;
    .locals 0

    .line 255
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static synthetic lambda$doTabsHaveSameContent$1(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;Ljava/util/List;)Ljava/util/Set;
    .locals 0

    .line 256
    invoke-direct {p0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->collectRetailerIds(Ljava/util/List;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$doTabsHaveSameContent$2(Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 257
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic lambda$getCategoryById$4(ILcom/ibotta/api/model/retailer/Category;)Z
    .locals 0

    .line 283
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$getRetailerContentModelByContentId$5(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/retailer/Retailer;)Z
    .locals 0

    .line 296
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Retailer;->getId()I

    move-result p1

    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private populateTabs(Ljava/util/Map;Ljava/util/List;Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/retailer/Category;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
            ")",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/android/views/list/IbottaListViewState;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    .line 118
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 119
    invoke-direct/range {p0 .. p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->doTabsHaveSameContent(Ljava/util/Map;)Z

    move-result v2

    move-object/from16 v3, p0

    move-object/from16 v4, p3

    .line 120
    invoke-direct {v3, v4}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getContentTrackingPayload(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object v12

    if-eqz v2, :cond_0

    .line 123
    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 124
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    .line 125
    invoke-virtual/range {p3 .. p3}, Lcom/ibotta/api/model/retailer/Category;->getFeatures()Ljava/util/List;

    move-result-object v5

    .line 128
    invoke-virtual/range {p3 .. p3}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v8

    move-object/from16 v4, p5

    move-object/from16 v6, p2

    move-object/from16 v9, p4

    move-object v10, v12

    .line 124
    invoke-virtual/range {v4 .. v10}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createAllList(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 132
    :cond_0
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->values()[Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    move-result-object v2

    array-length v13, v2

    const/4 v5, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v13, :cond_2

    aget-object v15, v2, v14

    .line 134
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/util/List;

    .line 136
    sget-object v5, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    if-ne v15, v5, :cond_1

    .line 138
    invoke-virtual/range {p3 .. p3}, Lcom/ibotta/api/model/retailer/Category;->getFeatures()Ljava/util/List;

    move-result-object v6

    .line 141
    invoke-virtual/range {p3 .. p3}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v9

    move-object/from16 v5, p5

    move-object/from16 v7, p2

    move-object/from16 v10, p4

    move-object v11, v12

    .line 137
    invoke-virtual/range {v5 .. v11}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createNearbyList(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v5

    invoke-interface {v1, v15, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    goto :goto_1

    :cond_1
    move-object/from16 v5, p4

    move-object/from16 v6, p5

    .line 145
    invoke-virtual {v6, v8, v5, v12}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createAllList(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v7

    invoke-interface {v1, v15, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v1
.end method


# virtual methods
.method public getCategories(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;
    .locals 1
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

    .line 54
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    if-nez v0, :cond_0

    .line 55
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 57
    :cond_0
    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getCategories()Ljava/util/List;

    move-result-object v0

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getRetailers(Lcom/ibotta/api/call/home/HomeResponse;)Ljava/util/List;

    move-result-object p1

    .line 61
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getRetailerCategories(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getCategoryById(Lcom/ibotta/api/ApiResponse;I)Lcom/ibotta/api/model/retailer/Category;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 276
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 280
    :cond_0
    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    .line 282
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getCategories()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$GczZGVfYrbz9PRxX7tOp5Xe9gAo;

    invoke-direct {v0, p2}, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$GczZGVfYrbz9PRxX7tOp5Xe9gAo;-><init>(I)V

    .line 283
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 284
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    .line 285
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/retailer/Category;

    return-object p1
.end method

.method public getFavoriteRetailers(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;
    .locals 1
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

    .line 66
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    if-nez v0, :cond_0

    .line 67
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 69
    :cond_0
    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    invoke-direct {p0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getRetailers(Lcom/ibotta/api/call/home/HomeResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerCategoriesJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 44
    new-instance p1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    return-object p1
.end method

.method public getRetailerCategoryJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 0

    .line 49
    new-instance p1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    return-object p1
.end method

.method public getRetailerCategoryTabs(Lcom/ibotta/api/ApiResponse;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;
    .locals 1
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

    .line 79
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    if-nez v0, :cond_0

    .line 80
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    return-object p1

    .line 83
    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    invoke-direct {p0, v0}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getRetailers(Lcom/ibotta/api/call/home/HomeResponse;)Ljava/util/List;

    move-result-object v0

    .line 84
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getCategoryById(Lcom/ibotta/api/ApiResponse;I)Lcom/ibotta/api/model/retailer/Category;

    move-result-object p1

    if-nez p1, :cond_1

    .line 87
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    return-object p1

    .line 90
    :cond_1
    invoke-direct {p0, v0, p1, p3, p4}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->getRetailerCategoryTabs(Ljava/util/List;Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerContentModelByContentId(Lcom/ibotta/api/ApiResponse;Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/ContentModel;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 290
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 294
    :cond_0
    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    .line 295
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailers()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$3nnkD-JhvYdm5GWb_dCrcN0KKUw;

    invoke-direct {v0, p2}, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$3nnkD-JhvYdm5GWb_dCrcN0KKUw;-><init>(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    .line 296
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 297
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    .line 298
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/ContentModel;

    return-object p1
.end method
