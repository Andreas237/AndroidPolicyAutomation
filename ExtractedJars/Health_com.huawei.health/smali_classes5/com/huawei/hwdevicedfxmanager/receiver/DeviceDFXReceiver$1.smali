.class Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver$1;->this$0:Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 4

    .line 68
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCrowdTestAndMaint, onFailure err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",err_msg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver$1;->this$0:Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->access$000(Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 70
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 0

    .line 73
    return-void
.end method

.method public onSuccess(ILjava/lang/String;)V
    .locals 4

    .line 62
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCrowdTestAndMaint,onSuccess suc_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",err_msg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver$1;->this$0:Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->access$000(Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 64
    return-void
.end method
