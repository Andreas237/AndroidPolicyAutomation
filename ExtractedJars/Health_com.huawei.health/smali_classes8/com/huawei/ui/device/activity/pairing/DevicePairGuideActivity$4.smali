.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 1589
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 1592
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver : intent = "

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

    .line 1593
    const/4 v0, 0x0

    if-eq v0, p1, :cond_10

    .line 1594
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1596
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v5

    .line 1597
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1598
    return-void

    .line 1602
    :cond_0
    instance-of v0, v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-nez v0, :cond_1

    .line 1603
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "! parcelableExtra instanceof DeviceInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1604
    return-void

    .line 1607
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1608
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pair success done "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1609
    return-void

    .line 1612
    :cond_2
    move-object v6, v5

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1617
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1618
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1621
    :cond_3
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver deviceProductType =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1622
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver deviceInfo.getProductType() =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1623
    const-string v0, "connect_error_code"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 1624
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v8

    .line 1625
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",connectState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1626
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_0

    .line 1628
    :pswitch_0
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 1629
    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 1630
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver report device connecte state not match wanted device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1631
    return-void

    .line 1634
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1635
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver : DEVICE_CONNECTING\uff01, tempMac ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1637
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1638
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1639
    goto/16 :goto_0

    .line 1641
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 1642
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver report device connecte state not match wanted device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1643
    return-void

    .line 1645
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)Z

    .line 1646
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1648
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver : \u914d\u5bf9\u6210\u529f! DeviceConnectState : DEVICE_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1649
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1650
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1651
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDevIdType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    .line 1652
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ddy;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    .line 1654
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1656
    goto/16 :goto_0

    .line 1658
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/env;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    invoke-static {v0}, Lo/env;->c(I)I

    move-result v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v1

    if-eq v0, v1, :cond_8

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_8

    .line 1659
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive connect failed: device protocal is not equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1660
    return-void

    .line 1663
    :cond_8
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver : state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",tempMac:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1664
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1665
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not the current device state, ignore"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1666
    return-void

    .line 1668
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1669
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 1670
    const/4 v0, 0x3

    iput v0, v9, Landroid/os/Message;->what:I

    .line 1671
    iput v7, v9, Landroid/os/Message;->arg1:I

    .line 1672
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1674
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1675
    goto/16 :goto_0

    .line 1677
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/env;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    invoke-static {v0}, Lo/env;->c(I)I

    move-result v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v1

    if-eq v0, v1, :cond_a

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_a

    .line 1678
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive connect disconnect: device protocal is not equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1679
    return-void

    .line 1681
    :cond_a
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DEVICE_DISCONNECTED ,mac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",tempMac:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1682
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1683
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_b

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 1684
    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_c

    .line 1685
    :cond_b
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_d

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 1686
    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_d

    .line 1687
    :cond_c
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 1688
    const/4 v0, 0x3

    iput v0, v10, Landroid/os/Message;->what:I

    .line 1689
    iput v7, v10, Landroid/os/Message;->arg1:I

    .line 1690
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1692
    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1693
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 1694
    const/4 v0, 0x3

    iput v0, v10, Landroid/os/Message;->what:I

    .line 1695
    iput v7, v10, Landroid/os/Message;->arg1:I

    .line 1696
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1698
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1699
    goto/16 :goto_0

    .line 1703
    :pswitch_4
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver : state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1704
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1705
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1706
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1707
    goto :goto_0

    .line 1710
    :pswitch_5
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver : DEVICE_WORK_MODE_CONFLICT = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1711
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 1712
    const/4 v0, 0x3

    iput v0, v10, Landroid/os/Message;->what:I

    .line 1713
    const/4 v0, 0x6

    iput v0, v10, Landroid/os/Message;->arg1:I

    .line 1714
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1715
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1716
    .line 1720
    :cond_e
    :goto_0
    goto :goto_1

    :cond_f
    const-string v0, "com.huawei.bone.action.REQUEST_BIND_DEVICE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1721
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1724
    :cond_10
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
