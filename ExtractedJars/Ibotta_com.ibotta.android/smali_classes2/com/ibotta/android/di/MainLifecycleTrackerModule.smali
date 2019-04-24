.class public abstract Lcom/ibotta/android/di/MainLifecycleTrackerModule;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideActivityLifecycleListener(Lcom/ibotta/android/tracking/sdk/LifecycleTracker;)Lcom/ibotta/android/ActivityLifecycleListener;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 78
    new-instance v0, Lcom/ibotta/android/ActivityLifecycleListener;

    invoke-direct {v0, p0}, Lcom/ibotta/android/ActivityLifecycleListener;-><init>(Lcom/ibotta/android/tracking/sdk/LifecycleTracker;)V

    return-object v0
.end method

.method public static provideAggregateCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 1
    .param p1    # Lcom/ibotta/android/api/critical/CriticalDependency;
        .annotation runtime Ljavax/inject/Named;
            value = "CriticalDependencyMvt"
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/api/critical/CriticalDependency;
        .annotation runtime Ljavax/inject/Named;
            value = "CriticalDependencyAppConfig"
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/api/critical/CriticalDependency;
        .annotation runtime Ljavax/inject/Named;
            value = "CriticalDependencyPwi"
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/api/critical/CriticalDependency;
        .annotation runtime Ljavax/inject/Named;
            value = "CriticalDependencyFlags"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CriticalDependencyAggregate"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 149
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 150
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 151
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 152
    invoke-interface {v0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 153
    invoke-interface {v0, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 155
    new-instance p1, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;

    invoke-direct {p1, p0, v0}, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;Ljava/util/Set;)V

    return-object p1
.end method

.method public static provideAppConfigCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/job/ApiJobFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CriticalDependencyAppConfig"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 173
    new-instance v0, Lcom/ibotta/android/api/critical/AppConfigCriticalDependency;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/api/critical/AppConfigCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-object v0
.end method

.method public static provideBreadcrumbLifecycleTracker(Ljava/util/Set;Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;
    .locals 1
    .param p0    # Ljava/util/Set;
        .annotation runtime Ljavax/inject/Named;
            value = "FrontDoorActivities"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;",
            "Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;",
            ")",
            "Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 227
    new-instance v0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;

    invoke-direct {v0, p1, p0}, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;-><init>(Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;Ljava/util/Set;)V

    return-object v0
.end method

.method public static provideCriticalDependencyLifecycleTracker(Ljava/util/Set;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;
    .locals 1
    .param p0    # Ljava/util/Set;
        .annotation runtime Ljavax/inject/Named;
            value = "FrontDoorActivities"
        .end annotation
    .end param
    .param p1    # Lcom/ibotta/android/api/critical/CriticalDependency;
        .annotation runtime Ljavax/inject/Named;
            value = "CriticalDependencyAggregate"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ")",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 138
    new-instance v0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;-><init>(Ljava/util/Set;Lcom/ibotta/android/api/critical/CriticalDependency;)V

    return-object v0
.end method

.method static provideFlagsApi(Lcom/ibotta/android/features/FlagsInitializer;)Lcom/ibotta/android/features/FlagsApi;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 195
    new-instance v0, Lcom/ibotta/android/features/FlagsApiImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/features/FlagsApiImpl;-><init>(Lcom/ibotta/android/features/FlagsInitializer;)V

    return-object v0
.end method

.method static provideFlagsCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CriticalDependencyFlags"
    .end annotation

    .line 189
    new-instance v0, Lcom/ibotta/android/api/critical/FlagsCriticalDependency;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/api/critical/FlagsCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)V

    return-object v0
.end method

.method static provideFlagsUserFactory(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/features/variant/FlagsUserFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 220
    new-instance v0, Lcom/ibotta/android/features/variant/FlagsUserFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/features/variant/FlagsUserFactory;-><init>(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/profile/BuildProfile;)V

    return-object v0
.end method

.method public static provideIbottaLifecycleTracker(Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;
    .locals 14
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            "Lcom/ibotta/android/appcache/AppCache;",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/state/session/SessionState;",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ")",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 119
    new-instance v13, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;

    move-object v0, v13

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v12}, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;-><init>(Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V

    return-object v13
.end method

.method static provideLaunchDarklyInitializer(Landroid/content/Context;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/features/FlagsInitializer;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 203
    invoke-interface {p1}, Lcom/ibotta/android/profile/BuildProfile;->isDebugLaunchDarkly()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 204
    sget-object p1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->LAUNCH_DARKLY_TEST:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    goto :goto_0

    .line 206
    :cond_0
    sget-object p1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->LAUNCH_DARKLY_PROD:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    .line 208
    :goto_0
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    invoke-direct {v0, p1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v0}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object p1

    .line 210
    new-instance v0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;

    check-cast p0, Landroid/app/Application;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    return-object v0
.end method

.method public static provideLifecycleTracker(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/appboy/Appboy;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;)Lcom/ibotta/android/tracking/sdk/LifecycleTracker;
    .locals 10
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    move-object v0, p0

    move-object v1, p3

    .line 94
    new-instance v2, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;

    new-instance v3, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;

    move-object v4, p2

    invoke-direct {v3, p0, p2}, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;-><init>(Lcom/ibotta/android/App;Lcom/appboy/Appboy;)V

    new-instance v4, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;

    move-object v5, p1

    invoke-direct {v4, p0, p3, p1}, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/config/AppConfig;)V

    new-instance v5, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;

    move-object v6, p4

    move-object/from16 v7, p9

    invoke-direct {v5, p0, p3, p4, v7}, Lcom/ibotta/android/tracking/sdk/AppsFlyerLifecycleTracker;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;)V

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-static/range {v3 .. v9}, Ljava9/util/Lists;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;-><init>(Ljava/util/List;)V

    return-object v2
.end method

.method public static provideMvtCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CriticalDependencyMvt"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 166
    new-instance v7, Lcom/ibotta/android/api/critical/MvtCriticalDependency;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/api/critical/MvtCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)V

    return-object v7
.end method

.method public static provideNewRelicLifecycleTracker(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;)Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 233
    new-instance v0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;)V

    return-object v0
.end method

.method public static provideNewRelicSessionAttributes(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 241
    new-instance v0, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;-><init>(Lcom/ibotta/android/App;)V

    .line 242
    invoke-virtual {p1, v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->addListener(Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;)V

    .line 243
    invoke-interface {p2, v0}, Lcom/ibotta/android/location/LocationStatusDispatcher;->addListener(Lcom/ibotta/android/location/LocationStatusListener;)V

    return-object v0
.end method

.method public static providePwiCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CriticalDependencyPwi"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 182
    new-instance v0, Lcom/ibotta/android/api/critical/PwiCriticalDependency;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/api/critical/PwiCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    return-object v0
.end method
