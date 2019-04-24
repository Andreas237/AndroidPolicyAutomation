.class public Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "query.lingnantong.appcode"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 59
    if-nez p1, :cond_0

    .line 61
    const-string v0, "ServerAccessQueryAppCodeTask createDataStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 62
    const/4 v0, 0x0

    return-object v0

    .line 65
    :cond_0
    const/4 v2, 0x0

    .line 68
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 69
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    const-string v0, "longitude"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getLongitude()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    const-string v0, "latitude"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getLatitude()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    const-string v0, "deviceModel"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    const-string v0, "imei"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getSn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    goto :goto_0

    .line 76
    :catch_0
    move-exception v3

    .line 78
    const-string v0, "ServerAccessQueryAppCodeTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 79
    const/4 v2, 0x0

    .line 82
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;)Ljava/lang/String;
    .locals 5

    .line 36
    if-eqz p1, :cond_0

    .line 37
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getLongitude()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getLatitude()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getSn()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    :cond_0
    const-string v0, "ServerAccessQueryAppCodeTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "query.lingnantong.appcode"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 52
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 54
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;
    .locals 1

    .line 88
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;-><init>()V

    .line 89
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->returnCode:I

    .line 90
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;
    .locals 8

    .line 96
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;-><init>()V

    .line 97
    iput p1, v2, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->returnCode:I

    .line 98
    invoke-virtual {v2, p2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->setResultDesc(Ljava/lang/String;)V

    .line 99
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    .line 102
    const/4 v3, 0x0

    .line 103
    const-string v0, "resp_data"

    :try_start_0
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    const-string v0, "resp_data"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 108
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 110
    const-string v0, "recommended_city"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    const-string v0, "recommended_city"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 113
    invoke-static {v4}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->build(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->setRecommendedCity(Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;)V

    .line 116
    :cond_1
    const-string v0, "available_city"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 118
    const-string v0, "available_city"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 119
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 121
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 122
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 124
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->build(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;

    move-result-object v7

    .line 125
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->getAvailableCity()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 135
    :cond_2
    goto :goto_1

    .line 131
    :catch_0
    move-exception v3

    .line 133
    const-string v0, "DicsQueryTask readSuccessResponse exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 134
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->returnCode:I

    .line 137
    :cond_3
    :goto_1
    return-object v2
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;

    move-result-object v0

    return-object v0
.end method
