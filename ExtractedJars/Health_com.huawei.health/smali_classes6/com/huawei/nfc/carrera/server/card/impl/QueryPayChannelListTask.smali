.class public Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "nfc.get.paytype"

.field private static final ISSUERID_MAX_LENGTH:I = 0x10


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 36
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 129
    if-nez p1, :cond_0

    .line 131
    const-string v0, "QueryPayChannelListTask createDataStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 132
    const/4 v0, 0x0

    return-object v0

    .line 135
    :cond_0
    const/4 v2, 0x0

    .line 138
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 139
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 143
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 147
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getTerminal()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 151
    const-string v0, "terminal"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getTerminal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getClientVersion()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 155
    const-string v0, "clientVersion"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getClientVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :cond_4
    goto :goto_0

    .line 158
    :catch_0
    move-exception v3

    .line 160
    const-string v0, "QueryPayChannelListTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 161
    const/4 v2, 0x0

    .line 164
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;)Ljava/lang/String;
    .locals 5

    .line 40
    if-eqz p1, :cond_0

    .line 41
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getTerminal()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    :cond_0
    const-string v0, "QueryPayChannelListTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-le v0, v1, :cond_2

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryPayChannelListTask issuerid invalid, issuerid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->setClientVersion(Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nfc.get.paytype"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 59
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 61
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 24
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;
    .locals 1

    .line 116
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;-><init>()V

    .line 117
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->returnCode:I

    .line 118
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;
    .locals 9

    .line 69
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;-><init>()V

    .line 70
    iput p1, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->returnCode:I

    .line 71
    invoke-virtual {v2, p2}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->setResultDesc(Ljava/lang/String;)V

    .line 72
    const/4 v0, 0x0

    if-ne v0, p1, :cond_5

    .line 73
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 74
    const-string v0, " QueryPayChannelListTask readSuccessResponse params error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 75
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->returnCode:I

    .line 76
    return-object v2

    .line 80
    :cond_0
    const-string v0, "payType"

    :try_start_0
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    const-string v0, "payType"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->setPayType(Ljava/lang/String;)V

    .line 85
    :cond_1
    const-string v0, "promotionInfoList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 87
    const-string v0, "promotionInfoList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 88
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    .line 89
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 90
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_3

    .line 92
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 93
    invoke-static {v7}, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->build(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;

    move-result-object v8

    .line 94
    if-eqz v8, :cond_2

    .line 96
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 99
    :cond_3
    invoke-virtual {v2, v5}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->setPromotionInfoList(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :cond_4
    goto :goto_1

    .line 103
    :catch_0
    move-exception v3

    .line 105
    const-string v0, "QueryPayChannelListTask readSuccessResponse exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 106
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->returnCode:I

    .line 110
    :cond_5
    :goto_1
    return-object v2
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;

    move-result-object v0

    return-object v0
.end method
