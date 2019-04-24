.class public Lcom/microblink/internal/PriorityFutureTask;
.super Ljava/util/concurrent/FutureTask;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "Lcom/microblink/internal/PriorityRunnable;",
        ">;",
        "Ljava/lang/Comparable<",
        "Lcom/microblink/internal/PriorityFutureTask;",
        ">;"
    }
.end annotation


# instance fields
.field private final runnable:Lcom/microblink/internal/PriorityRunnable;


# direct methods
.method constructor <init>(Lcom/microblink/internal/PriorityRunnable;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/PriorityRunnable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/microblink/internal/PriorityFutureTask;->runnable:Lcom/microblink/internal/PriorityRunnable;

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/microblink/internal/PriorityFutureTask;)I
    .locals 1
    .param p1    # Lcom/microblink/internal/PriorityFutureTask;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p1, Lcom/microblink/internal/PriorityFutureTask;->runnable:Lcom/microblink/internal/PriorityRunnable;

    invoke-virtual {p1}, Lcom/microblink/internal/PriorityRunnable;->priority()Lcom/microblink/internal/Priority;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/internal/Priority;->ordinal()I

    move-result p1

    iget-object v0, p0, Lcom/microblink/internal/PriorityFutureTask;->runnable:Lcom/microblink/internal/PriorityRunnable;

    invoke-virtual {v0}, Lcom/microblink/internal/PriorityRunnable;->priority()Lcom/microblink/internal/Priority;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/Priority;->ordinal()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/PriorityFutureTask;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/PriorityFutureTask;->compareTo(Lcom/microblink/internal/PriorityFutureTask;)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PriorityFutureTask{runnable="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/PriorityFutureTask;->runnable:Lcom/microblink/internal/PriorityRunnable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
