.class Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/PlanStat;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/PlanStat;)V
    .locals 5

    .line 159
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;Lcom/huawei/health/suggestion/model/PlanStat;)Lcom/huawei/health/suggestion/model/PlanStat;

    .line 160
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)I

    move-result v4

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)I

    move-result v1

    invoke-static {v1, v4}, Lo/buc;->e(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setMaxMet(I)V

    goto :goto_0

    .line 164
    :cond_0
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBestRecords() mRunParams is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->b(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/efy;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v1, v4}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0, v4}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)I

    .line 168
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/efy;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v1, v4}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->f(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/bxe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v2

    invoke-virtual {v0, v4, v1, v2}, Lo/bxe;->b(III)V

    .line 170
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/bxe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->e:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v2

    invoke-virtual {v0, v4, v1, v2}, Lo/bxe;->b(III)V

    .line 171
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 0

    .line 155
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 151
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;->a(Lcom/huawei/health/suggestion/model/PlanStat;)V

    return-void
.end method
