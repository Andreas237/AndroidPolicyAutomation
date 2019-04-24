.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$MyTimerTask;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyTimerTask"
.end annotation


# instance fields
.field private mWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 1

    .line 559
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 560
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$MyTimerTask;->mWeakRef:Ljava/lang/ref/WeakReference;

    .line 561
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 565
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$MyTimerTask;->mWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    .line 566
    if-nez v4, :cond_0

    .line 567
    return-void

    .line 569
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect timeout..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$002(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Z)Z

    .line 572
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/afj;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 573
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 574
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->f()Z

    .line 577
    :cond_1
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 578
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 580
    :cond_2
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 581
    return-void
.end method
