.class Lo/bsq$14;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->e(Lo/bui;)Lcom/huawei/health/suggestion/model/Plan;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsq;

.field final synthetic c:Lo/bui;

.field final synthetic e:Lcom/huawei/health/suggestion/model/AccountInfo;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;)V
    .locals 0

    .line 320
    iput-object p1, p0, Lo/bsq$14;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$14;->c:Lo/bui;

    iput-object p3, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 7

    .line 330
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->f()V

    .line 333
    const-string v0, "planInfo"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lo/bsx;->d(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 335
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btq;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v6

    .line 336
    if-eqz v5, :cond_6

    .line 338
    if-eqz v6, :cond_0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->g()Lo/btn;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lo/brx;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/btn;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 340
    :cond_0
    if-eqz v6, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 342
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;J)V

    .line 344
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    iget-object v1, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)V

    goto :goto_0

    .line 345
    :cond_1
    if-nez v6, :cond_2

    .line 347
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    iget-object v1, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 350
    :cond_2
    :goto_0
    const-string v0, "weekInfos"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lo/bsx;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkouts(Ljava/util/List;)V

    .line 352
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkoutCount(I)V

    .line 354
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->g()Lo/btn;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lo/brx;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/btn;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 356
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-static {v0}, Lo/bsq;->e(Lo/bsq;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$14;->a:Lo/bsq;

    const-string v2, "plan"

    iget-object v3, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    :cond_3
    if-eqz v6, :cond_4

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 361
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/btq;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 363
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-static {v0}, Lo/bsq;->e(Lo/bsq;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$14;->a:Lo/bsq;

    const-string v2, "plan"

    iget-object v3, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    :cond_4
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->getRemindTime()I

    move-result v1

    if-ltz v1, :cond_5

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->getRemindTime()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/bsq;->c(Lo/bsq;ZI)V

    goto :goto_2

    .line 368
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v6, :cond_7

    .line 369
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;J)V

    .line 371
    iget-object v0, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-static {v0}, Lo/bsq;->e(Lo/bsq;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$14;->a:Lo/bsq;

    const-string v2, "plan"

    iget-object v3, p0, Lo/bsq$14;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    :cond_7
    :goto_2
    iget-object v0, p0, Lo/bsq$14;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-virtual {v2}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 376
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 323
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentPlan(final UICallback<Plan> callback)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v0, p0, Lo/bsq$14;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$14;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 325
    return-void
.end method
