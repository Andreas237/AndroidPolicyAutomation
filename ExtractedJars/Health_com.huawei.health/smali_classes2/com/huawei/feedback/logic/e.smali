.class public Lcom/huawei/feedback/logic/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "FeedbackGetConfig"

.field private static final e:I = 0x0

.field private static final f:Ljava/lang/String; = "https://"

.field private static final g:I = 0x3e8

.field private static final h:I = 0x5


# instance fields
.field private b:Landroid/os/Handler;

.field private c:Landroid/content/Context;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;Landroid/content/Context;I)V
    .locals 3

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/huawei/feedback/logic/e;->b:Landroid/os/Handler;

    .line 47
    iput-object p2, p0, Lcom/huawei/feedback/logic/e;->c:Landroid/content/Context;

    .line 48
    iput p3, p0, Lcom/huawei/feedback/logic/e;->d:I

    .line 49
    const-string v0, "FeedbackGetConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FeedbackGetConfig appId== "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    return-void
.end method

.method private a(Lorg/json/JSONObject;)Lcom/huawei/feedback/bean/c;
    .locals 10

    .line 100
    new-instance v3, Lcom/huawei/feedback/bean/c;

    invoke-direct {v3}, Lcom/huawei/feedback/bean/c;-><init>()V

    .line 101
    if-nez p1, :cond_0

    .line 102
    return-object v3

    .line 105
    :cond_0
    const-string v0, "FeedbackGetConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "appId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/feedback/logic/e;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v0, "QQService"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 107
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 108
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 109
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 110
    const-string v0, "FeedbackGetConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "qq appId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/feedback/logic/e;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "appId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    .line 112
    iget v0, p0, Lcom/huawei/feedback/logic/e;->d:I

    if-ne v7, v0, :cond_1

    .line 114
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/c;->a(Ljava/lang/String;)V

    .line 115
    const-string v0, "qqNum"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/c;->b(Ljava/lang/String;)V

    .line 116
    goto :goto_1

    .line 108
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 121
    :cond_2
    :goto_1
    const-string v0, "netpoliceService"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 122
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 123
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 124
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 125
    const-string v0, "appId"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    .line 126
    const-string v0, "test_ly"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "police id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget v0, p0, Lcom/huawei/feedback/logic/e;->d:I

    if-ne v8, v0, :cond_3

    .line 128
    const-string v0, "name"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/c;->c(Ljava/lang/String;)V

    .line 129
    const-string v0, "url"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/c;->d(Ljava/lang/String;)V

    .line 130
    goto :goto_3

    .line 123
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 135
    :cond_4
    :goto_3
    const-string v0, "exclusiveHotline"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 136
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 137
    const/4 v7, 0x0

    :goto_4
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_6

    .line 138
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 139
    const-string v0, "appId"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    .line 140
    const-string v0, "test_ly"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hotline id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    iget v0, p0, Lcom/huawei/feedback/logic/e;->d:I

    if-ne v9, v0, :cond_5

    .line 142
    const-string v0, "name"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/c;->e(Ljava/lang/String;)V

    .line 143
    const-string v0, "tel"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/c;->f(Ljava/lang/String;)V

    .line 144
    goto :goto_5

    .line 137
    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 149
    :cond_6
    :goto_5
    const-string v0, "jsEnableDomains"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 150
    if-eqz v7, :cond_8

    .line 151
    const/4 v8, 0x0

    .line 152
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 153
    const/4 v9, 0x0

    :goto_6
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_7

    .line 154
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 153
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 156
    :cond_7
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/logic/e;->c:Landroid/content/Context;

    invoke-virtual {v0, v1, v8}, Lcom/huawei/feedback/a/b/b;->a(Landroid/content/Context;Ljava/util/HashSet;)V

    .line 159
    :cond_8
    return-object v3
.end method

.method private a()Lo/uz$a;
    .locals 9

    .line 168
    new-instance v0, Lo/vb;

    iget-object v1, p0, Lcom/huawei/feedback/logic/e;->c:Landroid/content/Context;

    const-string v2, "https://"

    const-string v3, "https://iservice.vmall.com/osg/"

    const-string v4, "v2/getConfig.htm"

    .line 170
    invoke-direct {p0}, Lcom/huawei/feedback/logic/e;->b()Ljava/util/Map;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/vb;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    move-object v6, v0

    .line 171
    const/16 v0, 0x1388

    invoke-virtual {v6, v0}, Lo/vb;->c(I)V

    .line 172
    const/4 v7, 0x0

    .line 174
    :try_start_0
    invoke-virtual {v6}, Lo/vb;->e()Lo/uz$a;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    move-object v7, v0

    .line 181
    goto :goto_0

    .line 175
    :catch_0
    move-exception v8

    .line 176
    const-string v0, "FeedbackGetConfig"

    invoke-static {v8, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 181
    goto :goto_0

    .line 177
    :catch_1
    move-exception v8

    .line 178
    const-string v0, "FeedbackGetConfig"

    invoke-static {v8, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 181
    goto :goto_0

    .line 179
    :catch_2
    move-exception v8

    .line 180
    const-string v0, "FeedbackGetConfig"

    invoke-static {v8, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 182
    :goto_0
    return-object v7
.end method

.method private a(Ljava/lang/String;)V
    .locals 8

    .line 78
    const-string v0, "FeedbackGetConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "jsonStr: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    return-void

    .line 82
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 83
    const-string v0, "status"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 84
    if-nez v4, :cond_2

    .line 85
    const-string v0, "data"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 86
    if-nez v5, :cond_1

    .line 87
    return-void

    .line 89
    :cond_1
    invoke-direct {p0, v5}, Lcom/huawei/feedback/logic/e;->a(Lorg/json/JSONObject;)Lcom/huawei/feedback/bean/c;

    move-result-object v6

    .line 90
    const-string v0, "FeedbackGetConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serviceItem: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/feedback/bean/c;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 92
    iput-object v6, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 93
    const/16 v0, 0x3e8

    iput v0, v7, Landroid/os/Message;->what:I

    .line 94
    iget-object v0, p0, Lcom/huawei/feedback/logic/e;->b:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 97
    :cond_2
    return-void
.end method

.method private b()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 192
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 195
    const-string v0, "dataVersion"

    const-string v1, "0"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->b()Ljava/lang/String;

    move-result-object v4

    .line 199
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    .line 200
    const-string v0, "imsi"

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v4, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    :cond_0
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->A()I

    move-result v5

    .line 205
    const-string v0, "deviceFlag"

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    return-object v3
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 54
    invoke-direct {p0}, Lcom/huawei/feedback/logic/e;->a()Lo/uz$a;

    move-result-object v1

    .line 55
    if-nez v1, :cond_0

    .line 57
    return-void

    .line 60
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lo/uz$a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/logic/e;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 65
    goto :goto_0

    .line 61
    :catch_0
    move-exception v2

    .line 62
    const-string v0, "FeedbackGetConfig"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 65
    goto :goto_0

    .line 63
    :catch_1
    move-exception v2

    .line 64
    const-string v0, "FeedbackGetConfig"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 66
    :goto_0
    return-void
.end method
