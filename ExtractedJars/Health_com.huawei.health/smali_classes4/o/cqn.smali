.class public Lo/cqn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqn$e;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private c:Lo/cor;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    sget-object v0, Lo/cqn;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cor;->b(Landroid/content/Context;)Lo/cor;

    move-result-object v0

    iput-object v0, p0, Lo/cqn;->c:Lo/cor;

    .line 42
    return-void
.end method

.method synthetic constructor <init>(Lo/cqn$1;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/cqn;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/cqn;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqn;->e:Landroid/content/Context;

    .line 54
    sget-object v0, Lo/cqn$e;->d:Lo/cqn;

    return-object v0
.end method

.method private b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 497
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v10

    .line 498
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 502
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v15

    .line 503
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v16

    .line 504
    const/16 v17, 0x0

    :goto_0
    array-length v0, v15

    move/from16 v1, v17

    if-ge v1, v0, :cond_3

    .line 505
    aget v12, v15, v17

    .line 506
    aget-object v13, v10, v17

    .line 507
    sparse-switch v12, :sswitch_data_0

    goto/16 :goto_1

    .line 510
    :sswitch_0
    if-eqz p3, :cond_0

    .line 511
    add-int/lit8 v0, v16, 0x5

    new-array v8, v0, [Ljava/lang/String;

    .line 512
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 513
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 514
    const/16 v0, 0x55f0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 515
    const/16 v0, 0x5653

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 516
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 517
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v12

    move-object v5, v13

    const/4 v2, 0x5

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_4

    .line 519
    :cond_0
    add-int/lit8 v0, v16, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 520
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 521
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 522
    const/16 v0, 0x55f0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 523
    const/16 v0, 0x5653

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 524
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v12

    move-object v5, v13

    const/4 v2, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 526
    goto/16 :goto_4

    .line 529
    :goto_1
    if-eqz p3, :cond_1

    .line 530
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 532
    :sswitch_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2, v12}, Lo/cqn;->b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;I)[Ljava/lang/String;

    move-result-object v8

    .line 533
    move-object/from16 v0, p1

    const/16 v1, 0x9

    const/4 v2, 0x1

    invoke-static {v13, v0, v8, v1, v2}, Lo/cpn;->b(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v9

    .line 534
    goto/16 :goto_4

    .line 536
    :goto_2
    add-int/lit8 v0, v16, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 537
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 538
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 539
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 540
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 541
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v12

    move-object v5, v13

    const/4 v2, 0x4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 542
    goto/16 :goto_4

    .line 545
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    .line 547
    :sswitch_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    new-array v8, v0, [Ljava/lang/String;

    .line 548
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 549
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 550
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 551
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 552
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 553
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v8, v1

    .line 554
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v8, v1

    .line 555
    move-object/from16 v0, p1

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v13, v0, v8, v1, v2}, Lo/cpn;->b(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v9

    .line 556
    goto :goto_4

    .line 558
    :goto_3
    add-int/lit8 v0, v16, 0x3

    new-array v8, v0, [Ljava/lang/String;

    .line 559
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 560
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 561
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 562
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v12

    move-object v5, v13

    const/4 v2, 0x3

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 569
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v9, v8}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 570
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto :goto_5

    .line 573
    :sswitch_3
    invoke-static {v7, v13}, Lo/cph;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    .line 574
    goto :goto_6

    .line 576
    :goto_5
    invoke-static {v7, v13}, Lo/cph;->b(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    .line 579
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 581
    invoke-interface {v11, v14}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 504
    :cond_2
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_0

    .line 584
    :cond_3
    return-object v11

    :sswitch_data_0
    .sparse-switch
        0x55f0 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x6 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x6 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x6 -> :sswitch_3
    .end sparse-switch
.end method

.method private b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;I)[Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;I)[Ljava/lang/String;"
        }
    .end annotation

    .line 590
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x9

    new-array v2, v0, [Ljava/lang/String;

    .line 591
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 592
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 593
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 594
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 595
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v2, v1

    .line 596
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v2, v1

    .line 597
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v2, v1

    .line 598
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    aput-object v0, v2, v1

    .line 599
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    aput-object v0, v2, v1

    .line 600
    return-object v2
.end method

.method private c(Ljava/util/List;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 353
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    :cond_0
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    return-object p1

    .line 357
    :cond_1
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "filterMainUserIDData enter datas ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v4

    .line 359
    sget-object v0, Lo/cqn;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cpw;->g(I)I

    move-result v5

    .line 360
    sget-object v0, Lo/cqn;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cqs;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 361
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 362
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    return-object p1

    .line 365
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 366
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 367
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 368
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v11

    .line 369
    if-eqz v11, :cond_3

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "null"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "0"

    .line 370
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 371
    :cond_3
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    :cond_4
    goto :goto_0

    .line 374
    :cond_5
    if-lez p2, :cond_8

    .line 375
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p2, :cond_6

    move v0, p2

    goto :goto_1

    :cond_6
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    move p2, v0

    .line 376
    const/4 v9, 0x0

    :goto_2
    if-ge v9, p2, :cond_7

    .line 377
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 376
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_7
    goto :goto_3

    .line 380
    :cond_8
    invoke-interface {v8, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 382
    :goto_3
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "filterMainUserIDData datas="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    return-object v8
.end method

.method private c(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 404
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v9

    .line 407
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 410
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v15

    .line 411
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v16

    .line 412
    const/16 v17, 0x0

    :goto_0
    array-length v0, v15

    move/from16 v1, v17

    if-ge v1, v0, :cond_3

    .line 413
    aget v14, v15, v17

    .line 414
    aget-object v7, v9, v17

    .line 415
    sparse-switch v14, :sswitch_data_0

    goto/16 :goto_1

    .line 417
    :sswitch_0
    if-eqz p3, :cond_0

    .line 418
    add-int/lit8 v0, v16, 0x5

    new-array v8, v0, [Ljava/lang/String;

    .line 419
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 420
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 421
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 422
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 423
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 424
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v14

    move-object v5, v7

    const/4 v2, 0x5

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/cpn;->c(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_4

    .line 426
    :cond_0
    add-int/lit8 v0, v16, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 427
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 428
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 429
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 430
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 431
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v14

    move-object v5, v7

    const/4 v2, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/cpn;->c(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    .line 433
    goto/16 :goto_4

    .line 437
    :goto_1
    if-eqz p3, :cond_1

    .line 438
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 440
    :sswitch_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2, v14}, Lo/cqn;->b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;I)[Ljava/lang/String;

    move-result-object v8

    .line 441
    move-object/from16 v0, p1

    const/16 v1, 0x9

    const/4 v2, 0x1

    invoke-static {v7, v0, v8, v1, v2}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v10

    .line 442
    goto/16 :goto_4

    .line 444
    :goto_2
    add-int/lit8 v0, v16, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 445
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 446
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 447
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 448
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 449
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v14

    move-object v5, v7

    const/4 v2, 0x4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/cpn;->c(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    .line 450
    goto/16 :goto_4

    .line 453
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    .line 455
    :sswitch_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    new-array v8, v0, [Ljava/lang/String;

    .line 456
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 457
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 458
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 459
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 460
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 461
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v8, v1

    .line 462
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v8, v1

    .line 463
    move-object/from16 v0, p1

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v7, v0, v8, v1, v2}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v10

    .line 464
    goto :goto_4

    .line 466
    :goto_3
    add-int/lit8 v0, v16, 0x3

    new-array v8, v0, [Ljava/lang/String;

    .line 467
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 468
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 469
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 470
    move-object/from16 v0, p1

    move-object v1, v8

    move-object/from16 v3, p2

    move v4, v14

    move-object v5, v7

    const/4 v2, 0x3

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/cpn;->c(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    .line 477
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v10, v8}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 478
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto :goto_5

    .line 480
    :sswitch_3
    invoke-static {v11, v7}, Lo/cph;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 481
    goto :goto_6

    .line 483
    :goto_5
    invoke-static {v11, v7}, Lo/cph;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 486
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 487
    invoke-interface {v12, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 412
    :cond_2
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_0

    .line 490
    :cond_3
    return-object v12

    :sswitch_data_0
    .sparse-switch
        0x4e21 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x6 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x6 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x6 -> :sswitch_3
    .end sparse-switch
.end method

.method private e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 607
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 611
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v14

    .line 612
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v15

    .line 613
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v16

    .line 614
    const/16 v17, 0x0

    :goto_0
    array-length v0, v14

    move/from16 v1, v17

    if-ge v1, v0, :cond_3

    .line 615
    aget v11, v14, v17

    .line 616
    aget-object v12, v15, v17

    .line 617
    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_1

    .line 620
    :sswitch_0
    if-eqz p3, :cond_0

    .line 621
    add-int/lit8 v0, v16, 0x5

    new-array v7, v0, [Ljava/lang/String;

    .line 622
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 623
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 624
    const/16 v0, 0x5654

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 625
    const/16 v0, 0x56b7

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 626
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v7, v1

    .line 627
    move-object/from16 v0, p1

    move-object v1, v7

    move-object/from16 v3, p2

    move v4, v11

    move-object v5, v12

    const/4 v2, 0x5

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/cpn;->b(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_4

    .line 629
    :cond_0
    add-int/lit8 v0, v16, 0x4

    new-array v7, v0, [Ljava/lang/String;

    .line 630
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 631
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 632
    const/16 v0, 0x5654

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 633
    const/16 v0, 0x56b7

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 634
    move-object/from16 v0, p1

    move-object v1, v7

    move-object/from16 v3, p2

    move v4, v11

    move-object v5, v12

    const/4 v2, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/cpn;->b(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 636
    goto/16 :goto_4

    .line 639
    :goto_1
    if-eqz p3, :cond_1

    .line 640
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 642
    :sswitch_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2, v11}, Lo/cqn;->b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;I)[Ljava/lang/String;

    move-result-object v7

    .line 643
    move-object/from16 v0, p1

    const/16 v1, 0x9

    const/4 v2, 0x1

    invoke-static {v12, v0, v7, v1, v2}, Lo/cpn;->a(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v8

    .line 644
    goto/16 :goto_4

    .line 646
    :goto_2
    add-int/lit8 v0, v16, 0x4

    new-array v7, v0, [Ljava/lang/String;

    .line 647
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 648
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 649
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 650
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 651
    move-object/from16 v0, p1

    move-object v1, v7

    move-object/from16 v3, p2

    move v4, v11

    move-object v5, v12

    const/4 v2, 0x4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/cpn;->b(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 652
    goto/16 :goto_4

    .line 655
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    .line 657
    :sswitch_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    new-array v7, v0, [Ljava/lang/String;

    .line 658
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 659
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 660
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 661
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 662
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v7, v1

    .line 663
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v7, v1

    .line 664
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v7, v1

    .line 665
    move-object/from16 v0, p1

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v12, v0, v7, v1, v2}, Lo/cpn;->a(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v8

    .line 666
    goto :goto_4

    .line 668
    :goto_3
    add-int/lit8 v0, v16, 0x3

    new-array v7, v0, [Ljava/lang/String;

    .line 669
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 670
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 671
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 672
    move-object/from16 v0, p1

    move-object v1, v7

    move-object/from16 v3, p2

    move v4, v11

    move-object v5, v12

    const/4 v2, 0x3

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/cpn;->b(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 678
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v8, v7}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 679
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " queryAggregateCoreSessionData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto :goto_5

    .line 682
    :sswitch_3
    invoke-static {v9, v12}, Lo/cph;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 683
    goto :goto_6

    .line 685
    :goto_5
    invoke-static {v9, v12}, Lo/cph;->b(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 688
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 689
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    invoke-interface {v10, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 614
    :cond_2
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_0

    .line 693
    :cond_3
    return-object v10

    :sswitch_data_0
    .sparse-switch
        0x5654 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x6 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x6 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x6 -> :sswitch_3
    .end sparse-switch
.end method

.method private e(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 345
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 346
    :cond_0
    return-void

    .line 348
    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 349
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 348
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 351
    :cond_2
    return-void
.end method


# virtual methods
.method public a(ILcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 785
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v0

    array-length v2, v0

    .line 786
    add-int/lit8 v0, v2, 0x3

    new-array v3, v0, [Ljava/lang/String;

    .line 787
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 788
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 789
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 790
    const/4 v0, 0x3

    invoke-static {p2, v3, v0}, Lo/cpn;->c(Lcom/huawei/hihealth/HiAggregateOption;[Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 792
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v4, v3}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 793
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/cph;->g(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 116
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 117
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAlignType()I

    move-result v3

    .line 120
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    .line 122
    :sswitch_0
    mul-int/lit8 v0, v2, 0x2

    add-int/lit8 v0, v0, 0x6

    new-array v4, v0, [Ljava/lang/String;

    .line 123
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 124
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 125
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 126
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 127
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v4, v1

    .line 128
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v4, v1

    .line 129
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-static {p1, v4, v0, p2, v1}, Lo/cpn;->a(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v5

    .line 130
    goto :goto_1

    .line 132
    :goto_0
    mul-int/lit8 v0, v2, 0x2

    add-int/lit8 v0, v0, 0x5

    new-array v4, v0, [Ljava/lang/String;

    .line 133
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 134
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 135
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 136
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 137
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v4, v1

    .line 138
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-static {p1, v4, v0, p2, v1}, Lo/cpn;->a(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v5

    .line 143
    :goto_1
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v5, v4}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 144
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lo/cph;->h(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x4e21 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(ILcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 84
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, 0x3

    new-array v3, v0, [Ljava/lang/String;

    .line 85
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 86
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 87
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 88
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v0, v1, p3, v3, v2}, Lo/cpn;->e([I[Ljava/lang/String;I[Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 90
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v4, v3}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 91
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/cph;->b(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(JJILjava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 842
    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    new-array v6, v0, [Ljava/lang/String;

    .line 843
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 844
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 845
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 846
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 847
    const-string v0, "select distinct(client_id) from sample_point where "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 848
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 849
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 850
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 851
    const-string v0, "client_id"

    move-object v1, p6

    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result v2

    move-object v3, v7

    move-object v4, v6

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 852
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 853
    const-string v0, "client_id"

    invoke-static {v8, v0}, Lo/cph;->p(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 210
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    .line 211
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v7

    .line 212
    const/4 v0, 0x0

    aget v8, v7, v0

    .line 213
    invoke-static {v8}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v9

    .line 214
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v10

    .line 219
    const/4 v14, 0x0

    .line 220
    sget-object v0, Lo/cqn$1;->c:[I

    invoke-virtual {v9}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 222
    :pswitch_0
    const/16 v0, 0x5208

    if-gt v8, v0, :cond_0

    .line 223
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/cqn;->c(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;

    move-result-object v14

    goto/16 :goto_1

    .line 224
    :cond_0
    const/16 v0, 0x5653

    if-gt v8, v0, :cond_1

    .line 225
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/cqn;->b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;

    move-result-object v14

    goto/16 :goto_1

    .line 227
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/cqn;->e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;

    move-result-object v14

    .line 229
    goto/16 :goto_1

    .line 232
    :pswitch_1
    array-length v0, v7

    add-int/2addr v0, v6

    add-int/lit8 v0, v0, 0x3

    new-array v11, v0, [Ljava/lang/String;

    .line 233
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 234
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 235
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 236
    const/16 v0, 0x7d0

    if-ge v8, v0, :cond_2

    .line 237
    move-object/from16 v0, p1

    const/4 v1, 0x3

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-static {v0, v11, v1, v2, v3}, Lo/cpn;->b(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v12

    .line 238
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v12, v11}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 239
    invoke-static {v13, v10}, Lo/cph;->d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    goto/16 :goto_1

    .line 240
    :cond_2
    const/16 v0, 0x7e3

    if-lt v8, v0, :cond_4

    const/16 v0, 0x7e6

    if-gt v0, v8, :cond_3

    const/16 v0, 0x7f1

    if-ge v0, v8, :cond_4

    :cond_3
    const/16 v0, 0x835

    if-ne v8, v0, :cond_5

    .line 243
    :cond_4
    move-object/from16 v0, p1

    const/4 v1, 0x3

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-static {v0, v11, v1, v2, v3}, Lo/cpn;->i(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v12

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v12, v11}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 245
    invoke-static {v13, v10}, Lo/cph;->k(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    goto/16 :goto_1

    .line 247
    :cond_5
    move-object/from16 v0, p1

    const/4 v1, 0x3

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-static {v0, v11, v1, v2, v3}, Lo/cpn;->h(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v12

    .line 248
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v12, v11}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 249
    invoke-static {v13, v10}, Lo/cph;->k(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    .line 252
    goto/16 :goto_1

    .line 255
    :pswitch_2
    add-int/lit8 v0, v6, 0x4

    new-array v11, v0, [Ljava/lang/String;

    .line 256
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 257
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 258
    const/4 v0, 0x0

    aget v0, v7, v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 259
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v11, v1

    .line 260
    move-object/from16 v0, p1

    const/4 v1, 0x4

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-static {v0, v11, v1, v2, v3}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v12

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v12, v11}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 263
    invoke-static {v13, v10}, Lo/cph;->o(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    .line 264
    goto/16 :goto_1

    .line 267
    :pswitch_3
    const/16 v0, 0x2716

    if-ne v0, v8, :cond_a

    .line 268
    invoke-static {v8}, Lo/cmk;->e(I)[I

    move-result-object v15

    .line 269
    invoke-static {v8}, Lo/clv;->b(I)[Ljava/lang/String;

    move-result-object v16

    .line 270
    move-object/from16 v0, p2

    invoke-virtual {v0, v15}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 271
    move-object/from16 v0, p2

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 272
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getCount()I

    move-result v17

    .line 273
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getFilter()Ljava/lang/String;

    move-result-object v18

    .line 274
    if-lez v17, :cond_6

    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-ne v0, v1, :cond_6

    .line 275
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 277
    :cond_6
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_7

    const-string v0, ""

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 278
    :cond_7
    array-length v0, v15

    add-int/2addr v0, v6

    add-int/lit8 v0, v0, 0x3

    new-array v11, v0, [Ljava/lang/String;

    .line 279
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 280
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 281
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 282
    move-object/from16 v0, p1

    move-object v1, v11

    move-object/from16 v3, p2

    const/4 v2, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_0

    .line 283
    :cond_8
    const-string v0, "NULL"

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 284
    array-length v0, v15

    add-int/2addr v0, v6

    add-int/lit8 v0, v0, 0x3

    new-array v11, v0, [Ljava/lang/String;

    .line 285
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 286
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 287
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 288
    move-object/from16 v0, p1

    move-object v1, v11

    move-object/from16 v3, p2

    move-object/from16 v5, v18

    const/4 v2, 0x3

    const/4 v4, 0x1

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    .line 291
    :cond_9
    array-length v0, v15

    add-int/2addr v0, v6

    add-int/lit8 v0, v0, 0x4

    new-array v11, v0, [Ljava/lang/String;

    .line 292
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 293
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 294
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 295
    const/4 v0, 0x3

    aput-object v18, v11, v0

    .line 296
    move-object/from16 v0, p1

    move-object v1, v11

    move-object/from16 v3, p2

    move-object/from16 v5, v18

    const/4 v2, 0x4

    const/4 v4, 0x1

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 298
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v12, v11}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 299
    move-object/from16 v0, v16

    invoke-static {v13, v0}, Lo/cph;->a(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    .line 300
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v14}, Lo/cqn;->e(ILjava/util/List;)V

    .line 301
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-ne v0, v1, :cond_a

    .line 303
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v14, v1}, Lo/cqn;->c(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 305
    .line 310
    :cond_a
    :goto_1
    return-object v14

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public c(II[I[Ljava/lang/String;Ljava/util/List;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[I[Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 797
    array-length v0, p3

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    new-array v7, v0, [Ljava/lang/String;

    .line 798
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 799
    move v0, p2

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object v4, v7

    move/from16 v5, p6

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/cpn;->b(I[I[Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v8

    .line 801
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v8, v7}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 802
    invoke-static {v9, p4}, Lo/cph;->f(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(ILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 95
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, 0x5

    new-array v3, v0, [Ljava/lang/String;

    .line 96
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 97
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 99
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v3, v1

    .line 100
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v3, v1

    .line 101
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v0, v1, v3, v2}, Lo/cpn;->a([I[Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 102
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v4, v3}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 103
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/cph;->b(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/List;JJII[Ljava/lang/String;[II)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;JJII[Ljava/lang/String;[II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 389
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    .line 390
    add-int/lit8 v0, v8, 0x4

    new-array v9, v0, [Ljava/lang/String;

    .line 391
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 392
    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 393
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 394
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v9, v1

    .line 395
    move-object v0, p1

    move-object v1, v9

    move/from16 v3, p6

    move/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move/from16 v7, p10

    const/4 v2, 0x4

    invoke-static/range {v0 .. v7}, Lo/cpn;->d(Ljava/util/List;[Ljava/lang/String;III[Ljava/lang/String;[II)Ljava/lang/String;

    move-result-object v10

    .line 396
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryMergeAggregateHealthPointDataNoAlignTypeEX() aggregateSQL = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v10, v9}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 398
    move-object/from16 v0, p8

    invoke-static {v11, v0}, Lo/cph;->k(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 182
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 183
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAlignType()I

    move-result v3

    .line 186
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    .line 188
    :sswitch_0
    mul-int/lit8 v0, v2, 0x2

    add-int/lit8 v0, v0, 0x4

    new-array v4, v0, [Ljava/lang/String;

    .line 189
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 190
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 191
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 192
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 193
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {p1, v4, v0, p2, v1}, Lo/cpn;->a(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v5

    .line 194
    goto :goto_1

    .line 196
    :goto_0
    mul-int/lit8 v0, v2, 0x2

    add-int/lit8 v0, v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    .line 197
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 198
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 199
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 200
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v4, v0, p2, v1}, Lo/cpn;->a(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v5

    .line 205
    :goto_1
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v5, v4}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 206
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lo/cph;->h(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x4e21 -> :sswitch_0
    .end sparse-switch
.end method

.method public c(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 58
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v1

    array-length v1, v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    .line 59
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 60
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 61
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 62
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 63
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {p2, p1, v2, v0, v1}, Lo/cpn;->a(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v3

    .line 65
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v3, v2}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 66
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/cph;->c(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(II[I[Ljava/lang/String;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[I[Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 819
    array-length v0, p3

    add-int/lit8 v0, v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    .line 820
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 821
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 822
    move v0, p2

    move-object v1, p3

    move-object v2, p4

    move-object v3, v6

    move v4, p5

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->d(I[I[Ljava/lang/String;[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v7

    .line 824
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v7, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 825
    invoke-static {v8, p4}, Lo/cph;->n(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 314
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 315
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v5

    .line 316
    const/4 v0, 0x0

    aget v6, v5, v0

    .line 317
    invoke-static {v6}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v7

    .line 318
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v8

    .line 322
    const/4 v12, 0x0

    .line 323
    sget-object v0, Lo/cqn$1;->c:[I

    invoke-virtual {v7}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 325
    :sswitch_0
    array-length v0, v5

    add-int/2addr v0, v4

    add-int/lit8 v0, v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    .line 326
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 327
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 328
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 329
    const-string v0, ""

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v9, v1

    .line 330
    const/16 v0, 0x7d0

    if-ge v6, v0, :cond_0

    .line 331
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-static {p1, v9, v0, p2, v1}, Lo/cpn;->d(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v10

    .line 332
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v10, v9}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 333
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryMergeSportPointAggregateDataNoAlignTypeByTimeZone() aggregateSQL = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    invoke-static {v11, v8}, Lo/cph;->d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    .line 340
    :cond_0
    :goto_0
    return-object v12

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 70
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v1

    array-length v1, v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x6

    new-array v2, v0, [Ljava/lang/String;

    .line 71
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 72
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 73
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 74
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 75
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v2, v1

    .line 76
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v2, v1

    .line 77
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-static {p2, p1, v2, v0, v1}, Lo/cpn;->a(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v3

    .line 79
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v3, v2}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 80
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/cph;->c(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 107
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    new-array v6, v0, [Ljava/lang/String;

    .line 108
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 109
    move-object v0, p1

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v2

    move v3, p3

    move-object v4, v6

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/cpn;->c(Ljava/util/List;[I[Ljava/lang/String;I[Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    .line 111
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v7, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 112
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lo/cph;->e(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(I[I[Ljava/lang/String;IJJ)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I[Ljava/lang/String;IJJ)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 829
    array-length v0, p2

    add-int/lit8 v0, v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    .line 830
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 831
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 832
    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 833
    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 834
    const/4 v0, 0x4

    invoke-static {p2, p3, v2, p4, v0}, Lo/cpn;->b([I[Ljava/lang/String;[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v3

    .line 835
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v3, v2}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 836
    invoke-static {v4, p3}, Lo/cph;->n(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(JJILjava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 857
    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    new-array v6, v0, [Ljava/lang/String;

    .line 858
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 859
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 860
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 861
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 862
    const-string v0, "select distinct(client_id) from sample_point_health_stress where "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 863
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 864
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 865
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 866
    const-string v0, "client_id"

    move-object v1, p6

    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result v2

    move-object v3, v7

    move-object v4, v6

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 867
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 868
    const-string v0, "client_id"

    invoke-static {v8, v0}, Lo/cph;->p(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 148
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 149
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAlignType()I

    move-result v5

    .line 152
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    .line 154
    :sswitch_0
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x7

    new-array v6, v0, [Ljava/lang/String;

    .line 155
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 156
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 157
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 158
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v6, v1

    .line 159
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v6, v1

    .line 160
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v6, v1

    .line 161
    const-string v0, ""

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v6, v1

    .line 162
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-static {p1, v6, v0, p2, v1}, Lo/cpn;->c(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v7

    .line 163
    goto :goto_1

    .line 165
    :goto_0
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x6

    new-array v6, v0, [Ljava/lang/String;

    .line 166
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 167
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 168
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 169
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v6, v1

    .line 170
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v6, v1

    .line 171
    const-string v0, ""

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v6, v1

    .line 172
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-static {p1, v6, v0, p2, v1}, Lo/cpn;->c(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v7

    .line 176
    :goto_1
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryMergeAggregateDataByAlignTypeByTimeZone() aggregateSQL = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v7, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 178
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lo/cph;->h(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x4e21 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(IIILjava/lang/String;)Z
    .locals 5

    .line 893
    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    .line 894
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 895
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 896
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 897
    const/4 v0, 0x3

    aput-object p4, v2, v0

    .line 898
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/cpn;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hihealth_permission"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "permission"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 900
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v3, v2}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 901
    invoke-static {v4}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method

.method public f(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 697
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 698
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v3

    .line 699
    const/4 v0, 0x0

    aget v4, v3, v0

    .line 700
    invoke-static {v4}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v5

    .line 705
    const/4 v9, 0x0

    .line 706
    sget-object v0, Lo/cqn$1;->c:[I

    invoke-virtual {v5}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 708
    :pswitch_0
    const/16 v0, 0x5208

    if-gt v4, v0, :cond_0

    .line 709
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/cqn;->c(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;

    move-result-object v9

    goto/16 :goto_0

    .line 710
    :cond_0
    const/16 v0, 0x5653

    if-gt v4, v0, :cond_1

    .line 711
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/cqn;->b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;

    move-result-object v9

    goto/16 :goto_0

    .line 713
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/cqn;->e(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;Z)Ljava/util/List;

    move-result-object v9

    .line 715
    goto/16 :goto_0

    .line 718
    :pswitch_1
    array-length v0, v3

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    .line 719
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 720
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 721
    const/16 v0, 0x7d0

    if-ge v4, v0, :cond_2

    .line 722
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v6, v0, p2, v1}, Lo/cpn;->b(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v7

    .line 723
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v7, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 724
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lo/cph;->h(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    goto/16 :goto_0

    .line 725
    :cond_2
    const/16 v0, 0x7e3

    if-lt v4, v0, :cond_3

    const/16 v0, 0x7e6

    if-gt v0, v4, :cond_4

    const/16 v0, 0x7f1

    if-lt v0, v4, :cond_4

    .line 727
    :cond_3
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v6, v0, p2, v1}, Lo/cpn;->i(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v7

    .line 728
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v7, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 729
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lo/cph;->i(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    goto :goto_0

    .line 731
    :cond_4
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v6, v0, p2, v1}, Lo/cpn;->h(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v7

    .line 732
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v7, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 733
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lo/cph;->i(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 737
    goto :goto_0

    .line 740
    :pswitch_2
    add-int/lit8 v0, v2, 0x3

    new-array v6, v0, [Ljava/lang/String;

    .line 741
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 742
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 743
    const/4 v0, 0x0

    aget v0, v3, v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 744
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v6, v0, p2, v1}, Lo/cpn;->e(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v7

    .line 746
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v7, v6}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 747
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lo/cph;->o(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 748
    .line 752
    :goto_0
    return-object v9

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public g(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 756
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 757
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v5

    .line 758
    const/4 v0, 0x0

    aget v6, v5, v0

    .line 759
    invoke-static {v6}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v7

    .line 764
    const/4 v11, 0x0

    .line 765
    sget-object v0, Lo/cqn$1;->c:[I

    invoke-virtual {v7}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 767
    :sswitch_0
    array-length v0, v5

    add-int/2addr v0, v4

    add-int/lit8 v0, v0, 0x3

    new-array v8, v0, [Ljava/lang/String;

    .line 768
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 769
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 770
    const-string v0, ""

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 771
    const/16 v0, 0x7d0

    if-ge v6, v0, :cond_0

    .line 772
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v8, v0, p2, v1}, Lo/cpn;->d(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v9

    .line 773
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v9, v8}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 774
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lo/cph;->h(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    .line 775
    const-string v0, "Debug_RawQueryManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAggregateDataNoAlignTypeByTimeZone() POINT aggregateSQL = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 781
    :cond_0
    :goto_0
    return-object v11

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public i(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 807
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 808
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v0

    array-length v0, v0

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x3

    new-array v3, v0, [Ljava/lang/String;

    .line 809
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 810
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 811
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 812
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v3, v0, p2, v1}, Lo/cpn;->k(Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;Z)Ljava/lang/String;

    move-result-object v4

    .line 814
    iget-object v0, p0, Lo/cqn;->c:Lo/cor;

    invoke-virtual {v0, v4, v3}, Lo/cor;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 815
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/cph;->d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
