.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private description:I

.field private maxDistance:I

.field private maxDistanceDay:J

.field private numberOfTimes:I

.field private timeOfDay:I

.field private totalDistance:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 51
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 52
    return-void
.end method


# virtual methods
.method public acquireDescription()I
    .locals 1

    .line 95
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->description:I

    return v0
.end method

.method public acquireMaxDistance()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->maxDistance:I

    return v0
.end method

.method public acquireMaxDistanceDay()J
    .locals 2

    .line 79
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->maxDistanceDay:J

    return-wide v0
.end method

.method public acquireNumberOfTimes()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->numberOfTimes:I

    return v0
.end method

.method public acquireTimeOfDay()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->timeOfDay:I

    return v0
.end method

.method public acquireTotalDistance()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->totalDistance:I

    return v0
.end method

.method public saveDescription(I)V
    .locals 0

    .line 99
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->description:I

    .line 100
    return-void
.end method

.method public saveMaxDistance(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->maxDistance:I

    .line 76
    return-void
.end method

.method public saveMaxDistanceDay(J)V
    .locals 0

    .line 83
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->maxDistanceDay:J

    .line 84
    return-void
.end method

.method public saveNumberOfTimes(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->numberOfTimes:I

    .line 68
    return-void
.end method

.method public saveTimeOfDay(I)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->timeOfDay:I

    .line 92
    return-void
.end method

.method public saveTotalDistance(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->totalDistance:I

    .line 60
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportRun{totalDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->totalDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", numberOfTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->numberOfTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->maxDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDistanceDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->maxDistanceDay:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeOfDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->timeOfDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->description:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
