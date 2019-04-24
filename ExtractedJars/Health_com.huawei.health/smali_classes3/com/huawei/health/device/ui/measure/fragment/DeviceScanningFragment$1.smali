.class Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 61
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 62
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment mHandler handleMessage:null == msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 64
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 65
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 67
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/util/ArrayList;

    move-result-object v4

    monitor-enter v4

    .line 68
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/acl;

    .line 69
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Lo/acl;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 72
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->refreshData(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :cond_1
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 76
    :goto_0
    goto :goto_1

    .line 78
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/util/ArrayList;

    move-result-object v4

    monitor-enter v4

    .line 79
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 80
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;-><init>()V

    .line 81
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 82
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    :cond_2
    monitor-exit v4

    goto :goto_1

    .line 88
    :catchall_1
    move-exception v7

    monitor-exit v4

    throw v7

    .line 93
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
