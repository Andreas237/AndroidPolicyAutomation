.class public Lo/dgz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Lo/dgz;

.field private static final e:Ljava/lang/Object;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dgz;->e:Ljava/lang/Object;

    .line 47
    const-string v0, "HiH_SleepDataModelInteractor"

    sput-object v0, Lo/dgz;->c:Ljava/lang/String;

    .line 48
    const-string v0, "SleepDataModelInteractor"

    sput-object v0, Lo/dgz;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dgz;->b:Landroid/content/Context;

    .line 75
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lo/dgz;->a:Ljava/lang/String;

    return-object v0
.end method

.method private a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 18

    .line 445
    move/from16 v9, p3

    .line 446
    if-nez v9, :cond_0

    .line 447
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiGroupType == HiGroupUnitType.NONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    move-object/from16 v0, p6

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 449
    return-void

    .line 452
    :cond_0
    const-wide/16 v0, 0x3e8

    mul-long v10, p1, v0

    .line 453
    mul-int v0, p4, p5

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    add-long v0, v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v12, v0, v2

    .line 454
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "optionStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",openEndTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    const/4 v14, 0x1

    .line 457
    const/4 v0, 0x5

    if-ne v0, v9, :cond_1

    const/16 v0, 0xc

    move/from16 v1, p5

    if-ne v0, v1, :cond_1

    .line 458
    const/4 v14, 0x3

    .line 461
    :cond_1
    new-instance v15, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v15}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 462
    invoke-virtual {v15, v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 463
    invoke-virtual {v15, v12, v13}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 464
    invoke-virtual {v15, v14}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 466
    const/16 v16, 0x4

    move/from16 v0, v16

    new-array v0, v0, [I

    move-object/from16 v16, v0

    fill-array-data v16, :array_0

    .line 470
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const-string v0, "sleep_deep_key"

    const/4 v1, 0x0

    aput-object v0, v17, v1

    const-string v0, "sleep_shallow_key"

    const/4 v1, 0x1

    aput-object v0, v17, v1

    const-string v0, "sleep_wake_key"

    const/4 v1, 0x2

    aput-object v0, v17, v1

    const-string v0, "sleep_wake_count_key"

    const/4 v1, 0x3

    aput-object v0, v17, v1

    .line 472
    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 473
    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 474
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 475
    invoke-virtual {v15, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 476
    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 478
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateOption setValue done"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgz$5;

    move-object/from16 v2, p0

    move-object/from16 v3, p6

    move/from16 v4, p5

    move/from16 v5, p4

    move-wide/from16 v6, p1

    move/from16 v8, p3

    invoke-direct/range {v1 .. v8}, Lo/dgz$5;-><init>(Lo/dgz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IIJI)V

    invoke-interface {v0, v15, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 570
    return-void

    nop

    :array_0
    .array-data 4
        0xabe1
        0xabe2
        0xabe3
        0xabe5
    .end array-data
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static c()Lo/dgz;
    .locals 4

    .line 78
    sget-object v2, Lo/dgz;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 79
    :try_start_0
    sget-object v0, Lo/dgz;->d:Lo/dgz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 80
    new-instance v0, Lo/dgz;

    invoke-direct {v0}, Lo/dgz;-><init>()V

    sput-object v0, Lo/dgz;->d:Lo/dgz;

    .line 82
    :cond_0
    sget-object v0, Lo/dgz;->d:Lo/dgz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 83
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 18

    .line 629
    move/from16 v9, p3

    .line 630
    if-nez v9, :cond_0

    .line 631
    move-object/from16 v0, p6

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 632
    return-void

    .line 635
    :cond_0
    const-wide/16 v0, 0x3e8

    mul-long v10, p1, v0

    .line 636
    mul-int v0, p4, p5

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    add-long v0, v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v12, v0, v2

    .line 638
    const/4 v14, 0x1

    .line 639
    const/4 v0, 0x5

    if-ne v0, v9, :cond_1

    const/16 v0, 0xc

    move/from16 v1, p5

    if-ne v0, v1, :cond_1

    .line 640
    const/4 v14, 0x3

    .line 642
    mul-int/lit8 v0, p4, 0x3c

    int-to-long v0, v0

    add-long v0, v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v12, v0, v2

    .line 645
    :cond_1
    new-instance v15, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v15}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 646
    invoke-virtual {v15, v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 647
    invoke-virtual {v15, v12, v13}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 648
    invoke-virtual {v15, v14}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 650
    const/16 v16, 0x12

    move/from16 v0, v16

    new-array v0, v0, [I

    move-object/from16 v16, v0

    fill-array-data v16, :array_0

    .line 670
    const/16 v0, 0x12

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const-string v0, "core_sleep_deep_key"

    const/4 v1, 0x0

    aput-object v0, v17, v1

    const-string v0, "core_sleep_shallow_key"

    const/4 v1, 0x1

    aput-object v0, v17, v1

    const-string v0, "core_sleep_wake_dream_key"

    const/4 v1, 0x2

    aput-object v0, v17, v1

    const-string v0, "core_sleep_wake_count_key"

    const/4 v1, 0x3

    aput-object v0, v17, v1

    const-string v0, "core_sleep_score_key"

    const/4 v1, 0x4

    aput-object v0, v17, v1

    const-string v0, "core_sleep_fall_key"

    const/4 v1, 0x5

    aput-object v0, v17, v1

    const-string v0, "core_sleep_wake_up_key"

    const/4 v1, 0x6

    aput-object v0, v17, v1

    const-string v0, "core_sleep_snore_freq_key"

    const/4 v1, 0x7

    aput-object v0, v17, v1

    const-string v0, "core_sleep_deep_sleep_part_key"

    const/16 v1, 0x8

    aput-object v0, v17, v1

    const-string v0, "core_sleep_total_sleep_time_key"

    const/16 v1, 0x9

    aput-object v0, v17, v1

    const-string v0, "core_sleep_day_sleep_time_key"

    const/16 v1, 0xa

    aput-object v0, v17, v1

    const-string v0, "sleep_deep_key"

    const/16 v1, 0xb

    aput-object v0, v17, v1

    const-string v0, "sleep_shallow_key"

    const/16 v1, 0xc

    aput-object v0, v17, v1

    const-string v0, "sleep_wake_key"

    const/16 v1, 0xd

    aput-object v0, v17, v1

    const-string v0, "core_sleep_wake_key"

    const/16 v1, 0xe

    aput-object v0, v17, v1

    const-string v0, "sleep_wake_count_key"

    const/16 v1, 0xf

    aput-object v0, v17, v1

    const-string v0, "core_sleep_valid_data_key"

    const/16 v1, 0x10

    aput-object v0, v17, v1

    const-string v0, "common_sleep_duration_sleep_sum_key"

    const/16 v1, 0x11

    aput-object v0, v17, v1

    .line 689
    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 690
    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 691
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 692
    invoke-virtual {v15, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 693
    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 698
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgz$3;

    move-object/from16 v2, p0

    move-object/from16 v3, p6

    move/from16 v4, p5

    move/from16 v5, p4

    move-wide/from16 v6, p1

    move/from16 v8, p3

    invoke-direct/range {v1 .. v8}, Lo/dgz$3;-><init>(Lo/dgz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IIJI)V

    invoke-interface {v0, v15, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 915
    return-void

    :array_0
    .array-data 4
        0xac46
        0xac47
        0xac45
        0xac4b
        0xacab
        0xaca9
        0xacaa
        0xacb0
        0xac4a
        0xac49
        0xac4c
        0xabe1
        0xabe2
        0xabe3
        0xac48
        0xabe5
        0xacae
        0xabe4
    .end array-data
.end method


# virtual methods
.method public a(JIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 14

    .line 199
    const-wide/16 v0, 0x3e8

    mul-long v8, p1, v0

    .line 200
    mul-int v0, p3, p4

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    add-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v10, v0, v2

    .line 201
    new-instance v12, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v12}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 202
    invoke-virtual {v12, v8, v9, v10, v11}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 203
    const/4 v13, 0x2

    new-array v13, v13, [I

    fill-array-data v13, :array_0

    .line 204
    invoke-virtual {v12, v13}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 206
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 208
    iget-object v0, p0, Lo/dgz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgz$2;

    move-object v2, p0

    move/from16 v3, p4

    move-wide v4, p1

    move/from16 v6, p3

    move-object/from16 v7, p5

    invoke-direct/range {v1 .. v7}, Lo/dgz$2;-><init>(Lo/dgz;IJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v12, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 362
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getSleepDailyDetail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    return-void

    :array_0
    .array-data 4
        0x5654
        0x55f0
    .end array-data
.end method

.method public a(JJIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 17

    .line 933
    move/from16 v8, p5

    .line 934
    if-nez v8, :cond_0

    .line 935
    move-object/from16 v0, p8

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 936
    return-void

    .line 939
    :cond_0
    const-wide/16 v0, 0x3e8

    mul-long v9, p1, v0

    .line 940
    const-wide/16 v0, 0x3e8

    mul-long v11, p3, v0

    .line 941
    const/4 v13, 0x1

    .line 942
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMonthCoreSleepSummary  startTime "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " size="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " count= "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 943
    new-instance v14, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v14}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 944
    invoke-virtual {v14, v9, v10}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 945
    invoke-virtual {v14, v11, v12}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 946
    invoke-virtual {v14, v13}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 948
    const/16 v15, 0x11

    new-array v15, v15, [I

    fill-array-data v15, :array_0

    .line 967
    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v16, v0

    const-string v0, "core_sleep_deep_key"

    const/4 v1, 0x0

    aput-object v0, v16, v1

    const-string v0, "core_sleep_shallow_key"

    const/4 v1, 0x1

    aput-object v0, v16, v1

    const-string v0, "core_sleep_wake_dream_key"

    const/4 v1, 0x2

    aput-object v0, v16, v1

    const-string v0, "core_sleep_wake_count_key"

    const/4 v1, 0x3

    aput-object v0, v16, v1

    const-string v0, "core_sleep_score_key"

    const/4 v1, 0x4

    aput-object v0, v16, v1

    const-string v0, "core_sleep_fall_key"

    const/4 v1, 0x5

    aput-object v0, v16, v1

    const-string v0, "core_sleep_wake_up_key"

    const/4 v1, 0x6

    aput-object v0, v16, v1

    const-string v0, "core_sleep_snore_freq_key"

    const/4 v1, 0x7

    aput-object v0, v16, v1

    const-string v0, "core_sleep_deep_sleep_part_key"

    const/16 v1, 0x8

    aput-object v0, v16, v1

    const-string v0, "core_sleep_total_sleep_time_key"

    const/16 v1, 0x9

    aput-object v0, v16, v1

    const-string v0, "core_sleep_day_sleep_time_key"

    const/16 v1, 0xa

    aput-object v0, v16, v1

    const-string v0, "sleep_deep_key"

    const/16 v1, 0xb

    aput-object v0, v16, v1

    const-string v0, "sleep_shallow_key"

    const/16 v1, 0xc

    aput-object v0, v16, v1

    const-string v0, "sleep_wake_key"

    const/16 v1, 0xd

    aput-object v0, v16, v1

    const-string v0, "core_sleep_wake_key"

    const/16 v1, 0xe

    aput-object v0, v16, v1

    const-string v0, "sleep_wake_count_key"

    const/16 v1, 0xf

    aput-object v0, v16, v1

    const-string v0, "core_sleep_valid_data_key"

    const/16 v1, 0x10

    aput-object v0, v16, v1

    .line 985
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 986
    invoke-virtual {v14, v15}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 987
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 988
    invoke-virtual {v14, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 989
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 990
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMonthCoreSleepSummary call getHealthAPI startDate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v9, v10}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  endDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v11, v12}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 992
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgz$4;

    move-object/from16 v2, p0

    move-object/from16 v3, p8

    move/from16 v4, p7

    move/from16 v5, p6

    move-wide/from16 v6, p1

    invoke-direct/range {v1 .. v7}, Lo/dgz$4;-><init>(Lo/dgz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IIJ)V

    invoke-interface {v0, v14, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 1086
    return-void

    :array_0
    .array-data 4
        0xac46
        0xac47
        0xac45
        0xac4b
        0xacab
        0xaca9
        0xacaa
        0xacb0
        0xac4a
        0xac49
        0xac4c
        0xabe1
        0xabe2
        0xabe3
        0xac48
        0xabe5
        0xacae
    .end array-data
.end method

.method public b(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 607
    const/4 v0, 0x0

    if-ne v0, p6, :cond_0

    .line 608
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxx callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    return-void

    .line 612
    :cond_0
    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    const/16 v0, 0x5a0

    if-gt p5, v0, :cond_1

    .line 614
    move-object v0, p0

    move-wide v1, p1

    move v3, p4

    move v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lo/dgz;->a(JIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 615
    :cond_1
    const/16 v0, 0x5a0

    if-lt p4, v0, :cond_2

    .line 617
    invoke-direct/range {p0 .. p6}, Lo/dgz;->d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 619
    :cond_2
    sget-object v0, Lo/dgz;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxx callback ErrorConstants.ERR_NONE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p6, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 623
    :goto_0
    return-void
.end method

.method public c(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 583
    const/4 v0, 0x0

    if-ne v0, p6, :cond_0

    .line 584
    return-void

    .line 586
    :cond_0
    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    const/16 v0, 0x5a0

    if-gt p5, v0, :cond_1

    .line 587
    move-object v0, p0

    move-wide v1, p1

    move v3, p4

    move v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lo/dgz;->e(JIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 588
    :cond_1
    const/16 v0, 0x5a0

    if-lt p4, v0, :cond_2

    .line 589
    invoke-direct/range {p0 .. p6}, Lo/dgz;->a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 591
    :cond_2
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p6, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 594
    :goto_0
    return-void
.end method

.method public e(JIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 14

    .line 369
    const-wide/16 v0, 0x3e8

    mul-long v8, p1, v0

    .line 370
    mul-int v0, p3, p4

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    add-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v10, v0, v2

    .line 371
    new-instance v12, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v12}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 372
    invoke-virtual {v12, v8, v9, v10, v11}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 373
    const/4 v13, 0x1

    new-array v13, v13, [I

    fill-array-data v13, :array_0

    .line 374
    invoke-virtual {v12, v13}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 375
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 378
    iget-object v0, p0, Lo/dgz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgz$1;

    move-object v2, p0

    move/from16 v3, p4

    move-wide v4, p1

    move/from16 v6, p3

    move-object/from16 v7, p5

    invoke-direct/range {v1 .. v7}, Lo/dgz$1;-><init>(Lo/dgz;IJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v12, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 434
    return-void

    nop

    :array_0
    .array-data 4
        0x55f0
    .end array-data
.end method
