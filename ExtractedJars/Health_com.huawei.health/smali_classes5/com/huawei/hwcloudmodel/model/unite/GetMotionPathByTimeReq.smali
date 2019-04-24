.class public Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataType:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private endTime:Ljava/lang/Long;

.field private queryType:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;


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

    .line 48
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->dataType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getQueryType()Ljava/lang/Integer;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->queryType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public setDataType(Ljava/lang/Integer;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->dataType:Ljava/lang/Integer;

    .line 53
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->deviceCode:Ljava/lang/Long;

    .line 37
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->endTime:Ljava/lang/Long;

    .line 45
    return-void
.end method

.method public setQueryType(Ljava/lang/Integer;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->queryType:Ljava/lang/Integer;

    .line 21
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->startTime:Ljava/lang/Long;

    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetMotionPathByTimeReq{queryType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->queryType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->dataType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
