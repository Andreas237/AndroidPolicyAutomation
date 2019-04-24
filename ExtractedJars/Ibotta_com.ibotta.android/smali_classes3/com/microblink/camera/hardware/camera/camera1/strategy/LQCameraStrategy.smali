.class public Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;
.super Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;


# direct methods
.method public constructor <init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    return-void
.end method


# virtual methods
.method calcSizeCompatibility(Landroid/hardware/Camera$Size;DJLcom/microblink/camera/hardware/camera/CameraType;)D
    .locals 4

    invoke-virtual {p0, p1, p6}, Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;->isResolutionSupported(Landroid/hardware/Camera$Size;Lcom/microblink/camera/hardware/camera/CameraType;)Z

    move-result p6

    if-nez p6, :cond_0

    const-wide/high16 p1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    return-wide p1

    :cond_0
    iget p6, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-double v0, p6

    iget p6, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-double v2, p6

    div-double/2addr v0, v2

    sub-double/2addr v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p2

    const-wide v0, 0x409f400000000000L    # 2000.0

    mul-double p2, p2, v0

    iget p6, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-double v0, p6

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-double v2, p1

    mul-double v0, v0, v2

    long-to-double p4, p4

    div-double/2addr v0, p4

    const-wide/high16 p4, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p4

    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double p4, p4, v0

    add-double/2addr p4, p2

    return-wide p4
.end method

.method public getOptimalPreviewSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 10

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;->getDeviceSpecificOptimalPreviewSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lcom/microblink/camera/util/CameraCompatibility;->getDisplayOrientation()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    move v9, p2

    move p2, p1

    move p1, v9

    :cond_2
    int-to-double v0, p1

    int-to-double p1, p2

    div-double v4, v0, p1

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    const-wide/32 v6, 0x5dc00

    move-object v2, p0

    move-object v8, p3

    invoke-virtual/range {v2 .. v8}, Lcom/microblink/camera/hardware/camera/camera1/strategy/LQCameraStrategy;->calculateOptimalPreviewSize(Ljava/util/List;DJLcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object p1

    return-object p1
.end method

.method public log()V
    .locals 2

    const-string v0, "Using LQ strategy"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "LQ camera strategy"

    return-object v0
.end method
