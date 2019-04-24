.class public Lo/byj;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/graphics/Paint;

.field private e:[Ljava/lang/String;

.field private f:I

.field private g:F

.field private h:I

.field private i:I

.field private k:I

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:[I

.field private s:[I

.field private t:[[I

.field private u:[[I

.field private x:Z

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 71
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u65e5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "\u4e00"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "\u4e8c"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "\u4e09"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "\u56db"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "\u4e94"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "\u516d"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/byj;->e:[Ljava/lang/String;

    .line 34
    const v0, -0x49ade

    iput v0, p0, Lo/byj;->c:I

    .line 35
    const v0, 0x19fb6522

    iput v0, p0, Lo/byj;->b:I

    .line 39
    const/4 v0, -0x1

    iput v0, p0, Lo/byj;->f:I

    .line 41
    const/high16 v0, -0x1000000

    iput v0, p0, Lo/byj;->i:I

    .line 43
    const/high16 v0, 0x4c000000    # 3.3554432E7f

    iput v0, p0, Lo/byj;->k:I

    .line 45
    const/high16 v0, 0x4c000000    # 3.3554432E7f

    iput v0, p0, Lo/byj;->h:I

    .line 57
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lo/byj;->t:[[I

    .line 58
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lo/byj;->u:[[I

    .line 60
    const/4 v0, 0x7

    new-array v0, v0, [I

    iput-object v0, p0, Lo/byj;->s:[I

    .line 61
    const/4 v0, 0x7

    new-array v0, v0, [I

    iput-object v0, p0, Lo/byj;->r:[I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lo/byj;->z:I

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/byj;->x:Z

    .line 72
    invoke-direct {p0, p1, p2}, Lo/byj;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 73
    invoke-direct {p0, p1}, Lo/byj;->a(Landroid/content/Context;)V

    .line 74
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 77
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u65e5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "\u4e00"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "\u4e8c"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "\u4e09"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "\u56db"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "\u4e94"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "\u516d"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/byj;->e:[Ljava/lang/String;

    .line 34
    const v0, -0x49ade

    iput v0, p0, Lo/byj;->c:I

    .line 35
    const v0, 0x19fb6522

    iput v0, p0, Lo/byj;->b:I

    .line 39
    const/4 v0, -0x1

    iput v0, p0, Lo/byj;->f:I

    .line 41
    const/high16 v0, -0x1000000

    iput v0, p0, Lo/byj;->i:I

    .line 43
    const/high16 v0, 0x4c000000    # 3.3554432E7f

    iput v0, p0, Lo/byj;->k:I

    .line 45
    const/high16 v0, 0x4c000000    # 3.3554432E7f

    iput v0, p0, Lo/byj;->h:I

    .line 57
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lo/byj;->t:[[I

    .line 58
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lo/byj;->u:[[I

    .line 60
    const/4 v0, 0x7

    new-array v0, v0, [I

    iput-object v0, p0, Lo/byj;->s:[I

    .line 61
    const/4 v0, 0x7

    new-array v0, v0, [I

    iput-object v0, p0, Lo/byj;->r:[I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lo/byj;->z:I

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/byj;->x:Z

    .line 78
    invoke-direct {p0, p1, p2}, Lo/byj;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 79
    invoke-direct {p0, p1}, Lo/byj;->a(Landroid/content/Context;)V

    .line 80
    return-void
.end method

.method private a(FFIILandroid/graphics/Canvas;)V
    .locals 5

    .line 326
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 327
    iget v0, p0, Lo/byj;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/byj;->q:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float v3, v0, v1

    .line 328
    const/high16 v0, 0x40800000    # 4.0f

    div-float v0, v3, v0

    sub-float/2addr p1, v0

    .line 329
    iget v0, p0, Lo/byj;->q:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float/2addr p2, v0

    .line 330
    new-instance v4, Landroid/graphics/RectF;

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v3, v0

    mul-int/lit8 v1, p4, 0x2

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    add-float/2addr v0, p1

    iget v1, p0, Lo/byj;->q:F

    add-float/2addr v1, p2

    invoke-direct {v4, p1, p2, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 331
    iget v0, p0, Lo/byj;->q:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/byj;->q:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget-object v2, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {p5, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 332
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .line 123
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    .line 124
    invoke-direct {p0}, Lo/byj;->b()V

    .line 125
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 83
    sget-object v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 84
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_today_color:I

    iget v1, p0, Lo/byj;->f:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/byj;->f:I

    .line 85
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_day_color:I

    iget v1, p0, Lo/byj;->i:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/byj;->i:I

    .line 87
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_day_other_color:I

    iget v1, p0, Lo/byj;->k:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/byj;->k:I

    .line 88
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_week_color:I

    iget v1, p0, Lo/byj;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/byj;->h:I

    .line 90
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_today_size:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/byj;->g:F

    .line 91
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_day_size:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/byj;->m:F

    .line 92
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_day_other_size:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/byj;->o:F

    .line 93
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_week_size:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/byj;->p:F

    .line 96
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_line_week_size:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/byj;->l:F

    .line 97
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_line_day_size:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/byj;->n:F

    .line 99
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_text_day_high:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/byj;->q:F

    .line 100
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->fit_calendar_card_type_week:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/byj;->x:Z

    .line 102
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 104
    return-void
.end method

.method private b(Landroid/graphics/Paint;Ljava/lang/String;)F
    .locals 8

    .line 288
    const/4 v4, 0x0

    .line 289
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 290
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    .line 291
    new-array v6, v5, [F

    .line 292
    invoke-virtual {p1, p2, v6}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 293
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_0

    .line 294
    float-to-double v0, v4

    aget v2, v6, v7

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v4, v0

    .line 293
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 297
    :cond_0
    return v4
.end method

.method private b(I)I
    .locals 6

    .line 347
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 349
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 352
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v3, v0, :cond_0

    .line 353
    move v2, v4

    goto :goto_0

    .line 356
    :cond_0
    invoke-virtual {p0}, Lo/byj;->getPaddingLeft()I

    move-result v0

    add-int/2addr v0, v4

    invoke-virtual {p0}, Lo/byj;->getPaddingRight()I

    move-result v1

    add-int v5, v0, v1

    .line 357
    const/high16 v0, -0x80000000

    if-ne v3, v0, :cond_1

    .line 358
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_0

    .line 360
    :cond_1
    move v2, v5

    .line 363
    :goto_0
    iput v2, p0, Lo/byj;->a:I

    .line 364
    return v2
.end method

.method private b()V
    .locals 6

    .line 109
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 110
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 111
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 112
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 113
    iput v5, p0, Lo/byj;->z:I

    .line 114
    iget-boolean v0, p0, Lo/byj;->x:Z

    if-eqz v0, :cond_0

    .line 115
    iget v0, p0, Lo/byj;->z:I

    invoke-static {v3, v4, v0}, Lo/bzt;->b(III)[I

    move-result-object v0

    iput-object v0, p0, Lo/byj;->s:[I

    goto :goto_0

    .line 117
    :cond_0
    invoke-static {v3, v4}, Lo/bzt;->c(II)[[I

    move-result-object v0

    iput-object v0, p0, Lo/byj;->t:[[I

    .line 119
    :goto_0
    return-void
.end method

.method private c(I)I
    .locals 6

    .line 370
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 372
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 375
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v3, v0, :cond_0

    .line 376
    move v2, v4

    goto :goto_0

    .line 379
    :cond_0
    invoke-virtual {p0}, Lo/byj;->getPaddingTop()I

    move-result v0

    add-int/2addr v0, v4

    invoke-virtual {p0}, Lo/byj;->getPaddingBottom()I

    move-result v1

    add-int v5, v0, v1

    .line 380
    const/high16 v0, -0x80000000

    if-ne v3, v0, :cond_1

    .line 381
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_0

    .line 383
    :cond_1
    move v2, v5

    .line 386
    :goto_0
    return v2
.end method

.method private c(FFIFLandroid/graphics/Canvas;)V
    .locals 2

    .line 321
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 322
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p4, v0

    iget-object v1, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {p5, p1, p2, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 323
    return-void
.end method

.method private c(Ljava/lang/String;FIFFLandroid/graphics/Canvas;)V
    .locals 7

    .line 264
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 265
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 266
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 268
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-direct {p0, v0, p1}, Lo/byj;->b(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v3

    .line 269
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v3, v0

    sub-float v4, p4, v0

    .line 271
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 272
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 275
    move v6, p5

    .line 276
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {p6, p1, v4, v6, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 278
    return-void
.end method

.method private d(Landroid/graphics/Canvas;F)V
    .locals 17

    .line 218
    move-object/from16 v0, p0

    iget v0, v0, Lo/byj;->l:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/byj;->q:F

    add-float/2addr v0, v1

    add-float p2, p2, v0

    .line 220
    move-object/from16 v0, p0

    iget v8, v0, Lo/byj;->k:I

    .line 221
    move-object/from16 v0, p0

    iget v9, v0, Lo/byj;->o:F

    .line 223
    const/4 v10, 0x1

    .line 224
    const/4 v11, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byj;->t:[[I

    array-length v0, v0

    if-ge v11, v0, :cond_6

    .line 225
    const/4 v12, 0x0

    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byj;->t:[[I

    const/4 v1, 0x0

    aget-object v0, v0, v1

    array-length v0, v0

    if-ge v12, v0, :cond_4

    .line 226
    int-to-float v0, v12

    move-object/from16 v1, p0

    iget v1, v1, Lo/byj;->a:I

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/byj;->q:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/byj;->q:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v7, v0, v1

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byj;->t:[[I

    aget-object v0, v0, v11

    aget v13, v0, v12

    .line 228
    const/4 v0, 0x0

    if-eq v0, v13, :cond_3

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 231
    const/4 v0, 0x1

    if-ne v13, v0, :cond_1

    .line 232
    if-eqz v10, :cond_0

    .line 233
    move-object/from16 v0, p0

    iget v8, v0, Lo/byj;->i:I

    .line 234
    move-object/from16 v0, p0

    iget v9, v0, Lo/byj;->m:F

    goto :goto_2

    .line 236
    :cond_0
    move-object/from16 v0, p0

    iget v8, v0, Lo/byj;->k:I

    .line 237
    move-object/from16 v0, p0

    iget v9, v0, Lo/byj;->o:F

    .line 239
    :goto_2
    const/4 v10, 0x0

    .line 242
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/byj;->z:I

    if-ne v13, v0, :cond_2

    move-object/from16 v0, p0

    iget v0, v0, Lo/byj;->k:I

    if-eq v8, v0, :cond_2

    .line 243
    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v14, v2, v1, v15}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 245
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float v16, p2, v0

    .line 246
    move-object/from16 v0, p0

    move v1, v7

    move/from16 v2, v16

    move-object/from16 v3, p0

    iget v3, v3, Lo/byj;->c:I

    move-object/from16 v4, p0

    iget v4, v4, Lo/byj;->q:F

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/byj;->c(FFIFLandroid/graphics/Canvas;)V

    .line 247
    move-object/from16 v0, p0

    move-object v1, v14

    move-object/from16 v2, p0

    iget v2, v2, Lo/byj;->g:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/byj;->f:I

    move v4, v7

    move/from16 v5, p2

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Lo/byj;->c(Ljava/lang/String;FIFFLandroid/graphics/Canvas;)V

    .line 248
    goto :goto_3

    .line 249
    :cond_2
    move-object/from16 v0, p0

    move-object v1, v14

    move v2, v9

    move v3, v8

    move v4, v7

    move/from16 v5, p2

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Lo/byj;->c(Ljava/lang/String;FIFFLandroid/graphics/Canvas;)V

    .line 225
    :cond_3
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 254
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byj;->u:[[I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byj;->u:[[I

    array-length v0, v0

    if-le v0, v11, :cond_5

    .line 255
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/byj;->u:[[I

    aget-object v0, v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    invoke-direct {v1, v2, v0, v3}, Lo/byj;->d(Landroid/graphics/Canvas;[IF)V

    .line 257
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/byj;->q:F

    add-float v0, v0, p2

    move-object/from16 v1, p0

    iget v1, v1, Lo/byj;->n:F

    add-float p2, v0, v1

    .line 224
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 259
    :cond_6
    return-void
.end method

.method private d(Landroid/graphics/Canvas;[IF)V
    .locals 15

    .line 179
    if-eqz p2, :cond_4

    move-object/from16 v0, p2

    array-length v0, v0

    if-lez v0, :cond_4

    .line 181
    const/4 v7, 0x0

    .line 182
    const/4 v8, 0x0

    .line 183
    const/4 v9, 0x0

    .line 184
    const/4 v10, 0x0

    :goto_0
    move-object/from16 v0, p2

    array-length v0, v0

    if-ge v10, v0, :cond_3

    .line 185
    aget v11, p2, v10

    .line 186
    if-eqz v11, :cond_1

    .line 187
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 188
    move v8, v11

    .line 189
    move v9, v10

    .line 191
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 193
    :cond_1
    if-eqz v7, :cond_2

    .line 194
    int-to-float v0, v9

    iget v1, p0, Lo/byj;->a:I

    int-to-float v1, v1

    iget v2, p0, Lo/byj;->q:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/byj;->q:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v6, v0, v1

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 196
    new-instance v13, Landroid/graphics/Rect;

    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 197
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v12, v2, v1, v13}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 198
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float v14, p3, v0

    .line 199
    move-object v0, p0

    move v1, v6

    move v2, v14

    iget v3, p0, Lo/byj;->b:I

    move v4, v7

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/byj;->a(FFIILandroid/graphics/Canvas;)V

    .line 201
    :cond_2
    const/4 v7, 0x0

    .line 202
    const/4 v8, 0x0

    .line 184
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 205
    :cond_3
    if-eqz v7, :cond_4

    .line 206
    int-to-float v0, v9

    iget v1, p0, Lo/byj;->a:I

    int-to-float v1, v1

    iget v2, p0, Lo/byj;->q:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/byj;->q:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v6, v0, v1

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 208
    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 209
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v2, v1, v11}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 210
    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float v12, p3, v0

    .line 211
    move-object v0, p0

    move v1, v6

    move v2, v12

    iget v3, p0, Lo/byj;->b:I

    move v4, v7

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/byj;->a(FFIILandroid/graphics/Canvas;)V

    .line 214
    :cond_4
    return-void
.end method

.method private e(Landroid/graphics/Canvas;F)V
    .locals 15

    .line 156
    iget v0, p0, Lo/byj;->l:F

    iget v1, p0, Lo/byj;->q:F

    add-float/2addr v0, v1

    add-float p2, p2, v0

    .line 158
    iget v8, p0, Lo/byj;->i:I

    .line 159
    iget v9, p0, Lo/byj;->m:F

    .line 160
    const/4 v10, 0x0

    :goto_0
    iget-object v0, p0, Lo/byj;->s:[I

    array-length v0, v0

    if-ge v10, v0, :cond_1

    .line 161
    iget-object v0, p0, Lo/byj;->s:[I

    aget v11, v0, v10

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 163
    int-to-float v0, v10

    iget v1, p0, Lo/byj;->a:I

    int-to-float v1, v1

    iget v2, p0, Lo/byj;->q:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/byj;->q:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v7, v0, v1

    .line 164
    iget v0, p0, Lo/byj;->z:I

    if-ne v11, v0, :cond_0

    iget v0, p0, Lo/byj;->k:I

    if-eq v8, v0, :cond_0

    .line 165
    new-instance v13, Landroid/graphics/Rect;

    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 166
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v12, v2, v1, v13}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 167
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float v14, p2, v0

    .line 168
    move-object v0, p0

    move v1, v7

    move v2, v14

    iget v3, p0, Lo/byj;->c:I

    iget v4, p0, Lo/byj;->q:F

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/byj;->c(FFIFLandroid/graphics/Canvas;)V

    .line 169
    move-object v0, p0

    move-object v1, v12

    iget v2, p0, Lo/byj;->g:F

    iget v3, p0, Lo/byj;->f:I

    move v4, v7

    move/from16 v5, p2

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Lo/byj;->c(Ljava/lang/String;FIFFLandroid/graphics/Canvas;)V

    .line 170
    goto :goto_1

    .line 171
    :cond_0
    move-object v0, p0

    move-object v1, v12

    move v2, v9

    move v3, v8

    move v4, v7

    move/from16 v5, p2

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Lo/byj;->c(Ljava/lang/String;FIFFLandroid/graphics/Canvas;)V

    .line 160
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 174
    :cond_1
    iget-object v0, p0, Lo/byj;->r:[I

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-direct {p0, v1, v0, v2}, Lo/byj;->d(Landroid/graphics/Canvas;[IF)V

    .line 175
    return-void
.end method

.method private setBgMonth([[I)V
    .locals 4

    .line 412
    const/4 v2, 0x0

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_1

    iget-object v0, p0, Lo/byj;->u:[[I

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 413
    const/4 v3, 0x0

    :goto_1
    aget-object v0, p1, v2

    array-length v0, v0

    if-ge v3, v0, :cond_0

    iget-object v0, p0, Lo/byj;->u:[[I

    aget-object v0, v0, v2

    array-length v0, v0

    if-ge v3, v0, :cond_0

    .line 414
    iget-object v0, p0, Lo/byj;->u:[[I

    aget-object v0, v0, v2

    aget-object v1, p1, v2

    aget v1, v1, v3

    aput v1, v0, v3

    .line 413
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 412
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 417
    :cond_1
    return-void
.end method

.method private setBgWeek([I)V
    .locals 3

    .line 438
    const/4 v2, 0x0

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_0

    iget-object v0, p0, Lo/byj;->r:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 439
    iget-object v0, p0, Lo/byj;->r:[I

    aget v1, p1, v2

    aput v1, v0, v2

    .line 438
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 441
    :cond_0
    return-void
.end method

.method private setDayMonth([[I)V
    .locals 4

    .line 404
    const/4 v2, 0x0

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_1

    iget-object v0, p0, Lo/byj;->t:[[I

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 405
    const/4 v3, 0x0

    :goto_1
    aget-object v0, p1, v2

    array-length v0, v0

    if-ge v3, v0, :cond_0

    iget-object v0, p0, Lo/byj;->t:[[I

    aget-object v0, v0, v2

    array-length v0, v0

    if-ge v3, v0, :cond_0

    .line 406
    iget-object v0, p0, Lo/byj;->t:[[I

    aget-object v0, v0, v2

    aget-object v1, p1, v2

    aget v1, v1, v3

    aput v1, v0, v3

    .line 405
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 404
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 409
    :cond_1
    return-void
.end method

.method private setDayWeek([I)V
    .locals 3

    .line 432
    const/4 v2, 0x0

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_0

    iget-object v0, p0, Lo/byj;->s:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 433
    iget-object v0, p0, Lo/byj;->s:[I

    aget v1, p1, v2

    aput v1, v0, v2

    .line 432
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 435
    :cond_0
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v8, 0x0

    .line 138
    iget-object v0, p0, Lo/byj;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 139
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/byj;->e:[Ljava/lang/String;

    array-length v0, v0

    if-ge v9, v0, :cond_0

    .line 140
    int-to-float v0, v9

    iget v1, p0, Lo/byj;->a:I

    int-to-float v1, v1

    iget v2, p0, Lo/byj;->q:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/byj;->q:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v7, v0, v1

    .line 141
    iget v8, p0, Lo/byj;->p:F

    .line 143
    move-object v0, p0

    iget-object v1, p0, Lo/byj;->e:[Ljava/lang/String;

    aget-object v1, v1, v9

    iget v2, p0, Lo/byj;->p:F

    iget v3, p0, Lo/byj;->h:I

    move v4, v7

    move v5, v8

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lo/byj;->c(Ljava/lang/String;FIFFLandroid/graphics/Canvas;)V

    .line 139
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 146
    :cond_0
    iget-boolean v0, p0, Lo/byj;->x:Z

    if-eqz v0, :cond_1

    .line 147
    invoke-direct {p0, p1, v8}, Lo/byj;->e(Landroid/graphics/Canvas;F)V

    goto :goto_1

    .line 149
    :cond_1
    invoke-direct {p0, p1, v8}, Lo/byj;->d(Landroid/graphics/Canvas;F)V

    .line 152
    :goto_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 336
    invoke-direct {p0, p1}, Lo/byj;->b(I)I

    move-result v0

    .line 337
    invoke-direct {p0, p2}, Lo/byj;->c(I)I

    move-result v1

    .line 340
    invoke-virtual {p0, v0, v1}, Lo/byj;->setMeasuredDimension(II)V

    .line 341
    return-void
.end method

.method public setMonth([[II[[II)V
    .locals 1

    .line 391
    invoke-direct {p0, p1}, Lo/byj;->setDayMonth([[I)V

    .line 392
    invoke-direct {p0, p3}, Lo/byj;->setBgMonth([[I)V

    .line 394
    if-nez p4, :cond_0

    .line 395
    iput p2, p0, Lo/byj;->z:I

    goto :goto_0

    .line 397
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/byj;->z:I

    .line 400
    :goto_0
    invoke-virtual {p0}, Lo/byj;->invalidate()V

    .line 401
    return-void
.end method

.method public setWeek([I[III)V
    .locals 1

    .line 421
    invoke-direct {p0, p1}, Lo/byj;->setDayWeek([I)V

    .line 422
    invoke-direct {p0, p2}, Lo/byj;->setBgWeek([I)V

    .line 423
    if-nez p4, :cond_0

    .line 424
    iput p3, p0, Lo/byj;->z:I

    goto :goto_0

    .line 426
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/byj;->z:I

    .line 428
    :goto_0
    invoke-virtual {p0}, Lo/byj;->invalidate()V

    .line 429
    return-void
.end method
