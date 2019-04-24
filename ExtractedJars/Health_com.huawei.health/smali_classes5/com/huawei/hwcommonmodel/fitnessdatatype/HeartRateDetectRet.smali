.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private heartRate:I

.field private timeStamp:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHeartRate()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->heartRate:I

    return v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->timeStamp:J

    return-wide v0
.end method

.method public setHeartRate(I)V
    .locals 0

    .line 15
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->heartRate:I

    .line 16
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 19
    iput-wide p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->timeStamp:J

    .line 20
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateDetectRet{heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->heartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->timeStamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
