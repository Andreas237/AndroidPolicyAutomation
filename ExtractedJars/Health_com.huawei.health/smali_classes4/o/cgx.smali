.class public Lo/cgx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgx$e;
    }
.end annotation


# instance fields
.field private d:Lo/cgt;

.field private e:Lo/cfh;


# direct methods
.method public constructor <init>(Lo/cfh;Lo/cgt;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lo/cgx;->e:Lo/cfh;

    .line 40
    iput-object p2, p0, Lo/cgx;->d:Lo/cgt;

    .line 41
    return-void
.end method

.method private a(J)J
    .locals 8

    .line 509
    const-wide/16 v0, 0x5

    rem-long v4, p1, v0

    .line 510
    const-wide/16 v0, 0x5

    div-long v6, p1, v0

    .line 512
    const-wide/16 v0, 0x2

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 513
    const-wide/16 v0, 0x1

    add-long/2addr v0, v6

    const-wide/16 v2, 0x5

    mul-long/2addr v0, v2

    return-wide v0

    .line 515
    :cond_0
    const-wide/16 v0, 0x5

    mul-long/2addr v0, v6

    return-wide v0
.end method

.method private a(Lo/cex;J)V
    .locals 9

    .line 318
    const/4 v4, 0x5

    .line 319
    invoke-virtual {p1}, Lo/cex;->r()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/cex;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 320
    :cond_0
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillAltitudeData motionPath requestAltitudeList null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-void

    .line 323
    :cond_1
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->u()Z

    move-result v0

    if-nez v0, :cond_2

    .line 324
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 325
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v5}, Lo/cfh;->e(Ljava/util/ArrayList;)V

    .line 326
    invoke-virtual {p1}, Lo/cex;->r()Ljava/util/List;

    move-result-object v6

    .line 327
    invoke-static {v6, p2, p3}, Lo/cdn;->e(Ljava/util/List;J)I

    move-result v4

    .line 328
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v4}, Lo/cfh;->h(I)V

    .line 329
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 330
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cfp;

    .line 331
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 334
    :cond_2
    return-void
.end method

.method private a(Lo/cgx$e;Lo/cex;JJLcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 6

    .line 69
    sget-object v0, Lo/cgx$4;->d:[I

    invoke-virtual {p1}, Lo/cgx$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 71
    :pswitch_0
    invoke-direct {p0, p2, p3, p4}, Lo/cgx;->c(Lo/cex;J)V

    .line 72
    goto :goto_1

    .line 75
    :pswitch_1
    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-wide v4, p5

    invoke-direct/range {v0 .. v5}, Lo/cgx;->d(Lo/cex;JJ)V

    .line 76
    goto :goto_1

    .line 79
    :pswitch_2
    invoke-direct {p0, p2, p3, p4, p7}, Lo/cgx;->e(Lo/cex;JLcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 80
    goto :goto_1

    .line 82
    :pswitch_3
    invoke-direct {p0, p2, p3, p4}, Lo/cgx;->a(Lo/cex;J)V

    .line 83
    goto :goto_1

    .line 85
    :pswitch_4
    invoke-direct {p0, p2, p3, p4}, Lo/cgx;->b(Lo/cex;J)V

    .line 86
    goto :goto_1

    .line 88
    :pswitch_5
    invoke-direct {p0, p2, p3, p4}, Lo/cgx;->d(Lo/cex;J)V

    .line 89
    goto :goto_1

    .line 91
    :pswitch_6
    invoke-direct {p0, p2, p3, p4}, Lo/cgx;->e(Lo/cex;J)V

    .line 92
    goto :goto_1

    .line 94
    :pswitch_7
    invoke-direct {p0, p2, p7}, Lo/cgx;->c(Lo/cex;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 95
    goto :goto_1

    .line 97
    :pswitch_8
    invoke-direct {p0, p2, p7}, Lo/cgx;->c(Lo/cex;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 98
    goto :goto_1

    .line 101
    :goto_0
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillData unknown dataType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private a(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cev;>;)Z"
        }
    .end annotation

    .line 208
    const/4 v4, 0x0

    .line 209
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cev;

    .line 211
    if-nez v6, :cond_0

    .line 212
    const/4 v0, 0x0

    return v0

    .line 214
    :cond_0
    if-nez v4, :cond_1

    .line 216
    move-object v4, v6

    .line 217
    goto :goto_0

    .line 219
    :cond_1
    invoke-virtual {v6}, Lo/cev;->e()J

    move-result-wide v0

    invoke-virtual {v4}, Lo/cev;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 221
    const/4 v0, 0x0

    return v0

    .line 223
    :cond_2
    goto :goto_0

    .line 225
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private b(Lo/cex;J)V
    .locals 6

    .line 337
    const/4 v4, 0x5

    .line 338
    invoke-virtual {p1}, Lo/cex;->t()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 339
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSwolfList motionPath requestSwolfList null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    return-void

    .line 342
    :cond_0
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->q()Z

    move-result v0

    if-nez v0, :cond_1

    .line 343
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 344
    invoke-virtual {p1}, Lo/cex;->t()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 345
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v5}, Lo/cfh;->a(Ljava/util/List;)V

    .line 347
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v4}, Lo/cfh;->f(I)V

    .line 349
    :cond_1
    return-void
.end method

.method private c(Lo/cex;J)V
    .locals 12

    .line 107
    const/4 v4, 0x5

    .line 108
    invoke-virtual {p1}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    .line 109
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillHeartRateData motionPath requestHeartRateList null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->l()Z

    move-result v0

    if-nez v0, :cond_9

    .line 113
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 114
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v5}, Lo/cfh;->c(Ljava/util/ArrayList;)V

    .line 115
    invoke-virtual {p1}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v6

    .line 117
    invoke-virtual {p1}, Lo/cex;->c()Ljava/util/ArrayList;

    move-result-object v7

    .line 119
    invoke-static {v6, p2, p3}, Lo/cdn;->e(Ljava/util/List;J)I

    move-result v4

    .line 120
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v4}, Lo/cfh;->b(I)V

    .line 123
    const/4 v8, 0x0

    .line 124
    invoke-direct {p0, v6}, Lo/cgx;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v7}, Lo/cgx;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 125
    const/4 v8, 0x1

    .line 129
    :cond_1
    const/4 v9, 0x0

    .line 130
    if-eqz v7, :cond_2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 131
    :cond_2
    const/4 v9, 0x1

    .line 135
    :cond_3
    if-eqz v8, :cond_4

    if-eqz v9, :cond_7

    .line 137
    :cond_4
    const/4 v10, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_5

    .line 138
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cev;

    .line 139
    new-instance v0, Lo/cev;

    mul-int v1, v4, v10

    int-to-long v1, v1

    invoke-virtual {v11}, Lo/cev;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cev;-><init>(JI)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 142
    :cond_5
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-lez v0, :cond_6

    .line 144
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    mul-int/2addr v1, v4

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cfh;->b(F)V

    goto :goto_1

    .line 146
    :cond_6
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0}, Lo/cfh;->E()V

    .line 148
    :goto_1
    return-void

    .line 152
    :cond_7
    invoke-direct {p0, v6, v7, v5, v4}, Lo/cgx;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V

    .line 155
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    if-lez v0, :cond_8

    .line 156
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    mul-int/2addr v1, v4

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cfh;->b(F)V

    goto :goto_2

    .line 158
    :cond_8
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0}, Lo/cfh;->E()V

    .line 162
    :cond_9
    :goto_2
    return-void
.end method

.method private c(Lo/cex;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 26

    .line 414
    const/4 v10, 0x5

    .line 415
    const-wide/16 v11, -0x1

    .line 416
    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_1

    .line 417
    :cond_0
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillRunningPostureList motionPath requestRunningPostureList null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    return-void

    .line 420
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->z()Z

    move-result v0

    if-nez v0, :cond_b

    .line 421
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 422
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v13}, Lo/cfh;->e(Ljava/util/List;)V

    .line 423
    invoke-virtual/range {p1 .. p1}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v14

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v10}, Lo/cfh;->k(I)V

    .line 426
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lo/cgx;->c(Ljava/util/List;)Z

    move-result v15

    .line 427
    const/16 v16, 0x0

    :goto_0
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_a

    .line 428
    move/from16 v0, v16

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/cvv;

    .line 429
    if-nez v17, :cond_2

    .line 430
    goto/16 :goto_2

    .line 432
    :cond_2
    invoke-virtual/range {v17 .. v17}, Lo/cvv;->b()J

    move-result-wide v18

    .line 433
    if-eqz v15, :cond_3

    .line 434
    const-wide/16 v0, 0x3e8

    div-long v18, v18, v0

    .line 436
    :cond_3
    move-object/from16 v0, p0

    move-wide/from16 v1, v18

    invoke-direct {v0, v1, v2}, Lo/cgx;->a(J)J

    move-result-wide v20

    .line 437
    cmp-long v0, v20, v11

    if-nez v0, :cond_7

    .line 440
    const/16 v22, 0x0

    .line 441
    add-int/lit8 v0, v16, 0x1

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 442
    add-int/lit8 v0, v16, 0x1

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lo/cvv;

    .line 443
    if-eqz v23, :cond_5

    .line 444
    invoke-virtual/range {v23 .. v23}, Lo/cvv;->b()J

    move-result-wide v24

    .line 446
    if-eqz v15, :cond_4

    .line 447
    const-wide/16 v0, 0x3e8

    div-long v24, v24, v0

    .line 449
    :cond_4
    move-object/from16 v0, p0

    move-wide/from16 v1, v24

    invoke-direct {v0, v1, v2}, Lo/cgx;->a(J)J

    move-result-wide v0

    sub-long v0, v0, v20

    const-wide/16 v2, 0xa

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    .line 450
    const-wide/16 v0, 0x5

    add-long v20, v20, v0

    .line 451
    const/16 v22, 0x1

    .line 455
    :cond_5
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    if-nez v22, :cond_6

    .line 456
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 458
    :cond_6
    goto :goto_1

    :cond_7
    sub-long v0, v20, v11

    const-wide/16 v2, 0xa

    cmp-long v0, v0, v2

    if-nez v0, :cond_9

    .line 459
    add-int/lit8 v0, v16, 0x1

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_9

    .line 460
    add-int/lit8 v0, v16, 0x1

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lo/cvv;

    .line 461
    if-eqz v22, :cond_9

    .line 462
    invoke-virtual/range {v22 .. v22}, Lo/cvv;->b()J

    move-result-wide v23

    .line 463
    if-eqz v15, :cond_8

    .line 464
    const-wide/16 v0, 0x3e8

    div-long v23, v23, v0

    .line 466
    :cond_8
    move-object/from16 v0, p0

    move-wide/from16 v1, v23

    invoke-direct {v0, v1, v2}, Lo/cgx;->a(J)J

    move-result-wide v0

    cmp-long v0, v0, v20

    if-nez v0, :cond_9

    .line 467
    const-wide/16 v0, 0x5

    sub-long v20, v20, v0

    .line 472
    :cond_9
    :goto_1
    new-instance v0, Lo/cvv;

    move-wide/from16 v1, v20

    invoke-virtual/range {v17 .. v17}, Lo/cvv;->e()I

    move-result v3

    .line 473
    invoke-virtual/range {v17 .. v17}, Lo/cvv;->c()I

    move-result v4

    invoke-virtual/range {v17 .. v17}, Lo/cvv;->d()I

    move-result v5

    .line 474
    invoke-virtual/range {v17 .. v17}, Lo/cvv;->a()I

    move-result v6

    invoke-virtual/range {v17 .. v17}, Lo/cvv;->f()I

    move-result v7

    .line 475
    invoke-virtual/range {v17 .. v17}, Lo/cvv;->k()I

    move-result v8

    invoke-virtual/range {v17 .. v17}, Lo/cvv;->i()I

    move-result v9

    invoke-direct/range {v0 .. v9}, Lo/cvv;-><init>(JIIIIIII)V

    move-object/from16 v22, v0

    .line 476
    move-object/from16 v0, v22

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    move-wide/from16 v11, v20

    .line 427
    :goto_2
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_0

    .line 481
    :cond_a
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRunningPostureData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v16, v0, v2

    .line 483
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgx;->e:Lo/cfh;

    move-wide/from16 v1, v16

    long-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cfh;->e(F)V

    .line 486
    :cond_b
    return-void
.end method

.method private c(Ljava/util/List;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cvv;>;)Z"
        }
    .end annotation

    .line 491
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    .line 492
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->b()J

    move-result-wide v4

    .line 493
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->b()J

    move-result-wide v6

    .line 494
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->b()J

    move-result-wide v8

    .line 496
    sub-long v0, v6, v4

    const-wide/16 v2, 0x1f4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    sub-long v0, v8, v6

    const-wide/16 v2, 0x1f4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 497
    const/4 v0, 0x1

    return v0

    .line 499
    :cond_0
    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 500
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 501
    const/4 v0, 0x1

    return v0

    .line 504
    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lo/cex;J)V
    .locals 13

    .line 368
    const/4 v7, 0x5

    .line 369
    invoke-virtual {p1}, Lo/cex;->q()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 370
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSwolfList motionPath requestSwolfList null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    return-void

    .line 373
    :cond_0
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->x()Z

    move-result v0

    if-nez v0, :cond_a

    .line 374
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 375
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v8}, Lo/cfh;->d(Ljava/util/List;)V

    .line 376
    invoke-virtual {p1}, Lo/cex;->q()Ljava/util/List;

    move-result-object v9

    .line 377
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v7}, Lo/cfh;->i(I)V

    .line 380
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v10

    .line 382
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 384
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 385
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/cfk;

    .line 386
    invoke-virtual {v12}, Lo/cfk;->b()I

    move-result v0

    if-nez v0, :cond_1

    .line 387
    goto :goto_1

    .line 389
    :cond_1
    const/16 v0, 0x10a

    if-eq v10, v0, :cond_2

    const/16 v0, 0x106

    if-ne v10, v0, :cond_3

    .line 390
    :cond_2
    new-instance v0, Lo/cfk;

    invoke-virtual {v12}, Lo/cfk;->e()J

    move-result-wide v1

    invoke-virtual {v12}, Lo/cfk;->b()I

    move-result v3

    int-to-double v3, v3

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    div-double/2addr v3, v5

    const/4 v5, 0x2

    invoke-static {v3, v4, v5}, Lo/cxh;->d(DI)D

    move-result-wide v3

    double-to-int v3, v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfk;-><init>(JI)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 392
    :cond_3
    new-instance v0, Lo/cfk;

    invoke-virtual {v12}, Lo/cfk;->e()J

    move-result-wide v1

    invoke-virtual {v12}, Lo/cfk;->b()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x3

    invoke-static {v3, v4, v5}, Lo/cxh;->d(DI)D

    move-result-wide v3

    double-to-int v3, v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfk;-><init>(JI)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    :goto_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_4
    goto :goto_4

    .line 396
    :cond_5
    const/4 v11, 0x0

    :goto_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_9

    .line 397
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/cfk;

    .line 398
    invoke-virtual {v12}, Lo/cfk;->b()I

    move-result v0

    if-nez v0, :cond_6

    .line 399
    goto :goto_3

    .line 401
    :cond_6
    const/16 v0, 0x10a

    if-eq v10, v0, :cond_7

    const/16 v0, 0x106

    if-ne v10, v0, :cond_8

    .line 402
    :cond_7
    new-instance v0, Lo/cfk;

    invoke-virtual {v12}, Lo/cfk;->e()J

    move-result-wide v1

    invoke-virtual {v12}, Lo/cfk;->b()I

    move-result v3

    div-int/lit8 v3, v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lo/cfk;-><init>(JI)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 404
    :cond_8
    new-instance v0, Lo/cfk;

    invoke-virtual {v12}, Lo/cfk;->e()J

    move-result-wide v1

    invoke-virtual {v12}, Lo/cfk;->b()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfk;-><init>(JI)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 409
    :cond_9
    :goto_4
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v1, v1, 0x5

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cfh;->c(F)V

    .line 411
    :cond_a
    return-void
.end method

.method private d(Lo/cex;JJ)V
    .locals 12

    .line 229
    invoke-virtual {p1}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    .line 230
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillStepRateData motionPath requestStepRateList null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-void

    .line 233
    :cond_0
    const/4 v4, 0x5

    .line 234
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->p()Z

    move-result v0

    if-nez v0, :cond_5

    .line 235
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 236
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v5}, Lo/cfh;->a(Ljava/util/ArrayList;)V

    .line 237
    invoke-virtual {p1}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v6

    .line 239
    invoke-static {v6, p2, p3}, Lo/cdn;->e(Ljava/util/List;J)I

    move-result v4

    .line 240
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v4}, Lo/cfh;->d(I)V

    .line 241
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cfd;

    .line 242
    new-instance v0, Lo/cfd;

    mul-int/lit8 v1, v4, 0x0

    int-to-long v1, v1

    invoke-virtual {v7}, Lo/cfd;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfd;-><init>(JI)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 244
    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 245
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 246
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cfd;

    .line 247
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 248
    new-instance v0, Lo/cfd;

    add-int/lit8 v1, v9, 0x1

    mul-int/2addr v1, v4

    int-to-long v1, v1

    invoke-virtual {v7}, Lo/cfd;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfd;-><init>(JI)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    add-int/lit8 v0, v9, 0x1

    mul-int v10, v4, v0

    .line 251
    add-int/lit8 v9, v9, 0x1

    .line 252
    goto :goto_0

    .line 254
    :cond_1
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "find end data,lastGeneratedDataTime="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    const-wide/16 v0, 0x3e8

    div-long v0, p4, v0

    long-to-int v0, v0

    sub-int v11, v0, v10

    .line 257
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endIntervalSecs(real):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    if-gez v11, :cond_2

    .line 259
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endIntervalSecs(real) < 0,make use of endInterval = interval"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    new-instance v0, Lo/cfd;

    add-int/lit8 v1, v9, 0x1

    mul-int/2addr v1, v4

    int-to-long v1, v1

    invoke-virtual {v7}, Lo/cfd;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfd;-><init>(JI)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    add-int/lit8 v0, v9, 0x1

    mul-int v10, v4, v0

    .line 263
    add-int/lit8 v9, v9, 0x1

    .line 264
    goto/16 :goto_0

    .line 267
    :cond_2
    rem-int/lit8 v0, v11, 0x5

    sub-int/2addr v11, v0

    .line 268
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endIntervalSecs(floor 5) endIntervalSecs:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    if-nez v11, :cond_3

    .line 272
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endIntervalSecs(floor 5)==0,make time=lastGeneratedDataTime+5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    new-instance v0, Lo/cfd;

    add-int/lit8 v1, v10, 0x5

    int-to-long v1, v1

    invoke-virtual {v7}, Lo/cfd;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfd;-><init>(JI)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    add-int/lit8 v10, v10, 0x5

    .line 275
    add-int/lit8 v9, v9, 0x1

    .line 276
    goto/16 :goto_0

    .line 279
    :cond_3
    if-le v11, v4, :cond_4

    .line 280
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endIntervalSecs(floor 5)> interval("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") make time=lastGeneratedDataTime + interval"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    new-instance v0, Lo/cfd;

    add-int/lit8 v1, v9, 0x1

    mul-int/2addr v1, v4

    int-to-long v1, v1

    invoke-virtual {v7}, Lo/cfd;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfd;-><init>(JI)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    add-int/lit8 v0, v9, 0x1

    mul-int v10, v4, v0

    .line 283
    add-int/lit8 v9, v9, 0x1

    .line 284
    goto/16 :goto_0

    .line 287
    :cond_4
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endIntervalSecs(floor 5)>0 && <=interval("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") make time=lastGeneratedDataTime + endIntervalSecs("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ")"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    new-instance v0, Lo/cfd;

    add-int v1, v10, v11

    int-to-long v1, v1

    invoke-virtual {v7}, Lo/cfd;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfd;-><init>(JI)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    add-int/2addr v10, v11

    .line 290
    add-int/lit8 v9, v9, 0x1

    .line 291
    goto/16 :goto_0

    .line 293
    :cond_5
    return-void
.end method

.method private e(Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cev;>;Ljava/util/List<Lo/cev;>;Ljava/util/List<Lo/cev;>;I)V"
        }
    .end annotation

    .line 176
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 177
    invoke-interface {p2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v6

    .line 178
    const/4 v7, 0x0

    .line 180
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cev;

    .line 183
    :goto_1
    invoke-interface {v6}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    invoke-interface {v6}, Ljava/util/ListIterator;->nextIndex()I

    move-result v9

    .line 185
    invoke-interface {p2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/cev;

    .line 186
    invoke-virtual {v10}, Lo/cev;->e()J

    move-result-wide v0

    invoke-virtual {v8}, Lo/cev;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 188
    add-int/lit8 v7, v7, 0x1

    .line 190
    invoke-interface {v6}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 191
    goto :goto_1

    .line 197
    :cond_0
    new-instance v0, Lo/cev;

    int-to-long v1, p4

    int-to-long v3, v7

    mul-long/2addr v1, v3

    invoke-virtual {v8}, Lo/cev;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cev;-><init>(JI)V

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    add-int/lit8 v7, v7, 0x1

    .line 199
    goto :goto_0

    .line 200
    :cond_1
    return-void
.end method

.method private e(Lo/cex;J)V
    .locals 6

    .line 352
    const/4 v4, 0x5

    .line 353
    invoke-virtual {p1}, Lo/cex;->s()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 354
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPullFreqData null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    return-void

    .line 357
    :cond_0
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->r()Z

    move-result v0

    if-nez v0, :cond_1

    .line 358
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 359
    invoke-virtual {p1}, Lo/cex;->s()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 360
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v5}, Lo/cfh;->b(Ljava/util/List;)V

    .line 362
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v4}, Lo/cfh;->i(I)V

    .line 365
    :cond_1
    return-void
.end method

.method private e(Lo/cex;JLcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 10

    .line 296
    const/4 v5, 0x5

    .line 297
    invoke-virtual {p1}, Lo/cex;->i()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    .line 298
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillAltitudeData motionPath requestAltitudeList null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    return-void

    .line 301
    :cond_0
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->o()Z

    move-result v0

    if-nez v0, :cond_1

    .line 302
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 303
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v6}, Lo/cfh;->d(Ljava/util/ArrayList;)V

    .line 304
    invoke-virtual {p1}, Lo/cex;->i()Ljava/util/ArrayList;

    move-result-object v7

    .line 305
    invoke-static {v7, p2, p3}, Lo/cdn;->e(Ljava/util/List;J)I

    move-result v5

    .line 306
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    invoke-virtual {v0, v5}, Lo/cfh;->a(I)V

    .line 308
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfh;->c(I)V

    .line 310
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 311
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/cfb;

    .line 312
    new-instance v0, Lo/cfb;

    mul-int v1, v5, v8

    int-to-long v1, v1

    invoke-virtual {v9}, Lo/cfb;->a()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cfb;-><init>(JD)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 315
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lo/cgx$e;)V
    .locals 14

    .line 48
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData dataType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lo/cgx;->e:Lo/cfh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    if-nez v0, :cond_1

    .line 50
    :cond_0
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mTrackLineChartHolder or mTrackDetailDataManager null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 53
    :cond_1
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    if-nez v0, :cond_2

    .line 54
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mTrackDetailDataManager acquireMotionPath null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void

    .line 57
    :cond_2
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v8

    .line 58
    if-nez v8, :cond_3

    .line 59
    const-string v0, "Track_TrackLineChartHolderFiller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData motionPathSimplify null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-void

    .line 62
    :cond_3
    invoke-virtual {v8}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v9

    .line 63
    invoke-virtual {v8}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v11

    .line 64
    iget-object v0, p0, Lo/cgx;->d:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v13

    .line 65
    move-object v0, p0

    move-object v1, p1

    move-object v2, v13

    move-wide v3, v9

    move-wide v5, v11

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Lo/cgx;->a(Lo/cgx$e;Lo/cex;JJLcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 66
    return-void
.end method
