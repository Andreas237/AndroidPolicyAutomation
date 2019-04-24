.class public Lo/dgw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/dgw;

.field private static final d:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dgw;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dgw;->a:Landroid/content/Context;

    .line 50
    return-void
.end method

.method static synthetic a(Lo/dgw;ILjava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dgw;->c(ILjava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/dgw;)Landroid/content/Context;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dgw;->a:Landroid/content/Context;

    return-object v0
.end method

.method private declared-synchronized c(ILjava/util/List;JIII)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;JIII)Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;>;"
        }
    .end annotation

    monitor-enter p0

    .line 620
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 621
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 622
    const/4 v5, 0x0

    :goto_0
    move/from16 v0, p6

    if-ge v5, v0, :cond_7

    .line 623
    new-instance v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-direct {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;-><init>()V

    .line 624
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_0

    .line 626
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 627
    goto/16 :goto_4

    .line 630
    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 631
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v9

    .line 632
    const/4 v11, 0x0

    .line 636
    const-wide/16 v0, 0x3e8

    div-long v0, v9, v0

    sub-long v0, v0, p3

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    move/from16 v2, p7

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v12, v0

    .line 637
    move/from16 v0, p5

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 638
    invoke-static/range {p3 .. p4}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v13

    .line 639
    const-wide/16 v0, 0x3e8

    div-long v0, v9, v0

    invoke-static {v0, v1}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v14

    .line 641
    if-ge v14, v13, :cond_1

    .line 642
    add-int/lit8 v0, v14, 0xc

    sub-int v12, v0, v13

    goto :goto_2

    .line 644
    :cond_1
    sub-int v12, v14, v13

    .line 649
    :cond_2
    :goto_2
    if-ne v12, v5, :cond_5

    .line 650
    const/4 v0, 0x4

    move/from16 v1, p1

    if-ne v0, v1, :cond_3

    .line 651
    const-string v0, "maxHeartRate"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 652
    invoke-virtual {v6, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setMaxHeartRate(I)V

    goto :goto_3

    .line 654
    :cond_3
    const/4 v0, 0x5

    move/from16 v1, p1

    if-ne v0, v1, :cond_4

    .line 655
    const-string v0, "minHeartRate"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 656
    invoke-virtual {v6, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setMinHeartRate(I)V

    goto :goto_3

    .line 659
    :cond_4
    const/4 v0, 0x3

    move/from16 v1, p1

    if-ne v0, v1, :cond_6

    .line 660
    const-string v0, "avgRestingHeartRate"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 661
    invoke-virtual {v6, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setAvgRestHeartRate(I)V

    goto :goto_3

    .line 665
    :cond_5
    goto/16 :goto_1

    .line 666
    :cond_6
    :goto_3
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 622
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 669
    :cond_7
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(ILjava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;>;Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;>;Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;>;)Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;>;"
        }
    .end annotation

    monitor-enter p0

    .line 675
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 676
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_3

    .line 677
    new-instance v3, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-direct {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;-><init>()V

    .line 678
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_0

    .line 679
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setMaxHeartRate(I)V

    .line 682
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_1

    .line 683
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMinHeartRate()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setMinHeartRate(I)V

    .line 686
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p4, :cond_2

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_2

    .line 687
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getAvgRestHeartRate()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setAvgRestHeartRate(I)V

    .line 690
    :cond_2
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 676
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 694
    :cond_3
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic d()Ljava/lang/Object;
    .locals 1

    .line 38
    sget-object v0, Lo/dgw;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lo/dgw;ILjava/util/List;JIII)Ljava/util/List;
    .locals 1

    .line 38
    invoke-direct/range {p0 .. p7}, Lo/dgw;->c(ILjava/util/List;JIII)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static e()Lo/dgw;
    .locals 4

    .line 53
    sget-object v2, Lo/dgw;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 54
    :try_start_0
    sget-object v0, Lo/dgw;->b:Lo/dgw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 55
    new-instance v0, Lo/dgw;

    invoke-direct {v0}, Lo/dgw;-><init>()V

    sput-object v0, Lo/dgw;->b:Lo/dgw;

    .line 57
    :cond_0
    sget-object v0, Lo/dgw;->b:Lo/dgw;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 58
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 71
    sget-object v4, Lo/dgw;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 72
    :try_start_0
    new-instance v5, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 73
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v2, p3

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 74
    const/4 v6, 0x2

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 75
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 77
    iget-object v0, p0, Lo/dgw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$2;

    invoke-direct {v1, p0, p5}, Lo/dgw$2;-><init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 150
    :goto_0
    return-void

    :array_0
    .array-data 4
        0x7d2
        0x7e2
    .end array-data
.end method

.method public c(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 21

    .line 415
    sget-object v9, Lo/dgw;->d:Ljava/lang/Object;

    monitor-enter v9

    .line 418
    move/from16 v0, p5

    int-to-long v0, v0

    move/from16 v2, p4

    int-to-long v2, v2

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    add-long v0, v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v10, v0, v2

    .line 420
    :try_start_0
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 421
    new-instance v13, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v13}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 422
    const-wide/16 v0, 0x3e8

    mul-long v0, v0, p1

    invoke-virtual {v13, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 423
    invoke-virtual {v13, v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 424
    const/4 v0, 0x4

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 425
    const/4 v14, 0x2

    new-array v14, v14, [I

    fill-array-data v14, :array_0

    .line 426
    const/4 v0, 0x2

    new-array v15, v0, [Ljava/lang/String;

    const-string v0, "maxHeartRate"

    const/4 v1, 0x0

    aput-object v0, v15, v1

    const-string v0, "minHeartRate"

    const/4 v1, 0x1

    aput-object v0, v15, v1

    .line 427
    invoke-virtual {v13, v15}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 428
    invoke-virtual {v13, v14}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 429
    const/4 v0, 0x1

    move/from16 v1, p3

    if-ne v0, v1, :cond_0

    .line 430
    move/from16 v0, p5

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 431
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    goto :goto_0

    .line 434
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 435
    move/from16 v0, p3

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 437
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 438
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 440
    new-instance v16, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 441
    const-wide/16 v0, 0x3e8

    mul-long v0, v0, p1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 442
    move-object/from16 v0, v16

    invoke-virtual {v0, v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 443
    move-object/from16 v0, v16

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 444
    move-object/from16 v0, v16

    invoke-virtual {v0, v15}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 445
    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 446
    const/4 v0, 0x1

    move/from16 v1, p3

    if-ne v0, v1, :cond_1

    .line 447
    move-object/from16 v0, v16

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 448
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    goto :goto_1

    .line 451
    :cond_1
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 452
    move-object/from16 v0, v16

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 454
    :goto_1
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 455
    move-object/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [I

    move-object/from16 v17, v0

    fill-array-data v17, :array_1

    .line 458
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v18, v0

    const-string v0, "avgRestingHeartRate"

    const/4 v1, 0x0

    aput-object v0, v18, v1

    .line 460
    new-instance v19, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 461
    const-wide/16 v0, 0x3e8

    mul-long v0, v0, p1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 462
    move-object/from16 v0, v19

    invoke-virtual {v0, v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 463
    move-object/from16 v0, v19

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 464
    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 465
    move-object/from16 v0, v19

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 466
    const/4 v0, 0x1

    move/from16 v1, p3

    if-ne v0, v1, :cond_2

    .line 467
    move-object/from16 v0, v19

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 468
    move-object/from16 v0, v19

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    goto :goto_2

    .line 471
    :cond_2
    move-object/from16 v0, v19

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 472
    move-object/from16 v0, v19

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 474
    :goto_2
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 475
    move-object/from16 v0, v19

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$7;

    move-object/from16 v2, p0

    move-object/from16 v3, p6

    move-wide/from16 v4, p1

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-direct/range {v1 .. v8}, Lo/dgw$7;-><init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;JIII)V

    invoke-interface {v0, v12, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 509
    monitor-exit v9

    goto :goto_3

    :catchall_0
    move-exception v20

    monitor-exit v9

    throw v20

    .line 512
    :goto_3
    return-void

    nop

    :array_0
    .array-data 4
        0xb3c0
        0xb3c1
    .end array-data

    :array_1
    .array-data 4
        0xb3c2
    .end array-data
.end method

.method public c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 154
    sget-object v4, Lo/dgw;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 155
    :try_start_0
    new-instance v5, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 156
    invoke-virtual {v5, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 157
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getVo2maxDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 159
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 160
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 161
    iget-object v0, p0, Lo/dgw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$4;

    invoke-direct {v1, p0, p5}, Lo/dgw$4;-><init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 219
    :goto_0
    return-void

    :array_0
    .array-data 4
        0xa416
    .end array-data
.end method

.method public c(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 832
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "heart_rate_last"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 833
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 834
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 835
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 836
    invoke-virtual {v4, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 837
    invoke-virtual {v4, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 838
    invoke-virtual {v4, v2}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 839
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 840
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 841
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 842
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 843
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 845
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$1;

    invoke-direct {v1, p0, p6}, Lo/dgw$1;-><init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 863
    return-void

    :array_0
    .array-data 4
        0xb3c3
    .end array-data
.end method

.method public d(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 586
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRestHeartRateData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "rest_heart_rate_max"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 588
    const/4 v5, 0x1

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 589
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 590
    invoke-virtual {v6, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 591
    invoke-virtual {v6, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 592
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 593
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 594
    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 595
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 596
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 597
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 599
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$6;

    invoke-direct {v1, p0, p6}, Lo/dgw$6;-><init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 616
    return-void

    nop

    :array_0
    .array-data 4
        0x7e2
    .end array-data
.end method

.method public e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 344
    sget-object v4, Lo/dgw;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 345
    :try_start_0
    new-instance v5, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 346
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v2, p3

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 347
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 348
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 349
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 350
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 352
    iget-object v0, p0, Lo/dgw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$3;

    invoke-direct {v1, p0, p5}, Lo/dgw$3;-><init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 400
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 402
    :goto_0
    return-void

    :array_0
    .array-data 4
        0xb3c3
    .end array-data
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 222
    sget-object v2, Lo/dgw;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 223
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 225
    new-instance v5, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 226
    invoke-virtual {v5, v3, v4}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 227
    invoke-virtual {v5, v3, v4}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 228
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 229
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 230
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 231
    iget-object v0, p0, Lo/dgw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$5;

    invoke-direct {v1, p0, p1, v3, v4}, Lo/dgw$5;-><init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;J)V

    invoke-interface {v0, v5, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 331
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7

    .line 332
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0xa417
    .end array-data
.end method
