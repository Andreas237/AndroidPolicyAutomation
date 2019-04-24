.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private CurrentLevel:I

.field private MedalSum:I

.field private StepOverGoal:I

.field private TotalDistance:I

.field private totalCalorie:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    sget-object v0, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 47
    return-void
.end method


# virtual methods
.method public acquireCurrentLevel()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->CurrentLevel:I

    return v0
.end method

.method public acquireMedalSum()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->MedalSum:I

    return v0
.end method

.method public acquireStepOverGoal()I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->StepOverGoal:I

    return v0
.end method

.method public acquireTotalCalorie()J
    .locals 2

    .line 51
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->totalCalorie:J

    return-wide v0
.end method

.method public acquireTotalDistance()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->TotalDistance:I

    return v0
.end method

.method public saveCurrentLevel(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->CurrentLevel:I

    .line 72
    return-void
.end method

.method public saveMedalSum(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->MedalSum:I

    .line 64
    return-void
.end method

.method public saveStepOverGoal(I)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->StepOverGoal:I

    .line 80
    return-void
.end method

.method public saveTotalCalorie(J)V
    .locals 0

    .line 55
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->totalCalorie:J

    .line 56
    return-void
.end method

.method public saveTotalDistance(I)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->TotalDistance:I

    .line 88
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportSumary{totalCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->totalCalorie:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", MedalSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->MedalSum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", CurrentLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->CurrentLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", StepOverGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->StepOverGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", TotalDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->TotalDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
