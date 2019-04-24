.class Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;)V
    .locals 0

    .line 414
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;->d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 417
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateFitnessPlan errorCode = "

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

    .line 418
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;->d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 419
    invoke-static {}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 420
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 421
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v4, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 422
    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->h()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 423
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_plan_is_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 424
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 425
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 426
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;->d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->finish()V

    .line 428
    :cond_1
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 4

    .line 432
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateFitnessPlan data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;->d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;->d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;Ljava/lang/String;)V

    .line 435
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;->d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5$2;->d:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->finish()V

    .line 437
    return-void
.end method
