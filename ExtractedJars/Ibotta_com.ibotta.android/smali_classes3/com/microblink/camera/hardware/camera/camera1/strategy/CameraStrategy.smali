.class public abstract Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    }
.end annotation


# instance fields
.field protected mCamera:Landroid/hardware/Camera;

.field protected mCameraInitDelay:I

.field protected mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field protected mMinAllowedVideoPreviewResolution:I

.field protected mSupportedPreviewSizes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/hardware/Camera$Size;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mCameraInitDelay:I

    const v1, 0x38400

    iput v1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mMinAllowedVideoPreviewResolution:I

    if-eqz p1, :cond_1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mCamera:Landroid/hardware/Camera;

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->hasDeviceListsLoaded()Z

    move-result p1

    if-eqz p1, :cond_0

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mMinAllowedVideoPreviewResolution:I

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Device manager must have device list loaded!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "Camera cannot be null while initializing camera strategy"

    invoke-static {p0, p2, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Camera for CameraStragy cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method abstract calcSizeCompatibility(Landroid/hardware/Camera$Size;DJLcom/microblink/camera/hardware/camera/CameraType;)D
.end method

.method protected calculateOptimalPreviewSize(Ljava/util/List;DJLcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/Camera$Size;",
            ">;DJ",
            "Lcom/microblink/camera/hardware/camera/CameraType;",
            ")",
            "Landroid/hardware/Camera$Size;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/high16 v2, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/Camera$Size;

    iget v5, v4, Landroid/hardware/Camera$Size;->width:I

    rem-int/lit8 v5, v5, 0x4

    if-nez v5, :cond_1

    move-object v5, p0

    move-object v6, v4

    move-wide v7, p2

    move-wide/from16 v9, p4

    move-object/from16 v11, p6

    invoke-virtual/range {v5 .. v11}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->calcSizeCompatibility(Landroid/hardware/Camera$Size;DJLcom/microblink/camera/hardware/camera/CameraType;)D

    move-result-wide v5

    cmpg-double v7, v5, v2

    if-gez v7, :cond_0

    move-object v1, v4

    move-wide v2, v5

    :cond_0
    const-string v7, "Compatibility for preview size {}x{} is {}"

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget v10, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    iget v4, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v8, v9

    const/4 v4, 0x2

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v8, v4

    move-object v4, p0

    invoke-static {p0, v7, v8}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object v4, p0

    goto :goto_0

    :cond_2
    move-object v4, p0

    return-object v1
.end method

.method public getCameraInitDelay()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mCameraInitDelay:I

    return v0
.end method

.method protected getDeviceSpecificOptimalPreviewSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 6

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->getOptimalFrontFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->getOptimalBackFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    new-instance v1, Landroid/hardware/Camera$Size;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getHeight()I

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Landroid/hardware/Camera$Size;-><init>(Landroid/hardware/Camera;II)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Using device specific resolution {}x{}"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getWidth()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p0, v0, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    const-string v0, "Device specific resolution {}x{} is not supported on Camera1 API. If possible, use Camera2 API."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getWidth()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract getOptimalPreviewSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
.end method

.method public final isPreviewSizeTooSmall(Lcom/microblink/camera/hardware/camera/CameraType;)Z
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    invoke-virtual {p0, v2, p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->isResolutionSupported(Landroid/hardware/Camera$Size;Lcom/microblink/camera/hardware/camera/CameraType;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_2
    return v1
.end method

.method protected isResolutionSupported(Landroid/hardware/Camera$Size;Lcom/microblink/camera/hardware/camera/CameraType;)Z
    .locals 6

    invoke-virtual {p0, p2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->getDeviceSpecificOptimalPreviewSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object p2

    iget v0, p1, Landroid/hardware/Camera$Size;->height:I

    iget v1, p1, Landroid/hardware/Camera$Size;->width:I

    mul-int v0, v0, v1

    iget v1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mMinAllowedVideoPreviewResolution:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Landroid/hardware/Camera$Size;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    invoke-static {}, Lcom/microblink/internal/Logger;->getCurrentLogLevel()Lcom/microblink/internal/Logger$LogLevel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v1

    sget-object v4, Lcom/microblink/internal/Logger$LogLevel;->LOG_VERBOSE:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v4}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v4

    if-lt v1, v4, :cond_2

    const-string v1, "Resolution {}x{}: resolution high enough: {}, resolution specific for device: {}"

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p1, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    const/4 p1, 0x2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v4, p1

    const/4 p1, 0x3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v4, p1

    invoke-static {p0, v1, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    if-nez v0, :cond_4

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    return v3

    :cond_4
    :goto_2
    return v2
.end method

.method public abstract log()V
.end method

.method public setCameraInitDelay(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->mCameraInitDelay:I

    return-void
.end method
