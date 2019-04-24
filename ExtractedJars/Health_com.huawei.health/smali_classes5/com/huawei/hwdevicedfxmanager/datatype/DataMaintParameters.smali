.class public Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private file_protocal_version:Ljava/lang/String;

.field private max_apply_data_size:I

.field private timeout:I

.field private transfer_bitmap_enable:Z

.field private transfer_unit_size:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    return-void
.end method


# virtual methods
.method public getFile_protocal_version()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->file_protocal_version:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMax_apply_data_size()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->max_apply_data_size:I

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

    .line 67
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->timeout:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTransfer_bitmap_enable()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->transfer_bitmap_enable:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getTransfer_unit_size()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->transfer_unit_size:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setFile_protocal_version(Ljava/lang/String;)V
    .locals 1

    .line 79
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->file_protocal_version:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setMax_apply_data_size(I)V
    .locals 1

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->max_apply_data_size:I

    .line 64
    return-void
.end method

.method public setTimeout(I)V
    .locals 1

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->timeout:I

    .line 72
    return-void
.end method

.method public setTransfer_bitmap_enable(Z)V
    .locals 1

    .line 53
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->transfer_bitmap_enable:Z

    .line 54
    return-void
.end method

.method public setTransfer_unit_size(I)V
    .locals 1

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->transfer_unit_size:I

    .line 47
    return-void
.end method
