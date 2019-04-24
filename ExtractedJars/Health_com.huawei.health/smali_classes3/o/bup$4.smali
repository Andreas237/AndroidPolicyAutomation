.class Lo/bup$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bup;->a(Lcom/huawei/health/suggestion/model/Topic;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/model/Topic;

.field final synthetic b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

.field final synthetic e:Lo/bup;


# direct methods
.method constructor <init>(Lo/bup;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/bup$4;->e:Lo/bup;

    iput-object p2, p0, Lo/bup$4;->b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    iput-object p3, p0, Lo/bup$4;->a:Lcom/huawei/health/suggestion/model/Topic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 118
    const-string v0, "FitnessCourseHorizontalHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method:onclick (View view) ---fitWorkout.acquireId():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bup$4;->b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--fitWorkout.accquireVersion():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bup$4;->b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    new-instance v4, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    new-instance v5, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 121
    iget-object v0, p0, Lo/bup$4;->b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 122
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 123
    iget-object v0, p0, Lo/bup$4;->b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 124
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lo/bup$4;->b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lo/bup$4;->b:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 127
    new-instance v6, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 128
    iget-object v0, p0, Lo/bup$4;->a:Lcom/huawei/health/suggestion/model/Topic;

    if-eqz v0, :cond_0

    .line 129
    const-string v0, "entrance"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FitnessCourse_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bup$4;->a:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    :cond_0
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 132
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    const-string v0, "workoutrecord"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 134
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 135
    iget-object v0, p0, Lo/bup$4;->a:Lcom/huawei/health/suggestion/model/Topic;

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lo/bup$4;->e:Lo/bup;

    iget-object v1, p0, Lo/bup$4;->a:Lcom/huawei/health/suggestion/model/Topic;

    invoke-static {v0, v1}, Lo/bup;->b(Lo/bup;Lcom/huawei/health/suggestion/model/Topic;)V

    .line 138
    :cond_1
    return-void
.end method
