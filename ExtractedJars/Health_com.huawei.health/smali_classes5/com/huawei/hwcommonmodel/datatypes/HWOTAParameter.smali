.class public Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private OTA_protocol_version:Ljava/lang/String;

.field private breakPoint_enable:Z

.field private moduleStructList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/daq;>;"
        }
    .end annotation
.end field

.field private module_number:I

.field private packet_send_size:I

.field private packets_send_num:I

.field private timeout:I

.field private transport_type:I

.field private update_type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getModuleStructs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/daq;>;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->moduleStructList:Ljava/util/List;

    return-object v0
.end method

.method public getModule_number()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->module_number:I

    return v0
.end method

.method public getOTA_protocol_version()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->OTA_protocol_version:Ljava/lang/String;

    return-object v0
.end method

.method public getPacket_send_size()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->packet_send_size:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPackets_send_num()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->packets_send_num:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTimeout()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->timeout:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTransport_type()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->transport_type:I

    return v0
.end method

.method public getUpdate_type()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->update_type:I

    return v0
.end method

.method public initHWOTAParameter1()V
    .locals 0

    .line 96
    return-void
.end method

.method public initHWOTAParameter10()V
    .locals 0

    .line 105
    return-void
.end method

.method public initHWOTAParameter2()V
    .locals 0

    .line 97
    return-void
.end method

.method public initHWOTAParameter3()V
    .locals 0

    .line 98
    return-void
.end method

.method public initHWOTAParameter4()V
    .locals 0

    .line 99
    return-void
.end method

.method public initHWOTAParameter5()V
    .locals 0

    .line 100
    return-void
.end method

.method public initHWOTAParameter6()V
    .locals 0

    .line 101
    return-void
.end method

.method public initHWOTAParameter7()V
    .locals 0

    .line 102
    return-void
.end method

.method public initHWOTAParameter8()V
    .locals 0

    .line 103
    return-void
.end method

.method public initHWOTAParameter9()V
    .locals 0

    .line 104
    return-void
.end method

.method public isBreakPoint_enable()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->breakPoint_enable:Z

    return v0
.end method

.method public setBreakPoint_enable(Z)V
    .locals 0

    .line 52
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->breakPoint_enable:Z

    .line 53
    return-void
.end method

.method public setModuleStructs(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/daq;>;)V"
        }
    .end annotation

    .line 92
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->moduleStructList:Ljava/util/List;

    .line 93
    return-void
.end method

.method public setModule_number(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->module_number:I

    .line 85
    return-void
.end method

.method public setOTA_protocol_version(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->OTA_protocol_version:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public setPacket_send_size(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->packet_send_size:I

    .line 69
    return-void
.end method

.method public setPackets_send_num(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->packets_send_num:I

    .line 61
    return-void
.end method

.method public setTimeout(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->timeout:I

    .line 77
    return-void
.end method

.method public setTransport_type(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->transport_type:I

    .line 45
    return-void
.end method

.method public setUpdate_type(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/HWOTAParameter;->update_type:I

    .line 37
    return-void
.end method
