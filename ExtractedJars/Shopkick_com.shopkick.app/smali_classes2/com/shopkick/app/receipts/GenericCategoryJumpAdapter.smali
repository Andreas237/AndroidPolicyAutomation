.class public Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.source "GenericCategoryJumpAdapter.java"

# interfaces
.implements Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;
.implements Lcom/shopkick/app/products/JumpCapableAdapter;
.implements Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;,
        Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IScanJumpHeader;
    }
.end annotation


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

.field dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

.field private expandedPositions:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected headerTileTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private itemStateCallbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;",
            ">;"
        }
    .end annotation
.end field

.field private locationId:Ljava/lang/String;

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

.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
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
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Ljava/lang/String;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;",
            ")V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 155
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    .line 51
    new-instance p1, Ljava/util/HashSet;

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x51

    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x18

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, 0x52

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 51
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    .line 58
    new-instance p1, Ljava/util/HashSet;

    const/16 v0, 0x30

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->headerTileTypes:Ljava/util/Set;

    .line 61
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->countIgnoredTileTypes:Ljava/util/Set;

    .line 156
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->screenRef:Ljava/lang/ref/WeakReference;

    .line 157
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 158
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->unfilteredFeedTiles:Ljava/util/List;

    .line 159
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    .line 160
    iput-object p4, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 161
    iput-object p3, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->locationId:Ljava/lang/String;

    .line 162
    new-instance p1, Lcom/shopkick/app/receipts/KickbateItemDataSource;

    iget-object p2, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->locationId:Ljava/lang/String;

    iget-object p3, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {p1, p0, p2, p5, p3}, Lcom/shopkick/app/receipts/KickbateItemDataSource;-><init>(Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;Ljava/lang/String;Ljava/util/Collection;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    if-eqz p6, :cond_0

    .line 164
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    .line 166
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object p2, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 167
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->expandedPositions:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;",
            ")V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p6

    move-object v5, p7

    .line 179
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    .line 51
    new-instance p1, Ljava/util/HashSet;

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x51

    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x18

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, 0x52

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 51
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    .line 58
    new-instance p1, Ljava/util/HashSet;

    const/16 v0, 0x30

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->headerTileTypes:Ljava/util/Set;

    .line 61
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->countIgnoredTileTypes:Ljava/util/Set;

    .line 180
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->screenRef:Ljava/lang/ref/WeakReference;

    .line 181
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 182
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->unfilteredFeedTiles:Ljava/util/List;

    .line 183
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    .line 184
    iput-object p6, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 185
    new-instance p1, Lcom/shopkick/app/receipts/KickbateItemDataSource;

    iget-object v6, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v0, p1

    move-object v1, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/receipts/KickbateItemDataSource;-><init>(Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Collection;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    if-eqz p8, :cond_0

    .line 187
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    .line 189
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object p2, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 190
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->expandedPositions:Ljava/util/HashSet;

    return-void
.end method

.method private getPositionsToRemove(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 2
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

    .line 308
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 309
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/KickbateItemDataSource;->getSuffix()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 310
    iget-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getPositionsToRemove(Ljava/util/Set;Ljava/util/List;)Ljava/util/HashSet;

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

    .line 320
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 321
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, -0x1

    move v4, v1

    move v3, v2

    move v2, v4

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 322
    invoke-virtual {p0, v5}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v6

    if-eqz v6, :cond_1

    if-nez v2, :cond_0

    if-ltz v3, :cond_0

    .line 324
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_1
    move v3, v4

    goto :goto_2

    .line 329
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    invoke-virtual {v7}, Lcom/shopkick/app/receipts/KickbateItemDataSource;->getSuffix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 331
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 332
    :cond_2
    invoke-virtual {p0, v5}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isCountIgnoredTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v5

    if-nez v5, :cond_3

    add-int/lit8 v2, v2, 0x1

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    if-nez v2, :cond_5

    if-ltz v3, :cond_5

    .line 340
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v0
.end method

.method private removeAll(Ljava/util/Set;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 347
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 348
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 350
    iget-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->configuratorMap:Ljava/util/HashMap;

    const/16 v1, 0x17

    .line 351
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    .line 352
    iget-object v2, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v2

    .line 353
    iget-object v3, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v3

    move v4, v2

    :goto_0
    if-gt v4, v3, :cond_4

    const/4 v5, 0x0

    .line 357
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    .line 358
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-le v4, v7, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 362
    :cond_1
    iget-object v6, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-lez v5, :cond_3

    .line 363
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v1, :cond_3

    .line 364
    iget-object v7, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int v8, v4, v2

    invoke-virtual {v7, v8}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f090600

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 365
    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-static {v6}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 366
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_3

    .line 367
    :cond_2
    iget-object v6, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    sub-int v5, v4, v5

    invoke-virtual {p1, v7, v6, v5}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setupOpenKDOClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 372
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

    .line 373
    iget-object v1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 374
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->notifyItemRemoved(I)V

    goto :goto_2

    :cond_5
    return-void
.end method

.method private resetPositionToCategoryTileMap()V
    .locals 5

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 299
    invoke-virtual {p0, v3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v1, v3

    .line 302
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v3, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public addTilesAtPosition(Ljava/util/List;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;I)V"
        }
    .end annotation

    if-eqz p1, :cond_5

    .line 201
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->unfilteredFeedTiles:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 208
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 211
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 212
    invoke-virtual {p0, v4}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isPositionIgnoredTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v5

    if-nez v5, :cond_2

    add-int/lit8 v5, v3, 0x1

    .line 213
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    move v3, v5

    .line 215
    :cond_2
    iget-object v5, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->supportedTileTypes:Ljava/util/Set;

    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 216
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 223
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 224
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v1

    if-nez v1, :cond_4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 228
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, p2, p1}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 229
    invoke-direct {p0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->resetPositionToCategoryTileMap()V

    .line 230
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->notifyItemRangeInserted(II)V

    .line 231
    iget-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->notifyItemRangeChanged(II)V

    return-void

    :cond_5
    :goto_2
    return-void
.end method

.method public getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionToCategoryTile:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object p1
.end method

.method public getFilteredTile(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

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

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    return-object v0
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

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    return-object v0
.end method

.method public getSKRecyclerView()Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->skRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    return-object v0
.end method

.method public getStateForID(Ljava/lang/String;Z)Z
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;

    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;->toggle(Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isCountIgnoredTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->countIgnoredTileTypes:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isExpanded(I)Z
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->expandedPositions:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 400
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->headerTileTypes:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isPositionIgnoredTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isSelected(Ljava/lang/String;Z)Z
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;

    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;->isSelected(Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public maybeExpandOrCollapseMPR(I)V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->expandedPositions:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->expandedPositions:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->expandedPositions:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 110
    :goto_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->notifyItemChanged(I)V

    return-void
.end method

.method public numUnscannedScansInScanMission(Ljava/lang/String;)I
    .locals 6

    .line 425
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->unfilteredFeedTiles:Ljava/util/List;

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

    .line 426
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

    .line 429
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

    .line 431
    :cond_2
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v5, :cond_0

    :cond_3
    return v2
.end method

.method public pageLoaded(Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 66
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->setTiles(Ljava/util/List;)V

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    .line 68
    instance-of v0, p1, Lcom/shopkick/app/receipts/JumpCapableScreen;

    if-eqz v0, :cond_0

    .line 69
    check-cast p1, Lcom/shopkick/app/receipts/JumpCapableScreen;

    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-interface {p1, v0, p2}, Lcom/shopkick/app/receipts/JumpCapableScreen;->onTilesLoaded(Ljava/util/ArrayList;Ljava/util/HashMap;)V

    :cond_0
    return-void
.end method

.method public preSelectRetailerReceipt()V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;

    if-eqz v0, :cond_0

    .line 116
    invoke-interface {v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;->preSelectRetailerReceipt()V

    :cond_0
    return-void
.end method

.method public removeJumpHeaderTile()V
    .locals 3

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 123
    iget-object v1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 124
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, -0x28

    if-ne v1, v2, :cond_0

    .line 126
    iget-object v1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 127
    invoke-virtual {p0, v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->notifyItemRemoved(I)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public removeTilesAtPosition(II)V
    .locals 2

    if-ltz p1, :cond_3

    if-ltz p2, :cond_3

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, p1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    .line 247
    iget-object v1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_1

    goto :goto_1

    .line 250
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 254
    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->resetPositionToCategoryTileMap()V

    .line 255
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->notifyItemRangeRemoved(II)V

    .line 256
    iget-object p2, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, p1

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->notifyItemRangeChanged(II)V

    return-void

    :cond_3
    :goto_2
    return-void
.end method

.method public setCoordinate(Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/receipts/KickbateItemDataSource;->setCoordinate(Ljava/lang/Double;Ljava/lang/Double;)V

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

    .line 392
    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->countIgnoredTileTypes:Ljava/util/Set;

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

    .line 388
    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->headerTileTypes:Ljava/util/Set;

    return-void
.end method

.method public setItemStateCallbackRef(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;",
            ">;)V"
        }
    .end annotation

    .line 79
    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->itemStateCallbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public setLocationId(Ljava/lang/String;)V
    .locals 1

    .line 285
    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->locationId:Ljava/lang/String;

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->dataSource:Lcom/shopkick/app/receipts/KickbateItemDataSource;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/receipts/KickbateItemDataSource;->setLocation(Ljava/lang/String;)V

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

    .line 384
    iput-object p1, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->positionIgnoredTileTypes:Ljava/util/Set;

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

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->unfilteredFeedTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 278
    iget-object v0, p0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    if-eqz p1, :cond_0

    .line 280
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->addTiles(Ljava/util/List;)V

    :cond_0
    return-void
.end method
