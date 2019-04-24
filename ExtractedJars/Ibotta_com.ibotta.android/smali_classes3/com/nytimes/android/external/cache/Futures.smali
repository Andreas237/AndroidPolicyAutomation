.class public final Lcom/nytimes/android/external/cache/Futures;
.super Ljava/lang/Object;
.source "Futures.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nytimes/android/external/cache/Futures$ImmediateFuture;,
        Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;,
        Lcom/nytimes/android/external/cache/Futures$ImmediateFailedFuture;,
        Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;,
        Lcom/nytimes/android/external/cache/Futures$ChainingFuture;
    }
.end annotation


# direct methods
.method public static immediateFailedFuture(Ljava/lang/Throwable;)Lcom/nytimes/android/external/cache/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 35
    invoke-static {p0}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    new-instance v0, Lcom/nytimes/android/external/cache/Futures$ImmediateFailedFuture;

    invoke-direct {v0, p0}, Lcom/nytimes/android/external/cache/Futures$ImmediateFailedFuture;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static immediateFuture(Ljava/lang/Object;)Lcom/nytimes/android/external/cache/ListenableFuture;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(TV;)",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    .line 26
    sget-object p0, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;->NULL:Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;

    return-object p0

    .line 28
    :cond_0
    new-instance v0, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;

    invoke-direct {v0, p0}, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static transform(Lcom/nytimes/android/external/cache/ListenableFuture;Lcom/nytimes/android/external/cache/Function;)Lcom/nytimes/android/external/cache/ListenableFuture;
    .locals 1
    .param p0    # Lcom/nytimes/android/external/cache/ListenableFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TI;>;",
            "Lcom/nytimes/android/external/cache/Function<",
            "-TI;+TO;>;)",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TO;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 41
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    new-instance v0, Lcom/nytimes/android/external/cache/Futures$ChainingFuture;

    invoke-direct {v0, p0, p1}, Lcom/nytimes/android/external/cache/Futures$ChainingFuture;-><init>(Lcom/nytimes/android/external/cache/ListenableFuture;Lcom/nytimes/android/external/cache/Function;)V

    .line 43
    sget-object p1, Lcom/nytimes/android/external/cache/DirectExecutor;->INSTANCE:Lcom/nytimes/android/external/cache/DirectExecutor;

    invoke-interface {p0, v0, p1}, Lcom/nytimes/android/external/cache/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
