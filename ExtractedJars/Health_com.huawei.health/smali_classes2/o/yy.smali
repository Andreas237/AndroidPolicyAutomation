.class public Lo/yy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:J

.field private static c:Ljava/lang/String;

.field private static volatile d:Lo/yy;


# instance fields
.field private b:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Lcom/huawei/health/suggestion/model/Plan;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

.field private n:Z

.field private o:Z

.field private p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

.field private q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private s:Z

.field private t:I

.field private u:Z

.field private v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private z:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 54
    const-wide/32 v0, 0x5265c00

    sput-wide v0, Lo/yy;->a:J

    .line 56
    const-string v0, "yyyy-MM-dd"

    sput-object v0, Lo/yy;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->b:Z

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->e:Z

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lo/yy;->f:Ljava/lang/String;

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->o:Z

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->l:Z

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->u:Z

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->s:Z

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lo/yy;->t:I

    .line 237
    new-instance v0, Lo/yy$5;

    invoke-direct {v0, p0}, Lo/yy$5;-><init>(Lo/yy;)V

    iput-object v0, p0, Lo/yy;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 258
    new-instance v0, Lo/yy$1;

    invoke-direct {v0, p0}, Lo/yy$1;-><init>(Lo/yy;)V

    iput-object v0, p0, Lo/yy;->y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 308
    new-instance v0, Lo/yy$3;

    invoke-direct {v0, p0}, Lo/yy$3;-><init>(Lo/yy;)V

    iput-object v0, p0, Lo/yy;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 481
    new-instance v0, Lo/yy$9;

    invoke-direct {v0, p0}, Lo/yy$9;-><init>(Lo/yy;)V

    iput-object v0, p0, Lo/yy;->w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 540
    new-instance v0, Lo/yy$6;

    invoke-direct {v0, p0}, Lo/yy$6;-><init>(Lo/yy;)V

    iput-object v0, p0, Lo/yy;->z:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 226
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new HWExerciseAdviceManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return-void
.end method

.method static synthetic a(Lo/yy;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method static synthetic a(Lo/yy;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 50
    iput-object p1, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method

.method private a(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/exercise/modle/RunPlanStruct;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 736
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 737
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/exercise/modle/RunPlanStruct;

    .line 738
    invoke-virtual {v3}, Lcom/huawei/exercise/modle/RunPlanStruct;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 739
    goto :goto_0

    .line 741
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dep;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/yy;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Lo/yy;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/yy;Lorg/json/JSONObject;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/yy;->b(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic b(Lo/yy;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/yy;->y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public static b()Lo/yy;
    .locals 3

    .line 86
    sget-object v0, Lo/yy;->d:Lo/yy;

    if-nez v0, :cond_1

    .line 87
    const-class v1, Lo/yy;

    monitor-enter v1

    .line 88
    :try_start_0
    sget-object v0, Lo/yy;->d:Lo/yy;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Lo/yy;

    invoke-direct {v0}, Lo/yy;-><init>()V

    sput-object v0, Lo/yy;->d:Lo/yy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 93
    :cond_1
    :goto_0
    sget-object v0, Lo/yy;->d:Lo/yy;

    return-object v0
.end method

.method private b(Lcom/huawei/exercise/modle/RunPlanInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 565
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPlan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    const-string v0, "runPlanInfo"

    invoke-direct {p0, v0, p1}, Lo/yy;->c(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    .line 567
    if-eqz v4, :cond_0

    .line 569
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 570
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    invoke-interface {v0, v4, p2}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->pushFitnessPlan(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 573
    :cond_0
    return-void
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 5

    .line 785
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 787
    const-string v0, "isSupportExerciseAdvice"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 788
    const-string v0, "isSupportExerciseAdvice"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/yy;->b:Z

    .line 790
    :cond_0
    const-string v0, "isSupportWorkoutExerciseDisplayLink"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 791
    const-string v0, "isSupportWorkoutExerciseDisplayLink"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/yy;->e:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 795
    :cond_1
    goto :goto_0

    .line 793
    :catch_0
    move-exception v4

    .line 794
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "capability "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    goto :goto_0

    .line 797
    :cond_2
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 800
    :goto_0
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get Device Support runplan Capacity, capacity="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/yy;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mIsSupportDisplayLink="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/yy;->e:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 802
    return-void
.end method

.method private b(JLcom/huawei/exercise/modle/RunPlanParameter;)Z
    .locals 15

    .line 716
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 717
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 718
    new-instance v7, Ljava/text/SimpleDateFormat;

    sget-object v0, Lo/yy;->c:Ljava/lang/String;

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 719
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 720
    sget-object v0, Lo/yy;->c:Ljava/lang/String;

    invoke-direct {p0, v8, v0}, Lo/yy;->d(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v9

    .line 721
    move-wide/from16 v11, p1

    .line 722
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check time today="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",checktime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 724
    if-eqz p3, :cond_0

    .line 725
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_pre()I

    move-result v13

    .line 726
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_sub()I

    move-result v14

    .line 727
    sget-wide v0, Lo/yy;->a:J

    int-to-long v2, v13

    mul-long/2addr v0, v2

    sub-long v0, v9, v0

    cmp-long v0, v0, v11

    if-gtz v0, :cond_0

    sget-wide v0, Lo/yy;->a:J

    int-to-long v2, v14

    mul-long/2addr v0, v2

    add-long/2addr v0, v9

    cmp-long v0, v0, v11

    if-lez v0, :cond_0

    .line 728
    const/4 v0, 0x1

    return v0

    .line 731
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private c(Ljava/util/List;Lcom/huawei/exercise/modle/RunPlanParameter;)Lcom/huawei/exercise/modle/RunPlanInfo;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;>;Lcom/huawei/exercise/modle/RunPlanParameter;)Lcom/huawei/exercise/modle/RunPlanInfo;"
        }
    .end annotation

    .line 611
    new-instance v4, Lcom/huawei/exercise/modle/RunPlanInfo;

    invoke-direct {v4}, Lcom/huawei/exercise/modle/RunPlanInfo;-><init>()V

    .line 612
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRun_plan_total_sign(Ljava/lang/String;)V

    .line 613
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 614
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/yy;->c:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/yy;->d(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRun_plan_start_date(J)V

    .line 615
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_6

    .line 616
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->getDate()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lo/yy;->b(JLcom/huawei/exercise/modle/RunPlanParameter;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 617
    new-instance v7, Lcom/huawei/exercise/modle/RunPlanStruct;

    invoke-direct {v7}, Lcom/huawei/exercise/modle/RunPlanStruct;-><init>()V

    .line 618
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->getRunWorkout()Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 619
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->getRunWorkout()Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v8

    .line 621
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workout name ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-virtual {v3}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->getWorkoutName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",workout id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->getWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_name(Ljava/lang/String;)V

    .line 623
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_workout_id(I)V

    .line 624
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getTrainingEffect()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_train_effect(I)V

    .line 625
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRepeats()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_repeats(I)V

    .line 626
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v7, v0}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_distance(I)V

    .line 627
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/yy;->c:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/yy;->d(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_date(J)V

    .line 628
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 629
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 630
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v10

    .line 631
    new-instance v11, Lcom/huawei/exercise/modle/TrainingStruct;

    invoke-direct {v11}, Lcom/huawei/exercise/modle/TrainingStruct;-><init>()V

    .line 632
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_duration(I)V

    .line 633
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_high(I)V

    .line 634
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_low(I)V

    .line 635
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_high(I)V

    .line 636
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_low(I)V

    .line 637
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_high(I)V

    .line 638
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_low(I)V

    .line 639
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_type(I)V

    .line 640
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 642
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 643
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v10

    .line 644
    new-instance v11, Lcom/huawei/exercise/modle/TrainingStruct;

    invoke-direct {v11}, Lcom/huawei/exercise/modle/TrainingStruct;-><init>()V

    .line 645
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_duration(I)V

    .line 646
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_high(I)V

    .line 647
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_low(I)V

    .line 648
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_high(I)V

    .line 649
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_low(I)V

    .line 650
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_high(I)V

    .line 651
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_low(I)V

    .line 652
    const/4 v0, 0x2

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_type(I)V

    .line 653
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 655
    :cond_1
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 656
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v10

    .line 657
    new-instance v11, Lcom/huawei/exercise/modle/TrainingStruct;

    invoke-direct {v11}, Lcom/huawei/exercise/modle/TrainingStruct;-><init>()V

    .line 658
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_duration(I)V

    .line 659
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_high(I)V

    .line 660
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_low(I)V

    .line 661
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_high(I)V

    .line 662
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_low(I)V

    .line 663
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_high(I)V

    .line 664
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_low(I)V

    .line 665
    const/4 v0, 0x3

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_type(I)V

    .line 666
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 668
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 669
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v10

    .line 670
    new-instance v11, Lcom/huawei/exercise/modle/TrainingStruct;

    invoke-direct {v11}, Lcom/huawei/exercise/modle/TrainingStruct;-><init>()V

    .line 671
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_duration(I)V

    .line 672
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_high(I)V

    .line 673
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_hr_limit_low(I)V

    .line 674
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_high(I)V

    .line 675
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_intensity_limit_low(I)V

    .line 676
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_high(I)V

    .line 677
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_speed_limit_low(I)V

    .line 678
    const/4 v0, 0x4

    invoke-virtual {v11, v0}, Lcom/huawei/exercise/modle/TrainingStruct;->setTraining_type(I)V

    .line 679
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 681
    :cond_3
    invoke-virtual {v7, v9}, Lcom/huawei/exercise/modle/RunPlanStruct;->setTrainingStructList(Ljava/util/List;)V

    .line 682
    goto :goto_1

    .line 683
    :cond_4
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->getWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_name(Ljava/lang/String;)V

    .line 684
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->getDate()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_date(J)V

    .line 686
    :goto_1
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 615
    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 692
    :cond_6
    invoke-direct {p0, v5}, Lo/yy;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/yy;->f:Ljava/lang/String;

    .line 693
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======advice======plan sha=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/yy;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    iget-object v0, p0, Lo/yy;->f:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRun_plan_sign(Ljava/lang/String;)V

    .line 696
    invoke-virtual {v4, v5}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRunPlanStructList(Ljava/util/List;)V

    .line 698
    return-object v4
.end method

.method static synthetic c(Lo/yy;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 50
    iput-object p1, p0, Lo/yy;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lo/yy;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 50
    iput-object p1, p0, Lo/yy;->i:Ljava/util/List;

    return-object p1
.end method

.method private c(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 6

    .line 805
    const/4 v4, 0x0

    .line 807
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    move-object v4, v0

    .line 808
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 811
    goto :goto_0

    .line 809
    :catch_0
    move-exception v5

    .line 810
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "toJsonObject error="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 812
    :goto_0
    return-object v4
.end method

.method static synthetic c(Lo/yy;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lo/yy;->b:Z

    return v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)J
    .locals 5

    .line 704
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 705
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-direct {v4, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 706
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 710
    :cond_0
    goto :goto_0

    .line 708
    :catch_0
    move-exception v4

    .line 709
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SimpleDateFormat parse error: e= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private d(Ljava/util/List;)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;)Ljava/util/List<Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;>;"
        }
    .end annotation

    .line 576
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 577
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 578
    const/4 v0, 0x0

    return-object v0

    .line 580
    :cond_0
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/yy;->c:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/yy;->d(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v5

    .line 581
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/yy;->c:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/yy;->d(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v7

    .line 582
    iget-object v0, p0, Lo/yy;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    .line 583
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "starttime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",endtime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",workoutcount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_4

    .line 585
    iget-object v0, p0, Lo/yy;->h:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 586
    new-instance v12, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;

    invoke-direct {v12}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;-><init>()V

    .line 587
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 588
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planworkout get workoutid = null, workout name="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    invoke-virtual {v12, v5, v6}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->setDate(J)V

    .line 590
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->setRunWorkout(Lcom/huawei/health/suggestion/model/RunWorkout;)V

    .line 591
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->setWorkoutName(Ljava/lang/String;)V

    .line 592
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 594
    :cond_1
    const/4 v13, 0x0

    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_3

    .line 595
    move-object/from16 v0, p1

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 596
    invoke-virtual {v14}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 597
    invoke-virtual {v12, v5, v6}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->setDate(J)V

    .line 598
    invoke-virtual {v12, v14}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->setRunWorkout(Lcom/huawei/health/suggestion/model/RunWorkout;)V

    .line 599
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->setWorkoutName(Ljava/lang/String;)V

    .line 600
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 594
    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 604
    :cond_3
    :goto_2
    sget-wide v0, Lo/yy;->a:J

    add-long/2addr v5, v0

    .line 584
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 606
    :cond_4
    return-object v4
.end method

.method static synthetic d(Lo/yy;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 50
    iput-object p1, p0, Lo/yy;->h:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lo/yy;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lo/yy;->n:Z

    return v0
.end method

.method static synthetic d(Lo/yy;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lo/yy;->n:Z

    return p1
.end method

.method static synthetic e(Lo/yy;)Lcom/huawei/exercise/modle/IExerciseAdviceCallback;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    return-object v0
.end method

.method static synthetic e(Lo/yy;Ljava/util/List;Lcom/huawei/exercise/modle/RunPlanParameter;)Lcom/huawei/exercise/modle/RunPlanInfo;
    .locals 1

    .line 50
    invoke-direct {p0, p1, p2}, Lo/yy;->c(Ljava/util/List;Lcom/huawei/exercise/modle/RunPlanParameter;)Lcom/huawei/exercise/modle/RunPlanInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/yy;Lcom/huawei/exercise/modle/RunPlanInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lo/yy;->b(Lcom/huawei/exercise/modle/RunPlanInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic f(Lo/yy;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/yy;->w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private g()I
    .locals 3

    .line 553
    const/4 v2, 0x0

    .line 554
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 555
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    invoke-interface {v0}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 557
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 558
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    return v0

    .line 560
    :cond_1
    const/4 v0, 0x3

    return v0
.end method

.method static synthetic g(Lo/yy;)Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/yy;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lo/yy;)Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/yy;->k:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 279
    iget-boolean v0, p0, Lo/yy;->b:Z

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 281
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    iget-object v1, p0, Lo/yy;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->getDeviceFitnessPlanParamter(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 282
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRunPlanParameter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 208
    iput p1, p0, Lo/yy;->t:I

    .line 209
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 104
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setRunPlanETEReport="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 107
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-static {v0, v1}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    iput-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    .line 108
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/yy;->l:Z

    .line 109
    iget-boolean v0, p0, Lo/yy;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/yy;->e:Z

    if-nez v0, :cond_0

    .line 110
    iget v0, p0, Lo/yy;->t:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 113
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbl;->b(Lo/ceu;)I

    .line 114
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/yy;->s:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :cond_0
    goto :goto_0

    .line 117
    :catch_0
    move-exception v4

    .line 118
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setETERport error="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 4

    .line 216
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLinkStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iput-boolean p1, p0, Lo/yy;->u:Z

    .line 218
    iget-boolean v0, p0, Lo/yy;->u:Z

    if-eqz v0, :cond_0

    .line 219
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/yy;->o:Z

    goto :goto_0

    .line 221
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->o:Z

    .line 223
    :goto_0
    return-void
.end method

.method public c()V
    .locals 1

    .line 288
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->l:Z

    .line 289
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->s:Z

    .line 290
    const/4 v0, 0x0

    iput-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    .line 291
    return-void
.end method

.method public d(Lcom/huawei/exercise/modle/RunPlanParameter;)V
    .locals 5

    .line 392
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog newExercisePlan mDeviceSupportCapacity:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/yy;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    iget-boolean v0, p0, Lo/yy;->b:Z

    if-eqz v0, :cond_0

    .line 395
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v4

    .line 396
    new-instance v0, Lo/yy$2;

    invoke-direct {v0, p0, v4, p1}, Lo/yy$2;-><init>(Lo/yy;Lo/brt;Lcom/huawei/exercise/modle/RunPlanParameter;)V

    invoke-virtual {v4, v0}, Lo/brt;->e(Lo/bui;)V

    .line 454
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 325
    iget-boolean v0, p0, Lo/yy;->b:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/yy;->e:Z

    if-nez v0, :cond_1

    .line 326
    invoke-direct {p0}, Lo/yy;->g()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 327
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 328
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    new-instance v1, Lo/yy$4;

    invoke-direct {v1, p0, p1}, Lo/yy$4;-><init>(Lo/yy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->getDeviceETEState(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 345
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 348
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 350
    :cond_2
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 144
    iget-boolean v0, p0, Lo/yy;->s:Z

    return v0
.end method

.method public e()V
    .locals 2

    .line 231
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 232
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    iget-object v1, p0, Lo/yy;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->registerServiceConnectedListener(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 234
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/exercise/modle/IExerciseAdviceCallback;)V
    .locals 4

    .line 98
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerExerciseAdviceCallback enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iput-object p1, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    .line 100
    invoke-virtual {p0}, Lo/yy;->e()V

    .line 101
    return-void
.end method

.method public e(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;I)V
    .locals 8

    .line 162
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v5

    .line 163
    if-eqz v5, :cond_0

    .line 164
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDateToSuggestion trackType is abnormal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-void

    .line 167
    :cond_0
    new-instance v6, Lcom/huawei/health/suggestion/model/Summary;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/Summary;-><init>()V

    .line 168
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/yy;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 169
    :cond_1
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveToSuggestion current is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    return-void

    .line 172
    :cond_2
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setPlanId(Ljava/lang/String;)V

    .line 173
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "begin to save suggestion, workout id ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/yy;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 175
    iget-object v0, p0, Lo/yy;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ne p2, v0, :cond_3

    .line 176
    iget-object v0, p0, Lo/yy;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setTargetDistance(I)V

    .line 177
    iget-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutName(Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Lo/yy;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutDate(Ljava/lang/String;)V

    .line 179
    iget-object v0, p0, Lo/yy;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutId(Ljava/lang/String;)V

    .line 180
    goto :goto_1

    .line 174
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 184
    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setSportId(Ljava/lang/String;)V

    .line 185
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setCalorie(F)V

    .line 187
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setBestPace(I)V

    .line 188
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setDistance(F)V

    .line 189
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setDuring(I)V

    .line 190
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setStartTime(J)V

    .line 191
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setEndTime(J)V

    .line 192
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setExerciseTime(J)V

    .line 193
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "load_peak"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setTrainingLoadPeak(I)V

    .line 194
    const/4 v0, -0x1

    if-eq v0, p2, :cond_5

    .line 195
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "achieve_percent"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setFinishRate(I)V

    .line 197
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "max_met"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setMaxMet(I)V

    .line 199
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquirePlanId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", workoutid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", targetDistance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireTargetDistance()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", sportId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireSportId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", calorie="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 200
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireCalorie()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", bestpace="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireBestPace()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",distance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireDistance()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", during="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireDuring()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", startTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquiretStartTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", endtime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 201
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireEndTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", exerciseTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireExerciseTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", name="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", data="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", LoadPeak="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 202
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acuqireTrainingLoadPeak()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", FinishRate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acuqireFinishRate()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", MaxMet="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->acquireMaxMet()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 199
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/brt;->b(Lcom/huawei/health/suggestion/model/Summary;)V

    .line 204
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDateToSuggestion finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 213
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 6

    .line 123
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setWorkoutETEReport="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    :try_start_0
    new-instance v0, Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-direct {v0}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;-><init>()V

    iput-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    .line 126
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 127
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;

    invoke-static {v0, v1}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;

    .line 128
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_record_id()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_id(I)V

    .line 129
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_record_status()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_status(I)V

    .line 130
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_load_peak()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_load_peak(I)V

    .line 131
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_etraining_effect()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_etraining_effect(I)V

    .line 132
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_anaerobic_exercise_etraining_effect()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_anaerobic_exercise_etraining_effect(I)V

    .line 133
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_Epoc()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_Epoc(I)V

    .line 134
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_maxMET()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_maxMET(I)V

    .line 135
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/WorkoutRecordStatistic;->getWorkout_recovery_time()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_recovery_time(I)V

    .line 136
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->setRun_plan_record_info_achieve_percent(I)V

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/yy;->l:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    goto :goto_0

    .line 138
    :catch_0
    move-exception v4

    .line 139
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setETERport error="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 9

    .line 506
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPlanReminder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/brt;->d(Ljava/lang/String;)I

    move-result v4

    .line 508
    const/4 v0, -0x1

    if-ne v0, v4, :cond_1

    .line 509
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRemindTime time is -1 error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    new-instance v5, Lcom/huawei/exercise/modle/RunPlanReminder;

    invoke-direct {v5}, Lcom/huawei/exercise/modle/RunPlanReminder;-><init>()V

    .line 511
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/exercise/modle/RunPlanReminder;->setRun_plan_reminder_switch(I)V

    .line 512
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/exercise/modle/RunPlanReminder;->setRun_plan_reminder_time_hour(I)V

    .line 513
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/exercise/modle/RunPlanReminder;->setRun_plan_reminder_time_minute(I)V

    .line 514
    const-string v0, "runPlanReminder"

    invoke-direct {p0, v0, v5}, Lo/yy;->c(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v6

    .line 515
    if-eqz v6, :cond_0

    .line 517
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 518
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    iget-object v1, p0, Lo/yy;->z:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v6, v1}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->setRunPlanReminderSwitch(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 521
    :cond_0
    goto :goto_0

    .line 522
    :cond_1
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setRunPlanReminder reminderTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    div-int/lit8 v5, v4, 0x3c

    .line 524
    rem-int/lit8 v6, v4, 0x3c

    .line 525
    new-instance v7, Lcom/huawei/exercise/modle/RunPlanReminder;

    invoke-direct {v7}, Lcom/huawei/exercise/modle/RunPlanReminder;-><init>()V

    .line 526
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/exercise/modle/RunPlanReminder;->setRun_plan_reminder_switch(I)V

    .line 527
    invoke-virtual {v7, v5}, Lcom/huawei/exercise/modle/RunPlanReminder;->setRun_plan_reminder_time_hour(I)V

    .line 528
    invoke-virtual {v7, v6}, Lcom/huawei/exercise/modle/RunPlanReminder;->setRun_plan_reminder_time_minute(I)V

    .line 529
    const-string v0, "runPlanReminder"

    invoke-direct {p0, v0, v7}, Lo/yy;->c(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v8

    .line 530
    if-eqz v8, :cond_2

    .line 532
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 533
    iget-object v0, p0, Lo/yy;->p:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    iget-object v1, p0, Lo/yy;->z:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v8, v1}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->setRunPlanReminderSwitch(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 537
    :cond_2
    :goto_0
    return-void
.end method

.method public f()V
    .locals 1

    .line 498
    iget-boolean v0, p0, Lo/yy;->b:Z

    if-eqz v0, :cond_0

    .line 499
    iget-object v0, p0, Lo/yy;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/yy;->e(Ljava/lang/String;)V

    .line 501
    :cond_0
    return-void
.end method

.method public h()V
    .locals 7

    .line 458
    new-instance v4, Lcom/huawei/exercise/modle/RunPlanInfo;

    invoke-direct {v4}, Lcom/huawei/exercise/modle/RunPlanInfo;-><init>()V

    .line 459
    const-string v0, "00000000000000000000000000000000"

    iput-object v0, p0, Lo/yy;->f:Ljava/lang/String;

    .line 460
    iget-object v0, p0, Lo/yy;->f:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRun_plan_total_sign(Ljava/lang/String;)V

    .line 461
    iget-object v0, p0, Lo/yy;->f:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRun_plan_sign(Ljava/lang/String;)V

    .line 462
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRun_plan_start_date(J)V

    .line 463
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 464
    new-instance v6, Lcom/huawei/exercise/modle/RunPlanStruct;

    invoke-direct {v6}, Lcom/huawei/exercise/modle/RunPlanStruct;-><init>()V

    .line 465
    const-string v0, "finish"

    invoke-virtual {v6, v0}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_name(Ljava/lang/String;)V

    .line 466
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/exercise/modle/RunPlanStruct;->setRun_plan_date(J)V

    .line 467
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 468
    invoke-virtual {v4, v5}, Lcom/huawei/exercise/modle/RunPlanInfo;->setRunPlanStructList(Ljava/util/List;)V

    .line 469
    const/4 v0, 0x0

    iput-object v0, p0, Lo/yy;->g:Lcom/huawei/health/suggestion/model/Plan;

    .line 470
    const/4 v0, 0x0

    iput-object v0, p0, Lo/yy;->i:Ljava/util/List;

    .line 475
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHA value is not same"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    iget-object v0, p0, Lo/yy;->w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0, v4, v0}, Lo/yy;->b(Lcom/huawei/exercise/modle/RunPlanInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 478
    return-void
.end method

.method public i()Lcom/huawei/exercise/modle/RunPlanRecordInfo;
    .locals 6

    .line 353
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceRunPlanETEResult capacity="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/yy;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", ETEUSing state="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/yy;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget-boolean v0, p0, Lo/yy;->b:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lo/yy;->g()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 355
    iget-boolean v0, p0, Lo/yy;->o:Z

    if-eqz v0, :cond_4

    .line 357
    const/4 v4, 0x0

    .line 358
    :goto_0
    const/16 v0, 0xbb8

    if-ge v4, v0, :cond_3

    .line 359
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceRunPlanETEResult checktime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-boolean v0, p0, Lo/yy;->l:Z

    if-eqz v0, :cond_1

    .line 361
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceRunPlanETEResult return runplan record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    iget-object v0, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 363
    iget-object v0, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 365
    :cond_0
    iget-object v0, p0, Lo/yy;->m:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    return-object v0

    .line 368
    :cond_1
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 375
    goto :goto_1

    .line 369
    :catch_0
    move-exception v5

    .line 370
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceRunPlanETEResult exception e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 372
    iget-object v0, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 374
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 376
    :goto_1
    add-int/lit16 v4, v4, 0x1f4

    goto/16 :goto_0

    .line 379
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yy;->o:Z

    .line 382
    :cond_4
    iget-object v0, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 383
    iget-object v0, p0, Lo/yy;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 385
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public k()V
    .locals 0

    .line 388
    invoke-virtual {p0}, Lo/yy;->a()V

    .line 389
    return-void
.end method
