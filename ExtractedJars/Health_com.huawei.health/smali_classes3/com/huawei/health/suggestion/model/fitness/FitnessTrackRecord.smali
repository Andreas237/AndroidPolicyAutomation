.class public Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private monthDate:Ljava/lang/String;

.field private monthZeroTime:J

.field private sumCalorie:F

.field private sumExerciseCount:I

.field private sumExerciseTime:J

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireMonthDate()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->monthDate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireMonthZeroTime()J
    .locals 2

    .line 55
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->monthZeroTime:J

    return-wide v0
.end method

.method public acquireRecordType()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->type:I

    return v0
.end method

.method public acquireSumCalorie()F
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumCalorie:F

    return v0
.end method

.method public acquireSumExerciseTime()J
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumExerciseTime:J

    return-wide v0
.end method

.method public acquireSumExerciseTimes()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumExerciseCount:I

    return v0
.end method

.method public saveMonthDate(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->monthDate:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public saveMonthZeroTime(J)V
    .locals 0

    .line 59
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->monthZeroTime:J

    .line 60
    return-void
.end method

.method public saveRecordType(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->type:I

    .line 21
    return-void
.end method

.method public saveSumCalorie(F)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumCalorie:F

    .line 44
    return-void
.end method

.method public saveSumExerciseTime(J)V
    .locals 0

    .line 51
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumExerciseTime:J

    .line 52
    return-void
.end method

.method public saveSumExerciseTimes(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumExerciseCount:I

    .line 36
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[[type, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "],[sumExerciseCount, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumExerciseCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [sumExerciseTime, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumExerciseTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [sumCalorie, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->sumCalorie:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], [monthDate, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->monthDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
