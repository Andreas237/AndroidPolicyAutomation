.class public abstract Lcom/shopkick/sdk/sensor/SensorBase;
.super Ljava/lang/Object;
.source "SensorBase.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/Sensor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;
    }
.end annotation


# instance fields
.field protected readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private sensorImplementationRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/sdk/sensor/SensorImplementation;",
            ">;"
        }
    .end annotation
.end field

.field private volatile status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

.field protected statusListener:Lcom/shopkick/sdk/sensor/StatusListener;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPENING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->sensorImplementationRef:Ljava/lang/ref/WeakReference;

    .line 32
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/SensorBase;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 33
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/SensorBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 34
    sget-object p1, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPEN:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorBase;->status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    return-void
.end method


# virtual methods
.method protected brokerReadingListenerCallback(Lcom/shopkick/sdk/sensor/SensorBase;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz v0, :cond_0

    .line 95
    invoke-interface {v0, p1, p2}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    .line 79
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->CLOSING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    .line 80
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/shopkick/sdk/sensor/SensorManager;->close(Lcom/shopkick/sdk/sensor/Sensor;)V

    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->sensorImplementationRef:Ljava/lang/ref/WeakReference;

    .line 82
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 83
    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 84
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->CLOSED:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    return-void
.end method

.method public getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 2

    .line 54
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPEN:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorBase;->status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 56
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorBase;->sensorImplementationRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 57
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->sensorImplementationRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorImplementation;

    invoke-interface {v0}, Lcom/shopkick/sdk/sensor/SensorImplementation;->getLastReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    :cond_0
    return-object v0

    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sensor is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method getReadingListener()Lcom/shopkick/sdk/sensor/ReadingListener;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    return-object v0
.end method

.method public getSensorImplementation()Lcom/shopkick/sdk/sensor/SensorImplementation;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->sensorImplementationRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorImplementation;

    return-object v0
.end method

.method getStatusListener()Lcom/shopkick/sdk/sensor/StatusListener;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    return-object v0
.end method

.method public setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
    .locals 2

    .line 65
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPEN:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorBase;->status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorBase;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    return-void

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sensor is closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 2

    .line 72
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPEN:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorBase;->status:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorBase;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    return-void

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sensor is closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
