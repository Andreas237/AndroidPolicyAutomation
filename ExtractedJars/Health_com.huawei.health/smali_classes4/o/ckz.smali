.class public final Lo/ckz;
.super Ljava/lang/Object;

# interfaces
.implements Lo/ckr;


# static fields
.field private static a:Lo/ckz;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lo/cit;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cit;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v0, "App-Id"

    invoke-virtual {p1}, Lo/cit;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "App-Ver"

    invoke-virtual {p1}, Lo/cit;->o()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Sdk-Name"

    const-string v1, "hianalytics"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Sdk-Ver"

    const-string v1, "2.0.0.309"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Device-Type"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v0, "-"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "HiAnalytics"

    const-string v1, "sendData RequestId : %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v0, v1, v2}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Request-Id"

    invoke-interface {v4, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4
.end method

.method public static declared-synchronized a()Lo/ckr;
    .locals 4

    const-class v2, Lo/ckz;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lo/ckz;->a:Lo/ckz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lo/ckz;

    invoke-direct {v0}, Lo/ckz;-><init>()V

    sput-object v0, Lo/ckz;->a:Lo/ckz;

    :cond_0
    sget-object v0, Lo/ckz;->a:Lo/ckz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public c([BLjava/lang/String;)Z
    .locals 6

    invoke-static {}, Lo/ckt;->b()Lo/cky;

    move-result-object v0

    invoke-interface {v0}, Lo/cky;->d()Lo/cit;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2}, Lo/cit;->y()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v0, "preins"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "{url}/common/hmshioperbatch"

    const-string v1, "{url}"

    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const-string v0, "oper"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "{url}/common/hmshioperqrt"

    const-string v1, "{url}"

    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    const-string v0, "maint"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "{url}/common/hmshimaintqrt"

    const-string v1, "{url}"

    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-direct {p0, v2}, Lo/ckz;->a(Lo/cit;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v3, p1, v0}, Lo/cji;->d(Ljava/lang/String;[BLjava/util/Map;)Lo/cjl;

    move-result-object v5

    invoke-virtual {v5}, Lo/cjl;->c()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "isoCode"

    invoke-virtual {v5, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "{url}/getServerInfo"

    const-string v1, "{url}"

    const-string v2, "https://metrics.data.hicloud.com:6447"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lo/cji;->a(Ljava/lang/String;Ljava/lang/String;)Lo/cjl;

    move-result-object v7

    new-instance v8, Lo/ckg;

    invoke-direct {v8}, Lo/ckg;-><init>()V

    invoke-virtual {v7}, Lo/cjl;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/ckg;->a(Ljava/lang/String;)V

    const-string v0, "HiAnalytics"

    const-string v1, "get server add response err code: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v8}, Lo/ckg;->c()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v8}, Lo/ckg;->e()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v5

    const-string v0, "NetHandler"

    const-string v1, "getUploadServerAddr(): JSONException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method
