.class public Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private deviceCode:Ljava/lang/Long;

.field private deviceData:Ljava/lang/String;

.field private firmwareVersion:Ljava/lang/String;

.field private hardwareVersion:Ljava/lang/String;

.field private manufacturer:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private softwareVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->manufacturer:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->firmwareVersion:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->hardwareVersion:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->softwareVersion:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->name:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->deviceData:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getDeviceData()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->deviceData:Ljava/lang/String;

    return-object v0
.end method

.method public getFirmwareVersion()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getHardwareVersion()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getManufacturer()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->manufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSoftwareVersion()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->softwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->deviceCode:Ljava/lang/Long;

    .line 72
    return-void
.end method

.method public setDeviceData(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->deviceData:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setFirmwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->firmwareVersion:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setHardwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->hardwareVersion:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->manufacturer:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->name:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setSoftwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->softwareVersion:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindDeviceData{, deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", manufacturer=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->manufacturer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firmwareVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->firmwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hardwareVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->hardwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", softwareVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->softwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceData=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->deviceData:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
