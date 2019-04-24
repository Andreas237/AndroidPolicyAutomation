.class final Lcom/microblink/CameraFrameProcessor;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "CameraFrameProcessor"


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native blurScore(J)I
.end method

.method private static native processCameraFrame(JLandroid/graphics/Bitmap;)Z
.end method


# virtual methods
.method final processCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;I)Lcom/microblink/CameraFrameResult;
    .locals 8

    invoke-static {}, Lcom/microblink/StatsResults;->create()Lcom/microblink/StatsResults;

    move-result-object v3

    invoke-virtual {v3}, Lcom/microblink/StatsResults;->start()V

    invoke-static {p1}, Lcom/microblink/internal/CameraUtils;->calculateSizeOfFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)Lcom/microblink/internal/SizeCompat;

    move-result-object v0

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getVisiblePart()Landroid/graphics/RectF;

    move-result-object v1

    new-instance v2, Lcom/microblink/camera/geometry/Rectangle;

    iget v4, v1, Landroid/graphics/RectF;->left:F

    iget v5, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v6

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-direct {v2, v4, v5, v6, v1}, Lcom/microblink/camera/geometry/Rectangle;-><init>(FFFF)V

    invoke-static {p1}, Lcom/microblink/internal/CameraUtils;->isYuvFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)Z

    move-result v1

    invoke-static {v0, v2, v1}, Lcom/microblink/internal/CameraUtils;->calculateAbsoluteRegionOfInterest(Lcom/microblink/internal/SizeCompat;Lcom/microblink/camera/geometry/Rectangle;Z)Lcom/microblink/camera/geometry/Rectangle;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getWidth()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getHeight()I

    move-result v2

    if-eq v1, v2, :cond_1

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/geometry/Rectangle;->getWidth()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0}, Lcom/microblink/camera/geometry/Rectangle;->getHeight()F

    move-result v0

    float-to-int v0, v0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    :cond_1
    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getNativeCameraFrame()J

    move-result-wide v0

    const/4 v2, 0x0

    :try_start_0
    iget-object v4, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v4}, Lcom/microblink/CameraFrameProcessor;->processCameraFrame(JLandroid/graphics/Bitmap;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v5, "CameraFrameProcessor"

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v6, v2, [Ljava/lang/Object;

    invoke-static {v5, v4, v6}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    if-nez v4, :cond_2

    const-string p1, "CameraFrameProcessor"

    const-string p2, "failed to processFrame camera frame"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v5

    :cond_2
    :try_start_1
    invoke-static {v0, v1}, Lcom/microblink/CameraFrameProcessor;->blurScore(J)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v1, "CameraFrameProcessor"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3}, Lcom/microblink/StatsResults;->end()V

    iget-object v1, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    sget-object v2, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT:Lcom/microblink/CameraOrientation;

    invoke-static {v1, v2, p2}, Lcom/microblink/internal/BitmapUtils;->orientate(Landroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;I)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getHeight()I

    move-result p2

    invoke-static {p2}, Lcom/microblink/internal/BitmapUtils;->isHighResFrame(I)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getWidth()I

    move-result v1

    div-int/lit16 v1, v1, 0x2d0

    int-to-double v1, v1

    iget-object v4, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-double v5, v5

    div-double/2addr v5, v1

    double-to-int v5, v5

    iget-object v6, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-double v6, v6

    div-double/2addr v6, v1

    double-to-int v1, v6

    const/4 v2, 0x1

    invoke-static {v4, v5, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    move-object v7, p2

    goto :goto_2

    :cond_3
    move-object v7, v5

    :goto_2
    iget-object v1, p0, Lcom/microblink/CameraFrameProcessor;->bitmap:Landroid/graphics/Bitmap;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object p2

    invoke-static {p2}, Lcom/microblink/internal/CameraUtils;->cameraOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/CameraOrientation;

    move-result-object v2

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->getFrameID()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Lcom/microblink/CameraFrameResult;->create(ILandroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;Lcom/microblink/StatsResults;JLcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Lcom/microblink/CameraFrameResult;

    move-result-object p1

    return-object p1
.end method
