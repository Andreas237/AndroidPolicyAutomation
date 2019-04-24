.class public Lcom/microblink/FrameHandler720;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/FrameHandler;


# instance fields
.field private edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

.field private listener:Lcom/microblink/CameraDataListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/EdgeDetectionProcessor;Lcom/microblink/CameraDataListener;)V
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

    iput-object p1, p0, Lcom/microblink/FrameHandler720;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    iput-object p2, p0, Lcom/microblink/FrameHandler720;->listener:Lcom/microblink/CameraDataListener;

    return-void
.end method


# virtual methods
.method public processImage(Lcom/microblink/CameraFrameResult;)Lcom/microblink/CameraFrameResult;
    .locals 6
    .param p1    # Lcom/microblink/CameraFrameResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/FrameHandler720;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->blurScore()I

    move-result v0

    iget-object v1, p0, Lcom/microblink/FrameHandler720;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {v1}, Lcom/microblink/internal/EdgeDetectionProcessor;->minimumEdgeBlurScore()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/FrameHandler720;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {v0}, Lcom/microblink/internal/EdgeDetectionProcessor;->incrementFrameCount()V

    iget-object v0, p0, Lcom/microblink/FrameHandler720;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {v0}, Lcom/microblink/internal/EdgeDetectionProcessor;->shouldRunEdgeDetection()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/DetectionUtils;->detectEdges(Landroid/graphics/Bitmap;)Lcom/microblink/EdgeDetection;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/microblink/FrameHandler720;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {v2, v1}, Lcom/microblink/internal/EdgeDetectionProcessor;->process(Lcom/microblink/EdgeDetection;)Lcom/microblink/EdgeDetectionResult;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/FrameHandler720;->listener:Lcom/microblink/CameraDataListener;

    invoke-interface {v3, v2}, Lcom/microblink/CameraDataListener;->onEdgeDetectionResult(Lcom/microblink/EdgeDetectionResult;)V

    invoke-static {v1, v0}, Lcom/microblink/internal/DetectionUtils;->edgesToRect(Lcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Landroid/graphics/Rect;

    move-result-object v2

    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v3, v4, v5, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/CameraFrameResult;->setBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, v1}, Lcom/microblink/CameraFrameResult;->setEdgeDetection(Lcom/microblink/EdgeDetection;)V

    :cond_0
    return-object p1
.end method
