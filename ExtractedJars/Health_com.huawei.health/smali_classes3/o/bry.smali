.class public Lo/bry;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lo/bry;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 602
    const/4 v1, 0x0

    .line 603
    if-eqz p0, :cond_0

    .line 604
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    .line 605
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 606
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    .line 609
    :cond_0
    return-object v1
.end method

.method public static e()Lo/bry;
    .locals 4

    .line 52
    sget-object v0, Lo/bry;->d:Lo/bry;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 53
    const-class v2, Lo/brt;

    monitor-enter v2

    .line 54
    :try_start_0
    sget-object v0, Lo/bry;->d:Lo/bry;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 55
    new-instance v0, Lo/bry;

    invoke-direct {v0}, Lo/bry;-><init>()V

    sput-object v0, Lo/bry;->d:Lo/bry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 59
    :cond_1
    :goto_0
    sget-object v0, Lo/bry;->d:Lo/bry;

    return-object v0
.end method

.method private e(I)V
    .locals 2

    .line 475
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/bry$2;

    invoke-direct {v1, p0, p1}, Lo/bry$2;-><init>(Lo/bry;I)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 492
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/OperationPage;)V
    .locals 4

    .line 629
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 630
    const-string v0, "entrance"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pageType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquirePageType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_position:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquirePosition()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    const-string v0, "position"

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    const-string v0, "1130015"

    invoke-static {v0, v3}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 633
    return-void
.end method

.method private f()V
    .locals 2

    .line 495
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/bry$5;

    invoke-direct {v1, p0}, Lo/bry$5;-><init>(Lo/bry;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 513
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 147
    new-instance v2, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-direct {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;-><init>()V

    .line 148
    const-string v0, "R002"

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveId(Ljava/lang/String;)V

    .line 149
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_motiontrack_stretch_after_run:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveName(Ljava/lang/String;)V

    .line 150
    invoke-virtual {p0, v2}, Lo/bry;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 151
    return-void
.end method

.method public a(Lcom/huawei/health/suggestion/model/OperationPage;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 6

    .line 237
    invoke-virtual {p0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 238
    return-void

    .line 240
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/bzm;->c(Ljava/lang/String;)V

    .line 242
    new-instance v3, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    new-instance v4, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 244
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 245
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 246
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 247
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 248
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 249
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 250
    new-instance v5, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 251
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 252
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    const-string v0, "workoutrecord"

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 254
    const-string v0, "entrance"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pageType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquirePageType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_position:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquirePosition()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 256
    invoke-direct {p0, p1}, Lo/bry;->e(Lcom/huawei/health/suggestion/model/OperationPage;)V

    .line 257
    return-void
.end method

.method public b()V
    .locals 5

    .line 127
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    return-void

    .line 130
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 131
    new-instance v3, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 132
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 133
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 134
    const-string v0, "R002"

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 135
    const-string v0, ""

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 136
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_motiontrack_stretch_after_run:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 137
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 139
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 140
    const-string v0, "workoutrecord"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 141
    const-string v0, "isafterrun"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 142
    const-string v0, "entrance"

    const-string v1, "FitnessCourse_\u8f68\u8ff9"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 144
    return-void
.end method

.method public b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 5

    .line 192
    invoke-virtual {p0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 193
    return-void

    .line 195
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/bzm;->c(Ljava/lang/String;)V

    .line 197
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 198
    new-instance v3, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 199
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 200
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 201
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 203
    const-string v0, ""

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 204
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 205
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 206
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 207
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 208
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    const-string v0, "workoutrecord"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 210
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 211
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 181
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 182
    return-void

    .line 185
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 186
    const-string v0, "entrance"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 187
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 188
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 189
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 260
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 261
    const/4 v0, -0x6

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x6

    invoke-virtual {p3, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 262
    return-void

    .line 265
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 266
    return-void
.end method

.method public c(I)V
    .locals 2

    .line 362
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/bry$3;

    invoke-direct {v1, p0, p1}, Lo/bry$3;-><init>(Lo/bry;I)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 379
    return-void
.end method

.method public c(ILo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Ljava/util/Map;>;)V"
        }
    .end annotation

    .line 338
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/bry$1;

    invoke-direct {v1, p0, p1, p2}, Lo/bry$1;-><init>(Lo/bry;ILo/bui;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 359
    return-void
.end method

.method public c()Z
    .locals 7

    .line 68
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 69
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521d\u59cb\u5316\u9519\u8bef\uff0c\u8bf7\u5148\u8c03\u7528init\u65b9\u6cd5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const/4 v0, 0x0

    return v0

    .line 73
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v4

    .line 75
    instance-of v0, v4, Lo/brr;

    if-nez v0, :cond_1

    .line 76
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521d\u59cb\u5316\u9519\u8bef\uff0c\u8bf7\u5148\u8c03\u7528setAdapter\u65b9\u6cd5,\u5e76\u4f20\u5165PluginSuggestionAdapter\u7c7b\u578b\u7684adapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_1
    move-object v5, v4

    check-cast v5, Lo/brr;

    .line 81
    invoke-interface {v5}, Lo/brr;->d()Lo/brs;

    move-result-object v6

    .line 82
    if-nez v6, :cond_2

    .line 83
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521d\u59cb\u5316\u9519\u8bef\uff0csetAdapter\u65b9\u6cd5\u7684\u53c2\u6570PluginSuggestionAdapter\u7684getAccountInfoAdapter()\u65b9\u6cd5\u8fd4\u56denull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_2
    invoke-interface {v5}, Lo/brr;->a()Lo/brw;

    move-result-object v0

    if-nez v0, :cond_3

    .line 88
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521d\u59cb\u5316\u9519\u8bef\uff0csetAdapter\u65b9\u6cd5\u7684\u53c2\u6570PluginSuggestionAdapter\u7684getUserinfoAdapter()\u65b9\u6cd5\u8fd4\u56denull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const/4 v0, 0x0

    return v0

    .line 92
    :cond_3
    invoke-interface {v5}, Lo/brr;->e()Lo/brv;

    move-result-object v0

    if-nez v0, :cond_4

    .line 93
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521d\u59cb\u5316\u9519\u8bef\uff0csetAdapter\u65b9\u6cd5\u7684\u53c2\u6570PluginSuggestionAdapter\u7684getRunAdapter()\u65b9\u6cd5\u8fd4\u56denull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_4
    invoke-interface {v6}, Lo/brs;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 98
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521d\u59cb\u5316\u9519\u8bef\uff0csetAdapter\u65b9\u6cd5\u7684\u53c2\u6570PluginSuggestionAdapter\u7684getAccountInfoAdapter().getHuid\u65b9\u6cd5\u8fd4\u56dehuid\u4e3anull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    return v0

    .line 102
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 382
    invoke-virtual {p0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 383
    const/4 v0, 0x0

    return-object v0

    .line 385
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p3, p1, p1}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 386
    if-nez v4, :cond_1

    .line 387
    const/4 v0, 0x0

    return-object v0

    .line 389
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 390
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 391
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 392
    goto :goto_0

    .line 393
    :cond_2
    const/4 v6, 0x0

    .line 394
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 396
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 397
    add-int/lit8 v6, v6, 0x1

    .line 399
    :cond_3
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "records : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    goto :goto_1

    .line 402
    :cond_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lt v6, v0, :cond_5

    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    move v0, v6

    :goto_2
    move v6, v0

    .line 403
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workoutOrder: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 405
    move v8, v6

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_6

    .line 406
    new-instance v9, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-direct {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;-><init>()V

    .line 407
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveId(Ljava/lang/String;)V

    .line 408
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveVersion(Ljava/lang/String;)V

    .line 409
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveName(Ljava/lang/String;)V

    .line 410
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->getSinglesCount()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveDifficulty(I)V

    .line 411
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveDescription(Ljava/lang/String;)V

    .line 412
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->acquireOrder()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveDuration(I)V

    .line 413
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 405
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_3

    .line 415
    :cond_6
    return-object v7
.end method

.method public d()V
    .locals 3

    .line 154
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    return-void

    .line 158
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 159
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 160
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 161
    return-void
.end method

.method public d(Ljava/util/List;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 419
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    return-void

    .line 423
    :cond_0
    invoke-static {p2}, Lo/bry;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bzm;->c(Ljava/lang/String;)V

    .line 425
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 426
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 427
    new-instance v5, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 428
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 429
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 430
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 431
    invoke-virtual {v5, p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 432
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWeekNum(I)V

    .line 433
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutOrder(I)V

    .line 434
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutDate(Ljava/lang/String;)V

    .line 435
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 436
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    goto :goto_0

    .line 438
    :cond_1
    new-instance v3, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 439
    const/high16 v0, 0x10000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 440
    const-string v0, "workoutrecord"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 441
    const-string v0, "ISPLANFIT"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 442
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 443
    return-void
.end method

.method public e(ILo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Ljava/util/Map;>;)V"
        }
    .end annotation

    .line 314
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/bry$4;

    invoke-direct {v1, p0, p1, p2}, Lo/bry$4;-><init>(Lo/bry;ILo/bui;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 335
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 5

    .line 106
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    return-void

    .line 110
    :cond_0
    const-string v0, "isshowbutton"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 111
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    new-instance v3, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 113
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 114
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 115
    const-string v0, "R001"

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 116
    const-string v0, "\u8dd1\u524d\u70ed\u8eab"

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 117
    const-string v0, ""

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 120
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 121
    const-string v0, "workoutrecord"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 122
    const-string v0, "bundlekey"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 123
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 124
    return-void
.end method

.method public i()V
    .locals 3

    .line 164
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0}, Lo/bry;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    return-void

    .line 168
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 169
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 170
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 173
    invoke-direct {p0}, Lo/bry;->f()V

    .line 174
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/bry;->e(I)V

    .line 175
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bry;->c(I)V

    .line 178
    return-void
.end method
