.class public Lcom/shopkick/app/store/ActionEducationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ActionEducationScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;


# static fields
.field private static final COLUMN_COUNT:I = 0x3

.field private static final FIRST_TILE_POSITION:I


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private isFirstFetch:Z

.field private latitude:D

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private longitude:D

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldAddStoreTile:Z

.field private storeTiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 195
    new-instance v0, Lcom/shopkick/app/store/ActionEducationScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/ActionEducationScreen$1;-><init>(Lcom/shopkick/app/store/ActionEducationScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/store/ActionEducationScreen;D)D
    .locals 0

    .line 35
    iput-wide p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->latitude:D

    return-wide p1
.end method

.method static synthetic access$102(Lcom/shopkick/app/store/ActionEducationScreen;D)D
    .locals 0

    .line 35
    iput-wide p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->longitude:D

    return-wide p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/store/ActionEducationScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/store/ActionEducationScreen;)Landroid/widget/ProgressBar;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private maybeAddNoContentTile()V
    .locals 3

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->containsTileOfType(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 213
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x3ed

    .line 214
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 215
    invoke-virtual {p0}, Lcom/shopkick/app/store/ActionEducationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1106d6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 216
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 217
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private maybeAddTiles()V
    .locals 2

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->storeTiles:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->storeTiles:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 227
    iput-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->storeTiles:Ljava/util/List;

    const/4 v0, 0x0

    .line 228
    iput-boolean v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->shouldAddStoreTile:Z

    :cond_0
    return-void
.end method

.method private refreshLocation()V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz v0, :cond_0

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 188
    invoke-virtual {p0}, Lcom/shopkick/app/store/ActionEducationScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 187
    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 190
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 191
    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->getLocationOrTriggerUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const/4 p3, 0x0

    const v0, 0x7f0c001c

    .line 62
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 64
    new-instance p2, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {p2, p0, v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 65
    iget-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const v1, 0x7f090443

    .line 66
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 65
    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 67
    iget-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string v0, "WALKIN_PERMISSIONS"

    const v1, 0x7f09081f

    .line 68
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 67
    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    const p2, 0x7f090628

    .line 69
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 70
    iget-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const p2, 0x7f09059a

    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 73
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v1, 0x3

    const/4 v7, 0x1

    invoke-direct {v0, v1, v7}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 76
    new-instance v8, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    new-instance v5, Ljava/util/HashSet;

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v3, 0x41a

    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, p3

    const/16 v3, 0x71

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v7

    const/16 v3, 0x419

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v0, v4

    const/16 v3, 0x58

    .line 78
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v1, -0x2

    .line 79
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    .line 77
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v6, 0x0

    move-object v0, v8

    move-object v1, v2

    move-object v2, p0

    move-object v3, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v8, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v1, p3, p3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    .line 81
    iget-object p3, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 83
    iput-boolean v7, p0, Lcom/shopkick/app/store/ActionEducationScreen;->shouldAddStoreTile:Z

    .line 85
    iput-boolean v7, p0, Lcom/shopkick/app/store/ActionEducationScreen;->isFirstFetch:Z

    .line 86
    iget-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 87
    iget-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 5

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 101
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationRequest;-><init>()V

    .line 104
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;-><init>()V

    .line 106
    iget-wide v2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->latitude:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;->latitude:Ljava/lang/Double;

    .line 107
    iget-wide v2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->longitude:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;->longitude:Ljava/lang/Double;

    .line 108
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 110
    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iput-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;->latitude:Ljava/lang/Double;

    .line 111
    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;->longitude:Ljava/lang/Double;

    .line 113
    :cond_0
    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;->previousPageKey:Ljava/lang/String;

    .line 115
    iget-boolean p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->isFirstFetch:Z

    if-eqz p1, :cond_1

    return-object v0

    :cond_1
    return-object v1
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

    .line 57
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 0

    .line 94
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 4

    .line 124
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 125
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/16 v2, 0x8

    if-eqz v1, :cond_5

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_5

    .line 126
    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationResponse;

    if-eqz v1, :cond_0

    .line 127
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationResponse;

    .line 129
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 131
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 133
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v3, 0x41a

    .line 134
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 135
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationResponse;->imageUrl:Ljava/lang/String;

    iput-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 136
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationResponse;->headerText:Ljava/lang/String;

    iput-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->descriptionText:Ljava/lang/String;

    .line 137
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationResponse;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v3, 0x58

    .line 142
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 143
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationInformationResponse;->descriptionText:Ljava/lang/String;

    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 144
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const/4 p1, 0x0

    .line 149
    iput-boolean p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->isFirstFetch:Z

    .line 150
    invoke-direct {p0}, Lcom/shopkick/app/store/ActionEducationScreen;->refreshLocation()V

    goto/16 :goto_1

    .line 151
    :cond_0
    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;

    if-eqz v1, :cond_6

    .line 152
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;

    .line 154
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;->storeTiles:Ljava/util/List;

    iput-object v1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->storeTiles:Ljava/util/List;

    .line 155
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;->pageKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 156
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 158
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoRequest;->previousPageKey:Ljava/lang/String;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->storeTiles:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 159
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 160
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/store/ActionEducationScreen;->maybeAddNoContentTile()V

    goto :goto_0

    .line 161
    :cond_2
    iget-boolean p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->shouldAddStoreTile:Z

    if-eqz p1, :cond_4

    .line 163
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;->pageKey:Ljava/lang/String;

    if-eqz p1, :cond_3

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;->pageKey:Ljava/lang/String;

    .line 164
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;->storeTiles:Ljava/util/List;

    if-eqz p1, :cond_3

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;->storeTiles:Ljava/util/List;

    .line 166
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    .line 167
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 p2, -0x1

    .line 168
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 169
    iget-object p2, p0, Lcom/shopkick/app/store/ActionEducationScreen;->storeTiles:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/store/ActionEducationScreen;->maybeAddTiles()V

    goto :goto_0

    .line 174
    :cond_4
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetActionEducationStoreInfoResponse;->storeTiles:Ljava/util/List;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 176
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_1

    .line 179
    :cond_5
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_6
    :goto_1
    return-object v0
.end method
