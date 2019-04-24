.class public Lcom/scandit/base/camera/camera2/TextureViewTransformation;
.super Ljava/lang/Object;
.source "TextureViewTransformation.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getViewTransformation(Landroid/view/TextureView;ILandroid/content/Context;Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/graphics/Matrix;
    .locals 9

    .line 36
    invoke-virtual {p3}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCaptureResolution()Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    move-result-object v0

    iget v0, v0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    .line 37
    invoke-virtual {p3}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCaptureResolution()Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    move-result-object v1

    iget v1, v1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    .line 42
    invoke-static {p2}, Lcom/scandit/base/system/SbSystemUtils;->getDeviceDefaultOrientation(Landroid/content/Context;)I

    move-result p2

    const/4 v2, 0x1

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    move v8, v1

    move v1, v0

    move v0, v8

    .line 48
    :goto_0
    new-instance p2, Landroid/graphics/RectF;

    int-to-float v2, v0

    int-to-float v3, v1

    const/4 v4, 0x0

    invoke-direct {p2, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 50
    invoke-virtual {p0}, Landroid/view/TextureView;->getWidth()I

    move-result v2

    .line 51
    invoke-virtual {p0}, Landroid/view/TextureView;->getHeight()I

    move-result p0

    .line 52
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v2, v2

    int-to-float p0, p0

    invoke-direct {v3, v4, v4, v2, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    .line 57
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v5

    .line 58
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    sub-float v6, v4, v6

    invoke-virtual {p2}, Landroid/graphics/RectF;->centerY()F

    move-result v7

    sub-float v7, v5, v7

    invoke-virtual {p2, v6, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 63
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 65
    sget-object v7, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v6, v3, p2, v7}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 71
    invoke-virtual {p3}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCameraToNativeDeviceOrientation()I

    move-result p2

    neg-int p2, p2

    .line 72
    invoke-virtual {p3}, Lcom/scandit/base/camera/camera2/SbCamera2;->isCameraFacingFront()Z

    move-result p3

    if-eqz p3, :cond_1

    neg-int p2, p2

    :cond_1
    add-int/2addr p1, p2

    .line 78
    invoke-static {p1}, Lcom/scandit/base/camera/SbICamera;->normalizeRotation(I)I

    move-result p1

    int-to-float p2, p1

    .line 79
    invoke-virtual {v6, p2, v4, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 84
    rem-int/lit16 p1, p1, 0xb4

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v8, v1

    move v1, v0

    move v0, v8

    :goto_1
    int-to-float p1, v0

    div-float/2addr p0, p1

    int-to-float p1, v1

    div-float/2addr v2, p1

    .line 89
    invoke-static {p0, v2}, Ljava/lang/Math;->max(FF)F

    move-result p0

    .line 90
    invoke-virtual {v6, p0, p0, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    return-object v6
.end method
