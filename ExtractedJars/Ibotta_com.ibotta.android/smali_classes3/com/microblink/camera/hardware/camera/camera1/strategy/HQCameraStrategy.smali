.class public Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;
.super Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;


# direct methods
.method public constructor <init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    return-void
.end method


# virtual methods
.method calcSizeCompatibility(Landroid/hardware/Camera$Size;DJLcom/microblink/camera/hardware/camera/CameraType;)D
    .locals 2

    invoke-virtual {p0, p1, p6}, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;->isResolutionSupported(Landroid/hardware/Camera$Size;Lcom/microblink/camera/hardware/camera/CameraType;)Z

    move-result p2

    if-nez p2, :cond_0

    const-wide/high16 p1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    return-wide p1

    :cond_0
    iget p2, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-double p2, p2

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-double v0, p1

    mul-double p2, p2, v0

    long-to-double p4, p4

    div-double/2addr p2, p4

    const-wide/high16 p4, 0x3ff0000000000000L    # 1.0

    sub-double/2addr p2, p4

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    const-wide p3, 0x4092c00000000000L    # 1200.0

    mul-double p1, p1, p3

    return-wide p1
.end method

.method public getOptimalPreviewSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 10

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "surface size is: {}x{}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;->getDeviceSpecificOptimalPreviewSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lcom/microblink/camera/util/CameraCompatibility;->getDisplayOrientation()I

    move-result v0

    if-ne v0, v3, :cond_2

    move v9, p2

    move p2, p1

    move p1, v9

    :cond_2
    int-to-double v0, p1

    int-to-double p1, p2

    div-double v4, v0, p1

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    const-wide/32 v6, 0x1fa400

    move-object v2, p0

    move-object v8, p3

    invoke-virtual/range {v2 .. v8}, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;->calculateOptimalPreviewSize(Ljava/util/List;DJLcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object p1

    return-object p1
.end method

.method public log()V
    .locals 2

    const-string v0, "Using HQ strategy"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "HQ camera strategy!"

    return-object v0
.end method
