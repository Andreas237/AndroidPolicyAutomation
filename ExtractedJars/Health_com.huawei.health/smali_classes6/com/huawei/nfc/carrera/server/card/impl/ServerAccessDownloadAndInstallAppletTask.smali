.class public Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "download.install.app"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 40
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 65
    if-nez p1, :cond_0

    .line 67
    const-string v0, "ServerAccessDownloadAndInstallAppletTask createDataStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    const/4 v2, 0x0

    .line 74
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 75
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    const-string v0, "appletAid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    const-string v0, "seChipManuFacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v0, "deviceModel"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getOrderId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    const-string v0, "orderNo"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    const-string v0, "phoneNumber"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getUserID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 91
    const-string v0, "userid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getImei()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 95
    const-string v0, "imei"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getImei()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 99
    const-string v0, "phoneManufacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 103
    const-string v0, "reserved"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getReserved()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 107
    const-string v0, "appCode"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 111
    const-string v0, "partnerId"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    :cond_8
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getOnlyCap()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_9

    .line 115
    const-string v0, "onlyCap"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getOnlyCap()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :cond_9
    goto :goto_0

    .line 118
    :catch_0
    move-exception v3

    .line 120
    const-string v0, "ServerAccessDownloadAndInstallAppletTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 121
    const/4 v2, 0x0

    .line 124
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;)Ljava/lang/String;
    .locals 5

    .line 45
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 46
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    :cond_0
    const-string v0, "ServerAccessDownloadAndInstallAppletTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "download.install.app"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 58
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 60
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;
    .locals 1

    .line 130
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;-><init>()V

    .line 131
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->returnCode:I

    .line 132
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;
    .locals 8

    .line 140
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;-><init>()V

    .line 141
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->returnCode:I

    .line 142
    invoke-virtual {v1, p2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->setResultDesc(Ljava/lang/String;)V

    .line 143
    const/4 v0, 0x0

    if-ne v0, p1, :cond_6

    .line 147
    const-string v0, "transactionid"

    :try_start_0
    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->setTransactionId(Ljava/lang/String;)V

    .line 148
    const-string v0, "nextStep"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const-string v0, "nextStep"

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->setNextStep(Ljava/lang/String;)V

    .line 153
    :cond_0
    const/4 v2, 0x0

    .line 154
    const-string v0, "apduList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    const-string v0, "apduList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 158
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 160
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 161
    const/4 v4, 0x0

    .line 162
    const/4 v5, 0x0

    .line 163
    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_3

    .line 165
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 166
    invoke-static {v5}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    move-result-object v4

    .line 167
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 169
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 172
    :cond_3
    invoke-virtual {v1, v3}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->setApduList(Ljava/util/List;)V

    .line 174
    :cond_4
    const-string v0, "noNeedCommandResp"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 176
    const-string v0, "noNeedCommandResp"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->setNoNeedCommandResp(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :cond_5
    goto :goto_1

    .line 179
    :catch_0
    move-exception v2

    .line 181
    const-string v0, "ServerAccessDownloadAndInstallAppletTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 182
    const/16 v0, -0x63

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->returnCode:I

    .line 185
    :cond_6
    :goto_1
    return-object v1
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;

    move-result-object v0

    return-object v0
.end method
