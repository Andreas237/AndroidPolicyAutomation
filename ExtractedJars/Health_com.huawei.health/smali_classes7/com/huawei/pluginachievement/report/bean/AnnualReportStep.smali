.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private maxStep:I

.field private maxStepDay:Ljava/lang/String;

.field private maxWalkMonth:I

.field private totalStep:I

.field private totalStepDistance:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    sget-object v0, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 46
    return-void
.end method


# virtual methods
.method public acquireMaxStep()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxStep:I

    return v0
.end method

.method public acquireMaxStepDay()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxStepDay:Ljava/lang/String;

    return-object v0
.end method

.method public acquireMaxWalkMonth()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxWalkMonth:I

    return v0
.end method

.method public acquireTotalStep()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->totalStep:I

    return v0
.end method

.method public acquireTotalStepDistance()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->totalStepDistance:I

    return v0
.end method

.method public saveMaxStep(I)V
    .locals 0

    .line 70
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxStep:I

    .line 71
    return-void
.end method

.method public saveMaxStepDay(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxStepDay:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public saveMaxWalkMonth(I)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxWalkMonth:I

    .line 87
    return-void
.end method

.method public saveTotalStep(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->totalStep:I

    .line 55
    return-void
.end method

.method public saveTotalStepDistance(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->totalStepDistance:I

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportStep{totalStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->totalStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalStepDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->totalStepDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxStepDay=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxStepDay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxWalkMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->maxWalkMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
