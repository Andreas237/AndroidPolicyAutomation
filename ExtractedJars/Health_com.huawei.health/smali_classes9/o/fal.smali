.class public Lo/fal;
.super Lo/ehp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fal$a;
    }
.end annotation


# instance fields
.field private m:Z

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:Lo/fal$a;

.field private s:Z

.field private t:Lo/eho;

.field private u:I


# direct methods
.method public varargs constructor <init>(Lo/eho;Lo/ejj;Lo/la;Lo/oa;[Ljava/lang/String;)V
    .locals 4

    .line 79
    invoke-direct {p0, p2, p3, p4}, Lo/ehp;-><init>(Lo/ejj;Lo/la;Lo/oa;)V

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fal;->m:Z

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fal;->p:Z

    .line 63
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fal;->s:Z

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/fal;->u:I

    .line 75
    const-string v0, ""

    iput-object v0, p0, Lo/fal;->q:Ljava/lang/String;

    .line 80
    iput-object p1, p0, Lo/fal;->t:Lo/eho;

    .line 81
    iput-object p2, p0, Lo/fal;->b:Lo/ejj;

    .line 82
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/fal;->k:Landroid/graphics/Paint;

    .line 83
    iget-object v0, p0, Lo/fal;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 84
    iget-object v0, p0, Lo/fal;->k:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    iget-object v0, p0, Lo/fal;->k:Landroid/graphics/Paint;

    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 86
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/fal;->a:Landroid/graphics/Paint;

    .line 87
    iget-object v0, p0, Lo/fal;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 88
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/fal;->o:Landroid/graphics/Paint;

    .line 89
    iget-object v0, p0, Lo/fal;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 91
    array-length v0, p5

    if-lez v0, :cond_0

    .line 92
    const/4 v0, 0x1

    aget-object v0, p5, v0

    iput-object v0, p0, Lo/fal;->q:Ljava/lang/String;

    .line 94
    :cond_0
    return-void
.end method

.method private a(Lo/ejm;)I
    .locals 4

    .line 627
    iget-boolean v0, p0, Lo/fal;->s:Z

    if-eqz v0, :cond_0

    .line 628
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 630
    :cond_0
    invoke-interface {p1}, Lo/ejm;->h()I

    move-result v0

    return v0
.end method

.method private b(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)I"
        }
    .end annotation

    .line 237
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 238
    const/4 v3, 0x0

    .line 239
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 240
    int-to-float v0, v3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v3, v0

    .line 239
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 242
    :cond_0
    if-nez v2, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    int-to-float v0, v3

    int-to-float v1, v2

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_1
    return v0
.end method

.method private e(Lo/ejm;)I
    .locals 4

    .line 620
    iget-boolean v0, p0, Lo/fal;->s:Z

    if-eqz v0, :cond_0

    .line 621
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 623
    :cond_0
    invoke-interface {p1}, Lo/ejm;->m()I

    move-result v0

    return v0
.end method

.method private e(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lo/nv;ILo/fai;)V
    .locals 33

    .line 254
    const/4 v6, 0x2

    new-array v6, v6, [F

    fill-array-data v6, :array_0

    .line 255
    move-object/from16 v0, p3

    invoke-virtual {v0, v6}, Lo/nv;->e([F)V

    .line 257
    const/4 v0, 0x1

    aget v7, v6, v0

    .line 259
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v8

    .line 261
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 263
    const v0, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_0

    .line 264
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v7

    if-nez v0, :cond_0

    .line 265
    return-void

    .line 269
    :cond_0
    const/4 v10, 0x0

    .line 270
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fal;->m:Z

    if-eqz v0, :cond_1

    .line 271
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v10, v0

    .line 273
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fal;->p:Z

    if-eqz v0, :cond_2

    .line 274
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v10, v0

    .line 278
    :cond_2
    cmpg-float v0, v8, v10

    if-gez v0, :cond_3

    .line 279
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 280
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v10, v0

    sub-float v0, v11, v0

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->top:F

    .line 281
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v10, v0

    add-float/2addr v0, v11

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->bottom:F

    .line 283
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v7

    if-lez v0, :cond_3

    .line 285
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float v12, v0, v7

    .line 286
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v12

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->bottom:F

    .line 287
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v12

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->top:F

    .line 291
    :cond_3
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->top:F

    sub-float v11, v0, v1

    .line 293
    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 295
    new-instance v14, Landroid/graphics/Paint;

    invoke-direct {v14}, Landroid/graphics/Paint;-><init>()V

    .line 296
    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    .line 297
    new-instance v16, Landroid/graphics/Paint;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Paint;-><init>()V

    .line 298
    new-instance v17, Landroid/graphics/Paint;

    invoke-direct/range {v17 .. v17}, Landroid/graphics/Paint;-><init>()V

    .line 299
    new-instance v18, Landroid/graphics/Paint;

    invoke-direct/range {v18 .. v18}, Landroid/graphics/Paint;-><init>()V

    .line 300
    const/4 v0, 0x1

    move/from16 v1, p4

    if-ne v0, v1, :cond_4

    .line 301
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x8f

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 302
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xd9

    const/16 v3, 0x45

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 303
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0x97

    const/16 v3, 0x6b

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 304
    const/16 v0, 0xff

    const/16 v1, 0xc6

    const/16 v2, 0x4b

    const/16 v3, 0xe4

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 305
    const/16 v0, 0xff

    const/16 v1, 0x8a

    const/16 v2, 0x2b

    const/16 v3, 0xe2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 307
    :cond_4
    const/16 v0, 0xff

    const/16 v1, 0xe5

    const/16 v2, 0xf3

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 308
    const/16 v0, 0xff

    const/16 v1, 0xf9

    const/16 v2, 0xee

    const/16 v3, 0xc1

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 309
    const/16 v0, 0xff

    const/16 v1, 0xf9

    const/16 v2, 0xda

    const/16 v3, 0xcd

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 310
    const/16 v0, 0xff

    const/16 v1, 0xe8

    const/16 v2, 0xc3

    const/16 v3, 0xf1

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 311
    const/16 v0, 0xff

    const/16 v1, 0xd6

    const/16 v2, 0xb9

    const/16 v3, 0xf1

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 313
    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_5

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fal;->m:Z

    if-eqz v0, :cond_5

    .line 314
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    sub-float/2addr v11, v0

    .line 315
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v9, v0

    add-float/2addr v12, v0

    .line 319
    :cond_5
    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_12

    .line 320
    invoke-virtual/range {p5 .. p5}, Lo/fai;->b()F

    move-result v19

    .line 321
    invoke-virtual/range {p5 .. p5}, Lo/fai;->e()F

    move-result v20

    .line 322
    invoke-virtual/range {p5 .. p5}, Lo/fai;->a()F

    move-result v21

    .line 323
    invoke-virtual/range {p5 .. p5}, Lo/fai;->c()F

    move-result v22

    .line 324
    invoke-virtual/range {p5 .. p5}, Lo/fai;->d()F

    move-result v23

    .line 331
    add-float v0, v23, v22

    add-float v0, v0, v21

    add-float v0, v0, v20

    add-float v29, v0, v19

    .line 332
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v13

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v12

    sub-float v30, v0, v1

    .line 334
    const/4 v0, 0x0

    cmpg-float v0, v23, v0

    if-gtz v0, :cond_6

    const/4 v0, 0x0

    cmpg-float v0, v22, v0

    if-gtz v0, :cond_6

    const/4 v0, 0x0

    cmpg-float v0, v21, v0

    if-gtz v0, :cond_6

    const/4 v0, 0x0

    cmpg-float v0, v20, v0

    if-gtz v0, :cond_6

    .line 335
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float v24, v0, v13

    goto :goto_1

    .line 337
    :cond_6
    div-float v0, v19, v29

    mul-float v0, v0, v30

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v1

    add-float v24, v0, v12

    .line 339
    :goto_1
    const/4 v0, 0x0

    cmpg-float v0, v23, v0

    if-gtz v0, :cond_7

    const/4 v0, 0x0

    cmpg-float v0, v22, v0

    if-gtz v0, :cond_7

    const/4 v0, 0x0

    cmpg-float v0, v21, v0

    if-gtz v0, :cond_7

    .line 340
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float v25, v0, v13

    goto :goto_2

    .line 342
    :cond_7
    div-float v0, v20, v29

    mul-float v0, v0, v30

    add-float v25, v0, v24

    .line 344
    :goto_2
    const/4 v0, 0x0

    cmpg-float v0, v23, v0

    if-gtz v0, :cond_8

    const/4 v0, 0x0

    cmpg-float v0, v22, v0

    if-gtz v0, :cond_8

    .line 345
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float v26, v0, v13

    goto :goto_3

    .line 347
    :cond_8
    div-float v0, v21, v29

    mul-float v0, v0, v30

    add-float v26, v0, v25

    .line 349
    :goto_3
    const/4 v0, 0x0

    cmpg-float v0, v23, v0

    if-gtz v0, :cond_9

    .line 350
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float v27, v0, v13

    goto :goto_4

    .line 352
    :cond_9
    div-float v0, v22, v29

    mul-float v0, v0, v30

    add-float v27, v0, v26

    .line 354
    :goto_4
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    sub-float v28, v0, v13

    .line 356
    const/4 v0, 0x1

    move/from16 v1, p4

    if-eq v0, v1, :cond_a

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 357
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move/from16 v31, v0

    .line 358
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/RectF;->right:F

    move/from16 v32, v0

    .line 359
    move/from16 v0, v31

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->right:F

    .line 360
    move/from16 v0, v32

    move-object/from16 v1, p2

    iput v0, v1, Landroid/graphics/RectF;->left:F

    .line 362
    :cond_a
    const/4 v0, 0x0

    cmpl-float v0, v19, v0

    if-lez v0, :cond_b

    .line 363
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move-object/from16 v2, p2

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v12

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v9, v3

    sub-float/2addr v2, v3

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move-object/from16 v4, p2

    iget v4, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v4, v12

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v9, v5

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v31, v0

    .line 364
    move-object/from16 v0, p1

    move-object/from16 v1, v31

    move-object v5, v14

    const/4 v2, 0x0

    const/high16 v3, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 365
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move-object/from16 v2, p2

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v12

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move/from16 v4, v24

    move-object v5, v14

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 368
    :cond_b
    const/16 v31, 0x0

    .line 369
    const/4 v0, 0x0

    cmpl-float v0, v20, v0

    if-lez v0, :cond_c

    .line 370
    const/16 v31, 0x1

    .line 371
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    sub-float v2, v24, v2

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v9, v4

    add-float v4, v4, v24

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v32, v0

    .line 372
    move-object/from16 v0, p1

    move-object/from16 v1, v32

    move-object v5, v15

    const/4 v2, 0x0

    const/high16 v3, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 373
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move/from16 v2, v24

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move/from16 v4, v25

    move-object v5, v15

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 375
    :cond_c
    const/4 v0, 0x0

    cmpl-float v0, v21, v0

    if-lez v0, :cond_e

    .line 376
    if-nez v31, :cond_d

    .line 377
    const/16 v31, 0x1

    .line 378
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    sub-float v2, v25, v2

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v9, v4

    add-float v4, v4, v25

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v32, v0

    .line 379
    move-object/from16 v0, p1

    move-object/from16 v1, v32

    move-object/from16 v5, v16

    const/4 v2, 0x0

    const/high16 v3, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 381
    :cond_d
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move/from16 v2, v25

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move/from16 v4, v26

    move-object/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 383
    :cond_e
    const/4 v0, 0x0

    cmpl-float v0, v22, v0

    if-lez v0, :cond_10

    .line 384
    if-nez v31, :cond_f

    .line 385
    const/16 v31, 0x1

    .line 386
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    sub-float v2, v26, v2

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v9, v4

    add-float v4, v4, v26

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v32, v0

    .line 387
    move-object/from16 v0, p1

    move-object/from16 v1, v32

    move-object/from16 v5, v17

    const/4 v2, 0x0

    const/high16 v3, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 389
    :cond_f
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move/from16 v2, v26

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move/from16 v4, v27

    move-object/from16 v5, v17

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 391
    :cond_10
    const/4 v0, 0x0

    cmpl-float v0, v23, v0

    if-lez v0, :cond_12

    .line 392
    if-nez v31, :cond_11

    .line 393
    const/16 v31, 0x1

    .line 394
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    sub-float v2, v27, v2

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v9, v4

    add-float v4, v4, v27

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v32, v0

    .line 395
    move-object/from16 v0, p1

    move-object/from16 v1, v32

    move-object/from16 v5, v18

    const/4 v2, 0x0

    const/high16 v3, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 397
    :cond_11
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/RectF;->left:F

    move/from16 v2, v27

    move-object/from16 v3, p2

    iget v3, v3, Landroid/graphics/RectF;->right:F

    move/from16 v4, v28

    move-object/from16 v5, v18

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 400
    :cond_12
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

    .line 606
    iget-object v0, p0, Lo/fal;->b:Lo/ejj;

    return-object v0
.end method

.method protected a(FFFFLo/nv;)V
    .locals 6

    .line 403
    sub-float v2, p1, p4

    .line 404
    add-float v3, p1, p4

    .line 405
    move v4, p2

    .line 406
    move v5, p3

    .line 407
    iget-object v0, p0, Lo/fal;->d:Landroid/graphics/RectF;

    invoke-virtual {v0, v2, v4, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 408
    iget-object v0, p0, Lo/fal;->d:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/fal;->i:Lo/la;

    invoke-virtual {v1}, Lo/la;->d()F

    move-result v1

    invoke-virtual {p5, v0, v1}, Lo/nv;->d(Landroid/graphics/RectF;F)V

    .line 409
    return-void
.end method

.method public a(Landroid/graphics/Canvas;)V
    .locals 7

    .line 121
    iget-object v0, p0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v4

    .line 122
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 123
    const-string v0, "SleepBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawData() barData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    return-void

    .line 126
    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lo/ehq;->e()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 127
    invoke-virtual {v4, v5}, Lo/ehq;->a(I)Lo/mz;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ejm;

    .line 128
    invoke-interface {v6}, Lo/ejm;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    invoke-virtual {p0, p1, v6, v5}, Lo/fal;->a(Landroid/graphics/Canvas;Lo/ejm;I)V

    .line 126
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 132
    :cond_2
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;Lo/ejm;I)V
    .locals 22

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v6

    .line 143
    move/from16 v0, p3

    invoke-virtual {v6, v0}, Lo/ehq;->a(I)Lo/mz;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ejm;

    .line 144
    if-eqz v7, :cond_0

    invoke-interface {v7}, Lo/ejm;->n()Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    :cond_0
    return-void

    .line 147
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface/range {p2 .. p2}, Lo/ejm;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/eit$b;)Lo/eim;

    move-result-object v8

    .line 148
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->o:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/ejm;->Q()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->o:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/ejm;->S()F

    move-result v1

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 151
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->b()F

    move-result v9

    .line 152
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v10

    .line 154
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->e:[Lo/ekn;

    aget-object v11, v0, p3

    .line 155
    invoke-virtual {v11, v9, v10}, Lo/ekn;->b(FF)V

    .line 156
    move/from16 v0, p3

    invoke-virtual {v11, v0}, Lo/ekn;->e(I)V

    .line 158
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/ekn;->b(Z)V

    .line 159
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->a()F

    move-result v0

    invoke-virtual {v11, v0}, Lo/ekn;->d(F)V

    .line 160
    move-object/from16 v0, p2

    invoke-virtual {v11, v0}, Lo/ekn;->a(Lo/ejm;)V

    .line 161
    iget-object v0, v11, Lo/ekn;->e:[F

    invoke-virtual {v8, v0}, Lo/nv;->e([F)V

    .line 163
    invoke-interface/range {p2 .. p2}, Lo/ejm;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v12, 0x1

    goto :goto_0

    :cond_2
    const/4 v12, 0x0

    .line 164
    :goto_0
    if-eqz v12, :cond_3

    .line 165
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lo/fal;->e(Lo/ejm;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 167
    :cond_3
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 168
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 169
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 170
    const/16 v16, 0x0

    :goto_1
    invoke-virtual {v11}, Lo/ekn;->a()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_b

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    iget-object v1, v11, Lo/ekn;->e:[F

    aget v1, v1, v16

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_4

    .line 172
    goto/16 :goto_2

    .line 173
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    iget-object v1, v11, Lo/ekn;->e:[F

    add-int/lit8 v2, v16, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_5

    .line 174
    goto/16 :goto_2

    .line 175
    :cond_5
    if-nez v12, :cond_6

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->h:Landroid/graphics/Paint;

    div-int/lit8 v1, v16, 0x4

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Lo/ejm;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 179
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->c:Landroid/graphics/RectF;

    iget-object v1, v11, Lo/ekn;->e:[F

    aget v1, v1, v16

    iget-object v2, v11, Lo/ekn;->e:[F

    add-int/lit8 v3, v16, 0x1

    aget v2, v2, v3

    iget-object v3, v11, Lo/ekn;->e:[F

    add-int/lit8 v4, v16, 0x2

    aget v3, v3, v4

    iget-object v4, v11, Lo/ekn;->e:[F

    add-int/lit8 v5, v16, 0x3

    aget v4, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 181
    div-int/lit8 v0, v16, 0x4

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ejm;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 182
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_7

    .line 183
    return-void

    .line 185
    :cond_7
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    check-cast v0, Lo/fam;

    invoke-virtual {v0}, Lo/fam;->a()Lo/fai;

    move-result-object v18

    .line 187
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_a

    .line 188
    invoke-virtual/range {v18 .. v18}, Lo/fai;->d()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_8

    .line 189
    invoke-virtual/range {v18 .. v18}, Lo/fai;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    :cond_8
    invoke-virtual/range {v18 .. v18}, Lo/fai;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 192
    invoke-virtual/range {v18 .. v18}, Lo/fai;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    :cond_9
    invoke-virtual/range {v18 .. v18}, Lo/fai;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    .line 195
    invoke-virtual/range {v18 .. v18}, Lo/fai;->a()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fal;->c:Landroid/graphics/RectF;

    move-object v3, v8

    move-object/from16 v5, v18

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/fal;->e(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lo/nv;ILo/fai;)V

    .line 170
    :goto_2
    add-int/lit8 v16, v16, 0x4

    goto/16 :goto_1

    .line 202
    :cond_b
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lo/fal;->b(Ljava/util/List;)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v14}, Lo/fal;->b(Ljava/util/List;)I

    move-result v1

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    invoke-direct {v1, v15}, Lo/fal;->b(Ljava/util/List;)I

    move-result v1

    add-int v16, v0, v1

    .line 203
    move-object/from16 v0, p0

    iget v0, v0, Lo/fal;->u:I

    move/from16 v1, v16

    if-eq v0, v1, :cond_d

    .line 204
    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lo/fal;->u:I

    .line 205
    const-string v17, ""

    .line 206
    move-object/from16 v0, p0

    iget v0, v0, Lo/fal;->u:I

    div-int/lit8 v18, v0, 0x3c

    .line 207
    move/from16 v0, v18

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v19

    .line 208
    move-object/from16 v0, p0

    iget v0, v0, Lo/fal;->u:I

    rem-int/lit8 v20, v0, 0x3c

    .line 209
    move/from16 v0, v20

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v21

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->q:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v19, v1, v2

    const/4 v2, 0x1

    aput-object v21, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 212
    if-lez v16, :cond_c

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->t:Lo/eho;

    check-cast v0, Lo/fah;

    const/16 v1, 0x1a

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v17, v2, v3

    move/from16 v3, v16

    invoke-virtual {v0, v3, v1, v2}, Lo/fah;->a(II[Ljava/lang/String;)V

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->t:Lo/eho;

    invoke-virtual {v0}, Lo/eho;->ak()V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->t:Lo/eho;

    invoke-virtual {v0}, Lo/eho;->c()V

    goto :goto_3

    .line 217
    :cond_c
    const-string v17, ""

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->t:Lo/eho;

    check-cast v0, Lo/fah;

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v17, v2, v3

    move/from16 v3, v16

    invoke-virtual {v0, v3, v1, v2}, Lo/fah;->a(II[Ljava/lang/String;)V

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->t:Lo/eho;

    invoke-virtual {v0}, Lo/eho;->ak()V

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->t:Lo/eho;

    invoke-virtual {v0}, Lo/eho;->c()V

    .line 223
    :cond_d
    :goto_3
    const/16 v16, 0x0

    .line 224
    invoke-interface {v13}, Ljava/util/List;->clear()V

    .line 225
    invoke-interface {v14}, Ljava/util/List;->clear()V

    .line 226
    invoke-interface {v15}, Ljava/util/List;->clear()V

    .line 228
    return-void
.end method

.method public a(Lo/fal$a;)V
    .locals 0

    .line 589
    iput-object p1, p0, Lo/fal;->r:Lo/fal$a;

    .line 590
    return-void
.end method

.method public b()Z
    .locals 1

    .line 616
    iget-boolean v0, p0, Lo/fal;->s:Z

    return v0
.end method

.method public c(Z)V
    .locals 0

    .line 611
    iput-boolean p1, p0, Lo/fal;->s:Z

    .line 612
    return-void
.end method

.method public c(ZZ)V
    .locals 0

    .line 646
    iput-boolean p1, p0, Lo/fal;->m:Z

    .line 647
    iput-boolean p2, p0, Lo/fal;->p:Z

    .line 648
    return-void
.end method

.method protected c(Lo/mr;)Z
    .locals 1

    .line 534
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 0

    .line 603
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 18

    .line 545
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fal;->s:Z

    if-eqz v0, :cond_0

    .line 547
    return-void

    .line 549
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v6

    .line 550
    const/4 v7, 0x0

    :goto_0
    move-object/from16 v0, p2

    array-length v0, v0

    if-ge v7, v0, :cond_6

    .line 551
    aget-object v8, p2, v7

    .line 552
    invoke-virtual {v8}, Lo/mh;->g()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/ehq;->a(I)Lo/mz;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/ejm;

    .line 553
    if-eqz v9, :cond_5

    invoke-interface {v9}, Lo/ejm;->n()Z

    move-result v0

    if-nez v0, :cond_1

    .line 554
    goto/16 :goto_1

    .line 555
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->k:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    invoke-direct {v1, v9}, Lo/fal;->a(Lo/ejm;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 556
    invoke-virtual {v8}, Lo/mh;->b()F

    move-result v0

    invoke-interface {v9, v0}, Lo/ejm;->e(F)Ljava/util/List;

    move-result-object v10

    .line 557
    if-eqz v10, :cond_2

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 558
    :cond_2
    return-void

    .line 560
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 561
    move-object/from16 v0, p0

    invoke-virtual {v0, v11, v9}, Lo/fal;->d(Lcom/github/mikephil/charting/data/Entry;Lo/mv;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 562
    goto/16 :goto_1

    .line 563
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v9}, Lo/ejm;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/eit$b;)Lo/eim;

    move-result-object v12

    .line 566
    invoke-virtual {v11}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/fam;

    .line 567
    invoke-virtual {v15}, Lo/fam;->c()F

    move-result v13

    .line 568
    invoke-virtual {v15}, Lo/fam;->d()F

    move-result v14

    .line 569
    invoke-virtual {v15}, Lo/fam;->a()Lo/fai;

    move-result-object v16

    .line 570
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->r:Lo/fal$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_5

    .line 571
    invoke-virtual/range {v16 .. v16}, Lo/fai;->e()F

    move-result v0

    sub-float v17, v13, v0

    .line 572
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->r:Lo/fal$a;

    move/from16 v1, v17

    invoke-interface {v0, v1}, Lo/fal$a;->b(F)V

    .line 573
    move-object/from16 v0, p0

    invoke-virtual {v11}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v1

    move v2, v13

    move v3, v14

    invoke-virtual {v6}, Lo/ehq;->a()F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    move-object v5, v12

    invoke-virtual/range {v0 .. v5}, Lo/fal;->a(FFFFLo/nv;)V

    .line 574
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->d:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    invoke-virtual {v1, v8, v0}, Lo/fal;->d(Lo/mh;Landroid/graphics/RectF;)V

    .line 575
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fal;->d:Landroid/graphics/RectF;

    move-object v3, v12

    move-object/from16 v5, v16

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fal;->e(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lo/nv;ILo/fai;)V

    .line 550
    :cond_5
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 579
    :cond_6
    return-void
.end method

.method protected d(Lo/mh;Landroid/graphics/RectF;)V
    .locals 2

    .line 598
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget v1, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0, v1}, Lo/mh;->e(FF)V

    .line 599
    return-void
.end method

.method public d()Z
    .locals 2

    .line 635
    iget-object v0, p0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v1

    .line 636
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

    .line 101
    iget-object v0, p0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v5

    .line 102
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 103
    const-string v0, "SleepBarChartRenderer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBuffers() barData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-void

    .line 106
    :cond_0
    invoke-virtual {v5}, Lo/ehq;->e()I

    move-result v0

    new-array v0, v0, [Lo/ekn;

    iput-object v0, p0, Lo/fal;->e:[Lo/ekn;

    .line 107
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/fal;->e:[Lo/ekn;

    array-length v0, v0

    if-ge v6, v0, :cond_2

    .line 108
    invoke-virtual {v5, v6}, Lo/ehq;->a(I)Lo/mz;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ejm;

    .line 109
    iget-object v0, p0, Lo/fal;->e:[Lo/ekn;

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

    .line 110
    invoke-virtual {v5}, Lo/ehq;->e()I

    move-result v3

    invoke-interface {v7}, Lo/ejm;->L()Z

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lo/ekn;-><init>(IIZ)V

    aput-object v1, v0, v6

    .line 107
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 112
    :cond_2
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 30

    .line 413
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/fal;->c(Lo/mr;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 414
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v10

    .line 415
    const/high16 v0, 0x40900000    # 4.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v11

    .line 418
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->e()Z

    move-result v14

    .line 419
    const/4 v15, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->e()I

    move-result v0

    if-ge v15, v0, :cond_13

    .line 420
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/ejm;

    .line 421
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/fal;->c(Lo/mz;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    goto/16 :goto_c

    .line 424
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/fal;->e(Lo/mz;)V

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->n:Landroid/graphics/Paint;

    const-string v1, "8"

    invoke-static {v0, v1}, Lo/oc;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v1, v0

    move/from16 v17, v1

    .line 429
    if-eqz v14, :cond_1

    neg-float v12, v11

    goto :goto_1

    :cond_1
    add-float v12, v17, v11

    .line 430
    :goto_1
    if-eqz v14, :cond_2

    add-float v13, v17, v11

    goto :goto_2

    :cond_2
    neg-float v13, v11

    .line 433
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->e:[Lo/ekn;

    aget-object v18, v0, v15

    .line 434
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v19

    .line 435
    invoke-interface/range {v16 .. v16}, Lo/ejm;->z()Lo/nz;

    move-result-object v0

    invoke-static {v0}, Lo/nz;->b(Lo/nz;)Lo/nz;

    move-result-object v20

    .line 436
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->e:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v20

    iput v0, v1, Lo/nz;->e:F

    .line 437
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->c:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v20

    iput v0, v1, Lo/nz;->c:F

    .line 440
    invoke-interface/range {v16 .. v16}, Lo/ejm;->L()Z

    move-result v0

    if-nez v0, :cond_a

    .line 441
    const/16 v21, 0x0

    :goto_3
    move/from16 v0, v21

    int-to-float v0, v0

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    array-length v1, v1

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fal;->i:Lo/la;

    invoke-virtual {v2}, Lo/la;->b()F

    move-result v2

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 442
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

    .line 443
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 444
    goto/16 :goto_7

    .line 445
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    add-int/lit8 v2, v21, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    .line 446
    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_4

    .line 447
    goto/16 :goto_6

    .line 448
    :cond_4
    div-int/lit8 v0, v21, 0x4

    move-object/from16 v1, v16

    invoke-interface {v1, v0}, Lo/ejm;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 449
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v24

    .line 450
    invoke-interface/range {v16 .. v16}, Lo/ejm;->v()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 451
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

    .line 455
    move-object/from16 v9, v16

    invoke-interface {v9, v8}, Lo/ejm;->b(I)I

    move-result v8

    .line 451
    invoke-virtual/range {v0 .. v8}, Lo/fal;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    .line 457
    :cond_6
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface/range {v16 .. v16}, Lo/ejm;->x()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 458
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v25

    .line 459
    move/from16 v26, v22

    .line 460
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

    .line 463
    :goto_5
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->e:F

    add-float v26, v26, v0

    .line 464
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->c:F

    add-float v27, v27, v0

    .line 465
    move-object/from16 v0, p1

    move-object/from16 v1, v25

    move/from16 v2, v26

    float-to-int v2, v2

    move/from16 v3, v27

    float-to-int v3, v3

    .line 470
    invoke-virtual/range {v25 .. v25}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 471
    invoke-virtual/range {v25 .. v25}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    .line 465
    invoke-static/range {v0 .. v5}, Lo/oc;->d(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    .line 441
    :cond_8
    :goto_6
    add-int/lit8 v21, v21, 0x4

    goto/16 :goto_3

    :cond_9
    :goto_7
    goto/16 :goto_b

    .line 476
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->b:Lo/ejj;

    invoke-interface/range {v16 .. v16}, Lo/ejm;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/lp$b;)Lo/nv;

    move-result-object v21

    .line 477
    const/16 v22, 0x0

    .line 478
    const/16 v23, 0x0

    .line 480
    :cond_b
    :goto_8
    move/from16 v0, v23

    int-to-float v0, v0

    invoke-interface/range {v16 .. v16}, Lo/ejm;->C()I

    move-result v1

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fal;->i:Lo/la;

    invoke-virtual {v2}, Lo/la;->b()F

    move-result v2

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_12

    .line 481
    move-object/from16 v0, v16

    move/from16 v1, v23

    invoke-interface {v0, v1}, Lo/ejm;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 483
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

    .line 484
    move-object/from16 v0, v16

    move/from16 v1, v23

    invoke-interface {v0, v1}, Lo/ejm;->b(I)I

    move-result v26

    .line 489
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_c

    .line 490
    goto/16 :goto_b

    .line 492
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    move-object/from16 v1, v18

    iget-object v1, v1, Lo/lb;->e:[F

    add-int/lit8 v2, v22, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_b

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fal;->l:Lo/oa;

    .line 493
    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_d

    .line 494
    goto :goto_8

    .line 496
    :cond_d
    invoke-interface/range {v16 .. v16}, Lo/ejm;->v()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 497
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

    .line 499
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

    .line 497
    invoke-virtual/range {v0 .. v8}, Lo/fal;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    .line 503
    :cond_f
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-interface/range {v16 .. v16}, Lo/ejm;->x()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 505
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v27

    .line 507
    move/from16 v28, v25

    .line 508
    move-object/from16 v0, v18

    iget-object v0, v0, Lo/lb;->e:[F

    add-int/lit8 v1, v22, 0x1

    aget v0, v0, v1

    .line 509
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

    .line 511
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->e:F

    add-float v28, v28, v0

    .line 512
    move-object/from16 v0, v20

    iget v0, v0, Lo/nz;->c:F

    add-float v29, v29, v0

    .line 514
    move-object/from16 v0, p1

    move-object/from16 v1, v27

    move/from16 v2, v28

    float-to-int v2, v2

    move/from16 v3, v29

    float-to-int v3, v3

    .line 519
    invoke-virtual/range {v27 .. v27}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 520
    invoke-virtual/range {v27 .. v27}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    .line 514
    invoke-static/range {v0 .. v5}, Lo/oc;->d(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    .line 523
    :cond_11
    add-int/lit8 v22, v22, 0x4

    .line 524
    add-int/lit8 v23, v23, 0x1

    .line 525
    goto/16 :goto_8

    .line 527
    :cond_12
    :goto_b
    invoke-static/range {v20 .. v20}, Lo/nz;->c(Lo/nz;)V

    .line 419
    :goto_c
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 530
    :cond_13
    return-void
.end method
