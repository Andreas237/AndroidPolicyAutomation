.class public Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;>;"
    }
.end annotation


# static fields
.field private static final APPLY_UP_CARD_COMMANDER:Ljava/lang/String; = "nfc.cardRoll"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;)Lorg/json/JSONObject;
    .locals 6

    .line 48
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getCardInfor()Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 50
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createDataStr headerStr : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 54
    const/4 v4, 0x0

    .line 57
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 58
    const-string v0, "header"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    const-string v0, "tsmChannel"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 62
    const-string v0, "cardInfo"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getCardInfor()Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;->toJasonString()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    const-string v0, "tncStatus"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getTncStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    const-string v0, "requestId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    const-string v0, "riskInfo"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getRiskInfo()Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->toJasonString()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 68
    :catch_0
    move-exception v5

    .line 70
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 71
    const/4 v4, 0x0

    .line 74
    :goto_0
    return-object v4
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;)Ljava/lang/String;
    .locals 5

    .line 31
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getCardInfor()Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 33
    :cond_0
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 34
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nfc.cardRoll"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 41
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 43
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 19
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;
    .locals 2

    .line 80
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;-><init>()V

    .line 81
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 83
    const/4 v0, -0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    goto :goto_0

    .line 85
    :cond_0
    const/4 v0, -0x3

    if-ne v0, p1, :cond_1

    .line 87
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    goto :goto_0

    .line 89
    :cond_1
    const/4 v0, -0x2

    if-ne v0, p1, :cond_2

    .line 91
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    goto :goto_0

    .line 93
    :cond_2
    const/4 v0, -0x4

    if-ne v0, p1, :cond_3

    .line 95
    const/4 v0, -0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    .line 97
    :cond_3
    :goto_0
    return-object v1
.end method

.method protected bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;
    .locals 12

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse response str : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 104
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;-><init>()V

    .line 105
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 107
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    .line 108
    return-object v2

    .line 111
    :cond_0
    const/4 v3, 0x0

    .line 114
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 115
    const-string v0, "merchantID"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 116
    const-string v0, "keyIndex"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v5

    .line 117
    const-string v0, "response"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 118
    const-string v0, "errorCode"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 119
    const-string v0, "errorMsg"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 121
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, error code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "error msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 124
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 125
    return-object v2

    .line 128
    :cond_1
    const-string v0, "260086000000068459"

    :try_start_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    if-ne v0, v5, :cond_2

    .line 129
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 131
    :cond_2
    const-string v0, "readSuccessResponse, unexpected error from server."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 132
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 133
    return-object v2

    .line 136
    :cond_3
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, responseDataStr : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 137
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 138
    const-string v0, "returnCode"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 139
    const-string v0, "returnDesc"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 141
    const/4 v0, 0x0

    if-ne v0, v10, :cond_4

    .line 143
    const-string v0, "readSuccessResponse, returnCode is invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 144
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 145
    return-object v2

    .line 148
    :cond_4
    :try_start_3
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    .line 149
    iget v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, returnDesc : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 152
    return-object v2

    .line 155
    :cond_5
    :try_start_4
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    const-string v1, "cardMetadata"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    .line 156
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    const-string v1, "virtualCardMetadata"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 167
    goto :goto_0

    .line 158
    :catch_0
    move-exception v4

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, NumberFormatException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 161
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    .line 167
    goto :goto_0

    .line 163
    :catch_1
    move-exception v4

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, JSONException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 166
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    .line 169
    :goto_0
    return-object v2
.end method

.method protected bridge synthetic readSuccessResponse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;->readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;

    move-result-object v0

    return-object v0
.end method
