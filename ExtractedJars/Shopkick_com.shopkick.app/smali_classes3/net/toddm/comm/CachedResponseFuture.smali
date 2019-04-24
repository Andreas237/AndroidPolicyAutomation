.class public Lnet/toddm/comm/CachedResponseFuture;
.super Ljava/util/concurrent/FutureTask;
.source "CachedResponseFuture.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "Lnet/toddm/comm/Response;",
        ">;"
    }
.end annotation


# static fields
.field private static _ReturnCachedResponseCallable:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Lnet/toddm/comm/Response;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private _cachedResponse:Lnet/toddm/comm/Response;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Lnet/toddm/comm/CachedResponseFuture$1;

    invoke-direct {v0}, Lnet/toddm/comm/CachedResponseFuture$1;-><init>()V

    sput-object v0, Lnet/toddm/comm/CachedResponseFuture;->_ReturnCachedResponseCallable:Ljava/util/concurrent/Callable;

    return-void
.end method

.method protected constructor <init>(Lnet/toddm/comm/Response;)V
    .locals 1

    .line 42
    sget-object v0, Lnet/toddm/comm/CachedResponseFuture;->_ReturnCachedResponseCallable:Ljava/util/concurrent/Callable;

    invoke-direct {p0, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lnet/toddm/comm/CachedResponseFuture;->_cachedResponse:Lnet/toddm/comm/Response;

    if-eqz p1, :cond_0

    .line 44
    iput-object p1, p0, Lnet/toddm/comm/CachedResponseFuture;->_cachedResponse:Lnet/toddm/comm/Response;

    return-void

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'cachedResponse\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/toddm/comm/CachedResponseFuture;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lnet/toddm/comm/CachedResponseFuture;->get(JLjava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;

    move-result-object p1

    return-object p1
.end method

.method public get()Lnet/toddm/comm/Response;
    .locals 1

    .line 50
    iget-object v0, p0, Lnet/toddm/comm/CachedResponseFuture;->_cachedResponse:Lnet/toddm/comm/Response;

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;
    .locals 0

    .line 56
    iget-object p1, p0, Lnet/toddm/comm/CachedResponseFuture;->_cachedResponse:Lnet/toddm/comm/Response;

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public run()V
    .locals 0

    return-void
.end method
