.class public Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/factory/ICameraManagerFactory;


# static fields
.field private static final ACCELEROMETER_SAMPLE_PERIOD:F = 0.083333336f


# instance fields
.field private mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/DeviceManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Device manager cannot be null!"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public createCameraManager(Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/hardware/camera/ICameraManager;
    .locals 10

    new-instance v6, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;

    const v2, 0x3daaaaab

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;-><init>(FF)V

    invoke-direct {v6, v0, v1, v2}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;-><init>(Landroid/content/Context;Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;F)V

    new-instance v7, Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/DefaultCameraStrategyFactory;

    invoke-direct {v7}, Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/DefaultCameraStrategyFactory;-><init>()V

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldAlwaysUsePhotoMode()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v8, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    move-object v0, v8

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    return-object v8

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    const/4 v8, 0x0

    if-lt v0, v1, :cond_5

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->isUseLegacyCamera()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->isForceUseLegacyCameraAPI()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->isCamera2NativelySupported(Landroid/content/Context;Lcom/microblink/camera/hardware/camera/CameraType;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Using video camera2 manager"

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v1, v6, p1, p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    return-object v0

    :cond_2
    invoke-static {}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungUtils;->isSamsungDevice()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->isPhaseAutofocusBuggy()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Using video camera1 manager because phase autofocus is buggy on this device"

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v9, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    move-object v0, v9

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    return-object v9

    :cond_3
    const-string v0, "Camera2 API not supported natively. Will use video camera1 manager!"

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v9, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    move-object v0, v9

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V
    :try_end_0
    .catch Landroid/util/AndroidException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v9

    :catch_0
    const-string v0, "Failed to query camera capabilities when deciding which camera manager to use! Will use camera1 API"

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v8, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    move-object v0, v8

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    return-object v8

    :cond_4
    :goto_0
    const-string v0, "Using video camera1 manager because either settings or device blacklist expect using legacy camera API"

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v8, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    move-object v0, v8

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    return-object v8

    :cond_5
    const-string v0, "Using video camera1 manager"

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v8, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    move-object v0, v8

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    return-object v8
.end method
