.class public Lcom/scandit/base/camera/camera2/CaptureResultHandling;
.super Ljava/lang/Object;
.source "CaptureResultHandling.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# static fields
.field private static final TOLERATED_FOCUS_DISTANCE_DEVIATION:F = 0.05f


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getBaseMetadata(Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)Lcom/scandit/recognition/ImageDescription;
    .locals 3

    .line 145
    new-instance v0, Lcom/scandit/recognition/ImageDescription;

    invoke-direct {v0}, Lcom/scandit/recognition/ImageDescription;-><init>()V

    .line 146
    iget v1, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setWidth(I)V

    .line 147
    iget v1, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setHeight(I)V

    .line 148
    sget v1, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_YPCRCB_8U:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setLayout(I)V

    .line 149
    iget v1, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setFirstPlaneRowBytes(I)V

    const/4 v1, 0x0

    .line 150
    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setFirstPlaneOffset(I)V

    .line 151
    iget v1, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setSecondPlaneByteRowBytes(I)V

    .line 152
    iget v1, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iget v2, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    mul-int v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setSecondPlaneOffset(I)V

    .line 153
    iget v1, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    mul-int/lit8 v1, v1, 0x2

    iget p0, p0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    mul-int v1, v1, p0

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setMemorySize(I)V

    return-object v0
.end method

.method static getExtendedMetadata(Landroid/media/Image;Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/hardware/camera2/TotalCaptureResult;)Lcom/scandit/base/camera/capturedImage/ImageMetadata;
    .locals 8

    .line 31
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    invoke-direct {v0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;-><init>()V

    .line 33
    invoke-virtual {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 34
    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {p2, v2}, Lcom/scandit/base/camera/camera2/CaptureResultHandling;->getFocusState(Landroid/hardware/camera2/TotalCaptureResult;F)Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFocusState(Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;)V

    .line 40
    invoke-virtual {p2}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v3

    sget-object v4, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 42
    :goto_1
    invoke-virtual {v0, v3}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setIsFocusTriggered(Z)V

    .line 44
    sget-object v3, Landroid/hardware/camera2/CaptureResult;->LENS_APERTURE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p2, v3}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v0, v3}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFrameFNumber(Ljava/lang/Float;)V

    .line 47
    sget-object v3, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUS_DISTANCE_APPLIED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    if-ne v2, v3, :cond_2

    .line 49
    invoke-virtual {p2}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    goto :goto_2

    :cond_2
    sget-object v2, Landroid/hardware/camera2/CaptureResult;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 50
    invoke-virtual {p2, v2}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    .line 47
    :goto_2
    invoke-virtual {v0, v2}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFocusDistance(Ljava/lang/Float;)V

    .line 52
    invoke-virtual {v0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->getFocusDistance()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 54
    invoke-virtual {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v2

    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_FOCUS_DISTANCE_CALIBRATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_5

    .line 58
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v6, 0x2

    if-ne v3, v6, :cond_3

    const-string v1, "CALIBRATED: diopters (1/meter)"

    .line 60
    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFocusDistanceUnit(Ljava/lang/String;)V

    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v5, :cond_4

    const-string v1, "APPROXIMATE: diopters (1/meter)"

    .line 63
    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFocusDistanceUnit(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    if-eqz v1, :cond_5

    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UNCALIBRATED: 0.0 (farthest) - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (nearest)"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFocusDistanceUnit(Ljava/lang/String;)V

    .line 76
    :cond_5
    :goto_3
    invoke-virtual {p0}, Landroid/media/Image;->getTimestamp()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setTimestamp(Ljava/lang/Long;)V

    .line 78
    sget-object p0, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p2, p0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {v0, p0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFrameIso(Ljava/lang/Integer;)V

    .line 80
    sget-object p0, Landroid/hardware/camera2/CaptureResult;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p2, p0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    const-wide v1, 0x3e112e0be826d695L    # 1.0E-9

    const/4 v3, 0x0

    if-nez p0, :cond_6

    move-object p0, v3

    goto :goto_4

    .line 82
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    long-to-double v6, v6

    mul-double v6, v6, v1

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    .line 81
    :goto_4
    invoke-virtual {v0, p0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setFrameExposureTime(Ljava/lang/Double;)V

    .line 84
    sget-object p0, Landroid/hardware/camera2/CaptureResult;->SENSOR_ROLLING_SHUTTER_SKEW:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p2, p0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    if-nez p0, :cond_7

    move-object p0, v3

    goto :goto_5

    .line 85
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    long-to-double v6, v6

    mul-double v6, v6, v1

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    :goto_5
    invoke-virtual {v0, p0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setRollingShutterSkew(Ljava/lang/Double;)V

    .line 87
    sget-object p0, Landroid/hardware/camera2/CaptureResult;->FLASH_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p2, p0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-nez p0, :cond_8

    goto :goto_6

    .line 89
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v1, 0x3

    if-ne p0, v1, :cond_9

    const/4 v4, 0x1

    :cond_9
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 88
    :goto_6
    invoke-virtual {v0, v3}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setTorchEnabled(Ljava/lang/Boolean;)V

    .line 91
    invoke-virtual {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 92
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result p0

    .line 93
    sget-object p1, Landroid/hardware/camera2/TotalCaptureResult;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p2, p1}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    int-to-float p0, p0

    int-to-float p1, p1

    div-float/2addr p0, p1

    .line 94
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setZoom(Ljava/lang/Float;)V

    return-object v0
.end method

.method private static getFocusState(Landroid/hardware/camera2/TotalCaptureResult;F)Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
    .locals 3

    .line 101
    sget-object p1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    .line 103
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 105
    :cond_0
    invoke-virtual {p0}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    .line 106
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_1

    packed-switch p1, :pswitch_data_0

    .line 140
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 110
    :pswitch_0
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->NOT_FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 112
    :pswitch_1
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 108
    :pswitch_2
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->ACTIVE_SCAN:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 114
    :cond_1
    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    .line 115
    sget-object v1, Landroid/hardware/camera2/CaptureResult;->LENS_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p0, v1}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 116
    sget-object v2, Landroid/hardware/camera2/CaptureResult;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p0, v2}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    .line 117
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz p1, :cond_6

    if-eqz v1, :cond_6

    if-eqz p0, :cond_6

    if-nez v0, :cond_2

    goto :goto_0

    .line 125
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_3

    .line 126
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 129
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_4

    .line 130
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->ACTIVE_SCAN:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 132
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    sub-float/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    const p1, 0x3d4ccccd    # 0.05f

    cmpg-float p0, p0, p1

    if-gez p0, :cond_5

    .line 134
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUS_DISTANCE_APPLIED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 136
    :cond_5
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->MISSING_CAMERA_SUPPORT:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    .line 123
    :cond_6
    :goto_0
    sget-object p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->MISSING_CAMERA_SUPPORT:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
