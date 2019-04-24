.class public final Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;
.super Ljava/lang/Object;
.source "RadarGeofenceStatusListener.kt"

# interfaces
.implements Lcom/ibotta/android/location/geofence/GeofenceStatusListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;",
        "Lcom/ibotta/android/location/geofence/GeofenceStatusListener;",
        "radarGeofenceConfig",
        "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
        "userState",
        "Lcom/ibotta/android/state/user/UserState;",
        "authManager",
        "Lcom/ibotta/android/state/user/auth/AuthManager;",
        "(Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;)V",
        "radarPriority",
        "Lio/radar/sdk/Radar$RadarTrackingPriority;",
        "getRadarPriority",
        "()Lio/radar/sdk/Radar$RadarTrackingPriority;",
        "onGeofenceStatusInvalidated",
        "",
        "newGeofenceStatus",
        "Lcom/ibotta/android/state/GeofenceStatus;",
        "startTracking",
        "trackingOptions",
        "Lio/radar/sdk/RadarTrackingOptions;",
        "stopTracking",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final radarGeofenceConfig:Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/state/user/UserState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/state/user/auth/AuthManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "radarGeofenceConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->radarGeofenceConfig:Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    iput-object p2, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->userState:Lcom/ibotta/android/state/user/UserState;

    iput-object p3, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    return-void
.end method

.method private final getRadarPriority()Lio/radar/sdk/Radar$RadarTrackingPriority;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->radarGeofenceConfig:Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->isConfiguredForResponsiveness()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingPriority;->RESPONSIVENESS:Lio/radar/sdk/Radar$RadarTrackingPriority;

    goto :goto_0

    .line 24
    :cond_0
    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingPriority;->EFFICIENCY:Lio/radar/sdk/Radar$RadarTrackingPriority;

    :goto_0
    return-object v0
.end method

.method private final startTracking(Lio/radar/sdk/RadarTrackingOptions;)V
    .locals 2

    .line 48
    sget-object v0, Lio/radar/sdk/Radar$RadarPlacesProvider;->FACEBOOK:Lio/radar/sdk/Radar$RadarPlacesProvider;

    invoke-static {v0}, Lio/radar/sdk/Radar;->setPlacesProvider(Lio/radar/sdk/Radar$RadarPlacesProvider;)V

    .line 50
    invoke-static {}, Lio/radar/sdk/Radar;->isTracking()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Starting Radar geofence tracking"

    .line 51
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-static {p1}, Lio/radar/sdk/Radar;->startTracking(Lio/radar/sdk/RadarTrackingOptions;)V

    goto :goto_0

    :cond_0
    const-string p1, "Radar geofence tracking already started"

    .line 54
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final stopTracking(Lcom/ibotta/android/state/GeofenceStatus;)V
    .locals 3

    .line 59
    invoke-static {}, Lio/radar/sdk/Radar;->isTracking()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "Stopping Radar geofence tracking with GeofenceStatus: %s"

    .line 60
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/state/GeofenceStatus;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-static {}, Lio/radar/sdk/Radar;->stopTracking()V

    goto :goto_0

    :cond_0
    const-string v0, "Radar geofence tracking already stopped, GeofenceStatus: %s"

    .line 63
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/state/GeofenceStatus;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public onGeofenceStatusInvalidated(Lcom/ibotta/android/state/GeofenceStatus;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/state/GeofenceStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "newGeofenceStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->radarGeofenceConfig:Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;->getApiKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/radar/sdk/Radar;->initialize(Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/radar/sdk/Radar;->setUserId(Ljava/lang/String;)V

    .line 34
    :cond_0
    new-instance v0, Lio/radar/sdk/RadarTrackingOptions$Builder;

    invoke-direct {v0}, Lio/radar/sdk/RadarTrackingOptions$Builder;-><init>()V

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->getRadarPriority()Lio/radar/sdk/Radar$RadarTrackingPriority;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/radar/sdk/RadarTrackingOptions$Builder;->priority(Lio/radar/sdk/Radar$RadarTrackingPriority;)Lio/radar/sdk/RadarTrackingOptions$Builder;

    move-result-object v0

    .line 36
    sget-object v1, Lio/radar/sdk/Radar$RadarTrackingOffline;->REPLAY_STOPPED:Lio/radar/sdk/Radar$RadarTrackingOffline;

    invoke-virtual {v0, v1}, Lio/radar/sdk/RadarTrackingOptions$Builder;->offline(Lio/radar/sdk/Radar$RadarTrackingOffline;)Lio/radar/sdk/RadarTrackingOptions$Builder;

    move-result-object v0

    .line 37
    sget-object v1, Lio/radar/sdk/Radar$RadarTrackingSync;->POSSIBLE_STATE_CHANGES:Lio/radar/sdk/Radar$RadarTrackingSync;

    invoke-virtual {v0, v1}, Lio/radar/sdk/RadarTrackingOptions$Builder;->sync(Lio/radar/sdk/Radar$RadarTrackingSync;)Lio/radar/sdk/RadarTrackingOptions$Builder;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lio/radar/sdk/RadarTrackingOptions$Builder;->build()Lio/radar/sdk/RadarTrackingOptions;

    move-result-object v0

    .line 40
    sget-object v1, Lcom/ibotta/android/state/GeofenceStatus;->OK:Lcom/ibotta/android/state/GeofenceStatus;

    if-ne p1, v1, :cond_1

    .line 41
    invoke-direct {p0, v0}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->startTracking(Lio/radar/sdk/RadarTrackingOptions;)V

    goto :goto_0

    .line 43
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;->stopTracking(Lcom/ibotta/android/state/GeofenceStatus;)V

    :goto_0
    return-void
.end method
