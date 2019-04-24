.class public Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private alarmTimes:Ljava/lang/Integer;

.field private duration:Ljava/lang/Integer;

.field private maxHeartRate:Ljava/lang/Integer;

.field private minHeartRate:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAlarmTimes()Ljava/lang/Integer;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->alarmTimes:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDuration()Ljava/lang/Integer;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->duration:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMaxHeartRate()Ljava/lang/Integer;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->maxHeartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMinHeartRate()Ljava/lang/Integer;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->minHeartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public setAlarmTimes(Ljava/lang/Integer;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->alarmTimes:Ljava/lang/Integer;

    .line 39
    return-void
.end method

.method public setDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->duration:Ljava/lang/Integer;

    .line 15
    return-void
.end method

.method public setMaxHeartRate(Ljava/lang/Integer;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->maxHeartRate:Ljava/lang/Integer;

    .line 23
    return-void
.end method

.method public setMinHeartRate(Ljava/lang/Integer;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->minHeartRate:Ljava/lang/Integer;

    .line 31
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateRiseAlarmBasic{duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->duration:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->maxHeartRate:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->minHeartRate:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", alarmTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->alarmTimes:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
