.class public Lcom/huawei/health/suggestion/model/Summary;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bestPace:I

.field private calorie:F

.field private distance:F

.field private during:I

.field private endTime:J

.field private exerciseTime:J

.field private finishRate:I

.field private maxMet:I

.field private planId:Ljava/lang/String;

.field private sportId:Ljava/lang/String;

.field private startTime:J

.field private targetDistance:I

.field private trainingLoadPeak:I

.field private workoutDate:Ljava/lang/String;

.field private workoutId:Ljava/lang/String;

.field private workoutName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireBestPace()I
    .locals 1

    .line 135
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->bestPace:I

    return v0
.end method

.method public acquireCalorie()F
    .locals 1

    .line 103
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->calorie:F

    return v0
.end method

.method public acquireDistance()F
    .locals 1

    .line 127
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->distance:F

    return v0
.end method

.method public acquireDuring()I
    .locals 1

    .line 111
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->during:I

    return v0
.end method

.method public acquireEndTime()J
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Summary;->endTime:J

    return-wide v0
.end method

.method public acquireExerciseTime()J
    .locals 2

    .line 79
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Summary;->exerciseTime:J

    return-wide v0
.end method

.method public acquireMaxMet()I
    .locals 1

    .line 151
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->maxMet:I

    return v0
.end method

.method public acquirePlanId()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Summary;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireSportId()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Summary;->sportId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireTargetDistance()I
    .locals 1

    .line 119
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->targetDistance:I

    return v0
.end method

.method public acquireWorkoutDate()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutDate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutId()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutName()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutName:Ljava/lang/String;

    return-object v0
.end method

.method public acquiretStartTime()J
    .locals 2

    .line 95
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Summary;->startTime:J

    return-wide v0
.end method

.method public acuqireFinishRate()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->finishRate:I

    return v0
.end method

.method public acuqireTrainingLoadPeak()I
    .locals 1

    .line 143
    iget v0, p0, Lcom/huawei/health/suggestion/model/Summary;->trainingLoadPeak:I

    return v0
.end method

.method public setBestPace(I)V
    .locals 0

    .line 139
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->bestPace:I

    .line 140
    return-void
.end method

.method public setCalorie(F)V
    .locals 0

    .line 107
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->calorie:F

    .line 108
    return-void
.end method

.method public setDistance(F)V
    .locals 0

    .line 131
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->distance:F

    .line 132
    return-void
.end method

.method public setDuring(I)V
    .locals 0

    .line 115
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->during:I

    .line 116
    return-void
.end method

.method public setEndTime(J)V
    .locals 0

    .line 91
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Summary;->endTime:J

    .line 92
    return-void
.end method

.method public setExerciseTime(J)V
    .locals 0

    .line 83
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Summary;->exerciseTime:J

    .line 84
    return-void
.end method

.method public setFinishRate(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->finishRate:I

    .line 172
    return-void
.end method

.method public setMaxMet(I)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->maxMet:I

    .line 156
    return-void
.end method

.method public setPlanId(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Summary;->planId:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setSportId(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Summary;->sportId:Ljava/lang/String;

    .line 164
    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    .line 99
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Summary;->startTime:J

    .line 100
    return-void
.end method

.method public setTargetDistance(I)V
    .locals 0

    .line 123
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->targetDistance:I

    .line 124
    return-void
.end method

.method public setTrainingLoadPeak(I)V
    .locals 0

    .line 147
    iput p1, p0, Lcom/huawei/health/suggestion/model/Summary;->trainingLoadPeak:I

    .line 148
    return-void
.end method

.method public setWorkoutDate(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutDate:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setWorkoutId(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutId:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setWorkoutName(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutName:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Summary{planId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Summary;->planId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", workoutId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", workoutName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", workoutDate=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Summary;->workoutDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exerciseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/Summary;->exerciseTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", calorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->calorie:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", during="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->during:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", targetDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->targetDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->distance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bestPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->bestPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", finishRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->finishRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trainingLoadPeak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->trainingLoadPeak:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxMet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/Summary;->maxMet:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Summary;->sportId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/Summary;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/Summary;->endTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
