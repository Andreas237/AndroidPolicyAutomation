.class public Lo/btj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/btj$c;
    }
.end annotation


# static fields
.field private static final i:Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private b:Landroid/os/Handler;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;>;"
        }
    .end annotation
.end field

.field private f:Landroid/content/IntentFilter;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
        }
    .end annotation
.end field

.field private h:Landroid/content/BroadcastReceiver;

.field private k:Landroid/support/v4/content/LocalBroadcastManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 95
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/btj;->i:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/btj;->g:Ljava/util/ArrayList;

    .line 98
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lo/btj;->f:Landroid/content/IntentFilter;

    .line 99
    new-instance v0, Lo/btj$3;

    invoke-direct {v0, p0}, Lo/btj$3;-><init>(Lo/btj;)V

    iput-object v0, p0, Lo/btj;->h:Landroid/content/BroadcastReceiver;

    .line 125
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/btj;->b:Landroid/os/Handler;

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/btj;->d:Ljava/util/ArrayList;

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    .line 128
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 129
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/btj;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 130
    iget-object v0, p0, Lo/btj;->f:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.plugin.account.logout"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 132
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lo/btj;->k:Landroid/support/v4/content/LocalBroadcastManager;

    .line 133
    iget-object v0, p0, Lo/btj;->k:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lo/btj;->h:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lo/btj;->f:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 134
    return-void
.end method

.method synthetic constructor <init>(Lo/btj$3;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/btj;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPlanCourse;>;"
        }
    .end annotation

    .line 311
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 312
    if-nez v4, :cond_0

    .line 313
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planId is not exists: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    const/4 v0, 0x0

    return-object v0

    .line 317
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v5

    .line 318
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v6

    .line 319
    const-string v0, "yyyy-MM-dd"

    invoke-static {v6, v0}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v7

    .line 320
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v7

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v9

    .line 321
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_3

    .line 322
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 323
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_2

    .line 324
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 325
    invoke-virtual {v14}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v15

    .line 326
    cmp-long v0, v9, v15

    if-nez v0, :cond_1

    .line 327
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "find time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-virtual {v14}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 323
    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 321
    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 333
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 22

    .line 719
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 720
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v5

    .line 721
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 722
    return-void

    .line 724
    :cond_0
    const-wide/16 v6, 0x0

    .line 726
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v6, v0

    .line 729
    goto :goto_0

    .line 727
    :catch_0
    move-exception v8

    .line 728
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ParseException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v8

    .line 731
    const/4 v9, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_8

    .line 732
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v10

    .line 733
    const/4 v11, 0x0

    :goto_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_7

    .line 734
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 735
    invoke-static {v6, v7}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayLastTimeStamp(J)J

    move-result-wide v13

    .line 736
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayLastTimeStamp(J)J

    move-result-wide v15

    .line 737
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayLastTimeStamp(J)J

    move-result-wide v17

    .line 738
    cmp-long v0, v13, v17

    if-eqz v0, :cond_2

    .line 740
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/btj;->b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/btj;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 741
    :cond_1
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatePlanInfo invalid workoutRecord"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    return-void

    .line 745
    :cond_2
    cmp-long v0, v13, v15

    if-nez v0, :cond_6

    .line 746
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curr == target, and value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v19

    .line 748
    const/16 v20, 0x0

    :goto_3
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_6

    .line 749
    move-object/from16 v0, v19

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    .line 750
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 751
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireFinishStatus()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 752
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireBurnedCalorie()D

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v2

    float-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    .line 753
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveBurnedCalorie(D)V

    .line 755
    :cond_3
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireWorkoutTime()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 756
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveWorkoutTime(I)V

    goto :goto_4

    .line 759
    :cond_4
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "update corresponding course = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    move-object/from16 v0, v21

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveFinishStatus(Z)V

    .line 761
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveBurnedCalorie(D)V

    .line 762
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveWorkoutTime(I)V

    .line 748
    :cond_5
    :goto_4
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_3

    .line 733
    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_2

    .line 731
    :cond_7
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 769
    :cond_8
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 5

    .line 1398
    iget-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1399
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloud has no completed fitness plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1400
    const-string v0, "allCompletedPlanIds.isEmpty()"

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    goto :goto_1

    .line 1402
    :cond_0
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 1403
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    iget-object v1, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lo/btj$1;

    invoke-direct {v2, p0, p1}, Lo/btj$1;-><init>(Lo/btj;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    invoke-interface {v0, v1, v2}, Lo/brz;->c(Ljava/lang/String;Lo/bsr;)V

    .line 1402
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1419
    :cond_1
    :goto_1
    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 1271
    if-eqz p1, :cond_3

    .line 1272
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 1273
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    .line 1274
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireFitnessWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 1275
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireFitnessWeekPlanList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 1276
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 1277
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 1278
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v8

    .line 1279
    if-eqz v8, :cond_0

    .line 1280
    const/4 v9, 0x0

    :goto_3
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_0

    .line 1281
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v10

    .line 1282
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireWorkoutRealCal()D

    move-result-wide v11

    .line 1283
    iget-object v0, p0, Lo/btj;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1280
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 1276
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 1274
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 1272
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 1290
    :cond_3
    return-void
.end method

.method static synthetic a(Lo/btj;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/btj;->o()V

    return-void
.end method

.method static synthetic a(Lo/btj;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lo/btj;->a(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    return-void
.end method

.method static synthetic a(Lo/btj;Ljava/util/ArrayList;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lo/btj;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic a(Lo/btj;Lorg/json/JSONObject;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lo/btj;->b(Lorg/json/JSONObject;)V

    return-void
.end method

.method private a(IILcom/huawei/health/suggestion/model/FitnessPackageInfo;)Z
    .locals 7

    .line 416
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 417
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitness plan or plan id is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    const/4 v0, 0x0

    return v0

    .line 420
    :cond_1
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 421
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_2

    .line 422
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitness plan id length error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    const/4 v0, 0x0

    return v0

    .line 425
    :cond_2
    const/4 v5, 0x0

    .line 426
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 427
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 429
    :pswitch_0
    const/16 v0, 0x52

    if-ne v6, v0, :cond_3

    .line 430
    const/4 v5, 0x1

    goto :goto_0

    .line 434
    :pswitch_1
    const/16 v0, 0x4c

    if-ne v6, v0, :cond_3

    .line 435
    const/4 v5, 0x1

    goto :goto_0

    .line 439
    :pswitch_2
    const/16 v0, 0x53

    if-ne v6, v0, :cond_3

    .line 440
    const/4 v5, 0x1

    goto :goto_0

    .line 446
    :pswitch_3
    const/4 v5, 0x1

    .line 447
    .line 451
    :cond_3
    :goto_0
    if-nez v5, :cond_4

    .line 452
    return v5

    .line 454
    :cond_4
    if-eqz v5, :cond_5

    invoke-static {v4, p2}, Lo/bya;->b(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    return v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b(IILjava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/ArrayList<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;"
        }
    .end annotation

    .line 402
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 403
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 404
    invoke-direct {p0, p3}, Lo/btj;->a(Ljava/util/ArrayList;)V

    .line 405
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    .line 406
    invoke-direct {p0, p1, p2, v3}, Lo/btj;->a(IILcom/huawei/health/suggestion/model/FitnessPackageInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    :cond_0
    goto :goto_0

    .line 411
    :cond_1
    return-object v1
.end method

.method static synthetic b(Lo/btj;IILjava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1

    .line 67
    invoke-direct {p0, p1, p2, p3}, Lo/btj;->b(IILjava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/btj;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 67
    iput-object p1, p0, Lo/btj;->g:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic b(Lo/btj;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/btj;->l()V

    return-void
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 8

    .line 1441
    const-string v0, "userFitnessPlanList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 1443
    if-eqz v4, :cond_1

    .line 1444
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 1445
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 1447
    const-string v0, "planId"

    :try_start_0
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1448
    iget-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1449
    iget-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1453
    :cond_0
    goto :goto_1

    .line 1451
    :catch_0
    move-exception v7

    .line 1452
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e = "

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

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1444
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1456
    :cond_1
    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 15

    .line 814
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 815
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 816
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasExercised null == accountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 817
    const/4 v0, 0x1

    return v0

    .line 820
    :cond_0
    invoke-virtual {p0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 821
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 822
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasExercised null == fitnessPlan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    const/4 v0, 0x1

    return v0

    .line 826
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v6

    .line 827
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v7

    .line 828
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v7, v0}, Lo/btw;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 829
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 831
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasExercised recordList.isEmpty()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    const/4 v0, 0x0

    return v0

    .line 835
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v9

    .line 837
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 838
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 839
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v13

    .line 840
    cmp-long v0, v9, v13

    if-nez v0, :cond_3

    .line 842
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasExercised realZeroTime == historyZeroTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 843
    const/4 v0, 0x0

    return v0

    .line 837
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 847
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private c(Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;
    .locals 26

    .line 1459
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v6

    .line 1460
    const/4 v7, 0x0

    .line 1461
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 1462
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == userInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1463
    const/4 v0, 0x0

    return-object v0

    .line 1465
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v7

    .line 1466
    new-instance v8, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-direct {v8}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;-><init>()V

    .line 1467
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->savePlanTempId(Ljava/lang/String;)V

    .line 1468
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveName(Ljava/lang/String;)V

    .line 1469
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->savePicture(Ljava/lang/String;)V

    .line 1470
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireCardPicture()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveCardPicture(Ljava/lang/String;)V

    .line 1471
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveDescription(Ljava/lang/String;)V

    .line 1472
    const/16 v0, 0x438

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveRemindTime(I)V

    .line 1474
    const-wide/16 v9, 0x0

    .line 1475
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1476
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireFitnessWeekPlanList()Ljava/util/List;

    move-result-object v12

    .line 1477
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1478
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == fitnessWeekPlanList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1479
    const/4 v0, 0x0

    return-object v0

    .line 1482
    :cond_1
    const/4 v13, 0x0

    .line 1483
    const/4 v14, 0x0

    :goto_0
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_4

    .line 1484
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 1485
    new-instance v16, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;-><init>()V

    .line 1486
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekOrder()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekOrder(I)V

    .line 1487
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekDesc()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekDesc(Ljava/lang/String;)V

    .line 1488
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekPeriod()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekPeriod(Ljava/lang/String;)V

    .line 1489
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 1490
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v18

    .line 1491
    const/16 v19, 0x0

    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_3

    .line 1492
    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 1493
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move v2, v13

    add-int/lit8 v13, v13, 0x1

    int-to-long v2, v2

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    move-object/from16 v2, v20

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveStartTime(J)V

    .line 1494
    move-object/from16 v0, v17

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1496
    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 1497
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v22

    .line 1498
    if-eqz v22, :cond_2

    .line 1499
    const/16 v23, 0x0

    :goto_2
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_2

    .line 1500
    move-object/from16 v0, v22

    move/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireWorkoutRealCal()D

    move-result-wide v0

    float-to-double v2, v7

    mul-double v24, v0, v2

    .line 1501
    add-double v9, v9, v24

    .line 1499
    add-int/lit8 v23, v23, 0x1

    goto :goto_2

    .line 1491
    :cond_2
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_1

    .line 1506
    :cond_3
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekList(Ljava/util/List;)V

    .line 1508
    move-object/from16 v0, v16

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1483
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 1511
    :cond_4
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "totalCalorie = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "cal"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1512
    double-to-float v0, v9

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v14, v0, v1

    .line 1513
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "kCal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "kcal"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1514
    invoke-static {v14}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveTotalCalorie(Ljava/lang/String;)V

    .line 1515
    invoke-virtual {v8, v11}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveWeekPlanList(Ljava/util/List;)V

    .line 1517
    return-object v8
.end method

.method static synthetic c(Lo/btj;)Ljava/util/ArrayList;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/btj;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lo/btj;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 67
    iput-object p1, p0, Lo/btj;->d:Ljava/util/ArrayList;

    return-object p1
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 1138
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1140
    const-string v3, ""

    .line 1141
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 1142
    if-nez v4, :cond_0

    .line 1143
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v3

    .line 1144
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1146
    :cond_0
    move-object v2, v3

    .line 1147
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v3

    .line 1148
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1149
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1141
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1153
    :cond_2
    return-object v1
.end method

.method static synthetic c(Lo/btj;Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2}, Lo/btj;->d(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    return-void
.end method

.method static synthetic d(Lo/btj;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method private d(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 6

    .line 1422
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 1423
    if-eqz v3, :cond_1

    .line 1424
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v4

    .line 1426
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1428
    iget-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1429
    iget-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 1430
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1431
    const-string v0, "has finished download plans"

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 1434
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanStatus()I

    move-result v0

    if-nez v0, :cond_1

    .line 1435
    invoke-virtual {p0, v3}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 1438
    :cond_1
    return-void
.end method

.method static synthetic d(Lo/btj;Ljava/lang/String;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lo/btj;->g(Ljava/lang/String;)V

    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Z
    .locals 7

    .line 1016
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLocalPlanRecord enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1017
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1018
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLocalPlanRecord null == info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    const/4 v0, 0x0

    return v0

    .line 1022
    :cond_0
    invoke-static {p1}, Lo/btm;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v4

    .line 1023
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/btj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 1024
    iget-object v0, p0, Lo/btj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/PlanRecord;

    .line 1025
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1026
    iget-object v0, p0, Lo/btj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1027
    iget-object v0, p0, Lo/btj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1028
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1029
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLocalPlanRecord success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1030
    const/4 v0, 0x1

    return v0

    .line 1023
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1033
    :cond_2
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLocalPlanRecord fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1034
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/btj;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Z
    .locals 1

    .line 67
    invoke-direct {p0, p1}, Lo/btj;->d(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/btj;)Landroid/os/Handler;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/btj;->b:Landroid/os/Handler;

    return-object v0
.end method

.method public static final e()Lo/btj;
    .locals 1

    .line 117
    invoke-static {}, Lo/btj$c;->a()Lo/btj;

    move-result-object v0

    return-object v0
.end method

.method private e(ILjava/lang/String;Lo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lo/bui<Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;>;)V"
        }
    .end annotation

    .line 1294
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1295
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "noPlan"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1296
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalFitnessPlanInfo has no local data1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1297
    iget-object v0, p0, Lo/btj;->b:Landroid/os/Handler;

    invoke-virtual {p3, v0, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    goto :goto_0

    .line 1299
    :cond_1
    invoke-direct {p0, v4}, Lo/btj;->g(Ljava/lang/String;)V

    .line 1300
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLocalFitnessPlanInfo tmpInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1301
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 1302
    iget-object v0, p0, Lo/btj;->b:Landroid/os/Handler;

    invoke-virtual {p3, v0, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1304
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/btj;ILjava/lang/String;Lo/bui;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2, p3}, Lo/btj;->e(ILjava/lang/String;Lo/bui;)V

    return-void
.end method

.method private static e(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 5

    .line 1157
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 1158
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 1159
    invoke-virtual {v2, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1160
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1161
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1162
    const/4 v0, 0x6

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1164
    :goto_0
    return v4
.end method

.method static synthetic f()Ljava/lang/Object;
    .locals 1

    .line 67
    sget-object v0, Lo/btj;->i:Ljava/lang/Object;

    return-object v0
.end method

.method private g(Ljava/lang/String;)V
    .locals 4

    .line 1261
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1262
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1263
    const-string v0, "create_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1265
    :cond_0
    const-string v0, "goal"

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1266
    const-string v0, "data"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1267
    const-string v0, "1120008"

    invoke-static {v0, v3}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 1268
    return-void
.end method

.method private l()V
    .locals 5

    .line 137
    iget-object v0, p0, Lo/btj;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 138
    sget-object v3, Lo/btj;->i:Ljava/lang/Object;

    monitor-enter v3

    .line 139
    :try_start_0
    iget-object v0, p0, Lo/btj;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 141
    :goto_0
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 142
    iget-object v0, p0, Lo/btj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 143
    iget-object v0, p0, Lo/btj;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 144
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    const-string v2, "noPlan"

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    return-void
.end method

.method private m()Z
    .locals 5

    .line 1521
    invoke-static {}, Lo/bzu$e;->a()Z

    move-result v4

    .line 1522
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIsOversea() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1523
    return v4
.end method

.method private o()V
    .locals 3

    .line 985
    invoke-virtual {p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v2

    .line 986
    if-eqz v2, :cond_0

    .line 987
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireCompleteRate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bzm;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 989
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)D
    .locals 2

    .line 711
    iget-object v0, p0, Lo/btj;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 712
    iget-object v0, p0, Lo/btj;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 714
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public a()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
        }
    .end annotation

    .line 213
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanRecords enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 216
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 218
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-static {v0}, Lo/btm;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v7

    .line 219
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 220
    goto :goto_0

    .line 222
    :cond_0
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    goto :goto_0

    .line 225
    :cond_1
    iput-object v4, p0, Lo/btj;->g:Ljava/util/ArrayList;

    .line 226
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanRecords leave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return-object v4
.end method

.method public a(Ljava/lang/String;Lo/bui;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;>;)V"
        }
    .end annotation

    .line 1201
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFitnessPkg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1202
    invoke-direct {p0}, Lo/btj;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1203
    const-string v0, "this is overseas version"

    const/16 v1, -0x3e7

    invoke-virtual {p2, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 1204
    return-void

    .line 1207
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1208
    :cond_1
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid parameters, planTempId is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1209
    return-void

    .line 1212
    :cond_2
    if-nez p2, :cond_3

    .line 1213
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid parameters, callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1214
    return-void

    .line 1217
    :cond_3
    invoke-virtual {p0, p1}, Lo/btj;->c(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    move-result-object v4

    .line 1218
    if-nez v4, :cond_4

    .line 1219
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "plan package not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1220
    const/4 v5, -0x1

    .line 1221
    const-string v6, "network disconnected"

    .line 1222
    invoke-virtual {p2, v5, v6}, Lo/bui;->b(ILjava/lang/String;)V

    .line 1223
    return-void

    .line 1225
    :cond_4
    invoke-direct {p0, v4}, Lo/btj;->c(Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v5

    .line 1226
    if-nez v5, :cond_5

    .line 1227
    return-void

    .line 1230
    :cond_5
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$12;

    invoke-direct {v1, p0, p2}, Lo/btj$12;-><init>(Lo/btj;Lo/bui;)V

    invoke-interface {v0, v5, v1}, Lo/brz;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;Lo/bsr;)V

    .line 1258
    return-void
.end method

.method public a(Lo/bui;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;>;)V"
        }
    .end annotation

    .line 1307
    invoke-direct {p0}, Lo/btj;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1308
    const-string v0, "this is overseas version"

    const/16 v1, -0x3e7

    invoke-virtual {p1, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 1309
    return-void

    .line 1311
    :cond_0
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$14;

    invoke-direct {v1, p0}, Lo/btj$14;-><init>(Lo/btj;)V

    const/4 v2, 0x0

    const/16 v3, 0x32

    invoke-interface {v0, v2, v3, v1}, Lo/brz;->b(IILo/bsr;)V

    .line 1338
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$5;

    invoke-direct {v1, p0, p1}, Lo/btj$5;-><init>(Lo/btj;Lo/bui;)V

    invoke-interface {v0, v1}, Lo/brz;->g(Lo/bsr;)V

    .line 1367
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)F
    .locals 16

    .line 686
    const/4 v6, 0x0

    .line 687
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v7

    .line 688
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 689
    return v6

    .line 692
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireFitnessWeekPlanList()Ljava/util/List;

    move-result-object v8

    .line 693
    const/4 v9, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 694
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v10

    .line 695
    const/4 v11, 0x0

    :goto_1
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_2

    .line 696
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 697
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v13

    .line 698
    if-eqz v13, :cond_1

    .line 699
    const/4 v14, 0x0

    :goto_2
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_1

    .line 700
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    .line 701
    float-to-double v0, v6

    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lo/btj;->a(Ljava/lang/String;)D

    move-result-wide v2

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v4

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v6, v0

    .line 699
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 695
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 693
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 707
    :cond_3
    return v6
.end method

.method public b(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F
    .locals 16

    .line 660
    const/4 v4, 0x0

    .line 661
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v5

    .line 662
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 663
    :cond_0
    return v4

    .line 666
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v6

    .line 667
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 668
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v8

    .line 669
    const/4 v9, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 670
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 671
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v11

    .line 672
    if-eqz v11, :cond_2

    .line 673
    const/4 v12, 0x0

    :goto_2
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 674
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    .line 675
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/btj;->a(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v2

    float-to-double v2, v2

    mul-double v14, v0, v2

    .line 676
    float-to-double v0, v4

    add-double/2addr v0, v14

    double-to-float v4, v0

    .line 673
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 669
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 667
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 682
    :cond_4
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v0, v4, v0

    return v0
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;
    .locals 5

    .line 182
    if-nez p1, :cond_0

    .line 183
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planId == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const/4 v0, 0x0

    return-object v0

    .line 186
    :cond_0
    invoke-virtual {p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v4

    .line 187
    if-nez v4, :cond_1

    .line 188
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "such planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " has no planrecord"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const/4 v0, 0x0

    return-object v0

    .line 191
    :cond_1
    invoke-static {v4}, Lo/btm;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;
    .locals 7

    .line 888
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 889
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "noPlan"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 890
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readCurrentPlanFromMemory tmpInfo invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    const/4 v0, 0x0

    return-object v0

    .line 894
    :cond_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 895
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 897
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 898
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 899
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planInfo2"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 901
    :cond_2
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planInfo2 is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    :cond_3
    :goto_0
    return-object v5
.end method

.method public b(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 4

    .line 1370
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1371
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAllCompletedFitnessPlan null == callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1372
    return-void

    .line 1375
    :cond_0
    invoke-direct {p0}, Lo/btj;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1376
    const-string v0, "this is overseas version"

    const/16 v1, -0x3e7

    invoke-interface {p1, v1, v0}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 1377
    return-void

    .line 1379
    :cond_1
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$4;

    invoke-direct {v1, p0, p1}, Lo/btj$4;-><init>(Lo/btj;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    invoke-interface {v0, v1}, Lo/brz;->e(Lo/bsr;)V

    .line 1395
    return-void
.end method

.method public b(Lo/bui;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;>;)V"
        }
    .end annotation

    .line 464
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllFitnessPkg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Lo/btj;->c(IILo/bui;)V

    .line 510
    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/FitnessPackageInfo;
    .locals 7

    .line 231
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid planTempId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    const/4 v0, 0x0

    return-object v0

    .line 236
    :cond_1
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/btj;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 237
    iget-object v0, p0, Lo/btj;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    .line 238
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v6

    .line 239
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 240
    return-object v5

    .line 236
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 244
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
        }
    .end annotation

    .line 197
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllPlanRecords enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/btj$2;

    invoke-direct {v1, p0}, Lo/btj$2;-><init>(Lo/btj;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 204
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lo/btj;->g:Ljava/util/ArrayList;

    return-object v0

    .line 207
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllPlanRecords not china version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(I)V
    .locals 3

    .line 1038
    invoke-direct {p0}, Lo/btj;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1039
    return-void

    .line 1046
    :cond_0
    invoke-virtual {p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v2

    .line 1047
    if-eqz v2, :cond_1

    .line 1049
    invoke-virtual {v2, p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveRemindTime(I)V

    .line 1050
    invoke-virtual {p0, p1}, Lo/btj;->e(I)V

    .line 1051
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$10;

    invoke-direct {v1, p0, v2}, Lo/btj$10;-><init>(Lo/btj;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    invoke-interface {v0, v2, v1}, Lo/brz;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;Lo/bsr;)V

    .line 1065
    :cond_1
    return-void
.end method

.method public c(IILo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;>;)V"
        }
    .end annotation

    .line 344
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get filter FitnessPkg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    if-nez p3, :cond_0

    .line 346
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid parameters, callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    return-void

    .line 350
    :cond_0
    invoke-direct {p0}, Lo/btj;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 351
    const-string v0, "this is overseas version"

    const/16 v1, -0x3e7

    invoke-virtual {p3, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 352
    return-void

    .line 355
    :cond_1
    const/4 v4, 0x0

    .line 356
    const/16 v5, 0x32

    .line 359
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$6;

    invoke-direct {v1, p0, p3, p1, p2}, Lo/btj$6;-><init>(Lo/btj;Lo/bui;II)V

    invoke-interface {v0, v4, v5, v1}, Lo/brz;->b(IILo/bsr;)V

    .line 391
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 10

    .line 616
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLocalFitnessPkgInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    if-nez p1, :cond_0

    .line 618
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid parameters, workoutRecord == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    return-void

    .line 622
    :cond_0
    invoke-virtual {p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v4

    .line 623
    if-nez v4, :cond_1

    .line 624
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLocalFitnessPkgInfo info == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    return-void

    .line 628
    :cond_1
    invoke-direct {p0, p1, v4}, Lo/btj;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 630
    invoke-static {v4}, Lo/btm;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)F

    move-result v5

    .line 631
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "burnedCalorie = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v6, v5, v0

    .line 633
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireTotalCalorie()Ljava/lang/String;

    move-result-object v7

    .line 634
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalCalorie = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    invoke-static {v7}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v8

    .line 636
    div-float v0, v6, v8

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v9

    .line 638
    invoke-virtual {v4, v9}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveCompleteRate(Ljava/lang/String;)V

    .line 639
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveFinishTime(J)V

    .line 641
    invoke-virtual {p0, v4}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 643
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/btj$9;

    invoke-direct {v1, p0}, Lo/btj$9;-><init>(Lo/btj;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Lo/btj;->d(Ljava/lang/String;ILo/bui;)V

    .line 656
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/Userinfo;)F
    .locals 24

    .line 266
    const/4 v6, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_0

    .line 269
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v7

    .line 270
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWeekShouldCompleteCalorie userWeight = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 274
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 275
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planId is not exists: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    return v6

    .line 279
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v9

    .line 280
    const-string v0, "yyyy-MM-dd"

    invoke-static {v9, v0}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v10

    .line 281
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v10

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v12

    .line 283
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v14

    .line 284
    const/4 v0, 0x0

    if-eq v0, v14, :cond_5

    .line 285
    const/4 v15, 0x0

    :goto_0
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_5

    .line 286
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 288
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 289
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v18

    .line 290
    sub-long v0, v12, v18

    const-wide/32 v2, 0x240c8400

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 291
    goto :goto_3

    .line 293
    :cond_2
    const/16 v20, 0x0

    :goto_1
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_4

    .line 294
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v0

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 295
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v22

    .line 296
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_3

    .line 297
    const/16 v23, 0x0

    :goto_2
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_3

    .line 298
    float-to-double v0, v6

    move-object/from16 v2, v22

    move/from16 v3, v23

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lo/btj;->a(Ljava/lang/String;)D

    move-result-wide v2

    float-to-double v4, v7

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v6, v0

    .line 297
    add-int/lit8 v23, v23, 0x1

    goto :goto_2

    .line 293
    :cond_3
    add-int/lit8 v20, v20, 0x1

    goto :goto_1

    .line 302
    :cond_4
    return v6

    .line 285
    :goto_3
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 307
    :cond_5
    return v6
.end method

.method public d()Lcom/huawei/health/suggestion/model/Plan;
    .locals 2

    .line 909
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_0

    .line 910
    const/4 v0, 0x0

    return-object v0

    .line 913
    :cond_0
    invoke-virtual {p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v1

    .line 914
    if-eqz v1, :cond_1

    .line 915
    invoke-static {v1}, Lo/btm;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    return-object v0

    .line 918
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;
    .locals 5

    .line 167
    if-nez p1, :cond_0

    .line 168
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planId == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    return-object v0

    .line 171
    :cond_0
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 172
    if-nez v4, :cond_1

    .line 173
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "such planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " has no planrecord"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x0

    return-object v0

    .line 176
    :cond_1
    invoke-static {v4}, Lo/btm;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;ILo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILo/bui<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 928
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateFitnessPlan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    invoke-direct {p0}, Lo/btj;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 931
    const-string v0, "this is overseas version"

    const/16 v1, -0x3e7

    invoke-virtual {p3, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 932
    return-void

    .line 935
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 936
    :cond_1
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid parameters, planTempId is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 937
    return-void

    .line 940
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 941
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "noPlan"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 942
    :cond_3
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "local has no fitness package data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 943
    return-void

    .line 946
    :cond_4
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 947
    if-nez v5, :cond_5

    .line 948
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid local fitness package data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 949
    return-void

    .line 952
    :cond_5
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 953
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planId is not the same, planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; info planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 954
    return-void

    .line 957
    :cond_6
    invoke-virtual {v5, p2}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->savePlanStatus(I)V

    .line 958
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveFinishTime(J)V

    .line 959
    if-nez p2, :cond_7

    .line 960
    invoke-virtual {p0, v5}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 962
    :cond_7
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$7;

    invoke-direct {v1, p0, p3, p2}, Lo/btj$7;-><init>(Lo/btj;Lo/bui;I)V

    invoke-interface {v0, v5, v1}, Lo/brz;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;Lo/bsr;)V

    .line 982
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 12

    .line 852
    invoke-virtual {p0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 853
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 854
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasExercised null == fitnessPlan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 855
    const/4 v0, 0x1

    return v0

    .line 858
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v5

    .line 859
    const-string v0, "yyyy-MM-dd"

    invoke-static {v5, v0}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v6

    .line 860
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v6

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v8

    .line 861
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v10

    .line 863
    cmp-long v0, v10, v8

    if-lez v0, :cond_1

    .line 864
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasWorkoutTimeBeyondPlanLastTime plan expired"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    const/4 v0, 0x1

    return v0

    .line 868
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/Userinfo;)F
    .locals 10

    .line 248
    const/4 v6, 0x0

    .line 249
    const/4 v7, 0x0

    .line 250
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 251
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v7

    .line 252
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDayShouldCompleteCalorie userWeight = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    :cond_0
    invoke-direct {p0, p1}, Lo/btj;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Ljava/util/List;

    move-result-object v8

    .line 256
    if-eqz v8, :cond_1

    .line 257
    const/4 v9, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 258
    float-to-double v0, v6

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireCourseId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lo/btj;->a(Ljava/lang/String;)D

    move-result-wide v2

    float-to-double v4, v7

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v6, v0

    .line 257
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 262
    :cond_1
    return v6
.end method

.method public e(J)I
    .locals 19

    .line 776
    const/4 v4, 0x0

    .line 777
    const/4 v5, 0x0

    .line 778
    invoke-virtual/range {p0 .. p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v6

    .line 779
    if-eqz v6, :cond_3

    .line 780
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireWeekPlanList()Ljava/util/List;

    move-result-object v7

    .line 781
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 782
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 783
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v10

    .line 784
    const/4 v11, 0x0

    :goto_1
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_2

    .line 785
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 786
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDate()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v13

    .line 787
    invoke-static/range {p1 .. p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v15

    .line 788
    cmp-long v0, v13, v15

    if-nez v0, :cond_1

    .line 789
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "find today exercise course"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 790
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v17

    .line 791
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_1

    .line 792
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v4

    .line 793
    const/16 v18, 0x0

    :goto_2
    move/from16 v0, v18

    if-ge v0, v4, :cond_1

    .line 794
    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->acquireFinishStatus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 795
    add-int/lit8 v5, v5, 0x1

    .line 793
    :cond_0
    add-int/lit8 v18, v18, 0x1

    goto :goto_2

    .line 784
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 781
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 804
    :cond_3
    if-nez v5, :cond_4

    .line 805
    const/4 v0, 0x0

    return v0

    .line 806
    :cond_4
    if-ne v5, v4, :cond_5

    .line 807
    const/4 v0, 0x2

    return v0

    .line 809
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;
    .locals 1

    .line 162
    iget-object v0, p0, Lo/btj;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    return-object v0
.end method

.method public e(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;)Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;"
        }
    .end annotation

    .line 513
    const-string v0, "fitnessPackageInfoList"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 514
    if-nez v4, :cond_0

    .line 515
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "has no key fitnessPackageInfoList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    const/4 v0, 0x0

    return-object v0

    .line 519
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 520
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_b

    .line 521
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 522
    if-eqz v7, :cond_a

    .line 525
    const-string v0, "planTempId"

    :try_start_0
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 526
    new-instance v9, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-direct {v9, v8}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;-><init>(Ljava/lang/String;)V

    .line 527
    const-string v0, "description"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->saveDescription(Ljava/lang/String;)V

    .line 528
    const-string v0, "name"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->saveName(Ljava/lang/String;)V

    .line 529
    const-string v0, "picture"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->savePicture(Ljava/lang/String;)V

    .line 530
    const-string v0, "cardImage"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->saveCardPicture(Ljava/lang/String;)V

    .line 531
    const-string v0, "stage"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->saveStage(I)V

    .line 532
    const-string v0, "displayorder"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->saveDisplayOrder(I)V

    .line 533
    const-string v0, "totalCalorie"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->saveTotalCalorie(I)V

    .line 536
    const-string v0, "weekPlanList"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 537
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 538
    if-eqz v10, :cond_9

    .line 539
    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_8

    .line 540
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 541
    new-instance v14, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    invoke-direct {v14}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;-><init>()V

    .line 542
    const-string v0, "weekDesc"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekDesc(Ljava/lang/String;)V

    .line 543
    const-string v0, "weekPeriod"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekPeriod(Ljava/lang/String;)V

    .line 544
    const-string v0, "weekOrder"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekOrder(I)V

    .line 546
    const-string v0, "dayPlanList"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    .line 547
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 549
    if-eqz v15, :cond_7

    .line 550
    const/16 v17, 0x0

    :goto_2
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v17

    if-ge v1, v0, :cond_6

    .line 551
    move/from16 v0, v17

    invoke-virtual {v15, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v18

    .line 552
    new-instance v19, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;-><init>()V

    .line 553
    const-string v0, "dayStatus"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveDayStatus(I)V

    .line 554
    const-string v0, "name"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveName(Ljava/lang/String;)V

    .line 555
    const-string v0, "description"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveDescription(Ljava/lang/String;)V

    .line 558
    const-string v0, "workoutPlanList"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v20

    .line 559
    if-eqz v20, :cond_3

    .line 560
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 561
    const/16 v22, 0x0

    :goto_3
    invoke-virtual/range {v20 .. v20}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v22

    if-ge v1, v0, :cond_2

    .line 562
    move-object/from16 v0, v20

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v23

    .line 563
    new-instance v24, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-direct/range {v24 .. v24}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;-><init>()V

    .line 564
    const-string v0, "workoutId"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveCourseId(Ljava/lang/String;)V

    .line 565
    const-string v0, "restTime"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveWorkoutTime(I)V

    .line 566
    const-string v0, "finish"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveFinishStatus(Z)V

    .line 567
    const-string v0, "calorie"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveCalorie(I)V

    .line 568
    const-string v0, "name"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveName(Ljava/lang/String;)V

    .line 569
    const-string v0, "workoutRealCal"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 570
    const-string v0, "workoutRealCal"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveWorkoutRealCal(D)V

    .line 572
    :cond_1
    move-object/from16 v0, v21

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    add-int/lit8 v22, v22, 0x1

    goto :goto_3

    .line 574
    :cond_2
    move-object/from16 v0, v19

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveDayPlanCourses(Ljava/util/List;)V

    .line 578
    :cond_3
    const-string v0, "recommendWorkoutList"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v21

    .line 579
    if-eqz v21, :cond_5

    .line 580
    new-instance v22, Ljava/util/ArrayList;

    invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V

    .line 581
    const/16 v23, 0x0

    :goto_4
    invoke-virtual/range {v21 .. v21}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_4

    .line 582
    move-object/from16 v0, v21

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v24

    .line 583
    new-instance v25, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-direct/range {v25 .. v25}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;-><init>()V

    .line 584
    const-string v0, "workoutId"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveCourseId(Ljava/lang/String;)V

    .line 585
    const-string v0, "restTime"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveWorkoutTime(I)V

    .line 586
    const-string v0, "finish"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveFinishStatus(Z)V

    .line 587
    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 581
    add-int/lit8 v23, v23, 0x1

    goto :goto_4

    .line 589
    :cond_4
    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveRecommendCourses(Ljava/util/List;)V

    .line 591
    :cond_5
    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_2

    .line 593
    :cond_6
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->saveWeekList(Ljava/util/List;)V

    .line 595
    :cond_7
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 539
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 597
    :cond_8
    invoke-virtual {v9, v11}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->saveFitnessWeekPlanList(Ljava/util/List;)V

    .line 600
    :cond_9
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 603
    goto :goto_5

    .line 601
    :catch_0
    move-exception v8

    .line 602
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e.getMessage "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    :cond_a
    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 607
    :cond_b
    return-object v5
.end method

.method public e(I)V
    .locals 12

    .line 1068
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 1069
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remind button is off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1070
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/btj;->e(Z)V

    .line 1071
    return-void

    .line 1074
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1075
    invoke-virtual {p0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 1076
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 1077
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v6

    .line 1078
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workouts size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1079
    invoke-direct {p0, v6}, Lo/btj;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 1080
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workoutListByDay size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 1083
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 1084
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 1085
    new-instance v10, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;

    invoke-direct {v10, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1087
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    .line 1088
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1089
    invoke-static {p1}, Lo/bzr;->b(I)I

    move-result v0

    const/16 v1, 0xb

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 1090
    invoke-static {p1}, Lo/bzr;->a(I)I

    move-result v0

    const/16 v1, 0xc

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 1091
    const-string v0, "userId"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1092
    const-string v0, "planType"

    const/4 v1, 0x3

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1093
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerRemind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v11}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    add-int/lit8 v2, v8, 0x64

    const/high16 v3, 0x8000000

    invoke-static {v0, v1, v2, v10, v3}, Lo/bsv;->b(Landroid/content/Context;Ljava/util/Date;ILandroid/content/Intent;I)V

    .line 1095
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/btj;->e(Z)V

    .line 1082
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 1099
    :cond_2
    return-void
.end method

.method public e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 5

    .line 878
    if-nez p1, :cond_0

    .line 879
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    const-string v2, "noPlan"

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 881
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCurrentPlanToMemory"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 883
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    invoke-interface {v0, v1, v4}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 885
    :goto_0
    return-void
.end method

.method public e(Z)V
    .locals 3

    .line 1168
    if-eqz p1, :cond_0

    .line 1169
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "openRemind"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1171
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "openRemind"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1172
    invoke-virtual {p0}, Lo/btj;->k()V

    .line 1174
    :goto_0
    return-void
.end method

.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 149
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 150
    iget-object v0, p0, Lo/btj;->k:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lo/btj;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 151
    return-void
.end method

.method public g()Z
    .locals 2

    .line 1177
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "openRemind"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public h()I
    .locals 3

    .line 1181
    invoke-virtual {p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v2

    .line 1182
    if-eqz v2, :cond_1

    .line 1183
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireRemindTime()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 1184
    const/16 v0, 0x438

    return v0

    .line 1186
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireRemindTime()I

    move-result v0

    return v0

    .line 1189
    :cond_1
    const/16 v0, 0x438

    return v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 3

    .line 992
    invoke-direct {p0}, Lo/btj;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 993
    return-void

    .line 995
    :cond_0
    invoke-virtual {p0}, Lo/btj;->b()Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v2

    .line 996
    if-eqz v2, :cond_1

    .line 997
    invoke-virtual {v2, p1}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveName(Ljava/lang/String;)V

    .line 998
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/btj$8;

    invoke-direct {v1, p0, v2}, Lo/btj$8;-><init>(Lo/btj;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    invoke-interface {v0, v2, v1}, Lo/brz;->a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;Lo/bsr;)V

    .line 1013
    :cond_1
    return-void
.end method

.method public i()V
    .locals 11

    .line 1119
    invoke-virtual {p0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 1120
    if-eqz v5, :cond_1

    .line 1121
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v6

    .line 1122
    invoke-direct {p0, v6}, Lo/btj;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 1123
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 1124
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 1125
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    .line 1126
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 1127
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v10, v0}, Lo/btj;->e(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1128
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel today planRemind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    add-int/lit8 v1, v8, 0x64

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x8000000

    invoke-static {v0, v1, v2, v3}, Lo/bsv;->b(Landroid/content/Context;ILandroid/content/Intent;I)V

    .line 1123
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1135
    :cond_1
    return-void
.end method

.method public k()V
    .locals 10

    .line 1102
    invoke-virtual {p0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 1103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 1104
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v6

    .line 1105
    invoke-direct {p0, v6}, Lo/btj;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 1107
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 1108
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 1109
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    .line 1110
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregister planRemind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1111
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    add-int/lit8 v1, v8, 0x64

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/huawei/health/suggestion/receiver/AlarmReceiver;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x8000000

    invoke-static {v0, v1, v2, v3}, Lo/bsv;->b(Landroid/content/Context;ILandroid/content/Intent;I)V

    .line 1107
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1116
    :cond_1
    return-void
.end method
