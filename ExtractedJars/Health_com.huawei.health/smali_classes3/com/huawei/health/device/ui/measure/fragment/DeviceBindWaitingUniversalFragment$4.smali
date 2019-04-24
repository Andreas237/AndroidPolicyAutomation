.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V
    .locals 0

    .line 543
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 546
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 547
    if-eqz p1, :cond_1

    .line 548
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 550
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    iget-object v1, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    monitor-enter v1

    .line 551
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/device/open/HealthDevice;

    .line 552
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/hihealth/device/open/HealthDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 553
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 556
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 557
    :goto_0
    goto :goto_1

    .line 559
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    iget-object v1, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    monitor-enter v1

    .line 560
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 563
    monitor-exit v1

    goto :goto_1

    .line 564
    :catchall_1
    move-exception v4

    monitor-exit v1

    throw v4

    .line 566
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    iget-object v1, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    monitor-enter v1

    .line 567
    :try_start_2
    iget v2, p1, Landroid/os/Message;->arg1:I

    .line 568
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 569
    monitor-exit v1

    goto :goto_1

    :catchall_2
    move-exception v5

    monitor-exit v1

    throw v5

    .line 574
    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
