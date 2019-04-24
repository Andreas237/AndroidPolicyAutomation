.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->m()V
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
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 92
    const-string v0, "FitnessMeExerciseActivity"

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

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;)V

    .line 94
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 98
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;)V

    .line 100
    return-void

    .line 102
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;I)V

    .line 103
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->b()V

    .line 104
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 90
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$4;->c(Ljava/util/List;)V

    return-void
.end method
