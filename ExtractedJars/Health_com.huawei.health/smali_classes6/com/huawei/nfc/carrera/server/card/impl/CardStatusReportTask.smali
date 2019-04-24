.class public Lcom/huawei/nfc/carrera/server/card/impl/CardStatusReportTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask<Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;>;"
    }
.end annotation


# static fields
.field private static final CARD_STATUS_REPORT_COMMANDER:Ljava/lang/String; = "nfc.set.card"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 36
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 66
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 71
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

    .line 72
    const/4 v2, 0x0

    .line 75
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 76
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCplc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 79
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getTerminal()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 83
    const-string v0, "terminal"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getTerminal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getUserID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 87
    const-string v0, "userID"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 91
    const-string v0, "aid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getStatus()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 95
    const-string v0, "status"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getImei()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 99
    const-string v0, "imei"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getImei()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getDpanid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 103
    const-string v0, "dpanid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getDpanid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCardName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 107
    const-string v0, "cardName"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    :cond_8
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCardNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_9

    .line 111
    const-string v0, "cardNumber"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCardNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    :cond_9
    const-string v0, "0"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 115
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getWalletVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_a

    .line 117
    const-string v0, "clientVersion"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getWalletVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    :cond_a
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    .line 121
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    :cond_b
    const-string v0, "cardType"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCardType()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 126
    :cond_c
    const-string v0, "ifNotify"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->isIfNotify()Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto :goto_0

    .line 128
    :catch_0
    move-exception v3

    .line 130
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 131
    const/4 v2, 0x0

    .line 134
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;)Ljava/lang/String;
    .locals 5

    .line 41
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    :cond_0
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nfc.set.card"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 52
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusReportTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 54
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusReportTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 26
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusReportTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
