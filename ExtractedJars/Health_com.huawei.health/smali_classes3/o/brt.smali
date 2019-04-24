.class public Lo/brt;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/brt;


# instance fields
.field private b:Landroid/content/BroadcastReceiver;

.field private d:I

.field private e:Lo/bxk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 96
    const/4 v0, 0x0

    sput-object v0, Lo/brt;->a:Lo/brt;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 139
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 97
    const/4 v0, -0x1

    iput v0, p0, Lo/brt;->d:I

    .line 209
    new-instance v0, Lo/brt$4;

    invoke-direct {v0, p0}, Lo/brt$4;-><init>(Lo/brt;)V

    iput-object v0, p0, Lo/brt;->b:Landroid/content/BroadcastReceiver;

    .line 140
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginSuggestion enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    new-instance v0, Lo/bxk;

    invoke-direct {v0}, Lo/bxk;-><init>()V

    iput-object v0, p0, Lo/brt;->e:Lo/bxk;

    .line 142
    iget-object v0, p0, Lo/brt;->e:Lo/bxk;

    invoke-virtual {v0}, Lo/bxk;->e()V

    .line 143
    invoke-direct {p0}, Lo/brt;->q()V

    .line 144
    return-void
.end method

.method static synthetic a(Lo/brt;)Lo/bxk;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/brt;->e:Lo/bxk;

    return-object v0
.end method

.method public static c()Lo/brt;
    .locals 4

    .line 313
    sget-object v0, Lo/brt;->a:Lo/brt;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 314
    const-class v2, Lo/brt;

    monitor-enter v2

    .line 315
    :try_start_0
    sget-object v0, Lo/brt;->a:Lo/brt;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 316
    new-instance v0, Lo/brt;

    invoke-direct {v0}, Lo/brt;-><init>()V

    sput-object v0, Lo/brt;->a:Lo/brt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 320
    :cond_1
    :goto_0
    sget-object v0, Lo/brt;->a:Lo/brt;

    return-object v0
.end method

.method private e(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 3

    .line 834
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 835
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 836
    const-string v0, "plan"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 837
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 838
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/RunWorkout;Ljava/lang/String;Landroid/content/Context;)V
    .locals 2

    .line 936
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 937
    return-void

    .line 940
    :cond_0
    if-eqz p1, :cond_1

    .line 941
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, p3}, Lo/bxb;->b(Lcom/huawei/health/suggestion/model/RunWorkout;Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;Landroid/content/Context;)V

    .line 943
    :cond_1
    return-void
.end method

.method static synthetic e(Lo/brt;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lo/brt;->w()V

    return-void
.end method

.method private q()V
    .locals 5

    .line 203
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 204
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 206
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/brt;->b:Landroid/content/BroadcastReceiver;

    const-string v2, "com.huawei.hihealth.DEFAULT_PERMISSION"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 207
    return-void
.end method

.method private w()V
    .locals 1

    .line 327
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 328
    return-void

    .line 331
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->h()V

    .line 332
    return-void
.end method

.method private x()V
    .locals 12

    .line 1075
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1076
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "restoreFitnessRecord isNoCloudVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    return-void

    .line 1080
    :cond_0
    const-string v4, "TrainList.txt"

    .line 1083
    const-string v0, "suggestion"

    invoke-static {v0, v4}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lo/bzw;->b(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v6

    .line 1084
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workouStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1085
    const-class v0, [Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {v6, v0}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v5

    .line 1086
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 1087
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 1088
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v9

    .line 1089
    if-eqz v9, :cond_2

    .line 1090
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountInfo is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1091
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-string v2, "yyyy-MM-dd"

    invoke-static {v0, v1, v2}, Lo/cap;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutDate(Ljava/lang/String;)V

    .line 1092
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 1093
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v10

    .line 1095
    const/4 v0, 0x0

    if-ne v0, v10, :cond_1

    .line 1096
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1097
    return-void

    .line 1099
    :cond_1
    invoke-virtual {v10}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v11

    .line 1100
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userWeight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    mul-float/2addr v0, v11

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 1103
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireCalorie()F

    move-result v0

    mul-float/2addr v0, v11

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 1104
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lo/btw;->a(Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    .line 1105
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Lo/bsp;->e(Landroid/content/Context;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 1086
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 1110
    :cond_3
    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 160
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginSuggestion getSportTrackStartType enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget v0, p0, Lo/brt;->d:I

    return v0
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;
    .locals 1

    .line 786
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btj;->b(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 551
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/bry;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 4

    .line 150
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginSuggestion setSportTrackStartType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iput p1, p0, Lo/brt;->d:I

    .line 152
    return-void
.end method

.method public a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 393
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->deleteFitnessRecord(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 394
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .line 505
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bry;->e(Landroid/os/Bundle;)V

    .line 506
    return-void
.end method

.method public a(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 561
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bry;->d(Ljava/util/List;Ljava/lang/String;)V

    .line 562
    return-void
.end method

.method public a(Lo/bui;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;>;)V"
        }
    .end annotation

    .line 797
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 798
    const/4 v0, -0x6

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x6

    invoke-virtual {p1, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 799
    return-void

    .line 802
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->c()Ljava/util/List;

    move-result-object v2

    .line 803
    invoke-static {v2}, Lo/bxn;->b(Ljava/util/List;)V

    .line 804
    invoke-virtual {p1, v2}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 805
    return-void
.end method

.method public b()I
    .locals 1

    .line 440
    invoke-static {}, Lo/caa;->a()Lo/caa;

    move-result-object v0

    invoke-virtual {v0}, Lo/caa;->d()I

    move-result v0

    return v0
.end method

.method public b(ILo/bui;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Ljava/util/Map;>;)V"
        }
    .end annotation

    .line 666
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bry;->c(ILo/bui;)V

    .line 667
    return-void
.end method

.method public b(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 380
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireDetailFitnessRecordByType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    const/4 v0, 0x4

    if-eq v0, p5, :cond_0

    const/4 v0, 0x5

    if-ne v0, p5, :cond_1

    .line 382
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByDay(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 383
    :cond_1
    const/4 v0, 0x6

    if-ne v0, p5, :cond_2

    .line 384
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByMonth(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 385
    :cond_2
    const/4 v0, 0x7

    if-ne v0, p5, :cond_3

    .line 386
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByYear(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 388
    :cond_3
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireDetailFitnessRecordByType error timeUnit is not  right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "start:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "-end:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :goto_0
    return-void
.end method

.method public b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 366
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireDetailFitnessRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 367
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/Summary;)V
    .locals 2

    .line 952
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 953
    return-void

    .line 956
    :cond_0
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/bxb;->e(Lcom/huawei/health/suggestion/model/Summary;Z)V

    .line 957
    return-void
.end method

.method public b(Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;)V"
        }
    .end annotation

    .line 745
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lo/brt$6;

    invoke-direct {v1, p0, p1}, Lo/brt$6;-><init>(Lo/brt;Lo/bui;)V

    invoke-virtual {v0, v1}, Lo/btj;->a(Lo/bui;)V

    .line 757
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/Plan;)Z
    .locals 9

    .line 845
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 846
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v3

    .line 847
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 848
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 849
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v7

    .line 850
    cmp-long v0, v3, v7

    if-nez v0, :cond_0

    .line 851
    const/4 v0, 0x1

    return v0

    .line 847
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 855
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/util/Date;Ljava/util/Date;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Date;Ljava/util/Date;)Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
        }
    .end annotation

    .line 1046
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRecordsByDateRange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/bsp;->a(Ljava/util/Date;Ljava/util/Date;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(I)V
    .locals 3

    .line 815
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 816
    return-void

    .line 819
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    .line 820
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 821
    :cond_1
    iget-object v0, p0, Lo/brt;->e:Lo/bxk;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Lo/bxk;->b(Landroid/os/Bundle;)V

    goto :goto_0

    .line 823
    :cond_2
    invoke-direct {p0, v2}, Lo/brt;->e(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 825
    :goto_0
    return-void
.end method

.method public c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 339
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByMonth(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 340
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 580
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bry;->b(Ljava/lang/String;)V

    .line 581
    return-void
.end method

.method public c(Ljava/lang/String;Lo/bui;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 973
    invoke-static {p1}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v0, v1, :cond_0

    .line 975
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lo/brt$8;

    invoke-direct {v1, p0, p2, p1}, Lo/brt$8;-><init>(Lo/brt;Lo/bui;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-virtual {v0, p1, v2, v1}, Lo/btj;->d(Ljava/lang/String;ILo/bui;)V

    goto :goto_0

    .line 992
    :cond_0
    invoke-static {p1}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v0, v1, :cond_1

    .line 993
    iget-object v0, p0, Lo/brt;->e:Lo/bxk;

    invoke-virtual {v0, p1}, Lo/bxk;->b(Ljava/lang/String;)V

    .line 994
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/bsp;->e(Ljava/lang/String;Lo/bui;)V

    .line 996
    :cond_1
    :goto_0
    return-void
.end method

.method public c(Lo/buh;)V
    .locals 1

    .line 421
    invoke-static {}, Lo/caa;->a()Lo/caa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/caa;->d(Lo/buh;)V

    .line 422
    return-void
.end method

.method public c(Lo/bui;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 1055
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/bsp;->b(Lo/bui;)V

    .line 1056
    return-void
.end method

.method public c(Landroid/content/Context;I)Z
    .locals 6

    .line 397
    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 398
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToFitnessResultActivity context error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    const/4 v0, 0x0

    return v0

    .line 402
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireWorkoutRecordByRecordId(I)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v4

    .line 403
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 404
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToFitnessResultActivity null == record and recordId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    const/4 v0, 0x0

    return v0

    .line 408
    :cond_1
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {v5, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 409
    const-string v0, "workout_record"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 410
    invoke-virtual {p1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 412
    const/4 v0, 0x1

    return v0
.end method

.method public d(J)I
    .locals 1

    .line 841
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/btj;->e(J)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    .line 895
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 896
    const/4 v0, -0x1

    return v0

    .line 899
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 900
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->b()I

    move-result v0

    return v0

    .line 902
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public d()V
    .locals 3

    .line 457
    const/4 v2, 0x1

    .line 458
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 459
    return-void

    .line 461
    :cond_0
    iget-object v0, p0, Lo/brt;->e:Lo/bxk;

    const/4 v1, 0x1

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v2, v1}, Lo/bxk;->d(Z[I)V

    .line 462
    return-void

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method

.method public d(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;Lo/bui;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 605
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/brt$5;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v1 .. v9}, Lo/brt$5;-><init>(Lo/brt;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;Lo/bui;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 620
    return-void
.end method

.method public d(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 343
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    const/4 v0, 0x4

    if-ne v0, p5, :cond_0

    .line 345
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByWeek(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 346
    :cond_0
    const/4 v0, 0x5

    if-ne v0, p5, :cond_1

    .line 347
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByMonth(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 348
    :cond_1
    const/4 v0, 0x6

    if-ne v0, p5, :cond_2

    .line 349
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByYear(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 350
    :cond_2
    const/4 v0, 0x7

    if-ne v0, p5, :cond_3

    .line 351
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByAll(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 353
    :cond_3
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByType timeUnit error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "start:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "-end:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    :goto_0
    return-void
.end method

.method public d(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 335
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 336
    return-void
.end method

.method public d(Lo/buh;)V
    .locals 1

    .line 430
    invoke-static {}, Lo/caa;->a()Lo/caa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/caa;->e(Lo/buh;)V

    .line 431
    return-void
.end method

.method public d(Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Lcom/huawei/health/suggestion/model/PlanRecord;>;)V"
        }
    .end annotation

    .line 767
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 768
    const/4 v0, -0x6

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x6

    invoke-virtual {p1, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 769
    return-void

    .line 772
    :cond_0
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/brt$10;

    invoke-direct {v1, p0, p1}, Lo/brt$10;-><init>(Lo/brt;Lo/bui;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 783
    return-void
.end method

.method public e(DI)I
    .locals 4

    .line 1033
    if-ltz p3, :cond_0

    const/4 v0, 0x3

    if-gt p3, v0, :cond_0

    .line 1034
    invoke-static {p3}, Lo/buf;->c(I)Lfi/firstbeat/coach/CoachRaceType;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lo/btx;->b(DLfi/firstbeat/coach/CoachRaceType;)I

    move-result v0

    return v0

    .line 1036
    :cond_0
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid runType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1037
    const/4 v0, 0x0

    return v0
.end method

.method public e(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 966
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bxb;->e(ILjava/util/List;)V

    .line 967
    return-void
.end method

.method public e(ILo/bui;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Ljava/util/Map;>;)V"
        }
    .end annotation

    .line 657
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bry;->e(ILo/bui;)V

    .line 658
    return-void
.end method

.method public e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 362
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireRecentExerciseRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 363
    return-void
.end method

.method public e(Lcom/huawei/health/suggestion/model/PlanWorkout;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 921
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 922
    return-void

    .line 925
    :cond_0
    invoke-static {p1}, Lo/bsu;->c(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lo/brt;->e(Lcom/huawei/health/suggestion/model/RunWorkout;Ljava/lang/String;Landroid/content/Context;)V

    .line 926
    return-void
.end method

.method public e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 1

    .line 529
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bry;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 530
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 675
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/bry;->b(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 676
    return-void
.end method

.method public e(Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;)V"
        }
    .end annotation

    .line 704
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 705
    const/4 v0, -0x6

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x6

    invoke-virtual {p1, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 706
    return-void

    .line 709
    :cond_0
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/brt$1;

    invoke-direct {v1, p0, p1}, Lo/brt$1;-><init>(Lo/brt;Lo/bui;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 742
    return-void
.end method

.method public e(Lo/cxb;)V
    .locals 0

    .line 230
    return-void
.end method

.method public varargs e([I)V
    .locals 2

    .line 449
    const/4 v1, 0x0

    .line 450
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 451
    return-void

    .line 453
    :cond_0
    iget-object v0, p0, Lo/brt;->e:Lo/bxk;

    invoke-virtual {v0, v1, p1}, Lo/bxk;->d(Z[I)V

    .line 454
    return-void
.end method

.method public e()Z
    .locals 1

    .line 309
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 3

    .line 482
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 483
    return-void

    .line 486
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 487
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 488
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 489
    return-void
.end method

.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lo/brt;->e:Lo/bxk;

    invoke-virtual {v0}, Lo/bxk;->d()V

    .line 239
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/brt;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 240
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 241
    return-void
.end method

.method public finish()V
    .locals 0

    .line 1001
    return-void
.end method

.method public g()V
    .locals 1

    .line 519
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->b()V

    .line 520
    return-void
.end method

.method public h()V
    .locals 1

    .line 566
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->d()V

    .line 567
    return-void
.end method

.method public i()V
    .locals 1

    .line 573
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->i()V

    .line 574
    return-void
.end method

.method public init(Landroid/content/Context;)V
    .locals 4

    .line 251
    if-nez p1, :cond_0

    .line 252
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object p1

    .line 254
    :cond_0
    if-nez p1, :cond_1

    .line 255
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    return-void

    .line 258
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/brx;->d(Landroid/content/Context;)V

    .line 260
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/brt$2;

    invoke-direct {v1, p0}, Lo/brt$2;-><init>(Lo/brt;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 285
    return-void
.end method

.method public k()V
    .locals 1

    .line 512
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->a()V

    .line 513
    return-void
.end method

.method public l()Z
    .locals 1

    .line 585
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 586
    const/4 v0, 0x1

    return v0

    .line 588
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public m()V
    .locals 4

    .line 1005
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/brt$7;

    invoke-direct {v1, p0}, Lo/brt$7;-><init>(Lo/brt;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 1019
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncData() end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1020
    return-void
.end method

.method public n()I
    .locals 1

    .line 1023
    invoke-static {}, Lo/bug;->d()I

    move-result v0

    return v0
.end method

.method public o()V
    .locals 5

    .line 875
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 876
    return-void

    .line 879
    :cond_0
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 880
    if-nez v4, :cond_1

    .line 881
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current plan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    return-void

    .line 884
    :cond_1
    invoke-direct {p0, v4}, Lo/brt;->e(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 885
    return-void
.end method

.method public p()V
    .locals 5

    .line 862
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 863
    return-void

    .line 866
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 867
    if-nez v4, :cond_1

    .line 868
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current plan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    return-void

    .line 871
    :cond_1
    invoke-direct {p0, v4}, Lo/brt;->e(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 872
    return-void
.end method

.method public r()J
    .locals 2

    .line 1051
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method public s()I
    .locals 1

    .line 1042
    invoke-static {}, Lo/bug;->c()I

    move-result v0

    return v0
.end method

.method public setAdapter(Lo/eab;)V
    .locals 2

    .line 290
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/config/MoveService;->c(Landroid/content/Context;I)V

    .line 292
    instance-of v0, p1, Lo/brr;

    if-nez v0, :cond_0

    .line 293
    return-void

    .line 296
    :cond_0
    invoke-super {p0, p1}, Lo/eac;->setAdapter(Lo/eab;)V

    .line 298
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/brt$3;

    invoke-direct {v1, p0}, Lo/brt$3;-><init>(Lo/brt;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 305
    move-object v0, p1

    check-cast v0, Lo/brr;

    invoke-interface {v0}, Lo/brr;->h()V

    .line 306
    return-void
.end method

.method public t()V
    .locals 0

    .line 1070
    invoke-direct {p0}, Lo/brt;->x()V

    .line 1071
    return-void
.end method

.method public u()V
    .locals 4

    .line 1061
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1062
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessDataForStoreDemo isNoCloudVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1063
    return-void

    .line 1065
    :cond_0
    invoke-static {}, Lo/btw;->d()Z

    .line 1066
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->m()V

    .line 1067
    return-void
.end method
