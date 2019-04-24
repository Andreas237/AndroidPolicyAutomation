.class public Lcom/scandit/base/camera/camera2/ZoomLogic;
.super Lcom/scandit/base/camera/camera2/ParameterAdjuster;
.source "ZoomLogic.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# instance fields
.field absoluteZoom:I

.field isAbsoluteZoom:Z

.field zoom:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/ParameterAdjuster;-><init>()V

    return-void
.end method


# virtual methods
.method getRelativeZoom()F
    .locals 1

    .line 35
    iget v0, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->zoom:F

    return v0
.end method

.method protected isAbleToRun(Lcom/scandit/base/camera/camera2/SbCamera2;)Z
    .locals 0

    .line 51
    invoke-super {p0, p1}, Lcom/scandit/base/camera/camera2/ParameterAdjuster;->isAbleToRun(Lcom/scandit/base/camera/camera2/SbCamera2;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/ZoomLogic;->getCamera()Lcom/scandit/base/camera/camera2/SbCamera2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected run(Lcom/scandit/base/camera/camera2/SbCamera2;)V
    .locals 7

    .line 56
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/ZoomLogic;->getCamera()Lcom/scandit/base/camera/camera2/SbCamera2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    .line 57
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 60
    iget-boolean v2, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->isAbsoluteZoom:Z

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v2, :cond_0

    .line 61
    iget v2, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->absoluteZoom:I

    int-to-float v2, v2

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    goto :goto_0

    :cond_0
    sub-float v2, v1, v3

    .line 63
    iget v4, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->zoom:F

    mul-float v2, v2, v4

    add-float/2addr v2, v3

    .line 65
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 67
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 68
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 69
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v4

    .line 70
    iget v5, v0, Landroid/graphics/Rect;->left:I

    .line 71
    iget v6, v0, Landroid/graphics/Rect;->top:I

    cmpl-float v3, v1, v3

    if-lez v3, :cond_1

    .line 73
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    float-to-int v2, v2

    .line 74
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v1

    float-to-int v4, v3

    .line 75
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr v1, v2

    div-int/lit8 v5, v1, 0x2

    .line 76
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    sub-int/2addr v1, v4

    div-int/lit8 v6, v1, 0x2

    .line 79
    :cond_1
    new-instance v1, Landroid/graphics/Rect;

    add-int/2addr v2, v5

    add-int/2addr v4, v6

    invoke-direct {v1, v5, v6, v2, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 80
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 85
    :cond_2
    new-instance v0, Lcom/scandit/base/camera/camera2/ZoomLogic$1;

    invoke-direct {v0, p0, v1}, Lcom/scandit/base/camera/camera2/ZoomLogic$1;-><init>(Lcom/scandit/base/camera/camera2/ZoomLogic;Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    return-void
.end method

.method setAbsoluteZoom(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->absoluteZoom:I

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->isAbsoluteZoom:Z

    .line 46
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/ZoomLogic;->enqueueForUpdate()V

    return-void
.end method

.method setRelativeZoom(F)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->zoom:F

    const/4 p1, 0x0

    .line 29
    iput-boolean p1, p0, Lcom/scandit/base/camera/camera2/ZoomLogic;->isAbsoluteZoom:Z

    .line 31
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/ZoomLogic;->enqueueForUpdate()V

    return-void
.end method
