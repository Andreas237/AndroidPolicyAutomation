.class Lnet/toddm/comm/CommWork;
.super Ljava/lang/Object;
.source "CommWork.java"

# interfaces
.implements Lnet/toddm/comm/Work;


# static fields
.field private static final _ResponseComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lnet/toddm/comm/Response;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private _cachedResponse:Lnet/toddm/cache/CacheEntry;

.field private final _cachingBehavior:Lnet/toddm/comm/CacheBehavior;

.field private final _cachingPriority:Lnet/toddm/cache/CachePriority;

.field private _dependentWork:Lnet/toddm/comm/CommWork;

.field private _dependentWorkListener:Lnet/toddm/comm/DependentWorkListener;

.field private _exception:Ljava/lang/Exception;

.field private final _futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/util/concurrent/FutureTask<",
            "Lnet/toddm/comm/Response;",
            ">;>;"
        }
    .end annotation
.end field

.field private final _logger:Lnet/toddm/cache/LoggingProvider;

.field private final _request:Lnet/toddm/comm/Request;

.field private final _requestPriority:Lnet/toddm/comm/Priority;

.field private _response:Lnet/toddm/comm/Response;

.field private _retryAfterTimestamp:J

.field private _state:Lnet/toddm/comm/Work$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 367
    new-instance v0, Lnet/toddm/comm/CommWork$1;

    invoke-direct {v0}, Lnet/toddm/comm/CommWork$1;-><init>()V

    sput-object v0, Lnet/toddm/comm/CommWork;->_ResponseComparator:Ljava/util/Comparator;

    return-void
.end method

.method protected constructor <init>(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/cache/LoggingProvider;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Lnet/toddm/comm/Request$RequestMethod;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lnet/toddm/comm/Priority$StartingPriority;",
            "Lnet/toddm/cache/CachePriority;",
            "Lnet/toddm/comm/CacheBehavior;",
            "Lnet/toddm/cache/LoggingProvider;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v3, p2

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 52
    sget-object v1, Lnet/toddm/comm/Work$Status;->CREATED:Lnet/toddm/comm/Work$Status;

    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    const/4 v1, 0x0

    .line 53
    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_response:Lnet/toddm/comm/Response;

    .line 54
    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_cachedResponse:Lnet/toddm/cache/CacheEntry;

    const-wide/16 v4, 0x0

    .line 55
    iput-wide v4, v0, Lnet/toddm/comm/CommWork;->_retryAfterTimestamp:J

    .line 56
    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_exception:Ljava/lang/Exception;

    .line 58
    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_dependentWork:Lnet/toddm/comm/CommWork;

    .line 59
    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_dependentWorkListener:Lnet/toddm/comm/DependentWorkListener;

    if-eqz p1, :cond_6

    if-eqz v3, :cond_5

    if-eqz v7, :cond_4

    if-eqz v8, :cond_3

    if-eqz v9, :cond_2

    if-eqz p3, :cond_1

    .line 79
    sget-object v1, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    invoke-virtual {v1, p2}, Lnet/toddm/comm/Request$RequestMethod;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 80
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'method\' must be \'POST\' when \'postData\' is provided"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 84
    :cond_1
    :goto_0
    sget-object v1, Lnet/toddm/comm/Work$Status;->CREATED:Lnet/toddm/comm/Work$Status;

    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    .line 85
    new-instance v10, Lnet/toddm/comm/Request;

    move-object v1, v10

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p5

    invoke-direct/range {v1 .. v6}, Lnet/toddm/comm/Request;-><init>(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;Z)V

    iput-object v10, v0, Lnet/toddm/comm/CommWork;->_request:Lnet/toddm/comm/Request;

    .line 86
    new-instance v1, Lnet/toddm/comm/Priority;

    invoke-direct {v1, p0, v7}, Lnet/toddm/comm/Priority;-><init>(Lnet/toddm/comm/Work;Lnet/toddm/comm/Priority$StartingPriority;)V

    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_requestPriority:Lnet/toddm/comm/Priority;

    .line 87
    iput-object v8, v0, Lnet/toddm/comm/CommWork;->_cachingPriority:Lnet/toddm/cache/CachePriority;

    .line 88
    iput-object v9, v0, Lnet/toddm/comm/CommWork;->_cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    move-object/from16 v1, p9

    .line 89
    iput-object v1, v0, Lnet/toddm/comm/CommWork;->_logger:Lnet/toddm/cache/LoggingProvider;

    return-void

    .line 78
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'cachingBehavior\' can not be NULL"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 77
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'cachingPriority\' can not be NULL"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 76
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'requestPriority\' can not be NULL"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 75
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'method\' can not be NULL"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 74
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'uri\' can not be NULL"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private getInternal(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 278
    sget-object v0, Lnet/toddm/comm/Work$Status;->CREATED:Lnet/toddm/comm/Work$Status;

    iget-object v1, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v0, v1}, Lnet/toddm/comm/Work$Status;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 284
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 285
    :goto_0
    iget-object v3, p0, Lnet/toddm/comm/CommWork;->_futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v3

    if-lt v2, v3, :cond_2

    .line 302
    sget-object p1, Lnet/toddm/comm/CommWork;->_ResponseComparator:Ljava/util/Comparator;

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 304
    iget-object p1, p0, Lnet/toddm/comm/CommWork;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const-string v3, "Done waiting on Work [responseCount:%1$d futureTaskCount:%2$d]"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    iget-object v1, p0, Lnet/toddm/comm/CommWork;->_futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, p2

    invoke-interface {p1, v3, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-gtz p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 308
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/toddm/comm/Response;

    return-object p1

    .line 287
    :cond_2
    iget-object v2, p0, Lnet/toddm/comm/CommWork;->_futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v1

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    move v2, v3

    goto :goto_0

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/FutureTask;

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    .line 290
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6, p2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/toddm/comm/Response;

    goto :goto_2

    .line 292
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/toddm/comm/Response;

    :goto_2
    add-int/lit8 v3, v3, 0x1

    if-eqz v4, :cond_3

    .line 295
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 296
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 279
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You can not wait on work that has not been submitted for processing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected addFutureTask(Ljava/util/concurrent/FutureTask;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/FutureTask<",
            "Lnet/toddm/comm/Response;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 178
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void

    .line 177
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'futureTask\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method cancel(Z)V
    .locals 5

    .line 246
    invoke-virtual {p0}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result v0

    if-nez v0, :cond_1

    .line 247
    sget-object v0, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {p0, v0}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 248
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 251
    iget-object p1, p0, Lnet/toddm/comm/CommWork;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz p1, :cond_1

    const-string v0, "[thread:%1$d][request:%2$d] Work has been cancel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-interface {p1, v0, v1}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 248
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/FutureTask;

    .line 249
    invoke-virtual {v1, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 227
    instance-of v0, p1, Lnet/toddm/comm/CommWork;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 228
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_request:Lnet/toddm/comm/Request;

    check-cast p1, Lnet/toddm/comm/CommWork;

    iget-object p1, p1, Lnet/toddm/comm/CommWork;->_request:Lnet/toddm/comm/Request;

    invoke-virtual {v0, p1}, Lnet/toddm/comm/Request;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 226
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'work\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public get()Lnet/toddm/comm/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 258
    :try_start_0
    invoke-direct {p0, v0, v0}, Lnet/toddm/comm/CommWork;->getInternal(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
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

    .line 272
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lnet/toddm/comm/CommWork;->getInternal(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;

    move-result-object p1

    return-object p1
.end method

.method protected getCachedResponse()Lnet/toddm/cache/CacheEntry;
    .locals 1

    .line 156
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_cachedResponse:Lnet/toddm/cache/CacheEntry;

    return-object v0
.end method

.method public getCachingBehavior()Lnet/toddm/comm/CacheBehavior;
    .locals 1

    .line 102
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    return-object v0
.end method

.method public getCachingPriority()Lnet/toddm/cache/CachePriority;
    .locals 1

    .line 99
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_cachingPriority:Lnet/toddm/cache/CachePriority;

    return-object v0
.end method

.method protected getDependentWork()Lnet/toddm/comm/CommWork;
    .locals 1

    .line 355
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_dependentWork:Lnet/toddm/comm/CommWork;

    return-object v0
.end method

.method protected getDependentWorkListener()Lnet/toddm/comm/DependentWorkListener;
    .locals 1

    .line 360
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_dependentWorkListener:Lnet/toddm/comm/DependentWorkListener;

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    .line 200
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_exception:Ljava/lang/Exception;

    return-object v0
.end method

.method protected getFutureTask()Ljava/util/concurrent/FutureTask;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/FutureTask<",
            "Lnet/toddm/comm/Response;",
            ">;"
        }
    .end annotation

    .line 166
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_futureTasks:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/FutureTask;

    goto :goto_0
.end method

.method public getId()I
    .locals 1

    .line 208
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_request:Lnet/toddm/comm/Request;

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getId()I

    move-result v0

    return v0
.end method

.method public getRequest()Lnet/toddm/comm/Request;
    .locals 1

    .line 93
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_request:Lnet/toddm/comm/Request;

    return-object v0
.end method

.method public getRequestPriority()Lnet/toddm/comm/Priority;
    .locals 1

    .line 96
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_requestPriority:Lnet/toddm/comm/Priority;

    return-object v0
.end method

.method protected getResponse()Lnet/toddm/comm/Response;
    .locals 1

    .line 150
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_response:Lnet/toddm/comm/Response;

    return-object v0
.end method

.method protected getRetryAfterTimestamp()J
    .locals 2

    .line 182
    iget-wide v0, p0, Lnet/toddm/comm/CommWork;->_retryAfterTimestamp:J

    return-wide v0
.end method

.method public getState()Lnet/toddm/comm/Work$Status;
    .locals 1

    .line 141
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 217
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_request:Lnet/toddm/comm/Request;

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->hashCode()I

    move-result v0

    return v0
.end method

.method public isCancelled()Z
    .locals 2

    .line 328
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    sget-object v1, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 2

    .line 322
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    sget-object v1, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    sget-object v1, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isPending()Z
    .locals 2

    .line 316
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    sget-object v1, Lnet/toddm/comm/Work$Status;->WAITING:Lnet/toddm/comm/Work$Status;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    sget-object v1, Lnet/toddm/comm/Work$Status;->RETRYING:Lnet/toddm/comm/Work$Status;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    sget-object v1, Lnet/toddm/comm/Work$Status;->REDIRECTING:Lnet/toddm/comm/Work$Status;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method protected setCachedResponse(Lnet/toddm/cache/CacheEntry;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lnet/toddm/comm/CommWork;->_cachedResponse:Lnet/toddm/cache/CacheEntry;

    return-void
.end method

.method public setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V
    .locals 3

    .line 338
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 339
    invoke-virtual {p0}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 340
    check-cast p1, Lnet/toddm/comm/CommWork;

    move-object v1, p1

    :goto_0
    if-nez v1, :cond_0

    .line 349
    iput-object p1, p0, Lnet/toddm/comm/CommWork;->_dependentWork:Lnet/toddm/comm/CommWork;

    .line 350
    iput-object p2, p0, Lnet/toddm/comm/CommWork;->_dependentWorkListener:Lnet/toddm/comm/DependentWorkListener;

    return-void

    .line 342
    :cond_0
    invoke-virtual {v1}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 346
    invoke-virtual {v1}, Lnet/toddm/comm/CommWork;->getDependentWork()Lnet/toddm/comm/CommWork;

    move-result-object v1

    goto :goto_0

    .line 344
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cyclic dependence detected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected setException(Ljava/lang/Exception;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lnet/toddm/comm/CommWork;->_exception:Ljava/lang/Exception;

    return-void
.end method

.method protected setResponse(Lnet/toddm/comm/Response;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lnet/toddm/comm/CommWork;->_response:Lnet/toddm/comm/Response;

    return-void
.end method

.method protected setState(Lnet/toddm/comm/Work$Status;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 146
    iput-object p1, p0, Lnet/toddm/comm/CommWork;->_state:Lnet/toddm/comm/Work$Status;

    return-void

    .line 145
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'state\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected shouldCache()Z
    .locals 4

    .line 108
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    iget-object v1, p0, Lnet/toddm/comm/CommWork;->_cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 112
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_response:Lnet/toddm/comm/Response;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 115
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v3, 0x130

    if-ne v0, v3, :cond_1

    return v2

    .line 120
    :cond_1
    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_response:Lnet/toddm/comm/Response;

    invoke-virtual {v0}, Lnet/toddm/comm/Response;->shouldNotCacheDueToNoCacheDirective()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 124
    :cond_2
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    iget-object v3, p0, Lnet/toddm/comm/CommWork;->_cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual {v0, v3}, Lnet/toddm/comm/CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/toddm/comm/CommWork;->_response:Lnet/toddm/comm/Response;

    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_4

    return v1

    .line 130
    :cond_3
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    iget-object v3, p0, Lnet/toddm/comm/CommWork;->_cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual {v0, v3}, Lnet/toddm/comm/CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method protected updateRetryAfterTimestamp(J)V
    .locals 2

    .line 189
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, Lnet/toddm/comm/CommWork;->_retryAfterTimestamp:J

    return-void
.end method
