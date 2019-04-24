.class public Lo/dxo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile e:Lo/dxo;


# instance fields
.field private a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/concurrent/ExecutorService;

.field private d:Lo/dwr;

.field private f:I

.field private k:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dxo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 115
    new-instance v0, Lo/dxo$4;

    invoke-direct {v0, p0}, Lo/dxo$4;-><init>(Lo/dxo;)V

    iput-object v0, p0, Lo/dxo;->k:Landroid/os/Handler;

    .line 108
    if-nez p1, :cond_0

    .line 109
    return-void

    .line 111
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    .line 112
    return-void
.end method

.method private a(II)Ljava/lang/String;
    .locals 4

    .line 1298
    const-string v2, ""

    .line 1299
    const-string v3, ""

    .line 1300
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 1301
    const-string v0, "00:00"

    return-object v0

    .line 1303
    :cond_0
    const/16 v0, 0xa

    if-ge p1, v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 1305
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 1306
    :goto_0
    const/16 v0, 0xa

    if-ge p2, v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1308
    :cond_2
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 1309
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(JJI)V
    .locals 8

    .line 426
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "enter getAnnualStepData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "isOversea,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    return-void

    .line 431
    :cond_0
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 432
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 434
    :cond_1
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v7

    .line 435
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 436
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "achieveAdapter is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    return-void

    .line 439
    :cond_2
    move-object v0, v7

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v6, Lo/dxo$10;

    invoke-direct {v6, p0, p5}, Lo/dxo$10;-><init>(Lo/dxo;I)V

    invoke-interface/range {v0 .. v6}, Lo/dti;->a(Landroid/content/Context;JJLo/duh;)V

    .line 469
    move-object v0, v7

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v6, Lo/dxo$8;

    invoke-direct {v6, p0, p5}, Lo/dxo$8;-><init>(Lo/dxo;I)V

    invoke-interface/range {v0 .. v6}, Lo/dti;->d(Landroid/content/Context;JJLo/duh;)V

    .line 489
    return-void
.end method

.method static synthetic a(Lo/dxo;JJI)V
    .locals 0

    .line 75
    invoke-direct/range {p0 .. p5}, Lo/dxo;->e(JJI)V

    return-void
.end method

.method static synthetic a(Lo/dxo;Ljava/util/List;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2}, Lo/dxo;->b(Ljava/util/List;I)V

    return-void
.end method

.method private b(JJI)V
    .locals 15

    .line 341
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "enter getTrackListByRunType"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 343
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "isOversea,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    return-void

    .line 346
    :cond_0
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 347
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 349
    :cond_1
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v14

    .line 350
    const/4 v0, 0x0

    if-ne v0, v14, :cond_2

    .line 351
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "achieveAdapter is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    return-void

    .line 355
    :cond_2
    move-object v0, v14

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    new-instance v7, Lo/dxo$5;

    move-object v8, p0

    move-wide/from16 v9, p1

    move-wide/from16 v11, p3

    move/from16 v13, p5

    invoke-direct/range {v7 .. v13}, Lo/dxo$5;-><init>(Lo/dxo;JJI)V

    const/16 v6, 0x102

    invoke-interface/range {v0 .. v7}, Lo/dti;->a(Landroid/content/Context;JJILo/duh;)V

    .line 374
    return-void
.end method

.method private b(Ljava/util/List;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 748
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 749
    return-void

    .line 751
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    .line 752
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 753
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 754
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 753
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 757
    :cond_1
    invoke-static {}, Lo/dxm;->e()Ljava/util/ArrayList;

    move-result-object v6

    .line 758
    const/4 v7, 0x0

    .line 759
    const-wide/16 v8, 0x0

    .line 761
    const/4 v10, 0x0

    .line 762
    const/4 v11, 0x0

    .line 763
    const/4 v12, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_6

    .line 764
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 765
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v14

    .line 767
    :try_start_0
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v14, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 771
    goto :goto_2

    .line 768
    :catch_0
    move-exception v15

    .line 769
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "trackMetaData is error"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 770
    goto/16 :goto_3

    .line 772
    :goto_2
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v15

    .line 773
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v16

    .line 774
    const/4 v0, 0x0

    if-ne v0, v15, :cond_5

    const/4 v0, 0x0

    move/from16 v1, v16

    if-eq v0, v1, :cond_2

    .line 775
    goto/16 :goto_3

    .line 777
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v17

    .line 778
    const/4 v0, 0x2

    move/from16 v1, v17

    if-ne v0, v1, :cond_3

    .line 779
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SportDataSource="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v17

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    goto :goto_3

    .line 782
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v0

    invoke-static {v0}, Lo/dxc;->e(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 783
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v18

    .line 784
    invoke-static/range {v18 .. v19}, Lo/dxm;->d(J)I

    move-result v20

    .line 785
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v21

    .line 786
    move/from16 v0, v21

    if-lt v0, v7, :cond_4

    .line 787
    move/from16 v7, v21

    .line 788
    move-wide/from16 v8, v18

    .line 790
    :cond_4
    add-int v10, v10, v21

    .line 791
    add-int/lit8 v11, v11, 0x1

    .line 792
    move/from16 v0, v20

    const/16 v1, 0x18

    if-ge v0, v1, :cond_5

    .line 793
    move/from16 v0, v20

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move/from16 v1, v20

    invoke-virtual {v6, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 763
    :cond_5
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 797
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v12

    .line 798
    const/4 v13, 0x0

    .line 799
    const/4 v14, 0x0

    .line 800
    const/4 v15, 0x0

    :goto_4
    if-ge v15, v12, :cond_8

    .line 801
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 802
    move/from16 v0, v16

    if-lt v0, v13, :cond_7

    .line 803
    move v14, v15

    .line 804
    move/from16 v13, v16

    .line 800
    :cond_7
    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    .line 807
    :cond_8
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pos="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "max="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "maxRunDis="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sumRun="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sumCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 809
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x7d5

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v15

    .line 810
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 811
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v15, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 813
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x7d3

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v16

    .line 814
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 815
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v16

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 817
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x7d4

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v17

    .line 818
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 819
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v17

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 821
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x7d2

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v18

    .line 822
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x7d1

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v19

    .line 823
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x7d6

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v20

    .line 824
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 825
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 826
    invoke-static {v11}, Lo/dxm;->e(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 827
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v18

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 828
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v19

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 829
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v20

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 830
    return-void
.end method

.method static synthetic c(Lo/dxo;)Lo/dwr;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    return-object v0
.end method

.method private c(JJI)V
    .locals 8

    .line 501
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 502
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 504
    :cond_0
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v7

    .line 505
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 506
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "achieveAdapter is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    return-void

    .line 510
    :cond_1
    move-object v0, v7

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v6, Lo/dxo$6;

    invoke-direct {v6, p0, p5}, Lo/dxo$6;-><init>(Lo/dxo;I)V

    invoke-interface/range {v0 .. v6}, Lo/dti;->b(Landroid/content/Context;JJLo/duh;)V

    .line 524
    return-void
.end method

.method static synthetic c(Lo/dxo;Ljava/util/List;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2}, Lo/dxo;->e(Ljava/util/List;I)V

    return-void
.end method

.method static synthetic d(Lo/dxo;)I
    .locals 1

    .line 75
    iget v0, p0, Lo/dxo;->f:I

    return v0
.end method

.method public static d(Landroid/content/Context;)Lo/dxo;
    .locals 4

    .line 92
    sget-object v0, Lo/dxo;->e:Lo/dxo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 93
    const-class v2, Lo/dxo;

    monitor-enter v2

    .line 94
    :try_start_0
    sget-object v0, Lo/dxo;->e:Lo/dxo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 95
    new-instance v0, Lo/dxo;

    invoke-direct {v0, p0}, Lo/dxo;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dxo;->e:Lo/dxo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 99
    :cond_1
    :goto_0
    sget-object v0, Lo/dxo;->e:Lo/dxo;

    return-object v0
.end method

.method private d(ILjava/lang/Object;J)V
    .locals 2

    .line 138
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 139
    iput p1, v1, Landroid/os/Message;->what:I

    .line 140
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 141
    iget-object v0, p0, Lo/dxo;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1, p3, p4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 142
    return-void
.end method

.method static synthetic d(Lo/dxo;JJI)V
    .locals 0

    .line 75
    invoke-direct/range {p0 .. p5}, Lo/dxo;->b(JJI)V

    return-void
.end method

.method private e(JJI)V
    .locals 9

    .line 386
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "enter getTrackListByCycleType"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 388
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 390
    :cond_0
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v8

    .line 391
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 392
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "achieveAdapter is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    return-void

    .line 396
    :cond_1
    move-object v0, v8

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v7, Lo/dxo$2;

    invoke-direct {v7, p0, p5}, Lo/dxo$2;-><init>(Lo/dxo;I)V

    const/16 v6, 0x103

    invoke-interface/range {v0 .. v7}, Lo/dti;->a(Landroid/content/Context;JJILo/duh;)V

    .line 414
    return-void
.end method

.method private e(Ljava/util/List;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 840
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "enter computeCycleTrackInfo"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 842
    return-void

    .line 844
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    .line 845
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 846
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 847
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 846
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 850
    :cond_1
    const/4 v6, 0x0

    .line 851
    const-wide/16 v7, 0x0

    .line 853
    const/4 v9, 0x0

    .line 854
    const/4 v10, 0x0

    .line 855
    const/4 v11, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_6

    .line 856
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 857
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v13

    .line 859
    :try_start_0
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v13, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 863
    goto :goto_2

    .line 860
    :catch_0
    move-exception v14

    .line 861
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "trackMetaData is error"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 862
    goto :goto_3

    .line 864
    :goto_2
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v14

    .line 865
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v15

    .line 866
    const/4 v0, 0x0

    if-ne v0, v14, :cond_5

    const/4 v0, 0x0

    if-eq v0, v15, :cond_2

    .line 867
    goto :goto_3

    .line 869
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v16

    .line 870
    const/4 v0, 0x2

    move/from16 v1, v16

    if-ne v0, v1, :cond_3

    .line 871
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SportDataSource="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    goto :goto_3

    .line 874
    :cond_3
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v17

    .line 875
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v19

    .line 876
    move/from16 v0, v19

    if-lt v0, v6, :cond_4

    .line 877
    move/from16 v6, v19

    .line 878
    move-wide/from16 v7, v17

    .line 880
    :cond_4
    add-int v9, v9, v19

    .line 881
    add-int/lit8 v10, v10, 0x1

    .line 855
    :cond_5
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    .line 884
    :cond_6
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maxCycleDisTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "maxCycleDis="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sumCycle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sumCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 887
    sget-object v0, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x3eb

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v11

    .line 888
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 889
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v11, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 891
    sget-object v0, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x3ec

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v12

    .line 892
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 893
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v12, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 895
    sget-object v0, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x3ea

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v13

    .line 896
    sget-object v0, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x3e9

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v14

    .line 898
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 899
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 900
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v13, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 901
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v14, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 902
    return-void
.end method

.method static synthetic e(Lo/dxo;ILjava/lang/Object;J)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dxo;->d(ILjava/lang/Object;J)V

    return-void
.end method

.method private f(I)V
    .locals 9

    .line 315
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dwj;

    .line 316
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 317
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "computeInitalDataByYear totalRecord null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    return-void

    .line 320
    :cond_0
    invoke-virtual {v3}, Lo/dwj;->c()I

    move-result v4

    .line 321
    invoke-virtual {v3}, Lo/dwj;->a()J

    move-result-wide v5

    .line 323
    sget-object v0, Lo/dxp;->c:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x232a

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v7

    .line 324
    sget-object v0, Lo/dxp;->c:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2329

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v8

    .line 325
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 326
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 327
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v7, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 328
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v8, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 329
    return-void
.end method

.method private f(JJI)V
    .locals 8

    .line 535
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 536
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 538
    :cond_0
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v7

    .line 539
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 540
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "achieveAdapter is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    return-void

    .line 543
    :cond_1
    move-object v0, v7

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v6, Lo/dxo$7;

    invoke-direct {v6, p0, p5}, Lo/dxo$7;-><init>(Lo/dxo;I)V

    invoke-interface/range {v0 .. v6}, Lo/dti;->k(Landroid/content/Context;JJLo/duh;)V

    .line 561
    return-void
.end method

.method private h(I)V
    .locals 10

    .line 911
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "enter computeStepMaxByYear"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dwm;

    .line 913
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 914
    return-void

    .line 919
    :cond_0
    invoke-virtual {v4}, Lo/dwm;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/dxt;->b(Ljava/lang/String;I)Lo/dyz;

    move-result-object v5

    .line 920
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 921
    sget-object v0, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xbbb

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v6

    .line 922
    invoke-virtual {v5}, Lo/dyz;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 924
    sget-object v0, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xbbc

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v7

    .line 925
    invoke-virtual {v5}, Lo/dyz;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 927
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v6, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 928
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v7, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 933
    :cond_1
    invoke-virtual {v4}, Lo/dwm;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/dxt;->e(Ljava/lang/String;I)Lo/dyx;

    move-result-object v6

    .line 935
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 936
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x7d3

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v7

    .line 937
    invoke-virtual {v6}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 939
    sget-object v0, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x7d4

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v8

    .line 940
    invoke-virtual {v6}, Lo/dyx;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 941
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bestMotionRun maxRun="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dyx;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "maxRunTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 942
    invoke-virtual {v6}, Lo/dyx;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 941
    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 943
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v7, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 944
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v8, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 950
    :cond_2
    invoke-virtual {v4}, Lo/dwm;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/dxt;->e(Ljava/lang/String;I)Lo/dyx;

    move-result-object v7

    .line 952
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 953
    sget-object v0, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3eb

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v8

    .line 954
    invoke-virtual {v7}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 956
    sget-object v0, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3ec

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v9

    .line 957
    invoke-virtual {v7}, Lo/dyx;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 959
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v8, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 960
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v9, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 963
    :cond_3
    return-void
.end method

.method private k(JJI)V
    .locals 9

    .line 572
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "enter getAnnualSumDataList"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 574
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "isOversea,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    return-void

    .line 577
    :cond_0
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 578
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 580
    :cond_1
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v8

    .line 581
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 582
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "achieveAdapter is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    return-void

    .line 586
    :cond_2
    move-object v0, v8

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v7, Lo/dxo$9;

    invoke-direct {v7, p0, p5}, Lo/dxo$9;-><init>(Lo/dxo;I)V

    const/16 v6, 0x10

    invoke-interface/range {v0 .. v7}, Lo/dti;->b(Landroid/content/Context;JJILo/duh;)V

    .line 626
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 6

    .line 972
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 973
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 974
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 975
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getCurrentLevel achieveUserLevelInfo null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 976
    const/4 v0, 0x1

    return v0

    .line 978
    :cond_0
    instance-of v0, v3, Lo/dvj;

    if-eqz v0, :cond_1

    .line 979
    move-object v4, v3

    check-cast v4, Lo/dvj;

    .line 980
    sget-object v0, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v5

    .line 981
    invoke-virtual {v4}, Lo/dvj;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 982
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v5, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 983
    invoke-virtual {v4}, Lo/dvj;->d()I

    move-result v0

    return v0

    .line 985
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public a(Ljava/util/List;I)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;>;I)V"
        }
    .end annotation

    .line 1208
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1209
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "sleepTotalDatas null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1210
    return-void

    .line 1212
    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    .line 1213
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateReport with dataSize = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1215
    const/4 v7, 0x0

    .line 1216
    const/4 v8, 0x0

    .line 1217
    const/4 v9, 0x0

    .line 1218
    const/4 v10, 0x0

    .line 1219
    const/4 v11, 0x0

    .line 1220
    const/4 v12, 0x0

    .line 1221
    const/4 v13, 0x0

    .line 1222
    const/4 v14, 0x0

    .line 1224
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1225
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 1226
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getScore()I

    move-result v0

    add-int/2addr v7, v0

    .line 1227
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v0

    add-int/2addr v8, v0

    .line 1228
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v0

    add-int/2addr v9, v0

    .line 1229
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v0

    add-int/2addr v10, v0

    .line 1230
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getFallTime()I

    move-result v0

    add-int/2addr v11, v0

    .line 1231
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeUpTime()I

    move-result v0

    add-int/2addr v12, v0

    .line 1232
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupTimes()I

    move-result v0

    add-int/2addr v14, v0

    .line 1233
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSnoreFreq()I

    move-result v0

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v1

    invoke-static {v0, v1}, Lo/dxq;->b(II)I

    move-result v0

    add-int/2addr v13, v0

    .line 1234
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getFallTime()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1235
    goto :goto_0

    .line 1237
    :cond_2
    new-instance v16, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 1238
    move-object/from16 v0, v16

    invoke-virtual {v0, v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setScore(I)V

    .line 1239
    move-object/from16 v0, v16

    invoke-virtual {v0, v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 1240
    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSlumberSleepTime(I)V

    .line 1241
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 1242
    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeUpTime(I)V

    .line 1243
    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 1244
    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setFallTime(I)V

    .line 1245
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSnoreFreq(I)V

    .line 1247
    move-object/from16 v0, v16

    invoke-static {v0, v15, v6}, Lo/dxq;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;Ljava/util/List;I)I

    move-result v17

    .line 1248
    int-to-double v0, v11

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dxk;->c(D)I

    move-result v0

    div-int/lit8 v18, v0, 0x3c

    .line 1249
    move/from16 v0, v18

    const/16 v1, 0x18

    if-lt v0, v1, :cond_3

    add-int/lit8 v0, v18, -0x18

    goto :goto_1

    :cond_3
    move/from16 v0, v18

    :goto_1
    move/from16 v18, v0

    .line 1250
    div-int v0, v11, v6

    rem-int/lit8 v19, v0, 0x3c

    .line 1251
    int-to-double v0, v12

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dxk;->c(D)I

    move-result v0

    div-int/lit8 v20, v0, 0x3c

    .line 1252
    int-to-double v0, v12

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dxk;->c(D)I

    move-result v0

    rem-int/lit8 v21, v0, 0x3c

    .line 1255
    int-to-double v0, v8

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double v22, v0, v2

    .line 1256
    int-to-double v0, v9

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double v24, v0, v2

    .line 1257
    int-to-double v0, v10

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double v26, v0, v2

    .line 1258
    add-double v0, v22, v24

    add-double v0, v0, v26

    invoke-static {v0, v1}, Lo/dxk;->c(D)I

    move-result v28

    .line 1259
    move-object/from16 v0, p0

    move/from16 v1, v18

    move/from16 v2, v19

    invoke-direct {v0, v1, v2}, Lo/dxo;->a(II)Ljava/lang/String;

    move-result-object v29

    .line 1260
    move-object/from16 v0, p0

    move/from16 v1, v20

    move/from16 v2, v21

    invoke-direct {v0, v1, v2}, Lo/dxo;->a(II)Ljava/lang/String;

    move-result-object v30

    .line 1261
    int-to-double v0, v7

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dxk;->c(D)I

    move-result v31

    .line 1262
    int-to-double v0, v13

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dxk;->c(D)I

    move-result v32

    .line 1264
    sget-object v0, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1f41

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v33

    .line 1265
    invoke-static/range {v31 .. v31}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v33

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1267
    sget-object v0, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1f42

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v34

    .line 1268
    invoke-static/range {v28 .. v28}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1270
    sget-object v0, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1f43

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v35

    .line 1271
    invoke-static/range {v32 .. v32}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1273
    sget-object v0, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1f44

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v36

    .line 1274
    move-object/from16 v0, v36

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1276
    sget-object v0, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1f45

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v37

    .line 1277
    move-object/from16 v0, v37

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1279
    sget-object v0, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1f46

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v38

    .line 1280
    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v38

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1282
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v33

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1283
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v34

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1284
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v35

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1285
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v36

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1286
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v37

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1287
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v38

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1289
    return-void
.end method

.method public b(Ljava/util/Map;)Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;"
        }
    .end annotation

    .line 692
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getMaxDailyFitnessData() fitnessMap with size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 693
    const/4 v3, 0x0

    .line 694
    const-string v4, ""

    .line 695
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 696
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v0, v3, :cond_0

    .line 697
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 698
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 700
    :cond_0
    goto :goto_0

    .line 702
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 703
    const-string v0, "-"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 704
    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 705
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    invoke-virtual {v5, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 706
    const/4 v0, 0x2

    aget-object v0, v6, v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v5, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 707
    new-instance v7, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;

    invoke-direct {v7}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;-><init>()V

    .line 708
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveMaxDurationDay(J)V

    .line 709
    const-wide/high16 v8, 0x404e000000000000L    # 60.0

    .line 710
    int-to-double v0, v3

    div-double/2addr v0, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveMaxDuration(I)V

    .line 712
    return-object v7
.end method

.method public b(I)V
    .locals 10

    .line 1028
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1029
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "isOversea,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1030
    return-void

    .line 1032
    :cond_0
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1033
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 1035
    :cond_1
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/dxk;->d(IZ)J

    move-result-wide v6

    .line 1036
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/dxk;->d(IZ)J

    move-result-wide v8

    .line 1037
    invoke-direct {p0, p1}, Lo/dxo;->h(I)V

    .line 1038
    invoke-direct {p0, p1}, Lo/dxo;->f(I)V

    .line 1039
    invoke-virtual {p0, p1}, Lo/dxo;->a(I)I

    .line 1040
    invoke-virtual {p0, p1}, Lo/dxo;->d(I)V

    .line 1042
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lo/dxo;->k(JJI)V

    .line 1043
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lo/dxo;->a(JJI)V

    .line 1047
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lo/dxo;->c(JJI)V

    .line 1048
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lo/dxo;->f(JJI)V

    .line 1050
    move-object v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lo/dxo;->d(JJI)V

    .line 1053
    return-void
.end method

.method public b(Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;I)V
    .locals 7

    .line 723
    sget-object v0, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa3

    invoke-static {p2, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v2

    .line 724
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->acquireMaxDuration()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 725
    sget-object v0, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa4

    invoke-static {p2, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v3

    .line 726
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->acquireMaxDurationDay()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 727
    sget-object v0, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa5

    invoke-static {p2, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v4

    .line 728
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->acquireDescription()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 729
    sget-object v0, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa1

    invoke-static {p2, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v5

    .line 730
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->acquireTotalDuration()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 731
    sget-object v0, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa2

    invoke-static {p2, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v6

    .line 732
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->acquireNumberOfTimes()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 733
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v2, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 734
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v3, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 735
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v4, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 736
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v5, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 737
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v6, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 738
    return-void
.end method

.method public c(I)I
    .locals 2

    .line 674
    const/4 v1, 0x0

    .line 675
    const/16 v0, 0x190

    if-ge p1, v0, :cond_0

    .line 676
    const/4 v1, 0x1

    goto :goto_0

    .line 677
    :cond_0
    const/16 v0, 0x190

    if-lt p1, v0, :cond_1

    const/16 v0, 0x4b0

    if-gt p1, v0, :cond_1

    .line 679
    const/4 v1, 0x2

    goto :goto_0

    .line 681
    :cond_1
    const/4 v1, 0x3

    .line 683
    :goto_0
    return v1
.end method

.method public c()Ljava/lang/String;
    .locals 11

    .line 1134
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1135
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 1137
    :cond_0
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 1139
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 1140
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getAnnualInitalJson achieveData null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1141
    const-string v0, ""

    return-object v0

    .line 1143
    :cond_1
    const/4 v4, 0x0

    .line 1144
    instance-of v0, v3, Lo/dwj;

    if-eqz v0, :cond_2

    .line 1145
    move-object v4, v3

    check-cast v4, Lo/dwj;

    .line 1147
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 1148
    const-string v0, ""

    return-object v0

    .line 1150
    :cond_3
    invoke-virtual {v4}, Lo/dwj;->c()I

    move-result v5

    .line 1151
    invoke-virtual {v4}, Lo/dwj;->a()J

    move-result-wide v6

    .line 1152
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 1153
    const-string v0, "totalDays"

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1154
    const-string v0, "firstUseDate"

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1155
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 1156
    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v10

    .line 1157
    return-object v10
.end method

.method public c(Ljava/util/List;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;>;I)V"
        }
    .end annotation

    .line 636
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "computeFitnessData() year with ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    const/4 v4, 0x0

    .line 638
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 639
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;

    .line 640
    invoke-virtual {v7}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->acquireDuring()I

    move-result v0

    div-int/lit16 v8, v0, 0x3e8

    .line 641
    add-int/2addr v4, v8

    .line 643
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    .line 644
    invoke-virtual {v7}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 645
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v9, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 646
    const/4 v1, 0x5

    invoke-virtual {v9, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 647
    invoke-virtual {v5, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 648
    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 649
    add-int/2addr v11, v8

    .line 650
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v10, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    goto :goto_1

    .line 652
    :cond_0
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v10, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    :goto_1
    goto/16 :goto_0

    .line 656
    :cond_1
    int-to-double v0, v4

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v4, v0

    .line 657
    const/4 v0, 0x3

    if-ge v4, v0, :cond_2

    .line 658
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getAnnualFitnessReport less than 3 min with duration "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 659
    return-void

    .line 661
    :cond_2
    invoke-virtual {p0, v5}, Lo/dxo;->b(Ljava/util/Map;)Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;

    move-result-object v6

    .line 662
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveNumberOfTimes(I)V

    .line 663
    invoke-virtual {p0, v4}, Lo/dxo;->c(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveDescription(I)V

    .line 664
    invoke-virtual {v6, v4}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveTotalDuration(I)V

    .line 665
    invoke-virtual {p0, v6, p2}, Lo/dxo;->b(Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;I)V

    .line 666
    return-void
.end method

.method public d(I)V
    .locals 8

    .line 994
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 995
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 997
    :cond_0
    invoke-virtual {p0, p1}, Lo/dxo;->e(I)Ljava/util/ArrayList;

    move-result-object v3

    .line 998
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 999
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "gainList null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1000
    return-void

    .line 1002
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1003
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1004
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_4

    .line 1005
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 1006
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1007
    add-int/lit8 v0, v4, -0x1

    if-eq v6, v0, :cond_3

    .line 1008
    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1011
    :cond_4
    sget-object v0, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v6

    .line 1012
    sget-object v0, Lo/dxp;->i:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1389

    invoke-static {p1, v0, v1}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v7

    .line 1013
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1014
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 1015
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateMedalInfo data="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "medalData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1016
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v6, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1017
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v7, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 1018
    return-void
.end method

.method public d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 1111
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1112
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 1114
    :cond_0
    iget-object v0, p0, Lo/dxo;->c:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dxo;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1115
    :cond_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->c:Ljava/util/concurrent/ExecutorService;

    .line 1117
    :cond_2
    iget-object v0, p0, Lo/dxo;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dxo$3;

    invoke-direct {v1, p0, p1}, Lo/dxo$3;-><init>(Lo/dxo;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1122
    iput-object p2, p0, Lo/dxo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1123
    iput p1, p0, Lo/dxo;->f:I

    .line 1124
    return-void
.end method

.method public d(JJI)V
    .locals 8

    .line 1168
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1169
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "isOversea,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1170
    return-void

    .line 1172
    :cond_0
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1173
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dxo;->d:Lo/dwr;

    .line 1175
    :cond_1
    iget-object v0, p0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v7

    .line 1176
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 1177
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "achieveAdapter is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1178
    return-void

    .line 1180
    :cond_2
    move-object v0, v7

    iget-object v1, p0, Lo/dxo;->b:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v6, Lo/dxo$1;

    invoke-direct {v6, p0, p5}, Lo/dxo$1;-><init>(Lo/dxo;I)V

    invoke-interface/range {v0 .. v6}, Lo/dti;->f(Landroid/content/Context;JJLo/duh;)V

    .line 1198
    return-void
.end method

.method public d(Ljava/util/List;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 196
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "computeWeightData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 198
    return-void

    .line 200
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 201
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 202
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v7

    .line 203
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 204
    :cond_1
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_2
    goto :goto_0

    .line 207
    :cond_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 208
    const/4 v0, 0x3

    if-ge v5, v0, :cond_4

    .line 209
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "computeWeightData size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    return-void

    .line 212
    :cond_4
    add-int/lit8 v0, v5, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 213
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 214
    const-string v0, "weight"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 215
    const-string v0, "weight"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 216
    const-string v0, "weight"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-string v2, "weight"

    invoke-virtual {v6, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    sub-double v12, v0, v2

    .line 217
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiHealthData;

    .line 218
    const-string v0, "weight"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v16

    .line 219
    move-wide/from16 v0, v16

    invoke-static {v0, v1, v10, v11}, Lo/dzr;->e(DD)I

    move-result v0

    if-lez v0, :cond_5

    .line 220
    move-wide/from16 v10, v16

    .line 222
    :cond_5
    move-wide/from16 v0, v16

    invoke-static {v0, v1, v8, v9}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_6

    .line 223
    move-wide/from16 v8, v16

    .line 225
    :cond_6
    goto :goto_1

    .line 226
    :cond_7
    sget-object v0, Lo/dxp;->f:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1b59

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v14

    .line 227
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v14, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 230
    sget-object v0, Lo/dxp;->f:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1b5a

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v15

    .line 231
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    invoke-static {v15, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 234
    sget-object v0, Lo/dxp;->f:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p2

    const/16 v2, 0x1b5b

    invoke-static {v1, v0, v2}, Lo/dxv;->c(ILjava/lang/String;I)Lo/dvf;

    move-result-object v16

    .line 235
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/dvf;->setValues(Ljava/lang/String;)V

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move-object/from16 v1, v16

    invoke-static {v1, v0}, Lo/dxv;->c(Lo/dvf;Lo/dwr;)Z

    .line 237
    return-void
.end method

.method public e(I)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 301
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 302
    iget-object v0, p0, Lo/dxo;->d:Lo/dwr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v2}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v3

    .line 303
    invoke-static {p1, v3}, Lo/dxt;->a(ILjava/util/List;)Ljava/util/ArrayList;

    move-result-object v4

    .line 304
    return-object v4
.end method

.method public k(I)V
    .locals 16

    .line 1063
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "enter getAnnualReport"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1064
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1065
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/dxo;->d:Lo/dwr;

    .line 1067
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->k(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;

    move-result-object v3

    .line 1068
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->i(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;

    move-result-object v4

    .line 1069
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->e(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;

    move-result-object v5

    .line 1070
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->c(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;

    move-result-object v6

    .line 1071
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->b(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;

    move-result-object v7

    .line 1073
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->d(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;

    move-result-object v8

    .line 1074
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->a(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;

    move-result-object v9

    .line 1075
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->h(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;

    move-result-object v10

    .line 1076
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->d:Lo/dwr;

    move/from16 v1, p1

    invoke-static {v0, v1}, Lo/dxv;->g(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;

    move-result-object v11

    .line 1078
    new-instance v12, Lcom/huawei/pluginachievement/report/bean/AnnualReport;

    invoke-direct {v12}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;-><init>()V

    .line 1079
    invoke-virtual {v12, v6}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportCycle(Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;)V

    .line 1080
    invoke-virtual {v12, v5}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportRun(Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;)V

    .line 1081
    invoke-virtual {v12, v7}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportStep(Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;)V

    .line 1082
    invoke-virtual {v12, v9}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportFitness(Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;)V

    .line 1083
    invoke-virtual {v12, v8}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportInital(Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;)V

    .line 1084
    invoke-virtual {v12, v3}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportReward(Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;)V

    .line 1085
    invoke-virtual {v12, v4}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportSumary(Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;)V

    .line 1086
    invoke-virtual {v12, v10}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportSleep(Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;)V

    .line 1087
    invoke-virtual {v12, v11}, Lcom/huawei/pluginachievement/report/bean/AnnualReport;->setReportWeight(Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;)V

    .line 1088
    new-instance v13, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;

    invoke-direct {v13}, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;-><init>()V

    .line 1089
    invoke-virtual {v13, v12}, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;->setReport2018(Lcom/huawei/pluginachievement/report/bean/AnnualReport;)V

    .line 1090
    move/from16 v0, p1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dxk;->d(IZ)J

    move-result-wide v0

    invoke-static {v0, v1, v7, v8}, Lo/dxv;->a(JLcom/huawei/pluginachievement/report/bean/AnnualReportStep;Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;->setResultCode(I)V

    .line 1093
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/google/gson/GsonBuilder;->excludeFieldsWithModifiers([I)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v14

    .line 1094
    invoke-virtual {v14, v13}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 1095
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "annualReport="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1096
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1097
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v15}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1099
    :cond_1
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/dxo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1100
    return-void

    :array_0
    .array-data 4
        0x4
    .end array-data
.end method
