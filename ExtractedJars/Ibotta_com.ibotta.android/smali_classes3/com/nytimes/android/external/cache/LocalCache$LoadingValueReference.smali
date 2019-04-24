.class Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;
.super Ljava/lang/Object;
.source "LocalCache.java"

# interfaces
.implements Lcom/nytimes/android/external/cache/LocalCache$ValueReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LoadingValueReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final futureValue:Lcom/nytimes/android/external/cache/SettableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/SettableFuture<",
            "TV;>;"
        }
    .end annotation
.end field

.field volatile oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final stopwatch:Lcom/nytimes/android/external/cache/Stopwatch;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3500
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->unset()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;-><init>(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    return-void
.end method

.method public constructor <init>(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 3503
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3496
    invoke-static {}, Lcom/nytimes/android/external/cache/SettableFuture;->create()Lcom/nytimes/android/external/cache/SettableFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->futureValue:Lcom/nytimes/android/external/cache/SettableFuture;

    .line 3497
    invoke-static {}, Lcom/nytimes/android/external/cache/Stopwatch;->createUnstarted()Lcom/nytimes/android/external/cache/Stopwatch;

    move-result-object v0

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->stopwatch:Lcom/nytimes/android/external/cache/Stopwatch;

    .line 3504
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    return-void
.end method

.method private fullyFailedFuture(Ljava/lang/Throwable;)Lcom/nytimes/android/external/cache/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 3532
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public copyFor(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;TV;",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    return-object p0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3589
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOldValue()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3594
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    return-object v0
.end method

.method public getWeight()I
    .locals 1

    .line 3519
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->getWeight()I

    move-result v0

    return v0
.end method

.method public isActive()Z
    .locals 1

    .line 3514
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result v0

    return v0
.end method

.method public isLoading()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public loadFuture(Ljava/lang/Object;Lcom/nytimes/android/external/cache/CacheLoader;)Lcom/nytimes/android/external/cache/ListenableFuture;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/nytimes/android/external/cache/CacheLoader;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3552
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->stopwatch:Lcom/nytimes/android/external/cache/Stopwatch;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Stopwatch;->start()Lcom/nytimes/android/external/cache/Stopwatch;

    .line 3553
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 3555
    invoke-virtual {p2, p1}, Lcom/nytimes/android/external/cache/CacheLoader;->load(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 3556
    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->set(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->futureValue:Lcom/nytimes/android/external/cache/SettableFuture;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Futures;->immediateFuture(Ljava/lang/Object;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p1

    :goto_0
    return-object p1

    .line 3558
    :cond_1
    invoke-virtual {p2, p1, v0}, Lcom/nytimes/android/external/cache/CacheLoader;->reload(Ljava/lang/Object;Ljava/lang/Object;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    .line 3560
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Futures;->immediateFuture(Ljava/lang/Object;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 3564
    :cond_2
    new-instance p2, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference$1;

    invoke-direct {p2, p0}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference$1;-><init>(Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;)V

    invoke-static {p1, p2}, Lcom/nytimes/android/external/cache/Futures;->transform(Lcom/nytimes/android/external/cache/ListenableFuture;Lcom/nytimes/android/external/cache/Function;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3572
    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->setException(Ljava/lang/Throwable;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->futureValue:Lcom/nytimes/android/external/cache/SettableFuture;

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->fullyFailedFuture(Ljava/lang/Throwable;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p2

    .line 3573
    :goto_1
    instance-of p1, p1, Ljava/lang/InterruptedException;

    if-eqz p1, :cond_4

    .line 3574
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    return-object p2
.end method

.method public notifyNewValue(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 3540
    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->set(Ljava/lang/Object;)Z

    goto :goto_0

    .line 3543
    :cond_0
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->unset()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->oldValue:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    :goto_0
    return-void
.end method

.method public set(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .line 3523
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->futureValue:Lcom/nytimes/android/external/cache/SettableFuture;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/SettableFuture;->set(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public setException(Ljava/lang/Throwable;)Z
    .locals 1

    .line 3527
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->futureValue:Lcom/nytimes/android/external/cache/SettableFuture;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public waitForValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 3583
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->futureValue:Lcom/nytimes/android/external/cache/SettableFuture;

    invoke-static {v0}, Lcom/nytimes/android/external/cache/Uninterruptibles;->getUninterruptibly(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
