.class public Lcom/shopkick/sdk/sensor/SensorManager;
.super Ljava/lang/Object;
.source "SensorManager.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/BleScanListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;,
        Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;,
        Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;,
        Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;
    }
.end annotation


# static fields
.field private static final BLE_SCAN_TIMEOUT:Ljava/lang/Long;

.field private static volatile Instance:Lcom/shopkick/sdk/sensor/SensorManager; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final LocationRequestHigh:Lcom/google/android/gms/location/LocationRequest;

.field private static final LocationRequestLow:Lcom/google/android/gms/location/LocationRequest;

.field private static final LocationRequestMedium:Lcom/google/android/gms/location/LocationRequest;

.field public static final MAX_BLE_HISTORY_MILLISECONDS:J = 0x1b7740L


# instance fields
.field private allowNetworkActivity:Z

.field private volatile apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

.field private final beaconsPhonedHome:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final bleScanLock:Ljava/lang/Object;

.field private final bleUnsupported:Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;

.field private final context:Landroid/content/Context;

.field private volatile epochOfLastBleScan:Ljava/lang/Long;

.field private final epochTimeToObservedBeacon:Ljava/util/concurrent/ConcurrentSkipListMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListMap<",
            "Ljava/lang/Long;",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation
.end field

.field private final geoFencesCache:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation
.end field

.field private final geoFencesCacheLock:Ljava/lang/Object;

.field private final implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/sensor/SensorImplementation;",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/shopkick/sdk/sensor/SensorBase;",
            ">;>;"
        }
    .end annotation
.end field

.field private final implementationToOpenSensorsLock:Ljava/lang/Object;

.field private final observedBeaconDataHashesCache:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final observedBeaconDataHashesCacheLock:Ljava/lang/Object;

.field private final observedIBeaconAddressesCache:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final observedIBeaconAddressesCacheLock:Ljava/lang/Object;

.field private final phoneHomeResponseHandler:Lcom/shopkick/fetchers/api/IAPICallback;

.field private final sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/sensor/SensorEventsListener;",
            ">;"
        }
    .end annotation
.end field

.field private final sensorEventsListenersLock:Ljava/lang/Object;

.field private final sensorFactory:Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;

.field private final sensorImplementationFactory:Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;

.field private final settings:Lcom/shopkick/sdk/core/ConfigurationProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 52
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestHigh:Lcom/google/android/gms/location/LocationRequest;

    .line 53
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestMedium:Lcom/google/android/gms/location/LocationRequest;

    .line 54
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestLow:Lcom/google/android/gms/location/LocationRequest;

    .line 63
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestHigh:Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 64
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestHigh:Lcom/google/android/gms/location/LocationRequest;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 66
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestMedium:Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 67
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestMedium:Lcom/google/android/gms/location/LocationRequest;

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 68
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestMedium:Lcom/google/android/gms/location/LocationRequest;

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 70
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestLow:Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    const/4 v0, 0x0

    .line 105
    sput-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->Instance:Lcom/shopkick/sdk/sensor/SensorManager;

    .line 106
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->InstanceLock:Ljava/lang/Object;

    const-wide/16 v0, 0x1b58

    .line 790
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->BLE_SCAN_TIMEOUT:Ljava/lang/Long;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensorsLock:Ljava/lang/Object;

    .line 74
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorManager$1;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorFactory:Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;

    .line 77
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorManager$1;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorImplementationFactory:Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;

    .line 79
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->geoFencesCacheLock:Ljava/lang/Object;

    .line 80
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->geoFencesCache:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 82
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListenersLock:Ljava/lang/Object;

    .line 83
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 86
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->beaconsPhonedHome:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 89
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedBeaconDataHashesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 90
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedBeaconDataHashesCacheLock:Ljava/lang/Object;

    .line 92
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedIBeaconAddressesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 93
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedIBeaconAddressesCacheLock:Ljava/lang/Object;

    .line 99
    iput-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    const/4 v0, 0x0

    .line 101
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->allowNetworkActivity:Z

    .line 739
    new-instance v0, Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;

    invoke-direct {v0}, Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->bleUnsupported:Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;

    .line 745
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorManager$2;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/sensor/SensorManager$2;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->phoneHomeResponseHandler:Lcom/shopkick/fetchers/api/IAPICallback;

    .line 784
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochTimeToObservedBeacon:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 787
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->bleScanLock:Ljava/lang/Object;

    .line 793
    iput-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochOfLastBleScan:Ljava/lang/Long;

    .line 140
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 142
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/sensor/SensorManager$1;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;)V

    invoke-static {v0, p1, v1}, Lcom/shopkick/logging/LoggerManager;->initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    .line 201
    :cond_0
    invoke-static {p1}, Lcom/shopkick/sdk/api/Environment;->initialize(Landroid/content/Context;)V

    .line 203
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->context:Landroid/content/Context;

    .line 204
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 205
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/sdk/sensor/SensorManager;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->bleUnsupported:Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/sdk/sensor/SensorManager;)Landroid/content/Context;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/presence/AppStateProvider;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/core/ConfigurationProvider;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/sdk/sensor/SensorManager;)Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->beaconsPhonedHome:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object p0
.end method

.method private addObservedBeaconToHistory(Lcom/shopkick/sdk/scanner/Beacon;)V
    .locals 7

    .line 828
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 829
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CHECKIN: ZoneManager.addObservedBeaconToHistory() beacon: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return-void

    .line 834
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochTimeToObservedBeacon:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochTimeToObservedBeacon:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->keySet()Ljava/util/NavigableSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 838
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/32 v5, 0x1b7740

    sub-long/2addr v3, v5

    cmp-long v1, v1, v3

    if-gez v1, :cond_1

    .line 839
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochTimeToObservedBeacon:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/sensor/SensorManager;
    .locals 2

    .line 113
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->Instance:Lcom/shopkick/sdk/sensor/SensorManager;

    if-eqz v0, :cond_0

    .line 114
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->Instance:Lcom/shopkick/sdk/sensor/SensorManager;

    return-object v0

    .line 113
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    .line 130
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->Instance:Lcom/shopkick/sdk/sensor/SensorManager;

    if-nez v0, :cond_1

    .line 131
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 132
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/sensor/SensorManager;->Instance:Lcom/shopkick/sdk/sensor/SensorManager;

    if-nez v1, :cond_0

    .line 133
    new-instance v1, Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/sensor/SensorManager;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/sensor/SensorManager;->Instance:Lcom/shopkick/sdk/sensor/SensorManager;

    .line 135
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

    .line 127
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'settings\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 126
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appStateProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 125
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private phoneHome(Ljava/util/Collection;Landroid/location/Location;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/location/Location;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 540
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    .line 547
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v0, :cond_0

    .line 549
    iget-boolean v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->allowNetworkActivity:Z

    if-eqz v0, :cond_0

    .line 551
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;-><init>()V

    .line 552
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->beaconDatas:Ljava/util/ArrayList;

    .line 553
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->latitude:Ljava/lang/Double;

    .line 554
    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->longitude:Ljava/lang/Double;

    .line 555
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/sdk/sensor/SensorManager;->phoneHomeResponseHandler:Lcom/shopkick/fetchers/api/IAPICallback;

    const/4 v5, 0x1

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, v0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    .line 558
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string p2, "%1$d beacon(s) phoning home"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeRequestV2;->beaconDatas:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p1, v1, v2, p2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 544
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "location can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 541
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "beacons can not be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addSensorEventsListener(Lcom/shopkick/sdk/sensor/SensorEventsListener;)V
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 313
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 314
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 315
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 317
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

    .line 213
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->allowNetworkActivity:Z

    return-void
.end method

.method close(Lcom/shopkick/sdk/sensor/Sensor;)V
    .locals 6

    .line 277
    move-object v0, p1

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorBase;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorBase;->getSensorImplementation()Lcom/shopkick/sdk/sensor/SensorImplementation;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 281
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensorsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 282
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 285
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 286
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_0

    .line 287
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 290
    invoke-interface {v0, v2}, Lcom/shopkick/sdk/sensor/SensorImplementation;->removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V

    .line 291
    invoke-interface {v0, v2}, Lcom/shopkick/sdk/sensor/SensorImplementation;->setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V

    .line 292
    invoke-interface {v0}, Lcom/shopkick/sdk/sensor/SensorImplementation;->stop()V

    .line 295
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 298
    instance-of v0, v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    if-eqz v0, :cond_1

    .line 299
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/SensorManager;->updateLocationServicesSensorImplementations()V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 295
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 303
    :cond_1
    :goto_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "SensorManager: closed sensor wrapper [%1$s]"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public disallowNetworkActivity()V
    .locals 1

    const/4 v0, 0x0

    .line 220
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->allowNetworkActivity:Z

    return-void
.end method

.method public doShopkickBeaconsScan(Z)V
    .locals 6

    .line 854
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 855
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CHECKIN: SensorManager: starting ble scan, blocking: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 858
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/SensorManager;->getBeaconSensorImplementationInternal()Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->startOneScan()V

    if-eqz p1, :cond_0

    .line 860
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->bleScanLock:Ljava/lang/Object;

    monitor-enter p1

    .line 862
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->bleScanLock:Ljava/lang/Object;

    sget-object v1, Lcom/shopkick/sdk/sensor/SensorManager;->BLE_SCAN_TIMEOUT:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 865
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit p1

    goto :goto_2

    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 867
    :cond_0
    :goto_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 868
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "CHECKIN: SensorManager: ble scan complete or timed out"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method getBeaconSensorImplementationInternal()Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;
    .locals 3

    .line 568
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorImplementationFactory:Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;

    const-class v1, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-static {v0, v1, v2}, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->access$200(Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;Ljava/lang/Class;Lcom/shopkick/sdk/core/ConfigurationProvider;)Lcom/shopkick/sdk/sensor/SensorImplementation;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    return-object v0
.end method

.method public getRecentlyObservedBeacons(J)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 807
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 811
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 812
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochTimeToObservedBeacon:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListMap;->keySet()Ljava/util/NavigableSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 813
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, p1

    cmp-long v3, v3, v5

    if-ltz v3, :cond_1

    .line 814
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochTimeToObservedBeacon:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentSkipListMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 817
    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public onBeaconsScanned(Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;)V"
        }
    .end annotation

    .line 447
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/scanner/Beacon;

    .line 448
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/sensor/SensorManager;->addObservedBeaconToHistory(Lcom/shopkick/sdk/scanner/Beacon;)V

    goto :goto_0

    .line 453
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->epochOfLastBleScan:Ljava/lang/Long;

    .line 454
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 455
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "CHECKIN: SensorManager: ble scan complete"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->bleScanLock:Ljava/lang/Object;

    monitor-enter v0

    .line 458
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->bleScanLock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 459
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 462
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 463
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 464
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 465
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedBeaconDataHashesCacheLock:Ljava/lang/Object;

    monitor-enter v3

    .line 466
    :try_start_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/scanner/Beacon;

    .line 467
    invoke-virtual {v5}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v6

    .line 468
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    iget-object v7, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedBeaconDataHashesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 470
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 472
    :cond_2
    iget-object v5, p0, Lcom/shopkick/sdk/sensor/SensorManager;->beaconsPhonedHome:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 473
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 476
    :cond_3
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedBeaconDataHashesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    .line 477
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedBeaconDataHashesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->addAll(Ljava/util/Collection;)Z

    .line 478
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 480
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 481
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 482
    iget-object v5, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedIBeaconAddressesCacheLock:Ljava/lang/Object;

    monitor-enter v5

    .line 483
    :try_start_2
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/scanner/Beacon;

    .line 484
    invoke-virtual {v3}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v6

    .line 485
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 486
    iget-object v7, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedIBeaconAddressesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 487
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 490
    :cond_5
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedIBeaconAddressesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    .line 491
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->observedIBeaconAddressesCache:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p2, v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->addAll(Ljava/util/Collection;)Z

    .line 492
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 495
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_6

    .line 498
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    iget-object v3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-static {p2, v2, v3}, Lcom/shopkick/sdk/presence/LocationManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 499
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 501
    invoke-direct {p0, v0, p2}, Lcom/shopkick/sdk/sensor/SensorManager;->phoneHome(Ljava/util/Collection;Landroid/location/Location;)V

    .line 506
    :cond_6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_7

    .line 509
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v0, "SensorEventsListener.onBeaconsFound()"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {p2, v2, v3, v0, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 510
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorEventsListener;

    .line 512
    :try_start_3
    invoke-interface {v0, v1}, Lcom/shopkick/sdk/sensor/SensorEventsListener;->onBeaconsFound(Ljava/util/Collection;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catch_0
    move-exception v8

    .line 514
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "SensorEventsListener callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 519
    :cond_7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_8

    .line 522
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "SensorEventsListener.onIBeaconsFound()"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 523
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorEventsListener;

    .line 525
    :try_start_4
    invoke-interface {v0, p1}, Lcom/shopkick/sdk/sensor/SensorEventsListener;->onIBeaconsFound(Ljava/util/Collection;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_4

    :catch_1
    move-exception v8

    .line 527
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "SensorEventsListener callback failed"

    new-array v10, v4, [Ljava/lang/Object;

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 492
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 478
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1

    :catchall_2
    move-exception p1

    .line 459
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1
.end method

.method public open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/shopkick/sdk/sensor/Sensor;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/shopkick/sdk/sensor/ReadingListener;",
            "Lcom/shopkick/sdk/sensor/StatusListener;",
            ")TT;"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 245
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorImplementationFactory:Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->settings:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-static {v0, p1, v1}, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->access$200(Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;Ljava/lang/Class;Lcom/shopkick/sdk/core/ConfigurationProvider;)Lcom/shopkick/sdk/sensor/SensorImplementation;

    move-result-object v0

    .line 247
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorFactory:Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;

    invoke-static {v1, p1, v0, p2, p3}, Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;->access$300(Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;Ljava/lang/Class;Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object p1

    .line 251
    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensorsLock:Ljava/lang/Object;

    monitor-enter p2

    .line 252
    :try_start_0
    iget-object p3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p3, :cond_0

    .line 253
    iget-object p3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    invoke-virtual {p3, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    new-instance p3, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;

    invoke-direct {p3, p0, v0}, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorImplementation;)V

    invoke-interface {v0, p3}, Lcom/shopkick/sdk/sensor/SensorImplementation;->setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V

    .line 257
    new-instance p3, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;

    invoke-direct {p3, p0, v0}, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorImplementation;)V

    invoke-interface {v0, p3}, Lcom/shopkick/sdk/sensor/SensorImplementation;->setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V

    move p3, v1

    goto :goto_0

    :cond_0
    move p3, v2

    .line 260
    :goto_0
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    move-object v4, p1

    check-cast v4, Lcom/shopkick/sdk/sensor/SensorBase;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    .line 262
    invoke-interface {v0}, Lcom/shopkick/sdk/sensor/SensorImplementation;->start()Z

    .line 264
    :cond_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object p3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string p3, "SensorManager: opened new sensor wrapper [%1$s]"

    new-array v0, v1, [Ljava/lang/Object;

    aput-object p1, v0, v2

    invoke-virtual {p2, v3, v4, p3, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    .line 264
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 241
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'type\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeSensorEventsListener(Lcom/shopkick/sdk/sensor/SensorEventsListener;)V
    .locals 2

    .line 326
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 328
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->sensorEventsListeners:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 329
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public setApiManager(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method

.method updateGeoFenceSensorImplementations()V
    .locals 7

    .line 407
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/SensorImplementation;

    .line 408
    instance-of v2, v1, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    if-nez v2, :cond_0

    goto :goto_0

    .line 413
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 414
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v3, :cond_3

    .line 416
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/sensor/SensorBase;

    .line 417
    check-cast v4, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v4}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->getGeoFences()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 418
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 419
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 422
    move-object v6, v1

    check-cast v6, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    invoke-virtual {v6, v5}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_1

    .line 429
    :cond_3
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/SensorManager;->geoFencesCacheLock:Ljava/lang/Object;

    monitor-enter v3

    .line 430
    :try_start_0
    iget-object v4, p0, Lcom/shopkick/sdk/sensor/SensorManager;->geoFencesCache:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 431
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 434
    move-object v6, v1

    check-cast v6, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    invoke-virtual {v6, v5}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_2

    .line 437
    :cond_5
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->geoFencesCache:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 438
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorManager;->geoFencesCache:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->addAll(Ljava/util/Collection;)Z

    .line 439
    monitor-exit v3

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_6
    return-void
.end method

.method updateLocationServicesSensorImplementations()V
    .locals 9

    .line 348
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/SensorImplementation;

    .line 349
    instance-of v2, v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    if-nez v2, :cond_0

    goto :goto_0

    .line 356
    :cond_0
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/SensorManager;->implementationToOpenSensors:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 358
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v4, v3

    move v5, v4

    :goto_1
    :pswitch_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/sdk/sensor/SensorBase;

    .line 359
    check-cast v6, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v6}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->getPowerAndAccuracyProfile()Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    move-result-object v6

    .line 360
    sget-object v7, Lcom/shopkick/sdk/sensor/SensorManager$3;->$SwitchMap$com$shopkick$sdk$sensor$LocationServicesSensor$PowerAndAccuracyProfile:[I

    invoke-virtual {v6}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    .line 370
    new-instance v0, Ljava/lang/IllegalStateException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v6, v2, v3

    const-string v3, "Unsupported PowerAndAccuracyProfile value [%1$s]"

    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :pswitch_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    move v4, v3

    move v5, v4

    :cond_2
    if-lez v4, :cond_3

    .line 380
    check-cast v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    sget-object v2, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestHigh:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->setLocationRequest(Lcom/google/android/gms/location/LocationRequest;)V

    .line 381
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 382
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v2, "SensorManager: LocationServicesSensorImplementation config updated to HIGH profile"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    if-lez v5, :cond_4

    .line 385
    check-cast v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    sget-object v2, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestMedium:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->setLocationRequest(Lcom/google/android/gms/location/LocationRequest;)V

    .line 386
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 387
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v2, "SensorManager: LocationServicesSensorImplementation config updated to MEDIUM profile"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 392
    :cond_4
    check-cast v1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    sget-object v2, Lcom/shopkick/sdk/sensor/SensorManager;->LocationRequestLow:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->setLocationRequest(Lcom/google/android/gms/location/LocationRequest;)V

    .line 393
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 394
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v2, "SensorManager: LocationServicesSensorImplementation config updated to LOW profile"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
