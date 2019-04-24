.class public Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;
.super Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;
.source "MethodMeasurementProducer.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Method:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method


# virtual methods
.method public produceMeasurement(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 11

    .line 17
    new-instance v10, Lcom/newrelic/agent/android/measurement/MethodMeasurement;

    iget-object v1, p1, Lcom/newrelic/agent/android/tracing/Trace;->displayName:Ljava/lang/String;

    iget-object v2, p1, Lcom/newrelic/agent/android/tracing/Trace;->scope:Ljava/lang/String;

    iget-wide v3, p1, Lcom/newrelic/agent/android/tracing/Trace;->entryTimestamp:J

    iget-wide v5, p1, Lcom/newrelic/agent/android/tracing/Trace;->exitTimestamp:J

    iget-wide v7, p1, Lcom/newrelic/agent/android/tracing/Trace;->exclusiveTime:J

    .line 23
    invoke-virtual {p1}, Lcom/newrelic/agent/android/tracing/Trace;->getCategory()Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    move-result-object v9

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/newrelic/agent/android/measurement/MethodMeasurement;-><init>(Ljava/lang/String;Ljava/lang/String;JJJLcom/newrelic/agent/android/instrumentation/MetricCategory;)V

    .line 25
    invoke-virtual {p0, v10}, Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method
