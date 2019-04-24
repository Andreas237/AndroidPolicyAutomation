.class public Lnet/toddm/comm/NoResponseFuture;
.super Ljava/util/concurrent/FutureTask;
.source "NoResponseFuture.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "Lnet/toddm/comm/Response;",
        ">;"
    }
.end annotation


# static fields
.field private static _ReturnNullResponseCallable:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Lnet/toddm/comm/Response;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lnet/toddm/comm/NoResponseFuture$1;

    invoke-direct {v0}, Lnet/toddm/comm/NoResponseFuture$1;-><init>()V

    sput-object v0, Lnet/toddm/comm/NoResponseFuture;->_ReturnNullResponseCallable:Ljava/util/concurrent/Callable;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .line 39
    sget-object v0, Lnet/toddm/comm/NoResponseFuture;->_ReturnNullResponseCallable:Ljava/util/concurrent/Callable;

    invoke-direct {p0, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-void
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
    invoke-virtual {p0}, Lnet/toddm/comm/NoResponseFuture;->get()Lnet/toddm/comm/Response;

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
    invoke-virtual {p0, p1, p2, p3}, Lnet/toddm/comm/NoResponseFuture;->get(JLjava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;

    move-result-object p1

    return-object p1
.end method

.method public get()Lnet/toddm/comm/Response;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;
    .locals 0

    const/4 p1, 0x0

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
