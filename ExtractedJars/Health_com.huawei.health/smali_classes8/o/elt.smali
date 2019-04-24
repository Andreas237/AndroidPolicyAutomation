.class public Lo/elt;
.super Lo/nh;
.source "SourceFile"


# instance fields
.field private B:I

.field private m:F

.field private o:I

.field private p:Landroid/graphics/Paint;

.field private q:Landroid/graphics/Path;

.field private r:Z

.field private s:Landroid/graphics/Paint;

.field private t:F

.field private u:F

.field private v:F

.field private w:Z

.field private x:Z

.field private y:[F

.field private z:Lo/mt;


# direct methods
.method public constructor <init>(Lo/mo;Lo/la;Lo/oa;)V
    .locals 2

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/nh;-><init>(Lo/mo;Lo/la;Lo/oa;)V

    .line 24
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/elt;->p:Landroid/graphics/Paint;

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elt;->r:Z

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elt;->w:Z

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elt;->x:Z

    .line 44
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/elt;->y:[F

    .line 41
    return-void
.end method

.method private a(F)Ljava/lang/String;
    .locals 4

    .line 300
    iget-boolean v0, p0, Lo/elt;->r:Z

    if-eqz v0, :cond_0

    .line 301
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 303
    :cond_0
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()F
    .locals 2

    .line 56
    iget v0, p0, Lo/elt;->v:F

    const/high16 v1, 0x42200000    # 40.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lo/elt;->v:F

    const/high16 v1, 0x42200000    # 40.0f

    rem-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 57
    :cond_0
    iget v0, p0, Lo/elt;->v:F

    return v0

    .line 59
    :cond_1
    iget v0, p0, Lo/elt;->v:F

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x28

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x28

    int-to-float v0, v0

    return v0
.end method

.method private c()V
    .locals 4

    .line 308
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/elt;->s:Landroid/graphics/Paint;

    .line 309
    iget-object v0, p0, Lo/elt;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 310
    iget-object v0, p0, Lo/elt;->s:Landroid/graphics/Paint;

    const/16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 312
    iget-object v0, p0, Lo/elt;->s:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 313
    iget-object v0, p0, Lo/elt;->s:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 314
    iget-object v0, p0, Lo/elt;->s:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 317
    iget-object v0, p0, Lo/elt;->p:Landroid/graphics/Paint;

    const-string v1, "#FF1A1A1A"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 318
    iget-object v0, p0, Lo/elt;->p:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 319
    return-void

    :array_0
    .array-data 4
        0x40c00000    # 6.0f
        0x40c00000    # 6.0f
    .end array-data
.end method

.method private e(I)Z
    .locals 4

    .line 182
    const/4 v3, 0x1

    .line 183
    iget-boolean v0, p0, Lo/elt;->r:Z

    if-eqz v0, :cond_0

    .line 184
    const/4 v0, 0x1

    return v0

    .line 186
    :cond_0
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    rsub-int/lit8 v1, p1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/elt;->m:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-direct {p0}, Lo/elt;->b()F

    move-result v1

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr v1, v2

    div-float/2addr v0, v1

    const v1, 0x3eb33333    # 0.35f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 187
    const/4 v3, 0x0

    .line 190
    :cond_1
    return v3
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 48
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 49
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 50
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    .line 51
    iget v0, v3, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method protected a(Landroid/graphics/Canvas;Lo/mt;I)V
    .locals 15

    .line 204
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_0

    .line 205
    return-void

    .line 208
    :cond_0
    iget-object v0, p0, Lo/elt;->e:Lo/mo;

    invoke-interface/range {p2 .. p2}, Lo/mt;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mo;->b(Lo/lp$b;)Lo/nv;

    move-result-object v7

    .line 209
    iget-object v0, p0, Lo/elt;->b:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 210
    iget-object v0, p0, Lo/elt;->b:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->c()F

    move-result v1

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 213
    iget-object v0, p0, Lo/elt;->c:[Lo/lb;

    aget-object v8, v0, p3

    .line 214
    move/from16 v0, p3

    invoke-virtual {v8, v0}, Lo/lb;->e(I)V

    .line 215
    iget-object v0, p0, Lo/elt;->e:Lo/mo;

    invoke-interface/range {p2 .. p2}, Lo/mt;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mo;->c(Lo/lp$b;)Z

    move-result v0

    invoke-virtual {v8, v0}, Lo/lb;->b(Z)V

    .line 216
    iget-object v0, p0, Lo/elt;->e:Lo/mo;

    invoke-interface {v0}, Lo/mo;->getBarData()Lo/lo;

    move-result-object v0

    invoke-virtual {v0}, Lo/lo;->a()F

    move-result v0

    invoke-virtual {v8, v0}, Lo/lb;->d(F)V

    .line 218
    move-object/from16 v0, p2

    invoke-virtual {v8, v0}, Lo/lb;->e(Lo/mt;)V

    .line 219
    iget-object v0, v8, Lo/lb;->e:[F

    invoke-virtual {v7, v0}, Lo/nv;->e([F)V

    .line 221
    invoke-interface/range {p2 .. p2}, Lo/mt;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    .line 223
    :goto_0
    if-eqz v9, :cond_2

    .line 224
    iget-object v0, p0, Lo/elt;->h:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 226
    :cond_2
    const/4 v10, 0x0

    .line 227
    iget-object v0, v8, Lo/lb;->e:[F

    array-length v0, v0

    if-lez v0, :cond_3

    .line 228
    iget-object v0, v8, Lo/lb;->e:[F

    const/4 v1, 0x1

    aget v10, v0, v1

    .line 230
    :cond_3
    const/4 v11, 0x1

    :goto_1
    invoke-virtual {v8}, Lo/lb;->a()I

    move-result v0

    if-ge v11, v0, :cond_5

    .line 231
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v11

    cmpg-float v0, v0, v10

    if-gez v0, :cond_4

    .line 232
    iget-object v0, v8, Lo/lb;->e:[F

    aget v10, v0, v11

    .line 230
    :cond_4
    add-int/lit8 v11, v11, 0x4

    goto :goto_1

    .line 237
    :cond_5
    iget-boolean v0, p0, Lo/elt;->r:Z

    if-nez v0, :cond_6

    .line 238
    iget v0, p0, Lo/elt;->u:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/elu;->a(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/elt;->v:F

    goto :goto_2

    .line 240
    :cond_6
    iget v0, p0, Lo/elt;->u:F

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v10

    invoke-virtual {p0}, Lo/elt;->a()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    add-float/2addr v1, v2

    mul-float/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v10

    div-float/2addr v0, v1

    iput v0, p0, Lo/elt;->v:F

    .line 242
    :goto_2
    move-object/from16 v0, p1

    invoke-virtual {p0, v0, v7}, Lo/elt;->c(Landroid/graphics/Canvas;Lo/nv;)V

    .line 243
    const/4 v11, 0x0

    .line 244
    iget-object v0, v8, Lo/lb;->e:[F

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_7

    .line 245
    iget-object v0, v8, Lo/lb;->e:[F

    const/4 v1, 0x2

    aget v0, v0, v1

    iget-object v1, v8, Lo/lb;->e:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/elt;->t:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 247
    :cond_7
    const/4 v12, 0x0

    :goto_3
    invoke-virtual {v8}, Lo/lb;->a()I

    move-result v0

    if-ge v12, v0, :cond_f

    .line 249
    iget-object v0, p0, Lo/elt;->l:Lo/oa;

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_8

    .line 250
    goto/16 :goto_6

    .line 252
    :cond_8
    iget-object v0, p0, Lo/elt;->l:Lo/oa;

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v12

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_9

    .line 253
    goto/16 :goto_7

    .line 255
    :cond_9
    if-nez v9, :cond_a

    .line 258
    iget-object v0, p0, Lo/elt;->h:Landroid/graphics/Paint;

    div-int/lit8 v1, v12, 0x4

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Lo/mt;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 260
    :cond_a
    iget-object v0, v8, Lo/lb;->e:[F

    add-int/lit8 v1, v12, 0x1

    aget v0, v0, v1

    cmpl-float v0, v10, v0

    if-nez v0, :cond_d

    iget-boolean v0, p0, Lo/elt;->w:Z

    if-eqz v0, :cond_d

    .line 261
    iget-object v0, p0, Lo/elt;->h:Landroid/graphics/Paint;

    iget v1, p0, Lo/elt;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 262
    iget-object v0, p0, Lo/elt;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/elt;->u:F

    invoke-direct {p0, v1}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v13

    .line 263
    invoke-virtual {p0}, Lo/elt;->d()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 264
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 265
    iget v0, p0, Lo/elt;->u:F

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v12

    add-float/2addr v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v13, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/elt;->t:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x1

    aget v2, v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lo/elt;->p:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 267
    :cond_b
    iget v0, p0, Lo/elt;->u:F

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v12

    add-float/2addr v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v13, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/elt;->t:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    add-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x1

    aget v2, v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lo/elt;->p:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 271
    :cond_c
    iget v0, p0, Lo/elt;->u:F

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v12

    add-float/2addr v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v13, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/elt;->t:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x1

    aget v2, v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lo/elt;->p:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 273
    :goto_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elt;->w:Z

    .line 274
    goto :goto_5

    .line 275
    :cond_d
    iget-object v0, p0, Lo/elt;->h:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 278
    :goto_5
    const/4 v0, 0x2

    new-array v13, v0, [F

    .line 279
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v13, v1

    .line 280
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v13, v1

    .line 281
    invoke-virtual {v7, v13}, Lo/nv;->e([F)V

    .line 283
    const/4 v0, 0x1

    aget v0, v13, v0

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x1

    aget v1, v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x2

    aget v2, v2, v3

    iget-object v3, v8, Lo/lb;->e:[F

    aget v3, v3, v12

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v11

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_e

    .line 284
    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/RectF;

    iget-object v2, v8, Lo/lb;->e:[F

    aget v2, v2, v12

    add-float/2addr v2, v11

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v12, 0x1

    aget v3, v3, v4

    iget-object v4, v8, Lo/lb;->e:[F

    add-int/lit8 v5, v12, 0x2

    aget v4, v4, v5

    sub-float/2addr v4, v11

    iget-object v5, v8, Lo/lb;->e:[F

    add-int/lit8 v6, v12, 0x1

    aget v5, v5, v6

    iget v6, p0, Lo/elt;->t:F

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v5, p0, Lo/elt;->h:Landroid/graphics/Paint;

    const/high16 v2, 0x43340000    # 180.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 286
    move-object/from16 v0, p1

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v12

    add-float/2addr v1, v11

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x1

    aget v2, v2, v3

    iget v3, p0, Lo/elt;->t:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v2, v3

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v12, 0x2

    aget v3, v3, v4

    sub-float/2addr v3, v11

    iget-object v4, v8, Lo/lb;->e:[F

    add-int/lit8 v5, v12, 0x3

    aget v4, v4, v5

    iget-object v5, p0, Lo/elt;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6

    .line 289
    :cond_e
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    .line 290
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v12

    add-float/2addr v0, v11

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x3

    aget v1, v1, v2

    invoke-virtual {v14, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 291
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v12

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v12, 0x1

    aget v1, v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x3

    aget v2, v2, v3

    sub-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v12, 0x2

    aget v2, v2, v3

    sub-float/2addr v2, v11

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v12, 0x3

    aget v3, v3, v4

    invoke-virtual {v14, v0, v1, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 292
    iget-object v0, p0, Lo/elt;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v14, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 247
    :goto_6
    add-int/lit8 v12, v12, 0x4

    goto/16 :goto_3

    .line 296
    :cond_f
    :goto_7
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elt;->w:Z

    .line 297
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 335
    iput-boolean p1, p0, Lo/elt;->x:Z

    .line 336
    return-void
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 2

    .line 63
    iget-object v0, p0, Lo/elt;->z:Lo/mt;

    iget v1, p0, Lo/elt;->B:I

    invoke-virtual {p0, p1, v0, v1}, Lo/elt;->a(Landroid/graphics/Canvas;Lo/mt;I)V

    .line 64
    return-void
.end method

.method public c(Landroid/graphics/Canvas;Lo/nv;)V
    .locals 10

    .line 68
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 69
    const/4 v0, 0x2

    new-array v5, v0, [F

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v5, v1

    .line 73
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 74
    const-string v0, "#1A000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 76
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 79
    new-instance v8, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v8, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 80
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 84
    new-instance v9, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v9, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 85
    const-string v0, "#FF7FBEFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 88
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 90
    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 91
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v6, v0

    .line 94
    :cond_0
    iget v0, p0, Lo/elt;->v:F

    iget v1, p0, Lo/elt;->m:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/elt;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 96
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 97
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 98
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 99
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 100
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 101
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_0

    .line 103
    :cond_1
    iget v0, p0, Lo/elt;->m:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 104
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 105
    iget v0, p0, Lo/elt;->m:F

    iget v1, p0, Lo/elt;->v:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 106
    iget v0, p0, Lo/elt;->m:F

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 110
    :cond_2
    :goto_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/elt;->e(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 111
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 112
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 113
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 114
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 115
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 116
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 117
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_1

    .line 119
    :cond_3
    iget v0, p0, Lo/elt;->m:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 120
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 121
    iget v0, p0, Lo/elt;->m:F

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 124
    :goto_1
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/elt;->e(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 125
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 126
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 127
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 128
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 129
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 130
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 131
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_2

    .line 133
    :cond_4
    iget v0, p0, Lo/elt;->m:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 134
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 135
    iget v0, p0, Lo/elt;->m:F

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 138
    :goto_2
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/elt;->e(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 139
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 140
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 141
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 142
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 143
    invoke-direct {p0}, Lo/elt;->b()F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 144
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 145
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_3

    .line 147
    :cond_5
    iget v0, p0, Lo/elt;->m:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 148
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 149
    iget v0, p0, Lo/elt;->m:F

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 151
    :goto_3
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 152
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 153
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 154
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 155
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/elt;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 156
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 157
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 159
    invoke-direct {p0}, Lo/elt;->c()V

    .line 161
    iget-boolean v0, p0, Lo/elt;->r:Z

    if-nez v0, :cond_7

    .line 162
    iget-object v0, p0, Lo/elt;->y:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 163
    iget-object v0, p0, Lo/elt;->y:[F

    iget v1, p0, Lo/elt;->m:F

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 164
    iget-object v0, p0, Lo/elt;->y:[F

    invoke-virtual {p2, v0}, Lo/nv;->e([F)V

    .line 165
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/elt;->q:Landroid/graphics/Path;

    .line 167
    iget-object v0, p0, Lo/elt;->y:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    .line 168
    iget-object v0, p0, Lo/elt;->q:Landroid/graphics/Path;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 169
    iget-object v0, p0, Lo/elt;->q:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_4

    .line 171
    :cond_6
    iget-object v0, p0, Lo/elt;->q:Landroid/graphics/Path;

    iget-object v1, p0, Lo/elt;->y:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 172
    iget-object v0, p0, Lo/elt;->q:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lo/elt;->y:[F

    const/4 v3, 0x1

    aget v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 175
    :goto_4
    iget-object v0, p0, Lo/elt;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/elt;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 176
    iget-object v0, p0, Lo/elt;->q:Landroid/graphics/Path;

    iget-object v1, p0, Lo/elt;->s:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 177
    iget-object v0, p0, Lo/elt;->q:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 179
    :cond_7
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;Lo/mt;I)V
    .locals 0

    .line 198
    iput-object p2, p0, Lo/elt;->z:Lo/mt;

    .line 199
    iput p3, p0, Lo/elt;->B:I

    .line 200
    return-void
.end method

.method public d()Z
    .locals 1

    .line 331
    iget-boolean v0, p0, Lo/elt;->x:Z

    return v0
.end method

.method public e(Landroid/content/Context;IFFFZ)V
    .locals 0

    .line 322
    iput p2, p0, Lo/elt;->o:I

    .line 323
    iput p3, p0, Lo/elt;->m:F

    .line 324
    iput p4, p0, Lo/elt;->u:F

    .line 325
    iput p5, p0, Lo/elt;->t:F

    .line 327
    iput-boolean p6, p0, Lo/elt;->r:Z

    .line 328
    return-void
.end method
