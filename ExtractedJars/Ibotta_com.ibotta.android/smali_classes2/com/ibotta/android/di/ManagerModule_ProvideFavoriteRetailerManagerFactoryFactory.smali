.class public final Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;
.super Ljava/lang/Object;
.source "ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final appboyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final favoriteRetailerNotifierProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;",
            ">;"
        }
    .end annotation
.end field

.field private final favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaApolloCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->appboyProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->favoriteRetailerNotifierProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p5, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p6, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;)",
            "Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;"
        }
    .end annotation

    .line 83
    new-instance v7, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;)",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;"
        }
    .end annotation

    .line 68
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/appcache/AppCache;

    .line 69
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/appboy/Appboy;

    .line 70
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 71
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

    .line 72
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 73
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 67
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->proxyProvideFavoriteRetailerManagerFactory(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFavoriteRetailerManagerFactory(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;
    .locals 0

    .line 100
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/ManagerModule;->provideFavoriteRetailerManagerFactory(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 99
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;
    .locals 6

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->appboyProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->favoriteRetailerNotifierProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/ManagerModule_ProvideFavoriteRetailerManagerFactoryFactory;->get()Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-result-object v0

    return-object v0
.end method
