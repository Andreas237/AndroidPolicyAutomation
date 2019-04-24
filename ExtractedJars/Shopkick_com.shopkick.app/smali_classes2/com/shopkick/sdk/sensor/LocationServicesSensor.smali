.class public Lcom/shopkick/sdk/sensor/LocationServicesSensor;
.super Lcom/shopkick/sdk/sensor/SensorBase;
.source "LocationServicesSensor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;
    }
.end annotation


# instance fields
.field private profile:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/sensor/SensorBase;-><init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V

    .line 36
    sget-object p1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->MEDIUM:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->profile:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    return-void
.end method


# virtual methods
.method public getLastReading()Lcom/shopkick/sdk/sensor/LocationServicesReading;
    .locals 1

    .line 60
    invoke-super {p0}, Lcom/shopkick/sdk/sensor/SensorBase;->getLastReading()Lcom/shopkick/sdk/sensor/Reading;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_0
    check-cast v0, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    return-object v0
.end method

.method public bridge synthetic getLastReading()Lcom/shopkick/sdk/sensor/Reading;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->getLastReading()Lcom/shopkick/sdk/sensor/LocationServicesReading;

    move-result-object v0

    return-object v0
.end method

.method getPowerAndAccuracyProfile()Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->profile:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    return-object v0
.end method

.method public initiateLocationUpdate()V
    .locals 5

    .line 69
    invoke-virtual {p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->getSensorImplementation()Lcom/shopkick/sdk/sensor/SensorImplementation;

    move-result-object v0

    .line 70
    instance-of v1, v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    if-eqz v1, :cond_0

    .line 71
    check-cast v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->initiateLocationUpdate()V

    goto :goto_0

    .line 73
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "Cannot initiate location update without LocationServicesSensorImplementation instance."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setPowerAndAccuracyProfile(Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 52
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->profile:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    .line 55
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->updateLocationServicesSensorImplementations()V

    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'profile\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
