.class public Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;
.super Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;
.source "HttpErrorMeasurementProducer.java"


# static fields
.field public static final HTTP_METHOD_PARAMS_KEY:Ljava/lang/String; = "http_method"

.field public static final WAN_TYPE_PARAMS_KEY:Ljava/lang/String; = "wan_type"

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->HttpError:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    return-void
.end method

.method private getSanitizedStackTrace()Ljava/lang/String;
    .locals 6

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 67
    :goto_0
    array-length v4, v1

    if-ge v2, v4, :cond_2

    .line 68
    aget-object v4, v1, v2

    .line 69
    invoke-direct {p0, v4}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->shouldFilterStackTraceElement(Ljava/lang/StackTraceElement;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 70
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    array-length v4, v1

    add-int/lit8 v4, v4, -0x1

    if-gt v2, v4, :cond_0

    const-string v4, "\n"

    .line 72
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 75
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getStackTraceLimit()I

    move-result v4

    if-lt v3, v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 80
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private shouldFilterStackTraceElement(Ljava/lang/StackTraceElement;)Z
    .locals 3

    .line 84
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    .line 85
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.newrelic"

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const-string v1, "dalvik.system.VMStack"

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "getThreadStackTrace"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const-string v1, "java.lang.Thread"

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "getStackTrace"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public produceMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;)V
    .locals 4

    .line 37
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/Util;->sanitizeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 40
    sget-object p1, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "HttpErrorMeasurementProducer.produceMeasurement: URL is null"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 44
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getParams()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_1

    .line 47
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :cond_1
    const-string v2, "http_method"

    .line 50
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getHttpMethod()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "wan_type"

    .line 51
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getActiveNetworkWanType()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setUrl(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1, v1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setParams(Ljava/util/Map;)V

    .line 55
    invoke-direct {p0}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->getSanitizedStackTrace()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setStackTrace(Ljava/lang/String;)V

    .line 56
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getActiveNetworkWanType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setWanType(Ljava/lang/String;)V

    .line 58
    invoke-super {p0, p1}, Lcom/newrelic/agent/android/measurement/producer/BaseMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/Measurement;)V

    return-void
.end method

.method public produceMeasurement(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/Map;Lcom/newrelic/agent/android/measurement/ThreadInfo;)V
    .locals 1
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
            ">;",
            "Lcom/newrelic/agent/android/measurement/ThreadInfo;",
            ")V"
        }
    .end annotation

    .line 25
    new-instance v0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;

    invoke-direct {v0, p1, p3}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;-><init>(Ljava/lang/String;I)V

    .line 27
    invoke-virtual {v0, p2}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setHttpMethod(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v0, p4}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setErrorCode(I)V

    .line 29
    invoke-virtual {v0, p5}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setResponseBody(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v0, p6}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setParams(Ljava/util/Map;)V

    .line 31
    invoke-virtual {v0, p7}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setThreadInfo(Lcom/newrelic/agent/android/measurement/ThreadInfo;)V

    .line 33
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/measurement/producer/HttpErrorMeasurementProducer;->produceMeasurement(Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;)V

    return-void
.end method
