.class Lo/wf$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/wf;->c(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/wf;

.field final synthetic b:Lo/wo;

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lo/wf;Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/wf$1;->a:Lo/wf;

    iput-object p2, p0, Lo/wf$1;->c:Ljava/util/ArrayList;

    iput-object p3, p0, Lo/wf$1;->b:Lo/wo;

    iput-object p4, p0, Lo/wf$1;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 114
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCallBackFail i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 14

    .line 83
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET KEY SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/getProfileByHuids"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 87
    const-string v0, "access_token"

    :try_start_0
    iget-object v1, p0, Lo/wf$1;->a:Lo/wf;

    invoke-static {v1}, Lo/wf;->a(Lo/wf;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/wf;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lo/wf;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    const-string v0, "appType"

    const-string v1, "1001"

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    const-string v0, "tokenType"

    const-string v1, "1"

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    const-string v0, "ts"

    invoke-static {}, Lo/xp;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    const-string v0, "token"

    iget-object v1, p0, Lo/wf$1;->a:Lo/wf;

    invoke-static {v1}, Lo/wf;->a(Lo/wf;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/wf;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    const-string v0, "appId"

    invoke-static {}, Lo/xx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    const-string v0, "deviceId"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/xy;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    const-string v0, "upDeviceType"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/xy;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    new-instance v12, Lorg/json/JSONArray;

    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 96
    const/4 v13, 0x0

    :goto_0
    iget-object v0, p0, Lo/wf$1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v13, v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/wf$1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 96
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 99
    :cond_0
    const-string v0, "huidList"

    invoke-virtual {v10, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 105
    goto :goto_1

    .line 101
    :catch_0
    move-exception v12

    .line 102
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    goto :goto_1

    .line 103
    :catch_1
    move-exception v12

    .line 104
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter UnsupportedEncodingException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :goto_1
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    invoke-static {}, Lo/we;->c()Lo/we;

    move-result-object v12

    .line 108
    move-object v0, v12

    iget-object v1, p0, Lo/wf$1;->a:Lo/wf;

    invoke-static {v1}, Lo/wf;->a(Lo/wf;)Landroid/content/Context;

    move-result-object v1

    move-object v2, v11

    const-string v3, "get_user_profile"

    move-object v5, v10

    iget-object v7, p0, Lo/wf$1;->b:Lo/wo;

    iget-object v8, p0, Lo/wf$1;->d:Landroid/os/Bundle;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v9, 0x1

    invoke-virtual/range {v0 .. v9}, Lo/we;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Z)V

    .line 110
    return-void
.end method
