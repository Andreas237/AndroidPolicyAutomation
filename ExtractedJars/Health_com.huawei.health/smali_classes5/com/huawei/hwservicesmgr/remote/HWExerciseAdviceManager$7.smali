.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanDetailFromDevice(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

.field final synthetic val$isSuccess:Z


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Z)V
    .locals 0

    .line 3410
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iput-boolean p2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->val$isSuccess:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 3414
    iget-boolean v4, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->val$isSuccess:Z

    .line 3415
    const/16 v0, 0x2710

    if-eq v0, p1, :cond_0

    const/16 v0, 0x27d8

    if-ne v0, p1, :cond_2

    .line 3416
    :cond_0
    move-object v0, p2

    check-cast v0, [Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, [Ljava/lang/Object;

    .line 3417
    const/4 v0, 0x0

    aget-object v0, v5, v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    .line 3418
    const/4 v0, 0x1

    aget-object v0, v5, v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 3419
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 3420
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6570\u636e\u8fd4\u56de\u4e86 getRunPlanDetailFromDevice.get(i) = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3421
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3422
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3419
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 3424
    :cond_1
    const/4 v0, 0x2

    aget-object v0, v5, v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map;

    .line 3425
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, v6, v8}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    .line 3426
    goto :goto_1

    .line 3427
    :cond_2
    const/4 v4, 0x0

    .line 3428
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRunPlanDetailFromDevice() callback error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3430
    :goto_1
    const/16 v0, 0x27d8

    if-ne v0, p1, :cond_3

    .line 3431
    const/4 v4, 0x0

    .line 3433
    :cond_3
    if-eqz v4, :cond_4

    .line 3434
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILjava/lang/String;)V

    goto :goto_2

    .line 3436
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILjava/lang/String;)V

    .line 3438
    :goto_2
    return-void
.end method
