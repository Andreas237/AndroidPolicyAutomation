.class public Lo/bxj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 13

    .line 41
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 42
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 43
    :cond_0
    return-void

    .line 46
    :cond_1
    new-instance v5, Lo/bub;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v0

    invoke-direct {v5, v0}, Lo/bub;-><init>(I)V

    .line 47
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 49
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxj;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 50
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 51
    invoke-virtual {v5, v8}, Lo/bub;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putName(Ljava/lang/String;)V

    .line 54
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxj;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 55
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 57
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popExtendParams()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 58
    const-string v0, "distance"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 59
    const-string v0, "duration"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 60
    invoke-static {v5, v8, v10, v11}, Lo/bxj;->c(Lo/bub;III)Ljava/lang/String;

    move-result-object v12

    .line 61
    invoke-virtual {v7, v12}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDescription(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_1

    .line 62
    :catch_0
    move-exception v9

    .line 63
    const-string v0, "ShowPlanReplaceHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :cond_3
    :goto_1
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->getSentence()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxj;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 68
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->getSentence()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 69
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v5, v8}, Lo/bub;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveWeekName(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v5, v8}, Lo/bub;->k(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveSentence(Ljava/lang/String;)V

    .line 72
    :cond_4
    goto/16 :goto_0

    .line 73
    :cond_5
    return-void
.end method

.method private static c(D)D
    .locals 2

    .line 222
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    const/4 v0, 0x3

    invoke-static {p0, p1, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    return-wide v0

    .line 225
    :cond_0
    return-wide p0
.end method

.method private static c(Lo/bub;III)Ljava/lang/String;
    .locals 12

    .line 170
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_minute:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, p3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, p3, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 171
    invoke-static {}, Lo/bzr;->c()I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, p2

    invoke-static {v2, v3}, Lo/bxj;->c(D)D

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, p2, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 172
    const-string v8, ""

    .line 173
    const-string v9, ""

    .line 174
    add-int/lit8 v0, p1, -0x9

    invoke-virtual {p0, v0}, Lo/bub;->a(I)I

    move-result v10

    .line 175
    add-int/lit8 v0, p1, -0x9

    invoke-virtual {p0, v0}, Lo/bub;->d(I)I

    move-result v11

    .line 176
    const/16 v0, 0x15

    if-lt p1, v0, :cond_0

    .line 177
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_second:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, v10

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v10, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 178
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_second:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, v11

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v11, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 180
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_minute:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, v10

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v10, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 181
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_minute:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, v11

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v11, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 183
    :goto_0
    invoke-virtual {p0, p1}, Lo/bub;->b(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const/4 v2, 0x2

    aput-object v8, v1, v2

    const/4 v2, 0x3

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/bxy;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bub;)V
    .locals 10

    .line 124
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v2

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v3

    .line 126
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v4

    .line 127
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v5

    .line 129
    if-eqz v2, :cond_0

    .line 130
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/bxj;->d(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setMessage(Ljava/lang/String;)V

    .line 132
    :cond_0
    if-eqz v3, :cond_1

    .line 133
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lo/bxj;->d(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setMessage(Ljava/lang/String;)V

    .line 135
    :cond_1
    if-eqz v4, :cond_2

    .line 136
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lo/bxj;->d(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setMessage(Ljava/lang/String;)V

    .line 138
    :cond_2
    if-eqz v5, :cond_3

    .line 139
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lo/bxj;->d(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setMessage(Ljava/lang/String;)V

    .line 142
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxj;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 143
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 144
    invoke-virtual {p1, v6}, Lo/bub;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveName(Ljava/lang/String;)V

    .line 147
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxj;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 148
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 149
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v7

    .line 150
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDuration()I

    move-result v8

    .line 151
    invoke-static {p1, v6, v7, v8}, Lo/bxj;->c(Lo/bub;III)Ljava/lang/String;

    move-result-object v9

    .line 152
    invoke-virtual {p0, v9}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveDescription(Ljava/lang/String;)V

    .line 154
    :cond_5
    return-void
.end method

.method private static c(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lo/bub;)V
    .locals 5

    .line 162
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxj;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 164
    invoke-virtual {p1, v4}, Lo/bub;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 165
    const-string v0, "ShowPlanHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "replacePlanPlaceHodler workoutRecord name:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " to "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    :cond_0
    return-void
.end method

.method public static c([Lcom/huawei/health/suggestion/model/RunWorkout;)V
    .locals 6

    .line 81
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 82
    :cond_0
    return-void

    .line 85
    :cond_1
    new-instance v1, Lo/bub;

    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getType()I

    move-result v0

    invoke-direct {v1, v0}, Lo/bub;-><init>(I)V

    .line 86
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 87
    invoke-static {v5, v1}, Lo/bxj;->c(Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bub;)V

    .line 86
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 89
    :cond_2
    return-void
.end method

.method public static c([Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 6

    .line 108
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 109
    :cond_0
    return-void

    .line 112
    :cond_1
    new-instance v1, Lo/bub;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lo/bub;-><init>(I)V

    .line 113
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 114
    invoke-static {v5, v1}, Lo/bxj;->c(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lo/bub;)V

    .line 113
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 116
    :cond_2
    return-void
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 3

    .line 210
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 211
    const/4 v0, 0x0

    return v0

    .line 213
    :cond_0
    const-string v0, "[0-9]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 214
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 215
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    const/4 v0, 0x1

    return v0

    .line 218
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static d(II)Ljava/lang/String;
    .locals 2

    .line 187
    if-nez p0, :cond_0

    .line 188
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_run_warmup_message:I

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_run_warmup_message_min:I

    invoke-static {p1, v0, v1}, Lo/bxj;->e(III)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 189
    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 190
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_run_rest_message:I

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_run_rest_message_min:I

    invoke-static {p1, v0, v1}, Lo/bxj;->e(III)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 191
    :cond_1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    .line 192
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_run_work_message:I

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_run_work_message_min:I

    invoke-static {p1, v0, v1}, Lo/bxj;->e(III)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 193
    :cond_2
    const/4 v0, 0x3

    if-ne p0, v0, :cond_3

    .line 194
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_run_cooldown_message:I

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_run_cooldown_message_min:I

    invoke-static {p1, v0, v1}, Lo/bxj;->e(III)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 196
    :cond_3
    const-string v0, ""

    return-object v0
.end method

.method public static d(Lcom/huawei/health/suggestion/model/RunWorkout;)V
    .locals 2

    .line 97
    if-eqz p0, :cond_0

    .line 98
    new-instance v0, Lo/bub;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunWorkout;->getType()I

    move-result v1

    invoke-direct {v0, v1}, Lo/bub;-><init>(I)V

    invoke-static {p0, v0}, Lo/bxj;->c(Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bub;)V

    .line 100
    :cond_0
    return-void
.end method

.method private static e(III)Ljava/lang/String;
    .locals 6
    .param p1    # I
        .annotation build Landroid/support/annotation/PluralsRes;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/PluralsRes;
        .end annotation
    .end param

    .line 201
    const/16 v0, 0x3c

    if-ge p0, v0, :cond_0

    .line 202
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    int-to-double v1, p0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, p0, v0}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 204
    :cond_0
    div-int/lit8 v5, p0, 0x3c

    .line 205
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    int-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2, v5, v0}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
