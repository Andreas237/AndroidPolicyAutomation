.class Lo/yy$2$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yy$2;->d(Lcom/huawei/health/suggestion/model/Plan;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/yy$2;


# direct methods
.method constructor <init>(Lo/yy$2;)V
    .locals 0

    .line 419
    iput-object p1, p0, Lo/yy$2$2;->b:Lo/yy$2;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 423
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog getRunWorkout list fail errorcode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",errorInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 419
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/yy$2$2;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;)V"
        }
    .end annotation

    .line 429
    iget-object v0, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v0, v0, Lo/yy$2;->a:Lo/yy;

    invoke-static {v0, p1}, Lo/yy;->c(Lo/yy;Ljava/util/List;)Ljava/util/List;

    .line 430
    iget-object v0, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v0, v0, Lo/yy$2;->a:Lo/yy;

    invoke-static {v0, p1}, Lo/yy;->a(Lo/yy;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 431
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 432
    iget-object v0, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v0, v0, Lo/yy$2;->a:Lo/yy;

    iget-object v1, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v1, v1, Lo/yy$2;->b:Lcom/huawei/exercise/modle/RunPlanParameter;

    invoke-static {v0, v4, v1}, Lo/yy;->e(Lo/yy;Ljava/util/List;Lcom/huawei/exercise/modle/RunPlanParameter;)Lcom/huawei/exercise/modle/RunPlanInfo;

    move-result-object v5

    .line 433
    iget-object v0, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v0, v0, Lo/yy$2;->a:Lo/yy;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/RunPlanInfo;->getRun_plan_total_sign()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/yy;->c(Lo/yy;Ljava/lang/String;)Ljava/lang/String;

    .line 434
    iget-object v0, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v0, v0, Lo/yy$2;->a:Lo/yy;

    invoke-static {v0}, Lo/yy;->g(Lo/yy;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v1, v1, Lo/yy$2;->b:Lcom/huawei/exercise/modle/RunPlanParameter;

    invoke-virtual {v1}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runplanlog SHA value is same"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    iget-object v0, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v0, v0, Lo/yy$2;->a:Lo/yy;

    iget-object v1, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v1, v1, Lo/yy$2;->a:Lo/yy;

    invoke-static {v1}, Lo/yy;->i(Lo/yy;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/yy;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 440
    :cond_0
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runplanlog SHA value is diffirent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    iget-object v0, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v0, v0, Lo/yy$2;->a:Lo/yy;

    iget-object v1, p0, Lo/yy$2$2;->b:Lo/yy$2;

    iget-object v1, v1, Lo/yy$2;->a:Lo/yy;

    invoke-static {v1}, Lo/yy;->f(Lo/yy;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-static {v0, v5, v1}, Lo/yy;->e(Lo/yy;Lcom/huawei/exercise/modle/RunPlanInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 446
    :cond_1
    :goto_0
    return-void
.end method
