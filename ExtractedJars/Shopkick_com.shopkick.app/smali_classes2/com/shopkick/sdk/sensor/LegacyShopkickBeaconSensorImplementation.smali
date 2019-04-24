.class public Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;
.super Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;
.source "LegacyShopkickBeaconSensorImplementation.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BleStateBroadcastReceiver;,
        Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;
    }
.end annotation


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "LSBSI"


# instance fields
.field private final bleScanCallback:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 4

    .line 73
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 85
    new-instance p1, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;-><init>(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bleScanCallback:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;

    .line 75
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 76
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide p2

    const-string v0, "%1$s %2$s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LSBSI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Initializing instance of LegacyShopkickBeaconSensorImplementation with Pre Android 5.0 BLE APIs"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1, p2, p3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;)Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bleScanCallback:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;Ljava/util/Collection;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->notifyListenersOfBeacons(Ljava/util/Collection;)V

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;
    .locals 2

    .line 48
    sget-object v0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    if-eqz v0, :cond_0

    .line 49
    sget-object v0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    return-object v0

    .line 48
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

    .line 61
    sget-object v0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    if-nez v0, :cond_1

    .line 62
    sget-object v0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 63
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    if-nez v1, :cond_0

    .line 64
    new-instance v1, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    .line 66
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

    .line 60
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'settings\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appStateProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 58
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private notifyListenersOfBeacons(Ljava/util/Collection;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;)V"
        }
    .end annotation

    .line 158
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 159
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 160
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/scanner/Beacon;

    .line 161
    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 164
    :cond_1
    invoke-virtual {p0, v2}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->resolveBeacon(Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v2

    .line 166
    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 167
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 170
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->beaconToLastReading:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    .line 171
    new-instance v4, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    invoke-direct {v4, v3, v2}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;-><init>(Lcom/shopkick/sdk/sensor/ShopBeaconReading;Lcom/shopkick/sdk/scanner/Beacon;)V

    .line 172
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->beaconToLastReading:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    iput-object v4, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    .line 176
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    .line 179
    :try_start_0
    invoke-interface {v2, v3, v4}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    .line 181
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 182
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "%1$s %2$s"

    const/4 v2, 0x2

    new-array v10, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "LSBSI"

    aput-object v3, v10, v2

    const/4 v2, 0x1

    const-string v3, "Error in BleScanListener"

    aput-object v3, v10, v2

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 186
    :cond_2
    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 187
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 191
    :cond_3
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;

    invoke-direct {v2, p0, v0, v1}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;-><init>(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;Ljava/util/Collection;Ljava/util/Collection;)V

    const-wide/16 v0, 0x1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v2, v0, v1, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public bridge synthetic addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    return-void
.end method

.method public bridge synthetic addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V

    return-void
.end method

.method protected createStopScanRunnable(Z)Ljava/lang/Runnable;
    .locals 1

    .line 106
    new-instance v0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;-><init>(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;Z)V

    return-object v0
.end method

.method public bridge synthetic getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 31
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->getLastReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic removeBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->removeBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    return-void
.end method

.method public bridge synthetic removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V

    return-void
.end method

.method public bridge synthetic setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V

    return-void
.end method

.method public bridge synthetic setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-void
.end method

.method public bridge synthetic start()Z
    .locals 1

    .line 31
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->start()Z

    move-result v0

    return v0
.end method

.method protected startAdapterScan()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 91
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    .line 92
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 93
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bleScanCallback:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->clearParsedBeacons()V

    .line 94
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bleScanCallback:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->startLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public bridge synthetic startOneScan()V
    .locals 0

    .line 31
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->startOneScan()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    .line 31
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stop()V

    return-void
.end method

.method protected stopScanning()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 152
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->bleScanCallback:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->stopLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
