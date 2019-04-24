.class Lnet/toddm/comm/CachedWork;
.super Ljava/lang/Object;
.source "CachedWork.java"

# interfaces
.implements Lnet/toddm/comm/Work;


# instance fields
.field private final cachedResponse:Lnet/toddm/comm/Response;

.field private final cachingBehavior:Lnet/toddm/comm/CacheBehavior;

.field private final cachingPriority:Lnet/toddm/cache/CachePriority;

.field private final request:Lnet/toddm/comm/Request;

.field private final requestPriority:Lnet/toddm/comm/Priority;


# direct methods
.method protected constructor <init>(Lnet/toddm/comm/Request;Lnet/toddm/comm/Response;Lnet/toddm/comm/Priority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    if-eqz p4, :cond_1

    if-eqz p5, :cond_0

    .line 60
    iput-object p1, p0, Lnet/toddm/comm/CachedWork;->request:Lnet/toddm/comm/Request;

    .line 61
    iput-object p2, p0, Lnet/toddm/comm/CachedWork;->cachedResponse:Lnet/toddm/comm/Response;

    .line 62
    iput-object p3, p0, Lnet/toddm/comm/CachedWork;->requestPriority:Lnet/toddm/comm/Priority;

    .line 63
    iput-object p4, p0, Lnet/toddm/comm/CachedWork;->cachingPriority:Lnet/toddm/cache/CachePriority;

    .line 64
    iput-object p5, p0, Lnet/toddm/comm/CachedWork;->cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    return-void

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'cachingBehavior\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'cachingPriority\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'requestPriority\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 55
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'cachedResponse\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'request\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public get()Lnet/toddm/comm/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lnet/toddm/comm/CachedWork;->cachedResponse:Lnet/toddm/comm/Response;

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 81
    iget-object p1, p0, Lnet/toddm/comm/CachedWork;->cachedResponse:Lnet/toddm/comm/Response;

    return-object p1
.end method

.method public getCachingBehavior()Lnet/toddm/comm/CacheBehavior;
    .locals 1

    .line 97
    iget-object v0, p0, Lnet/toddm/comm/CachedWork;->cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    return-object v0
.end method

.method public getCachingPriority()Lnet/toddm/cache/CachePriority;
    .locals 1

    .line 93
    iget-object v0, p0, Lnet/toddm/comm/CachedWork;->cachingPriority:Lnet/toddm/cache/CachePriority;

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 73
    iget-object v0, p0, Lnet/toddm/comm/CachedWork;->request:Lnet/toddm/comm/Request;

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getId()I

    move-result v0

    return v0
.end method

.method public getRequest()Lnet/toddm/comm/Request;
    .locals 1

    .line 85
    iget-object v0, p0, Lnet/toddm/comm/CachedWork;->request:Lnet/toddm/comm/Request;

    return-object v0
.end method

.method public getRequestPriority()Lnet/toddm/comm/Priority;
    .locals 1

    .line 89
    iget-object v0, p0, Lnet/toddm/comm/CachedWork;->requestPriority:Lnet/toddm/comm/Priority;

    return-object v0
.end method

.method public getState()Lnet/toddm/comm/Work$Status;
    .locals 1

    .line 69
    sget-object v0, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    return-object v0
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

.method public setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V
    .locals 0

    return-void
.end method
