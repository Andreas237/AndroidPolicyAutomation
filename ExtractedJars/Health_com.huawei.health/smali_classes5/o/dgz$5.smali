.class Lo/dgz$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgz;->a(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic i:Lo/dgz;


# direct methods
.method constructor <init>(Lo/dgz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IIJI)V
    .locals 0

    .line 479
    iput-object p1, p0, Lo/dgz$5;->i:Lo/dgz;

    iput-object p2, p0, Lo/dgz$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/dgz$5;->e:I

    iput p4, p0, Lo/dgz$5;->d:I

    iput-wide p5, p0, Lo/dgz$5;->b:J

    iput p7, p0, Lo/dgz$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 483
    if-nez p1, :cond_0

    .line 484
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 485
    return-void

    .line 488
    :cond_0
    move-object/from16 v4, p1

    .line 490
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 491
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 493
    move-object/from16 v0, p0

    iget v6, v0, Lo/dgz$5;->e:I

    .line 494
    move-object/from16 v0, p0

    iget v7, v0, Lo/dgz$5;->d:I

    .line 496
    const/4 v0, 0x1

    if-ne v0, v6, :cond_2

    .line 497
    const/4 v8, 0x0

    .line 498
    const/4 v9, 0x0

    .line 499
    const/4 v10, 0x0

    .line 500
    const/4 v11, 0x0

    .line 501
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 502
    const-string v0, "sleep_deep_key"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v8, v0

    .line 503
    const-string v0, "sleep_shallow_key"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v9, v0

    .line 504
    const-string v0, "sleep_wake_key"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v10, v0

    .line 505
    const-string v0, "sleep_wake_count_key"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v11, v0

    .line 506
    goto :goto_0

    .line 508
    :cond_1
    new-instance v12, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 509
    div-int/lit8 v0, v8, 0x3c

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 510
    div-int/lit8 v0, v9, 0x3c

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 511
    div-int/lit8 v0, v10, 0x3c

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 512
    invoke-virtual {v12, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 513
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 515
    goto/16 :goto_4

    .line 518
    :cond_2
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v6, :cond_7

    .line 519
    new-instance v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 520
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 521
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v12

    .line 524
    const-wide/16 v0, 0x3e8

    div-long v0, v12, v0

    move-object/from16 v2, p0

    iget-wide v2, v2, Lo/dgz$5;->b:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    int-to-long v2, v7

    div-long/2addr v0, v2

    long-to-int v14, v0

    .line 526
    move-object/from16 v0, p0

    iget v0, v0, Lo/dgz$5;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    .line 527
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/dgz$5;->b:J

    invoke-static {v0, v1}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v15

    .line 528
    const-wide/16 v0, 0x3e8

    div-long v0, v12, v0

    invoke-static {v0, v1}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v16

    .line 530
    move/from16 v0, v16

    if-ge v0, v15, :cond_3

    .line 531
    add-int/lit8 v0, v16, 0xc

    sub-int v14, v0, v15

    goto :goto_3

    .line 533
    :cond_3
    sub-int v14, v16, v15

    .line 537
    :cond_4
    :goto_3
    if-ne v14, v8, :cond_5

    .line 538
    const-string v0, "sleep_deep_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 539
    div-int/lit8 v0, v15, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 541
    const-string v0, "sleep_shallow_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v16

    .line 542
    div-int/lit8 v0, v16, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 544
    const-string v0, "sleep_wake_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v17

    .line 545
    div-int/lit8 v0, v17, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 547
    const-string v0, "sleep_wake_count_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v18

    .line 548
    move/from16 v0, v18

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 551
    :cond_5
    goto/16 :goto_2

    .line 553
    :cond_6
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 518
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 558
    :cond_7
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 559
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepSummary back success sleepTotalDatas.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 563
    :cond_8
    return-void
.end method
