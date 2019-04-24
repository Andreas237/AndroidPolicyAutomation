.class public Lcom/huawei/datatype/DataDeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private BT_version:Ljava/lang/String;

.field private device_bt_mac:Ljava/lang/String;

.field private device_emmc_id:Ljava/lang/String;

.field private device_imei:Ljava/lang/String;

.field private device_model:Ljava/lang/String;

.field private device_opensource_version:Ljava/lang/String;

.field private device_phone_numbe:Ljava/lang/String;

.field private device_sn:Ljava/lang/String;

.field private device_soft_version:Ljava/lang/String;

.field private device_type:I

.field private device_version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/huawei/datatype/DataDeviceInfo;->BT_version:Ljava/lang/String;

    .line 64
    iput p2, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_type:I

    .line 65
    iput-object p3, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_version:Ljava/lang/String;

    .line 66
    return-void
.end method


# virtual methods
.method public getBT_version()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->BT_version:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_bt_mac()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_bt_mac:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_emmc_id()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_emmc_id:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_imei()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_imei:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_model()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_model:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_opensource_version()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_opensource_version:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_phone_numbe()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_phone_numbe:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_sn()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_sn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_soft_version()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_soft_version:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_type()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_type:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDevice_version()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_version:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setBT_version(Ljava/lang/String;)V
    .locals 1

    .line 73
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->BT_version:Ljava/lang/String;

    .line 74
    return-void
.end method

.method public setDevice_bt_mac(Ljava/lang/String;)V
    .locals 1

    .line 121
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_bt_mac:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setDevice_emmc_id(Ljava/lang/String;)V
    .locals 1

    .line 153
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_emmc_id:Ljava/lang/String;

    .line 154
    return-void
.end method

.method public setDevice_imei(Ljava/lang/String;)V
    .locals 1

    .line 105
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_imei:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setDevice_model(Ljava/lang/String;)V
    .locals 1

    .line 145
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_model:Ljava/lang/String;

    .line 146
    return-void
.end method

.method public setDevice_opensource_version(Ljava/lang/String;)V
    .locals 1

    .line 129
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_opensource_version:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setDevice_phone_numbe(Ljava/lang/String;)V
    .locals 1

    .line 113
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_phone_numbe:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public setDevice_sn(Ljava/lang/String;)V
    .locals 1

    .line 137
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_sn:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setDevice_soft_version(Ljava/lang/String;)V
    .locals 1

    .line 97
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_soft_version:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public setDevice_type(I)V
    .locals 1

    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_type:I

    .line 82
    return-void
.end method

.method public setDevice_version(Ljava/lang/String;)V
    .locals 1

    .line 89
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_version:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataDeviceInfo [BT_version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->BT_version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_soft_version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_soft_version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_imei="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 162
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_imei:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_phone_numbe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_phone_numbe:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_bt_mac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 164
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_bt_mac:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_opensource_version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_opensource_version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_model:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device_emmc_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/DataDeviceInfo;->device_emmc_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 158
    return-object v0
.end method
