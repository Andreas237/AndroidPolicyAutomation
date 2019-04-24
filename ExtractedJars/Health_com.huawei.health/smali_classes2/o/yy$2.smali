.class Lo/yy$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yy;->d(Lcom/huawei/exercise/modle/RunPlanParameter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/yy;

.field final synthetic b:Lcom/huawei/exercise/modle/RunPlanParameter;

.field final synthetic c:Lo/brt;


# direct methods
.method constructor <init>(Lo/yy;Lo/brt;Lcom/huawei/exercise/modle/RunPlanParameter;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lo/yy$2;->a:Lo/yy;

    iput-object p2, p0, Lo/yy$2;->c:Lo/brt;

    iput-object p3, p0, Lo/yy$2;->b:Lcom/huawei/exercise/modle/RunPlanParameter;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 400
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog getCurrentPlan fail, errorcode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",errorinfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 407
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 409
    iget-object v0, p0, Lo/yy$2;->a:Lo/yy;

    invoke-virtual {v0}, Lo/yy;->h()V

    goto :goto_0

    .line 412
    :cond_0
    iget-object v0, p0, Lo/yy$2;->a:Lo/yy;

    invoke-static {v0, p1}, Lo/yy;->a(Lo/yy;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 413
    iget-object v0, p0, Lo/yy$2;->a:Lo/yy;

    iget-object v1, p0, Lo/yy$2;->a:Lo/yy;

    invoke-static {v1}, Lo/yy;->a(Lo/yy;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/yy;->d(Lo/yy;Ljava/util/List;)Ljava/util/List;

    .line 414
    iget-object v0, p0, Lo/yy$2;->a:Lo/yy;

    invoke-static {v0}, Lo/yy;->a(Lo/yy;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 415
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runplanlog plan is not run plan!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    return-void

    .line 419
    :cond_1
    iget-object v0, p0, Lo/yy$2;->c:Lo/brt;

    new-instance v1, Lo/yy$2$2;

    invoke-direct {v1, p0}, Lo/yy$2$2;-><init>(Lo/yy$2;)V

    invoke-virtual {v0, v1}, Lo/brt;->a(Lo/bui;)V

    .line 450
    :goto_0
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 396
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lo/yy$2;->d(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
