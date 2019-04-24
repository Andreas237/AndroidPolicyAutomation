.class public Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;
.super Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;
.source "ShopkickBeaconSensorImplementation.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$BleStateBroadcastReceiver;,
        Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;
    }
.end annotation


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "SBSI"


# instance fields
.field private filters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/le/ScanFilter;",
            ">;"
        }
    .end annotation
.end field

.field private mLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

.field private mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

.field private final scanSettingsLowLatency:Landroid/bluetooth/le/ScanSettings;

.field private final scanSettingsLowPower:Landroid/bluetooth/le/ScanSettings;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 7

    .line 78
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 110
    new-instance p2, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {p2}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    const/4 p3, 0x2

    .line 111
    invoke-virtual {p2, p3}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->scanSettingsLowLatency:Landroid/bluetooth/le/ScanSettings;

    .line 112
    new-instance p2, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {p2}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    const/4 v0, 0x0

    .line 113
    invoke-virtual {p2, v0}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->scanSettingsLowPower:Landroid/bluetooth/le/ScanSettings;

    .line 80
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 81
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s %2$s"

    new-array v4, p3, [Ljava/lang/Object;

    const-string v5, "SBSI"

    aput-object v5, v4, v0

    const-string v5, "Initializing instance of ShopkickBeaconSensorImplementation with Android 5.0+ BLE APIs"

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {p2, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    const-string p2, "bluetooth"

    .line 86
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothManager;

    .line 87
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    .line 88
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    .line 90
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->filters:Ljava/util/List;

    .line 93
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-interface {p1}, Lcom/shopkick/sdk/core/ConfigurationProvider;->isExperimentalBatteryImprovementEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 94
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 95
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string p2, "%1$s %2$s"

    new-array p3, p3, [Ljava/lang/Object;

    const-string v3, "SBSI"

    aput-object v3, p3, v0

    const-string v0, "Using experimental battery improvement filters"

    aput-object v0, p3, v6

    .line 94
    invoke-virtual {p1, v1, v2, p2, p3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->filters:Ljava/util/List;

    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->getShopkickNameFilter()Landroid/bluetooth/le/ScanFilter;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->filters:Ljava/util/List;

    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->getIBeaconFilter()Landroid/bluetooth/le/ScanFilter;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_0
    new-instance p1, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;-><init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$1;)V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;)Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;Ljava/util/Collection;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->notifyListenersOfBeacons(Ljava/util/Collection;)V

    return-void
.end method

.method private static getIBeaconFilter()Landroid/bluetooth/le/ScanFilter;
    .locals 4

    const-string v0, "02159eb353a069b64947b710bae643c8bca5000f0000bf"

    .line 123
    invoke-static {v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->hexToBinary(Ljava/lang/String;)[B

    move-result-object v0

    .line 124
    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->makeByteMask()[B

    move-result-object v1

    .line 125
    new-instance v2, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v2}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    const/16 v3, 0x4c

    .line 126
    invoke-virtual {v2, v3, v0, v1}, Landroid/bluetooth/le/ScanFilter$Builder;->setManufacturerData(I[B[B)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance()Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;
    .locals 2

    .line 53
    sget-object v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    if-eqz v0, :cond_0

    .line 54
    sget-object v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    return-object v0

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static getShopkickNameFilter()Landroid/bluetooth/le/ScanFilter;
    .locals 2

    .line 118
    new-instance v0, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    const-string v1, "H"

    .line 119
    invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceName(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object v0

    return-object v0
.end method

.method private static hexChar(B)C
    .locals 1

    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    add-int/lit8 p0, p0, 0x30

    int-to-char p0, p0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x61

    sub-int/2addr p0, v0

    int-to-char p0, p0

    return p0
.end method

.method private static hexToBinary(Ljava/lang/String;)[B
    .locals 6

    .line 130
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 131
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 132
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 133
    div-int/lit8 v2, v1, 0x2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    shl-int/lit8 v3, v3, 0x4

    add-int/lit8 v5, v1, 0x1

    .line 134
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    add-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    .line 66
    sget-object v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    if-nez v0, :cond_1

    .line 67
    sget-object v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 68
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    if-nez v1, :cond_0

    .line 69
    new-instance v1, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    sput-object v1, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->Instance:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    .line 71
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

    .line 65
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'settings\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 64
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appStateProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 63
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static makeByteMask()[B
    .locals 4

    const/16 v0, 0x17

    .line 141
    new-array v0, v0, [B

    const/4 v1, 0x0

    move v2, v1

    .line 142
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_1

    const/16 v3, 0x11

    if-le v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    move v3, v1

    .line 143
    :goto_2
    aput-byte v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
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

    .line 265
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 266
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 267
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

    .line 268
    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 271
    :cond_1
    invoke-virtual {p0, v2}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->resolveBeacon(Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v2

    .line 273
    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 274
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 277
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->beaconToLastReading:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    .line 278
    new-instance v4, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    invoke-direct {v4, v3, v2}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;-><init>(Lcom/shopkick/sdk/sensor/ShopBeaconReading;Lcom/shopkick/sdk/scanner/Beacon;)V

    .line 279
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->beaconToLastReading:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    iput-object v4, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->lastReading:Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    .line 283
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    .line 286
    :try_start_0
    invoke-interface {v2, v3, v4}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    .line 288
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 289
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "%1$s %2$s"

    const/4 v2, 0x2

    new-array v10, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "SBSI"

    aput-object v3, v10, v2

    const/4 v2, 0x1

    const-string v3, "Error in BleScanListener"

    aput-object v3, v10, v2

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 293
    :cond_2
    invoke-virtual {v2}, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 294
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 298
    :cond_3
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->bleScanningExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;

    invoke-direct {v2, p0, v0, v1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;-><init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;Ljava/util/Collection;Ljava/util/Collection;)V

    const-wide/16 v0, 0x1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v2, v0, v1, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public bridge synthetic addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    return-void
.end method

.method public bridge synthetic addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V

    return-void
.end method

.method protected createStopScanRunnable(Z)Ljava/lang/Runnable;
    .locals 1

    .line 217
    new-instance v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$1;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$1;-><init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;Z)V

    return-object v0
.end method

.method public bridge synthetic getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 36
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->getLastReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic removeBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->removeBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    return-void
.end method

.method public bridge synthetic removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V

    return-void
.end method

.method public bridge synthetic setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V

    return-void
.end method

.method public bridge synthetic setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-void
.end method

.method public bridge synthetic start()Z
    .locals 1

    .line 36
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->start()Z

    move-result v0

    return v0
.end method

.method protected startAdapterScan()V
    .locals 11

    .line 161
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    .line 162
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    if-eqz v0, :cond_5

    .line 163
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 167
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->getParsedBeacons()Ljava/util/Map;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->getParsedBeacons()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/scanner/Beacon;

    .line 169
    invoke-virtual {p0, v3}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->resolveBeacon(Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v3

    .line 170
    invoke-virtual {v3}, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon()Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    .line 176
    :goto_0
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    invoke-virtual {v3}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->clearParsedBeacons()V

    .line 179
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->scanSettingsLowLatency:Landroid/bluetooth/le/ScanSettings;

    .line 180
    iget-object v4, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    invoke-interface {v4}, Lcom/shopkick/sdk/presence/AppStateProvider;->isAppInForeground()Z

    move-result v4

    const/4 v5, 0x2

    if-nez v4, :cond_2

    if-nez v0, :cond_2

    iget-object v4, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 182
    invoke-interface {v4}, Lcom/shopkick/sdk/core/ConfigurationProvider;->isExperimentalBatteryImprovementEnabled()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 187
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->scanSettingsLowPower:Landroid/bluetooth/le/ScanSettings;

    .line 188
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 189
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v4, "%1$s %2$s"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v8, "SBSI"

    aput-object v8, v5, v2

    const-string v2, "Using experimental battery improvement scan settings"

    aput-object v2, v5, v1

    .line 188
    invoke-virtual {v0, v6, v7, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 193
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v6, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 194
    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v8, "%1$s %2$s (Background:%3$s NoShopkickBeacons:%4$s ExpEnabled:%5$s)"

    const/4 v9, 0x5

    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "SBSI"

    aput-object v10, v9, v2

    const-string v10, "Not using experimental battery improvement scan settings"

    aput-object v10, v9, v1

    iget-object v10, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 198
    invoke-interface {v10}, Lcom/shopkick/sdk/presence/AppStateProvider;->isAppInForeground()Z

    move-result v10

    if-nez v10, :cond_3

    move v10, v1

    goto :goto_1

    :cond_3
    move v10, v2

    :goto_1
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    aput-object v10, v9, v5

    const/4 v5, 0x3

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move v1, v2

    .line 199
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v9, v5

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->serverFlags:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 200
    invoke-interface {v1}, Lcom/shopkick/sdk/core/ConfigurationProvider;->isExperimentalBatteryImprovementEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v9, v0

    .line 193
    invoke-virtual {v4, v6, v7, v8, v9}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_3
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->filters:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    invoke-virtual {v0, v1, v3, v2}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    return-void
.end method

.method public bridge synthetic startOneScan()V
    .locals 0

    .line 36
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->startOneScan()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    .line 36
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->stop()V

    return-void
.end method

.method protected stopScanning()V
    .locals 2

    .line 256
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 259
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->mScanCallback:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
