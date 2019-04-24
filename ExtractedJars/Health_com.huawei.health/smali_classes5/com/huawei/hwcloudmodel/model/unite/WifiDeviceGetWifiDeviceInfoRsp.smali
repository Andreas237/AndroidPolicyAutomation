.class public Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field public deviceDetailInfo:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceDetailInfo()Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->deviceDetailInfo:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    return-object v0
.end method

.method public setDeviceDetailInfo(Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->deviceDetailInfo:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    .line 17
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WifiDeviceGetWifiDeviceInfoRsp{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->deviceDetailInfo:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
