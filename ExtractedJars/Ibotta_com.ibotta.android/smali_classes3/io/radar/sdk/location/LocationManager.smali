.class public final Lio/radar/sdk/location/LocationManager;
.super Ljava/lang/Object;
.source "LocationManager.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/location/LocationManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLocationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationManager.kt\nio/radar/sdk/location/LocationManager\n*L\n1#1,199:1\n*E\n"
.end annotation

.annotation runtime Lio/radar/shadow/javax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0008\u0010\r\u001a\u00020\u000eH\u0002J\u0008\u0010\u000f\u001a\u00020\u000eH\u0002J#\u0010\u0010\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000e0\u0012H\u0000\u00a2\u0006\u0002\u0008\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u00a2\u0006\u0002\u0008\u001bJ\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0017\u0010\u001f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010 \u001a\u00020!H\u0000\u00a2\u0006\u0002\u0008\"J\u0012\u0010#\u001a\u00020\u000e2\u0008\u0008\u0002\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lio/radar/sdk/location/LocationManager;",
        "",
        "context",
        "Landroid/content/Context;",
        "optionsRepository",
        "Lio/radar/sdk/internal/repository/OptionsRepository;",
        "repository",
        "Lio/radar/sdk/location/LocationManagerRepository;",
        "geofencingClient",
        "Lcom/google/android/gms/location/GeofencingClient;",
        "locationClient",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "(Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/location/LocationManagerRepository;Lcom/google/android/gms/location/GeofencingClient;Lcom/google/android/gms/location/FusedLocationProviderClient;)V",
        "clearGeofences",
        "",
        "clearUpdates",
        "getLocation",
        "callback",
        "Lkotlin/Function1;",
        "Landroid/location/Location;",
        "getLocation$sdk_release",
        "handleMoving",
        "moving",
        "Lio/radar/sdk/internal/Moving;",
        "handleState",
        "state",
        "Lio/radar/sdk/internal/RadarState;",
        "handleState$sdk_release",
        "handleStopped",
        "stopped",
        "Lio/radar/sdk/internal/Stopped;",
        "requestLocation",
        "force",
        "",
        "requestLocation$sdk_release",
        "startUpdates",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final Companion:Lio/radar/sdk/location/LocationManager$Companion;


# instance fields
.field private final context:Landroid/content/Context;

.field private final geofencingClient:Lcom/google/android/gms/location/GeofencingClient;

.field private final locationClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

.field private final optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

.field private final repository:Lio/radar/sdk/location/LocationManagerRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/location/LocationManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/location/LocationManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/location/LocationManager;->Companion:Lio/radar/sdk/location/LocationManager$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/location/LocationManagerRepository;Lcom/google/android/gms/location/GeofencingClient;Lcom/google/android/gms/location/FusedLocationProviderClient;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/internal/repository/OptionsRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/location/LocationManagerRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/location/GeofencingClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/google/android/gms/location/FusedLocationProviderClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lio/radar/shadow/javax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geofencingClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationClient"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/location/LocationManager;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/radar/sdk/location/LocationManager;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    iput-object p3, p0, Lio/radar/sdk/location/LocationManager;->repository:Lio/radar/sdk/location/LocationManagerRepository;

    iput-object p4, p0, Lio/radar/sdk/location/LocationManager;->geofencingClient:Lcom/google/android/gms/location/GeofencingClient;

    iput-object p5, p0, Lio/radar/sdk/location/LocationManager;->locationClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    return-void
.end method

.method public static final synthetic access$getLocationClient$p(Lio/radar/sdk/location/LocationManager;)Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 39
    iget-object p0, p0, Lio/radar/sdk/location/LocationManager;->locationClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    return-object p0
.end method

.method private final clearGeofences()V
    .locals 3

    .line 195
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->geofencingClient:Lcom/google/android/gms/location/GeofencingClient;

    .line 196
    sget-object v1, Lio/radar/sdk/internal/LocationReceiver;->Companion:Lio/radar/sdk/internal/LocationReceiver$Companion;

    iget-object v2, p0, Lio/radar/sdk/location/LocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lio/radar/sdk/internal/LocationReceiver$Companion;->getGeofencePendingIntent$sdk_release(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 195
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/GeofencingClient;->removeGeofences(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private final clearUpdates()V
    .locals 3

    .line 190
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->locationClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    sget-object v1, Lio/radar/sdk/internal/LocationReceiver;->Companion:Lio/radar/sdk/internal/LocationReceiver$Companion;

    iget-object v2, p0, Lio/radar/sdk/location/LocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lio/radar/sdk/internal/LocationReceiver$Companion;->getLocationPendingIntent$sdk_release(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    .line 191
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->repository:Lio/radar/sdk/location/LocationManagerRepository;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/radar/sdk/location/LocationManagerRepository;->setHasStarted$sdk_release(Z)V

    return-void
.end method

.method private final handleMoving(Lio/radar/sdk/internal/Moving;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 142
    invoke-static {p0, v1, v2, v0}, Lio/radar/sdk/location/LocationManager;->startUpdates$default(Lio/radar/sdk/location/LocationManager;ZILjava/lang/Object;)V

    .line 143
    invoke-direct {p0}, Lio/radar/sdk/location/LocationManager;->clearGeofences()V

    .line 145
    iget-object v1, p0, Lio/radar/sdk/location/LocationManager;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {v1}, Lio/radar/sdk/internal/repository/OptionsRepository;->getDwellDelay$sdk_release()I

    move-result v1

    const v2, 0x249f0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 146
    new-instance v2, Lcom/google/android/gms/location/Geofence$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/location/Geofence$Builder;-><init>()V

    const-string v3, "radar_dwell_geo"

    .line 147
    invoke-virtual {v2, v3}, Lcom/google/android/gms/location/Geofence$Builder;->setRequestId(Ljava/lang/String;)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object v4

    .line 148
    invoke-virtual {p1}, Lio/radar/sdk/internal/Moving;->getLocation()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-virtual {p1}, Lio/radar/sdk/internal/Moving;->getLocation()Landroid/location/Location;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    const/high16 v9, 0x42c80000    # 100.0f

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/location/Geofence$Builder;->setCircularRegion(DDF)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const-wide/16 v2, -0x1

    .line 149
    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/location/Geofence$Builder;->setExpirationDuration(J)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const/4 v2, 0x4

    .line 150
    invoke-virtual {p1, v2}, Lcom/google/android/gms/location/Geofence$Builder;->setTransitionTypes(I)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    .line 151
    invoke-virtual {p1, v1}, Lcom/google/android/gms/location/Geofence$Builder;->setLoiteringDelay(I)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    .line 152
    invoke-virtual {p1}, Lcom/google/android/gms/location/Geofence$Builder;->build()Lcom/google/android/gms/location/Geofence;

    move-result-object p1

    .line 154
    new-instance v1, Lcom/google/android/gms/location/GeofencingRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;-><init>()V

    .line 155
    invoke-virtual {v1, p1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->addGeofence(Lcom/google/android/gms/location/Geofence;)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    move-result-object p1

    .line 156
    invoke-virtual {p1, v2}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->setInitialTrigger(I)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    move-result-object p1

    .line 159
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->build()Lcom/google/android/gms/location/GeofencingRequest;

    move-result-object p1

    .line 161
    sget-object v1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v2, "Adding dwell and exit geofences"

    const/4 v3, 0x2

    invoke-static {v1, v2, v0, v3, v0}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 162
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->geofencingClient:Lcom/google/android/gms/location/GeofencingClient;

    .line 164
    sget-object v1, Lio/radar/sdk/internal/LocationReceiver;->Companion:Lio/radar/sdk/internal/LocationReceiver$Companion;

    iget-object v2, p0, Lio/radar/sdk/location/LocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lio/radar/sdk/internal/LocationReceiver$Companion;->getGeofencePendingIntent$sdk_release(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 162
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/location/GeofencingClient;->addGeofences(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private final handleStopped(Lio/radar/sdk/internal/Stopped;)V
    .locals 8

    .line 119
    invoke-direct {p0}, Lio/radar/sdk/location/LocationManager;->clearUpdates()V

    .line 120
    invoke-direct {p0}, Lio/radar/sdk/location/LocationManager;->clearGeofences()V

    .line 122
    new-instance v0, Lcom/google/android/gms/location/Geofence$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/location/Geofence$Builder;-><init>()V

    const-string v1, "radar_exit_geo"

    .line 123
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/Geofence$Builder;->setRequestId(Ljava/lang/String;)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object v2

    .line 124
    invoke-virtual {p1}, Lio/radar/sdk/internal/Stopped;->getLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p1}, Lio/radar/sdk/internal/Stopped;->getLocation()Landroid/location/Location;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    const/high16 v7, 0x42c80000    # 100.0f

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/location/Geofence$Builder;->setCircularRegion(DDF)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const-wide/16 v0, -0x1

    .line 125
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/Geofence$Builder;->setExpirationDuration(J)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const/4 v0, 0x2

    .line 126
    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/Geofence$Builder;->setTransitionTypes(I)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lcom/google/android/gms/location/Geofence$Builder;->build()Lcom/google/android/gms/location/Geofence;

    move-result-object p1

    .line 129
    new-instance v1, Lcom/google/android/gms/location/GeofencingRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;-><init>()V

    .line 130
    invoke-virtual {v1, p1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->addGeofence(Lcom/google/android/gms/location/Geofence;)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    move-result-object p1

    .line 131
    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->setInitialTrigger(I)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->build()Lcom/google/android/gms/location/GeofencingRequest;

    move-result-object p1

    .line 134
    sget-object v1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v2, "Adding exit geofence"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, v0, v3}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->geofencingClient:Lcom/google/android/gms/location/GeofencingClient;

    .line 137
    sget-object v1, Lio/radar/sdk/internal/LocationReceiver;->Companion:Lio/radar/sdk/internal/LocationReceiver$Companion;

    iget-object v2, p0, Lio/radar/sdk/location/LocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lio/radar/sdk/internal/LocationReceiver$Companion;->getGeofencePendingIntent$sdk_release(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 135
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/location/GeofencingClient;->addGeofences(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static bridge synthetic requestLocation$sdk_release$default(Lio/radar/sdk/location/LocationManager;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 68
    :cond_0
    invoke-virtual {p0, p1}, Lio/radar/sdk/location/LocationManager;->requestLocation$sdk_release(Z)V

    return-void
.end method

.method private final startUpdates(Z)V
    .locals 5

    if-nez p1, :cond_0

    .line 169
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->repository:Lio/radar/sdk/location/LocationManagerRepository;

    invoke-virtual {v0}, Lio/radar/sdk/location/LocationManagerRepository;->getHasStarted$sdk_release()Z

    move-result v0

    if-nez v0, :cond_2

    .line 170
    :cond_0
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getUpdateInterval$sdk_release()J

    move-result-wide v0

    const-wide/32 v2, 0x57e40

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 171
    new-instance v2, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v2}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    const/16 v3, 0x66

    .line 172
    invoke-virtual {v2, v3}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    const-wide/32 v3, 0x249f0

    .line 173
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 174
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    const-wide/32 v0, 0xdbba0

    .line 175
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setMaxWaitTime(J)Lcom/google/android/gms/location/LocationRequest;

    .line 177
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->locationClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    .line 179
    sget-object v1, Lio/radar/sdk/internal/LocationReceiver;->Companion:Lio/radar/sdk/internal/LocationReceiver$Companion;

    iget-object v3, p0, Lio/radar/sdk/location/LocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v3}, Lio/radar/sdk/internal/LocationReceiver$Companion;->getLocationPendingIntent$sdk_release(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 177
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    .line 181
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->repository:Lio/radar/sdk/location/LocationManagerRepository;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/radar/sdk/location/LocationManagerRepository;->setHasStarted$sdk_release(Z)V

    if-eqz p1, :cond_1

    .line 183
    iget-object p1, p0, Lio/radar/sdk/location/LocationManager;->locationClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {p1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->flushLocations()Lcom/google/android/gms/tasks/Task;

    .line 185
    :cond_1
    sget-object p1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v0, "Requesting fresh location"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method static bridge synthetic startUpdates$default(Lio/radar/sdk/location/LocationManager;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 168
    :cond_0
    invoke-direct {p0, p1}, Lio/radar/sdk/location/LocationManager;->startUpdates(Z)V

    return-void
.end method


# virtual methods
.method public final getLocation$sdk_release(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/location/Location;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    const/16 v1, 0x64

    .line 85
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    const-wide/16 v1, 0x1388

    .line 86
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 89
    new-instance v1, Lio/radar/sdk/location/LocationManager$getLocation$listener$1;

    invoke-direct {v1, p0, p1}, Lio/radar/sdk/location/LocationManager$getLocation$listener$1;-><init>(Lio/radar/sdk/location/LocationManager;Lkotlin/jvm/functions/Function1;)V

    .line 95
    iget-object p1, p0, Lio/radar/sdk/location/LocationManager;->locationClient:Lcom/google/android/gms/location/FusedLocationProviderClient;

    check-cast v1, Lcom/google/android/gms/location/LocationCallback;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final handleState$sdk_release(Lio/radar/sdk/internal/RadarState;)V
    .locals 1
    .param p1    # Lio/radar/sdk/internal/RadarState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getBackgroundTracking$sdk_release()Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-direct {p0}, Lio/radar/sdk/location/LocationManager;->clearUpdates()V

    .line 109
    invoke-direct {p0}, Lio/radar/sdk/location/LocationManager;->clearGeofences()V

    return-void

    .line 113
    :cond_0
    instance-of v0, p1, Lio/radar/sdk/internal/Stopped;

    if-eqz v0, :cond_1

    check-cast p1, Lio/radar/sdk/internal/Stopped;

    invoke-direct {p0, p1}, Lio/radar/sdk/location/LocationManager;->handleStopped(Lio/radar/sdk/internal/Stopped;)V

    goto :goto_0

    .line 114
    :cond_1
    instance-of v0, p1, Lio/radar/sdk/internal/Moving;

    if-eqz v0, :cond_2

    check-cast p1, Lio/radar/sdk/internal/Moving;

    invoke-direct {p0, p1}, Lio/radar/sdk/location/LocationManager;->handleMoving(Lio/radar/sdk/internal/Moving;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final requestLocation$sdk_release(Z)V
    .locals 1

    if-nez p1, :cond_1

    .line 69
    iget-object v0, p0, Lio/radar/sdk/location/LocationManager;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getBackgroundTracking$sdk_release()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    iget-object p1, p0, Lio/radar/sdk/location/LocationManager;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {p1}, Lio/radar/sdk/internal/repository/OptionsRepository;->getBackgroundTracking$sdk_release()Z

    move-result p1

    if-nez p1, :cond_2

    .line 73
    invoke-direct {p0}, Lio/radar/sdk/location/LocationManager;->clearUpdates()V

    .line 74
    invoke-direct {p0}, Lio/radar/sdk/location/LocationManager;->clearGeofences()V

    goto :goto_1

    .line 70
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lio/radar/sdk/location/LocationManager;->startUpdates(Z)V

    :cond_2
    :goto_1
    return-void
.end method
