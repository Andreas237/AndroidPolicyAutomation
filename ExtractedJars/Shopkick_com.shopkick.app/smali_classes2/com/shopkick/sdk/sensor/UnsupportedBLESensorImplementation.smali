.class public Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;
.super Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;
.source "UnsupportedBLESensorImplementation.java"


# static fields
.field private static final NoOpRunnable:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    new-instance v0, Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;->NoOpRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, v0, v0, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    return-void
.end method

.method public addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    return-void
.end method

.method protected createStopScanRunnable(Z)Ljava/lang/Runnable;
    .locals 0

    .line 24
    sget-object p1, Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;->NoOpRunnable:Ljava/lang/Runnable;

    return-object p1
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic removeBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->removeBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    return-void
.end method

.method public removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
    .locals 0

    return-void
.end method

.method public setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 0

    return-void
.end method

.method public setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    return-void
.end method

.method public start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected startAdapterScan()V
    .locals 0

    return-void
.end method

.method public startOneScan()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method

.method protected stopScanning()V
    .locals 0

    return-void
.end method
