.class public Lcom/huawei/hihealthservice/sync/HiSyncService;
.super Landroid/app/IntentService;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 75
    const-string v0, "HiH_HiSyncService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 76
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-static {v0, p2, v1, v2, v3}, Lo/cui;->a(Landroid/content/Context;IIJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->c(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 292
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cpw;->i(I)V

    goto :goto_0

    .line 297
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->e(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 300
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiSyncOption;IIIII)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 242
    const v0, 0x15f91

    move/from16 v1, p6

    if-ne v0, v1, :cond_2

    .line 243
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v5

    .line 244
    invoke-static {p4}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->b(J)J

    move-result-wide v0

    invoke-static/range {p5 .. p5}, Lo/cnk;->b(I)J

    move-result-wide v2

    const/16 v4, 0x9

    invoke-static {v0, v1, v2, v3, v4}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    .line 245
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 246
    :cond_0
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadDetailDataByTime downloadDaysMap is null, stop pullDataByVersion!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    return-void

    .line 249
    :cond_1
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v7

    .line 250
    add-int/lit8 v8, v7, -0x1

    :goto_0
    if-ltz v8, :cond_2

    .line 251
    invoke-virtual {v6, v8}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v9

    .line 252
    invoke-virtual {v6, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 253
    invoke-virtual {v5, v9, v10}, Lo/cto;->e(II)V

    .line 250
    add-int/lit8 v8, v8, -0x1

    goto :goto_0

    .line 256
    :cond_2
    return-void
.end method

.method private a(Lo/ctj;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 530
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 531
    invoke-interface {p1}, Lo/ctj;->d()V

    .line 532
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    return-void
.end method

.method private b(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 386
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->l(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctr;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 387
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->d(Landroid/content/Context;)V

    .line 388
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ctj;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 524
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ctj;

    .line 525
    invoke-direct {p0, v2}, Lcom/huawei/hihealthservice/sync/HiSyncService;->b(Lo/ctj;)V

    .line 526
    goto :goto_0

    .line 527
    :cond_0
    return-void
.end method

.method private b(Lo/ctj;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 536
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 537
    invoke-interface {p1}, Lo/ctj;->a()V

    .line 538
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    return-void
.end method

.method private b(Landroid/content/Context;I)Z
    .locals 7

    .line 542
    invoke-static {}, Lo/cui;->a()I

    move-result v4

    .line 543
    const/4 v0, 0x0

    if-le v0, v4, :cond_0

    .line 544
    invoke-static {p1, p2}, Lo/cui;->b(Landroid/content/Context;I)I

    move-result v4

    .line 546
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 547
    const/4 v0, 0x1

    return v0

    .line 549
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cui;->c(Landroid/content/Context;I)J

    move-result-wide v5

    .line 550
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v5

    const-wide/32 v2, 0x2932e00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 551
    const/4 v0, 0x1

    return v0

    .line 554
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private c(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 308
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "firstSync start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 310
    const/4 v0, 0x1

    invoke-static {v0}, Lo/cui;->e(Z)V

    .line 312
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0}, Lo/czg;->c()V

    .line 314
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->o(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 315
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->l(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctr;

    move-result-object v7

    .line 316
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->r(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctz;

    move-result-object v8

    .line 317
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->s(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctu;

    move-result-object v9

    .line 318
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->z(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cti;

    move-result-object v10

    .line 319
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->q(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctj;

    move-result-object v11

    .line 320
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v12

    .line 321
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->t(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cts;

    move-result-object v13

    .line 322
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->u(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctq;

    move-result-object v14

    .line 323
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    .line 325
    move-wide v0, v15

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cui;->c(JI)J

    move-result-wide v0

    move-wide v2, v15

    invoke-virtual {v9, v0, v1, v2, v3}, Lo/ctu;->d(JJ)V

    .line 326
    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    invoke-virtual {v7, v0, v1}, Lo/ctr;->e(D)V

    .line 328
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 329
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 330
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "firstSync sport"

    new-instance v2, Lo/crd;

    move/from16 v3, p3

    invoke-direct {v2, v3}, Lo/crd;-><init>(I)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 333
    invoke-virtual {v14}, Lo/ctq;->d()V

    .line 334
    invoke-virtual {v9}, Lo/ctu;->d()V

    .line 335
    invoke-virtual {v10}, Lo/cti;->d()V

    .line 336
    invoke-virtual {v13}, Lo/cts;->d()V

    .line 338
    invoke-virtual {v8}, Lo/ctz;->d()V

    .line 339
    invoke-interface {v11}, Lo/ctj;->d()V

    .line 342
    invoke-virtual {v12}, Lo/cto;->c()V

    .line 343
    move-wide v0, v15

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lo/cui;->c(JI)J

    move-result-wide v0

    move-wide v2, v15

    invoke-virtual {v12, v0, v1, v2, v3}, Lo/cto;->e(JJ)V

    .line 344
    invoke-virtual {v12}, Lo/cto;->d()V

    .line 345
    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    invoke-virtual {v7, v0, v1}, Lo/ctr;->e(D)V

    .line 347
    invoke-virtual {v7}, Lo/ctr;->c()V

    .line 348
    move-wide v0, v15

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lo/cui;->c(JI)J

    move-result-wide v0

    move-wide v2, v15

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/ctr;->a(JJ)V

    .line 349
    invoke-virtual {v7}, Lo/ctr;->d()V

    .line 350
    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    invoke-virtual {v7, v0, v1}, Lo/ctr;->e(D)V

    .line 352
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 353
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->d(Landroid/content/Context;)V

    .line 354
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "firstSync all"

    new-instance v2, Lo/crd;

    move/from16 v3, p3

    invoke-direct {v2, v3}, Lo/crd;-><init>(I)V

    const/16 v3, 0xc8

    invoke-virtual {v0, v3, v1, v2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 356
    invoke-virtual {v7}, Lo/ctr;->a()V

    .line 357
    invoke-virtual {v9}, Lo/ctu;->a()V

    .line 358
    invoke-virtual {v10}, Lo/cti;->a()V

    .line 359
    invoke-virtual {v13}, Lo/cts;->a()V

    .line 361
    invoke-virtual {v14}, Lo/ctq;->a()V

    .line 363
    invoke-virtual {v8}, Lo/ctz;->a()V

    .line 364
    invoke-interface {v11}, Lo/ctj;->a()V

    .line 365
    invoke-virtual {v12}, Lo/cto;->a()V

    .line 366
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cui;->e(Z)V

    .line 367
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "firstSync end ,totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->d(Landroid/content/Context;)Lo/cuq;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v5

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lo/cuq;->a(J)V

    .line 370
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ctj;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 518
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ctj;

    .line 519
    invoke-direct {p0, v2}, Lcom/huawei/hihealthservice/sync/HiSyncService;->a(Lo/ctj;)V

    .line 520
    goto :goto_0

    .line 521
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 259
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadDetailData syncDataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadDetailData   downedType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 263
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->l(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctr;

    move-result-object v4

    .line 264
    invoke-virtual {v4}, Lo/ctr;->b()V

    .line 265
    goto :goto_0

    .line 267
    :pswitch_1
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v5

    .line 268
    invoke-virtual {v5}, Lo/cto;->e()V

    .line 269
    goto :goto_0

    .line 271
    :pswitch_2
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v6

    .line 272
    invoke-virtual {v6}, Lo/cto;->b()V

    .line 273
    goto :goto_0

    .line 275
    :pswitch_3
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v7

    .line 276
    invoke-virtual {v7}, Lo/cto;->k()V

    .line 277
    goto :goto_0

    .line 279
    :pswitch_4
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v8

    .line 280
    invoke-virtual {v8}, Lo/cto;->g()V

    .line 281
    .line 285
    :goto_0
    :pswitch_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x271b
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private d(Ljava/lang/Exception;)V
    .locals 4

    .line 558
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 559
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkNetErrorTimer e.getMessage() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    return-void

    .line 562
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Service unavailable.6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 563
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkNetErrorTimer EXP_NET_ERROR_STR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0}, Lo/csk;->s()V

    goto :goto_0

    .line 565
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SYNC_EX: AUTH_FAILED "

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SYNC_EX: TOKEN_EXPIRED "

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 566
    :cond_2
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkNetErrorTimer AUTH_FAILED or TOKEN_EXPIRED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0}, Lo/csk;->r()V

    .line 569
    :cond_3
    :goto_0
    return-void
.end method

.method private d(Lo/ctj;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 507
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeSync hiSyncBase is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 509
    invoke-interface {p1}, Lo/ctj;->d()V

    .line 510
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 511
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeSync downLoad end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sub-long v2, v6, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    invoke-interface {p1}, Lo/ctj;->a()V

    .line 513
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 514
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeSync upLoad end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sub-long v2, v8, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    return-void
.end method

.method private e(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 373
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "incrementalSync start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 375
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->x(Lcom/huawei/hihealth/HiSyncOption;II)Ljava/util/List;

    move-result-object v6

    .line 376
    invoke-direct {p0, v6}, Lcom/huawei/hihealthservice/sync/HiSyncService;->c(Ljava/util/List;)V

    .line 377
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->o(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 378
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 379
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->d(Landroid/content/Context;)V

    .line 380
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "incrementalSync"

    new-instance v2, Lo/crd;

    invoke-direct {v2, p3}, Lo/crd;-><init>(I)V

    const/16 v3, 0xc8

    invoke-virtual {v0, v3, v1, v2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 381
    invoke-direct {p0, v6}, Lcom/huawei/hihealthservice/sync/HiSyncService;->b(Ljava/util/List;)V

    .line 382
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "incrementalSync end ,totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    return-void
.end method

.method private e(Lcom/huawei/hihealth/HiSyncOption;IIIII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 148
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v4

    .line 149
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSync syncDataType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    invoke-virtual {v0}, Lo/ctw;->e()V

    .line 152
    new-instance v0, Lo/ctl;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1, p2, p3}, Lo/ctl;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 153
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    .line 155
    :sswitch_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->b(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 156
    goto/16 :goto_1

    .line 158
    :sswitch_1
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->h(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 159
    goto/16 :goto_1

    .line 169
    :sswitch_2
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->f(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 170
    goto/16 :goto_1

    .line 172
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->t(Landroid/content/Context;)I

    move-result v0

    add-int/lit8 v5, v0, 0x1

    .line 173
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/cuy;->o(Landroid/content/Context;I)V

    .line 174
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->o(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 175
    goto/16 :goto_1

    .line 177
    :sswitch_4
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->k(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 178
    goto/16 :goto_1

    .line 180
    :sswitch_5
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->i(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 181
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->h(Landroid/content/Context;)V

    .line 182
    goto/16 :goto_1

    .line 184
    :sswitch_6
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cuh;->b(Landroid/content/Context;I)V

    .line 185
    const/4 v0, 0x1

    invoke-static {v0}, Lo/csk;->c(Z)V

    .line 186
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    invoke-virtual {v0}, Lo/ctw;->a()V

    .line 187
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->a(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 188
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->e(Landroid/content/Context;)V

    .line 189
    goto/16 :goto_1

    .line 191
    :sswitch_7
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->p(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 192
    goto/16 :goto_1

    .line 194
    :sswitch_8
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->m(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 195
    goto/16 :goto_1

    .line 197
    :sswitch_9
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->g(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 198
    goto/16 :goto_1

    .line 200
    :sswitch_a
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->n(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 201
    goto :goto_1

    .line 203
    :sswitch_b
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    invoke-virtual {v0}, Lo/ctw;->a()V

    .line 204
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->b(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 205
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->i(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 206
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->k(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 207
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->h(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 208
    goto :goto_1

    .line 214
    :sswitch_c
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 215
    goto :goto_1

    .line 217
    :sswitch_d
    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    const/4 v0, 0x0

    if-eq v0, p5, :cond_0

    const/4 v0, 0x0

    if-ne v0, p6, :cond_1

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, -0x2

    invoke-static {v0, v4, p6, v1}, Lo/cnt;->c(Landroid/content/Context;III)V

    .line 219
    goto :goto_1

    .line 221
    :cond_1
    invoke-direct/range {p0 .. p6}, Lcom/huawei/hihealthservice/sync/HiSyncService;->a(Lcom/huawei/hihealth/HiSyncOption;IIIII)V

    .line 222
    goto :goto_1

    .line 224
    :goto_0
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSync syncDataType is not right, syncDataType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :goto_1
    invoke-static {p2}, Lo/csk;->g(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 228
    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-static {v0, p2, v1, v2, v3}, Lo/cui;->a(Landroid/content/Context;IIJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no data sync, do not download last seven datas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-void

    .line 233
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v5

    .line 234
    invoke-virtual {v5}, Lo/cto;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 236
    const/4 v0, 0x0

    invoke-static {p2, v0}, Lo/csk;->c(IZ)V

    .line 239
    :cond_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_2
        0x5 -> :sswitch_2
        0x6 -> :sswitch_2
        0x7 -> :sswitch_2
        0x8 -> :sswitch_2
        0x9 -> :sswitch_2
        0xa -> :sswitch_2
        0x2711 -> :sswitch_2
        0x2712 -> :sswitch_3
        0x2713 -> :sswitch_4
        0x2714 -> :sswitch_5
        0x2715 -> :sswitch_7
        0x2716 -> :sswitch_8
        0x2717 -> :sswitch_9
        0x2718 -> :sswitch_b
        0x271a -> :sswitch_a
        0x271b -> :sswitch_c
        0x271c -> :sswitch_c
        0x271d -> :sswitch_c
        0x2722 -> :sswitch_d
        0x2723 -> :sswitch_c
        0x2725 -> :sswitch_c
        0x4e20 -> :sswitch_6
    .end sparse-switch
.end method

.method private f(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 403
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->q(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctj;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 404
    return-void
.end method

.method private g(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 407
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->t(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cts;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 408
    return-void
.end method

.method private h(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 399
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->r(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctz;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 400
    return-void
.end method

.method private i(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 395
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->s(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctu;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 396
    return-void
.end method

.method private k(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 391
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->z(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cti;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 392
    return-void
.end method

.method private l(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctr;
    .locals 3

    .line 442
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/4 v0, 0x1

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 443
    new-instance v0, Lo/ctr;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctr;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private m(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 426
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->v(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cua;

    move-result-object v1

    .line 427
    invoke-virtual {v1}, Lo/cua;->e()Z

    .line 428
    return-void
.end method

.method private n(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 411
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->u(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctq;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Lo/ctj;)V

    .line 412
    return-void
.end method

.method private o(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 419
    new-instance v1, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2712

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 420
    new-instance v2, Lo/cua;

    iget-object v0, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v2, v0, v1, p2, p3}, Lo/cua;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    .line 421
    invoke-direct {p0, v2}, Lcom/huawei/hihealthservice/sync/HiSyncService;->b(Lo/ctj;)V

    .line 422
    invoke-direct {p0, v2}, Lcom/huawei/hihealthservice/sync/HiSyncService;->a(Lo/ctj;)V

    .line 423
    return-void
.end method

.method private p(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 431
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->v(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cua;

    move-result-object v4

    .line 432
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getUserInfo()Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v5

    .line 433
    if-nez v5, :cond_0

    .line 434
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadUserBasic hiUserInfo error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    return-void

    .line 437
    :cond_0
    invoke-virtual {v4, v5}, Lo/cua;->b(Lcom/huawei/hihealth/HiUserInfo;)Z

    .line 438
    return-void
.end method

.method private q(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctj;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 467
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2711

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 468
    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncModel()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 470
    :sswitch_0
    new-instance v0, Lo/ctn;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctn;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0

    .line 472
    :sswitch_1
    new-instance v0, Lo/ctm;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctm;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0

    .line 474
    :goto_0
    new-instance v0, Lo/ctn;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctn;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method private r(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctz;
    .locals 3

    .line 447
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/4 v0, 0x2

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 448
    new-instance v0, Lo/ctz;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctz;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private s(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctu;
    .locals 3

    .line 452
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2714

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 453
    new-instance v0, Lo/ctu;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctu;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private t(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cts;
    .locals 3

    .line 457
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2717

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 458
    new-instance v0, Lo/cts;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/cts;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private u(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctq;
    .locals 3

    .line 462
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x271a

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 463
    new-instance v0, Lo/ctq;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctq;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private v(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cua;
    .locals 3

    .line 489
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2712

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 490
    new-instance v0, Lo/cua;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/cua;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 479
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2711

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 480
    new-instance v0, Lo/cto;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/cto;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private x(Lcom/huawei/hihealth/HiSyncOption;II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiSyncOption;II)Ljava/util/List<Lo/ctj;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 494
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 495
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->s(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctu;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 496
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->l(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctr;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 497
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->z(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cti;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 498
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->t(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cts;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 499
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->u(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctq;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 500
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->r(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctz;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 501
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->q(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctj;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/sync/HiSyncService;->w(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 503
    return-object v1
.end method

.method private z(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cti;
    .locals 3

    .line 484
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2713

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 485
    new-instance v0, Lo/cti;

    iget-object v1, p0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/cti;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method


# virtual methods
.method public onDestroy()V
    .locals 4

    .line 573
    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    .line 574
    const/4 v0, 0x0

    invoke-static {v0}, Lo/csk;->c(Z)V

    .line 575
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cui;->e(Z)V

    .line 576
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy stop all tasks"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 18

    .line 80
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 81
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent intent is null, sync stopped!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void

    .line 84
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 85
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealthservice/sync/HiSyncService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    .line 87
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 88
    const-string v0, "sync_option"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiSyncOption;

    .line 89
    const-string v0, "sync_appId"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v10

    .line 90
    const-string v0, "sync_main_UserID"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    .line 91
    const-string v0, "sync_starttime"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v12

    .line 92
    const-string v0, "sync_endtime"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v13

    .line 93
    const-string v0, "sync_datatype"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v14

    .line 94
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent sync start ! hiSyncOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-static {v9, v10, v11}, Lo/csk;->c(Lcom/huawei/hihealth/HiSyncOption;II)Z

    move-result v0

    if-nez v0, :cond_2

    .line 96
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent wrong para, sync end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void

    .line 99
    :cond_2
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v15

    .line 100
    invoke-static {}, Lo/csk;->o()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 102
    :try_start_0
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v0

    invoke-static {v0}, Lo/cui;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czu;->b(I)V

    .line 103
    move-object/from16 v0, p0

    move-object v1, v9

    move v2, v11

    move v3, v10

    move v4, v12

    move v5, v13

    move v6, v14

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hihealthservice/sync/HiSyncService;->e(Lcom/huawei/hihealth/HiSyncOption;IIIII)V

    .line 104
    const/16 v0, 0x2722

    if-ne v0, v15, :cond_3

    .line 105
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v15, v14, v1}, Lo/cnt;->c(Landroid/content/Context;III)V

    .line 108
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/csk;->k(I)V

    .line 109
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 111
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v0

    const/16 v1, 0x4e20

    if-ne v1, v0, :cond_4

    invoke-static {}, Lo/csk;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 112
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/cpw;->i(I)V

    .line 115
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    const-string v2, "0"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0}, Lo/csk;->r()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    goto :goto_0

    .line 129
    :catch_0
    move-exception v16

    .line 130
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent sync failed, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/sync/HiSyncService;->d(Ljava/lang/Exception;)V

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->u(Landroid/content/Context;)I

    move-result v0

    add-int/lit8 v17, v0, 0x1

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    move/from16 v1, v17

    invoke-static {v0, v1}, Lo/cuy;->t(Landroid/content/Context;I)V

    .line 134
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v0

    invoke-static {v0}, Lo/cuh;->d(I)V

    .line 135
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->a(Landroid/content/Context;)V

    .line 136
    const/16 v0, 0x2722

    if-ne v0, v15, :cond_5

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const/4 v1, -0x1

    invoke-static {v0, v15, v14, v1}, Lo/cnt;->c(Landroid/content/Context;III)V

    .line 141
    :cond_5
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v11}, Lcom/huawei/hihealthservice/sync/HiSyncService;->b(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/sync/HiSyncService;->a:Landroid/content/Context;

    const v1, 0x493e0

    invoke-static {v0, v11, v1}, Lo/csk;->e(Landroid/content/Context;II)V

    .line 144
    :cond_6
    const-string v0, "HiH_HiSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent end ! totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-void
.end method
