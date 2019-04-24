.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private avgRestHR:I

.field private lastHR:I

.field private maxHR:I

.field private minHR:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->maxHR:I

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->minHR:I

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->lastHR:I

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->avgRestHR:I

    .line 21
    return-void
.end method


# virtual methods
.method public getAvgRestHeartRate()I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->avgRestHR:I

    return v0
.end method

.method public getLastHeartRate()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->lastHR:I

    return v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->maxHR:I

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->minHR:I

    return v0
.end method

.method public initHeartRateSummary1()V
    .locals 0

    .line 66
    return-void
.end method

.method public initHeartRateSummary2()V
    .locals 0

    .line 67
    return-void
.end method

.method public initHeartRateSummary3()V
    .locals 0

    .line 68
    return-void
.end method

.method public initHeartRateSummary4()V
    .locals 0

    .line 69
    return-void
.end method

.method public initHeartRateSummary5()V
    .locals 0

    .line 70
    return-void
.end method

.method public initHeartRateSummary6()V
    .locals 0

    .line 71
    return-void
.end method

.method public initHeartRateSummary7()V
    .locals 0

    .line 72
    return-void
.end method

.method public setAvgRestHeartRate(I)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->avgRestHR:I

    .line 53
    return-void
.end method

.method public setLastHeartRate(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->lastHR:I

    .line 45
    return-void
.end method

.method public setMaxHeartRate(I)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->maxHR:I

    .line 29
    return-void
.end method

.method public setMinHeartRate(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->minHR:I

    .line 37
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateSummary{maxHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->maxHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->minHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->lastHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", avgRestHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->avgRestHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
