.class public Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field public registerInfo:Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getRegisterInfo()Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;->registerInfo:Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;

    return-object v0
.end method

.method public setRegisterInfo(Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;->registerInfo:Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;

    .line 14
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WifiDeviceRegisterVerifyCodeInfoRsp{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;->registerInfo:Lcom/huawei/hwcloudmodel/model/unite/RegisterInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
