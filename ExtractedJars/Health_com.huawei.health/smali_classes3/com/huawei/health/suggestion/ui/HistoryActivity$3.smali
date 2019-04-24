.class Lcom/huawei/health/suggestion/ui/HistoryActivity$3;
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
        "Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/bvr;

.field final synthetic e:Lcom/huawei/health/suggestion/ui/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lo/bvr;)V
    .locals 0

    .line 478
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->a:Lo/bvr;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 3

    .line 481
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->c(Lcom/huawei/health/suggestion/ui/HistoryActivity;Z)Z

    .line 482
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->e()V

    .line 483
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->a:Lo/bvr;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_iv_his_calen:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_create_plan_failed:I

    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    .line 484
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 5

    .line 488
    if-nez p1, :cond_0

    .line 489
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521b\u5efa\u8ba1\u5212\u5931\u8d25 \u8fd4\u56de\u7684\u5bf9\u8c61\u4e3anull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    return-void

    .line 492
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 493
    const-string v0, "plan"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 494
    const-string v0, "new_plan"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 495
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->finish()V

    .line 497
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 478
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;->c(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
