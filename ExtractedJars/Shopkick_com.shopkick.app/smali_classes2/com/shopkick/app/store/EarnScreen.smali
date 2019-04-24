.class public Lcom/shopkick/app/store/EarnScreen;
.super Lcom/shopkick/app/tabs/TabScreen;
.source "EarnScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;
.implements Lcom/shopkick/app/store/ICountdownTimerFinished;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;
    }
.end annotation


# static fields
.field private static final AUTO_REFRESH_INTERVAL_MS:I = 0xdbba0

.field private static final CLOSE_DISCOVERY_LESSON_DELAY:I = 0x1f4


# instance fields
.field private final FLAG_ONLINE_STORE_TOOLTIP:I

.field private final FLAG_PHYSICAL_STORE_TOOLTIP:I

.field private final FLAG_TAB_TOOLTIP:I

.field private final FTUE_HOW_MANY_POSITIONS_TO_MOVE_THE_STORE_UP:I

.field private final FTUE_STORE_LIST_THRESHOLD:I

.field private final TOP_EXTRA_SPACING:I

.field private adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private countdownBonusFooter:Landroid/view/View;

.field private countdownBonusHeaderTextView:Landroid/widget/TextView;

.field private countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

.field private currentTab:I

.field private daysCounterView:Landroid/widget/TextView;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

.field private earnTabTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

.field private earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private ftueChainHasBeenMoved:Z

.field private ftueChainPosition:I

.field private ftueChainsModificated:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private ftueChainsOriginal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private ftuePromoCarouselTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private ftueSelectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private ftueTabTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private hasFtueChainBeenSearched:Z

.field private hasLocation:Z

.field private hoursCounterView:Landroid/widget/TextView;

.field private isDefaultToggleImpression:Z

.field private lastSuccessfulFirstPageTs:Ljava/lang/Long;

.field private latitude:D

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private longitude:D

.field private mQueryHandler:Landroid/os/Handler;

.field private mainView:Landroid/widget/FrameLayout;

.field private minsCounterView:Landroid/widget/TextView;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private promoCarouselIndex:I

.field private promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

.field private providerChangeReceiver:Landroid/content/BroadcastReceiver;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private scrollPosDataOnlineStores:Landroid/os/Parcelable;

.field private scrollPosDataPhysicalStores:Landroid/os/Parcelable;

.field private searchMenuItem:Landroid/view/MenuItem;

.field private searchModePermissionRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private searchView:Landroid/support/v7/widget/SearchView;

.field private secsCounterView:Landroid/widget/TextView;

.field private selectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private shouldRefreshData:Z

.field private shouldRefreshUI:Z

.field private shouldResetDefaultTab:Z

.field private storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

.field private storesItemDecorator:Lcom/shopkick/app/store/StoreItemDecorator;

.field private tabTileIndex:I

.field private toolTipView:Lcom/shopkick/app/widget/ToolTipView;

.field private tooltipStatus:I

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/tabs/TabScreen;-><init>()V

    const/4 v0, 0x6

    .line 128
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->FTUE_HOW_MANY_POSITIONS_TO_MOVE_THE_STORE_UP:I

    const/4 v0, 0x7

    .line 133
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->FTUE_STORE_LIST_THRESHOLD:I

    const/high16 v0, -0x80000000

    .line 162
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    .line 163
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    const/4 v0, 0x1

    .line 166
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldResetDefaultTab:Z

    .line 167
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    .line 174
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->isDefaultToggleImpression:Z

    .line 180
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsModificated:Ljava/util/List;

    .line 181
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsOriginal:Ljava/util/List;

    const/4 v1, 0x0

    .line 186
    iput v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    .line 210
    sget-object v2, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    iput-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    .line 214
    new-instance v2, Lcom/shopkick/app/store/EarnScreen$1;

    invoke-direct {v2, p0}, Lcom/shopkick/app/store/EarnScreen$1;-><init>(Lcom/shopkick/app/store/EarnScreen;)V

    iput-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    const/16 v2, 0x38

    .line 1626
    iput v2, p0, Lcom/shopkick/app/store/EarnScreen;->TOP_EXTRA_SPACING:I

    .line 1628
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->FLAG_TAB_TOOLTIP:I

    const/4 v0, 0x2

    .line 1629
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->FLAG_PHYSICAL_STORE_TOOLTIP:I

    const/4 v0, 0x4

    .line 1630
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->FLAG_ONLINE_STORE_TOOLTIP:I

    .line 1631
    iput v1, p0, Lcom/shopkick/app/store/EarnScreen;->tooltipStatus:I

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/store/EarnScreen;D)D
    .locals 0

    .line 121
    iput-wide p1, p0, Lcom/shopkick/app/store/EarnScreen;->latitude:D

    return-wide p1
.end method

.method static synthetic access$1000(Lcom/shopkick/app/store/EarnScreen;Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->setEarnScreenMode(Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;)V

    return-void
.end method

.method static synthetic access$102(Lcom/shopkick/app/store/EarnScreen;D)D
    .locals 0

    .line 121
    iput-wide p1, p0, Lcom/shopkick/app/store/EarnScreen;->longitude:D

    return-wide p1
.end method

.method static synthetic access$1100(Lcom/shopkick/app/store/EarnScreen;)Ljava/util/ArrayList;
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->getTilesForFirstPage()Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1200(Lcom/shopkick/app/store/EarnScreen;Ljava/util/ArrayList;)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->clearAndAddTilesToAdapter(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->setupPermissionViews()V

    return-void
.end method

.method static synthetic access$1400(Lcom/shopkick/app/store/EarnScreen;)Landroid/view/View;
    .locals 0

    .line 121
    iget-object p0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/shopkick/app/store/EarnScreen;I)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->updateBottomInset(I)V

    return-void
.end method

.method static synthetic access$1600(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->ftueLogDiscoveryLessonStart()V

    return-void
.end method

.method static synthetic access$1700(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 121
    iget-object p0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic access$1802(Lcom/shopkick/app/store/EarnScreen;Lcom/shopkick/app/widget/ToolTipView;)Lcom/shopkick/app/widget/ToolTipView;
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    return-object p1
.end method

.method static synthetic access$1900(Lcom/shopkick/app/store/EarnScreen;I)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->setStageFinished(I)V

    return-void
.end method

.method static synthetic access$2000(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->maybeDisplayTooltip()V

    return-void
.end method

.method static synthetic access$202(Lcom/shopkick/app/store/EarnScreen;Z)Z
    .locals 0

    .line 121
    iput-boolean p1, p0, Lcom/shopkick/app/store/EarnScreen;->hasLocation:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;
    .locals 0

    .line 121
    iget-object p0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    .line 121
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->stopPullToRefresh()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/store/EarnScreen;)Landroid/widget/ProgressBar;
    .locals 0

    .line 121
    iget-object p0, p0, Lcom/shopkick/app/store/EarnScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/store/EarnScreen;)Landroid/view/MenuItem;
    .locals 0

    .line 121
    iget-object p0, p0, Lcom/shopkick/app/store/EarnScreen;->searchMenuItem:Landroid/view/MenuItem;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/store/EarnScreen;)Landroid/os/Handler;
    .locals 0

    .line 121
    iget-object p0, p0, Lcom/shopkick/app/store/EarnScreen;->mQueryHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->setupForNormalMode()V

    return-void
.end method

.method static synthetic access$900(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;
    .locals 0

    .line 121
    iget-object p0, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    return-object p0
.end method

.method private addTilesToNextPageFetch(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 881
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 883
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    if-eqz v1, :cond_0

    .line 884
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->pageKey:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->pageKey:Ljava/lang/String;

    :cond_0
    if-eqz p1, :cond_5

    .line 886
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    .line 887
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 889
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    if-eqz v1, :cond_2

    .line 890
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    if-nez v1, :cond_1

    .line 891
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    .line 894
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 897
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object v2, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-ne v1, v2, :cond_3

    .line 898
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->removeTilesAtPosition(II)V

    .line 899
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->getAllSortedStoreTiles()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    .line 900
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object v2, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-ne v1, v2, :cond_4

    goto :goto_0

    .line 904
    :cond_4
    iget v1, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    .line 905
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_0
    return-object v0
.end method

.method private clearAndAddTilesToAdapter(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 753
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->removeTilesAtPosition(II)V

    if-eqz p1, :cond_0

    .line 755
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 757
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method private closeDiscoveryLesson()V
    .locals 5

    .line 1601
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 1602
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 1603
    new-instance v2, Lcom/shopkick/app/store/EarnScreen$7;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/store/EarnScreen$7;-><init>(Lcom/shopkick/app/store/EarnScreen;Landroid/os/Handler;)V

    const-wide/16 v3, 0x1f4

    .line 1619
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method private createAndSortFakeStoreTiles()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 1192
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1194
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getChainIds()Ljava/util/ArrayList;

    move-result-object v1

    .line 1195
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1198
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfosForChain(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 1199
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 1200
    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    if-eqz v8, :cond_2

    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-nez v8, :cond_2

    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    if-eqz v8, :cond_2

    iget-object v8, p0, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v8, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v9, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    .line 1202
    invoke-virtual {v8, v9}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 1203
    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v6, v8

    .line 1206
    :cond_2
    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz v8, :cond_1

    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    if-eqz v8, :cond_1

    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 1207
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-nez v8, :cond_1

    .line 1208
    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/2addr v5, v7

    goto :goto_1

    .line 1212
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/chains/ChainDataSource;->getChainInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 1216
    new-instance v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v7}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v8, 0x2e

    .line 1217
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1218
    iput-object v2, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 1219
    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainName:Ljava/lang/String;

    iput-object v2, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    .line 1220
    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainLogoImageUrl:Ljava/lang/String;

    iput-object v2, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 1221
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasWalkinBonus:Ljava/lang/Boolean;

    .line 1223
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    add-int/2addr v6, v5

    goto :goto_3

    :cond_4
    if-nez v5, :cond_5

    const/4 v2, 0x0

    goto :goto_2

    .line 1226
    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    :goto_2
    iput-object v2, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptKickAmountText:Ljava/lang/String;

    .line 1228
    :goto_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v7, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    .line 1230
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1234
    :cond_6
    new-instance v1, Lcom/shopkick/app/util/TileUtils$TileInfoV2ScanKicksComparator;

    invoke-direct {v1}, Lcom/shopkick/app/util/TileUtils$TileInfoV2ScanKicksComparator;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1235
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-object v0
.end method

.method private ftueCalculateChainPositionWhereShouldBeMoved(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;I)V
    .locals 2

    .line 1466
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x6

    if-le p2, v0, :cond_1

    const/4 v0, 0x1

    .line 1467
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainHasBeenMoved:Z

    .line 1468
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x7

    const/4 v1, 0x0

    if-ge p1, v0, :cond_0

    .line 1470
    iput v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, -0x6

    .line 1473
    iput p2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    .line 1474
    iget p1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 1475
    iput v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    goto :goto_0

    .line 1480
    :cond_1
    iput p2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    :cond_2
    :goto_0
    return-void
.end method

.method private ftueFindChain(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;)V
    .locals 5

    const/4 v0, 0x0

    .line 1485
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    const/4 v1, 0x0

    .line 1487
    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1488
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    .line 1489
    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    .line 1490
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    .line 1492
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1493
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->walkinKickAmount:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    .line 1494
    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1495
    invoke-direct {p0, p1, v2}, Lcom/shopkick/app/store/EarnScreen;->ftueCalculateChainPositionWhereShouldBeMoved(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;I)V

    .line 1496
    iput-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1503
    :cond_1
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1504
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1505
    invoke-direct {p0, p1, v2}, Lcom/shopkick/app/store/EarnScreen;->ftueCalculateChainPositionWhereShouldBeMoved(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;I)V

    .line 1506
    iput-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1513
    :cond_3
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1514
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->walkinKickAmount:Ljava/lang/Integer;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1515
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/store/EarnScreen;->ftueCalculateChainPositionWhereShouldBeMoved(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;I)V

    .line 1516
    iput-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    const/4 p1, 0x1

    .line 1522
    iput-boolean p1, p0, Lcom/shopkick/app/store/EarnScreen;->hasFtueChainBeenSearched:Z

    return-void
.end method

.method private ftueLogDiscoveryLessonStart()V
    .locals 2

    .line 1596
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x60

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 1597
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private ftueLogLessonStart()V
    .locals 2

    .line 1591
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x5b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 1592
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private ftueMoveChain(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;)V
    .locals 4

    .line 1526
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsModificated:Ljava/util/List;

    .line 1528
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1529
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 1532
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsModificated:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 1536
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsModificated:Ljava/util/List;

    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private ftueRestoreOriginalListOfChains()V
    .locals 7

    .line 1541
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueEarnLessonCompleted()Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    .line 1542
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->setTabLayoutVisibility(I)V

    .line 1543
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->setKicksCounterClickListener(Z)V

    .line 1544
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1545
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->clear()V

    .line 1547
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueSelectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v2, :cond_0

    .line 1549
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1552
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftuePromoCarouselTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v2}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 1553
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftuePromoCarouselTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1554
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftuePromoCarouselTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    .line 1555
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->promoTiles:Ljava/util/List;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/store/CarouselPromoController;->setData(Ljava/util/List;)V

    .line 1557
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->promoTiles:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1558
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x70

    if-eq v4, v5, :cond_2

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1559
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0xf

    if-ne v4, v5, :cond_1

    .line 1560
    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->expirationTimestampMs:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/shopkick/app/store/PromoTileTimerController;->setExpiryTs(J)V

    .line 1561
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-virtual {v3}, Lcom/shopkick/app/store/PromoTileTimerController;->start()V

    goto :goto_0

    .line 1566
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueTabTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v2}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1567
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueTabTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1568
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueTabTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    .line 1572
    :cond_4
    iget-boolean v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainHasBeenMoved:Z

    if-eqz v2, :cond_5

    .line 1573
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsOriginal:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v2, 0x1

    goto :goto_1

    .line 1576
    :cond_5
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move v2, v0

    .line 1578
    :goto_1
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 1579
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainHasBeenMoved:Z

    const/4 v1, 0x0

    .line 1580
    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1581
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsOriginal:Ljava/util/List;

    .line 1582
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsModificated:Ljava/util/List;

    .line 1583
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    if-eqz v2, :cond_6

    .line 1585
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    :cond_6
    return-void
.end method

.method private getAllSortedStoreTiles()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 913
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 914
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 915
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    const/4 v3, -0x6

    if-eqz v2, :cond_0

    .line 916
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 917
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const v4, 0x7f11026c

    .line 918
    invoke-virtual {p0, v4}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->headerText:Ljava/lang/String;

    .line 919
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 920
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 921
    new-instance v2, Lcom/shopkick/app/util/TileUtils$TileInfoV2StoreNameComparator;

    invoke-direct {v2}, Lcom/shopkick/app/util/TileUtils$TileInfoV2StoreNameComparator;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 922
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 923
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 925
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 926
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 927
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const v3, 0x7f11026b

    .line 928
    invoke-virtual {p0, v3}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->headerText:Ljava/lang/String;

    .line 929
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 930
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 931
    new-instance v2, Lcom/shopkick/app/util/TileUtils$TileInfoV2StoreNameComparator;

    invoke-direct {v2}, Lcom/shopkick/app/util/TileUtils$TileInfoV2StoreNameComparator;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 932
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-object v0
.end method

.method private getAnchorPosition(Landroid/os/Parcelable;)I
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1347
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "mAnchorPosition"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 1348
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 1349
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v0
.end method

.method private getTilesForFirstPage()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 761
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/high16 v0, -0x80000000

    .line 762
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    .line 764
    sget-object v2, Lcom/shopkick/app/store/EarnScreen$9;->$SwitchMap$com$shopkick$app$store$EarnScreen$EarnScreenMode:[I

    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-virtual {v3}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_6

    .line 864
    :pswitch_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 865
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_11

    .line 866
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v2, -0x6

    .line 867
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const v2, 0x7f11026d

    .line 868
    invoke-virtual {p0, v2}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->headerText:Ljava/lang/String;

    .line 869
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x3

    if-ge v3, v0, :cond_11

    .line 871
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_11

    .line 872
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 769
    :pswitch_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 770
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->showSearchIcon()V

    .line 772
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldDisplayRewardWidget:Ljava/lang/Boolean;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 773
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 775
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->selectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 777
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->selectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueSelectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    goto/16 :goto_1

    .line 781
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->promoTiles:Ljava/util/List;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->promoTiles:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 782
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    const/16 v2, -0xe

    if-eqz v0, :cond_5

    .line 783
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 784
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 785
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 786
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    .line 787
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->promoTiles:Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/store/CarouselPromoController;->setData(Ljava/util/List;)V

    .line 790
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->promoTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 791
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x70

    if-eq v4, v5, :cond_4

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 792
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0xf

    if-ne v4, v5, :cond_3

    .line 793
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->expirationTimestampMs:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/shopkick/app/store/PromoTileTimerController;->setExpiryTs(J)V

    .line 794
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoTileTimerController;->start()V

    goto :goto_1

    .line 799
    :cond_5
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftuePromoCarouselTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 800
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftuePromoCarouselTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    goto :goto_1

    .line 803
    :cond_6
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    .line 807
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    .line 808
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    move v0, v2

    goto :goto_2

    :cond_8
    move v0, v3

    .line 809
    :goto_2
    iget-object v4, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    if-eqz v4, :cond_9

    iget-object v4, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    .line 810
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    move v3, v2

    .line 812
    :cond_9
    iget-object v4, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v4}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v4

    const/16 v5, 0x417

    const v6, 0x7f1106e5

    if-eqz v4, :cond_b

    if-nez v3, :cond_a

    if-nez v0, :cond_a

    .line 814
    invoke-virtual {p0, v6}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    if-eqz v3, :cond_e

    if-eqz v0, :cond_e

    .line 818
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 819
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 820
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 821
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    goto :goto_4

    :cond_b
    if-nez v3, :cond_c

    if-nez v0, :cond_c

    .line 825
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsOriginal:Ljava/util/List;

    invoke-virtual {p0, v6}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    if-eqz v3, :cond_d

    if-eqz v0, :cond_d

    .line 828
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueTabTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 829
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueTabTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 831
    :cond_d
    :goto_3
    iput v2, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    :cond_e
    :goto_4
    if-eqz v3, :cond_10

    .line 835
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    if-ne v0, v2, :cond_10

    .line 836
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainHasBeenMoved:Z

    if-eqz v0, :cond_f

    .line 837
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsOriginal:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 838
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsOriginal:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 839
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainsModificated:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_5

    .line 841
    :cond_f
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_5

    :cond_10
    const/4 v0, 0x2

    .line 844
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    .line 845
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 849
    :goto_5
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v2, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$j4kuovtgw9-_4YT8BsWPs3okyfc;

    invoke-direct {v2, p0}, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$j4kuovtgw9-_4YT8BsWPs3okyfc;-><init>(Lcom/shopkick/app/store/EarnScreen;)V

    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_6

    .line 766
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->getAllSortedStoreTiles()Ljava/util/ArrayList;

    move-result-object v1

    :cond_11
    :goto_6
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private hideSearchIcon()V
    .locals 2

    .line 500
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchMenuItem:Landroid/view/MenuItem;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 501
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method private initCountdownViews(Landroid/view/View;)V
    .locals 6

    .line 942
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f0901a3

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusHeaderTextView:Landroid/widget/TextView;

    .line 943
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f09008f

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    .line 944
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$OHy-Idpa0zGEg9DagcRyrdWcz98;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$OHy-Idpa0zGEg9DagcRyrdWcz98;-><init>(Lcom/shopkick/app/store/EarnScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0901cf

    .line 950
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->daysCounterView:Landroid/widget/TextView;

    const v0, 0x7f0902eb

    .line 951
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->hoursCounterView:Landroid/widget/TextView;

    const v0, 0x7f090481

    .line 952
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->minsCounterView:Landroid/widget/TextView;

    const v0, 0x7f090652

    .line 953
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->secsCounterView:Landroid/widget/TextView;

    .line 955
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

    if-nez p1, :cond_0

    .line 956
    new-instance p1, Lcom/shopkick/app/store/CountdownTimerController;

    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->daysCounterView:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->hoursCounterView:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/shopkick/app/store/EarnScreen;->minsCounterView:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/shopkick/app/store/EarnScreen;->secsCounterView:Landroid/widget/TextView;

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/store/CountdownTimerController;-><init>(Lcom/shopkick/app/store/ICountdownTimerFinished;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

    :cond_0
    return-void
.end method

.method private initSearch(Landroid/support/v7/widget/SearchView;)V
    .locals 2

    const v0, 0x7f11026a

    .line 450
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 451
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "search"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/SearchManager;

    .line 453
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/SearchManager;->getSearchableInfo(Landroid/content/ComponentName;)Landroid/app/SearchableInfo;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->setSearchableInfo(Landroid/app/SearchableInfo;)V

    .line 454
    new-instance v0, Lcom/shopkick/app/store/EarnScreen$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/EarnScreen$3;-><init>(Lcom/shopkick/app/store/EarnScreen;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->setOnQueryTextListener(Landroid/support/v7/widget/SearchView$OnQueryTextListener;)V

    .line 488
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->showSearchIcon()V

    return-void
.end method

.method private isStageAvailable(I)Z
    .locals 1

    .line 1636
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->tooltipStatus:I

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$Dk-wrax-TsX44Z7GlxqBfOGzeKI(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->maybeDisplayTooltip()V

    return-void
.end method

.method public static synthetic lambda$getTilesForFirstPage$230(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 2

    .line 850
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 851
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 853
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->updateTab()V

    .line 855
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 856
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    .line 858
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 859
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->maybeDisplayTooltip()V

    :cond_2
    return-void
.end method

.method public static synthetic lambda$initCountdownViews$231(Lcom/shopkick/app/store/EarnScreen;Landroid/view/View;)V
    .locals 3

    .line 945
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v1, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 948
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method private logEarnTabToggleImpression()V
    .locals 3

    .line 1763
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x176

    goto :goto_0

    :cond_0
    const/16 v0, 0x177

    .line 1764
    :goto_0
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 1765
    iget-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->isDefaultToggleImpression:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDefaultEarnToggle(Ljava/lang/Boolean;)V

    .line 1766
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    const/4 v0, 0x0

    .line 1767
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->isDefaultToggleImpression:Z

    return-void
.end method

.method private maybeDisplayTooltip()V
    .locals 3

    .line 1647
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->isActiveScreen()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 1651
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->isStageAvailable(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1652
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->showTabTooltip()V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    .line 1654
    invoke-direct {p0, v1}, Lcom/shopkick/app/store/EarnScreen;->isStageAvailable(I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    if-eq v2, v0, :cond_3

    :cond_2
    const/4 v0, 0x4

    .line 1655
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->isStageAvailable(I)Z

    move-result v0

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    if-ne v0, v1, :cond_4

    .line 1656
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->showTileTooltip()V

    :cond_4
    :goto_0
    return-void

    :cond_5
    :goto_1
    return-void
.end method

.method private prepareForFetch()V
    .locals 2

    const/4 v0, 0x0

    .line 666
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshUI:Z

    .line 667
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 668
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private processErrorResponse(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 7

    .line 1046
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    .line 1047
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-ne v0, v1, :cond_3

    const/high16 v0, -0x80000000

    .line 1049
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    .line 1050
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    const/4 v0, 0x0

    .line 1052
    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p2, v0, :cond_2

    const/4 v0, 0x7

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 1064
    :cond_0
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1065
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v3, 0x7f110155

    .line 1066
    invoke-virtual {p0, v3}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f1102b4

    .line 1067
    invoke-virtual {p0, v4}, Lcom/shopkick/app/store/EarnScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1065
    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    if-eqz p2, :cond_1

    .line 1069
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 1070
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 1071
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "Generic error message shown to user with ClientError code %d"

    new-array v1, v1, [Ljava/lang/Object;

    .line 1073
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v2

    .line 1071
    invoke-virtual {v0, v3, v4, v5, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 1075
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    .line 1076
    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 1077
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v0, v3

    const-string v3, "Generic error message shown to user"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, v3, v2}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 1057
    :cond_2
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->clear()V

    .line 1058
    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-static {p2, v0}, Lcom/shopkick/app/util/TileUtils;->addOfflinePromoTileToFeed(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/store/CarouselPromoController;)V

    .line 1060
    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->createAndSortFakeStoreTiles()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->addTilesAtPosition(Ljava/util/List;I)V

    .line 1061
    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    .line 1062
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->hideSearchIcon()V

    goto :goto_1

    .line 1083
    :cond_3
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_AUTOFETCH:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1085
    :goto_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->previousPageKey:Ljava/lang/String;

    if-eqz p1, :cond_5

    .line 1086
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object p2, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-ne p1, p2, :cond_4

    .line 1087
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    goto :goto_2

    .line 1089
    :cond_4
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_AUTOFETCH:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, p3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    goto :goto_2

    .line 1092
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->hideSearchIcon()V

    .line 1094
    :goto_2
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->updateBonusCountdownFooter()Z

    return-object p3
.end method

.method private refreshLocation()V
    .locals 2

    const/4 v0, 0x0

    .line 674
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->hasLocation:Z

    .line 677
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz v0, :cond_0

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 678
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 679
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 680
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 681
    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->getLocationOrTriggerUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_1
    return-void
.end method

.method private registerProviderChangeReceiver()V
    .locals 3

    .line 649
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.location.PROVIDERS_CHANGED"

    .line 650
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 651
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->providerChangeReceiver:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_0

    .line 652
    new-instance v1, Lcom/shopkick/app/store/EarnScreen$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/EarnScreen$4;-><init>(Lcom/shopkick/app/store/EarnScreen;)V

    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->providerChangeReceiver:Landroid/content/BroadcastReceiver;

    .line 662
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->providerChangeReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private restoreScrollPosition(I)V
    .locals 3

    .line 1367
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-gez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1373
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataOnlineStores:Landroid/os/Parcelable;

    .line 1374
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataPhysicalStores:Landroid/os/Parcelable;

    goto :goto_0

    .line 1376
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataPhysicalStores:Landroid/os/Parcelable;

    .line 1377
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataOnlineStores:Landroid/os/Parcelable;

    .line 1380
    :goto_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->getAnchorPosition(Landroid/os/Parcelable;)I

    move-result p1

    .line 1381
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->getAnchorPosition(Landroid/os/Parcelable;)I

    move-result v1

    .line 1386
    iget v2, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-ge p1, v2, :cond_2

    goto :goto_1

    :cond_2
    if-lt p1, v2, :cond_3

    if-ge v1, v2, :cond_3

    .line 1390
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    goto :goto_1

    .line 1393
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :goto_1
    return-void
.end method

.method private setEarnScreenMode(Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    .line 446
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->updateBonusCountdownFooter()Z

    return-void
.end method

.method private setKicksCounterClickListener(Z)V
    .locals 2

    .line 1783
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 1784
    instance-of v1, v0, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v1, :cond_0

    .line 1785
    check-cast v0, Lcom/shopkick/app/activities/HomeActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/HomeActivity;->getKicksCounterController()Lcom/shopkick/app/activities/KicksCounterController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1787
    invoke-virtual {v0, p1}, Lcom/shopkick/app/activities/KicksCounterController;->setKicksCounterClickListener(Z)V

    :cond_0
    return-void
.end method

.method private setStageFinished(I)V
    .locals 1

    .line 1642
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->tooltipStatus:I

    or-int/2addr p1, v0

    iput p1, p0, Lcom/shopkick/app/store/EarnScreen;->tooltipStatus:I

    .line 1643
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->tooltipStatus:I

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->putEarnTabTooltipState(I)V

    return-void
.end method

.method private setTabLayoutVisibility(I)V
    .locals 2

    .line 1772
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 1773
    instance-of v1, v0, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v1, :cond_0

    .line 1774
    check-cast v0, Lcom/shopkick/app/activities/HomeActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/HomeActivity;->getTabLayout()Landroid/support/design/widget/TabLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1776
    invoke-virtual {v0, p1}, Landroid/support/design/widget/TabLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private setupForFilterMode()V
    .locals 2

    .line 412
    sget-object v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->setEarnScreenMode(Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;)V

    .line 413
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->setupPermissionViews()V

    .line 414
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    .line 415
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->getTilesForFirstPage()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->clearAndAddTilesToAdapter(Ljava/util/ArrayList;)V

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->startFilter()V

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchModePermissionRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 418
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->pageKey:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 419
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->autoFetchNextPage()V

    .line 421
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/CarouselPromoController;->markNotVisible()V

    return-void
.end method

.method private setupForNormalMode()V
    .locals 3

    .line 426
    sget-object v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->setEarnScreenMode(Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;)V

    .line 427
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->setupPermissionViews()V

    .line 428
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->clearFilter()V

    .line 429
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchView:Landroid/support/v7/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView;->setIconified(Z)V

    .line 430
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    .line 431
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    const v2, 0x7fffffff

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->removeTilesAtPosition(II)V

    .line 432
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->getTilesForFirstPage()Ljava/util/ArrayList;

    move-result-object v0

    .line 433
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->pageKey:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 434
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->searchMenuItem:Landroid/view/MenuItem;

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 436
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v2, -0x1

    .line 437
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 438
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    :cond_0
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->clearAndAddTilesToAdapter(Ljava/util/ArrayList;)V

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/CarouselPromoController;->markVisible()V

    return-void
.end method

.method private setupForRecyclerView()V
    .locals 21

    move-object/from16 v15, p0

    .line 506
    iget-object v0, v15, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    if-eqz v0, :cond_0

    return-void

    .line 510
    :cond_0
    new-instance v5, Ljava/util/HashSet;

    const/16 v0, 0xe

    new-array v1, v0, [Ljava/lang/Integer;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v14, 0x0

    aput-object v0, v1, v14

    const/4 v0, 0x1

    const/16 v2, 0x2e

    .line 511
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x2

    const/16 v2, 0x41

    .line 512
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x3

    const/16 v13, 0x417

    .line 513
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x4

    const/16 v2, 0x3ed

    .line 514
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x5

    const/16 v2, 0x403

    .line 515
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x6

    const/16 v2, 0x45

    .line 516
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x7

    const/16 v12, -0xe

    .line 517
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/16 v0, 0x8

    const/4 v2, -0x6

    .line 518
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/16 v0, 0x9

    const/4 v2, -0x1

    .line 519
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/16 v0, 0xa

    const/4 v2, -0x2

    .line 520
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/16 v0, 0xb

    const/4 v2, -0x7

    .line 521
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/16 v0, 0xc

    const/4 v2, -0x8

    .line 522
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const/16 v0, 0xd

    const/16 v2, -0xd

    .line 523
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    .line 510
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 524
    new-instance v8, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    iget-object v1, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, v15, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v6, 0x0

    sget-object v7, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-object v0, v8

    move-object/from16 v2, p0

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    iput-object v8, v15, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    .line 531
    iget-object v0, v15, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 532
    new-instance v0, Lcom/shopkick/app/store/StoreItemDecorator;

    invoke-direct {v0}, Lcom/shopkick/app/store/StoreItemDecorator;-><init>()V

    iput-object v0, v15, Lcom/shopkick/app/store/EarnScreen;->storesItemDecorator:Lcom/shopkick/app/store/StoreItemDecorator;

    .line 533
    iget-object v0, v15, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, v15, Lcom/shopkick/app/store/EarnScreen;->storesItemDecorator:Lcom/shopkick/app/store/StoreItemDecorator;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 535
    iget-object v0, v15, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getRecyclerViewImageController()Lcom/shopkick/app/controllers/RecyclerViewImageController;

    move-result-object v2

    .line 536
    new-instance v11, Lcom/shopkick/app/store/StoresCarouselPromoController;

    move-object v0, v11

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, v15, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v15, Lcom/shopkick/app/store/EarnScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v5, v15, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    .line 540
    invoke-virtual {v5}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getUserEventRecyclerViewCoordinator()Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    move-result-object v5

    iget-object v6, v15, Lcom/shopkick/app/store/EarnScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v7, v15, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    iget-object v8, v15, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    iget-object v9, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v9, v9, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v10, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, v10, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v12, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v12, v12, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    move-object/from16 v18, v11

    move-object v11, v12

    iget-object v12, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v12, v12, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v13, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v13, v13, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v14, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v14, v14, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    move-object/from16 v19, v0

    iget-object v0, v15, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    move-object/from16 v20, v1

    move-object v1, v15

    move-object v15, v0

    iget-object v0, v1, Lcom/shopkick/app/store/EarnScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    move-object/from16 v16, v0

    move-object/from16 v17, p0

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-direct/range {v0 .. v17}, Lcom/shopkick/app/store/StoresCarouselPromoController;-><init>(Landroid/content/Context;Lcom/shopkick/app/controllers/RecyclerViewImageController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/store/PromoTileTimerController;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    move-object/from16 v1, v18

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    .line 553
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    const/16 v2, -0xe

    invoke-virtual {v1, v2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

    .line 555
    iget-object v2, v0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->setCarouselPromoController(Lcom/shopkick/app/store/CarouselPromoController;)V

    .line 557
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/SlowSmoothScrollingLinearLayoutManager;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/shopkick/app/view/SKRecyclerView/SlowSmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 558
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 559
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v2, v0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 560
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v2, v0, Lcom/shopkick/app/store/EarnScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 561
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 562
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 564
    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v2, v0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v3, 0x7f09022a

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;-><init>(Landroid/view/View;)V

    iput-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 565
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    const/16 v2, 0x417

    invoke-virtual {v1, v2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    iput-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->earnTabTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    .line 566
    iget-object v1, v0, Lcom/shopkick/app/store/EarnScreen;->earnTabTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->setOnClickTabCallback(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;)V

    return-void
.end method

.method private setupPermissionViews()V
    .locals 5

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    const v2, 0x7f090443

    const v3, 0x7f09081f

    const/16 v4, 0x8

    if-ne v0, v1, :cond_0

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 398
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f090649

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 399
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    goto :goto_0

    .line 402
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 403
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f09022a

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->checkLocationPermission()V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchModePermissionRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    :goto_0
    return-void
.end method

.method private showSearchIcon()V
    .locals 2

    .line 492
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStoreSearchEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    if-eqz v0, :cond_0

    .line 493
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchMenuItem:Landroid/view/MenuItem;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 495
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->hideSearchIcon()V

    :goto_0
    return-void
.end method

.method private showTabTooltip()V
    .locals 5

    .line 1661
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-gez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1665
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v1, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    move-result v1

    const v2, 0x7f09071d

    if-eqz v1, :cond_1

    .line 1666
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 1668
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v1

    .line 1669
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v3

    if-ltz v1, :cond_6

    if-ltz v3, :cond_6

    .line 1671
    iget-object v4, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v4}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getItemCount()I

    move-result v4

    if-lt v3, v4, :cond_2

    goto :goto_2

    .line 1673
    :cond_2
    iget v4, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-lt v4, v1, :cond_5

    if-le v4, v3, :cond_3

    goto :goto_1

    .line 1675
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int/2addr v4, v1

    invoke-virtual {v3, v4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    .line 1677
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :cond_4
    :goto_0
    const/4 v1, 0x1

    .line 1681
    invoke-direct {p0, v1, v0, v0}, Lcom/shopkick/app/store/EarnScreen;->showTooltip(ILandroid/view/View;Landroid/view/View;)V

    return-void

    :cond_5
    :goto_1
    return-void

    :cond_6
    :goto_2
    return-void
.end method

.method private showTileTooltip()V
    .locals 9

    .line 1685
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-ltz v0, :cond_9

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 1688
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 1689
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    .line 1690
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v1

    .line 1691
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v2

    .line 1692
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v0

    if-ltz v2, :cond_8

    if-ltz v0, :cond_8

    .line 1694
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v3}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getItemCount()I

    move-result v3

    if-lt v0, v3, :cond_1

    goto :goto_4

    :cond_1
    const/16 v3, 0x38

    .line 1701
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v3

    const/4 v4, 0x0

    move-object v5, v4

    :goto_0
    const/4 v6, 0x1

    if-gt v2, v0, :cond_6

    const/16 v7, 0xe

    .line 1703
    iget-object v8, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v8, v2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v8

    if-eq v7, v8, :cond_2

    const/16 v7, 0x2e

    iget-object v8, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    .line 1704
    invoke-virtual {v8, v2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v8

    if-ne v7, v8, :cond_5

    .line 1705
    :cond_2
    iget-object v5, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int v7, v2, v1

    invoke-virtual {v5, v7}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 1706
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v7

    if-lt v7, v3, :cond_5

    .line 1707
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    if-ne v0, v6, :cond_3

    const v0, 0x7f0903d9

    goto :goto_1

    :cond_3
    const v0, 0x7f090762

    :goto_1
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 1711
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_4
    move-object v4, v5

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1717
    :cond_6
    :goto_2
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    if-ne v0, v6, :cond_7

    const/4 v0, 0x2

    goto :goto_3

    :cond_7
    const/4 v0, 0x4

    :goto_3
    invoke-direct {p0, v0, v4, v5}, Lcom/shopkick/app/store/EarnScreen;->showTooltip(ILandroid/view/View;Landroid/view/View;)V

    return-void

    :cond_8
    :goto_4
    return-void

    :cond_9
    :goto_5
    return-void
.end method

.method private showTooltip(ILandroid/view/View;Landroid/view/View;)V
    .locals 9

    .line 1722
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->isStageAvailable(I)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_3

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    const v0, 0x7f110273

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0x7f110272

    goto :goto_0

    :cond_2
    const v0, 0x7f110271

    .line 1735
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v2, 0x7f090443

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1736
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v3, 0x7f09019b

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 1737
    invoke-virtual {v5, v1}, Landroid/widget/RelativeLayout;->indexOfChild(Landroid/view/View;)I

    move-result v7

    .line 1739
    new-instance v1, Lcom/shopkick/app/store/EarnScreen$8;

    move-object v3, v1

    move-object v4, p0

    move-object v6, p2

    move v8, p1

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/store/EarnScreen$8;-><init>(Lcom/shopkick/app/store/EarnScreen;Landroid/view/ViewGroup;Landroid/view/View;II)V

    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 1746
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/ToolTipView;->addExtCloseButton(Landroid/view/View;)V

    .line 1747
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/ToolTipView;->setText(I)V

    .line 1748
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const/4 p2, 0x3

    const/4 p3, 0x0

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2, v0, p3}, Lcom/shopkick/app/widget/ToolTipView;->setMargin(IIII)V

    .line 1749
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/ToolTipView;->show()V

    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method private stopBonusCountdownTimer()V
    .locals 2

    .line 1005
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1006
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/CountdownTimerController;->stop()V

    .line 1007
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 1008
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 1009
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->updateBottomInset(I)V

    :cond_0
    return-void
.end method

.method private storeScrollPosition(I)V
    .locals 2

    .line 1358
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 1360
    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataOnlineStores:Landroid/os/Parcelable;

    goto :goto_0

    .line 1362
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataPhysicalStores:Landroid/os/Parcelable;

    :goto_0
    return-void
.end method

.method private updateBonusCountdownFooter()Z
    .locals 7

    .line 974
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 977
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 978
    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object v4, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-ne v3, v4, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-eq v3, v0, :cond_3

    if-eqz v3, :cond_2

    .line 985
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 986
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 987
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v3, Lcom/shopkick/app/store/EarnScreen$5;

    invoke-direct {v3, p0}, Lcom/shopkick/app/store/EarnScreen$5;-><init>(Lcom/shopkick/app/store/EarnScreen;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 994
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

    const-wide/16 v3, 0x7530

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-virtual {v0, v5, v6}, Lcom/shopkick/app/store/CountdownTimerController;->start(J)V

    .line 995
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusHeaderTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f1101f4

    new-array v5, v1, [Ljava/lang/Object;

    const/16 v6, 0xf

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 998
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->stopBonusCountdownTimer()V

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    return v1
.end method

.method private updateBottomInset(I)V
    .locals 1

    .line 1014
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storesItemDecorator:Lcom/shopkick/app/store/StoreItemDecorator;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/store/StoreItemDecorator;->setBottomInset(I)V

    .line 1015
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getItemCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_0

    .line 1017
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_0
    return-void
.end method

.method private updateTab()V
    .locals 4

    .line 687
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    iget v1, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectTab(I)V

    .line 688
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 690
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v0

    .line 691
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v1

    .line 692
    iget v2, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-ltz v2, :cond_0

    iget-object v3, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v3}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getItemCount()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget v2, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-gt v0, v2, :cond_0

    if-lt v1, v2, :cond_0

    .line 694
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int/2addr v2, v0

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 696
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->updateLayout(Landroid/view/View;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public OnClickTab(Landroid/view/View;I)V
    .locals 5

    .line 1305
    iget p1, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-gez p1, :cond_0

    return-void

    .line 1308
    :cond_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/store/EarnScreen;->storeScrollPosition(I)V

    .line 1311
    iput p2, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    .line 1312
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->updateTab()V

    const/4 p1, 0x1

    if-ne p2, p1, :cond_1

    .line 1313
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    .line 1316
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    iget v2, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    add-int/2addr v2, p1

    invoke-virtual {v1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getItemCount()I

    move-result v3

    iget v4, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    sub-int/2addr v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->removeTilesAtPosition(II)V

    .line 1317
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    if-ne p2, p1, :cond_2

    .line 1321
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->maybeAddLoadingTile()V

    .line 1325
    :cond_2
    invoke-direct {p0, p2}, Lcom/shopkick/app/store/EarnScreen;->restoreScrollPosition(I)V

    .line 1327
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 1329
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance p2, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$Dk-wrax-TsX44Z7GlxqBfOGzeKI;

    invoke-direct {p2, p0}, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$Dk-wrax-TsX44Z7GlxqBfOGzeKI;-><init>(Lcom/shopkick/app/store/EarnScreen;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    .line 1332
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->logEarnTabToggleImpression()V

    return-void
.end method

.method public addWalkinObserver()V
    .locals 3

    .line 1793
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "WalkinControllerWalkinSucceededEvent"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method public createTabScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x1

    .line 291
    invoke-virtual {p0, p3}, Lcom/shopkick/app/store/EarnScreen;->setHasOptionsMenu(Z)V

    .line 293
    new-instance p3, Landroid/os/Handler;

    invoke-direct {p3}, Landroid/os/Handler;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/store/EarnScreen;->mQueryHandler:Landroid/os/Handler;

    const/4 p3, 0x0

    const v0, 0x7f0c00a6

    .line 294
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    .line 295
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f090628

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 296
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f09059a

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 297
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f090574

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    .line 299
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->initCountdownViews(Landroid/view/View;)V

    .line 301
    new-instance p1, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {p1, p0, p2, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 302
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p2, "android.permission.ACCESS_COARSE_LOCATION"

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f090443

    .line 303
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 302
    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 305
    new-instance p1, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {p1, p0, p2, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->searchModePermissionRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 306
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStoreSearchEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    const/16 p2, 0x8

    const v0, 0x7f090649

    if-eqz p1, :cond_0

    .line 307
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->searchModePermissionRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    .line 308
    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 307
    invoke-virtual {p1, v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    goto :goto_0

    .line 311
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 313
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 314
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p2, "WALKIN_PERMISSIONS"

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f09081f

    .line 315
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 314
    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 317
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 318
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->setupForRecyclerView()V

    .line 320
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ClientFlagsUpdated"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 321
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 322
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 323
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 324
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 325
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "offlineScanBarcodeReady"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 326
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "offlineScanFailed"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 327
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 328
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 329
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 330
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "tabChangedEvent"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 331
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventScanIrResponseSuccess"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 332
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 334
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 335
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 336
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string p2, "EarnScreen: createTabScreen"

    new-array p3, p3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, p3}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 337
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->mainView:Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public getHasFtueChainBeenSearched()Z
    .locals 1

    .line 1402
    iget-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->hasFtueChainBeenSearched:Z

    return v0
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 4

    .line 1027
    iget-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->hasLocation:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1031
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;-><init>()V

    .line 1032
    iget-wide v1, p0, Lcom/shopkick/app/store/EarnScreen;->latitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->latitude:Ljava/lang/Double;

    .line 1033
    iget-wide v1, p0, Lcom/shopkick/app/store/EarnScreen;->longitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->longitude:Ljava/lang/Double;

    .line 1034
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1036
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLatitude:Ljava/lang/Double;

    .line 1037
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLongitude:Ljava/lang/Double;

    .line 1039
    :cond_1
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->previousPageKey:Ljava/lang/String;

    const/4 p1, 0x3

    .line 1040
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->targetType:Ljava/lang/Integer;

    return-object v0
.end method

.method public initTabScreen(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 3
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

    .line 233
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 234
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 235
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 236
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 237
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 238
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 239
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 240
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 242
    new-instance p1, Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-direct {p1}, Lcom/shopkick/app/store/PromoTileTimerController;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    .line 243
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->selectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->selectedRewardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/16 p2, 0x45

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/4 p1, 0x1

    .line 246
    iput-boolean p1, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshData:Z

    .line 247
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getEarnTabTooltipState()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/store/EarnScreen;->tooltipStatus:I

    .line 249
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string p2, "EarnScreen: initTabScreen"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onCountdownTimerFinished()V
    .locals 2

    .line 963
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010022

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 965
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 966
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->countdownBonusFooter:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 967
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->updateBottomInset(I)V

    .line 970
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .line 342
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tabs/TabScreen;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const/high16 v0, 0x7f0d0000

    .line 343
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const p2, 0x7f090027

    .line 344
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchMenuItem:Landroid/view/MenuItem;

    .line 345
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchMenuItem:Landroid/view/MenuItem;

    new-instance v1, Lcom/shopkick/app/store/EarnScreen$2;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/store/EarnScreen$2;-><init>(Lcom/shopkick/app/store/EarnScreen;Landroid/view/Menu;)V

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 374
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 375
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/SearchView;

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->searchView:Landroid/support/v7/widget/SearchView;

    .line 376
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->searchView:Landroid/support/v7/widget/SearchView;

    invoke-direct {p0, p1}, Lcom/shopkick/app/store/EarnScreen;->initSearch(Landroid/support/v7/widget/SearchView;)V

    .line 377
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->showSearchIcon()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 281
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoTileTimerController;->clear()V

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->destroy()V

    .line 286
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 707
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, 0x1

    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xb

    goto/16 :goto_1

    :sswitch_1
    const-string p2, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto/16 :goto_1

    :sswitch_2
    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto/16 :goto_1

    :sswitch_3
    const-string p2, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    goto :goto_1

    :sswitch_4
    const-string p2, "offlineScanBarcodeReady"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_5
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_1

    :sswitch_6
    const-string p2, "offlineScanFailed"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_7
    const-string p2, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_8
    const-string p2, "eventScanIrResponseSuccess"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_1

    :sswitch_9
    const-string/jumbo p2, "tabChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xc

    goto :goto_1

    :sswitch_a
    const-string p2, "ClientFlagsUpdated"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_b
    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_c
    const-string p2, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x9

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 745
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 746
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->logEarnTabToggleImpression()V

    goto :goto_2

    .line 742
    :pswitch_1
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshData:Z

    goto :goto_2

    .line 732
    :pswitch_2
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 733
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->prepareForFetch()V

    .line 734
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    goto :goto_2

    .line 736
    :cond_1
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshUI:Z

    goto :goto_2

    .line 722
    :pswitch_3
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshData:Z

    goto :goto_2

    :pswitch_4
    const/4 p1, 0x0

    .line 717
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    .line 718
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldResetDefaultTab:Z

    goto :goto_2

    .line 709
    :pswitch_5
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->showSearchIcon()V

    .line 710
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->updateBonusCountdownFooter()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 713
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->notifyDataSetChanged()V

    :cond_2
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6bae06a8 -> :sswitch_c
        -0x57c9a285 -> :sswitch_b
        -0x4b45e041 -> :sswitch_a
        -0x46a8f385 -> :sswitch_9
        -0x1b10bf5e -> :sswitch_8
        -0x1ae0f8cf -> :sswitch_7
        -0x106e20a3 -> :sswitch_6
        0x44e6563 -> :sswitch_5
        0x550c423 -> :sswitch_4
        0x64efe2d -> :sswitch_3
        0x2ae28463 -> :sswitch_2
        0x43b738dc -> :sswitch_1
        0x556e6c68 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 1283
    iget p1, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    if-ne p3, p1, :cond_0

    .line 1284
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {p1}, Lcom/shopkick/app/store/CarouselPromoController;->markVisible()V

    :cond_0
    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 1290
    iget p1, p0, Lcom/shopkick/app/store/EarnScreen;->promoCarouselIndex:I

    if-ne p3, p1, :cond_0

    .line 1291
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {p1}, Lcom/shopkick/app/store/CarouselPromoController;->markNotVisible()V

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 382
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090027

    if-ne v0, v1, :cond_0

    .line 383
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->setupForFilterMode()V

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchView:Landroid/support/v7/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView;->setIconified(Z)V

    .line 385
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->searchView:Landroid/support/v7/widget/SearchView;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView;->setMaxWidth(I)V

    .line 388
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x184

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 389
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 391
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/tabs/TabScreen;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 2

    .line 1407
    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStarted()Z

    move-result p2

    if-nez p2, :cond_0

    .line 1408
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Landroid/support/v7/widget/RecyclerView$State;

    invoke-direct {v0}, Landroid/support/v7/widget/RecyclerView$State;-><init>()V

    iget v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainPosition:I

    invoke-virtual {p1, p2, v0, v1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->smoothScrollToPosition(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;I)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 1412
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    if-eqz p2, :cond_1

    .line 1413
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1414
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class p2, Lcom/shopkick/app/activities/HomeActivity;

    const-class v0, Lcom/shopkick/app/browse/BrowseScreen;

    const/4 v1, 0x0

    invoke-direct {p1, p2, v0, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 1415
    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    return-void
.end method

.method public onPreFetch(Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 2

    .line 1246
    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    .line 1247
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1249
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLatitude:Ljava/lang/Double;

    .line 1250
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLongitude:Ljava/lang/Double;

    :cond_0
    return-void
.end method

.method public onRefreshSelected()V
    .locals 1

    .line 637
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 638
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    .line 640
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->prepareForFetch()V

    .line 641
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->refreshLocation()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 6

    .line 571
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onScreenDidShow()V

    .line 573
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 574
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v4, 0xdbba0

    add-long/2addr v2, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    .line 575
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->prepareForFetch()V

    .line 576
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->refreshLocation()V

    .line 577
    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    goto :goto_0

    .line 579
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 580
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->prepareForFetch()V

    .line 581
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->refreshLocation()V

    goto :goto_0

    .line 582
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshUI:Z

    if-eqz v0, :cond_2

    .line 583
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->prepareForFetch()V

    .line 584
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    .line 585
    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    goto :goto_0

    .line 586
    :cond_2
    iget-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshData:Z

    if-eqz v0, :cond_3

    .line 587
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->prepareForFetch()V

    .line 588
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->adapter:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    .line 589
    iput-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    .line 592
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->registerProviderChangeReceiver()V

    .line 593
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->shouldStartEarnScreenLesson()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 594
    iget-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->hasFtueChainBeenSearched:Z

    if-nez v0, :cond_5

    const/4 v0, 0x1

    .line 595
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->setKicksCounterClickListener(Z)V

    const/16 v0, 0x8

    .line 596
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/EarnScreen;->setTabLayoutVisibility(I)V

    goto :goto_1

    .line 599
    :cond_4
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->setupPermissionViews()V

    .line 600
    invoke-direct {p0, v1}, Lcom/shopkick/app/store/EarnScreen;->setTabLayoutVisibility(I)V

    .line 601
    invoke-direct {p0, v1}, Lcom/shopkick/app/store/EarnScreen;->setKicksCounterClickListener(Z)V

    .line 604
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->shouldStartFTUELesson3()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 605
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->startFTUELesson3()V

    .line 608
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoTileTimerController;->start()V

    .line 610
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 611
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 612
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "EarnScreen: onScreenDidShow"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 614
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->ftueRestoreOriginalListOfChains()V

    .line 615
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->closeDiscoveryLesson()V

    .line 618
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->updateBonusCountdownFooter()Z

    return-void
.end method

.method protected onScreenWillHide()V
    .locals 2

    .line 623
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onScreenWillHide()V

    .line 625
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/PromoTileTimerController;->stop()V

    .line 626
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->providerChangeReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 627
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->providerChangeReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    .line 628
    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->providerChangeReceiver:Landroid/content/BroadcastReceiver;

    .line 632
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->stopBonusCountdownTimer()V

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    .line 1276
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->searchMenuItem:Landroid/view/MenuItem;

    if-eqz p1, :cond_0

    .line 1277
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->hideKeyboard()V

    :cond_0
    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    .line 1265
    iget-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->earnScreenMode:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object p3, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-eq p2, p3, :cond_0

    return-void

    .line 1266
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p1

    .line 1267
    iget p2, p0, Lcom/shopkick/app/store/EarnScreen;->tabTileIndex:I

    if-ltz p2, :cond_1

    if-lt p1, p2, :cond_1

    .line 1268
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 1270
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 6

    .line 1100
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 1101
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 1102
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "EarnScreen: processResponse"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1103
    iput-boolean v4, p0, Lcom/shopkick/app/store/EarnScreen;->shouldRefreshData:Z

    const/4 v0, 0x0

    .line 1104
    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataPhysicalStores:Landroid/os/Parcelable;

    .line 1105
    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->scrollPosDataOnlineStores:Landroid/os/Parcelable;

    .line 1109
    iget-boolean v1, p0, Lcom/shopkick/app/store/EarnScreen;->shouldResetDefaultTab:Z

    if-eqz v1, :cond_0

    .line 1110
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->getEarnDefaultTab(Lcom/shopkick/app/application/ClientFlagsManager;)I

    move-result v1

    iput v1, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    .line 1111
    iput-boolean v4, p0, Lcom/shopkick/app/store/EarnScreen;->shouldResetDefaultTab:Z

    .line 1114
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1115
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/ToolTipView;->destroy()V

    .line 1116
    iput-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 1119
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->stopPullToRefresh()V

    .line 1120
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1121
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->earnTabViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v0, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1122
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 1123
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1125
    instance-of v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    if-nez v1, :cond_2

    return-object v0

    .line 1127
    :cond_2
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    .line 1129
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_9

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v1, :cond_3

    goto/16 :goto_2

    .line 1133
    :cond_3
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    .line 1134
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1137
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->previousPageKey:Ljava/lang/String;

    if-nez p1, :cond_7

    .line 1138
    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    .line 1140
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->lastSuccessfulFirstPageTs:Ljava/lang/Long;

    .line 1141
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1143
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->shouldStartEarnScreenLesson()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1144
    invoke-direct {p0, p2}, Lcom/shopkick/app/store/EarnScreen;->ftueFindChain(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;)V

    .line 1145
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChainHasBeenMoved:Z

    if-eqz p1, :cond_4

    .line 1146
    invoke-direct {p0, p2}, Lcom/shopkick/app/store/EarnScreen;->ftueMoveChain(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;)V

    .line 1148
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 1149
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    instance-of p1, p1, Lcom/shopkick/app/store/EarnScreen;

    if-eqz p1, :cond_5

    .line 1150
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->isActiveScreen()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1151
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 1152
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 1153
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    .line 1154
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainName:Ljava/lang/String;

    .line 1155
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    .line 1156
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen;->ftueChain:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v1}, Lcom/shopkick/app/util/Affiliate;->isOnlineStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v1

    .line 1157
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainIsOnlineStore:Ljava/lang/String;

    .line 1158
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    invoke-virtual {v1, p1, p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    .line 1159
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {p1, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 1160
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->ftueLogLessonStart()V

    .line 1161
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->hidePermViews()V

    goto :goto_0

    .line 1163
    :cond_5
    invoke-direct {p0, v4}, Lcom/shopkick/app/store/EarnScreen;->setTabLayoutVisibility(I)V

    .line 1164
    invoke-direct {p0, v4}, Lcom/shopkick/app/store/EarnScreen;->setKicksCounterClickListener(Z)V

    goto :goto_0

    .line 1167
    :cond_6
    invoke-direct {p0, v4}, Lcom/shopkick/app/store/EarnScreen;->setTabLayoutVisibility(I)V

    .line 1168
    invoke-direct {p0, v4}, Lcom/shopkick/app/store/EarnScreen;->setKicksCounterClickListener(Z)V

    .line 1172
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->getTilesForFirstPage()Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_1

    .line 1176
    :cond_7
    invoke-direct {p0, p2}, Lcom/shopkick/app/store/EarnScreen;->addTilesToNextPageFetch(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;)Ljava/util/ArrayList;

    move-result-object p1

    .line 1179
    :goto_1
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->shouldStartFTUELesson3()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1180
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->startFTUELesson3()V

    .line 1183
    :cond_8
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->pageKey:Ljava/lang/String;

    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 1184
    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 1185
    invoke-direct {p0}, Lcom/shopkick/app/store/EarnScreen;->updateBonusCountdownFooter()Z

    return-object v0

    .line 1130
    :cond_9
    :goto_2
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/store/EarnScreen;->processErrorResponse(Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    move-result-object p1

    return-object p1
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 254
    invoke-super {p0, p1}, Lcom/shopkick/app/tabs/TabScreen;->setParams(Ljava/util/Map;)V

    const-string v0, "default_tab"

    .line 257
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "default_tab"

    .line 258
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 259
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 260
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    const/4 v0, 0x0

    .line 261
    iput-boolean v0, p0, Lcom/shopkick/app/store/EarnScreen;->shouldResetDefaultTab:Z

    const/4 v0, 0x0

    .line 262
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/store/EarnScreen;->OnClickTab(Landroid/view/View;I)V

    .line 268
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/EarnScreen;->getParams()Ljava/util/Map;

    move-result-object p1

    const-string v0, "default_tab"

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public shouldStartEarnScreenLesson()Z
    .locals 1

    .line 1427
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 1428
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueEarnLessonCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 1429
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueIsNewAccount()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public shouldStartFTUELesson3()Z
    .locals 1

    .line 1433
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 1434
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueEarnLessonCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 1435
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 1436
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonShouldDisplayJeanOnEarnTab()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 1437
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStarted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 1438
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueIsNewAccount()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen;->storeListResponse:Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public startFTUELesson3()V
    .locals 5

    .line 1443
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 1444
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 1445
    new-instance v2, Lcom/shopkick/app/store/EarnScreen$6;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/store/EarnScreen$6;-><init>(Lcom/shopkick/app/store/EarnScreen;Landroid/os/Handler;)V

    const-wide/16 v3, 0x64

    .line 1461
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method protected startPullToRefresh()V
    .locals 2

    .line 1755
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->startPullToRefresh()V

    .line 1757
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_FTUE_TEST"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1758
    iput v0, p0, Lcom/shopkick/app/store/EarnScreen;->tooltipStatus:I

    :cond_0
    return-void
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 273
    invoke-super {p0, p1}, Lcom/shopkick/app/tabs/TabScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 276
    iget v0, p0, Lcom/shopkick/app/store/EarnScreen;->currentTab:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedTab(Ljava/lang/Integer;)V

    return-void
.end method
