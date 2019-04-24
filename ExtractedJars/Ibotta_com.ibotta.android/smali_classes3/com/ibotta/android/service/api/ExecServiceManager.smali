.class public Lcom/ibotta/android/service/api/ExecServiceManager;
.super Ljava/lang/Object;
.source "ExecServiceManager.java"


# instance fields
.field private execCompletionService:Ljava/util/concurrent/ExecutorCompletionService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ExecutorCompletionService<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end field

.field private execService:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private workingLock:Ljava/util/concurrent/locks/Lock;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    return-void
.end method

.method private isReadyForJobs()Z
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 119
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 121
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public start()Z
    .locals 9

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 36
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ExecServiceManager;->isReadyForJobs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/16 v2, 0xa

    const/16 v3, 0x14

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v8, 0x1f4

    invoke-direct {v7, v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 41
    new-instance v0, Ljava/util/concurrent/ExecutorCompletionService;

    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v2, v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ExecutorCompletionService;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execCompletionService:Ljava/util/concurrent/ExecutorCompletionService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public stop()V
    .locals 5

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 55
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z

    move-result v1

    if-nez v1, :cond_0

    .line 56
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :try_start_1
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v2, 0x3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "Failed to await termination."

    const/4 v3, 0x0

    .line 61
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    :cond_0
    :goto_0
    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 66
    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    .line 65
    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execService:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 66
    iput-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;)",
            "Ljava/util/concurrent/Future<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/service/api/ExecServiceException;
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 75
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ExecServiceManager;->isReadyForJobs()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ExecutorCompletionService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    const-string v1, "Job submitted: count=%1$d"

    const/4 v2, 0x1

    .line 78
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    .line 80
    :cond_0
    :try_start_1
    new-instance p1, Lcom/ibotta/android/service/api/ExecServiceException;

    const-string v0, "Exec service unavailable."

    invoke-direct {p1, v0}, Lcom/ibotta/android/service/api/ExecServiceException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public take()Ljava/util/concurrent/Future;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/service/api/ExecServiceException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 93
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ExecServiceManager;->isReadyForJobs()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->execCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutorCompletionService;->poll()Ljava/util/concurrent/Future;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    goto :goto_0

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    :goto_0
    const-string v2, "Jobs remaining: count=%1$d"

    const/4 v3, 0x1

    .line 103
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    .line 105
    :cond_1
    :try_start_1
    new-instance v0, Lcom/ibotta/android/service/api/ExecServiceException;

    const-string v1, "Exec service unavailable."

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/ExecServiceException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/service/api/ExecServiceManager;->workingLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
