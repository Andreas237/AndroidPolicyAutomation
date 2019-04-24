.class public Lcom/newrelic/agent/android/metric/MetricStore;
.super Ljava/lang/Object;
.source "MetricStore.java"


# instance fields
.field private final metricStore:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public add(Lcom/newrelic/agent/android/metric/Metric;)V
    .locals 4

    .line 20
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getStringScope()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v1

    .line 24
    iget-object v2, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 25
    iget-object v2, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_0
    iget-object v2, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 29
    iget-object v2, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/metric/Metric;->aggregate(Lcom/newrelic/agent/android/metric/Metric;)V

    goto :goto_0

    .line 31
    :cond_1
    iget-object v2, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public clear()V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public get(Ljava/lang/String;)Lcom/newrelic/agent/android/metric/Metric;
    .locals 1

    const-string v0, ""

    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/newrelic/agent/android/metric/MetricStore;->get(Ljava/lang/String;Ljava/lang/String;)Lcom/newrelic/agent/android/metric/Metric;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/lang/String;Ljava/lang/String;)Lcom/newrelic/agent/android/metric/Metric;
    .locals 1

    .line 41
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/newrelic/agent/android/metric/Metric;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getAll()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;"
        }
    .end annotation

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getAllByScope(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;"
        }
    .end annotation

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 64
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public getAllUnscoped()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;"
        }
    .end annotation

    const-string v0, ""

    .line 74
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/metric/MetricStore;->getAllByScope(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public remove(Lcom/newrelic/agent/android/metric/Metric;)V
    .locals 2

    .line 78
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getStringScope()Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-virtual {p1}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object p1

    .line 81
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 84
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 87
    :cond_1
    iget-object v1, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeAll(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;)V"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/newrelic/agent/android/metric/MetricStore;->metricStore:Ljava/util/Map;

    monitor-enter v0

    .line 92
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/metric/Metric;

    .line 93
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/metric/MetricStore;->remove(Lcom/newrelic/agent/android/metric/Metric;)V

    goto :goto_0

    .line 95
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeAllWithScope(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/metric/Metric;",
            ">;"
        }
    .end annotation

    .line 99
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/metric/MetricStore;->getAllByScope(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 100
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/metric/MetricStore;->removeAll(Ljava/util/List;)V

    :cond_0
    return-object p1
.end method
