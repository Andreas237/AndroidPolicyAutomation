.class public Lo/bsx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/suggestion/model/RunWorkout;)Ljava/lang/String;
    .locals 9

    .line 394
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 396
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 397
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v5

    .line 398
    const-string v0, "warmup"

    invoke-static {v4, v0, v5}, Lo/bsx;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 400
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v6

    .line 401
    const-string v0, "rest"

    invoke-static {v4, v0, v6}, Lo/bsx;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 403
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v7

    .line 404
    const-string v0, "cooldown"

    invoke-static {v4, v0, v7}, Lo/bsx;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 406
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v8

    .line 407
    const-string v0, "work"

    invoke-static {v4, v0, v8}, Lo/bsx;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 409
    const-string v0, "dayNumber"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getDayNumber()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 410
    const-string v0, "phraseNumber"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getPhraseNumber()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 411
    const-string v0, "repeats"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRepeats()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 412
    const-string v0, "weekPhraseNumber"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWeekPhraseNumber()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 413
    const-string v0, "trainingEffect"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getTrainingEffect()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 414
    const-string v0, "distance"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 415
    const-string v0, "duration"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDuration()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 419
    :cond_0
    goto :goto_0

    .line 417
    :catch_0
    move-exception v5

    .line 418
    const-string v0, "DataRunPlanConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 436
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 437
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 438
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 439
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 440
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 441
    new-instance v7, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 442
    const-string v0, "id"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveId(I)V

    .line 443
    invoke-virtual {v7, p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 444
    const-string v0, "displayorder"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutOrder(I)V

    .line 445
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 446
    const-string v0, "workoutId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 447
    const-string v0, "trainingDate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutDate(Ljava/lang/String;)V

    .line 448
    const-string v0, "actualCalorie"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 449
    const-string v0, "actualDistance"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualDistance(F)V

    .line 450
    const-string v0, "by"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveRecordType(I)V

    .line 451
    const-string v0, "calorie"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 452
    const-string v0, "distance"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDistance(F)V

    .line 453
    const-string v0, "completeTime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzv;->a(J)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 454
    const-string v0, "oxygen"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveOxygen(D)V

    .line 455
    const-string v0, "trainingLoadPeak"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveTrainingLoadPeak(I)V

    .line 456
    const-string v0, "completionRate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 457
    const-string v0, "duration"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDuring(I)V

    .line 458
    const-string v0, "heartRateUp"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveUpperHeartRate(I)V

    .line 459
    const-string v0, "heartRateDown"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveLowerHeartRate(I)V

    .line 460
    const-string v0, "bestPace"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveBestPace(I)V

    .line 461
    const-string v0, "weekSequence"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWeekNum(I)V

    .line 463
    const-string v0, "trajectoryId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 464
    const-string v0, "DataRunPlanConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireTrajectoryId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 467
    const-string v0, "gps_maptracking_"

    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 468
    const-string v0, "gps_maptracking_"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 469
    const-string v0, "yyyyMMddHHmmssSSS"

    invoke-static {v9, v0}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 470
    if-eqz v10, :cond_0

    .line 471
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 472
    const-string v0, "DataRunPlanConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "replaceTrajectoryId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    :cond_0
    invoke-virtual {v7, v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveTrajectoryId(Ljava/lang/String;)V

    .line 478
    const-string v0, "actionSummary"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActionSummary(Ljava/lang/String;)V

    .line 479
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 480
    const-string v0, "wearType"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWearType(I)V

    .line 481
    const-string v0, "extend"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExtend(Ljava/lang/String;)V

    .line 483
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 487
    :cond_2
    return-object v4
.end method

.method private static b(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/DayInfo;
    .locals 6

    .line 275
    new-instance v2, Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/DayInfo;-><init>()V

    .line 276
    const-string v0, "displayorder"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveSinglesCount(I)V

    .line 278
    const-string v0, "trainingDate"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 279
    invoke-static {v3, v4}, Lo/cap;->d(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzv;->e(J)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveOrder(I)V

    .line 280
    const-string v0, "yyyy-MM-dd"

    invoke-static {v3, v4, v0}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 282
    invoke-virtual {v2, v5}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDate(Ljava/lang/String;)V

    .line 283
    return-object v2
.end method

.method private static b(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/WeekInfo;
    .locals 2

    .line 288
    new-instance v1, Lcom/huawei/health/suggestion/model/WeekInfo;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/WeekInfo;-><init>()V

    .line 289
    const-string v0, "duration"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->setDuration(I)V

    .line 290
    const-string v0, "displayorder"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveOrder(I)V

    .line 291
    const-string v0, "sentence"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveSentence(Ljava/lang/String;)V

    .line 292
    const-string v0, "stage"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveWeekName(Ljava/lang/String;)V

    .line 293
    const-string v0, "stage"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->setStage(I)V

    .line 294
    return-object v1
.end method

.method public static b(Lcom/huawei/health/suggestion/model/Plan;)Ljava/lang/String;
    .locals 6

    .line 206
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 208
    const-string v0, "planId"

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    const-string v0, "name"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 210
    const-string v0, "type"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 211
    const-string v0, "difficulty"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getDifficulty()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 212
    const-string v0, "weekCount"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getWeekCount()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 213
    const-string v0, "calorie"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getCalorie()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 214
    const-string v0, "distance"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getDistance()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->b(F)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 215
    const-string v0, "picture"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getPicture()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    const-string v0, "version"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 218
    const-string v0, "beginDate"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-static {v1, v2}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 219
    const-string v0, "endDate"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-static {v1, v2}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 220
    const-string v0, "excludedDate"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireExcludedDates()Ljava/util/TreeSet;

    move-result-object v1

    invoke-static {v1}, Lo/bsu;->c(Ljava/util/TreeSet;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    const-string v0, "movementTimes"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWeekTimes()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 222
    const-string v0, "goal"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 223
    const-string v0, "remindTime"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getRemindTime()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 224
    const-string v0, "version"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    goto :goto_0

    .line 225
    :catch_0
    move-exception v5

    .line 226
    const-string v0, "DataRunPlanConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 239
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 240
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 242
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 243
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 244
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 245
    const-string v0, "courses"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 246
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 248
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 249
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 250
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 251
    new-instance v7, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;-><init>()V

    .line 252
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putName(Ljava/lang/String;)V

    .line 253
    const-string v0, "description"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDescription(Ljava/lang/String;)V

    .line 254
    const-string v0, "workoutId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWorkoutId(Ljava/lang/String;)V

    .line 255
    const-string v0, "runningParas"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putExtendParams(Ljava/lang/String;)V

    .line 256
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putVersion(Ljava/lang/String;)V

    .line 257
    invoke-static {v3, v6}, Lo/bsx;->b(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v8

    .line 259
    invoke-virtual {v7, v8}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V

    .line 260
    invoke-static {v6}, Lo/bsx;->b(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v9

    .line 262
    invoke-virtual {v7, v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V

    .line 263
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 242
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 270
    :cond_2
    return-object v1
.end method

.method public static b(ILcom/huawei/health/suggestion/model/WorkoutRecord;)Lorg/json/JSONObject;
    .locals 6

    .line 550
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 552
    const-string v0, "id"

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireId()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 553
    const-string v0, "by"

    invoke-virtual {v4, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 554
    const-string v0, "planId"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 555
    const-string v0, "weekSequence"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWeekNum()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 556
    const-string v0, "trainingDate"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-static {v1, v2}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 557
    const-string v0, "workoutId"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 558
    const-string v0, "name"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 559
    const-string v0, "displayorder"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutOrder()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 560
    const-string v0, "distance"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDistance()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->e(F)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 561
    const-string v0, "calorie"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireCalorie()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 563
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 564
    const-string v0, "actualDistance"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->e(F)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    .line 566
    :cond_0
    const-string v0, "actualDistance"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDistance()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->e(F)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 569
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 570
    const-string v0, "actualCalorie"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    goto :goto_1

    .line 572
    :cond_1
    const-string v0, "actualCalorie"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireCalorie()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 575
    :goto_1
    const-string v0, "completionRate"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->i(F)F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 576
    const-string v0, "duration"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 577
    const-string v0, "heartRateUp"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireUpperHeartRate()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 578
    const-string v0, "heartRateDown"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireLowerHeartRate()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 579
    const-string v0, "bestPace"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireBestPace()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 580
    const-string v0, "completeTime"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cap;->b(J)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 581
    const-string v0, "oxygen"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireOxygen()D

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 582
    const-string v0, "trainingLoadPeak"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireTrainingLoadPeak()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 583
    const-string v0, "trajectoryId"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireTrajectoryId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 584
    const-string v0, "actionSummary"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActionSummary()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 585
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 586
    const-string v0, "1.0"

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 588
    :cond_2
    const-string v0, "version"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 589
    const-string v0, "wearType"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWearType()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 590
    const-string v0, "extend"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExtend()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 594
    goto :goto_2

    .line 592
    :catch_0
    move-exception v5

    .line 593
    const-class v0, Lo/bsx;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    :goto_2
    return-object v4
.end method

.method private static b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/huawei/health/suggestion/model/ExerciseProfile;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 424
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 425
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 427
    :cond_0
    return-void
.end method

.method public static d(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 4

    .line 173
    const/4 v3, 0x0

    .line 175
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 176
    new-instance v3, Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/Plan;-><init>()V

    .line 178
    const-string v0, "planId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveId(Ljava/lang/String;)V

    .line 179
    const-string v0, "name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 180
    const-string v0, "type"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveType(I)V

    .line 181
    const-string v0, "difficulty"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->setDifficulty(I)V

    .line 182
    const-string v0, "weekCount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveWeekCount(I)V

    .line 183
    const-string v0, "calorie"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveCalorie(F)V

    .line 184
    const-string v0, "distance"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->setDistance(F)V

    .line 185
    const-string v0, "picture"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->savePicture(Ljava/lang/String;)V

    .line 186
    const-string v0, "excludedDate"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsu;->b(Ljava/lang/String;)Ljava/util/TreeSet;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->setExcludedDates(Ljava/util/TreeSet;)V

    .line 187
    const-string v0, "movementTimes"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->setWeekTimes(I)V

    .line 189
    const-string v0, "goal"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->setGoal(I)V

    .line 190
    const-string v0, "endDate"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveEndDate(Ljava/lang/String;)V

    .line 191
    const-string v0, "beginDate"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveStartDate(Ljava/lang/String;)V

    .line 192
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/bzv;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveDays(I)V

    .line 193
    const-string v0, "version"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->setVersion(Ljava/lang/String;)V

    .line 194
    const-string v0, "remindTime"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/Plan;->setRemindTime(I)V

    .line 196
    :cond_0
    return-object v3
.end method

.method public static d(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 491
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 492
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 493
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 494
    invoke-virtual {p0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 495
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 496
    new-instance v7, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 497
    const-string v0, "id"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveId(I)V

    .line 498
    const-string v0, "planId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 499
    const-string v0, "displayorder"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutOrder(I)V

    .line 500
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 501
    const-string v0, "workoutId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 502
    const-string v0, "trainingDate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutDate(Ljava/lang/String;)V

    .line 503
    const-string v0, "actualCalorie"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 504
    const-string v0, "actualDistance"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualDistance(F)V

    .line 505
    const-string v0, "by"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveRecordType(I)V

    .line 506
    const-string v0, "calorie"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 507
    const-string v0, "distance"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDistance(F)V

    .line 508
    const-string v0, "completeTime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzv;->a(J)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 509
    const-string v0, "oxygen"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveOxygen(D)V

    .line 510
    const-string v0, "trainingLoadPeak"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveTrainingLoadPeak(I)V

    .line 511
    const-string v0, "completionRate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 512
    const-string v0, "duration"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDuring(I)V

    .line 513
    const-string v0, "heartRateUp"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveUpperHeartRate(I)V

    .line 514
    const-string v0, "heartRateDown"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveLowerHeartRate(I)V

    .line 515
    const-string v0, "bestPace"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveBestPace(I)V

    .line 516
    const-string v0, "weekSequence"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWeekNum(I)V

    .line 518
    const-string v0, "trajectoryId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 519
    const-string v0, "DataRunPlanConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireTrajectoryId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 522
    const-string v0, "gps_maptracking_"

    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 523
    const-string v0, "gps_maptracking_"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 524
    const-string v0, "yyyyMMddHHmmssSSS"

    invoke-static {v9, v0}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 525
    if-eqz v10, :cond_0

    .line 526
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 527
    const-string v0, "DataRunPlanConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "replaceTrajectoryId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    :cond_0
    invoke-virtual {v7, v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveTrajectoryId(Ljava/lang/String;)V

    .line 533
    const-string v0, "actionSummary"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActionSummary(Ljava/lang/String;)V

    .line 534
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 535
    const-string v0, "wearType"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWearType(I)V

    .line 536
    const-string v0, "extend"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExtend(Ljava/lang/String;)V

    .line 537
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 541
    :cond_2
    return-object v4
.end method

.method public static e(Ljava/util/List;)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 305
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 306
    const/4 v0, 0x0

    return-object v0

    .line 309
    :cond_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 311
    const/4 v5, -0x1

    .line 312
    const/4 v6, 0x0

    .line 314
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 316
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->acquireOrder()I

    move-result v0

    if-eq v5, v0, :cond_1

    .line 317
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 318
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 319
    const-string v0, "courses"

    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 320
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 321
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->acquireOrder()I

    move-result v5

    .line 322
    const-string v0, "displayorder"

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->acquireOrder()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 323
    const-string v0, "stage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WeekInfo;->getStage()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 324
    const-string v0, "sentence"

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->getSentence()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 325
    const-string v0, "week_name"

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->getWeekName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 327
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 328
    invoke-static {v9}, Lo/bsx;->e(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    :cond_2
    goto/16 :goto_0

    .line 333
    :cond_3
    goto :goto_1

    .line 331
    :catch_0
    move-exception v5

    .line 332
    const-string v0, "DataRunPlanConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
        }
    .end annotation

    .line 361
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 362
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 363
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 364
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 365
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 366
    new-instance v6, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/PlanRecord;-><init>()V

    .line 367
    const-string v0, "planId"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->savePlanId(Ljava/lang/String;)V

    .line 368
    const-string v0, "name"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->savePlanName(Ljava/lang/String;)V

    .line 369
    const-string v0, "type"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->savePlanType(I)V

    .line 370
    const-string v0, "beginDate"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveStartDate(Ljava/lang/String;)V

    .line 371
    const-string v0, "endDate"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveEndDate(Ljava/lang/String;)V

    .line 372
    const-string v0, "calorie"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveCalorie(F)V

    .line 373
    const-string v0, "distance"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveDistance(F)V

    .line 374
    const-string v0, "actualCalorie"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveActualCalorie(F)V

    .line 375
    const-string v0, "actualDistance"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveActualDistance(F)V

    .line 376
    const-string v0, "trainingDays"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveWorkoutDays(I)V

    .line 377
    const-string v0, "weekCount"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveWeekCount(I)V

    .line 378
    const-string v0, "completionRate"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveFinishRate(F)V

    .line 379
    const-string v0, "finishTime"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cap;->c(J)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveFinishDate(J)V

    .line 380
    const-string v0, "excludedDate"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsu;->b(Ljava/lang/String;)Ljava/util/TreeSet;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveExcludedDates(Ljava/util/TreeSet;)V

    .line 381
    const-string v0, "movementTimes"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveWeekTimes(I)V

    .line 382
    const-string v0, "goal"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveGoal(I)V

    .line 383
    const-string v0, "trainingDays"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveWorkoutTimes(I)V

    .line 384
    const-string v0, "difficulty"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveDifficulty(I)V

    .line 385
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveVersion(Ljava/lang/String;)V

    .line 386
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 363
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 390
    :cond_1
    return-object v3
.end method

.method private static e(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 338
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 339
    const-string v0, "trainingDate"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-static {v1, v2}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 340
    const-string v0, "workoutId"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 341
    const-string v0, "name"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 342
    const-string v0, "description"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 343
    const-string v0, "displayorder"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/DayInfo;->getSinglesCount()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 344
    const-string v0, "runningParas"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popExtendParams()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 345
    const-string v0, "version"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 346
    const-string v0, "duration"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->getDuration()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 347
    const-string v0, "type"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->getDuration()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 348
    return-object v3
.end method
