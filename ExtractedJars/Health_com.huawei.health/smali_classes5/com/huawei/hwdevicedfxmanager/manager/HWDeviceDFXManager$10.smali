.class Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$10;
.super Landroid/os/Handler;
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
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Landroid/os/Looper;)V
    .locals 0

    .line 790
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$10;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 793
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 794
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 797
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$10;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$902(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Z)Z

    .line 798
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$10;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$1000(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 799
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$10;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$1000(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    .line 800
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 801
    const-string v0, ""

    const/4 v1, 0x1

    invoke-interface {v4, v1, v0}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    goto :goto_0

    .line 803
    :cond_0
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler() onFailure maintenanceCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    :goto_0
    goto :goto_1

    .line 806
    :cond_1
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure null == mDFXResponseCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    .line 812
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
    .end sparse-switch
.end method
