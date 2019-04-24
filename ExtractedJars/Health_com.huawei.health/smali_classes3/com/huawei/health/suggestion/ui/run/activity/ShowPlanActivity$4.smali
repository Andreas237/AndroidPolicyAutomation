.class Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;
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
        "Lo/bui<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;Ljava/lang/String;)V
    .locals 0

    .line 443
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->e:Ljava/lang/String;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 454
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishPlan onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->i(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->g(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;Ljava/lang/String;)V

    .line 458
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 459
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->finish()V

    .line 460
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 447
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishPlan onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->a(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 449
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->c:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;I)V

    .line 450
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 443
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;->a(Ljava/lang/String;)V

    return-void
.end method
