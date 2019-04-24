.class public Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private devInfo:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

.field private deviceCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDevInfo()Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->devInfo:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->deviceCode:Ljava/lang/String;

    return-object v0
.end method

.method public setDevInfo(Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->devInfo:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    .line 27
    return-void
.end method

.method public setDeviceCode(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->deviceCode:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceLinkageRequest{deviceCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->deviceCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", devInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->devInfo:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
