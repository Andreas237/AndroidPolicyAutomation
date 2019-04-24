.class Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;
.super Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/RecognizerCameraView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ReceiptCameraListener"
.end annotation


# instance fields
.field private frameHandler:Lcom/microblink/FrameHandler;

.field private processor:Lcom/microblink/CameraFrameProcessor;

.field final synthetic this$0:Lcom/microblink/RecognizerCameraView;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerCameraView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;-><init>(Lcom/microblink/camera/view/BaseCameraView;)V

    new-instance p1, Lcom/microblink/CameraFrameProcessor;

    invoke-direct {p1}, Lcom/microblink/CameraFrameProcessor;-><init>()V

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->processor:Lcom/microblink/CameraFrameProcessor;

    return-void
.end method


# virtual methods
.method public canReceiveFrame()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v0}, Lcom/microblink/RecognizerCameraView;->access$100(Lcom/microblink/RecognizerCameraView;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v0}, Lcom/microblink/RecognizerCameraView;->access$000(Lcom/microblink/RecognizerCameraView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)V
    .locals 7
    .param p1    # Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v0}, Lcom/microblink/RecognizerCameraView;->access$000(Lcom/microblink/RecognizerCameraView;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->recycle()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->processor:Lcom/microblink/CameraFrameProcessor;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/microblink/RecognizerCameraView;->access$102(Lcom/microblink/RecognizerCameraView;Z)Z

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->setOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)V

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v0}, Lcom/microblink/RecognizerCameraView;->access$200(Lcom/microblink/RecognizerCameraView;)Landroid/graphics/RectF;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    new-instance v1, Landroid/graphics/RectF;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {v0, v1}, Lcom/microblink/RecognizerCameraView;->access$202(Lcom/microblink/RecognizerCameraView;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    :cond_1
    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v0}, Lcom/microblink/RecognizerCameraView;->access$200(Lcom/microblink/RecognizerCameraView;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->setVisiblePart(Landroid/graphics/RectF;)V

    const-wide/16 v0, 0x0

    invoke-interface {p1, v0, v1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->initializeNativePart(J)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->processor:Lcom/microblink/CameraFrameProcessor;

    iget-object v3, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v3}, Lcom/microblink/RecognizerCameraView;->access$300(Lcom/microblink/RecognizerCameraView;)I

    move-result v3

    invoke-virtual {v2, p1, v3}, Lcom/microblink/CameraFrameProcessor;->processCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;I)Lcom/microblink/CameraFrameResult;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "ReceiptCameraView"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz v0, :cond_5

    iget-object v2, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->frameHandler:Lcom/microblink/FrameHandler;

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->frame1080p()Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/microblink/FrameHandler1080;

    iget-object v3, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    iget-object v3, v3, Lcom/microblink/RecognizerCameraView;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    iget-object v4, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v4}, Lcom/microblink/RecognizerCameraView;->access$400(Lcom/microblink/RecognizerCameraView;)Lcom/microblink/CameraDataListener;

    move-result-object v4

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->frame1080p()Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    div-int/lit16 v5, v5, 0x2d0

    int-to-double v5, v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/microblink/FrameHandler1080;-><init>(Lcom/microblink/internal/EdgeDetectionProcessor;Lcom/microblink/CameraDataListener;D)V

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/microblink/FrameHandler720;

    iget-object v3, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    iget-object v3, v3, Lcom/microblink/RecognizerCameraView;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    iget-object v4, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v4}, Lcom/microblink/RecognizerCameraView;->access$400(Lcom/microblink/RecognizerCameraView;)Lcom/microblink/CameraDataListener;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/microblink/FrameHandler720;-><init>(Lcom/microblink/internal/EdgeDetectionProcessor;Lcom/microblink/CameraDataListener;)V

    :goto_1
    iput-object v2, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->frameHandler:Lcom/microblink/FrameHandler;

    :cond_3
    new-instance v2, Lcom/microblink/DebugResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->frameId()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Lcom/microblink/DebugResult;-><init>(J)V

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->stats()Lcom/microblink/StatsResults;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/microblink/DebugResult;->processingStats(Lcom/microblink/StatsResults;)V

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->blurScore()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/microblink/DebugResult;->blurScore(I)V

    iget-object v3, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v3}, Lcom/microblink/RecognizerCameraView;->access$500(Lcom/microblink/RecognizerCameraView;)Lcom/microblink/Interceptor;

    move-result-object v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v3}, Lcom/microblink/RecognizerCameraView;->access$500(Lcom/microblink/RecognizerCameraView;)Lcom/microblink/Interceptor;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/microblink/Interceptor;->onIntercept(Lcom/microblink/CameraFrameResult;)V

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->frameHandler:Lcom/microblink/FrameHandler;

    invoke-interface {v3, v0}, Lcom/microblink/FrameHandler;->processImage(Lcom/microblink/CameraFrameResult;)Lcom/microblink/CameraFrameResult;

    move-result-object v3

    invoke-virtual {v3}, Lcom/microblink/CameraFrameResult;->edgeDetection()Lcom/microblink/EdgeDetection;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/microblink/DebugResult;->edgeDetection(Lcom/microblink/EdgeDetection;)V

    invoke-virtual {v3}, Lcom/microblink/CameraFrameResult;->stats()Lcom/microblink/StatsResults;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/microblink/DebugResult;->edgeDetectionStats(Lcom/microblink/StatsResults;)V

    iget-object v3, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-virtual {v3, v0}, Lcom/microblink/RecognizerCameraView;->enqueue(Lcom/microblink/BitmapResult;)V

    :goto_2
    iget-object v0, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {v0}, Lcom/microblink/RecognizerCameraView;->access$400(Lcom/microblink/RecognizerCameraView;)Lcom/microblink/CameraDataListener;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/microblink/CameraDataListener;->onDebugResults(Lcom/microblink/DebugResult;)V

    goto :goto_3

    :cond_5
    const-string v0, "ReceiptCameraView"

    const-string v2, "unable to obtain camera frame results from processor."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    :goto_3
    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->recycle()V

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;->this$0:Lcom/microblink/RecognizerCameraView;

    invoke-static {p1, v1}, Lcom/microblink/RecognizerCameraView;->access$102(Lcom/microblink/RecognizerCameraView;Z)Z

    return-void

    :cond_7
    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;->recycle()V

    return-void
.end method

.method public onTakePictureFail()V
    .locals 0

    return-void
.end method
