.class public Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;
.super Ljava/lang/Object;
.source "FavoriteRetailersManagerFactory.java"


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final appboy:Lcom/appboy/Appboy;

.field private final cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

.field private final favoriteRetailerNotifier:Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

.field private final favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->appboy:Lcom/appboy/Appboy;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 37
    iput-object p4, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->favoriteRetailerNotifier:Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

    .line 38
    iput-object p5, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 39
    iput-object p6, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-void
.end method

.method private buildNewManager()Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
    .locals 8

    .line 70
    new-instance v7, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;

    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v2, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->appboy:Lcom/appboy/Appboy;

    iget-object v3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    iget-object v4, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->favoriteRetailerNotifier:Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

    iget-object v5, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    iget-object v6, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    return-object v7
.end method


# virtual methods
.method public newInstance()Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->buildNewManager()Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object v0

    .line 44
    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->load()V

    return-object v0
.end method

.method public newInstance(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
    .locals 3

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->buildNewManager()Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object v0

    .line 51
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    invoke-interface {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->setRetailersFromServer(Ljava/util/List;)V

    .line 55
    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->load()V

    return-object v0
.end method

.method public newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;"
        }
    .end annotation

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->buildNewManager()Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object v0

    .line 63
    invoke-interface {v0, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->setRetailersFromServer(Ljava/util/List;)V

    .line 64
    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->load()V

    return-object v0
.end method
