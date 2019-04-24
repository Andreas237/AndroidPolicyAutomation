.class public Lo/ehp;
.super Lo/nk;
.source "SourceFile"

# interfaces
.implements Lo/eiu;


# instance fields
.field protected a:Landroid/graphics/Paint;

.field protected b:Lo/ejj;

.field protected c:Landroid/graphics/RectF;

.field protected d:Landroid/graphics/RectF;

.field protected e:[Lo/ekn;

.field private m:Z

.field protected o:Landroid/graphics/Paint;

.field private p:Z

.field private t:Landroid/graphics/RectF;

.field private u:Z


# direct methods
.method public constructor <init>(Lo/ejj;Lo/la;Lo/oa;)V
    .locals 4

    .line 63
    invoke-direct {p0, p2, p3}, Lo/nk;-><init>(Lo/la;Lo/oa;)V

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehp;->m:Z

    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehp;->p:Z

    .line 50
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/ehp;->d:Landroid/graphics/RectF;

    .line 52
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/ehp;->c:Landroid/graphics/RectF;

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehp;->u:Z

    .line 133
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/ehp;->t:Landroid/graphics/RectF;

    .line 64
    iput-object p1, p0, Lo/ehp;->b:Lo/ejj;

    .line 66
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/ehp;->k:Landroid/graphics/Paint;

    .line 67
    iget-object v0, p0, Lo/ehp;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 68
    iget-object v0, p0, Lo/ehp;->k:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 70
    iget-object v0, p0, Lo/ehp;->k:Landroid/graphics/Paint;

    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 72
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/ehp;->a:Landroid/graphics/Paint;

    .line 73
    iget-object v0, p0, Lo/ehp;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 75
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/ehp;->o:Landroid/graphics/Paint;

    .line 76
    iget-object v0, p0, Lo/ehp;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 77
    return-void
.end method

.method private a(Lo/ejm;)I
    .locals 4

    .line 681
    iget-boolean v0, p0, Lo/ehp;->u:Z

    if-eqz v0, :cond_0

    .line 682
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 684
    :cond_0
    invoke-interface {p1}, Lo/ejm;->h()I

    move-result v0

    return v0
.end method

.method private b(Lo/ejm;)I
    .locals 4

    .line 674
    iget-boolean v0, p0, Lo/ehp;->u:Z

    if-eqz v0, :cond_0

    .line 675
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 677
    :cond_0
    invoke-interface {p1}, Lo/ejm;->m()I

    move-result v0

    return v0
.end method

.method private d(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;Lo/nv;)V
    .locals 14

    .line 233
    const/4 v6, 0x2

    new-array v6, v6, [F

    fill-array-data v6, :array_0

    .line 234
    move-object/from16 v0, p4

    invoke-virtual {v0, v6}, Lo/nv;->e([F)V

    .line 236
    const/4 v0, 0x1

    aget v7, v6, v0

    .line 238
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v8

    .line 240
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 241
    const v0, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_0

    .line 242
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v7

    if-nez v0, :cond_0

    .line 244
    return-void

    .line 248
    :cond_0
    const/4 v10, 0x0

    .line 249
    iget-boolean v0, p0, Lo/ehp;->m:Z

    if-eqz v0, :cond_1

    .line 250
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v10, v0

    .line 252
    :cond_1
    iget-boolean v0, p0, Lo/ehp;->p:Z

    if-eqz v0, :cond_2

    .line 253
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v10, v0

    .line 257
    :cond_2
    cmpg-float v0, v8, v10

    if-gez v0, :cond_3

    .line 258
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 260
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v10, v0

    sub-float v0, v11, v0

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->top:F

    .line 261
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v10, v0

    add-float/2addr v0, v11

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->bottom:F

    .line 263
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v7

    if-lez v0, :cond_3

    .line 267
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float v12, v0, v7

    .line 268
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v12

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->bottom:F

    .line 269
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v12

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->top:F

    .line 273
    :cond_3
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->top:F

    sub-float v11, v0, v1

    .line 275
    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 277
    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_4

    iget-boolean v0, p0, Lo/ehp;->m:Z

    if-eqz v0, :cond_4

    .line 278
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 280
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->top:F

    move-object/from16 v2, p2

    iget v2, v2, Landroid/graphics/RectF;->right:F

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->top:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v9, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    add-float/2addr v3, v4

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 281
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move-object/from16 v2, p2

    iget v2, v2, Landroid/graphics/RectF;->top:F

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move-object/from16 v4, p2

    iget v4, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v4, v9

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v9, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    move-object/from16 v3, p3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 284
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    sub-float/2addr v11, v0

    .line 285
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v12, v0

    .line 286
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 289
    :cond_4
    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_5

    iget-boolean v0, p0, Lo/ehp;->p:Z

    if-eqz v0, :cond_5

    .line 290
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 291
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    move-object/from16 v2, p2

    iget v2, v2, Landroid/graphics/RectF;->right:F

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 293
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move-object/from16 v2, p2

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v2, v9

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move-object/from16 v4, p2

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v9, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    move-object/from16 v3, p3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 296
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    sub-float/2addr v11, v0

    .line 297
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v13, v0

    .line 298
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 301
    :cond_5
    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_6

    .line 303
    move-object v0, p1

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move-object/from16 v2, p2

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v12

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move-object/from16 v4, p2

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v4, v13

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 307
    :cond_6
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method


# virtual methods
.method public a()Lo/ejj;
    .locals 1

    .line 660
    iget-object v0, p0, Lo/ehp;->b:Lo/ejj;

    return-object v0
.end method

.method protected a(FFFFLo/nv;)V
    .locals 6

    .line 311
    sub-float v2, p1, p4

    .line 312
    add-float v3, p1, p4

    .line 313
    move v4, p2

    .line 314
    move v5, p3

    .line 316
    iget-object v0, p0, Lo/ehp;->d:Landroid/graphics/RectF;

    invoke-virtual {v0, v2, v4, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 318
    iget-object v0, p0, Lo/ehp;->d:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/ehp;->i:Lo/la;

    invoke-virtual {v1}, Lo/la;->d()F

    move-result v1

    invoke-virtual {p5, v0, v1}, Lo/nv;->d(Landroid/graphics/RectF;F)V

    .line 319
    return-void
.end method

.method public a(Landroid/graphics/Canvas;)V
    .locals 8

    .line 99
    iget-object v0, p0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v4

    .line 100
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 101
    const-string v0, "HwHealthBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawData() barData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    return-void

    .line 105
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 107
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lo/ehq;->e()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 109
    invoke-virtual {v4, v6}, Lo/ehq;->a(I)Lo/mz;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ejm;

    .line 111
    invoke-interface {v7}, Lo/ejm;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 116
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 117
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ejm;

    .line 118
    invoke-virtual {v4}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, p1, v7, v0}, Lo/ehp;->a(Landroid/graphics/Canvas;Lo/ejm;I)V

    .line 119
    goto :goto_1

    .line 120
    :cond_3
    return-void

    .line 123
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ehp;->c(Z)V

    .line 124
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ejm;

    invoke-virtual {v4}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lo/ehp;->a(Landroid/graphics/Canvas;Lo/ejm;I)V

    .line 125
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ehp;->c(Z)V

    .line 127
    const/4 v6, 0x1

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 128
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ejm;

    .line 129
    invoke-virtual {p0, p1, v7, v6}, Lo/ehp;->a(Landroid/graphics/Canvas;Lo/ejm;I)V

    .line 127
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 131
    :cond_5
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;Lo/ejm;I)V
    .locals 17

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface/range {p2 .. p2}, Lo/ejm;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/eit$b;)Lo/eim;

    move-result-object v6

    .line 139
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->o:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/ejm;->Q()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 140
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->o:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/ejm;->S()F

    move-result v1

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 142
    invoke-interface/range {p2 .. p2}, Lo/ejm;->S()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 144
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->b()F

    move-result v8

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v9

    .line 148
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->a:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/ejm;->R()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 151
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v10

    .line 153
    invoke-virtual {v10}, Lo/ehq;->a()F

    move-result v11

    .line 154
    const/high16 v0, 0x40000000    # 2.0f

    div-float v12, v11, v0

    .line 157
    const/4 v14, 0x0

    invoke-interface/range {p2 .. p2}, Lo/ejm;->C()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v8

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface/range {p2 .. p2}, Lo/ejm;->C()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v15

    .line 158
    :goto_1
    if-ge v14, v15, :cond_3

    .line 161
    move-object/from16 v0, p2

    invoke-interface {v0, v14}, Lo/ejm;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 163
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v13

    .line 165
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->t:Landroid/graphics/RectF;

    sub-float v1, v13, v12

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->t:Landroid/graphics/RectF;

    add-float v1, v13, v12

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->t:Landroid/graphics/RectF;

    invoke-virtual {v6, v0}, Lo/nv;->b(Landroid/graphics/RectF;)V

    .line 170
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ehp;->t:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_1

    .line 171
    goto :goto_2

    .line 173
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ehp;->t:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_2

    .line 174
    goto :goto_3

    .line 176
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->t:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ehp;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->t:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ehp;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->t:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ehp;->a:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 159
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_1

    .line 184
    :cond_3
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->e:[Lo/ekn;

    aget-object v10, v0, p3

    .line 192
    invoke-virtual {v10, v8, v9}, Lo/ekn;->b(FF)V

    .line 193
    move/from16 v0, p3

    invoke-virtual {v10, v0}, Lo/ekn;->e(I)V

    .line 196
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lo/ekn;->b(Z)V

    .line 197
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->a()F

    move-result v0

    invoke-virtual {v10, v0}, Lo/ekn;->d(F)V

    .line 199
    move-object/from16 v0, p2

    invoke-virtual {v10, v0}, Lo/ekn;->a(Lo/ejm;)V

    .line 201
    iget-object v0, v10, Lo/ekn;->e:[F

    invoke-virtual {v6, v0}, Lo/nv;->e([F)V

    .line 203
    invoke-interface/range {p2 .. p2}, Lo/ejm;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v11, 0x1

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    .line 205
    :goto_4
    if-eqz v11, :cond_5

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lo/ehp;->b(Lo/ejm;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 209
    :cond_5
    const/4 v12, 0x0

    :goto_5
    invoke-virtual {v10}, Lo/ekn;->a()I

    move-result v0

    if-ge v12, v0, :cond_9

    .line 211
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    iget-object v1, v10, Lo/ekn;->e:[F

    aget v1, v1, v12

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_6

    .line 212
    goto :goto_6

    .line 214
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    iget-object v1, v10, Lo/ekn;->e:[F

    add-int/lit8 v2, v12, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_7

    .line 215
    goto :goto_6

    .line 217
    :cond_7
    if-nez v11, :cond_8

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->h:Landroid/graphics/Paint;

    div-int/lit8 v1, v12, 0x4

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Lo/ejm;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 223
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->c:Landroid/graphics/RectF;

    iget-object v1, v10, Lo/ekn;->e:[F

    aget v1, v1, v12

    iget-object v2, v10, Lo/ekn;->e:[F

    add-int/lit8 v3, v12, 0x1

    aget v2, v2, v3

    iget-object v3, v10, Lo/ekn;->e:[F

    add-int/lit8 v4, v12, 0x2

    aget v3, v3, v4

    iget-object v4, v10, Lo/ekn;->e:[F

    add-int/lit8 v5, v12, 0x3

    aget v4, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->c:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ehp;->h:Landroid/graphics/Paint;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0, v1, v6}, Lo/ehp;->d(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;Lo/nv;)V

    .line 209
    :goto_6
    add-int/lit8 v12, v12, 0x4

    goto/16 :goto_5

    .line 230
    :cond_9
    return-void
.end method

.method public b()Z
    .locals 1

    .line 670
    iget-boolean v0, p0, Lo/ehp;->u:Z

    return v0
.end method

.method public c()V
    .locals 2

    .line 705
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "pls not call bar\'s disableFocusArea,no impl"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Z)V
    .locals 0

    .line 665
    iput-boolean p1, p0, Lo/ehp;->u:Z

    .line 666
    return-void
.end method

.method public c(ZZ)V
    .locals 0

    .line 694
    iput-boolean p1, p0, Lo/ehp;->m:Z

    .line 695
    iput-boolean p2, p0, Lo/ehp;->p:Z

    .line 696
    return-void
.end method

.method protected c(Lo/mr;)Z
    .locals 1

    .line 484
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 0

    .line 556
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 18

    .line 491
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ehp;->u:Z

    if-eqz v0, :cond_0

    .line 493
    return-void

    .line 496
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v6

    .line 498
    move-object/from16 v7, p2

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_8

    aget-object v10, v7, v9

    .line 503
    invoke-virtual {v6}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    .line 504
    goto/16 :goto_2

    .line 508
    :cond_1
    invoke-virtual {v6}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/ejm;

    .line 510
    if-eqz v11, :cond_7

    invoke-interface {v11}, Lo/ejm;->n()Z

    move-result v0

    if-nez v0, :cond_2

    .line 511
    goto/16 :goto_2

    .line 513
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->k:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    invoke-direct {v1, v11}, Lo/ehp;->a(Lo/ejm;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 515
    invoke-virtual {v10}, Lo/mh;->b()F

    move-result v0

    invoke-interface {v11, v0}, Lo/ejm;->e(F)Ljava/util/List;

    move-result-object v12

    .line 516
    if-eqz v12, :cond_3

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 517
    :cond_3
    return-void

    .line 519
    :cond_4
    const/4 v0, 0x0

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 521
    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v11}, Lo/ehp;->d(Lcom/github/mikephil/charting/data/Entry;Lo/mv;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 522
    goto :goto_2

    .line 524
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v11}, Lo/ejm;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/eit$b;)Lo/eim;

    move-result-object v14

    .line 529
    invoke-virtual {v10}, Lo/mh;->i()I

    move-result v0

    if-ltz v0, :cond_6

    const/4 v15, 0x1

    goto :goto_1

    :cond_6
    const/4 v15, 0x0

    .line 534
    :goto_1
    invoke-virtual {v13}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    invoke-static {v0}, Lo/eko;->d(Lo/ejp;)F

    move-result v16

    .line 535
    invoke-virtual {v13}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    invoke-static {v0}, Lo/eko;->c(Lo/ejp;)F

    move-result v17

    .line 538
    move-object/from16 v0, p0

    invoke-virtual {v13}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v1

    move/from16 v2, v16

    move/from16 v3, v17

    invoke-virtual {v6}, Lo/ehq;->a()F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    move-object v5, v14

    invoke-virtual/range {v0 .. v5}, Lo/ehp;->a(FFFFLo/nv;)V

    .line 540
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->d:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    invoke-virtual {v1, v10, v0}, Lo/ehp;->d(Lo/mh;Landroid/graphics/RectF;)V

    .line 542
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->d:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ehp;->k:Landroid/graphics/Paint;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0, v1, v14}, Lo/ehp;->d(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;Lo/nv;)V

    .line 498
    :cond_7
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 544
    :cond_8
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 700
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "pls not call bar\'s focusArea,no impl"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected d(Lo/mh;Landroid/graphics/RectF;)V
    .locals 2

    .line 551
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget v1, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0, v1}, Lo/mh;->e(FF)V

    .line 552
    return-void
.end method

.method public d()Z
    .locals 2

    .line 689
    iget-object v0, p0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v1

    .line 690
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 8

    .line 82
    iget-object v0, p0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v5

    .line 83
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 84
    const-string v0, "HwHealthBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBuffers() barData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void

    .line 87
    :cond_0
    invoke-virtual {v5}, Lo/ehq;->e()I

    move-result v0

    new-array v0, v0, [Lo/ekn;

    iput-object v0, p0, Lo/ehp;->e:[Lo/ekn;

    .line 89
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/ehp;->e:[Lo/ekn;

    array-length v0, v0

    if-ge v6, v0, :cond_2

    .line 90
    invoke-virtual {v5, v6}, Lo/ehq;->a(I)Lo/mz;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ejm;

    .line 91
    iget-object v0, p0, Lo/ehp;->e:[Lo/ekn;

    new-instance v1, Lo/ekn;

    invoke-interface {v7}, Lo/ejm;->C()I

    move-result v2

    mul-int/lit8 v2, v2, 0x4

    invoke-interface {v7}, Lo/ejm;->L()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v7}, Lo/ejm;->K()I

    move-result v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x1

    :goto_1
    mul-int/2addr v2, v3

    .line 92
    invoke-virtual {v5}, Lo/ehq;->e()I

    move-result v3

    invoke-interface {v7}, Lo/ejm;->L()Z

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/ekn;-><init>(IIZ)V

    aput-object v1, v0, v6

    .line 89
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 94
    :cond_2
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 30

    .line 325
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/ehp;->c(Lo/mr;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 327
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v10

    .line 329
    const/high16 v0, 0x40900000    # 4.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v11

    .line 332
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->e()Z

    move-result v14

    .line 334
    const/4 v15, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->e()I

    move-result v0

    if-ge v15, v0, :cond_13

    .line 336
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/ejm;

    .line 338
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/ehp;->c(Lo/mz;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 339
    goto/16 :goto_c

    .line 342
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/ehp;->e(Lo/mz;)V

    .line 350
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->n:Landroid/graphics/Paint;

    const-string v1, "8"

    invoke-static {v0, v1}, Lo/oc;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v1, v0

    move/from16 v17, v1

    .line 351
    if-eqz v14, :cond_1

    neg-float v12, v11

    goto :goto_1

    :cond_1
    add-float v12, v17, v11

    .line 352
    :goto_1
    if-eqz v14, :cond_2

    add-float v13, v17, v11

    goto :goto_2

    :cond_2
    neg-float v13, v11

    .line 360
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->e:[Lo/ekn;

    aget-object v18, v0, v15

    .line 362
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v19

    .line 364
    invoke-interface/range {v16 .. v16}, Lo/ejm;->z()Lo/nz;

    move-result-object v0

    invoke-static {v0}, Lo/nz;->b(Lo/nz;)Lo/nz;

    move-result-object v20

    .line 365
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->e:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v20

    iput v0, v1, Lo/nz;->e:F

    .line 366
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->c:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v20

    iput v0, v1, Lo/nz;->c:F

    .line 369
    invoke-interface/range {v16 .. v16}, Lo/ejm;->L()Z

    move-result v0

    if-nez v0, :cond_a

    .line 371
    const/16 v21, 0x0

    :goto_3
    move/from16 v0, v21

    int-to-float v0, v0

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    array-length v1, v1

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/ehp;->i:Lo/la;

    invoke-virtual {v2}, Lo/la;->b()F

    move-result v2

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 373
    move-object/from16 v0, v18

    iget-object v0, v0, Lo/lb;->e:[F

    aget v0, v0, v21

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    add-int/lit8 v2, v21, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v22, v0, v1

    .line 375
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 376
    goto/16 :goto_7

    .line 378
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    add-int/lit8 v2, v21, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    .line 379
    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_4

    .line 380
    goto/16 :goto_6

    .line 382
    :cond_4
    div-int/lit8 v0, v21, 0x4

    move-object/from16 v1, v16

    invoke-interface {v1, v0}, Lo/ejm;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 383
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v24

    .line 385
    invoke-interface/range {v16 .. v16}, Lo/ejm;->v()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 386
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface/range {v16 .. v16}, Lo/ejm;->l()Lo/ml;

    move-result-object v2

    move/from16 v3, v24

    move-object/from16 v4, v23

    move v5, v15

    move/from16 v6, v22

    const/4 v7, 0x0

    cmpl-float v7, v24, v7

    if-ltz v7, :cond_5

    move-object/from16 v7, v18

    iget-object v7, v7, Lo/lb;->e:[F

    add-int/lit8 v8, v21, 0x1

    aget v7, v7, v8

    add-float/2addr v7, v12

    goto :goto_4

    :cond_5
    move-object/from16 v7, v18

    iget-object v7, v7, Lo/lb;->e:[F

    add-int/lit8 v8, v21, 0x3

    aget v7, v7, v8

    add-float/2addr v7, v13

    :goto_4
    div-int/lit8 v8, v21, 0x4

    .line 390
    move-object/from16 v9, v16

    invoke-interface {v9, v8}, Lo/ejm;->b(I)I

    move-result v8

    .line 386
    invoke-virtual/range {v0 .. v8}, Lo/ehp;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    .line 393
    :cond_6
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface/range {v16 .. v16}, Lo/ejm;->x()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 395
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v25

    .line 397
    move/from16 v26, v22

    .line 398
    const/4 v0, 0x0

    cmpl-float v0, v24, v0

    if-ltz v0, :cond_7

    move-object/from16 v0, v18

    iget-object v0, v0, Lo/lb;->e:[F

    add-int/lit8 v1, v21, 0x1

    aget v0, v0, v1

    add-float v27, v0, v12

    goto :goto_5

    :cond_7
    move-object/from16 v0, v18

    iget-object v0, v0, Lo/lb;->e:[F

    add-int/lit8 v1, v21, 0x3

    aget v0, v0, v1

    add-float v27, v0, v13

    .line 402
    :goto_5
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->e:F

    add-float v26, v26, v0

    .line 403
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->c:F

    add-float v27, v27, v0

    .line 405
    move-object/from16 v0, p1

    move-object/from16 v1, v25

    move/from16 v2, v26

    float-to-int v2, v2

    move/from16 v3, v27

    float-to-int v3, v3

    .line 410
    invoke-virtual/range {v25 .. v25}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 411
    invoke-virtual/range {v25 .. v25}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    .line 405
    invoke-static/range {v0 .. v5}, Lo/oc;->d(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    .line 371
    :cond_8
    :goto_6
    add-int/lit8 v21, v21, 0x4

    goto/16 :goto_3

    :cond_9
    :goto_7
    goto/16 :goto_b

    .line 418
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->b:Lo/ejj;

    invoke-interface/range {v16 .. v16}, Lo/ejm;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/lp$b;)Lo/nv;

    move-result-object v21

    .line 420
    const/16 v22, 0x0

    .line 421
    const/16 v23, 0x0

    .line 423
    :cond_b
    :goto_8
    move/from16 v0, v23

    int-to-float v0, v0

    invoke-interface/range {v16 .. v16}, Lo/ejm;->C()I

    move-result v1

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/ehp;->i:Lo/la;

    invoke-virtual {v2}, Lo/la;->b()F

    move-result v2

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_12

    .line 425
    move-object/from16 v0, v16

    move/from16 v1, v23

    invoke-interface {v0, v1}, Lo/ejm;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 429
    move-object/from16 v0, v18

    iget-object v0, v0, Lo/lb;->e:[F

    aget v0, v0, v22

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    add-int/lit8 v2, v22, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v25, v0, v1

    .line 431
    move-object/from16 v0, v16

    move/from16 v1, v23

    invoke-interface {v0, v1}, Lo/ejm;->b(I)I

    move-result v26

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_c

    .line 438
    goto/16 :goto_b

    .line 440
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    add-int/lit8 v2, v22, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_b

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ehp;->l:Lo/oa;

    .line 441
    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_d

    .line 442
    goto :goto_8

    .line 444
    :cond_d
    invoke-interface/range {v16 .. v16}, Lo/ejm;->v()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 445
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface/range {v16 .. v16}, Lo/ejm;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v24 .. v24}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v3

    move-object/from16 v4, v24

    move v5, v15

    move/from16 v6, v25

    move-object/from16 v7, v18

    iget-object v7, v7, Lo/lb;->e:[F

    add-int/lit8 v8, v22, 0x1

    aget v7, v7, v8

    .line 447
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v8

    const/4 v9, 0x0

    cmpl-float v8, v8, v9

    if-ltz v8, :cond_e

    move v8, v12

    goto :goto_9

    :cond_e
    move v8, v13

    :goto_9
    add-float/2addr v7, v8

    move/from16 v8, v26

    .line 445
    invoke-virtual/range {v0 .. v8}, Lo/ehp;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    .line 451
    :cond_f
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-interface/range {v16 .. v16}, Lo/ejm;->x()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 453
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v27

    .line 455
    move/from16 v28, v25

    .line 456
    move-object/from16 v0, v18

    iget-object v0, v0, Lo/lb;->e:[F

    add-int/lit8 v1, v22, 0x1

    aget v0, v0, v1

    .line 457
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_10

    move v1, v12

    goto :goto_a

    :cond_10
    move v1, v13

    :goto_a
    add-float v29, v0, v1

    .line 459
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->e:F

    add-float v28, v28, v0

    .line 460
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->c:F

    add-float v29, v29, v0

    .line 462
    move-object/from16 v0, p1

    move-object/from16 v1, v27

    move/from16 v2, v28

    float-to-int v2, v2

    move/from16 v3, v29

    float-to-int v3, v3

    .line 467
    invoke-virtual/range {v27 .. v27}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 468
    invoke-virtual/range {v27 .. v27}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    .line 462
    invoke-static/range {v0 .. v5}, Lo/oc;->d(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    .line 472
    :cond_11
    add-int/lit8 v22, v22, 0x4

    .line 473
    add-int/lit8 v23, v23, 0x1

    .line 474
    goto/16 :goto_8

    .line 477
    :cond_12
    :goto_b
    invoke-static/range {v20 .. v20}, Lo/nz;->c(Lo/nz;)V

    .line 334
    :goto_c
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 480
    :cond_13
    return-void
.end method
