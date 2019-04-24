.class Lcom/huawei/health/suggestion/ui/HistoryActivity$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/HistoryActivity;->e(ILo/bvr;)V
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
.field final synthetic b:Lo/bvr;

.field final synthetic e:Lcom/huawei/health/suggestion/ui/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lo/bvr;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->b:Lo/bvr;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 3

    .line 435
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->c(Lcom/huawei/health/suggestion/ui/HistoryActivity;Z)Z

    .line 436
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->e()V

    .line 437
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->b:Lo/bvr;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_iv_his_calen:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_create_plan_failed:I

    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    .line 438
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 5

    .line 442
    if-nez p1, :cond_0

    .line 443
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521b\u5efa\u8ba1\u5212\u5931\u8d25 \u8fd4\u56de\u7684\u5bf9\u8c61\u4e3anull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    return-void

    .line 446
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 447
    const-string v0, "plan"

    invoke-static {p1}, Lo/btm;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 448
    const-string v0, "new_plan"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 449
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->finish()V

    .line 451
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 432
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;->b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    return-void
.end method
