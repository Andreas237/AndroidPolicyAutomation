.class public Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;
.super Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;
.source "CustomMetricProducer.java"


# static fields
.field private static final FILTER_REGEX:Ljava/lang/String; = "[/\\[\\]|*]"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Custom:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method

.method private createMetricName(Ljava/lang/String;Ljava/lang/String;Lcom/newrelic/agent/android/metric/MetricUnit;Lcom/newrelic/agent/android/metric/MetricUnit;)Ljava/lang/String;
    .locals 3

    .line 25
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "[/\\[\\]|*]"

    const-string v2, ""

    .line 27
    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "/"

    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "[/\\[\\]|*]"

    const-string v1, ""

    .line 29
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-nez p3, :cond_0

    if-eqz p4, :cond_3

    :cond_0
    const-string p1, "["

    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz p4, :cond_1

    .line 35
    invoke-virtual {p4}, Lcom/newrelic/agent/android/metric/MetricUnit;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    if-eqz p3, :cond_2

    const-string p1, "|"

    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 39
    invoke-virtual {p3}, Lcom/newrelic/agent/android/metric/MetricUnit;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    const-string p1, "]"

    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 43
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public produceMeasurement(Ljava/lang/String;Ljava/lang/String;IDD)V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p1

    move v3, p3

    move-wide v4, p4

    move-wide/from16 v6, p6

    .line 15
    invoke-virtual/range {v0 .. v9}, Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;->produceMeasurement(Ljava/lang/String;Ljava/lang/String;IDDLcom/newrelic/agent/android/metric/MetricUnit;Lcom/newrelic/agent/android/metric/MetricUnit;)V

    return-void
.end method

.method public produceMeasurement(Ljava/lang/String;Ljava/lang/String;IDDLcom/newrelic/agent/android/metric/MetricUnit;Lcom/newrelic/agent/android/metric/MetricUnit;)V
    .locals 9

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    .line 19
    invoke-direct {p0, p1, p2, v3, v4}, Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;->createMetricName(Ljava/lang/String;Ljava/lang/String;Lcom/newrelic/agent/android/metric/MetricUnit;Lcom/newrelic/agent/android/metric/MetricUnit;)Ljava/lang/String;

    move-result-object v2

    .line 20
    new-instance v8, Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;

    move-object v1, v8

    move v3, p3

    move-wide v4, p4

    move-wide v6, p6

    invoke-direct/range {v1 .. v7}, Lcom/newrelic/agent/android/measurement/CustomMetricMeasurement;-><init>(Ljava/lang/String;IDD)V

    .line 21
    invoke-virtual {p0, v8}, Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method
