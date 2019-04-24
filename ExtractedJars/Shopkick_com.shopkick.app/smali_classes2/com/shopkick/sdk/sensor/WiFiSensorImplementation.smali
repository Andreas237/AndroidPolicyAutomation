.class public Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;
.super Ljava/lang/Object;
.source "WiFiSensorImplementation.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/SensorImplementation;


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "WiFiSensor"


# instance fields
.field private final appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

.field private final context:Landroid/content/Context;

.field private final handlerThread:Landroid/os/HandlerThread;

.field private isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private isScanningIndefinitely:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile lastReading:Lcom/shopkick/sdk/sensor/WiFiScanReading;

.field private final mainHandler:Landroid/os/Handler;

.field private volatile readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private final scanListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/sensor/WiFiScanListener;",
            ">;"
        }
    .end annotation
.end field

.field private final serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

.field private final stateChangeIntentFilter:Landroid/content/IntentFilter;

.field public final stateChangeReceiver:Landroid/content/BroadcastReceiver;

.field private volatile statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

.field private final statusListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/sensor/SensorStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field private stopScan:Ljava/lang/Runnable;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private wifiManager:Landroid/net/wifi/WifiManager;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 1

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 120
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 121
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 122
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/WiFiScanReading;

    .line 487
    new-instance v0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;-><init>(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeReceiver:Landroid/content/BroadcastReceiver;

    .line 127
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->context:Landroid/content/Context;

    .line 128
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 129
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 131
    new-instance p2, Landroid/content/IntentFilter;

    invoke-direct {p2}, Landroid/content/IntentFilter;-><init>()V

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string/jumbo p2, "wifi"

    .line 132
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiManager;

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->wifiManager:Landroid/net/wifi/WifiManager;

    .line 134
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.net.wifi.SCAN_RESULTS"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 135
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 136
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.location.PROVIDERS_CHANGED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 137
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.location.MODE_CHANGED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 140
    invoke-static {}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->makeSynchronizedWeakSet()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->scanListeners:Ljava/util/Set;

    .line 141
    invoke-static {}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->makeSynchronizedWeakSet()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListeners:Ljava/util/Set;

    .line 142
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 143
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 144
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isScanningIndefinitely:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 147
    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "WiFiSensorImplementation Worker Thread"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->handlerThread:Landroid/os/HandlerThread;

    .line 148
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 149
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)Ljava/util/Set;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListeners:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)Ljava/util/Set;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->scanListeners:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Lcom/shopkick/sdk/sensor/Status;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stopScan()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stopScanning()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Z)Z
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->scan(Z)Z

    move-result p0

    return p0
.end method

.method static synthetic access$600(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Z)Z
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->start(Z)Z

    move-result p0

    return p0
.end method

.method static synthetic access$700(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Landroid/content/Intent;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->processWiFiScanCallback(Landroid/content/Intent;)V

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;
    .locals 2

    .line 49
    sget-object v0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    if-eqz v0, :cond_0

    .line 50
    sget-object v0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

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

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    .line 62
    sget-object v0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    if-nez v0, :cond_1

    .line 63
    sget-object v0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 64
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    if-nez v1, :cond_0

    .line 65
    new-instance v1, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    .line 67
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

    .line 61
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'settings\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 60
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appStateProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static makeSynchronizedWeakSet()Ljava/util/Set;
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

    .line 154
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private notifyListenersOfWiFiScans(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V
    .locals 9

    .line 437
    new-instance v0, Lcom/shopkick/sdk/sensor/WiFiScanResult;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/WiFiScanResult;->getScanResults()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/sdk/sensor/WiFiScanResult;-><init>(Ljava/util/List;)V

    .line 438
    new-instance v1, Lcom/shopkick/sdk/sensor/WiFiScanReading;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/WiFiScanReading;

    invoke-direct {v1, v2, p1}, Lcom/shopkick/sdk/sensor/WiFiScanReading;-><init>(Lcom/shopkick/sdk/sensor/WiFiScanReading;Lcom/shopkick/sdk/sensor/WiFiScanResult;)V

    .line 439
    iput-object v1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/WiFiScanReading;

    .line 441
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    .line 444
    :try_start_0
    invoke-interface {p1, v2, v1}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    .line 446
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object p1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 447
    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v7, "%1$s %2$s"

    const/4 p1, 0x2

    new-array v8, p1, [Ljava/lang/Object;

    const/4 p1, 0x0

    const-string v1, "WiFiSensor"

    aput-object v1, v8, p1

    const/4 p1, 0x1

    const-string v1, "Error in BleScanListener"

    aput-object v1, v8, p1

    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$3;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$3;-><init>(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Lcom/shopkick/sdk/sensor/WiFiScanResult;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V
    .locals 7

    .line 255
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$1;-><init>(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Lcom/shopkick/sdk/sensor/Status;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 270
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz v0, :cond_0

    .line 272
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/shopkick/sdk/sensor/StatusListener;->onStatusChanged(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Status;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 274
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

    const-string v6, "WiFiSensor"

    aput-object v6, v5, p1

    const/4 p1, 0x1

    const-string v6, "Error in SensorStatusListener"

    aput-object v6, v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    .locals 7

    .line 282
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$2;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$2;-><init>(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 297
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    if-eqz v0, :cond_0

    .line 299
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 301
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

    const-string v6, "WiFiSensor"

    aput-object v6, v5, p1

    const/4 p1, 0x1

    const-string v6, "Error in SensorStatusListener"

    aput-object v6, v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private processWiFiData()Lcom/shopkick/sdk/sensor/WiFiScanResult;
    .locals 10

    .line 425
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->wifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v0

    .line 426
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    .line 428
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/wifi/ScanResult;

    .line 429
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v6, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "ScanResult: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Landroid/net/wifi/ScanResult;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7, v4, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 431
    :cond_0
    new-instance v1, Lcom/shopkick/sdk/sensor/WiFiScanResult;

    invoke-direct {v1, v0}, Lcom/shopkick/sdk/sensor/WiFiScanResult;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method private final processWiFiScanCallback(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "resultsUpdated"

    const/4 v1, 0x0

    .line 471
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 473
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->processWiFiData()Lcom/shopkick/sdk/sensor/WiFiScanResult;

    move-result-object p1

    .line 474
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->notifyListenersOfWiFiScans(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V

    .line 476
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 477
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isScanningIndefinitely:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 478
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isScanningIndefinitely:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->scan(Z)Z

    :cond_0
    return-void
.end method

.method private scan(Z)Z
    .locals 7

    .line 314
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 315
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v0, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "WiFiSensor"

    aput-object v6, v2, v3

    const-string v6, "WiFi sensor not allowed to scan"

    aput-object v6, v2, v1

    invoke-virtual {p1, v4, v5, v0, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return v3

    .line 320
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isScanningIndefinitely:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 322
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 324
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 325
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v0, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "WiFiSensor"

    aput-object v6, v2, v3

    const-string v6, "Antenna active by another scan, aborting this WiFi scan"

    aput-object v6, v2, v1

    invoke-virtual {p1, v4, v5, v0, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return v3

    .line 331
    :cond_1
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->wifiManager:Landroid/net/wifi/WifiManager;

    if-nez p1, :cond_2

    .line 332
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v0, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "WiFiSensor"

    aput-object v6, v2, v3

    const-string v6, "WiFi is unavailable"

    aput-object v6, v2, v1

    invoke-virtual {p1, v4, v5, v0, v2}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 333
    sget-object p1, Lcom/shopkick/sdk/sensor/SensorStatusError;->WIFI_UNAVAILABLE:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    .line 334
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stopScan()V

    return v3

    .line 338
    :cond_2
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result p1

    if-nez p1, :cond_3

    .line 339
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v0, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "WiFiSensor"

    aput-object v6, v2, v3

    const-string v6, "WiFi is off"

    aput-object v6, v2, v1

    invoke-virtual {p1, v4, v5, v0, v2}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 340
    sget-object p1, Lcom/shopkick/sdk/sensor/SensorStatusError;->WIFI_OFF:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    .line 341
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stopScan()V

    return v3

    .line 344
    :cond_3
    sget-object p1, Lcom/shopkick/sdk/sensor/Status;->WIFI_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    .line 345
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->startAdapterScan()Z

    move-result p1

    return p1
.end method

.method private start(Z)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 216
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeReceiver:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stateChangeIntentFilter:Landroid/content/IntentFilter;

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 220
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasCoarseLocation(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 221
    sget-object p1, Lcom/shopkick/sdk/sensor/SensorStatusError;->PERMISSION_DENIED_COARSE_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    .line 226
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->startScanning(Z)Z

    move-result p1

    return p1
.end method

.method private startAdapterScan()Z
    .locals 3

    .line 168
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->wifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 175
    :cond_1
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->wifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    :cond_2
    return v1
.end method

.method private startScanning(Z)Z
    .locals 3

    .line 242
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    return v1

    .line 250
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->scan(Z)Z

    move-result p1

    return p1
.end method

.method private stopScan()V
    .locals 7

    .line 361
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

    const-string v5, "WiFiSensor"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "WiFi scanning stopping"

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stopScanning()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 368
    :catch_0
    sget-object v0, Lcom/shopkick/sdk/sensor/Status;->WIFI_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    return-void
.end method

.method private stopScanning()V
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->wifiManager:Landroid/net/wifi/WifiManager;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 195
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isScanningIndefinitely:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 1

    .line 374
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addWiFiScanListener(Lcom/shopkick/sdk/sensor/WiFiScanListener;)V
    .locals 1

    .line 408
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->scanListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/WiFiScanReading;

    return-object v0
.end method

.method public removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeWiFiScanListener(Lcom/shopkick/sdk/sensor/WiFiScanListener;)V
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->scanListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 0

    .line 386
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    return-void
.end method

.method public setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 392
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    return-void
.end method

.method public start()Z
    .locals 1

    const/4 v0, 0x1

    .line 209
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->start(Z)Z

    move-result v0

    return v0
.end method

.method public startOneScan()V
    .locals 8

    .line 236
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 237
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s %2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "WiFiSensor"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "WiFi scanning going to start, will scan once"

    const/4 v7, 0x1

    aput-object v5, v4, v7

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 238
    invoke-direct {p0, v6}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->startScanning(Z)Z

    return-void
.end method

.method public stop()V
    .locals 8

    .line 351
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    .line 352
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 353
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s %2$s"

    new-array v3, v3, [Ljava/lang/Object;

    const-string v7, "WiFiSensor"

    aput-object v7, v3, v1

    const-string v1, "Stopping WiFi scan"

    aput-object v1, v3, v2

    invoke-virtual {v0, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 354
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->stopScan()V

    goto :goto_0

    .line 356
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

    const-string v7, "WiFiSensor"

    aput-object v7, v3, v1

    const-string v1, "WiFi scanner already disabled"

    aput-object v1, v3, v2

    invoke-virtual {v0, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
