.class public Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;>;"
    }
.end annotation


# static fields
.field private static final QUERY_CARD_APPLET_COMMANDER:Ljava/lang/String; = "nfc.se.get.ssdaid"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 30
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 54
    if-nez p1, :cond_0

    .line 56
    const/4 v0, 0x0

    return-object v0

    .line 58
    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 61
    const-string v0, "header"

    :try_start_0
    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    const-string v0, "terminal"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getTerminal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_0

    .line 65
    :catch_0
    move-exception v3

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryCardAppletTask createDataStr parse json error"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 68
    const/4 v2, 0x0

    .line 71
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;)Ljava/lang/String;
    .locals 5

    .line 35
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    :cond_0
    const-string v0, "QueryCardAppletTask prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nfc.se.get.ssdaid"

    .line 44
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    .line 43
    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 47
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 49
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 20
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;
    .locals 1

    .line 77
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;-><init>()V

    .line 78
    iput p1, v0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->returnCode:I

    .line 79
    return-object v0
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 20
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;
    .locals 8

    .line 85
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;-><init>()V

    .line 86
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->returnCode:I

    .line 87
    const/4 v0, 0x0

    if-ne v0, p1, :cond_6

    .line 91
    const/4 v2, 0x0

    .line 92
    const-string v0, "applet2SsdAndCapList"

    :try_start_0
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    const-string v0, "applet2SsdAndCapList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 96
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    .line 98
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 99
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_4

    .line 103
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;-><init>()V

    .line 104
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 105
    const-string v0, "appletAid"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    const-string v0, "appletAid"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->setAppletAid(Ljava/lang/String;)V

    .line 109
    :cond_1
    const-string v0, "ssdAid"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 111
    const-string v0, "ssdAid"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->setSsdAid(Ljava/lang/String;)V

    .line 113
    :cond_2
    const-string v0, "capAid"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    const-string v0, "capAid"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->setCapAid(Ljava/lang/String;)V

    .line 117
    :cond_3
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 119
    :cond_4
    invoke-virtual {v1, v3}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->setApplet2SsdAndCapList(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    :cond_5
    goto :goto_1

    .line 122
    :catch_0
    move-exception v2

    .line 124
    const-string v0, "QueryCardAppletTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 125
    const/16 v0, -0x63

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->returnCode:I

    .line 128
    :cond_6
    :goto_1
    return-object v1
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 20
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;

    move-result-object v0

    return-object v0
.end method
