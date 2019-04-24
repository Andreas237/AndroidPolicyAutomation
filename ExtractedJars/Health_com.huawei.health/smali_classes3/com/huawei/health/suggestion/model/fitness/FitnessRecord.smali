.class public Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private actualCalorie:F

.field private exerciseDuring:J

.field private exerciseEndTime:J

.field private exerciseStartTime:J

.field private planId:Ljava/lang/String;

.field private recordId:I

.field private type:I

.field private workoutName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireActualCalorie()F
    .locals 1

    .line 65
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->actualCalorie:F

    return v0
.end method

.method public acquireExerciseDuring()J
    .locals 2

    .line 73
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseDuring:J

    return-wide v0
.end method

.method public acquireExerciseEndTime()J
    .locals 2

    .line 49
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseEndTime:J

    return-wide v0
.end method

.method public acquireExerciseStartTime()J
    .locals 2

    .line 57
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseStartTime:J

    return-wide v0
.end method

.method public acquirePlanId()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireRecordId()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->recordId:I

    return v0
.end method

.method public acquireRecordType()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->type:I

    return v0
.end method

.method public acquireWorkoutName()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->workoutName:Ljava/lang/String;

    return-object v0
.end method

.method public saveActualCalorie(F)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->actualCalorie:F

    .line 70
    return-void
.end method

.method public saveExerciseDuring(J)V
    .locals 0

    .line 77
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseDuring:J

    .line 78
    return-void
.end method

.method public saveExerciseEndTime(J)V
    .locals 0

    .line 53
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseEndTime:J

    .line 54
    return-void
.end method

.method public saveExerciseStartTime(J)V
    .locals 0

    .line 61
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseStartTime:J

    .line 62
    return-void
.end method

.method public savePlanId(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->planId:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public saveRecordId(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->recordId:I

    .line 22
    return-void
.end method

.method public saveRecordType(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->type:I

    .line 30
    return-void
.end method

.method public saveWorkoutName(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->workoutName:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[[recordId, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->recordId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [type, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [planId, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->planId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [workoutName, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->workoutName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [exerciseEndTime, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseEndTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [exerciseStartTime, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->exerciseStartTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [actualCalorie, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->actualCalorie:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
