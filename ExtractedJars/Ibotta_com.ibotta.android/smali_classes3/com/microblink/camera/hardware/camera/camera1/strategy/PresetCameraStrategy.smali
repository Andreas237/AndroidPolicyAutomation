.class public Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;
.super Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;


# instance fields
.field private mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;


# direct methods
.method public constructor <init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    iput-object p4, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-void
.end method


# virtual methods
.method calcSizeCompatibility(Landroid/hardware/Camera$Size;DJLcom/microblink/camera/hardware/camera/CameraType;)D
    .locals 4

    invoke-virtual {p0, p1, p6}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->isResolutionSupported(Landroid/hardware/Camera$Size;Lcom/microblink/camera/hardware/camera/CameraType;)Z

    move-result p6

    if-nez p6, :cond_0

    const-wide/high16 p1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    return-wide p1

    :cond_0
    iget p6, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-double v0, p6

    iget p6, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-double v2, p6

    mul-double v0, v0, v2

    long-to-double p4, p4

    div-double/2addr v0, p4

    const-wide/high16 p4, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p4

    const-wide v0, 0x4092c00000000000L    # 1200.0

    mul-double p4, p4, v0

    iget p6, p1, Landroid/hardware/Camera$Size;->width:I

    int-to-double v0, p6

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-double v2, p1

    div-double/2addr v0, v2

    sub-double/2addr v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    const-wide v0, 0x4091300000000000L    # 1100.0

    mul-double p1, p1, v0

    add-double/2addr p4, p1

    return-wide p4
.end method

.method public getOptimalPreviewSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 11

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "surface size is: {}x{}"

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v3, p2

    invoke-static {p0, v0, v3}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    sget-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->getDeviceSpecificOptimalPreviewSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    invoke-static {}, Lcom/microblink/camera/util/CameraCompatibility;->getDisplayOrientation()I

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    sget-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_MAX_AVAILABLE:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->getIdealHeight()I

    move-result p1

    int-to-double v0, p1

    const-wide v5, 0x3ffc71c71c71c71cL    # 1.7777777777777777

    mul-double v0, v0, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    const-string p1, "Ideal camera resolution is {}x{}"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {v3}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->getIdealHeight()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, p2

    invoke-static {p0, p1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    const-wide v6, 0x3ffc71c71c71c71cL    # 1.7777777777777777

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->getIdealHeight()I

    move-result p1

    int-to-long p1, p1

    mul-long v8, v0, p1

    move-object v4, p0

    move-object v10, p3

    invoke-virtual/range {v4 .. v10}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->calculateOptimalPreviewSize(Ljava/util/List;DJLcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide/16 p1, 0x0

    iget-object p3, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mSupportedPreviewSizes:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_3
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    rem-int/lit8 v2, v2, 0x4

    if-nez v2, :cond_3

    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    int-to-long v2, v2

    iget v4, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-long v4, v4

    mul-long v2, v2, v4

    cmp-long v4, v2, p1

    if-lez v4, :cond_3

    move-object v1, v0

    move-wide p1, v2

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method public log()V
    .locals 4

    const-string v0, "Using VideoPreset strategy with preset: {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PresetCameraStrategy;->mPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
