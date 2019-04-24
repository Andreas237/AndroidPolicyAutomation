.class public final Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;
.super Ljava/lang/Object;
.source "CacheModule_ProvideAppCacheFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/appcache/AppCache;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheDirProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private final appTimingTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final appUpgraderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;"
        }
    .end annotation
.end field

.field private final cachePoliciesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/policy/CachePolicies;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheTimesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/policy/CachePolicies;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->cacheTimesProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->appCacheDirProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->cachePoliciesProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p4, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p5, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->handlerProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p6, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->appUpgraderProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/policy/CachePolicies;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;)",
            "Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;"
        }
    .end annotation

    .line 81
    new-instance v7, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/appcache/AppCache;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/policy/CachePolicies;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
            ">;)",
            "Lcom/ibotta/android/appcache/AppCache;"
        }
    .end annotation

    .line 66
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/content/SharedPreferences;

    .line 67
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/io/File;

    .line 68
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/appcache/policy/CachePolicies;

    .line 69
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 70
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Landroid/os/Handler;

    .line 71
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    .line 65
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->proxyProvideAppCache(Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/appcache/policy/CachePolicies;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Landroid/os/Handler;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;)Lcom/ibotta/android/appcache/AppCache;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppCache(Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/appcache/policy/CachePolicies;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Landroid/os/Handler;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;)Lcom/ibotta/android/appcache/AppCache;
    .locals 0

    .line 98
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/CacheModule;->provideAppCache(Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/appcache/policy/CachePolicies;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Landroid/os/Handler;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;)Lcom/ibotta/android/appcache/AppCache;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 97
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/AppCache;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/appcache/AppCache;
    .locals 6

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->cacheTimesProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->appCacheDirProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->cachePoliciesProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->handlerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->appUpgraderProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/appcache/AppCache;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/CacheModule_ProvideAppCacheFactory;->get()Lcom/ibotta/android/appcache/AppCache;

    move-result-object v0

    return-object v0
.end method
