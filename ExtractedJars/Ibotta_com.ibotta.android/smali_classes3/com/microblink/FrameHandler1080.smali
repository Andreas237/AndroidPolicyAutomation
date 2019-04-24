.class public Lcom/microblink/FrameHandler1080;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/FrameHandler;


# static fields
.field private static final DESIRED_WIDTH:D = 600.0

.field private static final FRAME_1080_THRESHOLD:I = 0x5a

.field private static final FRAME_MAX_WIDTH_THRESHOLD:I = 0x258

.field private static final FRAME_MIN_WIDTH_THRESHOLD:I = 0x15e


# instance fields
.field private edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

.field private listener:Lcom/microblink/CameraDataListener;

.field private ratio:D


# direct methods
.method constructor <init>(Lcom/microblink/internal/EdgeDetectionProcessor;Lcom/microblink/CameraDataListener;D)V
    .locals 0
    .param p1    # Lcom/microblink/internal/EdgeDetectionProcessor;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/CameraDataListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/FrameHandler1080;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    iput-object p2, p0, Lcom/microblink/FrameHandler1080;->listener:Lcom/microblink/CameraDataListener;

    iput-wide p3, p0, Lcom/microblink/FrameHandler1080;->ratio:D

    return-void
.end method


# virtual methods
.method public processImage(Lcom/microblink/CameraFrameResult;)Lcom/microblink/CameraFrameResult;
    .locals 7
    .param p1    # Lcom/microblink/CameraFrameResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/FrameHandler1080;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->blurScore()I

    move-result v0

    iget-object v1, p0, Lcom/microblink/FrameHandler1080;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {v1}, Lcom/microblink/internal/EdgeDetectionProcessor;->minimumEdgeBlurScore()I

    move-result v1

    if-le v0, v1, :cond_3

    iget-object v0, p0, Lcom/microblink/FrameHandler1080;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {v0}, Lcom/microblink/internal/EdgeDetectionProcessor;->shouldRunEdgeDetection()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/DetectionUtils;->detectEdges(Landroid/graphics/Bitmap;)Lcom/microblink/EdgeDetection;

    move-result-object v1

    if-eqz v1, :cond_3

    iget v2, v1, Lcom/microblink/EdgeDetection;->contentPercent:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    iget-object v2, p0, Lcom/microblink/FrameHandler1080;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {v2, v1}, Lcom/microblink/internal/EdgeDetectionProcessor;->process(Lcom/microblink/EdgeDetection;)Lcom/microblink/EdgeDetectionResult;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/FrameHandler1080;->listener:Lcom/microblink/CameraDataListener;

    invoke-interface {v3, v2}, Lcom/microblink/CameraDataListener;->onEdgeDetectionResult(Lcom/microblink/EdgeDetectionResult;)V

    invoke-static {v1, v0}, Lcom/microblink/internal/DetectionUtils;->edgesToRect(Lcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Landroid/graphics/Rect;

    move-result-object v2

    iget v3, v1, Lcom/microblink/EdgeDetection;->contentPercent:F

    const/high16 v4, 0x42b40000    # 90.0f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_2

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->frame1080p()Landroid/graphics/Bitmap;

    move-result-object v0

    iget v3, v2, Landroid/graphics/Rect;->left:I

    int-to-double v3, v3

    iget-wide v5, p0, Lcom/microblink/FrameHandler1080;->ratio:D

    mul-double v3, v3, v5

    double-to-int v3, v3

    iput v3, v2, Landroid/graphics/Rect;->left:I

    iget v3, v2, Landroid/graphics/Rect;->top:I

    int-to-double v3, v3

    iget-wide v5, p0, Lcom/microblink/FrameHandler1080;->ratio:D

    mul-double v3, v3, v5

    double-to-int v3, v3

    iput v3, v2, Landroid/graphics/Rect;->top:I

    iget v3, v2, Landroid/graphics/Rect;->right:I

    int-to-double v3, v3

    iget-wide v5, p0, Lcom/microblink/FrameHandler1080;->ratio:D

    mul-double v3, v3, v5

    double-to-int v3, v3

    iput v3, v2, Landroid/graphics/Rect;->right:I

    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    int-to-double v3, v3

    iget-wide v5, p0, Lcom/microblink/FrameHandler1080;->ratio:D

    mul-double v3, v3, v5

    double-to-int v3, v3

    iput v3, v2, Landroid/graphics/Rect;->bottom:I

    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v3, v4, v5, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/16 v4, 0x15e

    if-le v3, v4, :cond_1

    const/16 v4, 0x258

    if-lt v3, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Lcom/microblink/CameraFrameResult;->setBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_1
    :goto_0
    int-to-double v2, v3

    const-wide v4, 0x4082c00000000000L    # 600.0

    div-double/2addr v2, v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-double v4, v4

    mul-double v4, v4, v2

    double-to-int v4, v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-double v5, v5

    mul-double v5, v5, v2

    double-to-int v2, v5

    const/4 v3, 0x0

    invoke-static {v0, v4, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v3, v4, v5, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Lcom/microblink/CameraFrameResult;->setBitmap(Landroid/graphics/Bitmap;)V

    :goto_2
    invoke-virtual {p1, v1}, Lcom/microblink/CameraFrameResult;->setEdgeDetection(Lcom/microblink/EdgeDetection;)V

    :cond_3
    return-object p1
.end method
