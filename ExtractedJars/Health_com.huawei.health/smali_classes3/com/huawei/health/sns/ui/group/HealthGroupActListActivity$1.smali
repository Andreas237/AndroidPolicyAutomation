.class Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 12

    .line 308
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupActivityList resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 311
    :cond_0
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupActivityList resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "\n "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "result = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    :goto_0
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_3

    .line 315
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 316
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 317
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 318
    const-string v0, "0"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    const-string v1, "currentTime"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    const-string v1, "totalCount"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;I)I

    .line 323
    new-instance v7, Lo/dcy;

    invoke-direct {v7}, Lo/dcy;-><init>()V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->g(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_ACT_LIST_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->i(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 326
    const-string v0, "groupActivityList"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 328
    const/4 v9, 0x0

    .line 329
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 330
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 331
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v0, v11}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    move-result-object v9

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 335
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)I

    move-result v1

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;I)I

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 341
    :cond_2
    goto :goto_2

    .line 339
    :catch_0
    move-exception v5

    .line 340
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    goto :goto_2

    .line 343
    :cond_3
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resCode Error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :goto_2
    return-void
.end method
