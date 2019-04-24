.class public Lo/bug;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 42
    invoke-static {p0}, Lo/bug;->d(Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static c()I
    .locals 16

    .line 80
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v6

    .line 81
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 84
    :cond_1
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 85
    new-instance v8, Lfi/firstbeat/coach/CoachC;

    invoke-direct {v8}, Lfi/firstbeat/coach/CoachC;-><init>()V

    .line 86
    invoke-static {v6}, Lo/buc;->a(Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v9

    .line 87
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireCoachVars()Lfi/firstbeat/coach/CoachVars;

    move-result-object v0

    invoke-interface {v8, v0}, Lfi/firstbeat/coach/Coach;->setParameters(Lfi/firstbeat/coach/CoachVars;)I

    .line 89
    if-eqz v7, :cond_2

    .line 90
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 91
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    .line 92
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 93
    invoke-static {v12}, Lo/btx;->e(Ljava/util/Calendar;)I

    move-result v13

    .line 94
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireOxygen()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzr;->c(D)I

    move-result v14

    .line 95
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDistance()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->e(F)I

    move-result v15

    .line 96
    move-object v0, v8

    move v1, v13

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v2

    move v3, v15

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireTrainingLoadPeak()I

    move-result v4

    move v5, v14

    invoke-interface/range {v0 .. v5}, Lfi/firstbeat/coach/Coach;->addRunningExercise(IIIII)I

    .line 97
    goto :goto_0

    .line 100
    :cond_2
    invoke-static {v9}, Lo/buc;->d(Lcom/huawei/health/suggestion/model/RunPlanParams;)I

    move-result v0

    return v0
.end method

.method public static d()I
    .locals 3

    .line 69
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    .line 70
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 74
    :cond_1
    invoke-static {v1}, Lo/buc;->a(Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v2

    .line 75
    invoke-static {v2}, Lo/buc;->d(Lcom/huawei/health/suggestion/model/RunPlanParams;)I

    move-result v0

    return v0
.end method

.method private static d(Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 110
    invoke-static {p0}, Lo/buc;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;)Lfi/firstbeat/coach/CoachVars;

    move-result-object v1

    .line 112
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getExcludedDates()Ljava/util/TreeSet;

    move-result-object v0

    invoke-static {v0}, Lo/buc;->c(Ljava/util/TreeSet;)[I

    move-result-object v2

    .line 113
    invoke-static {v1, v2}, Lo/btx;->d(Lfi/firstbeat/coach/CoachVars;[I)[Lfi/firstbeat/coach/TrainingProgramWorkout;

    move-result-object v3

    .line 114
    invoke-static {v3, p0}, Lo/btv;->b([Lfi/firstbeat/coach/TrainingProgramWorkout;Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
