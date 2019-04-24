.class public Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;
.super Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;
.source "NetworkMeasurementProducer.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Network:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method


# virtual methods
.method public produceMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;)V
    .locals 1

    .line 21
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/Util;->sanitizeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 25
    :cond_0
    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->setUrl(Ljava/lang/String;)V

    .line 26
    invoke-super {p0, p1}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method

.method public produceMeasurement(Ljava/lang/String;Ljava/lang/String;IIJDJJLjava/lang/String;)V
    .locals 15

    .line 13
    invoke-static/range {p1 .. p1}, Lcom/newrelic/agent/android/util/Util;->sanitizeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 17
    :cond_0
    new-instance v14, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    move-object v0, v14

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move-object/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Ljava/lang/String;Ljava/lang/String;IIJDJJLjava/lang/String;)V

    move-object v0, p0

    invoke-virtual {p0, v14}, Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;)V

    return-void
.end method
