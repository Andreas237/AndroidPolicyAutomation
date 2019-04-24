.class Lo/aqo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Lo/ard;)Ljava/lang/String;
    .locals 7

    .line 29
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 31
    invoke-virtual {p1}, Lo/ard;->c()Ljava/lang/String;

    move-result-object v3

    .line 32
    invoke-virtual {p1}, Lo/ard;->i()Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-virtual {p1}, Lo/ard;->e()Ljava/lang/String;

    move-result-object v5

    .line 37
    if-eqz v3, :cond_0

    .line 39
    const-string v0, "mcode"

    :try_start_0
    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    :cond_0
    if-eqz v4, :cond_1

    .line 44
    const-string v0, "op"

    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    :cond_1
    if-eqz v5, :cond_2

    .line 49
    const-string v0, "groupID"

    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :cond_2
    goto :goto_0

    .line 53
    :catch_0
    move-exception v6

    .line 55
    const-string v0, "convert"

    const-string v1, "gen media download body json failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Lo/arb;)Ljava/lang/String;
    .locals 6

    .line 97
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 98
    invoke-virtual {p1}, Lo/arb;->c()Ljava/lang/String;

    move-result-object v3

    .line 99
    invoke-virtual {p1}, Lo/arb;->e()Ljava/lang/String;

    move-result-object v4

    .line 103
    if-eqz v3, :cond_0

    .line 105
    const-string v0, "mcode"

    :try_start_0
    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    :cond_0
    if-eqz v4, :cond_1

    .line 110
    const-string v0, "groupID"

    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :cond_1
    goto :goto_0

    .line 114
    :catch_0
    move-exception v5

    .line 116
    const-string v0, "convert"

    const-string v1, "gen media download body json failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a(Lo/arb;)Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;
    .locals 3

    .line 86
    new-instance v2, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;

    invoke-virtual {p1}, Lo/arb;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-direct {p0, p1}, Lo/aqo;->e(Lo/arb;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->setBody(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p1}, Lo/arb;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/arb;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->setPaths(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    return-object v2
.end method

.method c(Lo/ard;)Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;
    .locals 3

    .line 69
    new-instance v2, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;

    invoke-virtual {p1}, Lo/ard;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;-><init>(Ljava/lang/String;)V

    .line 70
    invoke-direct {p0, p1}, Lo/aqo;->b(Lo/ard;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->setBody(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Lo/ard;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/ard;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->setPaths(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p1}, Lo/ard;->h()I

    move-result v0

    invoke-virtual {p1}, Lo/ard;->k()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->setImageSize(II)V

    .line 74
    return-object v2
.end method
