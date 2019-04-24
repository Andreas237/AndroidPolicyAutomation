.class public Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public devId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDevId()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;->devId:Ljava/lang/String;

    return-object v0
.end method

.method public setDevId(Ljava/lang/String;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;->devId:Ljava/lang/String;

    .line 13
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WifiDeviceGetWifiDeviceInfoReq{devId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;->devId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
