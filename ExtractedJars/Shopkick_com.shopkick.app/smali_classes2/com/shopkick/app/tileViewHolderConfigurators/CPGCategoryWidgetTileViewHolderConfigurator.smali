.class public Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;
.source "CPGCategoryWidgetTileViewHolderConfigurator.java"


# instance fields
.field private RECYCLER_VIEW_HEIGHT:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    const/16 p1, 0xfc

    .line 23
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->RECYCLER_VIEW_HEIGHT:I

    return-void
.end method


# virtual methods
.method protected fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;
    .locals 4

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->getWidgetType()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 122
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

    const v0, 0x7f0c008b

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

    .line 49
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method protected bridge synthetic getSupportedTileTypes()Ljava/util/Set;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public getWidgetType()I
    .locals 1

    const/16 v0, 0xfa6

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 38
    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->RECYCLER_VIEW_HEIGHT:I

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->setRecyclerViewHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    .line 39
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method protected updateList(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 7

    .line 55
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const v3, 0x7f09009a

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 56
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 61
    :goto_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->getAdapter(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    .line 63
    iget-boolean v3, p3, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v3, :cond_a

    iget-object v3, p3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v3, :cond_1

    goto/16 :goto_4

    .line 71
    :cond_1
    iget-object v3, p3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;

    if-eqz v3, :cond_8

    .line 72
    iget-object p3, p3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;

    .line 73
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 76
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 77
    iget-object v5, p3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->tiles:Ljava/util/List;

    if-eqz v5, :cond_2

    .line 78
    iget-object v5, p3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->tiles:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 80
    :cond_2
    iget-object v5, p3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->nonCpgTiles:Ljava/util/List;

    if-eqz v5, :cond_3

    .line 81
    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;->nonCpgTiles:Ljava/util/List;

    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 85
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_7

    .line 88
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 89
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x2f

    if-ne v5, v6, :cond_6

    .line 93
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    if-eqz v5, :cond_5

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 94
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v2, v1

    goto :goto_1

    :cond_5
    if-eqz v2, :cond_4

    goto :goto_2

    :cond_6
    if-eqz v2, :cond_4

    .line 100
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x17

    if-ne v5, v6, :cond_4

    .line 101
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 105
    :cond_7
    :goto_2
    invoke-virtual {p0, v0, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->addTiles(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/List;)V

    goto :goto_3

    .line 107
    :cond_8
    iget-object p2, p3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    if-eqz p2, :cond_9

    .line 109
    iget-object p2, p3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    .line 110
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;->tiles:Ljava/util/List;

    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->addTiles(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/List;)V

    .line 113
    :cond_9
    :goto_3
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result p2

    if-nez p2, :cond_b

    .line 114
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    goto :goto_5

    .line 65
    :cond_a
    :goto_4
    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->getWidgetType()I

    move-result v1

    invoke-virtual {p3, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I)V

    .line 66
    new-instance p3, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;

    invoke-direct {p3, p0, p1, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p0, v0, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;->addReloadTile(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V

    :cond_b
    :goto_5
    return-void
.end method
