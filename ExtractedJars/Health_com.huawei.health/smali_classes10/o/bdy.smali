.class public Lo/bdy;
.super Landroid/widget/ImageView;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private a:F

.field private b:I

.field private d:I

.field private e:J

.field private f:F

.field private g:Z

.field private h:F

.field private i:Z

.field private k:Z

.field private l:I

.field private m:Z

.field private n:Z

.field private o:I

.field private p:Landroid/graphics/Movie;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-string v0, "GifView"

    sput-object v0, Lo/bdy;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 81
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->b:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->d:I

    .line 46
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/bdy;->a:F

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->h:F

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->f:F

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->i:Z

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->n:Z

    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 87
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->b:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->d:I

    .line 46
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/bdy;->a:F

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->h:F

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->f:F

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->i:Z

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->n:Z

    .line 88
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 93
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->b:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->d:I

    .line 46
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/bdy;->a:F

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->h:F

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->f:F

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->i:Z

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->n:Z

    .line 94
    return-void
.end method

.method private c()V
    .locals 4

    .line 441
    iget v0, p0, Lo/bdy;->o:I

    invoke-virtual {p0}, Lo/bdy;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lo/bdy;->getPaddingRight()I

    move-result v1

    sub-int v2, v0, v1

    .line 442
    iget v0, p0, Lo/bdy;->l:I

    invoke-virtual {p0}, Lo/bdy;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lo/bdy;->getPaddingBottom()I

    move-result v1

    sub-int v3, v0, v1

    .line 443
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    invoke-virtual {v0}, Landroid/graphics/Movie;->width()I

    move-result v0

    iput v0, p0, Lo/bdy;->b:I

    .line 444
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    invoke-virtual {v0}, Landroid/graphics/Movie;->height()I

    move-result v0

    iput v0, p0, Lo/bdy;->d:I

    .line 446
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    iget v0, p0, Lo/bdy;->b:I

    if-eqz v0, :cond_1

    iget v0, p0, Lo/bdy;->d:I

    if-eqz v0, :cond_1

    .line 448
    iget v0, p0, Lo/bdy;->b:I

    mul-int/2addr v0, v3

    iget v1, p0, Lo/bdy;->d:I

    mul-int/2addr v1, v2

    if-le v0, v1, :cond_0

    .line 450
    int-to-float v0, v2

    iget v1, p0, Lo/bdy;->b:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/bdy;->a:F

    .line 451
    iget v0, p0, Lo/bdy;->d:I

    int-to-float v0, v0

    iget v1, p0, Lo/bdy;->a:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lo/bdy;->d:I

    .line 452
    iput v2, p0, Lo/bdy;->b:I

    goto :goto_0

    .line 456
    :cond_0
    int-to-float v0, v3

    iget v1, p0, Lo/bdy;->d:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/bdy;->a:F

    .line 457
    iget v0, p0, Lo/bdy;->b:I

    int-to-float v0, v0

    iget v1, p0, Lo/bdy;->a:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lo/bdy;->b:I

    .line 458
    iput v3, p0, Lo/bdy;->d:I

    .line 461
    :cond_1
    :goto_0
    iget v0, p0, Lo/bdy;->b:I

    sub-int v0, v2, v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bdy;->a:F

    div-float/2addr v0, v1

    iput v0, p0, Lo/bdy;->h:F

    .line 462
    iget v0, p0, Lo/bdy;->d:I

    sub-int v0, v3, v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bdy;->a:F

    div-float/2addr v0, v1

    iput v0, p0, Lo/bdy;->f:F

    .line 464
    return-void
.end method

.method static synthetic c(Lo/bdy;)Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lo/bdy;->g:Z

    return v0
.end method

.method private d(Ljava/io/InputStream;)Z
    .locals 5

    .line 267
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/bdy;->setLayerType(ILandroid/graphics/Paint;)V

    .line 270
    :try_start_0
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    const-string v1, "stream to byetes start. "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    invoke-direct {p0, p1}, Lo/bdy;->e(Ljava/io/InputStream;)[B

    move-result-object v3

    .line 272
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    const-string v1, "stream to byetes end. "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    array-length v0, v3

    const/4 v1, 0x0

    invoke-static {v3, v1, v0}, Landroid/graphics/Movie;->decodeByteArray([BII)Landroid/graphics/Movie;

    move-result-object v0

    iput-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    .line 274
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    invoke-virtual {v0}, Landroid/graphics/Movie;->width()I

    move-result v0

    iput v0, p0, Lo/bdy;->b:I

    .line 275
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    invoke-virtual {v0}, Landroid/graphics/Movie;->height()I

    move-result v0

    iput v0, p0, Lo/bdy;->d:I

    .line 284
    iget v0, p0, Lo/bdy;->b:I

    if-lez v0, :cond_0

    iget v0, p0, Lo/bdy;->d:I

    if-lez v0, :cond_0

    .line 286
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdy;->k:Z

    .line 287
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->g:Z

    .line 288
    iget v0, p0, Lo/bdy;->b:I

    iget v1, p0, Lo/bdy;->d:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 289
    invoke-super {p0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 290
    const/4 v0, 0x1

    return v0

    .line 294
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 297
    :catch_0
    move-exception v3

    .line 299
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    const-string v1, "setGifImageByIs RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    goto :goto_0

    .line 301
    :catch_1
    move-exception v3

    .line 303
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    const-string v1, "setGifImageByIs Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private e(Ljava/io/InputStream;)[B
    .locals 6

    .line 317
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x400

    invoke-direct {v2, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 318
    const/16 v0, 0x400

    new-array v3, v0, [B

    .line 322
    :goto_0
    :try_start_0
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v4, v0

    if-ltz v0, :cond_0

    .line 324
    const/4 v0, 0x0

    invoke-virtual {v2, v3, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 330
    :cond_0
    goto :goto_1

    .line 327
    :catch_0
    move-exception v5

    .line 329
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    const-string v1, "streamToBytes IOException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    :goto_1
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 471
    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 472
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    .line 473
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->k:Z

    .line 474
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdy;->g:Z

    .line 475
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->m:Z

    .line 476
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->b:I

    .line 477
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->d:I

    .line 478
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->o:I

    .line 479
    const/4 v0, 0x0

    iput v0, p0, Lo/bdy;->l:I

    .line 480
    return-void
.end method

.method public getGifImgTime()I
    .locals 1

    .line 559
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    if-eqz v0, :cond_0

    .line 561
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    invoke-virtual {v0}, Landroid/graphics/Movie;->duration()I

    move-result v0

    return v0

    .line 565
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getMovieHeight()I
    .locals 1

    .line 520
    iget v0, p0, Lo/bdy;->d:I

    return v0
.end method

.method public getMovieWidth()I
    .locals 1

    .line 512
    iget v0, p0, Lo/bdy;->b:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 368
    iget-boolean v0, p0, Lo/bdy;->k:Z

    if-nez v0, :cond_0

    .line 370
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 371
    return-void

    .line 374
    :cond_0
    iget-boolean v0, p0, Lo/bdy;->m:Z

    if-nez v0, :cond_1

    .line 376
    invoke-direct {p0}, Lo/bdy;->c()V

    .line 377
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdy;->m:Z

    .line 378
    invoke-virtual {p0}, Lo/bdy;->invalidate()V

    .line 379
    return-void

    .line 382
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    .line 383
    iget-wide v0, p0, Lo/bdy;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 385
    iput-wide v4, p0, Lo/bdy;->e:J

    .line 388
    :cond_2
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    invoke-virtual {v0}, Landroid/graphics/Movie;->duration()I

    move-result v6

    .line 389
    if-nez v6, :cond_3

    .line 391
    const/16 v6, 0x7d0

    .line 394
    :cond_3
    iget-boolean v0, p0, Lo/bdy;->n:Z

    if-eqz v0, :cond_4

    iget-wide v0, p0, Lo/bdy;->e:J

    sub-long v0, v4, v0

    int-to-long v2, v6

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 396
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    const-string v1, "playOnceMode is ture && play end"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    return-void

    .line 400
    :cond_4
    iget-wide v0, p0, Lo/bdy;->e:J

    sub-long v0, v4, v0

    int-to-long v2, v6

    rem-long/2addr v0, v2

    long-to-int v7, v0

    .line 401
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    invoke-virtual {v0, v7}, Landroid/graphics/Movie;->setTime(I)Z

    .line 403
    iget v0, p0, Lo/bdy;->a:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_5

    .line 405
    iget v0, p0, Lo/bdy;->a:F

    iget v1, p0, Lo/bdy;->a:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 408
    :cond_5
    invoke-virtual {p0}, Lo/bdy;->getPaddingTop()I

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lo/bdy;->getPaddingLeft()I

    move-result v0

    if-nez v0, :cond_6

    .line 410
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    iget v1, p0, Lo/bdy;->h:F

    iget v2, p0, Lo/bdy;->f:F

    invoke-virtual {v0, p1, v1, v2}, Landroid/graphics/Movie;->draw(Landroid/graphics/Canvas;FF)V

    goto :goto_0

    .line 414
    :cond_6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getSaveCount()I

    move-result v8

    .line 415
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 416
    invoke-virtual {p0}, Lo/bdy;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo/bdy;->a:F

    div-float/2addr v0, v1

    invoke-virtual {p0}, Lo/bdy;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lo/bdy;->a:F

    div-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 417
    iget-object v0, p0, Lo/bdy;->p:Landroid/graphics/Movie;

    iget v1, p0, Lo/bdy;->h:F

    iget v2, p0, Lo/bdy;->f:F

    invoke-virtual {v0, p1, v1, v2}, Landroid/graphics/Movie;->draw(Landroid/graphics/Canvas;FF)V

    .line 418
    invoke-virtual {p1, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 421
    :goto_0
    iget-boolean v0, p0, Lo/bdy;->g:Z

    if-nez v0, :cond_7

    .line 423
    new-instance v0, Lo/bdy$1;

    invoke-direct {v0, p0}, Lo/bdy$1;-><init>(Lo/bdy;)V

    const-wide/16 v1, 0x64

    invoke-virtual {p0, v0, v1, v2}, Lo/bdy;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 434
    :cond_7
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 342
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 344
    invoke-virtual {p0}, Lo/bdy;->getMeasuredWidth()I

    move-result v0

    iget v1, p0, Lo/bdy;->o:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lo/bdy;->getMeasuredHeight()I

    move-result v0

    iget v1, p0, Lo/bdy;->l:I

    if-eq v0, v1, :cond_1

    .line 346
    :cond_0
    invoke-virtual {p0}, Lo/bdy;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/bdy;->o:I

    .line 347
    invoke-virtual {p0}, Lo/bdy;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/bdy;->l:I

    .line 349
    iget-boolean v0, p0, Lo/bdy;->i:Z

    if-eqz v0, :cond_1

    .line 351
    iget v0, p0, Lo/bdy;->o:I

    iget v1, p0, Lo/bdy;->l:I

    invoke-virtual {p0, v0, v1}, Lo/bdy;->setGifCenter(II)V

    .line 355
    :cond_1
    iget-boolean v0, p0, Lo/bdy;->k:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lo/bdy;->m:Z

    if-eqz v0, :cond_2

    .line 357
    invoke-direct {p0}, Lo/bdy;->c()V

    .line 359
    :cond_2
    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    .line 490
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onVisibilityChanged(Landroid/view/View;I)V

    .line 491
    iget-boolean v0, p0, Lo/bdy;->k:Z

    if-nez v0, :cond_0

    .line 493
    return-void

    .line 496
    :cond_0
    if-nez p2, :cond_1

    .line 498
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdy;->g:Z

    .line 499
    invoke-virtual {p0}, Lo/bdy;->invalidate()V

    goto :goto_0

    .line 503
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdy;->g:Z

    .line 505
    :goto_0
    return-void
.end method

.method public setGifCenter(II)V
    .locals 8

    .line 525
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdy;->i:Z

    .line 527
    invoke-virtual {p0}, Lo/bdy;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 528
    const/4 v0, -0x2

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 529
    const/4 v0, -0x2

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 530
    invoke-virtual {p0, v3}, Lo/bdy;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 532
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 534
    invoke-virtual {p0}, Lo/bdy;->getMovieHeight()I

    move-result v6

    .line 535
    invoke-virtual {p0}, Lo/bdy;->getMovieWidth()I

    move-result v7

    .line 537
    if-ge v6, p2, :cond_0

    .line 539
    sub-int v0, p2, v6

    div-int/lit8 v5, v0, 0x2

    .line 542
    :cond_0
    if-ge v7, p1, :cond_1

    .line 544
    sub-int v0, p1, v7

    div-int/lit8 v4, v0, 0x2

    .line 548
    :cond_1
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setGifCenter deltaX = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " deltaY = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    invoke-virtual {p0, v4, v5, v4, v5}, Lo/bdy;->setPadding(IIII)V

    .line 550
    return-void
.end method

.method public setGifImageById(I)V
    .locals 4

    .line 167
    invoke-virtual {p0}, Lo/bdy;->d()V

    .line 168
    invoke-virtual {p0}, Lo/bdy;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    .line 169
    invoke-direct {p0, v2}, Lo/bdy;->d(Ljava/io/InputStream;)Z

    .line 170
    if-eqz v2, :cond_0

    .line 174
    :try_start_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    goto :goto_0

    .line 176
    :catch_0
    move-exception v3

    .line 178
    sget-object v0, Lo/bdy;->c:Ljava/lang/String;

    const-string v1, "setGifImageById IOException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    :cond_0
    :goto_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 102
    invoke-virtual {p0}, Lo/bdy;->d()V

    .line 103
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 104
    return-void
.end method
