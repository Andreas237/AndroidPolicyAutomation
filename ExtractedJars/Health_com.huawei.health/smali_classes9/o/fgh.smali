.class public Lo/fgh;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fgh$d;,
        Lo/fgh$e;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/Scroller;

.field private C:Z

.field private D:I

.field private a:I

.field private b:I

.field private c:Landroid/content/Context;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:Z

.field private m:Landroid/graphics/Paint;

.field private n:Z

.field private o:I

.field private p:Z

.field private q:I

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private s:I

.field private t:I

.field private u:I

.field private v:F

.field private w:Landroid/support/v4/view/GestureDetectorCompat;

.field private x:Lo/fgh$d;

.field private y:F

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 86
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fgh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 87
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 91
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    const/4 v0, 0x1

    iput v0, p0, Lo/fgh;->d:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->a:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->b:I

    .line 47
    const/16 v0, 0xf

    iput v0, p0, Lo/fgh;->e:I

    .line 48
    const/16 v0, 0x12

    iput v0, p0, Lo/fgh;->h:I

    .line 50
    const/16 v0, 0xfb

    const/16 v1, 0x65

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/fgh;->f:I

    .line 51
    const/high16 v0, -0x1000000

    iput v0, p0, Lo/fgh;->k:I

    .line 52
    const/high16 v0, -0x1000000

    iput v0, p0, Lo/fgh;->g:I

    .line 53
    const/4 v0, 0x5

    iput v0, p0, Lo/fgh;->i:I

    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fgh;->p:Z

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fgh;->n:Z

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgh;->l:Z

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/fgh;->q:I

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->t:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->y:F

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->D:I

    .line 92
    iput-object p1, p0, Lo/fgh;->c:Landroid/content/Context;

    .line 93
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    .line 94
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 95
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 96
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p0}, Lo/fgh;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/fgh$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lo/fgh$e;-><init>(Lo/fgh;Lo/fgh$2;)V

    invoke-direct {v0, v1, v2}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/fgh;->w:Landroid/support/v4/view/GestureDetectorCompat;

    .line 98
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lo/fgh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    .line 100
    invoke-direct {p0, p2}, Lo/fgh;->c(Landroid/util/AttributeSet;)V

    .line 101
    return-void
.end method

.method private a()V
    .locals 3

    .line 415
    iget v0, p0, Lo/fgh;->q:I

    iget v1, p0, Lo/fgh;->s:I

    if-ne v0, v1, :cond_0

    .line 416
    return-void

    .line 418
    :cond_0
    iget v0, p0, Lo/fgh;->s:I

    iput v0, p0, Lo/fgh;->q:I

    .line 420
    iget-object v0, p0, Lo/fgh;->x:Lo/fgh$d;

    if-eqz v0, :cond_1

    .line 422
    iget-object v0, p0, Lo/fgh;->x:Lo/fgh$d;

    iget-object v1, p0, Lo/fgh;->r:Ljava/util/List;

    iget v2, p0, Lo/fgh;->s:I

    invoke-interface {v0, v1, v2}, Lo/fgh$d;->d(Ljava/util/List;I)V

    .line 433
    :cond_1
    return-void
.end method

.method private a(FI)V
    .locals 5

    .line 397
    float-to-int v0, p1

    iput v0, p0, Lo/fgh;->D:I

    .line 398
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fgh;->j:Z

    .line 399
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    float-to-int v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 400
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    invoke-virtual {v0, p2}, Landroid/widget/Scroller;->setFinalY(I)V

    .line 401
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 402
    return-void
.end method

.method private a(I)V
    .locals 2

    .line 243
    iget v1, p0, Lo/fgh;->g:I

    .line 244
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 245
    :cond_0
    iget v1, p0, Lo/fgh;->k:I

    goto :goto_0

    .line 246
    :cond_1
    const/4 v0, -0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 247
    :cond_2
    iget v1, p0, Lo/fgh;->g:I

    goto :goto_0

    .line 248
    :cond_3
    if-nez p1, :cond_4

    .line 249
    iget v1, p0, Lo/fgh;->f:I

    .line 251
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 252
    return-void
.end method

.method static synthetic a(Lo/fgh;FF)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lo/fgh;->c(FF)V

    return-void
.end method

.method static synthetic b(Lo/fgh;)F
    .locals 1

    .line 37
    iget v0, p0, Lo/fgh;->y:F

    return v0
.end method

.method private b(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)I"
        }
    .end annotation

    .line 693
    const/4 v2, 0x0

    .line 696
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 697
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 698
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 699
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    cmpg-float v0, v3, v0

    if-gez v0, :cond_0

    .line 700
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 701
    move v2, v4

    .line 698
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 705
    :cond_1
    return v2
.end method

.method private b()V
    .locals 5

    .line 373
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/fgh;->C:Z

    if-eqz v0, :cond_1

    .line 374
    :cond_0
    return-void

    .line 376
    :cond_1
    invoke-virtual {p0}, Lo/fgh;->d()V

    .line 378
    iget v0, p0, Lo/fgh;->y:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 379
    iget v0, p0, Lo/fgh;->t:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 380
    iget v0, p0, Lo/fgh;->y:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_2

    .line 381
    iget v0, p0, Lo/fgh;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/fgh;->a(FI)V

    goto :goto_0

    .line 383
    :cond_2
    iget v0, p0, Lo/fgh;->y:F

    iget v1, p0, Lo/fgh;->t:I

    invoke-direct {p0, v0, v1}, Lo/fgh;->a(FI)V

    .line 385
    :goto_0
    goto :goto_1

    .line 386
    :cond_3
    iget v0, p0, Lo/fgh;->t:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 387
    iget v0, p0, Lo/fgh;->y:F

    neg-float v0, v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_4

    .line 388
    iget v0, p0, Lo/fgh;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/fgh;->a(FI)V

    goto :goto_1

    .line 390
    :cond_4
    iget v0, p0, Lo/fgh;->y:F

    iget v1, p0, Lo/fgh;->t:I

    neg-int v1, v1

    invoke-direct {p0, v0, v1}, Lo/fgh;->a(FI)V

    .line 393
    :goto_1
    return-void
.end method

.method private c()V
    .locals 2

    .line 363
    iget-boolean v0, p0, Lo/fgh;->C:Z

    if-eqz v0, :cond_0

    .line 364
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 366
    :cond_0
    iget-boolean v0, p0, Lo/fgh;->j:Z

    if-eqz v0, :cond_1

    .line 367
    iget v0, p0, Lo/fgh;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/fgh;->a(FI)V

    .line 369
    :cond_1
    return-void
.end method

.method private c(FF)V
    .locals 9

    .line 406
    float-to-int v0, p1

    iput v0, p0, Lo/fgh;->D:I

    .line 407
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fgh;->C:Z

    .line 409
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    float-to-int v2, p1

    float-to-int v4, p2

    iget v1, p0, Lo/fgh;->t:I

    mul-int/lit8 v7, v1, -0xa

    iget v1, p0, Lo/fgh;->t:I

    mul-int/lit8 v8, v1, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 411
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 412
    return-void
.end method

.method private c(Landroid/util/AttributeSet;)V
    .locals 3

    .line 104
    if-eqz p1, :cond_4

    .line 105
    invoke-virtual {p0}, Lo/fgh;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 107
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_min_text_size:I

    iget v1, p0, Lo/fgh;->e:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->e:I

    .line 109
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_max_text_size:I

    iget v1, p0, Lo/fgh;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->h:I

    .line 111
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_start_color:I

    iget v1, p0, Lo/fgh;->f:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->f:I

    .line 113
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_end_color:I

    iget v1, p0, Lo/fgh;->g:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->g:I

    .line 115
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_mid_color:I

    iget v1, p0, Lo/fgh;->k:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->k:I

    .line 117
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_visible_item_count:I

    iget v1, p0, Lo/fgh;->i:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->i:I

    .line 120
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_offset_mode:I

    iget v1, p0, Lo/fgh;->d:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->d:I

    .line 123
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_content_mode:I

    iget v1, p0, Lo/fgh;->b:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/fgh;->b:I

    .line 126
    iget v0, p0, Lo/fgh;->d:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/fgh;->d:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 127
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lo/fgh;->d:I

    .line 129
    :cond_1
    iget v0, p0, Lo/fgh;->b:I

    if-ltz v0, :cond_2

    iget v0, p0, Lo/fgh;->b:I

    const/16 v1, 0x9

    if-le v0, v1, :cond_3

    .line 130
    :cond_2
    const/4 v0, 0x4

    iput v0, p0, Lo/fgh;->b:I

    .line 132
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_is_circulation:I

    iget-boolean v1, p0, Lo/fgh;->n:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/fgh;->n:Z

    .line 133
    sget v0, Lcom/huawei/ui/main/R$styleable;->ScrollDatePickerView_disallow_intercept_touch:I

    iget-boolean v1, p0, Lo/fgh;->l:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/fgh;->l:Z

    .line 134
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 137
    :cond_4
    iget v0, p0, Lo/fgh;->b:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/fgh;->setContentMode(II)V

    .line 138
    return-void
.end method

.method static synthetic d(Lo/fgh;)Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lo/fgh;->p:Z

    return v0
.end method

.method private e(ILandroid/graphics/Paint$FontMetricsInt;)F
    .locals 5

    .line 211
    iget v0, p0, Lo/fgh;->z:I

    iget v1, p0, Lo/fgh;->t:I

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

    .line 214
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 216
    :pswitch_0
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 217
    goto :goto_1

    .line 219
    :pswitch_1
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 220
    goto :goto_1

    .line 222
    :pswitch_2
    move v4, v3

    .line 223
    goto :goto_1

    .line 225
    :pswitch_3
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 226
    goto :goto_1

    .line 228
    :pswitch_4
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 229
    goto :goto_1

    .line 231
    :goto_0
    iget v0, p0, Lo/fgh;->z:I

    iget v1, p0, Lo/fgh;->t:I

    mul-int/2addr v1, p1

    add-int/2addr v0, v1

    iget v1, p0, Lo/fgh;->t:I

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

    .line 235
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

.method private e()V
    .locals 2

    .line 328
    iget v0, p0, Lo/fgh;->y:F

    iget v1, p0, Lo/fgh;->t:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 329
    iget v0, p0, Lo/fgh;->s:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fgh;->s:I

    .line 330
    iget v0, p0, Lo/fgh;->s:I

    if-gez v0, :cond_1

    .line 331
    iget-boolean v0, p0, Lo/fgh;->n:Z

    if-eqz v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fgh;->s:I

    .line 333
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->y:F

    goto/16 :goto_0

    .line 335
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->s:I

    .line 336
    iget v0, p0, Lo/fgh;->t:I

    int-to-float v0, v0

    iput v0, p0, Lo/fgh;->y:F

    .line 337
    invoke-direct {p0}, Lo/fgh;->c()V

    goto :goto_0

    .line 340
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->y:F

    goto :goto_0

    .line 343
    :cond_2
    iget v0, p0, Lo/fgh;->y:F

    iget v1, p0, Lo/fgh;->t:I

    neg-int v1, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 344
    iget v0, p0, Lo/fgh;->s:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fgh;->s:I

    .line 345
    iget v0, p0, Lo/fgh;->s:I

    iget-object v1, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_4

    .line 346
    iget-boolean v0, p0, Lo/fgh;->n:Z

    if-eqz v0, :cond_3

    .line 347
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->s:I

    .line 348
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->y:F

    goto :goto_0

    .line 350
    :cond_3
    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fgh;->s:I

    .line 351
    iget v0, p0, Lo/fgh;->t:I

    neg-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lo/fgh;->y:F

    .line 352
    invoke-direct {p0}, Lo/fgh;->c()V

    goto :goto_0

    .line 355
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->y:F

    .line 358
    :cond_5
    :goto_0
    invoke-direct {p0}, Lo/fgh;->a()V

    .line 359
    return-void
.end method

.method private e(Landroid/graphics/Canvas;II)V
    .locals 6

    .line 174
    const-string v2, ""

    .line 176
    const/4 v0, -0x1

    if-ge v0, p2, :cond_0

    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 180
    :cond_0
    const/4 v3, 0x0

    .line 181
    if-nez p3, :cond_1

    .line 182
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/fgh;->h:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 183
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    .line 184
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 185
    goto :goto_0

    .line 186
    :cond_1
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/fgh;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 187
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 189
    :goto_0
    iget v0, p0, Lo/fgh;->d:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 191
    :pswitch_0
    const/4 v3, 0x0

    .line 192
    goto :goto_2

    .line 194
    :pswitch_1
    iget v0, p0, Lo/fgh;->o:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 195
    goto :goto_2

    .line 197
    :pswitch_2
    iget v0, p0, Lo/fgh;->o:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float v3, v0, v1

    .line 198
    goto :goto_2

    .line 200
    :goto_1
    iget v0, p0, Lo/fgh;->o:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 203
    :goto_2
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v4

    .line 205
    invoke-direct {p0, p3, v4}, Lo/fgh;->e(ILandroid/graphics/Paint$FontMetricsInt;)F

    move-result v5

    .line 206
    invoke-direct {p0, p3}, Lo/fgh;->a(I)V

    .line 207
    iget v0, p0, Lo/fgh;->y:F

    add-float/2addr v0, v5

    iget-object v1, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 208
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public c(F)I
    .locals 3

    .line 752
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 753
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public computeScroll()V
    .locals 2

    .line 304
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    iget v0, p0, Lo/fgh;->y:F

    iget-object v1, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/fgh;->D:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fgh;->y:F

    .line 307
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    iput v0, p0, Lo/fgh;->D:I

    .line 308
    invoke-direct {p0}, Lo/fgh;->e()V

    .line 309
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    goto :goto_0

    .line 311
    :cond_0
    iget-boolean v0, p0, Lo/fgh;->C:Z

    if-eqz v0, :cond_1

    .line 312
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgh;->C:Z

    .line 313
    invoke-direct {p0}, Lo/fgh;->b()V

    goto :goto_0

    .line 314
    :cond_1
    iget-boolean v0, p0, Lo/fgh;->j:Z

    if-eqz v0, :cond_2

    .line 315
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgh;->j:Z

    .line 316
    invoke-direct {p0}, Lo/fgh;->a()V

    .line 319
    :cond_2
    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 322
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgh;->j:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgh;->C:Z

    .line 323
    iget-object v0, p0, Lo/fgh;->A:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 324
    return-void
.end method

.method public getContentMode()I
    .locals 1

    .line 709
    iget v0, p0, Lo/fgh;->b:I

    return v0
.end method

.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 460
    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    return-object v0
.end method

.method public getListener()Lo/fgh$d;
    .locals 1

    .line 522
    iget-object v0, p0, Lo/fgh;->x:Lo/fgh$d;

    return-object v0
.end method

.method public getSelectedItem()Ljava/lang/String;
    .locals 2

    .line 493
    iget v0, p0, Lo/fgh;->s:I

    iget-object v1, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 494
    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    iget v1, p0, Lo/fgh;->s:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 497
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 143
    iget v0, p0, Lo/fgh;->s:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/fgh;->e(Landroid/graphics/Canvas;II)V

    .line 144
    iget v0, p0, Lo/fgh;->i:I

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v2, v0, 0x1

    .line 147
    const/4 v4, 0x1

    :goto_0
    if-gt v4, v2, :cond_6

    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-gt v4, v0, :cond_6

    .line 149
    iget v0, p0, Lo/fgh;->s:I

    sub-int/2addr v0, v4

    if-gez v0, :cond_0

    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/fgh;->s:I

    add-int/2addr v0, v1

    sub-int v3, v0, v4

    goto :goto_1

    :cond_0
    iget v0, p0, Lo/fgh;->s:I

    sub-int v3, v0, v4

    .line 151
    :goto_1
    iget-boolean v0, p0, Lo/fgh;->n:Z

    if-eqz v0, :cond_1

    .line 152
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/fgh;->e(Landroid/graphics/Canvas;II)V

    goto :goto_2

    .line 153
    :cond_1
    iget v0, p0, Lo/fgh;->s:I

    sub-int/2addr v0, v4

    if-ltz v0, :cond_2

    .line 154
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/fgh;->e(Landroid/graphics/Canvas;II)V

    .line 158
    :cond_2
    :goto_2
    iget v0, p0, Lo/fgh;->s:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_3

    iget v0, p0, Lo/fgh;->s:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/fgh;->r:Ljava/util/List;

    .line 159
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int v3, v0, v1

    goto :goto_3

    :cond_3
    iget v0, p0, Lo/fgh;->s:I

    add-int v3, v0, v4

    .line 160
    :goto_3
    iget-boolean v0, p0, Lo/fgh;->n:Z

    if-eqz v0, :cond_4

    .line 161
    invoke-direct {p0, p1, v3, v4}, Lo/fgh;->e(Landroid/graphics/Canvas;II)V

    goto :goto_4

    .line 162
    :cond_4
    iget v0, p0, Lo/fgh;->s:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 163
    invoke-direct {p0, p1, v3, v4}, Lo/fgh;->e(Landroid/graphics/Canvas;II)V

    .line 147
    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 166
    :cond_6
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 256
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 258
    invoke-virtual {p0}, Lo/fgh;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/fgh;->o:I

    .line 259
    invoke-virtual {p0}, Lo/fgh;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/fgh;->u:I

    .line 260
    iget v0, p0, Lo/fgh;->u:I

    iget v1, p0, Lo/fgh;->i:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/fgh;->t:I

    .line 261
    iget v0, p0, Lo/fgh;->i:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/fgh;->t:I

    mul-int/2addr v0, v1

    iput v0, p0, Lo/fgh;->z:I

    .line 262
    iget v0, p0, Lo/fgh;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 263
    iget v0, p0, Lo/fgh;->a:I

    iget v1, p0, Lo/fgh;->u:I

    invoke-virtual {p0, v0, v1}, Lo/fgh;->setMeasuredDimension(II)V

    .line 265
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 270
    iget-object v0, p0, Lo/fgh;->w:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 271
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 273
    :pswitch_0
    iget-boolean v0, p0, Lo/fgh;->l:Z

    if-eqz v0, :cond_0

    .line 274
    invoke-virtual {p0}, Lo/fgh;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 275
    if-eqz v3, :cond_0

    .line 276
    const/4 v0, 0x1

    invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 280
    :cond_0
    invoke-virtual {p0}, Lo/fgh;->d()V

    .line 281
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fgh;->v:F

    .line 282
    goto :goto_0

    .line 284
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lo/fgh;->v:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 285
    const/4 v0, 0x1

    return v0

    .line 287
    :cond_1
    iget v0, p0, Lo/fgh;->y:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Lo/fgh;->v:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fgh;->y:F

    .line 288
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fgh;->v:F

    .line 289
    invoke-direct {p0}, Lo/fgh;->e()V

    .line 290
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 291
    goto :goto_0

    .line 293
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fgh;->v:F

    .line 294
    invoke-direct {p0}, Lo/fgh;->b()V

    .line 295
    .line 299
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

    .line 476
    iput p1, p0, Lo/fgh;->f:I

    .line 477
    iput p2, p0, Lo/fgh;->g:I

    .line 478
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 479
    return-void
.end method

.method public setContent(Ljava/lang/String;I)V
    .locals 3

    .line 549
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 550
    :cond_0
    return-void

    .line 553
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fgh;->setSelectedPosition(I)V

    .line 554
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 555
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/fgh;->h:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 558
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/fgh;->a:I

    .line 559
    invoke-virtual {p0, v2}, Lo/fgh;->setData(Ljava/util/List;)V

    .line 560
    invoke-virtual {p0, p2}, Lo/fgh;->setSelectedPosition(I)V

    .line 561
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 562
    return-void
.end method

.method public setContent(Ljava/util/ArrayList;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 566
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 568
    :cond_0
    return-void

    .line 571
    :cond_1
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/fgh;->h:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 572
    invoke-direct {p0, p1}, Lo/fgh;->b(Ljava/util/List;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 573
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/fgh;->a:I

    .line 574
    invoke-virtual {p0, p1}, Lo/fgh;->setData(Ljava/util/List;)V

    .line 575
    invoke-virtual {p0, p2}, Lo/fgh;->setSelectedPosition(I)V

    .line 576
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 577
    return-void
.end method

.method public setContentMode(II)V
    .locals 11

    .line 579
    iput p1, p0, Lo/fgh;->b:I

    .line 580
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 581
    iget v0, p0, Lo/fgh;->b:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_11

    .line 583
    :pswitch_0
    const/16 v6, 0x76c

    :goto_0
    const/16 v0, 0x834

    if-gt v6, v0, :cond_1

    .line 584
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 585
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgh;->c:Landroid/content/Context;

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

    .line 587
    :cond_0
    invoke-virtual {p0}, Lo/fgh;->getResources()Landroid/content/res/Resources;

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

    .line 583
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 590
    :cond_1
    goto/16 :goto_13

    .line 592
    :pswitch_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 593
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 595
    const/16 v0, 0xc

    new-array v8, v0, [Ljava/lang/String;

    .line 596
    const v9, 0x10030

    .line 599
    const/4 v10, 0x0

    :goto_2
    const/16 v0, 0xc

    if-ge v10, v0, :cond_2

    .line 600
    const/4 v0, 0x2

    invoke-virtual {v6, v0, v10}, Ljava/util/Calendar;->set(II)V

    .line 601
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2, v9}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v7

    .line 602
    aput-object v7, v8, v10

    .line 599
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 604
    :cond_2
    const/4 v10, 0x1

    :goto_3
    const/16 v0, 0xd

    if-ge v10, v0, :cond_3

    .line 605
    add-int/lit8 v0, v10, -0x1

    aget-object v0, v8, v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 607
    :cond_3
    goto/16 :goto_13

    .line 609
    :pswitch_2
    const/4 v10, 0x1

    :goto_4
    const/16 v0, 0x20

    if-ge v10, v0, :cond_5

    .line 610
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 611
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgh;->c:Landroid/content/Context;

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

    .line 613
    :cond_4
    invoke-virtual {p0}, Lo/fgh;->getResources()Landroid/content/res/Resources;

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

    .line 609
    :goto_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 616
    :cond_5
    goto/16 :goto_13

    .line 618
    :pswitch_3
    const/4 v10, 0x0

    :goto_6
    const/16 v0, 0x18

    if-ge v10, v0, :cond_6

    .line 619
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

    .line 618
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    .line 621
    :cond_6
    goto/16 :goto_13

    .line 623
    :pswitch_4
    const/4 v10, 0x0

    :goto_7
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_7

    .line 624
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

    .line 623
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    .line 626
    :cond_7
    goto/16 :goto_13

    .line 628
    :pswitch_5
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_alarm_am:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_alarm_pm:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 630
    goto/16 :goto_13

    .line 632
    :pswitch_6
    const/4 v10, 0x1

    :goto_8
    const/16 v0, 0xd

    if-ge v10, v0, :cond_8

    .line 633
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

    .line 632
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    .line 635
    :cond_8
    goto/16 :goto_13

    .line 637
    :pswitch_7
    const/4 v10, 0x1

    :goto_9
    const/16 v0, 0x1d

    if-ge v10, v0, :cond_a

    .line 638
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 639
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgh;->c:Landroid/content/Context;

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

    .line 641
    :cond_9
    invoke-virtual {p0}, Lo/fgh;->getResources()Landroid/content/res/Resources;

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

    .line 637
    :goto_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    .line 644
    :cond_a
    goto/16 :goto_13

    .line 646
    :pswitch_8
    const/4 v10, 0x1

    :goto_b
    const/16 v0, 0x1e

    if-ge v10, v0, :cond_c

    .line 647
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 648
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgh;->c:Landroid/content/Context;

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

    .line 650
    :cond_b
    invoke-virtual {p0}, Lo/fgh;->getResources()Landroid/content/res/Resources;

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

    .line 646
    :goto_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_b

    .line 652
    :cond_c
    goto/16 :goto_13

    .line 654
    :pswitch_9
    const/4 v10, 0x1

    :goto_d
    const/16 v0, 0x1f

    if-ge v10, v0, :cond_e

    .line 655
    iget-object v0, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 656
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgh;->c:Landroid/content/Context;

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

    .line 658
    :cond_d
    invoke-virtual {p0}, Lo/fgh;->getResources()Landroid/content/res/Resources;

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

    .line 654
    :goto_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    .line 661
    :cond_e
    goto/16 :goto_13

    .line 663
    :pswitch_a
    const/4 v10, 0x1

    :goto_f
    const/16 v0, 0x9

    if-ge v10, v0, :cond_f

    .line 664
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    add-int/lit8 v10, v10, 0x1

    goto :goto_f

    .line 666
    :cond_f
    goto :goto_13

    .line 668
    :pswitch_b
    const/4 v10, 0x0

    :goto_10
    const/16 v0, 0xc

    if-ge v10, v0, :cond_10

    .line 669
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgh;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ins:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 668
    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    .line 671
    :cond_10
    goto :goto_13

    .line 673
    :goto_11
    const/4 v10, 0x0

    :goto_12
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_11

    .line 674
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

    .line 673
    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    .line 679
    :cond_11
    :goto_13
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/fgh;->h:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 681
    iget v0, p0, Lo/fgh;->b:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_12

    .line 682
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    goto :goto_14

    .line 684
    :cond_12
    invoke-direct {p0, v5}, Lo/fgh;->b(Ljava/util/List;)I

    move-result v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 686
    :goto_14
    iget-object v0, p0, Lo/fgh;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/fgh;->a:I

    .line 687
    invoke-virtual {p0, v5}, Lo/fgh;->setData(Ljava/util/List;)V

    .line 688
    invoke-virtual {p0, p2}, Lo/fgh;->setSelectedPosition(I)V

    .line 689
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 690
    return-void

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
    .end packed-switch
.end method

.method public setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 464
    if-eqz p1, :cond_0

    .line 465
    iput-object p1, p0, Lo/fgh;->r:Ljava/util/List;

    goto :goto_0

    .line 467
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    .line 469
    :goto_0
    return-void
.end method

.method public setInertiaScroll(Z)V
    .locals 0

    .line 530
    iput-boolean p1, p0, Lo/fgh;->p:Z

    .line 531
    return-void
.end method

.method public setIsCirculation(Z)V
    .locals 0

    .line 538
    iput-boolean p1, p0, Lo/fgh;->n:Z

    .line 539
    return-void
.end method

.method public setMaxTestSize(I)V
    .locals 0

    .line 488
    iput p1, p0, Lo/fgh;->h:I

    .line 489
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 490
    return-void
.end method

.method public setMinTestSize(I)V
    .locals 0

    .line 483
    iput p1, p0, Lo/fgh;->e:I

    .line 484
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 485
    return-void
.end method

.method public setOffSetMode(I)V
    .locals 0

    .line 542
    iput p1, p0, Lo/fgh;->d:I

    .line 543
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 544
    return-void
.end method

.method public setOnSelectedListener(Lo/fgh$d;)V
    .locals 0

    .line 518
    iput-object p1, p0, Lo/fgh;->x:Lo/fgh$d;

    .line 519
    return-void
.end method

.method public setSelectedPosition(I)V
    .locals 2

    .line 502
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/fgh;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 503
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/fgh;->s:I

    .line 504
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 505
    iget-object v0, p0, Lo/fgh;->x:Lo/fgh$d;

    if-eqz v0, :cond_1

    .line 506
    invoke-direct {p0}, Lo/fgh;->a()V

    .line 508
    :cond_1
    return-void

    .line 510
    :cond_2
    iput p1, p0, Lo/fgh;->s:I

    .line 511
    invoke-virtual {p0}, Lo/fgh;->invalidate()V

    .line 512
    iget-object v0, p0, Lo/fgh;->x:Lo/fgh$d;

    if-eqz v0, :cond_3

    .line 513
    invoke-direct {p0}, Lo/fgh;->a()V

    .line 515
    :cond_3
    return-void
.end method
