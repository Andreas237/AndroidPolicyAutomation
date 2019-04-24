.class public Lcom/newrelic/agent/android/measurement/consumer/ActivityMeasurementConsumer;
.super Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;
.source "ActivityMeasurementConsumer.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Activity:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/consumer/MetricMeasurementConsumer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method


# virtual methods
.method protected formatMetricName(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method
