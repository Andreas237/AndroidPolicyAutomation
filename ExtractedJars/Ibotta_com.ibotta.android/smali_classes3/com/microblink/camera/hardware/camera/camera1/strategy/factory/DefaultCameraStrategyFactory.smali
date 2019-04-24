.class public Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/DefaultCameraStrategyFactory;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private isCameraHD(Landroid/hardware/Camera;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Camera$Size;

    iget v2, v1, Landroid/hardware/Camera$Size;->width:I

    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/16 v2, 0x2d0

    if-lt v1, v2, :cond_1

    const-string p1, "Device camera is HD ready!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const-string p1, "Device camera is not HD ready!"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method


# virtual methods
.method public createStrategy(Lcom/microblink/camera/hardware/DeviceManager;Landroid/hardware/Camera;Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    if-eqz p2, :cond_7

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldAlwaysUsePhotoMode()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->isUseMegapixelsTargetForChoosingPhotoSize()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/strategy/TargetPixelsPhotoCameraStrategy;

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getMaxAllowedPhotoDimension()I

    move-result p3

    invoke-direct {v0, p2, p3, p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/TargetPixelsPhotoCameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_3

    :cond_0
    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getMaxAllowedPhotoDimension()I

    move-result p3

    invoke-direct {v0, p2, p3, p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_3

    :cond_1
    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v1

    sget-object v2, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    if-ne v1, v2, :cond_3

    invoke-direct {p0, p2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/DefaultCameraStrategyFactory;->isCameraHD(Landroid/hardware/Camera;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getMinAllowedVideoResolution()I

    move-result p3

    invoke-direct {v1, p2, p3, p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getMinAllowedVideoResolution()I

    move-result p3

    invoke-direct {v1, p2, p3, p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_0

    :cond_3
    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getMinAllowedVideoResolution()I

    move-result v2

    invoke-virtual {p3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object p3

    invoke-direct {v1, p2, v2, p1, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)V

    :goto_0
    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->getCameraInitDelay()I

    move-result p1

    const/4 p3, -0x1

    if-eq p1, p3, :cond_4

    :goto_1
    invoke-virtual {v1, p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->setCameraInitDelay(I)V

    goto :goto_2

    :cond_4
    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result p1

    const/16 p3, 0x10

    if-lt p1, p3, :cond_5

    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    const-string p2, "continuous-picture"

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v1, v0}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->setCameraInitDelay(I)V

    goto :goto_2

    :cond_5
    const/16 p1, 0x12c

    goto :goto_1

    :goto_2
    move-object v0, v1

    :goto_3
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->log()V

    return-object v0

    :cond_6
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "Cannot create strategy with empty settings"

    invoke-static {p0, p2, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot create strategy with empty settings"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "Cannot create strategy for null camera!"

    invoke-static {p0, p2, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot create strategy for null camera!"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "Device manager must be set to create CameraStrategy"

    invoke-static {p0, p2, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Device manager must be set to create CameraStrategy"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
