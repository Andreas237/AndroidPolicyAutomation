.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->m()V
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
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 195
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_recom_content:I

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 198
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 201
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->p()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutFilters onSuccess isDestroyed()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    :goto_0
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 183
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    invoke-static {}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->p()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fail to obtain race list data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_recom_content:I

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    .line 189
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->p()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutFilters onFailure isDestroyed()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 180
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;->a(Ljava/lang/String;)V

    return-void
.end method
