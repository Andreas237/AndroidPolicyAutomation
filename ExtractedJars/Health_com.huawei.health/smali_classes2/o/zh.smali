.class public Lo/zh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lo/zo;
    .locals 9

    .line 37
    const/4 v2, 0x0

    .line 39
    const-string v0, "grs_sdk_server_config.json"

    invoke-static {v0}, Lo/aar;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 41
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const-string v0, "getGrsServerBean serverResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 50
    const-string v0, "grs_server"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 51
    const-string v0, "grs_base_url"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 52
    const-string v0, "grs_query_endpoint"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 53
    const-string v0, "grs_query_timeout"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 55
    new-instance v0, Lo/zo;

    invoke-direct {v0}, Lo/zo;-><init>()V

    move-object v2, v0

    .line 56
    invoke-virtual {v2, v6}, Lo/zo;->a(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v2, v7}, Lo/zo;->b(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v2, v8}, Lo/zo;->c(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception v4

    .line 62
    const-string v0, "getGrsServerBean JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 65
    :goto_0
    return-object v2
.end method
