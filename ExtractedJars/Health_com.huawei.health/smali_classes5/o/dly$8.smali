.class Lo/dly$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly;->e([J[DD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:D

.field final synthetic c:I

.field final synthetic d:Lo/dly;

.field final synthetic e:[J


# direct methods
.method constructor <init>(Lo/dly;[JDI)V
    .locals 0

    .line 414
    iput-object p1, p0, Lo/dly$8;->d:Lo/dly;

    iput-object p2, p0, Lo/dly$8;->e:[J

    iput-wide p3, p0, Lo/dly$8;->b:D

    iput p5, p0, Lo/dly$8;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 21

    .line 417
    if-nez p1, :cond_3

    .line 418
    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 420
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_weekly_start_time_key"

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/dly$8;->e:[J

    const/4 v4, 0x0

    aget-wide v3, v3, v4

    .line 421
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 420
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v8

    .line 422
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_weekly_end_time_key"

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/dly$8;->e:[J

    const/4 v4, 0x1

    aget-wide v3, v3, v4

    .line 423
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 422
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v9

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_weekly_data_change_key"

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/dly$8;->b:D

    .line 425
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 424
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v10

    .line 426
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_weekly_up_down_key"

    move-object/from16 v3, p0

    iget v3, v3, Lo/dly$8;->c:I

    .line 427
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 426
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v11

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_weekly_reach_num_key"

    .line 429
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 428
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v12

    .line 430
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "recommend_weight_weekly_report"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 435
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg sp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    const-string v0, "1"

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 437
    return-void

    .line 439
    :cond_0
    new-instance v14, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v14}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 440
    const/16 v0, 0x4e27

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 441
    const/4 v0, 0x2

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 442
    const/4 v0, 0x5

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 444
    new-instance v0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    move-object/from16 v1, p0

    iget v1, v1, Lo/dly$8;->c:I

    move-object/from16 v2, p0

    iget-wide v2, v2, Lo/dly$8;->b:D

    move-wide v4, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;-><init>(IDJ)V

    move-object v15, v0

    .line 445
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->e:[J

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    const/4 v2, 0x0

    invoke-virtual {v15, v2, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->setTimeperiod(IJ)V

    .line 446
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->e:[J

    const/4 v1, 0x1

    aget-wide v0, v0, v1

    const/4 v2, 0x1

    invoke-virtual {v15, v2, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->setTimeperiod(IJ)V

    .line 447
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    invoke-virtual {v0, v15, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v16

    .line 448
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 450
    const-string v0, "110000"

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 451
    const-string v0, "00002400"

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 452
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 453
    const-string v0, "ai-weight-007"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 459
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    invoke-static {v0}, Lo/dly;->a(Lo/dly;)Lo/dln;

    move-result-object v0

    const/16 v1, 0x4e27

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v17

    .line 460
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_1

    .line 461
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg null == smartMsgDBObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    invoke-static {v0}, Lo/dly;->a(Lo/dly;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, v14}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    goto/16 :goto_0

    .line 464
    :cond_1
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v18

    .line 465
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg createTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/util/Date;

    move-wide/from16 v3, v18

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v0, v0, v18

    const-wide/32 v2, 0x240c8400

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 468
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    invoke-static {v0}, Lo/dly;->a(Lo/dly;)Lo/dln;

    move-result-object v0

    const/16 v1, 0x4e27

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 469
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    invoke-static {v0}, Lo/dly;->a(Lo/dly;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, v14}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    goto :goto_0

    .line 471
    :cond_2
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v20

    .line 472
    move-object/from16 v0, v20

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 473
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg updateMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 475
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dly$8;->d:Lo/dly;

    invoke-static {v0}, Lo/dly;->a(Lo/dly;)Lo/dln;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lo/dln;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    .line 482
    :cond_3
    :goto_0
    return-void
.end method
