.class public Lcom/microblink/internal/PriorityThreadPoolExecutor;
.super Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method constructor <init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V
    .locals 8
    .param p5    # Ljava/util/concurrent/TimeUnit;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/concurrent/ThreadFactory;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v6, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method


# virtual methods
.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/PriorityFutureTask;

    check-cast p1, Lcom/microblink/internal/PriorityRunnable;

    invoke-direct {v0, p1}, Lcom/microblink/internal/PriorityFutureTask;-><init>(Lcom/microblink/internal/PriorityRunnable;)V

    invoke-virtual {p0, v0}, Lcom/microblink/internal/PriorityThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method
