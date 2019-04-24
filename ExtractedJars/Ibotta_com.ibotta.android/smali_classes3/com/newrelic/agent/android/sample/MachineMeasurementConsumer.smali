.class public Lcom/newrelic/agent/android/sample/MachineMeasurementConsumer;
.super Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;
.source "MachineMeasurementConsumer.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Machine:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method


# virtual methods
.method public consumeMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V
    .locals 0

    return-void
.end method

.method protected formatMetricName(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method

.method public onHarvest()V
    .locals 4

    .line 25
    invoke-static {}, Lcom/newrelic/agent/android/sample/Sampler;->sampleMemory()Lcom/newrelic/agent/android/tracing/Sample;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 28
    new-instance v1, Lcom/newrelic/agent/android/metric/Metric;

    const-string v2, "Memory/Used"

    invoke-direct {v1, v2}, Lcom/newrelic/agent/android/metric/Metric;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v0}, Lcom/newrelic/agent/android/tracing/Sample;->getValue()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/newrelic/agent/android/metric/Metric;->sample(D)V

    .line 30
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/sample/MachineMeasurementConsumer;->addMetric(Lcom/newrelic/agent/android/metric/Metric;)V

    .line 33
    :cond_0
    invoke-super {p0}, Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;->onHarvest()V

    return-void
.end method
