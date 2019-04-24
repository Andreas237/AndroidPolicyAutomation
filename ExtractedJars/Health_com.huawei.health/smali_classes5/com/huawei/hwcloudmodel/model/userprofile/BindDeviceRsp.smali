.class public Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private deviceCode:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    .line 9
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->deviceCode:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->deviceCode:Ljava/lang/Long;

    .line 17
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindDeviceRsp{deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
