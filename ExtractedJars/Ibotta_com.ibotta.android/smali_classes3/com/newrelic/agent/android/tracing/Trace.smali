.class public Lcom/newrelic/agent/android/tracing/Trace;
.super Ljava/lang/Object;
.source "Trace.java"


# static fields
.field private static final CATEGORY_PARAMETER:Ljava/lang/String; = "category"

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field public childExclusiveTime:J

.field private volatile children:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field public displayName:Ljava/lang/String;

.field public entryTimestamp:J

.field public exclusiveTime:J

.field public exitTimestamp:J

.field private isComplete:Z

.field public metricBackgroundName:Ljava/lang/String;

.field public metricName:Ljava/lang/String;

.field public final myUUID:Ljava/util/UUID;

.field private volatile params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final parentUUID:Ljava/util/UUID;

.field private rawAnnotationParams:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public scope:Ljava/lang/String;

.field public threadId:J

.field public threadName:Ljava/lang/String;

.field public traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

.field private type:Lcom/newrelic/agent/android/tracing/TraceType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/tracing/Trace;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/UUID;

    invoke-static {}, Lcom/newrelic/agent/android/util/Util;->getRandom()Ljava/util/Random;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    move-result-wide v1

    invoke-static {}, Lcom/newrelic/agent/android/util/Util;->getRandom()Ljava/util/Random;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Random;->nextLong()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    const-wide/16 v0, 0x0

    .line 22
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    .line 23
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    .line 24
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exclusiveTime:J

    .line 25
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->childExclusiveTime:J

    .line 32
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->threadId:J

    const-string v0, "main"

    .line 35
    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->threadName:Ljava/lang/String;

    .line 42
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceType;->TRACE:Lcom/newrelic/agent/android/tracing/TraceType;

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->type:Lcom/newrelic/agent/android/tracing/TraceType;

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->isComplete:Z

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->parentUUID:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/UUID;Lcom/newrelic/agent/android/tracing/TraceMachine;)V
    .locals 5

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/UUID;

    invoke-static {}, Lcom/newrelic/agent/android/util/Util;->getRandom()Ljava/util/Random;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    move-result-wide v1

    invoke-static {}, Lcom/newrelic/agent/android/util/Util;->getRandom()Ljava/util/Random;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Random;->nextLong()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    const-wide/16 v0, 0x0

    .line 22
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    .line 23
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    .line 24
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exclusiveTime:J

    .line 25
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->childExclusiveTime:J

    .line 32
    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->threadId:J

    const-string v0, "main"

    .line 35
    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->threadName:Ljava/lang/String;

    .line 42
    sget-object v0, Lcom/newrelic/agent/android/tracing/TraceType;->TRACE:Lcom/newrelic/agent/android/tracing/TraceType;

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->type:Lcom/newrelic/agent/android/tracing/TraceType;

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->isComplete:Z

    .line 52
    iput-object p1, p0, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    .line 53
    iput-object p2, p0, Lcom/newrelic/agent/android/tracing/Trace;->parentUUID:Ljava/util/UUID;

    .line 54
    iput-object p3, p0, Lcom/newrelic/agent/android/tracing/Trace;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    return-void
.end method

.method private static createParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    const/4 p0, 0x0

    .line 179
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    const-class v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    if-ne v0, p1, :cond_0

    .line 187
    invoke-static {p2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object p0

    return-object p0

    .line 190
    :cond_0
    const-class v0, Ljava/lang/String;

    if-ne v0, p1, :cond_1

    return-object p2

    :cond_1
    return-object p0

    :catch_0
    move-exception p1

    .line 181
    sget-object p2, Lcom/newrelic/agent/android/tracing/Trace;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to resolve parameter class in enterMethod: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p0
.end method


# virtual methods
.method public addChild(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 60
    monitor-enter p0

    .line 61
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    .line 63
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 66
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    iget-object p1, p1, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public complete()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/tracing/TracingInactiveException;
        }
    .end annotation

    .line 123
    iget-boolean v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->isComplete:Z

    if-eqz v0, :cond_0

    .line 124
    sget-object v0, Lcom/newrelic/agent/android/tracing/Trace;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempted to double complete trace "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/tracing/Trace;->myUUID:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    return-void

    .line 129
    :cond_0
    iget-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    .line 132
    :cond_1
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/Trace;->getDurationAsMilliseconds()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/newrelic/agent/android/tracing/Trace;->childExclusiveTime:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exclusiveTime:J

    const/4 v0, 0x1

    .line 134
    iput-boolean v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->isComplete:Z

    .line 137
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->traceMachine:Lcom/newrelic/agent/android/tracing/TraceMachine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->storeCompletedTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 139
    :catch_0
    new-instance v0, Lcom/newrelic/agent/android/tracing/TracingInactiveException;

    invoke-direct {v0}, Lcom/newrelic/agent/android/tracing/TracingInactiveException;-><init>()V

    throw v0
.end method

.method public getAnnotationParams()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 97
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 99
    iget-object v1, p0, Lcom/newrelic/agent/android/tracing/Trace;->rawAnnotationParams:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 100
    iget-object v1, p0, Lcom/newrelic/agent/android/tracing/Trace;->rawAnnotationParams:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 102
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 105
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 108
    invoke-static {v2, v3, v4}, Lcom/newrelic/agent/android/tracing/Trace;->createParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 110
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;
    .locals 3

    .line 165
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/Trace;->getAnnotationParams()Ljava/util/Map;

    move-result-object v0

    const-string v1, "category"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 167
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/Trace;->getAnnotationParams()Ljava/util/Map;

    move-result-object v0

    const-string v2, "category"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 168
    instance-of v2, v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    if-nez v2, :cond_1

    .line 169
    sget-object v0, Lcom/newrelic/agent/android/tracing/Trace;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Category annotation parameter is not of type MetricCategory"

    invoke-interface {v0, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-object v1

    .line 172
    :cond_1
    check-cast v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    return-object v0
.end method

.method public getChildren()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 72
    monitor-enter p0

    .line 73
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 74
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    .line 75
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 77
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->children:Ljava/util/Set;

    return-object v0
.end method

.method public getDurationAsMilliseconds()J
    .locals 4

    .line 157
    iget-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    iget-wide v2, p0, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public getDurationAsSeconds()F
    .locals 4

    .line 161
    iget-wide v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    iget-wide v2, p0, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public getParams()Ljava/util/Map;
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

    .line 82
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->params:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 83
    monitor-enter p0

    .line 84
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->params:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 85
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->params:Ljava/util/Map;

    .line 86
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 89
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getType()Lcom/newrelic/agent/android/tracing/TraceType;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->type:Lcom/newrelic/agent/android/tracing/TraceType;

    return-object v0
.end method

.method public isComplete()Z
    .locals 1

    .line 119
    iget-boolean v0, p0, Lcom/newrelic/agent/android/tracing/Trace;->isComplete:Z

    return v0
.end method

.method public prepareForSerialization()V
    .locals 3

    .line 145
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/Trace;->getParams()Ljava/util/Map;

    move-result-object v0

    const-string v1, "type"

    iget-object v2, p0, Lcom/newrelic/agent/android/tracing/Trace;->type:Lcom/newrelic/agent/android/tracing/TraceType;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/tracing/TraceType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setAnnotationParams(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 93
    iput-object p1, p0, Lcom/newrelic/agent/android/tracing/Trace;->rawAnnotationParams:Ljava/util/List;

    return-void
.end method

.method public setType(Lcom/newrelic/agent/android/tracing/TraceType;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/newrelic/agent/android/tracing/Trace;->type:Lcom/newrelic/agent/android/tracing/TraceType;

    return-void
.end method
