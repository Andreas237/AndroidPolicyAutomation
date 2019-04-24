.class public Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private avgRestingHeartRate:Ljava/lang/Integer;

.field private lastHeartRate:Ljava/lang/Integer;

.field private maxHeartRate:Ljava/lang/Integer;

.field private minHeartRate:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAvgRestingHeartRate()Ljava/lang/Integer;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->avgRestingHeartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public getLastHeartRate()Ljava/lang/Integer;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->lastHeartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMaxHeartRate()Ljava/lang/Integer;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->maxHeartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMinHeartRate()Ljava/lang/Integer;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->minHeartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public setAvgRestingHeartRate(Ljava/lang/Integer;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->avgRestingHeartRate:Ljava/lang/Integer;

    .line 32
    return-void
.end method

.method public setLastHeartRate(Ljava/lang/Integer;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->lastHeartRate:Ljava/lang/Integer;

    .line 40
    return-void
.end method

.method public setMaxHeartRate(Ljava/lang/Integer;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->maxHeartRate:Ljava/lang/Integer;

    .line 16
    return-void
.end method

.method public setMinHeartRate(Ljava/lang/Integer;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->minHeartRate:Ljava/lang/Integer;

    .line 24
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateBasic{maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->maxHeartRate:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->minHeartRate:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", avgRestingHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->avgRestingHeartRate:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->lastHeartRate:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
