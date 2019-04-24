.class public Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;>;"
    }
.end annotation


# static fields
.field private static final QUERY_SUPPORTED_CARD_LIST_COMMANDER:Ljava/lang/String; = "query.rule.issuer"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;)Lorg/json/JSONObject;
    .locals 5

    .line 55
    if-nez p1, :cond_0

    .line 57
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 62
    const-string v0, "header"

    :try_start_0
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    const-string v0, "timestamp"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getTimeStamp()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 64
    const-string v0, "romVersion"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getRomVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    const-string v0, "clientVersion"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getWalletVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    const-string v0, "terminal"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getTerminal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 68
    :catch_0
    move-exception v4

    .line 70
    const-string v0, "QuerySupportedCardListByTerminalTask createDataStr parse json error"

    invoke-static {v0, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    const/4 v3, 0x0

    .line 74
    :goto_0
    return-object v3
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;)Ljava/lang/String;
    .locals 5

    .line 36
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    :cond_0
    const-string v0, "QuerySupportedCardListByTerminalTask prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 40
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "query.rule.issuer"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 48
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 50
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 19
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;
    .locals 1

    .line 81
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;-><init>()V

    .line 82
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    .line 83
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;
    .locals 4

    .line 90
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;-><init>()V

    .line 91
    iput p1, v2, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    .line 92
    const/4 v0, 0x0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->issuersString:Ljava/lang/String;

    .line 93
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 97
    const-string v0, "issuers"

    :try_start_0
    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 98
    iput-object v3, v2, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->issuersString:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    goto :goto_0

    .line 100
    :catch_0
    move-exception v3

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, JSONException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 103
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->returnCode:I

    .line 107
    :cond_0
    :goto_0
    return-object v2
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;

    move-result-object v0

    return-object v0
.end method
