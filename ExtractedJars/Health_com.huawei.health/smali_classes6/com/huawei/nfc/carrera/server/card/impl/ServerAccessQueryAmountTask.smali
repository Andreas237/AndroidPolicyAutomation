.class public Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "get.rechargecard"

.field private static final TAG:Ljava/lang/String; = "ServerAccessQueryAmountTask"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 69
    if-nez p1, :cond_0

    .line 71
    const-string v0, "ServerAccessQueryAmountTask createDataStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 72
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_0
    const/4 v2, 0x0

    .line 78
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 79
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v0, "flag"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    const-string v0, "appletAid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    const-string v0, "deviceModel"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    const-string v0, "seChipManuFacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_0

    .line 87
    :catch_0
    move-exception v3

    .line 89
    const-string v0, "ServerAccessQueryAmountTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 90
    const/4 v2, 0x0

    .line 93
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;)Ljava/lang/String;
    .locals 5

    .line 49
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getFlag()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    :cond_0
    const-string v0, "ServerAccessQueryAmountTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 55
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "get.rechargecard"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 62
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 64
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 30
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;
    .locals 1

    .line 99
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;-><init>()V

    .line 100
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->returnCode:I

    .line 101
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 30
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;
    .locals 12

    .line 109
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;-><init>()V

    .line 110
    iput p1, v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->returnCode:I

    .line 111
    invoke-virtual {v4, p2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->setResultDesc(Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x0

    if-ne v0, p1, :cond_8

    .line 116
    const/4 v5, 0x0

    .line 117
    const-string v0, "rechargeCardList"

    :try_start_0
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    const-string v0, "rechargeCardList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 121
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 123
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 124
    const/4 v7, 0x0

    .line 125
    const/4 v8, 0x0

    .line 126
    const/4 v9, 0x0

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v10

    :goto_0
    if-ge v9, v10, :cond_2

    .line 128
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 129
    const-string v0, "ServerAccessQueryAmountTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readSuccessResponse jObject : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    invoke-static {v8}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;

    move-result-object v7

    .line 131
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 133
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {v4, v6}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->setRechargeAmountList(Ljava/util/List;)V

    .line 139
    :cond_3
    const/4 v6, 0x0

    .line 140
    const-string v0, "transportationCardList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 142
    const-string v0, "transportationCardList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 144
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v6, :cond_7

    .line 146
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 147
    const/4 v8, 0x0

    .line 148
    const/4 v9, 0x0

    .line 149
    const/4 v10, 0x0

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v11

    :goto_1
    if-ge v10, v11, :cond_6

    .line 151
    invoke-virtual {v6, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 152
    invoke-static {v9}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;

    move-result-object v8

    .line 153
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 155
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 158
    :cond_6
    invoke-virtual {v4, v7}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->setIssueAmountList(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    :cond_7
    goto :goto_2

    .line 161
    :catch_0
    move-exception v5

    .line 163
    const-string v0, "ServerAccessQueryAmountTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 164
    const/16 v0, -0x63

    iput v0, v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->returnCode:I

    .line 167
    :cond_8
    :goto_2
    return-object v4
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 30
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;

    move-result-object v0

    return-object v0
.end method
