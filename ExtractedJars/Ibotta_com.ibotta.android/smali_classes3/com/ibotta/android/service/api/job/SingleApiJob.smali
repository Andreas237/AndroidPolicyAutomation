.class public Lcom/ibotta/android/service/api/job/SingleApiJob;
.super Lcom/ibotta/android/service/api/job/BaseApiJob;
.source "SingleApiJob.java"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/service/api/job/BaseApiJob<",
        "Lcom/ibotta/android/service/api/job/SingleApiJob;",
        "Lcom/ibotta/android/service/api/job/SingleApiJob;",
        ">;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/android/service/api/job/SingleApiJob;",
        ">;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/ibotta/android/service/api/job/SingleApiJob;",
        ">;"
    }
.end annotation


# static fields
.field private static final MAX_NETWORK_CONNECT_WAIT:J


# instance fields
.field private apiCall:Lcom/ibotta/api/ApiCall;

.field protected final apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

.field protected apiResponse:Lcom/ibotta/api/ApiResponse;

.field private cacheFetchStrategy:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;

.field private exception:Lcom/ibotta/api/ApiException;

.field private lastLoadTime:J

.field private lock:Ljava/util/concurrent/locks/Lock;

.field private final peers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation
.end field

.field private ticket:Ljava/lang/String;

.field private waitCondition:Ljava/util/concurrent/locks/Condition;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 34
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/service/api/job/SingleApiJob;->MAX_NETWORK_CONNECT_WAIT:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/BaseApiJob;-><init>(I)V

    .line 36
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    .line 37
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p2

    invoke-interface {p2}, Lcom/ibotta/android/di/MainComponent;->getApiJobEnvironment()Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    .line 39
    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    .line 40
    iget-object p2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    .line 55
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->setApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method public static synthetic lambda$onCheckCache$0(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 226
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyLongTask()V

    return-void
.end method

.method private onPeered(ZZ)V
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    if-eqz p1, :cond_0

    .line 343
    :try_start_0
    iget-boolean p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifiedJobFinished:Z

    if-nez p1, :cond_0

    .line 344
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyJobFinished()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 345
    iget-boolean p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifiedLongTask:Z

    if-nez p1, :cond_1

    .line 346
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyLongTask()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 349
    :goto_0
    iget-object p2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void
.end method

.method private setApiCall(Lcom/ibotta/api/ApiCall;)V
    .locals 1

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    if-eqz p1, :cond_1

    .line 61
    instance-of v0, p1, Lcom/ibotta/api/CacheKeyProvider;

    if-eqz v0, :cond_0

    .line 62
    move-object v0, p1

    check-cast v0, Lcom/ibotta/api/CacheKeyProvider;

    invoke-interface {v0}, Lcom/ibotta/api/CacheKeyProvider;->getCacheKey()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->ticket:Ljava/lang/String;

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->ticket:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->ticket:Ljava/lang/String;

    .line 70
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0, p1}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCacheFetchStrategy(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->cacheFetchStrategy:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;

    return-void
.end method

.method private upgradeAuthTokenIfNeeded()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getAuthToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 193
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 194
    new-instance v0, Lcom/ibotta/api/call/auth/LoginPutCall;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v1}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/auth/LoginPutCall;-><init>(I)V

    .line 195
    invoke-virtual {v0}, Lcom/ibotta/api/call/auth/LoginPutCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/auth/LoginPutResponse;

    .line 197
    invoke-virtual {v0}, Lcom/ibotta/api/call/auth/LoginPutResponse;->getAuthenticationToken()Ljava/lang/String;

    move-result-object v0

    .line 199
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v1, v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->setAuthToken(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private waitOnNetwork()V
    .locals 7

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->isNetworkConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v0

    .line 291
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->isNetworkConnected()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    .line 292
    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    sget-wide v4, Lcom/ibotta/android/service/api/job/SingleApiJob;->MAX_NETWORK_CONNECT_WAIT:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_0

    const-wide/16 v2, 0x1f4

    .line 294
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to wait for the network to connect: apiJob=%1$s"

    const/4 v4, 0x1

    .line 296
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p0, v4, v5

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic addPeer(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addPeer(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method public addPeer(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    if-ne p1, p0, :cond_0

    return-void

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 324
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-ne v0, v1, :cond_1

    .line 325
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifiedJobFinished:Z

    iget-boolean v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifiedLongTask:Z

    invoke-direct {p1, v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onPeered(ZZ)V

    goto :goto_0

    .line 328
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 331
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public call()Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "** STARTED: %1$s"

    const/4 v1, 0x1

    .line 141
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v4

    .line 143
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    const/4 v0, 0x2

    .line 146
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onCheckCache()Z

    move-result v2
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v2, :cond_2

    .line 155
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v6, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v2, v6, :cond_0

    .line 156
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    :cond_0
    const-string v2, "API call outcome: outcome=%1$s, apiJob=%2$s"

    .line 158
    new-array v6, v0, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    aput-object v7, v6, v3

    aput-object p0, v6, v1

    invoke-static {v2, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :try_start_1
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V
    :try_end_1
    .catch Lcom/ibotta/api/ApiException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v6, "onAfterApiCall failed."

    .line 162
    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v6, v7}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 167
    :try_start_2
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 168
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 169
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, v6}, Lcom/ibotta/android/service/api/job/SingleApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 170
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 173
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 175
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyJobFinished()V

    .line 180
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    sub-long/2addr v6, v4

    const-string v2, "** FINISHED (timing): duration=%1$d ms, %2$s"

    .line 181
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v0, v3

    aput-object p0, v0, v1

    invoke-static {v2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0

    :catchall_0
    move-exception v0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    .line 150
    :cond_2
    :try_start_3
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onBeforeApiCall()V

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onDoWork()V
    :try_end_3
    .catch Lcom/ibotta/api/ApiException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 155
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v6, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v2, v6, :cond_3

    .line 156
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    :cond_3
    const-string v2, "API call outcome: outcome=%1$s, apiJob=%2$s"

    .line 158
    new-array v6, v0, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    aput-object v7, v6, v3

    aput-object p0, v6, v1

    invoke-static {v2, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :try_start_4
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V
    :try_end_4
    .catch Lcom/ibotta/api/ApiException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    const-string v6, "onAfterApiCall failed."

    .line 162
    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v6, v7}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_2
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 167
    :try_start_5
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 168
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 169
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, v6}, Lcom/ibotta/android/service/api/job/SingleApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 170
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    .line 173
    :cond_4
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 175
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyJobFinished()V

    .line 180
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    sub-long/2addr v6, v4

    const-string v2, "** FINISHED (timing): duration=%1$d ms, %2$s"

    .line 181
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v0, v3

    aput-object p0, v0, v1

    goto :goto_6

    :catchall_1
    move-exception v0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :catchall_2
    move-exception v2

    goto :goto_7

    :catch_2
    move-exception v2

    .line 153
    :try_start_6
    invoke-virtual {p0, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onHandleException(Lcom/ibotta/api/ApiException;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 155
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v6, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v2, v6, :cond_5

    .line 156
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    :cond_5
    const-string v2, "API call outcome: outcome=%1$s, apiJob=%2$s"

    .line 158
    new-array v6, v0, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    aput-object v7, v6, v3

    aput-object p0, v6, v1

    invoke-static {v2, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :try_start_7
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V
    :try_end_7
    .catch Lcom/ibotta/api/ApiException; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_4

    :catch_3
    move-exception v2

    const-string v6, "onAfterApiCall failed."

    .line 162
    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v6, v7}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_4
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 167
    :try_start_8
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 168
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 169
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, v6}, Lcom/ibotta/android/service/api/job/SingleApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 170
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    .line 173
    :cond_6
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 175
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyJobFinished()V

    .line 180
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    sub-long/2addr v6, v4

    const-string v2, "** FINISHED (timing): duration=%1$d ms, %2$s"

    .line 181
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v0, v3

    aput-object p0, v0, v1

    :goto_6
    invoke-static {v2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0

    :catchall_3
    move-exception v0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    .line 155
    :goto_7
    iget-object v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v7, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v6, v7, :cond_7

    .line 156
    iget-object v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v6}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    :cond_7
    const-string v6, "API call outcome: outcome=%1$s, apiJob=%2$s"

    .line 158
    new-array v7, v0, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    aput-object v8, v7, v3

    aput-object p0, v7, v1

    invoke-static {v6, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :try_start_9
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V
    :try_end_9
    .catch Lcom/ibotta/api/ApiException; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_8

    :catch_4
    move-exception v6

    const-string v7, "onAfterApiCall failed."

    .line 162
    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v6, v7, v8}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_8
    iget-object v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v6}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 167
    :try_start_a
    iget-object v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 168
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 169
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, v7}, Lcom/ibotta/android/service/api/job/SingleApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 170
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto :goto_9

    .line 173
    :cond_8
    iget-object v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v6}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 175
    iget-object v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v6}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyJobFinished()V

    .line 180
    iget-object v6, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v6}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    sub-long/2addr v6, v4

    .line 181
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v0, v3

    aput-object p0, v0, v1

    const-string v1, "** FINISHED (timing): duration=%1$d ms, %2$s"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    throw v2

    :catchall_4
    move-exception v0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->call()Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    return-object v0
.end method

.method public compareTo(Lcom/ibotta/android/service/api/job/SingleApiJob;)I
    .locals 1

    .line 414
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getGroup()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getGroup()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->compareTo(Lcom/ibotta/android/service/api/job/SingleApiJob;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic copyOutcome(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method public copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 355
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 359
    :cond_0
    iget-object v0, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 361
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    .line 362
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    iput-object v0, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    .line 363
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->exception:Lcom/ibotta/api/ApiException;

    iput-object v0, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->exception:Lcom/ibotta/api/ApiException;

    .line 364
    iget-wide v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    iput-wide v0, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    .line 365
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyJobFinished()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    iget-object p1, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object p1, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 379
    :cond_1
    instance-of v1, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    return v0

    .line 383
    :cond_2
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 384
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->ticket:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;->ticket:Ljava/lang/String;

    .line 386
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    .line 387
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getGroup()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getGroup()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    .line 388
    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public getApiCall()Lcom/ibotta/api/ApiCall;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    return-object v0
.end method

.method public getApiResponse()Lcom/ibotta/api/ApiResponse;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    return-object v0
.end method

.method public getCallables()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/concurrent/Callable<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;>;"
        }
    .end annotation

    .line 95
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 96
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getException()Lcom/ibotta/api/ApiException;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->exception:Lcom/ibotta/api/ApiException;

    return-object v0
.end method

.method public getLastLoadTime()J
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    return-wide v0
.end method

.method public getPeers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation

    .line 337
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 393
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    const/16 v1, 0x15bb

    const/16 v2, 0x119

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    .line 394
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->ticket:Ljava/lang/String;

    .line 395
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 396
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getGroup()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(I)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 397
    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public isOutOfDate()Z
    .locals 3

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->cacheFetchStrategy:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;

    iget-wide v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;->isOutOfDate(J)Z

    move-result v0

    return v0
.end method

.method protected isResponseReady()Z
    .locals 2

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->cacheFetchStrategy:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;->loadFromMemCache()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isSuccessfullyLoaded()Z
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onAfterApiCall()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    return-void
.end method

.method protected onBeforeApiCall()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 188
    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->upgradeAuthTokenIfNeeded()V

    return-void
.end method

.method protected onCheckCache()Z
    .locals 4

    .line 226
    new-instance v0, Lcom/ibotta/android/service/api/job/-$$Lambda$SingleApiJob$w7ppubbhZdaUJE8zHC6o8Sd-FRU;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/api/job/-$$Lambda$SingleApiJob$w7ppubbhZdaUJE8zHC6o8Sd-FRU;-><init>(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 229
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    const-wide/16 v2, 0x12c

    invoke-interface {v1, v0, v2, v3}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->postDelayed(Ljava/lang/Runnable;J)V

    .line 231
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isResponseReady()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 234
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v1, v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string v0, "Loader found response was immediately available: %1$s"

    .line 236
    new-array v1, v2, [Ljava/lang/Object;

    aput-object p0, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_0

    :cond_0
    const-string v0, "Loader will hit disk cache or API server for data: %1$s"

    .line 240
    new-array v1, v2, [Ljava/lang/Object;

    aput-object p0, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method protected onDoWork()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->cacheFetchStrategy:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;->loadFromDiskCache()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 207
    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    .line 208
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_0

    .line 210
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->waitOnNetwork()V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v0

    const-string v2, "** STARTED onExecuteApiCall: %1$s"

    const/4 v3, 0x1

    .line 213
    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p0, v4, v5

    invoke-static {v2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onExecuteApiCall()V

    .line 217
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v6

    sub-long/2addr v6, v0

    const-string v0, "** FINISHED onExecuteApiCall: duration=%1$d ms, %2$s"

    const/4 v1, 0x2

    .line 218
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v5

    aput-object p0, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    :goto_0
    return-void
.end method

.method protected onExecuteApiCall()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    invoke-interface {v0}, Lcom/ibotta/api/ApiCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    return-void
.end method

.method protected onHandleException(Lcom/ibotta/api/ApiException;)V
    .locals 3

    .line 247
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->exception:Lcom/ibotta/api/ApiException;

    .line 249
    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getApiCode()I

    move-result v0

    const/16 v1, 0x191

    if-ne v0, v1, :cond_0

    .line 251
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->AUTH_LOST:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_0

    .line 252
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getApiCode()I

    move-result v0

    const/16 v1, 0x199

    if-ne v0, v1, :cond_1

    .line 254
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->OFFER_EXPIRED:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_0

    .line 255
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getApiCode()I

    move-result v0

    const/16 v1, 0x1aa

    if-ne v0, v1, :cond_2

    .line 257
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->DEPRECATED:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_0

    .line 258
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getApiCode()I

    move-result v0

    const/16 v1, 0x1f7

    if-ne v0, v1, :cond_3

    .line 260
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->MAINTENANCE_MODE:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_0

    .line 261
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->isNetworkConnected()Z

    move-result v0

    if-nez v0, :cond_4

    .line 263
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->NETWORK_LOST:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_0

    .line 265
    :cond_4
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->ERROR:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    :goto_0
    const-string v0, "API call failed: %1$s"

    const/4 v1, 0x1

    .line 267
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public reset()V
    .locals 2

    .line 304
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/BaseApiJob;->reset()V

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 307
    :try_start_0
    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    .line 308
    iput-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->exception:Lcom/ibotta/api/ApiException;

    const-wide/16 v0, 0x0

    .line 309
    iput-wide v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lastLoadTime:J

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 312
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public setApiResponse(Lcom/ibotta/api/ApiResponse;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    return-void
.end method

.method public setException(Lcom/ibotta/api/ApiException;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->exception:Lcom/ibotta/api/ApiException;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "SingleApiJob [class=%1$s, group=%2$d, outcome=%3$s, ticket=%4$s, listeners=%5$d, peers=%6$d]"

    const/4 v1, 0x6

    .line 402
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->apiCall:Lcom/ibotta/api/ApiCall;

    .line 404
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 405
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getGroup()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 406
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->ticket:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 408
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getListenerCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->peers:Ljava/util/List;

    .line 409
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 402
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public waitForOutcome(JLjava/util/concurrent/TimeUnit;)Lcom/ibotta/android/service/api/Outcome;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-eq v0, v1, :cond_0

    .line 124
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-object p1

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    const-string v0, "Waiting for signal..."

    const/4 v1, 0x0

    .line 129
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 136
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 132
    :try_start_1
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string p3, "Failed to wait for signal to execute ApiCall"

    invoke-direct {p2, p3, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :goto_0
    iget-object p2, p0, Lcom/ibotta/android/service/api/job/SingleApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
