.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V
    .locals 0

    .line 603
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 6

    .line 611
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 612
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)I

    .line 613
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    const-string v1, "L[1-4]{1}"

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)I

    move-result v2

    invoke-static {v2}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_result_n:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v5

    .line 615
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_level_1:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v5}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 617
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_level_2:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v5}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 618
    goto :goto_0

    .line 619
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)I

    .line 620
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Lo/efy;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 621
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_level_1:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 622
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_level_2:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 623
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshDifficulty data == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    :goto_0
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 606
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshDifficulty errorCode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "errorInfo:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 603
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method
