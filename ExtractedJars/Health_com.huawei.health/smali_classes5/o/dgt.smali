.class public Lo/dgt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dgt;

.field private static final d:Ljava/lang/Object;

.field private static e:Ljava/lang/String;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "SCUI_FitnessDetailInteractor"

    sput-object v0, Lo/dgt;->e:Ljava/lang/String;

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dgt;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    .line 53
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 42
    sget-object v0, Lo/dgt;->e:Ljava/lang/String;

    return-object v0
.end method

.method private a(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 799
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 801
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCurrValue()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 802
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v0

    invoke-static {v0}, Lo/dha;->a(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getGoalType()I

    move-result v1

    invoke-static {v1}, Lo/dha;->e(I)I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCurrValue()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lo/dgt;->e(III)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 804
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v0

    if-lez v0, :cond_1

    .line 805
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getGoalType()I

    move-result v0

    invoke-static {v0}, Lo/dha;->e(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v1

    const/4 v2, 0x2

    invoke-direct {p0, v2, v0, v1}, Lo/dgt;->e(III)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 807
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v0

    if-lez v0, :cond_2

    .line 808
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getGoalType()I

    move-result v0

    invoke-static {v0}, Lo/dha;->e(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, Lo/dgt;->e(III)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 810
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v0

    if-lez v0, :cond_3

    .line 811
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getGoalType()I

    move-result v0

    invoke-static {v0}, Lo/dha;->e(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v1

    const/4 v2, 0x3

    invoke-direct {p0, v2, v0, v1}, Lo/dgt;->e(III)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 813
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDutationGoal()I

    move-result v0

    if-lez v0, :cond_4

    .line 814
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getGoalType()I

    move-result v0

    invoke-static {v0}, Lo/dha;->e(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDutationGoal()I

    move-result v1

    const/4 v2, 0x4

    invoke-direct {p0, v2, v0, v1}, Lo/dgt;->e(III)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 818
    :cond_4
    :goto_0
    return-object v3
.end method

.method private b(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Ljava/util/List;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;"
        }
    .end annotation

    .line 822
    new-instance v2, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-direct {v2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;-><init>()V

    .line 823
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getGoalType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setGoalType(I)V

    .line 825
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiGoalInfo;

    .line 826
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 827
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v5, v0

    .line 828
    const/16 v0, 0x7d0

    if-ge v5, v0, :cond_0

    .line 829
    const/16 v5, 0x7d0

    .line 830
    invoke-virtual {v2, v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setStepGoal(I)V

    .line 831
    invoke-direct {p0, v2}, Lo/dgt;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)V

    goto :goto_1

    .line 833
    :cond_0
    invoke-virtual {v2, v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setStepGoal(I)V

    .line 836
    :goto_1
    goto :goto_2

    :cond_1
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 837
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setCalorieGoal(I)V

    goto :goto_2

    .line 838
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 839
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setDistanceGoal(I)V

    goto :goto_2

    .line 840
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 841
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setDutationGoal(I)V

    .line 843
    :cond_4
    :goto_2
    goto/16 :goto_0

    .line 846
    :cond_5
    return-object v2
.end method

.method public static c()Lo/dgt;
    .locals 4

    .line 56
    sget-object v2, Lo/dgt;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 57
    :try_start_0
    sget-object v0, Lo/dgt;->a:Lo/dgt;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 58
    new-instance v0, Lo/dgt;

    invoke-direct {v0}, Lo/dgt;-><init>()V

    sput-object v0, Lo/dgt;->a:Lo/dgt;

    .line 60
    :cond_0
    sget-object v0, Lo/dgt;->a:Lo/dgt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 61
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private c(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)V
    .locals 1

    .line 850
    new-instance v0, Lo/dgt$5;

    invoke-direct {v0, p0}, Lo/dgt$5;-><init>(Lo/dgt;)V

    invoke-virtual {p0, p1, v0}, Lo/dgt;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 856
    return-void
.end method

.method static synthetic d(Lo/dgt;)Landroid/content/Context;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/dgt;Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Ljava/util/List;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;
    .locals 1

    .line 42
    invoke-direct {p0, p1, p2}, Lo/dgt;->b(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Ljava/util/List;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v0

    return-object v0
.end method

.method private e(III)Lcom/huawei/hihealth/HiGoalInfo;
    .locals 3

    .line 859
    new-instance v2, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiGoalInfo;-><init>()V

    .line 860
    invoke-virtual {v2, p1}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalType(I)V

    .line 861
    invoke-virtual {v2, p2}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalUnit(I)V

    .line 862
    int-to-double v0, p3

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalValue(D)V

    .line 863
    return-object v2
.end method


# virtual methods
.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 72
    new-instance v5, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->i(J)J

    move-result-wide v2

    .line 73
    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 75
    const/4 v6, 0x4

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 79
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 81
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$4;

    invoke-direct {v1, p0, p1}, Lo/dgt$4;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 138
    return-void

    :array_0
    .array-data 4
        0x9c42
        0x9c43
        0x9c44
        0x9c45
    .end array-data
.end method

.method public b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 703
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 704
    invoke-virtual {v2, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 705
    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 706
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 708
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$7;

    invoke-direct {v1, p0, p5}, Lo/dgt$7;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 738
    return-void

    :array_0
    .array-data 4
        0x9c42
        0x9c43
    .end array-data
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 363
    sget-object v0, Lo/dgt;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getTodaySleepTotalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    new-instance v6, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 365
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    .line 366
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->i(J)J

    move-result-wide v2

    .line 365
    invoke-virtual {v6, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 367
    sget-object v0, Lo/dgt;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getTodaySleepTotalData startDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Lo/cnk;->d(J)J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  endDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 368
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/cnk;->i(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 367
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    const/4 v7, 0x5

    new-array v7, v7, [I

    fill-array-data v7, :array_0

    .line 375
    invoke-virtual {v6, v7}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 377
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$6;

    invoke-direct {v1, p0, p1}, Lo/dgt$6;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 425
    return-void

    :array_0
    .array-data 4
        0xac49
        0xac46
        0xac47
        0xac45
        0xac4b
    .end array-data
.end method

.method public c(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 777
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$1;

    invoke-direct {v1, p0, p1, p2}, Lo/dgt$1;-><init>(Lo/dgt;Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 796
    return-void
.end method

.method public d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 19

    .line 439
    move/from16 v0, p4

    div-int/lit16 v12, v0, 0x5a0

    .line 441
    const-wide/16 v0, 0x3e8

    mul-long v0, v0, p1

    move/from16 v2, p4

    int-to-long v2, v2

    move/from16 v4, p5

    int-to-long v4, v4

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v13, v0, v2

    .line 442
    new-instance v15, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v15}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 443
    const-wide/16 v0, 0x3e8

    mul-long v0, v0, p1

    invoke-virtual {v15, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 444
    invoke-virtual {v15, v13, v14}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 445
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 449
    const/4 v0, 0x1

    if-ge v12, v0, :cond_0

    .line 450
    const/16 v18, 0x1

    .line 452
    const/16 v16, 0x4

    move/from16 v0, v16

    new-array v0, v0, [I

    move-object/from16 v16, v0

    fill-array-data v16, :array_0

    .line 454
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const/4 v0, 0x2

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v17, v1

    const/4 v0, 0x4

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v17, v1

    .line 455
    const/4 v0, 0x3

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v17, v1

    const/4 v0, 0x5

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v17, v1

    goto :goto_0

    .line 456
    :cond_0
    const/4 v0, 0x1

    if-ne v12, v0, :cond_1

    .line 457
    const/16 v18, 0x3

    .line 458
    invoke-static/range {p3 .. p3}, Lo/dha;->d(I)[I

    move-result-object v16

    .line 459
    invoke-static/range {p3 .. p3}, Lo/dha;->b(I)[Ljava/lang/String;

    move-result-object v17

    goto :goto_0

    .line 461
    :cond_1
    const/16 v18, 0x5

    .line 462
    invoke-static/range {p3 .. p3}, Lo/dha;->d(I)[I

    move-result-object v16

    .line 463
    invoke-static/range {p3 .. p3}, Lo/dha;->b(I)[Ljava/lang/String;

    move-result-object v17

    .line 464
    const/4 v0, 0x3

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 467
    :goto_0
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_2

    .line 468
    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 470
    :cond_2
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_3

    .line 471
    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 474
    :cond_3
    move/from16 v0, p4

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 475
    move/from16 v0, v18

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 476
    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 477
    sget-object v0, Lo/dgt;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetail aggregateOption="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiAggregateOption;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$9;

    move-object/from16 v2, p0

    move-object/from16 v3, p6

    move/from16 v4, p5

    move-wide/from16 v5, p1

    move/from16 v7, p4

    move/from16 v8, v18

    move-object/from16 v9, v16

    move/from16 v10, p3

    move-object/from16 v11, v17

    invoke-direct/range {v1 .. v11}, Lo/dgt$9;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IJII[II[Ljava/lang/String;)V

    invoke-interface {v0, v15, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 582
    return-void

    :array_0
    .array-data 4
        0x2
        0x4
        0x3
        0x5
    .end array-data
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 196
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 197
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 198
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 199
    const/16 v3, 0xc

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 213
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 214
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$2;

    invoke-direct {v1, p0, p1}, Lo/dgt$2;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 295
    return-void

    :array_0
    .array-data 4
        0x4e22
        0x4e23
        0x4e24
        0x4e25
        0x55f3
        0x55f1
        0x55f2
        0x5658
        0x5657
        0x5655
        0x5656
        0x5659
    .end array-data
.end method

.method public e(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 13

    .line 596
    move/from16 v0, p4

    div-int/lit16 v6, v0, 0x5a0

    .line 597
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    move/from16 v2, p4

    int-to-long v2, v2

    move/from16 v4, p5

    int-to-long v4, v4

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v7, v0, v2

    .line 599
    const/16 v0, 0x1f

    if-gt v6, v0, :cond_0

    .line 600
    const/4 v9, 0x3

    goto :goto_0

    .line 602
    :cond_0
    const/4 v9, 0x5

    .line 604
    :goto_0
    new-instance v10, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 605
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 606
    invoke-virtual {v10, v7, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 607
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 608
    invoke-static/range {p3 .. p3}, Lo/dhc;->e(I)I

    move-result v0

    invoke-static {v0}, Lo/dha;->g(I)[I

    move-result-object v11

    .line 609
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    .line 610
    invoke-virtual {v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 612
    :cond_1
    invoke-static/range {p3 .. p3}, Lo/dhc;->e(I)I

    move-result v0

    invoke-static {v0}, Lo/dha;->f(I)[Ljava/lang/String;

    move-result-object v12

    .line 613
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2

    .line 614
    invoke-virtual {v10, v12}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 616
    :cond_2
    invoke-virtual {v10, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 617
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 618
    sget-object v0, Lo/dgt;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetailByData aggregateOption="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiAggregateOption;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$10;

    move-object/from16 v2, p6

    move/from16 v3, p3

    invoke-direct {v1, p0, v2, v3, v12}, Lo/dgt$10;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I[Ljava/lang/String;)V

    invoke-interface {v0, v10, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 694
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 148
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 150
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 151
    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 155
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 156
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$3;

    invoke-direct {v1, p0, p1}, Lo/dgt$3;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 185
    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x4
        0x3
    .end array-data
.end method

.method public e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 748
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 751
    invoke-direct {p0, p1}, Lo/dgt;->a(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 752
    iget-object v0, p0, Lo/dgt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgt$8;

    invoke-direct {v1, p0, p2}, Lo/dgt$8;-><init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->e(ILjava/util/List;Lo/clz;)V

    .line 767
    return-void
.end method
