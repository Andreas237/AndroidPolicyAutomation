.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private firstUseDate:J

.field private totalDays:I

.field private totalSportDistance:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    sget-object v0, Lo/dxp;->c:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 33
    return-void
.end method


# virtual methods
.method public acquireFirstUseDate()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->firstUseDate:J

    return-wide v0
.end method

.method public acquireTotalDays()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->totalDays:I

    return v0
.end method

.method public acquireTotalSportDistance()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->totalSportDistance:I

    return v0
.end method

.method public saveFirstUseDate(J)V
    .locals 0

    .line 42
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->firstUseDate:J

    .line 43
    return-void
.end method

.method public saveTotalDays(I)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->totalDays:I

    .line 51
    return-void
.end method

.method public saveTotalSportDistance(I)V
    .locals 0

    .line 58
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->totalSportDistance:I

    .line 59
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportInital{firstUseDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->firstUseDate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->totalDays:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalSportDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->totalSportDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
