.class Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;->a:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 401
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mNonLocalBroadcastReceiver()  intent : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 403
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 404
    const-string v0, "android.bluetooth.adapter.extra.STATE"

    const/16 v1, 0xa

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 405
    const/16 v0, 0xa

    if-ne v5, v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;->a:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V

    .line 408
    :cond_0
    goto :goto_1

    :cond_1
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 409
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 410
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 411
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v6

    .line 412
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    .line 414
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;->a:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;->a:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;->a:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->f(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V

    goto :goto_1

    .line 420
    :goto_0
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5176\u5b83\u72b6\u6001"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    :cond_2
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
