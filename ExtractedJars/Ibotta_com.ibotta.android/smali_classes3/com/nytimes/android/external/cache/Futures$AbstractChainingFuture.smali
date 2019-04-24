.class abstract Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;
.super Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;
.source "Futures.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/Futures;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "AbstractChainingFuture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        "F:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture<",
        "TO;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field function:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TF;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field inputFuture:Lcom/nytimes/android/external/cache/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "+TI;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/ListenableFuture;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "+TI;>;TF;)V"
        }
    .end annotation

    .line 80
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;-><init>()V

    .line 81
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nytimes/android/external/cache/ListenableFuture;

    iput-object p1, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->inputFuture:Lcom/nytimes/android/external/cache/ListenableFuture;

    .line 82
    invoke-static {p2}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->function:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method abstract doTransform(Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;TI;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method final done()V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->inputFuture:Lcom/nytimes/android/external/cache/ListenableFuture;

    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->maybePropagateCancellation(Ljava/util/concurrent/Future;)V

    const/4 v0, 0x0

    .line 127
    iput-object v0, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->inputFuture:Lcom/nytimes/android/external/cache/ListenableFuture;

    return-void
.end method

.method public final run()V
    .locals 6

    .line 88
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->inputFuture:Lcom/nytimes/android/external/cache/ListenableFuture;

    .line 89
    iget-object v1, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->function:Ljava/lang/Object;

    .line 90
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->isCancelled()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    or-int/2addr v2, v5

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    or-int/2addr v2, v3

    if-eqz v2, :cond_2

    return-void

    :cond_2
    const/4 v2, 0x0

    .line 93
    iput-object v2, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->inputFuture:Lcom/nytimes/android/external/cache/ListenableFuture;

    .line 94
    iput-object v2, p0, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->function:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    .line 98
    :try_start_1
    invoke-static {v0}, Lcom/nytimes/android/external/cache/Uninterruptibles;->getUninterruptibly(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    .line 110
    :try_start_2
    invoke-virtual {p0, v1, v0}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->doTransform(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :catch_0
    move-exception v0

    .line 107
    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->setException(Ljava/lang/Throwable;)Z

    return-void

    .line 103
    :catch_1
    invoke-virtual {p0, v4}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->cancel(Z)Z
    :try_end_2
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception v0

    .line 117
    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->setException(Ljava/lang/Throwable;)Z

    goto :goto_2

    :catch_3
    move-exception v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/reflect/UndeclaredThrowableException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;->setException(Ljava/lang/Throwable;)Z

    :goto_2
    return-void
.end method
