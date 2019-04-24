.class public Lo/bze;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bze$c;
    }
.end annotation


# instance fields
.field protected a:Lo/bzc;

.field protected b:Lo/efy;

.field protected c:Lo/bzc;

.field protected d:Lo/bzc;

.field protected e:Lo/bzc;

.field protected f:Lo/efy;

.field protected g:I

.field protected h:Lo/bze$c;

.field private i:I

.field protected k:Lo/efy;

.field private l:I

.field private m:Lo/bze$c;

.field private n:I

.field private o:I

.field private p:I

.field private q:Z

.field private u:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bze;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    invoke-direct {p0, p1}, Lo/bze;->a(Landroid/content/Context;)V

    .line 54
    return-void
.end method

.method static synthetic a(Lo/bze;)I
    .locals 1

    .line 20
    iget v0, p0, Lo/bze;->o:I

    return v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 0

    .line 57
    invoke-virtual {p0, p1}, Lo/bze;->d(Landroid/content/Context;)V

    .line 58
    invoke-virtual {p0}, Lo/bze;->a()V

    .line 59
    invoke-virtual {p0}, Lo/bze;->c()V

    .line 60
    invoke-virtual {p0}, Lo/bze;->d()V

    .line 61
    return-void
.end method

.method private a(Lo/bzc;Lo/efy;)V
    .locals 7

    .line 368
    invoke-virtual {p1}, Lo/bzc;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Lo/bzc;->getRight()I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v3, v0, 0x2

    .line 369
    invoke-virtual {p1}, Lo/bzc;->getWvHeight()I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    .line 370
    invoke-virtual {p1}, Lo/bzc;->getSelectedTextWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lo/bze;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v1

    add-int v5, v0, v1

    .line 371
    invoke-virtual {p1}, Lo/bzc;->getSelectedTextHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p2}, Lo/efy;->getBaseline()I

    move-result v1

    sub-int v6, v0, v1

    .line 372
    invoke-virtual {p2}, Lo/efy;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 373
    neg-int v0, v3

    sub-int/2addr v0, v5

    int-to-float v0, v0

    invoke-virtual {p2, v0}, Lo/efy;->setTranslationX(F)V

    goto :goto_0

    .line 375
    :cond_0
    add-int v0, v3, v5

    int-to-float v0, v0

    invoke-virtual {p2, v0}, Lo/efy;->setTranslationX(F)V

    .line 377
    :goto_0
    add-int v0, v4, v6

    int-to-float v0, v0

    invoke-virtual {p2, v0}, Lo/efy;->setTranslationY(F)V

    .line 378
    return-void
.end method

.method protected static b(I)Ljava/lang/String;
    .locals 2

    .line 387
    int-to-double v0, p0

    invoke-static {v0, v1}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 362
    iget-object v0, p0, Lo/bze;->c:Lo/bzc;

    iget-object v1, p0, Lo/bze;->b:Lo/efy;

    invoke-direct {p0, v0, v1}, Lo/bze;->a(Lo/bzc;Lo/efy;)V

    .line 363
    iget-object v0, p0, Lo/bze;->e:Lo/bzc;

    iget-object v1, p0, Lo/bze;->k:Lo/efy;

    invoke-direct {p0, v0, v1}, Lo/bze;->a(Lo/bzc;Lo/efy;)V

    .line 364
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    iget-object v1, p0, Lo/bze;->f:Lo/efy;

    invoke-direct {p0, v0, v1}, Lo/bze;->a(Lo/bzc;Lo/efy;)V

    .line 365
    return-void
.end method

.method static synthetic d(Lo/bze;)I
    .locals 1

    .line 20
    iget v0, p0, Lo/bze;->p:I

    return v0
.end method

.method static synthetic e(Lo/bze;)I
    .locals 1

    .line 20
    iget v0, p0, Lo/bze;->l:I

    return v0
.end method


# virtual methods
.method protected a(I)I
    .locals 1

    .line 280
    div-int/lit16 v0, p1, 0xe10

    return v0
.end method

.method protected a()V
    .locals 3

    .line 78
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/bze;->u:Landroid/graphics/Paint;

    .line 79
    iget-object v0, p0, Lo/bze;->u:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/bze;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$dimen;->sug_divider_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 80
    iget-object v0, p0, Lo/bze;->u:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/bze;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->divider_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    new-instance v0, Lo/bze$c;

    invoke-direct {v0}, Lo/bze$c;-><init>()V

    iput-object v0, p0, Lo/bze;->h:Lo/bze$c;

    .line 83
    new-instance v0, Lo/bze$c;

    invoke-direct {v0}, Lo/bze$c;-><init>()V

    iput-object v0, p0, Lo/bze;->m:Lo/bze$c;

    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bze;->q:Z

    .line 86
    return-void
.end method

.method protected b(ILo/bzc;)V
    .locals 1

    .line 308
    iget v0, p0, Lo/bze;->g:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/bze;->g:I

    .line 309
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0, p2}, Lo/bze;->e(ILo/bzc;)V

    .line 310
    return-void
.end method

.method protected b(Lo/bze$c;I)V
    .locals 5

    .line 336
    iget v0, p0, Lo/bze;->i:I

    if-ge p2, v0, :cond_0

    .line 337
    const/4 v0, 0x0

    iput v0, p1, Lo/bze$c;->e:I

    .line 338
    const/4 v0, 0x0

    iput v0, p1, Lo/bze$c;->d:I

    .line 339
    const/4 v0, 0x0

    iput v0, p1, Lo/bze$c;->b:I

    .line 340
    return-void

    .line 343
    :cond_0
    invoke-virtual {p0, p2}, Lo/bze;->a(I)I

    move-result v2

    .line 344
    invoke-virtual {p0, p2}, Lo/bze;->c(I)I

    move-result v3

    .line 345
    invoke-virtual {p0, p2}, Lo/bze;->d(I)I

    move-result v4

    .line 347
    iget v0, p0, Lo/bze;->l:I

    sub-int v0, v2, v0

    iput v0, p1, Lo/bze$c;->e:I

    .line 348
    iget v0, p1, Lo/bze$c;->e:I

    mul-int/lit8 v0, v0, 0x3c

    add-int/2addr v0, v3

    iget v1, p0, Lo/bze;->o:I

    sub-int/2addr v0, v1

    iput v0, p1, Lo/bze$c;->d:I

    .line 349
    iget v0, p1, Lo/bze$c;->d:I

    mul-int/lit8 v0, v0, 0x3c

    add-int/2addr v0, v4

    iget v1, p0, Lo/bze;->p:I

    sub-int/2addr v0, v1

    iput v0, p1, Lo/bze$c;->b:I

    .line 350
    return-void
.end method

.method protected c(I)I
    .locals 2

    .line 284
    div-int/lit8 v0, p1, 0x3c

    rem-int/lit8 v0, v0, 0x3c

    return v0
.end method

.method protected c()V
    .locals 1

    .line 89
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bze;->setStartTime(I)V

    .line 90
    const v0, 0x1517f

    invoke-virtual {p0, v0}, Lo/bze;->setEndTime(I)V

    .line 91
    return-void
.end method

.method protected c(ILo/bzc;)V
    .locals 2

    .line 298
    iget v0, p0, Lo/bze;->g:I

    mul-int/lit16 v1, p1, 0xe10

    add-int/2addr v0, v1

    iput v0, p0, Lo/bze;->g:I

    .line 299
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0, p2}, Lo/bze;->e(ILo/bzc;)V

    .line 300
    return-void
.end method

.method protected d(I)I
    .locals 1

    .line 288
    rem-int/lit8 v0, p1, 0x3c

    return v0
.end method

.method protected d()V
    .locals 2

    .line 95
    iget-object v0, p0, Lo/bze;->c:Lo/bzc;

    new-instance v1, Lo/bze$5;

    invoke-direct {v1, p0}, Lo/bze$5;-><init>(Lo/bze;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 106
    iget-object v0, p0, Lo/bze;->e:Lo/bzc;

    new-instance v1, Lo/bze$3;

    invoke-direct {v1, p0}, Lo/bze$3;-><init>(Lo/bze;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 117
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    new-instance v1, Lo/bze$1;

    invoke-direct {v1, p0}, Lo/bze$1;-><init>(Lo/bze;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 127
    return-void
.end method

.method protected d(ILo/bzc;)V
    .locals 2

    .line 303
    iget v0, p0, Lo/bze;->g:I

    mul-int/lit8 v1, p1, 0x3c

    add-int/2addr v0, v1

    iput v0, p0, Lo/bze;->g:I

    .line 304
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0, p2}, Lo/bze;->e(ILo/bzc;)V

    .line 305
    return-void
.end method

.method protected d(Landroid/content/Context;)V
    .locals 1

    .line 65
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_inflate_time_view:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 67
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_hour:I

    invoke-virtual {p0, v0}, Lo/bze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bze;->b:Lo/efy;

    .line 68
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_min:I

    invoke-virtual {p0, v0}, Lo/bze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bze;->k:Lo/efy;

    .line 69
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_second:I

    invoke-virtual {p0, v0}, Lo/bze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bze;->f:Lo/efy;

    .line 71
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_wheel_ampm:I

    invoke-virtual {p0, v0}, Lo/bze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzc;

    iput-object v0, p0, Lo/bze;->a:Lo/bzc;

    .line 72
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_wheel_hour:I

    invoke-virtual {p0, v0}, Lo/bze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzc;

    iput-object v0, p0, Lo/bze;->c:Lo/bzc;

    .line 73
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_wheel_min:I

    invoke-virtual {p0, v0}, Lo/bze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzc;

    iput-object v0, p0, Lo/bze;->e:Lo/bzc;

    .line 74
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_wheel_second:I

    invoke-virtual {p0, v0}, Lo/bze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzc;

    iput-object v0, p0, Lo/bze;->d:Lo/bzc;

    .line 75
    return-void
.end method

.method public d(Z)V
    .locals 3

    .line 273
    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 274
    :goto_0
    iget-boolean v0, p0, Lo/bze;->q:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    .line 275
    :goto_1
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    invoke-virtual {v0, v1}, Lo/bzc;->setVisibility(I)V

    .line 276
    iget-object v0, p0, Lo/bze;->f:Lo/efy;

    invoke-virtual {v0, v2}, Lo/efy;->setVisibility(I)V

    .line 277
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 193
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 195
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getWvHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/bze;->d:Lo/bzc;

    invoke-virtual {v1}, Lo/bzc;->getSelectItemHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v6, v0, v1

    .line 196
    move-object v0, p1

    int-to-float v2, v6

    invoke-virtual {p0}, Lo/bze;->getWidth()I

    move-result v1

    int-to-float v3, v1

    int-to-float v4, v6

    iget-object v5, p0, Lo/bze;->u:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 198
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getWvHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/bze;->d:Lo/bzc;

    invoke-virtual {v1}, Lo/bzc;->getSelectItemHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int v6, v0, v1

    .line 199
    move-object v0, p1

    int-to-float v2, v6

    invoke-virtual {p0}, Lo/bze;->getWidth()I

    move-result v1

    int-to-float v3, v1

    int-to-float v4, v6

    iget-object v5, p0, Lo/bze;->u:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 200
    return-void
.end method

.method protected e(I)I
    .locals 1

    .line 292
    iget v0, p0, Lo/bze;->n:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 293
    iget v0, p0, Lo/bze;->i:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 294
    return p1
.end method

.method protected e()V
    .locals 6

    .line 131
    new-instance v2, Lo/bze$c;

    invoke-direct {v2}, Lo/bze$c;-><init>()V

    .line 132
    iget v0, p0, Lo/bze;->n:I

    invoke-virtual {p0, v2, v0}, Lo/bze;->b(Lo/bze$c;I)V

    .line 134
    iget v0, v2, Lo/bze$c;->e:I

    add-int/lit8 v3, v0, 0x1

    .line 135
    iget-object v0, p0, Lo/bze;->c:Lo/bzc;

    new-instance v1, Lo/bze$2;

    invoke-direct {v1, p0, v3}, Lo/bze$2;-><init>(Lo/bze;I)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 147
    iget v0, v2, Lo/bze$c;->d:I

    add-int/lit8 v4, v0, 0x1

    .line 148
    iget-object v0, p0, Lo/bze;->e:Lo/bzc;

    new-instance v1, Lo/bze$4;

    invoke-direct {v1, p0, v4}, Lo/bze$4;-><init>(Lo/bze;I)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 160
    iget v0, v2, Lo/bze$c;->b:I

    add-int/lit8 v5, v0, 0x1

    .line 161
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    new-instance v1, Lo/bze$6;

    invoke-direct {v1, p0, v5}, Lo/bze$6;-><init>(Lo/bze;I)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 172
    return-void
.end method

.method protected e(ILo/bzc;)V
    .locals 2

    .line 313
    invoke-virtual {p0, p1}, Lo/bze;->e(I)I

    move-result v0

    iput v0, p0, Lo/bze;->g:I

    .line 315
    iget-object v0, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0, v1}, Lo/bze;->b(Lo/bze$c;I)V

    .line 316
    iget-object v0, p0, Lo/bze;->a:Lo/bzc;

    if-eq v0, p2, :cond_0

    .line 317
    iget-object v0, p0, Lo/bze;->h:Lo/bze$c;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->c:I

    iput v1, v0, Lo/bze$c;->c:I

    .line 318
    iget-object v0, p0, Lo/bze;->a:Lo/bzc;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->c:I

    invoke-virtual {v0, v1}, Lo/bzc;->setSeletion(I)V

    .line 320
    :cond_0
    iget-object v0, p0, Lo/bze;->c:Lo/bzc;

    if-eq v0, p2, :cond_1

    .line 321
    iget-object v0, p0, Lo/bze;->h:Lo/bze$c;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->e:I

    iput v1, v0, Lo/bze$c;->e:I

    .line 322
    iget-object v0, p0, Lo/bze;->c:Lo/bzc;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->e:I

    invoke-virtual {v0, v1}, Lo/bzc;->setSeletion(I)V

    .line 324
    :cond_1
    iget-object v0, p0, Lo/bze;->e:Lo/bzc;

    if-eq v0, p2, :cond_2

    .line 325
    iget-object v0, p0, Lo/bze;->h:Lo/bze$c;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->d:I

    iput v1, v0, Lo/bze$c;->d:I

    .line 326
    iget-object v0, p0, Lo/bze;->e:Lo/bzc;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->d:I

    invoke-virtual {v0, v1}, Lo/bzc;->setSeletion(I)V

    .line 328
    :cond_2
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    if-eq v0, p2, :cond_3

    .line 329
    iget-object v0, p0, Lo/bze;->h:Lo/bze$c;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->b:I

    iput v1, v0, Lo/bze$c;->b:I

    .line 330
    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    iget-object v1, p0, Lo/bze;->m:Lo/bze$c;

    iget v1, v1, Lo/bze$c;->b:I

    invoke-virtual {v0, v1}, Lo/bzc;->setSeletion(I)V

    .line 332
    :cond_3
    return-void
.end method

.method public e(Z)V
    .locals 4

    .line 255
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/bze;->c:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 256
    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lo/bze;->e:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    .line 257
    :goto_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lo/bze;->d:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    .line 259
    :goto_2
    iput-boolean p1, p0, Lo/bze;->q:Z

    .line 260
    iget-object v0, p0, Lo/bze;->b:Lo/efy;

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 261
    iget-object v0, p0, Lo/bze;->k:Lo/efy;

    invoke-virtual {v0, v2}, Lo/efy;->setVisibility(I)V

    .line 262
    iget-object v0, p0, Lo/bze;->f:Lo/efy;

    invoke-virtual {v0, v3}, Lo/efy;->setVisibility(I)V

    .line 263
    return-void
.end method

.method public getHour()I
    .locals 1

    .line 239
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->a(I)I

    move-result v0

    return v0
.end method

.method public getMinute()I
    .locals 1

    .line 243
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->c(I)I

    move-result v0

    return v0
.end method

.method public getSecond()I
    .locals 1

    .line 247
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->d(I)I

    move-result v0

    return v0
.end method

.method public getTime()I
    .locals 1

    .line 251
    iget v0, p0, Lo/bze;->g:I

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 176
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 177
    invoke-virtual {p0}, Lo/bze;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 178
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 182
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    .line 183
    invoke-virtual {p0}, Lo/bze;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 184
    return-void
.end method

.method public onGlobalLayout()V
    .locals 0

    .line 188
    invoke-direct {p0}, Lo/bze;->b()V

    .line 189
    return-void
.end method

.method public setEndTime(I)V
    .locals 1

    .line 217
    iput p1, p0, Lo/bze;->n:I

    .line 218
    invoke-virtual {p0}, Lo/bze;->e()V

    .line 220
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->e(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/bze;->setTime(I)V

    .line 221
    return-void
.end method

.method public setHour(I)V
    .locals 3

    .line 224
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0}, Lo/bze;->getHour()I

    move-result v1

    sub-int v1, p1, v1

    mul-int/lit16 v1, v1, 0xe10

    add-int/2addr v0, v1

    iput v0, p0, Lo/bze;->g:I

    .line 225
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->setTime(I)V

    .line 226
    return-void
.end method

.method public setMinute(I)V
    .locals 3

    .line 229
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0}, Lo/bze;->getMinute()I

    move-result v1

    sub-int v1, p1, v1

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v0, v1

    iput v0, p0, Lo/bze;->g:I

    .line 230
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->setTime(I)V

    .line 231
    return-void
.end method

.method public setSecond(I)V
    .locals 2

    .line 234
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0}, Lo/bze;->getSecond()I

    move-result v1

    sub-int v1, p1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/bze;->g:I

    .line 235
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->setTime(I)V

    .line 236
    return-void
.end method

.method public setStartTime(I)V
    .locals 1

    .line 207
    iput p1, p0, Lo/bze;->i:I

    .line 208
    iget v0, p0, Lo/bze;->i:I

    invoke-virtual {p0, v0}, Lo/bze;->a(I)I

    move-result v0

    iput v0, p0, Lo/bze;->l:I

    .line 209
    iget v0, p0, Lo/bze;->i:I

    invoke-virtual {p0, v0}, Lo/bze;->c(I)I

    move-result v0

    iput v0, p0, Lo/bze;->o:I

    .line 210
    iget v0, p0, Lo/bze;->i:I

    invoke-virtual {p0, v0}, Lo/bze;->d(I)I

    move-result v0

    iput v0, p0, Lo/bze;->p:I

    .line 211
    invoke-virtual {p0}, Lo/bze;->e()V

    .line 213
    iget v0, p0, Lo/bze;->g:I

    invoke-virtual {p0, v0}, Lo/bze;->e(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/bze;->setTime(I)V

    .line 214
    return-void
.end method

.method public setTime(I)V
    .locals 1

    .line 203
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/bze;->e(ILo/bzc;)V

    .line 204
    return-void
.end method
