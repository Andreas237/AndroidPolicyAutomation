.class public Lo/enj;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/enj$b;,
        Lo/enj$e;
    }
.end annotation


# instance fields
.field private A:Lo/enj$b;

.field private B:I

.field private C:Landroid/widget/Scroller;

.field private D:Z

.field private a:I

.field private b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

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

.field private v:I

.field private w:Landroid/support/v4/view/GestureDetectorCompat;

.field private x:I

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 76
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/enj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 80
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    const/4 v0, 0x1

    iput v0, p0, Lo/enj;->a:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->e:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->d:I

    .line 39
    const/16 v0, 0xf

    iput v0, p0, Lo/enj;->c:I

    .line 40
    const/16 v0, 0x12

    iput v0, p0, Lo/enj;->f:I

    .line 42
    const/16 v0, 0xfb

    const/16 v1, 0x65

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/enj;->k:I

    .line 43
    const/16 v0, 0x1a

    const/16 v1, 0x1a

    const/16 v2, 0x1a

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/enj;->i:I

    .line 44
    const/16 v0, 0x4d

    const/16 v1, 0x1a

    const/16 v2, 0x1a

    const/16 v3, 0x1a

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/enj;->g:I

    .line 45
    const/4 v0, 0x5

    iput v0, p0, Lo/enj;->h:I

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/enj;->n:Z

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/enj;->m:Z

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/enj;->o:Ljava/util/ArrayList;

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enj;->l:Z

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lo/enj;->r:I

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->v:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->y:F

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->B:I

    .line 81
    iput-object p1, p0, Lo/enj;->b:Landroid/content/Context;

    .line 82
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    .line 83
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 84
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p0}, Lo/enj;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/enj$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lo/enj$e;-><init>(Lo/enj;Lo/enj$5;)V

    invoke-direct {v0, v1, v2}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/enj;->w:Landroid/support/v4/view/GestureDetectorCompat;

    .line 87
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lo/enj;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    .line 88
    invoke-direct {p0, p2}, Lo/enj;->b(Landroid/util/AttributeSet;)V

    .line 89
    return-void
.end method

.method private a(ILandroid/graphics/Paint$FontMetricsInt;)F
    .locals 5

    .line 199
    iget v0, p0, Lo/enj;->x:I

    iget v1, p0, Lo/enj;->v:I

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

    .line 202
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 204
    :pswitch_0
    iget-object v0, p0, Lo/enj;->b:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 205
    goto :goto_1

    .line 208
    :pswitch_1
    iget-object v0, p0, Lo/enj;->b:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v3, v0

    .line 209
    goto :goto_1

    .line 211
    :pswitch_2
    move v4, v3

    .line 212
    goto :goto_1

    .line 214
    :pswitch_3
    iget-object v0, p0, Lo/enj;->b:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 215
    goto :goto_1

    .line 218
    :pswitch_4
    iget-object v0, p0, Lo/enj;->b:Landroid/content/Context;

    const/high16 v1, 0x42b60000    # 91.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v4, v3, v0

    .line 219
    goto :goto_1

    .line 222
    :goto_0
    iget v0, p0, Lo/enj;->x:I

    iget v1, p0, Lo/enj;->v:I

    mul-int/2addr v1, p1

    add-int/2addr v0, v1

    iget v1, p0, Lo/enj;->v:I

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

    .line 226
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

.method static synthetic a(Lo/enj;)Ljava/util/List;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    return-object v0
.end method

.method private a(Landroid/graphics/Canvas;II)V
    .locals 6

    .line 163
    const-string v2, ""

    .line 164
    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p2, :cond_0

    .line 165
    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 167
    :cond_0
    const/4 v3, 0x0

    .line 168
    if-nez p3, :cond_1

    .line 169
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/enj;->f:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 171
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    .line 172
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 173
    goto :goto_0

    .line 174
    :cond_1
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/enj;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 175
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 177
    :goto_0
    iget v0, p0, Lo/enj;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 179
    :pswitch_0
    const/4 v3, 0x0

    .line 180
    goto :goto_2

    .line 182
    :pswitch_1
    iget v0, p0, Lo/enj;->q:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 183
    goto :goto_2

    .line 185
    :pswitch_2
    iget v0, p0, Lo/enj;->q:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float v3, v0, v1

    .line 186
    goto :goto_2

    .line 188
    :goto_1
    iget v0, p0, Lo/enj;->q:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 191
    :goto_2
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v4

    .line 193
    invoke-direct {p0, p3, v4}, Lo/enj;->a(ILandroid/graphics/Paint$FontMetricsInt;)F

    move-result v5

    .line 194
    invoke-direct {p0, p3}, Lo/enj;->d(I)V

    .line 195
    iget v0, p0, Lo/enj;->y:F

    add-float/2addr v0, v5

    iget-object v1, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 196
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lo/enj;FF)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lo/enj;->d(FF)V

    return-void
.end method

.method private b(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)I"
        }
    .end annotation

    .line 604
    const/4 v2, 0x0

    .line 606
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 607
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 608
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 609
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    cmpg-float v0, v3, v0

    if-gez v0, :cond_0

    .line 610
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 611
    move v2, v4

    .line 608
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 615
    :cond_1
    return v2
.end method

.method private b(Landroid/util/AttributeSet;)V
    .locals 3

    .line 92
    if-eqz p1, :cond_4

    .line 94
    invoke-virtual {p0}, Lo/enj;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 96
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_min_text_size:I

    iget v1, p0, Lo/enj;->c:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/enj;->c:I

    .line 98
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_max_text_size:I

    iget v1, p0, Lo/enj;->f:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/enj;->f:I

    .line 100
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_start_color:I

    iget v1, p0, Lo/enj;->k:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/enj;->k:I

    .line 102
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_end_color:I

    iget v1, p0, Lo/enj;->g:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/enj;->g:I

    .line 104
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_visible_item_count:I

    iget v1, p0, Lo/enj;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/enj;->h:I

    .line 107
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_offset_mode:I

    iget v1, p0, Lo/enj;->a:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/enj;->a:I

    .line 110
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_content_mode:I

    iget v1, p0, Lo/enj;->d:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/enj;->d:I

    .line 113
    iget v0, p0, Lo/enj;->a:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/enj;->a:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 114
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lo/enj;->a:I

    .line 116
    :cond_1
    iget v0, p0, Lo/enj;->d:I

    if-ltz v0, :cond_2

    iget v0, p0, Lo/enj;->d:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_3

    .line 117
    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lo/enj;->d:I

    .line 119
    :cond_3
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_is_circulation:I

    iget-boolean v1, p0, Lo/enj;->m:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/enj;->m:Z

    .line 120
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->ScrollDatePickerView_disallow_intercept_touch:I

    iget-boolean v1, p0, Lo/enj;->l:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/enj;->l:Z

    .line 122
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 125
    :cond_4
    iget v0, p0, Lo/enj;->d:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/enj;->setContentMode(II)V

    .line 127
    return-void
.end method

.method static synthetic b(Lo/enj;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lo/enj;->n:Z

    return v0
.end method

.method static synthetic c(Lo/enj;)Lo/enj$b;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/enj;->A:Lo/enj$b;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 375
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/enj;->D:Z

    if-eqz v0, :cond_1

    .line 376
    :cond_0
    return-void

    .line 378
    :cond_1
    invoke-virtual {p0}, Lo/enj;->a()V

    .line 380
    iget v0, p0, Lo/enj;->y:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 381
    iget v0, p0, Lo/enj;->v:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 382
    iget v0, p0, Lo/enj;->y:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_2

    .line 383
    iget v0, p0, Lo/enj;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/enj;->c(FI)V

    goto :goto_0

    .line 386
    :cond_2
    iget v0, p0, Lo/enj;->y:F

    iget v1, p0, Lo/enj;->v:I

    invoke-direct {p0, v0, v1}, Lo/enj;->c(FI)V

    .line 388
    :goto_0
    goto :goto_1

    .line 389
    :cond_3
    iget v0, p0, Lo/enj;->v:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v4, v0

    .line 391
    iget v0, p0, Lo/enj;->y:F

    neg-float v0, v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_4

    .line 392
    iget v0, p0, Lo/enj;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/enj;->c(FI)V

    goto :goto_1

    .line 395
    :cond_4
    iget v0, p0, Lo/enj;->y:F

    iget v1, p0, Lo/enj;->v:I

    neg-int v1, v1

    invoke-direct {p0, v0, v1}, Lo/enj;->c(FI)V

    .line 398
    :goto_1
    return-void
.end method

.method private c(FI)V
    .locals 5

    .line 411
    float-to-int v0, p1

    iput v0, p0, Lo/enj;->B:I

    .line 412
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/enj;->j:Z

    .line 413
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    float-to-int v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 414
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    invoke-virtual {v0, p2}, Landroid/widget/Scroller;->setFinalY(I)V

    .line 415
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 416
    return-void
.end method

.method static synthetic d(Lo/enj;)F
    .locals 1

    .line 30
    iget v0, p0, Lo/enj;->y:F

    return v0
.end method

.method private d()V
    .locals 3

    .line 420
    iget v0, p0, Lo/enj;->r:I

    iget v1, p0, Lo/enj;->t:I

    if-ne v0, v1, :cond_0

    .line 421
    return-void

    .line 423
    :cond_0
    iget v0, p0, Lo/enj;->t:I

    iput v0, p0, Lo/enj;->r:I

    .line 425
    iget-object v0, p0, Lo/enj;->A:Lo/enj$b;

    if-eqz v0, :cond_1

    .line 426
    iget-object v0, p0, Lo/enj;->A:Lo/enj$b;

    iget-object v1, p0, Lo/enj;->u:Ljava/util/List;

    iget v2, p0, Lo/enj;->t:I

    invoke-interface {v0, v1, v2}, Lo/enj$b;->a(Ljava/util/List;I)V

    .line 428
    :cond_1
    iget-object v0, p0, Lo/enj;->A:Lo/enj$b;

    if-eqz v0, :cond_2

    .line 429
    new-instance v0, Lo/enj$5;

    invoke-direct {v0, p0}, Lo/enj$5;-><init>(Lo/enj;)V

    invoke-virtual {p0, v0}, Lo/enj;->post(Ljava/lang/Runnable;)Z

    .line 436
    :cond_2
    return-void
.end method

.method private d(FF)V
    .locals 9

    .line 401
    float-to-int v0, p1

    iput v0, p0, Lo/enj;->B:I

    .line 402
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/enj;->D:Z

    .line 404
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    float-to-int v2, p1

    float-to-int v4, p2

    iget v1, p0, Lo/enj;->v:I

    mul-int/lit8 v7, v1, -0xa

    iget v1, p0, Lo/enj;->v:I

    mul-int/lit8 v8, v1, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 406
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 407
    return-void
.end method

.method private d(I)V
    .locals 2

    .line 235
    iget v1, p0, Lo/enj;->g:I

    .line 237
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 238
    :cond_0
    iget v1, p0, Lo/enj;->i:I

    goto :goto_0

    .line 239
    :cond_1
    const/4 v0, -0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 240
    :cond_2
    iget v1, p0, Lo/enj;->g:I

    goto :goto_0

    .line 241
    :cond_3
    if-nez p1, :cond_4

    .line 242
    iget v1, p0, Lo/enj;->k:I

    .line 244
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 245
    return-void
.end method

.method static synthetic e(Lo/enj;)I
    .locals 1

    .line 30
    iget v0, p0, Lo/enj;->t:I

    return v0
.end method

.method private e()V
    .locals 2

    .line 325
    iget v0, p0, Lo/enj;->y:F

    iget v1, p0, Lo/enj;->v:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 326
    iget v0, p0, Lo/enj;->t:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/enj;->t:I

    .line 328
    iget v0, p0, Lo/enj;->t:I

    if-gez v0, :cond_2

    .line 329
    iget-boolean v0, p0, Lo/enj;->m:Z

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/enj;->t:I

    .line 331
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->y:F

    goto/16 :goto_0

    .line 333
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->t:I

    .line 334
    iget v0, p0, Lo/enj;->v:I

    int-to-float v0, v0

    iput v0, p0, Lo/enj;->y:F

    .line 335
    iget-boolean v0, p0, Lo/enj;->D:Z

    if-eqz v0, :cond_1

    .line 336
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 339
    :cond_1
    iget-boolean v0, p0, Lo/enj;->j:Z

    if-eqz v0, :cond_7

    .line 340
    iget v0, p0, Lo/enj;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/enj;->c(FI)V

    goto/16 :goto_0

    .line 344
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->y:F

    goto :goto_0

    .line 346
    :cond_3
    iget v0, p0, Lo/enj;->y:F

    iget v1, p0, Lo/enj;->v:I

    neg-int v1, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_7

    .line 347
    iget v0, p0, Lo/enj;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/enj;->t:I

    .line 349
    iget v0, p0, Lo/enj;->t:I

    iget-object v1, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_6

    .line 350
    iget-boolean v0, p0, Lo/enj;->m:Z

    if-eqz v0, :cond_4

    .line 351
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->t:I

    .line 352
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->y:F

    goto :goto_0

    .line 354
    :cond_4
    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/enj;->t:I

    .line 355
    iget v0, p0, Lo/enj;->v:I

    neg-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lo/enj;->y:F

    .line 357
    iget-boolean v0, p0, Lo/enj;->D:Z

    if-eqz v0, :cond_5

    .line 358
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 361
    :cond_5
    iget-boolean v0, p0, Lo/enj;->j:Z

    if-eqz v0, :cond_7

    .line 362
    iget v0, p0, Lo/enj;->y:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/enj;->c(FI)V

    goto :goto_0

    .line 366
    :cond_6
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->y:F

    .line 370
    :cond_7
    :goto_0
    invoke-direct {p0}, Lo/enj;->d()V

    .line 371
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 318
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enj;->j:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enj;->D:Z

    .line 319
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 320
    return-void
.end method

.method public computeScroll()V
    .locals 2

    .line 298
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    iget v0, p0, Lo/enj;->y:F

    iget-object v1, p0, Lo/enj;->C:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/enj;->B:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/enj;->y:F

    .line 301
    iget-object v0, p0, Lo/enj;->C:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    iput v0, p0, Lo/enj;->B:I

    .line 302
    invoke-direct {p0}, Lo/enj;->e()V

    .line 303
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    goto :goto_0

    .line 306
    :cond_0
    iget-boolean v0, p0, Lo/enj;->D:Z

    if-eqz v0, :cond_1

    .line 307
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enj;->D:Z

    .line 308
    invoke-direct {p0}, Lo/enj;->c()V

    goto :goto_0

    .line 309
    :cond_1
    iget-boolean v0, p0, Lo/enj;->j:Z

    if-eqz v0, :cond_2

    .line 310
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enj;->j:Z

    .line 311
    invoke-direct {p0}, Lo/enj;->d()V

    .line 315
    :cond_2
    :goto_0
    return-void
.end method

.method public getContentMode()I
    .locals 1

    .line 619
    iget v0, p0, Lo/enj;->d:I

    return v0
.end method

.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 475
    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    return-object v0
.end method

.method public getListener()Lo/enj$b;
    .locals 1

    .line 530
    iget-object v0, p0, Lo/enj;->A:Lo/enj$b;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 132
    iget v0, p0, Lo/enj;->t:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/enj;->a(Landroid/graphics/Canvas;II)V

    .line 133
    iget v0, p0, Lo/enj;->h:I

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v2, v0, 0x1

    .line 136
    const/4 v4, 0x1

    :goto_0
    if-gt v4, v2, :cond_6

    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-gt v4, v0, :cond_6

    .line 138
    iget v0, p0, Lo/enj;->t:I

    sub-int/2addr v0, v4

    if-gez v0, :cond_0

    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/enj;->t:I

    add-int/2addr v0, v1

    sub-int v3, v0, v4

    goto :goto_1

    :cond_0
    iget v0, p0, Lo/enj;->t:I

    sub-int v3, v0, v4

    .line 140
    :goto_1
    iget-boolean v0, p0, Lo/enj;->m:Z

    if-eqz v0, :cond_1

    .line 141
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/enj;->a(Landroid/graphics/Canvas;II)V

    goto :goto_2

    .line 142
    :cond_1
    iget v0, p0, Lo/enj;->t:I

    sub-int/2addr v0, v4

    if-ltz v0, :cond_2

    .line 143
    neg-int v0, v4

    invoke-direct {p0, p1, v3, v0}, Lo/enj;->a(Landroid/graphics/Canvas;II)V

    .line 146
    :cond_2
    :goto_2
    iget v0, p0, Lo/enj;->t:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_3

    iget v0, p0, Lo/enj;->t:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/enj;->u:Ljava/util/List;

    .line 147
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int v3, v0, v1

    goto :goto_3

    :cond_3
    iget v0, p0, Lo/enj;->t:I

    add-int v3, v0, v4

    .line 148
    :goto_3
    iget-boolean v0, p0, Lo/enj;->m:Z

    if-eqz v0, :cond_4

    .line 149
    invoke-direct {p0, p1, v3, v4}, Lo/enj;->a(Landroid/graphics/Canvas;II)V

    goto :goto_4

    .line 150
    :cond_4
    iget v0, p0, Lo/enj;->t:I

    add-int/2addr v0, v4

    iget-object v1, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 151
    invoke-direct {p0, p1, v3, v4}, Lo/enj;->a(Landroid/graphics/Canvas;II)V

    .line 136
    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 154
    :cond_6
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 249
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 250
    invoke-virtual {p0}, Lo/enj;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/enj;->q:I

    .line 251
    invoke-virtual {p0}, Lo/enj;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/enj;->s:I

    .line 252
    iget v0, p0, Lo/enj;->s:I

    iget v1, p0, Lo/enj;->h:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/enj;->v:I

    .line 253
    iget v0, p0, Lo/enj;->h:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/enj;->v:I

    mul-int/2addr v0, v1

    iput v0, p0, Lo/enj;->x:I

    .line 254
    iget v0, p0, Lo/enj;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 255
    iget v0, p0, Lo/enj;->e:I

    iget v1, p0, Lo/enj;->s:I

    invoke-virtual {p0, v0, v1}, Lo/enj;->setMeasuredDimension(II)V

    .line 257
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 261
    iget-object v0, p0, Lo/enj;->w:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 263
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 266
    :pswitch_0
    iget-boolean v0, p0, Lo/enj;->l:Z

    if-eqz v0, :cond_0

    .line 267
    invoke-virtual {p0}, Lo/enj;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 268
    if-eqz v3, :cond_0

    .line 269
    const/4 v0, 0x1

    invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 272
    :cond_0
    invoke-virtual {p0}, Lo/enj;->a()V

    .line 273
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/enj;->z:F

    .line 274
    goto :goto_0

    .line 276
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lo/enj;->z:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 277
    const/4 v0, 0x1

    return v0

    .line 279
    :cond_1
    iget v0, p0, Lo/enj;->y:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Lo/enj;->z:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/enj;->y:F

    .line 280
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/enj;->z:F

    .line 281
    invoke-direct {p0}, Lo/enj;->e()V

    .line 282
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 283
    goto :goto_0

    .line 286
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/enj;->z:F

    .line 287
    invoke-direct {p0}, Lo/enj;->c()V

    .line 288
    .line 292
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

    .line 484
    iput p1, p0, Lo/enj;->k:I

    .line 485
    iput p2, p0, Lo/enj;->g:I

    .line 486
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 487
    return-void
.end method

.method public setContentMode(II)V
    .locals 9

    .line 555
    iput p1, p0, Lo/enj;->d:I

    .line 557
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 558
    iget v0, p0, Lo/enj;->d:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 560
    :sswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enj;->m:Z

    .line 561
    iget-object v0, p0, Lo/enj;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 562
    const-string v0, "111"

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    :cond_0
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/enj;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 566
    const-string v8, ""

    .line 567
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 568
    iget-object v0, p0, Lo/enj;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_sport_kms_string_en:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/enj;->o:Ljava/util/ArrayList;

    .line 570
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 568
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 572
    :cond_1
    iget-object v0, p0, Lo/enj;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hw_show_sport_kms_string:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/enj;->o:Ljava/util/ArrayList;

    .line 574
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 572
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 576
    :goto_1
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 578
    :cond_2
    goto :goto_4

    .line 580
    :goto_2
    const/4 v7, 0x0

    :goto_3
    const/16 v0, 0x3c

    if-ge v7, v0, :cond_3

    .line 581
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 585
    :cond_3
    :goto_4
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/enj;->f:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 587
    invoke-direct {p0, v6}, Lo/enj;->b(Ljava/util/List;)I

    move-result v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 588
    iget-object v0, p0, Lo/enj;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/enj;->e:I

    .line 589
    invoke-virtual {p0, v6}, Lo/enj;->setData(Ljava/util/List;)V

    .line 590
    invoke-virtual {p0, p2}, Lo/enj;->setSelectedPosition(I)V

    .line 591
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 592
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method public setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 466
    if-eqz p1, :cond_0

    .line 467
    iput-object p1, p0, Lo/enj;->u:Ljava/util/List;

    goto :goto_0

    .line 470
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/enj;->u:Ljava/util/List;

    .line 472
    :goto_0
    return-void
.end method

.method public setDataArray(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 522
    iput-object p1, p0, Lo/enj;->o:Ljava/util/ArrayList;

    .line 523
    return-void
.end method

.method public setInertiaScroll(Z)V
    .locals 0

    .line 546
    iput-boolean p1, p0, Lo/enj;->n:Z

    .line 547
    return-void
.end method

.method public setIsCirculation(Z)V
    .locals 0

    .line 538
    iput-boolean p1, p0, Lo/enj;->m:Z

    .line 539
    return-void
.end method

.method public setOffSetMode(I)V
    .locals 0

    .line 550
    iput p1, p0, Lo/enj;->a:I

    .line 551
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 552
    return-void
.end method

.method public setOnSelectedListener(Lo/enj$b;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lo/enj;->A:Lo/enj$b;

    .line 527
    return-void
.end method

.method public setSelectedPosition(I)V
    .locals 2

    .line 504
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/enj;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 505
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/enj;->t:I

    .line 506
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 507
    iget-object v0, p0, Lo/enj;->A:Lo/enj$b;

    if-eqz v0, :cond_1

    .line 509
    invoke-direct {p0}, Lo/enj;->d()V

    .line 511
    :cond_1
    return-void

    .line 513
    :cond_2
    iput p1, p0, Lo/enj;->t:I

    .line 514
    invoke-virtual {p0}, Lo/enj;->invalidate()V

    .line 515
    iget-object v0, p0, Lo/enj;->A:Lo/enj$b;

    if-eqz v0, :cond_3

    .line 517
    invoke-direct {p0}, Lo/enj;->d()V

    .line 519
    :cond_3
    return-void
.end method
