.class public Lo/bso;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/TrainStatistics;
    .locals 9

    .line 1004
    new-instance v2, Lcom/huawei/health/suggestion/model/TrainStatistics;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/TrainStatistics;-><init>()V

    .line 1006
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1007
    return-object v2

    .line 1010
    :cond_0
    new-instance v0, Lo/bso$1;

    invoke-direct {v0}, Lo/bso$1;-><init>()V

    .line 1011
    invoke-virtual {v0}, Lo/bso$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v3

    .line 1012
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 1013
    invoke-virtual {v4, p0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    .line 1015
    const-string v0, "calorie"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Long;

    .line 1016
    const-string v0, "duration"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Long;

    .line 1017
    const-string v0, "totalTimes"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Long;

    .line 1019
    if-nez v6, :cond_1

    .line 1020
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 1023
    :cond_1
    if-nez v7, :cond_2

    .line 1024
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 1027
    :cond_2
    if-nez v8, :cond_3

    .line 1028
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    .line 1031
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveCalorie(J)V

    .line 1032
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveDuration(J)V

    .line 1033
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveTotalTimes(J)V

    .line 1034
    return-object v2
.end method

.method public static a(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 346
    const-string v0, "workoutList"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 347
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 348
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 349
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 350
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 351
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, "type"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    invoke-static {v4}, Lo/bso;->i(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 353
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 357
    :cond_1
    return-object v2
.end method

.method private static a(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V
    .locals 7

    .line 715
    const-string v0, "playAudios"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 717
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 718
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 719
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 720
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 722
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 724
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    const-string v0, "sex"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 725
    goto :goto_1

    .line 727
    :cond_0
    new-instance v6, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-direct {v6}, Lcom/huawei/pluginFitnessAdvice/Comment;-><init>()V

    .line 728
    const-string v0, "audioId"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveId(Ljava/lang/String;)V

    .line 729
    const-string v0, "audioUrl"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveName(Ljava/lang/String;)V

    .line 730
    const-string v0, "displayorder"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveType(I)V

    .line 731
    const-string v0, "audioSize"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveLength(I)V

    .line 732
    const-string v0, "playValue"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->savePlayValue(Ljava/lang/String;)V

    .line 733
    const-string v0, "playType"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->savePlayType(Ljava/lang/String;)V

    .line 734
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 719
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 737
    :cond_2
    invoke-virtual {p1, v3}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveCommentaryTraining(Ljava/util/List;)V

    .line 740
    :cond_3
    const-string v0, "intensityType"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveIntensityType(I)V

    .line 741
    const-string v0, "speedH"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveSpeedH(F)V

    .line 742
    const-string v0, "speedL"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveSpeedL(F)V

    .line 745
    const-string v0, "absoluteHeartRateH"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveAbsoluteHeartRateH(Ljava/lang/String;)V

    .line 746
    const-string v0, "absoluteHeartRateL"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveAbsoluteHeartRateL(Ljava/lang/String;)V

    .line 747
    const-string v0, "relativeHeartRatePercentH"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveRelativeHeartRatePercentH(I)V

    .line 748
    const-string v0, "relativeHeartRatePercentL"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveRelativeHeartRatePercentL(I)V

    .line 749
    const-string v0, "relativeHeartRateRangeH"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveRelativeHeartRateRangeH(I)V

    .line 750
    const-string v0, "relativeHeartRateRangeL"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveRelativeHeartRateRangeL(I)V

    .line 753
    const-string v0, "heartRRH"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveReserveHeartRatePercentH(I)V

    .line 754
    const-string v0, "heartRRL"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveReserveHeartRatePercentL(I)V

    .line 755
    const-string v0, "heartRRIntervalH"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveReserveHeartRateRangeH(I)V

    .line 756
    const-string v0, "heartRRIntervalL"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveReserveHeartRateRangeL(I)V

    .line 757
    const-string v0, "baseOfMAF180"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveMAF180HeartRateBase(I)V

    .line 758
    const-string v0, "heartRIntervalofMAF180"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveMAF180HeartRateRange(I)V

    .line 761
    const-string v0, "group"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveGroup(I)V

    .line 763
    const-string v0, "runActionId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveActionId(Ljava/lang/String;)V

    .line 764
    const-string v0, "measurementType"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveMeasurementType(I)V

    .line 765
    const-string v0, "measurementValue"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveMeasurementValue(I)V

    .line 766
    const-string v0, "restSecond"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveGap(I)V

    .line 767
    const-string v0, "picture"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveTabloidPicUrl(Ljava/lang/String;)V

    .line 769
    invoke-static {p0}, Lo/bso;->l(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v3

    .line 770
    invoke-virtual {p1, v3}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveAction(Lcom/huawei/pluginFitnessAdvice/Action;)V

    .line 771
    return-void
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;
    .locals 9

    .line 512
    const-string v0, "workoutInfo"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 513
    const-string v0, "actionList"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 514
    const-string v0, "userWorkoutRunActionInfo"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 515
    const-string v0, "userWorkoutRunSequenceInfo"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 517
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 518
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toWorkoutDetail no workoutInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    const/4 v0, 0x0

    return-object v0

    .line 522
    :cond_0
    invoke-static {v4}, Lo/bso;->i(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v8

    .line 523
    const-string v0, "completeTimes"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveExerciseTimes(I)V

    .line 525
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 526
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toWorkoutDetail no actins"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    const/4 v0, 0x0

    return-object v0

    .line 529
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 530
    invoke-virtual {v8}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v0

    invoke-static {v5, v0}, Lo/bso;->b(Lorg/json/JSONArray;I)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveWorkoutActions(Ljava/util/List;)V

    goto :goto_0

    .line 531
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 532
    invoke-static {v6, v8}, Lo/bso;->d(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveWorkoutActions(Ljava/util/List;)V

    goto :goto_0

    .line 534
    :cond_3
    invoke-static {v7, v8}, Lo/bso;->d(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveWorkoutActions(Ljava/util/List;)V

    .line 538
    :goto_0
    return-object v8
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 422
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 423
    const-string v0, "recommendCourses"

    invoke-virtual {v4, v0, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 424
    const-string v0, "extendMap"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 425
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 426
    :catch_0
    move-exception v4

    .line 427
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDetailInfoJson JSONException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/OperationPage;>;"
        }
    .end annotation

    .line 922
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 923
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 924
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 925
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 926
    new-instance v5, Lcom/huawei/health/suggestion/model/OperationPage;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/OperationPage;-><init>()V

    .line 927
    const-string v0, "id"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->saveId(I)V

    .line 928
    const-string v0, "pageType"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->savePageType(I)V

    .line 929
    const-string v0, "position"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->savePosition(I)V

    .line 930
    const-string v0, "type"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->saveType(I)V

    .line 931
    const-string v0, "pictureUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->savePictureUrl(Ljava/lang/String;)V

    .line 932
    const-string v0, "emui90ImageUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->saveEmui90ImageUrl(Ljava/lang/String;)V

    .line 933
    const-string v0, "url"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->saveUrl(Ljava/lang/String;)V

    .line 934
    const-string v0, "defSelection"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->saveDefSelection(Ljava/lang/String;)V

    .line 935
    const-string v0, "beginDate"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/OperationPage;->saveBeginDate(J)V

    .line 936
    const-string v0, "endDate"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/OperationPage;->saveEndDate(J)V

    .line 937
    const-string v0, "endSolution"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->saveEndSolution(I)V

    .line 938
    const-string v0, "createTime"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/OperationPage;->saveCreateTime(J)V

    .line 939
    const-string v0, "modifyTime"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/OperationPage;->saveModifyTime(J)V

    .line 940
    const-string v0, "status"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/OperationPage;->saveStatus(I)V

    .line 941
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 923
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 944
    :cond_1
    return-object v2
.end method

.method public static b(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;"
        }
    .end annotation

    .line 1212
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseToTrainActions actionArray"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1213
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 1214
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1215
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 1216
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 1217
    new-instance v7, Lcom/huawei/pluginFitnessAdvice/TrainAction;

    invoke-direct {v7}, Lcom/huawei/pluginFitnessAdvice/TrainAction;-><init>()V

    .line 1218
    invoke-virtual {v7, p0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveUserId(Ljava/lang/String;)V

    .line 1219
    const-string v0, "actionId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveId(Ljava/lang/String;)V

    .line 1220
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveName(Ljava/lang/String;)V

    .line 1221
    const-string v0, "measurement"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/buk;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveMotionType(Ljava/lang/String;)V

    .line 1222
    const-string v0, "difficulty"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveDifficulty(I)V

    .line 1224
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1225
    const-string v0, "pictures"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 1228
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 1229
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1230
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v11, v0, :cond_1

    .line 1231
    invoke-virtual {v9, v11}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    .line 1232
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    .line 1233
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-direct {v13}, Lcom/huawei/pluginFitnessAdvice/Cover;-><init>()V

    .line 1234
    const-string v0, "imageUrl"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->saveUrl(Ljava/lang/String;)V

    .line 1235
    const-string v0, "sex"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->saveGender(I)V

    .line 1236
    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1237
    if-nez v11, :cond_0

    .line 1238
    const-string v0, "imageDesc"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1230
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 1242
    :cond_1
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveDescription(Ljava/lang/String;)V

    .line 1245
    :cond_2
    invoke-virtual {v7, v8}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveCovers(Ljava/util/List;)V

    .line 1247
    const-string v0, "equipments"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 1248
    invoke-static {v10}, Lo/bso;->d(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveEquipments(Ljava/util/List;)V

    .line 1249
    const-string v0, "trainingPoints"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 1250
    invoke-static {v11}, Lo/bso;->e(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveTrainingpoints(Ljava/util/List;)V

    .line 1251
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1252
    const-string v0, "videos"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v12, v0}, Lo/bso;->e(Ljava/util/List;Lorg/json/JSONArray;)V

    .line 1253
    invoke-virtual {v7, v12}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveVideos(Ljava/util/List;)V

    .line 1254
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveVersion(Ljava/lang/String;)V

    .line 1255
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveModified(J)V

    .line 1256
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1215
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 1258
    :cond_3
    return-object v4

    .line 1262
    :cond_4
    goto :goto_2

    .line 1260
    :catch_0
    move-exception v4

    .line 1261
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseToTrainActions "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1264
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Lorg/json/JSONArray;I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;I)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation

    .line 542
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 543
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 544
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 545
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 546
    new-instance v5, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-direct {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;-><init>()V

    .line 547
    const-string v0, "playAudios"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 548
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 549
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 550
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 551
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 553
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 555
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string v0, "sex"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 556
    goto :goto_2

    .line 558
    :cond_0
    new-instance v10, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-direct {v10}, Lcom/huawei/pluginFitnessAdvice/Comment;-><init>()V

    .line 559
    const-string v0, "audioId"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveId(Ljava/lang/String;)V

    .line 560
    const-string v0, "audioUrl"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveName(Ljava/lang/String;)V

    .line 561
    const-string v0, "playTime"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveTime(F)V

    .line 562
    const-string v0, "displayorder"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveType(I)V

    .line 563
    const-string v0, "audioSize"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveLength(I)V

    .line 564
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 550
    :cond_1
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 567
    :cond_2
    invoke-virtual {v5, v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveCommentaryTraining(Ljava/util/List;)V

    .line 570
    :cond_3
    new-instance v7, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-direct {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;-><init>()V

    .line 571
    const-string v0, "textPrompt"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveName(Ljava/lang/String;)V

    .line 572
    const-string v0, "textPrompt"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->saveContent(Ljava/lang/String;)V

    .line 573
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveCommentaryGap(Ljava/util/List;)V

    .line 574
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireCommentaryGap()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 576
    const-string v0, "group"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveGroup(I)V

    .line 577
    const-string v0, "gap"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveGap(I)V

    .line 578
    const-string v0, "calorie"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveCalorie(F)V

    .line 579
    const-string v0, "repeatTimes"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveValue(I)V

    .line 580
    const-string v0, "duration"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveDuration(I)V

    .line 582
    invoke-static {v4}, Lo/bso;->o(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v8

    .line 583
    invoke-virtual {v8}, Lcom/huawei/pluginFitnessAdvice/Action;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveActionId(Ljava/lang/String;)V

    .line 584
    invoke-virtual {v5, v8}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveAction(Lcom/huawei/pluginFitnessAdvice/Action;)V

    .line 586
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 589
    :cond_5
    return-object v2
.end method

.method public static b(Ljava/lang/String;)Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;>;"
        }
    .end annotation

    .line 1075
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 1076
    :cond_0
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseWorkoutExtendBean input null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    const/4 v0, 0x0

    return-object v0

    .line 1080
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1084
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1085
    const-string v0, "workoutRecommendDec"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 1086
    const-string v0, "courseDesc"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 1087
    const-string v0, "workoutType"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 1088
    const-string v0, "suitPeople"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    .line 1089
    const-string v0, "trainingSuggest"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    .line 1090
    const-string v0, "bannerPeople"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    .line 1091
    const-string v0, "attention"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    .line 1093
    if-eqz v6, :cond_2

    .line 1094
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v0, "title"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1095
    const-string v0, "workoutRecommendDec"

    invoke-interface {v4, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1098
    :cond_2
    if-eqz v7, :cond_3

    .line 1099
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v0, "title"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1100
    const-string v0, "courseDesc"

    invoke-interface {v4, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    :cond_3
    if-eqz v8, :cond_4

    .line 1105
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v0, "title"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1106
    const-string v0, "workoutType"

    invoke-interface {v4, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1109
    :cond_4
    if-eqz v9, :cond_5

    .line 1110
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v0, "title"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1111
    const-string v0, "suitPeople"

    invoke-interface {v4, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1115
    :cond_5
    if-eqz v10, :cond_6

    .line 1116
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v0, "title"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1117
    const-string v0, "trainingSuggest"

    invoke-interface {v4, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1120
    :cond_6
    if-eqz v11, :cond_7

    .line 1121
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v0, "title"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context"

    invoke-virtual {v11, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1122
    const-string v0, "bannerPeople"

    invoke-interface {v4, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1126
    :cond_7
    if-eqz v12, :cond_8

    .line 1127
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v0, "title"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1128
    const-string v0, "attention"

    invoke-interface {v4, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1137
    :cond_8
    goto :goto_0

    .line 1131
    :catch_0
    move-exception v5

    .line 1132
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseWorkoutExtendBean input json exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    return-object v4

    .line 1134
    :catch_1
    move-exception v5

    .line 1135
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseWorkoutExtendBean input exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    return-object v4

    .line 1139
    :goto_0
    return-object v4
.end method

.method private static b(Lorg/json/JSONObject;Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;I)V"
        }
    .end annotation

    .line 702
    new-instance v1, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-direct {v1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;-><init>()V

    .line 703
    invoke-static {p0, v1, p2}, Lo/bso;->a(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 704
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 705
    return-void
.end method

.method public static c(Lcom/huawei/health/suggestion/model/TrainStatistics;)Ljava/lang/String;
    .locals 6

    .line 1038
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1039
    const-string v0, "calorie"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireCalorie()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1040
    const-string v0, "duration"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireDuration()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1041
    const-string v0, "totalTimes"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireTotalTimes()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1043
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 1044
    invoke-virtual {v4, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1046
    return-object v5
.end method

.method private static c(Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 407
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 409
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 410
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 411
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v7

    .line 412
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toRelativeRuncourse "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 410
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 417
    :cond_0
    goto :goto_1

    .line 415
    :catch_0
    move-exception v5

    .line 416
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toRelativeRuncourse "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    :goto_1
    return-object v4
.end method

.method private static c(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation

    .line 470
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 471
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 472
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 473
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 474
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 475
    new-instance v4, Lcom/huawei/pluginFitnessAdvice/Attribute;

    invoke-direct {v4}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>()V

    .line 476
    const-string v0, "id"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Attribute;->saveId(Ljava/lang/String;)V

    .line 477
    const-string v0, "name"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Attribute;->saveName(Ljava/lang/String;)V

    .line 478
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 472
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 482
    :cond_1
    return-object v1
.end method

.method public static c(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;)Ljava/util/List<Lcom/huawei/health/suggestion/model/LangFile;>;"
        }
    .end annotation

    .line 314
    const-string v0, "langfiles"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 315
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 316
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 317
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 318
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 319
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 320
    invoke-static {v7}, Lo/bso;->g(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/LangFile;

    move-result-object v8

    .line 321
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "langFile = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/LangFile;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 326
    :cond_1
    return-object v5
.end method

.method private static d(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation

    .line 452
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 453
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 454
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 455
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 456
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 457
    const-string v0, "id"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 458
    const-string v0, "name"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 459
    new-instance v6, Lcom/huawei/pluginFitnessAdvice/Equipment;

    invoke-direct {v6}, Lcom/huawei/pluginFitnessAdvice/Equipment;-><init>()V

    .line 460
    invoke-virtual {v6, v4}, Lcom/huawei/pluginFitnessAdvice/Equipment;->saveId(Ljava/lang/String;)V

    .line 461
    invoke-virtual {v6, v5}, Lcom/huawei/pluginFitnessAdvice/Equipment;->saveName(Ljava/lang/String;)V

    .line 462
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 454
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 466
    :cond_1
    return-object v1
.end method

.method public static d(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;)Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;"
        }
    .end annotation

    .line 286
    const-string v0, "topicList"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 287
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 288
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 289
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 290
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 291
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 292
    invoke-static {v4}, Lo/bso;->f(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/Topic;

    move-result-object v5

    .line 293
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 297
    :cond_1
    return-object v2
.end method

.method public static d(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation

    .line 658
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 659
    const-string v0, "workoutId"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 660
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveWorkoutId(Ljava/lang/String;)V

    .line 661
    const-string v0, "runActionNum"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    .line 662
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveRunActionNum(I)V

    .line 663
    const-string v0, "sequenceName"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 664
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveSequenceName(Ljava/lang/String;)V

    .line 665
    const-string v0, "sequenceStage"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 666
    move-object/from16 v0, p1

    invoke-virtual {v0, v8}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveSequenceStage(Ljava/lang/String;)V

    .line 667
    const-string v0, "warmUpRunAction"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    .line 668
    const-string v0, "runActionList"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 669
    const-string v0, "coolDownRunAction"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    .line 670
    const-string v0, "repeatTimes"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    .line 671
    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveRepeatTimes(I)V

    .line 674
    if-eqz v9, :cond_0

    .line 675
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-direct {v13}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;-><init>()V

    .line 676
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v0

    invoke-static {v9, v13, v0}, Lo/bso;->a(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 677
    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveWarmUpRunAction(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V

    .line 681
    :cond_0
    const/4 v13, 0x0

    :goto_0
    if-ge v13, v12, :cond_2

    .line 682
    const/4 v14, 0x0

    :goto_1
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v14, v0, :cond_1

    .line 684
    :try_start_0
    invoke-virtual {v10, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    .line 685
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v0

    invoke-static {v15, v4, v0}, Lo/bso;->b(Lorg/json/JSONObject;Ljava/util/List;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 688
    goto :goto_2

    .line 686
    :catch_0
    move-exception v15

    .line 687
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "warning:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 681
    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 692
    :cond_2
    if-eqz v11, :cond_3

    .line 693
    new-instance v13, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-direct {v13}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;-><init>()V

    .line 694
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v0

    invoke-static {v11, v13, v0}, Lo/bso;->a(Lorg/json/JSONObject;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 695
    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveCoolDownRunAction(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V

    .line 698
    :cond_3
    return-object v4
.end method

.method public static e(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/TrainStatistics;
    .locals 4

    .line 948
    new-instance v2, Lcom/huawei/health/suggestion/model/TrainStatistics;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/TrainStatistics;-><init>()V

    .line 949
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 950
    return-object v2

    .line 952
    :cond_0
    const-string v0, "userTrainStatisticsBean"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 953
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 954
    return-object v2

    .line 956
    :cond_1
    const-string v0, "calorie"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveCalorie(J)V

    .line 957
    const-string v0, "duration"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveDuration(J)V

    .line 958
    const-string v0, "totalTimes"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveTotalTimes(J)V

    .line 959
    return-object v2
.end method

.method public static e(Lcom/huawei/health/suggestion/model/PlanStatistics;)Ljava/lang/String;
    .locals 6

    .line 1050
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1051
    const-string v0, "totalCalorie"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1052
    const-string v0, "totalDuration"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1053
    const-string v0, "totalPlan"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireTotalPlan()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1054
    const-string v0, "type"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireType()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1056
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 1057
    invoke-virtual {v4, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1059
    return-object v5
.end method

.method private static e(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation

    .line 433
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 434
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 435
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 436
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 437
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 438
    const-string v0, "id"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 439
    const-string v0, "name"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 440
    new-instance v6, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;

    invoke-direct {v6}, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;-><init>()V

    .line 441
    invoke-virtual {v6, v4}, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;->saveId(Ljava/lang/String;)V

    .line 442
    invoke-virtual {v6, v5}, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;->saveName(Ljava/lang/String;)V

    .line 443
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 435
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 448
    :cond_1
    return-object v1
.end method

.method public static e(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)Lorg/json/JSONArray;"
        }
    .end annotation

    .line 906
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 908
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 909
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 910
    const-string v0, "workoutId"

    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 911
    const-string v0, "version"

    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 912
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 913
    goto :goto_0

    .line 916
    :cond_0
    goto :goto_1

    .line 914
    :catch_0
    move-exception v5

    .line 915
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 917
    :goto_1
    return-object v4
.end method

.method private static e(Ljava/util/List;Lorg/json/JSONArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Video;>;Lorg/json/JSONArray;)V"
        }
    .end annotation

    .line 486
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 487
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 488
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 489
    new-instance v3, Lcom/huawei/pluginFitnessAdvice/Video;

    invoke-direct {v3}, Lcom/huawei/pluginFitnessAdvice/Video;-><init>()V

    .line 490
    const-string v0, "id"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveId(Ljava/lang/String;)V

    .line 491
    const-string v0, "name"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveName(Ljava/lang/String;)V

    .line 492
    const-string v0, "type"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveType(I)V

    .line 493
    const-string v0, "actionCount"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveActionCount(I)V

    .line 494
    const-string v0, "during"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveDuring(I)V

    .line 495
    const-string v0, "sex"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveGender(I)V

    .line 496
    const-string v0, "videoSize"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveLength(I)V

    .line 497
    const-string v0, "thumbnail"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveThumbnail(Ljava/lang/String;)V

    .line 498
    const-string v0, "videoUrl"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveUrl(Ljava/lang/String;)V

    .line 499
    const-string v0, "logoImgUrl"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveLogoImgUrl(Ljava/lang/String;)V

    .line 500
    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 486
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 503
    :cond_1
    return-void
.end method

.method private static f(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/Topic;
    .locals 2

    .line 301
    new-instance v1, Lcom/huawei/health/suggestion/model/Topic;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/Topic;-><init>()V

    .line 302
    const-string v0, "id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveId(I)V

    .line 303
    const-string v0, "name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveName(Ljava/lang/String;)V

    .line 304
    const-string v0, "nameId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveNameId(I)V

    .line 305
    const-string v0, "version"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveVersion(Ljava/lang/String;)V

    .line 306
    const-string v0, "serialNum"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveSerialNum(Ljava/lang/String;)V

    .line 307
    const-string v0, "displayorder"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveDisplayorder(I)V

    .line 308
    const-string v0, "workoutPreviewNum"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveWorkoutPreviewNum(I)V

    .line 309
    invoke-static {p0}, Lo/bso;->a(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveWorkoutList(Ljava/util/List;)V

    .line 310
    return-object v1
.end method

.method private static g(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/LangFile;
    .locals 3

    .line 330
    new-instance v2, Lcom/huawei/health/suggestion/model/LangFile;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/LangFile;-><init>()V

    .line 331
    const-string v0, "langName"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/LangFile;->saveLangName(Ljava/lang/String;)V

    .line 332
    const-string v0, "langUrl"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/LangFile;->saveLangUrl(Ljava/lang/String;)V

    .line 333
    const-string v0, "version"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/LangFile;->saveVersion(J)V

    .line 334
    const-string v0, "langId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/LangFile;->saveLangId(I)V

    .line 335
    const-string v0, "language"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/LangFile;->saveLanguage(Ljava/lang/String;)V

    .line 336
    return-object v2
.end method

.method public static h(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStatistics;
    .locals 3

    .line 963
    new-instance v2, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/PlanStatistics;-><init>()V

    .line 964
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 965
    return-object v2

    .line 971
    :cond_0
    const-string v0, "totalCalorie"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveCalorie(J)V

    .line 972
    const-string v0, "totalDuration"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveDuration(J)V

    .line 973
    const-string v0, "totalPlan"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveTotalPlan(I)V

    .line 974
    return-object v2
.end method

.method private static i(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;
    .locals 8

    .line 361
    new-instance v2, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-direct {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;-><init>()V

    .line 362
    const-string v0, "type"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->setType(I)V

    .line 363
    const-string v0, "distance"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveDistance(D)V

    .line 364
    const-string v0, "measurementType"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveMeasurementType(I)V

    .line 365
    const-string v0, "workoutId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveId(Ljava/lang/String;)V

    .line 366
    const-string v0, "name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveName(Ljava/lang/String;)V

    .line 367
    const-string v0, "version"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveVersion(Ljava/lang/String;)V

    .line 368
    const-string v0, "duration"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveDuration(I)V

    .line 369
    const-string v0, "calorie"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveCalorie(F)V

    .line 370
    const-string v0, "midPicture"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveMidPicture(Ljava/lang/String;)V

    .line 371
    const-string v0, "description"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveDescription(Ljava/lang/String;)V

    .line 372
    const-string v0, "modifyTime"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cap;->c(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveModified(J)V

    .line 373
    const-string v0, "createTime"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cap;->c(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->savePublishDate(J)V

    .line 374
    const-string v0, "difficulty"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveDifficulty(I)V

    .line 375
    const-string v0, "supportWear"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveIsSupportDevice(I)V

    .line 376
    const-string v0, "picture"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->savePicture(Ljava/lang/String;)V

    .line 377
    const-string v0, "equipments"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 378
    invoke-static {v3}, Lo/bso;->d(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveEquipments(Ljava/util/List;)V

    .line 379
    const-string v0, "users"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveUsers(I)V

    .line 380
    const-string v0, "exerciseTimes"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveExerciseTimes(I)V

    .line 381
    const-string v0, "trainingPoints"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 382
    invoke-static {v4}, Lo/bso;->e(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveTrainingpoints(Ljava/util/List;)V

    .line 383
    const-string v0, "narrowPicture"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveNarrowPicture(Ljava/lang/String;)V

    .line 385
    const-string v0, "narrowDesc"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "extendMap"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bso;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveNarrowDesc(Ljava/lang/String;)V

    .line 388
    const-string v0, "narrowDesc"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bso;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveListRelativeWorkouts(Ljava/util/List;)V

    .line 389
    const-string v0, "extendSeaMap"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveExtendSeaMap(Ljava/lang/String;)V

    .line 391
    const-string v0, "stage"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveStage(I)V

    .line 393
    const-string v0, "classList"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 394
    invoke-static {v5}, Lo/bso;->c(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveClasses(Ljava/util/List;)V

    .line 396
    const-string v0, "actions"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 397
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 398
    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v0

    invoke-static {v6, v0}, Lo/bso;->b(Lorg/json/JSONArray;I)Ljava/util/List;

    move-result-object v7

    .line 399
    invoke-virtual {v2, v7}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveWorkoutActions(Ljava/util/List;)V

    .line 402
    :cond_0
    return-object v2
.end method

.method public static k(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanStatistics;>;"
        }
    .end annotation

    .line 978
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 979
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 980
    return-object v4

    .line 982
    :cond_0
    const-string v0, "userPlanStatisticsList"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 983
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 984
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 985
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 986
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 987
    new-instance v8, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-direct {v8}, Lcom/huawei/health/suggestion/model/PlanStatistics;-><init>()V

    .line 988
    const-string v0, "type"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveType(I)V

    .line 989
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireType()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    .line 990
    const-string v0, "totalDuration"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveDuration(J)V

    goto :goto_1

    .line 992
    :cond_1
    const-string v0, "totalDuration"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveDuration(J)V

    .line 994
    :goto_1
    const-string v0, "totalCalorie"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveCalorie(J)V

    .line 995
    const-string v0, "totalPlan"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveTotalPlan(I)V

    .line 996
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 984
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1000
    :cond_3
    return-object v4
.end method

.method private static l(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/Action;
    .locals 13

    .line 775
    new-instance v4, Lcom/huawei/pluginFitnessAdvice/Action;

    invoke-direct {v4}, Lcom/huawei/pluginFitnessAdvice/Action;-><init>()V

    .line 776
    const-string v0, "runActionId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveId(Ljava/lang/String;)V

    .line 777
    const-string v0, "userRunActionName"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveName(Ljava/lang/String;)V

    .line 778
    const-string v0, "difficulty"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveDifficulty(I)V

    .line 779
    const-string v0, "measurementType"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveMeasurementType(I)V

    .line 780
    const-string v0, "measurementValue"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveFrequency(I)V

    .line 782
    const-string v0, "logoImgUrl"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveLogoImgUrl(Ljava/lang/String;)V

    .line 783
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 784
    invoke-virtual {v4, v5}, Lcom/huawei/pluginFitnessAdvice/Action;->saveAudios(Ljava/util/List;)V

    .line 785
    const-string v0, "voicePrompt"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 786
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SingleRunActionInfo.VOICEPROMPT:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 788
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 789
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 790
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 791
    new-instance v9, Lcom/huawei/pluginFitnessAdvice/Audio;

    invoke-direct {v9}, Lcom/huawei/pluginFitnessAdvice/Audio;-><init>()V

    .line 792
    const-string v0, "audioUrl"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveUrl(Ljava/lang/String;)V

    .line 793
    const-string v0, "audioUrl"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveName(Ljava/lang/String;)V

    .line 794
    const-string v0, "sex"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveGender(I)V

    .line 795
    const-string v0, "audioSize"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveLength(I)V

    .line 796
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 788
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 800
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 801
    invoke-virtual {v4, v7}, Lcom/huawei/pluginFitnessAdvice/Action;->saveCovers(Ljava/util/List;)V

    .line 802
    const-string v0, "pictures"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 803
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pictureArray:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 805
    const-string v0, "DataFitnessConvert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pictureArray:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 806
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 807
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 808
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 809
    const/4 v0, 0x0

    if-eq v0, v11, :cond_2

    .line 810
    new-instance v12, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-direct {v12}, Lcom/huawei/pluginFitnessAdvice/Cover;-><init>()V

    .line 811
    const-string v0, "imageUrl"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->saveUrl(Ljava/lang/String;)V

    .line 812
    const-string v0, "sex"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->saveGender(I)V

    .line 813
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 814
    if-nez v10, :cond_2

    .line 815
    const-string v0, "imageDesc"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 807
    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 819
    :cond_3
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveDescription(Ljava/lang/String;)V

    .line 822
    :cond_4
    const-string v0, "equipments"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 823
    invoke-static {v9}, Lo/bso;->d(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveEquipments(Ljava/util/List;)V

    .line 824
    const-string v0, "trainingPoints"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 825
    invoke-static {v10}, Lo/bso;->e(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveTrainingpoints(Ljava/util/List;)V

    .line 826
    return-object v4
.end method

.method private static o(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/Action;
    .locals 15

    .line 830
    new-instance v2, Lcom/huawei/pluginFitnessAdvice/Action;

    invoke-direct {v2}, Lcom/huawei/pluginFitnessAdvice/Action;-><init>()V

    .line 831
    const-string v0, "actionId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveId(Ljava/lang/String;)V

    .line 832
    const-string v0, "name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveName(Ljava/lang/String;)V

    .line 833
    const-string v0, "difficulty"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveDifficulty(I)V

    .line 834
    const-string v0, "version"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveVersion(Ljava/lang/String;)V

    .line 835
    const-string v0, "repeatTimes"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveFrequency(I)V

    .line 836
    const-string v0, "measurement"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveType(I)V

    .line 839
    const-string v0, "equipments"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 840
    invoke-static {v3}, Lo/bso;->d(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveEquipments(Ljava/util/List;)V

    .line 842
    const-string v0, "trainingPoints"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 843
    invoke-static {v4}, Lo/bso;->e(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveTrainingpoints(Ljava/util/List;)V

    .line 845
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 846
    invoke-virtual {v2, v5}, Lcom/huawei/pluginFitnessAdvice/Action;->saveVideos(Ljava/util/List;)V

    .line 847
    const-string v0, "videos"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 848
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 849
    invoke-static {v5, v6}, Lo/bso;->e(Ljava/util/List;Lorg/json/JSONArray;)V

    .line 851
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 852
    invoke-static {v5, v6}, Lo/bso;->e(Ljava/util/List;Lorg/json/JSONArray;)V

    .line 854
    :cond_0
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginFitnessAdvice/Video;

    .line 855
    const-string v0, "identification"

    invoke-virtual {v8, v0}, Lcom/huawei/pluginFitnessAdvice/Video;->saveIdentification(Ljava/lang/String;)V

    .line 856
    goto :goto_0

    .line 859
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 860
    invoke-virtual {v2, v7}, Lcom/huawei/pluginFitnessAdvice/Action;->saveAudios(Ljava/util/List;)V

    .line 861
    const-string v0, "voicePrompt"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 862
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 863
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 864
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 865
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 866
    new-instance v11, Lcom/huawei/pluginFitnessAdvice/Audio;

    invoke-direct {v11}, Lcom/huawei/pluginFitnessAdvice/Audio;-><init>()V

    .line 867
    const-string v0, "audioUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveUrl(Ljava/lang/String;)V

    .line 868
    const-string v0, "audioUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveName(Ljava/lang/String;)V

    .line 869
    const-string v0, "sex"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveGender(I)V

    .line 870
    const-string v0, "audioSize"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->saveLength(I)V

    .line 871
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 863
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 877
    :cond_3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 878
    invoke-virtual {v2, v9}, Lcom/huawei/pluginFitnessAdvice/Action;->saveCovers(Ljava/util/List;)V

    .line 879
    const-string v0, "pictures"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 880
    const/4 v0, 0x0

    if-eq v0, v10, :cond_6

    .line 881
    new-instance v11, Ljava/lang/StringBuffer;

    invoke-direct {v11}, Ljava/lang/StringBuffer;-><init>()V

    .line 882
    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_5

    .line 883
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 884
    const/4 v0, 0x0

    if-eq v0, v13, :cond_4

    .line 885
    new-instance v14, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-direct {v14}, Lcom/huawei/pluginFitnessAdvice/Cover;-><init>()V

    .line 886
    const-string v0, "imageUrl"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->saveUrl(Ljava/lang/String;)V

    .line 887
    const-string v0, "sex"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->saveGender(I)V

    .line 888
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 889
    if-nez v12, :cond_4

    .line 890
    const-string v0, "imageDesc"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 882
    :cond_4
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 894
    :cond_5
    invoke-virtual {v11}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/Action;->saveDescription(Ljava/lang/String;)V

    .line 896
    :cond_6
    return-object v2
.end method
