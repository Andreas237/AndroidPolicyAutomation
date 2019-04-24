.class public Lcom/shopkick/sdk/presence/LocationManager;
.super Ljava/lang/Object;
.source "LocationManager.java"


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/presence/LocationManager; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final LOCATION_PROVIDER_TAG:Ljava/lang/String; = "SDK Persistence"

.field private static final MAX_LOCATION_READING_VALID_TIME:J = 0x124f80L

.field private static final PERSISTED_ACCURACY_KEY:Ljava/lang/String; = "persisted_accuracy"

.field private static final PERSISTED_LATITUDE_KEY:Ljava/lang/String; = "persisted_latitude"

.field private static final PERSISTED_LONGITUDE_KEY:Ljava/lang/String; = "persisted_longitude"

.field private static final SHARED_PREFS_NAME:Ljava/lang/String; = "LocationManagerPrefs"

.field private static volatile numInterruptions:J

.field private static volatile startTimeLastCallToGetLocation:J


# instance fields
.field private allowNetworkActivity:Z

.field private final callbacksExecutor:Ljava/util/concurrent/Executor;

.field private configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

.field private final context:Landroid/content/Context;

.field private final googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/presence/LocationUpdateListener;",
            ">;"
        }
    .end annotation
.end field

.field private final initiateUpdateListenersLock:Ljava/lang/Object;

.field private volatile location:Landroid/location/Location;

.field private final locationReadingHistory:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field private final locationRequest:Lcom/google/android/gms/location/LocationRequest;

.field private final locationServicesSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

.field private final locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/presence/LocationUpdateListener;",
            ">;"
        }
    .end annotation
.end field

.field private final locationUpdateListenersLock:Ljava/lang/Object;

.field private final readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private final sharedPreferences:Landroid/content/SharedPreferences;

.field private final statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

.field private final updateLocationReadingHistoryLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/presence/LocationManager;->InstanceLock:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 40
    sput-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    .line 41
    sput-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->numInterruptions:J

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 4

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListenersLock:Ljava/lang/Object;

    .line 104
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->location:Landroid/location/Location;

    .line 110
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListenersLock:Ljava/lang/Object;

    .line 111
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 112
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->callbacksExecutor:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    .line 119
    iput-boolean v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->allowNetworkActivity:Z

    .line 120
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationReadingHistory:Ljava/util/ArrayList;

    .line 121
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->updateLocationReadingHistoryLock:Ljava/lang/Object;

    .line 356
    new-instance v1, Lcom/shopkick/sdk/presence/LocationManager$2;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/presence/LocationManager$2;-><init>(Lcom/shopkick/sdk/presence/LocationManager;)V

    iput-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 370
    new-instance v1, Lcom/shopkick/sdk/presence/LocationManager$3;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/presence/LocationManager$3;-><init>(Lcom/shopkick/sdk/presence/LocationManager;)V

    iput-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 77
    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/sensor/SensorManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 78
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object p2

    const-class v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    iget-object v2, p0, Lcom/shopkick/sdk/presence/LocationManager;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    iget-object v3, p0, Lcom/shopkick/sdk/presence/LocationManager;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    invoke-virtual {p2, v1, v2, v3}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object p2

    check-cast p2, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    iput-object p2, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationServicesSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    .line 84
    iget-object p2, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationServicesSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->MEDIUM:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {p2, v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->setPowerAndAccuracyProfile(Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;)V

    .line 85
    iget-object p2, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationServicesSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->getLastReading()Lcom/shopkick/sdk/sensor/LocationServicesReading;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/shopkick/sdk/presence/LocationManager;->handleLocationServicesReading(Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    .line 87
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p2

    const/16 v1, 0x64

    .line 88
    invoke-virtual {p2, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p2

    const-wide/16 v1, 0x3e8

    .line 89
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p2

    .line 90
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    .line 92
    iput-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->context:Landroid/content/Context;

    .line 93
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->context:Landroid/content/Context;

    const-string p2, "LocationManagerPrefs"

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 95
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->context:Landroid/content/Context;

    sget-object p2, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/GoogleApiClientProvider;->createGoogleApiClient(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 97
    iput-object p3, p0, Lcom/shopkick/sdk/presence/LocationManager;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 99
    invoke-direct {p0}, Lcom/shopkick/sdk/presence/LocationManager;->loadCurrentLocationFromDisk()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/presence/LocationManager;)Landroid/content/SharedPreferences;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/shopkick/sdk/presence/LocationManager;->sharedPreferences:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/presence/LocationManager;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/presence/LocationManager;->handleLocationServicesReading(Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/presence/LocationManager;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/presence/LocationManager;->handleLocationUpdate(Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/presence/LocationManager;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/sdk/presence/LocationManager;->removeOldReadingsFromHistory()V

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/presence/LocationManager;
    .locals 2

    .line 48
    sget-object v0, Lcom/shopkick/sdk/presence/LocationManager;->Instance:Lcom/shopkick/sdk/presence/LocationManager;

    if-eqz v0, :cond_0

    .line 49
    sget-object v0, Lcom/shopkick/sdk/presence/LocationManager;->Instance:Lcom/shopkick/sdk/presence/LocationManager;

    return-object v0

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private handleLocationServicesReading(Lcom/shopkick/sdk/sensor/LocationServicesReading;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 224
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->location:Landroid/location/Location;

    .line 225
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 226
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->location:Landroid/location/Location;

    invoke-static {v1}, Lcom/shopkick/sdk/presence/LocationManager;->makeCopyOfLocation(Landroid/location/Location;)Landroid/location/Location;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/shopkick/sdk/presence/LocationUpdateListener;->onLocationUpdated(Landroid/location/Location;)V

    goto :goto_0

    .line 229
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/sdk/presence/LocationManager;->saveCurrentLocationToDisk()V

    return-void
.end method

.method private handleLocationUpdate(Lcom/shopkick/sdk/sensor/LocationServicesReading;)V
    .locals 13

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_2

    .line 294
    sget-wide v2, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    cmp-long v2, v2, v0

    const/4 v3, 0x0

    if-lez v2, :cond_0

    .line 295
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "LocationManager: handleLocationUpdate callback  duration:[%1$d] interruptions:[%2$d]"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sget-wide v10, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    sub-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v3

    const/4 v8, 0x1

    sget-wide v9, Lcom/shopkick/sdk/presence/LocationManager;->numInterruptions:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v2, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 297
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->location:Landroid/location/Location;

    .line 298
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 299
    iget-object v2, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListenersLock:Ljava/lang/Object;

    monitor-enter v2

    .line 300
    :try_start_0
    iget-object v4, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/presence/LocationUpdateListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    :try_start_1
    iget-object v6, p0, Lcom/shopkick/sdk/presence/LocationManager;->location:Landroid/location/Location;

    invoke-static {v6}, Lcom/shopkick/sdk/presence/LocationManager;->makeCopyOfLocation(Landroid/location/Location;)Landroid/location/Location;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/shopkick/sdk/presence/LocationUpdateListener;->onLocationUpdated(Landroid/location/Location;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v6

    move-object v10, v6

    .line 304
    :try_start_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v7

    sget-object v6, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v8

    const-string v11, "LocationManager: LocationUpdateListener.onLocationUpdated() callback failed."

    new-array v12, v3, [Ljava/lang/Object;

    invoke-virtual/range {v7 .. v12}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    :goto_1
    invoke-virtual {p1, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 309
    :cond_1
    iget-object v3, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->removeAll(Ljava/util/Collection;)Z

    .line 310
    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 312
    :cond_2
    :goto_2
    sput-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->numInterruptions:J

    .line 313
    sput-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    return-void
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    .line 65
    sget-object v0, Lcom/shopkick/sdk/presence/LocationManager;->Instance:Lcom/shopkick/sdk/presence/LocationManager;

    if-nez v0, :cond_1

    .line 66
    sget-object v0, Lcom/shopkick/sdk/presence/LocationManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 67
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/presence/LocationManager;->Instance:Lcom/shopkick/sdk/presence/LocationManager;

    if-nez v1, :cond_0

    .line 68
    new-instance v1, Lcom/shopkick/sdk/presence/LocationManager;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/presence/LocationManager;->Instance:Lcom/shopkick/sdk/presence/LocationManager;

    .line 70
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

    .line 62
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'settings\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 61
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appStateProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 60
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private loadCurrentLocationFromDisk()V
    .locals 6

    .line 181
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "LocationManager: Loading current location from disk."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "persisted_latitude"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 183
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "persisted_longitude"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 184
    iget-object v3, p0, Lcom/shopkick/sdk/presence/LocationManager;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v4, "persisted_accuracy"

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    .line 188
    :cond_0
    new-instance v3, Landroid/location/Location;

    const-string v4, "SDK Persistence"

    invoke-direct {v3, v4}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 189
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Landroid/location/Location;->setLatitude(D)V

    .line 190
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    .line 191
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v3, v0}, Landroid/location/Location;->setAccuracy(F)V

    .line 192
    iput-object v3, p0, Lcom/shopkick/sdk/presence/LocationManager;->location:Landroid/location/Location;

    .line 193
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationServicesSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->initiateLocationUpdate()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private static makeCopyOfLocation(Landroid/location/Location;)Landroid/location/Location;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 153
    :cond_0
    new-instance v0, Landroid/location/Location;

    invoke-direct {v0, p0}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    return-object v0
.end method

.method private removeOldReadingsFromHistory()V
    .locals 8

    .line 335
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->updateLocationReadingHistoryLock:Ljava/lang/Object;

    monitor-enter v0

    .line 336
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 337
    iget-object v2, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationReadingHistory:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/Location;

    .line 338
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x124f80

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    .line 339
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 342
    :cond_1
    iget-object v2, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationReadingHistory:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 343
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private saveCurrentLocationToDisk()V
    .locals 2

    .line 161
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->callbacksExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/shopkick/sdk/presence/LocationManager$1;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/presence/LocationManager$1;-><init>(Lcom/shopkick/sdk/presence/LocationManager;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public addLocationReadingToHistory(Landroid/location/Location;)V
    .locals 2

    .line 347
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->updateLocationReadingHistoryLock:Ljava/lang/Object;

    monitor-enter v0

    .line 348
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationReadingHistory:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V
    .locals 2

    .line 198
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 199
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 200
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 201
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 203
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public allowNetworkActivity()V
    .locals 1

    const/4 v0, 0x1

    .line 128
    iput-boolean v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->allowNetworkActivity:Z

    return-void
.end method

.method public cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 253
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 254
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 256
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public disallowNetworkActivity()V
    .locals 1

    const/4 v0, 0x0

    .line 135
    iput-boolean v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->allowNetworkActivity:Z

    return-void
.end method

.method public getCurrentLocation()Landroid/location/Location;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->location:Landroid/location/Location;

    invoke-static {v0}, Lcom/shopkick/sdk/presence/LocationManager;->makeCopyOfLocation(Landroid/location/Location;)Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public getLocationOrTriggerUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V
    .locals 13

    if-eqz p1, :cond_3

    .line 269
    sget-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 270
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    goto :goto_0

    .line 272
    :cond_0
    sget-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->numInterruptions:J

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    sput-wide v0, Lcom/shopkick/sdk/presence/LocationManager;->numInterruptions:J

    .line 274
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 276
    sget-wide v4, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    cmp-long v1, v4, v2

    if-lez v1, :cond_1

    .line 277
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "LocationManager: getLocationOrTriggerUpdate cached  duration:[%1$d] interruptions:[%2$d]"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sget-wide v11, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    sub-long/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    sget-wide v9, Lcom/shopkick/sdk/presence/LocationManager;->numInterruptions:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v1, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :cond_1
    sput-wide v2, Lcom/shopkick/sdk/presence/LocationManager;->numInterruptions:J

    .line 280
    sput-wide v2, Lcom/shopkick/sdk/presence/LocationManager;->startTimeLastCallToGetLocation:J

    .line 281
    invoke-interface {p1, v0}, Lcom/shopkick/sdk/presence/LocationUpdateListener;->onLocationUpdated(Landroid/location/Location;)V

    goto :goto_1

    .line 284
    :cond_2
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :goto_1
    return-void

    .line 267
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "LocationManager: LocationUpdateListener cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getLocationReadingHistory()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    .line 321
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 322
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->updateLocationReadingHistoryLock:Ljava/lang/Object;

    monitor-enter v1

    .line 323
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationReadingHistory:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/Location;

    .line 324
    new-instance v4, Landroid/location/Location;

    invoke-direct {v4, v3}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    .line 325
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 327
    :cond_0
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V
    .locals 2

    .line 237
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 238
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 239
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 240
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->initiateUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 242
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 244
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationServicesSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->initiateLocationUpdate()V

    return-void
.end method

.method public removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V
    .locals 2

    .line 209
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    iget-object v0, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 211
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 212
    iget-object v1, p0, Lcom/shopkick/sdk/presence/LocationManager;->locationUpdateListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 214
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
