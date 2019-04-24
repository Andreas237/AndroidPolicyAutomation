.class public Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public devId:Ljava/lang/String;

.field public services:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;>;"
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

    .line 21
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->devId:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceServiceInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->services:Ljava/util/List;

    return-object v0
.end method

.method public setDevId(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->devId:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public setDeviceServiceInfo(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;>;)V"
        }
    .end annotation

    .line 25
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->services:Ljava/util/List;

    .line 26
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WifiDeviceControlDataModelReq{devId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->devId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", services="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->services:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
