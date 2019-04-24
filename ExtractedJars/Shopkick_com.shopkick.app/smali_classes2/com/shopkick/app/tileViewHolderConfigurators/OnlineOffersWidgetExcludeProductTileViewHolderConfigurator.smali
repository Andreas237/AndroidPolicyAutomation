.class public Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetExcludeProductTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;
.source "OnlineOffersWidgetExcludeProductTileViewHolderConfigurator.java"


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-void
.end method


# virtual methods
.method protected fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;
    .locals 5

    .line 23
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetExcludeProductTileViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetExcludeProductTileViewHolderConfigurator;->getWidgetType()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 24
    instance-of v1, v0, Lcom/shopkick/fetchers/DataResponse;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/shopkick/fetchers/DataResponse;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 27
    iget-object v1, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    invoke-virtual {v1, v4}, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    move-result-object v1

    .line 28
    new-instance v2, Lcom/shopkick/fetchers/DataResponse;

    iget-boolean v3, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    invoke-virtual {v0}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v4

    iget v0, v0, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V

    .line 32
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 33
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 35
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_2
    return-object v2

    :cond_3
    return-object v0
.end method
