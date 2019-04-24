.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;)V
    .locals 0

    .line 2822
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 2825
    const v0, 0x186a0

    if-ne v0, p1, :cond_0

    .line 2826
    move-object v2, p2

    check-cast v2, Lcom/huawei/datatype/OperatorStatus;

    .line 2827
    invoke-virtual {v2}, Lcom/huawei/datatype/OperatorStatus;->getTrain_monitor_state()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 2832
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1202(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Z)Z

    .line 2835
    :cond_0
    return-void
.end method
