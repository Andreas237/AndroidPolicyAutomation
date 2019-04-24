.class Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;
.super Landroid/bluetooth/le/ScanCallback;
.source "ShopkickBeaconSensorImplementation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NewScanCallback"
.end annotation


# instance fields
.field private final lockObject:Ljava/lang/Object;

.field private parsedBeacons:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 328
    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    .line 329
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->parsedBeacons:Ljava/util/Map;

    .line 335
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->lockObject:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$1;)V
    .locals 0

    .line 328
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public clearParsedBeacons()V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->lockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 339
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 340
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getParsedBeacons()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation

    .line 332
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->parsedBeacons:Ljava/util/Map;

    return-object v0
.end method

.method public onBatchScanResults(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/bluetooth/le/ScanResult;",
            ">;)V"
        }
    .end annotation

    .line 365
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Level;->DEBUG:Lcom/shopkick/logging/Level;

    invoke-virtual {v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->isLevelActive(Lcom/shopkick/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/le/ScanResult;

    .line 367
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 368
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "%1$s ScanResult - Results %2$s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-string v7, "SBSI"

    aput-object v7, v5, v6

    const/4 v6, 0x1

    .line 371
    invoke-virtual {v0}, Landroid/bluetooth/le/ScanResult;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    .line 367
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onScanFailed(I)V
    .locals 7

    .line 378
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 379
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s Scan Failed (Error Code: %2$d)"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "SBSI"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 382
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v5, 0x1

    aput-object p1, v4, v5

    .line 378
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 6

    .line 345
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 346
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "%1$s %2$s %3$s"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "SBSI"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "BLE device found:"

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v3, v5

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 351
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->lockObject:Ljava/lang/Object;

    monitor-enter p1

    .line 352
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/Beacon;

    goto :goto_0

    .line 355
    :cond_0
    new-instance v0, Lcom/shopkick/sdk/scanner/Beacon;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/sdk/scanner/Beacon;-><init>(Ljava/lang/String;)V

    .line 356
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$NewScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 360
    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result p1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/sdk/scanner/Beacon;->parse(I[B)V

    return-void

    :catchall_0
    move-exception p2

    .line 358
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method
