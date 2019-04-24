.class final Lcom/microblink/TakePictureInterceptor;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Interceptor;


# static fields
.field private static final MAX_FRAME_COMPARE_FOR_CAPTURE:I = 0x3

.field private static final TAG:Ljava/lang/String; = "TakePictureInterceptor"


# instance fields
.field private bestResults:Lcom/microblink/TakePictureResult;

.field private cancelInterception:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private capturedFrameCount:I

.field private handler:Landroid/os/Handler;

.field private listener:Lcom/microblink/CameraCaptureListener;

.field private view:Lcom/microblink/RecognizerView;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView;Lcom/microblink/CameraCaptureListener;)V
    .locals 2
    .param p1    # Lcom/microblink/RecognizerView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/CameraCaptureListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/TakePictureInterceptor;->capturedFrameCount:I

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/microblink/TakePictureInterceptor;->cancelInterception:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/microblink/TakePictureInterceptor;->handler:Landroid/os/Handler;

    const-string v0, "receiptRecognizerView"

    invoke-static {p1, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureFrameResult"

    invoke-static {p2, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/microblink/TakePictureInterceptor;->view:Lcom/microblink/RecognizerView;

    iput-object p2, p0, Lcom/microblink/TakePictureInterceptor;->listener:Lcom/microblink/CameraCaptureListener;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/TakePictureInterceptor;)Lcom/microblink/TakePictureResult;
    .locals 0

    iget-object p0, p0, Lcom/microblink/TakePictureInterceptor;->bestResults:Lcom/microblink/TakePictureResult;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/TakePictureInterceptor;)Lcom/microblink/CameraCaptureListener;
    .locals 0

    iget-object p0, p0, Lcom/microblink/TakePictureInterceptor;->listener:Lcom/microblink/CameraCaptureListener;

    return-object p0
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/TakePictureInterceptor;->cancelInterception:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final onIntercept(Lcom/microblink/CameraFrameResult;)V
    .locals 8
    .param p1    # Lcom/microblink/CameraFrameResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lcom/microblink/TakePictureInterceptor;->capturedFrameCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/microblink/TakePictureInterceptor;->capturedFrameCount:I

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->blurScore()I

    move-result v0

    iget-object v2, p0, Lcom/microblink/TakePictureInterceptor;->bestResults:Lcom/microblink/TakePictureResult;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/microblink/TakePictureResult;->blurScore()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    if-le v0, v2, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/microblink/internal/BitmapUtils;->copy(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->orientation()Lcom/microblink/CameraOrientation;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->stats()Lcom/microblink/StatsResults;

    move-result-object v5

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->frameId()J

    move-result-wide v6

    move v2, v0

    invoke-static/range {v2 .. v7}, Lcom/microblink/CameraFrameResult;->create(ILandroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;Lcom/microblink/StatsResults;J)Lcom/microblink/CameraFrameResult;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/TakePictureResult;->create(Lcom/microblink/CameraFrameResult;)Lcom/microblink/TakePictureResult;

    move-result-object v2

    iput-object v2, p0, Lcom/microblink/TakePictureInterceptor;->bestResults:Lcom/microblink/TakePictureResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "TakePictureInterceptor"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    iget v2, p0, Lcom/microblink/TakePictureInterceptor;->capturedFrameCount:I

    const/4 v3, 0x3

    if-lt v2, v3, :cond_4

    iget-object p1, p0, Lcom/microblink/TakePictureInterceptor;->cancelInterception:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lcom/microblink/TakePictureInterceptor;->bestResults:Lcom/microblink/TakePictureResult;

    invoke-virtual {p1}, Lcom/microblink/TakePictureResult;->getResult()Lcom/microblink/CameraFrameResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/microblink/internal/BitmapUtils;->copy(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->orientation()Lcom/microblink/CameraOrientation;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->stats()Lcom/microblink/StatsResults;

    move-result-object v5

    invoke-virtual {p1}, Lcom/microblink/CameraFrameResult;->frameId()J

    move-result-wide v6

    move v2, v0

    invoke-static/range {v2 .. v7}, Lcom/microblink/CameraFrameResult;->create(ILandroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;Lcom/microblink/StatsResults;J)Lcom/microblink/CameraFrameResult;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/TakePictureResult;->create(Lcom/microblink/CameraFrameResult;)Lcom/microblink/TakePictureResult;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/TakePictureInterceptor;->view:Lcom/microblink/RecognizerView;

    invoke-virtual {v0, p1}, Lcom/microblink/RecognizerView;->enqueue(Lcom/microblink/BitmapResult;)V

    iget-object p1, p0, Lcom/microblink/TakePictureInterceptor;->view:Lcom/microblink/RecognizerView;

    invoke-virtual {p1}, Lcom/microblink/RecognizerView;->clearInterceptors()V

    iget-object p1, p0, Lcom/microblink/TakePictureInterceptor;->listener:Lcom/microblink/CameraCaptureListener;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/microblink/TakePictureInterceptor;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/microblink/TakePictureInterceptor$1;

    invoke-direct {v0, p0}, Lcom/microblink/TakePictureInterceptor$1;-><init>(Lcom/microblink/TakePictureInterceptor;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    return-void

    :cond_4
    iget-object v0, p0, Lcom/microblink/TakePictureInterceptor;->view:Lcom/microblink/RecognizerView;

    invoke-virtual {v0, p1}, Lcom/microblink/RecognizerView;->enqueue(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TakePictureInterceptor{view="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/TakePictureInterceptor;->view:Lcom/microblink/RecognizerView;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bestResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/TakePictureInterceptor;->bestResults:Lcom/microblink/TakePictureResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", capturedFrameCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/TakePictureInterceptor;->capturedFrameCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", listener="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/TakePictureInterceptor;->listener:Lcom/microblink/CameraCaptureListener;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", handler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/TakePictureInterceptor;->handler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
