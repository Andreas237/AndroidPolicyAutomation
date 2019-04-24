.class Lo/wf$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/wf;->b(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/wf;

.field final synthetic c:Lo/wo;

.field final synthetic d:Landroid/os/Bundle;

.field final synthetic e:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lo/wf;Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    .locals 0

    .line 593
    iput-object p1, p0, Lo/wf$4;->b:Lo/wf;

    iput-object p2, p0, Lo/wf$4;->e:Ljava/util/ArrayList;

    iput-object p3, p0, Lo/wf$4;->c:Lo/wo;

    iput-object p4, p0, Lo/wf$4;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 627
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

    .line 628
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 15

    .line 596
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET KEY SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getRankDetailsBytimeStamp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 599
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/getRankingList"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 601
    const-string v0, "access_token"

    :try_start_0
    iget-object v1, p0, Lo/wf$4;->b:Lo/wf;

    invoke-static {v1}, Lo/wf;->a(Lo/wf;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lo/wf;->e(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 602
    new-instance v12, Lorg/json/JSONArray;

    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 603
    iget-object v0, p0, Lo/wf$4;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    .line 604
    invoke-virtual {v12, v14}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 605
    goto :goto_0

    .line 607
    :cond_0
    const-string v0, "huidList"

    invoke-virtual {v10, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 608
    const-string v0, "appType"

    const-string v1, "1001"

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 609
    const-string v0, "tokenType"

    const-string v1, "1"

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 610
    const-string v0, "ts"

    invoke-static {}, Lo/xp;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 611
    const-string v0, "token"

    iget-object v1, p0, Lo/wf$4;->b:Lo/wf;

    invoke-static {v1}, Lo/wf;->a(Lo/wf;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/wf;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 612
    const-string v0, "appId"

    invoke-static {}, Lo/xx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 613
    const-string v0, "deviceId"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/xy;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 614
    const-string v0, "upDeviceType"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/xy;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 615
    const-string v0, "currentDate"

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 618
    goto :goto_1

    .line 616
    :catch_0
    move-exception v12

    .line 617
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter Error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    :goto_1
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    invoke-static {}, Lo/we;->c()Lo/we;

    move-result-object v12

    .line 621
    move-object v0, v12

    iget-object v1, p0, Lo/wf$4;->b:Lo/wf;

    invoke-static {v1}, Lo/wf;->a(Lo/wf;)Landroid/content/Context;

    move-result-object v1

    move-object v2, v11

    const-string v3, "tag_json_get_ranking_list"

    move-object v5, v10

    iget-object v7, p0, Lo/wf$4;->c:Lo/wo;

    iget-object v8, p0, Lo/wf$4;->d:Landroid/os/Bundle;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v9, 0x1

    invoke-virtual/range {v0 .. v9}, Lo/we;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Z)V

    .line 623
    return-void
.end method
