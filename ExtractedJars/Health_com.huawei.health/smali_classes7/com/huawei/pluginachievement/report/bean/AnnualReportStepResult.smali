.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private key:I

.field private overGoal:I

.field private timeStamp:J

.field private value:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getKey()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->key:I

    return v0
.end method

.method public getOverGoal()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->overGoal:I

    return v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 25
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->timeStamp:J

    return-wide v0
.end method

.method public getValue()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->value:I

    return v0
.end method

.method public setKey(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->key:I

    .line 46
    return-void
.end method

.method public setOverGoal(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->overGoal:I

    .line 38
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 29
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->timeStamp:J

    .line 30
    return-void
.end method

.method public setValue(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->value:I

    .line 22
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportStepResult{value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->value:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->timeStamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", overGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->overGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->key:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
