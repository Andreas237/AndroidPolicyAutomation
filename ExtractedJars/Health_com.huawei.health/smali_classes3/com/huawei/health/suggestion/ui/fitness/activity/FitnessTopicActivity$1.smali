.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 159
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;Z)Z

    .line 160
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==Failed--errorcode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Lo/but;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/but;->d(Z)V

    .line 163
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->b()V

    .line 164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)I

    move-result v0

    if-nez v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 169
    :cond_0
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 156
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;Z)Z

    .line 174
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)I

    .line 175
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->b()V

    .line 176
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Lo/but;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$1;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->g(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;ZLjava/util/List;)V

    .line 180
    return-void
.end method
