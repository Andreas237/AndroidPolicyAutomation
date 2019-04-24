.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceRunPlanRecordIdList(ILorg/json/JSONObject;)V
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

    .line 3743
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->val$errorCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 3747
    const v0, 0x186a0

    if-ne v0, p1, :cond_2

    .line 3748
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/Map;

    const-string v1, "value"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 3749
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4602(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 3752
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 3753
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 3754
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONObject;

    .line 3755
    const-string v0, "paceIndexCount"

    const/4 v1, -0x1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    .line 3756
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get run plan paceIndex count is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3757
    const-string v0, "run_plan_record_id"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    .line 3759
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0, v9, v8}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V

    .line 3753
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 3763
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4502(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)I

    .line 3766
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "run_plan_record_count"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 3767
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->val$errorCode:I

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    goto :goto_1

    .line 3769
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->val$errorCode:I

    const-string v2, "getDeviceRunPlanRecordIdList"

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILjava/lang/String;)V

    .line 3770
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    .line 3772
    :goto_1
    goto :goto_2

    .line 3773
    :cond_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRunPlanRecord error, error code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3774
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const-string v1, "getDeviceRunPlanRecordIdList"

    invoke-static {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILjava/lang/String;)V

    .line 3775
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3781
    :goto_2
    goto :goto_3

    .line 3777
    :catch_0
    move-exception v4

    .line 3778
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3779
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const-string v1, "getDeviceRunPlanRecordIdList"

    invoke-static {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILjava/lang/String;)V

    .line 3780
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$1600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    .line 3782
    :goto_3
    return-void
.end method
