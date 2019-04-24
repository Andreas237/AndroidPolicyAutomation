.class public Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field public deviceProfiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;>;"
        }
    .end annotation
.end field

.field private retCode:I

.field private retMsg:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->retCode:I

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->deviceProfiles:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getDeviceProfiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;>;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->deviceProfiles:Ljava/util/List;

    return-object v0
.end method

.method public getRetCode()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->retCode:I

    return v0
.end method

.method public getRetMsg()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->retMsg:Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceProfiles(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/DeviceProfile;>;)V"
        }
    .end annotation

    .line 38
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->deviceProfiles:Ljava/util/List;

    .line 39
    return-void
.end method

.method public setRetCode(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->retCode:I

    .line 31
    return-void
.end method

.method public setRetMsg(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceInfosRsp;->retMsg:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public uadpGetBindDeviceInfosRsp1()V
    .locals 0

    .line 44
    return-void
.end method

.method public uadpGetBindDeviceInfosRsp2()V
    .locals 0

    .line 49
    return-void
.end method

.method public uadpGetBindDeviceInfosRsp3()V
    .locals 0

    .line 54
    return-void
.end method

.method public uadpGetBindDeviceInfosRsp4()V
    .locals 0

    .line 59
    return-void
.end method
