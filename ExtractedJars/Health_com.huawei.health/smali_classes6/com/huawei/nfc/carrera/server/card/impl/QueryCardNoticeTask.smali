.class public Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;>;"
    }
.end annotation


# static fields
.field private static final QUERY_TRANSFER_COMMANDER:Ljava/lang/String; = "query.issuer.notice"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 57
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 59
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    const/4 v2, 0x0

    .line 65
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 66
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    const-string v0, "type"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->getNoticeType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    const-string v0, "issuerId"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    goto :goto_0

    .line 70
    :catch_0
    move-exception v3

    .line 72
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 73
    const/4 v2, 0x0

    .line 76
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;)Ljava/lang/String;
    .locals 5

    .line 36
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 38
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "query.issuer.notice"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 44
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 45
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;
    .locals 1

    .line 50
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;-><init>()V

    .line 51
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->returnCode:I

    .line 52
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;
    .locals 8

    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    if-nez p3, :cond_0

    .line 85
    const/4 v0, 0x0

    return-object v0

    .line 87
    :cond_0
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;-><init>()V

    .line 88
    iput p1, v3, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->returnCode:I

    .line 92
    const-string v0, "header"

    :try_start_0
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    const/4 v4, 0x0

    .line 95
    const-string v0, "header"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 96
    if-eqz v4, :cond_1

    .line 98
    const-string v0, "srcTranID"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 99
    const-string v0, "srcTranId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    :cond_1
    goto :goto_0

    .line 103
    :catch_0
    move-exception v4

    .line 105
    const-string v0, "QueryCardNoticeTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 110
    :goto_0
    const/4 v4, 0x0

    .line 111
    const-string v0, "notices"

    :try_start_1
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 113
    const-string v0, "notices"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 115
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 117
    const/4 v5, 0x0

    .line 118
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 123
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 124
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-direct {v6, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;-><init>(Lorg/json/JSONObject;)V

    .line 125
    iget-object v0, v3, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->noticeLists:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    const-string v0, " tempNotice="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 120
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 135
    :cond_3
    goto :goto_2

    .line 131
    :catch_1
    move-exception v4

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryCardNoticeResponse JSONException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 134
    const/4 v3, 0x0

    .line 138
    :goto_2
    return-object v3
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;

    move-result-object v0

    return-object v0
.end method
