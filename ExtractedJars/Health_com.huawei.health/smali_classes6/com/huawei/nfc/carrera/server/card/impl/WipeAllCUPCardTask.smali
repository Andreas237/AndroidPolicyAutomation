.class public Lcom/huawei/nfc/carrera/server/card/impl/WipeAllCUPCardTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask<Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;>;"
    }
.end annotation


# static fields
.field private static final WIPE_ALL_CUP_CARD_COMMANDER:Ljava/lang/String; = "wipe.device"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 36
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;)Lorg/json/JSONObject;
    .locals 6

    .line 67
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 69
    const/4 v0, 0x0

    return-object v0

    .line 72
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

    .line 73
    const/4 v4, 0x0

    .line 76
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 77
    const-string v0, "header"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
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

    .line 81
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->cplc:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    const-string v0, "cplc"

    iget-object v1, p2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->cplc:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    :cond_1
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->event:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    const-string v0, "event"

    iget-object v1, p2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->event:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :cond_2
    goto :goto_0

    .line 90
    :catch_0
    move-exception v5

    .line 92
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 93
    const/4 v4, 0x0

    .line 96
    :goto_0
    return-object v4
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;)Ljava/lang/String;
    .locals 6

    .line 41
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    :cond_0
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_1
    const-string v3, "wipe.device"

    .line 49
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v3, v1}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v4

    .line 52
    invoke-direct {p0, v4, p1}, Lcom/huawei/nfc/carrera/server/card/impl/WipeAllCUPCardTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;)Lorg/json/JSONObject;

    move-result-object v5

    .line 54
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/WipeAllCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v5, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 23
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/WipeAllCUPCardTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
