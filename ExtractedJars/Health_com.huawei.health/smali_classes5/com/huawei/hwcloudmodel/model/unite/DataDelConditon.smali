.class public Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private deviceCode:Ljava/lang/Long;

.field private endTime:Ljava/lang/Long;

.field private startTime:Ljava/lang/Long;

.field private type:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getType()Ljava/lang/Integer;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->deviceCode:Ljava/lang/Long;

    .line 26
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->endTime:Ljava/lang/Long;

    .line 42
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->startTime:Ljava/lang/Long;

    .line 34
    return-void
.end method

.method public setType(Ljava/lang/Integer;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->type:Ljava/lang/Integer;

    .line 18
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DelConditon{,startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",endTeime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
