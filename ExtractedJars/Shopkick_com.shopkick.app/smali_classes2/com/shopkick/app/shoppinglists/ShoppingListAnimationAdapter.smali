.class public Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;
.super Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;
.source "ShoppingListAnimationAdapter.java"


# instance fields
.field private categorizedTileMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
            ">;>;"
        }
    .end annotation
.end field

.field private chainId:Ljava/lang/String;

.field private converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

.field private footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private onItemTouchListener:Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private shoppingListId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)V
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
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;",
            "Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;",
            ")V"
        }
    .end annotation

    .line 49
    sget-object v7, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    .line 35
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    .line 57
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 58
    iput-object p7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    .line 59
    new-instance p1, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$1;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->onItemTouchListener:Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;

    .line 73
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->clear()V

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->animator:Landroid/support/v7/widget/DefaultItemAnimator;

    const-wide/16 p2, 0x96

    invoke-virtual {p1, p2, p3}, Landroid/support/v7/widget/DefaultItemAnimator;->setMoveDuration(J)V

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->animator:Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-virtual {p1, p2, p3}, Landroid/support/v7/widget/DefaultItemAnimator;->setAddDuration(J)V

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->animator:Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-virtual {p1, p2, p3}, Landroid/support/v7/widget/DefaultItemAnimator;->setRemoveDuration(J)V

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->onItemTouchListener:Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;

    invoke-virtual {p4, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addOnItemTouchListener(Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;)V

    const/16 p1, 0x3f8

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->setCallback(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ICollapseCategory;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)Landroid/support/v7/widget/DefaultItemAnimator;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->animator:Landroid/support/v7/widget/DefaultItemAnimator;

    return-object p0
.end method

.method private declared-synchronized cleanupCompletedSection(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Z
    .locals 9

    monitor-enter p0

    :try_start_0
    const-string v0, "clientTaxonomyIdCompleted"

    .line 421
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .line 424
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    const-string v5, "clientTaxonomyIdCompleted"

    invoke-virtual {v3, v4, v5}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v3

    .line 426
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 427
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getFirstEntryPosition()I

    move-result v5

    if-lt v4, v5, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v1

    .line 430
    :goto_1
    iget-object v6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "clientTaxonomyIdCompleted"

    .line 431
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_2

    .line 432
    :cond_3
    invoke-direct {p0, v7}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_2

    move v6, v2

    goto :goto_3

    :cond_4
    move v6, v1

    :goto_3
    if-eqz v6, :cond_5

    const/16 v6, 0xa

    .line 439
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    iput-object v6, v3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->verticalPadding:Ljava/lang/Integer;

    if-gez v4, :cond_a

    if-eqz v0, :cond_a

    .line 444
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getLastEntryPosition()I

    move-result v0

    add-int/2addr v0, v2

    .line 445
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getLastEntryPosition()I

    move-result v1

    :goto_5
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getFirstEntryPosition()I

    move-result v4

    if-lt v1, v4, :cond_9

    .line 446
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v4, :cond_6

    goto :goto_6

    .line 447
    :cond_6
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 448
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_6

    .line 451
    :cond_7
    iget-object v5, v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    if-eqz v5, :cond_8

    iget-object v4, v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    .line 452
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_8

    add-int/lit8 v0, v1, 0x1

    goto :goto_7

    :cond_8
    :goto_6
    add-int/lit8 v1, v1, -0x1

    goto :goto_5

    .line 458
    :cond_9
    :goto_7
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getFirstEntryPosition()I

    move-result p1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 459
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 460
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemInserted(I)V

    move v1, v2

    goto :goto_8

    .line 463
    :cond_a
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getFirstEntryPosition()I

    move-result p1

    if-lt v4, p1, :cond_b

    if-nez v0, :cond_b

    .line 464
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 465
    invoke-virtual {p0, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemRemoved(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_8

    :cond_b
    move v1, v5

    .line 469
    :goto_8
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
            ">;"
        }
    .end annotation

    .line 348
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 350
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 351
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private getEntryPosition(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I
    .locals 4

    .line 397
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "clientTaxonomyIdCompleted"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    iget-object v2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 399
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getTaxonomyId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v0

    .line 401
    :goto_0
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    const-string v2, "clientTaxonomyIdCompleted"

    .line 403
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 405
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLUtils$CompletedEntryTileInfoComparator;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    .line 406
    invoke-virtual {v2, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-direct {v0, v2}, Lcom/shopkick/app/shoppinglists/SLUtils$CompletedEntryTileInfoComparator;-><init>(Ljava/util/List;)V

    .line 405
    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_1

    .line 409
    :cond_1
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    .line 410
    invoke-virtual {v2, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-direct {v0, v2}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;-><init>(Ljava/util/List;)V

    .line 409
    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :goto_1
    if-eqz p1, :cond_2

    .line 413
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getFirstEntryPosition()I

    move-result p1

    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 414
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p1, p2

    return p1
.end method

.method private getEntryTile(Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 3

    .line 335
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 336
    instance-of v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v2, :cond_1

    goto :goto_0

    .line 338
    :cond_1
    check-cast v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 339
    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    .line 340
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private getFirstEntryPosition()I
    .locals 2

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getHeaderPosition(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
    .locals 5

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 362
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 363
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 364
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3f8

    if-ne v3, v4, :cond_1

    .line 365
    check-cast v2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 369
    :cond_2
    move-object v1, p1

    check-cast v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$2;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 389
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_3

    .line 390
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getFirstEntryPosition()I

    move-result p1

    return p1

    .line 391
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_4

    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getLastEntryPosition()I

    move-result p1

    return p1

    .line 392
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private getLastEntryPosition()I
    .locals 4

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sub-int/2addr v0, v1

    return v0
.end method

.method public static synthetic lambda$refreshAfterAnimation$221(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V
    .locals 2

    .line 543
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->animator:Landroid/support/v7/widget/DefaultItemAnimator;

    new-instance v1, Lcom/shopkick/app/shoppinglists/-$$Lambda$hdRXkxfb0xgiZ51h5QzVV7KRR_I;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$hdRXkxfb0xgiZ51h5QzVV7KRR_I;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/DefaultItemAnimator;->isRunning(Landroid/support/v7/widget/RecyclerView$ItemAnimator$ItemAnimatorFinishedListener;)Z

    return-void
.end method

.method private refreshAfterAnimation()V
    .locals 4

    .line 538
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 539
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 542
    new-instance v1, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListAnimationAdapter$S5nkoMmzdkHeLtIYm4IpXC8N4o0;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListAnimationAdapter$S5nkoMmzdkHeLtIYm4IpXC8N4o0;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method private updateTiles(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V
    .locals 9

    const-string v0, "clientTaxonomyIdCompleted"

    .line 474
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 477
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 478
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isLinked:Ljava/lang/Boolean;

    .line 479
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemChanged(I)V

    :cond_0
    const/4 v1, 0x0

    .line 484
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 485
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 486
    instance-of v6, v5, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v6, :cond_2

    goto :goto_0

    .line 490
    :cond_2
    check-cast v5, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 493
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_0

    .line 497
    :cond_3
    iget-object v6, v5, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 499
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    if-nez v7, :cond_4

    goto :goto_0

    .line 503
    :cond_4
    iget-object v7, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-static {v7}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_6

    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v8, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 504
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 507
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 509
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5
    move-object v1, v5

    goto :goto_0

    .line 511
    :cond_6
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-static {v7}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_7

    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    iget-object v8, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 514
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 515
    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    move-object v1, p1

    goto :goto_0

    .line 518
    :cond_7
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-static {v7}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    iget-object v7, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 521
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 522
    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 524
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 530
    :cond_8
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v1, :cond_9

    const/4 v3, 0x1

    goto :goto_2

    :cond_9
    move v3, v2

    .line 531
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isLinked:Ljava/lang/Boolean;

    .line 532
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemChanged(I)V

    goto :goto_1

    :cond_a
    return-void
.end method


# virtual methods
.method public addTiles(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 157
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 158
    instance-of v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v2, :cond_2

    goto :goto_0

    .line 160
    :cond_2
    check-cast v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 161
    iget-object v2, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v2, :cond_3

    goto :goto_0

    .line 163
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    iget-object v4, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getTaxonomyId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_0

    .line 166
    :cond_4
    iget-object v3, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3f8

    if-eq v3, v4, :cond_1

    .line 168
    iget-object v3, v1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    const-string v2, "clientTaxonomyIdCompleted"

    .line 170
    :cond_5
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-nez v3, :cond_6

    .line 172
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 173
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    :cond_6
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 179
    :cond_7
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 182
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_8

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    return-void
.end method

.method public clear()V
    .locals 3

    .line 131
    invoke-super {p0}, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->clear()V

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    const-string v1, "clientTaxonomyIdCompleted"

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public clearCompletedEntries()V
    .locals 4

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    const-string v2, "clientTaxonomyIdCompleted"

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    .line 224
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 226
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getLastEntryPosition()I

    move-result v1

    move v2, v1

    :goto_0
    if-lt v2, v0, :cond_0

    .line 228
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    .line 230
    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemRangeRemoved(II)V

    .line 233
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->refreshAfterAnimation()V

    return-void
.end method

.method public deleteEntry(Ljava/lang/String;)V
    .locals 4

    .line 188
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getEntryTile(Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 192
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string v0, "clientTaxonomyIdCompleted"

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    iget-object v2, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 194
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getTaxonomyId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v0

    .line 195
    :goto_0
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 196
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 199
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->cleanupCompletedSection(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Z

    .line 202
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 203
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 204
    invoke-virtual {p0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemRemoved(I)V

    const-string v2, "clientTaxonomyIdCompleted"

    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 208
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_2

    .line 210
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 211
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemRemoved(I)V

    .line 215
    :cond_2
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->updateTiles(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    .line 216
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->refreshAfterAnimation()V

    return-void
.end method

.method public destroy()V
    .locals 2

    .line 141
    invoke-super {p0}, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->destroy()V

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    .line 143
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz v0, :cond_0

    .line 146
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->onItemTouchListener:Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeOnItemTouchListener(Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;)V

    :cond_0
    return-void
.end method

.method public refresh()V
    .locals 6

    .line 124
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->clear()V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v1

    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->chainId:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->convert(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;ZZZLjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->addTiles(Ljava/util/List;)V

    return-void
.end method

.method public setChainId(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->chainId:Ljava/lang/String;

    return-void
.end method

.method public setCompleted(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    iget-object v2, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getTaxonomyId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v0

    .line 252
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->categorizedTileMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    const-string v2, "clientTaxonomyIdCompleted"

    .line 254
    invoke-direct {p0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 255
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 256
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->cleanupCompletedSection(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Z

    move-result v2

    .line 262
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, 0x0

    .line 263
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 264
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 265
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    const-string v6, "clientTaxonomyIdCompleted"

    invoke-virtual {v2, v5, v6}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    :goto_0
    invoke-direct {p0, v2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getEntryPosition(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I

    move-result v2

    invoke-virtual {v4, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 267
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {p0, v3, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemMoved(II)V

    .line 270
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 271
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_2

    .line 273
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 274
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemRemoved(I)V

    .line 278
    :cond_2
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->updateTiles(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    return-void
.end method

.method public setPadding(II)V
    .locals 4

    const/16 v0, 0x403

    const/4 v1, 0x0

    if-lez p1, :cond_1

    .line 97
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez v2, :cond_0

    .line 98
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 99
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 100
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->height:Ljava/lang/Integer;

    goto :goto_0

    .line 104
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 105
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->headerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    :goto_0
    if-lez p2, :cond_3

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez p1, :cond_2

    .line 110
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 111
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 112
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 114
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->height:Ljava/lang/Integer;

    goto :goto_1

    .line 116
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 117
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->footerPaddingTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 120
    :goto_1
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setShoppingListId(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    return-void
.end method

.method public setUncompleted(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    iget-object v2, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getTaxonomyId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v0

    .line 287
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    const-string v2, "clientTaxonomyIdCompleted"

    .line 289
    invoke-direct {p0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getCategorizedTileList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 290
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 291
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->cleanupCompletedSection(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Z

    .line 298
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->getHeaderTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    .line 299
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 300
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getHeaderPosition(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result v1

    .line 301
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 302
    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemInserted(I)V

    .line 306
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 307
    iget-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    iput-object v2, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 308
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 311
    iget-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 312
    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemRemoved(I)V

    goto :goto_0

    .line 314
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getEntryPosition(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I

    move-result v0

    invoke-virtual {v2, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->notifyItemMoved(II)V

    .line 318
    :goto_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->updateTiles(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    return-void
.end method

.method public toggleCompleted(Ljava/lang/String;Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 240
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getEntryTile(Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->setCompleted(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    goto :goto_0

    .line 242
    :cond_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getEntryTile(Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->setUncompleted(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    .line 244
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->refreshAfterAnimation()V

    return-void
.end method
