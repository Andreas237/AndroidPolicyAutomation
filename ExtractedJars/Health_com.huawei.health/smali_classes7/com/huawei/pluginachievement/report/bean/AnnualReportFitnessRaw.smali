.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private during:I

.field private exerciseTime:J

.field private workoutDate:Ljava/lang/String;

.field private workoutName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireDuring()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->during:I

    return v0
.end method

.method public acquireExerciseTime()J
    .locals 2

    .line 32
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->exerciseTime:J

    return-wide v0
.end method

.method public acquireWorkoutDate()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->workoutDate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutName()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->workoutName:Ljava/lang/String;

    return-object v0
.end method

.method public saveDuring(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->during:I

    .line 45
    return-void
.end method

.method public saveExerciseTime(J)V
    .locals 0

    .line 36
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->exerciseTime:J

    .line 37
    return-void
.end method

.method public saveWorkoutDate(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->workoutDate:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public saveWorkoutName(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->workoutName:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "workoutName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->workoutName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " workoutDate:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->workoutDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " exerciseTime:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->exerciseTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " during:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->during:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
