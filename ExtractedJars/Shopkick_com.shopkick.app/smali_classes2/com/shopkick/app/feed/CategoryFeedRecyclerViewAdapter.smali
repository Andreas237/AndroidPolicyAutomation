.class public Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;
.super Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
.source "CategoryFeedRecyclerViewAdapter.java"

# interfaces
.implements Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ICollapseCategory;


# instance fields
.field protected animator:Landroid/support/v7/widget/DefaultItemAnimator;

.field protected detachedTiles:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V
    .locals 0
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
            "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;",
            ")V"
        }
    .end annotation

    .line 30
    invoke-direct/range {p0 .. p7}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    .line 21
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->detachedTiles:Ljava/util/HashMap;

    .line 38
    new-instance p1, Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-direct {p1}, Landroid/support/v7/widget/DefaultItemAnimator;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->animator:Landroid/support/v7/widget/DefaultItemAnimator;

    .line 39
    iget-object p1, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->animator:Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-virtual {p4, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    return-void
.end method


# virtual methods
.method public addTilesAtPosition(Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;I)V"
        }
    .end annotation

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v2

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 49
    instance-of v5, v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v5, :cond_1

    goto :goto_0

    .line 51
    :cond_1
    check-cast v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 52
    iget-object v5, v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    move-object v3, v2

    goto :goto_0

    .line 54
    :pswitch_0
    iget-object v3, v4, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 56
    iget-object v3, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->detachedTiles:Ljava/util/HashMap;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v4

    goto :goto_0

    .line 59
    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->detachedTiles:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v2

    goto :goto_0

    :pswitch_1
    if-eqz v3, :cond_0

    .line 67
    iget-object v5, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->detachedTiles:Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 77
    :cond_3
    invoke-interface {p1, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 79
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->addTilesAtPosition(Ljava/util/List;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3f7
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public clear()V
    .locals 1

    .line 84
    invoke-super {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->clear()V

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->detachedTiles:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public collapseCategory(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;I)V
    .locals 7

    const/4 v0, 0x1

    add-int/2addr p2, v0

    const/high16 v1, -0x80000000

    move v2, v1

    move v1, p2

    .line 99
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 100
    invoke-virtual {p0, v1}, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    .line 101
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x3f7

    if-eq v4, v5, :cond_0

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x3fa

    if-eq v4, v5, :cond_0

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 102
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x3f9

    if-eq v4, v5, :cond_0

    goto :goto_1

    .line 104
    :cond_0
    check-cast v3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 105
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    add-int/lit8 v2, v1, 0x1

    move v6, v2

    move v2, v1

    move v1, v6

    goto :goto_0

    :cond_1
    :goto_1
    if-gez v2, :cond_2

    return-void

    .line 111
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 113
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    add-int/2addr v2, v0

    invoke-virtual {v3, p2, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->detachedTiles:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 116
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->notifyItemRangeRemoved(II)V

    return-void
.end method

.method public expandCategory(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;I)V
    .locals 4

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->detachedTiles:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 125
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 126
    check-cast v2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 127
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    goto :goto_0

    .line 130
    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isCollapsed:Ljava/lang/Boolean;

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 132
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/feed/CategoryFeedRecyclerViewAdapter;->notifyItemRangeInserted(II)V

    return-void
.end method
