.class public Lcom/shopkick/app/store/StoreDetailsAdapter;
.super Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
.source "StoreDetailsAdapter.java"

# interfaces
.implements Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/StoreDetailsAdapter$ScreenRecyclerViewModule;
    }
.end annotation


# static fields
.field private static final GROUP_HEADER_TOP_PADDING:I = 0x8

.field private static final NUMBER_OF_OFFERS_THRESHOLD_FOR_CATEGORIZE_WIDGET:I = 0x5


# instance fields
.field private carouselIdx:I

.field private carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

.field private chainId:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final context:Landroid/content/Context;

.field private isOnlineStore:Z

.field private isWalkin:Z

.field private locationId:Ljava/lang/String;

.field private onlineKicksUnitTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;

.field private response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

.field private storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

.field private storeDetailsOnlineKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;

.field private walkinAnimationInProgress:Z

.field private widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Context;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    move-object v8, p0

    move-object v9, p1

    .line 89
    sget-object v7, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    const/4 v0, -0x1

    .line 64
    iput v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselIdx:I

    .line 97
    new-instance v0, Lcom/shopkick/app/store/StoreDetailsAdapter$ScreenRecyclerViewModule;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/StoreDetailsAdapter$ScreenRecyclerViewModule;-><init>(Lcom/shopkick/app/store/StoreDetailsAdapter;)V

    move-object v1, p4

    invoke-virtual {p4, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    move-object/from16 v0, p6

    .line 99
    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->locationId:Ljava/lang/String;

    move-object/from16 v0, p7

    .line 100
    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    move/from16 v0, p8

    .line 101
    iput-boolean v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    move-object/from16 v0, p9

    .line 102
    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->context:Landroid/content/Context;

    .line 103
    iget-object v0, v9, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 104
    iget-object v0, v9, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/16 v0, -0x23

    .line 106
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    .line 109
    iget-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineKicksUnitEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x418

    .line 111
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;

    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->onlineKicksUnitTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;

    goto :goto_0

    :cond_0
    const/16 v0, -0x34

    .line 114
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;

    iput-object v0, v8, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsOnlineKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;

    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/store/StoreDetailsAdapter;I)I
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/store/StoreDetailsAdapter;)I
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getCarouselRowIndex()I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/store/StoreDetailsAdapter;)Lcom/shopkick/app/store/CarouselPromoController;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    return-object p0
.end method

.method private addAddressTileIfNotOnlineStore()V
    .locals 10

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-nez v0, :cond_0

    return-void

    .line 281
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    if-nez v0, :cond_3

    const/16 v0, -0x20

    .line 282
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v1

    if-gez v1, :cond_3

    .line 284
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;

    .line 285
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainLogoImageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->address:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->latitude:Ljava/lang/Double;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->longitude:Ljava/lang/Double;

    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->locationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationName:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v9, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->setData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 293
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez v2, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getCarouselRowIndex()I

    move-result v2

    if-ltz v2, :cond_2

    :cond_1
    const/4 v1, 0x1

    .line 296
    :cond_2
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 297
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private addCategorizedWidget(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 516
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 517
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xfa1

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-gez v0, :cond_2

    return-void

    .line 525
    :cond_2
    new-instance v2, Ljava/util/HashSet;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Integer;

    const/16 v4, 0x16

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x41

    .line 526
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v1

    .line 525
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 527
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 529
    new-instance v6, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    invoke-direct {v6}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;-><init>()V

    .line 530
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    .line 531
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v1

    :goto_2
    if-ltz v7, :cond_6

    .line 532
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 534
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/16 v10, 0x17

    if-ne v9, v10, :cond_3

    .line 536
    iget-object v9, v6, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    invoke-interface {v9, v5, v8}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_3

    .line 537
    :cond_3
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 538
    invoke-static {v8}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v9

    const/16 v10, -0x35

    .line 539
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iput-object v10, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 540
    iget-object v10, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    iput-object v10, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    .line 541
    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iput-object v8, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 542
    iget-object v8, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v8, v8, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_4

    const-string v8, "40560331"

    iget-object v10, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    .line 543
    iput-object v8, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 545
    :cond_4
    invoke-virtual {v3, v5, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 547
    new-instance v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v8}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v9, 0xfa6

    .line 548
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 550
    invoke-static {}, Lcom/shopkick/app/util/TileUtils;->getUniqueNumericString()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 551
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    .line 552
    invoke-virtual {v3, v1, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 555
    iget-object v9, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-instance v10, Lcom/shopkick/fetchers/DataResponse;

    invoke-direct {v10, v1, v5, v5, v6}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V

    invoke-virtual {v9, v8, v10, v5}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;Z)V

    .line 558
    new-instance v6, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    invoke-direct {v6}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;-><init>()V

    .line 559
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    :cond_5
    :goto_3
    add-int/lit8 v7, v7, -0x1

    goto/16 :goto_2

    .line 563
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 564
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v3}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 565
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 566
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 567
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f110703

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 568
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    const/16 v2, -0x23

    invoke-direct {p0, v2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private getCarouselRowIndex()I
    .locals 3

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 199
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->isDisplayingFailback()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 200
    iget v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselIdx:I

    if-ne v0, v1, :cond_1

    move v0, v2

    :cond_1
    return v0

    .line 203
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->promoTiles:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->promoTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 204
    iget v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselIdx:I

    if-ne v0, v1, :cond_3

    move v0, v2

    :cond_3
    return v0

    :cond_4
    return v1
.end method

.method private getTilePositionForType(I)I
    .locals 2

    const/4 v0, 0x0

    .line 211
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 212
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method private maybeAddGroceryOfferWidget()V
    .locals 7

    .line 620
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    const/16 v2, 0xfa1

    if-ltz v0, :cond_1

    .line 621
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-gez v0, :cond_2

    return-void

    :cond_2
    :goto_2
    if-ltz v0, :cond_6

    .line 631
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getItemViewType(I)I

    move-result v3

    const/16 v4, 0x10

    if-ne v3, v4, :cond_5

    .line 632
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 633
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 635
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPhysicalStoreDetailPageRedesigned(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x41

    .line 636
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 637
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f110703

    .line 638
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 641
    :cond_3
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 642
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 643
    invoke-virtual {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v5, "ENABLE_SEE_ALL_LINK_CPGLOCATIONFEED_REQUEST"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 645
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v5, "WIDGET_LONGITUDE"

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 646
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v5, "WIDGET_LATITUDE"

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    .line 647
    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    .line 648
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v5, "WIDGET_LONGITUDE"

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    .line 649
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v5, "WIDGET_LATITUDE"

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    goto :goto_3

    .line 651
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->locationId:Ljava/lang/String;

    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    .line 653
    :goto_3
    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    .line 654
    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iput-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 655
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    add-int/2addr v0, v1

    invoke-virtual {v2, v0, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_4

    .line 658
    :cond_5
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_2

    :cond_6
    :goto_4
    return-void
.end method

.method private maybeAddOnlineOfferWidget()V
    .locals 8

    .line 574
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xfae

    if-ltz v0, :cond_1

    .line 575
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 576
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-gez v0, :cond_2

    return-void

    .line 585
    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-virtual {v4, v3, v5}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 586
    instance-of v4, v3, Lcom/shopkick/fetchers/DataResponse;

    if-nez v4, :cond_3

    .line 588
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    .line 591
    :cond_3
    check-cast v3, Lcom/shopkick/fetchers/DataResponse;

    iget-object v3, v3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    .line 592
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    if-eqz v4, :cond_5

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-gtz v3, :cond_4

    goto :goto_2

    .line 598
    :cond_4
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f110705

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 599
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f110166

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    .line 600
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 603
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "filter_type"

    .line 605
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 604
    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_id"

    .line 606
    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v4, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v5, Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-direct {v1, v4, v5, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 611
    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->createWidgetHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    const/16 v3, 0x10

    .line 612
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 613
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->toInteger(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 614
    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 615
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    .line 594
    :cond_5
    :goto_2
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method private removeStoreKickHeaderTile()V
    .locals 4

    const/4 v0, 0x0

    .line 305
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, -0x1

    if-ge v0, v1, :cond_1

    .line 306
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x10

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_1
    if-le v0, v2, :cond_2

    .line 312
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private setDecorationRule()V
    .locals 7

    .line 664
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 665
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/16 v4, 0x8

    const/16 v5, 0x41

    if-ge v2, v3, :cond_3

    .line 666
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 667
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v6, -0x20

    if-eq v3, v6, :cond_2

    const/16 v6, 0x3f

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_0

    const/16 v5, 0x44

    if-eq v3, v5, :cond_1

    const/16 v5, 0x55

    if-eq v3, v5, :cond_1

    const/16 v5, 0xfa1

    if-eq v3, v5, :cond_1

    const/16 v5, 0xfa6

    if-eq v3, v5, :cond_1

    const/16 v5, 0xfae

    if-eq v3, v5, :cond_1

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 670
    :cond_0
    :pswitch_0
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->verticalPadding:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    :pswitch_1
    add-int/lit8 v3, v2, -0x1

    .line 684
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 674
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 689
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object v2

    .line 690
    invoke-virtual {v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->clearRule()V

    .line 691
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 692
    new-instance v6, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {v6, v3, v1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v2, v6}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    goto :goto_2

    .line 696
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPhysicalStoreDetailPageRedesigned(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 697
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    const/16 v3, -0xe

    .line 698
    invoke-direct {p0, v3}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v0, v3, v4}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    .line 697
    invoke-virtual {v2, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    .line 700
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    invoke-direct {p0, v5}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v3

    invoke-direct {v0, v3, v1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {v2, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private setupWidgets()V
    .locals 8

    .line 782
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 783
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/16 v3, 0xfae

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    aput-object v4, v2, v1

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 784
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStoreDetailsGroceryOffersWidgetEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 785
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/16 v5, 0xfa1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v6, "WIDGET_LATITUDE"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 786
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v6, "WIDGET_LONGITUDE"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 787
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    aput-object v7, v6, v1

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 789
    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v7, "WIDGET_LONGITUDE"

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v6, v2

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 790
    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v7, "WIDGET_LATITUDE"

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v6, v3

    .line 791
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v6, v4

    .line 787
    invoke-virtual {v0, v5, v6}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 793
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->locationId:Ljava/lang/String;

    aput-object v6, v4, v1

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    aput-object v1, v4, v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v4, v3

    invoke-virtual {v0, v5, v4}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method private shiftCarouselToBottom()V
    .locals 4

    const/16 v0, -0xe

    .line 738
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v0

    const/16 v1, 0x10

    .line 739
    invoke-direct {p0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v1

    if-ltz v0, :cond_1

    .line 742
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-ltz v1, :cond_0

    if-eqz v2, :cond_0

    add-int/lit8 v3, v1, -0x1

    .line 745
    iput v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselIdx:I

    .line 746
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 747
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    if-eqz v2, :cond_1

    .line 749
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 750
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 751
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselIdx:I

    :cond_1
    :goto_0
    return-void
.end method

.method private shouldShiftCarousel()Z
    .locals 2

    .line 731
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isPromoUnitUnpaid:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    .line 734
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPhysicalStoreDetailPageRedesigned(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isPromoUnitUnpaid:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v1
.end method

.method private tryAddCarousel()V
    .locals 7

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, -0x1e

    .line 225
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v1

    if-ltz v1, :cond_1

    .line 228
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 231
    :cond_1
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 233
    iget-boolean v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinAnimationInProgress:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 235
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    .line 240
    :cond_2
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 241
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getCarouselRowIndex()I

    move-result v3

    if-ltz v3, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_0
    if-eqz v3, :cond_7

    .line 243
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v3, 0x3f6

    .line 244
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/16 v5, -0xe

    .line 245
    invoke-direct {p0, v5}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v6

    if-gez v6, :cond_6

    .line 248
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 250
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->isDisplayingFailback()Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->promoTiles:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 251
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->promoTiles:Ljava/util/List;

    invoke-interface {v3, v4, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 253
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    if-eqz v0, :cond_5

    .line 254
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->promoTiles:Ljava/util/List;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/store/CarouselPromoController;->setData(Ljava/util/List;)V

    .line 256
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 257
    :cond_6
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->isDisplayingFailback()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    if-eqz v1, :cond_a

    .line 258
    invoke-virtual {v1, v3}, Lcom/shopkick/app/store/CarouselPromoController;->containsTileOfType(I)Z

    move-result v1

    if-nez v1, :cond_a

    .line 260
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/store/CarouselPromoController;->insertPromoTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_1

    .line 262
    :cond_7
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-eqz v3, :cond_8

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v3, :cond_8

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 265
    :cond_8
    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-nez v3, :cond_9

    .line 268
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_9
    const/4 v0, 0x0

    .line 272
    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    :cond_a
    :goto_1
    return-void
.end method

.method private tryAddKicksRelatedView()V
    .locals 27

    move-object/from16 v0, p0

    .line 318
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-nez v1, :cond_0

    return-void

    .line 322
    :cond_0
    iget-boolean v2, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    const/4 v3, 0x0

    if-nez v2, :cond_4

    .line 323
    iget-object v4, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkinCoinsAvailable:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->totalWalkinCoins:Ljava/lang/Integer;

    .line 324
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkedInToday:Ljava/lang/Boolean;

    .line 325
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->daysUntilNextWalkin:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v8, v3

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->daysUntilNextWalkin:Ljava/lang/Integer;

    .line 326
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v8, v3

    :goto_0
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scanCoinsAvailable:Ljava/lang/Integer;

    .line 327
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->totalScanCoins:Ljava/lang/Integer;

    .line 328
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scannedToday:Ljava/lang/Boolean;

    .line 329
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasBnc:Ljava/lang/Boolean;

    .line 330
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v13, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->purchasesKicksAvailable:Ljava/lang/String;

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isVisaOnly:Ljava/lang/Boolean;

    .line 332
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasReceiptKicks:Ljava/lang/Boolean;

    .line 333
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->receiptKicksAvailable:Ljava/lang/String;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->coinsGrantedToday:Ljava/lang/Integer;

    .line 335
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkinBubbleSkLink:Ljava/lang/String;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scanBubbleSkLink:Ljava/lang/String;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->bncBubbleSkLink:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->receiptBubbleSkLink:Ljava/lang/String;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userReachedReceiptScanLimit:Ljava/lang/Boolean;

    .line 340
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v22

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationId:Ljava/lang/String;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->address:Ljava/lang/String;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->bonusWalkinKicksAvailable:Ljava/lang/Boolean;

    .line 344
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v26

    .line 323
    invoke-virtual/range {v4 .. v26}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->setData(IIZIIIZZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v1, -0x23

    .line 346
    invoke-direct {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v2

    if-gez v2, :cond_3

    iget-boolean v2, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isWalkin:Z

    if-nez v2, :cond_2

    iget-object v2, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    .line 348
    invoke-virtual {v2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasAvailableKicks()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 350
    :cond_2
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 351
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 352
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    const/16 v1, -0x34

    .line 355
    invoke-direct {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v2

    if-gez v2, :cond_a

    iget-object v2, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsOnlineKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;

    if-eqz v2, :cond_a

    .line 357
    iget-object v3, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

    iget-object v4, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickedOnlineOfferToday:Ljava/lang/Boolean;

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->setData(Ljava/lang/Integer;Ljava/lang/Boolean;)V

    .line 359
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 360
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 361
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 362
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationName:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    .line 363
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainLogoImageUrl:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 364
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreMerchantId:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreMerchantId:Ljava/lang/String;

    .line 365
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    .line 366
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    .line 367
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

    .line 368
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    .line 369
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

    .line 370
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    .line 371
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    .line 372
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 379
    :cond_4
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    .line 380
    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    .line 381
    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    .line 382
    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "0"

    iget-object v2, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    .line 383
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto/16 :goto_2

    :cond_6
    const/16 v1, 0x418

    .line 388
    invoke-direct {v0, v1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getTilePositionForType(I)I

    move-result v2

    if-gez v2, :cond_a

    iget-object v2, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->onlineKicksUnitTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;

    if-eqz v2, :cond_a

    .line 391
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 392
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 393
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 394
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->locationName:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    .line 395
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainLogoImageUrl:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 396
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    .line 397
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreStrikePrice:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    .line 398
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreMerchantId:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreMerchantId:Ljava/lang/String;

    .line 399
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    .line 400
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    .line 401
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

    .line 402
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    .line 403
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

    .line 404
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    .line 405
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    .line 406
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreCategoryKicksTitle:Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    .line 411
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->tiles:Ljava/util/List;

    if-eqz v1, :cond_9

    .line 413
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->tiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 414
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x3f

    if-ne v4, v5, :cond_7

    const/4 v3, 0x1

    .line 419
    :cond_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    .line 421
    :cond_9
    iget-object v1, v0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_1
    return-void

    :cond_b
    :goto_2
    return-void
.end method

.method private tryAddWidgetAndExtractRetailerReceiptTile()V
    .locals 8

    .line 427
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-nez v0, :cond_0

    return-void

    .line 430
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 431
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->maybeAddOnlineOfferWidget()V

    goto/16 :goto_2

    .line 432
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPhysicalStoreDetailPageRedesigned(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 433
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->maybeAddGroceryOfferWidget()V

    goto/16 :goto_2

    .line 434
    :cond_2
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPhysicalStoreDetailPageRedesigned(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 436
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/16 v4, 0xfa1

    const/4 v5, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v6, "WIDGET_LATITUDE"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 437
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v6, "WIDGET_LONGITUDE"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    aput-object v7, v6, v2

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 440
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v7, "WIDGET_LONGITUDE"

    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v6, v5

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 441
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v7, "WIDGET_LATITUDE"

    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v6, v1

    .line 442
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v6, v3

    .line 438
    invoke-virtual {v0, v4, v6}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 444
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->locationId:Ljava/lang/String;

    aput-object v6, v3, v2

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    aput-object v2, v3, v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-virtual {v0, v4, v3}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 447
    :goto_0
    instance-of v1, v0, Lcom/shopkick/fetchers/DataResponse;

    if-nez v1, :cond_4

    return-void

    .line 451
    :cond_4
    check-cast v0, Lcom/shopkick/fetchers/DataResponse;

    .line 452
    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;->tiles:Ljava/util/List;

    if-nez v1, :cond_5

    goto :goto_1

    .line 457
    :cond_5
    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;

    .line 459
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;->tiles:Ljava/util/List;

    .line 460
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shouldCategorizeWidget(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 461
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->extractRetailerReceiptTileToFeedTiles(Ljava/util/List;)V

    .line 462
    invoke-direct {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->addCategorizedWidget(Ljava/util/List;)V

    .line 463
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->removeStoreKickHeaderTile()V

    goto :goto_2

    .line 465
    :cond_6
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->maybeAddGroceryOfferWidget()V

    goto :goto_2

    :cond_7
    :goto_1
    return-void

    :cond_8
    :goto_2
    return-void
.end method


# virtual methods
.method public addTilesFromResponse(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 803
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    .line 816
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x418

    const/4 v4, -0x1

    if-ge v1, v2, :cond_2

    .line 817
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move v1, v4

    .line 823
    :goto_1
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->nextPageKey:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v2

    const/16 v5, 0x55

    if-eqz v2, :cond_6

    move v2, v0

    .line 826
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v0, v6, :cond_8

    .line 827
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v6, v5, :cond_4

    if-eq v6, v3, :cond_3

    goto :goto_3

    :cond_3
    if-le v1, v4, :cond_5

    .line 830
    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v1, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    if-le v1, v4, :cond_5

    .line 835
    iget-object v6, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v6}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v6

    .line 836
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    .line 838
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_5
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 845
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 846
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v5, :cond_7

    if-eq v1, v3, :cond_7

    goto :goto_5

    .line 850
    :cond_7
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 857
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public clear()V
    .locals 2

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 189
    invoke-virtual {v0, v1}, Lcom/shopkick/app/store/CarouselPromoController;->setData(Ljava/util/List;)V

    .line 191
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->clear()V

    return-void
.end method

.method public clearWidgets()V
    .locals 8

    .line 912
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 913
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 914
    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 917
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isOnlineStore:Z

    if-nez v0, :cond_1

    .line 918
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->locationId:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v6, 0x2

    aput-object v3, v2, v6

    const/16 v3, 0xfa1

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I[Ljava/lang/Object;)V

    .line 919
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v2, "WIDGET_LATITUDE"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 920
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v2, "WIDGET_LONGITUDE"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 921
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->chainId:Ljava/lang/String;

    aput-object v7, v2, v4

    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 923
    invoke-virtual {v4}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v4

    const-string v7, "WIDGET_LONGITUDE"

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v5

    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 924
    invoke-virtual {v4}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->clientData()Ljava/util/HashMap;

    move-result-object v4

    const-string v7, "WIDGET_LATITUDE"

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v6

    .line 925
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v1

    .line 921
    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 873
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->clearWidgets()V

    const/16 v0, 0x72

    .line 874
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->containsTileOfType(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 875
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-virtual {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->destroy()V

    .line 877
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->destroy()V

    return-void
.end method

.method public digestResponse(Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;)V
    .locals 2

    .line 707
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 708
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    .line 709
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    .line 710
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 713
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->tryAddCarousel()V

    .line 714
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->addAddressTileIfNotOnlineStore()V

    .line 715
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->tryAddKicksRelatedView()V

    .line 717
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->tiles:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->addTilesFromResponse(Ljava/util/List;)V

    .line 719
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStoreDetailsGroceryOffersWidgetEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 720
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->tryAddWidgetAndExtractRetailerReceiptTile()V

    .line 722
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shouldShiftCarousel()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 723
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shiftCarouselToBottom()V

    .line 726
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->setDecorationRule()V

    .line 727
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method extractRetailerReceiptTileToFeedTiles(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 471
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    move v0, v1

    .line 476
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v0, v2, :cond_2

    add-int/lit8 v2, v0, -0x1

    .line 477
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 478
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 479
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x43

    if-ne v5, v6, :cond_1

    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 480
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x16

    if-ne v5, v6, :cond_1

    .line 481
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 482
    invoke-interface {p1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/16 p1, -0x35

    .line 484
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/16 p1, 0x44

    .line 486
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_1
    if-eqz v3, :cond_6

    if-nez v4, :cond_3

    goto :goto_4

    :cond_3
    const/4 p1, 0x0

    .line 493
    :goto_2
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    .line 494
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x10

    if-ne v0, v2, :cond_4

    .line 495
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    add-int/2addr p1, v1

    invoke-virtual {v0, p1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 496
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_3

    :cond_4
    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    return-void

    :cond_6
    :goto_4
    return-void
.end method

.method public finishWalkinAnimation(I)V
    .locals 1

    .line 151
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinAnimationInProgress:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 152
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinAnimationInProgress:Z

    .line 153
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->tryAddCarousel()V

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->animateCheckAndKicksEarnedNumber(I)V

    .line 155
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shouldShiftCarousel()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 156
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shiftCarouselToBottom()V

    .line 157
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->setDecorationRule()V

    .line 159
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public finishWalkinAnimationWithFailure(Z)V
    .locals 1

    .line 164
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinAnimationInProgress:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 165
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinAnimationInProgress:Z

    if-nez p1, :cond_0

    .line 167
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->tryAddCarousel()V

    .line 168
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shouldShiftCarousel()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 169
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shiftCarouselToBottom()V

    .line 170
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->setDecorationRule()V

    .line 173
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    invoke-virtual {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->configureCellForFailedWalkin()V

    .line 174
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    if-lez p1, :cond_0

    .line 984
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public isDisplayingWalkinDetails()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isWalkin:Z

    return v0
.end method

.method public isVideoOTTPlaying()Z
    .locals 1

    const/16 v0, 0x72

    .line 881
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 885
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->isVideoPlaying()Z

    move-result v0

    return v0
.end method

.method public notifyAdapterDataSetChanged()V
    .locals 2

    .line 905
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 906
    iput-boolean v1, v0, Lcom/shopkick/app/store/CarouselPromoController;->shouldRefreshImages:Z

    .line 908
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onReloadClicked()V
    .locals 0

    .line 866
    invoke-super {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->onReloadClicked()V

    .line 867
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->clearWidgets()V

    .line 868
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->setupWidgets()V

    return-void
.end method

.method public pauseVideoOTT()V
    .locals 1

    const/16 v0, 0x72

    .line 897
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    if-nez v0, :cond_0

    return-void

    .line 901
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->pauseVideo()V

    return-void
.end method

.method public playVideoOTT()V
    .locals 1

    const/16 v0, 0x72

    .line 889
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    if-nez v0, :cond_0

    return-void

    .line 893
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->playOTTVideo()V

    return-void
.end method

.method public prepareWalkinAnimation(Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x1

    .line 138
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->isWalkin:Z

    .line 139
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->walkinAnimationInProgress:Z

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->prepareForWalkinAnimation(Ljava/lang/Integer;)V

    .line 141
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->tryAddCarousel()V

    .line 142
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->tryAddKicksRelatedView()V

    .line 143
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shouldShiftCarousel()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 144
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->shiftCarouselToBottom()V

    .line 145
    invoke-direct {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->setDecorationRule()V

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public promoCarouselHeight()F
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 134
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselHeight()F

    move-result v0

    return v0
.end method

.method public setCarouselPromoController(Lcom/shopkick/app/store/CarouselPromoController;)V
    .locals 1

    .line 119
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    const/16 v0, -0xe

    .line 122
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoreDetailsAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

    .line 123
    invoke-virtual {v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->setCarouselPromoController(Lcom/shopkick/app/store/CarouselPromoController;)V

    return-void
.end method

.method shouldCategorizeWidget(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)Z"
        }
    .end annotation

    .line 505
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 506
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x17

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    add-int/2addr v1, v2

    const/4 v2, 0x5

    if-le v1, v2, :cond_0

    return v4

    :cond_2
    return v0
.end method

.method public updateKicksViewInOfflineScan()V
    .locals 7

    .line 757
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_3

    .line 760
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scanCoinsAvailable:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 762
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->response:Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfosForChain(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 763
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 764
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanKicks:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_0

    .line 769
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    sub-int/2addr v0, v3

    invoke-virtual {v1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->setScanKicksAvailable(I)V

    .line 772
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 773
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 774
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, -0x23

    if-ne v0, v1, :cond_3

    .line 775
    invoke-virtual {p0, v2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->notifyItemChanged(I)V

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-void

    :cond_5
    :goto_3
    return-void
.end method

.method public walkinCheckmarkCoordinates()[I
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinCheckmarkLocationInWindow()[I

    move-result-object v0

    return-object v0
.end method

.method public walkinCheckmarkDimensions()[I
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter;->storeDetailsKicksTileViewHolderConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinCheckmarkDimensions()[I

    move-result-object v0

    return-object v0
.end method
