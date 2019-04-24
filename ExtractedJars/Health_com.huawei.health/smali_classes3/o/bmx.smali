.class public Lo/bmx;
.super Landroid/widget/ImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bmx$c;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/graphics/BitmapShader;

.field private c:Landroid/graphics/Path;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/BitmapShader;

.field private final f:I

.field private final g:I

.field private final h:I

.field private i:I

.field private final k:I

.field private l:Z

.field private p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 126
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 76
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42fa0000    # 125.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bmx;->f:I

    .line 81
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42700000    # 60.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bmx;->h:I

    .line 86
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bmx;->k:I

    .line 91
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bmx;->g:I

    .line 111
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bmx;->p:Z

    .line 116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bmx;->l:Z

    .line 127
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    .line 128
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    .line 131
    new-instance v0, Lo/bmx$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bmx$c;-><init>(Lo/bmx;Lo/bmx$4;)V

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 132
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 14

    .line 375
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 376
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 377
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 379
    iget v0, p0, Lo/bmx;->f:I

    int-to-float v0, v0

    int-to-float v1, v9

    div-float v10, v0, v1

    .line 380
    int-to-float v0, v8

    mul-float v11, v0, v10

    .line 381
    iget v0, p0, Lo/bmx;->f:I

    int-to-float v0, v0

    cmpg-float v0, v11, v0

    if-gtz v0, :cond_0

    iget v0, p0, Lo/bmx;->h:I

    int-to-float v0, v0

    cmpl-float v0, v11, v0

    if-ltz v0, :cond_0

    .line 383
    invoke-virtual {v7, v10, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 384
    move-object v0, p1

    move v3, v8

    move v4, v9

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 386
    :cond_0
    iget v0, p0, Lo/bmx;->h:I

    int-to-float v0, v0

    cmpg-float v0, v11, v0

    if-gez v0, :cond_1

    .line 388
    iget v0, p0, Lo/bmx;->h:I

    int-to-float v0, v0

    int-to-float v1, v8

    div-float v12, v0, v1

    .line 389
    int-to-float v0, v9

    iget v1, p0, Lo/bmx;->f:I

    int-to-float v1, v1

    div-float/2addr v1, v12

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v13, v0, v1

    .line 390
    invoke-virtual {v7, v12, v12}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 391
    move-object v0, p1

    float-to-int v2, v13

    move v3, v8

    iget v1, p0, Lo/bmx;->f:I

    int-to-float v1, v1

    div-float/2addr v1, v12

    float-to-int v1, v1

    add-int/lit8 v4, v1, 0x2

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 393
    :cond_1
    const-string v0, "ChatImage"

    const-string v1, "could not happened !"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    const/4 v0, 0x0

    return-object v0
.end method

.method private b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 3

    .line 350
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 351
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 353
    if-le v2, v1, :cond_0

    .line 355
    invoke-direct {p0, p1}, Lo/bmx;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 357
    :cond_0
    if-ge v2, v1, :cond_1

    .line 359
    invoke-direct {p0, p1}, Lo/bmx;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 363
    :cond_1
    invoke-direct {p0, p1}, Lo/bmx;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 6

    .line 588
    const/4 v4, 0x0

    .line 591
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 592
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 591
    :goto_0
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v4, v0

    .line 593
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 594
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 595
    invoke-virtual {p1, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 604
    goto :goto_1

    .line 597
    :catch_0
    move-exception v5

    .line 599
    const-string v0, "ChatImage"

    const-string v1, "DrawableToBitmap OutOfMemoryError!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 604
    goto :goto_1

    .line 601
    :catch_1
    move-exception v5

    .line 603
    const-string v0, "ChatImage"

    const-string v1, "DrawableToBitmap Failed!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    :goto_1
    return-object v4
.end method

.method private c(II)Landroid/graphics/Bitmap;
    .locals 8

    .line 617
    const/4 v5, 0x0

    .line 620
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v5, v0

    .line 621
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 622
    const/high16 v0, -0x1000000

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 623
    const/16 v0, 0x3c

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 624
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 625
    new-instance v0, Landroid/graphics/RectF;

    int-to-float v1, p1

    int-to-float v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v7, v0, v6}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 634
    goto :goto_0

    .line 627
    :catch_0
    move-exception v6

    .line 629
    const-string v0, "ChatImage"

    const-string v1, "Get pressedLayerBitmap OutOfMemoryError!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    goto :goto_0

    .line 631
    :catch_1
    move-exception v6

    .line 633
    const-string v0, "ChatImage"

    const-string v1, "Get pressedLayerBitmap Failed!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 635
    :goto_0
    return-object v5
.end method

.method private c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 11

    .line 434
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 435
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 436
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 437
    iget v0, p0, Lo/bmx;->f:I

    int-to-float v0, v0

    int-to-float v1, v8

    div-float v10, v0, v1

    .line 438
    invoke-virtual {v7, v10, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 439
    move-object v0, p1

    move v3, v8

    move v4, v9

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 14

    .line 405
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 406
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 407
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 409
    iget v0, p0, Lo/bmx;->f:I

    int-to-float v0, v0

    int-to-float v1, v8

    div-float v10, v0, v1

    .line 410
    int-to-float v0, v9

    mul-float v11, v0, v10

    .line 411
    iget v0, p0, Lo/bmx;->f:I

    int-to-float v0, v0

    cmpg-float v0, v11, v0

    if-gtz v0, :cond_0

    iget v0, p0, Lo/bmx;->h:I

    int-to-float v0, v0

    cmpl-float v0, v11, v0

    if-ltz v0, :cond_0

    .line 413
    invoke-virtual {v7, v10, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 414
    move-object v0, p1

    move v3, v8

    move v4, v9

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 416
    :cond_0
    iget v0, p0, Lo/bmx;->h:I

    int-to-float v0, v0

    cmpg-float v0, v11, v0

    if-gez v0, :cond_1

    .line 418
    iget v0, p0, Lo/bmx;->h:I

    int-to-float v0, v0

    int-to-float v1, v9

    div-float v12, v0, v1

    .line 419
    int-to-float v0, v8

    iget v1, p0, Lo/bmx;->f:I

    int-to-float v1, v1

    div-float/2addr v1, v12

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v13, v0, v1

    .line 420
    invoke-virtual {v7, v12, v12}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 421
    move-object v0, p1

    float-to-int v1, v13

    iget v2, p0, Lo/bmx;->f:I

    int-to-float v2, v2

    div-float/2addr v2, v12

    float-to-int v2, v2

    add-int/lit8 v3, v2, 0x2

    move v4, v9

    move-object v5, v7

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 423
    :cond_1
    const-string v0, "ChatImage"

    const-string v1, "could not happened !"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    const/4 v0, 0x0

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 218
    invoke-virtual {p0}, Lo/bmx;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 219
    if-eqz v2, :cond_0

    .line 221
    iget v0, p0, Lo/bmx;->a:I

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 222
    iget v0, p0, Lo/bmx;->i:I

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 223
    invoke-virtual {p0, v2}, Lo/bmx;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 227
    :cond_0
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    iget v0, p0, Lo/bmx;->a:I

    iget v1, p0, Lo/bmx;->i:I

    invoke-direct {v2, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 228
    invoke-virtual {p0, v2}, Lo/bmx;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    :goto_0
    return-void
.end method

.method private d(II)V
    .locals 4

    .line 313
    if-le p1, p2, :cond_1

    .line 315
    iget v0, p0, Lo/bmx;->f:I

    iput v0, p0, Lo/bmx;->a:I

    .line 316
    iget v0, p0, Lo/bmx;->f:I

    int-to-float v0, v0

    int-to-float v1, p1

    div-float v2, v0, v1

    .line 317
    int-to-float v0, p2

    mul-float/2addr v0, v2

    float-to-int v3, v0

    .line 318
    iput v3, p0, Lo/bmx;->i:I

    .line 319
    iget v0, p0, Lo/bmx;->h:I

    if-ge v3, v0, :cond_0

    .line 321
    iget v0, p0, Lo/bmx;->h:I

    iput v0, p0, Lo/bmx;->i:I

    .line 323
    :cond_0
    goto :goto_0

    .line 324
    :cond_1
    if-le p2, p1, :cond_3

    .line 326
    iget v0, p0, Lo/bmx;->f:I

    iput v0, p0, Lo/bmx;->i:I

    .line 327
    iget v0, p0, Lo/bmx;->f:I

    int-to-float v0, v0

    int-to-float v1, p2

    div-float v2, v0, v1

    .line 328
    int-to-float v0, p1

    mul-float/2addr v0, v2

    float-to-int v3, v0

    .line 329
    iput v3, p0, Lo/bmx;->a:I

    .line 330
    iget v0, p0, Lo/bmx;->h:I

    if-ge v3, v0, :cond_2

    .line 332
    iget v0, p0, Lo/bmx;->h:I

    iput v0, p0, Lo/bmx;->a:I

    .line 334
    :cond_2
    goto :goto_0

    .line 337
    :cond_3
    iget v0, p0, Lo/bmx;->f:I

    iput v0, p0, Lo/bmx;->a:I

    .line 338
    iget v0, p0, Lo/bmx;->f:I

    iput v0, p0, Lo/bmx;->i:I

    .line 340
    :goto_0
    return-void
.end method

.method private d(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 485
    if-nez p1, :cond_0

    .line 487
    return-void

    .line 490
    :cond_0
    const/4 v1, 0x0

    .line 491
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_1

    .line 493
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 497
    :cond_1
    invoke-direct {p0, p1}, Lo/bmx;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 499
    :goto_0
    invoke-direct {p0, v1}, Lo/bmx;->e(Landroid/graphics/Bitmap;)V

    .line 500
    return-void
.end method

.method private e()V
    .locals 8

    .line 546
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 547
    iget v6, p0, Lo/bmx;->a:I

    .line 548
    iget v7, p0, Lo/bmx;->i:I

    .line 550
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    int-to-float v1, v6

    iget v2, p0, Lo/bmx;->g:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 552
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/bmx;->g:I

    sub-int v2, v6, v2

    int-to-float v2, v2

    int-to-float v3, v6

    iget v4, p0, Lo/bmx;->g:I

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v2, 0x0

    const/high16 v3, -0x3d4c0000    # -90.0f

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 553
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    iget v1, p0, Lo/bmx;->g:I

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 554
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/bmx;->g:I

    int-to-float v2, v2

    iget v3, p0, Lo/bmx;->g:I

    int-to-float v3, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v4, v5, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/high16 v3, -0x3d4c0000    # -90.0f

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 555
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    iget v1, p0, Lo/bmx;->g:I

    sub-int v1, v7, v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 556
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/bmx;->g:I

    sub-int v2, v7, v2

    int-to-float v2, v2

    iget v3, p0, Lo/bmx;->g:I

    int-to-float v3, v3

    int-to-float v4, v7

    const/4 v5, 0x0

    invoke-direct {v1, v5, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v2, 0x43340000    # 180.0f

    const/high16 v3, -0x3d4c0000    # -90.0f

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 557
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    iget v1, p0, Lo/bmx;->g:I

    sub-int v1, v6, v1

    int-to-float v1, v1

    int-to-float v2, v7

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 558
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/bmx;->g:I

    sub-int v2, v6, v2

    int-to-float v2, v2

    iget v3, p0, Lo/bmx;->g:I

    sub-int v3, v7, v3

    int-to-float v3, v3

    int-to-float v4, v6

    int-to-float v5, v7

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, -0x3d4c0000    # -90.0f

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 559
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 560
    return-void
.end method

.method private e(Landroid/graphics/Bitmap;)V
    .locals 9

    .line 260
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    :cond_0
    return-void

    .line 264
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 265
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 268
    const/4 v5, 0x0

    .line 269
    invoke-direct {p0, p1}, Lo/bmx;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 270
    if-eqz v6, :cond_2

    .line 272
    invoke-direct {p0, v6}, Lo/bmx;->i(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 276
    :cond_2
    if-eqz v5, :cond_3

    .line 278
    new-instance v0, Landroid/graphics/BitmapShader;

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v5, v1, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lo/bmx;->b:Landroid/graphics/BitmapShader;

    .line 281
    :cond_3
    invoke-direct {p0, v3, v4}, Lo/bmx;->c(II)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 282
    if-eqz v7, :cond_4

    .line 284
    new-instance v0, Landroid/graphics/BitmapShader;

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v7, v1, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lo/bmx;->e:Landroid/graphics/BitmapShader;

    .line 287
    :cond_4
    invoke-virtual {p0}, Lo/bmx;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 288
    if-eqz v8, :cond_5

    .line 290
    iput v3, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 291
    iput v4, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 292
    invoke-virtual {p0, v8}, Lo/bmx;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 296
    :cond_5
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v8, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 297
    invoke-virtual {p0, v8}, Lo/bmx;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 299
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/bmx;)Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lo/bmx;->l:Z

    return v0
.end method

.method private i(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    .line 450
    iget v0, p0, Lo/bmx;->a:I

    if-eqz v0, :cond_0

    iget v0, p0, Lo/bmx;->i:I

    if-nez v0, :cond_1

    .line 452
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 454
    :cond_1
    const/4 v4, 0x0

    .line 457
    :try_start_0
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 458
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 459
    iget v0, p0, Lo/bmx;->a:I

    iget v1, p0, Lo/bmx;->i:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v4, v0

    .line 460
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 461
    new-instance v7, Landroid/graphics/RectF;

    iget v0, p0, Lo/bmx;->a:I

    int-to-float v0, v0

    iget v1, p0, Lo/bmx;->i:I

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v7, v2, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 462
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v6, v7, v0, v1, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 463
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 464
    iget v0, p0, Lo/bmx;->a:I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bmx;->i:I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v6, p1, v0, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 473
    goto :goto_0

    .line 466
    :catch_0
    move-exception v5

    .line 468
    const-string v0, "ChatImage"

    const-string v1, "buildShowImage OutOfMemoryError!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    goto :goto_0

    .line 470
    :catch_1
    move-exception v5

    .line 472
    const-string v0, "ChatImage"

    const-string v1, "buildShowImage Failed!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    :goto_0
    return-object v4
.end method


# virtual methods
.method public c(Z)V
    .locals 0

    .line 249
    iput-boolean p1, p0, Lo/bmx;->p:Z

    .line 250
    invoke-virtual {p0}, Lo/bmx;->invalidate()V

    .line 251
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 505
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 507
    iget-object v0, p0, Lo/bmx;->b:Landroid/graphics/BitmapShader;

    if-nez v0, :cond_0

    .line 509
    return-void

    .line 511
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 513
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 515
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 516
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 517
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/bmx;->b:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 518
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    iget-object v1, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 521
    iget-boolean v0, p0, Lo/bmx;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bmx;->e:Landroid/graphics/BitmapShader;

    if-eqz v0, :cond_1

    .line 523
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 524
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 525
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 526
    iget-object v0, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/bmx;->e:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 527
    iget-object v0, p0, Lo/bmx;->c:Landroid/graphics/Path;

    iget-object v1, p0, Lo/bmx;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 529
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 530
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 536
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 537
    invoke-direct {p0}, Lo/bmx;->e()V

    .line 538
    iget v0, p0, Lo/bmx;->a:I

    iget v1, p0, Lo/bmx;->i:I

    invoke-virtual {p0, v0, v1}, Lo/bmx;->setMeasuredDimension(II)V

    .line 539
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 159
    invoke-direct {p0, p1}, Lo/bmx;->d(Landroid/graphics/drawable/Drawable;)V

    .line 160
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 189
    if-nez p1, :cond_0

    .line 191
    return-void

    .line 193
    :cond_0
    invoke-direct {p0, p1}, Lo/bmx;->d(Landroid/graphics/drawable/Drawable;)V

    .line 194
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 2

    .line 148
    invoke-virtual {p0}, Lo/bmx;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 149
    invoke-direct {p0, v1}, Lo/bmx;->d(Landroid/graphics/drawable/Drawable;)V

    .line 150
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 140
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 141
    invoke-direct {p0, p1}, Lo/bmx;->e(Landroid/graphics/Bitmap;)V

    .line 142
    return-void
.end method

.method public setImageResource(I)V
    .locals 2

    .line 166
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 167
    invoke-virtual {p0}, Lo/bmx;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 168
    invoke-direct {p0, v1}, Lo/bmx;->d(Landroid/graphics/drawable/Drawable;)V

    .line 169
    return-void
.end method

.method public setImageWidthAndHeight(ZII)V
    .locals 1

    .line 201
    if-eqz p1, :cond_0

    .line 203
    iget v0, p0, Lo/bmx;->k:I

    iput v0, p0, Lo/bmx;->a:I

    .line 204
    iget v0, p0, Lo/bmx;->k:I

    iput v0, p0, Lo/bmx;->i:I

    .line 205
    invoke-direct {p0}, Lo/bmx;->d()V

    .line 206
    return-void

    .line 209
    :cond_0
    invoke-direct {p0, p2, p3}, Lo/bmx;->d(II)V

    .line 210
    invoke-direct {p0}, Lo/bmx;->d()V

    .line 211
    return-void
.end method

.method public setImageWithDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 179
    invoke-direct {p0, p1}, Lo/bmx;->d(Landroid/graphics/drawable/Drawable;)V

    .line 180
    return-void
.end method

.method public setLoading(Z)V
    .locals 0

    .line 239
    iput-boolean p1, p0, Lo/bmx;->l:Z

    .line 240
    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    .line 643
    iget-boolean v0, p0, Lo/bmx;->l:Z

    if-eqz v0, :cond_0

    .line 645
    return-void

    .line 647
    :cond_0
    iput-boolean p1, p0, Lo/bmx;->p:Z

    .line 648
    invoke-virtual {p0}, Lo/bmx;->invalidate()V

    .line 649
    return-void
.end method
