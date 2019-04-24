.class public Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;>;"
    }
.end annotation


# static fields
.field private static final TASK_COMMANDER:Ljava/lang/String; = "nfc.get.sinature"


# instance fields
.field private final content:Ljava/lang/String;

.field private signType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->content:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 53
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->content:Ljava/lang/String;

    .line 54
    iput-object p4, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->signType:Ljava/lang/String;

    .line 55
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lorg/json/JSONObject;
    .locals 5

    .line 84
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 89
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

    .line 90
    const/4 v3, 0x0

    .line 93
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 94
    const-string v0, "header"

    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    const-string v0, "requestId"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 98
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->content:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 100
    const-string v0, "content"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->content:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->signType:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 104
    const-string v0, "signType"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->signType:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    :cond_2
    goto :goto_0

    .line 107
    :catch_0
    move-exception v4

    .line 109
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 110
    const/4 v3, 0x0

    .line 113
    :goto_0
    return-object v3
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Ljava/lang/String;
    .locals 5

    .line 60
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->content:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    :cond_0
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 63
    const/4 v0, 0x0

    return-object v0

    .line 67
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nfc.get.sinature"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 70
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 72
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 27
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 2

    .line 119
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;-><init>()V

    .line 120
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 122
    const/4 v0, -0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    goto :goto_0

    .line 124
    :cond_0
    const/4 v0, -0x3

    if-ne v0, p1, :cond_1

    .line 126
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    goto :goto_0

    .line 128
    :cond_1
    const/4 v0, -0x2

    if-ne v0, p1, :cond_2

    .line 130
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    goto :goto_0

    .line 132
    :cond_2
    const/4 v0, -0x4

    if-ne v0, p1, :cond_3

    .line 134
    const/4 v0, -0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    .line 136
    :cond_3
    :goto_0
    return-object v1
.end method

.method protected bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 27
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 14

    .line 142
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

    .line 143
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;-><init>()V

    .line 144
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 146
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    .line 147
    return-object v2

    .line 150
    :cond_0
    const/4 v3, 0x0

    .line 153
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 154
    const-string v0, "merchantID"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 155
    const-string v0, "keyIndex"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v5

    .line 156
    const-string v0, "response"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 157
    const-string v0, "errorCode"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 158
    const-string v0, "errorMsg"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 160
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 162
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

    .line 163
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 164
    return-object v2

    .line 167
    :cond_1
    const-string v0, "260086000000068459"

    :try_start_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    if-ne v0, v5, :cond_2

    .line 168
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 170
    :cond_2
    const-string v0, "readSuccessResponse, unexpected error from server."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 171
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 172
    return-object v2

    .line 175
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

    .line 176
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 177
    const-string v0, "returnCode"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 178
    const-string v0, "returnDesc"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 179
    const-string v0, "time"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 180
    const-string v0, "sign"

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 182
    const/4 v0, 0x0

    if-ne v0, v10, :cond_4

    .line 184
    const-string v0, "readSuccessResponse, returnCode is invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 185
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 186
    return-object v2

    .line 189
    :cond_4
    :try_start_3
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    .line 190
    iget v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 192
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

    .line 193
    return-object v2

    .line 196
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

    .line 198
    :cond_6
    const-string v0, "readSuccessResponse, illegal time or sign"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 199
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 200
    return-object v2

    .line 203
    :cond_7
    :try_start_5
    iput-object v12, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->time:Ljava/lang/String;

    .line 204
    iput-object v13, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->sign:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1

    .line 215
    goto :goto_0

    .line 206
    :catch_0
    move-exception v4

    .line 208
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

    .line 209
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    .line 215
    goto :goto_0

    .line 211
    :catch_1
    move-exception v4

    .line 213
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

    .line 214
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    .line 217
    :goto_0
    return-object v2
.end method

.method protected bridge synthetic readSuccessResponse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 27
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    move-result-object v0

    return-object v0
.end method
