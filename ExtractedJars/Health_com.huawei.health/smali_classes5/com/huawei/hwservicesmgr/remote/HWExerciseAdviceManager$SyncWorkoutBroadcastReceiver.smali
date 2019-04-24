.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$SyncWorkoutBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SyncWorkoutBroadcastReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;


# direct methods
.method private constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    .locals 0

    .line 4144
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$SyncWorkoutBroadcastReceiver;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$1;)V
    .locals 0

    .line 4144
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$SyncWorkoutBroadcastReceiver;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 4147
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SyncWorkoutBroadcastReceiver has received a broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4148
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$SyncWorkoutBroadcastReceiver;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->syncDeviceWorkoutRecordInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4149
    return-void
.end method
