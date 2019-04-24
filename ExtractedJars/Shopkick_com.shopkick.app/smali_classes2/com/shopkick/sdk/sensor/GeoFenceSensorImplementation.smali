.class public Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;
.super Ljava/lang/Object;
.source "GeoFenceSensorImplementation.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/SensorImplementation;
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/sensor/SensorImplementation;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final LOITERING_DELAY_MS:I = 0x1d4c0

.field private static final TAG:Ljava/lang/String; = "GeoFenceSensorImplementation"


# instance fields
.field private final context:Landroid/content/Context;

.field private volatile enabled:Z

.field private volatile lastReading:Lcom/shopkick/sdk/sensor/GeoFenceReading;

.field listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private volatile readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private sensorListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/sensor/SensorStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field private volatile statusListener:Lcom/shopkick/sdk/sensor/StatusListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 42
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 43
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/GeoFenceReading;

    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->context:Landroid/content/Context;

    .line 82
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->sensorListeners:Ljava/util/Set;

    .line 83
    new-instance v0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-direct {v0}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    .line 86
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 85
    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 91
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getRegisteredGeoFences()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 92
    iget-object p3, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {p3, p2}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->registerGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private createGeofence(Lcom/shopkick/sdk/sensor/GeoFence;)Lcom/google/android/gms/location/Geofence;
    .locals 8

    .line 214
    new-instance v0, Lcom/google/android/gms/location/Geofence$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/location/Geofence$Builder;-><init>()V

    .line 215
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/Geofence$Builder;->setRequestId(Ljava/lang/String;)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object v2

    iget-wide v3, p1, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    iget-wide v5, p1, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    iget p1, p1, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    int-to-float v7, p1

    .line 216
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/location/Geofence$Builder;->setCircularRegion(DDF)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const/4 v0, 0x7

    .line 217
    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/Geofence$Builder;->setTransitionTypes(I)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const v0, 0x1d4c0

    .line 220
    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/Geofence$Builder;->setLoiteringDelay(I)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    const-wide/16 v0, -0x1

    .line 221
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/Geofence$Builder;->setExpirationDuration(J)Lcom/google/android/gms/location/Geofence$Builder;

    move-result-object p1

    .line 222
    invoke-virtual {p1}, Lcom/google/android/gms/location/Geofence$Builder;->build()Lcom/google/android/gms/location/Geofence;

    move-result-object p1

    return-object p1
.end method

.method public static getInstance()Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 48
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    if-eqz v0, :cond_0

    .line 51
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    return-object v0

    .line 49
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    .line 60
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    if-nez v0, :cond_1

    .line 61
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 62
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    if-nez v1, :cond_0

    .line 63
    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    .line 65
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 7

    .line 189
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "GeoFenceSensorImplementation.addGeoFence() [%1$s]"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->isGeoFenceRegistered(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 192
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "GeoFenceSensorImplementation.addGeoFence() GeoFence already registered [%1$s]"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v6

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->registerGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    .line 198
    iget-boolean v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->enabled:Z

    if-eqz v0, :cond_1

    .line 199
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registerGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    :cond_1
    return-void
.end method

.method public addGeoFenceReadingListener(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoReadingListener;)V
    .locals 6

    .line 163
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 164
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "GeoFenceSensorImplementation.addGeoFenceReadingListener() [%1$s]"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->addListener(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoReadingListener;)V

    .line 166
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    return-void
.end method

.method public addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 1
    .param p1    # Lcom/shopkick/sdk/sensor/SensorStatusListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 116
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->sensorListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/GeoFenceReading;

    return-object v0
.end method

.method notifyListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    .locals 9

    .line 283
    iget-boolean v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->enabled:Z

    if-nez v0, :cond_0

    return-void

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->sensorListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/SensorStatusListener;

    .line 288
    :try_start_0
    invoke-interface {v1, p0, p1}, Lcom/shopkick/sdk/sensor/SensorStatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    .line 290
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v7, "GeoFenceSensorImplementation.notifyListenersOfGeoZone() Error in callback"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 297
    :cond_1
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz v0, :cond_2

    .line 299
    :try_start_1
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    move-object v6, p1

    .line 301
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object p1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v7, "GeoFenceSensorImplementation.notifyListenersOfGeoZone() Error in callback"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method notifyListenersOfGeoZone(Ljava/lang/String;ILandroid/location/Location;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    .line 234
    iget-boolean v3, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->enabled:Z

    if-nez v3, :cond_0

    return-void

    .line 237
    :cond_0
    iget-object v3, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {v3, v0}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->getGeoFence(Ljava/lang/String;)Lcom/shopkick/sdk/sensor/GeoFence;

    move-result-object v3

    .line 238
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v7, "GeoFenceSensorImplementation.notifyListenersOfGeoZone() [geozoneId:%1$s transitionType:%2$d]"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    .line 241
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x1

    aput-object v10, v8, v11

    .line 238
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-nez v3, :cond_1

    .line 244
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "GeoFenceSensorImplementation.notifyListenersOfGeoZone() Geofence null, listener not registered"

    new-array v6, v9, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->unregisterGeoFence(Ljava/lang/String;)V

    return-void

    .line 249
    :cond_1
    iget-object v0, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {v0, v3}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->getListeners(Lcom/shopkick/sdk/sensor/GeoFence;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "GeoFenceSensorImplementation.notifyListenersOfGeoZone() No listeners for geofence [%1$s]"

    new-array v7, v11, [Ljava/lang/Object;

    aput-object v3, v7, v9

    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 254
    :cond_2
    iget-object v0, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {v0, v3}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->getListeners(Lcom/shopkick/sdk/sensor/GeoFence;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/GeoReadingListener;

    move/from16 v5, p2

    .line 256
    :try_start_0
    invoke-interface {v0, v1, v3, v2, v5}, Lcom/shopkick/sdk/sensor/GeoReadingListener;->onReadingChanged(Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;Lcom/shopkick/sdk/sensor/GeoFence;Landroid/location/Location;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v6, v0

    .line 258
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v12

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v13

    const-string v16, "GeoFenceSensorImplementation.notifyListenersOfGeoZone() Error in callback [%1$s]"

    new-array v0, v11, [Ljava/lang/Object;

    aput-object v3, v0, v9

    move-object v15, v6

    move-object/from16 v17, v0

    invoke-virtual/range {v12 .. v17}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move/from16 v5, p2

    .line 266
    new-instance v0, Lcom/shopkick/sdk/sensor/GeoFenceReading;

    iget-object v4, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/GeoFenceReading;

    .line 268
    invoke-static/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->getTransitionTypeFromNumericValue(I)Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object v5

    invoke-direct {v0, v4, v3, v5, v2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceReading;Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;Landroid/location/Location;)V

    .line 270
    iput-object v0, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/GeoFenceReading;

    .line 271
    iget-object v2, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz v2, :cond_4

    .line 273
    :try_start_1
    iget-object v2, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    const/4 v3, 0x0

    invoke-interface {v2, v3, v0}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v13, v0

    .line 275
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v10

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v11

    const-string v14, "GeoFenceSensorImplementation.notifyListenersOfGeoZone() Error in callback"

    new-array v15, v9, [Ljava/lang/Object;

    invoke-virtual/range {v10 .. v15}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/Result;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->onResult(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/common/api/Status;)V
    .locals 6
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 146
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "GeoFenceSensorImplementation.onResult() [%1$s]"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result p1

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorStatusError;->geoSensorError(I)Lcom/shopkick/sdk/sensor/SensorStatusError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->notifyListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :cond_0
    return-void
.end method

.method public removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->unregisterGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    .line 208
    iget-boolean v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->enabled:Z

    if-eqz v0, :cond_0

    .line 209
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->unregisterGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    :cond_0
    return-void
.end method

.method public removeGeoFenceReadingListener(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoReadingListener;)V
    .locals 1
    .param p1    # Lcom/shopkick/sdk/sensor/GeoFence;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 177
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->removeListener(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoReadingListener;)V

    .line 178
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->listenerManager:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;

    invoke-virtual {p2, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->getListeners(Lcom/shopkick/sdk/sensor/GeoFence;)Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 180
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    :cond_0
    return-void
.end method

.method public removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 1
    .param p1    # Lcom/shopkick/sdk/sensor/SensorStatusListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 122
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->sensorListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    return-void
.end method

.method public setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 1

    .line 134
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 135
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-void
.end method

.method public start()Z
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasFineLocation(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->PERMISSION_DENIED_FINE_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-virtual {p0, v0}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->notifyListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    .line 103
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->enabled:Z

    return v0
.end method

.method public stop()V
    .locals 1

    .line 109
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->unregisterGeoFences()V

    const/4 v0, 0x0

    .line 110
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->enabled:Z

    return-void
.end method
