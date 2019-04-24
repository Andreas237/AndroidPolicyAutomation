.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->onSuccess(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;)V
    .locals 0

    .line 6481
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 6484
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->isNoNetworkActive(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6485
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6486
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6487
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6488
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6489
    return-void

    .line 6491
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->isWifiActive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6492
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifi is disconnected , use network"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6493
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6494
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 6496
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ah(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setCallback(Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;)V

    goto :goto_0

    .line 6499
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6500
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6501
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_background:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6502
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6b63\u5728\u8fdb\u884clog  wifi\u4e0a\u4f20"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6503
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 6504
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 6505
    const/16 v0, 0x3fd

    iput v0, v4, Landroid/os/Message;->what:I

    .line 6506
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 6510
    :goto_0
    return-void
.end method
