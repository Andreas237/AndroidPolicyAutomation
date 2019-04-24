.class Lo/dgt$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgt;->d(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:J

.field final synthetic e:I

.field final synthetic f:[Ljava/lang/String;

.field final synthetic g:[I

.field final synthetic h:Lo/dgt;

.field final synthetic k:I


# direct methods
.method constructor <init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IJII[II[Ljava/lang/String;)V
    .locals 0

    .line 479
    iput-object p1, p0, Lo/dgt$9;->h:Lo/dgt;

    iput-object p2, p0, Lo/dgt$9;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/dgt$9;->c:I

    iput-wide p4, p0, Lo/dgt$9;->d:J

    iput p6, p0, Lo/dgt$9;->e:I

    iput p7, p0, Lo/dgt$9;->b:I

    iput-object p8, p0, Lo/dgt$9;->g:[I

    iput p9, p0, Lo/dgt$9;->k:I

    iput-object p10, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 482
    invoke-static {}, Lo/dgt;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetail datas="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 484
    :cond_0
    iget-object v0, p0, Lo/dgt$9;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 485
    return-void

    .line 487
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 489
    const/4 v6, 0x0

    :goto_0
    iget v0, p0, Lo/dgt$9;->c:I

    if-ge v6, v0, :cond_7

    .line 490
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>()V

    .line 492
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 493
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v9

    .line 496
    const-wide/16 v0, 0x3e8

    div-long v0, v9, v0

    iget-wide v2, p0, Lo/dgt$9;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    iget v2, p0, Lo/dgt$9;->e:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v11, v0

    .line 498
    iget v0, p0, Lo/dgt$9;->b:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 499
    iget-wide v0, p0, Lo/dgt$9;->d:J

    invoke-static {v0, v1}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v12

    .line 500
    const-wide/16 v0, 0x3e8

    div-long v0, v9, v0

    invoke-static {v0, v1}, Lo/dbu;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v13

    .line 502
    if-ge v13, v12, :cond_2

    .line 503
    add-int/lit8 v0, v13, 0xc

    sub-int v11, v0, v12

    goto :goto_2

    .line 505
    :cond_2
    sub-int v11, v13, v12

    .line 510
    :cond_3
    :goto_2
    if-ne v11, v6, :cond_5

    .line 511
    iget-object v0, p0, Lo/dgt$9;->g:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 512
    const/4 v0, 0x2

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSteps(I)V

    .line 513
    const/4 v0, 0x4

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 515
    const/4 v0, 0x3

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 517
    const/4 v0, 0x5

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 518
    iget v0, p0, Lo/dgt$9;->k:I

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSportType(I)V

    .line 519
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDuration(I)V

    .line 520
    goto/16 :goto_4

    .line 522
    :cond_4
    iget v0, p0, Lo/dgt$9;->k:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 524
    :sswitch_0
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSteps(I)V

    .line 525
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 526
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 528
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 529
    iget v0, p0, Lo/dgt$9;->k:I

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSportType(I)V

    .line 530
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDuration(I)V

    .line 531
    goto/16 :goto_3

    .line 533
    :sswitch_1
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSteps(I)V

    .line 534
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 535
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 536
    iget v0, p0, Lo/dgt$9;->k:I

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSportType(I)V

    .line 537
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDuration(I)V

    .line 538
    goto/16 :goto_3

    .line 540
    :sswitch_2
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSteps(I)V

    .line 541
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 542
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 543
    iget v0, p0, Lo/dgt$9;->k:I

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSportType(I)V

    .line 544
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDuration(I)V

    .line 545
    goto/16 :goto_3

    .line 547
    :sswitch_3
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSteps(I)V

    .line 548
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 549
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 550
    iget v0, p0, Lo/dgt$9;->k:I

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSportType(I)V

    .line 551
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDuration(I)V

    .line 552
    goto :goto_3

    .line 554
    :sswitch_4
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSteps(I)V

    .line 555
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 556
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 557
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 558
    iget v0, p0, Lo/dgt$9;->k:I

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSportType(I)V

    .line 559
    iget-object v0, p0, Lo/dgt$9;->f:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDuration(I)V

    .line 560
    .line 569
    :cond_5
    :goto_3
    goto/16 :goto_1

    .line 571
    :cond_6
    :goto_4
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 489
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 574
    :cond_7
    iget-object v0, p0, Lo/dgt$9;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 575
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_4
        0x4 -> :sswitch_3
        0xdd -> :sswitch_0
    .end sparse-switch
.end method
