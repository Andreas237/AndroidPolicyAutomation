.class Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceRunPlanRecordIdList(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V
    .locals 0

    .line 2102
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 2106
    const v0, 0x186a0

    if-ne v0, p1, :cond_2

    .line 2107
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/Map;

    const-string v1, "value"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2702(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 2111
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 2112
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 2113
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONObject;

    .line 2114
    const-string v0, "paceIndexCount"

    const/4 v1, -0x1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    .line 2115
    const-string v0, "HWExerciseAdviceAW70Manager"

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

    .line 2116
    const-string v0, "run_plan_record_id"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    .line 2117
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0, v9, v8}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3200(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;II)V

    .line 2112
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 2121
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2602(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;I)I

    .line 2122
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2800(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 2123
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2900(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2124
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "run_plan_record_count"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 2125
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3000(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    goto :goto_1

    .line 2128
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    .line 2130
    :goto_1
    goto :goto_2

    .line 2131
    :cond_2
    const-string v0, "HWExerciseAdviceAW70Manager"

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

    .line 2132
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    const-string v1, "getDeviceRunPlanRecordIdList"

    invoke-static {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$000(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;ILjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2136
    :goto_2
    goto :goto_3

    .line 2134
    :catch_0
    move-exception v4

    .line 2135
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2137
    :goto_3
    return-void
.end method
