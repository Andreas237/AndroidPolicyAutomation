.class public abstract Lcom/ibotta/android/di/AppGeofenceModule;
.super Ljava/lang/Object;
.source "AppGeofenceModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideGeofenceConfigHelper(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v0
.end method

.method public static provideGeofenceCoordinator(Lcom/ibotta/android/location/geofence/GeofenceStatusManager;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/location/geofence/GeofenceCoordinator;
    .locals 1
    .param p0    # Lcom/ibotta/android/location/geofence/GeofenceStatusManager;
        .annotation runtime Ljavax/inject/Named;
            value = "RadarGeofenceStatusManager"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 88
    new-instance v0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceCoordinator;-><init>(Lcom/ibotta/android/location/geofence/GeofenceStatusManager;)V

    .line 90
    invoke-interface {p1, v0}, Lcom/ibotta/android/location/LocationStatusDispatcher;->addListener(Lcom/ibotta/android/location/LocationStatusListener;)V

    return-object v0
.end method

.method public static provideLocationStatusDispatcher()Lcom/ibotta/android/location/LocationStatusDispatcher;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 97
    new-instance v0, Lcom/ibotta/android/location/LocationStatusDispatcherImpl;

    invoke-direct {v0}, Lcom/ibotta/android/location/LocationStatusDispatcherImpl;-><init>()V

    return-object v0
.end method

.method public static provideRadarGeofenceConfig(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 47
    new-instance v0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;-><init>(Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 51
    invoke-interface {p0, v0}, Lcom/ibotta/android/state/app/config/AppConfig;->addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V

    return-object v0
.end method

.method public static provideRadarGeofenceStatusListener(Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;-><init>(Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    return-object v0
.end method

.method public static provideRadarGeofenceStatusManager(Lcom/ibotta/android/util/AppHelper;Ljava/util/Locale;Landroid/content/Context;Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;)Lcom/ibotta/android/location/geofence/GeofenceStatusManager;
    .locals 10
    .param p2    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "RadarGeofenceStatusManager"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 73
    new-instance v9, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;

    move-object v0, v9

    move-object v1, p2

    move-object v2, p1

    move-object v3, p5

    move-object/from16 v4, p6

    move-object v5, p3

    move-object v6, p4

    move-object v7, p0

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/location/geofence/GeofenceStatusManagerImpl;-><init>(Landroid/content/Context;Ljava/util/Locale;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/location/geofence/GeofenceConfig;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/location/geofence/GeofenceStatusListener;)V

    return-object v9
.end method
