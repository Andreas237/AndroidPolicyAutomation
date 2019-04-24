.class public Lo/bgs;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field private e:Lo/ayi;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 53
    return-void
.end method

.method private a(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V"
        }
    .end annotation

    .line 251
    const/4 v5, 0x0

    .line 252
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 253
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-nez v0, :cond_0

    .line 255
    const/4 v5, 0x1

    .line 257
    :cond_0
    new-instance v8, Lo/ayb;

    invoke-direct {v8}, Lo/ayb;-><init>()V

    .line 258
    invoke-virtual {v8, v5}, Lo/ayb;->a(Z)V

    .line 260
    const/4 v9, 0x0

    .line 262
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 264
    invoke-virtual {v8, v11}, Lo/ayb;->c(Lo/bfh;)V

    .line 265
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-nez v0, :cond_1

    .line 267
    move-object v9, v11

    .line 269
    :cond_1
    goto :goto_0

    .line 271
    :cond_2
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 272
    new-instance v10, Lo/axx;

    invoke-direct {v10}, Lo/axx;-><init>()V

    .line 273
    invoke-virtual {v8, v10}, Lo/ayb;->c(Lo/bfh;)V

    .line 275
    if-eqz v5, :cond_3

    .line 277
    new-instance v11, Lo/ayd;

    invoke-direct {v11}, Lo/ayd;-><init>()V

    .line 278
    invoke-virtual {v8, v11}, Lo/ayb;->c(Lo/bfh;)V

    .line 282
    :cond_3
    invoke-virtual {v8}, Lo/ayb;->c()I

    move-result v10

    .line 283
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bgs;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$integer;->sns_normal_group_member_gridview_numcolumns:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v11

    .line 284
    const/4 v12, 0x0

    .line 286
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 287
    invoke-interface {v13, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v11}, Lo/bgs;->a(II)Z

    move-result v0

    invoke-virtual {v8, v0}, Lo/ayb;->setNeedHideDivider(Z)V

    .line 289
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v8}, Lo/ayb;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x0

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v13}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 292
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v11}, Lo/bgs;->a(II)Z

    move-result v0

    if-nez v0, :cond_4

    .line 294
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 295
    new-instance v15, Lo/ayi;

    invoke-direct {v15}, Lo/ayi;-><init>()V

    .line 296
    const/4 v0, 0x3

    iput v0, v15, Lo/ayi;->b:I

    .line 297
    const/16 v0, 0x33

    invoke-virtual {v15, v0}, Lo/ayi;->setCardType(I)V

    .line 298
    sget-object v0, Lo/bfp$c;->A:Lo/bfp$c;

    invoke-virtual {v15, v0}, Lo/ayi;->setEventType(Lo/bfp$c;)V

    .line 299
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Lo/ayi;->d:Ljava/lang/String;

    .line 300
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v15}, Lo/ayi;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x1

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v14}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 305
    :cond_4
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 306
    new-instance v15, Lo/axz;

    invoke-direct {v15}, Lo/axz;-><init>()V

    .line 307
    const/16 v0, 0x26

    invoke-virtual {v15, v0}, Lo/axz;->setCardType(I)V

    .line 308
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lo/axz;->setNeedHideDivider(Z)V

    .line 309
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v15}, Lo/axz;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v14}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 313
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 314
    new-instance v17, Lo/ayi;

    invoke-direct/range {v17 .. v17}, Lo/ayi;-><init>()V

    .line 315
    const/4 v0, 0x2

    move-object/from16 v1, v17

    iput v0, v1, Lo/ayi;->b:I

    .line 316
    move-object/from16 v0, v17

    const/16 v1, 0x2a

    invoke-virtual {v0, v1}, Lo/ayi;->setCardType(I)V

    .line 317
    sget-object v0, Lo/bfp$c;->q:Lo/bfp$c;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lo/ayi;->setEventType(Lo/bfp$c;)V

    .line 318
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v9, v1}, Lo/bgs;->c(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    iput-object v0, v1, Lo/ayi;->d:Ljava/lang/String;

    .line 319
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v17 .. v17}, Lo/ayi;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v16

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 323
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 324
    new-instance v19, Lo/ayg;

    invoke-direct/range {v19 .. v19}, Lo/ayg;-><init>()V

    .line 325
    const/4 v0, 0x2

    move-object/from16 v1, v19

    iput v0, v1, Lo/ayg;->c:I

    .line 326
    move-object/from16 v0, v19

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Lo/ayg;->setCardType(I)V

    .line 327
    sget-object v0, Lo/bfp$c;->y:Lo/bfp$c;

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 328
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v19 .. v19}, Lo/ayg;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v18

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 332
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 333
    new-instance v20, Lo/ayh;

    invoke-direct/range {v20 .. v20}, Lo/ayh;-><init>()V

    .line 334
    move-object/from16 v0, v20

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayh;->b(Z)V

    .line 335
    move-object/from16 v0, v20

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/ayh;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 336
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/ayh;->b(I)V

    .line 338
    move-object/from16 v0, v20

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ayh;->e(I)V

    .line 339
    move-object/from16 v0, v20

    const/16 v1, 0x2b

    invoke-virtual {v0, v1}, Lo/ayh;->setCardType(I)V

    .line 340
    sget-object v0, Lo/bfp$c;->z:Lo/bfp$c;

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 342
    move-object/from16 v0, v16

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v20 .. v20}, Lo/ayh;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v16

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 345
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 347
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 348
    new-instance v0, Lo/ayi;

    invoke-direct {v0}, Lo/ayi;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/bgs;->e:Lo/ayi;

    .line 349
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bgs;->e:Lo/ayi;

    const/4 v1, 0x1

    iput v1, v0, Lo/ayi;->b:I

    .line 350
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bgs;->e:Lo/ayi;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Lo/ayi;->setCardType(I)V

    .line 351
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bgs;->e:Lo/ayi;

    sget-object v1, Lo/bfp$c;->s:Lo/bfp$c;

    invoke-virtual {v0, v1}, Lo/ayi;->setEventType(Lo/bfp$c;)V

    .line 352
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGrpNameFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bgs;->e:Lo/ayi;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/ayi;->d:Ljava/lang/String;

    goto :goto_2

    .line 358
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bgs;->e:Lo/ayi;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bgs;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_not_set_name:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/ayi;->d:Ljava/lang/String;

    .line 360
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bgs;->e:Lo/ayi;

    move-object/from16 v1, v21

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 361
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bgs;->e:Lo/ayi;

    invoke-virtual {v1}, Lo/ayi;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v21

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 364
    new-instance v22, Ljava/util/ArrayList;

    invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V

    .line 365
    new-instance v23, Lo/axz;

    invoke-direct/range {v23 .. v23}, Lo/axz;-><init>()V

    .line 366
    move-object/from16 v0, v23

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Lo/axz;->setCardType(I)V

    .line 367
    sget-object v0, Lo/bfp$c;->t:Lo/bfp$c;

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lo/axz;->setEventType(Lo/bfp$c;)V

    .line 368
    move-object/from16 v0, v23

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/axz;->setNeedHideDivider(Z)V

    .line 369
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v23 .. v23}, Lo/axz;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v22

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 373
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 374
    new-instance v15, Lo/axz;

    invoke-direct {v15}, Lo/axz;-><init>()V

    .line 375
    const/16 v0, 0x26

    invoke-virtual {v15, v0}, Lo/axz;->setCardType(I)V

    .line 376
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lo/axz;->setNeedHideDivider(Z)V

    .line 377
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v15}, Lo/axz;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v14}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 381
    new-instance v24, Ljava/util/ArrayList;

    invoke-direct/range {v24 .. v24}, Ljava/util/ArrayList;-><init>()V

    .line 382
    new-instance v25, Lo/ayh;

    invoke-direct/range {v25 .. v25}, Lo/ayh;-><init>()V

    .line 383
    if-eqz v5, :cond_7

    .line 385
    move-object/from16 v0, v25

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ayh;->b(Z)V

    .line 387
    :cond_7
    move-object/from16 v0, v25

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/ayh;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 388
    .line 389
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getSaveToContractMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_3
    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lo/ayh;->b(I)V

    .line 391
    move-object/from16 v0, v25

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayh;->e(I)V

    .line 392
    move-object/from16 v0, v25

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Lo/ayh;->setCardType(I)V

    .line 393
    sget-object v0, Lo/bfp$c;->u:Lo/bfp$c;

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 394
    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 395
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v25 .. v25}, Lo/ayh;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v24

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 397
    if-eqz v5, :cond_9

    .line 400
    new-instance v26, Ljava/util/ArrayList;

    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    .line 401
    new-instance v27, Lo/ayg;

    invoke-direct/range {v27 .. v27}, Lo/ayg;-><init>()V

    .line 402
    const/4 v0, 0x3

    move-object/from16 v1, v27

    iput v0, v1, Lo/ayg;->c:I

    .line 403
    move-object/from16 v0, v27

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lo/ayg;->setCardType(I)V

    .line 404
    sget-object v0, Lo/bfp$c;->B:Lo/bfp$c;

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 405
    move-object/from16 v0, v27

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayg;->setNeedHideDivider(Z)V

    .line 406
    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 407
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v27 .. v27}, Lo/ayg;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v26

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 411
    :cond_9
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 412
    new-instance v15, Lo/axz;

    invoke-direct {v15}, Lo/axz;-><init>()V

    .line 413
    const/16 v0, 0x26

    invoke-virtual {v15, v0}, Lo/axz;->setCardType(I)V

    .line 414
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lo/axz;->setNeedHideDivider(Z)V

    .line 415
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 416
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v15}, Lo/axz;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v14}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 419
    new-instance v26, Ljava/util/ArrayList;

    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    .line 420
    new-instance v27, Lo/ayh;

    invoke-direct/range {v27 .. v27}, Lo/ayh;-><init>()V

    .line 421
    move-object/from16 v0, v27

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayh;->b(Z)V

    .line 422
    move-object/from16 v0, v27

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/ayh;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 423
    .line 424
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getStickTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getStickTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    const/4 v0, 0x0

    goto :goto_4

    :cond_b
    const/4 v0, 0x1

    :goto_4
    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lo/ayh;->b(I)V

    .line 426
    move-object/from16 v0, v27

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ayh;->e(I)V

    .line 427
    move-object/from16 v0, v27

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Lo/ayh;->setCardType(I)V

    .line 428
    sget-object v0, Lo/bfp$c;->v:Lo/bfp$c;

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 429
    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 430
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v27 .. v27}, Lo/ayh;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v26

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 433
    new-instance v28, Ljava/util/ArrayList;

    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    .line 434
    new-instance v29, Lo/ayh;

    invoke-direct/range {v29 .. v29}, Lo/ayh;-><init>()V

    .line 435
    move-object/from16 v0, v29

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayh;->b(Z)V

    .line 436
    move-object/from16 v0, v29

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/ayh;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 437
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    const/4 v0, 0x1

    goto :goto_5

    :cond_c
    const/4 v0, 0x0

    :goto_5
    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ayh;->b(I)V

    .line 439
    move-object/from16 v0, v29

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/ayh;->e(I)V

    .line 440
    move-object/from16 v0, v29

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Lo/ayh;->setCardType(I)V

    .line 441
    sget-object v0, Lo/bfp$c;->w:Lo/bfp$c;

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 442
    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 443
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v29 .. v29}, Lo/ayh;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v28

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 446
    new-instance v30, Ljava/util/ArrayList;

    invoke-direct/range {v30 .. v30}, Ljava/util/ArrayList;-><init>()V

    .line 448
    new-instance v31, Lo/ayg;

    invoke-direct/range {v31 .. v31}, Lo/ayg;-><init>()V

    .line 449
    const/4 v0, 0x1

    move-object/from16 v1, v31

    iput v0, v1, Lo/ayg;->c:I

    .line 450
    move-object/from16 v0, v31

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Lo/ayg;->setCardType(I)V

    .line 451
    sget-object v0, Lo/bfp$c;->x:Lo/bfp$c;

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 452
    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 453
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v31 .. v31}, Lo/ayg;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v30

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 456
    new-instance v32, Ljava/util/ArrayList;

    invoke-direct/range {v32 .. v32}, Ljava/util/ArrayList;-><init>()V

    .line 457
    new-instance v33, Lo/ayg;

    invoke-direct/range {v33 .. v33}, Lo/ayg;-><init>()V

    .line 458
    const/4 v0, 0x4

    move-object/from16 v1, v33

    iput v0, v1, Lo/ayg;->c:I

    .line 459
    move-object/from16 v0, v33

    const/16 v1, 0x34

    invoke-virtual {v0, v1}, Lo/ayg;->setCardType(I)V

    .line 460
    sget-object v0, Lo/bfp$c;->H:Lo/bfp$c;

    move-object/from16 v1, v33

    invoke-virtual {v1, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 461
    move-object/from16 v0, v32

    move-object/from16 v1, v33

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v33 .. v33}, Lo/ayg;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v32

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 465
    new-instance v34, Ljava/util/ArrayList;

    invoke-direct/range {v34 .. v34}, Ljava/util/ArrayList;-><init>()V

    .line 466
    new-instance v35, Lo/axz;

    invoke-direct/range {v35 .. v35}, Lo/axz;-><init>()V

    .line 467
    move-object/from16 v0, v35

    const/16 v1, 0x30

    invoke-virtual {v0, v1}, Lo/axz;->setCardType(I)V

    .line 468
    move-object/from16 v0, v34

    move-object/from16 v1, v35

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual/range {v35 .. v35}, Lo/axz;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    move-object/from16 v4, v34

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 471
    :cond_d
    return-void
.end method

.method private a(II)Z
    .locals 1

    .line 478
    mul-int/lit8 v0, p2, 0xa

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 489
    const/4 v1, 0x0

    .line 490
    if-eqz p1, :cond_0

    .line 492
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v1

    .line 493
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 495
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 500
    :cond_0
    move-object v1, p2

    .line 502
    :cond_1
    :goto_0
    return-object v1
.end method

.method private c(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V"
        }
    .end annotation

    .line 110
    new-instance v5, Lo/ayb;

    invoke-direct {v5}, Lo/ayb;-><init>()V

    .line 112
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 113
    const/4 v8, 0x0

    .line 114
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 116
    invoke-virtual {v5, v10}, Lo/ayb;->c(Lo/bfh;)V

    .line 117
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-nez v0, :cond_0

    .line 119
    move-object v8, v10

    .line 121
    :cond_0
    goto :goto_0

    .line 123
    :cond_1
    const/4 v9, 0x0

    .line 125
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 126
    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/ayb;->setNeedHideDivider(Z)V

    .line 128
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v5}, Lo/ayb;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x0

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v10}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 131
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 132
    new-instance v12, Lo/axz;

    invoke-direct {v12}, Lo/axz;-><init>()V

    .line 133
    const/16 v0, 0x26

    invoke-virtual {v12, v0}, Lo/axz;->setCardType(I)V

    .line 134
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/axz;->setNeedHideDivider(Z)V

    .line 135
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v12}, Lo/axz;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x1

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v11}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 139
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 140
    new-instance v14, Lo/ayi;

    invoke-direct {v14}, Lo/ayi;-><init>()V

    .line 141
    const/4 v0, 0x2

    iput v0, v14, Lo/ayi;->b:I

    .line 142
    const/16 v0, 0x2a

    invoke-virtual {v14, v0}, Lo/ayi;->setCardType(I)V

    .line 143
    sget-object v0, Lo/bfp$c;->q:Lo/bfp$c;

    invoke-virtual {v14, v0}, Lo/ayi;->setEventType(Lo/bfp$c;)V

    .line 144
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v8, v1}, Lo/bgs;->c(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v14, Lo/ayi;->d:Ljava/lang/String;

    .line 145
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v14}, Lo/ayi;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x2

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v13}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 149
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 150
    new-instance v16, Lo/ayg;

    invoke-direct/range {v16 .. v16}, Lo/ayg;-><init>()V

    .line 152
    const/4 v0, 0x2

    move-object/from16 v1, v16

    iput v0, v1, Lo/ayg;->c:I

    .line 153
    sget-object v0, Lo/bfp$c;->y:Lo/bfp$c;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 154
    move-object/from16 v0, v16

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Lo/ayg;->setCardType(I)V

    .line 155
    move-object/from16 v0, v16

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual/range {v16 .. v16}, Lo/ayg;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x3

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v15}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 159
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 160
    new-instance v18, Lo/ayh;

    invoke-direct/range {v18 .. v18}, Lo/ayh;-><init>()V

    .line 162
    move-object/from16 v0, v18

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/ayh;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 163
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/ayh;->b(I)V

    .line 165
    move-object/from16 v0, v18

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ayh;->e(I)V

    .line 166
    move-object/from16 v0, v18

    const/16 v1, 0x2b

    invoke-virtual {v0, v1}, Lo/ayh;->setCardType(I)V

    .line 167
    sget-object v0, Lo/bfp$c;->z:Lo/bfp$c;

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 168
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual/range {v18 .. v18}, Lo/ayh;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x4

    const/4 v3, 0x1

    move-object/from16 v4, v17

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 171
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 172
    new-instance v19, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 173
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 174
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setOldUserImageUrl(Ljava/lang/String;)V

    .line 175
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 176
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 177
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserRemarkName(Ljava/lang/String;)V

    .line 178
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 179
    sget-object v0, Lo/bfp$c;->D:Lo/bfp$c;

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setEventType(Lo/bfp$c;)V

    .line 180
    move-object/from16 v0, v19

    invoke-virtual {v5, v0}, Lo/ayb;->c(Lo/bfh;)V

    .line 183
    new-instance v0, Lo/axx;

    sget-object v1, Lo/bfp$c;->D:Lo/bfp$c;

    invoke-direct {v0, v1}, Lo/axx;-><init>(Lo/bfp$c;)V

    move-object/from16 v20, v0

    .line 184
    move-object/from16 v0, v20

    invoke-virtual {v5, v0}, Lo/ayb;->c(Lo/bfh;)V

    .line 187
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 188
    new-instance v22, Lo/ayh;

    invoke-direct/range {v22 .. v22}, Lo/ayh;-><init>()V

    .line 190
    move-object/from16 v0, v22

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/ayh;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 191
    .line 192
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getStickTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getStickTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    :goto_2
    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lo/ayh;->b(I)V

    .line 194
    move-object/from16 v0, v22

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ayh;->e(I)V

    .line 195
    move-object/from16 v0, v22

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Lo/ayh;->setCardType(I)V

    .line 196
    sget-object v0, Lo/bfp$c;->v:Lo/bfp$c;

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 197
    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual/range {v22 .. v22}, Lo/ayh;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x5

    const/4 v3, 0x1

    move-object/from16 v4, v21

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 201
    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    .line 202
    new-instance v24, Lo/ayh;

    invoke-direct/range {v24 .. v24}, Lo/ayh;-><init>()V

    .line 204
    move-object/from16 v0, v24

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/ayh;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 205
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ayh;->b(I)V

    .line 207
    move-object/from16 v0, v24

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/ayh;->e(I)V

    .line 208
    move-object/from16 v0, v24

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Lo/ayh;->setCardType(I)V

    .line 209
    sget-object v0, Lo/bfp$c;->w:Lo/bfp$c;

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 210
    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual/range {v24 .. v24}, Lo/ayh;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x6

    const/4 v3, 0x1

    move-object/from16 v4, v23

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 214
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 215
    new-instance v12, Lo/axz;

    invoke-direct {v12}, Lo/axz;-><init>()V

    .line 216
    const/16 v0, 0x26

    invoke-virtual {v12, v0}, Lo/axz;->setCardType(I)V

    .line 217
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/axz;->setNeedHideDivider(Z)V

    .line 218
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v12}, Lo/axz;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/4 v0, 0x7

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v11}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 222
    new-instance v25, Ljava/util/ArrayList;

    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    .line 223
    new-instance v26, Lo/ayg;

    invoke-direct/range {v26 .. v26}, Lo/ayg;-><init>()V

    .line 225
    const/4 v0, 0x1

    move-object/from16 v1, v26

    iput v0, v1, Lo/ayg;->c:I

    .line 226
    sget-object v0, Lo/bfp$c;->x:Lo/bfp$c;

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 227
    move-object/from16 v0, v26

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Lo/ayg;->setCardType(I)V

    .line 228
    move-object/from16 v0, v25

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual/range {v26 .. v26}, Lo/ayg;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/16 v0, 0x8

    const/4 v3, 0x1

    move-object/from16 v4, v25

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 232
    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    .line 233
    new-instance v28, Lo/ayg;

    invoke-direct/range {v28 .. v28}, Lo/ayg;-><init>()V

    .line 234
    const/4 v0, 0x4

    move-object/from16 v1, v28

    iput v0, v1, Lo/ayg;->c:I

    .line 235
    move-object/from16 v0, v28

    const/16 v1, 0x34

    invoke-virtual {v0, v1}, Lo/ayg;->setCardType(I)V

    .line 236
    sget-object v0, Lo/bfp$c;->G:Lo/bfp$c;

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 237
    move-object/from16 v0, v27

    move-object/from16 v1, v28

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual/range {v28 .. v28}, Lo/ayg;->getCardType()I

    move-result v1

    move-object/from16 v2, p0

    const/16 v0, 0x9

    const/4 v3, 0x1

    move-object/from16 v4, v27

    invoke-virtual {v2, v0, v1, v3, v4}, Lo/bgs;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 240
    :cond_6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 91
    iget-object v0, p0, Lo/bgs;->e:Lo/ayi;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lo/bgs;->e:Lo/ayi;

    iput-object p1, v0, Lo/ayi;->d:Ljava/lang/String;

    .line 95
    :cond_0
    invoke-virtual {p0}, Lo/bgs;->a()Lo/bfq$c;

    move-result-object v1

    .line 96
    if-eqz v1, :cond_1

    .line 98
    invoke-interface {v1}, Lo/bfq$c;->b()V

    .line 100
    :cond_1
    return-void
.end method

.method public b(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V"
        }
    .end annotation

    .line 62
    if-nez p1, :cond_0

    .line 64
    return-void

    .line 66
    :cond_0
    iget-object v0, p0, Lo/bgs;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 68
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v1

    .line 69
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 71
    invoke-direct {p0, p1, p2, p3}, Lo/bgs;->a(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V

    goto :goto_0

    .line 73
    :cond_1
    const/4 v0, 0x1

    if-ne v0, v1, :cond_2

    .line 75
    invoke-direct {p0, p1, p2, p3}, Lo/bgs;->c(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V

    .line 78
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lo/bgs;->a()Lo/bfq$c;

    move-result-object v2

    .line 79
    if-eqz v2, :cond_3

    .line 81
    invoke-interface {v2}, Lo/bfq$c;->b()V

    .line 84
    :cond_3
    return-void
.end method
