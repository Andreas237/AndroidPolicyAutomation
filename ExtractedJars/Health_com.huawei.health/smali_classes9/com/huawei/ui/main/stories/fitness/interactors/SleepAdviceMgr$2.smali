.class Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:J

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IJ)V
    .locals 0

    .line 353
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->e:I

    iput-wide p4, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 356
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 357
    :cond_0
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on success() datas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rest = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 360
    return-void

    .line 363
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->e:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->d:J

    move-object/from16 v3, p1

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Ljava/util/List;J)Z

    move-result v0

    if-nez v0, :cond_2

    .line 364
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentday score = 0,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 366
    return-void

    .line 368
    :cond_2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 369
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 370
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 372
    const-string v0, "type"

    move-object/from16 v1, p0

    :try_start_0
    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->e:I

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->c(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 373
    const-string v0, "curr_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->d:J

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;J)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 374
    const/4 v7, 0x0

    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_6

    .line 375
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_dream_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    .line 376
    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_sum_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v8, v0, v1

    .line 377
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_fall_time_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-long v9, v0

    .line 378
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_wake_up_time_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-long v11, v0

    .line 381
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_shallow_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 382
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_deep_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 383
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_dream_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 384
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_noon_sleep_count_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v16

    .line 385
    if-gtz v13, :cond_3

    if-gtz v14, :cond_3

    if-lez v15, :cond_5

    .line 386
    :cond_3
    if-lez v13, :cond_4

    if-nez v14, :cond_4

    if-nez v15, :cond_4

    .line 387
    goto/16 :goto_1

    .line 389
    :cond_4
    new-instance v17, Lorg/json/JSONObject;

    invoke-direct/range {v17 .. v17}, Lorg/json/JSONObject;-><init>()V

    .line 390
    const-string v0, "RDI"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_snore_freq_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 391
    const-string v0, "REM_scale"

    float-to-int v1, v8

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 392
    const-string v0, "all_sleep_time"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_sum_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 393
    const-string v0, "awake_time"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_wake_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    move-object/from16 v3, v17

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 394
    const-string v0, "deep_sleep_part_cnt"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_deep_count_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 395
    const-string v0, "deep_sleep_time"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_deep_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 396
    const-string v0, "efficency"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_efficiency_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 397
    const-string v0, "fall_asleep_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-static {v1, v9, v10}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;J)J

    move-result-wide v1

    move-object/from16 v3, v17

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 398
    const-string v0, "latency"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_latency_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 399
    const-string v0, "score"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_score_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 400
    const-string v0, "time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    move-object/from16 v2, p1

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;J)J

    move-result-wide v1

    move-object/from16 v3, v17

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 401
    const-string v0, "wake_up_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-static {v1, v11, v12}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;J)J

    move-result-wide v1

    move-object/from16 v3, v17

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 402
    const-string v0, "awake_cnt"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_wake_count_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 403
    const-string v0, "snore_cnt"

    move-object/from16 v1, p1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "core_sleep_snore_freq_key"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 404
    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 374
    :cond_5
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 408
    :cond_6
    if-eqz v6, :cond_7

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 409
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 410
    return-void

    .line 412
    :cond_7
    const-string v0, "sleep_info_arr"

    :try_start_1
    invoke-virtual {v4, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 413
    const-string v0, "sex"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 414
    const-string v0, "register_info"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 418
    goto :goto_2

    .line 415
    :catch_0
    move-exception v7

    .line 416
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCoreSleepDataFromStorage JSONException e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 420
    return-void
.end method
