.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    .locals 0

    .line 2793
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 2796
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    .line 2797
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver() action = "

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

    .line 2798
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2799
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2800
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 2801
    const-string v0, "HWExerciseAdviceManager"

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

    .line 2802
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 2805
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    .line 2806
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2807
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2808
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2809
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 2811
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2812
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2820
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1300(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_4

    .line 2822
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3$1;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3$1;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperator(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 2839
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2841
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1102(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;

    .line 2842
    goto :goto_2

    .line 2844
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2845
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 2847
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 2848
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeMessages MSG_EXERCISEADVICE_SYNC_DETAIL_TIMEOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2849
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2850
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1402(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Z)Z

    .line 2860
    :cond_6
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
