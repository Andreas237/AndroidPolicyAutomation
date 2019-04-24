.class public Lcom/shopkick/app/store/FilteredStoresListScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FilteredStoresListScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# instance fields
.field private TOOLTIP_HEIGHT:I

.field private TOP_EXTRA_SPACING:I

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private filterType:I

.field private hasLocation:Z

.field private latitude:D

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private longitude:D

.field private mainView:Landroid/widget/FrameLayout;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldRefresh:Z

.field private toolTipView:Lcom/shopkick/app/widget/ToolTipView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/16 v0, 0x32

    .line 61
    iput v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->TOP_EXTRA_SPACING:I

    const/16 v0, 0x46

    .line 62
    iput v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->TOOLTIP_HEIGHT:I

    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->shouldRefresh:Z

    const/4 v0, 0x0

    .line 79
    iput v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->filterType:I

    .line 84
    new-instance v0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/FilteredStoresListScreen$1;-><init>(Lcom/shopkick/app/store/FilteredStoresListScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/store/FilteredStoresListScreen;D)D
    .locals 0

    .line 59
    iput-wide p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->latitude:D

    return-wide p1
.end method

.method static synthetic access$102(Lcom/shopkick/app/store/FilteredStoresListScreen;D)D
    .locals 0

    .line 59
    iput-wide p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->longitude:D

    return-wide p1
.end method

.method static synthetic access$202(Lcom/shopkick/app/store/FilteredStoresListScreen;Z)Z
    .locals 0

    .line 59
    iput-boolean p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->hasLocation:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/store/FilteredStoresListScreen;)Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/store/FilteredStoresListScreen;)Landroid/widget/ProgressBar;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/store/FilteredStoresListScreen;Lcom/shopkick/app/widget/ToolTipView;)Lcom/shopkick/app/widget/ToolTipView;
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    return-object p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/store/FilteredStoresListScreen;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method private getFilterTypeFromParams(Ljava/util/Map;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    const-string v0, "filter_type"

    .line 118
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "filter_type"

    .line 119
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 120
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "^[01].*$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->getNumericValue(C)I

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public static synthetic lambda$processResponse$234(Lcom/shopkick/app/store/FilteredStoresListScreen;)V
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->addReloadTile()V

    return-void
.end method

.method private maybeDisplayTooltip()V
    .locals 10

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getStoreListK4RRTooltipShown()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 401
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 406
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->isActiveScreen()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 410
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f090443

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 411
    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->mainView:Landroid/widget/FrameLayout;

    const v2, 0x7f09029b

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 412
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 414
    iget-object v2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v2}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    .line 416
    iget-object v2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v2

    .line 419
    iget-object v3, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    .line 420
    invoke-virtual {v3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v4

    .line 421
    invoke-virtual {v3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v3

    if-ltz v4, :cond_7

    .line 423
    iget-object v5, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    .line 424
    invoke-virtual {v5}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getItemCount()I

    move-result v5

    if-ge v3, v5, :cond_7

    .line 425
    iget v5, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->TOP_EXTRA_SPACING:I

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    .line 426
    iget v6, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->TOOLTIP_HEIGHT:I

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v6

    :goto_0
    if-gt v4, v3, :cond_7

    const/16 v7, 0xe

    .line 430
    iget-object v8, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v8, v4}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v8

    if-eq v7, v8, :cond_3

    const/16 v7, 0x2e

    iget-object v8, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    .line 431
    invoke-virtual {v8, v4}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v8

    if-ne v7, v8, :cond_6

    .line 432
    :cond_3
    iget-object v7, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int v8, v4, v2

    invoke-virtual {v7, v8}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    const v8, 0x7f09058c

    .line 433
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f09025e

    .line 434
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_6

    .line 436
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-nez v9, :cond_6

    .line 437
    new-instance v2, Lcom/shopkick/app/store/FilteredStoresListScreen$2;

    invoke-direct {v2, p0, v1, v8, v0}, Lcom/shopkick/app/store/FilteredStoresListScreen$2;-><init>(Lcom/shopkick/app/store/FilteredStoresListScreen;Landroid/view/ViewGroup;Landroid/view/View;I)V

    iput-object v2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 443
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0, v7}, Lcom/shopkick/app/widget/ToolTipView;->addExtCloseButton(Landroid/view/View;)V

    const v0, 0x7f0900e9

    .line 444
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 445
    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const v2, 0x7f1106e2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v8, 0x0

    aput-object v0, v4, v8

    invoke-virtual {p0, v2, v4}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/ToolTipView;->setText(Ljava/lang/String;)V

    .line 447
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getTop()I

    move-result v0

    add-int/2addr v5, v6

    if-le v0, v5, :cond_4

    goto :goto_1

    :cond_4
    move v3, v8

    .line 448
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/ToolTipView;->setTooltipPosition(Z)V

    .line 449
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    if-eqz v3, :cond_5

    const/16 v1, -0x1e

    goto :goto_2

    :cond_5
    const/16 v1, 0xa

    :goto_2
    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1, v2, v8}, Lcom/shopkick/app/widget/ToolTipView;->setMargin(IIII)V

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->show()V

    goto :goto_3

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_7
    :goto_3
    return-void
.end method

.method private prepareForFetch()V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private refreshLocation()V
    .locals 2

    const/4 v0, 0x0

    .line 217
    iput-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->hasLocation:Z

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz v0, :cond_0

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 221
    invoke-virtual {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 223
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 224
    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->getLocationOrTriggerUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_1
    return-void
.end method

.method private setupForRecyclerView()V
    .locals 11

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    if-eqz v0, :cond_0

    return-void

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 169
    new-instance v8, Ljava/util/HashSet;

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const/16 v3, 0x2e

    .line 170
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x2

    const/16 v3, 0x3ed

    .line 171
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x3

    const/4 v3, -0x1

    .line 172
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x4

    const/4 v3, -0x2

    .line 173
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x5

    const/16 v3, -0xd

    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    .line 169
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 175
    new-instance v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    iget-object v4, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v9, 0x0

    sget-object v10, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-object v3, v0

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v3 .. v10}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    iput-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    const v0, 0x7f0c00b5

    .line 137
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->mainView:Landroid/widget/FrameLayout;

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f090628

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f0906ed

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 141
    new-instance p1, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 142
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p2, "android.permission.ACCESS_COARSE_LOCATION"

    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f090443

    .line 143
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 142
    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 145
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 146
    invoke-direct {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->setupForRecyclerView()V

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 150
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 153
    iget p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->filterType:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    const p1, 0x7f1102cb

    .line 155
    iget-object p2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 156
    iget-object p2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p2, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f1102ca

    .line 158
    :goto_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->setAppScreenTitle(I)V

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->mainView:Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 4

    .line 266
    iget-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->hasLocation:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 270
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;-><init>()V

    .line 271
    iget-wide v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->latitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->latitude:Ljava/lang/Double;

    .line 272
    iget-wide v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->longitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->longitude:Ljava/lang/Double;

    .line 273
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 275
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLatitude:Ljava/lang/Double;

    .line 276
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLongitude:Ljava/lang/Double;

    .line 278
    :cond_1
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->previousPageKey:Ljava/lang/String;

    .line 279
    iget p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->filterType:I

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x2

    .line 280
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->targetType:Ljava/lang/Integer;

    goto :goto_0

    .line 282
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->targetType:Ljava/lang/Integer;

    :goto_0
    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    .line 102
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 103
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 104
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 105
    invoke-direct {p0, p2}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getFilterTypeFromParams(Ljava/util/Map;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->filterType:I

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 129
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->destroy()V

    .line 132
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

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

    .line 234
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, 0x1

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_1

    :sswitch_1
    const-string p2, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_2
    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_3
    const-string p2, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto :goto_1

    :sswitch_4
    const-string p2, "offlineScanBarcodeReady"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_5
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

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
    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 250
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 251
    invoke-direct {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->prepareForFetch()V

    .line 252
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    goto :goto_2

    .line 254
    :cond_1
    iput-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->shouldRefresh:Z

    goto :goto_2

    .line 240
    :pswitch_1
    iput-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->shouldRefresh:Z

    goto :goto_2

    .line 236
    :pswitch_2
    invoke-virtual {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->popScreen()V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x57c9a285 -> :sswitch_8
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onPreFetch(Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 2

    .line 353
    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    .line 354
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 356
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLatitude:Ljava/lang/Double;

    .line 357
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->userLongitude:Ljava/lang/Double;

    :cond_0
    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 191
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 192
    iget-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->shouldRefresh:Z

    if-eqz v0, :cond_1

    .line 193
    invoke-direct {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->prepareForFetch()V

    .line 194
    iget-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->hasLocation:Z

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    goto :goto_0

    .line 197
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->refreshLocation()V

    .line 201
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 202
    invoke-direct {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->maybeDisplayTooltip()V

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    if-nez p2, :cond_0

    .line 376
    invoke-direct {p0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->maybeDisplayTooltip()V

    :cond_0
    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 3

    const/4 v0, 0x0

    .line 290
    iput-boolean v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->shouldRefresh:Z

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 293
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 294
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 296
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_4

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v1, :cond_0

    goto :goto_1

    .line 316
    :cond_0
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    .line 319
    iget v1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->filterType:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 320
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->onlineStoreTiles:Ljava/util/List;

    goto :goto_0

    .line 322
    :cond_1
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->storeTiles:Ljava/util/List;

    :goto_0
    if-nez v1, :cond_2

    .line 326
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 329
    :cond_2
    instance-of v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    if-eqz v2, :cond_3

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->previousPageKey:Ljava/lang/String;

    if-nez p1, :cond_3

    .line 332
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 335
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f1106e5

    .line 336
    invoke-virtual {p0, p1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    :cond_3
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;->pageKey:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 341
    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    goto :goto_3

    .line 297
    :cond_4
    :goto_1
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    .line 298
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const/4 v1, 0x2

    if-ne p2, v1, :cond_5

    .line 300
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 302
    iget-object p2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$FilteredStoresListScreen$DCb23mGWQPHtTs0nIrEbn8gS0uo;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/-$$Lambda$FilteredStoresListScreen$DCb23mGWQPHtTs0nIrEbn8gS0uo;-><init>(Lcom/shopkick/app/store/FilteredStoresListScreen;)V

    invoke-virtual {p2, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 305
    :cond_5
    iget-object p2, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110155

    .line 306
    invoke-virtual {p0, v1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1102b4

    .line 307
    invoke-virtual {p0, v2}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 305
    invoke-virtual {p2, v1, v2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 310
    :goto_2
    instance-of p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    if-eqz p2, :cond_6

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;->previousPageKey:Ljava/lang/String;

    if-eqz p1, :cond_6

    .line 312
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    :cond_6
    :goto_3
    return-object v0
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 110
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen;->params:Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->getFilterTypeFromParams(Ljava/util/Map;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFilterType(Ljava/lang/String;)V

    return-void
.end method
