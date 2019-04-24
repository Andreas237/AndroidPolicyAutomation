.class public Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;>;"
    }
.end annotation


# static fields
.field static final TASK_COMMANDER_CREATE_SSD:Ljava/lang/String; = "nfc.get.create.SSD"

.field static final TASK_COMMANDER_DEL_APP:Ljava/lang/String; = "nfc.get.del.APP"

.field static final TASK_COMMANDER_DEL_SSD:Ljava/lang/String; = "nfc.get.del.SSD"

.field static final TASK_COMMANDER_INFO_INIT:Ljava/lang/String; = "nfc.get.NotifyInfoInit"

.field static final TASK_COMMANDER_INSTALL_APP:Ljava/lang/String; = "nfc.get.install.APP"

.field static final TASK_COMMANDER_LOCK_APP:Ljava/lang/String; = "nfc.get.lock.APP"

.field static final TASK_COMMANDER_SYNC_INFO:Ljava/lang/String; = "nfc.get.NotifyEseInfoSync"

.field static final TASK_COMMANDER_UNLOCK_APP:Ljava/lang/String; = "nfc.get.unlock.APP"

.field static final TASK_COMMANDER_UNLOCK_ESE:Ljava/lang/String; = "nfc.se.unlock"

.field static final TASK_COMMANDER_UPDATE_APP:Ljava/lang/String; = "nfc.get.transit.temp.update.APP"

.field private static final TSM_CHANNEL_HUAWEI:I = 0x0


# instance fields
.field private final paramType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 90
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->paramType:Ljava/lang/String;

    .line 91
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 5

    .line 122
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 124
    const/4 v0, 0x0

    return-object v0

    .line 127
    :cond_0
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

    .line 128
    const/4 v3, 0x0

    .line 131
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 132
    const-string v0, "header"

    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    const-string v0, "requestId"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 137
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 144
    const-string v0, "aid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 147
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getTerminal()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 149
    const-string v0, "terminal"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getTerminal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 154
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 158
    :cond_4
    const-string v0, "tsmChannel"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 161
    invoke-static {p3}, Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;->getSignCommand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 163
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 165
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getBankSignResult()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 167
    const-string v0, "sign"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getBankSignResult()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getBankSignTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 173
    const-string v0, "content"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getBankSignTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 177
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getBankRsaIndex()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 179
    const-string v0, "rsaindex"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getBankRsaIndex()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 182
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getSignType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 184
    const-string v0, "signType"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getSignType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 187
    :cond_8
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->isDeleteRelatedObjects()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 189
    const-string v0, "deleteRelatedObjects"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->isDeleteRelatedObjects()Z

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 192
    :cond_9
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getTsmParamIMEI()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_a

    .line 194
    const-string v0, "imei"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getTsmParamIMEI()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createDataStr, dataJson: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    goto :goto_0

    .line 200
    :catch_0
    move-exception v4

    .line 202
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 203
    const/4 v3, 0x0

    .line 206
    :goto_0
    return-object v3
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Ljava/lang/String;
    .locals 5

    .line 96
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getTerminal()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->paramType:Ljava/lang/String;

    .line 98
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    :cond_0
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 101
    const/4 v0, 0x0

    return-object v0

    .line 105
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->paramType:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 108
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->paramType:Ljava/lang/String;

    invoke-direct {p0, v3, p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 110
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 24
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 2

    .line 212
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;-><init>()V

    .line 213
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 215
    const/4 v0, -0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    goto :goto_0

    .line 217
    :cond_0
    const/4 v0, -0x3

    if-ne v0, p1, :cond_1

    .line 219
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    goto :goto_0

    .line 221
    :cond_1
    const/4 v0, -0x2

    if-ne v0, p1, :cond_2

    .line 223
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    goto :goto_0

    .line 225
    :cond_2
    const/4 v0, -0x4

    if-ne v0, p1, :cond_3

    .line 227
    const/4 v0, -0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    .line 229
    :cond_3
    :goto_0
    return-object v1
.end method

.method protected bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 14

    .line 235
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

    .line 236
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;-><init>()V

    .line 237
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 239
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    .line 240
    return-object v2

    .line 243
    :cond_0
    const/4 v3, 0x0

    .line 246
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 247
    const-string v0, "merchantID"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 248
    const-string v0, "keyIndex"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v5

    .line 249
    const-string v0, "response"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 250
    const-string v0, "errorCode"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 251
    const-string v0, "errorMsg"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 253
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 255
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

    .line 256
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 257
    return-object v2

    .line 260
    :cond_1
    const-string v0, "260086000000068459"

    :try_start_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    if-ne v0, v5, :cond_2

    .line 261
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 263
    :cond_2
    const-string v0, "readSuccessResponse, unexpected error from server."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 264
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 265
    return-object v2

    .line 268
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

    .line 269
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 270
    const-string v0, "returnCode"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 271
    const-string v0, "returnDesc"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 272
    const-string v0, "funcID"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 273
    const-string v0, "servicID"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 275
    const/4 v0, 0x0

    if-ne v0, v10, :cond_4

    .line 277
    const-string v0, "readSuccessResponse, returnCode is invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 278
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 279
    return-object v2

    .line 282
    :cond_4
    :try_start_3
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    .line 283
    iget v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 285
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

    .line 286
    return-object v2

    .line 289
    :cond_5
    const/4 v0, 0x1

    :try_start_4
    invoke-static {v12, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x1

    invoke-static {v13, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 291
    :cond_6
    const-string v0, "readSuccessResponse, illegal funcID or servicID"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 292
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 293
    return-object v2

    .line 296
    :cond_7
    :try_start_5
    iput-object v12, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->funcID:Ljava/lang/String;

    .line 297
    iput-object v13, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->servicID:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1

    .line 308
    goto :goto_0

    .line 299
    :catch_0
    move-exception v4

    .line 301
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

    .line 302
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    .line 308
    goto :goto_0

    .line 304
    :catch_1
    move-exception v4

    .line 306
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

    .line 307
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    .line 310
    :goto_0
    return-object v2
.end method

.method protected bridge synthetic readSuccessResponse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    move-result-object v0

    return-object v0
.end method
