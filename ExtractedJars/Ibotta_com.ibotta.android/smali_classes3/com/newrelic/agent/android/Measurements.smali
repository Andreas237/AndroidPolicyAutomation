.class public Lcom/newrelic/agent/android/Measurements;
.super Ljava/lang/Object;
.source "Measurements.java"


# static fields
.field private static final activityConsumer:Lcom/newrelic/agent/android/measurement/consumer/ActivityMeasurementConsumer;

.field private static final activityMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;

.field private static broadcastNewMeasurements:Z

.field private static final customMetricConsumer:Lcom/newrelic/agent/android/measurement/consumer/CustomMetricConsumer;

.field private static final customMetricProducer:Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;

.field private static final httpErrorHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpErrorHarvestingConsumer;

.field private static final httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

.field private static final httpTransactionHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpTransactionHarvestingConsumer;

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;

.field private static final measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

.field private static final methodMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/MethodMeasurementConsumer;

.field private static final methodMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;

.field private static final networkMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;

.field private static final summaryMetricMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 35
    new-instance v0, Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-direct {v0}, Lcom/newrelic/agent/android/MeasurementEngine;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    .line 38
    new-instance v0, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    .line 39
    new-instance v0, Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->networkMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;

    .line 40
    new-instance v0, Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->activityMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;

    .line 41
    new-instance v0, Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->methodMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;

    .line 42
    new-instance v0, Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->customMetricProducer:Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;

    .line 45
    new-instance v0, Lcom/newrelic/agent/android/measurement/consumer/HttpErrorHarvestingConsumer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/consumer/HttpErrorHarvestingConsumer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->httpErrorHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpErrorHarvestingConsumer;

    .line 46
    new-instance v0, Lcom/newrelic/agent/android/measurement/consumer/HttpTransactionHarvestingConsumer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/consumer/HttpTransactionHarvestingConsumer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->httpTransactionHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpTransactionHarvestingConsumer;

    .line 47
    new-instance v0, Lcom/newrelic/agent/android/measurement/consumer/ActivityMeasurementConsumer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/consumer/ActivityMeasurementConsumer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->activityConsumer:Lcom/newrelic/agent/android/measurement/consumer/ActivityMeasurementConsumer;

    .line 48
    new-instance v0, Lcom/newrelic/agent/android/measurement/consumer/MethodMeasurementConsumer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/consumer/MethodMeasurementConsumer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->methodMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/MethodMeasurementConsumer;

    .line 49
    new-instance v0, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->summaryMetricMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;

    .line 50
    new-instance v0, Lcom/newrelic/agent/android/measurement/consumer/CustomMetricConsumer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/measurement/consumer/CustomMetricConsumer;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/Measurements;->customMetricConsumer:Lcom/newrelic/agent/android/measurement/consumer/CustomMetricConsumer;

    const/4 v0, 0x1

    .line 52
    sput-boolean v0, Lcom/newrelic/agent/android/Measurements;->broadcastNewMeasurements:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addCustomMetric(Ljava/lang/String;Ljava/lang/String;IDD)V
    .locals 9

    .line 195
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 197
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/Measurements;->customMetricProducer:Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-wide v5, p3

    move-wide v7, p5

    invoke-virtual/range {v1 .. v8}, Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;->produceMeasurement(Ljava/lang/String;Ljava/lang/String;IDD)V

    .line 198
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static addCustomMetric(Ljava/lang/String;Ljava/lang/String;IDDLcom/newrelic/agent/android/metric/MetricUnit;Lcom/newrelic/agent/android/metric/MetricUnit;)V
    .locals 11

    .line 202
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 204
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/Measurements;->customMetricProducer:Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-wide v5, p3

    move-wide/from16 v7, p5

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-virtual/range {v1 .. v10}, Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;->produceMeasurement(Ljava/lang/String;Ljava/lang/String;IDDLcom/newrelic/agent/android/metric/MetricUnit;Lcom/newrelic/agent/android/metric/MetricUnit;)V

    .line 205
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static addHttpError(Lcom/newrelic/agent/android/api/common/TransactionData;)V
    .locals 3

    .line 158
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 161
    sget-object p0, Lcom/newrelic/agent/android/Measurements;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "TransactionData is null. HttpError measurement not created."

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 163
    :cond_1
    new-instance v0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getStatusCode()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;-><init>(Ljava/lang/String;I)V

    .line 165
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getHttpMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setHttpMethod(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setErrorCode(I)V

    .line 167
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getBytesSent()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setBytesSent(J)V

    .line 168
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getBytesReceived()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setBytesReceived(J)V

    .line 169
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getAppData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setAppData(Ljava/lang/String;)V

    .line 171
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getResponseBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setResponseBody(Ljava/lang/String;)V

    .line 172
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getParams()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setParams(Ljava/util/Map;)V

    .line 173
    invoke-virtual {p0}, Lcom/newrelic/agent/android/api/common/TransactionData;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setCatPayload(Lcom/newrelic/agent/android/connectivity/CatPayload;)V

    .line 175
    sget-object p0, Lcom/newrelic/agent/android/Measurements;->httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;)V

    :goto_0
    return-void
.end method

.method public static addHttpError(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 130
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 132
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/Measurements;->httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    new-instance v8, Lcom/newrelic/agent/android/measurement/ThreadInfo;

    invoke-direct {v8}, Lcom/newrelic/agent/android/measurement/ThreadInfo;-><init>()V

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v8}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->produceMeasurement(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/Map;Lcom/newrelic/agent/android/measurement/ThreadInfo;)V

    .line 133
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static addHttpError(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 113
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 115
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/Measurements;->httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    const/4 v5, 0x0

    new-instance v8, Lcom/newrelic/agent/android/measurement/ThreadInfo;

    invoke-direct {v8}, Lcom/newrelic/agent/android/measurement/ThreadInfo;-><init>()V

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v6, p3

    move-object v7, p4

    invoke-virtual/range {v1 .. v8}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->produceMeasurement(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/Map;Lcom/newrelic/agent/android/measurement/ThreadInfo;)V

    .line 116
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static addHttpError(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Lcom/newrelic/agent/android/measurement/ThreadInfo;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/newrelic/agent/android/measurement/ThreadInfo;",
            ")V"
        }
    .end annotation

    .line 146
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 148
    :cond_0
    sget-object v1, Lcom/newrelic/agent/android/Measurements;->httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-virtual/range {v1 .. v8}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->produceMeasurement(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/Map;Lcom/newrelic/agent/android/measurement/ThreadInfo;)V

    .line 149
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static addHttpTransaction(Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;)V
    .locals 1

    .line 182
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 185
    sget-object p0, Lcom/newrelic/agent/android/Measurements;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "TransactionMeasurement is null. HttpTransactionMeasurement measurement not created."

    invoke-interface {p0, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 187
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->networkMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;)V

    .line 188
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    :goto_0
    return-void
.end method

.method public static addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V
    .locals 1

    .line 313
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    return-void
.end method

.method public static addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V
    .locals 1

    .line 295
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    return-void
.end method

.method public static addTracedMethod(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 1

    .line 283
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 285
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->methodMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/tracing/Trace;)V

    .line 286
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static broadcast()V
    .locals 1

    .line 218
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/MeasurementEngine;->broadcastMeasurements()V

    return-void
.end method

.method public static endActivity(Lcom/newrelic/agent/android/activity/MeasuredActivity;)V
    .locals 1

    .line 264
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 266
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->endActivity(Lcom/newrelic/agent/android/activity/MeasuredActivity;)V

    .line 267
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->activityMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/activity/MeasuredActivity;)V

    .line 268
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static endActivity(Ljava/lang/String;)V
    .locals 1

    .line 251
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 253
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->endActivity(Ljava/lang/String;)Lcom/newrelic/agent/android/activity/MeasuredActivity;

    move-result-object p0

    .line 254
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->activityMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/activity/MeasuredActivity;)V

    .line 255
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->newMeasurementBroadcast()V

    return-void
.end method

.method public static endActivityWithoutMeasurement(Lcom/newrelic/agent/android/activity/MeasuredActivity;)V
    .locals 1

    .line 277
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 279
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->endActivity(Lcom/newrelic/agent/android/activity/MeasuredActivity;)V

    return-void
.end method

.method public static initialize()V
    .locals 2

    .line 58
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Measurement Engine initialized."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 59
    invoke-static {}, Lcom/newrelic/agent/android/TaskQueue;->start()V

    .line 62
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 63
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->networkMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 65
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->activityMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 66
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->methodMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 67
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->customMetricProducer:Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 70
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->httpErrorHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpErrorHarvestingConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 71
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->httpTransactionHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpTransactionHarvestingConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 72
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->activityConsumer:Lcom/newrelic/agent/android/measurement/consumer/ActivityMeasurementConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 73
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->methodMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/MethodMeasurementConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 74
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->summaryMetricMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 75
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->customMetricConsumer:Lcom/newrelic/agent/android/measurement/consumer/CustomMetricConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    return-void
.end method

.method private static newMeasurementBroadcast()V
    .locals 1

    .line 213
    sget-boolean v0, Lcom/newrelic/agent/android/Measurements;->broadcastNewMeasurements:Z

    if-eqz v0, :cond_0

    .line 214
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->broadcast()V

    :cond_0
    return-void
.end method

.method public static process()V
    .locals 1

    .line 330
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/MeasurementEngine;->broadcastMeasurements()V

    return-void
.end method

.method public static removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V
    .locals 1

    .line 322
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    return-void
.end method

.method public static removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V
    .locals 1

    .line 304
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    return-void
.end method

.method public static renameActivity(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 242
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0, p1}, Lcom/newrelic/agent/android/MeasurementEngine;->renameActivity(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static setBroadcastNewMeasurements(Z)V
    .locals 0

    .line 209
    sput-boolean p0, Lcom/newrelic/agent/android/Measurements;->broadcastNewMeasurements:Z

    return-void
.end method

.method public static shutdown()V
    .locals 2

    .line 82
    invoke-static {}, Lcom/newrelic/agent/android/TaskQueue;->stop()V

    .line 83
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/MeasurementEngine;->clear()V

    .line 85
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Measurement Engine shutting down."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 86
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->httpErrorMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 87
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->networkMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/NetworkMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 88
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->activityMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/ActivityMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 89
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->methodMeasurementProducer:Lcom/newrelic/agent/android/measurement/producer/MethodMeasurementProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 90
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->customMetricProducer:Lcom/newrelic/agent/android/measurement/producer/CustomMetricProducer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementProducer(Lcom/newrelic/agent/android/measurement/producer/MeasurementProducer;)V

    .line 92
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->httpErrorHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpErrorHarvestingConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 93
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->httpTransactionHarvester:Lcom/newrelic/agent/android/measurement/consumer/HttpTransactionHarvestingConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 94
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->activityConsumer:Lcom/newrelic/agent/android/measurement/consumer/ActivityMeasurementConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 95
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->methodMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/MethodMeasurementConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 96
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->summaryMetricMeasurementConsumer:Lcom/newrelic/agent/android/measurement/consumer/SummaryMetricMeasurementConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 97
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->customMetricConsumer:Lcom/newrelic/agent/android/measurement/consumer/CustomMetricConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->removeMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    return-void
.end method

.method public static startActivity(Ljava/lang/String;)Lcom/newrelic/agent/android/activity/MeasuredActivity;
    .locals 1

    .line 230
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 232
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/Measurements;->measurementEngine:Lcom/newrelic/agent/android/MeasurementEngine;

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/MeasurementEngine;->startActivity(Ljava/lang/String;)Lcom/newrelic/agent/android/activity/MeasuredActivity;

    move-result-object p0

    return-object p0
.end method
