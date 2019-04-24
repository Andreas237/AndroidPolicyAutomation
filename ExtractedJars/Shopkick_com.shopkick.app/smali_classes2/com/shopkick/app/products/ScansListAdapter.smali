.class public Lcom/shopkick/app/products/ScansListAdapter;
.super Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
.source "ScansListAdapter.java"

# interfaces
.implements Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;
.implements Lcom/shopkick/app/products/JumpCapableAdapter;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;


# static fields
.field public static final MIN_SCAN_COUNT_FOR_CATEGORY_WIDGET:I = 0x1e


# instance fields
.field protected countIgnoredTileTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private enableScanMission:Z

.field private enableWidgetCategorization:Z

.field protected headerTileTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private moreScansTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field protected positionIgnoredTileTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private positionToCategoryTile:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private unfilteredFeedTiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    .line 68
    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    .line 52
    new-instance p1, Ljava/util/HashSet;

    const/4 p2, 0x3

    new-array p3, p2, [Ljava/lang/Integer;

    const/16 p5, 0x16

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    const/4 v0, 0x0

    aput-object p6, p3, v0

    const/16 p6, 0x41

    .line 53
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, p3, v2

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, p3, v4

    .line 52
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {p1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    .line 56
    new-instance p1, Ljava/util/HashSet;

    new-array p2, p2, [Ljava/lang/Integer;

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v0

    .line 57
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v4

    .line 56
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->headerTileTypes:Ljava/util/Set;

    .line 60
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->countIgnoredTileTypes:Ljava/util/Set;

    .line 70
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 71
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->unfilteredFeedTiles:Ljava/util/List;

    .line 72
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    .line 73
    iput-object p4, p0, Lcom/shopkick/app/products/ScansListAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    return-void
.end method

.method private getPositionsToRemove(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 236
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 237
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 238
    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/products/ScansListAdapter;->getPositionsToRemove(Ljava/util/Set;Ljava/util/List;)Ljava/util/HashSet;

    move-result-object p1

    return-object p1
.end method

.method private getPositionsToRemove(Ljava/util/Set;Ljava/util/List;)Ljava/util/HashSet;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 248
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 249
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    move v5, v2

    move v4, v3

    move v3, v5

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 250
    invoke-virtual {p0, v6}, Lcom/shopkick/app/products/ScansListAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v7

    if-eqz v7, :cond_1

    if-nez v3, :cond_0

    if-ltz v4, :cond_0

    .line 252
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    move v3, v2

    :goto_1
    move v4, v5

    goto :goto_2

    .line 257
    :cond_1
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-interface {p1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 258
    invoke-static {v6}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 259
    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 260
    :cond_3
    invoke-virtual {p0, v6}, Lcom/shopkick/app/products/ScansListAdapter;->isCountIgnoredTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v6

    if-nez v6, :cond_4

    add-int/lit8 v3, v3, 0x1

    :cond_4
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    if-ltz v4, :cond_6

    .line 268
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 271
    :cond_6
    iget-boolean p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->enableScanMission:Z

    if-eqz p1, :cond_7

    invoke-direct {p0, p2}, Lcom/shopkick/app/products/ScansListAdapter;->getScanMissionPositionsToRemove(Ljava/util/List;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    :cond_7
    return-object v0
.end method

.method private getScanMissionPositionsToRemove(Ljava/util/List;)Ljava/util/Set;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 278
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 279
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 285
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v6, v2

    move v4, v3

    move v5, v4

    move v7, v5

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 286
    invoke-direct {p0, v8, v4}, Lcom/shopkick/app/products/ScansListAdapter;->isOfferTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)Z

    move-result v9

    if-nez v9, :cond_0

    if-eqz v5, :cond_0

    if-eqz v6, :cond_0

    .line 289
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 291
    :cond_0
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/16 v10, 0x18

    if-ne v9, v10, :cond_1

    .line 296
    iget-object v4, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    .line 297
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 298
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v2

    move v6, v5

    goto :goto_1

    .line 299
    :cond_1
    invoke-direct {p0, v8, v4}, Lcom/shopkick/app/products/ScansListAdapter;->isOfferTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)Z

    move-result v9

    if-nez v9, :cond_2

    move v5, v3

    goto :goto_1

    :cond_2
    if-eqz v5, :cond_7

    .line 306
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/16 v10, 0x17

    if-ne v9, v10, :cond_3

    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_3

    move v6, v3

    goto :goto_1

    .line 311
    :cond_3
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/16 v11, 0xfa6

    if-ne v9, v11, :cond_7

    .line 316
    invoke-direct {p0, v8}, Lcom/shopkick/app/products/ScansListAdapter;->getSubTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 318
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 319
    iget-object v9, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v10, :cond_5

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-nez v8, :cond_4

    :cond_5
    move v6, v3

    goto :goto_1

    :cond_6
    move v6, v2

    :cond_7
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_8
    return-object v0
.end method

.method private getSubTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ")",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 386
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xfa6

    if-ne v0, v1, :cond_0

    .line 387
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    if-eqz p1, :cond_0

    .line 388
    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 389
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    .line 390
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private isOfferTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)Z
    .locals 2

    if-nez p2, :cond_0

    .line 381
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x17

    if-eq v0, v1, :cond_1

    :cond_0
    if-eqz p2, :cond_2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 382
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0xfa6

    if-ne p1, p2, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private removeAll(Ljava/util/Set;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 333
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 334
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 336
    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->configuratorMap:Ljava/util/HashMap;

    const/16 v1, 0x17

    .line 337
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    .line 338
    iget-object v2, p0, Lcom/shopkick/app/products/ScansListAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 339
    iget-object v4, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    iget-object v5, p0, Lcom/shopkick/app/products/ScansListAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v5}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    move v5, v2

    :goto_0
    if-gt v5, v4, :cond_4

    .line 343
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v3

    :cond_0
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    .line 344
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-le v5, v8, :cond_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 348
    :cond_1
    iget-object v6, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-lez v7, :cond_3

    .line 349
    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v1, :cond_3

    .line 350
    iget-object v8, p0, Lcom/shopkick/app/products/ScansListAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int v9, v5, v2

    invoke-virtual {v8, v9}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f090600

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 351
    iget-object v9, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-static {v6}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v9

    if-eqz v9, :cond_3

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 352
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_3

    .line 353
    :cond_2
    iget-object v6, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    sub-int v7, v5, v7

    invoke-virtual {p1, v8, v6, v7}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setupOpenKDOClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 358
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 359
    iget-object v1, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 360
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/ScansListAdapter;->notifyItemRemoved(I)V

    goto :goto_2

    :cond_5
    return-void
.end method

.method private resetPositionToCategoryTileMap()V
    .locals 5

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->moreScansTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 198
    iget-object v1, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 200
    iget-object v1, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 201
    invoke-virtual {p0, v3}, Lcom/shopkick/app/products/ScansListAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v0, v3

    .line 204
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v3, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private updateTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 224
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 226
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 227
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 228
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x17

    if-ne v2, v3, :cond_1

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 229
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 230
    invoke-interface {p2, v0, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public addTilesAtPosition(Ljava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;I)V"
        }
    .end annotation

    if-eqz p1, :cond_d

    .line 83
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->enableScanMission:Z

    .line 89
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 90
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v4, 0x18

    if-ne v2, v4, :cond_1

    .line 91
    iput-boolean v3, p0, Lcom/shopkick/app/products/ScansListAdapter;->enableScanMission:Z

    .line 96
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/products/ScansListAdapter;->unfilteredFeedTiles:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 100
    iget-boolean v2, p0, Lcom/shopkick/app/products/ScansListAdapter;->enableWidgetCategorization:Z

    if-nez v2, :cond_a

    .line 105
    iget-object v2, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v3

    :goto_0
    if-ltz v2, :cond_4

    .line 106
    iget-object v4, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 107
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    if-eqz v5, :cond_3

    .line 108
    iget-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, v3

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_4
    move v2, v0

    .line 113
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v2

    move v2, v0

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 114
    invoke-virtual {p0, v6}, Lcom/shopkick/app/products/ScansListAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v7

    if-eqz v7, :cond_6

    add-int/lit8 v2, v2, 0x1

    .line 117
    :cond_6
    iget-object v7, p0, Lcom/shopkick/app/products/ScansListAdapter;->supportedTileTypes:Ljava/util/Set;

    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 118
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansListAdapter;->getPositionIgnoredTileTypes()Ljava/util/Set;

    move-result-object v7

    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    add-int/lit8 v7, v5, 0x1

    .line 122
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    move v5, v7

    goto :goto_2

    .line 131
    :cond_7
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_8

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p0, v4}, Lcom/shopkick/app/products/ScansListAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v4

    if-nez v4, :cond_8

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 134
    :cond_8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_b

    if-ne v2, v3, :cond_b

    .line 135
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    const-string v2, "UNCATEGORIZED"

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 136
    :cond_9
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->moreScansTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    goto :goto_4

    .line 142
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->headerTileTypes:Ljava/util/Set;

    invoke-static {v0, v1, p1, v3}, Lcom/shopkick/app/util/TileUtils;->convertTilesToCategoryWidget(Lcom/shopkick/app/widget/WidgetDataSource;Ljava/util/ArrayList;Ljava/util/Set;Z)Ljava/util/ArrayList;

    move-result-object v1

    .line 148
    :cond_b
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v1}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 149
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansListAdapter;->resetPositionToCategoryTileMap()V

    .line 150
    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->dividerItemDecorationRule:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;

    if-eqz p1, :cond_c

    .line 151
    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->dividerItemDecorationRule:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;

    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-interface {p1, p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;->setDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/ArrayList;)V

    .line 153
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/products/ScansListAdapter;->notifyItemRangeInserted(II)V

    .line 154
    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/products/ScansListAdapter;->notifyItemRangeChanged(II)V

    return-void

    :cond_d
    :goto_5
    return-void
.end method

.method public clear()V
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->unfilteredFeedTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 161
    invoke-super {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->clear()V

    return-void
.end method

.method public getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 434
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object p1
.end method

.method public getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
    .locals 0

    .line 482
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p1

    return-object p1
.end method

.method public getFilteredTile(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getFilteredTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getFirstCategoryTile()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 440
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public getHeaderTileTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 413
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->headerTileTypes:Ljava/util/Set;

    return-object v0
.end method

.method public getItemViewType(I)I
    .locals 0

    .line 494
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method protected getPositionIgnoredTileTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    return-object v0
.end method

.method public getSKRecyclerView()Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    return-object v0
.end method

.method public getSectionPositionForProductFamilyId(Ljava/lang/String;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, -0x1

    move v2, v0

    move v3, v1

    .line 367
    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    .line 368
    iget-object v4, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 369
    invoke-virtual {p0, v4}, Lcom/shopkick/app/products/ScansListAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v3, v2

    .line 372
    :cond_0
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    move v1, v3

    :cond_3
    return v1
.end method

.method public isCountIgnoredTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 425
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->countIgnoredTileTypes:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->headerTileTypes:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isPositionIgnoredTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public numUnscannedScansInScanMission(Ljava/lang/String;)I
    .locals 6

    .line 457
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->unfilteredFeedTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez v1, :cond_1

    .line 458
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_0

    .line 461
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x17

    if-ne v4, v5, :cond_2

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 463
    :cond_2
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v5, :cond_0

    :cond_3
    return v2
.end method

.method public registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V
    .locals 0

    .line 488
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V

    return-void
.end method

.method public setCountIgnoredTileTypes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 409
    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->countIgnoredTileTypes:Ljava/util/Set;

    return-void
.end method

.method public setEnableWidgetCategorization(Z)V
    .locals 0

    .line 190
    iput-boolean p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->enableWidgetCategorization:Z

    return-void
.end method

.method public setHeaderTileTypes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 405
    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->headerTileTypes:Ljava/util/Set;

    return-void
.end method

.method public setPositionIgnoredTileTypes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 401
    iput-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    return-void
.end method

.method public setTiles(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->unfilteredFeedTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 184
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansListAdapter;->notifyDataSetChanged()V

    .line 186
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScansListAdapter;->addTiles(Ljava/util/List;)V

    return-void
.end method

.method public updateTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/products/ScansListAdapter;->updateTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->unfilteredFeedTiles:Ljava/util/List;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/products/ScansListAdapter;->updateTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 212
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->enableWidgetCategorization:Z

    if-eqz v0, :cond_1

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 214
    invoke-direct {p0, v1}, Lcom/shopkick/app/products/ScansListAdapter;->getSubTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 215
    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/products/ScansListAdapter;->updateTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    goto :goto_0

    .line 218
    :cond_1
    iget-boolean p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->enableScanMission:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/products/ScansListAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/ScansListAdapter;->getScanMissionPositionsToRemove(Ljava/util/List;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/ScansListAdapter;->removeAll(Ljava/util/Set;)V

    .line 219
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/products/ScansListAdapter;->resetPositionToCategoryTileMap()V

    .line 220
    invoke-virtual {p0}, Lcom/shopkick/app/products/ScansListAdapter;->notifyDataSetChanged()V

    return-void
.end method
