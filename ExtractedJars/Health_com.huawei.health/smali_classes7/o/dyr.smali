.class public Lo/dyr;
.super Lo/nm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dyr$d;
    }
.end annotation


# instance fields
.field private q:F

.field private r:F

.field private s:[F

.field private t:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Lo/mz;Lo/dyr$d;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/mu;Lo/la;Lo/oa;)V
    .locals 1

    .line 42
    invoke-direct {p0, p1, p2, p3}, Lo/nm;-><init>(Lo/mu;Lo/la;Lo/oa;)V

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/dyr;->q:F

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/dyr;->r:F

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dyr;->s:[F

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dyr;->t:Ljava/util/HashMap;

    .line 43
    return-void
.end method

.method static synthetic a(Lo/dyr;)Landroid/graphics/Paint;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/dyr;->h:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic b(Lo/dyr;)Landroid/graphics/Paint;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/dyr;->b:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic c(Lo/dyr;)Landroid/graphics/Paint;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/dyr;->h:Landroid/graphics/Paint;

    return-object v0
.end method

.method private c(Lo/na;IILandroid/graphics/Path;Lo/nv;)V
    .locals 12

    .line 303
    iget-object v0, p0, Lo/dyr;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v3

    .line 304
    iget-object v0, p0, Lo/dyr;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v4

    .line 305
    invoke-interface {p1}, Lo/na;->a()Lo/ly$c;

    move-result-object v0

    sget-object v1, Lo/ly$c;->c:Lo/ly$c;

    if-ne v0, v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 306
    :goto_0
    move-object/from16 v6, p4

    .line 307
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Path;->reset()V

    .line 308
    invoke-interface {p1, p2}, Lo/na;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v7

    .line 309
    const/4 v0, 0x2

    new-array v8, v0, [F

    .line 310
    invoke-virtual {v7}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 311
    invoke-virtual {v7}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 312
    move-object/from16 v0, p5

    invoke-virtual {v0, v8}, Lo/nv;->e([F)V

    .line 313
    const/4 v0, 0x0

    aget v0, v8, v0

    move-object/from16 v1, p4

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 314
    const/4 v0, 0x0

    aget v0, v8, v0

    const/4 v1, 0x1

    aget v1, v8, v1

    mul-float/2addr v1, v4

    move-object/from16 v2, p4

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 316
    const/4 v9, 0x0

    .line 317
    const/4 v10, 0x0

    .line 319
    add-int/lit8 v11, p2, 0x1

    :goto_1
    if-gt v11, p3, :cond_2

    .line 320
    invoke-interface {p1, v11}, Lo/na;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 322
    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 323
    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 324
    move-object/from16 v0, p5

    invoke-virtual {v0, v8}, Lo/nv;->e([F)V

    .line 325
    if-eqz v5, :cond_1

    if-eqz v10, :cond_1

    .line 326
    const/4 v0, 0x0

    aget v0, v8, v0

    const/4 v1, 0x1

    aget v1, v8, v1

    mul-float/2addr v1, v4

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 329
    :cond_1
    const/4 v0, 0x0

    aget v0, v8, v0

    const/4 v1, 0x1

    aget v1, v8, v1

    mul-float/2addr v1, v4

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 331
    move-object v10, v9

    .line 319
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 334
    :cond_2
    if-eqz v9, :cond_3

    .line 335
    const/4 v0, 0x0

    aget v0, v8, v0

    invoke-virtual {v6, v0, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 338
    :cond_3
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 339
    return-void
.end method

.method static synthetic d(Lo/dyr;)Landroid/graphics/Paint;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/dyr;->h:Landroid/graphics/Paint;

    return-object v0
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 283
    iget v0, p0, Lo/dyr;->r:F

    return v0
.end method

.method protected a(Landroid/graphics/Canvas;Lo/na;Lo/nv;Lo/nk$d;)V
    .locals 13

    .line 343
    iget-object v6, p0, Lo/dyr;->m:Landroid/graphics/Path;

    .line 344
    move-object/from16 v0, p4

    iget v7, v0, Lo/nk$d;->c:I

    .line 345
    move-object/from16 v0, p4

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p4

    iget v1, v1, Lo/nk$d;->c:I

    add-int v8, v0, v1

    .line 346
    const/4 v9, 0x0

    .line 351
    :cond_0
    mul-int/lit16 v0, v9, 0x80

    add-int v11, v7, v0

    .line 352
    add-int/lit16 v10, v11, 0x80

    .line 353
    if-le v10, v8, :cond_1

    move v0, v8

    goto :goto_0

    :cond_1
    move v0, v10

    :goto_0
    move v10, v0

    .line 354
    if-gt v11, v10, :cond_3

    .line 355
    move-object v0, p0

    move-object v1, p2

    move v2, v11

    move v3, v10

    move-object v4, v6

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/dyr;->c(Lo/na;IILandroid/graphics/Path;Lo/nv;)V

    .line 356
    invoke-interface {p2}, Lo/na;->Q()Landroid/graphics/drawable/Drawable;

    move-result-object v12

    .line 357
    if-eqz v12, :cond_2

    .line 358
    invoke-virtual {p0, p1, v6, v12}, Lo/dyr;->d(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 360
    :cond_2
    invoke-interface {p2}, Lo/na;->O()I

    move-result v0

    invoke-interface {p2}, Lo/na;->S()I

    move-result v1

    invoke-virtual {p0, p1, v6, v0, v1}, Lo/dyr;->b(Landroid/graphics/Canvas;Landroid/graphics/Path;II)V

    .line 364
    :cond_3
    :goto_1
    add-int/lit8 v9, v9, 0x1

    .line 365
    if-le v11, v10, :cond_0

    .line 367
    return-void
.end method

.method public b()F
    .locals 1

    .line 277
    iget v0, p0, Lo/dyr;->q:F

    return v0
.end method

.method protected b(Landroid/graphics/Canvas;)V
    .locals 23

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 124
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v5

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->c:Lo/mu;

    invoke-interface {v0}, Lo/mu;->getLineData()Lo/lx;

    move-result-object v0

    invoke-virtual {v0}, Lo/lx;->h()Ljava/util/List;

    move-result-object v6

    .line 129
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_a

    .line 130
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/na;

    .line 131
    invoke-interface {v8}, Lo/na;->j()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Lo/na;->M()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Lo/na;->C()I

    move-result v0

    if-eqz v0, :cond_9

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->b:Landroid/graphics/Paint;

    invoke-interface {v8}, Lo/na;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->c:Lo/mu;

    invoke-interface {v8}, Lo/na;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mu;->b(Lo/lp$b;)Lo/nv;

    move-result-object v9

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->c:Lo/mu;

    invoke-virtual {v0, v1, v8}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 135
    invoke-interface {v8}, Lo/na;->e()F

    move-result v10

    .line 136
    invoke-interface {v8}, Lo/na;->b()F

    move-result v11

    .line 137
    invoke-interface {v8}, Lo/na;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    cmpg-float v0, v11, v10

    if-gez v0, :cond_0

    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_0

    const/4 v12, 0x1

    goto :goto_1

    :cond_0
    const/4 v12, 0x0

    .line 138
    :goto_1
    if-eqz v12, :cond_1

    invoke-interface {v8}, Lo/na;->K()I

    move-result v0

    const v1, 0x112233

    if-ne v0, v1, :cond_1

    const/4 v13, 0x1

    goto :goto_2

    :cond_1
    const/4 v13, 0x0

    .line 140
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->t:Ljava/util/HashMap;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 141
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->t:Ljava/util/HashMap;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/dyr$d;

    goto :goto_3

    .line 143
    :cond_2
    new-instance v14, Lo/dyr$d;

    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v14, v0, v1}, Lo/dyr$d;-><init>(Lo/dyr;Lo/dyr$4;)V

    .line 144
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->t:Ljava/util/HashMap;

    invoke-virtual {v0, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :goto_3
    invoke-virtual {v14, v8}, Lo/dyr$d;->a(Lo/na;)Z

    move-result v15

    .line 148
    if-eqz v15, :cond_3

    .line 149
    invoke-virtual {v14, v8, v12, v13}, Lo/dyr$d;->d(Lo/na;ZZ)V

    .line 152
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int v16, v0, v1

    .line 154
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->f:Lo/nk$d;

    iget v1, v0, Lo/nk$d;->c:I

    move/from16 v17, v1

    :goto_4
    move/from16 v0, v17

    move/from16 v1, v16

    if-gt v0, v1, :cond_9

    .line 155
    move/from16 v0, v17

    invoke-interface {v8, v0}, Lo/na;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v18

    .line 156
    if-nez v18, :cond_4

    .line 157
    goto/16 :goto_5

    .line 160
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 161
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v5

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    invoke-virtual {v9, v0}, Lo/nv;->e([F)V

    .line 164
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v19

    .line 165
    const-string v20, ""

    .line 166
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_5

    .line 167
    move-object/from16 v20, v19

    check-cast v20, Ljava/lang/String;

    .line 170
    :cond_5
    const-string v0, "LINE_PATH"

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 172
    new-instance v21, Landroid/graphics/Paint;

    invoke-direct/range {v21 .. v21}, Landroid/graphics/Paint;-><init>()V

    .line 173
    const-string v0, "#1A000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 174
    move-object/from16 v0, v21

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 175
    move-object/from16 v0, v21

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 176
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 177
    new-instance v22, Landroid/graphics/Path;

    invoke-direct/range {v22 .. v22}, Landroid/graphics/Path;-><init>()V

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->s:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 180
    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v21

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 181
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Path;->reset()V

    .line 184
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->s:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_7

    .line 185
    goto :goto_5

    .line 188
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->s:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->s:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 189
    move/from16 v0, v17

    invoke-virtual {v14, v0}, Lo/dyr$d;->d(I)Landroid/graphics/Bitmap;

    move-result-object v21

    .line 190
    if-eqz v21, :cond_8

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->s:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    sub-float/2addr v0, v10

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->s:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    sub-float/2addr v1, v10

    const/4 v2, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, v21

    const/4 v2, 0x0

    invoke-virtual {v3, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 154
    :cond_8
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_4

    .line 129
    :cond_9
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 198
    :cond_a
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 289
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 290
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 291
    iget-object v0, p0, Lo/dyr;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lo/dyr;->l:Lo/oa;

    .line 292
    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/dyr;->l:Lo/oa;

    .line 293
    invoke-virtual {v2}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lo/dyr;->l:Lo/oa;

    .line 294
    invoke-virtual {v3}, Lo/oa;->i()F

    move-result v3

    float-to-int v3, v3

    .line 291
    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 296
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 298
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 299
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 12

    .line 202
    iget-object v0, p0, Lo/dyr;->c:Lo/mu;

    invoke-interface {v0}, Lo/mu;->getLineData()Lo/lx;

    move-result-object v4

    .line 203
    move-object v5, p2

    .line 204
    array-length v6, p2

    .line 206
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    .line 207
    aget-object v8, v5, v7

    .line 208
    invoke-virtual {v8}, Lo/mh;->g()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/lx;->a(I)Lo/mz;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/na;

    .line 209
    if-eqz v9, :cond_0

    invoke-interface {v9}, Lo/na;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    invoke-virtual {v8}, Lo/mh;->b()F

    move-result v0

    invoke-virtual {v8}, Lo/mh;->d()F

    move-result v1

    invoke-interface {v9, v0, v1}, Lo/na;->e(FF)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v10

    .line 211
    invoke-virtual {p0, v10, v9}, Lo/dyr;->d(Lcom/github/mikephil/charting/data/Entry;Lo/mv;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/dyr;->c:Lo/mu;

    invoke-interface {v9}, Lo/na;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mu;->b(Lo/lp$b;)Lo/nv;

    move-result-object v0

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    iget-object v3, p0, Lo/dyr;->i:Lo/la;

    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lo/nv;->d(FF)Lo/nw;

    move-result-object v11

    .line 213
    iget-wide v0, v11, Lo/nw;->b:D

    double-to-float v0, v0

    iget-wide v1, v11, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v8, v0, v1}, Lo/mh;->e(FF)V

    .line 206
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 219
    :cond_1
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 25

    .line 48
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->c:Lo/mu;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/dyr;->c(Lo/mr;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 49
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->c:Lo/mu;

    invoke-interface {v0}, Lo/mu;->getLineData()Lo/lx;

    move-result-object v0

    invoke-virtual {v0}, Lo/lx;->h()Ljava/util/List;

    move-result-object v11

    .line 51
    const/4 v12, 0x0

    :goto_0
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_d

    .line 52
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/na;

    .line 53
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/dyr;->c(Lo/mz;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 55
    invoke-interface {v13}, Lo/na;->C()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 56
    goto/16 :goto_6

    .line 59
    :cond_0
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/dyr;->e(Lo/mz;)V

    .line 60
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->c:Lo/mu;

    invoke-interface {v13}, Lo/na;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mu;->b(Lo/lp$b;)Lo/nv;

    move-result-object v14

    .line 61
    invoke-interface {v13}, Lo/na;->e()F

    move-result v0

    const/high16 v1, 0x3fe00000    # 1.75f

    mul-float/2addr v0, v1

    float-to-int v15, v0

    .line 62
    invoke-interface {v13}, Lo/na;->M()Z

    move-result v0

    if-nez v0, :cond_1

    .line 63
    div-int/lit8 v15, v15, 0x2

    .line 66
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->c:Lo/mu;

    invoke-virtual {v0, v1, v13}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 67
    move-object v0, v14

    move-object v1, v13

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/dyr;->i:Lo/la;

    invoke-virtual {v2}, Lo/la;->b()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/dyr;->i:Lo/la;

    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/dyr;->f:Lo/nk$d;

    iget v4, v4, Lo/nk$d;->c:I

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/dyr;->f:Lo/nk$d;

    iget v5, v5, Lo/nk$d;->d:I

    invoke-virtual/range {v0 .. v5}, Lo/nv;->a(Lo/na;FFII)[F

    move-result-object v16

    .line 68
    invoke-interface {v13}, Lo/na;->z()Lo/nz;

    move-result-object v0

    invoke-static {v0}, Lo/nz;->b(Lo/nz;)Lo/nz;

    move-result-object v17

    .line 69
    move-object/from16 v0, v17

    iget v0, v0, Lo/nz;->e:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v17

    iput v0, v1, Lo/nz;->e:F

    .line 70
    move-object/from16 v0, v17

    iget v0, v0, Lo/nz;->c:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v17

    iput v0, v1, Lo/nz;->c:F

    .line 72
    const/16 v18, 0x0

    :goto_1
    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v1, v18

    if-ge v1, v0, :cond_b

    .line 73
    aget v19, v16, v18

    .line 74
    add-int/lit8 v0, v18, 0x1

    aget v20, v16, v0

    .line 75
    if-nez v18, :cond_2

    .line 76
    move/from16 v0, v19

    move-object/from16 v1, p0

    iput v0, v1, Lo/dyr;->q:F

    goto :goto_2

    .line 77
    :cond_2
    add-int/lit8 v0, v18, 0x1

    move-object/from16 v1, v16

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_3

    .line 78
    move/from16 v0, v19

    move-object/from16 v1, p0

    iput v0, v1, Lo/dyr;->r:F

    .line 80
    :cond_3
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->l:Lo/oa;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_4

    .line 81
    goto/16 :goto_5

    .line 84
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->l:Lo/oa;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dyr;->l:Lo/oa;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 85
    div-int/lit8 v0, v18, 0x2

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dyr;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    invoke-interface {v13, v0}, Lo/na;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v21

    .line 86
    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v22

    .line 87
    const-string v23, ""

    .line 88
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_5

    .line 89
    move-object/from16 v23, v22

    check-cast v23, Ljava/lang/String;

    .line 91
    :cond_5
    invoke-interface {v13}, Lo/na;->v()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 92
    const-string v0, "LINE_PATH_BOLD_START"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 93
    goto/16 :goto_4

    .line 94
    :cond_6
    const-string v0, "DASH_PATH_END"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 95
    const/high16 v0, 0x41200000    # 10.0f

    invoke-interface {v13, v0}, Lo/na;->d(F)V

    .line 96
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/dyr;->e(Lo/mz;)V

    .line 97
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v13}, Lo/na;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    move-object/from16 v4, v21

    move v5, v12

    move/from16 v6, v19

    const/high16 v7, 0x41700000    # 15.0f

    invoke-static {v7}, Lo/oc;->b(F)F

    move-result v7

    add-float v7, v7, v20

    const-string v8, "#FFFB6522"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lo/dyr;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    goto/16 :goto_3

    .line 98
    :cond_7
    const-string v0, "DASH_PATH"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 99
    const/high16 v0, 0x41000000    # 8.0f

    invoke-interface {v13, v0}, Lo/na;->d(F)V

    .line 100
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/dyr;->e(Lo/mz;)V

    .line 101
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v13}, Lo/na;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    move-object/from16 v4, v21

    move v5, v12

    move/from16 v6, v19

    const/high16 v7, 0x41500000    # 13.0f

    invoke-static {v7}, Lo/oc;->b(F)F

    move-result v7

    add-float v7, v7, v20

    div-int/lit8 v8, v18, 0x2

    invoke-interface {v13, v8}, Lo/na;->b(I)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lo/dyr;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    goto :goto_3

    .line 103
    :cond_8
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v13}, Lo/na;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    move-object/from16 v4, v21

    move v5, v12

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v6

    move-object/from16 v7, v16

    move/from16 v8, v18

    invoke-static {v7, v8, v6}, Lo/elu;->b([FIF)F

    move-result v6

    add-float v6, v6, v19

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {v7}, Lo/oc;->b(F)F

    move-result v7

    sub-float v7, v20, v7

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v8

    move-object/from16 v9, v16

    move/from16 v10, v18

    invoke-static {v9, v10, v8}, Lo/elu;->a([FIF)F

    move-result v8

    add-float/2addr v7, v8

    div-int/lit8 v8, v18, 0x2

    invoke-interface {v13, v8}, Lo/na;->b(I)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lo/dyr;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    .line 107
    :cond_9
    :goto_3
    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-interface {v13}, Lo/na;->x()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 108
    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v24

    .line 109
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move-object/from16 v2, v17

    iget v2, v2, Lo/nz;->e:F

    add-float v2, v2, v19

    float-to-int v2, v2

    move-object/from16 v3, v17

    iget v3, v3, Lo/nz;->c:F

    add-float v3, v3, v20

    float-to-int v3, v3

    invoke-virtual/range {v24 .. v24}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual/range {v24 .. v24}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lo/oc;->d(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    .line 72
    :cond_a
    :goto_4
    add-int/lit8 v18, v18, 0x2

    goto/16 :goto_1

    .line 114
    :cond_b
    :goto_5
    invoke-static/range {v17 .. v17}, Lo/nz;->c(Lo/nz;)V

    .line 51
    :cond_c
    :goto_6
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 119
    :cond_d
    return-void
.end method
