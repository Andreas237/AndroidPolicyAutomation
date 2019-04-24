.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private max:D

.field private min:D

.field private weightChange:D


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    sget-object v0, Lo/dxp;->f:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 33
    return-void
.end method


# virtual methods
.method public getMax()D
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->max:D

    return-wide v0
.end method

.method public getMin()D
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->min:D

    return-wide v0
.end method

.method public getWeightChange()D
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->weightChange:D

    return-wide v0
.end method

.method public setMax(D)V
    .locals 0

    .line 49
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->max:D

    .line 50
    return-void
.end method

.method public setMin(D)V
    .locals 0

    .line 57
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->min:D

    .line 58
    return-void
.end method

.method public setWeightChange(D)V
    .locals 0

    .line 41
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->weightChange:D

    .line 42
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportWeight{weightChange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->weightChange:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", max="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->max:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", min="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->min:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
