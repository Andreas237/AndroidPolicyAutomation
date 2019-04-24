.class public Lo/egm;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egm$e;,
        Lo/egm$a;
    }
.end annotation


# instance fields
.field private B:I

.field private C:Z

.field private D:Landroid/widget/Scroller;

.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:I

.field private m:Z

.field private n:Z

.field private o:Landroid/graphics/Paint;

.field private p:Z

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

.field private v:Landroid/support/v4/view/GestureDetectorCompat;

.field private w:F

.field private x:I

.field private y:F

.field private z:Lo/egm$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 92
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/egm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 93
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 97
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    const/4 v0, 0x1

    iput v0, p0, Lo/egm;->b:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->e:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->c:I

    .line 53
    const/16 v0, 0xf

    iput v0, p0, Lo/egm;->a:I

    .line 54
    const/16 v0, 0x12

    iput v0, p0, Lo/egm;->i:I

    .line 56
    const/16 v0, 0xfb

    const/16 v1, 0x65

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/egm;->f:I

    .line 57
    const/16 v0, 0xff

    const/16 v1, 0x1a

    const/16 v2, 0x1a

    const/16 v3, 0x1a

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/egm;->h:I

    .line 58
    const/16 v0, 0x32

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/egm;->g:I

    .line 59
    const/4 v0, 0x5

    iput v0, p0, Lo/egm;->k:I

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/egm;->m:Z

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/egm;->p:Z

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egm;->n:Z

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lo/egm;->t:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->r:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->y:F

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->B:I

    .line 98
    iput-object p1, p0, Lo/egm;->d:Landroid/content/Context;

    .line 99
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    .line 100
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 101
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 102
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p0}, Lo/egm;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/egm$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lo/egm$a;-><init>(Lo/egm;Lo/egm$4;)V

    invoke-direct {v0, v1, v2}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/egm;->v:Landroid/support/v4/view/GestureDetectorCompat;

    .line 104
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lo/egm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    .line 106
    invoke-direct {p0, p2}, Lo/egm;->c(Landroid/util/AttributeSet;)V

    .line 107
    return-void
.end method

.method static synthetic a(Lo/egm;FF)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lo/egm;->d(FF)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 333
    iget v0, p0, Lo/egm;->y:F

    iget v1, p0, Lo/egm;->r:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 334
    iget v0, p0, Lo/egm;->s:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/egm;->s:I

    .line 335
    iget v0, p0, Lo/egm;->s:I

    if-gez v0, :cond_1

    .line 336
    iget-boolean v0, p0, Lo/egm;->p:Z

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/egm;->s:I

    .line 338
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->y:F

    goto/16 :goto_0

    .line 340
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->s:I

    .line 341
    iget v0, p0, Lo/egm;->r:I

    int-to-float v0, v0

    iput v0, p0, Lo/egm;->y:F

    .line 342
    invoke-direct {p0}, Lo/egm;->c()V

    goto :goto_0

    .line 345
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->y:F

    goto :goto_0

    .line 348
    :cond_2
    iget v0, p0, Lo/egm;->y:F

    iget v1, p0, Lo/egm;->r:I

    neg-int v1, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 349
    iget v0, p0, Lo/egm;->s:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/egm;->s:I

    .line 350
    iget v0, p0, Lo/egm;->s:I

    iget-object v1, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_4

    .line 351
    iget-boolean v0, p0, Lo/egm;->p:Z

    if-eqz v0, :cond_3

    .line 352
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->s:I

    .line 353
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->y:F

    goto :goto_0

    .line 355
    :cond_3
    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/egm;->s:I

    .line 356
    iget v0, p0, Lo/egm;->r:I

    neg-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lo/egm;->y:F

    .line 357
    invoke-direct {p0}, Lo/egm;->c()V

    goto :goto_0

    .line 360
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->y:F

    .line 363
    :cond_5
    :goto_0
    invoke-direct {p0}, Lo/egm;->d()V

    .line 364
    return-void
.end method

.method static synthetic b(Lo/egm;)Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lo/egm;->m:Z

    return v0
.end method

.method static synthetic c(Lo/egm;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/egm;->y:F

    return v0
.end method

.method private c()V
    .locals 2

    .line 368
    iget-boolean v0, p0, Lo/egm;->C:Z

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 371
    :cond_0
    iget-boolean v0, p0, Lo/egm;->j:Z

    if-eqz v0, :cond_1

    .line 372
    iget v0, p0, Lo/egm;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/egm;->c(FI)V

    .line 374
    :cond_1
    return-void
.end method

.method private c(FI)V
    .locals 5

    .line 402
    float-to-int v0, p1

    iput v0, p0, Lo/egm;->B:I

    .line 403
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/egm;->j:Z

    .line 404
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    float-to-int v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 405
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    invoke-virtual {v0, p2}, Landroid/widget/Scroller;->setFinalY(I)V

    .line 406
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 407
    return-void
.end method

.method private c(Landroid/util/AttributeSet;)V
    .locals 3

    .line 110
    if-eqz p1, :cond_4

    .line 111
    invoke-virtual {p0}, Lo/egm;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 113
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_min_text_size:I

    iget v1, p0, Lo/egm;->a:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/egm;->a:I

    .line 115
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_max_text_size:I

    iget v1, p0, Lo/egm;->i:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/egm;->i:I

    .line 117
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_start_color:I

    iget v1, p0, Lo/egm;->f:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/egm;->f:I

    .line 119
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_end_color:I

    iget v1, p0, Lo/egm;->g:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/egm;->g:I

    .line 121
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_mid_color:I

    iget v1, p0, Lo/egm;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/egm;->h:I

    .line 123
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_visible_item_count:I

    iget v1, p0, Lo/egm;->k:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/egm;->k:I

    .line 126
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_offset_mode:I

    iget v1, p0, Lo/egm;->b:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/egm;->b:I

    .line 129
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_content_mode:I

    iget v1, p0, Lo/egm;->c:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/egm;->c:I

    .line 132
    iget v0, p0, Lo/egm;->b:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/egm;->b:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 133
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lo/egm;->b:I

    .line 135
    :cond_1
    iget v0, p0, Lo/egm;->c:I

    if-ltz v0, :cond_2

    iget v0, p0, Lo/egm;->c:I

    const/16 v1, 0x9

    if-le v0, v1, :cond_3

    .line 136
    :cond_2
    const/4 v0, 0x4

    iput v0, p0, Lo/egm;->c:I

    .line 138
    :cond_3
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_is_circulation:I

    iget-boolean v1, p0, Lo/egm;->p:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/egm;->p:Z

    .line 139
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_disallow_intercept_touch:I

    iget-boolean v1, p0, Lo/egm;->n:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/egm;->n:Z

    .line 140
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 143
    :cond_4
    iget v0, p0, Lo/egm;->c:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/egm;->setContentMode(II)V

    .line 144
    return-void
.end method

.method private d(ILandroid/graphics/Paint$FontMetricsInt;)F
    .locals 5

    .line 216
    iget v0, p0, Lo/egm;->x:I

    iget v1, p0, Lo/egm;->r:I

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

    .line 219
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 221
    :pswitch_0
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 222
    goto :goto_1

    .line 224
    :pswitch_1
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 225
    goto :goto_1

    .line 227
    :pswitch_2
    move v4, v3

    .line 228
    goto :goto_1

    .line 230
    :pswitch_3
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 231
    goto :goto_1

    .line 233
    :pswitch_4
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 234
    goto :goto_1

    .line 236
    :goto_0
    iget v0, p0, Lo/egm;->x:I

    iget v1, p0, Lo/egm;->r:I

    mul-int/2addr v1, p1

    add-int/2addr v0, v1

    iget v1, p0, Lo/egm;->r:I

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

    .line 240
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

.method private d(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)I"
        }
    .end annotation

    .line 697
    const/4 v2, 0x0

    .line 700
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 701
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 702
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 703
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    cmpg-float v0, v3, v0

    if-gez v0, :cond_0

    .line 704
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 705
    move v2, v4

    .line 702
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 709
    :cond_1
    return v2
.end method

.method private d()V
    .locals 3

    .line 420
    iget v0, p0, Lo/egm;->t:I

    iget v1, p0, Lo/egm;->s:I

    if-ne v0, v1, :cond_0

    .line 421
    return-void

    .line 423
    :cond_0
    iget v0, p0, Lo/egm;->s:I

    iput v0, p0, Lo/egm;->t:I

    .line 425
    iget-object v0, p0, Lo/egm;->z:Lo/egm$e;

    if-eqz v0, :cond_1

    .line 427
    iget-object v0, p0, Lo/egm;->z:Lo/egm$e;

    iget-object v1, p0, Lo/egm;->u:Ljava/util/List;

    iget v2, p0, Lo/egm;->s:I

    invoke-interface {v0, v1, v2}, Lo/egm$e;->d(Ljava/util/List;I)V

    .line 438
    :cond_1
    return-void
.end method

.method private d(FF)V
    .locals 9

    .line 411
    float-to-int v0, p1

    iput v0, p0, Lo/egm;->B:I

    .line 412
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/egm;->C:Z

    .line 414
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    float-to-int v2, p1

    float-to-int v4, p2

    iget v1, p0, Lo/egm;->r:I

    mul-int/lit8 v7, v1, -0xa

    iget v1, p0, Lo/egm;->r:I

    mul-int/lit8 v8, v1, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 416
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 417
    return-void
.end method

.method private d(I)V
    .locals 2

    .line 248
    iget v1, p0, Lo/egm;->g:I

    .line 249
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 250
    :cond_0
    iget v1, p0, Lo/egm;->h:I

    goto :goto_0

    .line 251
    :cond_1
    const/4 v0, -0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 252
    :cond_2
    iget v1, p0, Lo/egm;->g:I

    goto :goto_0

    .line 253
    :cond_3
    if-nez p1, :cond_4

    .line 254
    iget v1, p0, Lo/egm;->f:I

    .line 256
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 257
    return-void
.end method

.method private e()V
    .locals 5

    .line 378
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/egm;->C:Z

    if-eqz v0, :cond_1

    .line 379
    :cond_0
    return-void

    .line 381
    :cond_1
    invoke-virtual {p0}, Lo/egm;->a()V

    .line 383
    iget v0, p0, Lo/egm;->y:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 384
    iget v0, p0, Lo/egm;->r:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 385
    iget v0, p0, Lo/egm;->y:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_2

    .line 386
    iget v0, p0, Lo/egm;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/egm;->c(FI)V

    goto :goto_0

    .line 388
    :cond_2
    iget v0, p0, Lo/egm;->y:F

    iget v1, p0, Lo/egm;->r:I

    invoke-direct {p0, v0, v1}, Lo/egm;->c(FI)V

    .line 390
    :goto_0
    goto :goto_1

    .line 391
    :cond_3
    iget v0, p0, Lo/egm;->r:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 392
    iget v0, p0, Lo/egm;->y:F

    neg-float v0, v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_4

    .line 393
    iget v0, p0, Lo/egm;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/egm;->c(FI)V

    goto :goto_1

    .line 395
    :cond_4
    iget v0, p0, Lo/egm;->y:F

    iget v1, p0, Lo/egm;->r:I

    neg-int v1, v1

    invoke-direct {p0, v0, v1}, Lo/egm;->c(FI)V

    .line 398
    :goto_1
    return-void
.end method

.method private e(Landroid/graphics/Canvas;II)V
    .locals 8

    .line 180
    const/4 v0, 0x0

    if-ge v0, p2, :cond_0

    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_0

    .line 181
    const-string v0, "UIHLH_ScrollDatePickerView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawItem position not valid:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 185
    const/4 v5, 0x0

    .line 186
    if-nez p3, :cond_1

    .line 187
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/egm;->i:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 188
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v6

    .line 189
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 190
    goto :goto_0

    .line 191
    :cond_1
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/egm;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 192
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 194
    :goto_0
    iget v0, p0, Lo/egm;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 196
    :pswitch_0
    const/4 v5, 0x0

    .line 197
    goto :goto_2

    .line 199
    :pswitch_1
    iget v0, p0, Lo/egm;->l:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 200
    goto :goto_2

    .line 202
    :pswitch_2
    iget v0, p0, Lo/egm;->l:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float v5, v0, v1

    .line 203
    goto :goto_2

    .line 205
    :goto_1
    iget v0, p0, Lo/egm;->l:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 208
    :goto_2
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v6

    .line 210
    invoke-direct {p0, p3, v6}, Lo/egm;->d(ILandroid/graphics/Paint$FontMetricsInt;)F

    move-result v7

    .line 211
    invoke-direct {p0, p3}, Lo/egm;->d(I)V

    .line 212
    iget v0, p0, Lo/egm;->y:F

    add-float/2addr v0, v7

    iget-object v1, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 213
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 327
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egm;->j:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egm;->C:Z

    .line 328
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 329
    return-void
.end method

.method public computeScroll()V
    .locals 2

    .line 309
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    iget v0, p0, Lo/egm;->y:F

    iget-object v1, p0, Lo/egm;->D:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/egm;->B:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/egm;->y:F

    .line 312
    iget-object v0, p0, Lo/egm;->D:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    iput v0, p0, Lo/egm;->B:I

    .line 313
    invoke-direct {p0}, Lo/egm;->b()V

    .line 314
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    goto :goto_0

    .line 316
    :cond_0
    iget-boolean v0, p0, Lo/egm;->C:Z

    if-eqz v0, :cond_1

    .line 317
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egm;->C:Z

    .line 318
    invoke-direct {p0}, Lo/egm;->e()V

    goto :goto_0

    .line 319
    :cond_1
    iget-boolean v0, p0, Lo/egm;->j:Z

    if-eqz v0, :cond_2

    .line 320
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egm;->j:Z

    .line 321
    invoke-direct {p0}, Lo/egm;->d()V

    .line 324
    :cond_2
    :goto_0
    return-void
.end method

.method public getContentMode()I
    .locals 1

    .line 713
    iget v0, p0, Lo/egm;->c:I

    return v0
.end method

.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 465
    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    return-object v0
.end method

.method public getListener()Lo/egm$e;
    .locals 1

    .line 526
    iget-object v0, p0, Lo/egm;->z:Lo/egm$e;

    return-object v0
.end method

.method public getSelectedItem()Ljava/lang/String;
    .locals 3

    .line 498
    const-string v2, ""

    .line 499
    iget v0, p0, Lo/egm;->s:I

    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    iget v0, p0, Lo/egm;->s:I

    iget-object v1, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 500
    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    iget v1, p0, Lo/egm;->s:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 502
    :cond_0
    return-object v2
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 149
    iget v0, p0, Lo/egm;->s:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/egm;->e(Landroid/graphics/Canvas;II)V

    .line 150
    iget v0, p0, Lo/egm;->k:I

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v2, v0, 0x1

    .line 153
    const/4 v4, 0x1

    :goto_0
    if-gt v4, v2, :cond_6

    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-gt v4, v0, :cond_6

    .line 155
    iget v0, p0, Lo/egm;->s:I

    sub-int/2addr v0, v4

    if-gez v0, :cond_0

    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/egm;->s:I

    add-int/2addr v0, v1

    sub-int v3, v0, v4

    goto :goto_1

    :cond_0
    iget v0, p0, Lo/egm;->s:I

    sub-int v3, v0, v4

    .line 157
    :goto_1
    iget-boolean v0, p0, Lo/egm;->p:Z

    if-eqz v0, :cond_1

    .line 158
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/egm;->e(Landroid/graphics/Canvas;II)V

    goto :goto_2

    .line 159
    :cond_1
    iget v0, p0, Lo/egm;->s:I

    sub-int/2addr v0, v4

    if-ltz v0, :cond_2

    .line 160
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/egm;->e(Landroid/graphics/Canvas;II)V

    .line 164
    :cond_2
    :goto_2
    iget v0, p0, Lo/egm;->s:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_3

    iget v0, p0, Lo/egm;->s:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/egm;->u:Ljava/util/List;

    .line 165
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int v3, v0, v1

    goto :goto_3

    :cond_3
    iget v0, p0, Lo/egm;->s:I

    add-int v3, v0, v4

    .line 166
    :goto_3
    iget-boolean v0, p0, Lo/egm;->p:Z

    if-eqz v0, :cond_4

    .line 167
    invoke-direct {p0, p1, v3, v4}, Lo/egm;->e(Landroid/graphics/Canvas;II)V

    goto :goto_4

    .line 168
    :cond_4
    iget v0, p0, Lo/egm;->s:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 169
    invoke-direct {p0, p1, v3, v4}, Lo/egm;->e(Landroid/graphics/Canvas;II)V

    .line 153
    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 172
    :cond_6
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 261
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 263
    invoke-virtual {p0}, Lo/egm;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/egm;->l:I

    .line 264
    invoke-virtual {p0}, Lo/egm;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/egm;->q:I

    .line 265
    iget v0, p0, Lo/egm;->q:I

    iget v1, p0, Lo/egm;->k:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/egm;->r:I

    .line 266
    iget v0, p0, Lo/egm;->k:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/egm;->r:I

    mul-int/2addr v0, v1

    iput v0, p0, Lo/egm;->x:I

    .line 267
    iget v0, p0, Lo/egm;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 268
    iget v0, p0, Lo/egm;->e:I

    iget v1, p0, Lo/egm;->q:I

    invoke-virtual {p0, v0, v1}, Lo/egm;->setMeasuredDimension(II)V

    .line 270
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 275
    iget-object v0, p0, Lo/egm;->v:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 276
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 278
    :pswitch_0
    iget-boolean v0, p0, Lo/egm;->n:Z

    if-eqz v0, :cond_0

    .line 279
    invoke-virtual {p0}, Lo/egm;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 280
    if-eqz v3, :cond_0

    .line 281
    const/4 v0, 0x1

    invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 285
    :cond_0
    invoke-virtual {p0}, Lo/egm;->a()V

    .line 286
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/egm;->w:F

    .line 287
    goto :goto_0

    .line 289
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lo/egm;->w:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 290
    const/4 v0, 0x1

    return v0

    .line 292
    :cond_1
    iget v0, p0, Lo/egm;->y:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Lo/egm;->w:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/egm;->y:F

    .line 293
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/egm;->w:F

    .line 294
    invoke-direct {p0}, Lo/egm;->b()V

    .line 295
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 296
    goto :goto_0

    .line 298
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/egm;->w:F

    .line 299
    invoke-direct {p0}, Lo/egm;->e()V

    .line 300
    .line 304
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

    .line 481
    iput p1, p0, Lo/egm;->f:I

    .line 482
    iput p2, p0, Lo/egm;->g:I

    .line 483
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 484
    return-void
.end method

.method public setContent(Ljava/lang/String;I)V
    .locals 3

    .line 553
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 554
    :cond_0
    return-void

    .line 557
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/egm;->setSelectedPosition(I)V

    .line 558
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 559
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/egm;->i:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 562
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/egm;->e:I

    .line 563
    invoke-virtual {p0, v2}, Lo/egm;->setData(Ljava/util/List;)V

    .line 564
    invoke-virtual {p0, p2}, Lo/egm;->setSelectedPosition(I)V

    .line 565
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 566
    return-void
.end method

.method public setContent(Ljava/util/ArrayList;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 570
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 572
    :cond_0
    return-void

    .line 575
    :cond_1
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/egm;->i:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 576
    invoke-direct {p0, p1}, Lo/egm;->d(Ljava/util/List;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 577
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/egm;->e:I

    .line 578
    invoke-virtual {p0, p1}, Lo/egm;->setData(Ljava/util/List;)V

    .line 579
    invoke-virtual {p0, p2}, Lo/egm;->setSelectedPosition(I)V

    .line 580
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 581
    return-void
.end method

.method public setContentMode(II)V
    .locals 11

    .line 583
    iput p1, p0, Lo/egm;->c:I

    .line 584
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 585
    iget v0, p0, Lo/egm;->c:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_11

    .line 587
    :pswitch_0
    const/16 v6, 0x76c

    :goto_0
    const/16 v0, 0x834

    if-gt v6, v0, :cond_1

    .line 588
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 589
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_fitness_detail_radio_button_tab_year:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 591
    :cond_0
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 587
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 594
    :cond_1
    goto/16 :goto_13

    .line 596
    :pswitch_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 597
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 599
    const/16 v0, 0xc

    new-array v8, v0, [Ljava/lang/String;

    .line 600
    const v9, 0x10030

    .line 603
    const/4 v10, 0x0

    :goto_2
    const/16 v0, 0xc

    if-ge v10, v0, :cond_2

    .line 604
    const/4 v0, 0x2

    invoke-virtual {v6, v0, v10}, Ljava/util/Calendar;->set(II)V

    .line 605
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2, v9}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v7

    .line 606
    aput-object v7, v8, v10

    .line 603
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 608
    :cond_2
    const/4 v10, 0x1

    :goto_3
    const/16 v0, 0xd

    if-ge v10, v0, :cond_3

    .line 609
    add-int/lit8 v0, v10, -0x1

    aget-object v0, v8, v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 611
    :cond_3
    goto/16 :goto_13

    .line 613
    :pswitch_2
    const/4 v10, 0x1

    :goto_4
    const/16 v0, 0x20

    if-ge v10, v0, :cond_5

    .line 614
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 615
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 617
    :cond_4
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    :goto_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 620
    :cond_5
    goto/16 :goto_13

    .line 622
    :pswitch_3
    const/4 v10, 0x0

    :goto_6
    const/16 v0, 0x18

    if-ge v10, v0, :cond_6

    .line 623
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

    .line 622
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    .line 625
    :cond_6
    goto/16 :goto_13

    .line 627
    :pswitch_4
    const/4 v10, 0x0

    :goto_7
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_7

    .line 628
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

    .line 627
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    .line 630
    :cond_7
    goto/16 :goto_13

    .line 632
    :pswitch_5
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_settings_alarm_am:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 633
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_settings_alarm_pm:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    goto/16 :goto_13

    .line 636
    :pswitch_6
    const/4 v10, 0x1

    :goto_8
    const/16 v0, 0xd

    if-ge v10, v0, :cond_8

    .line 637
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

    .line 636
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    .line 639
    :cond_8
    goto/16 :goto_13

    .line 641
    :pswitch_7
    const/4 v10, 0x1

    :goto_9
    const/16 v0, 0x1d

    if-ge v10, v0, :cond_a

    .line 642
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 643
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 645
    :cond_9
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 641
    :goto_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    .line 648
    :cond_a
    goto/16 :goto_13

    .line 650
    :pswitch_8
    const/4 v10, 0x1

    :goto_b
    const/16 v0, 0x1e

    if-ge v10, v0, :cond_c

    .line 651
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 652
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 654
    :cond_b
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    :goto_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_b

    .line 656
    :cond_c
    goto/16 :goto_13

    .line 658
    :pswitch_9
    const/4 v10, 0x1

    :goto_d
    const/16 v0, 0x1f

    if-ge v10, v0, :cond_e

    .line 659
    iget-object v0, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 660
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 662
    :cond_d
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 658
    :goto_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    .line 665
    :cond_e
    goto/16 :goto_13

    .line 667
    :pswitch_a
    const/4 v10, 0x1

    :goto_f
    const/16 v0, 0x9

    if-ge v10, v0, :cond_f

    .line 668
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

    iget-object v1, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    add-int/lit8 v10, v10, 0x1

    goto :goto_f

    .line 670
    :cond_f
    goto :goto_13

    .line 672
    :pswitch_b
    const/4 v10, 0x0

    :goto_10
    const/16 v0, 0xc

    if-ge v10, v0, :cond_10

    .line 673
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

    iget-object v1, p0, Lo/egm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_ins:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    .line 675
    :cond_10
    goto :goto_13

    .line 677
    :goto_11
    const/4 v10, 0x0

    :goto_12
    const/16 v0, 0x3c

    if-ge v10, v0, :cond_11

    .line 678
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

    .line 677
    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    .line 683
    :cond_11
    :goto_13
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/egm;->i:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 685
    iget v0, p0, Lo/egm;->c:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_12

    .line 686
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    goto :goto_14

    .line 688
    :cond_12
    invoke-direct {p0, v5}, Lo/egm;->d(Ljava/util/List;)I

    move-result v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 690
    :goto_14
    iget-object v0, p0, Lo/egm;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/egm;->e:I

    .line 691
    invoke-virtual {p0, v5}, Lo/egm;->setData(Ljava/util/List;)V

    .line 692
    invoke-virtual {p0, p2}, Lo/egm;->setSelectedPosition(I)V

    .line 693
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 694
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

    .line 469
    if-eqz p1, :cond_0

    .line 470
    iput-object p1, p0, Lo/egm;->u:Ljava/util/List;

    goto :goto_0

    .line 472
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/egm;->u:Ljava/util/List;

    .line 474
    :goto_0
    return-void
.end method

.method public setInertiaScroll(Z)V
    .locals 0

    .line 534
    iput-boolean p1, p0, Lo/egm;->m:Z

    .line 535
    return-void
.end method

.method public setIsCirculation(Z)V
    .locals 0

    .line 542
    iput-boolean p1, p0, Lo/egm;->p:Z

    .line 543
    return-void
.end method

.method public setMaxTestSize(I)V
    .locals 0

    .line 493
    iput p1, p0, Lo/egm;->i:I

    .line 494
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 495
    return-void
.end method

.method public setMinTestSize(I)V
    .locals 0

    .line 488
    iput p1, p0, Lo/egm;->a:I

    .line 489
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 490
    return-void
.end method

.method public setOffSetMode(I)V
    .locals 0

    .line 546
    iput p1, p0, Lo/egm;->b:I

    .line 547
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 548
    return-void
.end method

.method public setOnSelectedListener(Lo/egm$e;)V
    .locals 0

    .line 522
    iput-object p1, p0, Lo/egm;->z:Lo/egm$e;

    .line 523
    return-void
.end method

.method public setSelectedPosition(I)V
    .locals 2

    .line 506
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/egm;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 507
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/egm;->s:I

    .line 508
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 509
    iget-object v0, p0, Lo/egm;->z:Lo/egm$e;

    if-eqz v0, :cond_1

    .line 510
    invoke-direct {p0}, Lo/egm;->d()V

    .line 512
    :cond_1
    return-void

    .line 514
    :cond_2
    iput p1, p0, Lo/egm;->s:I

    .line 515
    invoke-virtual {p0}, Lo/egm;->invalidate()V

    .line 516
    iget-object v0, p0, Lo/egm;->z:Lo/egm$e;

    if-eqz v0, :cond_3

    .line 517
    invoke-direct {p0}, Lo/egm;->d()V

    .line 519
    :cond_3
    return-void
.end method
