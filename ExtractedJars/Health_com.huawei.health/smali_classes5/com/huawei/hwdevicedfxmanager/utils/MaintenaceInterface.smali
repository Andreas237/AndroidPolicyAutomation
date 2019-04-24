.class public interface abstract Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract cutFolder(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract deleteTenDayFile()V
.end method

.method public abstract filtertFile(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
.end method

.method public abstract getDayDateTime()Ljava/lang/String;
.end method

.method public abstract getDeviceName(I)Ljava/lang/String;
.end method

.method public abstract getMaintCheckTime()Ljava/lang/String;
.end method

.method public abstract getMaintRetryNum()I
.end method

.method public abstract getMaintRetryResult()Z
.end method

.method public abstract getmTransferDataContentPath()Ljava/lang/String;
.end method

.method public abstract getmTransferStateContentPath()Ljava/lang/String;
.end method

.method public abstract initMaintenanceFile()V
.end method

.method public abstract initMaintenanceParame(ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract maintParametersCommand()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
.end method

.method public abstract onDestroyMaintenance()V
.end method

.method public abstract save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end method

.method public abstract setMaintCheckTime(Ljava/lang/String;)V
.end method

.method public abstract setMaintRetryNum(I)V
.end method

.method public abstract setMaintRetryResult(Z)V
.end method

.method public abstract transferFileEndProcess()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
.end method

.method public abstract writeLogToFile(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Date;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/lang/String;Ljava/util/Date;)V"
        }
    .end annotation
.end method
