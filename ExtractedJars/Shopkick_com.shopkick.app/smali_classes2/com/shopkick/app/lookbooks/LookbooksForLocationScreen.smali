.class public Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "LookbooksForLocationScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private locationId:Ljava/lang/String;

.field private locationName:Ljava/lang/String;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldRefresh:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private setScreenTitle(Ljava/lang/String;)V
    .locals 2

    .line 84
    iput-object p1, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->locationName:Ljava/lang/String;

    const/4 v0, 0x1

    .line 85
    new-array v0, v0, [Ljava/lang/Object;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f1106e9

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->setAppScreenTitle(Ljava/lang/String;)V

    return-void
.end method

.method private setupForRecyclerView()V
    .locals 10

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 72
    new-instance v8, Ljava/util/HashSet;

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/16 v2, 0x1c

    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/16 v2, 0x3ed

    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const/4 v2, -0x1

    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, -0x2

    .line 76
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 72
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 78
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v4, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v9, 0x0

    move-object v3, v0

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0119

    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09059a

    .line 49
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const p2, 0x7f090628

    .line 50
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->setupForRecyclerView()V

    .line 52
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->locationName:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->setScreenTitle(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 53
    iput-boolean p2, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->shouldRefresh:Z

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 95
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationRequest;-><init>()V

    .line 96
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->locationId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationRequest;->locationId:Ljava/lang/String;

    .line 97
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationRequest;->previousPageKey:Ljava/lang/String;

    return-object v0
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

    const-string p1, "location_id"

    .line 42
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->locationId:Ljava/lang/String;

    const-string p1, "chain_name"

    .line 43
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->locationName:Ljava/lang/String;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 60
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 65
    iget-boolean v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->shouldRefresh:Z

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    :cond_0
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 4

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 104
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 105
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 106
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationResponse;

    .line 107
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 108
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationResponse;->pageKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 109
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationResponse;->chainName:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 110
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationResponse;->chainName:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->setScreenTitle(Ljava/lang/String;)V

    .line 111
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationRequest;->previousPageKey:Ljava/lang/String;

    if-nez p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationResponse;->storyTiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 113
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const p1, 0x7f1103d8

    const/4 v1, 0x1

    .line 114
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationResponse;->chainName:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->noContentMessage:Ljava/lang/String;

    .line 118
    :cond_0
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesForLocationResponse;->storyTiles:Ljava/util/List;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 119
    iput-boolean v2, p0, Lcom/shopkick/app/lookbooks/LookbooksForLocationScreen;->shouldRefresh:Z

    goto :goto_0

    .line 121
    :cond_1
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    :goto_0
    return-object v0
.end method
