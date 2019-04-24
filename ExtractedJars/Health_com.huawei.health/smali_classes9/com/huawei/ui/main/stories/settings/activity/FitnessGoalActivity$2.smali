.class Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 200
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessGoal() -> err_code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 202
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessGoal() -> objData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    instance-of v0, p2, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 205
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() -> (step=1,calorie=2,distance=4,duration=8) \ndataType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    .line 206
    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\nstepGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    .line 207
    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ncalorieGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    .line 208
    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ndistanceGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    .line 209
    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ndurationGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    .line 210
    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDutationGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 205
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$2;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->g(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 215
    :cond_0
    return-void
.end method
