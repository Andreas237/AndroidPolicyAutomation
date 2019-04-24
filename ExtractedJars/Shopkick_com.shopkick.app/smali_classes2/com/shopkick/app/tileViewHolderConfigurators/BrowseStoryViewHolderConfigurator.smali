.class public Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;
.source "BrowseStoryViewHolderConfigurator.java"


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-void
.end method


# virtual methods
.method protected getConfiguratorToMeasure(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;
    .locals 1

    .line 55
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;->getAdapter(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object p1

    const/16 v0, 0x4d

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;

    return-object p1
.end method

.method protected getMaxSubtileHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
    .locals 3

    .line 41
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;->getConfiguratorToMeasure(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;

    move-result-object p1

    const/high16 v0, -0x80000000

    if-eqz p1, :cond_2

    .line 44
    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->getSubtiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 45
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {p1, v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;->getHeight(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result v1

    if-le v1, v0, :cond_0

    move v0, v1

    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;->clearMeasurement()V

    :cond_2
    return v0
.end method

.method protected getSupportedTileTypes()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 65
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v2, 0x4d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x4c

    .line 66
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/16 v2, 0x4b

    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 65
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getWidgetType()I
    .locals 1

    const/16 v0, 0xfab

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 24
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 27
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->height:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;->getMaxSubtileHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result v0

    if-lez v0, :cond_1

    .line 30
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/FrameConfigurator;->dipDimension(ILandroid/view/View;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->height:Ljava/lang/Integer;

    .line 31
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->height:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;->setRecyclerViewHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    goto :goto_0

    .line 35
    :cond_0
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->height:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;->setRecyclerViewHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    :cond_1
    :goto_0
    return-void
.end method
