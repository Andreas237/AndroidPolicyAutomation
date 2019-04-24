.class public Lcom/newrelic/agent/android/tracing/TraceMachine;
.super Lcom/newrelic/agent/android/harvest/HarvestAdapter;
.source "TraceMachine.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;
    }
.end annotation


# static fields
.field public static final ACTIVITY_BACKGROUND_METRIC_PREFIX:Ljava/lang/String; = "Mobile/Activity/Background/Name/"

.field public static final ACTIVITY_METRIC_PREFIX:Ljava/lang/String; = "Mobile/Activity/Name/"

.field public static final ACTIVTY_DISPLAY_NAME_PREFIX:Ljava/lang/String; = "Display "

.field public static HEALTHY_TRACE_TIMEOUT:I = 0x0

.field public static final NR_TRACE_FIELD:Ljava/lang/String; = "_nr_trace"

.field public static final NR_TRACE_TYPE:Ljava/lang/String; = "Lcom/newrelic/agent/android/tracing/Trace;"

.field private static final TRACE_MACHINE_LOCK:Ljava/lang/Object;

.field public static UNHEALTHY_TRACE_TIMEOUT:I

.field private static final activityHistory:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/harvest/ActivitySighting;",
            ">;"
        }
    .end annotation
.end field

.field public static final enabled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;

.field private static final threadLocalTrace:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/newrelic/agent/android/tracing/Trace;",
            ">;"
        }
    .end annotation
.end field

.field private static final threadLocalTraceStack:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;",
            ">;"
        }
    .end annotation
.end field

.field private static final traceListeners:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;",
            ">;"
        }
    .end annotation
.end field

.field private static traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

.field private static traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;


# instance fields
.field private activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->enabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 40
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->TRACE_MACHINE_LOCK:Ljava/lang/Object;

    .line 41
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    .line 42
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    .line 43
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    .line 44
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityHistory:Ljava/util/List;

    const/16 v0, 0x1f4

    .line 47
    sput v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->HEALTHY_TRACE_TIMEOUT:I

    const v0, 0xea60

    .line 49
    sput v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->UNHEALTHY_TRACE_TIMEOUT:I

    const/4 v0, 0x0

    .line 50
    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    return-void
.end method

.method protected constructor <init>(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestAdapter;-><init>()V

    .line 61
    new-instance v0, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/tracing/ActivityTrace;-><init>(Lcom/newrelic/agent/android/tracing/Trace;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    .line 64
    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/Harvest;->addHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    return-void
.end method

.method public static addTraceListener(Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;)V
    .locals 1

    .line 72
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static clearActivityHistory()V
    .locals 1

    .line 628
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityHistory:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static endLastActivitySighting()V
    .locals 3

    .line 621
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getLastActivitySighting()Lcom/newrelic/agent/android/harvest/ActivitySighting;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 624
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/ActivitySighting;->end(J)V

    :cond_0
    return-void
.end method

.method public static endTrace()V
    .locals 1

    .line 183
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->completeActivityTrace()V

    return-void
.end method

.method public static endTrace(Ljava/lang/String;)V
    .locals 1

    .line 188
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getActivityTrace()Lcom/newrelic/agent/android/tracing/ActivityTrace;

    move-result-object v0

    iget-object v0, v0, Lcom/newrelic/agent/android/tracing/ActivityTrace;->rootTrace:Lcom/newrelic/agent/android/tracing/Trace;

    iget-object v0, v0, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 189
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->completeActivityTrace()V
    :try_end_0
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/agent/android/tracing/Trace;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 287
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 290
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 291
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    iget-wide v2, v2, Lcom/newrelic/agent/android/tracing/ActivityTrace;->lastUpdatedAt:J

    .line 292
    sget-object v4, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v4, v4, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    iget-wide v4, v4, Lcom/newrelic/agent/android/tracing/ActivityTrace;->startedAt:J

    .line 294
    sget v6, Lcom/newrelic/agent/android/tracing/TraceMachine;->HEALTHY_TRACE_TIMEOUT:I

    int-to-long v6, v6

    add-long/2addr v6, v2

    cmp-long v8, v6, v0

    if-gez v8, :cond_1

    sget-object v6, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v6, v6, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-virtual {v6}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->hasMissingChildren()Z

    move-result v6

    if-nez v6, :cond_1

    .line 295
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p1, "LastUpdated[%d] CurrentTime[%d] Trigger[%d]"

    const/4 p2, 0x3

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, p2, v4

    const/4 v4, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, p2, v4

    const/4 v4, 0x2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, p2, v4

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 296
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Completing activity trace after hitting healthy timeout ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget p2, Lcom/newrelic/agent/android/tracing/TraceMachine;->HEALTHY_TRACE_TIMEOUT:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "ms)"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 297
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->completeActivityTrace()V

    return-void

    .line 301
    :cond_1
    sget v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->UNHEALTHY_TRACE_TIMEOUT:I

    int-to-long v2, v2

    add-long/2addr v4, v2

    cmp-long v2, v4, v0

    if-gez v2, :cond_2

    .line 302
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Completing activity trace after hitting unhealthy timeout ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget p2, Lcom/newrelic/agent/android/tracing/TraceMachine;->UNHEALTHY_TRACE_TIMEOUT:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "ms)"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 303
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->completeActivityTrace()V

    return-void

    .line 307
    :cond_2
    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->loadTraceContext(Lcom/newrelic/agent/android/tracing/Trace;)V

    .line 309
    invoke-static {p1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->registerNewTrace(Ljava/lang/String;)Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object p0

    .line 311
    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->pushTraceContext(Lcom/newrelic/agent/android/tracing/Trace;)V

    .line 313
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentScope()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/tracing/Trace;->scope:Ljava/lang/String;

    .line 315
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/tracing/Trace;->setAnnotationParams(Ljava/util/List;)V

    .line 318
    sget-object p1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;

    .line 319
    invoke-interface {p2}, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;->onEnterMethod()V

    goto :goto_0

    .line 322
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J
    :try_end_0
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 326
    sget-object p1, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p2, "Caught error while calling enterMethod()"

    invoke-interface {p1, p2, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :catch_1
    :goto_1
    return-void
.end method

.method public static enterMethod(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 277
    invoke-static {v0, p0, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public static enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 281
    invoke-static {v0, p0, p1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public static enterNetworkSegment(Ljava/lang/String;)V
    .locals 2

    .line 253
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 258
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object v0

    .line 259
    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Trace;->getType()Lcom/newrelic/agent/android/tracing/TraceType;

    move-result-object v0

    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceType;->NETWORK:Lcom/newrelic/agent/android/tracing/TraceType;

    if-ne v0, v1, :cond_1

    .line 260
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    :cond_1
    const/4 v0, 0x0

    .line 263
    invoke-static {v0, p0, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 265
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object p0

    .line 266
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceType;->NETWORK:Lcom/newrelic/agent/android/tracing/TraceType;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/tracing/Trace;->setType(Lcom/newrelic/agent/android/tracing/TraceType;)V
    :try_end_0
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 270
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Caught error while calling enterNetworkSegment()"

    invoke-interface {v0, v1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 271
    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :catch_1
    :goto_0
    return-void
.end method

.method public static exitMethod()V
    .locals 6

    .line 334
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 337
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/tracing/Trace;

    if-nez v0, :cond_1

    .line 340
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "threadLocalTrace is null"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-void

    .line 345
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    .line 348
    iget-wide v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->threadId:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_2

    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    if-eqz v1, :cond_2

    .line 349
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    invoke-interface {v1}, Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;->getCurrentThreadId()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->threadId:J

    .line 350
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    invoke-interface {v1}, Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;->getCurrentThreadName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->threadName:Ljava/lang/String;

    .line 354
    :cond_2
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;

    .line 355
    invoke-interface {v2}, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;->onExitMethod()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 360
    :cond_3
    :try_start_1
    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Trace;->complete()V
    :try_end_1
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 371
    :try_start_2
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->pop()Ljava/lang/Object;

    .line 375
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->empty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 376
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 378
    :cond_4
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/tracing/Trace;

    .line 379
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 382
    iget-wide v2, v1, Lcom/newrelic/agent/android/tracing/Trace;->childExclusiveTime:J

    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Trace;->getDurationAsMilliseconds()J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, v1, Lcom/newrelic/agent/android/tracing/Trace;->childExclusiveTime:J

    .line 385
    :goto_1
    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Trace;->getType()Lcom/newrelic/agent/android/tracing/TraceType;

    move-result-object v1

    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceType;->TRACE:Lcom/newrelic/agent/android/tracing/TraceType;

    if-ne v1, v2, :cond_6

    .line 386
    invoke-static {v0}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    goto :goto_2

    .line 362
    :catch_0
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 363
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 364
    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Trace;->getType()Lcom/newrelic/agent/android/tracing/TraceType;

    move-result-object v1

    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceType;->TRACE:Lcom/newrelic/agent/android/tracing/TraceType;

    if-ne v1, v2, :cond_5

    .line 365
    invoke-static {v0}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_5
    return-void

    :catch_1
    move-exception v0

    .line 388
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Caught error while calling exitMethod()"

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 389
    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public static formatActivityBackgroundMetricName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mobile/Activity/Background/Name/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatActivityDisplayName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Display "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatActivityMetricName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mobile/Activity/Name/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getActivityHistory()Lcom/newrelic/agent/android/harvest/ActivityHistory;
    .locals 2

    .line 610
    new-instance v0, Lcom/newrelic/agent/android/harvest/ActivityHistory;

    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityHistory:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/harvest/ActivityHistory;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static getActivityTrace()Lcom/newrelic/agent/android/tracing/ActivityTrace;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/tracing/TracingInactiveException;
        }
    .end annotation

    .line 603
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v0, v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 605
    :catch_0
    new-instance v0, Lcom/newrelic/agent/android/tracing/TracingInactiveException;

    invoke-direct {v0}, Lcom/newrelic/agent/android/tracing/TracingInactiveException;-><init>()V

    throw v0
.end method

.method public static getCurrentScope()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 555
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 559
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    if-eqz v1, :cond_2

    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    invoke-interface {v1}, Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;->isUIThread()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 563
    :cond_1
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v1, v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    iget-object v1, v1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->rootTrace:Lcom/newrelic/agent/android/tracing/Trace;

    iget-object v0, v1, Lcom/newrelic/agent/android/tracing/Trace;->metricBackgroundName:Ljava/lang/String;

    return-object v0

    .line 560
    :cond_2
    :goto_0
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v1, v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    iget-object v1, v1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->rootTrace:Lcom/newrelic/agent/android/tracing/Trace;

    iget-object v0, v1, Lcom/newrelic/agent/android/tracing/Trace;->metricName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 565
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "Caught error while calling getCurrentScope()"

    invoke-interface {v2, v3, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 566
    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/tracing/TracingInactiveException;
        }
    .end annotation

    .line 478
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-nez v0, :cond_1

    .line 482
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/tracing/Trace;

    if-eqz v0, :cond_0

    return-object v0

    .line 486
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getRootTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object v0

    return-object v0

    .line 479
    :cond_1
    new-instance v0, Lcom/newrelic/agent/android/tracing/TracingInactiveException;

    invoke-direct {v0}, Lcom/newrelic/agent/android/tracing/TracingInactiveException;-><init>()V

    throw v0
.end method

.method public static getCurrentTraceParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/tracing/TracingInactiveException;
        }
    .end annotation

    .line 491
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Trace;->getParams()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static getLastActivitySighting()Lcom/newrelic/agent/android/harvest/ActivitySighting;
    .locals 2

    .line 614
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityHistory:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 617
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityHistory:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/harvest/ActivitySighting;

    return-object v0
.end method

.method public static getRootTrace()Lcom/newrelic/agent/android/tracing/Trace;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/tracing/TracingInactiveException;
        }
    .end annotation

    .line 595
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v0, v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    iget-object v0, v0, Lcom/newrelic/agent/android/tracing/ActivityTrace;->rootTrace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 597
    :catch_0
    new-instance v0, Lcom/newrelic/agent/android/tracing/TracingInactiveException;

    invoke-direct {v0}, Lcom/newrelic/agent/android/tracing/TracingInactiveException;-><init>()V

    throw v0
.end method

.method public static getTraceMachine()Lcom/newrelic/agent/android/tracing/TraceMachine;
    .locals 1

    .line 68
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    return-object v0
.end method

.method public static haltTracing()V
    .locals 3

    .line 164
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->TRACE_MACHINE_LOCK:Ljava/lang/Object;

    monitor-enter v0

    .line 165
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 166
    monitor-exit v0

    return-void

    .line 168
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    const/4 v2, 0x0

    .line 169
    sput-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    .line 171
    iget-object v2, v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->discard()V

    .line 172
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->endLastActivitySighting()V

    .line 175
    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/Harvest;->removeHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    .line 177
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 178
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 179
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected static isEnabled()Z
    .locals 1

    .line 56
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->enabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->InteractionTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isTracingActive()Z
    .locals 1

    .line 572
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isTracingInactive()Z
    .locals 1

    .line 576
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingActive()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static loadTraceContext(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 3

    .line 409
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 413
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 414
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 416
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    new-instance v2, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-direct {v2, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;-><init>(Lcom/newrelic/agent/android/tracing/TraceMachine$1;)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    if-nez p0, :cond_1

    return-void

    .line 422
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    if-nez p0, :cond_4

    .line 430
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 431
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "No context to load!"

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 432
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {p0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void

    .line 436
    :cond_3
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->peek()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/tracing/Trace;

    .line 437
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 443
    :cond_4
    :goto_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trace "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is now active"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    return-void
.end method

.method private static pushTraceContext(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 2

    .line 394
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p0, :cond_0

    goto :goto_1

    .line 397
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    .line 399
    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->empty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 400
    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 401
    :cond_1
    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->peek()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p0, :cond_2

    .line 402
    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    :cond_2
    :goto_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method private static registerNewTrace(Ljava/lang/String;)Lcom/newrelic/agent/android/tracing/Trace;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/tracing/TracingInactiveException;
        }
    .end annotation

    .line 207
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object v0

    .line 215
    new-instance v1, Lcom/newrelic/agent/android/tracing/Trace;

    iget-object v2, v0, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    sget-object v3, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-direct {v1, p0, v2, v3}, Lcom/newrelic/agent/android/tracing/Trace;-><init>(Ljava/lang/String;Ljava/util/UUID;Lcom/newrelic/agent/android/tracing/TraceMachine;)V

    .line 217
    :try_start_0
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-virtual {v2, v1}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->addTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Registering trace of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " with parent "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, v0, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 224
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/tracing/Trace;->addChild(Lcom/newrelic/agent/android/tracing/Trace;)V

    return-object v1

    .line 219
    :catch_0
    new-instance p0, Lcom/newrelic/agent/android/tracing/TracingInactiveException;

    invoke-direct {p0}, Lcom/newrelic/agent/android/tracing/TracingInactiveException;-><init>()V

    throw p0

    .line 208
    :cond_0
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Tried to register a new trace but tracing is inactive!"

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 209
    new-instance p0, Lcom/newrelic/agent/android/tracing/TracingInactiveException;

    invoke-direct {p0}, Lcom/newrelic/agent/android/tracing/TracingInactiveException;-><init>()V

    throw p0
.end method

.method public static removeTraceListener(Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;)V
    .locals 1

    .line 76
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private static renameActivityHistory(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 547
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityHistory:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/ActivitySighting;

    .line 548
    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/ActivitySighting;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 549
    invoke-virtual {v1, p1}, Lcom/newrelic/agent/android/harvest/ActivitySighting;->setName(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static setCurrentDisplayName(Ljava/lang/String;)V
    .locals 5

    .line 506
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->TRACE_MACHINE_LOCK:Ljava/lang/Object;

    monitor-enter v0

    .line 507
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getTraceMachine()Lcom/newrelic/agent/android/tracing/TraceMachine;

    move-result-object v1

    sput-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    .line 508
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 510
    :try_start_1
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object v1

    iput-object p0, v1, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    .line 511
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;
    :try_end_1
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 513
    :try_start_2
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;->onTraceRename(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 515
    :try_start_3
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot name trace. Tracing is not available: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V
    :try_end_3
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 519
    :catch_1
    :try_start_4
    monitor-exit v0

    return-void

    .line 522
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0
.end method

.method public static setCurrentTraceParam(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 495
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 499
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Trace;->getParams()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    return-void
.end method

.method public static setRootDisplayName(Ljava/lang/String;)V
    .locals 2

    .line 528
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 532
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getRootTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object v0

    .line 533
    iget-object v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    invoke-static {v1, p0}, Lcom/newrelic/agent/android/Measurements;->renameActivity(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    iget-object v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    invoke-static {v1, p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->renameActivityHistory(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->formatActivityMetricName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->metricName:Ljava/lang/String;

    .line 536
    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->formatActivityBackgroundMetricName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->metricBackgroundName:Ljava/lang/String;

    .line 537
    iput-object p0, v0, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    .line 539
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentTrace()Lcom/newrelic/agent/android/tracing/Trace;

    move-result-object p0

    .line 540
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentScope()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->scope:Ljava/lang/String;
    :try_end_0
    .catch Lcom/newrelic/agent/android/tracing/TracingInactiveException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    return-void
.end method

.method public static setTraceMachineInterface(Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;)V
    .locals 0

    .line 80
    sput-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    return-void
.end method

.method public static startTracing(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 84
    invoke-static {p0, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;Z)V

    return-void
.end method

.method public static startTracing(Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 88
    invoke-static {p0, p1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static startTracing(Ljava/lang/String;ZZ)V
    .locals 4

    const/4 v0, 0x0

    .line 94
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 99
    sget-object p2, Lcom/newrelic/agent/android/FeatureFlag;->DefaultInteractions:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {p2}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result p2

    if-nez p2, :cond_1

    return-void

    .line 104
    :cond_1
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->shouldCollectActivityTraces()Z

    move-result p2

    if-nez p2, :cond_2

    return-void

    .line 108
    :cond_2
    sget-object p2, Lcom/newrelic/agent/android/tracing/TraceMachine;->TRACE_MACHINE_LOCK:Ljava/lang/Object;

    monitor-enter p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :try_start_1
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingActive()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 111
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->completeActivityTrace()V

    .line 115
    :cond_3
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 116
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    new-instance v2, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;

    invoke-direct {v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine$TraceStack;-><init>(Lcom/newrelic/agent/android/tracing/TraceMachine$1;)V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 119
    new-instance v1, Lcom/newrelic/agent/android/tracing/Trace;

    invoke-direct {v1}, Lcom/newrelic/agent/android/tracing/Trace;-><init>()V

    if-eqz p1, :cond_4

    .line 121
    iput-object p0, v1, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    goto :goto_0

    .line 123
    :cond_4
    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->formatActivityDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    .line 127
    :goto_0
    iget-object p1, v1, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    invoke-static {p1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->formatActivityMetricName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/newrelic/agent/android/tracing/Trace;->metricName:Ljava/lang/String;

    .line 128
    iget-object p1, v1, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    invoke-static {p1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->formatActivityBackgroundMetricName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/newrelic/agent/android/tracing/Trace;->metricBackgroundName:Ljava/lang/String;

    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    .line 132
    sget-object p1, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Started trace of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, v1, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 134
    new-instance p0, Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;-><init>(Lcom/newrelic/agent/android/tracing/Trace;)V

    sput-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    .line 135
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iput-object p0, v1, Lcom/newrelic/agent/android/tracing/Trace;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    .line 138
    invoke-static {v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->pushTraceContext(Lcom/newrelic/agent/android/tracing/Trace;)V

    .line 141
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object p0, p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getLastActivitySighting()Lcom/newrelic/agent/android/harvest/ActivitySighting;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/tracing/ActivityTrace;->previousActivity:Lcom/newrelic/agent/android/harvest/ActivitySighting;

    .line 142
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityHistory:Ljava/util/List;

    new-instance p1, Lcom/newrelic/agent/android/harvest/ActivitySighting;

    iget-wide v2, v1, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    iget-object v1, v1, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    invoke-direct {p1, v2, v3, v1}, Lcom/newrelic/agent/android/harvest/ActivitySighting;-><init>(JLjava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;

    .line 145
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v1, v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-interface {p1, v1}, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;->onTraceStart(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V

    goto :goto_1

    .line 147
    :cond_5
    monitor-exit p2

    goto :goto_2

    :catchall_0
    move-exception p0

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    .line 149
    sget-object p1, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p2, "Caught error while initializing TraceMachine, shutting it down"

    invoke-interface {p1, p2, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    .line 153
    sput-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    .line 154
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 155
    sget-object p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    :goto_2
    return-void
.end method

.method public static unloadTraceContext(Ljava/lang/Object;)V
    .locals 3

    .line 451
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 454
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachineInterface:Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;

    invoke-interface {v0}, Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;->isUIThread()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 457
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 458
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trace "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/tracing/Trace;

    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is now inactive"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 460
    :cond_2
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTrace:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 461
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->threadLocalTraceStack:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 465
    :try_start_1
    check-cast p0, Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;

    const/4 v0, 0x0

    .line 466
    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;->_nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_2
    const-string v0, "TraceFieldInterface"

    .line 468
    invoke-static {p0, v0}, Lcom/newrelic/agent/android/util/ExceptionHelper;->recordSupportabilityMetric(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 469
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not a TraceFieldInterface: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p0

    .line 472
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Caught error while calling unloadTraceContext()"

    invoke-interface {v0, v1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 473
    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected completeActivityTrace()V
    .locals 5

    .line 233
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->TRACE_MACHINE_LOCK:Ljava/lang/Object;

    monitor-enter v0

    .line 234
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 235
    monitor-exit v0

    return-void

    .line 237
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    const/4 v2, 0x0

    .line 238
    sput-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    .line 240
    iget-object v2, v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->complete()V

    .line 241
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->endLastActivitySighting()V

    .line 243
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceListeners:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;

    .line 244
    iget-object v4, v1, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-interface {v3, v4}, Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;->onTraceComplete(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V

    goto :goto_0

    .line 247
    :cond_1
    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/Harvest;->removeHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    .line 248
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onHarvestBefore()V
    .locals 8

    .line 633
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingActive()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 634
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 635
    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    iget-wide v2, v2, Lcom/newrelic/agent/android/tracing/ActivityTrace;->lastUpdatedAt:J

    .line 636
    sget-object v4, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v4, v4, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    iget-wide v4, v4, Lcom/newrelic/agent/android/tracing/ActivityTrace;->startedAt:J

    .line 638
    sget v6, Lcom/newrelic/agent/android/tracing/TraceMachine;->HEALTHY_TRACE_TIMEOUT:I

    int-to-long v6, v6

    add-long/2addr v2, v6

    cmp-long v6, v2, v0

    if-gez v6, :cond_0

    sget-object v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->hasMissingChildren()Z

    move-result v2

    if-nez v2, :cond_0

    .line 639
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Completing activity trace after hitting healthy timeout ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->HEALTHY_TRACE_TIMEOUT:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "ms)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 640
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->completeActivityTrace()V

    .line 641
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v0

    const-string v1, "Supportability/AgentHealth/HealthyActivityTraces"

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    return-void

    .line 645
    :cond_0
    sget v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->UNHEALTHY_TRACE_TIMEOUT:I

    int-to-long v2, v2

    add-long/2addr v4, v2

    cmp-long v2, v4, v0

    if-gez v2, :cond_2

    .line 646
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Completing activity trace after hitting unhealthy timeout ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lcom/newrelic/agent/android/tracing/TraceMachine;->UNHEALTHY_TRACE_TIMEOUT:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "ms)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 647
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->completeActivityTrace()V

    .line 648
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v0

    const-string v1, "Supportability/AgentHealth/UnhealthyActivityTraces"

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    return-void

    .line 652
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "TraceMachine is inactive"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public onHarvestSendFailed()V
    .locals 1

    .line 659
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    iget-object v0, v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->incrementReportAttemptCount()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public storeCompletedTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 2

    .line 581
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->isTracingInactive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 582
    sget-object p1, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Attempted to store a completed trace with no trace machine!"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-void

    .line 586
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/TraceMachine;->activityTrace:Lcom/newrelic/agent/android/tracing/ActivityTrace;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->addCompletedTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 588
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceMachine;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Caught error while calling storeCompletedTrace()"

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 589
    invoke-static {p1}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
