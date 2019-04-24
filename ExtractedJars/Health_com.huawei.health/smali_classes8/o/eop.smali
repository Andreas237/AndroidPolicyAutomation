.class public Lo/eop;
.super Landroid/widget/ListView;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/widget/ImageView;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private l:I

.field private m:Z

.field private n:I

.field private o:Landroid/view/WindowManager;

.field private p:Landroid/view/WindowManager$LayoutParams;

.field private q:I

.field private r:I

.field private s:Z

.field private t:Z

.field private u:Z

.field private x:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 79
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lo/eop;->k:I

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eop;->m:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eop;->t:Z

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eop;->s:Z

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eop;->u:Z

    .line 76
    const/4 v0, -0x1

    iput v0, p0, Lo/eop;->x:I

    .line 80
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eop;->setLayerType(ILandroid/graphics/Paint;)V

    .line 81
    invoke-virtual {p0}, Lo/eop;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lo/eop;->o:Landroid/view/WindowManager;

    .line 82
    return-void
.end method

.method private a(I)I
    .locals 1

    .line 419
    iget v0, p0, Lo/eop;->q:I

    if-ge p1, v0, :cond_0

    .line 420
    iget v0, p0, Lo/eop;->q:I

    return v0

    .line 421
    :cond_0
    iget v0, p0, Lo/eop;->r:I

    if-le p1, v0, :cond_1

    .line 422
    iget v0, p0, Lo/eop;->r:I

    return v0

    .line 424
    :cond_1
    return p1
.end method

.method private a(II)V
    .locals 2

    .line 374
    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eot;

    .line 375
    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Lo/eot;->a(I)V

    .line 376
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/eot;->b(Z)V

    .line 377
    invoke-virtual {v1}, Lo/eot;->notifyDataSetChanged()V

    .line 378
    return-void
.end method

.method private b()V
    .locals 3

    .line 483
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eop;->m:Z

    .line 485
    iget-object v0, p0, Lo/eop;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 486
    iget-object v0, p0, Lo/eop;->o:Landroid/view/WindowManager;

    iget-object v1, p0, Lo/eop;->c:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 487
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eop;->c:Landroid/widget/ImageView;

    .line 490
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eop;->u:Z

    .line 491
    const/4 v0, -0x1

    iput v0, p0, Lo/eop;->x:I

    .line 492
    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eot;

    .line 493
    iget v0, p0, Lo/eop;->x:I

    invoke-virtual {v2, v0}, Lo/eot;->c(I)V

    .line 494
    invoke-virtual {v2}, Lo/eot;->e()V

    .line 495
    return-void
.end method

.method private b(I)V
    .locals 11

    .line 278
    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eot;

    .line 279
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lo/eop;->pointToPosition(II)I

    move-result v3

    .line 281
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    iget v0, p0, Lo/eop;->e:I

    if-ne v3, v0, :cond_1

    .line 282
    :cond_0
    return-void

    .line 286
    :cond_1
    iput v3, p0, Lo/eop;->d:I

    .line 287
    iget v0, p0, Lo/eop;->e:I

    iget v1, p0, Lo/eop;->d:I

    invoke-direct {p0, v0, v1}, Lo/eop;->d(II)V

    .line 288
    iget v0, p0, Lo/eop;->e:I

    sub-int v4, v3, v0

    .line 289
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 291
    const/4 v6, 0x1

    :goto_0
    if-gt v6, v5, :cond_e

    .line 294
    if-lez v4, :cond_7

    .line 296
    iget v0, p0, Lo/eop;->x:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 297
    const/4 v0, 0x0

    iput v0, p0, Lo/eop;->x:I

    .line 298
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eop;->u:Z

    .line 301
    :cond_2
    iget v0, p0, Lo/eop;->x:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 303
    const/4 v0, 0x0

    iput v0, p0, Lo/eop;->x:I

    .line 304
    iget-boolean v0, p0, Lo/eop;->u:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/eop;->u:Z

    .line 307
    :cond_4
    iget-boolean v0, p0, Lo/eop;->u:Z

    if-eqz v0, :cond_5

    .line 308
    iget v0, p0, Lo/eop;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eop;->l:I

    goto :goto_2

    .line 310
    :cond_5
    iget v0, p0, Lo/eop;->a:I

    if-ge v0, v3, :cond_6

    .line 311
    iget v0, p0, Lo/eop;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eop;->l:I

    .line 312
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eop;->u:Z

    goto :goto_2

    .line 314
    :cond_6
    iget v0, p0, Lo/eop;->e:I

    iput v0, p0, Lo/eop;->l:I

    .line 318
    :goto_2
    const/4 v7, 0x0

    .line 319
    iget v0, p0, Lo/eop;->k:I

    neg-int v8, v0

    .line 320
    iget v0, p0, Lo/eop;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eop;->e:I

    goto :goto_5

    .line 324
    :cond_7
    iget v0, p0, Lo/eop;->x:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    .line 325
    const/4 v0, 0x1

    iput v0, p0, Lo/eop;->x:I

    .line 326
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eop;->u:Z

    .line 329
    :cond_8
    iget v0, p0, Lo/eop;->x:I

    if-nez v0, :cond_a

    .line 331
    const/4 v0, 0x1

    iput v0, p0, Lo/eop;->x:I

    .line 332
    iget-boolean v0, p0, Lo/eop;->u:Z

    if-nez v0, :cond_9

    const/4 v0, 0x1

    goto :goto_3

    :cond_9
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lo/eop;->u:Z

    .line 335
    :cond_a
    iget-boolean v0, p0, Lo/eop;->u:Z

    if-eqz v0, :cond_b

    .line 336
    iget v0, p0, Lo/eop;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/eop;->l:I

    goto :goto_4

    .line 339
    :cond_b
    iget v0, p0, Lo/eop;->a:I

    if-le v0, v3, :cond_c

    .line 340
    iget v0, p0, Lo/eop;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/eop;->l:I

    .line 341
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eop;->u:Z

    goto :goto_4

    .line 343
    :cond_c
    iget v0, p0, Lo/eop;->e:I

    iput v0, p0, Lo/eop;->l:I

    .line 348
    :goto_4
    const/4 v7, 0x0

    .line 349
    iget v8, p0, Lo/eop;->k:I

    .line 350
    iget v0, p0, Lo/eop;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/eop;->e:I

    .line 354
    :goto_5
    iget v0, p0, Lo/eop;->k:I

    invoke-virtual {v2, v0}, Lo/eot;->d(I)V

    .line 356
    iget v0, p0, Lo/eop;->x:I

    invoke-virtual {v2, v0}, Lo/eot;->c(I)V

    .line 358
    iget v0, p0, Lo/eop;->l:I

    .line 359
    invoke-virtual {p0}, Lo/eop;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    .line 358
    invoke-virtual {p0, v0}, Lo/eop;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/ViewGroup;

    .line 362
    iget-boolean v0, p0, Lo/eop;->u:Z

    if-eqz v0, :cond_d

    .line 363
    invoke-virtual {p0, v7, v8}, Lo/eop;->e(II)Landroid/view/animation/Animation;

    move-result-object v10

    goto :goto_6

    .line 365
    :cond_d
    neg-int v0, v8

    invoke-direct {p0, v7, v0}, Lo/eop;->c(II)Landroid/view/animation/Animation;

    move-result-object v10

    .line 368
    :goto_6
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 291
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 371
    :cond_e
    return-void
.end method

.method private c(II)Landroid/view/animation/Animation;
    .locals 10

    .line 532
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    int-to-float v2, p1

    int-to-float v6, p2

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    move-object v9, v0

    .line 535
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 536
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 537
    const-wide/16 v0, 0xc8

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 538
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 539
    return-object v9
.end method

.method private c(I)V
    .locals 4

    .line 446
    iget v0, p0, Lo/eop;->b:I

    sub-int v3, p1, v0

    .line 447
    iget-object v0, p0, Lo/eop;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    if-ltz v3, :cond_0

    .line 448
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 449
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lo/eop;->b:I

    sub-int v1, p1, v1

    iget v2, p0, Lo/eop;->g:I

    add-int/2addr v1, v2

    invoke-direct {p0, v1}, Lo/eop;->a(I)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 450
    iget-object v0, p0, Lo/eop;->o:Landroid/view/WindowManager;

    iget-object v1, p0, Lo/eop;->c:Landroid/widget/ImageView;

    iget-object v2, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 453
    :cond_0
    invoke-direct {p0, p1}, Lo/eop;->d(I)V

    .line 454
    return-void
.end method

.method private c(Landroid/graphics/Bitmap;I)V
    .locals 4

    .line 390
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    .line 391
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x30

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 392
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 393
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lo/eop;->b:I

    sub-int v1, p2, v1

    iget v2, p0, Lo/eop;->g:I

    add-int/2addr v1, v2

    invoke-direct {p0, v1}, Lo/eop;->a(I)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 395
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 396
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 398
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x198

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 404
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 406
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const v1, 0x3f4ccccd    # 0.8f

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 407
    iget-object v0, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 409
    new-instance v3, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lo/eop;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 410
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 412
    iget-object v0, p0, Lo/eop;->o:Landroid/view/WindowManager;

    iget-object v1, p0, Lo/eop;->p:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v3, v1}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 413
    iput-object v3, p0, Lo/eop;->c:Landroid/widget/ImageView;

    .line 414
    return-void
.end method

.method private c()Z
    .locals 4

    .line 432
    invoke-virtual {p0}, Lo/eop;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 433
    const/4 v0, 0x1

    return v0

    .line 435
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eop;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 436
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lo/eop;->getDividerHeight()I

    move-result v1

    add-int v3, v0, v1

    .line 437
    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    mul-int/2addr v0, v3

    invoke-virtual {p0}, Lo/eop;->getHeight()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d()V
    .locals 2

    .line 217
    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eot;

    .line 218
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/eot;->b(Z)V

    .line 219
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 463
    iget v0, p0, Lo/eop;->i:I

    if-ge p1, v0, :cond_0

    .line 464
    iget v0, p0, Lo/eop;->i:I

    sub-int/2addr v0, p1

    div-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eop;->f:I

    goto :goto_0

    .line 466
    :cond_0
    iget v0, p0, Lo/eop;->h:I

    if-le p1, v0, :cond_1

    .line 467
    iget v0, p0, Lo/eop;->h:I

    sub-int v0, p1, v0

    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    div-int/lit8 v0, v0, 0xa

    iput v0, p0, Lo/eop;->f:I

    goto :goto_0

    .line 469
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/eop;->f:I

    .line 473
    :goto_0
    iget v0, p0, Lo/eop;->d:I

    invoke-virtual {p0}, Lo/eop;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lo/eop;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 475
    iget v0, p0, Lo/eop;->d:I

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v1

    iget v2, p0, Lo/eop;->f:I

    add-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lo/eop;->setSelectionFromTop(II)V

    .line 477
    return-void
.end method

.method private d(II)V
    .locals 2

    .line 264
    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eot;

    .line 265
    if-eq p1, p2, :cond_0

    .line 266
    invoke-virtual {v1, p1, p2}, Lo/eot;->d(II)V

    .line 269
    :cond_0
    return-void
.end method

.method private d(Landroid/view/View;II)Z
    .locals 6

    .line 197
    if-nez p1, :cond_0

    .line 198
    const/4 v0, 0x0

    return v0

    .line 200
    :cond_0
    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 201
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 202
    const/4 v0, 0x0

    aget v2, v1, v0

    .line 203
    const/4 v0, 0x1

    aget v3, v1, v0

    .line 204
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int v4, v2, v0

    .line 205
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int v5, v3, v0

    .line 206
    if-lt p3, v3, :cond_1

    if-gt p3, v5, :cond_1

    if-lt p2, v2, :cond_1

    if-gt p2, v4, :cond_1

    .line 208
    const/4 v0, 0x1

    return v0

    .line 210
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private e(I)V
    .locals 1

    .line 503
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lo/eop;->a(II)V

    .line 504
    return-void
.end method

.method private getSpacingUpAndDownBounce()V
    .locals 6

    .line 87
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eop;->s:Z

    .line 89
    invoke-virtual {p0}, Lo/eop;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lo/eop;->i:I

    .line 90
    invoke-virtual {p0}, Lo/eop;->getHeight()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lo/eop;->h:I

    .line 92
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 93
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 95
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eop;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 96
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/eop;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup;

    .line 98
    if-eqz v4, :cond_0

    .line 99
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    goto :goto_0

    .line 101
    :cond_0
    return-void

    .line 104
    :goto_0
    if-eqz v5, :cond_1

    .line 105
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 106
    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x1

    aget v1, v2, v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iput v0, p0, Lo/eop;->k:I

    goto :goto_1

    .line 109
    :cond_1
    return-void

    .line 111
    :goto_1
    return-void
.end method


# virtual methods
.method public e(II)Landroid/view/animation/Animation;
    .locals 10

    .line 514
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    int-to-float v4, p1

    int-to-float v8, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    move-object v9, v0

    .line 517
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 518
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 519
    const-wide/16 v0, 0xc8

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 520
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 521
    return-object v9
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 119
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lo/eop;->m:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lo/eop;->t:Z

    if-nez v0, :cond_4

    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v5, v0

    .line 123
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v6, v0

    .line 125
    invoke-virtual {p0, v5, v6}, Lo/eop;->pointToPosition(II)I

    move-result v0

    iput v0, p0, Lo/eop;->d:I

    iput v0, p0, Lo/eop;->a:I

    iput v0, p0, Lo/eop;->e:I

    .line 129
    iget v0, p0, Lo/eop;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 130
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 133
    :cond_0
    iget-boolean v0, p0, Lo/eop;->s:Z

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 134
    invoke-direct {p0}, Lo/eop;->getSpacingUpAndDownBounce()V

    .line 141
    :cond_1
    iget v0, p0, Lo/eop;->d:I

    .line 142
    invoke-virtual {p0}, Lo/eop;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    .line 141
    invoke-virtual {p0, v0}, Lo/eop;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/view/ViewGroup;

    .line 143
    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eot;

    .line 155
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getTop()I

    move-result v0

    sub-int v0, v6, v0

    iput v0, p0, Lo/eop;->b:I

    .line 157
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    int-to-float v1, v6

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lo/eop;->g:I

    .line 158
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    iput v0, p0, Lo/eop;->n:I

    .line 159
    iget v0, p0, Lo/eop;->g:I

    iput v0, p0, Lo/eop;->q:I

    .line 160
    invoke-direct {p0}, Lo/eop;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    iget v0, p0, Lo/eop;->g:I

    invoke-virtual {p0}, Lo/eop;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lo/eop;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/eop;->r:I

    goto :goto_0

    .line 163
    :cond_2
    iget v0, p0, Lo/eop;->g:I

    invoke-virtual {p0}, Lo/eop;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lo/eop;->n:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/eop;->r:I

    .line 168
    :goto_0
    sget v0, Lcom/huawei/ui/device/R$id;->itemhandle:I

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 169
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    .line 170
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    .line 171
    const-string v0, "TAG"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    float-to-int v4, v4

    invoke-direct {p0, v9, v3, v4}, Lo/eop;->d(Landroid/view/View;II)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    float-to-int v1, v1

    invoke-direct {p0, v9, v0, v1}, Lo/eop;->d(Landroid/view/View;II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 174
    invoke-virtual {v7}, Landroid/view/ViewGroup;->destroyDrawingCache()V

    .line 175
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->setDrawingCacheEnabled(Z)V

    .line 176
    const v0, 0x260d9ffb

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 177
    .line 178
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 177
    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 179
    invoke-direct {p0}, Lo/eop;->d()V

    .line 180
    iget v0, p0, Lo/eop;->a:I

    invoke-virtual {v8, v0}, Lo/eot;->a(I)V

    .line 181
    invoke-virtual {v8}, Lo/eot;->notifyDataSetChanged()V

    .line 182
    invoke-direct {p0, v10, v6}, Lo/eop;->c(Landroid/graphics/Bitmap;I)V

    .line 183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eop;->m:Z

    .line 185
    invoke-virtual {v8}, Lo/eot;->d()V

    .line 190
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 193
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 227
    iget-object v0, p0, Lo/eop;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget v0, p0, Lo/eop;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 229
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 230
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 233
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v3, v0

    .line 234
    invoke-direct {p0}, Lo/eop;->b()V

    .line 235
    invoke-direct {p0, v3}, Lo/eop;->e(I)V

    .line 236
    goto :goto_0

    .line 238
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v4, v0

    .line 239
    invoke-direct {p0, v4}, Lo/eop;->c(I)V

    .line 240
    invoke-direct {p0, v4}, Lo/eop;->b(I)V

    .line 241
    nop

    .line 243
    .line 249
    :goto_0
    :pswitch_2
    const/4 v0, 0x1

    return v0

    .line 253
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
