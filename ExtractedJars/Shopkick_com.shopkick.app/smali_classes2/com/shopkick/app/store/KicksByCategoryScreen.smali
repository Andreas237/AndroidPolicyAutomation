.class public Lcom/shopkick/app/store/KicksByCategoryScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "KicksByCategoryScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private chainId:Ljava/lang/String;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private loadingSpinner:Landroid/view/View;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method public static synthetic lambda$processResponse$235(Lcom/shopkick/app/store/KicksByCategoryScreen;)V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addReloadTile()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const p3, 0x7f11038f

    .line 59
    invoke-virtual {p0, p3}, Lcom/shopkick/app/store/KicksByCategoryScreen;->setAppScreenTitle(I)V

    const/4 p3, 0x0

    const v0, 0x7f0c0103

    .line 60
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090434

    .line 61
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->loadingSpinner:Landroid/view/View;

    const p2, 0x7f09059a

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 63
    iget-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/store/KicksByCategoryScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 65
    new-instance v7, Ljava/util/HashSet;

    const/4 p2, 0x3

    new-array p2, p2, [Ljava/lang/Integer;

    const/16 v0, 0x55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, p3

    const/16 p3, -0xd

    .line 66
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x1

    aput-object p3, p2, v0

    const/4 p3, -0x2

    .line 67
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x2

    aput-object p3, p2, v0

    .line 65
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v7, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 68
    new-instance p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v3, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v8, 0x0

    move-object v2, p2

    move-object v4, p0

    move-object v5, p0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 74
    iget-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 75
    iget-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p3, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 90
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreKicksByCategoryRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreKicksByCategoryRequest;-><init>()V

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->chainId:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreKicksByCategoryRequest;->chainId:Ljava/lang/String;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 45
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const-string p1, "chain_id"

    .line 46
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->chainId:Ljava/lang/String;

    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->loadingSpinner:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    :cond_0
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 2

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->loadingSpinner:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 98
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 100
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreKicksByCategoryResponse;

    .line 114
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 115
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreKicksByCategoryResponse;->tiles:Ljava/util/List;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 118
    iget-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    if-eqz p2, :cond_3

    iget-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    .line 119
    iget-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    goto :goto_1

    .line 101
    :cond_1
    :goto_0
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 102
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    .line 103
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 104
    iget-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/store/-$$Lambda$KicksByCategoryScreen$oTGbDeP3PUqfhjyDIOUNt9pdvMA;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/-$$Lambda$KicksByCategoryScreen$oTGbDeP3PUqfhjyDIOUNt9pdvMA;-><init>(Lcom/shopkick/app/store/KicksByCategoryScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 107
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v0, 0x7f110155

    .line 108
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/KicksByCategoryScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1102b4

    .line 109
    invoke-virtual {p0, v1}, Lcom/shopkick/app/store/KicksByCategoryScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 107
    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_3
    :goto_1
    return-object p1
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 51
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->chainId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/store/KicksByCategoryScreen;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
