.class public Lcom/huawei/exercise/modle/RunPlanStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private run_plan_date:J

.field private run_plan_distance:I

.field private run_plan_name:Ljava/lang/String;

.field private run_plan_repeats:I

.field private run_plan_train_effect:I

.field private run_plan_workout_id:I

.field private trainingStructList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/exercise/modle/TrainingStruct;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_date()J
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_date:J

    return-wide v0
.end method

.method public getRun_plan_distance()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_distance:I

    return v0
.end method

.method public getRun_plan_name()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_name:Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_repeats()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_repeats:I

    return v0
.end method

.method public getRun_plan_train_effect()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_train_effect:I

    return v0
.end method

.method public getRun_plan_workout_id()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_workout_id:I

    return v0
.end method

.method public getTrainingStructList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/exercise/modle/TrainingStruct;>;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->trainingStructList:Ljava/util/List;

    return-object v0
.end method

.method public setRun_plan_date(J)V
    .locals 0

    .line 51
    iput-wide p1, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_date:J

    .line 52
    return-void
.end method

.method public setRun_plan_distance(I)V
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_distance:I

    .line 84
    return-void
.end method

.method public setRun_plan_name(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_name:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setRun_plan_repeats(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_repeats:I

    .line 76
    return-void
.end method

.method public setRun_plan_train_effect(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_train_effect:I

    .line 68
    return-void
.end method

.method public setRun_plan_workout_id(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_workout_id:I

    .line 60
    return-void
.end method

.method public setTrainingStructList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/exercise/modle/TrainingStruct;>;)V"
        }
    .end annotation

    .line 91
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->trainingStructList:Ljava/util/List;

    .line 92
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 96
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 98
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_name:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 99
    iget-wide v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_date:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 100
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_train_effect:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 101
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_repeats:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 102
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->run_plan_distance:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 104
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->trainingStructList:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanStruct;->trainingStructList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/exercise/modle/TrainingStruct;

    .line 106
    invoke-virtual {v4}, Lcom/huawei/exercise/modle/TrainingStruct;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 107
    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
