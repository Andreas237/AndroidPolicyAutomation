.class public Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final NFC_PUSH_MSG_CONTENT_KEY:Ljava/lang/String; = "content"

.field private static final NFC_PUSH_MSG_TYPE_KEY:Ljava/lang/String; = "msg"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private parseCUPPMsg(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 214
    const/4 v1, 0x0

    .line 217
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    .line 222
    goto :goto_0

    .line 219
    :catch_0
    move-exception v2

    .line 221
    const-string v0, "parseCUPPMsg, get json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 224
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 226
    const-string v0, "parseCUPPMsg, jsonobject is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 227
    const/4 v0, 0x0

    return-object v0

    .line 230
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;-><init>()V

    .line 231
    const-string v0, "cplc"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->setCplc(Ljava/lang/String;)V

    .line 232
    const-string v0, "aid"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->setAid(Ljava/lang/String;)V

    .line 233
    const-string v0, "cardRefId"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->setVirtualCardRefID(Ljava/lang/String;)V

    .line 235
    return-object v2
.end method

.method private parsePushCUPOperateMsg(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 174
    const/4 v1, 0x0

    .line 177
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    .line 182
    goto :goto_0

    .line 179
    :catch_0
    move-exception v2

    .line 181
    const-string v0, "parsPushConsumeMsg, get json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 184
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 186
    const-string v0, "parsPushConsumeMsg, jsonobject is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 187
    const/4 v0, 0x0

    return-object v0

    .line 190
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;-><init>()V

    .line 191
    const-string v0, "cplc"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->setCplc(Ljava/lang/String;)V

    .line 192
    const-string v0, "virtualCards"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringArrayValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->setVirtualCards(Ljava/util/ArrayList;)V

    .line 194
    const-string v0, "tsmLibData"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 195
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 197
    const-string v0, "ssid"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->setSsid(Ljava/lang/String;)V

    .line 198
    const-string v0, "sign"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->setSign(Ljava/lang/String;)V

    .line 199
    const-string v0, "event"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->setEvent(Ljava/lang/String;)V

    .line 202
    :cond_1
    return-object v2
.end method

.method private parsePushConsumeMsg(Ljava/lang/String;)Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;
    .locals 3

    .line 138
    const/4 v1, 0x0

    .line 141
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    .line 146
    goto :goto_0

    .line 143
    :catch_0
    move-exception v2

    .line 145
    const-string v0, "parsPushConsumeMsg, get json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 148
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 150
    const-string v0, "parsPushConsumeMsg, jsonobject is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 151
    const/4 v0, 0x0

    return-object v0

    .line 154
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;-><init>()V

    .line 155
    const-string v0, "cplc"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->setCplc(Ljava/lang/String;)V

    .line 156
    const-string v0, "time"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->setConsumeTime(Ljava/lang/String;)V

    .line 157
    const-string v0, "amount"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->setConsumeAccount(Ljava/lang/String;)V

    .line 158
    const-string v0, "currency"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->setCurrency(Ljava/lang/String;)V

    .line 159
    const-string v0, "merchantName"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->setMerchantName(Ljava/lang/String;)V

    .line 160
    const-string v0, "productName"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->setProductName(Ljava/lang/String;)V

    .line 162
    return-object v2
.end method

.method private parsePushLostMsg(Ljava/lang/String;)Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;
    .locals 3

    .line 104
    const/4 v1, 0x0

    .line 107
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    .line 112
    goto :goto_0

    .line 109
    :catch_0
    move-exception v2

    .line 111
    const-string v0, "parsePushLostMsg, get json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 114
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 116
    const-string v0, "parsePushLostMsg, jsonobject is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 117
    const/4 v0, 0x0

    return-object v0

    .line 120
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;-><init>()V

    .line 121
    const-string v0, "aid"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->setAid(Ljava/lang/String;)V

    .line 122
    const-string v0, "cplc"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->setCplc(Ljava/lang/String;)V

    .line 123
    const-string v0, "status"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->setStatus(Ljava/lang/String;)V

    .line 124
    const-string v0, "dpanid"

    invoke-static {v1, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->setDpanid(Ljava/lang/String;)V

    .line 126
    return-object v2
.end method


# virtual methods
.method public parsePushMessage(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parsePushMessage, content: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 42
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_0
    const/4 v2, 0x0

    .line 50
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 55
    goto :goto_0

    .line 52
    :catch_0
    move-exception v3

    .line 54
    const-string v0, "parsePushMessage, get json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 57
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 59
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_1
    const-string v0, "msg"

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 63
    const-string v0, "content"

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 64
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    const-string v0, "parsePushMessage, content is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 67
    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_2
    const/4 v5, 0x0

    .line 71
    const-string v0, "reportloss"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 73
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;->parsePushLostMsg(Ljava/lang/String;)Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;

    move-result-object v5

    goto :goto_1

    .line 75
    :cond_3
    const-string v0, "consume"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 77
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;->parsePushConsumeMsg(Ljava/lang/String;)Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;

    move-result-object v5

    goto :goto_1

    .line 79
    :cond_4
    const-string v0, "UnionPayPush"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 81
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;->parsePushCUPOperateMsg(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_1

    .line 83
    :cond_5
    const-string v0, "personizedPush"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 85
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;->parseCUPPMsg(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_1

    .line 89
    :cond_6
    const-string v0, "the push msg type do not supported, now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 92
    :goto_1
    return-object v5
.end method
