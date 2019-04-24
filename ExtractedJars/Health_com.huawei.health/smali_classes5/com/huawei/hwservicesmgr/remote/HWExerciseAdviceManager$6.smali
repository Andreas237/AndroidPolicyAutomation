.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkOutDetailFromDevice(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

.field final synthetic val$error:I

.field final synthetic val$recordId:I


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    .locals 0

    .line 3126
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->val$recordId:I

    iput p3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->val$error:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 17

    .line 3129
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6570\u636e\u8fd4\u56de\u4e86 err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3130
    const/4 v4, 0x1

    .line 3131
    const/16 v0, 0x2710

    move/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/16 v0, 0x27d8

    move/from16 v1, p1

    if-ne v0, v1, :cond_5

    .line 3132
    :cond_0
    move-object/from16 v0, p2

    check-cast v0, [Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, [Ljava/lang/Object;

    .line 3133
    const/4 v0, 0x0

    aget-object v0, v5, v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    .line 3134
    const/4 v0, 0x1

    aget-object v0, v5, v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 3137
    new-instance v8, Lo/dkg;

    invoke-direct {v8}, Lo/dkg;-><init>()V

    .line 3138
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrDeviceId()Ljava/lang/String;

    move-result-object v9

    .line 3139
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .line 3140
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3141
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map$Entry;

    .line 3142
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Integer;

    .line 3143
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/Integer;

    .line 3145
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1, v9}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 3146
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    .line 3148
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1, v9}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/util/List;

    .line 3150
    :goto_1
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v8, v0}, Lo/dkg;->a(I)V

    .line 3152
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lorg/json/JSONObject;

    .line 3153
    const/4 v0, 0x0

    if-eq v0, v15, :cond_2

    .line 3154
    const-string v0, "workout_record_start_time"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dkg;->b(J)V

    goto :goto_2

    .line 3156
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lorg/json/JSONObject;

    .line 3157
    const/4 v0, 0x0

    if-eq v0, v15, :cond_3

    .line 3158
    const-string v0, "run_plan_record_info_start_time"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dkg;->b(J)V

    .line 3161
    :cond_3
    :goto_2
    invoke-interface {v14, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3162
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1, v9}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3164
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6570\u636e\u8fd4\u56de\u4e86 lstGPSWorkoutRecordID.get(i) = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3165
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3166
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$2900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v6, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3168
    const/4 v0, 0x2

    aget-object v0, v5, v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/Map;

    .line 3169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-static {v0, v1, v6, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    .line 3170
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->val$recordId:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->val$error:I

    const-string v3, "get gps ok"

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;IILjava/lang/String;)V

    .line 3171
    goto/16 :goto_0

    .line 3181
    :cond_4
    goto :goto_3

    .line 3182
    :cond_5
    const/4 v4, 0x0

    .line 3183
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkOutDetailFromDevice() callback error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3185
    :goto_3
    const/16 v0, 0x27d8

    move/from16 v1, p1

    if-ne v0, v1, :cond_6

    .line 3186
    const/4 v4, 0x0

    .line 3188
    :cond_6
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->val$error:I

    if-eqz v0, :cond_7

    .line 3189
    const/4 v4, 0x0

    .line 3191
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3192
    if-eqz v4, :cond_8

    .line 3193
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->val$error:I

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    goto :goto_4

    .line 3195
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    .line 3199
    :goto_4
    return-void
.end method
