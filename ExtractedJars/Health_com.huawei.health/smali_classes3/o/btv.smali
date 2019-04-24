.class public Lo/btv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lfi/firstbeat/coach/WorkoutProfile;)Lcom/huawei/health/suggestion/model/ExerciseProfile;
    .locals 4

    .line 187
    invoke-static {p0}, Lo/btv;->d(Lfi/firstbeat/coach/WorkoutProfile;)V

    .line 189
    new-instance v3, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/ExerciseProfile;-><init>()V

    .line 190
    new-instance v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    iget-object v1, p0, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v1, v1, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;-><init>(II)V

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setHeartRate(Lcom/huawei/health/suggestion/model/ExerciseLimits;)V

    .line 191
    new-instance v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    iget-object v1, p0, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v1, v1, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;-><init>(II)V

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setIntensity(Lcom/huawei/health/suggestion/model/ExerciseLimits;)V

    .line 192
    new-instance v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    iget-object v1, p0, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v1, v1, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;-><init>(II)V

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setRunningSpeed(Lcom/huawei/health/suggestion/model/ExerciseLimits;)V

    .line 193
    iget v0, p0, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->setDuration(I)V

    .line 194
    return-object v3
.end method

.method private static b(Ljava/lang/String;Lfi/firstbeat/coach/TrainingProgramWorkout;)Lcom/huawei/health/suggestion/model/WeekInfo;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 124
    new-instance v2, Lcom/huawei/health/suggestion/model/WeekInfo;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/WeekInfo;-><init>()V

    .line 125
    iget v0, p1, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    div-int/lit8 v0, v0, 0x7

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveOrder(I)V

    .line 126
    invoke-virtual {v2, p0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveSentence(Ljava/lang/String;)V

    .line 127
    invoke-virtual {v2, p0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveWeekName(Ljava/lang/String;)V

    .line 128
    iget v0, p1, Lfi/firstbeat/coach/TrainingProgramWorkout;->weekPhraseNumber:I

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v0, v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->setStage(I)V

    .line 129
    return-object v2
.end method

.method private static b()Ljava/lang/String;
    .locals 3

    .line 102
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b([Lfi/firstbeat/coach/TrainingProgramWorkout;Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lfi/firstbeat/coach/TrainingProgramWorkout;Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 40
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 41
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_1
    const/4 v2, 0x0

    .line 45
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireCoachVars()Lfi/firstbeat/coach/CoachVars;

    move-result-object v0

    iget v0, v0, Lfi/firstbeat/coach/CoachVars;->nowDate:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireCoachVars()Lfi/firstbeat/coach/CoachVars;

    move-result-object v1

    iget v1, v1, Lfi/firstbeat/coach/CoachVars;->startDate:I

    sub-int v3, v0, v1

    .line 46
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 47
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 49
    const/4 v6, 0x0

    :goto_0
    array-length v0, p0

    if-eq v6, v0, :cond_2

    .line 50
    aget-object v7, p0, v6

    .line 52
    iget v0, v7, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    add-int/2addr v0, v3

    iput v0, v7, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    .line 53
    iget v0, v7, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    invoke-static {v0}, Lo/btv;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 56
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getStartDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1, v7, v8}, Lo/btv;->e(JLfi/firstbeat/coach/TrainingProgramWorkout;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanWorkout;

    move-result-object v9

    .line 57
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0, p1, v8}, Lo/btv;->e(Lfi/firstbeat/coach/TrainingProgramWorkout;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/Workout;

    move-result-object v10

    .line 61
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    iget v0, v7, Lfi/firstbeat/coach/TrainingProgramWorkout;->distance:I

    add-int/2addr v2, v0

    .line 49
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 68
    :cond_2
    array-length v0, p0

    invoke-static {v4, p1, v2, v0}, Lo/btv;->e(Ljava/util/List;Lcom/huawei/health/suggestion/model/RunPlanParams;II)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v6

    .line 70
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 71
    const-string v0, "plan"

    invoke-interface {v7, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    const-string v0, "workouts"

    invoke-interface {v7, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    return-object v7
.end method

.method private static c(Lfi/firstbeat/coach/TrainingProgramWorkout;)I
    .locals 10

    .line 168
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v4, v0, Lfi/firstbeat/ete/FBTexercise;->repeats:I

    .line 169
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget v5, v0, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    .line 170
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget v6, v0, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    .line 171
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget v7, v0, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    .line 172
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget v8, v0, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    .line 174
    if-lez v4, :cond_0

    .line 175
    add-int v0, v5, v6

    mul-int/2addr v0, v4

    add-int/2addr v0, v7

    add-int/2addr v0, v8

    div-int/lit8 v9, v0, 0x3c

    goto :goto_0

    .line 177
    :cond_0
    div-int/lit8 v9, v5, 0x3c

    .line 179
    :goto_0
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->duration:I

    if-eq v0, v9, :cond_1

    .line 180
    const-string v0, "CoachConvert"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trainingProgramWorkout.duration error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "trainingProgramWorkout.duration:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->duration:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " ,calculated duration:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " ,trainingProgramWorkout.dayNumber:"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget v2, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iput v9, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->duration:I

    .line 183
    :cond_1
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->duration:I

    return v0
.end method

.method private static d(I)Ljava/lang/String;
    .locals 1

    .line 106
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lfi/firstbeat/coach/WorkoutProfile;)V
    .locals 4

    .line 199
    iget-object v0, p0, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v0, v0, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    iget-object v1, p0, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v1, v1, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    if-ge v0, v1, :cond_0

    .line 200
    const-string v0, "CoachConvert"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutProfile.heartRate Error,heartRate.max:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",heartRate.min:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    :cond_0
    iget-object v0, p0, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v0, v0, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    iget-object v1, p0, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v1, v1, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    if-ge v0, v1, :cond_1

    .line 204
    const-string v0, "CoachConvert"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutProfile.intensity Error,intensity.max:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",intensity.min:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    :cond_1
    iget-object v0, p0, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v0, v0, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    iget-object v1, p0, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v1, v1, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    if-ge v0, v1, :cond_2

    .line 208
    const-string v0, "CoachConvert"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutProfile.runningSpeed Error,runningSpeed.max:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",runningSpeed.min:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    :cond_2
    return-void
.end method

.method private static e(JI)Lcom/huawei/health/suggestion/model/DayInfo;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 134
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 135
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 136
    const/4 v0, 0x5

    invoke-virtual {v2, v0, p2}, Ljava/util/Calendar;->add(II)V

    .line 138
    new-instance v3, Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/DayInfo;-><init>()V

    .line 139
    rem-int/lit8 v0, p2, 0x7

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveOrder(I)V

    .line 140
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDate(Ljava/lang/String;)V

    .line 141
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveSinglesCount(I)V

    .line 142
    return-object v3
.end method

.method private static e(Ljava/util/List;Lcom/huawei/health/suggestion/model/RunPlanParams;II)Lcom/huawei/health/suggestion/model/Plan;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;Lcom/huawei/health/suggestion/model/RunPlanParams;II)Lcom/huawei/health/suggestion/model/Plan;"
        }
    .end annotation

    .line 78
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getPlanDays()I

    move-result v2

    .line 79
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 80
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getStartDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 81
    add-int/lit8 v0, v2, -0x1

    const/4 v1, 0x5

    invoke-virtual {v3, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 83
    new-instance v4, Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/Plan;-><init>()V

    .line 84
    invoke-virtual {v4, p0}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkouts(Ljava/util/List;)V

    .line 85
    add-int/lit8 v0, v2, 0x6

    div-int/lit8 v0, v0, 0x7

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveWeekCount(I)V

    .line 86
    invoke-virtual {v4, v2}, Lcom/huawei/health/suggestion/model/Plan;->saveDays(I)V

    .line 87
    invoke-virtual {v4, p3}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkoutCount(I)V

    .line 88
    int-to-float v0, p2

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->setDistance(F)V

    .line 89
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveType(I)V

    .line 90
    invoke-static {}, Lo/btv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveId(Ljava/lang/String;)V

    .line 91
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getStartDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveStartDate(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveEndDate(Ljava/lang/String;)V

    .line 93
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getGoal()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->setGoal(I)V

    .line 94
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getGoal()I

    move-result v0

    invoke-static {v0}, Lo/bya;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getWeeklyTrainingDays()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->setWeekTimes(I)V

    .line 96
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getExcludedDates()Ljava/util/TreeSet;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->setExcludedDates(Ljava/util/TreeSet;)V

    .line 97
    const-string v0, "1"

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->setVersion(Ljava/lang/String;)V

    .line 98
    return-object v4
.end method

.method private static e(JLfi/firstbeat/coach/TrainingProgramWorkout;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanWorkout;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 111
    iget v0, p2, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    invoke-static {p0, p1, v0}, Lo/btv;->e(JI)Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v2

    .line 112
    iget v0, p2, Lfi/firstbeat/coach/TrainingProgramWorkout;->weekPhraseNumber:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lo/btv;->b(Ljava/lang/String;Lfi/firstbeat/coach/TrainingProgramWorkout;)Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v3

    .line 114
    new-instance v4, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;-><init>()V

    .line 115
    invoke-virtual {v4, v2}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V

    .line 116
    invoke-virtual {v4, v3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V

    .line 117
    invoke-virtual {v4, p3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWorkoutId(Ljava/lang/String;)V

    .line 118
    const-string v0, "1"

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putVersion(Ljava/lang/String;)V

    .line 119
    return-object v4
.end method

.method private static e(Lfi/firstbeat/coach/TrainingProgramWorkout;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/Workout;
    .locals 3

    .line 146
    new-instance v2, Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/RunWorkout;-><init>()V

    .line 147
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->distance:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setDistance(I)V

    .line 148
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->phraseNumber:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveName(Ljava/lang/String;)V

    .line 149
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->phraseNumber:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveDescription(Ljava/lang/String;)V

    .line 150
    invoke-virtual {v2, p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->putWorkoutDate(Ljava/lang/String;)V

    .line 151
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->trainingEffect:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setTrainingEffect(I)V

    .line 152
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setDayNumber(I)V

    .line 153
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->phraseNumber:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setPhraseNumber(I)V

    .line 154
    iget v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->weekPhraseNumber:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setWeekPhraseNumber(I)V

    .line 155
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getGoal()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setType(I)V

    .line 156
    invoke-static {p0}, Lo/btv;->c(Lfi/firstbeat/coach/TrainingProgramWorkout;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveDuration(I)V

    .line 157
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    invoke-static {v0}, Lo/btv;->a(Lfi/firstbeat/coach/WorkoutProfile;)Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setWarmup(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 158
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    invoke-static {v0}, Lo/btv;->a(Lfi/firstbeat/coach/WorkoutProfile;)Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setRest(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 159
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    invoke-static {v0}, Lo/btv;->a(Lfi/firstbeat/coach/WorkoutProfile;)Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setWork(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 160
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    invoke-static {v0}, Lo/btv;->a(Lfi/firstbeat/coach/WorkoutProfile;)Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setCooldown(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V

    .line 161
    iget-object v0, p0, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v0, v0, Lfi/firstbeat/ete/FBTexercise;->repeats:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->setRepeats(I)V

    .line 162
    const-string v0, "1"

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveVersion(Ljava/lang/String;)V

    .line 163
    invoke-virtual {v2, p3}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveId(Ljava/lang/String;)V

    .line 164
    return-object v2
.end method
