.class Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;
.super Lo/djv$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V
    .locals 0

    .line 521
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-direct {p0}, Lo/djv$d;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 537
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dfxITransferSleepAndDFXFileCallback() onFailure err_msg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$600(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 539
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$600(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    goto :goto_0

    .line 541
    :cond_0
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dfxITransferSleepAndDFXFileCallback() onFailure maintenanceCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    :goto_0
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 547
    return-void
.end method

.method public onSuccess(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 525
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dfxITransferSleepAndDFXFileCallback() onSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->setMaintRetryResult(Z)V

    .line 528
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$600(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 529
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$600(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const-string v1, ""

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onSuccess(ILjava/lang/String;)V

    goto :goto_0

    .line 531
    :cond_0
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dfxITransferSleepAndDFXFileCallback() onSuccess maintenanceCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    :goto_0
    return-void
.end method
