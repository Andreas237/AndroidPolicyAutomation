.class Lo/dgr$10;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dgr;


# direct methods
.method constructor <init>(Lo/dgr;)V
    .locals 0

    .line 484
    iput-object p1, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 487
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 488
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 489
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 490
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 491
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver() status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 495
    :sswitch_0
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 496
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dgs;->removeMessages(I)V

    .line 498
    :cond_0
    invoke-static {}, Lo/dgq;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 499
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->g(Lo/dgr;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 500
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 501
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dgs;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 504
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->g(Lo/dgr;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 505
    :cond_2
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 506
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dgs;->sendEmptyMessage(I)Z

    .line 511
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-virtual {v0}, Lo/dgr;->e()V

    .line 513
    :cond_4
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dgr;->d(Lo/dgr;Ljava/lang/String;)Ljava/lang/String;

    .line 514
    goto :goto_1

    .line 516
    :sswitch_1
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 517
    iget-object v0, p0, Lo/dgr$10;->d:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->i(Lo/dgr;)Lo/dgs;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Lo/dgs;->sendEmptyMessageDelayed(IJ)Z

    .line 526
    :cond_5
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
