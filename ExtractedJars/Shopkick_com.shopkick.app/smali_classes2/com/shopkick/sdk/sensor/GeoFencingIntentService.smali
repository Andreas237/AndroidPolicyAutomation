.class public Lcom/shopkick/sdk/sensor/GeoFencingIntentService;
.super Landroid/support/v4/app/SafeJobIntentService;
.source "GeoFencingIntentService.java"


# static fields
.field private static final JOB_ID:I = 0x64

.field private static final NULL_GEO_SENSOR_MESSAGE:Ljava/lang/String; = "GeoFenceSensorImplementation not initialized. Cannot notify listeners"

.field private static final TAG:Ljava/lang/String; = "GeoFencingIntentService"


# instance fields
.field private final workExecutor:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/support/v4/app/SafeJobIntentService;-><init>()V

    .line 32
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->workExecutor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/sensor/GeoFencingIntentService;Landroid/content/Intent;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->handleIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public static enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 40
    const-class v0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;

    const/16 v1, 0x64

    invoke-static {p0, v0, v1, p1}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method

.method private handleIntent(Landroid/content/Intent;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 73
    :try_start_0
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_3

    .line 78
    :catch_1
    :goto_0
    :try_start_1
    invoke-static {p1}, Lcom/google/android/gms/location/GeofencingEvent;->fromIntent(Landroid/content/Intent;)Lcom/google/android/gms/location/GeofencingEvent;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->hasError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error in geofence: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->getErrorCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->logError(Ljava/lang/String;)V

    if-nez v0, :cond_1

    const-string p1, "GeoFenceSensorImplementation not initialized. Cannot notify listeners"

    .line 82
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->logError(Ljava/lang/String;)V

    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->getErrorCode()I

    move-result p1

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorStatusError;->geoSensorError(I)Lcom/shopkick/sdk/sensor/SensorStatusError;

    move-result-object p1

    .line 84
    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->notifyListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :goto_1
    return-void

    .line 89
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->getTriggeringGeofences()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/location/Geofence;

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Geofence triggered: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Lcom/google/android/gms/location/Geofence;->getRequestId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->logDebug(Ljava/lang/String;)V

    if-nez v0, :cond_3

    const-string v2, "GeoFenceSensorImplementation not initialized. Cannot notify listeners"

    .line 92
    invoke-direct {p0, v2}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->logError(Ljava/lang/String;)V

    goto :goto_2

    .line 94
    :cond_3
    invoke-interface {v2}, Lcom/google/android/gms/location/Geofence;->getRequestId()Ljava/lang/String;

    move-result-object v2

    .line 95
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->getGeofenceTransition()I

    move-result v3

    .line 96
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->getTriggeringLocation()Landroid/location/Location;

    move-result-object v4

    .line 94
    invoke-virtual {v0, v2, v3, v4}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->notifyListenersOfGeoZone(Ljava/lang/String;ILandroid/location/Location;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_3
    const-string v0, "GeoFencingIntentService.onHandleIntent() failed"

    .line 100
    invoke-direct {p0, p1, v0}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->logError(Ljava/lang/Exception;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method private logDebug(Ljava/lang/String;)V
    .locals 4

    .line 117
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 119
    :catch_0
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->TAG:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private logError(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 7

    .line 135
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 137
    :catch_0
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->TAG:Ljava/lang/String;

    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private logError(Ljava/lang/String;)V
    .locals 4

    .line 126
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 128
    :catch_0
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->TAG:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method protected onHandleWork(Landroid/content/Intent;)V
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 49
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->handleIntent(Landroid/content/Intent;)V

    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->workExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFencingIntentService$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService$1;-><init>(Lcom/shopkick/sdk/sensor/GeoFencingIntentService;Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 107
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/SafeJobIntentService;->onStartCommand(Landroid/content/Intent;II)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "GeoFencingIntentService.onStartCommand() failed"

    .line 109
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->logError(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x3

    return p1
.end method
