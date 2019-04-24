.class final Lcom/microblink/CameraFrameResultsQueue;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/CameraFrameQueue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;,
        Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedQueue;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/CameraFrameQueue<",
        "Lcom/microblink/BitmapResult;",
        ">;"
    }
.end annotation


# static fields
.field private static final MAX_QUEUE_CAPACITY:I = 0x1


# instance fields
.field private queue:Lcom/microblink/CameraFrameQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/CameraFrameQueue<",
            "Lcom/microblink/BitmapResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    new-instance v0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;

    invoke-direct {v0, v1}, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedDeque;-><init>(Lcom/microblink/CameraFrameResultsQueue$1;)V

    :goto_0
    iput-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    return-void

    :cond_0
    new-instance v0, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedQueue;

    invoke-direct {v0, v1}, Lcom/microblink/CameraFrameResultsQueue$ConcurrentCameraFrameLinkedQueue;-><init>(Lcom/microblink/CameraFrameResultsQueue$1;)V

    goto :goto_0
.end method


# virtual methods
.method public final blurScore()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->blurScore()I

    move-result v0

    return v0
.end method

.method public final blurScore(I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0, p1}, Lcom/microblink/CameraFrameQueue;->blurScore(I)V

    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->clear()V

    return-void
.end method

.method public final dequeue()Lcom/microblink/BitmapResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->dequeue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/BitmapResult;

    return-object v0
.end method

.method public final bridge synthetic dequeue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/CameraFrameResultsQueue;->dequeue()Lcom/microblink/BitmapResult;

    move-result-object v0

    return-object v0
.end method

.method public final enqueue(Lcom/microblink/BitmapResult;)V
    .locals 1
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0, p1}, Lcom/microblink/CameraFrameQueue;->enqueue(Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic enqueue(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/BitmapResult;

    invoke-virtual {p0, p1}, Lcom/microblink/CameraFrameResultsQueue;->enqueue(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CameraFrameResultsQueue{queue="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/CameraFrameResultsQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
