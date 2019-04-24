.class public Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;
.super Ljava/lang/Object;
.source "CategoryGalleryReducer.java"


# instance fields
.field private final bannerReducer:Lcom/ibotta/android/featured/BannerReducer;

.field private final contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

.field private final ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

.field private final resources:Landroid/content/res/Resources;

.field private final retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/featured/BannerReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->bannerReducer:Lcom/ibotta/android/featured/BannerReducer;

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 57
    iput-object p3, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 58
    iput-object p4, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 59
    iput-object p5, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 60
    iput-object p6, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private createListWithBannersAndFeatured(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/lang/String;",
            "I",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .line 132
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 135
    invoke-direct {p0, p1, p5}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getBannerStream(Ljava/util/List;I)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 137
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p5

    invoke-direct {p0, p2, p7, p5}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getFeaturedRetailersStream(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;I)Ljava9/util/stream/Stream;

    move-result-object p2

    .line 138
    invoke-direct {p0, p4}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getTitleBarViewState(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p5

    invoke-static {p5}, Ljava9/util/stream/Stream$-CC;->of(Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p5

    .line 143
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v6

    move-object v2, p0

    move-object v3, p3

    move-object v4, p6

    move-object v5, p7

    move-object v7, p4

    .line 139
    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getRetailerListStream(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/String;)Ljava9/util/stream/Stream;

    move-result-object p3

    const/4 p4, 0x4

    .line 146
    new-array p4, p4, [Ljava9/util/stream/Stream;

    aput-object p1, p4, v1

    const/4 p1, 0x1

    aput-object p2, p4, p1

    const/4 p1, 0x2

    aput-object p5, p4, p1

    const/4 p1, 0x3

    aput-object p3, p4, p1

    .line 147
    invoke-static {p4}, Ljava9/util/stream/Stream$-CC;->of([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 148
    invoke-static {}, Ljava9/util/function/Function$-CC;->identity()Ljava9/util/function/Function;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 150
    iget-object p2, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance p3, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {p3}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    .line 151
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p4

    invoke-interface {p1, p4}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p3, p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    sget-object p3, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    .line 150
    invoke-virtual {p2, p1, p3}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method

.method private getAllTitle()Ljava/lang/String;
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->resources:Landroid/content/res/Resources;

    const v1, 0x7f110139

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getBannerStream(Ljava/util/List;I)Ljava9/util/stream/Stream;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;I)",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 187
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    invoke-static {}, Ljava9/util/stream/Stream$-CC;->empty()Ljava9/util/stream/Stream;

    move-result-object p1

    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->bannerReducer:Lcom/ibotta/android/featured/BannerReducer;

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Lcom/ibotta/android/featured/BannerReducer;->create(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;)Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/Stream$-CC;->of(Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getFeaturedRetailersStream(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;I)Ljava9/util/stream/Stream;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            "I)",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 172
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    invoke-static {}, Ljava9/util/stream/Stream$-CC;->empty()Ljava9/util/stream/Stream;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 179
    new-array v0, v0, [Lcom/ibotta/android/views/list/ContentViewState;

    const/4 v1, 0x0

    .line 180
    invoke-direct {p0}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getFeaturedTitle()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getTitleBarViewState(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 183
    invoke-direct {p0}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getFeaturedTitle()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p2, p3, v3}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p2

    .line 181
    invoke-virtual {v2, p1, p2}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->createIlvs(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    aput-object p1, v0, v1

    .line 179
    invoke-static {v0}, Ljava9/util/stream/Stream$-CC;->of([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getFeaturedTitle()Ljava/lang/String;
    .locals 2

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->resources:Landroid/content/res/Resources;

    const v1, 0x7f11016a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getNearbyTitle()Ljava/lang/String;
    .locals 2

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->resources:Landroid/content/res/Resources;

    const v1, 0x7f1101b4

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getRetailerListStream(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/String;)Ljava9/util/stream/Stream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 163
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->mapToRetailerDisplayContent(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/List;

    move-result-object p1

    .line 164
    invoke-direct {p0, p3, p4, p5}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p2

    .line 162
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/content/ContentListReducerUtil;->stream(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method private getTitleBarViewState(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    const v1, 0x7f07018d

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method private getTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 0

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 201
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 202
    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleName(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 203
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$mapToRetailerDisplayContent$0(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/content/RetailerDisplayContent;
    .locals 2

    .line 81
    new-instance v0, Lcom/ibotta/android/content/RetailerDisplayContent;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->ROW:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v0, p1, p0, v1}, Lcom/ibotta/android/content/RetailerDisplayContent;-><init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
.end method

.method private mapToRetailerDisplayContent(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/content/RetailerDisplayContent;",
            ">;"
        }
    .end annotation

    .line 80
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/reducers/category/-$$Lambda$CategoryGalleryReducer$7ClWhBpnRmLTDOo6Bc1z1NaFSiI;

    invoke-direct {v0, p2}, Lcom/ibotta/android/reducers/category/-$$Lambda$CategoryGalleryReducer$7ClWhBpnRmLTDOo6Bc1z1NaFSiI;-><init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 82
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public createAllList(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance v1, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    iget-object v2, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 72
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->mapToRetailerDisplayContent(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Ljava/util/List;

    move-result-object p1

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getAllTitle()Ljava/lang/String;

    move-result-object p2

    const/4 v3, 0x0

    invoke-direct {p0, p3, v3, p2}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILjava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p2

    .line 71
    invoke-virtual {v2, p1, p2}, Lcom/ibotta/android/content/ContentListReducerUtil;->list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object p1

    .line 69
    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    .line 68
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method

.method public createAllList(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;I",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getAllTitle()Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 93
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createListWithBannersAndFeatured(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method

.method public createNearbyList(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;I",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .line 115
    invoke-direct {p0}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->getNearbyTitle()Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 111
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;->createListWithBannersAndFeatured(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method
