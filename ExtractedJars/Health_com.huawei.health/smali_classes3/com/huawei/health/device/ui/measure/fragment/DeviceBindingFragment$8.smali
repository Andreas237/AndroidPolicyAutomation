.class final Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$8;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1377
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1380
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1381
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1382
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 1383
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1384
    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$000()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1388
    :cond_0
    return-void
.end method
