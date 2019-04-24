.class Lo/bsq$37;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->d(JIIILjava/util/TreeSet;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic c:Lo/bsq;

.field final synthetic e:Lo/bui;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lo/bsq$37;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$37;->e:Lo/bui;

    iput-object p3, p0, Lo/bsq$37;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 616
    const-string v0, "planInfo"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lo/bsx;->d(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 617
    if-eqz v5, :cond_0

    .line 618
    iget-object v0, p0, Lo/bsq$37;->c:Lo/bsq;

    iget-object v1, p0, Lo/bsq$37;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 620
    const-string v0, "weekInfos"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lo/bsx;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkouts(Ljava/util/List;)V

    .line 622
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkoutCount(I)V

    .line 624
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

    .line 625
    iget-object v0, p0, Lo/bsq$37;->c:Lo/bsq;

    invoke-static {v0}, Lo/bsq;->e(Lo/bsq;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$37;->c:Lo/bsq;

    const-string v2, "plan"

    iget-object v3, p0, Lo/bsq$37;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v5}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    iget-object v0, p0, Lo/bsq$37;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$37;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 628
    :cond_0
    iget-object v0, p0, Lo/bsq$37;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$37;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 630
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 610
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFitPlan(FitnessPlanParams planParams, final UICallback<Plan> callback):"

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

    .line 611
    iget-object v0, p0, Lo/bsq$37;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$37;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 612
    return-void
.end method
