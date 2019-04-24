.class public Lo/ffa;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ffa$a;,
        Lo/ffa$b;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/Scroller;

.field private B:Z

.field private C:Lo/ffa$a;

.field private D:Z

.field private H:I

.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Landroid/support/v4/view/GestureDetectorCompat;

.field private k:I

.field private l:Z

.field private m:Z

.field private n:I

.field private o:Z

.field private p:Landroid/graphics/Paint;

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private v:F

.field private w:I

.field private x:I

.field private y:I

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 94
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/ffa;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 95
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 99
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    const/4 v0, 0x1

    iput v0, p0, Lo/ffa;->e:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->c:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->a:I

    .line 53
    const/16 v0, 0xf

    iput v0, p0, Lo/ffa;->b:I

    .line 54
    const/16 v0, 0x12

    iput v0, p0, Lo/ffa;->h:I

    .line 56
    const/16 v0, 0xfb

    const/16 v1, 0x65

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/ffa;->g:I

    .line 57
    const/16 v0, 0x1a

    const/16 v1, 0x1a

    const/16 v2, 0x1a

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/ffa;->k:I

    .line 58
    const/16 v0, 0x4d

    const/16 v1, 0x1a

    const/16 v2, 0x1a

    const/16 v3, 0x1a

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ffa;->i:I

    .line 59
    const/4 v0, 0x5

    iput v0, p0, Lo/ffa;->f:I

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ffa;->m:Z

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ffa;->o:Z

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffa;->l:Z

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lo/ffa;->t:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->r:I

    .line 79
    const/16 v0, 0x7b2

    iput v0, p0, Lo/ffa;->y:I

    .line 80
    const/16 v0, 0x802

    iput v0, p0, Lo/ffa;->x:I

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->v:F

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->H:I

    .line 100
    iput-object p1, p0, Lo/ffa;->d:Landroid/content/Context;

    .line 101
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    .line 102
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 103
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 104
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p0}, Lo/ffa;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/ffa$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lo/ffa$b;-><init>(Lo/ffa;Lo/ffa$4;)V

    invoke-direct {v0, v1, v2}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/ffa;->j:Landroid/support/v4/view/GestureDetectorCompat;

    .line 106
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lo/ffa;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    .line 108
    invoke-direct {p0, p2}, Lo/ffa;->e(Landroid/util/AttributeSet;)V

    .line 109
    return-void
.end method

.method private a(ILandroid/graphics/Paint$FontMetricsInt;)F
    .locals 5

    .line 220
    iget v0, p0, Lo/ffa;->w:I

    iget v1, p0, Lo/ffa;->r:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    sub-int/2addr v0, v1

    iget v1, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget v2, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-float v3, v0

    .line 223
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 225
    :pswitch_0
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 226
    goto :goto_1

    .line 228
    :pswitch_1
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 229
    goto :goto_1

    .line 231
    :pswitch_2
    move v4, v3

    .line 232
    goto :goto_1

    .line 234
    :pswitch_3
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 235
    goto :goto_1

    .line 237
    :pswitch_4
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 238
    goto :goto_1

    .line 240
    :goto_0
    iget v0, p0, Lo/ffa;->w:I

    iget v1, p0, Lo/ffa;->r:I

    mul-int/2addr v1, p1

    add-int/2addr v0, v1

    iget v1, p0, Lo/ffa;->r:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    sub-int/2addr v0, v1

    iget v1, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget v2, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-float v4, v0

    .line 244
    :goto_1
    return v4

    nop

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic a(Lo/ffa;)Ljava/util/List;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lo/ffa;)I
    .locals 1

    .line 36
    iget v0, p0, Lo/ffa;->q:I

    return v0
.end method

.method private b()V
    .locals 5

    .line 389
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/ffa;->B:Z

    if-eqz v0, :cond_1

    .line 390
    :cond_0
    return-void

    .line 392
    :cond_1
    invoke-virtual {p0}, Lo/ffa;->a()V

    .line 395
    iget v0, p0, Lo/ffa;->v:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 396
    iget v0, p0, Lo/ffa;->r:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 397
    iget v0, p0, Lo/ffa;->v:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_2

    .line 398
    iget v0, p0, Lo/ffa;->v:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ffa;->c(FI)V

    goto :goto_0

    .line 400
    :cond_2
    iget v0, p0, Lo/ffa;->v:F

    iget v1, p0, Lo/ffa;->r:I

    invoke-direct {p0, v0, v1}, Lo/ffa;->c(FI)V

    .line 402
    :goto_0
    goto :goto_1

    .line 403
    :cond_3
    iget v0, p0, Lo/ffa;->r:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 404
    iget v0, p0, Lo/ffa;->v:F

    neg-float v0, v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_4

    .line 405
    iget v0, p0, Lo/ffa;->v:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ffa;->c(FI)V

    goto :goto_1

    .line 407
    :cond_4
    iget v0, p0, Lo/ffa;->v:F

    iget v1, p0, Lo/ffa;->r:I

    neg-int v1, v1

    invoke-direct {p0, v0, v1}, Lo/ffa;->c(FI)V

    .line 410
    :goto_1
    return-void
.end method

.method private b(FF)V
    .locals 9

    .line 425
    float-to-int v0, p1

    iput v0, p0, Lo/ffa;->H:I

    .line 426
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ffa;->B:Z

    .line 428
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    float-to-int v2, p1

    float-to-int v4, p2

    iget v1, p0, Lo/ffa;->r:I

    mul-int/lit8 v7, v1, -0xa

    iget v1, p0, Lo/ffa;->r:I

    mul-int/lit8 v8, v1, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 430
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 431
    return-void
.end method

.method private c()V
    .locals 3

    .line 434
    iget v0, p0, Lo/ffa;->t:I

    iget v1, p0, Lo/ffa;->q:I

    if-ne v0, v1, :cond_0

    .line 435
    return-void

    .line 437
    :cond_0
    iget v0, p0, Lo/ffa;->q:I

    iput v0, p0, Lo/ffa;->t:I

    .line 439
    iget-object v0, p0, Lo/ffa;->C:Lo/ffa$a;

    if-eqz v0, :cond_1

    .line 441
    iget-object v0, p0, Lo/ffa;->C:Lo/ffa$a;

    iget-object v1, p0, Lo/ffa;->u:Ljava/util/List;

    iget v2, p0, Lo/ffa;->q:I

    invoke-interface {v0, v1, v2}, Lo/ffa$a;->a(Ljava/util/List;I)V

    .line 443
    :cond_1
    iget-object v0, p0, Lo/ffa;->C:Lo/ffa$a;

    if-eqz v0, :cond_2

    .line 445
    new-instance v0, Lo/ffa$4;

    invoke-direct {v0, p0}, Lo/ffa$4;-><init>(Lo/ffa;)V

    invoke-virtual {p0, v0}, Lo/ffa;->post(Ljava/lang/Runnable;)Z

    .line 452
    :cond_2
    return-void
.end method

.method private c(FI)V
    .locals 5

    .line 415
    float-to-int v0, p1

    iput v0, p0, Lo/ffa;->H:I

    .line 416
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ffa;->D:Z

    .line 417
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    float-to-int v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 418
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    invoke-virtual {v0, p2}, Landroid/widget/Scroller;->setFinalY(I)V

    .line 419
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 420
    return-void
.end method

.method private c(I)V
    .locals 2

    .line 254
    iget v1, p0, Lo/ffa;->i:I

    .line 255
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 256
    :cond_0
    iget v1, p0, Lo/ffa;->k:I

    goto :goto_0

    .line 257
    :cond_1
    const/4 v0, -0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 258
    :cond_2
    iget v1, p0, Lo/ffa;->i:I

    goto :goto_0

    .line 259
    :cond_3
    if-nez p1, :cond_4

    .line 260
    iget v1, p0, Lo/ffa;->g:I

    .line 262
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 263
    return-void
.end method

.method static synthetic c(Lo/ffa;)Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lo/ffa;->m:Z

    return v0
.end method

.method private d(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)I"
        }
    .end annotation

    .line 707
    const/4 v2, 0x0

    .line 710
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 711
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 712
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 713
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    cmpg-float v0, v3, v0

    if-gez v0, :cond_0

    .line 714
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 715
    move v2, v4

    .line 712
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 719
    :cond_1
    return v2
.end method

.method static synthetic d(Lo/ffa;)Lo/ffa$a;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/ffa;->C:Lo/ffa$a;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 342
    iget v0, p0, Lo/ffa;->v:F

    iget v1, p0, Lo/ffa;->r:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 343
    iget v0, p0, Lo/ffa;->q:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/ffa;->q:I

    .line 344
    iget v0, p0, Lo/ffa;->q:I

    if-gez v0, :cond_2

    .line 345
    iget-boolean v0, p0, Lo/ffa;->o:Z

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/ffa;->q:I

    .line 347
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->v:F

    goto/16 :goto_0

    .line 350
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->q:I

    .line 351
    iget v0, p0, Lo/ffa;->r:I

    int-to-float v0, v0

    iput v0, p0, Lo/ffa;->v:F

    .line 352
    iget-boolean v0, p0, Lo/ffa;->B:Z

    if-eqz v0, :cond_1

    .line 353
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 355
    :cond_1
    iget-boolean v0, p0, Lo/ffa;->D:Z

    if-eqz v0, :cond_7

    .line 356
    iget v0, p0, Lo/ffa;->v:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ffa;->c(FI)V

    goto/16 :goto_0

    .line 360
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->v:F

    goto :goto_0

    .line 363
    :cond_3
    iget v0, p0, Lo/ffa;->v:F

    iget v1, p0, Lo/ffa;->r:I

    neg-int v1, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_7

    .line 364
    iget v0, p0, Lo/ffa;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ffa;->q:I

    .line 365
    iget v0, p0, Lo/ffa;->q:I

    iget-object v1, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_6

    .line 366
    iget-boolean v0, p0, Lo/ffa;->o:Z

    if-eqz v0, :cond_4

    .line 367
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->q:I

    .line 368
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->v:F

    goto :goto_0

    .line 370
    :cond_4
    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/ffa;->q:I

    .line 371
    iget v0, p0, Lo/ffa;->r:I

    neg-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lo/ffa;->v:F

    .line 372
    iget-boolean v0, p0, Lo/ffa;->B:Z

    if-eqz v0, :cond_5

    .line 373
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 375
    :cond_5
    iget-boolean v0, p0, Lo/ffa;->D:Z

    if-eqz v0, :cond_7

    .line 376
    iget v0, p0, Lo/ffa;->v:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ffa;->c(FI)V

    goto :goto_0

    .line 380
    :cond_6
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->v:F

    .line 383
    :cond_7
    :goto_0
    invoke-direct {p0}, Lo/ffa;->c()V

    .line 384
    return-void
.end method

.method static synthetic e(Lo/ffa;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/ffa;->v:F

    return v0
.end method

.method private e(Landroid/graphics/Canvas;II)V
    .locals 6

    .line 183
    const-string v2, ""

    .line 184
    const/4 v0, -0x1

    if-ge v0, p2, :cond_0

    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 185
    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 187
    :cond_0
    const/4 v3, 0x0

    .line 188
    if-nez p3, :cond_1

    .line 189
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/ffa;->h:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 190
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    .line 191
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 192
    goto :goto_0

    .line 193
    :cond_1
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/ffa;->b:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 194
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 196
    :goto_0
    iget v0, p0, Lo/ffa;->e:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 198
    :pswitch_0
    const/4 v3, 0x0

    .line 199
    goto :goto_2

    .line 201
    :pswitch_1
    iget v0, p0, Lo/ffa;->n:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 202
    goto :goto_2

    .line 204
    :pswitch_2
    iget v0, p0, Lo/ffa;->n:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float v3, v0, v1

    .line 206
    goto :goto_2

    .line 208
    :goto_1
    iget v0, p0, Lo/ffa;->n:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 212
    :goto_2
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v4

    .line 214
    invoke-direct {p0, p3, v4}, Lo/ffa;->a(ILandroid/graphics/Paint$FontMetricsInt;)F

    move-result v5

    .line 215
    invoke-direct {p0, p3}, Lo/ffa;->c(I)V

    .line 216
    iget v0, p0, Lo/ffa;->v:F

    add-float/2addr v0, v5

    iget-object v1, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 217
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private e(Landroid/util/AttributeSet;)V
    .locals 3

    .line 112
    if-eqz p1, :cond_4

    .line 113
    invoke-virtual {p0}, Lo/ffa;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 115
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_min_text_size:I

    iget v1, p0, Lo/ffa;->b:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/ffa;->b:I

    .line 117
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_max_text_size:I

    iget v1, p0, Lo/ffa;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/ffa;->h:I

    .line 119
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_start_color:I

    iget v1, p0, Lo/ffa;->g:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/ffa;->g:I

    .line 121
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_end_color:I

    iget v1, p0, Lo/ffa;->i:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/ffa;->i:I

    .line 123
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_visible_item_count:I

    iget v1, p0, Lo/ffa;->f:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/ffa;->f:I

    .line 126
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_offset_mode:I

    iget v1, p0, Lo/ffa;->e:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/ffa;->e:I

    .line 129
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_content_mode:I

    iget v1, p0, Lo/ffa;->a:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/ffa;->a:I

    .line 132
    iget v0, p0, Lo/ffa;->e:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/ffa;->e:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 133
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lo/ffa;->e:I

    .line 135
    :cond_1
    iget v0, p0, Lo/ffa;->a:I

    if-ltz v0, :cond_2

    iget v0, p0, Lo/ffa;->a:I

    const/16 v1, 0xc

    if-le v0, v1, :cond_3

    .line 136
    :cond_2
    const/4 v0, 0x4

    iput v0, p0, Lo/ffa;->a:I

    .line 138
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_is_circulation:I

    iget-boolean v1, p0, Lo/ffa;->o:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/ffa;->o:Z

    .line 139
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_disallow_intercept_touch:I

    iget-boolean v1, p0, Lo/ffa;->l:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/ffa;->l:Z

    .line 141
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 144
    :cond_4
    iget v0, p0, Lo/ffa;->a:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/ffa;->setContentMode(II)V

    .line 146
    return-void
.end method

.method static synthetic e(Lo/ffa;FF)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lo/ffa;->b(FF)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 335
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffa;->D:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffa;->B:Z

    .line 336
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 337
    return-void
.end method

.method public computeScroll()V
    .locals 2

    .line 316
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 318
    iget v0, p0, Lo/ffa;->v:F

    iget-object v1, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/ffa;->H:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/ffa;->v:F

    .line 319
    iget-object v0, p0, Lo/ffa;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    iput v0, p0, Lo/ffa;->H:I

    .line 320
    invoke-direct {p0}, Lo/ffa;->d()V

    .line 321
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    goto :goto_0

    .line 323
    :cond_0
    iget-boolean v0, p0, Lo/ffa;->B:Z

    if-eqz v0, :cond_1

    .line 324
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffa;->B:Z

    .line 325
    invoke-direct {p0}, Lo/ffa;->b()V

    goto :goto_0

    .line 326
    :cond_1
    iget-boolean v0, p0, Lo/ffa;->D:Z

    if-eqz v0, :cond_2

    .line 327
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffa;->D:Z

    .line 328
    invoke-direct {p0}, Lo/ffa;->c()V

    .line 332
    :cond_2
    :goto_0
    return-void
.end method

.method public getContentMode()I
    .locals 1

    .line 723
    iget v0, p0, Lo/ffa;->a:I

    return v0
.end method

.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 479
    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    return-object v0
.end method

.method public getListener()Lo/ffa$a;
    .locals 1

    .line 542
    iget-object v0, p0, Lo/ffa;->C:Lo/ffa$a;

    return-object v0
.end method

.method public getSelectedItem()Ljava/lang/String;
    .locals 2

    .line 513
    iget v0, p0, Lo/ffa;->q:I

    iget-object v1, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 514
    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    iget v1, p0, Lo/ffa;->q:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 517
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 151
    iget v0, p0, Lo/ffa;->q:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/ffa;->e(Landroid/graphics/Canvas;II)V

    .line 152
    iget v0, p0, Lo/ffa;->f:I

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v2, v0, 0x1

    .line 155
    const/4 v4, 0x1

    :goto_0
    if-gt v4, v2, :cond_6

    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-gt v4, v0, :cond_6

    .line 158
    iget v0, p0, Lo/ffa;->q:I

    sub-int/2addr v0, v4

    if-gez v0, :cond_0

    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/ffa;->q:I

    add-int/2addr v0, v1

    sub-int v3, v0, v4

    goto :goto_1

    :cond_0
    iget v0, p0, Lo/ffa;->q:I

    sub-int v3, v0, v4

    .line 160
    :goto_1
    iget-boolean v0, p0, Lo/ffa;->o:Z

    if-eqz v0, :cond_1

    .line 161
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/ffa;->e(Landroid/graphics/Canvas;II)V

    goto :goto_2

    .line 162
    :cond_1
    iget v0, p0, Lo/ffa;->q:I

    sub-int/2addr v0, v4

    if-ltz v0, :cond_2

    .line 163
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/ffa;->e(Landroid/graphics/Canvas;II)V

    .line 167
    :cond_2
    :goto_2
    iget v0, p0, Lo/ffa;->q:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_3

    iget v0, p0, Lo/ffa;->q:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/ffa;->u:Ljava/util/List;

    .line 168
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int v3, v0, v1

    goto :goto_3

    :cond_3
    iget v0, p0, Lo/ffa;->q:I

    add-int v3, v0, v4

    .line 169
    :goto_3
    iget-boolean v0, p0, Lo/ffa;->o:Z

    if-eqz v0, :cond_4

    .line 170
    invoke-direct {p0, p1, v3, v4}, Lo/ffa;->e(Landroid/graphics/Canvas;II)V

    goto :goto_4

    .line 171
    :cond_4
    iget v0, p0, Lo/ffa;->q:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 172
    invoke-direct {p0, p1, v3, v4}, Lo/ffa;->e(Landroid/graphics/Canvas;II)V

    .line 155
    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 175
    :cond_6
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 267
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 269
    invoke-virtual {p0}, Lo/ffa;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/ffa;->n:I

    .line 270
    invoke-virtual {p0}, Lo/ffa;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/ffa;->s:I

    .line 271
    iget v0, p0, Lo/ffa;->s:I

    iget v1, p0, Lo/ffa;->f:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/ffa;->r:I

    .line 272
    iget v0, p0, Lo/ffa;->f:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/ffa;->r:I

    mul-int/2addr v0, v1

    iput v0, p0, Lo/ffa;->w:I

    .line 273
    iget v0, p0, Lo/ffa;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 274
    iget v0, p0, Lo/ffa;->c:I

    iget v1, p0, Lo/ffa;->s:I

    invoke-virtual {p0, v0, v1}, Lo/ffa;->setMeasuredDimension(II)V

    .line 276
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 281
    iget-object v0, p0, Lo/ffa;->j:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 283
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 285
    :pswitch_0
    iget-boolean v0, p0, Lo/ffa;->l:Z

    if-eqz v0, :cond_0

    .line 286
    invoke-virtual {p0}, Lo/ffa;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 287
    if-eqz v3, :cond_0

    .line 288
    const/4 v0, 0x1

    invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 292
    :cond_0
    invoke-virtual {p0}, Lo/ffa;->a()V

    .line 293
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/ffa;->z:F

    .line 294
    goto :goto_0

    .line 296
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lo/ffa;->z:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 297
    const/4 v0, 0x1

    return v0

    .line 299
    :cond_1
    iget v0, p0, Lo/ffa;->v:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Lo/ffa;->z:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/ffa;->v:F

    .line 300
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/ffa;->z:F

    .line 301
    invoke-direct {p0}, Lo/ffa;->d()V

    .line 302
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 303
    goto :goto_0

    .line 305
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/ffa;->z:F

    .line 306
    invoke-direct {p0}, Lo/ffa;->b()V

    .line 307
    .line 311
    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setColor(II)V
    .locals 0

    .line 497
    iput p1, p0, Lo/ffa;->g:I

    .line 498
    iput p2, p0, Lo/ffa;->i:I

    .line 499
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 500
    return-void
.end method

.method public setContentMode(II)V
    .locals 11

    .line 575
    iput p1, p0, Lo/ffa;->a:I

    .line 577
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 578
    iget v0, p0, Lo/ffa;->a:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_15

    .line 580
    :pswitch_0
    iget v6, p0, Lo/ffa;->y:I

    :goto_0
    iget v0, p0, Lo/ffa;->x:I

    if-ge v6, v0, :cond_1

    .line 581
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 582
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_year:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 584
    :cond_0
    invoke-virtual {p0}, Lo/ffa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_date_formate:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 587
    :cond_1
    goto/16 :goto_17

    .line 589
    :pswitch_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 590
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 592
    const/16 v0, 0xc

    new-array v8, v0, [Ljava/lang/String;

    .line 593
    const v9, 0x10030

    .line 596
    const/4 v10, 0x0

    :goto_2
    const/16 v0, 0xc

    if-ge v10, v0, :cond_2

    .line 597
    const/4 v0, 0x2

    invoke-virtual {v6, v0, v10}, Ljava/util/Calendar;->set(II)V

    .line 598
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2, v9}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v7

    .line 599
    aput-object v7, v8, v10

    .line 596
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 601
    :cond_2
    const/4 v10, 0x1

    :goto_3
    const/16 v0, 0xd

    if-ge v10, v0, :cond_3

    .line 602
    add-int/lit8 v0, v10, -0x1

    aget-object v0, v8, v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 604
    :cond_3
    goto/16 :goto_17

    .line 606
    :pswitch_2
    const/4 v10, 0x1

    :goto_4
    const/16 v0, 0x20

    if-ge v10, v0, :cond_5

    .line 607
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 608
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 610
    :cond_4
    invoke-virtual {p0}, Lo/ffa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_date_formate:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    :goto_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 613
    :cond_5
    goto/16 :goto_17

    .line 615
    :pswitch_3
    const/4 v10, 0x0

    :goto_6
    const/16 v0, 0x18

    if-ge v10, v0, :cond_6

    .line 616
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    .line 618
    :cond_6
    goto/16 :goto_17

    .line 620
    :pswitch_4
    const/4 v10, 0x0

    :goto_7
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_7

    .line 621
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    .line 623
    :cond_7
    goto/16 :goto_17

    .line 625
    :pswitch_5
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_alarm_am:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 626
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_alarm_pm:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    goto/16 :goto_17

    .line 629
    :pswitch_6
    const/4 v10, 0x1

    :goto_8
    const/16 v0, 0xd

    if-ge v10, v0, :cond_8

    .line 630
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    .line 632
    :cond_8
    goto/16 :goto_17

    .line 634
    :pswitch_7
    const/4 v10, 0x1

    :goto_9
    const/16 v0, 0x1d

    if-ge v10, v0, :cond_a

    .line 635
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 636
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 638
    :cond_9
    invoke-virtual {p0}, Lo/ffa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_date_formate:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    :goto_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    .line 641
    :cond_a
    goto/16 :goto_17

    .line 643
    :pswitch_8
    const/4 v10, 0x1

    :goto_b
    const/16 v0, 0x1e

    if-ge v10, v0, :cond_c

    .line 644
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 645
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 647
    :cond_b
    invoke-virtual {p0}, Lo/ffa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_date_formate:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 643
    :goto_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_b

    .line 649
    :cond_c
    goto/16 :goto_17

    .line 651
    :pswitch_9
    const/4 v10, 0x1

    :goto_d
    const/16 v0, 0x1f

    if-ge v10, v0, :cond_e

    .line 652
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 653
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 655
    :cond_d
    invoke-virtual {p0}, Lo/ffa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_weight_date_formate:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    :goto_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    .line 658
    :cond_e
    goto/16 :goto_17

    .line 660
    :pswitch_a
    const/4 v10, 0x0

    :goto_f
    const/16 v0, 0x18

    if-ge v10, v0, :cond_10

    .line 661
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 662
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    .line 663
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sleep_unit_h:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 662
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 665
    :cond_f
    int-to-double v0, v10

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 660
    :goto_10
    add-int/lit8 v10, v10, 0x1

    goto :goto_f

    .line 668
    :cond_10
    goto/16 :goto_17

    .line 670
    :pswitch_b
    const/4 v10, 0x0

    :goto_11
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_12

    .line 671
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    .line 673
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sleep_unit_m:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 672
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 675
    :cond_11
    int-to-double v0, v10

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    :goto_12
    add-int/lit8 v10, v10, 0x1

    goto :goto_11

    .line 678
    :cond_12
    goto/16 :goto_17

    .line 680
    :pswitch_c
    const/4 v10, 0x0

    :goto_13
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_14

    .line 681
    iget-object v0, p0, Lo/ffa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 682
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffa;->d:Landroid/content/Context;

    .line 683
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->sug_second_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 682
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    .line 685
    :cond_13
    int-to-double v0, v10

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    :goto_14
    add-int/lit8 v10, v10, 0x1

    goto :goto_13

    .line 688
    :cond_14
    goto :goto_17

    .line 691
    :goto_15
    const/4 v10, 0x0

    :goto_16
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_15

    .line 692
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    add-int/lit8 v10, v10, 0x1

    goto :goto_16

    .line 697
    :cond_15
    :goto_17
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/ffa;->h:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 699
    invoke-direct {p0, v5}, Lo/ffa;->d(Ljava/util/List;)I

    move-result v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 700
    iget-object v0, p0, Lo/ffa;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/ffa;->c:I

    .line 701
    invoke-virtual {p0, v5}, Lo/ffa;->setData(Ljava/util/List;)V

    .line 702
    invoke-virtual {p0, p2}, Lo/ffa;->setSelectedPosition(I)V

    .line 703
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 704
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method public setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 484
    if-eqz p1, :cond_0

    .line 485
    iput-object p1, p0, Lo/ffa;->u:Ljava/util/List;

    goto :goto_0

    .line 487
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    .line 489
    :goto_0
    return-void
.end method

.method public setEndYear(I)V
    .locals 0

    .line 571
    iput p1, p0, Lo/ffa;->x:I

    .line 572
    return-void
.end method

.method public setInertiaScroll(Z)V
    .locals 0

    .line 550
    iput-boolean p1, p0, Lo/ffa;->m:Z

    .line 551
    return-void
.end method

.method public setIsCirculation(Z)V
    .locals 0

    .line 558
    iput-boolean p1, p0, Lo/ffa;->o:Z

    .line 559
    return-void
.end method

.method public setMaxTestSize(I)V
    .locals 0

    .line 508
    iput p1, p0, Lo/ffa;->h:I

    .line 509
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 510
    return-void
.end method

.method public setMinTestSize(I)V
    .locals 0

    .line 503
    iput p1, p0, Lo/ffa;->b:I

    .line 504
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 505
    return-void
.end method

.method public setOffSetMode(I)V
    .locals 0

    .line 562
    iput p1, p0, Lo/ffa;->e:I

    .line 563
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 564
    return-void
.end method

.method public setOnSelectedListener(Lo/ffa$a;)V
    .locals 0

    .line 538
    iput-object p1, p0, Lo/ffa;->C:Lo/ffa$a;

    .line 539
    return-void
.end method

.method public setSelectedPosition(I)V
    .locals 2

    .line 522
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/ffa;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 523
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/ffa;->q:I

    .line 524
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 525
    iget-object v0, p0, Lo/ffa;->C:Lo/ffa$a;

    if-eqz v0, :cond_1

    .line 526
    invoke-direct {p0}, Lo/ffa;->c()V

    .line 528
    :cond_1
    return-void

    .line 530
    :cond_2
    iput p1, p0, Lo/ffa;->q:I

    .line 531
    invoke-virtual {p0}, Lo/ffa;->invalidate()V

    .line 532
    iget-object v0, p0, Lo/ffa;->C:Lo/ffa$a;

    if-eqz v0, :cond_3

    .line 533
    invoke-direct {p0}, Lo/ffa;->c()V

    .line 535
    :cond_3
    return-void
.end method

.method public setStartYear(I)V
    .locals 0

    .line 567
    iput p1, p0, Lo/ffa;->y:I

    .line 568
    return-void
.end method
