.class public Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;
.super Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;


# instance fields
.field protected mMaxImageDimension:I


# direct methods
.method public constructor <init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/HQCameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mMaxImageDimension:I

    return-void
.end method


# virtual methods
.method calcPhotoSizeCompatibility(Landroid/hardware/Camera$Size;DJLcom/microblink/camera/hardware/camera/CameraType;)D
    .locals 4

    invoke-virtual {p0, p1, p6}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->isResolutionSupported(Landroid/hardware/Camera$Size;Lcom/microblink/camera/hardware/camera/CameraType;)Z

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

    const-wide v0, 0x409a900000000000L    # 1700.0

    mul-double p4, p4, v0

    add-double/2addr p4, p2

    return-wide p4
.end method

.method protected getDeviceSpecificOptimalPhotoSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 6

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->getOptimalFrontFacingPhotoSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->getOptimalBackFacingPhotoSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    new-instance v0, Landroid/hardware/Camera$Size;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Landroid/hardware/Camera$Size;-><init>(Landroid/hardware/Camera;II)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    const-string v1, "Using device specific resolution {}x{}"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getWidth()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v2

    invoke-static {p0, v1, v3}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_1
    const-string v0, "Device specific resolution {}x{}"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getWidth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v4

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Is not supported!!"

    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getOptimalPhotoSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 18

    move-object/from16 v7, p0

    const-string v0, "surface size is: {}x{}"

    const/4 v8, 0x2

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v9, 0x0

    aput-object v2, v1, v9

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v10, 0x1

    aput-object v2, v1, v10

    invoke-static {v7, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object/from16 v11, p3

    invoke-virtual {v7, v11}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->getDeviceSpecificOptimalPhotoSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/microblink/camera/util/CameraCompatibility;->getDisplayOrientation()I

    move-result v0

    if-ne v0, v10, :cond_1

    move/from16 v1, p1

    move/from16 v0, p2

    goto :goto_0

    :cond_1
    move/from16 v0, p1

    move/from16 v1, p2

    :goto_0
    iget-object v2, v7, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    int-to-double v12, v0

    int-to-double v0, v1

    div-double/2addr v12, v0

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    move-object v15, v3

    move-wide/from16 v16, v4

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/hardware/Camera$Size;

    iget v0, v6, Landroid/hardware/Camera$Size;->width:I

    iget v1, v7, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mMaxImageDimension:I

    if-gt v0, v1, :cond_3

    iget v0, v6, Landroid/hardware/Camera$Size;->height:I

    iget v1, v7, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mMaxImageDimension:I

    if-gt v0, v1, :cond_3

    const-wide/32 v4, 0x1fa400

    move-object/from16 v0, p0

    move-object v1, v6

    move-wide v2, v12

    move-object v8, v6

    move-object/from16 v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->calcSizeCompatibility(Landroid/hardware/Camera$Size;DJLcom/microblink/camera/hardware/camera/CameraType;)D

    move-result-wide v0

    cmpg-double v2, v0, v16

    if-gez v2, :cond_2

    move-wide/from16 v16, v0

    move-object v15, v8

    :cond_2
    const-string v2, "Compatibility for capture size {}x{} is {}"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, v8, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v9

    iget v4, v8, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v10

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    invoke-static {v7, v2, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    const/4 v1, 0x2

    :goto_2
    const/4 v8, 0x2

    goto :goto_1

    :cond_4
    const/4 v1, 0x2

    if-eqz v15, :cond_5

    const-string v0, "Chosen photo size is {}x{}"

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, v15, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v9

    iget v2, v15, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v10

    invoke-static {v15, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    return-object v15
.end method

.method protected isResolutionSupported(Landroid/hardware/Camera$Size;Lcom/microblink/camera/hardware/camera/CameraType;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public log()V
    .locals 4

    const-string v0, "Using Photo preview camera strategy with max image dimension: {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mMaxImageDimension:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Photo preview camera strategy with max image dimension: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->mMaxImageDimension:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
