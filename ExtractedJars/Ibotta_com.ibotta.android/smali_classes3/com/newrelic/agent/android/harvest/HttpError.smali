.class public Lcom/newrelic/agent/android/harvest/HttpError;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "HttpError.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private appData:Ljava/lang/String;

.field private bytesReceived:J

.field private bytesSent:J

.field private count:J

.field private digest:Ljava/lang/String;

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

.field private timestamp:Ljava/lang/Long;

.field private totalTime:D

.field private url:Ljava/lang/String;

.field private wanType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/harvest/HttpError;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 48
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->url:Ljava/lang/String;

    const/4 v1, 0x0

    .line 31
    iput v1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->statusCode:I

    const-wide/16 v2, 0x0

    .line 32
    iput-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->count:J

    .line 33
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->responseBody:Ljava/lang/String;

    .line 34
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->stackTrace:Ljava/lang/String;

    .line 35
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    .line 36
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->appData:Ljava/lang/String;

    .line 37
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->digest:Ljava/lang/String;

    .line 38
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->httpMethod:Ljava/lang/String;

    .line 39
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getActiveNetworkWanType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->wanType:Ljava/lang/String;

    const-wide/16 v4, 0x0

    .line 40
    iput-wide v4, p0, Lcom/newrelic/agent/android/harvest/HttpError;->totalTime:D

    .line 41
    iput v1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->errorCode:I

    .line 42
    iput-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesSent:J

    .line 43
    iput-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesReceived:J

    .line 46
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->timestamp:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;)V
    .locals 6

    .line 62
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getStatusCode()I

    move-result v2

    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getResponseBody()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getStackTrace()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getParams()Ljava/util/Map;

    move-result-object v5

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/newrelic/agent/android/harvest/HttpError;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 63
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->setTimestamp(Ljava/lang/Long;)V

    .line 64
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getHttpMethod()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->setHttpMethod(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getWanType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->setWanType(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getHttpMethod()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->setHttpMethod(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getErrorCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->setErrorCode(I)V

    .line 68
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getBytesReceived()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/harvest/HttpError;->setBytesReceived(J)V

    .line 69
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getBytesSent()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/harvest/HttpError;->setBytesSent(J)V

    .line 70
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getAppData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->setAppData(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p1}, Lcom/newrelic/agent/android/measurement/http/HttpErrorMeasurement;->getTotalTime()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/harvest/HttpError;->setTotalTime(D)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->url:Ljava/lang/String;

    const/4 v1, 0x0

    .line 31
    iput v1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->statusCode:I

    const-wide/16 v2, 0x0

    .line 32
    iput-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->count:J

    .line 33
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->responseBody:Ljava/lang/String;

    .line 34
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->stackTrace:Ljava/lang/String;

    .line 35
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    .line 36
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->appData:Ljava/lang/String;

    .line 37
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->digest:Ljava/lang/String;

    .line 38
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->httpMethod:Ljava/lang/String;

    .line 39
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getActiveNetworkWanType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->wanType:Ljava/lang/String;

    const-wide/16 v4, 0x0

    .line 40
    iput-wide v4, p0, Lcom/newrelic/agent/android/harvest/HttpError;->totalTime:D

    .line 41
    iput v1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->errorCode:I

    .line 42
    iput-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesSent:J

    .line 43
    iput-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesReceived:J

    .line 46
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->timestamp:Ljava/lang/Long;

    .line 52
    invoke-static {p1}, Lcom/newrelic/agent/android/util/Util;->sanitizeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->url:Ljava/lang/String;

    .line 53
    iput p2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->statusCode:I

    .line 54
    iput-object p3, p0, Lcom/newrelic/agent/android/harvest/HttpError;->responseBody:Ljava/lang/String;

    .line 55
    iput-object p4, p0, Lcom/newrelic/agent/android/harvest/HttpError;->stackTrace:Ljava/lang/String;

    .line 56
    iput-object p5, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    const-wide/16 p1, 0x1

    .line 57
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->count:J

    .line 58
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HttpError;->computeHash()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->digest:Ljava/lang/String;

    return-void
.end method

.method private computeHash()Ljava/lang/String;
    .locals 3

    :try_start_0
    const-string v0, "SHA-1"

    .line 135
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->url:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    const/16 v1, 0x8

    .line 142
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->statusCode:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 144
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->stackTrace:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 145
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->stackTrace:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 147
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

    .line 137
    :catch_0
    sget-object v0, Lcom/newrelic/agent/android/harvest/HttpError;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "HttpError: Unable to initialize SHA-1 hash algorithm"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 6

    .line 76
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getResponse_body_limit()I

    move-result v0

    .line 77
    new-instance v1, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v1}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 79
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->url:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 80
    iget v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->statusCode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 81
    iget-wide v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->count:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v2, ""

    .line 84
    sget-object v3, Lcom/newrelic/agent/android/FeatureFlag;->HttpResponseBodyCapture:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v3}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 85
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->responseBody:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/newrelic/agent/android/harvest/HttpError;->optional(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v0, :cond_1

    .line 87
    sget-object v3, Lcom/newrelic/agent/android/harvest/HttpError;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HttpError: error response BODY is too large. Truncating to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " bytes."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 88
    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 91
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/harvest/HttpError;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "HttpError: HttpResponseBodyCapture is not enabled"

    invoke-interface {v0, v3}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 94
    :cond_1
    :goto_0
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getEncoder()Lcom/newrelic/agent/android/util/Encoder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/newrelic/agent/android/util/Encoder;->encode([B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 95
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->stackTrace:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->optional(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 97
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 98
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    if-nez v2, :cond_2

    .line 99
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    iput-object v2, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    :cond_2
    const-string v2, "custom_params"

    .line 102
    iget-object v3, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    invoke-static {v3}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;->fromMap(Ljava/util/Map;)Lcom/newrelic/agent/android/harvest/type/HarvestableObject;

    move-result-object v3

    invoke-virtual {v3}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 104
    invoke-virtual {v1, v0}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 105
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->appData:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HttpError;->optional(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v1
.end method

.method public digest()V
    .locals 1

    .line 127
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HttpError;->computeHash()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->digest:Ljava/lang/String;

    return-void
.end method

.method public getAppData()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->appData:Ljava/lang/String;

    return-object v0
.end method

.method public getBytesReceived()J
    .locals 2

    .line 205
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesReceived:J

    return-wide v0
.end method

.method public getBytesSent()J
    .locals 2

    .line 245
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesSent:J

    return-wide v0
.end method

.method public getErrorCode()I
    .locals 1

    .line 237
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->errorCode:I

    return v0
.end method

.method public getHash()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->digest:Ljava/lang/String;

    return-object v0
.end method

.method public getHttpMethod()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->httpMethod:Ljava/lang/String;

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

    .line 197
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 155
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->statusCode:I

    return v0
.end method

.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->timestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public getTotalTime()D
    .locals 2

    .line 229
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->totalTime:D

    return-wide v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWanType()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->wanType:Ljava/lang/String;

    return-object v0
.end method

.method public incrementCount()V
    .locals 4

    .line 114
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->count:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/newrelic/agent/android/harvest/HttpError;->count:J

    return-void
.end method

.method public setAppData(Ljava/lang/String;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->appData:Ljava/lang/String;

    return-void
.end method

.method public setBytesReceived(J)V
    .locals 0

    .line 209
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesReceived:J

    return-void
.end method

.method public setBytesSent(J)V
    .locals 0

    .line 249
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->bytesSent:J

    return-void
.end method

.method public setCount(J)V
    .locals 0

    .line 167
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->count:J

    return-void
.end method

.method public setErrorCode(I)V
    .locals 0

    .line 241
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->errorCode:I

    return-void
.end method

.method public setHttpMethod(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->httpMethod:Ljava/lang/String;

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

    .line 185
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->params:Ljava/util/Map;

    return-void
.end method

.method public setResponseBody(Ljava/lang/String;)V
    .locals 1

    .line 171
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->HttpResponseBodyCapture:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 172
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 175
    :cond_0
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->responseBody:Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 173
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->responseBody:Ljava/lang/String;

    :cond_2
    :goto_1
    return-void
.end method

.method public setStackTrace(Ljava/lang/String;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->stackTrace:Ljava/lang/String;

    return-void
.end method

.method public setStatusCode(I)V
    .locals 0

    .line 163
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->statusCode:I

    return-void
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->timestamp:Ljava/lang/Long;

    return-void
.end method

.method public setTotalTime(D)V
    .locals 0

    .line 233
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->totalTime:D

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->url:Ljava/lang/String;

    return-void
.end method

.method public setWanType(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HttpError;->wanType:Ljava/lang/String;

    return-void
.end method
