.class public Lcom/ibotta/android/service/api/Producer;
.super Ljava/lang/Object;
.source "Producer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final consumeCondition:Ljava/util/concurrent/locks/Condition;

.field private final consumerListener:Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;

.field private final execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

.field private final jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final prodConLock:Ljava/util/concurrent/locks/Lock;

.field private final produceCondition:Ljava/util/concurrent/locks/Condition;

.field private stop:Z


# direct methods
.method constructor <init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/Producer;->stop:Z

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/service/api/Producer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/service/api/Producer;->produceCondition:Ljava/util/concurrent/locks/Condition;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/service/api/Producer;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/service/api/Producer;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/service/api/Producer;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 48
    iput-object p6, p0, Lcom/ibotta/android/service/api/Producer;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 49
    iput-object p7, p0, Lcom/ibotta/android/service/api/Producer;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 50
    iput-object p8, p0, Lcom/ibotta/android/service/api/Producer;->consumerListener:Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;

    return-void
.end method

.method private submitJobs(Lcom/ibotta/android/service/api/AsyncGroup;Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/AsyncGroup;",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 95
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 100
    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/service/api/job/ApiJob;

    const-string v4, "Submitting callable: %1$s"

    .line 101
    new-array v5, v3, [Ljava/lang/Object;

    aput-object v2, v5, v0

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :try_start_0
    iget-object v4, p0, Lcom/ibotta/android/service/api/Producer;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v4}, Lcom/ibotta/android/profile/BuildProfile;->isDebugLoadingAllowed()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 105
    invoke-static {v2}, Lcom/ibotta/android/service/api/DebugLoadingUtil;->addApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 108
    :cond_1
    iget-object v4, p0, Lcom/ibotta/android/service/api/Producer;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 109
    iget-object v4, p0, Lcom/ibotta/android/service/api/Producer;->consumerListener:Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;

    invoke-interface {v2, v4}, Lcom/ibotta/android/service/api/job/ApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 111
    iget-object v4, p0, Lcom/ibotta/android/service/api/Producer;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    move-object v5, v2

    check-cast v5, Ljava/util/concurrent/Callable;

    invoke-virtual {v4, v5}, Lcom/ibotta/android/service/api/ExecServiceManager;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 112
    invoke-virtual {p1, v2, v4}, Lcom/ibotta/android/service/api/AsyncGroup;->addJobFuture(Lcom/ibotta/android/service/api/job/ApiJob;Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    const-string v5, "Failed to submit job: %1$s"

    .line 114
    new-array v6, v3, [Ljava/lang/Object;

    aput-object v2, v6, v0

    invoke-static {v4, v5, v6}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object v5, p0, Lcom/ibotta/android/service/api/Producer;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v5}, Lcom/ibotta/android/profile/BuildProfile;->isDebugLoadingAllowed()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 117
    invoke-static {v2}, Lcom/ibotta/android/service/api/DebugLoadingUtil;->removeApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 120
    :cond_2
    iget-object v5, p0, Lcom/ibotta/android/service/api/Producer;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 122
    instance-of v4, v4, Lcom/ibotta/android/service/api/ExecServiceException;

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    const-string v4, "Submitted callable: %1$s"

    .line 127
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v0

    invoke-static {v4, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    :goto_2
    const-string p1, "%1$d jobs submitted."

    .line 130
    new-array v1, v3, [Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    :goto_3
    const-string p1, "No jobs submitted."

    .line 96
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/service/api/Producer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 58
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/Producer;->stop:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Stopping producer thread."

    .line 59
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    const-string v0, "Producer is checking for work now."

    .line 63
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 65
    iget-object v2, p0, Lcom/ibotta/android/service/api/Producer;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/AsyncGroupManager;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "Getting jobs to submit."

    .line 66
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v2, p0, Lcom/ibotta/android/service/api/Producer;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/service/api/AsyncGroupManager;->getJobsToSubmit(Ljava/util/Set;)Lcom/ibotta/android/service/api/AsyncGroup;

    move-result-object v2

    const-string v3, "Submitting jobs."

    .line 68
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    invoke-direct {p0, v2, v0}, Lcom/ibotta/android/service/api/Producer;->submitJobs(Lcom/ibotta/android/service/api/AsyncGroup;Ljava/util/Set;)V

    const-string v0, "Jobs submitted."

    .line 70
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const-string v0, "Producer is awaiting work..."

    .line 72
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :try_start_1
    iget-object v0, p0, Lcom/ibotta/android/service/api/Producer;->produceCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    const-string v2, "Interrupted waiting for jobs to submit."

    .line 76
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :goto_1
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/Producer;->stop:Z

    if-eqz v0, :cond_2

    const-string v0, "Stopping producer thread."

    .line 81
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    :goto_2
    iget-object v0, p0, Lcom/ibotta/android/service/api/Producer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "Producer stopped."

    .line 91
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 85
    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/ibotta/android/service/api/Producer;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/service/api/Producer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public stop()V
    .locals 2

    const-string v0, "Producer stop()"

    const/4 v1, 0x0

    .line 134
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 135
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/Producer;->stop:Z

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/service/api/Producer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 138
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/Producer;->produceCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/service/api/Producer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/Producer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
