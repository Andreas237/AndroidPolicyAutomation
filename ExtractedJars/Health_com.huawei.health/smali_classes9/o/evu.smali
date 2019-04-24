.class public Lo/evu;
.super Lo/eky;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Lo/eic;

.field private M:I

.field private j:I

.field private r:Z

.field private s:Landroid/graphics/Path;

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:Landroid/graphics/Paint;

.field private z:I


# direct methods
.method public constructor <init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;Lo/eic;)V
    .locals 4

    .line 72
    invoke-direct {p0, p1, p2, p3, p4}, Lo/eky;-><init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V

    .line 46
    const/4 v0, 0x1

    iput v0, p0, Lo/evu;->u:I

    .line 47
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/evu;->s:Landroid/graphics/Path;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/evu;->r:Z

    .line 51
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/evu;->y:Landroid/graphics/Paint;

    .line 53
    const/16 v0, 0xff

    const/16 v1, 0xe6

    const/16 v2, 0x7e

    const/16 v3, 0x17

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->z:I

    .line 54
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xdf

    const/16 v3, 0x80

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->w:I

    .line 55
    const/16 v0, 0xff

    const/16 v1, 0x67

    const/16 v2, 0xdb

    const/16 v3, 0xe6

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->x:I

    .line 56
    const/16 v0, 0xff

    const/16 v1, 0x3d

    const/16 v2, 0xb6

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->v:I

    .line 57
    const/16 v0, 0x4d

    const/16 v1, 0xe6

    const/16 v2, 0x7e

    const/16 v3, 0x17

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->D:I

    .line 58
    const/16 v0, 0x4d

    const/16 v1, 0xff

    const/16 v2, 0xdf

    const/16 v3, 0x80

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->A:I

    .line 59
    const/16 v0, 0x4d

    const/16 v1, 0x67

    const/16 v2, 0xdb

    const/16 v3, 0xe6

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->j:I

    .line 60
    const/16 v0, 0x4d

    const/16 v1, 0x3d

    const/16 v2, 0xb6

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->C:I

    .line 61
    const/16 v0, 0xff

    const/16 v1, 0xcc

    const/16 v2, 0x70

    const/16 v3, 0x14

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->B:I

    .line 62
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xce

    const/16 v3, 0x61

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->F:I

    .line 63
    const/16 v0, 0xff

    const/16 v1, 0x5c

    const/16 v2, 0xc3

    const/16 v3, 0xcc

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->H:I

    .line 64
    const/16 v0, 0xff

    const/16 v1, 0x36

    const/16 v2, 0xa3

    const/16 v3, 0xd9

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->E:I

    .line 65
    const/16 v0, 0x4d

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/evu;->I:I

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/evu;->G:I

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lo/evu;->M:I

    .line 73
    invoke-direct {p0}, Lo/evu;->a()V

    .line 74
    iput-object p5, p0, Lo/evu;->J:Lo/eic;

    .line 75
    return-void
.end method

.method private a()V
    .locals 2

    .line 78
    iget-object v0, p0, Lo/evu;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/evu;->I:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 79
    iget-object v0, p0, Lo/evu;->y:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 80
    iget-object v0, p0, Lo/evu;->y:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 81
    iget-object v0, p0, Lo/evu;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 82
    return-void
.end method

.method private c(F)I
    .locals 2

    .line 411
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x41e80000    # 29.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 412
    const/4 v1, 0x1

    goto :goto_0

    .line 413
    :cond_0
    const/high16 v0, 0x41e80000    # 29.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 414
    const/4 v1, 0x2

    goto :goto_0

    .line 415
    :cond_1
    const/high16 v0, 0x42700000    # 60.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_2

    const/high16 v0, 0x42a00000    # 80.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    .line 416
    const/4 v1, 0x3

    goto :goto_0

    .line 418
    :cond_2
    const/4 v1, 0x4

    .line 420
    :goto_0
    return v1
.end method

.method private c(Lo/ekz;)I
    .locals 1

    .line 406
    invoke-interface {p1}, Lo/ekz;->m()I

    move-result v0

    return v0
.end method

.method private d(FF)Ljava/lang/Boolean;
    .locals 13

    .line 702
    float-to-long v4, p1

    .line 703
    float-to-long v6, p2

    .line 705
    new-instance v8, Ljava/util/Date;

    const-wide/16 v0, 0x3c

    mul-long/2addr v0, v4

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 706
    new-instance v9, Ljava/util/Date;

    const-wide/16 v0, 0x3c

    mul-long/2addr v0, v6

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {v9, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 708
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 709
    invoke-virtual {v10, v8}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 710
    const/4 v0, 0x6

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v11

    .line 712
    invoke-virtual {v10, v9}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 713
    const/4 v0, 0x6

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v12

    .line 715
    if-ne v12, v11, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private e(Landroid/graphics/Canvas;ILjava/util/List;Lo/ekz;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;ILjava/util/List<Landroid/graphics/PointF;>;Lo/ekz;)V"
        }
    .end annotation

    .line 351
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 352
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 354
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v3

    .line 356
    iget v0, p0, Lo/evu;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 357
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 358
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v4, v0, [F

    .line 361
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [F

    .line 363
    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 364
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/graphics/PointF;

    .line 365
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    iget v1, v9, Landroid/graphics/PointF;->x:F

    aput v1, v4, v0

    .line 366
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    iget v1, v9, Landroid/graphics/PointF;->y:F

    aput v1, v4, v0

    .line 368
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    iget v1, v9, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v1}, Lo/evu;->c(F)I

    move-result v1

    int-to-float v1, v1

    aput v1, v5, v0

    .line 369
    goto :goto_0

    .line 371
    :cond_0
    iget-object v0, p0, Lo/evu;->c:Lo/ejh;

    invoke-interface {p4}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v8

    .line 372
    invoke-virtual {v8, v4}, Lo/nv;->e([F)V

    .line 374
    const/4 v7, 0x0

    const/4 v6, 0x0

    :goto_1
    array-length v0, v4

    if-ge v7, v0, :cond_5

    .line 375
    aget v9, v4, v7

    .line 376
    add-int/lit8 v0, v7, 0x1

    aget v10, v4, v0

    .line 379
    aget v0, v5, v6

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 380
    iget v0, p0, Lo/evu;->v:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 381
    :cond_1
    aget v0, v5, v6

    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 382
    iget v0, p0, Lo/evu;->x:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 383
    :cond_2
    aget v0, v5, v6

    const/high16 v1, 0x40400000    # 3.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 384
    iget v0, p0, Lo/evu;->w:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 385
    :cond_3
    aget v0, v5, v6

    const/high16 v1, 0x40800000    # 4.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    .line 386
    iget v0, p0, Lo/evu;->z:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 389
    :cond_4
    :goto_2
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 390
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 393
    invoke-virtual {p1, v9, v10, v3, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 396
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 397
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v3, v0

    invoke-virtual {p1, v9, v10, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 399
    add-int/lit8 v7, v7, 0x2

    .line 400
    add-int/lit8 v6, v6, 0x1

    .line 401
    goto/16 :goto_1

    .line 403
    :cond_5
    return-void
.end method

.method private e(Landroid/graphics/Canvas;Ljava/util/List;Lo/ekz;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;Ljava/util/List<Landroid/graphics/PointF;>;Lo/ekz;)V"
        }
    .end annotation

    .line 285
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 286
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 287
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 288
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 289
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 290
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 291
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v10, v0, [F

    .line 294
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v11, v0, [F

    .line 296
    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 297
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/graphics/PointF;

    .line 298
    iget v0, v15, Landroid/graphics/PointF;->x:F

    float-to-int v0, v0

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v16, v0, v2

    .line 300
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    iget v1, v15, Landroid/graphics/PointF;->x:F

    aput v1, v10, v0

    .line 301
    move v0, v12

    add-int/lit8 v12, v12, 0x1

    iget v1, v15, Landroid/graphics/PointF;->y:F

    aput v1, v10, v0

    .line 303
    move v0, v13

    add-int/lit8 v13, v13, 0x1

    iget v1, v15, Landroid/graphics/PointF;->y:F

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/evu;->c(F)I

    move-result v1

    int-to-float v1, v1

    aput v1, v11, v0

    .line 304
    goto :goto_0

    .line 306
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->c:Lo/ejh;

    invoke-interface/range {p3 .. p3}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v14

    .line 307
    invoke-virtual {v14, v10}, Lo/nv;->e([F)V

    .line 309
    const/4 v13, 0x0

    const/4 v12, 0x0

    :goto_1
    array-length v0, v10

    if-ge v13, v0, :cond_5

    .line 310
    aget v15, v10, v13

    .line 311
    add-int/lit8 v0, v13, 0x1

    aget v16, v10, v0

    .line 312
    const/4 v0, 0x2

    new-array v0, v0, [I

    move-object/from16 v17, v0

    .line 313
    aget v0, v11, v12

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 314
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->v:I

    const/4 v1, 0x0

    aput v0, v17, v1

    .line 315
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->C:I

    const/4 v1, 0x1

    aput v0, v17, v1

    .line 316
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->v:I

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 317
    :cond_1
    aget v0, v11, v12

    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 318
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->x:I

    const/4 v1, 0x0

    aput v0, v17, v1

    .line 319
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->j:I

    const/4 v1, 0x1

    aput v0, v17, v1

    .line 320
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->x:I

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 321
    :cond_2
    aget v0, v11, v12

    const/high16 v1, 0x40400000    # 3.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 322
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->w:I

    const/4 v1, 0x0

    aput v0, v17, v1

    .line 323
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->A:I

    const/4 v1, 0x1

    aput v0, v17, v1

    .line 324
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->w:I

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 325
    :cond_3
    aget v0, v11, v12

    const/high16 v1, 0x40800000    # 4.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    .line 326
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->z:I

    const/4 v1, 0x0

    aput v0, v17, v1

    .line 327
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->D:I

    const/4 v1, 0x1

    aput v0, v17, v1

    .line 328
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->z:I

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 330
    :cond_4
    :goto_2
    const/high16 v0, 0x3f400000    # 0.75f

    invoke-static {v0}, Lo/evw;->c(F)I

    move-result v18

    .line 333
    move/from16 v0, v18

    int-to-float v0, v0

    move-object/from16 v1, p1

    move/from16 v2, v16

    invoke-virtual {v1, v15, v2, v0, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 334
    const/16 v19, 0x2

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    fill-array-data v19, :array_0

    .line 335
    new-instance v0, Landroid/graphics/LinearGradient;

    move/from16 v1, v18

    int-to-float v1, v1

    sub-float v1, v15, v1

    move/from16 v2, v16

    move/from16 v3, v18

    int-to-float v3, v3

    add-float/2addr v3, v15

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/evu;->l:Lo/oa;

    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    move-object/from16 v5, v17

    move-object/from16 v6, v19

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v20, v0

    .line 336
    move-object/from16 v0, v20

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 337
    move-object/from16 v0, p1

    move/from16 v1, v18

    int-to-float v1, v1

    sub-float v1, v15, v1

    move/from16 v2, v16

    move/from16 v3, v18

    int-to-float v3, v3

    add-float/2addr v3, v15

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/evu;->l:Lo/oa;

    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 338
    add-int/lit8 v13, v13, 0x2

    .line 339
    add-int/lit8 v12, v12, 0x1

    .line 340
    goto/16 :goto_1

    .line 341
    :cond_5
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private e(FF)Z
    .locals 2

    .line 278
    sub-float v0, p1, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 279
    const/4 v0, 0x1

    return v0

    .line 281
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 562
    iget-boolean v0, p0, Lo/evu;->r:Z

    return v0
.end method

.method protected c(Landroid/graphics/Canvas;Lo/ekz;)V
    .locals 30

    .line 88
    invoke-interface/range {p2 .. p2}, Lo/ekz;->aa()Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    return-void

    .line 92
    :cond_0
    invoke-interface/range {p2 .. p2}, Lo/ekz;->C()I

    move-result v5

    .line 94
    invoke-interface/range {p2 .. p2}, Lo/ekz;->Y()Z

    move-result v6

    .line 95
    if-eqz v6, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    .line 97
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->c:Lo/ejh;

    invoke-interface/range {p2 .. p2}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v8

    .line 99
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v9

    .line 102
    move-object/from16 v0, p0

    iget-object v10, v0, Lo/evu;->a:Landroid/graphics/Canvas;

    .line 104
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->c:Lo/ejh;

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 106
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    array-length v0, v0

    mul-int v1, v5, v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_2

    .line 107
    mul-int v0, v5, v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/evu;->q:[F

    .line 109
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->t:[F

    array-length v0, v0

    mul-int v1, v5, v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_3

    .line 110
    mul-int v0, v5, v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/evu;->t:[F

    .line 114
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v11

    .line 116
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 117
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 119
    if-eqz v11, :cond_15

    .line 121
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->f:Lo/nk$d;

    iget v1, v0, Lo/nk$d;->c:I

    move/from16 v16, v1

    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v16

    if-gt v1, v0, :cond_7

    .line 122
    move-object/from16 v0, p2

    move/from16 v1, v16

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v13

    .line 125
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    if-eq v0, v13, :cond_4

    .line 126
    new-instance v0, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    :cond_4
    if-nez v13, :cond_5

    goto :goto_2

    .line 132
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->u:I

    if-eqz v0, :cond_6

    .line 133
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v9

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    :cond_6
    :goto_2
    add-int/lit8 v16, v16, 0x1

    goto :goto_1

    .line 142
    :cond_7
    const/16 v16, 0x0

    .line 146
    const/16 v17, 0x0

    .line 148
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->f:Lo/nk$d;

    iget v1, v0, Lo/nk$d;->c:I

    move/from16 v18, v1

    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v18

    if-gt v1, v0, :cond_10

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 153
    if-eqz v18, :cond_9

    .line 154
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-ne v0, v1, :cond_8

    .line 155
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v18, -0x1

    if-lt v0, v1, :cond_9

    .line 156
    add-int/lit8 v0, v18, -0x1

    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/github/mikephil/charting/data/Entry;

    goto :goto_4

    .line 160
    :cond_8
    add-int/lit8 v0, v18, -0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    .line 165
    :cond_9
    :goto_4
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-ne v0, v1, :cond_a

    .line 166
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, v18

    if-lt v0, v1, :cond_b

    .line 167
    move/from16 v0, v18

    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/github/mikephil/charting/data/Entry;

    goto :goto_5

    .line 171
    :cond_a
    move-object/from16 v0, p2

    move/from16 v1, v18

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v13

    .line 175
    :cond_b
    :goto_5
    if-nez v13, :cond_c

    goto :goto_6

    .line 177
    :cond_c
    if-nez v12, :cond_d

    .line 178
    goto :goto_6

    .line 181
    :cond_d
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-ne v0, v1, :cond_e

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lo/evu;->d(FF)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 183
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    move/from16 v1, v16

    add-int/lit8 v16, v16, 0x1

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    move/from16 v1, v16

    add-int/lit8 v16, v16, 0x1

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v9

    aput v2, v0, v1

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    move/from16 v1, v16

    add-int/lit8 v16, v16, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 187
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    move/from16 v1, v16

    add-int/lit8 v16, v16, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v9

    aput v2, v0, v1

    .line 188
    add-int/lit8 v17, v17, 0x1

    .line 148
    :cond_f
    :goto_6
    add-int/lit8 v18, v18, 0x1

    goto/16 :goto_3

    .line 192
    :cond_10
    if-lez v16, :cond_13

    .line 193
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    invoke-virtual {v8, v0}, Lo/nv;->e([F)V

    .line 196
    mul-int v0, v17, v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v18

    .line 197
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-eq v0, v1, :cond_13

    .line 200
    new-instance v19, Landroid/graphics/Path;

    invoke-direct/range {v19 .. v19}, Landroid/graphics/Path;-><init>()V

    .line 204
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 205
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    const/4 v1, 0x0

    aget v20, v0, v1

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    const/4 v1, 0x0

    aget v21, v0, v1

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    const/4 v1, 0x0

    aget v22, v0, v1

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    const/4 v1, 0x1

    aget v23, v0, v1

    .line 210
    const/16 v24, 0x0

    :goto_7
    mul-int/lit8 v0, v24, 0x2

    add-int/lit8 v0, v0, 0x1

    move/from16 v1, v18

    if-ge v0, v1, :cond_12

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    mul-int/lit8 v1, v24, 0x2

    mul-int/lit8 v1, v1, 0x2

    aget v25, v0, v1

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    mul-int/lit8 v1, v24, 0x2

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v26, v0, v1

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    mul-int/lit8 v1, v24, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    aget v27, v0, v1

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->q:[F

    mul-int/lit8 v1, v24, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v28, v0, v1

    .line 218
    move-object/from16 v0, p0

    move/from16 v1, v22

    move/from16 v2, v25

    invoke-direct {v0, v1, v2}, Lo/evu;->e(FF)Z

    move-result v0

    if-eqz v0, :cond_11

    move-object/from16 v0, p0

    move/from16 v1, v23

    move/from16 v2, v26

    invoke-direct {v0, v1, v2}, Lo/evu;->e(FF)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 220
    move-object/from16 v0, v19

    move/from16 v1, v27

    move/from16 v2, v28

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 222
    move/from16 v21, v27

    .line 223
    move/from16 v22, v27

    .line 224
    move/from16 v23, v28

    .line 225
    goto :goto_8

    .line 228
    :cond_11
    invoke-virtual {v10}, Landroid/graphics/Canvas;->save()I

    move-result v29

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->l:Lo/oa;

    .line 230
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->l:Lo/oa;

    .line 232
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 229
    move/from16 v2, v20

    move/from16 v3, v21

    invoke-virtual {v10, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->y:Landroid/graphics/Paint;

    const-string v1, "#26000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->y:Landroid/graphics/Paint;

    move-object/from16 v1, v19

    invoke-virtual {v10, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 235
    move/from16 v0, v29

    invoke-virtual {v10, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 238
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Path;->reset()V

    .line 240
    move/from16 v20, v25

    .line 242
    move-object/from16 v0, v19

    move/from16 v1, v25

    move/from16 v2, v26

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 243
    move-object/from16 v0, v19

    move/from16 v1, v27

    move/from16 v2, v28

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 245
    move/from16 v21, v27

    .line 246
    move/from16 v22, v27

    .line 247
    move/from16 v23, v28

    .line 210
    :goto_8
    add-int/lit8 v24, v24, 0x1

    goto/16 :goto_7

    .line 251
    :cond_12
    invoke-virtual {v10}, Landroid/graphics/Canvas;->save()I

    move-result v24

    .line 252
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->l:Lo/oa;

    .line 253
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->l:Lo/oa;

    .line 255
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 252
    move/from16 v2, v20

    move/from16 v3, v21

    invoke-virtual {v10, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 256
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->y:Landroid/graphics/Paint;

    const-string v1, "#26000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 257
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->y:Landroid/graphics/Paint;

    move-object/from16 v1, v19

    invoke-virtual {v10, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 258
    move/from16 v0, v24

    invoke-virtual {v10, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 261
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Path;->reset()V

    .line 266
    :cond_13
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->u:I

    if-eqz v0, :cond_15

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_15

    .line 267
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-ne v0, v1, :cond_14

    .line 268
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v10, v14, v1}, Lo/evu;->e(Landroid/graphics/Canvas;Ljava/util/List;Lo/ekz;)V

    goto :goto_9

    .line 270
    :cond_14
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/evu;->c(Lo/ekz;)I

    move-result v0

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v10, v0, v14, v2}, Lo/evu;->e(Landroid/graphics/Canvas;ILjava/util/List;Lo/ekz;)V

    .line 275
    :cond_15
    :goto_9
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 557
    iput-boolean p1, p0, Lo/evu;->r:Z

    .line 558
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 20

    .line 478
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v8

    .line 479
    if-eqz p2, :cond_0

    move-object/from16 v0, p2

    array-length v0, v0

    if-gtz v0, :cond_1

    .line 480
    :cond_0
    return-void

    .line 482
    :cond_1
    move-object/from16 v9, p2

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_f

    aget-object v12, v9, v11

    .line 484
    invoke-virtual {v8}, Lo/ela;->h()Ljava/util/List;

    move-result-object v13

    .line 486
    if-eqz v13, :cond_e

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 487
    goto/16 :goto_5

    .line 490
    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v14

    .line 492
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    .line 493
    const/4 v0, 0x0

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ekz;

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    invoke-interface {v0, v1}, Lo/ekz;->e(F)Ljava/util/List;

    move-result-object v15

    .line 494
    if-eqz v15, :cond_e

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_5

    .line 496
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/github/mikephil/charting/data/Entry;

    .line 499
    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/evu;->c(F)I

    move-result v17

    .line 501
    move/from16 v0, v17

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 502
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->v:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->G:I

    .line 503
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->E:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->M:I

    goto :goto_1

    .line 504
    :cond_4
    move/from16 v0, v17

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 505
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->x:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->G:I

    .line 506
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->H:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->M:I

    goto :goto_1

    .line 507
    :cond_5
    move/from16 v0, v17

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 508
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->w:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->G:I

    .line 509
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->F:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->M:I

    goto :goto_1

    .line 510
    :cond_6
    move/from16 v0, v17

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    .line 511
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->z:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->G:I

    .line 512
    move-object/from16 v0, p0

    iget v0, v0, Lo/evu;->B:I

    move-object/from16 v1, p0

    iput v0, v1, Lo/evu;->M:I

    .line 515
    :cond_7
    :goto_1
    const/16 v18, 0x1

    .line 516
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/evu;->r:Z

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->P()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 518
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/evu;->c:Lo/ejh;

    check-cast v2, Lo/eie;

    invoke-virtual {v2}, Lo/eie;->getManualReferenceLineValue()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    move-object/from16 v16, v0

    .line 522
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->c:Lo/ejh;

    .line 523
    const/4 v1, 0x0

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ekz;

    invoke-interface {v1}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    .line 522
    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    .line 523
    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    .line 524
    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/evu;->i:Lo/la;

    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 523
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v19

    .line 525
    move-object/from16 v0, v19

    iget-wide v0, v0, Lo/nw;->b:D

    double-to-float v0, v0

    move-object/from16 v1, v19

    iget-wide v1, v1, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 526
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-ne v0, v1, :cond_9

    .line 527
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v19

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move v7, v14

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/evu;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    goto :goto_2

    .line 530
    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v19

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move/from16 v6, v18

    move v7, v14

    const/4 v5, 0x1

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/evu;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 532
    :goto_2
    goto/16 :goto_5

    .line 533
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->c:Lo/ejh;

    const/4 v1, 0x0

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ekz;

    invoke-interface {v1}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v15

    .line 537
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_b
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/ekz;

    .line 538
    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v0

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Lo/ekz;->e(F)Ljava/util/List;

    move-result-object v18

    .line 539
    if-eqz v18, :cond_b

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_c

    goto :goto_3

    .line 540
    :cond_c
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/github/mikephil/charting/data/Entry;

    .line 541
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evu;->c:Lo/ejh;

    invoke-interface/range {v17 .. v17}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual/range {v19 .. v19}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/evu;->i:Lo/la;

    .line 542
    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 541
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v15

    .line 543
    iget-wide v0, v15, Lo/nw;->b:D

    double-to-float v0, v0

    iget-wide v1, v15, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 545
    sget-object v0, Lo/eic;->O:Lo/eic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/evu;->J:Lo/eic;

    if-ne v0, v1, :cond_d

    .line 546
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v15, Lo/nw;->b:D

    double-to-float v2, v2

    iget-wide v3, v15, Lo/nw;->c:D

    double-to-float v3, v3

    move-object/from16 v4, v17

    move v7, v14

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/evu;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    goto :goto_4

    .line 548
    :cond_d
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v15, Lo/nw;->b:D

    double-to-float v2, v2

    iget-wide v3, v15, Lo/nw;->c:D

    double-to-float v3, v3

    move-object/from16 v4, v17

    move v7, v14

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/evu;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 550
    :goto_4
    goto/16 :goto_3

    .line 482
    :cond_e
    :goto_5
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 553
    :cond_f
    return-void
.end method

.method protected e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V
    .locals 8

    .line 427
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-interface {p4}, Lo/mw;->W()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 428
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-virtual {v0, p7}, Landroid/graphics/Paint;->setColor(I)V

    .line 431
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-interface {p4}, Lo/mw;->Z()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 432
    invoke-interface {p4}, Lo/mw;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p5, :cond_0

    .line 434
    iget-object v0, p0, Lo/evu;->s:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 435
    iget-object v0, p0, Lo/evu;->c:Lo/ejh;

    check-cast v0, Lo/ld;

    invoke-virtual {v0}, Lo/ld;->getMarker()Lo/lk;

    move-result-object v0

    check-cast v0, Lo/lr;

    invoke-virtual {v0}, Lo/lr;->getHeight()I

    move-result v0

    int-to-float v6, v0

    .line 436
    iget-object v0, p0, Lo/evu;->s:Landroid/graphics/Path;

    invoke-virtual {v0, p2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 437
    iget-object v0, p0, Lo/evu;->s:Landroid/graphics/Path;

    iget-object v1, p0, Lo/evu;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    iget-object v2, p0, Lo/evu;->c:Lo/ejh;

    invoke-interface {v2}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 438
    iget-object v0, p0, Lo/evu;->s:Landroid/graphics/Path;

    iget-object v1, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 441
    :cond_0
    if-eqz p6, :cond_1

    .line 442
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v6

    .line 443
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v7

    .line 445
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 446
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 448
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 449
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 451
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v7, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 454
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 455
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 458
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    iget v1, p0, Lo/evu;->G:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 459
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v6, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 462
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 463
    goto :goto_0

    .line 464
    :cond_1
    const/high16 v0, 0x3f400000    # 0.75f

    invoke-static {v0}, Lo/evw;->c(F)I

    move-result v6

    .line 465
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 466
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 467
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 468
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    iget v1, p0, Lo/evu;->M:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 469
    int-to-float v0, v6

    iget-object v1, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 470
    move-object v0, p1

    int-to-float v1, v6

    sub-float v1, p2, v1

    move v2, p3

    int-to-float v3, v6

    add-float/2addr v3, p2

    iget-object v4, p0, Lo/evu;->l:Lo/oa;

    invoke-virtual {v4}, Lo/oa;->i()F

    move-result v4

    iget-object v5, p0, Lo/evu;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 472
    iget-object v0, p0, Lo/evu;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 474
    :goto_0
    return-void
.end method
