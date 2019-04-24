.class abstract Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;
.super Lcom/google/common/util/concurrent/InterruptibleTask;
.source "CombinedFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/CombinedFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "CombinedFutureInterruptibleTask"
.end annotation


# instance fields
.field private final listenerExecutor:Ljava/util/concurrent/Executor;

.field final synthetic this$0:Lcom/google/common/util/concurrent/CombinedFuture;

.field volatile thrownByExecute:Z


# direct methods
.method public constructor <init>(Lcom/google/common/util/concurrent/CombinedFuture;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->this$0:Lcom/google/common/util/concurrent/CombinedFuture;

    invoke-direct {p0}, Lcom/google/common/util/concurrent/InterruptibleTask;-><init>()V

    const/4 p1, 0x1

    .line 99
    iput-boolean p1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->thrownByExecute:Z

    .line 102
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->listenerExecutor:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method final execute()V
    .locals 2

    .line 129
    :try_start_0
    iget-object v0, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->listenerExecutor:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 131
    iget-boolean v1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->thrownByExecute:Z

    if-eqz v1, :cond_0

    .line 132
    iget-object v1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->this$0:Lcom/google/common/util/concurrent/CombinedFuture;

    invoke-virtual {v1, v0}, Lcom/google/common/util/concurrent/CombinedFuture;->setException(Ljava/lang/Throwable;)Z

    :cond_0
    :goto_0
    return-void
.end method

.method final runInterruptibly()V
    .locals 2

    const/4 v0, 0x0

    .line 107
    iput-boolean v0, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->thrownByExecute:Z

    .line 109
    iget-object v1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->this$0:Lcom/google/common/util/concurrent/CombinedFuture;

    invoke-virtual {v1}, Lcom/google/common/util/concurrent/CombinedFuture;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    .line 111
    :try_start_0
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->setValue()V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 117
    iget-object v1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->this$0:Lcom/google/common/util/concurrent/CombinedFuture;

    invoke-virtual {v1, v0}, Lcom/google/common/util/concurrent/CombinedFuture;->setException(Ljava/lang/Throwable;)Z

    goto :goto_0

    .line 115
    :catch_1
    iget-object v1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->this$0:Lcom/google/common/util/concurrent/CombinedFuture;

    invoke-virtual {v1, v0}, Lcom/google/common/util/concurrent/CombinedFuture;->cancel(Z)Z

    goto :goto_0

    :catch_2
    move-exception v0

    .line 113
    iget-object v1, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->this$0:Lcom/google/common/util/concurrent/CombinedFuture;

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/util/concurrent/CombinedFuture;->setException(Ljava/lang/Throwable;)Z

    :cond_0
    :goto_0
    return-void
.end method

.method abstract setValue()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method final wasInterrupted()Z
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/google/common/util/concurrent/CombinedFuture$CombinedFutureInterruptibleTask;->this$0:Lcom/google/common/util/concurrent/CombinedFuture;

    invoke-virtual {v0}, Lcom/google/common/util/concurrent/CombinedFuture;->wasInterrupted()Z

    move-result v0

    return v0
.end method
