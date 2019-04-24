.class Lo/dde$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dde;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;)V
    .locals 0

    .line 3620
    iput-object p1, p0, Lo/dde$4;->c:Lo/dde;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .line 3623
    const/4 v0, 0x0

    if-eq v0, p2, :cond_7

    .line 3624
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " intent = "

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

    .line 3625
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3626
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3627
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 3628
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver() ConnectState() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3629
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_4

    .line 3632
    :sswitch_0
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->e(Lo/dde;)V

    .line 3634
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v0, v5}, Lo/dde;->d(Lo/dde;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 3636
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->a(Lo/dde;)Lo/djr$a;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->c(Lo/djr;)V

    .line 3638
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const-string v1, "connect_wear"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dip;->a(Ljava/lang/String;I)V

    .line 3640
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->d(Lo/dde;)V

    .line 3641
    goto/16 :goto_5

    .line 3644
    :sswitch_1
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const-string v1, "connect_wear"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dip;->a(Ljava/lang/String;I)V

    .line 3645
    invoke-static {}, Lo/dde;->x()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 3646
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3647
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dde;->a(Lcom/huawei/datatype/DataDeviceInfo;)Lcom/huawei/datatype/DataDeviceInfo;

    goto :goto_0

    .line 3649
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dde;->c(Lcom/huawei/datatype/DataDeviceInfo;)Lcom/huawei/datatype/DataDeviceInfo;

    .line 3651
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dde;->c(Lcom/huawei/datatype/DataDeviceIntelligentInfo;)Lcom/huawei/datatype/DataDeviceIntelligentInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3652
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 3653
    :goto_1
    invoke-static {}, Lo/dde;->y()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 3654
    :try_start_1
    invoke-static {}, Lo/dde;->z()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 3655
    const/16 v0, 0xd

    if-eq v0, v8, :cond_1

    .line 3656
    invoke-static {}, Lo/dde;->v()Ljava/util/Map;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 3658
    :cond_1
    goto :goto_2

    .line 3659
    :cond_2
    monitor-exit v6

    goto :goto_3

    :catchall_1
    move-exception v9

    monitor-exit v6

    throw v9

    .line 3660
    :goto_3
    goto :goto_5

    .line 3662
    :goto_4
    goto :goto_5

    .line 3665
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver() deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3667
    :goto_5
    goto :goto_6

    :cond_4
    const-string v0, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "android.intent.action.TIME_SET"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 3669
    :cond_5
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    iget-object v1, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v1}, Lo/dde;->k(Lo/dde;)I

    move-result v1

    iget-object v2, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v2}, Lo/dde;->h(Lo/dde;)I

    move-result v2

    iget-object v3, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v3}, Lo/dde;->b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lo/dde;->c(Lo/dde;IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_6

    .line 3670
    :cond_6
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3671
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6536\u5230phoneService\u7ed1\u5b9a\u6210\u529f\u7684\u5e7f\u64ad"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3672
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->e(Lo/dde;)V

    .line 3673
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->d(Lo/dde;)V

    .line 3675
    iget-object v0, p0, Lo/dde$4;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->a(Lo/dde;)Lo/djr$a;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->c(Lo/djr;)V

    goto :goto_6

    .line 3678
    :cond_7
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver() intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3680
    :cond_8
    :goto_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
