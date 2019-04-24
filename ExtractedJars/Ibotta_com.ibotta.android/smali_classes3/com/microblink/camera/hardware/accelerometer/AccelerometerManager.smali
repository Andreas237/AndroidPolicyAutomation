.class public Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;
    }
.end annotation


# static fields
.field private static accelerometerMoveThreshold:F = 0.47f

.field private static accelerometerStopThreshold:F = 0.2f

.field private static samplePeriodForgetFactor:F = 0.66f


# instance fields
.field private mAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

.field private mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

.field private mAccelerometerSensor:Landroid/hardware/Sensor;

.field private mLastSensorReadTimestamp:J

.field private mMainThreadHandler:Landroid/os/Handler;

.field private mSamplePeriod:I

.field private mSensorManager:Landroid/hardware/SensorManager;

.field private mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mTimer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;F)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

    iput-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v3, -0x1

    iput-wide v3, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mLastSensorReadTimestamp:J

    iput-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mTimer:Ljava/util/Timer;

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/SensorManager;

    iput-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSensorManager:Landroid/hardware/SensorManager;

    iput-object p2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

    iget-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {p1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerSensor:Landroid/hardware/Sensor;

    const/high16 p1, 0x447a0000    # 1000.0f

    mul-float p3, p3, p1

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-int/lit16 p1, p1, 0x3e8

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSamplePeriod:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mMainThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$100(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;[F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->updateAcceleration([F)V

    return-void
.end method

.method static synthetic access$200(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mMainThreadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method private getAbsoluteAcceleration()F
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

    invoke-interface {v1}, Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;->getY()F

    move-result v1

    iget-object v2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

    invoke-interface {v2}, Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;->getZ()F

    move-result v2

    mul-float v0, v0, v0

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    mul-float v2, v2, v2

    add-float/2addr v0, v2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method private hasDeviceMoved()Z
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->getAbsoluteAcceleration()F

    move-result v0

    sget v1, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->accelerometerMoveThreshold:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private hasDeviceStopped()Z
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->getAbsoluteAcceleration()F

    move-result v0

    sget v1, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->accelerometerStopThreshold:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private updateAcceleration([F)V
    .locals 6

    iget-wide v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mLastSensorReadTimestamp:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mLastSensorReadTimestamp:J

    sub-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget v2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSamplePeriod:I

    int-to-float v2, v2

    sget v3, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->samplePeriodForgetFactor:F

    mul-float v2, v2, v3

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    long-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v3

    mul-float v0, v0, v1

    add-float/2addr v2, v0

    float-to-int v0, v2

    iput v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSamplePeriod:I

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

    iget v1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSamplePeriod:I

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    div-float/2addr v1, v2

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;->setSamplePeriod(F)V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerFilter:Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;

    const/4 v1, 0x0

    aget v2, p1, v1

    const/4 v3, 0x1

    aget v4, p1, v3

    const/4 v5, 0x2

    aget p1, p1, v5

    invoke-interface {v0, v2, v4, p1}, Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;->addAcceleration(FFF)V

    invoke-direct {p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->hasDeviceMoved()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStarted()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->hasDeviceStopped()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStopped()V

    :cond_2
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mLastSensorReadTimestamp:J

    return-void
.end method


# virtual methods
.method public isPhoneShaking()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    const-string p1, "Accelerometer accuracy has changed"

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 0

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->updateAcceleration([F)V

    return-void
.end method

.method public setAccelerometerDelegate(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    return-void
.end method

.method public startAccelerometer()V
    .locals 8

    const-string v0, "Registering accelerometer sensor listener {}"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSensorManager:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerSensor:Landroid/hardware/Sensor;

    iget v4, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSamplePeriod:I

    invoke-virtual {v0, p0, v2, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v0

    iget-object v2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    invoke-interface {v2}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStarted()V

    iget-object v2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    if-nez v0, :cond_0

    const-string v0, "unable to register accelerometer sensor with sample period {} microseconds. Trying SENSOR_DELAY_NORMAL..."

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSamplePeriod:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerSensor:Landroid/hardware/Sensor;

    const/4 v2, 0x3

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v1, "unable to register accelerometer sensor at all"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mShaking:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    invoke-interface {v1}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStopped()V

    :cond_0
    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/Timer;

    const-string v1, "Accelerometer timer"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mTimer:Ljava/util/Timer;

    iget-object v2, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mTimer:Ljava/util/Timer;

    new-instance v3, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;

    invoke-direct {v3, p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;-><init>(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;)V

    const-wide/16 v4, 0x0

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSamplePeriod:I

    int-to-long v6, v0

    invoke-virtual/range {v2 .. v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_1
    return-void
.end method

.method public stopAccelerometer()V
    .locals 3

    const-string v0, "Unregistering accelerometer sensor listener {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mTimer:Ljava/util/Timer;

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->mSensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    return-void
.end method
