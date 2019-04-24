.class public Lcom/newrelic/agent/android/TaskQueue;
.super Lcom/newrelic/agent/android/harvest/HarvestAdapter;
.source "TaskQueue.java"


# static fields
.field private static final DEQUEUE_PERIOD_MS:J = 0x3e8L

.field private static dequeueFuture:Ljava/util/concurrent/Future;

.field private static final dequeueTask:Ljava/lang/Runnable;

.field private static final queue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final queueExecutor:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lcom/newrelic/agent/android/util/NamedThreadFactory;

    const-string v1, "TaskQueue"

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/TaskQueue;->queueExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/TaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    new-instance v0, Lcom/newrelic/agent/android/TaskQueue$1;

    invoke-direct {v0}, Lcom/newrelic/agent/android/TaskQueue$1;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/TaskQueue;->dequeueTask:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestAdapter;-><init>()V

    return-void
.end method

.method static synthetic access$000()V
    .locals 0

    .line 23
    invoke-static {}, Lcom/newrelic/agent/android/TaskQueue;->dequeue()V

    return-void
.end method

.method public static backgroundDequeue()V
    .locals 2

    .line 50
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queueExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v1, Lcom/newrelic/agent/android/TaskQueue;->dequeueTask:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static clear()V
    .locals 1

    .line 159
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    return-void
.end method

.method private static dequeue()V
    .locals 2

    .line 94
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 102
    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->setBroadcastNewMeasurements(Z)V

    .line 103
    :cond_1
    :goto_0
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 105
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove()Ljava/lang/Object;

    move-result-object v0

    .line 108
    instance-of v1, v0, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    if-eqz v1, :cond_2

    .line 109
    check-cast v0, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->addActivityTrace(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V

    goto :goto_0

    .line 114
    :cond_2
    instance-of v1, v0, Lcom/newrelic/agent/android/metric/Metric;

    if-eqz v1, :cond_3

    .line 115
    check-cast v0, Lcom/newrelic/agent/android/metric/Metric;

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    goto :goto_0

    .line 120
    :cond_3
    instance-of v1, v0, Lcom/newrelic/agent/android/harvest/AgentHealthException;

    if-eqz v1, :cond_4

    .line 121
    check-cast v0, Lcom/newrelic/agent/android/harvest/AgentHealthException;

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->addAgentHealthException(Lcom/newrelic/agent/android/harvest/AgentHealthException;)V

    goto :goto_0

    .line 126
    :cond_4
    instance-of v1, v0, Lcom/newrelic/agent/android/tracing/Trace;

    if-eqz v1, :cond_5

    .line 127
    check-cast v0, Lcom/newrelic/agent/android/tracing/Trace;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addTracedMethod(Lcom/newrelic/agent/android/tracing/Trace;)V

    goto :goto_0

    .line 132
    :cond_5
    instance-of v1, v0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    if-eqz v1, :cond_1

    .line 133
    check-cast v0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addHttpTransaction(Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 137
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 142
    :cond_6
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->broadcast()V

    const/4 v0, 0x1

    .line 143
    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->setBroadcastNewMeasurements(Z)V

    return-void
.end method

.method public static queue(Ljava/lang/Object;)V
    .locals 1

    .line 43
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static size()I
    .locals 1

    .line 152
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    return v0
.end method

.method public static start()V
    .locals 8

    .line 71
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->dequeueFuture:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    return-void

    .line 74
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/TaskQueue;->queueExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Lcom/newrelic/agent/android/TaskQueue;->dequeueTask:Ljava/lang/Runnable;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x3e8

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/TaskQueue;->dequeueFuture:Ljava/util/concurrent/Future;

    return-void
.end method

.method public static stop()V
    .locals 2

    .line 81
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->dequeueFuture:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 84
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    .line 85
    sput-object v0, Lcom/newrelic/agent/android/TaskQueue;->dequeueFuture:Ljava/util/concurrent/Future;

    return-void
.end method

.method public static synchronousDequeue()V
    .locals 2

    .line 57
    sget-object v0, Lcom/newrelic/agent/android/TaskQueue;->queueExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v1, Lcom/newrelic/agent/android/TaskQueue;->dequeueTask:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 59
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 63
    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    return-void
.end method
