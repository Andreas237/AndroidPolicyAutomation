.class public Lcom/shopkick/app/store/FilteredStoresScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FilteredStoresScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;


# instance fields
.field private currentLocation:Landroid/location/Location;

.field private loadingSpinner:Landroid/view/View;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field private screenParamsStoresFilterType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 40
    new-instance v0, Lcom/shopkick/app/store/FilteredStoresScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/FilteredStoresScreen$1;-><init>(Lcom/shopkick/app/store/FilteredStoresScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/store/FilteredStoresScreen;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->currentLocation:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/store/FilteredStoresScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/store/FilteredStoresScreen;)Landroid/view/View;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->loadingSpinner:Landroid/view/View;

    return-object p0
.end method

.method private getFilterTypeFromScreenParams(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    .line 122
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    const/4 p1, 0x3

    .line 127
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    const/4 p1, 0x2

    .line 129
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/4 p1, 0x1

    .line 125
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 60
    invoke-virtual {p0}, Lcom/shopkick/app/store/FilteredStoresScreen;->getAppScreenTitle()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/shopkick/app/store/FilteredStoresScreen;->setAppScreenTitle(Ljava/lang/String;)V

    const/4 p3, 0x0

    const v0, 0x7f0c00b6

    .line 61
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090434

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->loadingSpinner:Landroid/view/View;

    const p2, 0x7f090280

    .line 63
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 64
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/store/FilteredStoresScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 65
    new-instance v5, Ljava/util/HashSet;

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, p3

    const/16 p3, 0x2e

    .line 66
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x1

    aput-object p3, v0, v1

    const/4 p3, -0x1

    .line 67
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x2

    aput-object p3, v0, v1

    const/4 p3, -0x2

    .line 68
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x3

    aput-object p3, v0, v1

    .line 65
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v5, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 69
    new-instance p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    const/4 v6, 0x0

    move-object v0, p3

    move-object v2, p0

    move-object v3, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p3, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 75
    iget-object p3, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 76
    iget-object p3, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-object p1
.end method

.method protected getAppScreenTitle()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->screenParamsStoresFilterType:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const v0, 0x7f1102cd

    .line 141
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/FilteredStoresScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    const v0, 0x7f1102ce

    .line 143
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/FilteredStoresScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    const v0, 0x7f1102cc

    .line 139
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/FilteredStoresScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->currentLocation:Landroid/location/Location;

    if-eqz v0, :cond_0

    .line 93
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;-><init>()V

    .line 94
    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->currentLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLatitude:Ljava/lang/Double;

    .line 95
    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->currentLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLongitude:Ljava/lang/Double;

    .line 96
    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->currentLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->latitude:Ljava/lang/Double;

    .line 97
    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->currentLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->longitude:Ljava/lang/Double;

    .line 98
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->previousPageKey:Ljava/lang/String;

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->screenParamsStoresFilterType:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/store/FilteredStoresScreen;->getFilterTypeFromScreenParams(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->filterType:Ljava/lang/Integer;

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    const-string/jumbo p1, "stores_filter_type"

    .line 55
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->screenParamsStoresFilterType:Ljava/lang/String;

    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->loadingSpinner:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 84
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->getLocationOrTriggerUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    :cond_0
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 1

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen;->loadingSpinner:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 108
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 109
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 110
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    .line 111
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 112
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->pageKey:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 113
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    goto :goto_0

    .line 115
    :cond_0
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    :goto_0
    return-object p1
.end method
