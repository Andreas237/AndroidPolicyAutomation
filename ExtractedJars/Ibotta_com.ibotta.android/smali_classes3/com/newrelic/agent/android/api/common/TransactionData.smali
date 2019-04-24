.class public Lcom/newrelic/agent/android/api/common/TransactionData;
.super Ljava/lang/Object;
.source "TransactionData.java"


# instance fields
.field private final appData:Ljava/lang/String;

.field private final bytesReceived:J

.field private final bytesSent:J

.field private final carrier:Ljava/lang/String;

.field private final catPayload:Lcom/newrelic/agent/android/connectivity/CatPayload;

.field private errorCode:I

.field private final errorCodeLock:Ljava/lang/Object;

.field private final httpMethod:Ljava/lang/String;

.field private params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private responseBody:Ljava/lang/String;

.field private final statusCode:I

.field private final time:F

.field private final timestamp:J

.field private final url:Ljava/lang/String;

.field private final wanType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJJLjava/lang/String;Ljava/lang/String;Lcom/newrelic/agent/android/connectivity/CatPayload;)V
    .locals 5

    move-object v0, p0

    move-object v1, p1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCodeLock:Ljava/lang/Object;

    const/4 v2, 0x0

    .line 27
    iput v2, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCode:I

    const/4 v3, 0x0

    .line 28
    iput-object v3, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->responseBody:Ljava/lang/String;

    .line 29
    iput-object v3, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->params:Ljava/util/Map;

    const/16 v4, 0x3f

    .line 35
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-gez v4, :cond_0

    const/16 v4, 0x3b

    .line 37
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-gez v4, :cond_0

    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 42
    :cond_0
    invoke-virtual {p1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 44
    iput-object v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->url:Ljava/lang/String;

    move-object v1, p2

    .line 45
    iput-object v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->httpMethod:Ljava/lang/String;

    move-object v1, p3

    .line 46
    iput-object v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->carrier:Ljava/lang/String;

    move v1, p4

    .line 47
    iput v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->time:F

    move v1, p5

    .line 48
    iput v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->statusCode:I

    move v1, p6

    .line 49
    iput v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCode:I

    move-wide v1, p7

    .line 50
    iput-wide v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesSent:J

    move-wide v1, p9

    .line 51
    iput-wide v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesReceived:J

    move-object/from16 v1, p11

    .line 52
    iput-object v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->appData:Ljava/lang/String;

    move-object/from16 v1, p12

    .line 53
    iput-object v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->wanType:Ljava/lang/String;

    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->timestamp:J

    .line 55
    iput-object v3, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->responseBody:Ljava/lang/String;

    .line 56
    iput-object v3, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->params:Ljava/util/Map;

    move-object/from16 v1, p13

    .line 57
    iput-object v1, v0, Lcom/newrelic/agent/android/api/common/TransactionData;->catPayload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-void
.end method


# virtual methods
.method public asList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 139
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 140
    iget-object v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    iget-object v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->carrier:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    iget v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->time:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    iget v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->statusCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    iget v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    iget-wide v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesSent:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    iget-wide v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesReceived:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    iget-object v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->appData:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getAppData()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->appData:Ljava/lang/String;

    return-object v0
.end method

.method public getBytesReceived()J
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesReceived:J

    return-wide v0
.end method

.method public getBytesSent()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesSent:J

    return-wide v0
.end method

.method public getCarrier()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->carrier:Ljava/lang/String;

    return-object v0
.end method

.method public getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->catPayload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-object v0
.end method

.method public getErrorCode()I
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCodeLock:Ljava/lang/Object;

    monitor-enter v0

    .line 78
    :try_start_0
    iget v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCode:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 79
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getHttpMethod()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->httpMethod:Ljava/lang/String;

    return-object v0
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->statusCode:I

    return v0
.end method

.method public getTime()F
    .locals 1

    .line 103
    iget v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->time:F

    return v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 99
    iget-wide v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->timestamp:J

    return-wide v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWanType()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->wanType:Ljava/lang/String;

    return-object v0
.end method

.method public setErrorCode(I)V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCodeLock:Ljava/lang/Object;

    monitor-enter v0

    .line 116
    :try_start_0
    iput p1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCode:I

    .line 117
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 131
    iput-object p1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->params:Ljava/util/Map;

    return-void
.end method

.method public setResponseBody(Ljava/lang/String;)V
    .locals 1

    .line 121
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->HttpResponseBodyCapture:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 122
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    iput-object p1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->responseBody:Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 123
    iput-object p1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->responseBody:Ljava/lang/String;

    :cond_2
    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransactionData{timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", httpMethod=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->httpMethod:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", carrier=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->carrier:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", time="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->time:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", statusCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->statusCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", errorCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", errorCodeLock="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->errorCodeLock:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", bytesSent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesSent:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", bytesReceived="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->bytesReceived:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", appData=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->appData:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", wanType=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/api/common/TransactionData;->wanType:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
