.class public Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "create.order"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 69
    if-nez p1, :cond_0

    .line 71
    const-string v0, "ServerAccessApplyOrderTask createDataStr, invalid param"

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

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string v0, "appletAid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    const-string v0, "payType"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getPayType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    const-string v0, "changeType"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getScene()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    const-string v0, "deviceModel"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    const-string v0, "seChipManuFacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getTheoreticalIssuePayment()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 89
    const-string v0, "priceEnroll"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getTheoreticalIssuePayment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getActualIssuePayment()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 93
    const-string v0, "amountEnroll"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getActualIssuePayment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getTheoreticalRecharegePayment()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 97
    const-string v0, "priceRecharge"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getTheoreticalRecharegePayment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getActualRecharegePayment()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 101
    const-string v0, "amountRecharge"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getActualRecharegePayment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getUserID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 105
    const-string v0, "userid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 109
    const-string v0, "phoneNumber"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getCardId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 113
    const-string v0, "cardNo"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getCardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getCurrency()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 117
    const-string v0, "currency"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getCurrency()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    :cond_8
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_9

    .line 121
    const-string v0, "reserved"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getReserved()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    :cond_9
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_a

    .line 124
    const-string v0, "appCode"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    :cond_a
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    .line 127
    const-string v0, "partnerId"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :cond_b
    goto :goto_0

    .line 131
    :catch_0
    move-exception v3

    .line 133
    const-string v0, "ServerAccessApplyOrderTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 134
    const/4 v2, 0x0

    .line 137
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;)Ljava/lang/String;
    .locals 5

    .line 46
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getPayType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getScene()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    :cond_0
    const-string v0, "ServerAccessApplyOrderTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 55
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create.order"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 62
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 64
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;
    .locals 1

    .line 143
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;-><init>()V

    .line 144
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->returnCode:I

    .line 145
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;
    .locals 8

    .line 152
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;-><init>()V

    .line 153
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->returnCode:I

    .line 154
    invoke-virtual {v1, p2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->setResultDesc(Ljava/lang/String;)V

    .line 155
    const/4 v0, 0x0

    if-ne v0, p1, :cond_8

    .line 159
    const/4 v2, 0x0

    .line 160
    const-string v0, "orderList"

    :try_start_0
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    const-string v0, "orderList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 164
    :cond_0
    const-string v0, "cupOrderList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    const-string v0, "cupOrderList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 168
    :cond_1
    const-string v0, "wechatOrderList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    const-string v0, "wechatOrderList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 172
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    .line 174
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 175
    const/4 v4, 0x0

    .line 176
    const/4 v5, 0x0

    .line 177
    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_4

    .line 179
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 180
    invoke-static {v5}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;

    move-result-object v4

    .line 181
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 183
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 186
    :cond_4
    invoke-virtual {v1, v3}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->setOrderList(Ljava/util/List;)V

    .line 188
    :cond_5
    const-string v0, "appCode"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 190
    const-string v0, "appCode"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->setAppCode(Ljava/lang/String;)V

    .line 193
    :cond_6
    const-string v0, "wechatOrderList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 195
    const-string v0, "wechatOrderList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->setWxOrderListJsonString(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :cond_7
    goto :goto_1

    .line 198
    :catch_0
    move-exception v2

    .line 200
    const-string v0, "ServerAccessApplyOrderTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 201
    const/16 v0, -0x63

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->returnCode:I

    .line 204
    :cond_8
    :goto_1
    return-object v1
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;

    move-result-object v0

    return-object v0
.end method
