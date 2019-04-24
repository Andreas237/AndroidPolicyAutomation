.class public final Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;
.super Ljava/lang/Object;
.source "CacheModule_ProvideCacheClearRunnableFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/appcache/CacheClearRunnableFactory;",
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

.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheClearFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
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

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->contextProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->handlerProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p4, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p5, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p6, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p7, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;"
        }
    .end annotation

    .line 91
    new-instance v8, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/appcache/CacheClearRunnableFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/appcache/CacheClearRunnableFactory;"
        }
    .end annotation

    .line 74
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 75
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/os/Handler;

    .line 76
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/profile/BuildProfile;

    .line 77
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/appcache/AppCache;

    .line 78
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 79
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 80
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 73
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->proxyProvideCacheClearRunnableFactory(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideCacheClearRunnableFactory(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/appcache/CacheClearRunnableFactory;
    .locals 0

    .line 110
    invoke-static/range {p0 .. p6}, Lcom/ibotta/android/di/CacheModule;->provideCacheClearRunnableFactory(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 109
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/appcache/CacheClearRunnableFactory;
    .locals 7

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->handlerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->cacheKeyMatcherFactoryProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearRunnableFactoryFactory;->get()Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    move-result-object v0

    return-object v0
.end method
