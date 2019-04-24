.class public final Lcom/microblink/internal/CameraUtils;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static calculateAbsoluteRegionOfInterest(Lcom/microblink/internal/SizeCompat;Lcom/microblink/camera/geometry/Rectangle;Z)Lcom/microblink/camera/geometry/Rectangle;
    .locals 5

    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getX()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getY()F

    move-result v0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getWidth()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getHeight()F

    move-result v0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    new-instance p1, Lcom/microblink/camera/geometry/Rectangle;

    invoke-virtual {p0}, Lcom/microblink/internal/SizeCompat;->width()I

    move-result v0

    int-to-float v0, v0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/microblink/internal/SizeCompat;->height()I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    div-int/lit8 p0, p0, 0x3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/internal/SizeCompat;->height()I

    move-result p0

    :goto_0
    int-to-float p0, p0

    invoke-direct {p1, v1, v1, v0, p0}, Lcom/microblink/camera/geometry/Rectangle;-><init>(FFFF)V

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lcom/microblink/internal/SizeCompat;->height()I

    move-result v0

    if-eqz p2, :cond_2

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    :cond_2
    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getX()F

    move-result p2

    invoke-virtual {p0}, Lcom/microblink/internal/SizeCompat;->width()I

    move-result v1

    int-to-float v1, v1

    mul-float p2, p2, v1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getY()F

    move-result v1

    int-to-float v2, v0

    mul-float v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getWidth()F

    move-result v3

    invoke-virtual {p0}, Lcom/microblink/internal/SizeCompat;->width()I

    move-result v4

    int-to-float v4, v4

    mul-float v3, v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {p1}, Lcom/microblink/camera/geometry/Rectangle;->getHeight()F

    move-result p1

    mul-float p1, p1, v2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isOddNumber(I)Z

    move-result v2

    if-eqz v2, :cond_3

    add-int/lit8 p1, p1, 0x1

    if-lt p1, v0, :cond_3

    add-int/lit8 p1, p1, -0x2

    :cond_3
    rem-int/lit8 v0, v3, 0x8

    rsub-int/lit8 v0, v0, 0x8

    rem-int/lit8 v0, v0, 0x8

    add-int v2, p2, v3

    add-int/2addr v2, v0

    invoke-virtual {p0}, Lcom/microblink/internal/SizeCompat;->width()I

    move-result p0

    if-le v2, p0, :cond_4

    add-int/lit8 v0, v0, -0x8

    :cond_4
    const/4 p0, 0x0

    div-int/lit8 v2, v0, 0x2

    sub-int/2addr p2, v2

    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    add-int/2addr v3, v0

    rem-int/lit8 p2, p0, 0x2

    if-nez p2, :cond_5

    add-int/lit8 p0, p0, -0x1

    :cond_5
    rem-int/lit8 p2, v1, 0x2

    if-nez p2, :cond_6

    add-int/lit8 v1, v1, -0x1

    :cond_6
    new-instance p2, Lcom/microblink/camera/geometry/Rectangle;

    int-to-float p0, p0

    int-to-float v0, v1

    int-to-float v1, v3

    int-to-float p1, p1

    invoke-direct {p2, p0, v0, v1, p1}, Lcom/microblink/camera/geometry/Rectangle;-><init>(FFFF)V

    return-object p2
.end method

.method public static calculateSizeOfFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)Lcom/microblink/internal/SizeCompat;
    .locals 2

    invoke-interface {p0}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getHeight()I

    move-result v0

    invoke-static {p0}, Lcom/microblink/internal/CameraUtils;->isYuvFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)Z

    move-result v1

    invoke-interface {p0}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getWidth()I

    move-result p0

    if-eqz v1, :cond_0

    div-int/lit8 v1, v0, 0x2

    add-int/2addr v0, v1

    :cond_0
    invoke-static {p0, v0}, Lcom/microblink/internal/SizeCompat;->create(II)Lcom/microblink/internal/SizeCompat;

    move-result-object p0

    return-object p0
.end method

.method public static cameraOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/CameraOrientation;
    .locals 1
    .param p0    # Lcom/microblink/camera/hardware/orientation/Orientation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/internal/CameraUtils$1;->$SwitchMap$com$microblink$camera$hardware$orientation$Orientation:[I

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/orientation/Orientation;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported orientation"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    sget-object p0, Lcom/microblink/CameraOrientation;->ORIENTATION_UNKNOWN:Lcom/microblink/CameraOrientation;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/microblink/CameraOrientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/CameraOrientation;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT_UPSIDE_DOWN:Lcom/microblink/CameraOrientation;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/microblink/CameraOrientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/CameraOrientation;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT:Lcom/microblink/CameraOrientation;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static isYuvFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)Z
    .locals 2

    invoke-interface {p0}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getFormat()Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    move-result-object v0

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->YUV_NV21:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    if-eq v0, v1, :cond_1

    invoke-interface {p0}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getFormat()Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    move-result-object p0

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->MULTI_PLANAR_YUV_420_888:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
