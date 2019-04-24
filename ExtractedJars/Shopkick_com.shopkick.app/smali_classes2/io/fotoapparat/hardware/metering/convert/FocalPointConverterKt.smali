.class public final Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;
.super Ljava/lang/Object;
.source "FocalPointConverter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocalPointConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocalPointConverter.kt\nio/fotoapparat/hardware/metering/convert/FocalPointConverterKt\n*L\n1#1,118:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a$\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u000c\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a$\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u000c\u0010\u0011\u001a\u00020\u0003*\u00020\u0001H\u0002\u001a\u001c\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u000c\u0010\u0015\u001a\u00020\u0013*\u00020\u0006H\u0002\u001a\"\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u000c\u0010\u0019\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "CAMERA_BOUNDS_RANGE",
        "",
        "FOCUS_AREA_HALF_SIZE",
        "",
        "WEIGHT",
        "adjustPointToCameraPreview",
        "Lio/fotoapparat/hardware/metering/PointF;",
        "visibleResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "displayOrientationDegrees",
        "cameraIsMirrored",
        "",
        "clamp",
        "min",
        "max",
        "configMatrix",
        "Landroid/graphics/Matrix;",
        "ensureAreaBound",
        "focusBounds",
        "Landroid/graphics/Rect;",
        "Lio/fotoapparat/hardware/metering/FocalRequest;",
        "toBoundsRect",
        "toFocusAreas",
        "",
        "Landroid/hardware/Camera$Area;",
        "verifyInBounds",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final CAMERA_BOUNDS_RANGE:F = 2000.0f

.field private static final FOCUS_AREA_HALF_SIZE:I = 0x32

.field private static final WEIGHT:I = 0x3e8


# direct methods
.method private static final adjustPointToCameraPreview(Lio/fotoapparat/hardware/metering/PointF;Lio/fotoapparat/parameter/Resolution;FZ)Lio/fotoapparat/hardware/metering/PointF;
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/metering/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 61
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 62
    invoke-static {v0, p1, p2, p3}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->configMatrix(Landroid/graphics/Matrix;Lio/fotoapparat/parameter/Resolution;FZ)Landroid/graphics/Matrix;

    move-result-object p1

    const/4 p2, 0x2

    .line 68
    new-array p2, p2, [F

    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/PointF;->getX()F

    move-result p3

    const/4 v0, 0x0

    aput p3, p2, v0

    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/PointF;->getY()F

    move-result p0

    const/4 p3, 0x1

    aput p0, p2, p3

    .line 69
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 73
    new-instance p0, Lio/fotoapparat/hardware/metering/PointF;

    .line 74
    aget p1, p2, v0

    invoke-static {p1}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->verifyInBounds(F)F

    move-result p1

    .line 75
    aget p2, p2, p3

    invoke-static {p2}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->verifyInBounds(F)F

    move-result p2

    .line 73
    invoke-direct {p0, p1, p2}, Lio/fotoapparat/hardware/metering/PointF;-><init>(FF)V

    return-object p0
.end method

.method private static final clamp(FFF)F
    .locals 0

    .line 117
    invoke-static {p0, p2}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    return p0
.end method

.method private static final configMatrix(Landroid/graphics/Matrix;Lio/fotoapparat/parameter/Resolution;FZ)Landroid/graphics/Matrix;
    .locals 2
    .param p0    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 89
    iget v0, p1, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v0, v0

    const/high16 v1, 0x44fa0000    # 2000.0f

    div-float v0, v1, v0

    .line 90
    iget p1, p1, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float p1, p1

    div-float/2addr v1, p1

    .line 88
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/high16 p1, -0x3b860000    # -1000.0f

    .line 92
    invoke-virtual {p0, p1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    neg-float p1, p2

    .line 96
    invoke-virtual {p0, p1}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/high16 p1, 0x3f800000    # 1.0f

    if-eqz p3, :cond_0

    const/high16 p2, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    move p2, p1

    .line 97
    :goto_0
    invoke-virtual {p0, p2, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    return-object p0
.end method

.method private static final ensureAreaBound(F)I
    .locals 2

    const/high16 v0, -0x3b860000    # -1000.0f

    const/high16 v1, 0x447a0000    # 1000.0f

    .line 115
    invoke-static {p0, v0, v1}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->clamp(FFF)F

    move-result p0

    float-to-int p0, p0

    return p0
.end method

.method private static final focusBounds(Lio/fotoapparat/hardware/metering/FocalRequest;FZ)Landroid/graphics/Rect;
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/metering/FocalRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 49
    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/FocalRequest;->getPoint()Lio/fotoapparat/hardware/metering/PointF;

    move-result-object v0

    .line 51
    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/FocalRequest;->getPreviewResolution()Lio/fotoapparat/parameter/Resolution;

    move-result-object p0

    .line 50
    invoke-static {v0, p0, p1, p2}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->adjustPointToCameraPreview(Lio/fotoapparat/hardware/metering/PointF;Lio/fotoapparat/parameter/Resolution;FZ)Lio/fotoapparat/hardware/metering/PointF;

    move-result-object p0

    .line 55
    invoke-static {p0}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->toBoundsRect(Lio/fotoapparat/hardware/metering/PointF;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method private static final toBoundsRect(Lio/fotoapparat/hardware/metering/PointF;)Landroid/graphics/Rect;
    .locals 5
    .param p0    # Lio/fotoapparat/hardware/metering/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 108
    new-instance v0, Landroid/graphics/Rect;

    .line 109
    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/PointF;->getX()F

    move-result v1

    const/16 v2, 0x32

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->ensureAreaBound(F)I

    move-result v1

    .line 110
    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/PointF;->getY()F

    move-result v3

    sub-float/2addr v3, v2

    invoke-static {v3}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->ensureAreaBound(F)I

    move-result v3

    .line 111
    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/PointF;->getX()F

    move-result v4

    add-float/2addr v4, v2

    invoke-static {v4}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->ensureAreaBound(F)I

    move-result v4

    .line 112
    invoke-virtual {p0}, Lio/fotoapparat/hardware/metering/PointF;->getY()F

    move-result p0

    add-float/2addr p0, v2

    invoke-static {p0}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->ensureAreaBound(F)I

    move-result p0

    .line 108
    invoke-direct {v0, v1, v3, v4, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static final toFocusAreas(Lio/fotoapparat/hardware/metering/FocalRequest;IZ)Ljava/util/List;
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/metering/FocalRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fotoapparat/hardware/metering/FocalRequest;",
            "IZ)",
            "Ljava/util/List<",
            "Landroid/hardware/Camera$Area;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Landroid/hardware/Camera$Area;

    int-to-float p1, p1

    .line 39
    invoke-static {p0, p1, p2}, Lio/fotoapparat/hardware/metering/convert/FocalPointConverterKt;->focusBounds(Lio/fotoapparat/hardware/metering/FocalRequest;FZ)Landroid/graphics/Rect;

    move-result-object p0

    const/16 p1, 0x3e8

    .line 38
    invoke-direct {v0, p0, p1}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final verifyInBounds(F)F
    .locals 3

    .line 104
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const/high16 v2, -0x3b860000    # -1000.0f

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_0

    const/high16 v2, 0x447a0000    # 1000.0f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0

    .line 105
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Point value should be between -1000.0 and 1000.0. Was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method
