.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/SensorImplementation;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;
    }
.end annotation


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

.field private static final InstanceLock:Ljava/lang/Object;


# instance fields
.field private final callbacksExecutor:Ljava/util/concurrent/Executor;

.field private final configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

.field private final context:Landroid/content/Context;

.field private final googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private volatile lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

.field private volatile locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

.field private final locationListenerLock:Ljava/lang/Object;

.field private locationRequest:Lcom/google/android/gms/location/LocationRequest;

.field private readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private volatile shouldListenAfterConnect:Z

.field private statusListener:Lcom/shopkick/sdk/sensor/StatusListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->callbacksExecutor:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 89
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 90
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

    .line 92
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListenerLock:Ljava/lang/Object;

    .line 93
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->shouldListenAfterConnect:Z

    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    .line 65
    sget-object v0, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    invoke-static {p1, v0, p0, p0}, Lcom/shopkick/sdk/sensor/GoogleApiClientProvider;->createGoogleApiClient(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 66
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 69
    new-instance p1, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {p1}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    .line 70
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    const/16 p2, 0x66

    invoke-virtual {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 71
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 72
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    const-wide/32 v0, 0x927c0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 75
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->ensureGoogleApiClientConnected()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Landroid/content/Context;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Landroid/content/Context;)Z
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->handleLocationPermissionsCheck(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/location/LocationRequest;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/LocationServicesReading;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

    return-object p0
.end method

.method static synthetic access$602(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/shopkick/sdk/sensor/LocationServicesReading;)Lcom/shopkick/sdk/sensor/LocationServicesReading;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

    return-object p1
.end method

.method static synthetic access$700(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/core/ConfigurationProvider;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/ReadingListener;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->callbacksExecutor:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method private ensureGoogleApiClientConnected()V
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    :cond_0
    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;
    .locals 2

    .line 43
    sget-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    if-eqz v0, :cond_0

    .line 44
    sget-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    return-object v0

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private handleLocationPermissionsCheck(Landroid/content/Context;)Z
    .locals 2

    .line 343
    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasCoarseLocation(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasFineLocation(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 349
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 350
    sget-object v1, Lcom/shopkick/sdk/sensor/SensorStatusError;->PERMISSION_DENIED_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-interface {p1, v0, v1}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    if-eqz p0, :cond_2

    .line 54
    sget-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    if-nez v0, :cond_1

    .line 55
    sget-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 56
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    if-nez v1, :cond_0

    .line 57
    new-instance v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    .line 59
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

    .line 53
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private startListening(Lcom/google/android/gms/location/LocationRequest;)V
    .locals 3

    .line 272
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->handleLocationPermissionsCheck(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    if-nez v0, :cond_2

    .line 274
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListenerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 275
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    if-nez v1, :cond_1

    .line 276
    new-instance v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;)V

    iput-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    .line 278
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v2, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;

    invoke-direct {v2, p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 297
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 299
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method private stopListening()V
    .locals 4

    .line 306
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->handleLocationPermissionsCheck(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    if-eqz v0, :cond_2

    .line 308
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListenerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 309
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    if-eqz v1, :cond_1

    .line 310
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    .line 311
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v3, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;

    invoke-direct {v3, p0, v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 325
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    const/4 v1, 0x0

    .line 326
    iput-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    .line 328
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    return-void
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->handleLocationPermissionsCheck(Landroid/content/Context;)Z

    .line 167
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 171
    :cond_0
    new-instance v1, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-direct {v1, v0, v2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesReading;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    return-object v1
.end method

.method public initiateLocationUpdate()V
    .locals 5

    .line 229
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "Location update initiated."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 256
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$2;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$2;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 264
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 4

    .line 181
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->handleLocationPermissionsCheck(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 183
    :cond_0
    sget-object p1, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {p1, v0}, Lcom/google/android/gms/location/FusedLocationProviderApi;->getLastLocation(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 185
    new-instance v0, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-direct {v0, v1, p1, v2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesReading;Landroid/location/Location;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

    .line 188
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz p1, :cond_2

    .line 189
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/LocationServicesReading;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 191
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-interface {p1, v0, v0}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    goto :goto_0

    .line 193
    :cond_1
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    new-instance v2, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->configurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-direct {v2, p1, v3}, Lcom/shopkick/sdk/sensor/LocationServicesReading;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesReading;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    invoke-interface {v1, v0, v2}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    .line 199
    :cond_2
    :goto_0
    iget-boolean p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->shouldListenAfterConnect:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    .line 200
    iput-boolean p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->shouldListenAfterConnect:Z

    .line 201
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->startListening(Lcom/google/android/gms/location/LocationRequest;)V

    :cond_3
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .line 221
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 222
    sget-object v1, Lcom/shopkick/sdk/sensor/SensorStatusError;->GOOGLE_PLAY_SERVICES_CONNECTION_FAILED:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-interface {p1, v0, v1}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :cond_0
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method

.method public removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    return-void
.end method

.method setLocationRequest(Lcom/google/android/gms/location/LocationRequest;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 114
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    .line 115
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->stop()V

    .line 116
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->start()Z

    return-void

    .line 113
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'locationRequest\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 153
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->handleLocationPermissionsCheck(Landroid/content/Context;)Z

    return-void
.end method

.method public setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 160
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->context:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->handleLocationPermissionsCheck(Landroid/content/Context;)Z

    return-void
.end method

.method public start()Z
    .locals 2

    .line 124
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->ensureGoogleApiClientConnected()V

    .line 125
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->startListening(Lcom/google/android/gms/location/LocationRequest;)V

    return v1

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    iput-boolean v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->shouldListenAfterConnect:Z

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x0

    .line 145
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->shouldListenAfterConnect:Z

    .line 146
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->stopListening()V

    return-void
.end method
