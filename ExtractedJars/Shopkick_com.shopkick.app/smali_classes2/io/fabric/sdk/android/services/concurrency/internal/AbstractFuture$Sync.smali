.class final Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;
.super Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Sync"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;"
    }
.end annotation


# static fields
.field static final CANCELLED:I = 0x4

.field static final COMPLETED:I = 0x2

.field static final COMPLETING:I = 0x1

.field static final INTERRUPTED:I = 0x8

.field static final RUNNING:I

.field private static final serialVersionUID:J


# instance fields
.field private exception:Ljava/lang/Throwable;

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 209
    invoke-direct {p0}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;-><init>()V

    return-void
.end method

.method private complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/Throwable;",
            "I)Z"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 355
    invoke-virtual {p0, v1, v0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->compareAndSetState(II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 359
    iput-object p1, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->value:Ljava/lang/Object;

    and-int/lit8 p1, p3, 0xc

    if-eqz p1, :cond_0

    .line 361
    new-instance p2, Ljava/util/concurrent/CancellationException;

    const-string p1, "Future.cancel() was called."

    invoke-direct {p2, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    iput-object p2, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->exception:Ljava/lang/Throwable;

    .line 363
    invoke-virtual {p0, p3}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->releaseShared(I)Z

    goto :goto_0

    .line 364
    :cond_1
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result p1

    if-ne p1, v0, :cond_2

    const/4 p1, -0x1

    .line 367
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->acquireShared(I)V

    :cond_2
    :goto_0
    return v1
.end method

.method private getValue()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/CancellationException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 278
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 293
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error, synchronizer in invalid state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 289
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->exception:Ljava/lang/Throwable;

    const-string v1, "Task was cancelled."

    invoke-static {v1, v0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture;->cancellationExceptionWithCause(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    throw v0

    .line 281
    :cond_1
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->exception:Ljava/lang/Throwable;

    if-nez v0, :cond_2

    .line 284
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->value:Ljava/lang/Object;

    return-object v0

    .line 282
    :cond_2
    new-instance v1, Ljava/util/concurrent/ExecutionException;

    invoke-direct {v1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method cancel(Z)Z
    .locals 1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    const/4 v0, 0x0

    .line 338
    invoke-direct {p0, v0, v0, p1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z

    move-result p1

    return p1
.end method

.method get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/CancellationException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const/4 v0, -0x1

    .line 268
    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->acquireSharedInterruptibly(I)V

    .line 269
    invoke-direct {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method get(J)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/TimeoutException;,
            Ljava/util/concurrent/CancellationException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const/4 v0, -0x1

    .line 251
    invoke-virtual {p0, v0, p1, p2}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->tryAcquireSharedNanos(IJ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 255
    invoke-direct {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 252
    :cond_0
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    const-string p2, "Timeout waiting for task."

    invoke-direct {p1, p2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method isCancelled()Z
    .locals 1

    .line 310
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    and-int/lit8 v0, v0, 0xc

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isDone()Z
    .locals 1

    .line 303
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    and-int/lit8 v0, v0, 0xe

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method set(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 324
    invoke-direct {p0, p1, v0, v1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z

    move-result p1

    return p1
.end method

.method setException(Ljava/lang/Throwable;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 331
    invoke-direct {p0, v0, p1, v1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z

    move-result p1

    return p1
.end method

.method protected tryAcquireShared(I)I
    .locals 0

    .line 226
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->isDone()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method protected tryReleaseShared(I)Z
    .locals 0

    .line 238
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->setState(I)V

    const/4 p1, 0x1

    return p1
.end method

.method wasInterrupted()Z
    .locals 2

    .line 317
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
