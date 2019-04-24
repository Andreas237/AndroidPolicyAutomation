.class public Lcom/newrelic/agent/android/payload/PayloadController;
.super Ljava/lang/Object;
.source "PayloadController.java"

# interfaces
.implements Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;
    }
.end annotation


# static fields
.field public static final PAYLOAD_COLLECTOR_TIMEOUT:J = 0xbb8L

.field public static final PAYLOAD_REQUEUE_PERIOD_MS:J = 0x1d4c0L

.field protected static final dequeueRunnable:Ljava/lang/Runnable;

.field protected static instance:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/newrelic/agent/android/payload/PayloadController;",
            ">;"
        }
    .end annotation
.end field

.field protected static final log:Lcom/newrelic/agent/android/logging/AgentLog;

.field protected static opportunisticUploads:Z

.field protected static payloadQueueLock:Ljava/util/concurrent/locks/Lock;

.field protected static payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/newrelic/agent/android/payload/PayloadReaper;",
            ">;"
        }
    .end annotation
.end field

.field protected static payloadReaperRetryQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/newrelic/agent/android/payload/PayloadReaper;",
            ">;"
        }
    .end annotation
.end field

.field protected static queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

.field protected static reapersInFlight:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Future;",
            ">;"
        }
    .end annotation
.end field

.field protected static requeueFuture:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field protected static final requeueRunnable:Ljava/lang/Runnable;


# instance fields
.field private final agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 32
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 37
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadQueueLock:Ljava/util/concurrent/locks/Lock;

    .line 38
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    sput-object v2, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    .line 40
    sput-object v2, Lcom/newrelic/agent/android/payload/PayloadController;->requeueFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 41
    sput-object v2, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 42
    sput-object v2, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperRetryQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 43
    sput-object v2, Lcom/newrelic/agent/android/payload/PayloadController;->reapersInFlight:Ljava/util/Map;

    .line 44
    sput-boolean v1, Lcom/newrelic/agent/android/payload/PayloadController;->opportunisticUploads:Z

    .line 46
    new-instance v0, Lcom/newrelic/agent/android/payload/PayloadController$1;

    invoke-direct {v0}, Lcom/newrelic/agent/android/payload/PayloadController$1;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->dequeueRunnable:Ljava/lang/Runnable;

    .line 55
    new-instance v0, Lcom/newrelic/agent/android/payload/PayloadController$2;

    invoke-direct {v0}, Lcom/newrelic/agent/android/payload/PayloadController$2;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->requeueRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method protected constructor <init>(Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    iput-object p1, p0, Lcom/newrelic/agent/android/payload/PayloadController;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    return-void
.end method

.method static synthetic access$000(Lcom/newrelic/agent/android/payload/PayloadController;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/newrelic/agent/android/payload/PayloadController;->dequeuePayloadSenders()V

    return-void
.end method

.method static synthetic access$100(Lcom/newrelic/agent/android/payload/PayloadController;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/newrelic/agent/android/payload/PayloadController;->requeuePayloadSenders()V

    return-void
.end method

.method private final dequeuePayloadSenders()V
    .locals 4

    .line 219
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadQueueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 221
    :cond_0
    :goto_0
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 222
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/payload/PayloadReaper;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 225
    :try_start_1
    invoke-static {v0}, Lcom/newrelic/agent/android/payload/PayloadController;->submitPayload(Lcom/newrelic/agent/android/payload/PayloadReaper;)Ljava/util/concurrent/Future;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 227
    :try_start_2
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PayloadController.dequeuePayloadSenders(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 233
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadQueueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->payloadQueueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method public static initialize(Lcom/newrelic/agent/android/AgentConfiguration;)Lcom/newrelic/agent/android/payload/PayloadController;
    .locals 11

    .line 68
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/newrelic/agent/android/payload/PayloadController;

    invoke-direct {v1, p0}, Lcom/newrelic/agent/android/payload/PayloadController;-><init>(Lcom/newrelic/agent/android/AgentConfiguration;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 71
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperRetryQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 72
    new-instance v0, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/AgentConfiguration;->getIOThreadSize()I

    move-result v1

    new-instance v2, Lcom/newrelic/agent/android/util/NamedThreadFactory;

    const-string v3, "NR-PayloadWorker"

    invoke-direct {v2, v3}, Lcom/newrelic/agent/android/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    .line 73
    sget-object v4, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    sget-object v5, Lcom/newrelic/agent/android/payload/PayloadController;->requeueRunnable:Ljava/lang/Runnable;

    const-wide/32 v6, 0x1d4c0

    const-wide/32 v8, 0x1d4c0

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v4 .. v10}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->requeueFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 74
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->reapersInFlight:Ljava/util/Map;

    const/4 v0, 0x0

    .line 75
    sput-boolean v0, Lcom/newrelic/agent/android/payload/PayloadController;->opportunisticUploads:Z

    .line 77
    invoke-static {p0}, Lcom/newrelic/agent/android/crash/CrashReporter;->initialize(Lcom/newrelic/agent/android/AgentConfiguration;)Lcom/newrelic/agent/android/crash/CrashReporter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Lcom/newrelic/agent/android/crash/CrashReporter;->start()V

    goto :goto_0

    .line 81
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "PayloadController.initialize: No crash reporter - crash reporting will be disabled"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    .line 84
    :goto_0
    invoke-static {p0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->initialize(Lcom/newrelic/agent/android/AgentConfiguration;)Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 86
    invoke-virtual {p0}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->start()V

    goto :goto_1

    .line 88
    :cond_1
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "PayloadController.initialize: No payload reporter - payload reporting will be disabled"

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    .line 91
    :goto_1
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/Harvest;->addHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    .line 94
    :cond_2
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/payload/PayloadController;

    return-object p0
.end method

.method public static isInitialized()Z
    .locals 1

    .line 210
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static payloadInFlight(Lcom/newrelic/agent/android/payload/Payload;)Z
    .locals 1

    .line 307
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->reapersInFlight:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/payload/Payload;->getUuid()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private requeuePayloadSenders()V
    .locals 4

    .line 239
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadQueueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 241
    :cond_0
    :goto_0
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperRetryQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 242
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperRetryQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/payload/PayloadReaper;

    if-eqz v0, :cond_0

    .line 244
    iget-object v1, v0, Lcom/newrelic/agent/android/payload/PayloadReaper;->sender:Lcom/newrelic/agent/android/payload/PayloadSender;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/payload/PayloadSender;->getPayload()Lcom/newrelic/agent/android/payload/Payload;

    move-result-object v1

    iget-object v2, p0, Lcom/newrelic/agent/android/payload/PayloadController;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/AgentConfiguration;->getPayloadTTL()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/newrelic/agent/android/payload/Payload;->isStale(J)Z

    move-result v1

    if-nez v1, :cond_1

    .line 245
    invoke-static {v0}, Lcom/newrelic/agent/android/payload/PayloadController;->submitPayload(Lcom/newrelic/agent/android/payload/PayloadReaper;)Ljava/util/concurrent/Future;

    goto :goto_0

    .line 247
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "PayloadController.requeuePayloadSenders: Will not re-queue stale payload."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 252
    :cond_2
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadQueueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->payloadQueueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_3
    :goto_1
    return-void
.end method

.method public static shouldUploadOpportunistically()Z
    .locals 1

    .line 202
    sget-boolean v0, Lcom/newrelic/agent/android/payload/PayloadController;->opportunisticUploads:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/newrelic/agent/android/Agent;->hasReachableNetworkConnection(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static shutdown()V
    .locals 5

    .line 98
    invoke-static {}, Lcom/newrelic/agent/android/payload/PayloadController;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 100
    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/Harvest;->removeHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    .line 102
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->requeueFuture:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    .line 103
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->requeueFuture:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 104
    sput-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->requeueFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 108
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    :try_start_1
    invoke-static {}, Lcom/newrelic/agent/android/crash/CrashReporter;->shutdown()V

    .line 114
    invoke-static {}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->shutdown()V

    .line 116
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    const-wide/16 v2, 0xbb8

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 117
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "PayloadController.shutdown: upload thread(s) timed-out before handler"

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    .line 118
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    :catch_0
    :cond_1
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    throw v1

    :cond_2
    :goto_0
    return-void
.end method

.method public static submitCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1

    .line 206
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method protected static submitPayload(Lcom/newrelic/agent/android/payload/PayloadReaper;)Ljava/util/concurrent/Future;
    .locals 4

    .line 181
    invoke-static {}, Lcom/newrelic/agent/android/payload/PayloadController;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 186
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperRetryQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 188
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->reapersInFlight:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/payload/PayloadReaper;->getUuid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    .line 190
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PayloadController.submitPayload: ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/payload/PayloadReaper;->getUuid()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] is already in progress."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    goto :goto_0

    .line 192
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 193
    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->reapersInFlight:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/payload/PayloadReaper;->getUuid()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static submitPayload(Lcom/newrelic/agent/android/payload/PayloadSender;)Ljava/util/concurrent/Future;
    .locals 1

    const/4 v0, 0x0

    .line 131
    invoke-static {p0, v0}, Lcom/newrelic/agent/android/payload/PayloadController;->submitPayload(Lcom/newrelic/agent/android/payload/PayloadSender;Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method public static submitPayload(Lcom/newrelic/agent/android/payload/PayloadSender;Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;)Ljava/util/concurrent/Future;
    .locals 5

    .line 136
    new-instance v0, Lcom/newrelic/agent/android/stats/TicToc;

    invoke-direct {v0}, Lcom/newrelic/agent/android/stats/TicToc;-><init>()V

    .line 138
    invoke-static {}, Lcom/newrelic/agent/android/payload/PayloadController;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 139
    invoke-virtual {v0}, Lcom/newrelic/agent/android/stats/TicToc;->tic()V

    .line 141
    new-instance v1, Lcom/newrelic/agent/android/payload/PayloadController$3;

    invoke-direct {v1, p0, p1}, Lcom/newrelic/agent/android/payload/PayloadController$3;-><init>(Lcom/newrelic/agent/android/payload/PayloadSender;Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;)V

    .line 157
    sget-object p1, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 158
    sget-object p1, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperRetryQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 160
    sget-object p1, Lcom/newrelic/agent/android/payload/PayloadController;->reapersInFlight:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/payload/PayloadReaper;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Future;

    if-eqz p1, :cond_0

    .line 162
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PayloadController.submitPayload: ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/payload/PayloadReaper;->getUuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] is already in progress."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    goto :goto_1

    .line 164
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/payload/PayloadSender;->shouldUploadOpportunistically()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 165
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 166
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->reapersInFlight:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/payload/PayloadReaper;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 169
    :cond_1
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->payloadReaperQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 171
    :goto_0
    sget-object p0, Lcom/newrelic/agent/android/payload/PayloadController;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PayloadController.submitPayload: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/stats/TicToc;->toc()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ms. waiting to submit payload ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/payload/PayloadReaper;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method


# virtual methods
.method public onHarvest()V
    .locals 2

    .line 279
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->queueExecutor:Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;

    sget-object v1, Lcom/newrelic/agent/android/payload/PayloadController;->dequeueRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/payload/PayloadController$ThrottledScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public onHarvestBefore()V
    .locals 0

    return-void
.end method

.method public onHarvestComplete()V
    .locals 0

    return-void
.end method

.method public onHarvestConnected()V
    .locals 0

    return-void
.end method

.method public onHarvestDisabled()V
    .locals 0

    return-void
.end method

.method public onHarvestDisconnected()V
    .locals 0

    return-void
.end method

.method public onHarvestError()V
    .locals 0

    return-void
.end method

.method public onHarvestFinalize()V
    .locals 0

    return-void
.end method

.method public onHarvestSendFailed()V
    .locals 0

    return-void
.end method

.method public onHarvestStart()V
    .locals 0

    return-void
.end method

.method public onHarvestStop()V
    .locals 0

    return-void
.end method

.method protected uploadOpportunistically()Z
    .locals 1

    .line 258
    sget-boolean v0, Lcom/newrelic/agent/android/payload/PayloadController;->opportunisticUploads:Z

    return v0
.end method
