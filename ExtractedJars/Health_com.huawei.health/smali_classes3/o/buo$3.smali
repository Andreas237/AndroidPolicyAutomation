.class Lo/buo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/buo;->c(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Ljava/lang/String;ZLcom/huawei/pluginFitnessAdvice/FitWorkout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/buo;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;


# direct methods
.method constructor <init>(Lo/buo;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lo/buo$3;->a:Lo/buo;

    iput-object p2, p0, Lo/buo$3;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    iput-object p3, p0, Lo/buo$3;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 131
    iget-object v0, p0, Lo/buo$3;->a:Lo/buo;

    invoke-static {v0}, Lo/buo;->c(Lo/buo;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/buo$3;->a:Lo/buo;

    invoke-static {v0}, Lo/buo;->c(Lo/buo;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->issDeleteMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lo/buo$3;->a:Lo/buo;

    invoke-static {v0}, Lo/buo;->b(Lo/buo;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CheckBox;->performClick()Z

    .line 133
    return-void

    .line 135
    :cond_0
    const-string v0, "FitnessTopicViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method:onclick (View view) ---fitWorkout.acquireId():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/buo$3;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--fitWorkout.accquireVersion():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/buo$3;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    new-instance v4, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    new-instance v5, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 138
    iget-object v0, p0, Lo/buo$3;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 139
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 140
    iget-object v0, p0, Lo/buo$3;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 141
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lo/buo$3;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lo/buo$3;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 144
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/buo$3;->a:Lo/buo;

    iget-object v0, v0, Lo/buo;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 145
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    const-string v0, "workoutrecord"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 147
    const-string v0, "entrance"

    iget-object v1, p0, Lo/buo$3;->b:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    iget-object v0, p0, Lo/buo$3;->a:Lo/buo;

    iget-object v0, v0, Lo/buo;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 149
    return-void
.end method
