.class public Lcom/newrelic/agent/android/harvest/HttpTransaction;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "HttpTransaction.java"


# instance fields
.field private appData:Ljava/lang/String;

.field private bytesReceived:J

.field private bytesSent:J

.field private carrier:Ljava/lang/String;

.field private errorCode:I

.field private httpMethod:Ljava/lang/String;

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

.field private payload:Lcom/newrelic/agent/android/connectivity/CatPayload;

.field private responseBody:Ljava/lang/String;

.field private statusCode:I

.field private timestamp:Ljava/lang/Long;

.field private totalTime:D

.field private url:Ljava/lang/String;

.field private wanType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    return-void
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 36
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 37
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->url:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 38
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->carrier:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 39
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->totalTime:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Double;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 40
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->statusCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 41
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->errorCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 42
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesSent:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 43
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesReceived:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 44
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->appData:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 45
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->wanType:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 46
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->httpMethod:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public getAppData()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->appData:Ljava/lang/String;

    return-object v0
.end method

.method public getBytesReceived()J
    .locals 2

    .line 149
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesReceived:J

    return-wide v0
.end method

.method public getBytesSent()J
    .locals 2

    .line 145
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesSent:J

    return-wide v0
.end method

.method public getCarrier()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->carrier:Ljava/lang/String;

    return-object v0
.end method

.method public getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->payload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-object v0
.end method

.method public getErrorCode()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->errorCode:I

    return v0
.end method

.method public getHttpMethod()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->httpMethod:Ljava/lang/String;

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

    .line 165
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->statusCode:I

    return v0
.end method

.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->timestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public getTotalTime()D
    .locals 2

    .line 133
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->totalTime:D

    return-wide v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWanType()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->wanType:Ljava/lang/String;

    return-object v0
.end method

.method public setAppData(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->appData:Ljava/lang/String;

    return-void
.end method

.method public setBytesReceived(J)V
    .locals 0

    .line 83
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesReceived:J

    return-void
.end method

.method public setBytesSent(J)V
    .locals 0

    .line 79
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesSent:J

    return-void
.end method

.method public setCarrier(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->carrier:Ljava/lang/String;

    return-void
.end method

.method public setCatPayload(Lcom/newrelic/agent/android/connectivity/CatPayload;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->payload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-void
.end method

.method public setErrorCode(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->errorCode:I

    return-void
.end method

.method public setHttpMethod(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->httpMethod:Ljava/lang/String;

    return-void
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

    .line 109
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->params:Ljava/util/Map;

    return-void
.end method

.method public setResponseBody(Ljava/lang/String;)V
    .locals 1

    .line 91
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->HttpResponseBodyCapture:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 92
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->responseBody:Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 93
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->responseBody:Ljava/lang/String;

    :cond_2
    :goto_1
    return-void
.end method

.method public setStatusCode(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->statusCode:I

    return-void
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->timestamp:Ljava/lang/Long;

    return-void
.end method

.method public setTotalTime(D)V
    .locals 0

    .line 67
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->totalTime:D

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->url:Ljava/lang/String;

    return-void
.end method

.method public setWanType(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->wanType:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpTransaction{url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", carrier=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->carrier:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", wanType=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->wanType:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", httpMethod=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->httpMethod:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", totalTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->totalTime:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", statusCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->statusCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", errorCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->errorCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", bytesSent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesSent:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", bytesReceived="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->bytesReceived:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", appData=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->appData:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", responseBody=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->responseBody:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", params=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->params:Ljava/util/Map;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpTransaction;->timestamp:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
