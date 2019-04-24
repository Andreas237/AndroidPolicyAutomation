.class public Lo/epb;
.super Landroid/widget/ListView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi",
        "HandlerLeak"
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/widget/ImageView;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private l:I

.field private m:Landroid/view/WindowManager$LayoutParams;

.field private n:Z

.field private o:Landroid/view/WindowManager;

.field private p:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 70
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/epb;->g:I

    .line 63
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epb;->p:Z

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epb;->r:Z

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epb;->t:Z

    .line 260
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epb;->s:Z

    .line 264
    const/4 v0, -0x1

    iput v0, p0, Lo/epb;->u:I

    .line 71
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/epb;->setLayerType(ILandroid/graphics/Paint;)V

    .line 73
    invoke-direct {p0}, Lo/epb;->e()V

    .line 74
    return-void
.end method

.method private a(II)Landroid/view/animation/Animation;
    .locals 10

    .line 503
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

    .line 506
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 507
    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 508
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 509
    const-wide/16 v0, 0xc8

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 510
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 511
    return-object v9
.end method

.method private a(Landroid/graphics/Bitmap;I)V
    .locals 4

    .line 404
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    .line 405
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x30

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 406
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 407
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lo/epb;->a:I

    sub-int v1, p2, v1

    iget v2, p0, Lo/epb;->f:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 408
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 409
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 411
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x198

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 417
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 419
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const v1, 0x3f4ccccd    # 0.8f

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 420
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 422
    new-instance v3, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lo/epb;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 423
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 425
    iget-object v0, p0, Lo/epb;->o:Landroid/view/WindowManager;

    iget-object v1, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v3, v1}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 426
    iput-object v3, p0, Lo/epb;->d:Landroid/widget/ImageView;

    .line 427
    return-void
.end method

.method private c(II)V
    .locals 2

    .line 388
    invoke-virtual {p0}, Lo/epb;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eow;

    .line 389
    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Lo/eow;->a(I)V

    .line 390
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/eow;->c(Z)V

    .line 391
    invoke-virtual {v1}, Lo/eow;->notifyDataSetChanged()V

    .line 392
    return-void
.end method

.method private d()V
    .locals 2

    .line 217
    invoke-virtual {p0}, Lo/epb;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eow;

    .line 218
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/eow;->c(Z)V

    .line 219
    return-void
.end method

.method private d(I)V
    .locals 11

    .line 292
    invoke-virtual {p0}, Lo/epb;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eow;

    .line 293
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lo/epb;->pointToPosition(II)I

    move-result v3

    .line 295
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    iget v0, p0, Lo/epb;->b:I

    if-ne v3, v0, :cond_1

    .line 296
    :cond_0
    return-void

    .line 300
    :cond_1
    iput v3, p0, Lo/epb;->e:I

    .line 301
    iget v0, p0, Lo/epb;->b:I

    iget v1, p0, Lo/epb;->e:I

    invoke-direct {p0, v0, v1}, Lo/epb;->d(II)V

    .line 302
    iget v0, p0, Lo/epb;->b:I

    sub-int v4, v3, v0

    .line 303
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 305
    const/4 v6, 0x1

    :goto_0
    if-gt v6, v5, :cond_e

    .line 308
    if-lez v4, :cond_7

    .line 310
    iget v0, p0, Lo/epb;->u:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 311
    const/4 v0, 0x0

    iput v0, p0, Lo/epb;->u:I

    .line 312
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epb;->s:Z

    .line 315
    :cond_2
    iget v0, p0, Lo/epb;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 317
    const/4 v0, 0x0

    iput v0, p0, Lo/epb;->u:I

    .line 318
    iget-boolean v0, p0, Lo/epb;->s:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/epb;->s:Z

    .line 321
    :cond_4
    iget-boolean v0, p0, Lo/epb;->s:Z

    if-eqz v0, :cond_5

    .line 322
    iget v0, p0, Lo/epb;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/epb;->l:I

    goto :goto_2

    .line 324
    :cond_5
    iget v0, p0, Lo/epb;->c:I

    if-ge v0, v3, :cond_6

    .line 325
    iget v0, p0, Lo/epb;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/epb;->l:I

    .line 326
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epb;->s:Z

    goto :goto_2

    .line 328
    :cond_6
    iget v0, p0, Lo/epb;->b:I

    iput v0, p0, Lo/epb;->l:I

    .line 332
    :goto_2
    const/4 v7, 0x0

    .line 333
    iget v0, p0, Lo/epb;->g:I

    neg-int v8, v0

    .line 334
    iget v0, p0, Lo/epb;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/epb;->b:I

    goto :goto_5

    .line 338
    :cond_7
    iget v0, p0, Lo/epb;->u:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    .line 339
    const/4 v0, 0x1

    iput v0, p0, Lo/epb;->u:I

    .line 340
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epb;->s:Z

    .line 343
    :cond_8
    iget v0, p0, Lo/epb;->u:I

    if-nez v0, :cond_a

    .line 345
    const/4 v0, 0x1

    iput v0, p0, Lo/epb;->u:I

    .line 346
    iget-boolean v0, p0, Lo/epb;->s:Z

    if-nez v0, :cond_9

    const/4 v0, 0x1

    goto :goto_3

    :cond_9
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lo/epb;->s:Z

    .line 349
    :cond_a
    iget-boolean v0, p0, Lo/epb;->s:Z

    if-eqz v0, :cond_b

    .line 350
    iget v0, p0, Lo/epb;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/epb;->l:I

    goto :goto_4

    .line 353
    :cond_b
    iget v0, p0, Lo/epb;->c:I

    if-le v0, v3, :cond_c

    .line 354
    iget v0, p0, Lo/epb;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/epb;->l:I

    .line 355
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epb;->s:Z

    goto :goto_4

    .line 357
    :cond_c
    iget v0, p0, Lo/epb;->b:I

    iput v0, p0, Lo/epb;->l:I

    .line 362
    :goto_4
    const/4 v7, 0x0

    .line 363
    iget v8, p0, Lo/epb;->g:I

    .line 364
    iget v0, p0, Lo/epb;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/epb;->b:I

    .line 368
    :goto_5
    iget v0, p0, Lo/epb;->g:I

    invoke-virtual {v2, v0}, Lo/eow;->c(I)V

    .line 370
    iget v0, p0, Lo/epb;->u:I

    invoke-virtual {v2, v0}, Lo/eow;->e(I)V

    .line 372
    iget v0, p0, Lo/epb;->l:I

    .line 373
    invoke-virtual {p0}, Lo/epb;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    .line 372
    invoke-virtual {p0, v0}, Lo/epb;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/ViewGroup;

    .line 376
    iget-boolean v0, p0, Lo/epb;->s:Z

    if-eqz v0, :cond_d

    .line 377
    invoke-direct {p0, v7, v8}, Lo/epb;->a(II)Landroid/view/animation/Animation;

    move-result-object v10

    goto :goto_6

    .line 379
    :cond_d
    neg-int v0, v8

    invoke-direct {p0, v7, v0}, Lo/epb;->e(II)Landroid/view/animation/Animation;

    move-result-object v10

    .line 382
    :goto_6
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 305
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 385
    :cond_e
    return-void
.end method

.method private d(II)V
    .locals 2

    .line 278
    invoke-virtual {p0}, Lo/epb;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eow;

    .line 279
    if-eq p1, p2, :cond_0

    .line 280
    invoke-virtual {v1, p1, p2}, Lo/eow;->c(II)V

    .line 283
    :cond_0
    return-void
.end method

.method private e(II)Landroid/view/animation/Animation;
    .locals 10

    .line 522
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

    .line 525
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 526
    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 527
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 528
    const-wide/16 v0, 0xc8

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 529
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 530
    return-object v9
.end method

.method private e()V
    .locals 2

    .line 80
    invoke-virtual {p0}, Lo/epb;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    .line 81
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lo/epb;->o:Landroid/view/WindowManager;

    .line 82
    return-void
.end method

.method private getSpacing()V
    .locals 6

    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epb;->t:Z

    .line 109
    invoke-virtual {p0}, Lo/epb;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lo/epb;->i:I

    .line 110
    invoke-virtual {p0}, Lo/epb;->getHeight()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lo/epb;->h:I

    .line 112
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 113
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 115
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/epb;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 116
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/epb;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup;

    .line 118
    if-eqz v4, :cond_0

    .line 119
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    goto :goto_0

    .line 121
    :cond_0
    return-void

    .line 124
    :goto_0
    if-eqz v5, :cond_1

    .line 125
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 126
    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x1

    aget v1, v2, v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iput v0, p0, Lo/epb;->g:I

    goto :goto_1

    .line 129
    :cond_1
    return-void

    .line 131
    :goto_1
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4

    .line 452
    iget v0, p0, Lo/epb;->i:I

    if-ge p1, v0, :cond_0

    .line 453
    iget v0, p0, Lo/epb;->i:I

    sub-int/2addr v0, p1

    div-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/epb;->k:I

    goto :goto_0

    .line 455
    :cond_0
    iget v0, p0, Lo/epb;->h:I

    if-le p1, v0, :cond_1

    .line 456
    iget v0, p0, Lo/epb;->h:I

    sub-int v0, p1, v0

    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    div-int/lit8 v0, v0, 0xa

    iput v0, p0, Lo/epb;->k:I

    goto :goto_0

    .line 458
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/epb;->k:I

    .line 462
    :goto_0
    iget v0, p0, Lo/epb;->e:I

    invoke-virtual {p0}, Lo/epb;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lo/epb;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 464
    iget v0, p0, Lo/epb;->e:I

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v1

    iget v2, p0, Lo/epb;->k:I

    add-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lo/epb;->setSelectionFromTop(II)V

    .line 466
    return-void
.end method

.method public c()V
    .locals 3

    .line 472
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epb;->p:Z

    .line 474
    iget-object v0, p0, Lo/epb;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lo/epb;->o:Landroid/view/WindowManager;

    iget-object v1, p0, Lo/epb;->d:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 476
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epb;->d:Landroid/widget/ImageView;

    .line 479
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epb;->s:Z

    .line 480
    const/4 v0, -0x1

    iput v0, p0, Lo/epb;->u:I

    .line 481
    invoke-virtual {p0}, Lo/epb;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eow;

    .line 482
    iget v0, p0, Lo/epb;->u:I

    invoke-virtual {v2, v0}, Lo/eow;->e(I)V

    .line 483
    invoke-virtual {v2}, Lo/eow;->a()V

    .line 484
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 492
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lo/epb;->c(II)V

    .line 493
    return-void
.end method

.method public e(I)V
    .locals 4

    .line 435
    iget v0, p0, Lo/epb;->a:I

    sub-int v3, p1, v0

    .line 436
    iget-object v0, p0, Lo/epb;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    if-ltz v3, :cond_0

    .line 437
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 438
    iget-object v0, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lo/epb;->a:I

    sub-int v1, p1, v1

    iget v2, p0, Lo/epb;->f:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 439
    iget-object v0, p0, Lo/epb;->o:Landroid/view/WindowManager;

    iget-object v1, p0, Lo/epb;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lo/epb;->m:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 442
    :cond_0
    invoke-virtual {p0, p1}, Lo/epb;->b(I)V

    .line 443
    return-void
.end method

.method public getScaleAnimation()Landroid/view/animation/Animation;
    .locals 10

    .line 206
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v9, v0

    .line 209
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 210
    return-object v9
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 139
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lo/epb;->n:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lo/epb;->p:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lo/epb;->r:Z

    if-nez v0, :cond_3

    .line 142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v2, v0

    .line 143
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v3, v0

    .line 144
    invoke-virtual {p0, v2, v3}, Lo/epb;->pointToPosition(II)I

    move-result v0

    iput v0, p0, Lo/epb;->e:I

    iput v0, p0, Lo/epb;->c:I

    iput v0, p0, Lo/epb;->b:I

    .line 148
    iget v0, p0, Lo/epb;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 149
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 152
    :cond_0
    iget-boolean v0, p0, Lo/epb;->t:Z

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 153
    invoke-direct {p0}, Lo/epb;->getSpacing()V

    .line 157
    :cond_1
    iget v0, p0, Lo/epb;->e:I

    .line 158
    invoke-virtual {p0}, Lo/epb;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    .line 157
    invoke-virtual {p0, v0}, Lo/epb;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 160
    invoke-virtual {p0}, Lo/epb;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eow;

    .line 166
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getTop()I

    move-result v0

    sub-int v0, v3, v0

    iput v0, p0, Lo/epb;->a:I

    .line 168
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    int-to-float v1, v3

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lo/epb;->f:I

    .line 171
    sget v0, Lcom/huawei/ui/device/R$id;->drag_item_image:I

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 172
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 173
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 176
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int/lit8 v0, v0, -0x14

    if-le v2, v0, :cond_2

    .line 178
    invoke-virtual {v4}, Landroid/view/ViewGroup;->destroyDrawingCache()V

    .line 179
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->setDrawingCacheEnabled(Z)V

    .line 180
    const v0, 0x260d9ffb

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 181
    .line 182
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 181
    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 183
    invoke-direct {p0}, Lo/epb;->d()V

    .line 184
    iget v0, p0, Lo/epb;->c:I

    invoke-virtual {v5, v0}, Lo/eow;->a(I)V

    .line 185
    invoke-virtual {v5}, Lo/eow;->notifyDataSetChanged()V

    .line 186
    invoke-direct {p0, v7, v3}, Lo/epb;->a(Landroid/graphics/Bitmap;I)V

    .line 187
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epb;->p:Z

    .line 189
    invoke-virtual {v5}, Lo/eow;->b()V

    .line 194
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_3
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 227
    iget-object v0, p0, Lo/epb;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget v0, p0, Lo/epb;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lo/epb;->n:Z

    if-nez v0, :cond_0

    .line 230
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 231
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 234
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v3, v0

    .line 235
    invoke-virtual {p0}, Lo/epb;->c()V

    .line 236
    invoke-virtual {p0, v3}, Lo/epb;->c(I)V

    .line 237
    goto :goto_0

    .line 239
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v4, v0

    .line 240
    invoke-virtual {p0, v4}, Lo/epb;->e(I)V

    .line 241
    invoke-direct {p0, v4}, Lo/epb;->d(I)V

    .line 242
    nop

    .line 244
    .line 250
    :goto_0
    :pswitch_2
    const/4 v0, 0x1

    return v0

    .line 254
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
