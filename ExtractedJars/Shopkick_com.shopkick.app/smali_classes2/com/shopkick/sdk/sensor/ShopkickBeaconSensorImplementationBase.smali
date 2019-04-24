.class abstract Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;
.super Ljava/lang/Object;
.source "ShopkickBeaconSensorImplementationBase.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/SensorImplementation;


# static fields
.field private static final TAG:Ljava/lang/String; = "SBSIB"


# instance fields
.field protected final appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

.field protected final beaconToLastReading:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            "Lcom/shopkick/sdk/sensor/ShopBeaconReading;",
            ">;"
        }
    .end annotation
.end field

.field protected final bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

.field protected bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected final context:Landroid/content/Context;

.field protected final isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected final isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected volatile lastReading:Lcom/shopkick/sdk/sensor/ShopBeaconReading;

.field private final macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation
.end field

.field private final macToShopkickBeaconCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation
.end field

.field protected volatile readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field protected final scanListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/sensor/BleScanListener;",
            ">;"
        }
    .end annotation
.end field

.field protected final serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

.field private final stateChangeIntentFilter:Landroid/content/IntentFilter;

.field private final stateChangeReceiver:Landroid/content/BroadcastReceiver;

.field protected volatile statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

.field protected final statusListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/sensor/SensorStatusListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->beaconToLastReading:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 76
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 77
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->lastReading:Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    .line 80
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 83
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToShopkickBeaconCache:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x1

    .line 86
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 462
    new-instance v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$4;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$4;-><init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stateChangeReceiver:Landroid/content/BroadcastReceiver;

    .line 91
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->context:Landroid/content/Context;

    .line 92
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 93
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 95
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    .line 96
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 97
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.location.PROVIDERS_CHANGED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.location.MODE_CHANGED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 100
    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->makeSynchronizedWeakSet()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scanListeners:Ljava/util/Set;

    .line 101
    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->makeSynchronizedWeakSet()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListeners:Ljava/util/Set;

    .line 102
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 103
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Z)Z
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->start(Z)Z

    move-result p0

    return p0
.end method

.method protected static makeSynchronizedWeakSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 107
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private scheduleAScan(ZI)V
    .locals 3

    .line 367
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$3;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$3;-><init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Z)V

    int-to-long p1, p2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private start(Z)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 145
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stateChangeReceiver:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 149
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasFineLocation(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 150
    sget-object p1, Lcom/shopkick/sdk/sensor/SensorStatusError;->PERMISSION_DENIED_FINE_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    .line 155
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->startScanning(Z)V

    return p1
.end method


# virtual methods
.method public addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 1

    .line 444
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scanListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 1

    .line 410
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected abstract createStopScanRunnable(Z)Ljava/lang/Runnable;
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 434
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->lastReading:Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    return-object v0
.end method

.method protected notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V
    .locals 7

    .line 233
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$1;-><init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Lcom/shopkick/sdk/sensor/Status;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-interface {v0, v1, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 253
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz v0, :cond_0

    .line 255
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/shopkick/sdk/sensor/StatusListener;->onStatusChanged(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Status;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 257
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object p1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v4, "%1$s %2$s"

    const/4 p1, 0x2

    new-array v5, p1, [Ljava/lang/Object;

    const/4 p1, 0x0

    const-string v6, "SBSIB"

    aput-object v6, v5, p1

    const/4 p1, 0x1

    const-string v6, "Error in SensorStatusListener"

    aput-object v6, v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method protected notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    .locals 7

    .line 265
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;-><init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-interface {v0, v1, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 281
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz v0, :cond_0

    .line 283
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 285
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object p1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v4, "%1$s %2$s"

    const/4 p1, 0x2

    new-array v5, p1, [Ljava/lang/Object;

    const/4 p1, 0x0

    const-string v6, "SBSIB"

    aput-object v6, v5, p1

    const/4 p1, 0x1

    const-string v6, "Error in SensorStatusListener"

    aput-object v6, v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public removeBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scanListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 1

    .line 416
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method resolveBeacon(Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/scanner/Beacon;
    .locals 4

    .line 191
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToShopkickBeaconCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    if-eqz v0, :cond_0

    .line 194
    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon()Z

    move-result v0

    if-nez v0, :cond_4

    .line 195
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToShopkickBeaconCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/Beacon;

    .line 196
    invoke-virtual {p1, v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/scanner/Beacon;->overrideSignalStrength(Ljava/lang/Integer;)V

    move-object p1, v0

    goto :goto_0

    .line 198
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToShopkickBeaconCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 205
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/Beacon;

    .line 206
    invoke-virtual {p1, v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v3

    .line 207
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v0

    if-le v3, v0, :cond_1

    move v0, v3

    .line 209
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/scanner/Beacon;->overrideSignalStrength(Ljava/lang/Integer;)V

    goto :goto_0

    .line 211
    :cond_2
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 214
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/Beacon;

    .line 215
    invoke-virtual {p1, v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v3

    .line 216
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v0

    if-lt v3, v0, :cond_4

    .line 220
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 225
    :cond_3
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->macToBestReadingCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    return-object p1
.end method

.method protected scan(Z)V
    .locals 10

    .line 300
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    invoke-interface {v0}, Lcom/shopkick/sdk/presence/AppStateProvider;->isAppInForeground()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 301
    invoke-interface {v0}, Lcom/shopkick/sdk/core/ConfigurationProvider;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthSeconds:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 302
    invoke-interface {v0}, Lcom/shopkick/sdk/core/ConfigurationProvider;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthBackgroundSeconds:Ljava/lang/Integer;

    .line 300
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 308
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-interface {v1}, Lcom/shopkick/sdk/core/ConfigurationProvider;->isExperimentalBatteryImprovementEnabled()Z

    move-result v1

    const/4 v2, 0x6

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v1, :cond_1

    if-ge v0, v2, :cond_1

    .line 313
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 314
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v1, "%1$s %2$s"

    new-array v8, v5, [Ljava/lang/Object;

    const-string v9, "SBSIB"

    aput-object v9, v8, v4

    const-string v9, "Using experimental battery improvement scan length of 6 seconds"

    aput-object v9, v8, v3

    .line 313
    invoke-virtual {v0, v6, v7, v1, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    move v0, v2

    .line 319
    :cond_1
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_3

    .line 320
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v2, "%1$s %2$s"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v8, "SBSIB"

    aput-object v8, v5, v4

    const-string v4, "BLE sensor not allowed to scan"

    aput-object v4, v5, v3

    invoke-virtual {v1, v6, v7, v2, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    .line 321
    invoke-direct {p0, p1, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scheduleAScan(ZI)V

    :cond_2
    return-void

    .line 324
    :cond_3
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 326
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 327
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v2, "%1$s %2$s"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v8, "SBSIB"

    aput-object v8, v5, v4

    const-string v4, "Antenna active by another scan, aborting this BLE scan"

    aput-object v4, v5, v3

    invoke-virtual {v1, v6, v7, v2, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    .line 331
    invoke-direct {p0, p1, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scheduleAScan(ZI)V

    :cond_4
    return-void

    .line 334
    :cond_5
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-nez v1, :cond_7

    .line 335
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v2, "%1$s %2$s"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v8, "SBSIB"

    aput-object v8, v5, v4

    const-string v4, "bluetooth is unavailable"

    aput-object v4, v5, v3

    invoke-virtual {v1, v6, v7, v2, v5}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 336
    sget-object v1, Lcom/shopkick/sdk/sensor/SensorStatusError;->BLUETOOTH_UNAVAILABLE:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-virtual {p0, v1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    .line 337
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stop()V

    if-eqz p1, :cond_6

    .line 338
    invoke-direct {p0, p1, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scheduleAScan(ZI)V

    :cond_6
    return-void

    .line 342
    :cond_7
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_9

    .line 343
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v2, "%1$s %2$s"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v8, "SBSIB"

    aput-object v8, v5, v4

    const-string v4, "bluetooth is off"

    aput-object v4, v5, v3

    invoke-virtual {v1, v6, v7, v2, v5}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 344
    sget-object v1, Lcom/shopkick/sdk/sensor/SensorStatusError;->BLUETOOTH_OFF:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-virtual {p0, v1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    .line 345
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stop()V

    if-eqz p1, :cond_8

    .line 346
    invoke-direct {p0, p1, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scheduleAScan(ZI)V

    :cond_8
    return-void

    .line 352
    :cond_9
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->createStopScanRunnable(Z)Ljava/lang/Runnable;

    move-result-object p1

    int-to-long v6, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, p1, v6, v7, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 354
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    invoke-interface {p1}, Lcom/shopkick/sdk/presence/AppStateProvider;->isAppInForeground()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 355
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 356
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "%1$s %2$s"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "SBSIB"

    aput-object v6, v5, v4

    const-string v4, "BLE scanning started while app is in foreground"

    aput-object v4, v5, v3

    invoke-virtual {p1, v0, v1, v2, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 358
    :cond_a
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 359
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "%1$s %2$s"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "SBSIB"

    aput-object v6, v5, v4

    const-string v4, "BLE scanning started while app is in background"

    aput-object v4, v5, v3

    invoke-virtual {p1, v0, v1, v2, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 361
    :goto_1
    sget-object p1, Lcom/shopkick/sdk/sensor/Status;->BLE_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    .line 363
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->startAdapterScan()V

    return-void
.end method

.method public setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    return-void
.end method

.method public setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 428
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    return-void
.end method

.method public start()Z
    .locals 1

    const/4 v0, 0x1

    .line 138
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->start(Z)Z

    move-result v0

    return v0
.end method

.method protected abstract startAdapterScan()V
.end method

.method public startOneScan()V
    .locals 8

    .line 166
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 167
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s %2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "SBSIB"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "BLE scanning going to start, will scan once"

    const/4 v7, 0x1

    aput-object v5, v4, v7

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 168
    invoke-virtual {p0, v6}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->startScanning(Z)V

    return-void
.end method

.method protected startScanning(Z)V
    .locals 8

    .line 172
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v3, 0x2

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 174
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v0, "%1$s %2$s"

    new-array v3, v3, [Ljava/lang/Object;

    const-string v6, "SBSIB"

    aput-object v6, v3, v2

    const-string v2, "Already BLE scanning"

    aput-object v2, v3, v1

    invoke-virtual {p1, v4, v5, v0, v3}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 179
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s %2$s"

    new-array v3, v3, [Ljava/lang/Object;

    const-string v7, "SBSIB"

    aput-object v7, v3, v2

    const-string v2, "BLE scanning starting"

    aput-object v2, v3, v1

    invoke-virtual {v0, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 180
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scan(Z)V

    return-void
.end method

.method public stop()V
    .locals 8

    .line 379
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    .line 380
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 381
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s %2$s"

    new-array v3, v3, [Ljava/lang/Object;

    const-string v7, "SBSIB"

    aput-object v7, v3, v1

    const-string v1, "Stopping BLE scan and disabling scanner"

    aput-object v1, v3, v2

    invoke-virtual {v0, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 382
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stopScan()V

    goto :goto_0

    .line 384
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s %2$s"

    new-array v3, v3, [Ljava/lang/Object;

    const-string v7, "SBSIB"

    aput-object v7, v3, v1

    const-string v1, "BLE scanner already disabled"

    aput-object v1, v3, v2

    invoke-virtual {v0, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method protected stopScan()V
    .locals 7

    .line 389
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s %2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "SBSIB"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "BLE scanning stopping"

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 391
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stopScanning()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 402
    :catch_0
    sget-object v0, Lcom/shopkick/sdk/sensor/Status;->BLE_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {p0, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    .line 403
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->BLUETOOTH_UNAVAILABLE:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-virtual {p0, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    :catch_1
    :goto_0
    return-void
.end method

.method protected abstract stopScanning()V
.end method
