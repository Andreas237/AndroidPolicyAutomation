.class public Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;
.super Lcom/newrelic/agent/android/measurement/BaseMeasurement;
.source "HttpErrorMeasurement.java"


# instance fields
.field private appData:Ljava/lang/String;

.field private bytesReceived:J

.field private bytesSent:J

.field private catPayload:Lcom/newrelic/agent/android/connectivity/CatPayload;

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

.field private responseBody:Ljava/lang/String;

.field private stackTrace:Ljava/lang/String;

.field private statusCode:I

.field private totalTime:D

.field private url:Ljava/lang/String;

.field private wanType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 30
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->HttpError:Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/measurement/BaseMeasurement;-><init>(Lcom/newrelic/agent/android/measurement/MeasurementType;)V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->url:Ljava/lang/String;

    const/4 v1, 0x0

    .line 16
    iput v1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->statusCode:I

    .line 17
    iput v1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->errorCode:I

    .line 18
    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->responseBody:Ljava/lang/String;

    .line 19
    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->stackTrace:Ljava/lang/String;

    .line 20
    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->params:Ljava/util/Map;

    .line 21
    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->httpMethod:Ljava/lang/String;

    .line 22
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getActiveNetworkWanType()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->wanType:Ljava/lang/String;

    const-wide/16 v1, 0x0

    .line 23
    iput-wide v1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->totalTime:D

    const-wide/16 v1, 0x0

    .line 24
    iput-wide v1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->bytesSent:J

    .line 25
    iput-wide v1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->bytesReceived:J

    .line 26
    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->appData:Ljava/lang/String;

    .line 27
    iput-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->catPayload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setStartTime(J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;-><init>()V

    .line 36
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setUrl(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setName(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->setStatusCode(I)V

    return-void
.end method


# virtual methods
.method public getAppData()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->appData:Ljava/lang/String;

    return-object v0
.end method

.method public getBytesReceived()J
    .locals 2

    .line 120
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->bytesReceived:J

    return-wide v0
.end method

.method public getBytesSent()J
    .locals 2

    .line 112
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->bytesSent:J

    return-wide v0
.end method

.method public getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->catPayload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-object v0
.end method

.method public getErrorCode()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->errorCode:I

    return v0
.end method

.method public getHttpMethod()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->httpMethod:Ljava/lang/String;

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

    .line 84
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public getStackTrace()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->stackTrace:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->statusCode:I

    return v0
.end method

.method public getTotalTime()D
    .locals 2

    .line 104
    iget-wide v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->totalTime:D

    return-wide v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWanType()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->wanType:Ljava/lang/String;

    return-object v0
.end method

.method public setAppData(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->appData:Ljava/lang/String;

    return-void
.end method

.method public setBytesReceived(J)V
    .locals 0

    .line 124
    iput-wide p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->bytesReceived:J

    return-void
.end method

.method public setBytesSent(J)V
    .locals 0

    .line 116
    iput-wide p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->bytesSent:J

    return-void
.end method

.method public setCatPayload(Lcom/newrelic/agent/android/connectivity/CatPayload;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->catPayload:Lcom/newrelic/agent/android/connectivity/CatPayload;

    return-void
.end method

.method public setErrorCode(I)V
    .locals 0

    .line 132
    iput p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->errorCode:I

    return-void
.end method

.method public setHttpMethod(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->httpMethod:Ljava/lang/String;

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

    .line 64
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->params:Ljava/util/Map;

    return-void
.end method

.method public setResponseBody(Ljava/lang/String;)V
    .locals 1

    .line 50
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->HttpResponseBodyCapture:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 51
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->responseBody:Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->responseBody:Ljava/lang/String;

    :cond_2
    :goto_1
    return-void
.end method

.method public setStackTrace(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->stackTrace:Ljava/lang/String;

    return-void
.end method

.method public setStatusCode(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->statusCode:I

    return-void
.end method

.method public setTotalTime(D)V
    .locals 0

    .line 108
    iput-wide p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->totalTime:D

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->url:Ljava/lang/String;

    return-void
.end method

.method public setWanType(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->wanType:Ljava/lang/String;

    return-void
.end method
