.class public Lcom/shopkick/sdk/sensor/GeoFenceSensor;
.super Lcom/shopkick/sdk/sensor/SensorBase;
.source "GeoFenceSensor.java"


# instance fields
.field private final geoFences:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/sensor/SensorBase;-><init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V

    .line 18
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->geoFences:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-void
.end method


# virtual methods
.method public addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->geoFences:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 30
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->updateGeoFenceSensorImplementations()V

    return-void
.end method

.method protected brokerReadingListenerCallback(Lcom/shopkick/sdk/sensor/SensorBase;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz v0, :cond_0

    .line 45
    move-object v0, p2

    check-cast v0, Lcom/shopkick/sdk/sensor/GeoFenceReading;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getGeoFence()Lcom/shopkick/sdk/sensor/GeoFence;

    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->geoFences:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    invoke-interface {v0, p1, p2}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    :cond_0
    return-void
.end method

.method getGeoFences()Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->geoFences:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object v0
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/GeoFenceReading;
    .locals 1

    .line 55
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/SensorBase;->getLastReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_0
    check-cast v0, Lcom/shopkick/sdk/sensor/GeoFenceReading;

    return-object v0
.end method

.method public bridge synthetic getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->getLastReading()Lcom/shopkick/sdk/sensor/GeoFenceReading;

    move-result-object v0

    return-object v0
.end method

.method public removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->geoFences:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 36
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->updateGeoFenceSensorImplementations()V

    return-void
.end method
