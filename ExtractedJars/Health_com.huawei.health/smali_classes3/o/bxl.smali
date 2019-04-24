.class public Lo/bxl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-string v0, "ShowPlanAnotherHelper"

    sput-object v0, Lo/bxl;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(II)Lcom/huawei/health/suggestion/model/DayInfo;
    .locals 15

    .line 86
    new-instance v4, Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/DayInfo;-><init>()V

    .line 87
    rem-int/lit8 v0, p1, 0x7

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveOrder(I)V

    .line 88
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveSinglesCount(I)V

    .line 89
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v5

    .line 91
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ljava/util/Calendar;->clear()V

    .line 93
    add-int v0, p0, p1

    const/4 v1, 0x5

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 95
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 96
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 97
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v8

    .line 98
    const/4 v9, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 99
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 100
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v11

    .line 101
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v13

    .line 102
    cmp-long v0, v11, v13

    if-nez v0, :cond_0

    .line 103
    sget-object v0, Lo/bxl;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDayDesc(Ljava/lang/String;)V

    .line 105
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_rest_workout_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDayTitle(Ljava/lang/String;)V

    .line 98
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 96
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 111
    :cond_2
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDate(Ljava/lang/String;)V

    .line 113
    return-object v4
.end method

.method private static a(IILjava/util/Calendar;)Lcom/huawei/health/suggestion/model/DayInfo;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 118
    new-instance v2, Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/DayInfo;-><init>()V

    .line 119
    rem-int/lit8 v0, p1, 0x7

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveOrder(I)V

    .line 120
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveSinglesCount(I)V

    .line 122
    invoke-virtual {p2}, Ljava/util/Calendar;->clear()V

    .line 123
    add-int v0, p0, p1

    const/4 v1, 0x5

    invoke-virtual {p2, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 124
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDate(Ljava/lang/String;)V

    .line 125
    return-object v2
.end method

.method public static a(Ljava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/byc;>;I)V"
        }
    .end annotation

    .line 32
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 33
    new-instance v3, Lo/bty;

    invoke-direct {v3}, Lo/bty;-><init>()V

    .line 34
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/bty;->c(Landroid/content/Context;)V

    .line 36
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 37
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/byc;

    .line 38
    const/4 v6, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v6, v0, :cond_1

    .line 39
    invoke-virtual {v5}, Lo/byc;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 40
    mul-int/lit8 v0, v4, 0x7

    add-int v7, v0, v6

    .line 41
    invoke-virtual {v5}, Lo/byc;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5}, Lo/byc;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-static {p1, v7, v1, v2, v3}, Lo/bxl;->e(IILcom/huawei/health/suggestion/model/WeekInfo;Ljava/util/Calendar;Lo/bty;)Lo/bxv;

    move-result-object v1

    invoke-interface {v0, v6, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 36
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 45
    :cond_2
    return-void
.end method

.method private static b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 4

    .line 169
    if-nez p0, :cond_0

    .line 170
    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 173
    const/4 v0, 0x0

    return v0

    .line 175
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private static c(IILcom/huawei/health/suggestion/model/WeekInfo;)Lo/bxv;
    .locals 4

    .line 76
    new-instance v2, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/PlanWorkout;-><init>()V

    .line 77
    invoke-virtual {v2, p2}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V

    .line 78
    invoke-static {p0, p1}, Lo/bxl;->a(II)Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V

    .line 79
    new-instance v3, Lo/bxv;

    add-int v0, p0, p1

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lo/bxv;-><init>(ILcom/huawei/health/suggestion/model/DayInfo;)V

    .line 80
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/bxv;->e(Z)V

    .line 81
    invoke-virtual {v3}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    return-object v3
.end method

.method private static e(IILcom/huawei/health/suggestion/model/WeekInfo;Ljava/util/Calendar;Lo/bty;)Lo/bxv;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 61
    new-instance v2, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/PlanWorkout;-><init>()V

    .line 62
    invoke-virtual {v2, p2}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V

    .line 63
    invoke-static {p0, p1, p3}, Lo/bxl;->a(IILjava/util/Calendar;)Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v3

    .line 64
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_rest_workout_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putName(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p4}, Lo/bty;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDescription(Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWorkoutId(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v2, v3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V

    .line 69
    new-instance v4, Lo/bxv;

    add-int v0, p0, p1

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lo/bxv;-><init>(ILcom/huawei/health/suggestion/model/DayInfo;)V

    .line 70
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/bxv;->e(Z)V

    .line 71
    invoke-virtual {v4}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    return-object v4
.end method

.method public static e(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 150
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 151
    :cond_0
    return-void

    .line 154
    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 155
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {v0}, Lo/bxl;->b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 156
    invoke-interface {p0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 157
    add-int/lit8 v1, v1, -0x1

    .line 154
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 160
    :cond_3
    return-void
.end method

.method public static e(Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/byc;>;I)V"
        }
    .end annotation

    .line 48
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 49
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/byc;

    .line 50
    const/4 v4, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v4, v0, :cond_1

    .line 51
    invoke-virtual {v3}, Lo/byc;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 52
    mul-int/lit8 v0, v2, 0x7

    add-int v5, v0, v4

    .line 53
    invoke-virtual {v3}, Lo/byc;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3}, Lo/byc;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-static {p1, v5, v1}, Lo/bxl;->c(IILcom/huawei/health/suggestion/model/WeekInfo;)Lo/bxv;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 50
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    :cond_2
    return-void
.end method
