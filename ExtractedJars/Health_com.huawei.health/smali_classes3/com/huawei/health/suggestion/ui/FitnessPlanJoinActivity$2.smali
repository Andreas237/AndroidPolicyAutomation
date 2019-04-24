.class Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->k()V
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
.field final synthetic a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 6

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->a(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;Z)Z

    .line 222
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFitnessPkg planId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x438

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(ZI)V

    .line 224
    invoke-static {p1}, Lo/btm;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 225
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 226
    const-string v0, "plan"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 227
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->startActivity(Landroid/content/Intent;)V

    .line 228
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 5

    .line 213
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->a(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;Z)Z

    .line 214
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFitnessPkg errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " errorInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 216
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 217
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 210
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    return-void
.end method
