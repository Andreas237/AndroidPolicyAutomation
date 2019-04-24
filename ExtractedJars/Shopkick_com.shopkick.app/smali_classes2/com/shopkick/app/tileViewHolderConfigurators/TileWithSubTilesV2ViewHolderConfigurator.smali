.class public Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;
.source "TileWithSubTilesV2ViewHolderConfigurator.java"


# instance fields
.field protected displayedTiles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    .line 42
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->displayedTiles:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method protected fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected getSupportedTileTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 74
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getWidgetType()I
    .locals 1

    const/16 v0, 0xfa9

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 47
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 48
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->getAdapter(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 53
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 54
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->displayedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const v2, 0x7f090628

    if-eqz v1, :cond_1

    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->getSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 55
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->displayedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->displayedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    goto :goto_0

    .line 62
    :cond_2
    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->getSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public setTiles(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/Set;

    move-result-object v0

    .line 84
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 85
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 86
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->getWidgetType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 87
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->displayedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method
