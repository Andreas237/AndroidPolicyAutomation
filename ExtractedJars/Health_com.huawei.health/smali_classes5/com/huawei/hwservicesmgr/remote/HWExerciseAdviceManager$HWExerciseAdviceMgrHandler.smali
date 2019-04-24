.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "HWExerciseAdviceMgrHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;


# direct methods
.method public constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Landroid/os/Looper;)V
    .locals 0

    .line 362
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    .line 363
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 364
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 368
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 369
    const-string v0, "HWExerciseAdviceManager"

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

    .line 370
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 372
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const-string v1, "TIMEOUT"

    const v2, 0x493e1

    invoke-static {v0, v2, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILjava/lang/String;)V

    .line 373
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----------------reset maintenance flag delete this code! have problem!--------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    goto :goto_0

    .line 378
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    .line 379
    goto :goto_0

    .line 381
    :pswitch_2
    goto :goto_0

    .line 384
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$300(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 393
    :cond_0
    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
