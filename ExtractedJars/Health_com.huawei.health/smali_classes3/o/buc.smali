.class public Lo/buc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lfi/firstbeat/coach/CoachVars;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()I
    .locals 1

    .line 153
    const/16 v0, 0xa8

    return v0
.end method

.method private static a(ILjava/util/Calendar;Ljava/util/Calendar;)Lcom/huawei/health/suggestion/model/RunPlanParams;
    .locals 4

    .line 70
    new-instance v1, Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;-><init>()V

    .line 71
    invoke-virtual {v1, p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setStartDate(Ljava/util/Calendar;)V

    .line 72
    invoke-virtual {v1, p2}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setNowDate(Ljava/util/Calendar;)V

    .line 74
    invoke-static {p0, p1}, Lo/buf;->e(ILjava/util/Calendar;)Lfi/firstbeat/coach/modle/CoachParams;

    move-result-object v2

    .line 75
    invoke-static {v2}, Lo/buf;->c(Lfi/firstbeat/coach/modle/CoachParams;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setCoachParamsMapings(Ljava/util/List;)V

    .line 76
    sget-object v0, Lo/buc;->a:Lfi/firstbeat/coach/CoachVars;

    invoke-static {v2, v0}, Lo/btx;->c(Lfi/firstbeat/coach/modle/CoachParams;Lfi/firstbeat/coach/CoachVars;)Lfi/firstbeat/coach/CoachVars;

    move-result-object v3

    .line 78
    invoke-virtual {v1, v3}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setCoachVars(Lfi/firstbeat/coach/CoachVars;)V

    .line 79
    iget-object v0, v3, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    iget v0, v0, Lfi/firstbeat/ete/FBTvars;->maxMET:I

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setMaxMet(I)V

    .line 80
    return-object v1
.end method

.method public static a(Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/RunPlanParams;
    .locals 4

    .line 106
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/buf;->a(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/buc;->a(ILjava/util/Calendar;Ljava/util/Calendar;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v3

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireExcludedDates()Ljava/util/TreeSet;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setExcludedDates(Ljava/util/TreeSet;)V

    .line 109
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWeekTimes()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setWeeklyTrainingDays(I)V

    .line 110
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setGoal(I)V

    .line 111
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/buf;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setPlanDays(I)V

    .line 112
    return-object v3
.end method

.method static a(Lcom/huawei/health/suggestion/model/RunPlanParams;)Lfi/firstbeat/coach/CoachVars;
    .locals 6

    .line 260
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireCoachVars()Lfi/firstbeat/coach/CoachVars;

    move-result-object v2

    .line 261
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getGoal()I

    move-result v0

    invoke-static {v0}, Lo/buf;->e(I)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->trainingGoal:I

    .line 262
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getWeeklyTrainingDays()I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->weeklyTrainingDays:I

    .line 263
    iget-object v0, v2, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getMaxMet()I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->maxMET:I

    .line 264
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getStartDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lo/btx;->e(Ljava/util/Calendar;)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->startDate:I

    .line 265
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getNowDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lo/btx;->e(Ljava/util/Calendar;)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->nowDate:I

    .line 266
    iget v0, v2, Lfi/firstbeat/coach/CoachVars;->startDate:I

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getPlanDays()I

    move-result v1

    invoke-static {v0, v1}, Lo/btx;->b(II)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->endDate:I

    .line 268
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getGoal()I

    move-result v0

    invoke-static {v0}, Lo/buf;->c(I)Lfi/firstbeat/coach/CoachRaceType;

    move-result-object v3

    .line 269
    invoke-static {v2, v3}, Lo/btx;->c(Lfi/firstbeat/coach/CoachVars;Lfi/firstbeat/coach/CoachRaceType;)I

    move-result v4

    .line 270
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getUserChosenTime()I

    move-result v5

    .line 271
    invoke-static {v2, v3, v4, v5}, Lo/btx;->b(Lfi/firstbeat/coach/CoachVars;Lfi/firstbeat/coach/CoachRaceType;II)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->improveMode:I

    .line 272
    return-object v2
.end method

.method public static b(Lcom/huawei/health/suggestion/model/RunPlanParams;I)I
    .locals 3

    .line 185
    invoke-static {p0}, Lo/buc;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;)Lfi/firstbeat/coach/CoachVars;

    move-result-object v1

    .line 186
    invoke-static {p1}, Lo/buf;->c(I)Lfi/firstbeat/coach/CoachRaceType;

    move-result-object v2

    .line 187
    invoke-static {v1, v2}, Lo/btx;->c(Lfi/firstbeat/coach/CoachVars;Lfi/firstbeat/coach/CoachRaceType;)I

    move-result v0

    return v0
.end method

.method public static b(I)Lcom/huawei/health/suggestion/model/ExerciseLimits;
    .locals 2

    .line 225
    new-instance v1, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/ExerciseLimits;-><init>()V

    .line 226
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 228
    :pswitch_0
    const/16 v0, 0x3c0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMin(I)V

    .line 229
    const/16 v0, 0x10e0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMax(I)V

    .line 230
    goto :goto_0

    .line 233
    :pswitch_1
    const/16 v0, 0x7bc

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMin(I)V

    .line 234
    const/16 v0, 0x25f8

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMax(I)V

    .line 235
    goto :goto_0

    .line 238
    :pswitch_2
    const/16 v0, 0x1194

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMin(I)V

    .line 239
    const/16 v0, 0x4f38

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMax(I)V

    .line 240
    goto :goto_0

    .line 243
    :pswitch_3
    const/16 v0, 0x26ac

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMin(I)V

    .line 244
    const/16 v0, 0x781e

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->setMax(I)V

    .line 245
    .line 250
    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static b(Lcom/huawei/health/suggestion/model/PlanRecord;)Lcom/huawei/health/suggestion/model/RunPlanParams;
    .locals 4

    .line 90
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireGoal()I

    move-result v0

    invoke-static {v0}, Lo/buc;->e(I)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v3

    .line 92
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireExcludedDates()Ljava/util/TreeSet;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setExcludedDates(Ljava/util/TreeSet;)V

    .line 93
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWeekTimes()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setWeeklyTrainingDays(I)V

    .line 94
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireGoal()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setGoal(I)V

    .line 95
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireEndDate()Ljava/lang/String;

    move-result-object v1

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/buf;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setPlanDays(I)V

    .line 96
    return-object v3
.end method

.method public static b(Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 33
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lo/buc$4;

    invoke-direct {v1, p0}, Lo/buc$4;-><init>(Lo/bui;)V

    invoke-interface {v0, v1}, Lo/bsp;->d(Lo/bui;)V

    .line 45
    return-void
.end method

.method public static c(I)I
    .locals 2

    .line 143
    invoke-static {p0}, Lo/buf;->c(I)Lfi/firstbeat/coach/CoachRaceType;

    move-result-object v1

    .line 144
    invoke-static {v1}, Lo/btx;->c(Lfi/firstbeat/coach/CoachRaceType;)I

    move-result v0

    return v0
.end method

.method static c(Ljava/util/TreeSet;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/TreeSet<Ljava/lang/Integer;>;)[I"
        }
    .end annotation

    .line 281
    const/4 v1, 0x7

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    .line 283
    if-eqz p0, :cond_1

    .line 284
    const/4 v2, 0x0

    :goto_0
    array-length v0, v1

    const/4 v0, 0x7

    if-ge v2, v0, :cond_1

    .line 285
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 286
    const/4 v0, 0x0

    aput v0, v1, v2

    .line 284
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 290
    :cond_1
    return-object v1

    :array_0
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public static d(Lcom/huawei/health/suggestion/model/RunPlanParams;)I
    .locals 1

    .line 174
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getGoal()I

    move-result v0

    invoke-static {p0, v0}, Lo/buc;->b(Lcom/huawei/health/suggestion/model/RunPlanParams;I)I

    move-result v0

    return v0
.end method

.method public static e(II)I
    .locals 2

    .line 163
    invoke-static {p0}, Lo/buf;->c(I)Lfi/firstbeat/coach/CoachRaceType;

    move-result-object v1

    .line 164
    invoke-static {v1, p1}, Lo/btx;->d(Lfi/firstbeat/coach/CoachRaceType;I)I

    move-result v0

    return v0
.end method

.method public static e(Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/util/Calendar;)I
    .locals 4

    .line 123
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getGoal()I

    move-result v0

    invoke-static {v0}, Lo/buc;->c(I)I

    move-result v2

    .line 124
    if-eqz p1, :cond_0

    .line 125
    invoke-static {p1}, Lo/btx;->e(Ljava/util/Calendar;)I

    move-result v0

    invoke-static {p0}, Lo/buc;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;)Lfi/firstbeat/coach/CoachVars;

    move-result-object v1

    iget v1, v1, Lfi/firstbeat/coach/CoachVars;->startDate:I

    sub-int v3, v0, v1

    .line 127
    add-int/lit8 v0, v3, 0x6

    div-int/lit8 v0, v0, 0x7

    mul-int/lit8 v3, v0, 0x7

    .line 129
    invoke-static {}, Lo/buc;->a()I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 130
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 131
    return v3

    .line 133
    :cond_0
    return v2
.end method

.method public static e()Lcom/huawei/health/suggestion/model/RunPlanParams;
    .locals 1

    .line 51
    const/4 v0, 0x0

    invoke-static {v0}, Lo/buc;->e(I)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v0

    return-object v0
.end method

.method private static e(I)Lcom/huawei/health/suggestion/model/RunPlanParams;
    .locals 5

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 59
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 60
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 61
    invoke-virtual {v3, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 62
    invoke-virtual {v4, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 63
    invoke-static {p0, v3, v4}, Lo/buc;->a(ILjava/util/Calendar;Ljava/util/Calendar;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lfi/firstbeat/coach/CoachVars;)Lfi/firstbeat/coach/CoachVars;
    .locals 0

    .line 22
    sput-object p0, Lo/buc;->a:Lfi/firstbeat/coach/CoachVars;

    return-object p0
.end method
