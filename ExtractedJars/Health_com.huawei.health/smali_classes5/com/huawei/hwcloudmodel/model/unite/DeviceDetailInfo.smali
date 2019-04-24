.class public Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public devId:Ljava/lang/String;

.field public devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

.field public deviceCode:Ljava/lang/Long;

.field public services:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDevId()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    return-object v0
.end method

.method public getDevInfo()Lcom/huawei/hwcloudmodel/model/unite/DevInfo;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getServices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;>;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->services:Ljava/util/List;

    return-object v0
.end method

.method public setDevId(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public setDevInfo(Lcom/huawei/hwcloudmodel/model/unite/DevInfo;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    .line 37
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->deviceCode:Ljava/lang/Long;

    .line 29
    return-void
.end method

.method public setServices(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;>;)V"
        }
    .end annotation

    .line 44
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->services:Ljava/util/List;

    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceDetailInfo{devId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", devInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", services="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->services:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
