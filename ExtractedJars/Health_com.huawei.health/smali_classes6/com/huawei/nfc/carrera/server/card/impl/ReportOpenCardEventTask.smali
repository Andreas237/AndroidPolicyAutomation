.class public Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;>;"
    }
.end annotation


# static fields
.field private static final OPEN_CARD_UPLOAD_COMMANDER:Ljava/lang/String; = "post.event.cardenroll"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 20
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 42
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 44
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_1
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

    .line 48
    const/4 v2, 0x0

    .line 51
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 52
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    const-string v0, "requestid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getRequestNum()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    const-string v0, "time"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    const-string v0, "uid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getCardIssuerid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    const-string v0, "cardType"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getCardType()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 58
    const-string v0, "terminal"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getTerminal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    const-string v0, "result"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getResult()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    const-string v0, "errorDesc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getErrorDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 62
    :catch_0
    move-exception v3

    .line 64
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 65
    const/4 v2, 0x0

    .line 68
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)Ljava/lang/String;
    .locals 5

    .line 25
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 27
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 28
    const/4 v0, 0x0

    return-object v0

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "post.event.cardenroll"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 35
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 37
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 13
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 1

    .line 74
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    invoke-direct {v0, p1}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 2

    .line 79
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v0

    return-object v0
.end method
