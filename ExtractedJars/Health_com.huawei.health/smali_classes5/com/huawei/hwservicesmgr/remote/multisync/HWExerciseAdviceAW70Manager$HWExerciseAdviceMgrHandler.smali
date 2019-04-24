.class Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$HWExerciseAdviceMgrHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "HWExerciseAdviceMgrHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;


# direct methods
.method public constructor <init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Landroid/os/Looper;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$HWExerciseAdviceMgrHandler;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    .line 211
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 212
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 216
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 217
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage msg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 220
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$HWExerciseAdviceMgrHandler;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    const-string v1, "TIMEOUT"

    const v2, 0x493e1

    invoke-static {v0, v2, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$000(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;ILjava/lang/String;)V

    .line 221
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----------------reset maintenance flag delete this code! have problem!--------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    .line 226
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
