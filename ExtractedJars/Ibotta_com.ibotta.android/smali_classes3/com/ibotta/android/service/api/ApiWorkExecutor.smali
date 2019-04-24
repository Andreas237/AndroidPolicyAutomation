.class public Lcom/ibotta/android/service/api/ApiWorkExecutor;
.super Ljava/lang/Object;
.source "ApiWorkExecutor.java"

# interfaces
.implements Lcom/ibotta/android/service/api/Consumer$ConsumerListener;


# static fields
.field private static final WAIT_DELAY:J


# instance fields
.field private final asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

.field private consumer:Lcom/ibotta/android/service/api/Consumer;

.field private final consumerFactory:Lcom/ibotta/android/service/api/ConsumerFactory;

.field private final execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

.field private final jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private producer:Lcom/ibotta/android/service/api/Producer;

.field private final producerFactory:Lcom/ibotta/android/service/api/ProducerFactory;

.field private running:Z

.field private final serviceLock:Ljava/util/concurrent/locks/Lock;

.field private final waitCondition:Ljava/util/concurrent/locks/Condition;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 25
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->WAIT_DELAY:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/service/api/ConsumerFactory;Lcom/ibotta/android/service/api/ProducerFactory;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->consumerFactory:Lcom/ibotta/android/service/api/ConsumerFactory;

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->producerFactory:Lcom/ibotta/android/service/api/ProducerFactory;

    .line 49
    iput-object p3, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    .line 50
    iput-object p4, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->waitCondition:Ljava/util/concurrent/locks/Condition;

    .line 51
    iput-object p5, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 52
    iput-object p6, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    return-void
.end method

.method private tryToStart()Z
    .locals 4

    const-string v0, "tryToStart"

    const/4 v1, 0x0

    .line 129
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 134
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const-string v0, "tryToStart: starting Consumer and Producer"

    .line 135
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iput-boolean v2, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/ExecServiceManager;->start()Z

    const-string v0, "Creating new Consumer"

    .line 141
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->consumerFactory:Lcom/ibotta/android/service/api/ConsumerFactory;

    iget-object v3, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v3, p0}, Lcom/ibotta/android/service/api/ConsumerFactory;->createConsumer(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/Consumer$ConsumerListener;)Lcom/ibotta/android/service/api/Consumer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->consumer:Lcom/ibotta/android/service/api/Consumer;

    const-string v0, "Creating new Producer"

    .line 144
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->producerFactory:Lcom/ibotta/android/service/api/ProducerFactory;

    iget-object v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v3, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->consumer:Lcom/ibotta/android/service/api/Consumer;

    invoke-virtual {v0, v1, v3}, Lcom/ibotta/android/service/api/ProducerFactory;->createProducer(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/Consumer;)Lcom/ibotta/android/service/api/Producer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->producer:Lcom/ibotta/android/service/api/Producer;

    .line 146
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->producer:Lcom/ibotta/android/service/api/Producer;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "tryToStart: already running."

    .line 148
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->wakeUpLoop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private waitForMoreWork()V
    .locals 5

    const-string v0, "waitForMoreWork: No jobs to consume right now. Waiting for more work..."

    const/4 v1, 0x0

    .line 170
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 174
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->waitCondition:Ljava/util/concurrent/locks/Condition;

    sget-wide v2, Lcom/ibotta/android/service/api/ApiWorkExecutor;->WAIT_DELAY:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    const-string v0, "waitForMoreWork: Finished waiting for more work."

    .line 175
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    const-string v2, "waitForMoreWork: Interrupted while pausing for more work."

    .line 177
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private wakeUpLoop()V
    .locals 2

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    const-string v0, "wakeUpLoop: signalling to wake up"

    const/4 v1, 0x0

    .line 162
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public onCriticalFailure()V
    .locals 2

    const-string v0, "onCriticalFailure"

    const/4 v1, 0x0

    .line 218
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tearDown()V

    return-void
.end method

.method protected start()Z
    .locals 3

    const-string v0, "start"

    const/4 v1, 0x0

    .line 62
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tryToStart()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const-string v0, "All ApiJobs executed. FINISHED."

    .line 115
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tearDown()V

    return v1

    .line 72
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    if-nez v0, :cond_1

    const-string v0, "Exiting loop because a stop was detected."

    .line 74
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v0, "Consuming jobs..."

    .line 78
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->consumer:Lcom/ibotta/android/service/api/Consumer;

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/Consumer;->isStopped()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/Consumer;->consume()Z

    move-result v0

    if-nez v0, :cond_0

    .line 90
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    if-nez v0, :cond_2

    const-string v0, "Exiting loop because a stop was detected."

    .line 92
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 97
    :cond_2
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->waitForMoreWork()V

    .line 100
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    if-nez v0, :cond_3

    const-string v0, "Exiting loop because a stop was detected."

    .line 102
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 107
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/AsyncGroupManager;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "No more work pending. Stopping service."

    .line 108
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tearDown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const-string v0, "All ApiJobs executed. FINISHED."

    .line 115
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tearDown()V

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    .line 115
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "All ApiJobs executed. FINISHED."

    invoke-static {v2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tearDown()V

    throw v0
.end method

.method public tearDown()V
    .locals 4

    const-string v0, "tearDown: started..."

    const/4 v1, 0x0

    .line 184
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 187
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    if-nez v0, :cond_0

    const-string v0, "tearDown: Tear down already occurred."

    .line 188
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/AsyncGroupManager;->clear()V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 208
    iput-boolean v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    const-string v0, "tearDown: Stopping Producer"

    .line 192
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->producer:Lcom/ibotta/android/service/api/Producer;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/Producer;->stop()V

    const/4 v0, 0x0

    .line 194
    iput-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->producer:Lcom/ibotta/android/service/api/Producer;

    const-string v2, "tearDown: Stopping Consumer"

    .line 196
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v2, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->consumer:Lcom/ibotta/android/service/api/Consumer;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/Consumer;->stop()V

    .line 198
    iput-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->consumer:Lcom/ibotta/android/service/api/Consumer;

    const-string v0, "tearDown: Stopping ExecServiceManager"

    .line 200
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/ExecServiceManager;->stop()V

    .line 204
    invoke-direct {p0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->wakeUpLoop()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/AsyncGroupManager;->clear()V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 208
    iput-boolean v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "tearDown: finished"

    .line 213
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    .line 206
    iget-object v2, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/AsyncGroupManager;->clear()V

    .line 207
    iget-object v2, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 208
    iput-boolean v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->running:Z

    .line 210
    iget-object v1, p0, Lcom/ibotta/android/service/api/ApiWorkExecutor;->serviceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
