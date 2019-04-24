.class public Lcom/shopkick/app/cpg/CPGCategoryScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "CPGCategoryScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;


# static fields
.field public static final COLUMN_COUNT:I = 0x2

.field public static final FEATURED_CONTENT_TILE_PADDING:I = 0xa

.field public static final PARAM_IS_DUMMY_CATEGORY_ID_ENABLED:Ljava/lang/String; = "paramIsDummyCategoryIdEnabled"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

.field private carouselPromoViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

.field private categoryName:Ljava/lang/String;

.field private hasLocation:Z

.field private isDummyCategoryIdEnabled:Z

.field private isRequestDone:Z

.field private latitude:D

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private locationIds:Ljava/lang/String;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private longitude:D

.field private mainView:Landroid/widget/FrameLayout;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private productHierarchyId:Ljava/lang/String;

.field private receiptKicksHeaderV2ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

.field private scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldInvalidateOfflineScanTiles:Z

.field private shouldRefresh:Z

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

.field private widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 98
    new-instance v0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;-><init>(Lcom/shopkick/app/cpg/CPGCategoryScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/cpg/CPGCategoryScreen;D)D
    .locals 0

    .line 59
    iput-wide p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->latitude:D

    return-wide p1
.end method

.method static synthetic access$102(Lcom/shopkick/app/cpg/CPGCategoryScreen;D)D
    .locals 0

    .line 59
    iput-wide p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->longitude:D

    return-wide p1
.end method

.method static synthetic access$202(Lcom/shopkick/app/cpg/CPGCategoryScreen;Z)Z
    .locals 0

    .line 59
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->hasLocation:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/cpg/CPGCategoryScreen;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->refreshData()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/cpg/CPGCategoryScreen;)Lcom/shopkick/app/products/ScansListAdapter;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/cpg/CPGCategoryScreen;)Landroid/widget/ProgressBar;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private refreshData()V
    .locals 2

    .line 414
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 415
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->exitFullScreen()V

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dismissDialog()V

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 422
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->clear()V

    .line 425
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->hasLocation:Z

    if-nez v0, :cond_1

    .line 426
    invoke-direct {p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->refreshLocation()V

    goto :goto_0

    .line 428
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->fetchNextPage()V

    :goto_0
    return-void
.end method

.method private refreshLocation()V
    .locals 2

    const/4 v0, 0x0

    .line 434
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->hasLocation:Z

    .line 435
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->getLocationOrTriggerUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 26

    move-object/from16 v15, p0

    const/4 v7, 0x0

    const v0, 0x7f0c008a

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 151
    invoke-virtual {v1, v0, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->mainView:Landroid/widget/FrameLayout;

    .line 152
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f090628

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 153
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f09059a

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 154
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 157
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->categoryName:Ljava/lang/String;

    invoke-virtual {v15, v0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 160
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v8, 0x1

    const/4 v9, 0x2

    invoke-direct {v1, v9, v8}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 162
    new-instance v5, Ljava/util/HashSet;

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v10, 0x3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v7

    const/16 v11, 0x1c

    .line 163
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v8

    const/16 v12, 0x33

    .line 164
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v9

    const/16 v13, 0x2b

    .line 165
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v10

    const/16 v14, 0x17

    .line 166
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/16 v1, 0x2d

    .line 167
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/16 v16, 0x35

    .line 168
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/16 v1, 0x3ed

    .line 169
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/16 v6, -0xe

    .line 170
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/4 v1, -0x1

    .line 171
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 172
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const/16 v1, -0xd

    .line 173
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 162
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 175
    new-instance v4, Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v17, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-object v0, v4

    move-object/from16 v2, p0

    move-object/from16 v18, v3

    move-object/from16 v3, p0

    move-object v14, v4

    move-object/from16 v4, v18

    move-object/from16 v6, v17

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/products/ScansListAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    iput-object v14, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 182
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 183
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v7}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 186
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    new-instance v1, Ljava/util/HashSet;

    new-array v2, v10, [Ljava/lang/Integer;

    const/16 v3, 0x16

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v7

    const/16 v3, 0x10

    .line 187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v8

    const/16 v3, 0x2f

    .line 188
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v9

    .line 186
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->setHeaderTileTypes(Ljava/util/Set;)V

    .line 190
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;

    invoke-direct {v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;-><init>()V

    .line 191
    iget-object v1, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/products/ScansListAdapter;->removeDefaultItemDecoration()V

    .line 192
    iget-object v1, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 195
    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;

    iget-object v2, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    new-instance v3, Ljava/util/HashSet;

    new-array v4, v10, [Ljava/lang/Integer;

    .line 196
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    .line 197
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    .line 198
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v9

    .line 196
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/HashSet;

    .line 200
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/16 v24, 0xa

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v0

    move-object/from16 v23, v4

    invoke-direct/range {v19 .. v24}, Lcom/shopkick/app/view/SKRecyclerView/DataObserverForTileSpacing;-><init>(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/Collection;Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;Ljava/util/Collection;I)V

    .line 201
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V

    .line 204
    new-instance v0, Lcom/shopkick/app/video/VideoRecyclerViewModule;

    iget-object v1, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2, v7}, Lcom/shopkick/app/video/VideoRecyclerViewModule;-><init>(Lcom/shopkick/app/video/VideoController;Landroid/content/Context;I)V

    iput-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    .line 205
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 208
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 209
    invoke-virtual {v0, v13}, Lcom/shopkick/app/products/ScansListAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    iput-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->receiptKicksHeaderV2ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    .line 210
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->receiptKicksHeaderV2ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    iget-object v1, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v2, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v3, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v4, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->setModulesForLocationSelectorDialog(Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 216
    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->getRecyclerViewImageController()Lcom/shopkick/app/controllers/RecyclerViewImageController;

    move-result-object v2

    .line 217
    new-instance v14, Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 220
    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v4

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 221
    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->getUserEventRecyclerViewCoordinator()Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    move-result-object v5

    iget-object v6, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v0, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v9, v0, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v11, v0, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v12, v0, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v13, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, v15, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    move-object/from16 v16, v0

    move-object v0, v14

    move-object/from16 v25, v14

    move-object/from16 v14, v16

    invoke-direct/range {v0 .. v15}, Lcom/shopkick/app/store/CarouselPromoController;-><init>(Landroid/content/Context;Lcom/shopkick/app/controllers/RecyclerViewImageController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    move-object/from16 v1, v25

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    .line 232
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    const/16 v2, -0xe

    invoke-virtual {v1, v2}, Lcom/shopkick/app/products/ScansListAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

    iput-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->carouselPromoViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

    .line 234
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->carouselPromoViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->setCarouselPromoController(Lcom/shopkick/app/store/CarouselPromoController;)V

    .line 237
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    const/16 v2, 0x17

    .line 238
    invoke-virtual {v1, v2}, Lcom/shopkick/app/products/ScansListAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    iput-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    .line 241
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "UserAccountIdChangedEvent"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 242
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "ScanBCSucceeded"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 243
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "EventReceiptScanUploaded"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 246
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "offlineScanBarcodeReady"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 247
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "offlineScanFailed"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 248
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "offlineScanBarcodeEnqueued"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 250
    iget-object v1, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->mainView:Landroid/widget/FrameLayout;

    return-object v1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 6

    .line 354
    iget-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->hasLocation:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 360
    :cond_0
    iget-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->isDummyCategoryIdEnabled:Z

    if-eqz p1, :cond_1

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/16 v2, 0xfa6

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->productHierarchyId:Ljava/lang/String;

    aput-object v5, v3, v4

    .line 362
    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/fetchers/DataResponse;

    .line 361
    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    return-object v0

    .line 366
    :cond_1
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;-><init>()V

    .line 367
    iget-wide v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->latitude:Ljava/lang/Double;

    .line 368
    iget-wide v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->longitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->longitude:Ljava/lang/Double;

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->productHierarchyId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->productHierarchyId:Ljava/lang/String;

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationIds:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 373
    new-instance v1, Ljava/util/ArrayList;

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->locationIds:Ljava/util/List;

    :cond_2
    return-object p1
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

    .line 116
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 117
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 118
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 119
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 120
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 121
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 122
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    .line 124
    invoke-virtual {p0, p2}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->destroy()V

    .line 258
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

    .line 306
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, 0x1

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x5

    goto :goto_1

    :sswitch_1
    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_1

    :sswitch_2
    const-string p2, "offlineScanBarcodeReady"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    goto :goto_1

    :sswitch_3
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :sswitch_4
    const-string p2, "offlineScanFailed"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    :sswitch_5
    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p2, -0x1

    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_2

    .line 323
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->isTopScreen()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 324
    invoke-direct {p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->refreshData()V

    goto :goto_2

    :cond_1
    const-string p2, "offlineScanBarcodeEnqueued"

    .line 325
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 326
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldInvalidateOfflineScanTiles:Z

    goto :goto_2

    .line 328
    :cond_2
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldRefresh:Z

    goto :goto_2

    .line 318
    :pswitch_1
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldRefresh:Z

    goto :goto_2

    .line 313
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p1

    if-gez p1, :cond_3

    .line 314
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldRefresh:Z

    goto :goto_2

    .line 308
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    invoke-virtual {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dismissDialog()V

    .line 309
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->receiptKicksHeaderV2ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    invoke-virtual {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->dismissLocationSelectorDialog()V

    .line 310
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldRefresh:Z

    :cond_3
    :goto_2
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
    .locals 2

    .line 340
    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;

    .line 341
    iget-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->hasLocation:Z

    if-eqz p1, :cond_0

    .line 342
    iget-wide v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->latitude:Ljava/lang/Double;

    .line 343
    iget-wide v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->longitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->longitude:Ljava/lang/Double;

    .line 345
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->productHierarchyId:Ljava/lang/String;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->productHierarchyId:Ljava/lang/String;

    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 263
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 264
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldRefresh:Z

    if-eqz v0, :cond_3

    .line 266
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->receiptKicksHeaderV2ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    if-eqz v0, :cond_0

    .line 267
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->dismissLocationSelectorDialog()V

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    if-eqz v0, :cond_1

    .line 270
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dismissDialog()V

    .line 272
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->isRequestDone:Z

    if-eqz v0, :cond_2

    .line 273
    invoke-direct {p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->refreshData()V

    goto :goto_0

    .line 275
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->refreshLocation()V

    goto :goto_0

    .line 278
    :cond_3
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldInvalidateOfflineScanTiles:Z

    if-eqz v0, :cond_4

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->invalidatePendingScanTile()V

    const/4 v0, 0x0

    .line 280
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldInvalidateOfflineScanTiles:Z

    .line 283
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    if-eqz v0, :cond_5

    .line 285
    iget-object v1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoRecyclerViewModule;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    :cond_5
    :goto_0
    return-void
.end method

.method protected onScreenWillHide()V
    .locals 1

    .line 292
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillHide()V

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->scanV3ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dismissDialog()V

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->receiptKicksHeaderV2ViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->dismissLocationSelectorDialog()V

    .line 297
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 2

    const/4 p1, 0x0

    .line 381
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldRefresh:Z

    .line 382
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldInvalidateOfflineScanTiles:Z

    const/4 v0, 0x1

    .line 383
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->isRequestDone:Z

    .line 385
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 386
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 387
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-eqz p2, :cond_1

    .line 391
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v1, :cond_0

    goto :goto_0

    .line 399
    :cond_0
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    .line 401
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 402
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    goto :goto_1

    .line 392
    :cond_1
    :goto_0
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-eqz p2, :cond_2

    .line 393
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x2

    if-ne p2, v1, :cond_2

    .line 394
    iget-object p2, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->recyclerViewAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/products/ScansListAdapter;->setOfflineEducationTilePosition(I)V

    goto :goto_1

    .line 396
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const p2, 0x7f110142

    invoke-virtual {p0, p2}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_1
    return-object v0
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 129
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->setParams(Ljava/util/Map;)V

    const-string v0, "product_hierarchy_id"

    .line 131
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "location_ids"

    .line 132
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "product_category"

    .line 134
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->categoryName:Ljava/lang/String;

    const-string v2, "1"

    const-string v3, "paramIsDummyCategoryIdEnabled"

    .line 135
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->isDummyCategoryIdEnabled:Z

    if-eqz v0, :cond_1

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationIds:Ljava/lang/String;

    .line 139
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 141
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->productHierarchyId:Ljava/lang/String;

    .line 142
    iput-object v1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->locationIds:Ljava/lang/String;

    const/4 p1, 0x1

    .line 145
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen;->shouldRefresh:Z

    :cond_1
    return-void
.end method
