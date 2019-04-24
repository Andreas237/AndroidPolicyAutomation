.class public Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "personalized"

.field private static final MAX_SYS_VERSION_LEN:I = 0x10


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 66
    if-nez p1, :cond_0

    .line 68
    const-string v0, "ServerAccessPersonalizeAppletTask createDataStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 69
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    const/4 v2, 0x0

    .line 75
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 76
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    const-string v0, "appletAid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v0, "orderNo"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v0, "deviceModel"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string v0, "seChipManuFacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 85
    const-string v0, "phoneNumber"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getUserID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 89
    const-string v0, "userid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getBasebandVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 93
    const-string v0, "basebandVersion"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getBasebandVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSystemType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 97
    const-string v0, "systemType"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSystemType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSystemVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 101
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSystemVersion()Ljava/lang/String;

    move-result-object v3

    .line 102
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_5

    .line 103
    const/4 v0, 0x0

    const/16 v1, 0xf

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 105
    :cond_5
    const-string v0, "systemVersion"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSeCosVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 109
    const-string v0, "seCosVersion"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSeCosVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getImei()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 113
    const-string v0, "imei"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getImei()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    :cond_8
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_9

    .line 117
    const-string v0, "phoneManufacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    :cond_9
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_a

    .line 121
    const-string v0, "reserved"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getReserved()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    :cond_a
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    .line 125
    const-string v0, "appCode"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 127
    :cond_b
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_c

    .line 129
    const-string v0, "partnerId"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :cond_c
    goto :goto_0

    .line 132
    :catch_0
    move-exception v3

    .line 134
    const-string v0, "ServerAccessPersonalizeAppletTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 135
    const/4 v2, 0x0

    .line 138
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;)Ljava/lang/String;
    .locals 5

    .line 46
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getOrderId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    :cond_0
    const-string v0, "ServerAccessPersonalizeAppletTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 52
    const/4 v0, 0x0

    return-object v0

    .line 56
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "personalized"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 59
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 61
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 28
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;
    .locals 1

    .line 144
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;-><init>()V

    .line 145
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->returnCode:I

    .line 146
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;
    .locals 8

    .line 154
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;-><init>()V

    .line 155
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->returnCode:I

    .line 156
    invoke-virtual {v1, p2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->setResultDesc(Ljava/lang/String;)V

    .line 157
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    .line 161
    const-string v0, "transactionid"

    :try_start_0
    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->setTransactionId(Ljava/lang/String;)V

    .line 162
    const-string v0, "cardNo"

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->setCardId(Ljava/lang/String;)V

    .line 164
    const/4 v2, 0x0

    .line 165
    const-string v0, "apduList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    const-string v0, "apduList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 169
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 171
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 172
    const/4 v4, 0x0

    .line 173
    const/4 v5, 0x0

    .line 174
    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_2

    .line 176
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 177
    invoke-static {v5}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    move-result-object v4

    .line 178
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 180
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 183
    :cond_2
    invoke-virtual {v1, v3}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->setApduList(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    :cond_3
    goto :goto_1

    .line 186
    :catch_0
    move-exception v2

    .line 188
    const-string v0, "ServerAccessPersonalizeAppletTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 189
    const/16 v0, -0x63

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->returnCode:I

    .line 192
    :cond_4
    :goto_1
    return-object v1
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 28
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;

    move-result-object v0

    return-object v0
.end method
