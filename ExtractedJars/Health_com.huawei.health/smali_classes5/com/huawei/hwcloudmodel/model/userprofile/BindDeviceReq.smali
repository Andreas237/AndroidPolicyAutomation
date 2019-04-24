.class public Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private deviceData:Ljava/lang/String;

.field private firmwareVersion:Ljava/lang/String;

.field private hardwareVersion:Ljava/lang/String;

.field private manufacturer:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private productId:Ljava/lang/Integer;

.field private softwareVersion:Ljava/lang/String;

.field private uniqueId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->manufacturer:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->firmwareVersion:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->hardwareVersion:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->softwareVersion:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->name:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->deviceData:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDeviceData()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->deviceData:Ljava/lang/String;

    return-object v0
.end method

.method public getFirmwareVersion()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getHardwareVersion()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getManufacturer()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->manufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/Integer;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->productId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSoftwareVersion()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->softwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getUniqueId()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->uniqueId:Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceData(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->deviceData:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public setFirmwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->firmwareVersion:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setHardwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->hardwareVersion:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->manufacturer:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->name:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setProductId(Ljava/lang/Integer;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->productId:Ljava/lang/Integer;

    .line 26
    return-void
.end method

.method public setSoftwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->softwareVersion:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setUniqueId(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->uniqueId:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindDeviceData{productId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->productId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", manufacturer=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->manufacturer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firmwareVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->firmwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hardwareVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->hardwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", softwareVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->softwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceData=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->deviceData:Ljava/lang/String;

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
