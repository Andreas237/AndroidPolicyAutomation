.class public Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;
.source "OnlineOffersWidgetTileViewHolderConfigurator.java"


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-void
.end method


# virtual methods
.method protected fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/Object;

    move-result-object p1

    .line 87
    instance-of v0, p1, Lcom/shopkick/fetchers/DataResponse;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0093

    return v0
.end method

.method protected getSupportedTileTypes()Ljava/util/HashSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 81
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method protected bridge synthetic getSupportedTileTypes()Ljava/util/Set;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public getWidgetType()I
    .locals 1

    const/16 v0, 0xfa5

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 36
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 39
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->getAdapter(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 43
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    const v1, 0x7f090628

    if-nez v0, :cond_1

    .line 45
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 49
    :cond_1
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->updateList(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method protected updateList(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 54
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->getAdapter(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    .line 56
    iget-boolean v1, p3, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_2

    iget-object v1, p3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v1, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    iget-object p2, p3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    .line 64
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    if-eqz p3, :cond_1

    .line 65
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->addTiles(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/List;)V

    .line 68
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result p2

    if-nez p2, :cond_3

    .line 69
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->getWidgetType()I

    move-result v1

    invoke-virtual {p3, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I)V

    .line 59
    new-instance p3, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;

    invoke-direct {p3, p0, p1, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p0, v0, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->addReloadTile(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V

    :cond_3
    :goto_1
    return-void
.end method
