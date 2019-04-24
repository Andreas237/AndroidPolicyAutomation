.class public abstract Lcom/ibotta/android/di/CacheModule;
.super Ljava/lang/Object;
.source "CacheModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final PREFS_FILENAME:Ljava/lang/String; = "cache_times"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideAppCache(Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/appcache/policy/CachePolicies;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Landroid/os/Handler;Lcom/ibotta/android/state/app/upgrade/AppUpgrader;)Lcom/ibotta/android/appcache/AppCache;
    .locals 7
    .param p0    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsCacheTimes"
        .end annotation
    .end param
    .param p1    # Ljava/io/File;
        .annotation runtime Ljavax/inject/Named;
            value = "AppCacheDirInternal"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 59
    new-instance v6, Lcom/ibotta/android/appcache/AppCacheImpl;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/appcache/AppCacheImpl;-><init>(Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/appcache/policy/CachePolicies;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Landroid/os/Handler;)V

    .line 60
    invoke-interface {p5, v6}, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;->addAppUpgradeListener(Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;)V

    return-object v6
.end method

.method public static provideCacheClearHelper(Lcom/ibotta/android/appcache/CacheClearRunnableFactory;Lcom/ibotta/android/state/app/fcm/FcmState;)Lcom/ibotta/android/appcache/CacheClearHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 95
    new-instance v0, Lcom/ibotta/android/appcache/CacheClearHelperImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/appcache/CacheClearHelperImpl;-><init>(Lcom/ibotta/android/appcache/CacheClearRunnableFactory;Lcom/ibotta/android/state/app/fcm/FcmState;)V

    return-object v0
.end method

.method public static provideCacheClearJobFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 124
    new-instance v6, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    return-object v6
.end method

.method public static provideCacheClearRunnableFactory(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/appcache/CacheClearRunnableFactory;
    .locals 9
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 107
    new-instance v8, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/appcache/CacheClearRunnableFactoryImpl;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v8
.end method

.method public static provideCacheFetchStrategyFactory(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 114
    new-instance v0, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    return-object v0
.end method

.method public static provideCachePolicies(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/appcache/policy/CachePolicies;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 86
    new-instance v0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 87
    invoke-interface {p0, v0}, Lcom/ibotta/android/state/app/config/AppConfig;->addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V

    return-object v0
.end method

.method public static provideCacheTimesSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SharedPrefsCacheTimes"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const-string v0, "cache_times"

    const/4 v1, 0x0

    .line 48
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static providePasswordCache(Lcom/ibotta/android/security/PasswordCacheExecutorFactory;)Lcom/ibotta/android/security/PasswordCache;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 72
    new-instance v0, Lcom/ibotta/android/security/PasswordCacheImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/security/PasswordCacheImpl;-><init>(Lcom/ibotta/android/security/PasswordCacheExecutorFactory;)V

    return-object v0
.end method

.method public static providePasswordCacheExecutorFactory()Lcom/ibotta/android/security/PasswordCacheExecutorFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 81
    new-instance v0, Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    invoke-direct {v0}, Lcom/ibotta/android/security/PasswordCacheExecutorFactory;-><init>()V

    return-object v0
.end method
