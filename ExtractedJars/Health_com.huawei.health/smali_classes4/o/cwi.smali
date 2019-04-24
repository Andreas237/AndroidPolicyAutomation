.class public Lo/cwi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cwi$b;
    }
.end annotation


# static fields
.field private static volatile e:Lo/cwi;


# instance fields
.field private a:Landroid/os/Handler;

.field private final b:Ljava/lang/String;

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cwi$b;>;"
        }
    .end annotation
.end field

.field private f:Lcom/huawei/login/ui/login/LoginInit;

.field private g:Lcom/huawei/health/suggestion/model/RunWorkout;

.field private h:Lo/brq;

.field private i:Lo/brs;

.field private k:Lo/brv;

.field private l:Lo/dnm;

.field private m:Ljava/lang/String;

.field private n:Lo/bru;

.field private o:Lcom/huawei/health/suggestion/model/RunWorkout;

.field private p:Lcom/huawei/health/suggestion/model/Summary;

.field private q:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

.field private r:I

.field private s:Z

.field private t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:Lo/yy;

.field private v:Landroid/view/View$OnClickListener;

.field private z:Landroid/view/View$OnClickListener;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    const-string v0, "PluginSuggestionAdapterImpl"

    iput-object v0, p0, Lo/cwi;->b:Ljava/lang/String;

    .line 106
    new-instance v0, Lcom/huawei/health/suggestion/model/Summary;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/Summary;-><init>()V

    iput-object v0, p0, Lo/cwi;->p:Lcom/huawei/health/suggestion/model/Summary;

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cwi;->s:Z

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lo/cwi;->r:I

    .line 115
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    iput-object v0, p0, Lo/cwi;->u:Lo/yy;

    .line 174
    new-instance v0, Lo/cwi$4;

    invoke-direct {v0, p0}, Lo/cwi$4;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 236
    new-instance v0, Lo/cwi$6;

    invoke-direct {v0, p0}, Lo/cwi$6;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->v:Landroid/view/View$OnClickListener;

    .line 244
    new-instance v0, Lo/cwi$7;

    invoke-direct {v0, p0}, Lo/cwi$7;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->z:Landroid/view/View$OnClickListener;

    .line 118
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    const-string v0, "PluginSuggestionAdapterImpl"

    iput-object v0, p0, Lo/cwi;->b:Ljava/lang/String;

    .line 106
    new-instance v0, Lcom/huawei/health/suggestion/model/Summary;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/Summary;-><init>()V

    iput-object v0, p0, Lo/cwi;->p:Lcom/huawei/health/suggestion/model/Summary;

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cwi;->s:Z

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lo/cwi;->r:I

    .line 115
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    iput-object v0, p0, Lo/cwi;->u:Lo/yy;

    .line 174
    new-instance v0, Lo/cwi$4;

    invoke-direct {v0, p0}, Lo/cwi$4;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 236
    new-instance v0, Lo/cwi$6;

    invoke-direct {v0, p0}, Lo/cwi$6;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->v:Landroid/view/View$OnClickListener;

    .line 244
    new-instance v0, Lo/cwi$7;

    invoke-direct {v0, p0}, Lo/cwi$7;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->z:Landroid/view/View$OnClickListener;

    .line 121
    if-nez p1, :cond_0

    .line 122
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object p1

    .line 124
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cwi;->c:Landroid/content/Context;

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cwi;->d:Ljava/util/List;

    .line 126
    iget-object v0, p0, Lo/cwi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iput-object v0, p0, Lo/cwi;->l:Lo/dnm;

    .line 127
    new-instance v0, Lo/cwi$5;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cwi$5;-><init>(Lo/cwi;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cwi;->a:Landroid/os/Handler;

    .line 170
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    iget-object v1, p0, Lo/cwi;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/yy;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 171
    invoke-direct {p0}, Lo/cwi;->l()V

    .line 172
    return-void
.end method

.method static synthetic a(Lo/cwi;I)I
    .locals 0

    .line 80
    iput p1, p0, Lo/cwi;->r:I

    return p1
.end method

.method static synthetic a(Lo/cwi;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->z:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method static synthetic a(Lo/cwi;Lcom/huawei/health/suggestion/model/Summary;)Lcom/huawei/health/suggestion/model/Summary;
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cwi;->p:Lcom/huawei/health/suggestion/model/Summary;

    return-object p1
.end method

.method public static a(Landroid/content/Context;)Lo/cwi;
    .locals 4

    .line 871
    sget-object v0, Lo/cwi;->e:Lo/cwi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 872
    const-class v2, Lo/cwi;

    monitor-enter v2

    .line 873
    :try_start_0
    sget-object v0, Lo/cwi;->e:Lo/cwi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 874
    new-instance v0, Lo/cwi;

    invoke-direct {v0, p0}, Lo/cwi;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cwi;->e:Lo/cwi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 876
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 878
    :cond_1
    :goto_0
    sget-object v0, Lo/cwi;->e:Lo/cwi;

    return-object v0
.end method

.method static synthetic a(Lo/cwi;Landroid/os/Bundle;)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lo/cwi;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic a(Lo/cwi;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bru;Landroid/content/Context;)V
    .locals 0

    .line 80
    invoke-direct {p0, p1, p2, p3}, Lo/cwi;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bru;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lo/cwi;Z)Z
    .locals 0

    .line 80
    iput-boolean p1, p0, Lo/cwi;->s:Z

    return p1
.end method

.method static synthetic b(Lo/cwi;)Lcom/huawei/health/suggestion/model/RunWorkout;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->o:Lcom/huawei/health/suggestion/model/RunWorkout;

    return-object v0
.end method

.method private b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bru;Landroid/content/Context;)V
    .locals 24

    .line 686
    const/16 v8, 0x102

    .line 687
    const/4 v9, 0x3

    .line 689
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDistance()D

    move-result-wide v10

    .line 691
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMeasurementType()I

    move-result v12

    .line 692
    const/4 v0, 0x2

    if-ne v0, v12, :cond_0

    .line 693
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDistance()D

    move-result-wide v10

    goto :goto_0

    .line 694
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v12, :cond_1

    .line 695
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v0

    int-to-double v10, v0

    .line 698
    :cond_1
    :goto_0
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 699
    invoke-static/range {p1 .. p1}, Lo/bxa;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 700
    move-object/from16 v0, p0

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo/cwi;->d(I)V

    .line 701
    const-string v0, "runningCourse"

    const/4 v1, 0x2

    invoke-virtual {v13, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    .line 703
    :cond_2
    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/cwi;->d(I)V

    .line 704
    const-string v0, "runningCourse"

    const/4 v1, 0x1

    invoke-virtual {v13, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 706
    :goto_1
    const-string v0, "runningCourseId"

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 707
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 708
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/cbl;->e(Landroid/os/Bundle;)V

    .line 710
    const/4 v14, 0x0

    .line 711
    invoke-static/range {p1 .. p1}, Lo/bxa;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;

    move-result-object v15

    .line 712
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v16

    .line 713
    add-int/lit8 v0, v16, 0x1

    new-array v1, v0, [I

    move-object/from16 v17, v1

    .line 714
    add-int/lit8 v0, v16, 0x1

    new-array v1, v0, [F

    move-object/from16 v18, v1

    .line 715
    add-int/lit8 v0, v16, 0x1

    new-array v1, v0, [Ljava/lang/String;

    move-object/from16 v19, v1

    .line 716
    const/16 v20, 0x0

    :goto_2
    move/from16 v0, v20

    move/from16 v1, v16

    if-ge v0, v1, :cond_5

    .line 717
    move/from16 v0, v20

    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 718
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v22

    .line 719
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v23

    .line 720
    if-nez v23, :cond_3

    .line 721
    const/4 v0, 0x1

    aput v0, v17, v20

    .line 722
    invoke-static/range {v22 .. v22}, Lo/bzr;->d(I)F

    move-result v0

    aput v0, v18, v20

    .line 723
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v22

    int-to-double v1, v1

    .line 724
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 725
    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 726
    aput-object v14, v19, v20

    goto :goto_3

    .line 727
    :cond_3
    move/from16 v0, v23

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 728
    const/4 v0, 0x0

    aput v0, v17, v20

    .line 729
    move/from16 v0, v22

    int-to-float v0, v0

    aput v0, v18, v20

    .line 730
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v22

    int-to-float v1, v1

    .line 731
    invoke-static {v1}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 732
    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwadpaterhealthmgr/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 733
    aput-object v14, v19, v20

    .line 735
    :cond_4
    :goto_3
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "actionTarget[i]="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    aget v2, v17, v20

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " actionTargetValue[i] ="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    aget v2, v18, v20

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "actionMsg[i]"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    aget-object v2, v19, v20

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_2

    .line 737
    :cond_5
    const/4 v0, 0x0

    aput v0, v17, v16

    .line 738
    const/high16 v0, 0x3f800000    # 1.0f

    aput v0, v18, v16

    .line 739
    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwadpaterhealthmgr/R$string;->sug_run_workout_complete:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v19, v16

    .line 740
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "actionTarget="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    const-string v2, " actionTargetValue ="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v18, v1, v2

    const-string v2, "actionMsg"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v19, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move/from16 v4, v16

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cbl;->b([I[F[Ljava/lang/String;I)V

    .line 744
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " target="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move v2, v8

    move v3, v9

    double-to-float v4, v10

    new-instance v5, Lo/cwi$11;

    move-object/from16 v1, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p1

    invoke-direct {v5, v1, v6, v7}, Lo/cwi$11;-><init>(Lo/cwi;Lo/bru;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    move-object/from16 v6, p3

    const/4 v1, 0x0

    const/16 v2, 0x102

    const/4 v3, 0x3

    invoke-virtual/range {v0 .. v6}, Lo/cbl;->c(IIIFLo/ceu;Landroid/content/Context;)I

    move-result v20

    .line 784
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "responseCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 785
    return-void
.end method

.method private b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V
    .locals 21

    .line 269
    const/16 v9, 0x102

    .line 270
    const/4 v10, 0x3

    .line 271
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v0

    int-to-float v11, v0

    .line 272
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " target="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " value="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    invoke-direct/range {p0 .. p0}, Lo/cwi;->n()I

    move-result v12

    .line 276
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRepeats()I

    move-result v13

    .line 277
    if-ltz v13, :cond_3

    .line 279
    move v14, v12

    .line 280
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 281
    const/4 v0, 0x1

    if-gt v13, v0, :cond_1

    .line 283
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    int-to-float v15, v0

    .line 284
    const-wide/high16 v16, 0x404e000000000000L    # 60.0

    .line 285
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v1

    int-to-double v1, v1

    div-double v1, v1, v16

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwi;->c:Landroid/content/Context;

    .line 286
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwadpaterhealthmgr/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwi;->c:Landroid/content/Context;

    .line 287
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwadpaterhealthmgr/R$string;->IDS_motiontrack_run_tip:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 288
    const/4 v0, 0x1

    if-ne v14, v0, :cond_0

    .line 289
    move v15, v11

    .line 290
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/cwi;->e(F)Ljava/lang/String;

    move-result-object v18

    .line 292
    :cond_0
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v14, v15, v1}, Lo/cbl;->e(IFLjava/lang/String;)V

    .line 293
    goto/16 :goto_1

    .line 294
    :cond_1
    mul-int/lit8 v0, v13, 0x2

    add-int/lit8 v15, v0, 0x2

    .line 295
    new-array v0, v15, [I

    move-object/from16 v16, v0

    .line 296
    new-array v0, v15, [F

    move-object/from16 v17, v0

    .line 297
    new-array v0, v15, [Ljava/lang/String;

    move-object/from16 v18, v0

    .line 299
    const/4 v14, 0x0

    .line 302
    const/4 v0, 0x0

    aput v14, v16, v0

    .line 303
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    aput v0, v17, v1

    .line 304
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v18, v1

    .line 307
    add-int/lit8 v0, v15, -0x1

    aput v14, v16, v0

    .line 308
    add-int/lit8 v0, v15, -0x1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v1

    int-to-float v1, v1

    aput v1, v17, v0

    .line 309
    add-int/lit8 v0, v15, -0x1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v18, v0

    .line 311
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    if-ge v0, v13, :cond_2

    .line 313
    mul-int/lit8 v20, v19, 0x2

    .line 316
    add-int/lit8 v0, v20, 0x1

    aput v14, v16, v0

    .line 317
    add-int/lit8 v0, v20, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v1

    int-to-float v1, v1

    aput v1, v17, v0

    .line 318
    add-int/lit8 v0, v20, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v18, v0

    .line 321
    add-int/lit8 v0, v20, 0x2

    aput v14, v16, v0

    .line 322
    add-int/lit8 v0, v20, 0x2

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v1

    int-to-float v1, v1

    aput v1, v17, v0

    .line 323
    add-int/lit8 v0, v20, 0x2

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v18, v0

    .line 311
    add-int/lit8 v19, v19, 0x1

    goto :goto_0

    .line 326
    :cond_2
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    invoke-virtual {v0, v1, v2, v3}, Lo/cbl;->e([I[F[Ljava/lang/String;)V

    .line 330
    :cond_3
    :goto_1
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cwi;->g:Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 331
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/cwi;->s:Z

    .line 332
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cwi;->q:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    .line 333
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_RUN_START_2050005:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lcom/huawei/operation/OpAnalyticsUtil;->setEventWithActionType(ILjava/lang/String;)V

    .line 334
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cwi;->d(I)V

    .line 335
    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    .line 336
    const-string v0, "actiontype"

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_PVUV_85050001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v14}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 338
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move v2, v9

    move v3, v10

    move v4, v11

    new-instance v5, Lo/cwi$8;

    move-object/from16 v1, p0

    move-object/from16 v6, p3

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    invoke-direct {v5, v1, v6, v7, v8}, Lo/cwi$8;-><init>(Lo/cwi;Lo/bru;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;)V

    move-object/from16 v6, p4

    const/4 v1, 0x0

    const/16 v2, 0x102

    const/4 v3, 0x3

    invoke-virtual/range {v0 .. v6}, Lo/cbl;->c(IIIFLo/ceu;Landroid/content/Context;)I

    move-result v15

    .line 397
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "responseCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    return-void
.end method

.method static synthetic b(Lo/cwi;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V
    .locals 0

    .line 80
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cwi;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic c(Lo/cwi;Lcom/huawei/health/suggestion/model/RunWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cwi;->o:Lcom/huawei/health/suggestion/model/RunWorkout;

    return-object p1
.end method

.method static synthetic c(Lo/cwi;)Lo/bru;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->n:Lo/bru;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 7

    .line 813
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 814
    const-string v0, "_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 815
    array-length v0, v4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 816
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDetails error, can not use this sportId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 817
    return-void

    .line 820
    :cond_0
    new-instance v5, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 822
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const/4 v2, 0x1

    aget-object v2, v4, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 826
    goto :goto_0

    .line 823
    :catch_0
    move-exception v6

    .line 824
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDetails error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    return-void

    .line 828
    :goto_0
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 829
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 831
    iget-object v0, p0, Lo/cwi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwi$2;

    invoke-direct {v1, p0}, Lo/cwi$2;-><init>(Lo/cwi;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 868
    return-void

    :array_0
    .array-data 4
        0x7533
    .end array-data
.end method

.method static synthetic c(Lo/cwi;I)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lo/cwi;->d(I)V

    return-void
.end method

.method static synthetic c(Lo/cwi;Ljava/lang/String;)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lo/cwi;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/cwi;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->v:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method static synthetic d(Lo/cwi;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cwi;->m:Ljava/lang/String;

    return-object p1
.end method

.method private d(I)V
    .locals 1

    .line 401
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/brt;->a(I)V

    .line 402
    return-void
.end method

.method private d(Landroid/os/Bundle;)V
    .locals 9

    .line 256
    const-string v0, "track_type"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 257
    const-string v0, "track_target"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 258
    const-string v0, "track_targetvalue"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v8

    .line 259
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lo/cwi;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 260
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move v2, v6

    move v3, v7

    move v4, v8

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cbl;->c(IIIFLo/ceu;)I

    .line 261
    return-void
.end method

.method static synthetic e(Lo/cwi;Lcom/huawei/exercise/modle/RunPlanRecordInfo;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cwi;->q:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    return-object p1
.end method

.method private e(F)Ljava/lang/String;
    .locals 7

    .line 406
    const-string v5, ""

    .line 407
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, p1

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cwi;->c:Landroid/content/Context;

    .line 410
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwadpaterhealthmgr/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cwi;->c:Landroid/content/Context;

    .line 411
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwadpaterhealthmgr/R$string;->IDS_motiontrack_run_tip:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 414
    :cond_0
    const/4 v6, 0x2

    .line 415
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, p1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cwi;->c:Landroid/content/Context;

    .line 416
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwadpaterhealthmgr/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cwi;->c:Landroid/content/Context;

    .line 417
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/hwadpaterhealthmgr/R$string;->IDS_motiontrack_run_tip:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 419
    :goto_0
    return-object v5
.end method

.method static synthetic e(Lo/cwi;)Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/cwi;Lo/bru;)Lo/bru;
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cwi;->n:Lo/bru;

    return-object p1
.end method

.method static synthetic f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->q:Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    return-object v0
.end method

.method static synthetic g(Lo/cwi;)Lcom/huawei/health/suggestion/model/Summary;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->p:Lcom/huawei/health/suggestion/model/Summary;

    return-object v0
.end method

.method static synthetic h(Lo/cwi;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Lo/cwi;->m()V

    return-void
.end method

.method static synthetic i(Lo/cwi;)Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Lo/cwi;->s:Z

    return v0
.end method

.method static synthetic k(Lo/cwi;)Landroid/content/Context;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic l(Lo/cwi;)Lcom/huawei/login/ui/login/LoginInit;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->f:Lcom/huawei/login/ui/login/LoginInit;

    return-object v0
.end method

.method private l()V
    .locals 0

    .line 446
    invoke-direct {p0}, Lo/cwi;->u()V

    .line 447
    invoke-direct {p0}, Lo/cwi;->p()V

    .line 448
    invoke-direct {p0}, Lo/cwi;->s()V

    .line 449
    return-void
.end method

.method private m()V
    .locals 2

    .line 264
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lo/cwi;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 265
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->f()V

    .line 266
    return-void
.end method

.method private n()I
    .locals 6

    .line 425
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 426
    const/4 v5, 0x0

    .line 427
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 428
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v5

    goto :goto_0

    .line 430
    :cond_0
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentPlan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    :goto_0
    const/4 v0, 0x1

    if-gt v5, v0, :cond_1

    .line 438
    const/4 v0, 0x0

    return v0

    .line 440
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic n(Lo/cwi;)I
    .locals 1

    .line 80
    iget v0, p0, Lo/cwi;->r:I

    return v0
.end method

.method static synthetic p(Lo/cwi;)Landroid/os/Handler;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/cwi;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private p()V
    .locals 1

    .line 452
    new-instance v0, Lo/cwi$9;

    invoke-direct {v0, p0}, Lo/cwi$9;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->h:Lo/brq;

    .line 474
    return-void
.end method

.method private s()V
    .locals 1

    .line 788
    new-instance v0, Lo/cwi$15;

    invoke-direct {v0, p0}, Lo/cwi$15;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->i:Lo/brs;

    .line 810
    return-void
.end method

.method private u()V
    .locals 1

    .line 552
    new-instance v0, Lo/cwi$10;

    invoke-direct {v0, p0}, Lo/cwi$10;-><init>(Lo/cwi;)V

    iput-object v0, p0, Lo/cwi;->k:Lo/brv;

    .line 683
    return-void
.end method


# virtual methods
.method public a()Lo/brw;
    .locals 3

    .line 898
    iget-object v0, p0, Lo/cwi;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 899
    new-instance v0, Lcom/huawei/health/suggestion/model/FitnessUserInfo;

    iget-object v1, p0, Lo/cwi;->c:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwi;->o()Lo/dao;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/suggestion/model/FitnessUserInfo;-><init>(Landroid/content/Context;Lo/dao;)V

    return-object v0

    .line 901
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(IZ)V
    .locals 4

    .line 1013
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setPersonalPrivacySettingValue... privacyId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", isOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1014
    iget-object v0, p0, Lo/cwi;->l:Lo/dnm;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/cwi$1;

    invoke-direct {v2, p0}, Lo/cwi$1;-><init>(Lo/cwi;)V

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1024
    return-void
.end method

.method public b(I)Ljava/lang/String;
    .locals 1

    .line 1001
    iget-object v0, p0, Lo/cwi;->l:Lo/dnm;

    invoke-virtual {v0, p1}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lo/brq;
    .locals 1

    .line 911
    iget-object v0, p0, Lo/cwi;->h:Lo/brq;

    return-object v0
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 1036
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    new-instance v1, Lo/cwi$3;

    invoke-direct {v1, p0, p1}, Lo/cwi$3;-><init>(Lo/cwi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireExerciseRecordByAll(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 1043
    return-void
.end method

.method public c(IZ)V
    .locals 0

    .line 1028
    invoke-virtual {p0, p1, p2}, Lo/cwi;->a(IZ)V

    .line 1029
    return-void
.end method

.method public c()Z
    .locals 1

    .line 921
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    return v0
.end method

.method public c(I)Z
    .locals 5

    .line 1006
    invoke-virtual {p0, p1}, Lo/cwi;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 1007
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "privacySportData :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    const-string v0, "true"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public d()Lo/brs;
    .locals 1

    .line 888
    iget-object v0, p0, Lo/cwi;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iput-object v0, p0, Lo/cwi;->f:Lcom/huawei/login/ui/login/LoginInit;

    .line 890
    iget-object v0, p0, Lo/cwi;->f:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 891
    const/4 v0, 0x0

    return-object v0

    .line 893
    :cond_0
    iget-object v0, p0, Lo/cwi;->i:Lo/brs;

    return-object v0
.end method

.method public e()Lo/brv;
    .locals 1

    .line 906
    iget-object v0, p0, Lo/cwi;->k:Lo/brv;

    return-object v0
.end method

.method public f()V
    .locals 3

    .line 938
    iget-object v0, p0, Lo/cwi;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cwi$b;

    .line 939
    invoke-interface {v2}, Lo/cwi$b;->c()V

    .line 940
    goto :goto_0

    .line 942
    :cond_0
    iget-object v0, p0, Lo/cwi;->u:Lo/yy;

    invoke-virtual {v0}, Lo/yy;->a()V

    .line 943
    return-void
.end method

.method public g()V
    .locals 3

    .line 962
    iget-object v0, p0, Lo/cwi;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cwi$b;

    .line 963
    invoke-interface {v2}, Lo/cwi$b;->e()V

    .line 964
    goto :goto_0

    .line 966
    :cond_0
    iget-object v0, p0, Lo/cwi;->u:Lo/yy;

    invoke-virtual {v0}, Lo/yy;->f()V

    .line 967
    return-void
.end method

.method public h()V
    .locals 4

    .line 974
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moudleInitComplete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 975
    iget-object v0, p0, Lo/cwi;->u:Lo/yy;

    invoke-virtual {v0}, Lo/yy;->k()V

    .line 976
    return-void
.end method

.method public i()V
    .locals 3

    .line 950
    iget-object v0, p0, Lo/cwi;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cwi$b;

    .line 951
    invoke-interface {v2}, Lo/cwi$b;->b()V

    .line 952
    goto :goto_0

    .line 954
    :cond_0
    iget-object v0, p0, Lo/cwi;->u:Lo/yy;

    invoke-virtual {v0}, Lo/yy;->a()V

    .line 955
    return-void
.end method

.method public k()Lcom/huawei/health/suggestion/model/RunWorkout;
    .locals 1

    .line 883
    iget-object v0, p0, Lo/cwi;->g:Lcom/huawei/health/suggestion/model/RunWorkout;

    return-object v0
.end method

.method public o()Lo/dao;
    .locals 1

    .line 979
    iget-object v0, p0, Lo/cwi;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/djl;->c(Landroid/content/Context;)Lo/dao;

    move-result-object v0

    return-object v0
.end method
