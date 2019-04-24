.class public Lo/crz;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqn;

.field private b:Lo/cqy;

.field private e:Lo/cqz;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 46
    iget-object v0, p0, Lo/crz;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lo/crz;->a:Lo/cqn;

    .line 47
    iget-object v0, p0, Lo/crz;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/crz;->e:Lo/cqz;

    .line 48
    iget-object v0, p0, Lo/crz;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/crz;->b:Lo/cqy;

    .line 49
    return-void
.end method

.method private a(JIIIIDI)Z
    .locals 5

    .line 475
    const-wide/16 v0, 0x0

    cmpg-double v0, p7, v0

    if-gez v0, :cond_0

    .line 476
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOneSportStat()  statValue is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p7, p8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    const/4 v0, 0x0

    return v0

    .line 479
    :cond_0
    const-wide/16 v0, 0x0

    cmpl-double v0, p7, v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lo/crz;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 480
    const/4 v0, 0x0

    return v0

    .line 482
    :cond_1
    new-instance v4, Lo/cob;

    invoke-direct {v4}, Lo/cob;-><init>()V

    .line 483
    invoke-virtual {v4, p1, p2}, Lo/cob;->a(J)V

    .line 484
    const/16 v0, 0x4e21

    invoke-virtual {v4, v0}, Lo/cob;->d(I)V

    .line 485
    invoke-virtual {v4, p5}, Lo/cob;->b(I)V

    .line 486
    invoke-virtual {v4, p4}, Lo/cob;->e(I)V

    .line 487
    invoke-virtual {v4, p6}, Lo/cob;->f(I)V

    .line 488
    invoke-virtual {v4, p9}, Lo/cob;->i(I)V

    .line 489
    invoke-virtual {v4, p3}, Lo/cob;->a(I)V

    .line 490
    invoke-virtual {v4, p7, p8}, Lo/cob;->e(D)V

    .line 491
    iget-object v0, p0, Lo/crz;->d:Lo/cqd;

    invoke-virtual {v0, v4}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/util/List;[Ljava/lang/String;JIII)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[Ljava/lang/String;JIII)Z"
        }
    .end annotation

    .line 370
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 371
    const/4 v0, 0x0

    return v0

    .line 373
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 375
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x0

    aget-object v3, p2, v3

    .line 376
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 375
    const v3, 0x9c4d

    const/4 v9, 0x1

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 377
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveClimbSessionStat()  step change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x1

    aget-object v3, p2, v3

    .line 380
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 379
    const v3, 0x9c62

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 381
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveClimbSessionStat()  distance change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x2

    aget-object v3, p2, v3

    .line 384
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 383
    const v3, 0x9c58

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 385
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveClimbSessionStat()  calorie change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    const/4 v0, 0x1

    return v0
.end method

.method private b(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 4

    .line 101
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceDayStepsSum() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    iget-object v0, p0, Lo/crz;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnw;->a(Landroid/content/Context;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cnw;->b(Lcom/huawei/hihealth/HiHealthData;)V

    .line 103
    return-void
.end method

.method private b(Ljava/util/List;[Ljava/lang/String;JIII)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[Ljava/lang/String;JIII)Z"
        }
    .end annotation

    .line 330
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    const/4 v0, 0x0

    return v0

    .line 333
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 334
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x0

    aget-object v3, p2, v3

    .line 335
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 334
    const v3, 0x9c4c

    const/4 v9, 0x1

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 336
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRunSessionStat()  step change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x1

    aget-object v3, p2, v3

    .line 339
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 338
    const v3, 0x9c60

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 340
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRunSessionStat()  distance change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x2

    aget-object v3, p2, v3

    .line 343
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 342
    const v3, 0x9c56

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 344
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRunSessionStat()  calorie change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const/4 v0, 0x1

    return v0
.end method

.method private c(Lcom/huawei/hihealth/HiAggregateOption;Ljava/util/List;[Ljava/lang/String;JIII)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiAggregateOption;Ljava/util/List<Ljava/lang/Integer;>;[Ljava/lang/String;JIII)Z"
        }
    .end annotation

    .line 141
    const/16 v0, 0x4e21

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAlignType(I)V

    .line 144
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, p1}, Lo/cqn;->d(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v9

    .line 146
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 148
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, p1}, Lo/cqn;->g(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v10

    .line 150
    move-object v0, p0

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lo/crz;->c(Ljava/util/List;Ljava/util/List;[Ljava/lang/String;JIII)Z

    .line 152
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 154
    const/16 v0, 0x4e22

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAlignType(I)V

    .line 155
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, p1}, Lo/cqn;->e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v9

    .line 156
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v2, p3

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/crz;->c(Ljava/util/List;[Ljava/lang/String;JIII)Z

    .line 159
    const/16 v0, 0x4e23

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAlignType(I)V

    .line 160
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, p1}, Lo/cqn;->e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v9

    .line 161
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v2, p3

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/crz;->b(Ljava/util/List;[Ljava/lang/String;JIII)Z

    .line 164
    const/16 v0, 0x4e25

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAlignType(I)V

    .line 165
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, p1}, Lo/cqn;->e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v9

    .line 166
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v2, p3

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/crz;->e(Ljava/util/List;[Ljava/lang/String;JIII)Z

    .line 169
    const/16 v0, 0x4e24

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAlignType(I)V

    .line 170
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, p1}, Lo/cqn;->e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v9

    .line 171
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v2, p3

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/crz;->a(Ljava/util/List;[Ljava/lang/String;JIII)Z

    .line 174
    const/16 v0, 0x4e27

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAlignType(I)V

    .line 175
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, p1}, Lo/cqn;->e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v9

    .line 176
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v2, p3

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/crz;->d(Ljava/util/List;[Ljava/lang/String;JIII)Z

    .line 179
    new-instance v11, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v11}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 180
    const/4 v12, 0x1

    new-array v12, v12, [I

    fill-array-data v12, :array_0

    .line 181
    const/4 v0, 0x1

    new-array v13, v0, [Ljava/lang/String;

    const-string v0, "duration"

    const/4 v1, 0x0

    aput-object v0, v13, v1

    .line 182
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 183
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 184
    invoke-virtual {v11, v12}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 185
    invoke-virtual {v11, v13}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 186
    const/4 v0, 0x3

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 187
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 188
    iget-object v0, p0, Lo/crz;->a:Lo/cqn;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, v11}, Lo/cqn;->b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v9

    .line 189
    move-object v0, p0

    move-object v1, v9

    move-wide/from16 v2, p4

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lo/crz;->d(Ljava/util/List;JIII)Z

    .line 190
    const/4 v0, 0x1

    return v0

    :array_0
    .array-data 4
        0x4e21
    .end array-data
.end method

.method private c(Ljava/util/List;Ljava/util/List;[Ljava/lang/String;JIII)Z
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[Ljava/lang/String;JIII)Z"
        }
    .end annotation

    .line 228
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllSessionStat()  statDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",deviceDatas = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    invoke-static/range {p4 .. p5}, Lo/cnk;->a(J)I

    move-result v1

    move/from16 v2, p6

    const v3, 0x9c76

    invoke-static {v0, v2, v1, v3}, Lo/cui;->a(Landroid/content/Context;III)I

    move-result v0

    int-to-double v10, v0

    .line 231
    invoke-static/range {p1 .. p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static/range {p2 .. p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 232
    :cond_0
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllSessionStat()  statDatas or deviceDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    const-wide/16 v0, 0x0

    cmpl-double v0, v10, v0

    if-lez v0, :cond_1

    .line 234
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllSessionStat()  only fitnessExerciseCalories write to table "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    move-object/from16 v0, p0

    move-wide/from16 v1, p4

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    move-wide v7, v10

    const v3, 0x9c43

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    .line 238
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 240
    :cond_2
    const/4 v12, 0x0

    .line 241
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 242
    const/4 v0, 0x0

    aget-object v0, p3, v0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v14

    .line 243
    const/4 v0, 0x1

    aget-object v0, p3, v0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v16

    .line 244
    const/4 v0, 0x2

    aget-object v0, p3, v0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    .line 245
    const/4 v0, 0x3

    aget-object v0, p3, v0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v20

    .line 247
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 248
    const/4 v12, 0x1

    .line 249
    const-string v0, "HiH_HiSportStat"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSessionStat merge Stat: s="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",d="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",c="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",a="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 250
    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 249
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :cond_3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_0
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/huawei/hihealth/HiHealthData;

    .line 254
    if-eqz v12, :cond_4

    .line 255
    const-string v0, "HiH_HiSportStat"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSessionStat device Stat: s="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget-object v2, p3, v2

    move-object/from16 v3, v23

    invoke-virtual {v3, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",d="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aget-object v2, p3, v2

    .line 256
    move-object/from16 v3, v23

    invoke-virtual {v3, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",c="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aget-object v2, p3, v2

    move-object/from16 v3, v23

    invoke-virtual {v3, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",a="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aget-object v2, p3, v2

    move-object/from16 v3, v23

    invoke-virtual {v3, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 255
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    :cond_4
    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    cmpg-double v0, v14, v0

    if-gez v0, :cond_5

    .line 260
    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v14

    .line 262
    :cond_5
    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    cmpg-double v0, v16, v0

    if-gez v0, :cond_6

    .line 263
    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v16

    .line 265
    :cond_6
    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    cmpg-double v0, v18, v0

    if-gez v0, :cond_7

    .line 266
    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    .line 268
    :cond_7
    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    cmpg-double v0, v20, v0

    if-gez v0, :cond_8

    .line 269
    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v20

    .line 271
    :cond_8
    goto/16 :goto_0

    .line 273
    :cond_9
    add-double v18, v18, v10

    .line 275
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    move/from16 v1, p6

    move-wide v3, v14

    move/from16 v5, p8

    .line 276
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v6

    .line 275
    const v2, 0x9c42

    invoke-static/range {v0 .. v7}, Lo/csa;->e(Landroid/content/Context;IIDIJ)I

    move-result v22

    .line 277
    move-object/from16 v0, p0

    move-wide/from16 v1, p4

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, v22

    move-wide v7, v14

    const v3, 0x9c42

    const/4 v9, 0x1

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v23

    .line 279
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllSessionStat()  step change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p5}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    move/from16 v1, p6

    move-wide/from16 v3, v16

    move/from16 v5, p8

    .line 283
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v6

    .line 282
    const v2, 0x9c44

    invoke-static/range {v0 .. v7}, Lo/csa;->e(Landroid/content/Context;IIDIJ)I

    move-result v24

    .line 284
    move-object/from16 v0, p0

    move-wide/from16 v1, p4

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, v24

    move-wide/from16 v7, v16

    const v3, 0x9c44

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v23

    .line 286
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllSessionStat()  distance change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p5}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    move/from16 v1, p6

    move-wide/from16 v3, v18

    move/from16 v5, p8

    .line 290
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v6

    .line 289
    const v2, 0x9c43

    invoke-static/range {v0 .. v7}, Lo/csa;->e(Landroid/content/Context;IIDIJ)I

    move-result v25

    .line 291
    move-object/from16 v0, p0

    move-wide/from16 v1, p4

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, v25

    move-wide/from16 v7, v18

    const v3, 0x9c43

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v23

    .line 293
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllSessionStat()  calorie change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p5}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    move/from16 v1, p6

    move-wide/from16 v3, v20

    move/from16 v5, p8

    .line 297
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v6

    .line 296
    const v2, 0x9c45

    invoke-static/range {v0 .. v7}, Lo/csa;->e(Landroid/content/Context;IIDIJ)I

    move-result v26

    .line 298
    move-object/from16 v0, p0

    move-wide/from16 v1, p4

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, v26

    move-wide/from16 v7, v20

    const v3, 0x9c45

    const/4 v9, 0x4

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v23

    .line 300
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllSessionStat()  altitude change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p5}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    const/4 v0, 0x1

    return v0
.end method

.method private c(Ljava/util/List;[Ljava/lang/String;JIII)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[Ljava/lang/String;JIII)Z"
        }
    .end annotation

    .line 308
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWalkSessionStat()  statDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    const/4 v0, 0x0

    return v0

    .line 312
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 313
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x0

    aget-object v3, p2, v3

    .line 314
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 313
    const v3, 0x9c4b

    const/4 v9, 0x1

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 315
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWalkSessionStat()  step change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x1

    aget-object v3, p2, v3

    .line 318
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 317
    const v3, 0x9c5f

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 319
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWalkSessionStat()  distance change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x2

    aget-object v3, p2, v3

    .line 322
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 321
    const v3, 0x9c55

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 323
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWalkSessionStat()  calorie change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const/4 v0, 0x1

    return v0
.end method

.method private d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 495
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 497
    const v0, 0x9c4b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 498
    const v0, 0x9c5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 499
    const v0, 0x9c55

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 501
    const v0, 0x9c4c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    const v0, 0x9c60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 503
    const v0, 0x9c56

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    const v0, 0x9c4d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    const v0, 0x9c62

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 507
    const v0, 0x9c58

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 509
    const v0, 0x9c61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 510
    const v0, 0x9c57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 512
    const v0, 0x9c63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 513
    const v0, 0x9c59

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 515
    return-object v1
.end method

.method private d(Lcom/huawei/hihealth/HiAggregateOption;I[Ljava/lang/String;JI)Z
    .locals 11

    .line 108
    iget-object v0, p0, Lo/crz;->e:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->a(III)I

    move-result v9

    .line 109
    if-gtz v9, :cond_0

    .line 110
    const/4 v0, 0x0

    return v0

    .line 112
    :cond_0
    iget-object v0, p0, Lo/crz;->b:Lo/cqy;

    invoke-virtual {v0, p2}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v10

    .line 113
    invoke-static {v10}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    move-object v0, p0

    move-object v1, p1

    move-object v2, v10

    move-object v3, p3

    move-wide v4, p4

    move v6, p2

    move v7, v9

    move/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lo/crz;->c(Lcom/huawei/hihealth/HiAggregateOption;Ljava/util/List;[Ljava/lang/String;JIII)Z

    .line 116
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private d(Ljava/util/List;JIII)Z
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;JIII)Z"
        }
    .end annotation

    .line 412
    invoke-static/range {p1 .. p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 413
    const/4 v0, 0x0

    return v0

    .line 415
    :cond_0
    const-wide/16 v10, 0x0

    .line 416
    const-wide/16 v12, 0x0

    .line 417
    const-wide/16 v14, 0x0

    .line 418
    const-wide/16 v16, 0x0

    .line 419
    const-wide/16 v18, 0x0

    .line 420
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/hihealth/HiHealthData;

    .line 421
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 423
    :pswitch_0
    const-string v0, "duration"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 424
    goto :goto_1

    .line 426
    :pswitch_1
    const-string v0, "duration"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 427
    goto :goto_1

    .line 429
    :pswitch_2
    const-string v0, "duration"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v14

    .line 430
    goto :goto_1

    .line 432
    :pswitch_3
    const-string v0, "duration"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v16

    .line 433
    goto :goto_1

    .line 435
    :pswitch_4
    const-string v0, "duration"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    .line 436
    .line 440
    :goto_1
    :pswitch_5
    goto :goto_0

    .line 441
    :cond_1
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide v7, v10

    const v3, 0x9c69

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v20

    .line 443
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDurationSessionStat()  walkDuration change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide v7, v12

    const v3, 0x9c6a

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v20

    .line 447
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDurationSessionStat()  runDuration change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide v7, v14

    const v3, 0x9c6b

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v20

    .line 451
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDurationSessionStat()  cycleDuration change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide/from16 v7, v16

    const v3, 0x9c6c

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v20

    .line 455
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDurationSessionStat()  climbDuration change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide/from16 v7, v18

    const v3, 0x9c6d

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v20

    .line 459
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDurationSessionStat()  swimDuration change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    add-double v0, v10, v12

    add-double/2addr v0, v14

    add-double v0, v0, v16

    add-double v21, v0, v18

    .line 462
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide/from16 v7, v21

    const v3, 0x9c46

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v20

    .line 464
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDurationSessionStat()  totalDuration change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x4e22
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private d(Ljava/util/List;[Ljava/lang/String;JIII)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[Ljava/lang/String;JIII)Z"
        }
    .end annotation

    .line 393
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 394
    const/4 v0, 0x0

    return v0

    .line 396
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 397
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSwimSessionStat()  statDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x1

    aget-object v3, p2, v3

    .line 399
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 398
    const v3, 0x9c63

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 400
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSwimSessionStat()  distance change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x2

    aget-object v3, p2, v3

    .line 403
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 402
    const v3, 0x9c59

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 404
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSwimSessionStat()  calorie change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    const/4 v0, 0x1

    return v0
.end method

.method private e(Ljava/util/List;[Ljava/lang/String;JIII)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[Ljava/lang/String;JIII)Z"
        }
    .end annotation

    .line 351
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    const/4 v0, 0x0

    return v0

    .line 354
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 356
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x1

    aget-object v3, p2, v3

    .line 357
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 356
    const v3, 0x9c61

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 358
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveCycleSessionStat()  distance change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    move-object v0, p0

    move-wide v1, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    const/4 v3, 0x2

    aget-object v3, p2, v3

    .line 361
    invoke-virtual {v10, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 360
    const v3, 0x9c57

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lo/crz;->a(JIIIIDI)Z

    move-result v11

    .line 362
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveCycleSessionStat()  calorie change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public e(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 18

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 54
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v9

    .line 58
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 59
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v12

    .line 60
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() sportData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",startTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",endTime = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 61
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 60
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const/4 v14, 0x4

    new-array v14, v14, [I

    fill-array-data v14, :array_0

    .line 65
    const/4 v0, 0x4

    new-array v15, v0, [Ljava/lang/String;

    const-string v0, "step"

    const/4 v1, 0x0

    aput-object v0, v15, v1

    const-string v0, "distance"

    const/4 v1, 0x1

    aput-object v0, v15, v1

    const-string v0, "calorie"

    const/4 v1, 0x2

    aput-object v0, v15, v1

    const-string v0, "altitude_offset"

    const/4 v1, 0x3

    aput-object v0, v15, v1

    .line 67
    new-instance v16, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 68
    move-object/from16 v0, v16

    invoke-virtual {v0, v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 69
    move-object/from16 v0, v16

    invoke-virtual {v0, v12, v13}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 70
    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 71
    move-object/from16 v0, v16

    invoke-virtual {v0, v15}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 72
    move-object/from16 v0, v16

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 73
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 75
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v17

    .line 77
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move v2, v9

    move-object v3, v15

    move-wide v4, v10

    move/from16 v6, v17

    invoke-direct/range {v0 .. v6}, Lo/crz;->d(Lcom/huawei/hihealth/HiAggregateOption;I[Ljava/lang/String;JI)Z

    .line 79
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/crz;->b(Lcom/huawei/hihealth/HiHealthData;)V

    .line 82
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->a(J)I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    .line 83
    invoke-static {v0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const v1, 0x9c76

    if-ne v1, v0, :cond_2

    .line 85
    :cond_1
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() send  stepSum change broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 87
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crz;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 95
    :cond_2
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x1

    return v0

    nop

    :array_0
    .array-data 4
        0x2
        0x3
        0x4
        0x5
    .end array-data
.end method
