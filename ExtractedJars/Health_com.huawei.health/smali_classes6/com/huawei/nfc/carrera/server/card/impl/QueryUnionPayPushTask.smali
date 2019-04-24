.class public Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;>;"
    }
.end annotation


# static fields
.field public static final QUERY_UNIONPAY_PUSH_COMMANDER:Ljava/lang/String; = "get.UnionPayPush"

.field public static final TAG:Ljava/lang/String; = "QueryUnionPayPushTask"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;)Lorg/json/JSONObject;
    .locals 6

    .line 47
    if-nez p1, :cond_0

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    const/4 v4, 0x0

    .line 52
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 53
    const-string v0, "header"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    const-string v0, "requestid"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->cplc:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    const-string v0, "cplc"

    iget-object v1, p2, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->cplc:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :cond_1
    goto :goto_0

    .line 58
    :catch_0
    move-exception v5

    .line 59
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createDataStr, params invalid."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v4, 0x0

    .line 63
    :goto_0
    return-object v4
.end method


# virtual methods
.method public isNumber(Ljava/lang/String;)Z
    .locals 7

    .line 147
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    const-string v0, "[0-9]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 149
    invoke-virtual {v4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 150
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 152
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 153
    const/4 v0, 0x1

    return v0

    .line 157
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;)Ljava/lang/String;
    .locals 6

    .line 30
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepareRequestStr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 32
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    :cond_0
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepareRequestStr, params invalid."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "get.UnionPayPush"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v4

    .line 41
    invoke-direct {p0, v4, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;)Lorg/json/JSONObject;

    move-result-object v5

    .line 43
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v5, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 19
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;
    .locals 2

    .line 68
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;-><init>()V

    .line 69
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 71
    :pswitch_0
    const/4 v0, -0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    .line 72
    goto :goto_1

    .line 74
    :pswitch_1
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    .line 75
    goto :goto_1

    .line 77
    :pswitch_2
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    .line 78
    goto :goto_1

    .line 80
    :pswitch_3
    const/4 v0, -0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    .line 81
    goto :goto_1

    .line 83
    :goto_0
    iput p1, v1, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    .line 86
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method protected bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;
    .locals 13

    .line 91
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==123 readSuccessResponse, responseStr : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;-><init>()V

    .line 93
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 94
    const/16 v0, -0x63

    iput v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    .line 95
    return-object v4

    .line 97
    :cond_0
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "responseStr :  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v5, 0x0

    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v7, -0x1

    .line 103
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 104
    const-string v0, "response"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 106
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleResponse, responseStrr is invalid."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    return-object v4

    .line 111
    :cond_1
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 112
    const-string v0, "returnCode"

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 114
    const/4 v0, 0x1

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    const/16 v7, -0x63

    .line 116
    iput v7, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 117
    return-object v4

    .line 120
    :cond_2
    :try_start_2
    invoke-virtual {p0, v9}, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;->isNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 121
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    goto :goto_0

    .line 123
    :cond_3
    const/16 v7, -0x62

    .line 124
    iput v7, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 125
    return-object v4

    .line 127
    :goto_0
    :try_start_3
    iput v7, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 128
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 129
    return-object v4

    .line 131
    :cond_4
    const-string v0, "pushMsg"

    :try_start_4
    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 132
    const-string v0, "pushTime"

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 133
    const-string v0, "systemCurrentTime"

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 134
    invoke-virtual {v4, v10}, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->setPushMsg(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v4, v11}, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->setPushTime(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v4, v12}, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->setSystemCurrentTime(Ljava/lang/String;)V

    .line 137
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushMsg :  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; pushTime :  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; systemCurrentTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; returncodeInt : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 141
    goto :goto_1

    .line 138
    :catch_0
    move-exception v8

    .line 139
    const-string v0, "QueryUnionPayPushTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readSuccessResponse, JSONException : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v8}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/16 v0, -0x63

    iput v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    .line 142
    :goto_1
    return-object v4
.end method

.method protected bridge synthetic readSuccessResponse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;->readSuccessResponse(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;

    move-result-object v0

    return-object v0
.end method
