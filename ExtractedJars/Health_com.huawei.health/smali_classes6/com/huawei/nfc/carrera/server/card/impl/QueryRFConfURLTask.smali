.class public Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;>;"
    }
.end annotation


# static fields
.field private static final HUAWEI_HEALTH:Ljava/lang/String; = "HUAWEI-HEALTH"

.field private static final QUERY_SUPPORT_COMMANDER:Ljava/lang/String; = "query.rule.rf"

.field private static final TAG:Ljava/lang/String; = "QueryRFConfURLTask"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;II)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 35
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;)Lorg/json/JSONObject;
    .locals 5

    .line 54
    if-nez p1, :cond_0

    .line 56
    const/4 v0, 0x0

    return-object v0

    .line 58
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 61
    const-string v0, "header"

    :try_start_0
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    const-string v0, "terminal"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    const-string v0, "romVersion"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->getRomVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    const-string v0, "timestamp"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->getTimeStamp()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    goto :goto_0

    .line 67
    :catch_0
    move-exception v4

    .line 69
    const-string v0, "QueryRFConfURLTask createDataStr parse json error"

    invoke-static {v0, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    const/4 v3, 0x0

    .line 73
    :goto_0
    return-object v3
.end method

.method private getVersionStr(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 177
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 178
    const-string v3, ""

    .line 179
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 180
    return-object v3

    .line 182
    :cond_0
    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 184
    array-length v0, v4

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 185
    return-object p1

    .line 187
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 190
    return-object v3
.end method

.method private getWearBTVersion()Ljava/lang/String;
    .locals 5

    .line 160
    const-string v0, "QueryRFConfURLTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearBTVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 163
    const-string v0, ""

    return-object v0

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceBTVersion()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->getVersionStr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 168
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    const-string v0, "QueryRFConfURLTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearBTVersion btVersion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const-string v0, ""

    return-object v0

    .line 172
    :cond_1
    return-object v4
.end method

.method private getWearModle()Ljava/lang/String;
    .locals 5

    .line 144
    const-string v0, "QueryRFConfURLTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearModle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 147
    const-string v0, ""

    return-object v0

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    .line 151
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    const-string v0, "QueryRFConfURLTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearModle watchModle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const-string v0, ""

    return-object v0

    .line 155
    :cond_1
    return-object v4
.end method

.method private getWearRomVersion()Ljava/lang/String;
    .locals 5

    .line 137
    const-string v0, "QueryRFConfURLTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearRomVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 139
    const-string v0, "HUAWEI-HEALTH"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->getWearModle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->getWearBTVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 140
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;)Ljava/lang/String;
    .locals 5

    .line 46
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "query.rule.rf"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 48
    invoke-direct {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;)Lorg/json/JSONObject;

    move-result-object v4

    .line 49
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;
    .locals 2

    .line 79
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;-><init>()V

    .line 80
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    .line 81
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 83
    const/4 v0, -0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    goto :goto_0

    .line 85
    :cond_0
    const/4 v0, -0x3

    if-ne v0, p1, :cond_1

    .line 87
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    goto :goto_0

    .line 89
    :cond_1
    const/4 v0, -0x2

    if-ne v0, p1, :cond_2

    .line 91
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    goto :goto_0

    .line 93
    :cond_2
    const/4 v0, -0x4

    if-ne v0, p1, :cond_3

    .line 95
    const/4 v0, -0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    .line 97
    :cond_3
    :goto_0
    return-object v1
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;
    .locals 7

    .line 103
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;-><init>()V

    .line 104
    iput p1, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    .line 105
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 109
    if-eqz p3, :cond_0

    .line 111
    const-string v0, "rf"

    :try_start_0
    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 112
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    .line 116
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->getWearRomVersion()Ljava/lang/String;

    move-result-object v5

    .line 117
    new-instance v6, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;-><init>()V

    .line 118
    invoke-virtual {v6, v4}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->setModel(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v6, v5}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->setRomVersion(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v6, v3}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->setRfURL(Ljava/lang/String;)V

    .line 121
    const-string v0, "issuerid"

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->setIssuerId(Ljava/lang/String;)V

    .line 122
    const-string v0, "timestamp"

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getLongValue(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->setTimeStamp(J)V

    .line 123
    iput-object v6, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->rfConfInfos:Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :cond_0
    goto :goto_0

    .line 127
    :catch_0
    move-exception v3

    .line 129
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

    .line 130
    const/16 v0, -0x63

    iput v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    .line 133
    :cond_1
    :goto_0
    return-object v2
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;

    move-result-object v0

    return-object v0
.end method
