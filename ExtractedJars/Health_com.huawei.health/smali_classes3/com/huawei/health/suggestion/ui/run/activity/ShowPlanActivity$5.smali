.class Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 399
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 402
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryMyDoingFitnessPkgPlan errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    invoke-static {}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 404
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_plan_is_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 405
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 407
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 4

    .line 411
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryMyDoingFitnessPkgPlan data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    if-eqz p1, :cond_0

    .line 413
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryMyDoingFitnessPkgPlan planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;)V

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3, v2}, Lo/btj;->d(Ljava/lang/String;ILo/bui;)V

    .line 440
    :cond_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 399
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    return-void
.end method
