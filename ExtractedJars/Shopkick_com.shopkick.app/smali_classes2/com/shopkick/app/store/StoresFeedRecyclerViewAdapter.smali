.class public final Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;
.super Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
.source "StoresFeedRecyclerViewAdapter.kt"

# interfaces
.implements Landroid/widget/Filterable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStoresFeedRecyclerViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoresFeedRecyclerViewAdapter.kt\ncom/shopkick/app/store/StoresFeedRecyclerViewAdapter\n*L\n1#1,245:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002Be\u0008\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u0008\u0010/\u001a\u00020&H\u0016J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\rH\u0016J\u0008\u00102\u001a\u00020\rH\u0016J\u0010\u00103\u001a\u00020\r2\u0006\u00101\u001a\u00020\rH\u0016J\u0010\u00104\u001a\u00020,2\u0006\u00105\u001a\u000206H\u0014J\u0008\u00107\u001a\u00020,H\u0002J\u000e\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\"J\u0006\u0010:\u001a\u00020,J,\u0010;\u001a\u00020,2\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u00112\u0006\u0010<\u001a\u00020\"H\u0002R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0011X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*\u00a8\u0006="
    }
    d2 = {
        "Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;",
        "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;",
        "Landroid/widget/Filterable;",
        "screenGlobals",
        "Lcom/shopkick/app/application/ScreenGlobals;",
        "appScreen",
        "Lcom/shopkick/app/screens/AppScreen;",
        "callback",
        "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;",
        "recyclerView",
        "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
        "supportedTileTypes",
        "",
        "",
        "additionalUserEventCoordinators",
        "Ljava/util/ArrayList;",
        "Lcom/shopkick/app/logging/IUserEventCoordinator;",
        "Lkotlin/collections/ArrayList;",
        "dataFetcherType",
        "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;",
        "(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V",
        "canLogSearchResult",
        "",
        "filteredFeedTiles",
        "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
        "getFilteredFeedTiles",
        "()Ljava/util/ArrayList;",
        "setFilteredFeedTiles",
        "(Ljava/util/ArrayList;)V",
        "isModeFilter",
        "logHandler",
        "Landroid/os/Handler;",
        "searchFilterResults",
        "searchKeyWord",
        "",
        "searchResultType",
        "Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;",
        "storeSearchFilter",
        "Landroid/widget/Filter;",
        "getStoreSearchFilter",
        "()Landroid/widget/Filter;",
        "setStoreSearchFilter",
        "(Landroid/widget/Filter;)V",
        "autoFetchNextPage",
        "",
        "checkLocationPermission",
        "clearFilter",
        "getFilter",
        "getItem",
        "position",
        "getItemCount",
        "getItemViewType",
        "handlePageResponse",
        "pageResponse",
        "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;",
        "logSearchResult",
        "setSearchKeyword",
        "keyword",
        "startFilter",
        "updateSearchResults",
        "searchKeyword",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private canLogSearchResult:Z

.field private filteredFeedTiles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isModeFilter:Z

.field private final logHandler:Landroid/os/Handler;

.field private searchFilterResults:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private searchKeyWord:Ljava/lang/String;

.field private searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field private storeSearchFilter:Landroid/widget/Filter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V
    .locals 0
    .param p1    # Lcom/shopkick/app/application/ScreenGlobals;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/screens/AppScreen;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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

    .line 37
    invoke-direct/range {p0 .. p7}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    .line 29
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->storeSearchFilter:Landroid/widget/Filter;

    const-string p1, ""

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    .line 34
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->logHandler:Landroid/os/Handler;

    .line 35
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->UNKNOWN:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const/4 p1, 0x0

    .line 38
    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic access$getCanLogSearchResult$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)Z
    .locals 0

    .line 27
    iget-boolean p0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->canLogSearchResult:Z

    return p0
.end method

.method public static final synthetic access$getFeedTiles$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)Ljava/util/ArrayList;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getSearchFilterResults$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)Ljava/util/ArrayList;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchFilterResults:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$logSearchResult(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->logSearchResult()V

    return-void
.end method

.method public static final synthetic access$setCanLogSearchResult$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;Z)V
    .locals 0

    .line 27
    iput-boolean p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->canLogSearchResult:Z

    return-void
.end method

.method public static final synthetic access$setFeedTiles$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;Ljava/util/ArrayList;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic access$setSearchFilterResults$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;Ljava/util/ArrayList;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchFilterResults:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic access$updateSearchResults(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->updateSearchResults(Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method

.method private final logSearchResult()V
    .locals 5

    .line 108
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->canLogSearchResult:Z

    if-eqz v0, :cond_1

    .line 109
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x184

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x31

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/4 v1, 0x0

    .line 111
    iget-object v2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSearchText(Ljava/lang/String;)V

    .line 112
    iget-object v2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const/4 v3, 0x1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v4, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 122
    :pswitch_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSearchFailureReason(Ljava/lang/Integer;)V

    goto :goto_1

    :pswitch_1
    const/4 v1, 0x2

    .line 118
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSearchFailureReason(Ljava/lang/Integer;)V

    goto :goto_1

    :goto_0
    move v3, v1

    :goto_1
    :pswitch_2
    if-eqz v3, :cond_1

    .line 126
    iget-object v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v1, :cond_1

    .line 128
    iget-object v1, v1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final updateSearchResults(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    const/16 v1, 0x2e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;

    .line 137
    invoke-virtual {v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setSearchKeyword(Ljava/lang/String;)V

    .line 139
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 140
    iget-object v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz v1, :cond_6

    .line 142
    sget-object v2, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->UNKNOWN:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object v2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    .line 143
    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isSystemLocationEnabled(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz p1, :cond_5

    .line 145
    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 146
    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 147
    iget-object v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, -0x8

    if-eqz v1, :cond_1

    .line 148
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_0

    .line 150
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 151
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 152
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string/jumbo v2, "tile.clientData()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Map;

    const-string v2, "ParamSearchResultType"

    sget-object v3, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->NO_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string/jumbo v2, "tile.clientData()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Map;

    const-string v2, "ParamSearchKeyword"

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    sget-object p2, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->NO_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    .line 155
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 157
    :cond_0
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->SUCCESS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    goto :goto_0

    .line 160
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isFetching()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 162
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x7

    .line 163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 164
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string/jumbo v2, "tile.clientData()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Map;

    const-string v2, "ParamSearchKeyword"

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    sget-object p2, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->SEARCHING:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    .line 166
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 167
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 169
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 170
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 171
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string/jumbo v2, "tile.clientData()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Map;

    const-string v2, "ParamSearchResultType"

    sget-object v3, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->PARTIAL_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string/jumbo v2, "tile.clientData()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Map;

    const-string v2, "ParamSearchKeyword"

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    sget-object p2, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->PARTIAL_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    .line 174
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 178
    :cond_3
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->SUGGESTED_TILES:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    goto :goto_0

    .line 182
    :cond_4
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->NO_LOCATION_PERMISSION:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    .line 185
    :cond_5
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->logSearchResult()V

    .line 186
    iput-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    .line 187
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->notifyDataSetChanged()V

    return-void

    :cond_6
    return-void

    .line 136
    :cond_7
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type com.shopkick.app.tileViewHolderConfigurators.StoreTileViewHolderConfigurator"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final autoFetchNextPage()V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 103
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->fetchNextPage(Z)V

    :cond_0
    return-void
.end method

.method public final checkLocationPermission()V
    .locals 2

    .line 75
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isModeFilter:Z

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchFilterResults:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->updateSearchResults(Ljava/util/ArrayList;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final clearFilter()V
    .locals 3

    .line 55
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->storeSearchFilter:Landroid/widget/Filter;

    const/4 v0, 0x0

    .line 56
    move-object v1, v0

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    .line 57
    iput-object v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchFilterResults:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 58
    iput-boolean v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isModeFilter:Z

    const-string v2, ""

    .line 59
    iput-object v2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    .line 60
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->cancelCurrentRequest()V

    .line 61
    iget-object v2, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->logHandler:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 62
    iput-boolean v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->canLogSearchResult:Z

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    const/16 v1, 0x2e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;

    .line 66
    iget-object v1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setSearchKeyword(Ljava/lang/String;)V

    return-void

    .line 65
    :cond_0
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type com.shopkick.app.tileViewHolderConfigurators.StoreTileViewHolderConfigurator"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 206
    new-instance v0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$getFilter$1;-><init>(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)V

    check-cast v0, Landroid/widget/Filter;

    return-object v0
.end method

.method protected final getFilteredFeedTiles()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    const-string/jumbo p1, "super.getItem(position)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->getItemCount()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const-string v0, "feedTiles.get(position).type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method protected final getStoreSearchFilter()Landroid/widget/Filter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->storeSearchFilter:Landroid/widget/Filter;

    return-object v0
.end method

.method protected handlePageResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)V
    .locals 2
    .param p1    # Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "pageResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->handlePageResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)V

    .line 193
    iget-boolean v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isModeFilter:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 194
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-eq v0, v1, :cond_1

    iget-object p1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 199
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchFilterResults:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->updateSearchResults(Ljava/util/ArrayList;Ljava/lang/String;)V

    goto :goto_1

    .line 195
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->storeSearchFilter:Landroid/widget/Filter;

    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 196
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->autoFetchNextPage()V

    :cond_2
    :goto_1
    return-void
.end method

.method protected final setFilteredFeedTiles(Ljava/util/ArrayList;)V
    .locals 0
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->filteredFeedTiles:Ljava/util/ArrayList;

    return-void
.end method

.method public final setSearchKeyword(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "keyword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->canLogSearchResult:Z

    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isModeFilter:Z

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->autoFetchNextPage()V

    .line 90
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchKeyWord:Ljava/lang/String;

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->storeSearchFilter:Landroid/widget/Filter;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->logHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 93
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->UNKNOWN:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->searchResultType:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->logHandler:Landroid/os/Handler;

    new-instance v0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$setSearchKeyword$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$setSearchKeyword$1;-><init>(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)V

    check-cast v0, Ljava/lang/Runnable;

    const-wide/16 v1, 0x2bc

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected final setStoreSearchFilter(Landroid/widget/Filter;)V
    .locals 1
    .param p1    # Landroid/widget/Filter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->storeSearchFilter:Landroid/widget/Filter;

    return-void
.end method

.method public final startFilter()V
    .locals 1

    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->isModeFilter:Z

    const-string v0, ""

    .line 71
    invoke-virtual {p0, v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->setSearchKeyword(Ljava/lang/String;)V

    return-void
.end method
