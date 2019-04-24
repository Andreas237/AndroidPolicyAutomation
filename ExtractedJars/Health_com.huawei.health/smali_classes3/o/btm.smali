.class public Lo/btm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(FLcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F
    .locals 26

    .line 125
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostCompleteRateByWeek enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const/4 v6, 0x0

    .line 128
    const/4 v7, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_5

    .line 129
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 130
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v9

    .line 131
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 132
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 133
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v12

    .line 134
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v14

    .line 135
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 136
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 137
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostCompleteRateByWeek strStartDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 139
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostCompleteRateByWeek strEndDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v18, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v19

    .line 143
    const/16 v20, 0x0

    .line 144
    if-eqz v19, :cond_0

    .line 145
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_1
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 146
    invoke-virtual/range {v22 .. v22}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    add-float v20, v20, v0

    .line 147
    goto :goto_1

    .line 151
    :cond_0
    const/16 v21, 0x0

    .line 152
    const/16 v22, 0x0

    :goto_2
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v22

    if-ge v1, v0, :cond_2

    .line 153
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    move/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 154
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v24

    .line 155
    const/4 v0, 0x0

    move-object/from16 v1, v24

    if-eq v0, v1, :cond_1

    .line 156
    const/16 v25, 0x0

    :goto_3
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v25

    if-ge v1, v0, :cond_1

    .line 157
    move/from16 v0, v21

    float-to-double v0, v0

    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v2

    .line 158
    move-object/from16 v3, v24

    move/from16 v4, v25

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/btj;->a(Ljava/lang/String;)D

    move-result-wide v2

    move/from16 v4, p0

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v2, v0

    move/from16 v21, v2

    .line 156
    add-int/lit8 v25, v25, 0x1

    goto :goto_3

    .line 152
    :cond_1
    add-int/lit8 v22, v22, 0x1

    goto :goto_2

    .line 164
    :cond_2
    const/4 v0, 0x0

    cmpg-float v0, v21, v0

    if-gtz v0, :cond_3

    .line 165
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostCompleteRateByWeek initWeekShouldTotal <= 0f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const/4 v0, 0x0

    return v0

    .line 168
    :cond_3
    div-float v22, v20, v21

    .line 169
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostCompleteRateByWeek completeRate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    cmpl-float v0, v22, v6

    if-lez v0, :cond_4

    .line 171
    move/from16 v6, v22

    .line 128
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 175
    :cond_5
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostCompleteRateByWeek initValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    return v6
.end method

.method public static a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/PlanRecord;
    .locals 12

    .line 280
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toPlanRecord enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 282
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userFitnessPlan info is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const/4 v0, 0x0

    return-object v0

    .line 285
    :cond_0
    new-instance v6, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/PlanRecord;-><init>()V

    .line 287
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/btj;->b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F

    move-result v7

    .line 288
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planShouldTotal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-virtual {v6, v7}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveCalorie(F)V

    .line 290
    invoke-static {p0}, Lo/btm;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F

    move-result v8

    .line 291
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planBurnedTotal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    invoke-virtual {v6, v8}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveActualCalorie(F)V

    .line 295
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->savePlanId(Ljava/lang/String;)V

    .line 296
    div-float v0, v8, v7

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveFinishRate(F)V

    .line 297
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveWeekCount(I)V

    .line 299
    invoke-static {p0}, Lo/btm;->h(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveWorkoutDays(I)V

    .line 300
    invoke-static {p0}, Lo/btm;->f(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveWorkoutTimes(I)V

    .line 302
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->savePlanName(Ljava/lang/String;)V

    .line 303
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->savePlanType(I)V

    .line 304
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->savePlanTempId(Ljava/lang/String;)V

    .line 305
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireModifyTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveFinishDate(J)V

    .line 308
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 309
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireCreateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveStartDate(Ljava/lang/String;)V

    .line 311
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireCreateTime()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    add-long v10, v0, v2

    .line 312
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->saveEndDate(Ljava/lang/String;)V

    .line 313
    return-object v6
.end method

.method private static b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I
    .locals 21

    .line 181
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLongestWorkoutPeriodByWeek enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    const/4 v4, 0x0

    .line 184
    const/4 v5, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 185
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 186
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v7

    .line 187
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 188
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 189
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v10

    .line 190
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v12

    .line 191
    new-instance v14, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v14, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 192
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 193
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLongestWorkoutPeriodByWeek strStartDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v15, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 195
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLongestWorkoutPeriodByWeek strEndDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v16, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v0, v1, v15, v2}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v17

    .line 199
    const/16 v18, 0x0

    .line 200
    if-eqz v17, :cond_0

    .line 201
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 202
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    add-int v18, v18, v0

    .line 203
    goto :goto_1

    .line 205
    :cond_0
    move/from16 v0, v18

    if-le v0, v4, :cond_1

    .line 206
    move/from16 v4, v18

    .line 184
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 210
    :cond_2
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutPeriod = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    return v4
.end method

.method public static c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 26

    .line 36
    if-nez p0, :cond_0

    .line 37
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    new-instance v4, Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/Plan;-><init>()V

    .line 40
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 41
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 42
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireCreateTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/Plan;->saveCreateTime(J)V

    .line 43
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireRemindTime()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->setRemindTime(I)V

    .line 44
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveId(Ljava/lang/String;)V

    .line 45
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveType(I)V

    .line 47
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->savePicture(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v4, v6}, Lcom/huawei/health/suggestion/model/Plan;->saveWeekCount(I)V

    .line 49
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lo/btj;->b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveCalorie(F)V

    .line 50
    const/4 v7, 0x0

    .line 52
    const-wide/16 v8, 0x0

    .line 53
    const-wide/16 v10, 0x0

    .line 54
    const/4 v12, 0x0

    :goto_0
    if-ge v12, v6, :cond_5

    .line 55
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 56
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v14

    .line 58
    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_4

    .line 59
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 61
    if-nez v12, :cond_1

    if-nez v15, :cond_1

    .line 62
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v8

    .line 63
    const-wide/16 v0, 0x3e8

    div-long v0, v8, v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveStartDate(Ljava/lang/String;)V

    .line 66
    :cond_1
    add-int/lit8 v0, v6, -0x1

    if-ne v12, v0, :cond_2

    add-int/lit8 v0, v14, -0x1

    if-ne v15, v0, :cond_2

    .line 67
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v10

    .line 68
    const-wide/16 v0, 0x3e8

    div-long v0, v10, v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveEndDate(Ljava/lang/String;)V

    .line 71
    :cond_2
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v17

    .line 72
    if-eqz v17, :cond_3

    .line 73
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v18

    .line 74
    add-int v7, v7, v18

    .line 75
    const/16 v19, 0x0

    :goto_2
    move/from16 v0, v19

    move/from16 v1, v18

    if-ge v0, v1, :cond_3

    .line 76
    new-instance v20, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/health/suggestion/model/PlanWorkout;-><init>()V

    .line 77
    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putName(Ljava/lang/String;)V

    .line 78
    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWorkoutId(Ljava/lang/String;)V

    .line 79
    new-instance v21, Lcom/huawei/health/suggestion/model/WeekInfo;

    invoke-direct/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/WeekInfo;-><init>()V

    .line 80
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekPeriod()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveWeekName(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekDesc()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveSentence(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekOrder()I

    move-result v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->saveOrder(I)V

    .line 83
    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V

    .line 85
    new-instance v22, Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-direct/range {v22 .. v22}, Lcom/huawei/health/suggestion/model/DayInfo;-><init>()V

    .line 86
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v23

    .line 87
    invoke-static/range {v23 .. v24}, Lo/bzv;->e(J)I

    move-result v25

    .line 88
    move-object/from16 v0, v22

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/DayInfo;->saveOrder(I)V

    .line 89
    const-wide/16 v0, 0x3e8

    div-long v0, v23, v0

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDate(Ljava/lang/String;)V

    .line 90
    add-int/lit8 v0, v19, 0x1

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveSinglesCount(I)V

    .line 91
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDayTitle(Ljava/lang/String;)V

    .line 92
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/DayInfo;->saveDayDesc(Ljava/lang/String;)V

    .line 93
    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V

    .line 95
    move-object/from16 v0, v20

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_2

    .line 58
    :cond_3
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_1

    .line 54
    :cond_4
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 101
    :cond_5
    sub-long v12, v10, v8

    .line 102
    const-wide/32 v0, 0x5265c00

    div-long v0, v12, v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    long-to-int v14, v0

    .line 103
    invoke-virtual {v4, v14}, Lcom/huawei/health/suggestion/model/Plan;->saveDays(I)V

    .line 104
    invoke-virtual {v4, v7}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkoutCount(I)V

    .line 105
    invoke-virtual {v4, v5}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkouts(Ljava/util/List;)V

    .line 107
    return-object v4
.end method

.method public static c(FLjava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 4

    .line 111
    if-nez p1, :cond_0

    .line 112
    const/4 v0, 0x0

    return-object v0

    .line 115
    :cond_0
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v2

    .line 116
    new-instance v3, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/PlanStat;-><init>()V

    .line 117
    invoke-static {v2}, Lo/btm;->g(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveMostCaloriePerWeek(F)V

    .line 118
    invoke-static {v2}, Lo/btm;->d(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveMostWorkoutTimes(I)V

    .line 119
    invoke-static {v2}, Lo/btm;->b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveLongestTimePerWeek(I)V

    .line 120
    invoke-static {p0, v2}, Lo/btm;->a(FLcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Lo/bya;->c(F)F

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveHighestCompleteRate(F)V

    .line 121
    return-object v3
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 398
    const-string v0, "yyyy-MM-dd"

    invoke-static {p0, v0}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v1

    .line 399
    const-string v0, "yyyy-MM-dd"

    invoke-static {p1, v0}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v3

    .line 400
    cmp-long v0, v1, v3

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static d(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I
    .locals 19

    .line 216
    const/4 v4, 0x0

    .line 218
    const/4 v5, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 219
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 220
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v7

    .line 221
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 222
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 223
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v10

    .line 224
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v12

    .line 225
    new-instance v14, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v14, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 226
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 227
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostWorkoutTimes strStartDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v15, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 229
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostWorkoutTimes strEndDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v16, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v0, v1, v15, v2}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v17

    .line 233
    const/16 v18, 0x0

    .line 234
    if-eqz v17, :cond_0

    .line 235
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v18

    .line 237
    :cond_0
    move/from16 v0, v18

    if-le v0, v4, :cond_1

    .line 238
    move/from16 v4, v18

    .line 218
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 242
    :cond_2
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutTimes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    return v4
.end method

.method public static e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F
    .locals 21

    .line 317
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanSumBurnedCalorie enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    const/4 v4, 0x0

    .line 321
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 322
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v6

    .line 323
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 324
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v8

    .line 325
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 326
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 327
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanSumBurnedCalorie strStartDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 331
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v13

    .line 332
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 333
    invoke-virtual {v14}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v15

    .line 334
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 335
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanSumBurnedCalorie strEndDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    invoke-interface {v0, v1, v11, v2}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v18

    .line 339
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_0

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 340
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 341
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    add-float/2addr v4, v0

    .line 342
    goto :goto_0

    .line 344
    :cond_0
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "max_Cal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v0, v4, v0

    return v0
.end method

.method private static f(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I
    .locals 19

    .line 404
    const/4 v4, 0x0

    .line 407
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 408
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v6

    .line 409
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 410
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v8

    .line 411
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 412
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 413
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutTimes strStartDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 417
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v13

    .line 418
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 419
    invoke-virtual {v14}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v15

    .line 420
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 421
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutTimes strEndDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    invoke-interface {v0, v1, v11, v2}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v18

    .line 425
    if-nez v18, :cond_0

    .line 426
    return v4

    .line 428
    :cond_0
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v4

    .line 429
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutTimes workoutTimes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    return v4
.end method

.method private static g(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F
    .locals 21

    .line 246
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostConsumerCalorieByWeek enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    const/4 v4, 0x0

    .line 249
    const/4 v5, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 250
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 251
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v7

    .line 252
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 253
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 254
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v10

    .line 255
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v12

    .line 256
    new-instance v14, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v14, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 257
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 258
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostConsumerCalorieByWeek strStartDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v15, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 260
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMostConsumerCalorieByWeek strEndDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v16, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v0, v1, v15, v2}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v17

    .line 264
    const/16 v18, 0x0

    .line 265
    if-eqz v17, :cond_0

    .line 266
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 267
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    add-float v18, v18, v0

    .line 268
    goto :goto_1

    .line 270
    :cond_0
    cmpl-float v0, v18, v4

    if-lez v0, :cond_1

    .line 271
    move/from16 v4, v18

    .line 249
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 275
    :cond_2
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "max_Cal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    return v4
.end method

.method private static h(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)I
    .locals 21

    .line 349
    const/4 v4, 0x0

    .line 352
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 353
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v6

    .line 354
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 355
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v8

    .line 356
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 357
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 358
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutDays strStartDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 362
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v13

    .line 363
    if-nez v13, :cond_0

    .line 364
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutDays lastWeekdayPlanList == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    const/4 v0, 0x0

    return v0

    .line 367
    :cond_0
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 368
    invoke-virtual {v14}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v15

    .line 369
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 370
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutDays strEndDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    invoke-interface {v0, v1, v11, v2}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v18

    .line 375
    if-nez v18, :cond_1

    .line 376
    return v4

    .line 378
    :cond_1
    const/16 v19, 0x0

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_4

    .line 379
    if-nez v19, :cond_2

    .line 381
    const/4 v4, 0x1

    .line 383
    :cond_2
    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v20

    .line 384
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutDays init = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v20, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    add-int/lit8 v0, v19, 0x1

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 387
    add-int/lit8 v0, v19, 0x1

    move-object/from16 v1, v18

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-static {v1, v0}, Lo/btm;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 388
    add-int/lit8 v4, v4, 0x1

    .line 378
    :cond_3
    add-int/lit8 v19, v19, 0x1

    goto :goto_0

    .line 393
    :cond_4
    const-string v0, "FitnessPackagePlanDataConverter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutDays = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    return v4
.end method
