.class public Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataType:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private endTime:Ljava/lang/Long;

.field private queryType:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;

.field private type:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataType()Ljava/lang/Integer;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->dataType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getQueryType()Ljava/lang/Integer;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->queryType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getType()Ljava/lang/Integer;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDataType(Ljava/lang/Integer;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->dataType:Ljava/lang/Integer;

    .line 30
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->deviceCode:Ljava/lang/Long;

    .line 22
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->endTime:Ljava/lang/Long;

    .line 54
    return-void
.end method

.method public setQueryType(Ljava/lang/Integer;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->queryType:Ljava/lang/Integer;

    .line 38
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->startTime:Ljava/lang/Long;

    .line 46
    return-void
.end method

.method public setType(Ljava/lang/Integer;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->type:Ljava/lang/Integer;

    .line 62
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetHealthDataByTimeReq{queryType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->queryType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->dataType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
