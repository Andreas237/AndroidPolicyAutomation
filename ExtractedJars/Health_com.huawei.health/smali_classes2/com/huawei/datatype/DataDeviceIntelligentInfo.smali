.class public Lcom/huawei/datatype/DataDeviceIntelligentInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private device_hiv:Ljava/lang/String;

.field private device_manu:Ljava/lang/String;

.field private device_prodId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDevice_hiv()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_hiv:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_manu()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_manu:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_prodId()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_prodId:Ljava/lang/String;

    return-object v0
.end method

.method public setDevice_hiv(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_hiv:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public setDevice_manu(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_manu:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public setDevice_prodId(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_prodId:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataDeviceIntelligentInfo{device_manu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_manu:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_prodId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_prodId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_hiv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->device_hiv:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
