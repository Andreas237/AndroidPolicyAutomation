.class Lo/div$7;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/div;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/div;


# direct methods
.method constructor <init>(Lo/div;)V
    .locals 0

    .line 861
    iput-object p1, p0, Lo/div$7;->d:Lo/div;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 864
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 865
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReceive deviceStatusReceiver:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    if-nez v4, :cond_0

    .line 867
    return-void

    .line 868
    :cond_0
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 869
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 870
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 871
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleDeviceConnection enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v6

    .line 873
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device Connect state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    const/4 v0, 0x2

    if-eq v0, v6, :cond_1

    .line 875
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 876
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 877
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 878
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 879
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    const/4 v1, -0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    const v3, 0x186a1

    invoke-static {v0, v2, v3, v1}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 880
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    const/4 v1, -0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, -0x1

    invoke-static {v0, v2, v3, v1}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 881
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    const/4 v1, -0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    const v3, 0x186a1

    invoke-static {v0, v2, v3, v1}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 882
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    const/4 v1, -0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    const/4 v3, -0x1

    invoke-static {v0, v2, v3, v1}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    goto :goto_0

    .line 885
    :cond_1
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 886
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler.hasMessages MULTI_SIM_WAIT_QUERY_CONN_TIMEOUT_MSG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 887
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 888
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-virtual {v0}, Lo/div;->a()V

    .line 892
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->e(Lo/div;)Ljava/util/List;

    move-result-object v7

    monitor-enter v7

    .line 893
    :try_start_0
    iget-object v0, p0, Lo/div$7;->d:Lo/div;

    invoke-static {v0}, Lo/div;->e(Lo/div;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 894
    const/4 v0, 0x0

    invoke-interface {v9, v6, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 895
    goto :goto_1

    .line 896
    :cond_3
    monitor-exit v7

    goto :goto_2

    :catchall_0
    move-exception v10

    monitor-exit v7

    throw v10

    .line 897
    :goto_2
    goto :goto_3

    .line 899
    :cond_4
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBTConnectStatus() deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 902
    :cond_5
    :goto_3
    return-void
.end method
