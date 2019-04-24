.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 1

    .line 1713
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1714
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 1715
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1718
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    .line 1719
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 1720
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage null == mActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1721
    return-void

    .line 1723
    :cond_0
    if-eqz p1, :cond_4

    .line 1724
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1725
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 1727
    :sswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment REFRESH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1728
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 1730
    const-string v0, "group"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1731
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Lo/aey;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1732
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1733
    const/4 v9, 0x0

    .line 1734
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/eok;

    .line 1735
    invoke-virtual {v11}, Lo/eok;->o()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "ID"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x4b

    if-ne v0, v1, :cond_1

    .line 1736
    const/4 v9, 0x1

    .line 1738
    :cond_1
    goto :goto_0

    .line 1740
    :cond_2
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v10

    .line 1741
    if-nez v9, :cond_3

    if-eqz v10, :cond_3

    .line 1742
    invoke-static {}, Lo/dda;->b()Lo/ddc;

    move-result-object v11

    .line 1743
    move-object v0, v6

    invoke-virtual {v11}, Lo/ddc;->k()I

    move-result v1

    invoke-virtual {v11}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11}, Lo/ddc;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11}, Lo/ddc;->i()I

    move-result v4

    invoke-virtual {v11}, Lo/ddc;->c()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;ILjava/lang/String;Ljava/lang/String;II)V

    .line 1744
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1747
    :cond_3
    goto/16 :goto_1

    .line 1750
    :sswitch_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1751
    goto/16 :goto_1

    .line 1753
    :sswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lo/eav;

    if-eqz v0, :cond_4

    .line 1754
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lo/eav;

    .line 1755
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wear info download success uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1757
    invoke-static {v6, v8}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/eav;)V

    .line 1758
    goto/16 :goto_1

    .line 1761
    :sswitch_3
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->w(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1762
    goto/16 :goto_1

    .line 1764
    :sswitch_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v6, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->g(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)V

    .line 1765
    goto/16 :goto_1

    .line 1767
    :sswitch_5
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEAR_INFO_DOWNLOAD_FINISH "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1768
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1769
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)I

    .line 1770
    goto :goto_1

    .line 1772
    :sswitch_6
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEAR_INFO_DOWNLOAD_ERROR "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1773
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1774
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1775
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    goto :goto_1

    .line 1779
    :sswitch_7
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEAR_INFO_NOT_PLACED "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1780
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1781
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    goto :goto_1

    .line 1785
    :sswitch_8
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEAR_INFO_HAVE_NO_CACHE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1786
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->D(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1787
    goto :goto_1

    .line 1789
    :sswitch_9
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEAR_INFO_LOADING_TIME_OUT "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1790
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1791
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1792
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1793
    invoke-static {v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1800
    :cond_4
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0xa -> :sswitch_2
        0x14 -> :sswitch_3
        0x1e -> :sswitch_4
        0x28 -> :sswitch_5
        0x32 -> :sswitch_6
        0x3c -> :sswitch_8
        0x46 -> :sswitch_9
        0x50 -> :sswitch_7
    .end sparse-switch
.end method
