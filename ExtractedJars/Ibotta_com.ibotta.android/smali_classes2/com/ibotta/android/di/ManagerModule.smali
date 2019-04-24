.class public abstract Lcom/ibotta/android/di/ManagerModule;
.super Ljava/lang/Object;
.source "ManagerModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideFavoriteRetailerManagerFactory(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 105
    new-instance v7, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;-><init>(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    return-object v7
.end method

.method public static provideGlobalEventManager(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/os/Handler;)Lcom/ibotta/android/state/GlobalEventManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 92
    new-instance v0, Lcom/ibotta/android/state/GlobalEventManagerImpl;

    invoke-direct {v0, p1}, Lcom/ibotta/android/state/GlobalEventManagerImpl;-><init>(Landroid/os/Handler;)V

    .line 93
    invoke-interface {p0, v0}, Lcom/ibotta/android/state/app/config/AppConfig;->addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V

    return-object v0
.end method

.method public static providePermissionStrategyManager(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/permissions/PermissionStrategyMultiton;)Lcom/ibotta/android/permissions/PermissionStrategyManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 75
    new-instance v0, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;-><init>(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/permissions/PermissionStrategyMultiton;)V

    return-object v0
.end method

.method public static providePermissionStrategyMultiton(Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/permissions/PermissionStrategyMultiton;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 81
    new-instance v0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;

    invoke-direct {v0, p0}, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;-><init>(Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V

    return-object v0
.end method

.method public static providePermissionsHelperFactory(Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;)Lcom/ibotta/android/permissions/PermissionsHelperFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 87
    new-instance v0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/permissions/PermissionsHelperFactory;-><init>(Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;)V

    return-object v0
.end method

.method public static providePixelTrackingManager(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Landroid/content/Context;Lcom/ibotta/android/state/app/google/GoogleState;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .locals 9
    .param p2    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 62
    new-instance v8, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/di/-$$Lambda$DpJh2_NCeg04FCdC_uGv24cz8QY;

    invoke-direct {v1, p1}, Lcom/ibotta/android/di/-$$Lambda$DpJh2_NCeg04FCdC_uGv24cz8QY;-><init>(Lcom/ibotta/android/profile/BuildProfile;)V

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/ibotta/android/di/-$$Lambda$pExVevcjUO3U1NZK7Z5ctYYI-ug;

    invoke-direct {v3, p3}, Lcom/ibotta/android/di/-$$Lambda$pExVevcjUO3U1NZK7Z5ctYYI-ug;-><init>(Lcom/ibotta/android/state/app/google/GoogleState;)V

    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcom/ibotta/android/di/-$$Lambda$cCxN06Nih2c3CUwKW1z797lTn4o;

    invoke-direct {v4, p4}, Lcom/ibotta/android/di/-$$Lambda$cCxN06Nih2c3CUwKW1z797lTn4o;-><init>(Lcom/ibotta/android/hardware/Hardware;)V

    sget-object v6, Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lcom/ibotta/android/di/-$$Lambda$s5dX6c36sZ11LWlvPSBr_PGIXnE;

    invoke-direct {v7, p0}, Lcom/ibotta/android/di/-$$Lambda$s5dX6c36sZ11LWlvPSBr_PGIXnE;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    move-object v0, v8

    move-object v2, p2

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;-><init>(Lcom/ibotta/android/tracking/DebugTrackingSupplier;Landroid/content/Context;Lcom/ibotta/android/abstractions/GoogleAidSupplier;Lcom/ibotta/android/abstractions/NetworkConnectedSupplier;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingService;Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;)V

    return-object v8
.end method

.method public static provideScheduledWorkReceiver(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/content/SharedPreferences;)Lcom/ibotta/android/receiver/work/ScheduledWorkManager;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .param p2    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsScheduledWorkReceiver"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;-><init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/content/SharedPreferences;)V

    return-object v0
.end method
