.class final Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/CameraFrameQueue;


# annotations
.annotation build Landroid/support/annotation/RequiresApi;
    api = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/CameraFrameResultsQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ConcurrentCameraFrameLinkedDeque"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/CameraFrameQueue<",
        "Lcom/microblink/BitmapResult;",
        ">;"
    }
.end annotation


# instance fields
.field private atomicBlurScore:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final lock:Ljava/lang/Object;

.field private queue:Ljava/util/concurrent/ConcurrentLinkedDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lcom/microblink/BitmapResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v1, 0x46

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->atomicBlurScore:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->lock:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lcom/microblink/CameraFrameResultsQueue$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;-><init>()V

    return-void
.end method


# virtual methods
.method public final blurScore()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->atomicBlurScore:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final blurScore(I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->atomicBlurScore:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final dequeue()Lcom/microblink/BitmapResult;
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/BitmapResult;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic dequeue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->dequeue()Lcom/microblink/BitmapResult;

    move-result-object v0

    return-object v0
.end method

.method public final enqueue(Lcom/microblink/BitmapResult;)V
    .locals 3
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, Lcom/microblink/BitmapResult;->blurScore()I

    move-result v1

    invoke-virtual {p0}, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->blurScore()I

    move-result v2

    if-ge v1, v2, :cond_0

    instance-of v2, p1, Lcom/microblink/TakePictureResult;

    if-eqz v2, :cond_3

    :cond_0
    iget-object v2, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->getLast()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/BitmapResult;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lcom/microblink/BitmapResult;->blurScore()I

    move-result v2

    if-le v1, v2, :cond_1

    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->removeLast()Ljava/lang/Object;

    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v1

    if-gtz v1, :cond_3

    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final bridge synthetic enqueue(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/BitmapResult;

    invoke-virtual {p0, p1}, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->enqueue(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public final isEmpty()Z
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->isEmpty()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final size()I
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
