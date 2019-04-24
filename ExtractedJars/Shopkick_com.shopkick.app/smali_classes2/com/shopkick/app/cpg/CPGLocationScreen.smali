.class public Lcom/shopkick/app/cpg/CPGLocationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "CPGLocationScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

.field private chainId:Ljava/lang/String;

.field private lastGoToScanTileIndex:Ljava/lang/Integer;

.field private locationId:Ljava/lang/String;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private mainView:Landroid/widget/FrameLayout;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field poppedScreenClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private productFamilyId:Ljava/lang/String;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

.field private scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldInvalidateOfflineScanTiles:Z

.field private shouldRefresh:Z

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 90
    new-instance v0, Lcom/shopkick/app/cpg/CPGLocationScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/cpg/CPGLocationScreen$1;-><init>(Lcom/shopkick/app/cpg/CPGLocationScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/cpg/CPGLocationScreen;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/shopkick/app/cpg/CPGLocationScreen;->refreshData()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/cpg/CPGLocationScreen;)Lcom/shopkick/app/products/ScansListAdapter;
    .locals 0

    .line 62
    iget-object p0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/cpg/CPGLocationScreen;)Landroid/widget/ProgressBar;
    .locals 0

    .line 62
    iget-object p0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static synthetic lambda$processResponse$66(Lcom/shopkick/app/cpg/CPGLocationScreen;)V
    .locals 2

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/products/ScansListAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    .line 400
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 401
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/products/ScansListAdapter;->getSectionPositionForProductFamilyId(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 403
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/products/CategoryJumperController;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method private refreshData()V
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 435
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->exitFullScreen()V

    .line 440
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->clear()V

    .line 442
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->fetchNextPage()V

    return-void
.end method

.method private setScreenTitle(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    .line 429
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/cpg/CPGLocationScreen;->setAppScreenTitle(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 21

    move-object/from16 v7, p0

    const/4 v8, 0x0

    const v0, 0x7f0c008c

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 119
    invoke-virtual {v1, v0, v2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->mainView:Landroid/widget/FrameLayout;

    .line 120
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f090628

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 121
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f09059a

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 123
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 126
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v9, 0x1

    const/4 v10, 0x2

    invoke-direct {v1, v10, v9}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 128
    new-instance v5, Ljava/util/HashSet;

    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v11, 0x16

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v8

    const/16 v12, 0x41

    .line 129
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v9

    const/4 v13, 0x3

    .line 130
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v10

    const/16 v14, 0x1c

    .line 131
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v13

    const/16 v15, 0x33

    .line 132
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v16, 0x4

    aput-object v1, v0, v16

    const/16 v1, 0x2d

    .line 133
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v6, 0x5

    aput-object v1, v0, v6

    const/16 v17, 0x18

    .line 134
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/16 v1, 0x2b

    .line 135
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/16 v18, 0x35

    .line 136
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/16 v1, 0x17

    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const/16 v1, 0xfa6

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const/16 v1, 0x3ed

    .line 139
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const/4 v1, -0x1

    .line 140
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 141
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const/16 v1, -0xd

    .line 142
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 128
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 145
    new-instance v4, Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v19, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->None:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-object v0, v4

    move-object/from16 v2, p0

    move-object/from16 v20, v3

    move-object/from16 v3, p0

    move-object v11, v4

    move-object/from16 v4, v20

    move-object/from16 v6, v19

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/products/ScansListAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    iput-object v11, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 152
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 153
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v8}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 155
    new-instance v4, Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;

    invoke-direct {v4}, Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;-><init>()V

    .line 156
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->removeDefaultItemDecoration()V

    .line 157
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 160
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;

    iget-object v2, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    new-instance v3, Ljava/util/HashSet;

    new-array v1, v13, [Ljava/lang/Integer;

    .line 161
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v8

    .line 162
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v9

    .line 163
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v10

    .line 161
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v5, Ljava/util/HashSet;

    new-array v1, v13, [Ljava/lang/Integer;

    .line 165
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v8

    .line 166
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v9

    const/16 v6, 0x16

    .line 167
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v1, v10

    .line 165
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/16 v6, 0xa

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;-><init>(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/Collection;Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;Ljava/util/Collection;I)V

    .line 169
    iget-object v1, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/products/ScansListAdapter;->registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V

    .line 172
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    new-instance v1, Ljava/util/HashSet;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Integer;

    const/16 v3, 0x16

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v8

    const/16 v3, 0x10

    .line 173
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v9

    const/16 v3, 0x2f

    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v10

    .line 175
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v13

    .line 176
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v16

    .line 172
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->setHeaderTileTypes(Ljava/util/Set;)V

    .line 177
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    new-instance v1, Ljava/util/HashSet;

    new-array v2, v13, [Ljava/lang/Integer;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v8

    .line 178
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v9

    .line 179
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v10

    .line 177
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->setCountIgnoredTileTypes(Ljava/util/Set;)V

    .line 181
    new-instance v0, Lcom/shopkick/app/products/CategoryJumperController;

    iget-object v1, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v2, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->mainView:Landroid/widget/FrameLayout;

    iget-object v3, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {v0, v7, v1, v2, v3}, Lcom/shopkick/app/products/CategoryJumperController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    iput-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    .line 184
    new-instance v0, Lcom/shopkick/app/products/ScanKicksBarController;

    iget-object v1, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->mainView:Landroid/widget/FrameLayout;

    iget-object v2, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/products/ScanKicksBarController;-><init>(Landroid/view/View;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    iput-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    .line 187
    new-instance v0, Lcom/shopkick/app/video/VideoRecyclerViewModule;

    iget-object v1, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/cpg/CPGLocationScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2, v8}, Lcom/shopkick/app/video/VideoRecyclerViewModule;-><init>(Lcom/shopkick/app/video/VideoController;Landroid/content/Context;I)V

    iput-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    .line 188
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 191
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountIdChangedEvent"

    invoke-virtual {v0, v7, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 192
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ScanBCSucceeded"

    invoke-virtual {v0, v7, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 193
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventReceiptScanUploaded"

    invoke-virtual {v0, v7, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 196
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeReady"

    invoke-virtual {v0, v7, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 197
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanFailed"

    invoke-virtual {v0, v7, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 198
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeEnqueued"

    invoke-virtual {v0, v7, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 200
    iget-object v0, v7, Lcom/shopkick/app/cpg/CPGLocationScreen;->mainView:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    .line 331
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 332
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->locationId:Ljava/lang/String;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    .line 333
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    const/4 p1, 0x0

    return-object p1

    .line 337
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;-><init>()V

    .line 338
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->locationId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->locationId:Ljava/lang/String;

    .line 339
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->chainId:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 341
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->latitude:Ljava/lang/Double;

    .line 342
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->longitude:Ljava/lang/Double;

    .line 345
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/shopkick/app/products/ScanKicksBarController;->setReceiptScanAvailableForAnyItem(Z)V

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

    .line 105
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 106
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 107
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 108
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    const-string p1, "chain_id"

    .line 110
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->chainId:Ljava/lang/String;

    const-string p1, "location_id"

    .line 111
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->locationId:Ljava/lang/String;

    const-string p1, "product_family_id"

    .line 112
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->productFamilyId:Ljava/lang/String;

    const/4 p1, 0x1

    .line 114
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldRefresh:Z

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->clearWidgets()V

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->destroy()V

    .line 209
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3
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

    .line 258
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_1
    const-string v0, "ScanBCSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_1

    :sswitch_2
    const-string v0, "offlineScanBarcodeReady"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_3
    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_4
    const-string v0, "offlineScanFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "EventReceiptScanUploaded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 309
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/CPGLocationScreen;->isTopScreen()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 310
    invoke-direct {p0}, Lcom/shopkick/app/cpg/CPGLocationScreen;->refreshData()V

    goto/16 :goto_5

    :cond_1
    const-string p2, "offlineScanBarcodeEnqueued"

    .line 311
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 312
    iput-boolean v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldInvalidateOfflineScanTiles:Z

    goto/16 :goto_5

    .line 314
    :cond_2
    iput-boolean v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldRefresh:Z

    goto/16 :goto_5

    .line 304
    :pswitch_1
    iput-boolean v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldRefresh:Z

    goto/16 :goto_5

    :pswitch_2
    const-string p1, "locId"

    .line 264
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 266
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/ScanKicksBarController;->prepareBlueToast(Ljava/util/HashMap;)V

    .line 270
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->lastGoToScanTileIndex:Ljava/lang/Integer;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 271
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/products/ScansListAdapter;->getFilteredTile(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v0

    :goto_2
    const-string v1, "scanTileInfo"

    .line 274
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 275
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/products/ScansListAdapter;->updateTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    iget-object v2, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v2}, Lcom/shopkick/app/products/ScansListAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    if-eqz p1, :cond_8

    .line 278
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 280
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    if-eqz p2, :cond_5

    .line 281
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    goto :goto_3

    .line 282
    :cond_5
    iget-object p2, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->lastGoToScanTileIndex:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/products/ScansListAdapter;->getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 283
    iget-object p2, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->lastGoToScanTileIndex:Ljava/lang/Integer;

    .line 284
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/products/ScansListAdapter;->getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object p2, v0

    .line 287
    :goto_3
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v2, 0x2e

    .line 288
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 289
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 290
    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 291
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanMissionId(Ljava/lang/String;)V

    .line 292
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 293
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    if-eqz p2, :cond_7

    .line 294
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCategoryId(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    const-string p1, "TaxonomyNodeIdOther"

    .line 296
    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCategoryId(Ljava/lang/String;)V

    .line 298
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 301
    :cond_8
    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->lastGoToScanTileIndex:Ljava/lang/Integer;

    goto :goto_5

    .line 260
    :pswitch_3
    iput-boolean v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldRefresh:Z

    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x57c9a285 -> :sswitch_5
        -0x106e20a3 -> :sswitch_4
        0x44e6563 -> :sswitch_3
        0x550c423 -> :sswitch_2
        0x2ae28463 -> :sswitch_1
        0x43b738dc -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onPreFetch(Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    return-void
.end method

.method protected onScreenDidHide()V
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    .line 242
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/CPGLocationScreen;->isTopScreen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 243
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/CPGLocationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 244
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 245
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->poppedScreenClass:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 247
    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->poppedScreenClass:Ljava/lang/Class;

    :cond_1
    :goto_0
    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 214
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 215
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldRefresh:Z

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->tryRefreshWithoutClear()V

    goto :goto_0

    .line 218
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldInvalidateOfflineScanTiles:Z

    if-eqz v0, :cond_1

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->invalidatePendingScanTile()V

    const/4 v0, 0x0

    .line 220
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldInvalidateOfflineScanTiles:Z

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    if-eqz v0, :cond_2

    .line 225
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoRecyclerViewModule;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    .line 230
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->poppedScreenClass:Ljava/lang/Class;

    if-eqz v0, :cond_3

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScanKicksBarController;->maybeAnimateTotalTripKicks()V

    const/4 v0, 0x0

    .line 232
    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->lastGoToScanTileIndex:Ljava/lang/Integer;

    .line 233
    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->poppedScreenClass:Ljava/lang/Class;

    :cond_3
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 5

    const/4 p1, 0x0

    .line 352
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldRefresh:Z

    .line 353
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->shouldInvalidateOfflineScanTiles:Z

    .line 355
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 356
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 357
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 358
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/products/ScansListAdapter;->clearWidgets()V

    .line 359
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/products/ScansListAdapter;->setEnableWidgetCategorization(Z)V

    .line 360
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/products/CategoryJumperController;->setHeaderSkLinkEnabled(Z)V

    .line 362
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_4

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v1, :cond_0

    goto :goto_0

    .line 371
    :cond_0
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;

    const v1, 0x7f110218

    const/4 v2, 0x1

    .line 374
    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;->locationName:Ljava/lang/String;

    aput-object v4, v3, p1

    invoke-virtual {p0, v1, v3}, Lcom/shopkick/app/cpg/CPGLocationScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/shopkick/app/cpg/CPGLocationScreen;->setScreenTitle(Ljava/lang/String;)V

    .line 377
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 378
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;->tiles:Ljava/util/List;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 380
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isScanOffersWidgetEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;->tiles:Ljava/util/List;

    iget-object v3, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 381
    invoke-virtual {v3}, Lcom/shopkick/app/products/ScansListAdapter;->getHeaderTileTypes()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/shopkick/app/util/TileUtils;->countOfferTiles(Ljava/util/List;Ljava/util/Set;)I

    move-result v1

    const/16 v3, 0x1e

    if-le v1, v3, :cond_1

    move p1, v2

    .line 383
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/products/ScansListAdapter;->setEnableWidgetCategorization(Z)V

    .line 384
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/products/CategoryJumperController;->setHeaderSkLinkEnabled(Z)V

    .line 387
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 388
    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 389
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scanKicksBarController:Lcom/shopkick/app/products/ScanKicksBarController;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/products/ScanKicksBarController;->setReceiptScanAvailableForAnyItem(Z)V

    .line 395
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance p2, Lcom/shopkick/app/cpg/-$$Lambda$CPGLocationScreen$vdRw2QU-Tk7Z4qS0urWjtZHwPpo;

    invoke-direct {p2, p0}, Lcom/shopkick/app/cpg/-$$Lambda$CPGLocationScreen$vdRw2QU-Tk7Z4qS0urWjtZHwPpo;-><init>(Lcom/shopkick/app/cpg/CPGLocationScreen;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 363
    :cond_4
    :goto_0
    iget v1, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    .line 364
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 365
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x2

    if-ne p2, v1, :cond_5

    .line 366
    iget-object p2, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->scansListAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/products/ScansListAdapter;->setOfflineEducationTilePosition(I)V

    goto :goto_1

    .line 368
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const p2, 0x7f110142

    invoke-virtual {p0, p2}, Lcom/shopkick/app/cpg/CPGLocationScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_1
    return-object v0
.end method

.method public setLastGoToScanTileIndex(I)V
    .locals 0

    .line 418
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen;->lastGoToScanTileIndex:Ljava/lang/Integer;

    return-void
.end method
