.class public Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;>;"
    }
.end annotation


# static fields
.field private static final ISSUER_INFO_GET_COMMANDER:Ljava/lang/String; = "nfc.get.issuers"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;)Lorg/json/JSONObject;
    .locals 5

    .line 49
    if-nez p1, :cond_0

    .line 50
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 54
    const-string v0, "header"

    :try_start_0
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    const-string v0, "timestamp"

    iget-wide v1, p2, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->timeStamp:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_0

    .line 56
    :catch_0
    move-exception v4

    .line 57
    const-string v0, "IssuerInfoQueryTask createDataStr parse json error"

    invoke-static {v0, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    const/4 v3, 0x0

    .line 61
    :goto_0
    return-object v3
.end method

.method private createIssuerInfoItem(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;
    .locals 4

    .line 155
    if-nez p1, :cond_0

    .line 156
    const/4 v0, 0x0

    return-object v0

    .line 158
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;-><init>()V

    .line 160
    const-string v0, "issuerid"

    :try_start_0
    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setIssuerId(Ljava/lang/String;)V

    .line 161
    const-string v0, "name"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setName(Ljava/lang/String;)V

    .line 162
    const-string v0, "description"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setDescription(Ljava/lang/String;)V

    .line 163
    const-string v0, "logo"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setLogoUrl(Ljava/lang/String;)V

    .line 164
    const-string v0, "issuerType"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setIssuerType(I)V

    .line 165
    const-string v0, "supportedProduct"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setSupportType(I)V

    .line 166
    const-string v0, "mode"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setMode(I)V

    .line 167
    const-string v0, "walletVersion"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setWalletVersion(Ljava/lang/String;)V

    .line 168
    const-string v0, "contactNumber"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setContactNumber(Ljava/lang/String;)V

    .line 169
    const-string v0, "debitCallCenterNumber"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setDebitCallCenterNumber(Ljava/lang/String;)V

    .line 170
    const-string v0, "creditCallCenterNumber"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setCreditCallCenterNumber(Ljava/lang/String;)V

    .line 171
    const-string v0, "debitTcUrl"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setDebitTcUrl(Ljava/lang/String;)V

    .line 172
    const-string v0, "creditTcUrl"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setCreditTcUrl(Ljava/lang/String;)V

    .line 173
    const-string v0, "debitWebsite"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setDebitWebsite(Ljava/lang/String;)V

    .line 174
    const-string v0, "creditWebsite"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setCreditWebsite(Ljava/lang/String;)V

    .line 175
    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getLongValue(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setTimeStamp(J)V

    .line 176
    const-string v0, "appInfo"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setAppInfo(Ljava/lang/String;)V

    .line 177
    const-string v0, "reserved"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setReservedInfo(Ljava/lang/String;)V

    .line 178
    const-string v0, "sn"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setSn(I)V

    .line 179
    const-string v0, "cityCode"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setCityCode(Ljava/lang/String;)V

    .line 180
    const-string v0, "payType"

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->setPayType(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_0

    .line 181
    :catch_0
    move-exception v3

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssuerInfoQueryTask createIssuerInfoItem JSONException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 183
    const/4 v2, 0x0

    .line 185
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;)Ljava/lang/String;
    .locals 5

    .line 33
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    :cond_0
    const-string v0, "IssuerInfoQueryTask prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 36
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nfc.get.issuers"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 43
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 45
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;
    .locals 2

    .line 66
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;-><init>()V

    .line 67
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    .line 68
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 69
    const/4 v0, -0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    goto :goto_0

    .line 70
    :cond_0
    const/4 v0, -0x3

    if-ne v0, p1, :cond_1

    .line 71
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    goto :goto_0

    .line 72
    :cond_1
    const/4 v0, -0x2

    if-ne v0, p1, :cond_2

    .line 73
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    goto :goto_0

    .line 74
    :cond_2
    const/4 v0, -0x4

    if-ne v0, p1, :cond_3

    .line 75
    const/4 v0, -0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    .line 77
    :cond_3
    :goto_0
    return-object v1
.end method

.method protected bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;
    .locals 16

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssuerInfoQueryTask readSuccessResponse response str : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 83
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;-><init>()V

    .line 84
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    const-string v0, "IssuerInfoQueryTask readSuccessResponse responseStr is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 86
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    .line 87
    return-object v2

    .line 89
    :cond_0
    const/4 v3, 0x0

    .line 91
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 92
    const-string v0, "merchantID"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 93
    const-string v0, "keyIndex"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v5

    .line 94
    const-string v0, "response"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 95
    const-string v0, "errorCode"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 96
    const-string v0, "errorMsg"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 98
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssuerInfoQueryTask readSuccessResponse, error code : "

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

    .line 100
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 101
    return-object v2

    .line 104
    :cond_1
    const-string v0, "260086000000068459"

    :try_start_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    if-ne v0, v5, :cond_2

    .line 105
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    :cond_2
    const-string v0, "IssuerInfoQueryTask readSuccessResponse, unexpected error from server."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 107
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    return-object v2

    .line 111
    :cond_3
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssuerInfoQueryTask readSuccessResponse, responseDataStr : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 112
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 113
    const-string v0, "returnCode"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 114
    const-string v0, "returnDesc"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 116
    const/4 v0, 0x0

    if-ne v0, v10, :cond_4

    .line 117
    const-string v0, "IssuerInfoQueryTask readSuccessResponse, returnCode is invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 118
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 119
    return-object v2

    .line 122
    :cond_4
    :try_start_3
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    .line 123
    iget v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssuerInfoQueryTask readSuccessResponse, returnDesc : "

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

    .line 125
    return-object v2

    .line 128
    :cond_5
    const/4 v12, 0x0

    .line 129
    const-string v0, "data"

    :try_start_4
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 130
    const-string v0, "data"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    .line 132
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v12, :cond_8

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->issueInfos:Ljava/util/List;

    .line 134
    const/4 v13, 0x0

    .line 135
    const/4 v14, 0x0

    .line 136
    const/4 v15, 0x0

    :goto_0
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v15, v0, :cond_8

    .line 137
    invoke-virtual {v12, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 138
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;->createIssuerInfoItem(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;

    move-result-object v14

    .line 139
    const/4 v0, 0x0

    if-eq v0, v14, :cond_7

    .line 140
    iget-object v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->issueInfos:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 136
    :cond_7
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 150
    :cond_8
    goto :goto_1

    .line 144
    :catch_0
    move-exception v4

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssuerInfoQueryTask readSuccessResponse, NumberFormatException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 146
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    .line 150
    goto :goto_1

    .line 147
    :catch_1
    move-exception v4

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssuerInfoQueryTask readSuccessResponse, JSONException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 149
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    .line 151
    :goto_1
    return-object v2
.end method

.method protected bridge synthetic readSuccessResponse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;->readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;

    move-result-object v0

    return-object v0
.end method
