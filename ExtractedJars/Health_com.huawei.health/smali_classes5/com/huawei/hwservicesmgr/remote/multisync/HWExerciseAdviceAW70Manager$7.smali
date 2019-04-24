.class Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceWorkoutRecordIdList(Lorg/json/JSONObject;)V
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

    .line 2044
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 2048
    const v0, 0x186a0

    if-ne v0, p1, :cond_2

    .line 2049
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/Map;

    const-string v1, "value"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2050
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    new-instance v1, Lorg/json/JSONObject;

    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3102(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 2052
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "workoutRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 2053
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workoutRecordSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2054
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2055
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 2056
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lorg/json/JSONObject;

    .line 2057
    const-string v0, "paceIndexCount"

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    .line 2058
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get workout paceIndex count is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2059
    const-string v0, "workout_record_id"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    .line 2060
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " paceIndexCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " recordId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2063
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0, v10, v9}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3200(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;II)V

    .line 2055
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 2065
    :cond_0
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workoutRecordDetail:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2066
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 2068
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2202(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;I)I

    .line 2069
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 2070
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2071
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "workout_record_count"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 2073
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$2500(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    goto :goto_1

    .line 2077
    :cond_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 2078
    const-string v0, "startTime"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$1300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 2079
    const-string v0, "endTime"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 2080
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0, v7}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$3300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)V

    .line 2083
    :goto_1
    goto :goto_2

    .line 2084
    :cond_2
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkoutRecord error, error code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2085
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    const-string v1, "getDeviceWorkoutRecordIdList"

    invoke-static {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$000(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;ILjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2089
    :goto_2
    goto :goto_3

    .line 2087
    :catch_0
    move-exception v4

    .line 2088
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2090
    :goto_3
    return-void
.end method
