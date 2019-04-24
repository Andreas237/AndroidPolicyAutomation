.class Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;
.super Ljava/lang/Object;
.source "LegacyShopkickBeaconSensorImplementation.java"

# interfaces
.implements Landroid/bluetooth/BluetoothAdapter$LeScanCallback;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BLEScanCallback"
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

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->parsedBeacons:Ljava/util/Map;

    .line 211
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->lockObject:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;)V
    .locals 0

    .line 208
    invoke-direct {p0}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;-><init>()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;)Ljava/util/Map;
    .locals 0

    .line 208
    iget-object p0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->parsedBeacons:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public clearParsedBeacons()V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->lockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 215
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 216
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onLeScan(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 7

    .line 221
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s %2$s %3$s"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "LSBSI"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "BLE device found:"

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const/4 v5, 0x2

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->lockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 225
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 226
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/scanner/Beacon;

    goto :goto_0

    .line 228
    :cond_0
    new-instance v1, Lcom/shopkick/sdk/scanner/Beacon;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;-><init>(Ljava/lang/String;)V

    .line 229
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->parsedBeacons:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v1

    .line 231
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    invoke-virtual {p1, p2, p3}, Lcom/shopkick/sdk/scanner/Beacon;->parse(I[B)V

    return-void

    :catchall_0
    move-exception p1

    .line 231
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
