.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;
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
    name = "WorkoutDetailCallback"
.end annotation


# instance fields
.field private error:I

.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;


# direct methods
.method public constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V
    .locals 0

    .line 3996
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3997
    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->error:I

    .line 3998
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 4003
    const v0, 0x186a0

    if-ne v0, p1, :cond_5

    .line 4004
    const/4 v4, 0x0

    .line 4006
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/Map;

    const-string v1, "value"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 4007
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 4010
    goto :goto_0

    .line 4008
    :catch_0
    move-exception v5

    .line 4009
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4012
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 4013
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4018
    const/4 v5, 0x0

    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 4020
    const-string v0, "workout_data_index"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    const-string v2, "workout_data_index"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const-string v0, "workout_record_id"

    .line 4021
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    const-string v2, "workout_record_id"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 4022
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 4023
    goto :goto_2

    .line 4018
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 4028
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 4029
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->error:I

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lorg/json/JSONObject;I)V

    goto :goto_3

    .line 4032
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$5700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 4034
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const-string v1, "workout_record_id"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->error:I

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V

    goto :goto_3

    .line 4036
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const-string v1, "workout_record_id"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->error:I

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 4044
    :goto_3
    goto :goto_4

    .line 4039
    :catch_1
    move-exception v5

    .line 4040
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4042
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 4043
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    .line 4047
    :cond_4
    :goto_4
    goto :goto_5

    .line 4048
    :cond_5
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDetail error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4050
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 4051
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    .line 4054
    :goto_5
    return-void
.end method
