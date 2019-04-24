.class public Lo/ebs;
.super Landroid/widget/ImageView;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ebs$d;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:F

.field public c:F

.field private d:F

.field private final e:[F

.field private f:Landroid/view/GestureDetector;

.field private final g:Landroid/graphics/Matrix;

.field private h:Z

.field private i:I

.field private k:Landroid/view/ScaleGestureDetector;

.field private l:F

.field private m:Z

.field private n:I

.field private o:F

.field private p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 66
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ebs;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 67
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 70
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lo/ebs;->c:F

    .line 32
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/ebs;->d:F

    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/ebs;->b:F

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ebs;->a:Z

    .line 43
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lo/ebs;->e:[F

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ebs;->k:Landroid/view/ScaleGestureDetector;

    .line 47
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    .line 72
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lo/ebs;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 73
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lo/ebs$1;

    invoke-direct {v1, p0}, Lo/ebs$1;-><init>(Lo/ebs;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/ebs;->f:Landroid/view/GestureDetector;

    .line 95
    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-direct {v0, p1, p0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lo/ebs;->k:Landroid/view/ScaleGestureDetector;

    .line 96
    invoke-virtual {p0, p0}, Lo/ebs;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 97
    return-void
.end method

.method static synthetic a(Lo/ebs;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/ebs;->e()V

    return-void
.end method

.method static synthetic b(Lo/ebs;)F
    .locals 1

    .line 28
    iget v0, p0, Lo/ebs;->d:F

    return v0
.end method

.method static synthetic c(Lo/ebs;)F
    .locals 1

    .line 28
    iget v0, p0, Lo/ebs;->b:F

    return v0
.end method

.method static synthetic c(Lo/ebs;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lo/ebs;->h:Z

    return p1
.end method

.method static synthetic d(Lo/ebs;)Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lo/ebs;->h:Z

    return v0
.end method

.method static synthetic e(Lo/ebs;)Landroid/graphics/Matrix;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    return-object v0
.end method

.method private e()V
    .locals 9

    .line 382
    invoke-direct {p0}, Lo/ebs;->getMatrixRectF()Landroid/graphics/RectF;

    move-result-object v4

    .line 383
    const/4 v5, 0x0

    .line 384
    const/4 v6, 0x0

    .line 386
    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v7

    .line 387
    invoke-virtual {p0}, Lo/ebs;->getHeight()I

    move-result v8

    .line 390
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    add-double/2addr v0, v2

    iget v2, p0, Lo/ebs;->p:I

    mul-int/lit8 v2, v2, 0x2

    sub-int v2, v7, v2

    int-to-double v2, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1

    .line 391
    iget v0, v4, Landroid/graphics/RectF;->left:F

    iget v1, p0, Lo/ebs;->p:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 392
    iget v0, v4, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    iget v1, p0, Lo/ebs;->p:I

    int-to-float v1, v1

    add-float v5, v0, v1

    .line 395
    :cond_0
    iget v0, v4, Landroid/graphics/RectF;->right:F

    iget v1, p0, Lo/ebs;->p:I

    sub-int v1, v7, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 396
    iget v0, p0, Lo/ebs;->p:I

    sub-int v0, v7, v0

    int-to-float v0, v0

    iget v1, v4, Landroid/graphics/RectF;->right:F

    sub-float v5, v0, v1

    .line 400
    :cond_1
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    add-double/2addr v0, v2

    invoke-direct {p0}, Lo/ebs;->getHVerticalPadding()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    sub-int v2, v8, v2

    int-to-double v2, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_3

    .line 401
    iget v0, v4, Landroid/graphics/RectF;->top:F

    invoke-direct {p0}, Lo/ebs;->getHVerticalPadding()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 402
    iget v0, v4, Landroid/graphics/RectF;->top:F

    neg-float v0, v0

    invoke-direct {p0}, Lo/ebs;->getHVerticalPadding()I

    move-result v1

    int-to-float v1, v1

    add-float v6, v0, v1

    .line 405
    :cond_2
    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {p0}, Lo/ebs;->getHVerticalPadding()I

    move-result v1

    sub-int v1, v8, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 406
    invoke-direct {p0}, Lo/ebs;->getHVerticalPadding()I

    move-result v0

    sub-int v0, v8, v0

    int-to-float v0, v0

    iget v1, v4, Landroid/graphics/RectF;->bottom:F

    sub-float v6, v0, v1

    .line 410
    :cond_3
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 411
    return-void
.end method

.method private e(FF)Z
    .locals 4

    .line 421
    mul-float v0, p1, p1

    mul-float v1, p2, p2

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iget v2, p0, Lo/ebs;->i:I

    int-to-double v2, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getHVerticalPadding()I
    .locals 4

    .line 429
    invoke-virtual {p0}, Lo/ebs;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v1

    iget v2, p0, Lo/ebs;->p:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method private getMatrixRectF()Landroid/graphics/RectF;
    .locals 7

    .line 188
    iget-object v4, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    .line 189
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 190
    invoke-virtual {p0}, Lo/ebs;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 191
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 192
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 193
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 195
    :cond_0
    return-object v5
.end method


# virtual methods
.method public b()Landroid/graphics/Bitmap;
    .locals 10

    .line 360
    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/ebs;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 362
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 363
    const/16 v8, 0x64

    .line 364
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v6, v0, v8, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 365
    :goto_0
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    div-int/lit16 v0, v0, 0x400

    const/16 v1, 0x1f4

    if-le v0, v1, :cond_0

    .line 366
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 367
    add-int/lit8 v8, v8, -0xa

    .line 368
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v6, v0, v8, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_0

    .line 371
    :cond_0
    new-instance v9, Landroid/graphics/Canvas;

    invoke-direct {v9, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 372
    invoke-virtual {p0, v9}, Lo/ebs;->draw(Landroid/graphics/Canvas;)V

    .line 373
    iget v0, p0, Lo/ebs;->p:I

    .line 374
    invoke-direct {p0}, Lo/ebs;->getHVerticalPadding()I

    move-result v1

    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v2

    iget v3, p0, Lo/ebs;->p:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    .line 375
    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v3

    iget v4, p0, Lo/ebs;->p:I

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    .line 373
    invoke-static {v6, v0, v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final getScale()F
    .locals 2

    .line 282
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/ebs;->e:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 283
    iget-object v0, p0, Lo/ebs;->e:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 288
    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    .line 289
    invoke-virtual {p0}, Lo/ebs;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 290
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 294
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 295
    invoke-virtual {p0}, Lo/ebs;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 296
    return-void
.end method

.method public onGlobalLayout()V
    .locals 13

    .line 301
    iget-boolean v0, p0, Lo/ebs;->a:Z

    if-eqz v0, :cond_7

    .line 302
    invoke-virtual {p0}, Lo/ebs;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 303
    if-nez v4, :cond_0

    .line 304
    return-void

    .line 309
    :cond_0
    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v5

    .line 310
    invoke-virtual {p0}, Lo/ebs;->getHeight()I

    move-result v6

    .line 312
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v7

    .line 313
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v8

    .line 314
    const/high16 v9, 0x3f800000    # 1.0f

    .line 316
    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v0

    iget v1, p0, Lo/ebs;->p:I

    mul-int/lit8 v1, v1, 0x2

    sub-int v10, v0, v1

    .line 319
    if-le v7, v10, :cond_1

    if-ge v8, v10, :cond_1

    .line 320
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v8

    div-float v9, v0, v1

    goto :goto_0

    .line 321
    :cond_1
    if-le v8, v10, :cond_2

    if-ge v7, v10, :cond_2

    .line 322
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v7

    div-float v9, v0, v1

    goto :goto_0

    .line 323
    :cond_2
    if-le v7, v10, :cond_3

    if-le v8, v10, :cond_3

    .line 324
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v7

    div-float v11, v0, v1

    .line 325
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v8

    div-float v12, v0, v1

    .line 326
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 330
    :cond_3
    :goto_0
    if-ge v7, v10, :cond_4

    if-le v8, v10, :cond_4

    .line 331
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v7

    div-float v9, v0, v1

    goto :goto_1

    .line 332
    :cond_4
    if-ge v8, v10, :cond_5

    if-le v7, v10, :cond_5

    .line 333
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v8

    div-float v9, v0, v1

    goto :goto_1

    .line 334
    :cond_5
    if-ge v7, v10, :cond_6

    if-ge v8, v10, :cond_6

    .line 335
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v7

    div-float v11, v0, v1

    .line 336
    int-to-float v0, v10

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v8

    div-float v12, v0, v1

    .line 337
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 340
    :cond_6
    :goto_1
    iput v9, p0, Lo/ebs;->b:F

    .line 341
    iget v0, p0, Lo/ebs;->b:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/ebs;->d:F

    .line 342
    iget v0, p0, Lo/ebs;->b:F

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/ebs;->c:F

    .line 343
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    sub-int v1, v5, v7

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-int v2, v6, v8

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 345
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    .line 346
    invoke-virtual {p0}, Lo/ebs;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 345
    invoke-virtual {v0, v9, v9, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 349
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lo/ebs;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 350
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ebs;->a:Z

    .line 352
    :cond_7
    return-void
.end method

.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 5

    .line 151
    invoke-virtual {p0}, Lo/ebs;->getScale()F

    move-result v3

    .line 152
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v4

    .line 154
    invoke-virtual {p0}, Lo/ebs;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 155
    const/4 v0, 0x1

    return v0

    .line 160
    :cond_0
    iget v0, p0, Lo/ebs;->c:F

    cmpg-float v0, v3, v0

    if-gez v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v4, v0

    if-gtz v0, :cond_2

    :cond_1
    iget v0, p0, Lo/ebs;->b:F

    cmpl-float v0, v3, v0

    if-lez v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v4, v0

    if-gez v0, :cond_5

    .line 165
    :cond_2
    mul-float v0, v4, v3

    iget v1, p0, Lo/ebs;->b:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 166
    iget v0, p0, Lo/ebs;->b:F

    div-float v4, v0, v3

    .line 168
    :cond_3
    mul-float v0, v4, v3

    iget v1, p0, Lo/ebs;->c:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 169
    iget v0, p0, Lo/ebs;->c:F

    div-float v4, v0, v3

    .line 174
    :cond_4
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    .line 175
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v2

    .line 174
    invoke-virtual {v0, v4, v4, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 176
    invoke-direct {p0}, Lo/ebs;->e()V

    .line 177
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lo/ebs;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 179
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 1

    .line 200
    const/4 v0, 0x1

    return v0
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    .line 205
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .line 209
    iget-object v0, p0, Lo/ebs;->f:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    const/4 v0, 0x1

    return v0

    .line 211
    :cond_0
    iget-object v0, p0, Lo/ebs;->k:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 213
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 215
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    .line 217
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    .line 218
    invoke-virtual {p2, v7}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    add-float/2addr v4, v0

    .line 219
    invoke-virtual {p2, v7}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    add-float/2addr v5, v0

    .line 217
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 221
    :cond_1
    int-to-float v0, v6

    div-float/2addr v4, v0

    .line 222
    int-to-float v0, v6

    div-float/2addr v5, v0

    .line 227
    iget v0, p0, Lo/ebs;->n:I

    if-eq v6, v0, :cond_2

    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ebs;->m:Z

    .line 229
    iput v4, p0, Lo/ebs;->o:F

    .line 230
    iput v5, p0, Lo/ebs;->l:F

    .line 233
    :cond_2
    iput v6, p0, Lo/ebs;->n:I

    .line 234
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 236
    :pswitch_0
    iget v0, p0, Lo/ebs;->o:F

    sub-float v7, v4, v0

    .line 237
    iget v0, p0, Lo/ebs;->l:F

    sub-float v8, v5, v0

    .line 239
    iget-boolean v0, p0, Lo/ebs;->m:Z

    if-nez v0, :cond_3

    .line 240
    invoke-direct {p0, v7, v8}, Lo/ebs;->e(FF)Z

    move-result v0

    iput-boolean v0, p0, Lo/ebs;->m:Z

    .line 242
    :cond_3
    iget-boolean v0, p0, Lo/ebs;->m:Z

    if-eqz v0, :cond_6

    .line 243
    invoke-virtual {p0}, Lo/ebs;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 245
    invoke-direct {p0}, Lo/ebs;->getMatrixRectF()Landroid/graphics/RectF;

    move-result-object v9

    .line 247
    invoke-virtual {v9}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p0}, Lo/ebs;->getWidth()I

    move-result v1

    iget v2, p0, Lo/ebs;->p:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_4

    .line 248
    const/4 v7, 0x0

    .line 252
    :cond_4
    invoke-virtual {v9}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-virtual {p0}, Lo/ebs;->getHeight()I

    move-result v1

    invoke-direct {p0}, Lo/ebs;->getHVerticalPadding()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 254
    const/4 v8, 0x0

    .line 256
    :cond_5
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, v7, v8}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 257
    invoke-direct {p0}, Lo/ebs;->e()V

    .line 258
    iget-object v0, p0, Lo/ebs;->g:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lo/ebs;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 261
    :cond_6
    iput v4, p0, Lo/ebs;->o:F

    .line 262
    iput v5, p0, Lo/ebs;->l:F

    .line 263
    goto :goto_1

    .line 267
    :pswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ebs;->n:I

    .line 268
    .line 273
    :goto_1
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public setHorizontalPadding(I)V
    .locals 0

    .line 425
    iput p1, p0, Lo/ebs;->p:I

    .line 426
    return-void
.end method
