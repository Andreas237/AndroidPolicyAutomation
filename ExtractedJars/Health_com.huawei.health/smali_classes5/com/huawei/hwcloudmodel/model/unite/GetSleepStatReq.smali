.class public Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private endTime:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->dataSource:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getDataSource()Ljava/lang/Integer;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->dataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Integer;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->endTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Integer;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->startTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDataSource(Ljava/lang/Integer;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->dataSource:Ljava/lang/Integer;

    .line 41
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->deviceCode:Ljava/lang/Long;

    .line 33
    return-void
.end method

.method public setEndTime(Ljava/lang/Integer;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->endTime:Ljava/lang/Integer;

    .line 25
    return-void
.end method

.method public setStartTime(Ljava/lang/Integer;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->startTime:Ljava/lang/Integer;

    .line 17
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetSleepStatReq{startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->startTime:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->endTime:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->dataSource:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
