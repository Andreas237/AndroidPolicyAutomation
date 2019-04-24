.class public Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;
.super Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;
.source "ActivityMeasurementProducer.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Activity:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method


# virtual methods
.method public produceMeasurement(Lcom/newrelic/agent/android/activity/MeasuredActivity;)V
    .locals 13

    .line 17
    new-instance v6, Lcom/newrelic/agent/android/measurement/ActivityMeasurement;

    invoke-interface {p1}, Lcom/newrelic/agent/android/activity/MeasuredActivity;->getMetricName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/newrelic/agent/android/activity/MeasuredActivity;->getStartTime()J

    move-result-wide v2

    invoke-interface {p1}, Lcom/newrelic/agent/android/activity/MeasuredActivity;->getEndTime()J

    move-result-wide v4

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/newrelic/agent/android/measurement/ActivityMeasurement;-><init>(Ljava/lang/String;JJ)V

    invoke-super {p0, v6}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    .line 18
    new-instance v0, Lcom/newrelic/agent/android/measurement/ActivityMeasurement;

    invoke-interface {p1}, Lcom/newrelic/agent/android/activity/MeasuredActivity;->getBackgroundMetricName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1}, Lcom/newrelic/agent/android/activity/MeasuredActivity;->getStartTime()J

    move-result-wide v9

    invoke-interface {p1}, Lcom/newrelic/agent/android/activity/MeasuredActivity;->getEndTime()J

    move-result-wide v11

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/newrelic/agent/android/measurement/ActivityMeasurement;-><init>(Ljava/lang/String;JJ)V

    invoke-super {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method
