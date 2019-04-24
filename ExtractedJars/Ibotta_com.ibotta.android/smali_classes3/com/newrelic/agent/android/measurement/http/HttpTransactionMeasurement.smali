.class public Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;
.super Lcom/newrelic/agent/android/measurement/BaseMeasurement;
.source "HttpTransactionMeasurement.java"


# instance fields
.field private appData:Ljava/lang/String;

.field private bytesReceived:J

.field private bytesSent:J

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

.field private totalTime:D

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V
    .locals 14

    .line 55
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 56
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getHttpMethod()Ljava/lang/String;

    move-result-object v2

    .line 57
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getStatusCode()I

    move-result v3

    .line 58
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getErrorCode()I

    move-result v4

    .line 59
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getTimestamp()J

    move-result-wide v5

    .line 60
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getTime()F

    move-result v0

    float-to-double v7, v0

    .line 61
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getBytesSent()J

    move-result-wide v9

    .line 62
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getBytesReceived()J

    move-result-wide v11

    .line 63
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getAppData()Ljava/lang/String;

    move-result-object v13

    move-object v0, p0

    .line 55
    invoke-direct/range {v0 .. v13}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Ljava/lang/String;Ljava/lang/String;IIJDJJLjava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getResponseBody()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->responseBody:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getParams()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->params:Ljava/util/Map;

    .line 67
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->payload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIJDJJLjava/lang/String;)V
    .locals 2

    .line 31
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Network:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    .line 33
    invoke-static {p1}, Lcom/newrelic/agent/android/util/Util;->sanitizeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->setName(Ljava/lang/String;)V

    .line 36
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->getCurrentScope()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->setScope(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0, p5, p6}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->setStartTime(J)V

    double-to-int v0, p7

    int-to-long v0, v0

    add-long/2addr p5, v0

    .line 38
    invoke-virtual {p0, p5, p6}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->setEndTime(J)V

    const-wide p5, 0x408f400000000000L    # 1000.0

    mul-double p5, p5, p7

    double-to-int p5, p5

    int-to-long p5, p5

    .line 39
    invoke-virtual {p0, p5, p6}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->setExclusiveTime(J)V

    .line 41
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->url:Ljava/lang/String;

    .line 42
    iput-object p2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->httpMethod:Ljava/lang/String;

    .line 43
    iput p3, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->statusCode:I

    .line 44
    iput-wide p9, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->bytesSent:J

    .line 45
    iput-wide p11, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->bytesReceived:J

    .line 46
    iput-wide p7, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->totalTime:D

    .line 47
    iput-object p13, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->appData:Ljava/lang/String;

    .line 48
    iput p4, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->errorCode:I

    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->responseBody:Ljava/lang/String;

    .line 50
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->params:Ljava/util/Map;

    .line 51
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->payload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-void
.end method


# virtual methods
.method public asDouble()D
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->totalTime:D

    return-wide v0
.end method

.method public getAppData()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->appData:Ljava/lang/String;

    return-object v0
.end method

.method public getBytesReceived()J
    .locals 2

    .line 100
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->bytesReceived:J

    return-wide v0
.end method

.method public getBytesSent()J
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->bytesSent:J

    return-wide v0
.end method

.method public getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->payload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-object v0
.end method

.method public getErrorCode()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->errorCode:I

    return v0
.end method

.method public getHttpMethod()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->httpMethod:Ljava/lang/String;

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

    .line 112
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->statusCode:I

    return v0
.end method

.method public getTotalTime()D
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->totalTime:D

    return-wide v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->url:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpTransactionMeasurement{url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", httpMethod=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->httpMethod:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", totalTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->totalTime:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", statusCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->statusCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", errorCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->errorCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", bytesSent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->bytesSent:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", bytesReceived="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->bytesReceived:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", appData=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->appData:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", responseBody=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->responseBody:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", params=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;->params:Ljava/util/Map;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
