.class public Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private device_avoid_disturb_cycle:I

.field private device_avoid_disturb_end_time:I

.field private device_avoid_disturb_index:I

.field private device_avoid_disturb_start_time:I

.field private device_avoid_disturb_switch:I

.field private device_avoid_disturb_time_switch:I

.field private device_avoid_disturb_type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_index:I

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_switch:I

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_time_switch:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_type:I

    .line 30
    const/16 v0, 0x8fc

    iput v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_start_time:I

    .line 32
    const/16 v0, 0x2bc

    iput v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_end_time:I

    .line 42
    const/16 v0, 0x7f

    iput v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_cycle:I

    return-void
.end method


# virtual methods
.method public getDevice_avoid_disturb_cycle()I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_cycle:I

    return v0
.end method

.method public getDevice_avoid_disturb_end_time()I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_end_time:I

    return v0
.end method

.method public getDevice_avoid_disturb_index()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_index:I

    return v0
.end method

.method public getDevice_avoid_disturb_start_time()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_start_time:I

    return v0
.end method

.method public getDevice_avoid_disturb_switch()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_switch:I

    return v0
.end method

.method public getDevice_avoid_disturb_time_switch()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_time_switch:I

    return v0
.end method

.method public getDevice_avoid_disturb_type()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_type:I

    return v0
.end method

.method public setDevice_avoid_disturb_cycle(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_cycle:I

    .line 79
    return-void
.end method

.method public setDevice_avoid_disturb_end_time(I)V
    .locals 0

    .line 72
    iput p1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_end_time:I

    .line 73
    return-void
.end method

.method public setDevice_avoid_disturb_index(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_index:I

    .line 49
    return-void
.end method

.method public setDevice_avoid_disturb_start_time(I)V
    .locals 0

    .line 66
    iput p1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_start_time:I

    .line 67
    return-void
.end method

.method public setDevice_avoid_disturb_switch(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_switch:I

    .line 55
    return-void
.end method

.method public setDevice_avoid_disturb_time_switch(I)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_time_switch:I

    .line 87
    return-void
.end method

.method public setDevice_avoid_disturb_type(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_type:I

    .line 61
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[\u52ff\u6270\u4fe1\u606f\u5217\u8868\uff1aindex = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", switch = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_switch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", time_switch = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_time_switch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", start_time = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_start_time:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", end_time = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_end_time:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cycle = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->device_avoid_disturb_cycle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
