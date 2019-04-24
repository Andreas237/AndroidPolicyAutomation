.class public Lcom/shopkick/app/queue/ApiObjectWrapper;
.super Ljava/lang/Object;
.source "ApiObjectWrapper.java"


# instance fields
.field public apiRequest:Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

.field public apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

.field public className:Ljava/lang/String;

.field public createdTimestamp:Ljava/lang/Long;

.field public expirationTimestamp:Ljava/lang/Long;

.field public gracePeriodDuration:Ljava/lang/Long;

.field public identifier:Ljava/lang/String;

.field public requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->className:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected createApiRequest(Lcom/shopkick/fetchers/network/NetworkRequest;)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;
    .locals 3

    .line 45
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;-><init>()V

    .line 46
    invoke-virtual {p1}, Lcom/shopkick/fetchers/network/NetworkRequest;->getPostBodyAsText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->requestBody:Ljava/lang/String;

    .line 47
    iget-object v1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->requestPath:Ljava/lang/String;

    .line 48
    iget-object v1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->requestMethod:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v2, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->usePost:Ljava/lang/Boolean;

    .line 49
    iget-object p1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/awards/AwardsManager$RequestType;Ljava/lang/String;Lcom/shopkick/fetchers/network/NetworkRequest;Ljava/lang/String;JJJ)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    .line 36
    iput-object p2, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->identifier:Ljava/lang/String;

    .line 37
    invoke-virtual {p0, p3}, Lcom/shopkick/app/queue/ApiObjectWrapper;->createApiRequest(Lcom/shopkick/fetchers/network/NetworkRequest;)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiRequest:Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    .line 38
    iput-object p4, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->className:Ljava/lang/String;

    .line 39
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->createdTimestamp:Ljava/lang/Long;

    .line 40
    invoke-static {p7, p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    .line 41
    invoke-static {p9, p10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->gracePeriodDuration:Ljava/lang/Long;

    return-void
.end method

.method public populateUsingJSONObject(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "request_type"

    .line 83
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "request_type"

    .line 84
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/awards/AwardsManager$RequestType;->valueOf(Ljava/lang/String;)Lcom/shopkick/app/awards/AwardsManager$RequestType;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    :cond_0
    const-string v0, "identifier"

    .line 86
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->identifier:Ljava/lang/String;

    const-string v0, "created_timestamp"

    .line 87
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->createdTimestamp:Ljava/lang/Long;

    const-string v0, "expiration_timestamp"

    .line 88
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    const-string v0, "grace_period_duration"

    .line 89
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->gracePeriodDuration:Ljava/lang/Long;

    const-string v0, "api_request"

    .line 90
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const-string v0, "api_request"

    .line 91
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-static {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiRequest:Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    :cond_1
    const-string v0, "api_response"

    .line 94
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "api_response"

    .line 95
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-static {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    :cond_2
    const-string v0, "class_name"

    .line 98
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->className:Ljava/lang/String;

    return-void
.end method

.method public toJSONObject()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 54
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 55
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-eqz v1, :cond_0

    const-string v2, "request_type"

    .line 56
    invoke-virtual {v1}, Lcom/shopkick/app/awards/AwardsManager$RequestType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->identifier:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "identifier"

    .line 59
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->createdTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_2

    const-string v2, "created_timestamp"

    .line 62
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_3

    const-string v2, "expiration_timestamp"

    .line 65
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->gracePeriodDuration:Ljava/lang/Long;

    if-eqz v1, :cond_4

    const-string v2, "grace_period_duration"

    .line 68
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiRequest:Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    if-eqz v1, :cond_5

    const-string v2, "api_request"

    .line 71
    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    if-eqz v1, :cond_6

    const-string v2, "api_response"

    .line 74
    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    :cond_6
    iget-object v1, p0, Lcom/shopkick/app/queue/ApiObjectWrapper;->className:Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v2, "class_name"

    .line 77
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    return-object v0
.end method
