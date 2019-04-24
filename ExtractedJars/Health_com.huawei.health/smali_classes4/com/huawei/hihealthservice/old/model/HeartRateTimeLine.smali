.class public Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;
.super Lcom/huawei/hihealthservice/old/model/TimeLine;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x69e6cee880ce145dL


# instance fields
.field private avgHeartRate:I

.field private heartRateValues:[I

.field private maxHeartRate:I

.field private minHeartRate:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/TimeLine;-><init>()V

    return-void
.end method


# virtual methods
.method public getAvgHeartRate()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->avgHeartRate:I

    return v0
.end method

.method public getHeartRateValues()[I
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->heartRateValues:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->maxHeartRate:I

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->minHeartRate:I

    return v0
.end method

.method public setAvgHeartRate(I)V
    .locals 0

    .line 97
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->avgHeartRate:I

    .line 98
    return-void
.end method

.method public setHeartRateValues([I)V
    .locals 1

    .line 113
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->heartRateValues:[I

    .line 114
    return-void
.end method

.method public setMaxHeartRate(I)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->maxHeartRate:I

    .line 66
    return-void
.end method

.method public setMinHeartRate(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->minHeartRate:I

    .line 82
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateTimeLine [maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->maxHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->minHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", avgHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->avgHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", heartRateValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->heartRateValues:[I

    .line 120
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 119
    return-object v0
.end method
