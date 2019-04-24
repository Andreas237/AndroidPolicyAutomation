.class public Lo/epw;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private C:I

.field private D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private a:Landroid/content/Context;

.field private b:Landroid/content/res/Resources;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/util/DisplayMetrics;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private k:I

.field private l:Z

.field private m:D

.field private n:I

.field private o:I

.field private p:D

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:[Landroid/graphics/Point;

.field private y:I

.field private z:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/epw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 92
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    const/high16 v0, -0x10000

    iput v0, p0, Lo/epw;->g:I

    .line 44
    const/high16 v0, -0x10000

    iput v0, p0, Lo/epw;->i:I

    .line 45
    const/4 v0, -0x1

    iput v0, p0, Lo/epw;->k:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/epw;->o:I

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epw;->l:Z

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/epw;->u:I

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epw;->D:Ljava/util/ArrayList;

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epw;->A:Z

    .line 93
    iput-object p1, p0, Lo/epw;->a:Landroid/content/Context;

    .line 94
    invoke-direct {p0}, Lo/epw;->c()V

    .line 95
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 9

    .line 317
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 318
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/epw;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 321
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 322
    iget-boolean v0, p0, Lo/epw;->A:Z

    if-eqz v0, :cond_1

    .line 323
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 324
    const/4 v8, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v8, v0, :cond_0

    .line 325
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 326
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v8, 0x1

    aget-object v7, v0, v1

    .line 327
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 324
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 329
    :cond_0
    return-void

    .line 331
    :cond_1
    const/4 v8, 0x0

    :goto_1
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v8, v0, :cond_3

    .line 332
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 335
    move-object v0, p1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v2, v8, 0x6

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v2, v2, v8

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v4, v8, 0x5

    aget-object v3, v3, v4

    iget v3, v3, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v5, v8, 0x1

    aget-object v4, v4, v5

    iget v4, v4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 337
    :cond_2
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 338
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v8, 0x1

    aget-object v7, v0, v1

    .line 339
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 331
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 343
    :cond_3
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 344
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v8, v0, -0x1

    :goto_3
    const/4 v0, 0x6

    if-ge v8, v0, :cond_5

    .line 345
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 348
    move-object v0, p1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v2, v8, 0x6

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v2, v2, v8

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v4, v8, 0x5

    aget-object v3, v3, v4

    iget v3, v3, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v5, v8, 0x1

    aget-object v4, v4, v5

    iget v4, v4, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 350
    :cond_4
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 351
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v8, 0x1

    aget-object v7, v0, v1

    .line 352
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 344
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 355
    :cond_5
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 14

    .line 358
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 359
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/epw;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 360
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 361
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 362
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/epw;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_user_profile_target:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/epw;->u:I

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 363
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v7

    .line 365
    const/4 v8, 0x0

    .line 366
    iget v0, p0, Lo/epw;->n:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/epw;->h:I

    iget v2, p0, Lo/epw;->n:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    mul-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    int-to-float v9, v0

    .line 367
    iget v0, p0, Lo/epw;->o:I

    iget v1, p0, Lo/epw;->w:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-double v0, v0

    iget-wide v2, p0, Lo/epw;->p:D

    iget-wide v4, p0, Lo/epw;->m:D

    sub-double/2addr v2, v4

    div-double/2addr v0, v2

    double-to-int v10, v0

    .line 369
    iget v0, p0, Lo/epw;->o:I

    iget v1, p0, Lo/epw;->w:I

    sub-int/2addr v0, v1

    iget v1, p0, Lo/epw;->u:I

    int-to-double v1, v1

    iget-wide v3, p0, Lo/epw;->m:D

    sub-double/2addr v1, v3

    int-to-double v3, v10

    mul-double/2addr v1, v3

    double-to-int v1, v1

    sub-int v11, v0, v1

    .line 370
    iget v0, p0, Lo/epw;->u:I

    iget-wide v1, p0, Lo/epw;->p:D

    double-to-int v1, v1

    if-le v0, v1, :cond_0

    .line 371
    const/4 v11, 0x0

    goto :goto_0

    .line 372
    :cond_0
    iget v0, p0, Lo/epw;->o:I

    iget v1, p0, Lo/epw;->w:I

    sub-int/2addr v0, v1

    if-le v11, v0, :cond_1

    .line 373
    iget v11, p0, Lo/epw;->o:I

    .line 375
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget v0, p0, Lo/epw;->u:I

    int-to-double v0, v0

    iget-object v2, p0, Lo/epw;->B:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 376
    iget v11, p0, Lo/epw;->o:I

    .line 379
    :cond_2
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 380
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float v12, v0, v1

    goto :goto_1

    :cond_3
    const/4 v12, 0x0

    .line 381
    :goto_1
    iget v0, p0, Lo/epw;->o:I

    if-ne v11, v0, :cond_4

    .line 382
    const/high16 v0, 0x40800000    # 4.0f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    sub-int v0, v11, v0

    iput v0, p0, Lo/epw;->C:I

    .line 383
    iget v0, p0, Lo/epw;->C:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v12, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 386
    :cond_4
    const/high16 v0, 0x40000000    # 2.0f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    add-int/2addr v0, v11

    iget v1, p0, Lo/epw;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/epw;->C:I

    .line 387
    iget v0, p0, Lo/epw;->C:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v12, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 390
    :goto_2
    goto/16 :goto_4

    .line 391
    :cond_5
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/epw;->h:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    iget v0, p0, Lo/epw;->h:I

    int-to-float v0, v0

    sub-float v12, v0, v7

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float v12, v0, v1

    .line 392
    :goto_3
    iget v0, p0, Lo/epw;->o:I

    if-ne v11, v0, :cond_7

    .line 393
    const/high16 v0, 0x40800000    # 4.0f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    sub-int v0, v11, v0

    iput v0, p0, Lo/epw;->C:I

    .line 394
    iget v0, p0, Lo/epw;->C:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v12, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 397
    :cond_7
    const/high16 v0, 0x40000000    # 2.0f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    add-int/2addr v0, v11

    iget v1, p0, Lo/epw;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/epw;->C:I

    .line 398
    iget v0, p0, Lo/epw;->C:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v12, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 402
    :goto_4
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 403
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 404
    new-instance v12, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/high16 v1, 0x40800000    # 4.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x1

    aput v1, v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v12, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 405
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v12}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 406
    new-instance v13, Landroid/graphics/Path;

    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 407
    int-to-float v0, v11

    invoke-virtual {v13, v8, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 408
    int-to-float v0, v11

    invoke-virtual {v13, v9, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 409
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v13, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 410
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 412
    return-void
.end method

.method private b(Landroid/graphics/Canvas;Ljava/lang/String;F)V
    .locals 3

    .line 236
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    iget v0, p0, Lo/epw;->r:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->r:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v1, p0, Lo/epw;->y:I

    sub-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lo/epw;->C:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lo/epw;->s:I

    if-ge v0, v1, :cond_0

    .line 238
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->r:I

    rsub-int/lit8 v1, v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p3, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->r:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    add-int/2addr v1, v2

    .line 239
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 238
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 241
    :cond_0
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->r:I

    rsub-int/lit8 v1, v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p3, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->r:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    sub-int/2addr v1, v2

    .line 242
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 241
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 245
    :cond_1
    iget v0, p0, Lo/epw;->r:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->r:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v1, p0, Lo/epw;->y:I

    sub-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lo/epw;->C:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lo/epw;->s:I

    if-ge v0, v1, :cond_2

    .line 246
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->r:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p3, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->r:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    add-int/2addr v1, v2

    .line 247
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 246
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 249
    :cond_2
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->r:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p3, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->r:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    sub-int/2addr v1, v2

    .line 250
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 249
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 254
    :goto_0
    return-void
.end method

.method private c()V
    .locals 6

    .line 101
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/epw;->b:Landroid/content/res/Resources;

    .line 102
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 103
    iget-object v0, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->home_weight_line_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epw;->g:I

    .line 104
    iget-object v0, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->home_weight_area_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epw;->i:I

    .line 105
    iget-object v0, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$color;->home_weight_area_colo_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epw;->k:I

    .line 106
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lo/epw;->e:Landroid/util/DisplayMetrics;

    .line 107
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 108
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lo/epw;->e:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 109
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 110
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 111
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const-string v1, "80"

    const-string v2, "80"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 112
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v0

    iput v0, p0, Lo/epw;->s:I

    .line 113
    const/high16 v0, 0x40900000    # 4.5f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    iput v0, p0, Lo/epw;->q:I

    .line 114
    iget v0, p0, Lo/epw;->s:I

    const/high16 v1, 0x41100000    # 9.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/epw;->w:I

    .line 115
    const/high16 v0, 0x40400000    # 3.0f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    iput v0, p0, Lo/epw;->y:I

    .line 116
    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    iput v0, p0, Lo/epw;->v:I

    .line 117
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 14

    .line 415
    const/4 v8, 0x0

    .line 416
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    array-length v0, v0

    if-ge v9, v0, :cond_1

    .line 417
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v9

    iget v0, v0, Landroid/graphics/Point;->y:I

    if-le v0, v8, :cond_0

    .line 418
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v9

    iget v8, v0, Landroid/graphics/Point;->y:I

    .line 416
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 421
    :cond_1
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 422
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p0, Lo/epw;->o:I

    int-to-float v4, v1

    iget v5, p0, Lo/epw;->i:I

    iget v6, p0, Lo/epw;->k:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v10, v0

    .line 423
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 424
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 426
    const/16 v0, 0xff

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 427
    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    .line 428
    iget-boolean v0, p0, Lo/epw;->A:Z

    if-eqz v0, :cond_3

    .line 429
    const/16 v0, 0x33

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 430
    new-instance v12, Landroid/graphics/Path;

    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 431
    const/4 v13, 0x0

    :goto_1
    const/4 v0, 0x6

    if-ge v13, v0, :cond_2

    .line 432
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v13

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v13

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 433
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v13

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 434
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v13, 0x1

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 435
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v13, 0x1

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v2, v13, 0x1

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 431
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 437
    :cond_2
    invoke-virtual {v12}, Landroid/graphics/Path;->close()V

    .line 438
    invoke-virtual {p1, v12, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 439
    return-void

    .line 441
    :cond_3
    const/4 v12, 0x0

    :goto_2
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v12, v0, :cond_5

    .line 442
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 443
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v12, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v12

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 444
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v12, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 445
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v12, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 446
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v12, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v2, v12, 0x1

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_3

    .line 448
    :cond_4
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v12

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v12

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 449
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v12

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 450
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v12, 0x1

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 451
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v12, 0x1

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v2, v12, 0x1

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 441
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_2

    .line 454
    :cond_5
    invoke-virtual {v11}, Landroid/graphics/Path;->close()V

    .line 455
    invoke-virtual {p1, v11, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 457
    const/16 v0, 0x33

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 458
    new-instance v12, Landroid/graphics/Path;

    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 459
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v13, v0, -0x1

    :goto_4
    const/4 v0, 0x6

    if-ge v13, v0, :cond_7

    .line 460
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 461
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v13, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v13

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 462
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v13, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 463
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v13, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 464
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v13, 0x5

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v2, v13, 0x1

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_5

    .line 466
    :cond_6
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v13

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v13

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 467
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v13

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 468
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v13, 0x1

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/epw;->o:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 469
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v1, v13, 0x1

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    add-int/lit8 v2, v13, 0x1

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 459
    :goto_5
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_4

    .line 472
    :cond_7
    invoke-virtual {v12}, Landroid/graphics/Path;->close()V

    .line 473
    invoke-virtual {p1, v12, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 475
    return-void
.end method

.method private d(F)I
    .locals 2

    .line 535
    iget-object v0, p0, Lo/epw;->e:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 12

    .line 261
    iget-object v0, p0, Lo/epw;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 262
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 263
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 264
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 265
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 266
    iget-boolean v0, p0, Lo/epw;->A:Z

    if-eqz v0, :cond_1

    .line 267
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x7

    if-ge v5, v0, :cond_0

    .line 268
    iget-object v0, p0, Lo/epw;->D:Ljava/util/ArrayList;

    iget v1, p0, Lo/epw;->n:I

    iget v2, p0, Lo/epw;->h:I

    iget v3, p0, Lo/epw;->n:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x6

    mul-int/2addr v2, v5

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 270
    :cond_0
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 271
    iget-object v0, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight_nodata_desc:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 272
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 273
    iget v0, p0, Lo/epw;->h:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epw;->o:I

    iget v2, p0, Lo/epw;->q:I

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 274
    return-void

    .line 278
    :cond_1
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v8

    .line 279
    iget v0, v8, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v8, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v9, v0

    .line 280
    new-instance v10, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyy"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 281
    const/4 v11, 0x0

    :goto_1
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 282
    iget-object v0, p0, Lo/epw;->D:Ljava/util/ArrayList;

    iget v1, p0, Lo/epw;->n:I

    iget v2, p0, Lo/epw;->h:I

    iget v3, p0, Lo/epw;->n:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x6

    mul-int/2addr v2, v11

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    iget-object v0, p0, Lo/epw;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/fee;->d(J)Ljava/lang/String;

    move-result-object v6

    .line 284
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 285
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 286
    iget v0, p0, Lo/epw;->n:I

    iget v1, p0, Lo/epw;->h:I

    iget v2, p0, Lo/epw;->n:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    rsub-int/lit8 v2, v11, 0x6

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epw;->o:I

    iget v2, p0, Lo/epw;->q:I

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 288
    if-eqz v11, :cond_3

    .line 289
    iget-object v0, p0, Lo/epw;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epw;->j:Ljava/util/ArrayList;

    add-int/lit8 v2, v11, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 290
    iget-object v0, p0, Lo/epw;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 291
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 292
    iget v0, p0, Lo/epw;->n:I

    iget v1, p0, Lo/epw;->h:I

    iget v2, p0, Lo/epw;->n:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    rsub-int/lit8 v2, v11, 0x6

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epw;->o:I

    iget v2, p0, Lo/epw;->q:I

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    add-int/2addr v1, v9

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v7, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_2

    .line 297
    :cond_2
    iget v0, p0, Lo/epw;->n:I

    iget v1, p0, Lo/epw;->h:I

    iget v2, p0, Lo/epw;->n:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    mul-int/2addr v1, v11

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epw;->o:I

    iget v2, p0, Lo/epw;->q:I

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 299
    if-eqz v11, :cond_3

    .line 300
    iget-object v0, p0, Lo/epw;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epw;->j:Ljava/util/ArrayList;

    add-int/lit8 v2, v11, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 301
    iget-object v0, p0, Lo/epw;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 302
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    .line 303
    iget v0, p0, Lo/epw;->n:I

    iget v1, p0, Lo/epw;->h:I

    iget v2, p0, Lo/epw;->n:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x6

    mul-int/2addr v1, v11

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epw;->o:I

    iget v2, p0, Lo/epw;->q:I

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    add-int/2addr v1, v9

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v7, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 281
    :cond_3
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    .line 309
    :cond_4
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    :goto_3
    const/4 v0, 0x7

    if-ge v11, v0, :cond_5

    .line 310
    iget-object v0, p0, Lo/epw;->D:Ljava/util/ArrayList;

    iget v1, p0, Lo/epw;->n:I

    iget v2, p0, Lo/epw;->h:I

    iget v3, p0, Lo/epw;->n:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x6

    mul-int/2addr v2, v11

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 314
    :cond_5
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 5

    .line 162
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/epw;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 163
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 164
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 165
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epw;->c:Landroid/graphics/Paint;

    .line 166
    iget-object v0, p0, Lo/epw;->c:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 167
    iget-object v0, p0, Lo/epw;->c:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 169
    iget-object v0, p0, Lo/epw;->c:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 170
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 171
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 173
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 175
    :cond_0
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 176
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 170
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 180
    :cond_1
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 181
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_2
    const/4 v0, 0x7

    if-ge v4, v0, :cond_3

    .line 182
    iget-object v0, p0, Lo/epw;->c:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 183
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 184
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 185
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 186
    iget-object v0, p0, Lo/epw;->c:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 187
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    rsub-int/lit8 v1, v4, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 189
    :cond_2
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 190
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->y:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 191
    iget-object v0, p0, Lo/epw;->c:Landroid/graphics/Paint;

    const/16 v1, 0x33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 192
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lo/epw;->v:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/epw;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 181
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    .line 196
    :cond_3
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 197
    invoke-direct {p0, p1}, Lo/epw;->setDrawText(Landroid/graphics/Canvas;)V

    .line 200
    :cond_4
    return-void
.end method

.method private getPoints()[Landroid/graphics/Point;
    .locals 10

    .line 480
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 482
    const/4 v0, 0x7

    new-array v6, v0, [Landroid/graphics/Point;

    .line 483
    iget v0, p0, Lo/epw;->o:I

    iget v1, p0, Lo/epw;->w:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-double v0, v0

    iget-wide v2, p0, Lo/epw;->p:D

    iget-wide v4, p0, Lo/epw;->m:D

    sub-double/2addr v2, v4

    div-double/2addr v0, v2

    double-to-float v7, v0

    .line 484
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 485
    iget v0, p0, Lo/epw;->o:I

    iget v1, p0, Lo/epw;->w:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-wide v3, p0, Lo/epw;->m:D

    sub-double/2addr v1, v3

    float-to-double v3, v7

    mul-double/2addr v1, v3

    double-to-int v1, v1

    sub-int v9, v0, v1

    .line 486
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/epw;->D:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v0, v1, v9}, Landroid/graphics/Point;-><init>(II)V

    aput-object v0, v6, v8

    .line 484
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 489
    :cond_0
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    :goto_1
    const/4 v0, 0x7

    if-ge v8, v0, :cond_1

    .line 490
    iget v0, p0, Lo/epw;->o:I

    iget-object v1, p0, Lo/epw;->z:[I

    aget v1, v1, v8

    sub-int v9, v0, v1

    .line 491
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/epw;->D:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v0, v1, v9}, Landroid/graphics/Point;-><init>(II)V

    aput-object v0, v6, v8

    .line 489
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 494
    :cond_1
    return-object v6

    .line 497
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private setDrawText(Landroid/graphics/Canvas;)V
    .locals 7

    .line 203
    iget-wide v0, p0, Lo/epw;->p:D

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 204
    iget-wide v0, p0, Lo/epw;->m:D

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 205
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 206
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epw;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 208
    iget-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 209
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 210
    iget-object v0, p0, Lo/epw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    iget v0, p0, Lo/epw;->t:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->t:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v1, p0, Lo/epw;->y:I

    add-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lo/epw;->s:I

    add-int/2addr v0, v1

    iget v1, p0, Lo/epw;->C:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lo/epw;->s:I

    if-ge v0, v1, :cond_0

    .line 212
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->t:I

    rsub-int/lit8 v1, v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->t:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    sub-int/2addr v1, v2

    .line 213
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 212
    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 215
    :cond_0
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->t:I

    rsub-int/lit8 v1, v1, 0x6

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->t:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    add-int/2addr v1, v2

    .line 216
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 215
    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 220
    :cond_1
    iget v0, p0, Lo/epw;->t:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->t:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v1, p0, Lo/epw;->y:I

    add-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lo/epw;->s:I

    add-int/2addr v0, v1

    iget v1, p0, Lo/epw;->C:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lo/epw;->s:I

    if-ge v0, v1, :cond_2

    .line 221
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->t:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->t:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    sub-int/2addr v1, v2

    .line 222
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 221
    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 224
    :cond_2
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v1, p0, Lo/epw;->t:I

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epw;->x:[Landroid/graphics/Point;

    iget v2, p0, Lo/epw;->t:I

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, p0, Lo/epw;->y:I

    add-int/2addr v1, v2

    .line 225
    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {p0, v2}, Lo/epw;->d(F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/epw;->s:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epw;->d:Landroid/graphics/Paint;

    .line 224
    invoke-virtual {p1, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 229
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 230
    invoke-virtual {v4, v5}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_4

    .line 231
    invoke-direct {p0, p1, v4, v6}, Lo/epw;->b(Landroid/graphics/Canvas;Ljava/lang/String;F)V

    .line 233
    :cond_4
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 139
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 141
    invoke-direct {p0, p1}, Lo/epw;->d(Landroid/graphics/Canvas;)V

    .line 144
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 145
    iget-object v0, p0, Lo/epw;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 146
    invoke-direct {p0}, Lo/epw;->getPoints()[Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    .line 147
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    if-eqz v0, :cond_1

    .line 148
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 149
    invoke-direct {p0, p1}, Lo/epw;->a(Landroid/graphics/Canvas;)V

    .line 150
    invoke-direct {p0, p1}, Lo/epw;->c(Landroid/graphics/Canvas;)V

    .line 151
    iget-boolean v0, p0, Lo/epw;->A:Z

    if-nez v0, :cond_0

    .line 152
    invoke-direct {p0, p1}, Lo/epw;->b(Landroid/graphics/Canvas;)V

    .line 155
    :cond_0
    iget-object v0, p0, Lo/epw;->x:[Landroid/graphics/Point;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 156
    invoke-direct {p0, p1}, Lo/epw;->e(Landroid/graphics/Canvas;)V

    .line 159
    :cond_1
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 121
    iget-boolean v0, p0, Lo/epw;->l:Z

    if-eqz v0, :cond_1

    .line 122
    invoke-virtual {p0}, Lo/epw;->getHeight()I

    move-result v0

    iput v0, p0, Lo/epw;->f:I

    .line 123
    invoke-virtual {p0}, Lo/epw;->getWidth()I

    move-result v0

    iput v0, p0, Lo/epw;->h:I

    .line 124
    iget v0, p0, Lo/epw;->o:I

    if-nez v0, :cond_0

    .line 126
    iget v0, p0, Lo/epw;->f:I

    iget v1, p0, Lo/epw;->q:I

    sub-int/2addr v0, v1

    iget v1, p0, Lo/epw;->s:I

    sub-int/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/epw;->o:I

    .line 127
    :cond_0
    const/high16 v0, 0x41980000    # 19.0f

    invoke-direct {p0, v0}, Lo/epw;->d(F)I

    move-result v0

    iput v0, p0, Lo/epw;->n:I

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epw;->l:Z

    .line 130
    :cond_1
    return-void
.end method

.method public setData(Ljava/util/ArrayList;Ljava/util/ArrayList;DDIILjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/Long;>;DDIILjava/lang/String;)V"
        }
    .end annotation

    .line 501
    const/4 v0, 0x7

    new-array v0, v0, [I

    iput-object v0, p0, Lo/epw;->z:[I

    .line 502
    iget-object v0, p0, Lo/epw;->z:[I

    const/high16 v1, 0x42200000    # 40.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 503
    iget-object v0, p0, Lo/epw;->z:[I

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 504
    iget-object v0, p0, Lo/epw;->z:[I

    const/high16 v1, 0x42480000    # 50.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 505
    iget-object v0, p0, Lo/epw;->z:[I

    const/high16 v1, 0x42340000    # 45.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 506
    iget-object v0, p0, Lo/epw;->z:[I

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 507
    iget-object v0, p0, Lo/epw;->z:[I

    const/high16 v1, 0x420c0000    # 35.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    const/4 v2, 0x5

    aput v1, v0, v2

    .line 508
    iget-object v0, p0, Lo/epw;->z:[I

    const/high16 v1, 0x42480000    # 50.0f

    invoke-direct {p0, v1}, Lo/epw;->d(F)I

    move-result v1

    const/4 v2, 0x6

    aput v1, v0, v2

    .line 509
    if-nez p1, :cond_0

    .line 510
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epw;->A:Z

    .line 511
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    iput-wide v0, p0, Lo/epw;->p:D

    .line 512
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/epw;->m:D

    .line 513
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epw;->B:Ljava/util/ArrayList;

    .line 515
    return-void

    .line 517
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epw;->A:Z

    .line 519
    iput p7, p0, Lo/epw;->r:I

    .line 520
    iput p8, p0, Lo/epw;->t:I

    .line 521
    iput-wide p3, p0, Lo/epw;->p:D

    .line 522
    iput-wide p5, p0, Lo/epw;->m:D

    .line 523
    iput-object p2, p0, Lo/epw;->j:Ljava/util/ArrayList;

    .line 524
    iput-object p1, p0, Lo/epw;->B:Ljava/util/ArrayList;

    .line 525
    return-void
.end method

.method public setWeightGoal(I)V
    .locals 0

    .line 528
    iput p1, p0, Lo/epw;->u:I

    .line 529
    return-void
.end method
