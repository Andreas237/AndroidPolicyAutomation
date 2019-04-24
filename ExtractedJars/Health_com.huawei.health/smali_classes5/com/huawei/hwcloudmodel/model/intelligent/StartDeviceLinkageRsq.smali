.class public Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private devId:Ljava/lang/String;

.field private device_prodId:Ljava/lang/String;

.field private expiresIn:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getDevId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->devId:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_prodId()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->device_prodId:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiresIn()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->expiresIn:I

    return v0
.end method

.method public setDevId(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->devId:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public setDevice_prodId(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->device_prodId:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public setExpiresIn(I)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->expiresIn:I

    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartDeviceLinkageRsq{expiresIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->expiresIn:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", devId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->devId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_prodId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->device_prodId:Ljava/lang/String;

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
