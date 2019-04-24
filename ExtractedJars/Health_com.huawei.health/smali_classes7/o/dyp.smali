.class public Lo/dyp;
.super Lo/lf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dyp$b;
    }
.end annotation


# instance fields
.field protected a:Lo/dym;

.field protected aa:Landroid/graphics/RectF;

.field protected ab:Landroid/graphics/Canvas;

.field private ac:I

.field private ad:Lo/dys;

.field private ae:F

.field private af:I

.field private ag:I

.field private ah:F

.field private ai:[F

.field private aj:Lo/dyp$b;

.field private ak:F

.field private al:I

.field private am:Z

.field private an:Landroid/graphics/drawable/GradientDrawable;

.field private ap:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private aq:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 62
    invoke-direct {p0, p1}, Lo/lf;-><init>(Landroid/content/Context;)V

    .line 49
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->ac:I

    .line 50
    const-string v0, "#FFFDB290"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->ag:I

    .line 51
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->af:I

    .line 53
    new-instance v0, Lo/dym;

    invoke-direct {v0}, Lo/dym;-><init>()V

    iput-object v0, p0, Lo/dyp;->a:Lo/dym;

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ah:F

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ae:F

    .line 56
    const/4 v0, 0x1

    iput v0, p0, Lo/dyp;->al:I

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyp;->am:Z

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ak:F

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->aq:F

    .line 412
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    .line 605
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dyp;->ap:Ljava/lang/ref/WeakReference;

    .line 63
    invoke-direct {p0}, Lo/dyp;->D()V

    .line 64
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 67
    invoke-direct {p0, p1, p2}, Lo/lf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->ac:I

    .line 50
    const-string v0, "#FFFDB290"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->ag:I

    .line 51
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->af:I

    .line 53
    new-instance v0, Lo/dym;

    invoke-direct {v0}, Lo/dym;-><init>()V

    iput-object v0, p0, Lo/dyp;->a:Lo/dym;

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ah:F

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ae:F

    .line 56
    const/4 v0, 0x1

    iput v0, p0, Lo/dyp;->al:I

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyp;->am:Z

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ak:F

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->aq:F

    .line 412
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    .line 605
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dyp;->ap:Ljava/lang/ref/WeakReference;

    .line 68
    invoke-direct {p0}, Lo/dyp;->D()V

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 72
    invoke-direct {p0, p1, p2, p3}, Lo/lf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->ac:I

    .line 50
    const-string v0, "#FFFDB290"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->ag:I

    .line 51
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dyp;->af:I

    .line 53
    new-instance v0, Lo/dym;

    invoke-direct {v0}, Lo/dym;-><init>()V

    iput-object v0, p0, Lo/dyp;->a:Lo/dym;

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ah:F

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ae:F

    .line 56
    const/4 v0, 0x1

    iput v0, p0, Lo/dyp;->al:I

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyp;->am:Z

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->ak:F

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lo/dyp;->aq:F

    .line 412
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    .line 605
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dyp;->ap:Ljava/lang/ref/WeakReference;

    .line 73
    invoke-direct {p0}, Lo/dyp;->D()V

    .line 74
    return-void
.end method

.method private D()V
    .locals 0

    .line 189
    invoke-direct {p0}, Lo/dyp;->I()V

    .line 190
    return-void
.end method

.method private I()V
    .locals 2

    .line 195
    invoke-virtual {p0}, Lo/dyp;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 198
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyp;->setPinchZoom(Z)V

    .line 199
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyp;->setDrawBorders(Z)V

    .line 201
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dyp;->setTouchEnabled(Z)V

    .line 204
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dyp;->setDragEnabled(Z)V

    .line 206
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyp;->setScaleEnabled(Z)V

    .line 209
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyp;->setLogEnabled(Z)V

    .line 212
    invoke-virtual {p0}, Lo/dyp;->getLegend()Lo/lm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 217
    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lo/dyp;->c(II)V

    .line 218
    return-void
.end method

.method private b(Landroid/content/Context;ILjava/util/List;ZZ)Lo/ly;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Lcom/github/mikephil/charting/data/Entry;>;ZZ)Lo/ly;"
        }
    .end annotation

    .line 319
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 320
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 322
    :cond_1
    new-instance v3, Lo/ly;

    const-string v0, ""

    invoke-direct {v3, p3, v0}, Lo/ly;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 324
    invoke-virtual {v3}, Lo/ly;->c()V

    .line 325
    if-eqz p4, :cond_2

    .line 326
    new-instance v0, Lo/dyp$1;

    invoke-direct {v0, p0, p5}, Lo/dyp$1;-><init>(Lo/dyp;Z)V

    invoke-virtual {v3, v0}, Lo/ly;->b(Lo/ml;)V

    goto :goto_0

    .line 336
    :cond_2
    new-instance v0, Lo/dyp$3;

    invoke-direct {v0, p0}, Lo/dyp$3;-><init>(Lo/dyp;)V

    invoke-virtual {v3, v0}, Lo/ly;->b(Lo/ml;)V

    .line 343
    :goto_0
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    .line 345
    :pswitch_0
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v3, v0}, Lo/ly;->c(F)V

    .line 346
    iget v0, p0, Lo/dyp;->ac:I

    invoke-virtual {v3, v0}, Lo/ly;->c(I)V

    .line 348
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->a(Z)V

    .line 350
    iget v0, p0, Lo/dyp;->ac:I

    invoke-virtual {v3, v0}, Lo/ly;->i(I)V

    .line 352
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->b(Z)V

    .line 353
    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {v3, v0}, Lo/ly;->d(F)V

    .line 354
    const-string v0, "#801A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/ly;->a(I)V

    .line 357
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->d(Z)V

    .line 358
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->report_line_chart_shadow_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/ly;->d(Landroid/graphics/drawable/Drawable;)V

    .line 360
    goto/16 :goto_1

    .line 362
    :pswitch_1
    iget v0, p0, Lo/dyp;->ag:I

    invoke-virtual {v3, v0}, Lo/ly;->c(I)V

    .line 363
    const/high16 v0, 0x40400000    # 3.0f

    invoke-virtual {v3, v0}, Lo/ly;->c(F)V

    .line 364
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->a(Z)V

    .line 366
    iget v0, p0, Lo/dyp;->ag:I

    invoke-virtual {v3, v0}, Lo/ly;->i(I)V

    .line 368
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/ly;->b(Z)V

    .line 369
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v3, v0}, Lo/ly;->d(F)V

    .line 370
    iget v0, p0, Lo/dyp;->ag:I

    invoke-virtual {v3, v0}, Lo/ly;->a(I)V

    .line 373
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->d(Z)V

    .line 374
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->report_line_chart_shadow_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/ly;->d(Landroid/graphics/drawable/Drawable;)V

    .line 376
    goto :goto_1

    .line 378
    :pswitch_2
    iget v0, p0, Lo/dyp;->af:I

    invoke-virtual {v3, v0}, Lo/ly;->c(I)V

    .line 379
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v3, v0}, Lo/ly;->c(F)V

    .line 381
    const/high16 v0, 0x41200000    # 10.0f

    const/high16 v1, 0x41200000    # 10.0f

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lo/ly;->d(FFF)V

    .line 382
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->a(Z)V

    .line 384
    iget v0, p0, Lo/dyp;->af:I

    invoke-virtual {v3, v0}, Lo/ly;->i(I)V

    .line 386
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->b(Z)V

    .line 387
    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {v3, v0}, Lo/ly;->d(F)V

    .line 388
    const-string v0, "#801A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/ly;->a(I)V

    .line 390
    .line 395
    :goto_1
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c(F)I
    .locals 4

    .line 146
    iget v0, p0, Lo/dyp;->ak:F

    iget v1, p0, Lo/dyp;->aq:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 147
    const/4 v0, 0x0

    return v0

    .line 148
    :cond_0
    iget v0, p0, Lo/dyp;->aq:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    .line 149
    iget v0, p0, Lo/dyp;->al:I

    return v0

    .line 151
    :cond_1
    iget v0, p0, Lo/dyp;->ak:F

    sub-float v0, p1, v0

    iget v1, p0, Lo/dyp;->aq:F

    iget v2, p0, Lo/dyp;->ak:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/dyp;->al:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    div-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v3, v0

    .line 152
    return v3
.end method

.method private c()V
    .locals 5

    .line 157
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    iget v0, v0, Lo/ln;->d:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dyp;->ai:[F

    .line 158
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->b()Z

    move-result v3

    .line 160
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/dyp;->ai:[F

    array-length v0, v0

    if-ge v4, v0, :cond_1

    .line 161
    if-eqz v3, :cond_0

    .line 162
    iget-object v0, p0, Lo/dyp;->ai:[F

    iget-object v1, p0, Lo/dyp;->H:Lo/ln;

    iget-object v1, v1, Lo/ln;->c:[F

    div-int/lit8 v2, v4, 0x2

    aget v1, v1, v2

    aput v1, v0, v4

    goto :goto_1

    .line 164
    :cond_0
    iget-object v0, p0, Lo/dyp;->ai:[F

    iget-object v1, p0, Lo/dyp;->H:Lo/ln;

    iget-object v1, v1, Lo/ln;->a:[F

    div-int/lit8 v2, v4, 0x2

    aget v1, v1, v2

    aput v1, v0, v4

    .line 160
    :goto_1
    add-int/lit8 v4, v4, 0x2

    goto :goto_0

    .line 167
    :cond_1
    iget-object v0, p0, Lo/dyp;->q:Lo/nv;

    iget-object v1, p0, Lo/dyp;->ai:[F

    invoke-virtual {v0, v1}, Lo/nv;->e([F)V

    .line 168
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 5

    .line 623
    iget-object v0, p0, Lo/dyp;->an:Landroid/graphics/drawable/GradientDrawable;

    if-nez v0, :cond_0

    .line 625
    return-void

    .line 627
    :cond_0
    iget-object v0, p0, Lo/dyp;->an:Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lo/dyp;->O:Lo/oa;

    .line 628
    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/dyp;->O:Lo/oa;

    .line 629
    invoke-virtual {v2}, Lo/oa;->i()F

    move-result v2

    iget-object v3, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v3}, Lo/ln;->y()F

    move-result v3

    add-float/2addr v2, v3

    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 627
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V

    .line 630
    iget-object v0, p0, Lo/dyp;->an:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 632
    return-void
.end method

.method private c(Landroid/graphics/Bitmap;II)Z
    .locals 1

    .line 460
    if-nez p1, :cond_0

    .line 461
    const/4 v0, 0x0

    return v0

    .line 464
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-eq v0, p2, :cond_1

    .line 465
    const/4 v0, 0x0

    return v0

    .line 467
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-eq v0, p3, :cond_2

    .line 468
    const/4 v0, 0x0

    return v0

    .line 471
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic d(Lo/dyp;)F
    .locals 1

    .line 41
    iget v0, p0, Lo/dyp;->ah:F

    return v0
.end method

.method private d(Landroid/content/Context;Ljava/util/ArrayList;ZZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;ZZ)V"
        }
    .end annotation

    .line 298
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 300
    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dyp;->b(Landroid/content/Context;ILjava/util/List;ZZ)Lo/ly;

    move-result-object v7

    .line 303
    if-eqz v7, :cond_0

    .line 304
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    :cond_0
    const-string v0, "dataSets"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    new-instance v8, Lo/lx;

    invoke-direct {v8, v6}, Lo/lx;-><init>(Ljava/util/List;)V

    .line 312
    invoke-virtual {p0, v8}, Lo/dyp;->setData(Lo/ma;)V

    .line 313
    const/4 v0, 0x1

    new-array v9, v0, [Lo/mh;

    .line 314
    const v0, 0x4465e001    # 919.50006f

    const/high16 v1, 0x44580000    # 864.0f

    invoke-virtual {p0, v0, v1}, Lo/dyp;->a(FF)Lo/mh;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 315
    invoke-virtual {p0, v9}, Lo/dyp;->e([Lo/mh;)V

    .line 316
    return-void
.end method

.method static synthetic e(Lo/dyp;)F
    .locals 1

    .line 41
    iget v0, p0, Lo/dyp;->ae:F

    return v0
.end method

.method private getRange()V
    .locals 3

    .line 140
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    check-cast v0, Lo/dyr;

    invoke-virtual {v0}, Lo/dyr;->b()F

    move-result v0

    iput v0, p0, Lo/dyp;->ak:F

    .line 141
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    check-cast v0, Lo/dyr;

    invoke-virtual {v0}, Lo/dyr;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lo/dyp;->ak:F

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    check-cast v0, Lo/dyr;

    invoke-virtual {v0}, Lo/dyr;->a()F

    move-result v0

    :goto_0
    iput v0, p0, Lo/dyp;->aq:F

    .line 142
    const-string v0, "PLGACHIEVE_HwHealthAchieveReportLineChart"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startPoint = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dyp;->ak:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "endPoint="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dyp;->aq:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    return-void
.end method

.method public static setXAxisValueFormatter(Lo/ln;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ln;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 278
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 279
    return-void

    .line 281
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 282
    new-instance v0, Lo/dyp$4;

    invoke-direct {v0, v1, p1}, Lo/dyp$4;-><init>(ILjava/util/List;)V

    invoke-virtual {p0, v0}, Lo/ln;->b(Lo/mf;)V

    .line 295
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 5

    .line 78
    invoke-super {p0}, Lo/lf;->a()V

    .line 79
    invoke-virtual {p0}, Lo/dyp;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 80
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 81
    const-string v0, "event"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    :cond_0
    new-instance v0, Lo/dyu;

    iget-object v1, p0, Lo/dyp;->O:Lo/oa;

    invoke-virtual {p0}, Lo/dyp;->getXAxis()Lo/ln;

    move-result-object v2

    iget-object v3, p0, Lo/dyp;->q:Lo/nv;

    invoke-direct {v0, v1, v2, v3}, Lo/dyu;-><init>(Lo/oa;Lo/ln;Lo/nv;)V

    iput-object v0, p0, Lo/dyp;->x:Lo/nu;

    .line 84
    new-instance v0, Lo/dyr;

    iget-object v1, p0, Lo/dyp;->P:Lo/la;

    iget-object v2, p0, Lo/dyp;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2}, Lo/dyr;-><init>(Lo/mu;Lo/la;Lo/oa;)V

    iput-object v0, p0, Lo/dyp;->S:Lo/nj;

    .line 86
    return-void
.end method

.method public a(F)V
    .locals 3

    .line 655
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lo/dyu;->d(D)V

    .line 656
    iget-object v0, p0, Lo/dyp;->ad:Lo/dys;

    invoke-virtual {v0, p1}, Lo/dys;->e(F)V

    .line 657
    invoke-virtual {p0}, Lo/dyp;->invalidate()V

    .line 659
    return-void
.end method

.method public a(IIII)V
    .locals 0

    .line 221
    iput p1, p0, Lo/dyp;->ac:I

    .line 222
    iput p2, p0, Lo/dyp;->ag:I

    .line 223
    iput p3, p0, Lo/dyp;->af:I

    .line 224
    return-void
.end method

.method public b()V
    .locals 3

    .line 171
    iget-boolean v0, p0, Lo/dyp;->am:Z

    if-eqz v0, :cond_1

    .line 172
    invoke-direct {p0}, Lo/dyp;->getRange()V

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dyp;->am:Z

    .line 174
    invoke-virtual {p0}, Lo/dyp;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    iget v1, p0, Lo/dyp;->ak:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lo/dyu;->d(D)V

    .line 176
    iget-object v0, p0, Lo/dyp;->ad:Lo/dys;

    iget v1, p0, Lo/dyp;->ak:F

    invoke-virtual {v0, v1}, Lo/dys;->e(F)V

    goto :goto_0

    .line 178
    :cond_0
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    iget v1, p0, Lo/dyp;->aq:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lo/dyu;->d(D)V

    .line 179
    iget-object v0, p0, Lo/dyp;->ad:Lo/dys;

    iget v1, p0, Lo/dyp;->aq:F

    invoke-virtual {v0, v1}, Lo/dys;->e(F)V

    .line 183
    :cond_1
    :goto_0
    return-void
.end method

.method public c(II)V
    .locals 3

    .line 638
    const/4 v0, 0x2

    new-array v1, v0, [I

    const/4 v0, 0x0

    aput p1, v1, v0

    const/4 v0, 0x1

    aput p2, v1, v0

    .line 639
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v2, v0, v1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 640
    iput-object v2, p0, Lo/dyp;->an:Landroid/graphics/drawable/GradientDrawable;

    .line 641
    return-void
.end method

.method public d(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 406
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 407
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 408
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 407
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 410
    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    .line 645
    iget-object v0, p0, Lo/dyp;->a:Lo/dym;

    new-instance v1, Lo/dyp$5;

    invoke-direct {v1, p0}, Lo/dyp$5;-><init>(Lo/dyp;)V

    const/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2}, Lo/dym;->a(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V

    .line 652
    return-void
.end method

.method protected e(Landroid/graphics/Canvas;)V
    .locals 5

    .line 515
    iget-boolean v0, p0, Lo/dyp;->am:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dyp;->A:Lo/ma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 516
    const/4 v0, 0x2

    new-array v4, v0, [F

    iget-object v0, p0, Lo/dyp;->A:Lo/ma;

    check-cast v0, Lo/lx;

    invoke-virtual {v0}, Lo/lx;->f()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 517
    iget-object v0, p0, Lo/dyp;->q:Lo/nv;

    invoke-virtual {v0, v4}, Lo/nv;->e([F)V

    .line 518
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    const/4 v1, 0x0

    aget v1, v4, v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lo/dyu;->d(D)V

    .line 519
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    const/4 v1, 0x0

    aget v1, v4, v1

    invoke-virtual {v0, v1}, Lo/dyu;->e(F)V

    .line 520
    invoke-direct {p0}, Lo/dyp;->c()V

    .line 522
    :cond_0
    iget-object v0, p0, Lo/dyp;->A:Lo/ma;

    if-nez v0, :cond_1

    .line 523
    return-void

    .line 525
    :cond_1
    invoke-virtual {p0}, Lo/dyp;->f()V

    .line 527
    iget-object v0, p0, Lo/dyp;->A:Lo/ma;

    if-eqz v0, :cond_e

    .line 529
    invoke-virtual {p0, p1}, Lo/dyp;->a(Landroid/graphics/Canvas;)V

    .line 530
    invoke-direct {p0, p1}, Lo/dyp;->c(Landroid/graphics/Canvas;)V

    .line 531
    iget-boolean v0, p0, Lo/dyp;->b:Z

    if-eqz v0, :cond_2

    .line 532
    invoke-virtual {p0}, Lo/dyp;->k()V

    .line 535
    :cond_2
    iget-object v0, p0, Lo/dyp;->l:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 536
    iget-object v0, p0, Lo/dyp;->s:Lo/nt;

    iget-object v1, p0, Lo/dyp;->l:Lo/lp;

    iget v1, v1, Lo/lp;->q:F

    iget-object v2, p0, Lo/dyp;->l:Lo/lp;

    iget v2, v2, Lo/lp;->u:F

    iget-object v3, p0, Lo/dyp;->l:Lo/lp;

    invoke-virtual {v3}, Lo/lp;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/nt;->d(FFZ)V

    .line 539
    :cond_3
    iget-object v0, p0, Lo/dyp;->r:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 540
    iget-object v0, p0, Lo/dyp;->t:Lo/nt;

    iget-object v1, p0, Lo/dyp;->r:Lo/lp;

    iget v1, v1, Lo/lp;->q:F

    iget-object v2, p0, Lo/dyp;->r:Lo/lp;

    iget v2, v2, Lo/lp;->u:F

    iget-object v3, p0, Lo/dyp;->r:Lo/lp;

    invoke-virtual {v3}, Lo/lp;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/nt;->d(FFZ)V

    .line 543
    :cond_4
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 544
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    iget-object v1, p0, Lo/dyp;->H:Lo/ln;

    iget v1, v1, Lo/ln;->q:F

    iget-object v2, p0, Lo/dyp;->H:Lo/ln;

    iget v2, v2, Lo/ln;->u:F

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/nu;->d(FFZ)V

    .line 547
    :cond_5
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->b(Landroid/graphics/Canvas;)V

    .line 548
    iget-object v0, p0, Lo/dyp;->s:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->d(Landroid/graphics/Canvas;)V

    .line 549
    iget-object v0, p0, Lo/dyp;->t:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->d(Landroid/graphics/Canvas;)V

    .line 550
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->a(Landroid/graphics/Canvas;)V

    .line 551
    iget-object v0, p0, Lo/dyp;->s:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->e(Landroid/graphics/Canvas;)V

    .line 552
    iget-object v0, p0, Lo/dyp;->t:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->e(Landroid/graphics/Canvas;)V

    .line 553
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->o()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 554
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->e(Landroid/graphics/Canvas;)V

    .line 557
    :cond_6
    iget-object v0, p0, Lo/dyp;->l:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lo/dyp;->l:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 558
    iget-object v0, p0, Lo/dyp;->s:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->c(Landroid/graphics/Canvas;)V

    .line 561
    :cond_7
    iget-object v0, p0, Lo/dyp;->r:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lo/dyp;->r:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->o()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 562
    iget-object v0, p0, Lo/dyp;->t:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->c(Landroid/graphics/Canvas;)V

    .line 565
    :cond_8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 566
    iget-object v0, p0, Lo/dyp;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 567
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    invoke-virtual {v0, p1}, Lo/nj;->a(Landroid/graphics/Canvas;)V

    .line 568
    invoke-virtual {p0}, Lo/dyp;->z()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 569
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    iget-object v1, p0, Lo/dyp;->Q:[Lo/mh;

    invoke-virtual {v0, p1, v1}, Lo/nj;->d(Landroid/graphics/Canvas;[Lo/mh;)V

    .line 572
    :cond_9
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 573
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    invoke-virtual {v0, p1}, Lo/nj;->d(Landroid/graphics/Canvas;)V

    .line 574
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->o()Z

    move-result v0

    if-nez v0, :cond_a

    .line 575
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->e(Landroid/graphics/Canvas;)V

    .line 578
    :cond_a
    iget-object v0, p0, Lo/dyp;->l:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lo/dyp;->l:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->o()Z

    move-result v0

    if-nez v0, :cond_b

    .line 579
    iget-object v0, p0, Lo/dyp;->s:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->c(Landroid/graphics/Canvas;)V

    .line 582
    :cond_b
    iget-object v0, p0, Lo/dyp;->r:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lo/dyp;->r:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->o()Z

    move-result v0

    if-nez v0, :cond_c

    .line 583
    iget-object v0, p0, Lo/dyp;->t:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->c(Landroid/graphics/Canvas;)V

    .line 586
    :cond_c
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    invoke-virtual {v0, p1}, Lo/nu;->c(Landroid/graphics/Canvas;)V

    .line 587
    iget-object v0, p0, Lo/dyp;->s:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->b(Landroid/graphics/Canvas;)V

    .line 588
    iget-object v0, p0, Lo/dyp;->t:Lo/nt;

    invoke-virtual {v0, p1}, Lo/nt;->b(Landroid/graphics/Canvas;)V

    .line 589
    invoke-virtual {p0}, Lo/dyp;->u()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 590
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 591
    iget-object v0, p0, Lo/dyp;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 592
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    invoke-virtual {v0, p1}, Lo/nj;->e(Landroid/graphics/Canvas;)V

    .line 593
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_0

    .line 595
    :cond_d
    iget-object v0, p0, Lo/dyp;->S:Lo/nj;

    invoke-virtual {v0, p1}, Lo/nj;->e(Landroid/graphics/Canvas;)V

    .line 598
    :goto_0
    iget-object v0, p0, Lo/dyp;->J:Lo/np;

    invoke-virtual {v0, p1}, Lo/np;->e(Landroid/graphics/Canvas;)V

    .line 599
    invoke-virtual {p0, p1}, Lo/dyp;->b(Landroid/graphics/Canvas;)V

    .line 600
    invoke-virtual {p0, p1}, Lo/dyp;->d(Landroid/graphics/Canvas;)V

    .line 602
    :cond_e
    return-void
.end method

.method public f()V
    .locals 10

    .line 416
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v5

    .line 417
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v6

    .line 418
    const/high16 v0, 0x42480000    # 50.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v7

    .line 419
    const/high16 v0, 0x42480000    # 50.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v8

    .line 420
    iget-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    invoke-virtual {p0, v0}, Lo/dyp;->e(Landroid/graphics/RectF;)V

    .line 421
    iget-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    add-float/2addr v5, v0

    .line 422
    iget-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v7, v0

    .line 423
    iget-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v6, v0

    .line 424
    iget-object v0, p0, Lo/dyp;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v8, v0

    .line 425
    iget-object v0, p0, Lo/dyp;->l:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lo/dyp;->l:Lo/lp;

    iget-object v1, p0, Lo/dyp;->s:Lo/nt;

    invoke-virtual {v1}, Lo/nt;->e()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/lp;->d(Landroid/graphics/Paint;)F

    move-result v0

    add-float/2addr v5, v0

    .line 429
    :cond_0
    iget-object v0, p0, Lo/dyp;->r:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 430
    iget-object v0, p0, Lo/dyp;->r:Lo/lp;

    iget-object v1, p0, Lo/dyp;->t:Lo/nt;

    invoke-virtual {v1}, Lo/nt;->e()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/lp;->d(Landroid/graphics/Paint;)F

    move-result v0

    add-float/2addr v6, v0

    .line 434
    :cond_1
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 435
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    iget v0, v0, Lo/ln;->I:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float v9, v0, v1

    .line 436
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->j()Lo/ln$e;

    move-result-object v0

    sget-object v1, Lo/ln$e;->e:Lo/ln$e;

    if-ne v0, v1, :cond_2

    .line 437
    add-float/2addr v8, v9

    goto :goto_0

    .line 438
    :cond_2
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->j()Lo/ln$e;

    move-result-object v0

    sget-object v1, Lo/ln$e;->d:Lo/ln$e;

    if-ne v0, v1, :cond_3

    .line 439
    add-float/2addr v7, v9

    goto :goto_0

    .line 440
    :cond_3
    iget-object v0, p0, Lo/dyp;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->j()Lo/ln$e;

    move-result-object v0

    sget-object v1, Lo/ln$e;->a:Lo/ln$e;

    if-ne v0, v1, :cond_4

    .line 441
    add-float/2addr v8, v9

    .line 442
    add-float/2addr v7, v9

    .line 446
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lo/dyp;->getExtraTopOffset()F

    move-result v0

    add-float/2addr v7, v0

    .line 447
    invoke-virtual {p0}, Lo/dyp;->getExtraRightOffset()F

    move-result v0

    add-float/2addr v6, v0

    .line 448
    invoke-virtual {p0}, Lo/dyp;->getExtraBottomOffset()F

    move-result v0

    add-float/2addr v8, v0

    .line 449
    invoke-virtual {p0}, Lo/dyp;->getExtraLeftOffset()F

    move-result v0

    add-float/2addr v5, v0

    .line 450
    iget v0, p0, Lo/dyp;->o:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v9

    .line 451
    iget-object v0, p0, Lo/dyp;->O:Lo/oa;

    invoke-static {v9, v5}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v9, v7}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v9, v6}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v9, v8}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/oa;->a(FFFF)V

    .line 453
    invoke-virtual {p0}, Lo/dyp;->g()V

    .line 454
    invoke-virtual {p0}, Lo/dyp;->i()V

    .line 455
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 475
    const-string v0, "PLGACHIEVE_HwHealthAchieveReportLineChart"

    const-string v1, "line onDraw"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    iget-object v0, p0, Lo/dyp;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->o()F

    move-result v0

    float-to-int v3, v0

    .line 478
    iget-object v0, p0, Lo/dyp;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->n()F

    move-result v0

    float-to-int v4, v0

    .line 480
    const/4 v5, 0x0

    .line 481
    iget-object v0, p0, Lo/dyp;->ap:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lo/dyp;->ap:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/Bitmap;

    .line 485
    :cond_0
    if-eqz v5, :cond_1

    invoke-direct {p0, v5, v3, v4}, Lo/dyp;->c(Landroid/graphics/Bitmap;II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 486
    :cond_1
    if-lez v3, :cond_2

    if-lez v4, :cond_2

    .line 487
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 488
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dyp;->ap:Ljava/lang/ref/WeakReference;

    .line 489
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lo/dyp;->ab:Landroid/graphics/Canvas;

    goto :goto_0

    .line 491
    :cond_2
    return-void

    .line 494
    :cond_3
    :goto_0
    if-nez v5, :cond_4

    .line 495
    return-void

    .line 497
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 499
    iget-object v6, p0, Lo/dyp;->ab:Landroid/graphics/Canvas;

    .line 504
    invoke-virtual {p0, v6}, Lo/dyp;->e(Landroid/graphics/Canvas;)V

    .line 509
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 510
    iget-object v0, p0, Lo/dyp;->ap:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 512
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 97
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    .line 98
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 99
    :cond_0
    iget v0, p0, Lo/dyp;->ak:F

    cmpg-float v0, v4, v0

    if-gez v0, :cond_1

    .line 100
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    iget v1, p0, Lo/dyp;->ak:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lo/dyu;->d(D)V

    .line 101
    iget-object v0, p0, Lo/dyp;->ad:Lo/dys;

    iget v1, p0, Lo/dyp;->ak:F

    invoke-virtual {v0, v1}, Lo/dys;->e(F)V

    .line 102
    iget-object v0, p0, Lo/dyp;->ai:[F

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lo/dyp;->ai:[F

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 103
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    iget-object v1, p0, Lo/dyp;->ai:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/dyu;->e(F)V

    goto/16 :goto_0

    .line 105
    :cond_1
    iget v0, p0, Lo/dyp;->aq:F

    cmpl-float v0, v4, v0

    if-lez v0, :cond_2

    .line 106
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    iget v1, p0, Lo/dyp;->aq:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lo/dyu;->d(D)V

    .line 107
    iget-object v0, p0, Lo/dyp;->ad:Lo/dys;

    iget v1, p0, Lo/dyp;->aq:F

    invoke-virtual {v0, v1}, Lo/dys;->e(F)V

    .line 108
    iget-object v0, p0, Lo/dyp;->ai:[F

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lo/dyp;->ai:[F

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 109
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    iget-object v1, p0, Lo/dyp;->ai:[F

    iget-object v2, p0, Lo/dyp;->ai:[F

    array-length v2, v2

    add-int/lit8 v2, v2, -0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/dyu;->e(F)V

    goto :goto_0

    .line 112
    :cond_2
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    float-to-double v1, v4

    invoke-virtual {v0, v1, v2}, Lo/dyu;->d(D)V

    .line 113
    invoke-direct {p0, v4}, Lo/dyp;->c(F)I

    move-result v0

    mul-int/lit8 v5, v0, 0x2

    .line 114
    iget-object v0, p0, Lo/dyp;->ai:[F

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/dyp;->ai:[F

    array-length v0, v0

    if-ge v5, v0, :cond_3

    .line 115
    iget-object v0, p0, Lo/dyp;->x:Lo/nu;

    check-cast v0, Lo/dyu;

    iget-object v1, p0, Lo/dyp;->ai:[F

    aget v1, v1, v5

    invoke-virtual {v0, v1}, Lo/dyu;->e(F)V

    .line 117
    :cond_3
    iget-object v0, p0, Lo/dyp;->ad:Lo/dys;

    invoke-virtual {v0, v4}, Lo/dys;->e(F)V

    .line 119
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/dyp;->aj:Lo/dyp$b;

    invoke-direct {p0, v4}, Lo/dyp;->c(F)I

    move-result v1

    invoke-interface {v0, v1}, Lo/dyp$b;->e(I)V

    .line 120
    iget-object v0, p0, Lo/dyp;->K:Lo/nd;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/dyp;->A:Lo/ma;

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lo/dyp;->I:Z

    if-nez v0, :cond_5

    const/4 v0, 0x0

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lo/dyp;->K:Lo/nd;

    invoke-virtual {v0, p0, p1}, Lo/nd;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 122
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 123
    iget v0, p0, Lo/dyp;->ak:F

    cmpl-float v0, v4, v0

    if-lez v0, :cond_8

    iget v0, p0, Lo/dyp;->aq:F

    cmpg-float v0, v4, v0

    if-gez v0, :cond_8

    .line 124
    iget-object v0, p0, Lo/dyp;->ad:Lo/dys;

    invoke-virtual {v0}, Lo/dys;->getmMarkviewDrawX()F

    move-result v0

    iput v0, p0, Lo/dyp;->ah:F

    .line 125
    invoke-direct {p0, v4}, Lo/dyp;->c(F)I

    move-result v0

    mul-int/lit8 v5, v0, 0x2

    .line 126
    iget-object v0, p0, Lo/dyp;->ai:[F

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lo/dyp;->ai:[F

    array-length v0, v0

    if-ge v5, v0, :cond_8

    .line 127
    iget-object v0, p0, Lo/dyp;->ai:[F

    aget v0, v0, v5

    iput v0, p0, Lo/dyp;->ae:F

    .line 128
    invoke-virtual {p0}, Lo/dyp;->e()V

    .line 132
    :cond_8
    const/4 v0, 0x0

    return v0
.end method

.method public setChartData(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;ZZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;ZZ)V"
        }
    .end annotation

    .line 227
    if-eqz p4, :cond_0

    if-nez p5, :cond_0

    .line 228
    new-instance v0, Lo/dyn;

    iget-object v1, p0, Lo/dyp;->O:Lo/oa;

    invoke-direct {v0, v1, p0}, Lo/dyn;-><init>(Lo/oa;Lo/lf;)V

    iput-object v0, p0, Lo/dyp;->q:Lo/nv;

    .line 229
    new-instance v0, Lo/dyu;

    iget-object v1, p0, Lo/dyp;->O:Lo/oa;

    invoke-virtual {p0}, Lo/dyp;->getXAxis()Lo/ln;

    move-result-object v2

    iget-object v3, p0, Lo/dyp;->q:Lo/nv;

    invoke-direct {v0, v1, v2, v3}, Lo/dyu;-><init>(Lo/oa;Lo/ln;Lo/nv;)V

    iput-object v0, p0, Lo/dyp;->x:Lo/nu;

    .line 231
    :cond_0
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iput v0, p0, Lo/dyp;->al:I

    .line 232
    invoke-virtual {p0}, Lo/dyp;->getXAxis()Lo/ln;

    move-result-object v4

    .line 236
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v4, v0}, Lo/ln;->d(F)V

    .line 237
    sget-object v0, Lo/ln$e;->e:Lo/ln$e;

    invoke-virtual {v4, v0}, Lo/ln;->b(Lo/ln$e;)V

    .line 239
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/ln;->b(Z)V

    .line 240
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {v4, v0}, Lo/ln;->e(F)V

    .line 244
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/ln;->c(Z)V

    .line 247
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ln;->b(I)V

    .line 248
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v4, v0}, Lo/ln;->k(F)V

    .line 249
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/ln;->a(Z)V

    .line 250
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v4, v0}, Lo/ln;->g(F)V

    .line 252
    invoke-virtual {p0}, Lo/dyp;->getAxisRight()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->d(Z)V

    .line 254
    invoke-virtual {p0}, Lo/dyp;->getAxisLeft()Lo/lp;

    move-result-object v5

    .line 255
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/lp;->d(Z)V

    .line 256
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/lp;->e(Z)V

    .line 257
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/lp;->i(Z)V

    .line 258
    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {v5, v0}, Lo/lp;->o(F)V

    .line 263
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/lp;->b(Z)V

    .line 264
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 265
    invoke-virtual {p0, v6, p2}, Lo/dyp;->d(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 266
    invoke-static {v4, v6}, Lo/dyp;->setXAxisValueFormatter(Lo/ln;Ljava/util/List;)V

    .line 267
    invoke-direct {p0, p1, p3, p4, p5}, Lo/dyp;->d(Landroid/content/Context;Ljava/util/ArrayList;ZZ)V

    .line 268
    return-void
.end method

.method public setMyMarkView(Lo/dys;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lo/dyp;->ad:Lo/dys;

    .line 90
    invoke-virtual {p0, p1}, Lo/dyp;->setMarker(Lo/lk;)V

    .line 91
    return-void
.end method

.method public setOnSingleTapListener(Lo/dyp$b;)V
    .locals 0

    .line 609
    iput-object p1, p0, Lo/dyp;->aj:Lo/dyp$b;

    .line 610
    return-void
.end method
