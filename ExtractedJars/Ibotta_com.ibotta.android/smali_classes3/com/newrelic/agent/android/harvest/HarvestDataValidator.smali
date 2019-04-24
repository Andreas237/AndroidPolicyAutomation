.class public Lcom/newrelic/agent/android/harvest/HarvestDataValidator;
.super Lcom/newrelic/agent/android/harvest/HarvestAdapter;
.source "HarvestDataValidator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public ensureActivityNameMetricsExist()V
    .locals 6

    .line 19
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->getInstance()Lcom/newrelic/agent/android/harvest/Harvest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->getHarvestData()Lcom/newrelic/agent/android/harvest/HarvestData;

    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getActivityTraces()Lcom/newrelic/agent/android/harvest/ActivityTraces;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 22
    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/ActivityTraces;->count()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 25
    :cond_0
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestData;->getMetrics()Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 26
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/ActivityTraces;->getActivityTraces()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    .line 31
    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/ActivityTrace;->rootTrace:Lcom/newrelic/agent/android/tracing/Trace;

    iget-object v2, v2, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    const-string v3, "#"

    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_2

    .line 34
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 37
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Mobile/Activity/Name/"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 41
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->getMetrics()Lcom/newrelic/agent/android/metric/MetricStore;

    move-result-object v3

    invoke-virtual {v3}, Lcom/newrelic/agent/android/metric/MetricStore;->getAllUnscoped()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 43
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_4

    .line 44
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/newrelic/agent/android/metric/Metric;

    .line 45
    invoke-virtual {v5}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v4, 0x1

    :cond_4
    if-eqz v4, :cond_5

    goto :goto_0

    .line 56
    :cond_5
    new-instance v3, Lcom/newrelic/agent/android/metric/Metric;

    invoke-direct {v3, v2}, Lcom/newrelic/agent/android/metric/Metric;-><init>(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v0, v3}, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    goto :goto_0

    :cond_6
    return-void

    :cond_7
    :goto_1
    return-void

    :cond_8
    :goto_2
    return-void
.end method

.method public onHarvestFinalize()V
    .locals 1

    .line 12
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HarvestDataValidator;->ensureActivityNameMetricsExist()V

    return-void
.end method
