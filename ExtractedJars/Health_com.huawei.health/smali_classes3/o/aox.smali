.class public Lo/aox;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aox;->a:Landroid/os/Handler;

    .line 72
    invoke-direct {p0, p1}, Lo/aox;->e(Landroid/os/Handler;)V

    .line 73
    return-void
.end method

.method private a(Lo/bca;)V
    .locals 1

    .line 115
    new-instance v0, Lo/aox$2;

    invoke-direct {v0, p0, p1}, Lo/aox$2;-><init>(Lo/aox;Lo/bca;)V

    invoke-static {v0}, Lo/aty;->e(Lo/aud;)V

    .line 139
    return-void
.end method

.method static synthetic b(Lo/aox;Ljava/util/ArrayList;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/aox;->d(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic b(Lo/aox;JLjava/lang/String;)Z
    .locals 1

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/aox;->c(JLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;"
        }
    .end annotation

    .line 250
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 251
    const/4 v3, 0x0

    .line 254
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 255
    const/4 v4, 0x0

    .line 256
    const/4 v5, 0x0

    .line 257
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 259
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 260
    new-instance v5, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;-><init>()V

    .line 261
    const-string v0, "id"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setUID(J)V

    .line 262
    const-string v0, "name"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setName(Ljava/lang/String;)V

    .line 263
    const-string v0, "introduction"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setIntroduction(Ljava/lang/String;)V

    .line 264
    const-string v0, "head_pic"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setHead_pic(Ljava/lang/String;)V

    .line 265
    const-string v0, "follow"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setFollow(I)V

    .line 267
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getHead_pic()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 269
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 276
    :cond_1
    goto :goto_1

    .line 273
    :catch_0
    move-exception v4

    .line 275
    const-string v0, "GetRecommendAssistantTask"

    const-string v1, "JsonStrToList error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    :goto_1
    return-object v2
.end method

.method static synthetic c(Lo/aox;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/aox;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/aox;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lo/bca;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lo/aox;->e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lo/bca;)V

    return-void
.end method

.method private c(JLjava/lang/String;)Z
    .locals 5

    .line 289
    const/4 v4, 0x1

    .line 290
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 293
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 295
    const/4 v4, 0x0

    .line 298
    :cond_0
    return v4
.end method

.method private d(Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 222
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 223
    const/4 v4, 0x0

    .line 226
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;

    .line 228
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 229
    const-string v0, "id"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getId_()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 230
    const-string v0, "name"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getName_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 231
    const-string v0, "introduction"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getIntroduction_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    const-string v0, "head_pic"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getHead_pic_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 233
    const-string v0, "follow"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getFollow_()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 234
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    goto :goto_0

    .line 240
    :cond_0
    goto :goto_1

    .line 237
    :catch_0
    move-exception v5

    .line 239
    const-string v0, "GetRecommendAssistantTask"

    const-string v1, "listToJsonStr meet JSONException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;)V"
        }
    .end annotation

    .line 205
    iget-object v0, p0, Lo/aox;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lo/aox;->a:Landroid/os/Handler;

    const/16 v1, 0x300

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 208
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 209
    const-string v0, "key_recommend_assistant"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 210
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 211
    iget-object v0, p0, Lo/aox;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 213
    :cond_0
    return-void
.end method

.method private e(Landroid/os/Handler;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/aox;->a:Landroid/os/Handler;

    .line 63
    return-void
.end method

.method private e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lo/bca;)V
    .locals 9

    .line 147
    if-nez p1, :cond_0

    .line 149
    const-string v0, "GetRecommendAssistantTask"

    const-string v1, "processRecommendAssistantResponse response is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :cond_0
    const/4 v3, 0x0

    .line 152
    instance-of v0, p1, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;

    if-eqz v0, :cond_1

    .line 154
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;

    .line 157
    :cond_1
    if-eqz v3, :cond_6

    iget v0, v3, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->responseCode:I

    if-nez v0, :cond_6

    .line 159
    iget v0, v3, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->errcode_:I

    if-nez v0, :cond_5

    .line 161
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->getAccount_list_()Ljava/util/ArrayList;

    move-result-object v4

    .line 162
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 165
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/bca;->b(Ljava/lang/Long;)V

    .line 166
    invoke-direct {p0, v4}, Lo/aox;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/bca;->b(Ljava/lang/String;)V

    .line 168
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 169
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;

    .line 172
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getHead_pic_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 174
    new-instance v8, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    invoke-direct {v8}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;-><init>()V

    .line 175
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getId_()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setUID(J)V

    .line 176
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setName(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getHead_pic_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setHead_pic(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getIntroduction_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setIntroduction(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->getFollow_()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setFollow(I)V

    .line 180
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    :cond_2
    goto :goto_0

    .line 183
    :cond_3
    invoke-direct {p0, v5}, Lo/aox;->d(Ljava/util/ArrayList;)V

    .line 185
    :cond_4
    goto :goto_1

    .line 188
    :cond_5
    const-string v0, "GetRecommendAssistantTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processRecommendAssistantResponse assistantResponse.errcode_ is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;->errcode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 193
    :cond_6
    const-string v0, "GetRecommendAssistantTask"

    const-string v1, "processRecommendAssistantResponse assistantResponse is null or responseCode is not ok"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/aox;Lo/bca;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/aox;->a(Lo/bca;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 83
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aox$1;

    invoke-direct {v1, p0}, Lo/aox$1;-><init>(Lo/aox;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 108
    return-void
.end method
