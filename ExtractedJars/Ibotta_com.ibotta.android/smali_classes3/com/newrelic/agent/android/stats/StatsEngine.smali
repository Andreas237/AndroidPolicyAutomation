.class public Lcom/newrelic/agent/android/stats/StatsEngine;
.super Lcom/newrelic/agent/android/harvest/HarvestAdapter;
.source "StatsEngine.java"


# static fields
.field public static final INSTANCE:Lcom/newrelic/agent/android/stats/StatsEngine;


# instance fields
.field public enabled:Z

.field private statsMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lcom/newrelic/agent/android/stats/StatsEngine;

    invoke-direct {v0}, Lcom/newrelic/agent/android/stats/StatsEngine;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/stats/StatsEngine;->INSTANCE:Lcom/newrelic/agent/android/stats/StatsEngine;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestAdapter;-><init>()V

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/newrelic/agent/android/stats/StatsEngine;->enabled:Z

    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/stats/StatsEngine;->statsMap:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static declared-synchronized disable()V
    .locals 3

    const-class v0, Lcom/newrelic/agent/android/stats/StatsEngine;

    monitor-enter v0

    .line 111
    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/stats/StatsEngine;->INSTANCE:Lcom/newrelic/agent/android/stats/StatsEngine;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/newrelic/agent/android/stats/StatsEngine;->enabled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized enable()V
    .locals 3

    const-class v0, Lcom/newrelic/agent/android/stats/StatsEngine;

    monitor-enter v0

    .line 118
    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/stats/StatsEngine;->INSTANCE:Lcom/newrelic/agent/android/stats/StatsEngine;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/newrelic/agent/android/stats/StatsEngine;->enabled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static get()Lcom/newrelic/agent/android/stats/StatsEngine;
    .locals 1

    .line 27
    sget-object v0, Lcom/newrelic/agent/android/stats/StatsEngine;->INSTANCE:Lcom/newrelic/agent/android/stats/StatsEngine;

    return-object v0
.end method

.method private lazyGet(Ljava/lang/String;)Lcom/newrelic/agent/android/metric/Metric;
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/newrelic/agent/android/stats/StatsEngine;->statsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/metric/Metric;

    if-nez v0, :cond_0

    .line 133
    new-instance v0, Lcom/newrelic/agent/android/metric/Metric;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/metric/Metric;-><init>(Ljava/lang/String;)V

    .line 135
    iget-boolean v1, p0, Lcom/newrelic/agent/android/stats/StatsEngine;->enabled:Z

    if-eqz v1, :cond_0

    .line 136
    iget-object v1, p0, Lcom/newrelic/agent/android/stats/StatsEngine;->statsMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static populateMetrics()V
    .locals 2

    .line 86
    sget-object v0, Lcom/newrelic/agent/android/stats/StatsEngine;->INSTANCE:Lcom/newrelic/agent/android/stats/StatsEngine;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/stats/StatsEngine;->getStatsMap()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 87
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/metric/Metric;

    .line 88
    invoke-static {v1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static reset()V
    .locals 1

    .line 103
    sget-object v0, Lcom/newrelic/agent/android/stats/StatsEngine;->INSTANCE:Lcom/newrelic/agent/android/stats/StatsEngine;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/stats/StatsEngine;->getStatsMap()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    return-void
.end method


# virtual methods
.method public getStatsMap()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lcom/newrelic/agent/android/stats/StatsEngine;->statsMap:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public inc(Ljava/lang/String;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/stats/StatsEngine;->lazyGet(Ljava/lang/String;)Lcom/newrelic/agent/android/metric/Metric;

    move-result-object p1

    .line 38
    monitor-enter p1

    .line 39
    :try_start_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->increment()V

    .line 40
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public inc(Ljava/lang/String;J)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/stats/StatsEngine;->lazyGet(Ljava/lang/String;)Lcom/newrelic/agent/android/metric/Metric;

    move-result-object p1

    .line 52
    monitor-enter p1

    .line 53
    :try_start_0
    invoke-virtual {p1, p2, p3}, Lcom/newrelic/agent/android/metric/Metric;->increment(J)V

    .line 54
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public onHarvest()V
    .locals 0

    .line 94
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->populateMetrics()V

    .line 95
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->reset()V

    return-void
.end method

.method public sample(Ljava/lang/String;F)V
    .locals 2

    .line 64
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/stats/StatsEngine;->lazyGet(Ljava/lang/String;)Lcom/newrelic/agent/android/metric/Metric;

    move-result-object p1

    .line 66
    monitor-enter p1

    float-to-double v0, p2

    .line 68
    :try_start_0
    invoke-virtual {p1, v0, v1}, Lcom/newrelic/agent/android/metric/Metric;->sample(D)V

    .line 69
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public sampleTimeMs(Ljava/lang/String;J)V
    .locals 0

    long-to-float p2, p2

    const/high16 p3, 0x447a0000    # 1000.0f

    div-float/2addr p2, p3

    .line 79
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/agent/android/stats/StatsEngine;->sample(Ljava/lang/String;F)V

    return-void
.end method
