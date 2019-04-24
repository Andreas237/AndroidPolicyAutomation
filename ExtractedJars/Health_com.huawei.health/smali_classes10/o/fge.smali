.class public Lo/fge;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fge$c;
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/content/Context;

.field private c:Landroid/graphics/Paint;

.field private d:Lo/fgd;

.field private e:Lo/fge$c;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fge;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fge;->b:Landroid/content/Context;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fge;->d:Lo/fgd;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fge;->c:Landroid/graphics/Paint;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fge;->a:Landroid/graphics/Paint;

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fge;->i:Z

    .line 38
    iput-object p1, p0, Lo/fge;->b:Landroid/content/Context;

    .line 39
    return-void
.end method

.method private a()V
    .locals 6

    .line 353
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 354
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init() mSlideStripParamModel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    return-void

    .line 358
    :cond_0
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->a()Lo/fgk;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fge;->a(Lo/fgk;)V

    .line 359
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->e()Lo/fgk;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fge;->a(Lo/fgk;)V

    .line 360
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->k()Lo/fgg;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fge;->d(Lo/fgg;)V

    .line 362
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->a()Lo/fgk;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgk;->a()F

    move-result v4

    .line 363
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->a()Lo/fgk;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgk;->b()I

    move-result v5

    .line 364
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fge;->c:Landroid/graphics/Paint;

    .line 365
    iget-object v0, p0, Lo/fge;->c:Landroid/graphics/Paint;

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, v4, v1

    if-eqz v1, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    const/high16 v1, 0x41200000    # 10.0f

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 367
    iget-object v0, p0, Lo/fge;->c:Landroid/graphics/Paint;

    const/4 v1, -0x1

    if-eq v5, v1, :cond_2

    move v1, v5

    goto :goto_1

    :cond_2
    const v1, -0x777778

    :goto_1
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 370
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->e()Lo/fgk;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgk;->a()F

    move-result v4

    .line 371
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->e()Lo/fgk;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgk;->b()I

    move-result v5

    .line 372
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fge;->a:Landroid/graphics/Paint;

    .line 373
    iget-object v0, p0, Lo/fge;->a:Landroid/graphics/Paint;

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, v4, v1

    if-eqz v1, :cond_3

    move v1, v4

    goto :goto_2

    :cond_3
    const/high16 v1, 0x41200000    # 10.0f

    :goto_2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 375
    iget-object v0, p0, Lo/fge;->a:Landroid/graphics/Paint;

    const/4 v1, -0x1

    if-eq v5, v1, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    const v1, -0xffff01

    :goto_3
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 377
    return-void
.end method

.method private a(Lo/fgk;)V
    .locals 5

    .line 380
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 381
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeStripModel() stripModel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    return-void

    .line 386
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/fge;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 387
    invoke-virtual {p1}, Lo/fgk;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    .line 386
    invoke-virtual {p1, v0}, Lo/fgk;->e(F)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    goto :goto_0

    .line 388
    :catch_0
    move-exception v4

    .line 390
    const-string v0, "SlideStripView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeStripModel() setmHeight id : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 391
    invoke-virtual {p1}, Lo/fgk;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 390
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    :goto_0
    :try_start_1
    iget-object v0, p0, Lo/fge;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 396
    invoke-virtual {p1}, Lo/fgk;->d()I

    move-result v1

    .line 395
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/fgk;->d(I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 401
    goto :goto_1

    .line 397
    :catch_1
    move-exception v4

    .line 399
    const-string v0, "SlideStripView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeStripModel() setmColor id : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 400
    invoke-virtual {p1}, Lo/fgk;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 399
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    :goto_1
    return-void
.end method

.method private b(F)F
    .locals 6

    .line 305
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->c()F

    move-result v0

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    .line 306
    invoke-virtual {v1}, Lo/fgd;->d()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 307
    const/4 v0, 0x0

    return v0

    .line 310
    :cond_0
    const/4 v4, 0x0

    .line 311
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->d()F

    move-result v0

    sub-float v0, p1, v0

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    .line 312
    invoke-virtual {v1}, Lo/fgd;->c()F

    move-result v1

    iget-object v2, p0, Lo/fge;->d:Lo/fgd;

    .line 313
    invoke-virtual {v2}, Lo/fgd;->d()F

    move-result v2

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    .line 314
    invoke-virtual {v1}, Lo/fgd;->i()F

    move-result v1

    sub-float/2addr v1, v4

    mul-float/2addr v0, v1

    add-float v5, v0, v4

    .line 316
    return v5
.end method

.method private d(FF)V
    .locals 6

    .line 192
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 193
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processTouch() mSlideStripParamModel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-void

    .line 197
    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_1

    .line 198
    const/4 p1, 0x0

    goto :goto_0

    .line 199
    :cond_1
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_2

    .line 200
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result p1

    .line 204
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->a()Lo/fgk;

    move-result-object v4

    .line 205
    const/4 v5, 0x0

    .line 206
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 207
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processTouch() getmBackgroundStrip is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 209
    :cond_3
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->g()F

    move-result v0

    .line 210
    invoke-virtual {v4}, Lo/fgk;->a()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 211
    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    move v0, v5

    :goto_1
    move v5, v0

    .line 212
    invoke-virtual {p0}, Lo/fge;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 214
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result v0

    invoke-virtual {v4, v0}, Lo/fgk;->c(F)V

    .line 215
    invoke-virtual {v4, v5}, Lo/fgk;->a(F)V

    .line 216
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fgk;->d(F)V

    .line 217
    invoke-virtual {v4, v5}, Lo/fgk;->b(F)V

    goto :goto_2

    .line 221
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fgk;->c(F)V

    .line 222
    invoke-virtual {v4, v5}, Lo/fgk;->a(F)V

    .line 223
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result v0

    invoke-virtual {v4, v0}, Lo/fgk;->d(F)V

    .line 224
    invoke-virtual {v4, v5}, Lo/fgk;->b(F)V

    .line 229
    :goto_2
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->e()Lo/fgk;

    move-result-object v4

    .line 230
    const/4 v0, 0x0

    if-ne v0, v4, :cond_6

    .line 231
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processTouch() getmForegroundStrip is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 233
    :cond_6
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->g()F

    move-result v0

    .line 234
    invoke-virtual {v4}, Lo/fgk;->a()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 235
    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_7

    const/4 v0, 0x0

    goto :goto_3

    :cond_7
    move v0, v5

    :goto_3
    move v5, v0

    .line 236
    invoke-virtual {p0}, Lo/fge;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 238
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result v0

    sub-float/2addr v0, p1

    invoke-virtual {v4, v0}, Lo/fgk;->c(F)V

    .line 239
    invoke-virtual {v4, v5}, Lo/fgk;->a(F)V

    .line 240
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fgk;->d(F)V

    .line 241
    invoke-virtual {v4, v5}, Lo/fgk;->b(F)V

    goto :goto_4

    .line 245
    :cond_8
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fgk;->c(F)V

    .line 246
    invoke-virtual {v4, v5}, Lo/fgk;->a(F)V

    .line 247
    invoke-virtual {v4, p1}, Lo/fgk;->d(F)V

    .line 248
    invoke-virtual {v4, v5}, Lo/fgk;->b(F)V

    .line 253
    :goto_4
    invoke-direct {p0, v5, p1, p2}, Lo/fge;->d(FFF)V

    .line 255
    invoke-virtual {p0}, Lo/fge;->invalidate()V

    .line 256
    return-void
.end method

.method private d(FFF)V
    .locals 8

    .line 259
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->k()Lo/fgg;

    move-result-object v4

    .line 260
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lo/fgg;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 261
    :cond_0
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processTouch() getmCursorModel() or getmBitmap() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 263
    :cond_1
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->g()F

    move-result v0

    .line 264
    invoke-virtual {v4}, Lo/fgg;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float p1, v0, v1

    .line 265
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    move v0, p1

    :goto_0
    move p1, v0

    .line 266
    invoke-virtual {v4, p1}, Lo/fgg;->a(F)V

    .line 267
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result v5

    .line 268
    invoke-virtual {v4}, Lo/fgg;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v6, v0

    .line 269
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v6, v0

    sub-float v7, p2, v0

    .line 270
    const/high16 v0, -0x3e000000    # -32.0f

    cmpg-float v0, v7, v0

    if-gez v0, :cond_3

    .line 271
    const/high16 v7, -0x3e000000    # -32.0f

    goto :goto_1

    .line 272
    :cond_3
    sub-float v0, v5, v7

    cmpg-float v0, v0, v6

    if-gez v0, :cond_4

    .line 273
    sub-float v7, v5, v6

    .line 275
    :cond_4
    :goto_1
    const/high16 v0, 0x42000000    # 32.0f

    add-float/2addr v0, v7

    invoke-virtual {v4, v0}, Lo/fgg;->c(F)V

    .line 279
    :goto_2
    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_5

    .line 281
    invoke-direct {p0, p2}, Lo/fge;->e(F)F

    move-result v5

    goto :goto_3

    .line 285
    :cond_5
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->c()F

    move-result v0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_6

    .line 287
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->c()F

    move-result v5

    goto :goto_3

    .line 289
    :cond_6
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->d()F

    move-result v0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_7

    .line 291
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->d()F

    move-result v5

    goto :goto_3

    .line 295
    :cond_7
    move v5, p3

    .line 298
    :goto_3
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0, v5}, Lo/fgd;->a(F)V

    .line 299
    iget-object v0, p0, Lo/fge;->e:Lo/fge$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 300
    iget-object v0, p0, Lo/fge;->e:Lo/fge$c;

    invoke-interface {v0, v5}, Lo/fge$c;->a(F)V

    .line 302
    :cond_8
    return-void
.end method

.method private d(Lo/fgg;)V
    .locals 5

    .line 405
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 406
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeCursorModel() model is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->k()Lo/fgg;

    move-result-object v0

    .line 412
    invoke-virtual {p0}, Lo/fge;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lo/fge;->d:Lo/fgd;

    .line 413
    invoke-virtual {v2}, Lo/fgd;->k()Lo/fgg;

    move-result-object v2

    .line 414
    invoke-virtual {v2}, Lo/fgg;->b()I

    move-result v2

    .line 412
    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 410
    invoke-virtual {v0, v1}, Lo/fgg;->d(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    goto :goto_0

    .line 415
    :catch_0
    move-exception v4

    .line 417
    const-string v0, "SlideStripView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeCursorModel() e : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    :goto_0
    return-void
.end method

.method private e(F)F
    .locals 7

    .line 320
    const/4 v4, 0x0

    .line 321
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result v0

    sub-float/2addr v0, v4

    float-to-double v0, v0

    const-wide v2, 0x3fb999999999999aL    # 0.1

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 322
    const/4 v0, 0x0

    return v0

    .line 325
    :cond_0
    invoke-virtual {p0}, Lo/fge;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 327
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->i()F

    move-result v0

    sub-float/2addr v0, p1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v1}, Lo/fgd;->i()F

    move-result v1

    sub-float/2addr v1, v4

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    .line 328
    invoke-virtual {v1}, Lo/fgd;->c()F

    move-result v1

    iget-object v2, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v2}, Lo/fgd;->d()F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    .line 329
    invoke-virtual {v1}, Lo/fgd;->d()F

    move-result v1

    add-float v5, v0, v1

    .line 330
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->b()F

    move-result v6

    .line 331
    float-to-double v0, v6

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 333
    div-float v0, v5, v6

    float-to-int v0, v0

    int-to-float v0, v0

    mul-float v5, v0, v6

    .line 335
    :cond_1
    return v5

    .line 339
    :cond_2
    sub-float v0, p1, v4

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v1}, Lo/fgd;->i()F

    move-result v1

    sub-float/2addr v1, v4

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    .line 340
    invoke-virtual {v1}, Lo/fgd;->c()F

    move-result v1

    iget-object v2, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v2}, Lo/fgd;->d()F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    .line 341
    invoke-virtual {v1}, Lo/fgd;->d()F

    move-result v1

    add-float v5, v0, v1

    .line 342
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->b()F

    move-result v6

    .line 343
    float-to-double v0, v6

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 345
    div-float v0, v5, v6

    float-to-int v0, v0

    int-to-float v0, v0

    mul-float v5, v0, v6

    .line 347
    :cond_3
    return v5
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 62
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 63
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 64
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw() mSlideStripParamModel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    return-void

    .line 67
    :cond_0
    const-string v0, "SlideStripView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw() mSlideStripParamModel : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fge;->d:Lo/fgd;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->a()Lo/fgk;

    move-result-object v6

    .line 71
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 72
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw() getmBackgroundStrip is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 76
    :cond_1
    invoke-virtual {p0}, Lo/fge;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    move-object v0, p1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v1}, Lo/fgd;->i()F

    move-result v1

    invoke-virtual {v6}, Lo/fgk;->e()F

    move-result v2

    sub-float/2addr v1, v2

    .line 79
    invoke-virtual {v6}, Lo/fgk;->h()F

    move-result v2

    iget-object v3, p0, Lo/fge;->d:Lo/fgd;

    .line 80
    invoke-virtual {v3}, Lo/fgd;->i()F

    move-result v3

    invoke-virtual {v6}, Lo/fgk;->k()F

    move-result v4

    sub-float/2addr v3, v4

    .line 81
    invoke-virtual {v6}, Lo/fgk;->i()F

    move-result v4

    iget-object v5, p0, Lo/fge;->c:Landroid/graphics/Paint;

    .line 78
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 86
    :cond_2
    move-object v0, p1

    invoke-virtual {v6}, Lo/fgk;->e()F

    move-result v1

    const/high16 v2, 0x40a00000    # 5.0f

    add-float/2addr v1, v2

    .line 87
    invoke-virtual {v6}, Lo/fgk;->h()F

    move-result v2

    .line 88
    invoke-virtual {v6}, Lo/fgk;->k()F

    move-result v3

    const/high16 v4, 0x40a00000    # 5.0f

    sub-float/2addr v3, v4

    .line 89
    invoke-virtual {v6}, Lo/fgk;->i()F

    move-result v4

    iget-object v5, p0, Lo/fge;->c:Landroid/graphics/Paint;

    .line 86
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 91
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 92
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->a()Lo/fgk;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgk;->b()I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 93
    invoke-virtual {v6}, Lo/fgk;->e()F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    add-float/2addr v0, v1

    invoke-virtual {v6}, Lo/fgk;->h()F

    move-result v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 94
    invoke-virtual {v6}, Lo/fgk;->k()F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    invoke-virtual {v6}, Lo/fgk;->i()F

    move-result v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 99
    :goto_0
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->e()Lo/fgk;

    move-result-object v6

    .line 100
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 101
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw() getmForegroundStrip is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 105
    :cond_3
    invoke-virtual {p0}, Lo/fge;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 107
    move-object v0, p1

    iget-object v1, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v1}, Lo/fgd;->i()F

    move-result v1

    invoke-virtual {v6}, Lo/fgk;->e()F

    move-result v2

    sub-float/2addr v1, v2

    .line 108
    invoke-virtual {v6}, Lo/fgk;->h()F

    move-result v2

    iget-object v3, p0, Lo/fge;->d:Lo/fgd;

    .line 109
    invoke-virtual {v3}, Lo/fgd;->i()F

    move-result v3

    invoke-virtual {v6}, Lo/fgk;->k()F

    move-result v4

    sub-float/2addr v3, v4

    .line 110
    invoke-virtual {v6}, Lo/fgk;->i()F

    move-result v4

    iget-object v5, p0, Lo/fge;->a:Landroid/graphics/Paint;

    .line 107
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 115
    :cond_4
    move-object v0, p1

    invoke-virtual {v6}, Lo/fgk;->e()F

    move-result v1

    const/high16 v2, 0x40a00000    # 5.0f

    add-float/2addr v1, v2

    .line 116
    invoke-virtual {v6}, Lo/fgk;->h()F

    move-result v2

    .line 117
    invoke-virtual {v6}, Lo/fgk;->k()F

    move-result v3

    const/high16 v4, 0x40a00000    # 5.0f

    sub-float/2addr v3, v4

    .line 118
    invoke-virtual {v6}, Lo/fgk;->i()F

    move-result v4

    iget-object v5, p0, Lo/fge;->a:Landroid/graphics/Paint;

    .line 115
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 120
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 122
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->e()Lo/fgk;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgk;->b()I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 123
    invoke-virtual {v6}, Lo/fgk;->e()F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    add-float/2addr v0, v1

    invoke-virtual {v6}, Lo/fgk;->h()F

    move-result v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 124
    invoke-virtual {v6}, Lo/fgk;->k()F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    invoke-virtual {v6}, Lo/fgk;->i()F

    move-result v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 129
    :goto_1
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    invoke-virtual {v0}, Lo/fgd;->k()Lo/fgg;

    move-result-object v7

    .line 130
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    invoke-virtual {v7}, Lo/fgg;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 131
    :cond_5
    const-string v0, "SlideStripView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDraw() getmCursorModel() or getmBitmap() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 133
    :cond_6
    invoke-virtual {v7}, Lo/fgg;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v7}, Lo/fgg;->a()F

    move-result v1

    const/high16 v2, 0x41800000    # 16.0f

    sub-float/2addr v1, v2

    .line 134
    invoke-virtual {v7}, Lo/fgg;->c()F

    move-result v2

    iget-object v3, p0, Lo/fge;->c:Landroid/graphics/Paint;

    .line 133
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 136
    :goto_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 53
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 54
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 55
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Lo/fgd;->c(F)V

    .line 56
    iget-object v0, p0, Lo/fge;->d:Lo/fgd;

    int-to-float v1, v2

    invoke-virtual {v0, v1}, Lo/fgd;->e(F)V

    .line 57
    invoke-virtual {p0, v2, v3}, Lo/fge;->setMeasuredDimension(II)V

    .line 58
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 140
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 142
    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fge;->i:Z

    .line 143
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {p0, v0, v1}, Lo/fge;->d(FF)V

    .line 144
    goto :goto_0

    .line 146
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {p0, v0, v1}, Lo/fge;->d(FF)V

    .line 147
    goto :goto_0

    .line 149
    :pswitch_2
    invoke-virtual {p0}, Lo/fge;->performClick()Z

    .line 150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fge;->i:Z

    .line 151
    goto :goto_0

    .line 153
    :pswitch_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fge;->i:Z

    .line 154
    .line 159
    :goto_0
    iget-boolean v0, p0, Lo/fge;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_1
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public performClick()Z
    .locals 1

    .line 164
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    return v0
.end method

.method public setCurrentValue(F)V
    .locals 1

    .line 176
    invoke-virtual {p0}, Lo/fge;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    const/high16 v0, 0x447a0000    # 1000.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    .line 178
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    const/high16 v0, 0x43a50000    # 330.0f

    sub-float/2addr v0, p1

    invoke-direct {p0, v0}, Lo/fge;->b(F)F

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/fge;->d(FF)V

    goto :goto_0

    .line 181
    :cond_0
    const/high16 v0, 0x43160000    # 150.0f

    sub-float/2addr v0, p1

    invoke-direct {p0, v0}, Lo/fge;->b(F)F

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/fge;->d(FF)V

    goto :goto_0

    .line 184
    :cond_1
    const v0, 0x46abe000    # 22000.0f

    sub-float/2addr v0, p1

    invoke-direct {p0, v0}, Lo/fge;->b(F)F

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/fge;->d(FF)V

    goto :goto_0

    .line 187
    :cond_2
    invoke-direct {p0, p1}, Lo/fge;->b(F)F

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/fge;->d(FF)V

    .line 189
    :goto_0
    return-void
.end method

.method public setOnSeekChangeListener(Lo/fge$c;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/fge;->e:Lo/fge$c;

    .line 43
    return-void
.end method

.method public setmSlideStripParamModel(Lo/fgd;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/fge;->d:Lo/fgd;

    .line 48
    invoke-direct {p0}, Lo/fge;->a()V

    .line 49
    return-void
.end method
