.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private maxDistance:I

.field private maxDistanceDay:J

.field private numberOfTimes:I

.field private totalDistance:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    sget-object v0, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 41
    return-void
.end method


# virtual methods
.method public acquireMaxDistance()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->maxDistance:I

    return v0
.end method

.method public acquireMaxDistanceDay()J
    .locals 2

    .line 69
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->maxDistanceDay:J

    return-wide v0
.end method

.method public acquireNumberOfTimes()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->numberOfTimes:I

    return v0
.end method

.method public acquireTotalDistance()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->totalDistance:I

    return v0
.end method

.method public saveMaxDistance(I)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->maxDistance:I

    .line 66
    return-void
.end method

.method public saveMaxDistanceDay(J)V
    .locals 0

    .line 73
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->maxDistanceDay:J

    .line 74
    return-void
.end method

.method public saveNumberOfTimes(I)V
    .locals 0

    .line 57
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->numberOfTimes:I

    .line 58
    return-void
.end method

.method public saveTotalDistance(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->totalDistance:I

    .line 50
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportCycle{totalDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->totalDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", numberOfTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->numberOfTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->maxDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDistanceDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->maxDistanceDay:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
