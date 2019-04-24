.class public Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "get.apdu"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;)Lorg/json/JSONObject;
    .locals 7

    .line 68
    if-nez p1, :cond_0

    .line 70
    const-string v0, "ServerAccessApplyAPDUTask createDataStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 71
    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_0
    const/4 v2, 0x0

    .line 77
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 78
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v0, "appletAid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getAppletAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string v0, "transactionid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    const-string v0, "apduCount"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getApduCount()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 84
    const-string v0, "seChipManuFacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    const-string v0, "deviceModel"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 87
    const/4 v4, 0x0

    .line 88
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getApduList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    .line 90
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 91
    const-string v0, "apduNo"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    const-string v0, "apduContent"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduStatus()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    const-string v0, "apduStatus"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getCommand()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 99
    const-string v0, "command"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getCommand()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    :cond_2
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getChecker()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 103
    const-string v0, "checker"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getChecker()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    :cond_3
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 106
    goto/16 :goto_0

    .line 107
    :cond_4
    const-string v0, "apduList"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 111
    const-string v0, "partnerId"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getCurrentStep()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 116
    const-string v0, "currentStep"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getCurrentStep()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 121
    const-string v0, "phoneNumber"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 126
    const-string v0, "reserved"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getReserved()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :cond_8
    goto :goto_1

    .line 129
    :catch_0
    move-exception v3

    .line 131
    const-string v0, "ServerAccessApplyAPDUTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 132
    const/4 v2, 0x0

    .line 135
    :goto_1
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;)Ljava/lang/String;
    .locals 5

    .line 46
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getTransactionId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getApduList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getApduList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getApduCount()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getApduList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 50
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    :cond_0
    const-string v0, "ServerAccessApplyAPDUTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 54
    const/4 v0, 0x0

    return-object v0

    .line 58
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "get.apdu"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 61
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 63
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;
    .locals 1

    .line 141
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;-><init>()V

    .line 142
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->returnCode:I

    .line 143
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;
    .locals 8

    .line 149
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;-><init>()V

    .line 150
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->returnCode:I

    .line 151
    invoke-virtual {v1, p2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->setResultDesc(Ljava/lang/String;)V

    .line 152
    const/4 v0, 0x0

    if-ne v0, p1, :cond_5

    .line 156
    const/4 v2, 0x0

    .line 157
    const-string v0, "apduList"

    :try_start_0
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    const-string v0, "apduList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 161
    :cond_0
    const-string v0, "nextStep"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    const-string v0, "nextStep"

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->setNextStep(Ljava/lang/String;)V

    .line 165
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 167
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 168
    const/4 v4, 0x0

    .line 169
    const/4 v5, 0x0

    .line 170
    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_3

    .line 172
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 173
    invoke-static {v5}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    move-result-object v4

    .line 174
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 176
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 179
    :cond_3
    invoke-virtual {v1, v3}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->setApduList(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    :cond_4
    goto :goto_1

    .line 182
    :catch_0
    move-exception v2

    .line 184
    const-string v0, "ServerAccessApplyAPDUTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 185
    const/16 v0, -0x63

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->returnCode:I

    .line 188
    :cond_5
    :goto_1
    return-object v1
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;

    move-result-object v0

    return-object v0
.end method
