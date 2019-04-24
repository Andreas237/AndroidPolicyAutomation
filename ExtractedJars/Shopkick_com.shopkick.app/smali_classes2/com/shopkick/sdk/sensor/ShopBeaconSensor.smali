.class public Lcom/shopkick/sdk/sensor/ShopBeaconSensor;
.super Lcom/shopkick/sdk/sensor/SensorBase;
.source "ShopBeaconSensor.java"


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/sensor/SensorBase;-><init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;->getLastReading()Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    move-result-object v0

    return-object v0
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/ShopBeaconReading;
    .locals 1

    .line 18
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/SensorBase;->getLastReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 22
    :cond_0
    check-cast v0, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    return-object v0
.end method
