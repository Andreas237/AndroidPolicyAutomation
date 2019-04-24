.class public Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.source "DataFeedRecyclerViewAdapter.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IDataFetcherCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;,
        Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;
    }
.end annotation


# instance fields
.field private bucketSizeInMeters:I

.field protected dataCallbackWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;",
            ">;"
        }
    .end annotation
.end field

.field private dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

.field private fetcherType:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

.field private savedDataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;


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

    .line 51
    invoke-direct/range {p0 .. p6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    .line 52
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataCallbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 53
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isGPSFailbackForStoresEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    if-ne p7, p2, :cond_0

    .line 55
    sget-object p2, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    iput-object p2, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetcherType:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    goto :goto_0

    .line 57
    :cond_0
    iput-object p7, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetcherType:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    .line 59
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetcherType:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    sget-object p3, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    if-ne p2, p3, :cond_1

    .line 60
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->gpsFailbackBucketSizeInMeters:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->bucketSizeInMeters:I

    :cond_1
    return-void
.end method

.method private fetchMoreData(Z)V
    .locals 9

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    if-eqz v0, :cond_0

    return-void

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    if-nez v0, :cond_3

    .line 162
    sget-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$1;->$SwitchMap$com$shopkick$app$feed$DataFeedRecyclerViewAdapter$DataFetcherType:[I

    iget-object v1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetcherType:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 182
    :pswitch_0
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;

    invoke-interface {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;->getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v4

    if-nez v4, :cond_1

    return-void

    .line 189
    :cond_1
    new-instance v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v6, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget v1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->bucketSizeInMeters:I

    int-to-double v7, v1

    move-object v2, v0

    move-object v5, p0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;-><init>(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IDataFetcherCallback;Lcom/shopkick/fetchers/api/APIManager;D)V

    iput-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    goto :goto_0

    .line 166
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;

    invoke-interface {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;->getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v4

    if-nez v4, :cond_2

    return-void

    .line 173
    :cond_2
    new-instance v0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v6, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object v2, v0

    move-object v5, p0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;-><init>(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IDataFetcherCallback;Lcom/shopkick/fetchers/api/APIManager;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/cache/CachePriority;)V

    iput-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    .line 198
    :cond_3
    :goto_0
    :pswitch_2
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    if-nez v0, :cond_4

    .line 200
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage(Z)V

    goto :goto_1

    .line 202
    :cond_4
    invoke-interface {v0}, Lcom/shopkick/fetchers/api/IDataFetcher;->fetchMore()V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected cancelCurrentRequest()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/shopkick/fetchers/api/IDataFetcher;->isFetching()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    invoke-interface {v0}, Lcom/shopkick/fetchers/api/IDataFetcher;->cancel()V

    .line 94
    iput-object v1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    .line 96
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->savedDataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    .line 97
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->cancelCurrentRequest()V

    return-void
.end method

.method public clear()V
    .locals 0

    .line 102
    invoke-virtual {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->cancelCurrentRequest()V

    .line 103
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    if-eqz v0, :cond_0

    .line 67
    invoke-interface {v0}, Lcom/shopkick/fetchers/api/IDataFetcher;->cancel()V

    .line 69
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    return-void
.end method

.method public fetchNextPage(Z)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->setIsAutoFetch(Z)V

    .line 129
    invoke-virtual {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getIsAutoFetch()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetchMoreData(Z)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method protected handlePageResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)V
    .locals 3

    .line 207
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->savedDataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    if-eqz v0, :cond_1

    .line 232
    iput-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    .line 233
    iput-object v2, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->savedDataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    .line 236
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getIsAutoFetch()Z

    move-result v0

    if-nez v0, :cond_7

    .line 237
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_2

    .line 238
    invoke-virtual {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->addReloadTile()V

    goto :goto_1

    .line 239
    :cond_2
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_3

    .line 240
    invoke-virtual {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->addOfflineEducationTile()V

    goto :goto_1

    .line 241
    :cond_3
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_7

    .line 242
    iget-object p1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->noContentMessage:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->addNoContentTile(Ljava/lang/String;)V

    goto :goto_1

    .line 209
    :cond_4
    :goto_0
    iput-object v2, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->savedDataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    .line 211
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_5

    .line 214
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 217
    :cond_5
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    .line 220
    invoke-virtual {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getIsAutoFetch()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 221
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 222
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x1

    .line 223
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 224
    iget-object v1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_6
    iget-object p1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public isDisplayingFailback()Z
    .locals 3

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isGPSFailbackForStoresEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetcherType:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    sget-object v2, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    if-ne v0, v2, :cond_2

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    check-cast v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->getMode()Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    move-result-object v0

    sget-object v2, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Offline:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    if-ne v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    return v1
.end method

.method protected isFetching()Z
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    if-eqz v0, :cond_0

    .line 82
    invoke-interface {v0}, Lcom/shopkick/fetchers/api/IDataFetcher;->isFetching()Z

    move-result v0

    return v0

    .line 84
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->isFetching()Z

    move-result v0

    return v0
.end method

.method public onPostFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 142
    iget-object p1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    .line 145
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;

    invoke-interface {p1, p2, p3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;->processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    move-result-object p1

    .line 148
    iget-boolean p2, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->shouldSavePageResponse:Z

    if-eqz p2, :cond_1

    .line 149
    iput-object p1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    goto :goto_0

    .line 151
    :cond_1
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->handlePageResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public onPreFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataCallbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 136
    iget-object p1, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataCallbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;

    invoke-interface {p1, p0, p2}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;->onPreFetch(Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    :cond_0
    return-void
.end method

.method public tryRefreshWithoutClear()V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetcherType:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    sget-object v1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->None:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    if-ne v0, v1, :cond_1

    .line 112
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    goto :goto_0

    .line 114
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    if-eqz v0, :cond_2

    .line 115
    invoke-interface {v0}, Lcom/shopkick/fetchers/api/IDataFetcher;->cancel()V

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    iput-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->savedDataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    :cond_2
    const/4 v0, 0x0

    .line 119
    invoke-direct {p0, v0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->fetchMoreData(Z)V

    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public unregisterImageController()V
    .locals 1

    .line 74
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->unregisterImageController()V

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->dataFetcher:Lcom/shopkick/fetchers/api/IDataFetcher;

    if-eqz v0, :cond_0

    .line 76
    invoke-interface {v0}, Lcom/shopkick/fetchers/api/IDataFetcher;->cancel()V

    :cond_0
    return-void
.end method
