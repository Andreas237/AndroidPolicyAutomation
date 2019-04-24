.class public Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;
.super Ljava/lang/Object;
.source "LoadRetailerCategoriesExperimentalVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;


# instance fields
.field private apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;)V

    return-void
.end method

.method private getContentTrackingPayload(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 146
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->builder(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v0

    .line 147
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->retailerCategoryId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 148
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private getRetailerCategoryNode(Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;I)Lcom/ibotta/api/model/content/RetailerCategoryNode;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 153
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->getRetailerCategoryNodes()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$NOhBeWvv7EtQTJ4Gh1jTiiZ6IJU;

    invoke-direct {v0, p2}, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$NOhBeWvv7EtQTJ4Gh1jTiiZ6IJU;-><init>(I)V

    .line 154
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 155
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    const/4 p2, 0x0

    .line 156
    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/content/RetailerCategoryNode;

    return-object p1
.end method

.method static synthetic lambda$getCategories$0(Lcom/ibotta/api/model/content/RetailerCategoryNode;)Z
    .locals 0

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getRetailers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method static synthetic lambda$getCategories$1(Lcom/ibotta/api/model/content/RetailerCategoryNode;)Lcom/ibotta/api/model/retailer/Category;
    .locals 0

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getRetailerCategoryNode$3(ILcom/ibotta/api/model/content/RetailerCategoryNode;)Z
    .locals 0

    .line 154
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object p1

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

.method static synthetic lambda$getRetailerCategoryTabs$2(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 0

    .line 111
    invoke-interface {p0}, Lcom/ibotta/api/model/RetailerModel;->getDistance()Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$getRetailerContentModelByContentId$4(Lcom/ibotta/api/model/content/RetailerCategoryNode;)Ljava/util/List;
    .locals 0

    .line 181
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getRetailers()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getRetailerContentModelByContentId$5(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 0

    .line 186
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p0

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
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

    .line 63
    instance-of v0, p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    if-nez v0, :cond_0

    .line 64
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 67
    :cond_0
    check-cast p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->getRetailerCategoryNodes()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$_dE7rMbzMoT7vpPcOh6awJVG1jM;->INSTANCE:Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$_dE7rMbzMoT7vpPcOh6awJVG1jM;

    .line 69
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$iRlqpRGzcTAvM7d-78YKADyJD7U;->INSTANCE:Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$iRlqpRGzcTAvM7d-78YKADyJD7U;

    .line 70
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 71
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getCategoryById(Lcom/ibotta/api/ApiResponse;I)Lcom/ibotta/api/model/retailer/Category;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 161
    instance-of v0, p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 165
    :cond_0
    check-cast p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    .line 166
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->getRetailerCategoryNode(Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;I)Lcom/ibotta/api/model/content/RetailerCategoryNode;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 168
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object v1

    :cond_1
    return-object v1
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

    .line 76
    instance-of v0, p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    if-nez v0, :cond_0

    .line 77
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 80
    :cond_0
    check-cast p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->getFavoriteRetailers()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerCategoriesJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 52
    invoke-interface {v1, p1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createRetailerCategoriesGraphQLCall(I)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;

    move-result-object p1

    .line 51
    invoke-interface {v0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerCategoryJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 58
    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createRetailerCategoryGraphQLCall(II)Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;

    move-result-object p1

    .line 57
    invoke-interface {v0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerCategoryTabs(Lcom/ibotta/api/ApiResponse;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;
    .locals 10
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

    .line 91
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 93
    instance-of v1, p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    if-nez v1, :cond_0

    return-object v0

    .line 97
    :cond_0
    check-cast p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->getRetailerCategoryNode(Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;I)Lcom/ibotta/api/model/content/RetailerCategoryNode;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 104
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object p2

    .line 107
    invoke-direct {p0, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->getContentTrackingPayload(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p2

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getRetailers()Ljava/util/List;

    move-result-object v1

    .line 110
    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$cvFPj_7J8__pogJA4MvnoB5xO4s;->INSTANCE:Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$cvFPj_7J8__pogJA4MvnoB5xO4s;

    .line 111
    invoke-interface {v2, v3}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v2

    .line 112
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/List;

    .line 114
    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/collection/AlphaRetailerModelComparator;

    invoke-direct {v2}, Lcom/ibotta/android/collection/AlphaRetailerModelComparator;-><init>()V

    .line 115
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava9/util/stream/Stream;

    move-result-object v1

    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/util/List;

    .line 117
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 120
    sget-object v9, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    .line 121
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getFeaturedNode()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/FeaturedNode;->getBanners()Ljava/util/List;

    move-result-object v2

    .line 122
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getFeaturedNode()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/FeaturedNode;->getRetailers()Ljava/util/List;

    move-result-object v3

    .line 124
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v5

    move-object v1, p4

    move-object v4, v8

    move-object v6, p3

    move-object v7, p2

    .line 120
    invoke-virtual/range {v1 .. v7}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createAllList(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    invoke-interface {v0, v9, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 128
    :cond_3
    sget-object v9, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    .line 129
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getFeaturedNode()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/FeaturedNode;->getBanners()Ljava/util/List;

    move-result-object v2

    .line 130
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getFeaturedNode()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/FeaturedNode;->getRetailers()Ljava/util/List;

    move-result-object v3

    .line 132
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v5

    move-object v1, p4

    move-object v6, p3

    move-object v7, p2

    .line 128
    invoke-virtual/range {v1 .. v7}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createNearbyList(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    invoke-interface {v0, v9, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;

    invoke-virtual {p4, v8, p3, p2}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createAllList(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-object v0
.end method

.method public bridge synthetic getRetailerContentModelByContentId(Lcom/ibotta/api/ApiResponse;Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/ContentModel;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->getRetailerContentModelByContentId(Lcom/ibotta/api/ApiResponse;Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerContentModelByContentId(Lcom/ibotta/api/ApiResponse;Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/RetailerModel;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 174
    instance-of v0, p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 178
    :cond_0
    check-cast p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    .line 180
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->getRetailerCategoryNodes()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$_N3hlKDsmNGyRcou4n7PAgBkjEM;->INSTANCE:Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$_N3hlKDsmNGyRcou4n7PAgBkjEM;

    .line 181
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;->INSTANCE:Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;

    .line 182
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 183
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 185
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$9pm0CXczSa8jm82RzVYRchma_zg;

    invoke-direct {v0, p2}, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesExperimentalVariant$9pm0CXczSa8jm82RzVYRchma_zg;-><init>(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    .line 186
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    return-object p1
.end method

.method init(Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 46
    iput-object p2, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method
