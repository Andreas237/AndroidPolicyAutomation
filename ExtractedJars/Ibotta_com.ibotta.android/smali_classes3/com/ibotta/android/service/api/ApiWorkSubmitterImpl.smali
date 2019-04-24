.class public Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;
.super Ljava/lang/Object;
.source "ApiWorkSubmitterImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/api/ApiWorkSubmitter;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

.field private final context:Landroid/content/Context;

.field private final execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

.field private final handler:Landroid/os/Handler;

.field private final prodConLock:Ljava/util/concurrent/locks/Lock;

.field private final produceCondition:Ljava/util/concurrent/locks/Condition;

.field private final serviceLock:Ljava/util/concurrent/locks/Lock;

.field private final startExecutor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/AsyncGroupManager;Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/service/api/ExecServiceManager;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 46
    iput-object p2, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->context:Landroid/content/Context;

    .line 47
    iput-object p3, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->handler:Landroid/os/Handler;

    .line 48
    iput-object p4, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->serviceLock:Ljava/util/concurrent/locks/Lock;

    .line 49
    iput-object p5, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->prodConLock:Ljava/util/concurrent/locks/Lock;

    .line 50
    iput-object p6, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->produceCondition:Ljava/util/concurrent/locks/Condition;

    .line 51
    iput-object p7, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 52
    iput-object p8, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->startExecutor:Ljava/util/concurrent/ExecutorService;

    .line 53
    iput-object p9, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    return-void
.end method

.method public static synthetic lambda$start$1(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/ibotta/android/service/api/ApiWorkServiceFacade;->start(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic lambda$submit$0(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;Ljava/util/Collection;)V
    .locals 3

    const-string v0, "AsyncTask - submitApiJob Attaching jobs to AsyncGroup"

    const/4 v1, 0x0

    .line 72
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/service/api/AsyncGroupManager;->attachToGroups(Ljava/util/Collection;)V

    const-string p1, "AsyncTask - submitApiJob Calling start()"

    .line 74
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->start()V

    const-string p1, "AsyncTask - submitApiJob FINISHED"

    .line 76
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private start()V
    .locals 4

    const-string v0, "start"

    const/4 v1, 0x0

    .line 83
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "serviceLock: waiting"

    .line 84
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "serviceLock: acquired"

    .line 86
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/ExecServiceManager;->start()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Enqueueing work to start service."

    .line 90
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$wJ-W7Fz6Du70jQEzpaXtwhxbmy8;

    invoke-direct {v2, p0}, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$wJ-W7Fz6Du70jQEzpaXtwhxbmy8;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    const-string v0, "Service is already working."

    .line 96
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "prodConLock: waiting"

    .line 97
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "prodConLock: acquired"

    .line 99
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 102
    :try_start_1
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->produceCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    :try_start_2
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "prodConLock: released"

    .line 105
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 109
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "serviceLock: released"

    .line 110
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    .line 104
    :try_start_3
    iget-object v2, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v2, "prodConLock: released"

    .line 105
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 109
    iget-object v2, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 110
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceLock: released"

    invoke-static {v2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public submit(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 2

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->submit(Ljava/util/Collection;)V

    return-void
.end method

.method public submit(Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;)V"
        }
    .end annotation

    const-string v0, "submitApiJob: %1$d jobs"

    const/4 v1, 0x1

    .line 65
    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->startExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$WwOCX6wrSoRaxYSB4HYViqCSmE8;

    invoke-direct {v5, p0, p1}, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$WwOCX6wrSoRaxYSB4HYViqCSmE8;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;Ljava/util/Collection;)V

    invoke-interface {v0, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    const-string p1, "Submission took: %1$s ms"

    .line 79
    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v5

    sub-long/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
