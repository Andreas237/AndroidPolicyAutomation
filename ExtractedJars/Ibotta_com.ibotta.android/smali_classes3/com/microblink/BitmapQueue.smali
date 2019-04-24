.class public Lcom/microblink/BitmapQueue;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/CameraFrameQueue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/BitmapQueue$BitmapLinkedDeque;,
        Lcom/microblink/BitmapQueue$BitmapLinkedQueue;
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
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    new-instance v0, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;

    invoke-direct {v0, v1}, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;-><init>(Lcom/microblink/BitmapQueue$1;)V

    :goto_0
    iput-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    return-void

    :cond_0
    new-instance v0, Lcom/microblink/BitmapQueue$BitmapLinkedQueue;

    invoke-direct {v0, v1}, Lcom/microblink/BitmapQueue$BitmapLinkedQueue;-><init>(Lcom/microblink/BitmapQueue$1;)V

    goto :goto_0
.end method


# virtual methods
.method public blurScore()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->blurScore()I

    move-result v0

    return v0
.end method

.method public blurScore(I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0, p1}, Lcom/microblink/CameraFrameQueue;->blurScore(I)V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->clear()V

    return-void
.end method

.method public dequeue()Lcom/microblink/BitmapResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->dequeue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/BitmapResult;

    return-object v0
.end method

.method public bridge synthetic dequeue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/BitmapQueue;->dequeue()Lcom/microblink/BitmapResult;

    move-result-object v0

    return-object v0
.end method

.method public enqueue(Lcom/microblink/BitmapResult;)V
    .locals 1
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0, p1}, Lcom/microblink/CameraFrameQueue;->enqueue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic enqueue(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/BitmapResult;

    invoke-virtual {p0, p1}, Lcom/microblink/BitmapQueue;->enqueue(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->size()I

    move-result v0

    return v0
.end method
