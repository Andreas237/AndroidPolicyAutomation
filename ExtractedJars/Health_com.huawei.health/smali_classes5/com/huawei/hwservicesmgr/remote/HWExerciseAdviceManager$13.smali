.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


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

    .line 3821
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 3824
    const v0, 0x186a0

    if-ne v0, p1, :cond_0

    .line 3825
    move-object v5, p2

    check-cast v5, Lcom/huawei/datatype/RunPlanParameter;

    .line 3826
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)[I

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanParameter;->getRun_plan_sync_size()I

    move-result v1

    div-int/lit16 v1, v1, 0x100

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 3827
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)[I

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanParameter;->getRun_plan_sync_size()I

    move-result v1

    rem-int/lit16 v1, v1, 0x100

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 3828
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanParameter;->getRun_plan_sign()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5302(Ljava/lang/String;)Ljava/lang/String;

    .line 3829
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncsize[0]="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)[I

    move-result-object v3

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",syncsize[1]="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)[I

    move-result-object v3

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",deviceSHAValue="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5300()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3830
    goto :goto_0

    .line 3831
    :cond_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAdviceParam fail err="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3833
    :goto_0
    return-void
.end method
