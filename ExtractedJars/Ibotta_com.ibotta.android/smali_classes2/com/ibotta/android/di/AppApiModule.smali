.class public abstract Lcom/ibotta/android/di/AppApiModule;
.super Ljava/lang/Object;
.source "AppApiModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideApiContext()Lcom/ibotta/api/ApiContext;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 69
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    return-object v0
.end method

.method public static provideApiJobEnvironment(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;Lcom/ibotta/android/service/location/LocationUpdateManager;)Lcom/ibotta/android/service/api/job/ApiJobEnvironment;
    .locals 10
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 195
    new-instance v9, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;Lcom/ibotta/android/service/location/LocationUpdateManager;)V

    return-object v9
.end method

.method public static provideApiJobFactory(Lcom/ibotta/api/call/ApiCallFactory;)Lcom/ibotta/android/service/api/job/ApiJobFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 170
    new-instance v0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;-><init>(Lcom/ibotta/api/call/ApiCallFactory;)V

    return-object v0
.end method

.method public static provideApiWorkExecutorService()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiWorkExecutorService"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const/4 v0, 0x6

    .line 106
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static provideApiWorkServiceLock()Ljava/util/concurrent/locks/Lock;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiWorkServiceLock"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 74
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    return-object v0
.end method

.method public static provideApiWorkServiceProdConLock()Ljava/util/concurrent/locks/Lock;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiWorkServiceProdConLock"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 79
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    return-object v0
.end method

.method public static provideApiWorkWaitCondition(Ljava/util/concurrent/locks/Lock;)Ljava/util/concurrent/locks/Condition;
    .locals 0
    .param p0    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceLock"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "WorkCondition"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 96
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    return-object p0
.end method

.method public static provideAsyncGroupManager()Lcom/ibotta/android/service/api/AsyncGroupManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiWorkAsyncGroupManager"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 101
    new-instance v0, Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-direct {v0}, Lcom/ibotta/android/service/api/AsyncGroupManager;-><init>()V

    return-object v0
.end method

.method public static provideAuthManager(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;)Lcom/ibotta/android/state/user/auth/AuthManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 176
    new-instance v0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;)V

    return-object v0
.end method

.method public static provideClearCookiesLogOutListener(Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;)Lcom/ibotta/android/api/ClearCookiesLogOutListener;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 165
    new-instance v0, Lcom/ibotta/android/api/ClearCookiesLogOutListener;

    invoke-direct {v0, p0}, Lcom/ibotta/android/api/ClearCookiesLogOutListener;-><init>(Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;)V

    return-object v0
.end method

.method public static provideClearableCookieJar(Landroid/content/Context;)Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 160
    new-instance v0, Lcom/franmontiel/persistentcookiejar/PersistentCookieJar;

    new-instance v1, Lcom/franmontiel/persistentcookiejar/cache/SetCookieCache;

    invoke-direct {v1}, Lcom/franmontiel/persistentcookiejar/cache/SetCookieCache;-><init>()V

    new-instance v2, Lcom/franmontiel/persistentcookiejar/persistence/SharedPrefsCookiePersistor;

    invoke-direct {v2, p0}, Lcom/franmontiel/persistentcookiejar/persistence/SharedPrefsCookiePersistor;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, v2}, Lcom/franmontiel/persistentcookiejar/PersistentCookieJar;-><init>(Lcom/franmontiel/persistentcookiejar/cache/CookieCache;Lcom/franmontiel/persistentcookiejar/persistence/CookiePersistor;)V

    return-object v0
.end method

.method public static provideConsumerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;)Lcom/ibotta/android/service/api/ConsumerFactory;
    .locals 10
    .param p0    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceProdConLock"
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/locks/Condition;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkConsumeCondition"
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/service/api/ExecServiceManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkExecServiceManager"
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/service/api/AsyncGroupManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkAsyncGroupManager"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 125
    new-instance v9, Lcom/ibotta/android/service/api/ConsumerFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/service/api/ConsumerFactory;-><init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;)V

    return-object v9
.end method

.method public static provideContentMapper(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)Lcom/ibotta/android/mappers/ContentMapper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 182
    new-instance v0, Lcom/ibotta/android/mappers/ContentMapperImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mappers/ContentMapperImpl;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)V

    return-object v0
.end method

.method public static provideExecServiceManager()Lcom/ibotta/android/service/api/ExecServiceManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiWorkExecServiceManager"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 111
    new-instance v0, Lcom/ibotta/android/service/api/ExecServiceManager;

    invoke-direct {v0}, Lcom/ibotta/android/service/api/ExecServiceManager;-><init>()V

    return-object v0
.end method

.method public static provideHttpHeaders()Lcom/ibotta/api/HttpHeaders;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 64
    sget-object v0, Lcom/ibotta/api/ApiModule;->INSTANCE:Lcom/ibotta/api/ApiModule;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiModule;->getHttpHeaders()Lcom/ibotta/api/HttpHeaders;

    move-result-object v0

    return-object v0
.end method

.method public static providePostAuthWorkJobFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;
    .locals 1
    .param p3    # Lcom/ibotta/android/api/critical/CriticalDependency;
        .annotation runtime Ljavax/inject/Named;
            value = "CriticalDependencyMvt"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 155
    new-instance v0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/api/critical/CriticalDependency;)V

    return-object v0
.end method

.method public static provideProdConConsumeCondition(Ljava/util/concurrent/locks/Lock;)Ljava/util/concurrent/locks/Condition;
    .locals 0
    .param p0    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceProdConLock"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiWorkConsumeCondition"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 91
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    return-object p0
.end method

.method public static provideProdConProduceCondition(Ljava/util/concurrent/locks/Lock;)Ljava/util/concurrent/locks/Condition;
    .locals 0
    .param p0    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceProdConLock"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ApiWorkProduceCondition"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 85
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    return-object p0
.end method

.method public static provideProducerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/service/api/ProducerFactory;
    .locals 8
    .param p0    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceProdConLock"
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/locks/Condition;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkConsumeCondition"
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/locks/Condition;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkProduceCondition"
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/service/api/ExecServiceManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkExecServiceManager"
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/service/api/AsyncGroupManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkAsyncGroupManager"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 145
    new-instance v7, Lcom/ibotta/android/service/api/ProducerFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/service/api/ProducerFactory;-><init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;)V

    return-object v7
.end method
