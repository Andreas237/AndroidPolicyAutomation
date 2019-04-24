.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ConnectHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 0

    .line 587
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 588
    return-void
.end method


# virtual methods
.method protected handleMessageWhenReferenceNotNull(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Landroid/os/Message;)V
    .locals 6

    .line 592
    if-nez p1, :cond_0

    .line 593
    return-void

    .line 595
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 598
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    .line 599
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment connect timeout..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    new-instance v5, Lo/egy$b;

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 602
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_scale_pair_timeout:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    .line 603
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_permisson:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    invoke-virtual {v5, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 613
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1802(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Lo/egy;)Lo/egy;

    .line 614
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 615
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 616
    .line 620
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 584
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;->handleMessageWhenReferenceNotNull(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Landroid/os/Message;)V

    return-void
.end method
