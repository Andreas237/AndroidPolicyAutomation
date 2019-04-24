.class Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->i()V
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

    .line 165
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 3

    .line 168
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 169
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->e(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V

    goto :goto_0

    .line 172
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 173
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 175
    :goto_0
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 4

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 180
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v1

    invoke-virtual {v1}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->a(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 181
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->a:Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->b(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    goto :goto_0

    .line 184
    :cond_0
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity is finished"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :goto_0
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 165
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;->d(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    return-void
.end method
