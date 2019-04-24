.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceRunPlanRecordStatistic(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

.field final synthetic val$errorCode:I


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V
    .locals 0

    .line 3611
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->val$errorCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 15

    .line 3615
    if-eqz p2, :cond_3

    .line 3616
    move-object/from16 v4, p2

    :try_start_0
    check-cast v4, Ljava/util/Map;

    .line 3617
    const-string v0, "value"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 3618
    const v0, 0x186a0

    move/from16 v1, p1

    if-ne v0, v1, :cond_2

    .line 3619
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the value is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3620
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the value is instanceof a list "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    instance-of v3, v5, Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3621
    new-instance v6, Lorg/json/JSONArray;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 3622
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 3623
    const-string v0, "run_plan_record_info_wourkout_id"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "runPlanRecordStructList"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    .line 3624
    invoke-static {v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    move-result v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "run_plan_workout_id"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 3623
    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3625
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/util/SparseArray;

    move-result-object v0

    const-string v1, "run_plan_record_info_id"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3628
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrDeviceId()Ljava/lang/String;

    move-result-object v8

    .line 3629
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1, v8}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3630
    const-string v0, "run_plan_record_info_id"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 3631
    const-string v0, "run_plan_record_info_start_time"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 3632
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1, v8}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/List;

    .line 3633
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/dkg;

    .line 3634
    const/4 v0, 0x0

    if-eq v0, v14, :cond_0

    invoke-virtual {v14}, Lo/dkg;->c()I

    move-result v0

    if-ne v0, v9, :cond_0

    invoke-virtual {v14}, Lo/dkg;->b()J

    move-result-wide v0

    cmp-long v0, v0, v10

    if-nez v0, :cond_0

    .line 3636
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3637
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->val$errorCode:I

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3638
    return-void

    .line 3640
    :cond_0
    goto :goto_0

    .line 3644
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    const-string v1, "run_plan_record_info_id"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3645
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const-string v1, "run_plan_record_info_id"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->val$errorCode:I

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V

    .line 3650
    goto :goto_1

    .line 3651
    :cond_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceRunPlanRecordStatistic error ,error="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3652
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3653
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 3663
    :cond_3
    :goto_1
    goto :goto_2

    .line 3658
    :catch_0
    move-exception v4

    .line 3659
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3660
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3661
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    .line 3665
    :goto_2
    return-void
.end method
