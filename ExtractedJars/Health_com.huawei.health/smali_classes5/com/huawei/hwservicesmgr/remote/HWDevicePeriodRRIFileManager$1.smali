.class Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;
.super Lo/djv$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

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

    .line 180
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "periodFileCallBack() fail. err_code :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",err_msg :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$500(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;ILjava/lang/Object;)Z

    .line 182
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V

    .line 183
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 187
    return-void
.end method

.method public onSuccess(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 89
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() onSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "periodFileCallBack() mTransferStateContentPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mTransferDataContentPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    move-object v4, p2

    .line 94
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;

    invoke-direct {v1, p0, v4}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;-><init>(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 176
    return-void
.end method
