.class public Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private awakeDuration:Ljava/lang/Integer;

.field private awakeTimes:Ljava/lang/Integer;

.field private deepDuration:Ljava/lang/Integer;

.field private detail:Ljava/lang/String;

.field private endTime:Ljava/lang/Long;

.field private fallAsleepTime:Ljava/lang/Long;

.field private lightDuration:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;

.field private totalDuration:Ljava/lang/Integer;

.field private wakeupTime:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAwakeDuration()Ljava/lang/Integer;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->awakeDuration:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAwakeTimes()Ljava/lang/Integer;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->awakeTimes:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeepDuration()Ljava/lang/Integer;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->deepDuration:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDetail()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->detail:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getLightDuration()Ljava/lang/Integer;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->lightDuration:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getTotalDuration()Ljava/lang/Integer;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->totalDuration:Ljava/lang/Integer;

    return-object v0
.end method

.method public loadFallAsleepTime()Ljava/lang/Long;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->fallAsleepTime:Ljava/lang/Long;

    return-object v0
.end method

.method public loadWakeupTime()Ljava/lang/Long;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->wakeupTime:Ljava/lang/Long;

    return-object v0
.end method

.method public saveFallAsleepTime(Ljava/lang/Long;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->fallAsleepTime:Ljava/lang/Long;

    .line 83
    return-void
.end method

.method public saveWakeupTime(Ljava/lang/Long;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->wakeupTime:Ljava/lang/Long;

    .line 91
    return-void
.end method

.method public setAwakeDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->awakeDuration:Ljava/lang/Integer;

    .line 23
    return-void
.end method

.method public setAwakeTimes(Ljava/lang/Integer;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->awakeTimes:Ljava/lang/Integer;

    .line 31
    return-void
.end method

.method public setDeepDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->deepDuration:Ljava/lang/Integer;

    .line 39
    return-void
.end method

.method public setDetail(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->detail:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->endTime:Ljava/lang/Long;

    .line 55
    return-void
.end method

.method public setLightDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->lightDuration:Ljava/lang/Integer;

    .line 63
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->startTime:Ljava/lang/Long;

    .line 71
    return-void
.end method

.method public setTotalDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->totalDuration:Ljava/lang/Integer;

    .line 79
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SleepBasic{awakeDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->awakeDuration:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deepDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->deepDuration:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lightDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->lightDuration:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", awakeTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->awakeTimes:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->totalDuration:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detail=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->detail:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fallAsleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->fallAsleepTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wakeupTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->wakeupTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
