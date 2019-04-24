.class public Lo/fdp;
.super Lo/eky;
.source "SourceFile"


# instance fields
.field private A:Landroid/graphics/Path;

.field private r:I

.field private s:Landroid/graphics/Paint;

.field private u:Z

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V
    .locals 4

    .line 49
    invoke-direct {p0, p1, p2, p3, p4}, Lo/eky;-><init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V

    .line 36
    const/4 v0, 0x1

    iput v0, p0, Lo/fdp;->r:I

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fdp;->s:Landroid/graphics/Paint;

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fdp;->u:Z

    .line 41
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fdp;->z:I

    .line 42
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fdp;->x:I

    .line 43
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fdp;->w:I

    .line 44
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fdp;->v:I

    .line 45
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fdp;->y:I

    .line 46
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/fdp;->A:Landroid/graphics/Path;

    .line 50
    invoke-direct {p0}, Lo/fdp;->a()V

    .line 51
    return-void
.end method

.method private a()V
    .locals 2

    .line 54
    iget-object v0, p0, Lo/fdp;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/fdp;->y:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    iget-object v0, p0, Lo/fdp;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 56
    iget-object v0, p0, Lo/fdp;->s:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 57
    iget-object v0, p0, Lo/fdp;->s:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 58
    return-void
.end method

.method private a(Landroid/graphics/Canvas;ILjava/util/List;Lo/ekz;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;ILjava/util/List<Landroid/graphics/PointF;>;Lo/ekz;)V"
        }
    .end annotation

    .line 287
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 288
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 290
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v3

    .line 293
    iget v0, p0, Lo/fdp;->r:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 295
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 296
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v4, v0, [F

    .line 299
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [F

    .line 301
    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 302
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

    .line 303
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    iget v1, v9, Landroid/graphics/PointF;->x:F

    aput v1, v4, v0

    .line 304
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    iget v1, v9, Landroid/graphics/PointF;->y:F

    aput v1, v4, v0

    .line 306
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    iget v1, v9, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v1}, Lo/fdp;->b(F)I

    move-result v1

    int-to-float v1, v1

    aput v1, v5, v0

    .line 307
    goto :goto_0

    .line 309
    :cond_0
    iget-object v0, p0, Lo/fdp;->c:Lo/ejh;

    invoke-interface {p4}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v8

    .line 310
    invoke-virtual {v8, v4}, Lo/nv;->e([F)V

    .line 312
    const/4 v7, 0x0

    const/4 v6, 0x0

    :goto_1
    array-length v0, v4

    if-ge v7, v0, :cond_5

    .line 313
    aget v9, v4, v7

    .line 314
    add-int/lit8 v0, v7, 0x1

    aget v10, v4, v0

    .line 317
    aget v0, v5, v6

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 318
    iget v0, p0, Lo/fdp;->v:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 319
    :cond_1
    aget v0, v5, v6

    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 320
    iget v0, p0, Lo/fdp;->w:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 321
    :cond_2
    aget v0, v5, v6

    const/high16 v1, 0x40400000    # 3.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 322
    iget v0, p0, Lo/fdp;->x:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 323
    :cond_3
    aget v0, v5, v6

    const/high16 v1, 0x40800000    # 4.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    .line 324
    iget v0, p0, Lo/fdp;->z:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 327
    :cond_4
    :goto_2
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 328
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 331
    invoke-virtual {p1, v9, v10, v3, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 334
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 335
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v3, v0

    invoke-virtual {p1, v9, v10, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 337
    add-int/lit8 v7, v7, 0x2

    .line 338
    add-int/lit8 v6, v6, 0x1

    .line 339
    goto/16 :goto_1

    .line 341
    :cond_5
    return-void
.end method

.method private b(F)I
    .locals 2

    .line 349
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x41e80000    # 29.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 350
    const/4 v1, 0x1

    goto :goto_0

    .line 351
    :cond_0
    const/high16 v0, 0x41e80000    # 29.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 352
    const/4 v1, 0x2

    goto :goto_0

    .line 353
    :cond_1
    const/high16 v0, 0x42700000    # 60.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_2

    const/high16 v0, 0x42a00000    # 80.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    .line 354
    const/4 v1, 0x3

    goto :goto_0

    .line 356
    :cond_2
    const/4 v1, 0x4

    .line 358
    :goto_0
    return v1
.end method

.method private c(Lo/ekz;)I
    .locals 1

    .line 344
    invoke-interface {p1}, Lo/ekz;->m()I

    move-result v0

    return v0
.end method

.method private c(FF)Z
    .locals 2

    .line 265
    sub-float v0, p1, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 266
    const/4 v0, 0x1

    return v0

    .line 268
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 277
    iget-boolean v0, p0, Lo/fdp;->u:Z

    return v0
.end method

.method protected c(Landroid/graphics/Canvas;Lo/ekz;)V
    .locals 29

    .line 64
    invoke-interface/range {p2 .. p2}, Lo/ekz;->aa()Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    return-void

    .line 68
    :cond_0
    invoke-interface/range {p2 .. p2}, Lo/ekz;->C()I

    move-result v5

    .line 70
    invoke-interface/range {p2 .. p2}, Lo/ekz;->Y()Z

    move-result v6

    .line 71
    if-eqz v6, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    .line 73
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->c:Lo/ejh;

    invoke-interface/range {p2 .. p2}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v8

    .line 75
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v9

    .line 77
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 79
    move-object/from16 v0, p0

    iget-object v10, v0, Lo/fdp;->a:Landroid/graphics/Canvas;

    .line 82
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->c:Lo/ejh;

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 85
    invoke-interface/range {p2 .. p2}, Lo/ekz;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_b

    .line 87
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    array-length v0, v0

    mul-int/lit8 v1, v7, 0x2

    if-gt v0, v1, :cond_2

    .line 88
    mul-int/lit8 v0, v7, 0x4

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fdp;->q:[F

    .line 90
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->f:Lo/nk$d;

    iget v11, v0, Lo/nk$d;->c:I

    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    if-gt v11, v0, :cond_a

    .line 92
    move-object/from16 v0, p2

    invoke-interface {v0, v11}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    .line 93
    if-nez v12, :cond_3

    goto/16 :goto_3

    .line 95
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 96
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v9

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->d:I

    if-ge v11, v0, :cond_6

    .line 100
    add-int/lit8 v0, v11, 0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    .line 102
    if-nez v12, :cond_4

    goto/16 :goto_4

    .line 104
    :cond_4
    if-eqz v6, :cond_5

    .line 105
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 106
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 107
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x3

    aget v1, v1, v2

    const/4 v2, 0x5

    aput v1, v0, v2

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    const/4 v2, 0x6

    aput v1, v0, v2

    .line 110
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v9

    const/4 v2, 0x7

    aput v1, v0, v2

    goto :goto_2

    .line 112
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 113
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v9

    const/4 v2, 0x3

    aput v1, v0, v2

    goto :goto_2

    .line 117
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 121
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v8, v0}, Lo/nv;->e([F)V

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_7

    .line 124
    goto :goto_4

    .line 125
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-eqz v0, :cond_9

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    .line 126
    invoke-virtual {v0, v1}, Lo/oa;->f(F)Z

    move-result v0

    if-nez v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x3

    aget v1, v1, v2

    .line 127
    invoke-virtual {v0, v1}, Lo/oa;->h(F)Z

    move-result v0

    if-nez v0, :cond_8

    .line 128
    goto :goto_3

    .line 131
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p2

    invoke-interface {v1, v11}, Lo/ekz;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    mul-int/lit8 v1, v7, 0x2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fdp;->h:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v10, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 90
    :cond_9
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    :cond_a
    :goto_4
    goto/16 :goto_9

    .line 138
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    array-length v0, v0

    mul-int v1, v5, v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_c

    .line 139
    mul-int v0, v5, v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fdp;->q:[F

    .line 141
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->t:[F

    array-length v0, v0

    mul-int v1, v5, v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_d

    .line 142
    mul-int v0, v5, v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fdp;->t:[F

    .line 147
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v11

    .line 149
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 151
    if-eqz v11, :cond_16

    .line 153
    const/4 v15, 0x0

    .line 154
    const/16 v16, 0x0

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->f:Lo/nk$d;

    iget v1, v0, Lo/nk$d;->c:I

    move/from16 v17, v1

    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v17

    if-gt v1, v0, :cond_12

    .line 157
    const/4 v12, 0x0

    .line 158
    if-eqz v17, :cond_e

    .line 159
    add-int/lit8 v0, v17, -0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    .line 163
    :cond_e
    move-object/from16 v0, p2

    move/from16 v1, v17

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v13

    .line 165
    if-nez v13, :cond_f

    goto :goto_6

    .line 167
    :cond_f
    move-object/from16 v0, p0

    iget v0, v0, Lo/fdp;->r:I

    if-eqz v0, :cond_10

    .line 168
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v9

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    :cond_10
    if-nez v12, :cond_11

    .line 172
    goto :goto_6

    .line 175
    :cond_11
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move v1, v15

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move v1, v15

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v9

    aput v2, v0, v1

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move v1, v15

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    move v1, v15

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v9

    aput v2, v0, v1

    .line 181
    add-int/lit8 v16, v16, 0x1

    .line 155
    :goto_6
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_5

    .line 184
    :cond_12
    if-lez v15, :cond_15

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    invoke-virtual {v8, v0}, Lo/nv;->e([F)V

    .line 190
    mul-int v0, v16, v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v17

    .line 193
    new-instance v18, Landroid/graphics/Path;

    invoke-direct/range {v18 .. v18}, Landroid/graphics/Path;-><init>()V

    .line 196
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 197
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    const/4 v1, 0x0

    aget v19, v0, v1

    .line 198
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    const/4 v1, 0x0

    aget v20, v0, v1

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    const/4 v1, 0x0

    aget v21, v0, v1

    .line 200
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    const/4 v1, 0x1

    aget v22, v0, v1

    .line 201
    const/16 v23, 0x0

    :goto_7
    mul-int/lit8 v0, v23, 0x2

    add-int/lit8 v0, v0, 0x1

    move/from16 v1, v17

    if-ge v0, v1, :cond_14

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    mul-int/lit8 v1, v23, 0x2

    mul-int/lit8 v1, v1, 0x2

    aget v24, v0, v1

    .line 204
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    mul-int/lit8 v1, v23, 0x2

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v25, v0, v1

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    mul-int/lit8 v1, v23, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    aget v26, v0, v1

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->q:[F

    mul-int/lit8 v1, v23, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v27, v0, v1

    .line 209
    move-object/from16 v0, p0

    move/from16 v1, v21

    move/from16 v2, v24

    invoke-direct {v0, v1, v2}, Lo/fdp;->c(FF)Z

    move-result v0

    if-eqz v0, :cond_13

    move-object/from16 v0, p0

    move/from16 v1, v22

    move/from16 v2, v25

    invoke-direct {v0, v1, v2}, Lo/fdp;->c(FF)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 211
    move-object/from16 v0, v18

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 213
    move/from16 v20, v26

    .line 214
    move/from16 v21, v26

    .line 215
    move/from16 v22, v27

    .line 216
    goto :goto_8

    .line 219
    :cond_13
    invoke-virtual {v10}, Landroid/graphics/Canvas;->save()I

    move-result v28

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->l:Lo/oa;

    .line 221
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->l:Lo/oa;

    .line 223
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 220
    move/from16 v2, v19

    move/from16 v3, v20

    invoke-virtual {v10, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 224
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->s:Landroid/graphics/Paint;

    const-string v1, "#26000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->s:Landroid/graphics/Paint;

    move-object/from16 v1, v18

    invoke-virtual {v10, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 226
    move/from16 v0, v28

    invoke-virtual {v10, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 229
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->reset()V

    .line 231
    move/from16 v19, v24

    .line 233
    move-object/from16 v0, v18

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 234
    move-object/from16 v0, v18

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 236
    move/from16 v20, v26

    .line 237
    move/from16 v21, v26

    .line 238
    move/from16 v22, v27

    .line 201
    :goto_8
    add-int/lit8 v23, v23, 0x1

    goto/16 :goto_7

    .line 242
    :cond_14
    invoke-virtual {v10}, Landroid/graphics/Canvas;->save()I

    move-result v23

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->l:Lo/oa;

    .line 244
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fdp;->l:Lo/oa;

    .line 246
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 243
    move/from16 v2, v19

    move/from16 v3, v20

    invoke-virtual {v10, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 247
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->s:Landroid/graphics/Paint;

    const-string v1, "#26000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 248
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->s:Landroid/graphics/Paint;

    move-object/from16 v1, v18

    invoke-virtual {v10, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 249
    move/from16 v0, v23

    invoke-virtual {v10, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 252
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->reset()V

    .line 255
    :cond_15
    move-object/from16 v0, p0

    iget v0, v0, Lo/fdp;->r:I

    if-eqz v0, :cond_16

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_16

    .line 256
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/fdp;->c(Lo/ekz;)I

    move-result v0

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v10, v0, v14, v2}, Lo/fdp;->a(Landroid/graphics/Canvas;ILjava/util/List;Lo/ekz;)V

    .line 261
    :cond_16
    :goto_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 262
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 272
    iput-boolean p1, p0, Lo/fdp;->u:Z

    .line 273
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 22

    .line 364
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v8

    .line 365
    if-eqz p2, :cond_0

    move-object/from16 v0, p2

    array-length v0, v0

    if-gtz v0, :cond_1

    .line 366
    :cond_0
    return-void

    .line 368
    :cond_1
    move-object/from16 v9, p2

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_9

    aget-object v12, v9, v11

    .line 370
    invoke-virtual {v8}, Lo/ela;->h()Ljava/util/List;

    move-result-object v13

    .line 372
    if-eqz v13, :cond_8

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 373
    goto/16 :goto_2

    .line 375
    :cond_2
    const/4 v14, 0x0

    .line 377
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v15

    .line 380
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v16

    .line 382
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 383
    const/4 v0, 0x0

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ekz;

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    invoke-interface {v0, v1}, Lo/ekz;->e(F)Ljava/util/List;

    move-result-object v17

    .line 384
    if-eqz v17, :cond_8

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    .line 386
    :cond_3
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/github/mikephil/charting/data/Entry;

    .line 388
    const/16 v19, 0x1

    .line 389
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fdp;->u:Z

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->P()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 391
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fdp;->c:Lo/ejh;

    check-cast v2, Lo/eie;

    invoke-virtual {v2}, Lo/eie;->getManualReferenceLineValue()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    move-object/from16 v18, v0

    .line 392
    const/16 v19, 0x0

    .line 395
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->c:Lo/ejh;

    .line 396
    const/4 v1, 0x0

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ekz;

    invoke-interface {v1}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    .line 395
    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    .line 396
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    .line 397
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fdp;->i:Lo/la;

    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 396
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v20

    .line 398
    move-object/from16 v0, v20

    iget-wide v0, v0, Lo/nw;->b:D

    double-to-float v0, v0

    move-object/from16 v1, v20

    iget-wide v1, v1, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 400
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v20

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v20

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move/from16 v6, v19

    move/from16 v7, v16

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/fdp;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 401
    goto/16 :goto_2

    .line 402
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->c:Lo/ejh;

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

    move-result-object v17

    .line 404
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v17

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move/from16 v7, v16

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/fdp;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 406
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :cond_6
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/ekz;

    .line 407
    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Lo/ekz;->e(F)Ljava/util/List;

    move-result-object v20

    .line 408
    if-eqz v20, :cond_6

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    .line 409
    :cond_7
    move-object/from16 v0, v20

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/github/mikephil/charting/data/Entry;

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fdp;->c:Lo/ejh;

    invoke-interface/range {v19 .. v19}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fdp;->i:Lo/la;

    .line 411
    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 410
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v17

    .line 412
    move-object/from16 v0, v17

    iget-wide v0, v0, Lo/nw;->b:D

    double-to-float v0, v0

    move-object/from16 v1, v17

    iget-wide v1, v1, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 414
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v17

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    move-object/from16 v4, v19

    move/from16 v7, v16

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/fdp;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 415
    goto/16 :goto_1

    .line 368
    :cond_8
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 418
    :cond_9
    return-void
.end method

.method protected e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V
    .locals 12

    .line 423
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    invoke-interface/range {p4 .. p4}, Lo/mw;->W()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 424
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    move/from16 v1, p7

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 427
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    invoke-interface/range {p4 .. p4}, Lo/mw;->Z()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 428
    invoke-interface/range {p4 .. p4}, Lo/mw;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p5, :cond_0

    .line 430
    iget-object v0, p0, Lo/fdp;->A:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 431
    iget-object v0, p0, Lo/fdp;->c:Lo/ejh;

    check-cast v0, Lo/ld;

    invoke-virtual {v0}, Lo/ld;->getMarker()Lo/lk;

    move-result-object v0

    check-cast v0, Lo/lr;

    invoke-virtual {v0}, Lo/lr;->getHeight()I

    move-result v0

    int-to-float v5, v0

    .line 432
    iget-object v0, p0, Lo/fdp;->A:Landroid/graphics/Path;

    invoke-virtual {v0, p2, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 433
    iget-object v0, p0, Lo/fdp;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lo/fdp;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    iget-object v2, p0, Lo/fdp;->c:Lo/ejh;

    invoke-interface {v2}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 434
    iget-object v0, p0, Lo/fdp;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 437
    :cond_0
    if-eqz p6, :cond_3

    .line 438
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v5

    .line 439
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v6

    .line 442
    iget-object v0, p0, Lo/fdp;->c:Lo/ejh;

    instance-of v0, v0, Lo/ehv;

    if-eqz v0, :cond_2

    .line 443
    iget-object v0, p0, Lo/fdp;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getData()Lo/lt;

    move-result-object v0

    invoke-virtual {v0}, Lo/lt;->h()Ljava/util/List;

    move-result-object v7

    .line 444
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ehn;

    if-eqz v0, :cond_2

    .line 445
    const/4 v8, 0x0

    .line 446
    iget-object v0, p0, Lo/fdp;->c:Lo/ejh;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v9

    .line 447
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 448
    invoke-virtual {v9}, Lo/ehq;->a()F

    move-result v8

    .line 450
    :cond_1
    const/4 v0, 0x4

    new-array v10, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v10, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v10, v1

    const/4 v0, 0x2

    aput v8, v10, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v10, v1

    .line 451
    iget-object v0, p0, Lo/fdp;->c:Lo/ejh;

    iget-object v1, p0, Lo/fdp;->c:Lo/ejh;

    check-cast v1, Lo/ehv;

    invoke-virtual {v1}, Lo/ehv;->getAxisFirstParty()Lo/eit;

    move-result-object v1

    invoke-virtual {v1}, Lo/eit;->P()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v11

    .line 452
    invoke-virtual {v11, v10}, Lo/nv;->e([F)V

    .line 453
    const/4 v0, 0x2

    aget v0, v10, v0

    const/4 v1, 0x0

    aget v1, v10, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 454
    const/high16 v0, 0x3fc00000    # 1.5f

    mul-float v6, v5, v0

    .line 458
    :cond_2
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 459
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 461
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 462
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 464
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v6, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 467
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 468
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 471
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    move-object/from16 v1, p4

    invoke-virtual {p0, v1}, Lo/fdp;->a(Lo/mw;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 472
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v5, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 475
    iget-object v0, p0, Lo/fdp;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 477
    :cond_3
    return-void
.end method
