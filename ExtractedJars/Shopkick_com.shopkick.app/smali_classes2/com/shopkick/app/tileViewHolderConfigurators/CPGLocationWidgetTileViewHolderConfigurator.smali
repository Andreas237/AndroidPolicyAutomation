.class public Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;
.source "CPGLocationWidgetTileViewHolderConfigurator.java"


# instance fields
.field private final RECYCLER_VIEW_HEIGHT:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    const/16 p1, 0xfc

    .line 22
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->RECYCLER_VIEW_HEIGHT:I

    return-void
.end method


# virtual methods
.method protected fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;
    .locals 9

    .line 83
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "ENABLE_SEE_ALL_LINK_CPGLOCATIONFEED_REQUEST"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v2, "ENABLE_SEE_ALL_LINK_CPGLOCATIONFEED_REQUEST"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 86
    :goto_0
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x3

    if-nez v2, :cond_1

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    if-eqz v2, :cond_1

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    if-eqz v2, :cond_1

    .line 87
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->getWidgetType()I

    move-result v6

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    iget-object v8, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    aput-object v8, v7, v1

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    aput-object v1, v7, v4

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    aput-object p1, v7, v3

    .line 88
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v7, v5

    .line 87
    invoke-virtual {v2, v6, v7}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    .line 90
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->getWidgetType()I

    move-result v6

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v7, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    aput-object v7, v5, v1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    aput-object p1, v5, v4

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v5, v3

    invoke-virtual {v2, v6, v5}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 92
    :goto_1
    instance-of v0, p1, Lcom/shopkick/fetchers/DataResponse;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1
.end method

.method protected getSupportedTileTypes()Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 75
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v2, 0x17

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x43

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 75
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method protected bridge synthetic getSupportedTileTypes()Ljava/util/Set;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public getWidgetType()I
    .locals 1

    const/16 v0, 0xfa1

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    .line 35
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const/16 v0, 0xfc

    .line 38
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->setRecyclerViewHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    .line 41
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->getAdapter(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 45
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v1

    const v2, 0x7f090628

    if-nez v1, :cond_1

    .line 47
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 51
    :cond_1
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 53
    iget-boolean v2, v1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v2, :cond_2

    goto :goto_0

    .line 59
    :cond_2
    iget-object p2, v1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;

    .line 60
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;->tiles:Ljava/util/List;

    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->addTiles(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/List;)V

    .line 62
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result p2

    if-nez p2, :cond_4

    .line 63
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->getWidgetType()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I)V

    .line 56
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;->addReloadTile(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V

    :cond_4
    :goto_1
    return-void
.end method
