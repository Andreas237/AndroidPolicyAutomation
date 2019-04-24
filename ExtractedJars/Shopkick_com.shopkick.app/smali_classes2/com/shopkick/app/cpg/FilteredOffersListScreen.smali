.class public Lcom/shopkick/app/cpg/FilteredOffersListScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FilteredOffersListScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;


# instance fields
.field private final DUMMY_HEADER_HEIGHT_DP:I

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private chainId:Ljava/lang/String;

.field private currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private filterType:I

.field private hasLocation:Z

.field private headerTilesToStick:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private latitude:D

.field private locationId:Ljava/lang/String;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private longitude:D

.field private mainView:Landroid/widget/FrameLayout;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldRefresh:Z

.field private stickyHeaderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

.field private stickyHeaderContainer:Landroid/view/View;

.field private stickyHeaderHeight:I

.field private stickyHeaderViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private supportedTileTypes:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/16 v0, 0x35

    .line 64
    iput v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->DUMMY_HEADER_HEIGHT_DP:I

    const/4 v0, 0x0

    .line 77
    iput v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->filterType:I

    .line 88
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    .line 96
    new-instance v0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;-><init>(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/cpg/FilteredOffersListScreen;D)D
    .locals 0

    .line 61
    iput-wide p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->latitude:D

    return-wide p1
.end method

.method static synthetic access$102(Lcom/shopkick/app/cpg/FilteredOffersListScreen;D)D
    .locals 0

    .line 61
    iput-wide p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->longitude:D

    return-wide p1
.end method

.method static synthetic access$202(Lcom/shopkick/app/cpg/FilteredOffersListScreen;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->hasLocation:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->refreshFeed()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)Landroid/widget/ProgressBar;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static synthetic lambda$processResponse$67(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addReloadTile()V

    return-void
.end method

.method public static synthetic lambda$processResponse$68(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V
    .locals 2

    .line 347
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method private processResponseForCPGResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 354
    iget-object v3, v2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;

    .line 355
    sget-object v4, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v4, v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 359
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 360
    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v8, 0x17

    if-ne v5, v8, :cond_0

    move v4, v7

    goto :goto_0

    :cond_1
    move v4, v6

    .line 366
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/16 v8, -0x35

    const/16 v9, 0x2f

    const/16 v11, 0x41

    const/16 v12, 0xfa6

    if-eqz v4, :cond_5

    .line 371
    new-instance v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v13}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 372
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const v14, 0x7f110462

    .line 373
    invoke-virtual {v0, v14}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getString(I)Ljava/lang/String;

    move-result-object v14

    iput-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 374
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    iget-object v14, v0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {v14, v6, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move v13, v6

    const/4 v14, 0x0

    .line 380
    :goto_1
    iget-object v15, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v15

    if-ge v13, v15, :cond_4

    .line 381
    iget-object v15, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 383
    iget-object v10, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v9, :cond_2

    .line 384
    invoke-static {v15}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v10

    .line 385
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v10, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 386
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 388
    new-instance v10, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v10}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 389
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v10, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 390
    iget-object v14, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    iput-object v14, v10, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 391
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    iget-object v14, v0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {v14, v10, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;)V

    move-object v14, v10

    goto :goto_2

    .line 397
    :cond_2
    iget-object v10, v0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->supportedTileTypes:Ljava/util/HashSet;

    iget-object v12, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v10, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 398
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    add-int/lit8 v13, v13, 0x1

    const/16 v12, 0xfa6

    goto :goto_1

    :cond_4
    if-eqz v14, :cond_5

    .line 404
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iput-object v10, v14, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    .line 409
    :cond_5
    iget-object v10, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->nonCpgTiles:Ljava/util/List;

    if-eqz v10, :cond_6

    iget-object v10, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->nonCpgTiles:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_6

    move v10, v7

    goto :goto_3

    :cond_6
    move v10, v6

    :goto_3
    if-eqz v10, :cond_a

    .line 412
    new-instance v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v12}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 413
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iput-object v11, v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const v11, 0x7f110463

    .line 414
    invoke-virtual {v0, v11}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getString(I)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 415
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    iget-object v11, v0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v13

    sub-int/2addr v13, v7

    invoke-virtual {v11, v13, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move v11, v6

    const/4 v12, 0x0

    .line 420
    :goto_4
    iget-object v13, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->nonCpgTiles:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ge v11, v13, :cond_9

    .line 421
    iget-object v13, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->nonCpgTiles:Ljava/util/List;

    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 423
    iget-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v9, :cond_7

    .line 424
    invoke-virtual {v13, v6}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v12

    .line 425
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/16 v14, 0xfa6

    .line 426
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iput-object v15, v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 427
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    new-instance v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v12}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 430
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iput-object v15, v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 431
    iget-object v13, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    iput-object v13, v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 432
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    iget-object v13, v0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {v13, v12, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_5

    :cond_7
    const/16 v14, 0xfa6

    .line 438
    iget-object v15, v0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->supportedTileTypes:Ljava/util/HashSet;

    iget-object v6, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v15, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 439
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_5
    add-int/lit8 v11, v11, 0x1

    const/4 v6, 0x0

    goto :goto_4

    :cond_9
    if-eqz v12, :cond_a

    .line 445
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v12, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    :cond_a
    if-nez v4, :cond_c

    if-eqz v10, :cond_b

    goto :goto_6

    :cond_b
    const v2, 0x7f11021d

    .line 453
    invoke-virtual {v0, v2}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 454
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->tiles:Ljava/util/List;

    invoke-static {v2}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 456
    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->tiles:Ljava/util/List;

    iput-object v2, v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    goto :goto_7

    .line 450
    :cond_c
    :goto_6
    iput-object v5, v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    :goto_7
    return-void
.end method

.method private processResponseForOnlineOffersResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 461
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    .line 462
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 465
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 466
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    .line 467
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    const v1, 0x7f11021d

    invoke-virtual {p0, v1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 470
    :cond_1
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    return-void
.end method

.method private refreshFeed()V
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventLogger;->clearRecords()V

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    .line 243
    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 247
    iget v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->filterType:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->hasLocation:Z

    if-nez v0, :cond_0

    .line 248
    invoke-direct {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->refreshLocation()V

    goto :goto_0

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    :goto_0
    return-void
.end method

.method private refreshLocation()V
    .locals 2

    const/4 v0, 0x0

    .line 256
    iput-boolean v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->hasLocation:Z

    .line 257
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->getLocationOrTriggerUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    return-void
.end method

.method private setupForRecyclerView()V
    .locals 13

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-eqz v0, :cond_0

    return-void

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 189
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v2, 0x3ed

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x1

    const/16 v5, 0x41

    .line 190
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    const/4 v3, 0x2

    const/16 v6, 0x40

    .line 191
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    const/4 v3, 0x3

    const/16 v6, 0xfa6

    .line 192
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    const/4 v3, 0x4

    const/16 v6, -0x35

    .line 193
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    const/4 v3, 0x5

    const/4 v6, -0x1

    .line 194
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    const/4 v3, 0x6

    const/4 v6, -0x2

    .line 195
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    const/4 v3, 0x7

    const/16 v6, -0xd

    .line 196
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v3

    .line 189
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->supportedTileTypes:Ljava/util/HashSet;

    .line 198
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v7, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v10, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v11, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->supportedTileTypes:Ljava/util/HashSet;

    const/4 v12, 0x0

    move-object v6, v0

    move-object v8, p0

    move-object v9, p0

    invoke-direct/range {v6 .. v12}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 205
    iget v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->filterType:I

    if-nez v0, :cond_1

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 210
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->setDividerItemDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;)V

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 215
    invoke-virtual {v0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;

    .line 216
    invoke-virtual {v0, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->setCallback(Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v5}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    const/16 v0, 0x35

    .line 219
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderHeight:I

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 p3, 0x0

    const v0, 0x7f0c00b4

    .line 152
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->mainView:Landroid/widget/FrameLayout;

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f090628

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 154
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f09059a

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 155
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->mainView:Landroid/widget/FrameLayout;

    const p2, 0x7f0906dd

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderContainer:Landroid/view/View;

    .line 157
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->mainView:Landroid/widget/FrameLayout;

    const p3, 0x7f0906dc

    invoke-virtual {p2, p3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->setupForRecyclerView()V

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 164
    iget p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->filterType:I

    if-nez p1, :cond_0

    const p1, 0x7f110703

    .line 165
    invoke-virtual {p0, p1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->setAppScreenTitle(I)V

    .line 167
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 168
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 171
    new-instance p1, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 172
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p2, "android.permission.ACCESS_COARSE_LOCATION"

    iget-object p3, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->mainView:Landroid/widget/FrameLayout;

    const v0, 0x7f090443

    .line 173
    invoke-virtual {p3, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 172
    invoke-virtual {p1, p2, p3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f110705

    .line 175
    invoke-virtual {p0, p1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->setAppScreenTitle(I)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 180
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->mainView:Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 292
    iget p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->filterType:I

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    return-object v0

    .line 305
    :pswitch_0
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersRequest;-><init>()V

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->chainId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersRequest;->chainId:Ljava/lang/String;

    return-object p1

    .line 294
    :pswitch_1
    iget-boolean p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->hasLocation:Z

    if-nez p1, :cond_0

    return-object v0

    .line 298
    :cond_0
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedRequest;-><init>()V

    .line 299
    iget-wide v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedRequest;->latitude:Ljava/lang/Double;

    .line 300
    iget-wide v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->longitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedRequest;->longitude:Ljava/lang/Double;

    const/4 v0, 0x1

    .line 301
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedRequest;->includeNonCpgSeparately:Ljava/lang/Boolean;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

    .line 115
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 116
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 117
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const-string p1, "filter_type"

    .line 119
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->filterType:I

    :cond_0
    const-string p1, "chain_id"

    .line 123
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->chainId:Ljava/lang/String;

    const-string p1, "location_id"

    .line 124
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->locationId:Ljava/lang/String;

    const/4 p1, 0x1

    .line 125
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->shouldRefresh:Z

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 145
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 147
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
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

    .line 266
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x57c9a285

    const/4 v1, 0x1

    if-eq p2, v0, :cond_3

    const v0, 0x44e6563

    if-eq p2, v0, :cond_2

    const v0, 0x2ae28463

    if-eq p2, v0, :cond_1

    const v0, 0x556e6c68

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x3

    goto :goto_1

    :cond_1
    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v1

    goto :goto_1

    :cond_2
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 281
    :pswitch_0
    iput-boolean v1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->shouldRefresh:Z

    goto :goto_2

    .line 274
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p1

    if-gez p1, :cond_5

    .line 275
    iput-boolean v1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->shouldRefresh:Z

    goto :goto_2

    .line 268
    :pswitch_2
    invoke-virtual {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->popScreen()V

    :cond_5
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
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

.method public onReloadClicked()V
    .locals 0

    .line 581
    invoke-direct {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->refreshFeed()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 224
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 225
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->shouldRefresh:Z

    if-eqz v0, :cond_0

    .line 226
    invoke-direct {p0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->refreshFeed()V

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz v0, :cond_1

    .line 230
    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    :cond_1
    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 5

    .line 510
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p2

    const/16 p3, 0x8

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 511
    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 512
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderContainer:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 515
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderContainer:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 518
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p2

    .line 520
    iget-object v1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_5

    .line 521
    iget-object v3, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    if-ne v3, p2, :cond_1

    .line 523
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    if-nez v4, :cond_1

    .line 524
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderContainer:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    if-gt v3, p2, :cond_2

    .line 529
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 530
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 531
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p3, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v4, p2, 0x1

    if-ne v3, v4, :cond_4

    .line 536
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    .line 537
    iget p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderHeight:I

    if-ge p1, p2, :cond_5

    .line 539
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    sub-int/2addr v1, v2

    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p3, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 540
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iput-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 541
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    iget-object p3, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->currentInflatedHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p2, p3, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 545
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderContainer:Landroid/view/View;

    iget p3, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderHeight:I

    sub-int/2addr p1, p3

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setY(F)V

    move v0, v2

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_0

    :cond_5
    :goto_1
    if-nez v0, :cond_6

    .line 554
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->stickyHeaderContainer:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setY(F)V

    :cond_6
    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 2

    const/4 p1, 0x0

    .line 315
    iput-boolean p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->shouldRefresh:Z

    .line 317
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 318
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 319
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->headerTilesToStick:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 322
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_1

    .line 336
    :cond_0
    iget v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->filterType:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 342
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->processResponseForOnlineOffersResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_0

    .line 338
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->processResponseForCPGResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;Lcom/shopkick/fetchers/DataResponse;)V

    .line 347
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/cpg/-$$Lambda$FilteredOffersListScreen$FQVU5I0JwUQXBzLX2tVLuxEM_zs;

    invoke-direct {v0, p0}, Lcom/shopkick/app/cpg/-$$Lambda$FilteredOffersListScreen$FQVU5I0JwUQXBzLX2tVLuxEM_zs;-><init>(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 323
    :cond_1
    :goto_1
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 324
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    .line 325
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 327
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/cpg/-$$Lambda$FilteredOffersListScreen$IZILqSl2FYkXmjD_k4CNgxfQWBo;

    invoke-direct {v0, p0}, Lcom/shopkick/app/cpg/-$$Lambda$FilteredOffersListScreen$IZILqSl2FYkXmjD_k4CNgxfQWBo;-><init>(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 330
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v0, 0x7f110155

    .line 331
    invoke-virtual {p0, v0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1102b4

    .line 332
    invoke-virtual {p0, v1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 330
    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 479
    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object p1

    .line 480
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->clearRule()V

    const/4 v0, 0x0

    move v1, v0

    .line 482
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 483
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 484
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, -0x35

    if-eq v2, v3, :cond_1

    const/16 v3, 0x41

    if-eq v2, v3, :cond_0

    const/16 v3, 0xfa6

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 491
    :cond_0
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v2, v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    if-lez v1, :cond_2

    .line 493
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    add-int/lit8 v3, v1, -0x1

    const/16 v4, 0xa

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_1

    .line 487
    :cond_1
    new-instance v2, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v2, v1, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 130
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->params:Ljava/util/Map;

    const-string v1, "filter_type"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->params:Ljava/util/Map;

    const-string v1, "filter_type"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFilterType(Ljava/lang/String;)V

    .line 136
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->params:Ljava/util/Map;

    const-string v1, "chain_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->params:Ljava/util/Map;

    const-string v1, "chain_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
