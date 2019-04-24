.class public Lcom/shopkick/app/saves/SavesScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "SavesScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field protected static final HEADER_TILE_TOP_PADDING:I = 0xf


# instance fields
.field private savedCollectionChanged:Z

.field private savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

.field private targetUserId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private updateSavedCollection()V
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/saves/SavesScreenAdapter;->savedCollectionUpdated()V

    const/4 v0, 0x0

    .line 142
    iput-boolean v0, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionChanged:Z

    return-void
.end method


# virtual methods
.method protected createNoSavesTile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 1

    .line 132
    new-instance p3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {p3}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    const/16 v0, -0x19

    .line 134
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    .line 135
    iput-object p1, p3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->header:Ljava/lang/String;

    .line 136
    iput-object p2, p3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->message:Ljava/lang/String;

    return-object p3
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const p3, 0x7f110609

    .line 51
    invoke-virtual {p0, p3}, Lcom/shopkick/app/saves/SavesScreen;->setAppScreenTitle(I)V

    const/4 p3, 0x0

    const v0, 0x7f0c0192

    .line 52
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09059a

    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 57
    new-instance v5, Ljava/util/HashSet;

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, p3

    const/16 p3, 0x1c

    .line 58
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v2, 0x1

    aput-object p3, v0, v2

    const/4 p3, -0x1

    .line 59
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v2, 0x2

    aput-object p3, v0, v2

    const/4 p3, -0x2

    .line 60
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v0, v1

    const/16 p3, -0x19

    .line 61
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x4

    aput-object p3, v0, v1

    .line 57
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v5, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 62
    new-instance p3, Lcom/shopkick/app/saves/SavesScreenAdapter;

    iget-object v1, p0, Lcom/shopkick/app/saves/SavesScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    const/4 v6, 0x0

    move-object v0, p3

    move-object v2, p0

    move-object v3, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/saves/SavesScreenAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p3, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    .line 68
    iget-object p3, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    invoke-virtual {p3}, Lcom/shopkick/app/saves/SavesScreenAdapter;->removeDefaultItemDecoration()V

    .line 69
    iget-object p3, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 70
    new-instance p3, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/saves/SavesScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 71
    iget-object p3, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/saves/SavesScreenAdapter;->registerImageController(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    .line 73
    iget-object p2, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/saves/SavesScreenAdapter;->fetchNextPage()V

    .line 74
    iget-object p2, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/saves/SavesScreenAdapter;->notifyDataSetChanged()V

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 94
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesRequest;-><init>()V

    .line 95
    iget-object v1, p0, Lcom/shopkick/app/saves/SavesScreen;->targetUserId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesRequest;->targetUserId:Ljava/lang/String;

    .line 96
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesRequest;->previousPageKey:Ljava/lang/String;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/saves/SavesScreen;->targetUserId:Ljava/lang/String;

    .line 46
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "storiesSavedStateUpdated"

    const/4 v0, 0x0

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 89
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 147
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x71480102

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string/jumbo p2, "storiesSavedStateUpdated"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x1

    .line 149
    iput-boolean p1, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionChanged:Z

    :goto_2
    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 81
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 82
    iget-boolean v0, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionChanged:Z

    if-eqz v0, :cond_0

    .line 83
    invoke-direct {p0}, Lcom/shopkick/app/saves/SavesScreen;->updateSavedCollection()V

    :cond_0
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 6

    .line 102
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 103
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_6

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_6

    .line 104
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 105
    sget-object v2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 107
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;

    .line 108
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->allCollectionTiles:Ljava/util/List;

    if-eqz v2, :cond_4

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->allCollectionTiles:Ljava/util/List;

    .line 109
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    const/4 p1, 0x0

    .line 111
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->allCollectionTiles:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 112
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x10

    if-ne v4, v5, :cond_0

    if-nez p1, :cond_1

    .line 113
    iget-object p1, p0, Lcom/shopkick/app/saves/SavesScreen;->savedCollectionsAdapter:Lcom/shopkick/app/saves/SavesScreenAdapter;

    invoke-virtual {p1, v5}, Lcom/shopkick/app/saves/SavesScreenAdapter;->seenTileOfType(I)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/16 p1, 0xf

    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->verticalPadding:Ljava/lang/Integer;

    :cond_2
    const/4 p1, 0x1

    goto :goto_0

    .line 119
    :cond_3
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->allCollectionTiles:Ljava/util/List;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 120
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->pageKey:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    goto :goto_1

    .line 121
    :cond_4
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesRequest;->previousPageKey:Ljava/lang/String;

    if-nez p1, :cond_5

    .line 122
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->emptyCellHeader:Ljava/lang/String;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->emptyCellMessage:Ljava/lang/String;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetAllCollectionTilesResponse;->friendProfilePrivate:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v2, p2}, Lcom/shopkick/app/saves/SavesScreen;->createNoSavesTile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_5
    :goto_1
    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    :cond_6
    return-object v0
.end method
