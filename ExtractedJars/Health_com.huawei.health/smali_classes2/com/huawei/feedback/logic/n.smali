.class public Lcom/huawei/feedback/logic/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "GetFeedbackBatchAnswerTask"


# instance fields
.field private b:Landroid/os/Handler;

.field private c:Lcom/huawei/feedback/bean/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/n;->b:Landroid/os/Handler;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/n;->c:Lcom/huawei/feedback/bean/f;

    .line 40
    const-string v0, "GetFeedbackBatchAnswerTask"

    const-string v1, "GetFeedbackBatchAnswerTask was contructed "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    iput-object p2, p0, Lcom/huawei/feedback/logic/n;->b:Landroid/os/Handler;

    .line 43
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 6

    .line 149
    invoke-static {}, Lcom/huawei/feedback/logic/f;->f()Ljava/util/List;

    move-result-object v3

    .line 150
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 152
    const-string v0, "https://iservice.vmall.com:443/osg/feedbackBatchAction!getRespMsg.htm?"

    :try_start_0
    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 153
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 154
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 155
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 156
    const-string v0, "questionIds="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 160
    :cond_2
    const-string v0, ""

    return-object v0

    .line 164
    :goto_1
    :try_start_1
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 165
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->h()V

    .line 167
    :cond_3
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->i()Ljava/lang/String;

    move-result-object v5

    .line 168
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 169
    const-string v5, "000000000000000"

    .line 170
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deviceID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    .line 176
    goto :goto_2

    .line 172
    :catch_0
    move-exception v5

    .line 174
    const-string v0, "GetFeedbackBatchAnswerTask"

    const-string v1, "UnsupportedEncodingException dealUrl"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, ""

    return-object v0

    .line 178
    :goto_2
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 79
    invoke-static {p1}, Lcom/huawei/feedback/e;->d(Ljava/lang/String;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object v1

    .line 81
    if-nez v1, :cond_0

    .line 82
    const-string v0, ""

    return-object v0

    .line 99
    :cond_0
    invoke-static {v1}, Lcom/huawei/feedback/e;->a(Ljavax/net/ssl/HttpsURLConnection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation

    .line 103
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 105
    if-eqz p1, :cond_3

    .line 106
    :try_start_0
    new-instance v4, Lorg/json/JSONTokener;

    invoke-direct {v4, p1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v4}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/json/JSONObject;

    .line 108
    const-string v0, "answers"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 110
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 111
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 112
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 114
    const-string v0, "questionId"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 115
    const-string v10, ""

    .line 116
    const-string v11, ""

    .line 117
    const-string v0, "answer"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "answer"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 118
    const-string v0, "answer"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 121
    :cond_0
    const-string v0, "picUrl"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "picUrl"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 122
    const-string v0, "picUrl"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 125
    :cond_1
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 126
    new-instance v0, Lcom/huawei/feedback/bean/f;

    invoke-direct {v0}, Lcom/huawei/feedback/bean/f;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/logic/n;->c:Lcom/huawei/feedback/bean/f;

    .line 127
    iget-object v0, p0, Lcom/huawei/feedback/logic/n;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v9}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/feedback/logic/n;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v10}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/feedback/logic/n;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v11}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/feedback/logic/n;->c:Lcom/huawei/feedback/bean/f;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    :cond_2
    const-string v0, "GetFeedbackBatchAnswerTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "questionId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " answer = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " picUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 111
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 143
    :cond_3
    goto :goto_1

    .line 139
    :catch_0
    move-exception v4

    .line 140
    const-string v0, "GetFeedbackBatchAnswerTask"

    const-string v1, "parse feedback response error,error is json exc "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    goto :goto_1

    .line 141
    :catch_1
    move-exception v4

    .line 142
    const-string v0, "GetFeedbackBatchAnswerTask"

    const-string v1, "parse feedback response error,error is unkown error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    :goto_1
    return-object v3
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 48
    invoke-direct {p0}, Lcom/huawei/feedback/logic/n;->a()Ljava/lang/String;

    move-result-object v3

    .line 50
    const-string v0, "GetFeedbackBatchAnswerTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get feedback ,URL is = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 53
    invoke-direct {p0, v3}, Lcom/huawei/feedback/logic/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 55
    const-string v0, "GetFeedbackBatchAnswerTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get feedback response ,response is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0, v4}, Lcom/huawei/feedback/logic/n;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 58
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 60
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 61
    const/16 v0, 0x7d5

    iput v0, v6, Landroid/os/Message;->what:I

    .line 62
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lcom/huawei/feedback/logic/n;->b:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 66
    const/16 v0, 0x7d7

    iput v0, v6, Landroid/os/Message;->what:I

    .line 67
    iget-object v0, p0, Lcom/huawei/feedback/logic/n;->b:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 69
    :goto_0
    goto :goto_1

    .line 70
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 71
    const/16 v0, 0x7d7

    iput v0, v4, Landroid/os/Message;->what:I

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/logic/n;->b:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 75
    :goto_1
    return-void
.end method
