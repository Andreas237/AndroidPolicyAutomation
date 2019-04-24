.class public Lo/chk;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:[F

.field private b:[I

.field private c:Landroid/graphics/RectF;

.field private d:F

.field private e:F

.field private f:F

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Paint;

.field private i:F

.field private k:F

.field private l:F

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:F

.field private p:Z

.field private q:Z

.field private r:F

.field private t:F

.field private u:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 47
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 24
    const/4 v0, 0x6

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/chk;->a:[F

    .line 25
    iget-object v0, p0, Lo/chk;->a:[F

    iget-object v1, p0, Lo/chk;->a:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->e:F

    .line 26
    iget-object v0, p0, Lo/chk;->a:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->d:F

    .line 27
    const/4 v0, 0x5

    new-array v0, v0, [I

    const-string v1, "#1f8dff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const-string v1, "#75df3e"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    const-string v1, "#e6d420"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    const-string v1, "#f5a623"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    const-string v1, "#ff3320"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    iput-object v0, p0, Lo/chk;->b:[I

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/chk;->k:F

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/chk;->o:F

    .line 35
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chk;->p:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/chk;->q:Z

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chk;->u:Z

    .line 48
    invoke-direct {p0, p1}, Lo/chk;->e(Landroid/content/Context;)V

    .line 49
    return-void

    :array_0
    .array-data 4
        0x0
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40b00000    # 5.5f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    const/4 v0, 0x6

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/chk;->a:[F

    .line 25
    iget-object v0, p0, Lo/chk;->a:[F

    iget-object v1, p0, Lo/chk;->a:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->e:F

    .line 26
    iget-object v0, p0, Lo/chk;->a:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->d:F

    .line 27
    const/4 v0, 0x5

    new-array v0, v0, [I

    const-string v1, "#1f8dff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const-string v1, "#75df3e"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    const-string v1, "#e6d420"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    const-string v1, "#f5a623"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    const-string v1, "#ff3320"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    iput-object v0, p0, Lo/chk;->b:[I

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/chk;->k:F

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/chk;->o:F

    .line 35
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chk;->p:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/chk;->q:Z

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chk;->u:Z

    .line 53
    invoke-direct {p0, p1}, Lo/chk;->e(Landroid/content/Context;)V

    .line 54
    return-void

    :array_0
    .array-data 4
        0x0
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40b00000    # 5.5f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 57
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    const/4 v0, 0x6

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/chk;->a:[F

    .line 25
    iget-object v0, p0, Lo/chk;->a:[F

    iget-object v1, p0, Lo/chk;->a:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->e:F

    .line 26
    iget-object v0, p0, Lo/chk;->a:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->d:F

    .line 27
    const/4 v0, 0x5

    new-array v0, v0, [I

    const-string v1, "#1f8dff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const-string v1, "#75df3e"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    const-string v1, "#e6d420"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    const-string v1, "#f5a623"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    const-string v1, "#ff3320"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    iput-object v0, p0, Lo/chk;->b:[I

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/chk;->k:F

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/chk;->o:F

    .line 35
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chk;->p:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/chk;->q:Z

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chk;->u:Z

    .line 58
    invoke-direct {p0, p1}, Lo/chk;->e(Landroid/content/Context;)V

    .line 59
    return-void

    :array_0
    .array-data 4
        0x0
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40b00000    # 5.5f
    .end array-data
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 16

    .line 178
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 179
    const/4 v13, 0x0

    .line 180
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/chk;->q:Z

    if-eqz v0, :cond_0

    .line 181
    move-object/from16 v0, p0

    iget v0, v0, Lo/chk;->o:F

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/chk;->b(F)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/chk;->e:F

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/chk;->b(F)F

    move-result v1

    sub-float v13, v0, v1

    goto :goto_0

    .line 184
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/chk;->o:F

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/chk;->b(F)F

    move-result v13

    .line 187
    :goto_0
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v13, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/chk;->l:F

    add-float v14, v0, v1

    .line 189
    new-instance v15, Landroid/graphics/Path;

    invoke-direct {v15}, Landroid/graphics/Path;-><init>()V

    .line 190
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v13

    move v3, v14

    move-object v4, v15

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/chk;->m:Ljava/lang/String;

    move-object/from16 v6, p0

    iget v6, v6, Lo/chk;->r:F

    add-float/2addr v6, v14

    move-object/from16 v7, p0

    iget-object v7, v7, Lo/chk;->g:Landroid/graphics/Paint;

    move-object/from16 v8, p0

    iget-object v8, v8, Lo/chk;->g:Landroid/graphics/Paint;

    move-object/from16 v9, p0

    iget-object v9, v9, Lo/chk;->n:Ljava/lang/String;

    .line 191
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    move-object/from16 v9, p0

    const/high16 v10, 0x40000000    # 2.0f

    invoke-virtual {v9, v10}, Lo/chk;->d(F)F

    move-result v9

    add-float/2addr v8, v9

    move-object/from16 v9, p0

    iget v9, v9, Lo/chk;->r:F

    add-float/2addr v9, v14

    move-object/from16 v10, p0

    iget-object v10, v10, Lo/chk;->g:Landroid/graphics/Paint;

    move-object/from16 v11, p0

    invoke-direct {v11, v10}, Lo/chk;->e(Landroid/graphics/Paint;)F

    move-result v10

    add-float/2addr v9, v10

    move-object/from16 v10, p0

    iget-object v10, v10, Lo/chk;->c:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->right:F

    move-object/from16 v11, p0

    iget-object v11, v11, Lo/chk;->g:Landroid/graphics/Paint;

    move-object/from16 v12, p0

    iget-object v12, v12, Lo/chk;->n:Ljava/lang/String;

    invoke-virtual {v11, v12}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v11

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    sub-float/2addr v10, v11

    .line 190
    const/4 v11, 0x1

    invoke-direct/range {v0 .. v11}, Lo/chk;->b(Landroid/graphics/Canvas;FFLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;FFFZ)V

    .line 193
    return-void
.end method

.method private a(Landroid/graphics/Canvas;[I)V
    .locals 10

    .line 250
    const/4 v6, 0x0

    .line 251
    const/4 v7, 0x0

    .line 252
    iget-boolean v0, p0, Lo/chk;->q:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/chk;->u:Z

    if-eqz v0, :cond_0

    .line 253
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/chk;->u:Z

    .line 254
    iget-object v0, p0, Lo/chk;->a:[F

    invoke-direct {p0, v0}, Lo/chk;->c([F)[F

    move-result-object v0

    iput-object v0, p0, Lo/chk;->a:[F

    .line 255
    iget-object v0, p0, Lo/chk;->a:[F

    iget-object v1, p0, Lo/chk;->a:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->d:F

    .line 256
    iget-object v0, p0, Lo/chk;->a:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->e:F

    .line 258
    :cond_0
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/chk;->a:[F

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ge v8, v0, :cond_4

    .line 259
    array-length v0, p2

    if-le v0, v8, :cond_3

    .line 260
    iget-object v0, p0, Lo/chk;->h:Landroid/graphics/Paint;

    aget v1, p2, v8

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 261
    iget-object v0, p0, Lo/chk;->a:[F

    add-int/lit8 v1, v8, 0x1

    aget v0, v0, v1

    iget-object v1, p0, Lo/chk;->a:[F

    aget v1, v1, v8

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/chk;->a:[F

    iget-object v2, p0, Lo/chk;->a:[F

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    iget-object v2, p0, Lo/chk;->a:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    mul-float v7, v0, v1

    .line 262
    if-nez v8, :cond_1

    .line 263
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 264
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    add-float/2addr v3, v7

    iget-object v4, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/16 v1, 0x8

    new-array v1, v1, [F

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x0

    aput v2, v1, v3

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x1

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x2

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x3

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x4

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x5

    aput v2, v1, v3

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x6

    aput v2, v1, v3

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x7

    aput v2, v1, v3

    sget-object v2, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v0, v1, v2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 266
    iget-object v0, p0, Lo/chk;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 267
    iget-object v0, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v7

    iget v1, p0, Lo/chk;->i:F

    add-float v6, v0, v1

    .line 268
    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lo/chk;->a:[F

    array-length v0, v0

    add-int/lit8 v0, v0, -0x2

    if-ne v8, v0, :cond_2

    .line 270
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 271
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    add-float v2, v6, v7

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v6, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x2

    aput v2, v1, v3

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x3

    aput v2, v1, v3

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x4

    aput v2, v1, v3

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v3, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v3, 0x5

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x6

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x7

    aput v2, v1, v3

    sget-object v2, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v0, v1, v2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 273
    iget-object v0, p0, Lo/chk;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 274
    const/4 v6, 0x0

    .line 275
    goto :goto_1

    .line 276
    :cond_2
    move-object v0, p1

    move v1, v6

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float v3, v6, v7

    iget-object v4, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v5, p0, Lo/chk;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 277
    iget v0, p0, Lo/chk;->i:F

    add-float/2addr v0, v7

    add-float/2addr v6, v0

    .line 258
    :cond_3
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 281
    :cond_4
    return-void
.end method

.method private b(F)F
    .locals 5

    .line 284
    iget-object v0, p0, Lo/chk;->a:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    sub-float v0, p1, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/chk;->a:[F

    iget-object v2, p0, Lo/chk;->a:[F

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    iget-object v2, p0, Lo/chk;->a:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v2, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/chk;->i:F

    iget-object v3, p0, Lo/chk;->a:[F

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    mul-float/2addr v0, v1

    return v0
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 2

    .line 141
    iget v0, p0, Lo/chk;->k:F

    iget v1, p0, Lo/chk;->e:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lo/chk;->e:F

    const/high16 v1, 0x41200000    # 10.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 142
    iget v0, p0, Lo/chk;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chk;->k:F

    .line 144
    :cond_0
    iget v0, p0, Lo/chk;->k:F

    iget v1, p0, Lo/chk;->d:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    iget v0, p0, Lo/chk;->d:F

    const/high16 v1, 0x41200000    # 10.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 145
    iget v0, p0, Lo/chk;->d:F

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    iput v0, p0, Lo/chk;->k:F

    .line 147
    :cond_1
    iget v0, p0, Lo/chk;->k:F

    iget v1, p0, Lo/chk;->d:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    iget v0, p0, Lo/chk;->d:F

    goto :goto_0

    :cond_2
    iget v0, p0, Lo/chk;->k:F

    iget v1, p0, Lo/chk;->e:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    iget v0, p0, Lo/chk;->e:F

    goto :goto_0

    :cond_3
    iget v0, p0, Lo/chk;->k:F

    :goto_0
    iput v0, p0, Lo/chk;->k:F

    .line 148
    iget v0, p0, Lo/chk;->o:F

    iget v1, p0, Lo/chk;->d:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    iget v0, p0, Lo/chk;->d:F

    goto :goto_1

    :cond_4
    iget v0, p0, Lo/chk;->o:F

    iget v1, p0, Lo/chk;->e:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    iget v0, p0, Lo/chk;->e:F

    goto :goto_1

    :cond_5
    iget v0, p0, Lo/chk;->o:F

    :goto_1
    iput v0, p0, Lo/chk;->o:F

    .line 151
    invoke-direct {p0, p1}, Lo/chk;->e(Landroid/graphics/Canvas;)V

    .line 153
    iget-boolean v0, p0, Lo/chk;->p:Z

    if-eqz v0, :cond_6

    .line 154
    invoke-direct {p0, p1}, Lo/chk;->a(Landroid/graphics/Canvas;)V

    .line 156
    :cond_6
    return-void
.end method

.method private b(Landroid/graphics/Canvas;FFLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;FFFZ)V
    .locals 11

    .line 199
    move-object/from16 v0, p7

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    .line 200
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p11

    invoke-direct/range {v0 .. v10}, Lo/chk;->e(Landroid/graphics/Canvas;FFLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;FFZ)V

    goto :goto_0

    .line 202
    :cond_0
    iget-object v0, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v1, p7

    move-object/from16 v2, p5

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_1

    .line 203
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p9

    iget v9, p0, Lo/chk;->r:F

    add-float v9, v9, p10

    move/from16 v10, p11

    invoke-direct/range {v0 .. v10}, Lo/chk;->d(Landroid/graphics/Canvas;FFLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;FFZ)V

    goto :goto_0

    .line 205
    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object v3, p4

    move-object/from16 v4, p5

    move/from16 v5, p6

    move-object/from16 v6, p7

    move/from16 v7, p9

    invoke-direct/range {v0 .. v7}, Lo/chk;->e(Landroid/graphics/Canvas;FLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;F)V

    .line 207
    :goto_0
    return-void
.end method

.method private b(Landroid/graphics/Canvas;FLandroid/graphics/Path;FFFFLandroid/graphics/Paint;)V
    .locals 0

    .line 241
    invoke-virtual {p3, p4, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 242
    invoke-virtual {p3, p5, p6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 243
    invoke-virtual {p3, p7, p6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 244
    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    .line 245
    invoke-virtual {p1, p3, p8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 246
    return-void
.end method

.method private b([I)[I
    .locals 4

    .line 111
    array-length v0, p1

    new-array v2, v0, [I

    .line 112
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_0

    .line 114
    array-length v0, p1

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, -0x1

    aget v0, p1, v0

    aput v0, v2, v3

    .line 112
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 116
    :cond_0
    return-object v2
.end method

.method private c([F)[F
    .locals 4

    .line 120
    array-length v0, p1

    new-array v2, v0, [F

    .line 121
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_0

    .line 123
    array-length v0, p1

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, -0x1

    aget v0, p1, v0

    aput v0, v2, v3

    .line 121
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 125
    :cond_0
    return-object v2
.end method

.method private d(Landroid/graphics/Canvas;FFLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;FFZ)V
    .locals 10

    .line 216
    if-eqz p10, :cond_0

    .line 217
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 218
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object v3, p4

    move/from16 v4, p9

    iget v5, p0, Lo/chk;->l:F

    sub-float v5, p9, v5

    move/from16 v6, p6

    iget v7, p0, Lo/chk;->l:F

    add-float v7, v7, p9

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lo/chk;->b(Landroid/graphics/Canvas;FLandroid/graphics/Path;FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 220
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 221
    move-object/from16 v0, p7

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v9, v0, v1

    .line 222
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object v3, p4

    add-float v4, p9, v9

    iget v5, p0, Lo/chk;->r:F

    sub-float/2addr v4, v5

    add-float v5, p9, v9

    iget v6, p0, Lo/chk;->t:F

    sub-float/2addr v5, v6

    move/from16 v6, p6

    add-float v7, p9, v9

    iget v8, p0, Lo/chk;->l:F

    sub-float/2addr v7, v8

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lo/chk;->b(Landroid/graphics/Canvas;FLandroid/graphics/Path;FFFFLandroid/graphics/Paint;)V

    .line 224
    :goto_0
    move/from16 v0, p9

    move/from16 v1, p8

    move-object/from16 v2, p7

    invoke-virtual {p1, p5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 226
    return-void
.end method

.method private e(Landroid/graphics/Paint;)F
    .locals 1

    .line 318
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v0, v0

    return v0
.end method

.method private e(Landroid/content/Context;)V
    .locals 5

    .line 62
    new-instance v0, Landroid/graphics/RectF;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/chk;->c:Landroid/graphics/RectF;

    .line 63
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chk;->g:Landroid/graphics/Paint;

    .line 64
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chk;->h:Landroid/graphics/Paint;

    .line 65
    iget-object v0, p0, Lo/chk;->g:Landroid/graphics/Paint;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-virtual {p0, v1}, Lo/chk;->a(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 66
    iget-object v0, p0, Lo/chk;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 67
    iget-object v0, p0, Lo/chk;->g:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/chk;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->common_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-virtual {p0, v0}, Lo/chk;->d(F)F

    move-result v0

    iput v0, p0, Lo/chk;->f:F

    .line 69
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p0, v0}, Lo/chk;->d(F)F

    move-result v0

    iput v0, p0, Lo/chk;->l:F

    .line 70
    const/high16 v0, 0x40800000    # 4.0f

    invoke-virtual {p0, v0}, Lo/chk;->d(F)F

    move-result v0

    iput v0, p0, Lo/chk;->r:F

    .line 71
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-virtual {p0, v0}, Lo/chk;->d(F)F

    move-result v0

    iput v0, p0, Lo/chk;->t:F

    .line 74
    invoke-virtual {p0}, Lo/chk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_current:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/chk;->n:Ljava/lang/String;

    .line 75
    invoke-virtual {p0}, Lo/chk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_average:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/chk;->m:Ljava/lang/String;

    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chk;->u:Z

    .line 77
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 16

    .line 159
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 160
    const/4 v13, 0x0

    .line 161
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/chk;->q:Z

    if-eqz v0, :cond_0

    .line 162
    move-object/from16 v0, p0

    iget v0, v0, Lo/chk;->k:F

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/chk;->b(F)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/chk;->e:F

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/chk;->b(F)F

    move-result v1

    sub-float v13, v0, v1

    goto :goto_0

    .line 164
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/chk;->k:F

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/chk;->b(F)F

    move-result v13

    .line 167
    :goto_0
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v13, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/chk;->l:F

    sub-float v14, v0, v1

    .line 169
    new-instance v15, Landroid/graphics/Path;

    invoke-direct {v15}, Landroid/graphics/Path;-><init>()V

    .line 171
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v13

    move v3, v14

    move-object v4, v15

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/chk;->n:Ljava/lang/String;

    move-object/from16 v6, p0

    iget v6, v6, Lo/chk;->r:F

    sub-float v6, v14, v6

    move-object/from16 v7, p0

    iget-object v7, v7, Lo/chk;->g:Landroid/graphics/Paint;

    move-object/from16 v8, p0

    iget-object v8, v8, Lo/chk;->g:Landroid/graphics/Paint;

    move-object/from16 v9, p0

    iget-object v9, v9, Lo/chk;->n:Ljava/lang/String;

    .line 172
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    move-object/from16 v9, p0

    iget v9, v9, Lo/chk;->r:F

    sub-float v9, v14, v9

    move-object/from16 v10, p0

    iget-object v10, v10, Lo/chk;->g:Landroid/graphics/Paint;

    invoke-virtual {v10}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v10

    iget v10, v10, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr v9, v10

    move-object/from16 v10, p0

    iget-object v10, v10, Lo/chk;->c:Landroid/graphics/RectF;

    iget v10, v10, Landroid/graphics/RectF;->right:F

    move-object/from16 v11, p0

    iget-object v11, v11, Lo/chk;->g:Landroid/graphics/Paint;

    move-object/from16 v12, p0

    iget-object v12, v12, Lo/chk;->n:Ljava/lang/String;

    invoke-virtual {v11, v12}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v11

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    sub-float/2addr v10, v11

    .line 171
    const/4 v11, 0x0

    invoke-direct/range {v0 .. v11}, Lo/chk;->b(Landroid/graphics/Canvas;FFLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;FFFZ)V

    .line 174
    return-void
.end method

.method private e(Landroid/graphics/Canvas;FFLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;FFZ)V
    .locals 9

    .line 229
    if-eqz p10, :cond_0

    .line 230
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 231
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object v3, p4

    move/from16 v4, p8

    iget v5, p0, Lo/chk;->l:F

    add-float v5, v5, p8

    move v6, p6

    iget v7, p0, Lo/chk;->l:F

    sub-float v7, p8, v7

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lo/chk;->b(Landroid/graphics/Canvas;FLandroid/graphics/Path;FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 234
    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move-object v3, p4

    iget-object v4, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->left:F

    const/high16 v5, 0x40a00000    # 5.0f

    invoke-virtual {p0, v5}, Lo/chk;->d(F)F

    move-result v5

    add-float/2addr v4, v5

    iget-object v5, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    const/high16 v6, 0x40400000    # 3.0f

    invoke-virtual {p0, v6}, Lo/chk;->d(F)F

    move-result v6

    add-float/2addr v5, v6

    move v6, p6

    iget-object v7, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->left:F

    const/high16 v8, 0x40e00000    # 7.0f

    invoke-virtual {p0, v8}, Lo/chk;->d(F)F

    move-result v8

    add-float/2addr v7, v8

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lo/chk;->b(Landroid/graphics/Canvas;FLandroid/graphics/Path;FFFFLandroid/graphics/Paint;)V

    .line 235
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 237
    :goto_0
    move/from16 v0, p8

    move/from16 v1, p9

    move-object/from16 v2, p7

    invoke-virtual {p1, p5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 238
    return-void
.end method

.method private e(Landroid/graphics/Canvas;FLandroid/graphics/Path;Ljava/lang/String;FLandroid/graphics/Paint;F)V
    .locals 9

    .line 210
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    iget-object v4, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->left:F

    const/high16 v5, 0x40000000    # 2.0f

    sub-float/2addr v4, v5

    iget-object v5, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    iget v6, p0, Lo/chk;->l:F

    sub-float/2addr v5, v6

    const/high16 v6, 0x40000000    # 2.0f

    sub-float/2addr v5, v6

    move v6, p5

    iget-object v7, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->left:F

    iget v8, p0, Lo/chk;->l:F

    add-float/2addr v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    sub-float/2addr v7, v8

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lo/chk;->b(Landroid/graphics/Canvas;FLandroid/graphics/Path;FFFFLandroid/graphics/Paint;)V

    .line 211
    iget-object v0, p0, Lo/chk;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget v1, p0, Lo/chk;->l:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    move/from16 v1, p7

    invoke-virtual {p1, p4, v0, v1, p6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 212
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 213
    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 2

    .line 313
    invoke-virtual {p0}, Lo/chk;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 314
    const/4 v0, 0x2

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method public a(I)Lo/chk;
    .locals 1

    .line 337
    int-to-float v0, p1

    iput v0, p0, Lo/chk;->f:F

    .line 338
    return-object p0
.end method

.method public a(Z)Lo/chk;
    .locals 0

    .line 347
    iput-boolean p1, p0, Lo/chk;->q:Z

    .line 348
    invoke-virtual {p0}, Lo/chk;->invalidate()V

    .line 349
    return-object p0
.end method

.method public c(F)Lo/chk;
    .locals 0

    .line 322
    iput p1, p0, Lo/chk;->k:F

    .line 323
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lo/chk;
    .locals 0

    .line 353
    if-eqz p1, :cond_0

    .line 354
    iput-object p1, p0, Lo/chk;->n:Ljava/lang/String;

    .line 356
    :cond_0
    return-object p0
.end method

.method public varargs c([I)Lo/chk;
    .locals 0
    .param p1    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 303
    iput-object p1, p0, Lo/chk;->b:[I

    .line 304
    return-object p0
.end method

.method public varargs c([Ljava/lang/Integer;)Lo/chk;
    .locals 4
    .param p1    # [Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 293
    array-length v0, p1

    new-array v0, v0, [F

    iput-object v0, p0, Lo/chk;->a:[F

    .line 294
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_0

    .line 295
    iget-object v0, p0, Lo/chk;->a:[F

    aget-object v1, p1, v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    aput v1, v0, v3

    .line 294
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 297
    :cond_0
    iget-object v0, p0, Lo/chk;->a:[F

    iget-object v1, p0, Lo/chk;->a:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->e:F

    .line 298
    iget-object v0, p0, Lo/chk;->a:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lo/chk;->d:F

    .line 299
    return-object p0
.end method

.method public d(F)F
    .locals 2

    .line 308
    invoke-virtual {p0}, Lo/chk;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 309
    const/4 v0, 0x1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method public d(I)Lo/chk;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/chk;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 343
    return-object p0
.end method

.method public d(Z)Lo/chk;
    .locals 0

    .line 332
    iput-boolean p1, p0, Lo/chk;->p:Z

    .line 333
    return-object p0
.end method

.method public e(F)Lo/chk;
    .locals 0

    .line 327
    iput p1, p0, Lo/chk;->o:F

    .line 328
    return-object p0
.end method

.method public varargs e([F)Lo/chk;
    .locals 0
    .param p1    # [F
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 288
    iput-object p1, p0, Lo/chk;->a:[F

    .line 289
    return-object p0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 86
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 87
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 130
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 132
    iget-boolean v0, p0, Lo/chk;->q:Z

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/chk;->b:[I

    invoke-direct {p0, v0}, Lo/chk;->b([I)[I

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/chk;->a(Landroid/graphics/Canvas;[I)V

    goto :goto_0

    .line 135
    :cond_0
    iget-object v0, p0, Lo/chk;->b:[I

    invoke-direct {p0, p1, v0}, Lo/chk;->a(Landroid/graphics/Canvas;[I)V

    .line 137
    :goto_0
    invoke-direct {p0, p1}, Lo/chk;->b(Landroid/graphics/Canvas;)V

    .line 138
    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 81
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 82
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 101
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 102
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 103
    iget v0, p0, Lo/chk;->f:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/chk;->g:Landroid/graphics/Paint;

    invoke-direct {p0, v1}, Lo/chk;->e(Landroid/graphics/Paint;)F

    move-result v1

    iget v2, p0, Lo/chk;->t:F

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lo/chk;->r:F

    add-float v4, v0, v1

    .line 104
    iget-boolean v0, p0, Lo/chk;->p:Z

    if-nez v0, :cond_1

    .line 105
    iget-object v0, p0, Lo/chk;->g:Landroid/graphics/Paint;

    invoke-direct {p0, v0}, Lo/chk;->e(Landroid/graphics/Paint;)F

    move-result v0

    iget v1, p0, Lo/chk;->f:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lo/chk;->t:F

    :goto_0
    add-float/2addr v0, v1

    sub-float/2addr v4, v0

    .line 107
    :cond_1
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p0, v3, v0}, Lo/chk;->setMeasuredDimension(II)V

    .line 108
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 7

    .line 91
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 92
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/chk;->d(F)F

    move-result v0

    iput v0, p0, Lo/chk;->i:F

    .line 94
    iget-object v0, p0, Lo/chk;->c:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lo/chk;->getPaddingStart()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lo/chk;->f:F

    iget-object v3, p0, Lo/chk;->g:Landroid/graphics/Paint;

    invoke-direct {p0, v3}, Lo/chk;->e(Landroid/graphics/Paint;)F

    move-result v3

    add-float/2addr v2, v3

    iget v3, p0, Lo/chk;->r:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    int-to-float v3, p1

    iget v4, p0, Lo/chk;->i:F

    iget-object v5, p0, Lo/chk;->a:[F

    array-length v5, v5

    add-int/lit8 v5, v5, -0x2

    int-to-float v5, v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    .line 95
    invoke-virtual {p0}, Lo/chk;->getPaddingEnd()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget v4, p0, Lo/chk;->f:F

    iget-object v5, p0, Lo/chk;->g:Landroid/graphics/Paint;

    .line 96
    invoke-direct {p0, v5}, Lo/chk;->e(Landroid/graphics/Paint;)F

    move-result v5

    add-float/2addr v4, v5

    iget v5, p0, Lo/chk;->r:F

    const/high16 v6, 0x40400000    # 3.0f

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    .line 94
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 97
    return-void
.end method
