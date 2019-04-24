.class Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V
    .locals 0

    .line 555
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 558
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver(): mUpgradeHandler = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+intent = "

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

    .line 559
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 560
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 562
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    .line 563
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 564
    return-void

    .line 566
    :cond_0
    instance-of v0, v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-nez v0, :cond_1

    .line 567
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "! parcelableExtra instanceof DeviceInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    return-void

    .line 570
    :cond_1
    move-object v5, v4

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 571
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v6

    .line 572
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver(): state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",deviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 575
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 576
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver V2  mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    move-result-object v3

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    move-result-object v0

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    move-result-object v0

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    const/16 v1, 0xe

    if-eq v0, v1, :cond_3

    .line 578
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 581
    :cond_2
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver V2  mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    move-result-object v3

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    move-result-object v0

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    move-result-object v0

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    const/16 v1, 0xe

    if-eq v0, v1, :cond_3

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Ljava/lang/String;)V

    .line 586
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Z)Z

    .line 587
    goto/16 :goto_1

    .line 589
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    move-result-object v0

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    const/16 v1, 0xc

    if-eq v0, v1, :cond_5

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_switch_device_connect_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Ljava/lang/String;)V

    goto :goto_1

    .line 594
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    move-result-object v0

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    const/16 v1, 0xc

    if-eq v0, v1, :cond_5

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_switch_device_connect_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Ljava/lang/String;)V

    goto :goto_1

    .line 600
    :pswitch_2
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Z)Z

    .line 602
    .line 608
    :cond_5
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
