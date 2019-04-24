.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;
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
    name = "PaceMapCallback"
.end annotation


# instance fields
.field private error:I

.field private recordId:I

.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;


# direct methods
.method public constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    .locals 0

    .line 3236
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3237
    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->recordId:I

    .line 3238
    iput p3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->error:I

    .line 3239
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 3244
    const v0, 0x186a0

    if-ne v0, p1, :cond_6

    .line 3245
    const/4 v5, 0x0

    .line 3247
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/Map;

    const-string v1, "value"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 3248
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkoutRecordPaceMapCallback==value.toString()\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3249
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 3252
    goto :goto_0

    .line 3250
    :catch_0
    move-exception v6

    .line 3251
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3254
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 3256
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONObject;

    .line 3257
    const-string v0, "workout_record_id"

    const/4 v1, -0x1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "workout_record_id"

    const/4 v2, -0x1

    invoke-virtual {v5, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v0, v1, :cond_0

    const-string v0, "paceIndex"

    .line 3258
    const/4 v1, -0x1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "paceIndex"

    const/4 v2, -0x1

    invoke-virtual {v5, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 3259
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 3260
    goto :goto_2

    .line 3262
    :cond_0
    goto :goto_1

    .line 3263
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3264
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===getWorkoutRecordPaceMapCallback workoutID ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_id"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3265
    const/4 v6, 0x0

    :goto_3
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 3266
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "xxxxxxxxxxxxxxxxx===getWorkoutRecordPaceMapCallback workoutID ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_id"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";paceIndex:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "paceIndex"

    const/4 v4, -0x1

    invoke-virtual {v5, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3268
    const-string v0, "workout_record_id"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/PaceIndexStruct;

    invoke-virtual {v1}, Lcom/huawei/datatype/PaceIndexStruct;->getRecordId()I

    move-result v1

    if-ne v0, v1, :cond_2

    const-string v0, "paceIndex"

    .line 3269
    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/PaceIndexStruct;

    invoke-virtual {v1}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 3270
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxxxxxxxxxxxxxx==remove"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3271
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 3272
    goto :goto_4

    .line 3265
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_3

    .line 3276
    :cond_3
    :goto_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 3277
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->recordId:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->error:I

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V

    goto :goto_5

    .line 3279
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->recordId:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->error:I

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 3293
    :goto_5
    goto :goto_6

    .line 3281
    :catch_1
    move-exception v6

    .line 3282
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3284
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3285
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    .line 3293
    goto :goto_6

    .line 3287
    :catch_2
    move-exception v6

    .line 3288
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPaceError:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3290
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3291
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    .line 3295
    :cond_5
    :goto_6
    goto :goto_7

    .line 3296
    :cond_6
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPace Error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3298
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3299
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    .line 3302
    :goto_7
    return-void
.end method
