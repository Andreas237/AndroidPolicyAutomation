.class Lcom/microblink/BitmapQueue$BitmapLinkedDeque;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/CameraFrameQueue;


# annotations
.annotation build Landroid/support/annotation/RequiresApi;
    api = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/BitmapQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BitmapLinkedDeque"
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
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object v0, p0, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-void
.end method

.method synthetic constructor <init>(Lcom/microblink/BitmapQueue$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;-><init>()V

    return-void
.end method


# virtual methods
.method public blurScore()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public blurScore(I)V
    .locals 0

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->clear()V

    return-void
.end method

.method public dequeue()Lcom/microblink/BitmapResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/BitmapResult;

    return-object v0
.end method

.method public bridge synthetic dequeue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->dequeue()Lcom/microblink/BitmapResult;

    move-result-object v0

    return-object v0
.end method

.method public enqueue(Lcom/microblink/BitmapResult;)V
    .locals 1
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic enqueue(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/BitmapResult;

    invoke-virtual {p0, p1}, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->enqueue(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/BitmapQueue$BitmapLinkedDeque;->queue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v0

    return v0
.end method
