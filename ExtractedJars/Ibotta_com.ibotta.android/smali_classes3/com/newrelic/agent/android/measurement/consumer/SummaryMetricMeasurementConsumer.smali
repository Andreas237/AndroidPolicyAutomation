.class public Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;
.super Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;
.source "SummaryMetricMeasurementConsumer.java"

# interfaces
.implements Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;


# static fields
.field private static final ACTIVITY_METRIC_PREFIX:Ljava/lang/String; = "Mobile/Activity/Summary/Name/"

.field private static final METRIC_PREFIX:Ljava/lang/String; = "Mobile/Summary/"

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private final completedTraces:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/tracing/ActivityTrace;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Any:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    .line 30
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->completedTraces:Ljava/util/List;

    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->recordUnscopedMetrics:Z

    .line 36
    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->addTraceListener(Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;)V

    return-void
.end method

.method private consumeCustomMeasurement(Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;)V
    .locals 2

    .line 73
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object v0

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    new-instance v0, Lcom/newrelic/agent/android/measurement/BaseMeasurement;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;-><init>(Lcom/newrelic/agent/android/measurement/Measurement;)V

    .line 77
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->getCategoryName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;->setName(Ljava/lang/String;)V

    .line 78
    invoke-super {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;->consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private consumeMethodMeasurement(Lcom/newrelic/agent/android/measurement/MethodMeasurement;)V
    .locals 2

    .line 59
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object v0

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    if-ne v0, v1, :cond_1

    .line 60
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->categoryForMethod(Ljava/lang/String;)Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->setCategory(Lcom/newrelic/agent/android/instrumentation/MetricCategory;)V

    .line 61
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object v0

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    if-ne v0, v1, :cond_1

    return-void

    .line 66
    :cond_1
    new-instance v0, Lcom/newrelic/agent/android/measurement/BaseMeasurement;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;-><init>(Lcom/newrelic/agent/android/measurement/Measurement;)V

    .line 67
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->getCategoryName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;->setName(Ljava/lang/String;)V

    .line 69
    invoke-super {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;->consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method

.method private consumeNetworkMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;)V
    .locals 1

    .line 82
    new-instance v0, Lcom/newrelic/agent/android/measurement/BaseMeasurement;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;-><init>(Lcom/newrelic/agent/android/measurement/Measurement;)V

    .line 83
    sget-object p1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NETWORK:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->getCategoryName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;->setName(Ljava/lang/String;)V

    .line 84
    invoke-super {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;->consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method

.method private summarizeActivityMetrics(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    .locals 12

    .line 137
    iget-object v0, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->rootTrace:Lcom/newrelic/agent/android/tracing/Trace;

    .line 140
    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    iget-object v2, v0, Lcom/newrelic/agent/android/tracing/Trace;->metricName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/metric/MetricStore;->removeAllWithScope(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 141
    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    iget-object v3, v0, Lcom/newrelic/agent/android/tracing/Trace;->metricBackgroundName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/newrelic/agent/android/metric/MetricStore;->removeAllWithScope(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 142
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 148
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/newrelic/agent/android/metric/Metric;

    .line 149
    invoke-virtual {v4}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 154
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/metric/Metric;

    .line 155
    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 156
    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v4, v2}, Lcom/newrelic/agent/android/metric/Metric;->aggregate(Lcom/newrelic/agent/android/metric/Metric;)V

    goto :goto_1

    .line 158
    :cond_1
    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 164
    :cond_2
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/metric/Metric;

    .line 165
    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getExclusive()D

    move-result-wide v8

    add-double/2addr v6, v8

    goto :goto_2

    .line 168
    :cond_3
    iget-wide v1, v0, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    iget-wide v8, v0, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    sub-long/2addr v1, v8

    long-to-double v1, v1

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v8

    .line 171
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/newrelic/agent/android/metric/Metric;

    .line 174
    invoke-virtual {v8}, Lcom/newrelic/agent/android/metric/Metric;->getExclusive()D

    move-result-wide v9

    cmpl-double v11, v9, v4

    if-eqz v11, :cond_4

    cmpl-double v9, v6, v4

    if-eqz v9, :cond_4

    .line 175
    invoke-virtual {v8}, Lcom/newrelic/agent/android/metric/Metric;->getExclusive()D

    move-result-wide v9

    div-double/2addr v9, v6

    goto :goto_4

    :cond_4
    move-wide v9, v4

    :goto_4
    mul-double v9, v9, v1

    .line 180
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v8, v11}, Lcom/newrelic/agent/android/metric/Metric;->setTotal(Ljava/lang/Double;)V

    .line 181
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/newrelic/agent/android/metric/Metric;->setExclusive(Ljava/lang/Double;)V

    .line 182
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/newrelic/agent/android/metric/Metric;->setMinFieldValue(Ljava/lang/Double;)V

    .line 183
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/newrelic/agent/android/metric/Metric;->setMaxFieldValue(Ljava/lang/Double;)V

    .line 184
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/newrelic/agent/android/metric/Metric;->setSumOfSquares(Ljava/lang/Double;)V

    .line 185
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Mobile/Activity/Summary/Name/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v0, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/newrelic/agent/android/metric/Metric;->setScope(Ljava/lang/String;)V

    .line 189
    invoke-static {v8}, Lcom/newrelic/agent/android/harvest/Harvest;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    .line 191
    new-instance v9, Lcom/newrelic/agent/android/metric/Metric;

    invoke-direct {v9, v8}, Lcom/newrelic/agent/android/metric/Metric;-><init>(Lcom/newrelic/agent/android/metric/Metric;)V

    const/4 v8, 0x0

    .line 192
    invoke-virtual {v9, v8}, Lcom/newrelic/agent/android/metric/Metric;->setScope(Ljava/lang/String;)V

    .line 193
    invoke-static {v9}, Lcom/newrelic/agent/android/harvest/Harvest;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    goto :goto_3

    .line 197
    :cond_5
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->summarizeActivityNetworkMetrics(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V

    return-void
.end method

.method private summarizeActivityNetworkMetrics(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    .locals 9

    .line 115
    invoke-virtual {p1}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->getActivityName()Ljava/lang/String;

    move-result-object v0

    .line 117
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/metric/Metric;->getCount()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-lez v7, :cond_0

    .line 118
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v1

    .line 119
    iget-object v2, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    const-string v7, "<activity>"

    invoke-virtual {v1, v7, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/newrelic/agent/android/metric/Metric;->setName(Ljava/lang/String;)V

    .line 120
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v1, v3, v4}, Lcom/newrelic/agent/android/metric/Metric;->setCount(J)V

    .line 121
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    iget-object v2, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getTotal()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/metric/Metric;->setMinFieldValue(Ljava/lang/Double;)V

    .line 122
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    iget-object v2, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/metric/Metric;->getTotal()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/metric/Metric;->setMaxFieldValue(Ljava/lang/Double;)V

    .line 123
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkCountMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/Harvest;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    .line 126
    :cond_0
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/metric/Metric;->getCount()J

    move-result-wide v1

    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    .line 127
    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/metric/Metric;->getName()Ljava/lang/String;

    move-result-object v1

    .line 128
    iget-object v2, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    const-string v5, "<activity>"

    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/newrelic/agent/android/metric/Metric;->setName(Ljava/lang/String;)V

    .line 129
    iget-object v0, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v0, v3, v4}, Lcom/newrelic/agent/android/metric/Metric;->setCount(J)V

    .line 130
    iget-object v0, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/metric/Metric;->getTotal()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/metric/Metric;->setMinFieldValue(Ljava/lang/Double;)V

    .line 131
    iget-object v0, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/metric/Metric;->getTotal()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/metric/Metric;->setMaxFieldValue(Ljava/lang/Double;)V

    .line 132
    iget-object p1, p1, Lcom/newrelic/agent/android/tracing/ActivityTrace;->networkTimeMetric:Lcom/newrelic/agent/android/metric/Metric;

    invoke-static {p1}, Lcom/newrelic/agent/android/harvest/Harvest;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 44
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer$1;->$SwitchMap$com$newrelic$agent$android$measurement$MeasurementType:[I

    invoke-interface {p1}, Lcom/newrelic/agent/android/measurement/Measurement;->getType()Lcom/newrelic/agent/android/measurement/MeasurementType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/measurement/MeasurementType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 52
    :pswitch_0
    check-cast p1, Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;

    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->consumeCustomMeasurement(Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;)V

    goto :goto_0

    .line 49
    :pswitch_1
    check-cast p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->consumeNetworkMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;)V

    goto :goto_0

    .line 46
    :pswitch_2
    check-cast p1, Lcom/newrelic/agent/android/measurement/MethodMeasurement;

    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->consumeMethodMeasurement(Lcom/newrelic/agent/android/measurement/MethodMeasurement;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected formatMetricName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mobile/Summary/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "#"

    const-string v2, "/"

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onEnterMethod()V
    .locals 0

    return-void
.end method

.method public onExitMethod()V
    .locals 0

    return-void
.end method

.method public onHarvest()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/metric/MetricStore;->getAll()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->completedTraces:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 103
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->completedTraces:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    .line 104
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->summarizeActivityMetrics(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V

    goto :goto_0

    .line 107
    :cond_2
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->metrics:Lcom/newrelic/agent/android/metric/MetricStore;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/metric/MetricStore;->getAll()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    .line 108
    sget-object v0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Not all metrics were summarized!"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 111
    :cond_3
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->completedTraces:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public onHarvestComplete()V
    .locals 0

    return-void
.end method

.method public onHarvestError()V
    .locals 0

    return-void
.end method

.method public onTraceComplete(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->completedTraces:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;->completedTraces:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public onTraceRename(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    .locals 0

    return-void
.end method

.method public onTraceStart(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    .locals 0

    return-void
.end method
