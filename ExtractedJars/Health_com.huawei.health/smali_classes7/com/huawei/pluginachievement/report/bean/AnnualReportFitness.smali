.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private description:I

.field private maxDuration:I

.field private maxDurationDay:J

.field private numberOfTimes:I

.field private totalDuration:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    sget-object v0, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 46
    return-void
.end method


# virtual methods
.method public acquireDescription()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->description:I

    return v0
.end method

.method public acquireMaxDuration()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->maxDuration:I

    return v0
.end method

.method public acquireMaxDurationDay()J
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->maxDurationDay:J

    return-wide v0
.end method

.method public acquireNumberOfTimes()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->numberOfTimes:I

    return v0
.end method

.method public acquireTotalDuration()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->totalDuration:I

    return v0
.end method

.method public saveDescription(I)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->description:I

    .line 88
    return-void
.end method

.method public saveMaxDuration(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->maxDuration:I

    .line 72
    return-void
.end method

.method public saveMaxDurationDay(J)V
    .locals 0

    .line 79
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->maxDurationDay:J

    .line 80
    return-void
.end method

.method public saveNumberOfTimes(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->numberOfTimes:I

    .line 64
    return-void
.end method

.method public saveTotalDuration(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->totalDuration:I

    .line 56
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportFitness{totalDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->totalDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", numberOfTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->numberOfTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->maxDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDurationDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->maxDurationDay:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->description:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
