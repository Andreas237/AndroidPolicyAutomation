.class public abstract Lcom/ibotta/android/di/SearchModule;
.super Ljava/lang/Object;
.source "SearchModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideAsyncRecentSearchService(Lcom/ibotta/android/search/RecentSearchService;)Lcom/ibotta/android/search/AsyncRecentSearchService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 83
    new-instance v0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;-><init>(Lcom/ibotta/android/search/RecentSearchService;)V

    return-object v0
.end method

.method public static provideDBAsyncSuggestedSearchService(Lcom/ibotta/android/search/RecentSearchService;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AsyncDBService"
    .end annotation

    .line 89
    new-instance v0, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/search/recent/AsyncRecentSearchServiceImpl;-><init>(Lcom/ibotta/android/search/RecentSearchService;)V

    return-object v0
.end method

.method public static provideHTTPAsyncSuggestedSearchService(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 7
    .param p4    # Landroid/os/Handler;
        .annotation runtime Ljavax/inject/Named;
            value = "background_handler"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AsyncHTTPService"
    .end annotation

    .line 99
    new-instance v6, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)V

    return-object v6
.end method

.method public static provideMisspellingReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/search/MisspellingReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 112
    new-instance v0, Lcom/ibotta/android/search/MisspellingReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/search/MisspellingReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideRecentSearchDao(Lcom/ibotta/android/search/recent/RecentSearchDatabase;)Lcom/ibotta/android/search/recent/RecentSearchTermDao;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/search/recent/RecentSearchDatabase;->getRecentSearchTermDao()Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    move-result-object p0

    return-object p0
.end method

.method public static provideRecentSearchDatabase(Landroid/content/Context;)Lcom/ibotta/android/search/recent/RecentSearchDatabase;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 65
    const-class v0, Lcom/ibotta/android/search/recent/RecentSearchDatabase;

    const-string v1, "recent-searches.db"

    invoke-static {p0, v0, v1}, Landroid/arch/persistence/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroid/arch/persistence/room/RoomDatabase$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/arch/persistence/room/RoomDatabase$Builder;->build()Landroid/arch/persistence/room/RoomDatabase;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/recent/RecentSearchDatabase;

    return-object p0
.end method

.method public static provideRecentSearchService(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/RecentSearchService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 77
    new-instance v0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/search/recent/LocalRecentSearchService;-><init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideRecentlyViewedRetailersService(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 127
    new-instance v0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    return-object v0
.end method

.method public static provideSearchAsync(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/search/SearchProductsVariant;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Landroid/content/res/Resources;)Lcom/ibotta/android/search/async/SearchAsync;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 55
    new-instance v6, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/content/res/Resources;Lcom/ibotta/android/features/variant/search/SearchProductsVariant;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V

    return-object v6
.end method

.method public static provideSearchReducer()Lcom/ibotta/android/search/SearchReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 117
    new-instance v0, Lcom/ibotta/android/search/SearchReducer;

    invoke-direct {v0}, Lcom/ibotta/android/search/SearchReducer;-><init>()V

    return-object v0
.end method

.method public static provideUnifiedAsyncSuggestedSearchService(Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/search/AsyncSuggestedSearchService;
    .locals 1
    .param p0    # Lcom/ibotta/android/search/AsyncSuggestedSearchService;
        .annotation runtime Ljavax/inject/Named;
            value = "AsyncDBService"
        .end annotation
    .end param
    .param p1    # Lcom/ibotta/android/search/AsyncSuggestedSearchService;
        .annotation runtime Ljavax/inject/Named;
            value = "AsyncHTTPService"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AsyncUnifiedService"
    .end annotation

    .line 107
    new-instance v0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;-><init>(Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method
