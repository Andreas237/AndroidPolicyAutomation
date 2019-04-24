.class public Lo/fag;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fag$c;
    }
.end annotation


# instance fields
.field private A:[Ljava/lang/String;

.field private B:F

.field private C:I

.field private D:[Ljava/lang/String;

.field private E:F

.field private F:I

.field private G:F

.field private H:F

.field private I:F

.field private J:F

.field private K:Ljava/lang/String;

.field private L:Ljava/util/Date;

.field private M:Ljava/lang/String;

.field private N:F

.field private P:F

.field public a:F

.field public b:F

.field private c:Landroid/content/Context;

.field private d:F

.field private e:F

.field private f:Z

.field private g:Z

.field private h:F

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eux;>;"
        }
    .end annotation
.end field

.field private j:F

.field private k:F

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:Z

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eux;>;"
        }
    .end annotation
.end field

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eyb;>;"
        }
    .end annotation
.end field

.field private x:I

.field private y:I

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 163
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fag;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 164
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 167
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fag;->i:Ljava/util/List;

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fag;->f:Z

    .line 80
    const/high16 v0, 0x42100000    # 36.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fag;->b:F

    .line 94
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fag;->a:F

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fag;->q:Z

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->u:I

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->t:I

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fag;->r:Ljava/util/List;

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fag;->w:Ljava/util/ArrayList;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fag;->z:Ljava/util/List;

    .line 110
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->x:I

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->y:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->v:I

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->C:I

    .line 143
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fag;->E:F

    .line 145
    const/high16 v0, 0x42340000    # 45.0f

    iput v0, p0, Lo/fag;->H:F

    .line 148
    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lo/fag;->I:F

    .line 158
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->N:F

    .line 160
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->P:F

    .line 168
    iput-object p1, p0, Lo/fag;->c:Landroid/content/Context;

    .line 169
    return-void
.end method

.method private a(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    .line 1756
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "MM/dd"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1757
    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(IFF)Lo/fag$c;
    .locals 2

    .line 1724
    const/4 v0, 0x0

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result p2

    .line 1725
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fag;->f:Z

    .line 1726
    new-instance v1, Lo/fag$c;

    invoke-direct {v1}, Lo/fag$c;-><init>()V

    .line 1727
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1729
    :pswitch_0
    iput p2, v1, Lo/fag$c;->b:F

    .line 1730
    const/high16 v0, 0x41cc0000    # 25.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float/2addr v0, p2

    iput v0, v1, Lo/fag$c;->a:F

    .line 1731
    goto :goto_1

    .line 1733
    :pswitch_1
    const/high16 v0, 0x42160000    # 37.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, v1, Lo/fag$c;->b:F

    .line 1734
    const/high16 v0, 0x427c0000    # 63.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, v1, Lo/fag$c;->a:F

    .line 1735
    goto :goto_1

    .line 1737
    :pswitch_2
    const/high16 v0, 0x42960000    # 75.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, v1, Lo/fag$c;->b:F

    .line 1738
    const/high16 v0, 0x42c90000    # 100.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, v1, Lo/fag$c;->a:F

    .line 1739
    goto :goto_1

    .line 1741
    :pswitch_3
    const/high16 v0, 0x42e10000    # 112.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, v1, Lo/fag$c;->b:F

    .line 1742
    const/high16 v0, 0x430a0000    # 138.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, v1, Lo/fag$c;->a:F

    .line 1744
    goto :goto_1

    .line 1746
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fag;->f:Z

    .line 1749
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 13

    .line 363
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 364
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 365
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 366
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 367
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    array-length v5, v0

    .line 368
    new-array v6, v5, [F

    .line 369
    iget v0, p0, Lo/fag;->B:F

    const/high16 v1, 0x41900000    # 18.0f

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fag;->j:F

    .line 371
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_7

    .line 372
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_801a1a1a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 373
    const-string v0, "regular"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v7

    .line 374
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 376
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    add-int/lit8 v1, v5, -0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lo/fag;->A:[Ljava/lang/String;

    add-int/lit8 v2, v5, -0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lo/fag;->G:F

    .line 377
    if-nez v8, :cond_1

    .line 378
    iget-boolean v0, p0, Lo/fag;->q:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/fag;->g:Z

    if-nez v0, :cond_0

    .line 379
    iget v0, p0, Lo/fag;->N:F

    aput v0, v6, v8

    goto :goto_1

    .line 381
    :cond_0
    const/high16 v0, 0x41d80000    # 27.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    aput v0, v6, v8

    goto :goto_1

    .line 384
    :cond_1
    add-int/lit8 v0, v5, -0x1

    if-ne v8, v0, :cond_3

    .line 385
    iget-boolean v0, p0, Lo/fag;->q:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lo/fag;->g:Z

    if-nez v0, :cond_2

    .line 386
    iget v0, p0, Lo/fag;->P:F

    aput v0, v6, v8

    goto :goto_1

    .line 388
    :cond_2
    iget v0, p0, Lo/fag;->F:I

    int-to-float v0, v0

    const/high16 v1, 0x41d80000    # 27.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fag;->G:F

    sub-float/2addr v0, v1

    aput v0, v6, v8

    goto :goto_1

    .line 392
    :cond_3
    iget v0, p0, Lo/fag;->F:I

    int-to-float v0, v0

    const/high16 v1, 0x41d80000    # 27.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fag;->G:F

    sub-float/2addr v0, v1

    add-int/lit8 v1, v5, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    int-to-float v1, v8

    mul-float/2addr v0, v1

    const/high16 v1, 0x41d80000    # 27.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    aput v0, v6, v8

    .line 396
    :goto_1
    iget v0, p0, Lo/fag;->B:F

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fag;->j:F

    .line 398
    iget-boolean v0, p0, Lo/fag;->q:Z

    if-nez v0, :cond_4

    .line 399
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    aget-object v0, v0, v8

    aget v1, v6, v8

    iget v2, p0, Lo/fag;->j:F

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 401
    :cond_4
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    aget-object v0, v0, v8

    aget v1, v6, v8

    iget v2, p0, Lo/fag;->h:F

    const/high16 v3, 0x41ec0000    # 29.5f

    invoke-static {v3}, Lo/fiu;->e(F)F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 405
    :goto_2
    iget-object v0, p0, Lo/fag;->K:Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->K:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v9, v0

    .line 406
    iget-object v0, p0, Lo/fag;->M:Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->M:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v10, v0

    .line 407
    iget v0, p0, Lo/fag;->G:F

    sub-float/2addr v0, v9

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 408
    iget v0, p0, Lo/fag;->G:F

    sub-float/2addr v0, v10

    const/high16 v1, 0x40000000    # 2.0f

    div-float v12, v0, v1

    .line 409
    if-nez v8, :cond_5

    .line 410
    iget-object v0, p0, Lo/fag;->K:Ljava/lang/String;

    aget v1, v6, v8

    add-float/2addr v1, v11

    iget v2, p0, Lo/fag;->j:F

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v3}, Lo/fiu;->e(F)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 411
    :cond_5
    add-int/lit8 v0, v5, -0x1

    if-ne v8, v0, :cond_6

    .line 412
    iget-object v0, p0, Lo/fag;->M:Ljava/lang/String;

    aget v1, v6, v8

    add-float/2addr v1, v12

    iget v2, p0, Lo/fag;->j:F

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v3}, Lo/fiu;->e(F)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 371
    :cond_6
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 415
    :cond_7
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FFFF)V
    .locals 10

    .line 1468
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 1469
    new-instance v0, Landroid/graphics/LinearGradient;

    move v1, p2

    move v2, p4

    move v3, p2

    move v4, p5

    iget v5, p0, Lo/fag;->l:I

    iget v6, p0, Lo/fag;->o:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v9, v0

    .line 1470
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1471
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1472
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1473
    move-object v0, p1

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1474
    return-void
.end method

.method private b(Ljava/util/ArrayList;)Lo/eux;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/eux;>;)Lo/eux;"
        }
    .end annotation

    .line 610
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 611
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 613
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eux;

    .line 614
    const/4 v4, 0x1

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 615
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eux;

    .line 616
    iget v0, v5, Lo/eux;->b:I

    iget v1, v5, Lo/eux;->c:I

    sub-int/2addr v0, v1

    iget v1, v3, Lo/eux;->b:I

    iget v2, v3, Lo/eux;->c:I

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_2

    .line 617
    move-object v3, v5

    .line 614
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 620
    :cond_3
    return-object v3
.end method

.method private c(II)Ljava/lang/String;
    .locals 8

    .line 566
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 567
    move-object v0, v6

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    move v4, p1

    move v5, p2

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 568
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v7

    .line 569
    return-object v7
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 590
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 592
    :try_start_0
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 593
    const/16 v6, 0x81

    .line 596
    invoke-static {v5, v6}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 597
    :catch_0
    move-exception v5

    .line 598
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "formatTime.ParseException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    return-object p1
.end method

.method private c(Landroid/graphics/Canvas;FFFF)V
    .locals 11

    .line 1333
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 1334
    new-instance v0, Landroid/graphics/LinearGradient;

    move v1, p2

    move v2, p3

    move v3, p2

    move/from16 v4, p5

    iget v5, p0, Lo/fag;->n:I

    iget v6, p0, Lo/fag;->p:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v9, v0

    .line 1335
    new-instance v10, Landroid/graphics/RectF;

    move/from16 v0, p5

    invoke-direct {v10, p2, p3, p4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1336
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1337
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1338
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1339
    iget v0, p0, Lo/fag;->a:F

    iget v1, p0, Lo/fag;->a:F

    invoke-virtual {p1, v10, v0, v1, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 1340
    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 2

    .line 579
    const/16 v0, 0xa

    if-ge p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private static d(Ljava/util/List;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 815
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 816
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 817
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 819
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map;

    .line 820
    const/4 v5, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 821
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    .line 822
    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v0, v1

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "core_sleep_start_time_key"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_2

    .line 823
    move-object v4, v6

    .line 820
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 826
    :cond_3
    const-string v0, "core_sleep_start_time_key"

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 827
    const-string v0, "core_sleep_end_time_key"

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    return-object v3
.end method

.method private d(IFF)Lo/fag$c;
    .locals 3

    .line 1420
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result p2

    .line 1421
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fag;->f:Z

    .line 1422
    new-instance v2, Lo/fag$c;

    invoke-direct {v2}, Lo/fag$c;-><init>()V

    .line 1423
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 1425
    :sswitch_0
    iput p2, v2, Lo/fag$c;->b:F

    .line 1426
    const/high16 v0, 0x41d00000    # 26.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float/2addr v0, p2

    iput v0, v2, Lo/fag$c;->a:F

    .line 1427
    goto :goto_1

    .line 1429
    :sswitch_1
    const/high16 v0, 0x424c0000    # 51.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float/2addr v0, p2

    iput v0, v2, Lo/fag$c;->b:F

    .line 1430
    const/high16 v0, 0x424c0000    # 51.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float/2addr v0, p2

    const/high16 v1, 0x42ae0000    # 87.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v2, Lo/fag$c;->a:F

    .line 1431
    goto :goto_1

    .line 1433
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fag;->f:Z

    .line 1436
    :goto_1
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x43 -> :sswitch_0
        0x45 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 10

    .line 423
    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 424
    :cond_0
    return-void

    .line 427
    :cond_1
    iget v0, p0, Lo/fag;->x:I

    if-gtz v0, :cond_2

    iget-boolean v0, p0, Lo/fag;->q:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lo/fag;->g:Z

    if-nez v0, :cond_3

    .line 428
    :cond_2
    return-void

    .line 431
    :cond_3
    const/4 v6, 0x0

    .line 432
    const/4 v7, 0x0

    .line 433
    iget-boolean v0, p0, Lo/fag;->g:Z

    if-eqz v0, :cond_5

    .line 434
    invoke-direct {p0}, Lo/fag;->getSleepSumList()Ljava/util/ArrayList;

    move-result-object v8

    .line 435
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sumSleepList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    invoke-direct {p0, v8}, Lo/fag;->b(Ljava/util/ArrayList;)Lo/eux;

    move-result-object v9

    .line 438
    const/4 v0, 0x0

    if-ne v0, v9, :cond_4

    .line 439
    return-void

    .line 441
    :cond_4
    iget v6, v9, Lo/eux;->c:I

    .line 442
    iget v7, v9, Lo/eux;->b:I

    .line 443
    goto :goto_0

    .line 444
    :cond_5
    iget v6, p0, Lo/fag;->C:I

    .line 445
    iget v7, p0, Lo/fag;->v:I

    .line 448
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 449
    move v8, v6

    .line 450
    move v9, v7

    .line 451
    rsub-int v6, v9, 0x5a0

    .line 452
    rsub-int v7, v8, 0x5a0

    .line 456
    :cond_6
    int-to-float v0, v6

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fag;->k:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fag;->b:F

    add-float v8, v0, v1

    .line 457
    int-to-float v0, v7

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/fag;->k:F

    mul-float/2addr v0, v1

    iget v1, p0, Lo/fag;->b:F

    add-float v9, v0, v1

    .line 459
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move v3, v7

    move v4, v8

    move v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fag;->e(Landroid/graphics/Canvas;IIFF)V

    .line 460
    return-void
.end method

.method private d(Landroid/graphics/Canvas;FF)V
    .locals 6

    .line 551
    new-instance v2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 552
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 553
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 554
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 555
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffa6a6a6:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 556
    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 557
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 558
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 559
    invoke-static {p3}, Lo/fiu;->e(F)F

    move-result v5

    .line 560
    iget v0, p0, Lo/fag;->I:F

    add-float/2addr v0, v5

    invoke-virtual {v4, p2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 561
    iget v0, p0, Lo/fag;->J:F

    invoke-virtual {v4, p2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 562
    invoke-virtual {p1, v4, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 563
    return-void

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method private d(Landroid/graphics/Canvas;FFFF)V
    .locals 10

    .line 1450
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 1451
    new-instance v0, Landroid/graphics/LinearGradient;

    move v1, p2

    move v2, p3

    move v3, p2

    move v4, p5

    iget v5, p0, Lo/fag;->m:I

    iget v6, p0, Lo/fag;->s:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v9, v0

    .line 1452
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1453
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1454
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1455
    move-object v0, p1

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 1456
    return-void
.end method

.method private e(IFF)Lo/fag$c;
    .locals 3

    .line 1691
    const/high16 v0, 0x41680000    # 14.5f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result p2

    .line 1692
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fag;->f:Z

    .line 1693
    new-instance v2, Lo/fag$c;

    invoke-direct {v2}, Lo/fag$c;-><init>()V

    .line 1694
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1696
    :pswitch_0
    iput p2, v2, Lo/fag$c;->b:F

    .line 1697
    const/high16 v0, 0x42000000    # 32.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float/2addr v0, p2

    iput v0, v2, Lo/fag$c;->a:F

    .line 1698
    goto :goto_1

    .line 1700
    :pswitch_1
    sub-float v0, p3, p2

    const v1, 0x3ea8f5c3    # 0.33f

    mul-float/2addr v0, v1

    add-float/2addr v0, p2

    iput v0, v2, Lo/fag$c;->b:F

    .line 1701
    sub-float v0, p3, p2

    const v1, 0x3ea8f5c3    # 0.33f

    mul-float/2addr v0, v1

    add-float/2addr v0, p2

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v2, Lo/fag$c;->a:F

    .line 1702
    goto :goto_1

    .line 1704
    :pswitch_2
    sub-float v0, p3, p2

    const v1, 0x3f28f5c3    # 0.66f

    mul-float/2addr v0, v1

    add-float/2addr v0, p2

    iput v0, v2, Lo/fag$c;->b:F

    .line 1705
    sub-float v0, p3, p2

    const v1, 0x3f28f5c3    # 0.66f

    mul-float/2addr v0, v1

    add-float/2addr v0, p2

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    iput v0, v2, Lo/fag$c;->a:F

    .line 1706
    goto :goto_1

    .line 1708
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fag;->f:Z

    .line 1711
    :goto_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private e()V
    .locals 13

    .line 709
    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 710
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->x:I

    .line 711
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->C:I

    .line 712
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->v:I

    .line 713
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->y:I

    .line 714
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->u:I

    .line 715
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->t:I

    .line 717
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 718
    return-void

    .line 721
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 722
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 723
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    .line 724
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_b

    .line 725
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eux;

    .line 726
    new-instance v5, Lo/eux;

    invoke-direct {v5}, Lo/eux;-><init>()V

    .line 727
    iget v0, v4, Lo/eux;->c:I

    invoke-virtual {v5, v0}, Lo/eux;->b(I)V

    .line 728
    iget v0, v4, Lo/eux;->b:I

    invoke-virtual {v5, v0}, Lo/eux;->e(I)V

    .line 729
    iget v0, v4, Lo/eux;->a:I

    invoke-virtual {v5, v0}, Lo/eux;->c(I)V

    .line 730
    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 731
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 732
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-eq v0, v1, :cond_1

    .line 733
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x43

    if-eq v0, v1, :cond_1

    .line 734
    const-string v0, "core_sleep_start_time_key"

    invoke-virtual {v4}, Lo/eux;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 737
    :cond_1
    add-int/lit8 v0, v9, 0x1

    if-le v8, v0, :cond_3

    .line 738
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    add-int/lit8 v1, v9, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->e()I

    move-result v0

    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v1

    sub-int/2addr v0, v1

    const/16 v1, 0x1e

    if-le v0, v1, :cond_2

    .line 739
    const-string v0, "core_sleep_end_time_key"

    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 741
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 742
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    goto :goto_1

    .line 745
    :cond_2
    const-string v0, "core_sleep_end_time_key"

    iget-object v1, p0, Lo/fag;->i:Ljava/util/List;

    add-int/lit8 v2, v9, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eux;

    invoke-virtual {v1}, Lo/eux;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    :cond_3
    :goto_1
    add-int/lit8 v0, v8, -0x1

    if-ne v9, v0, :cond_5

    .line 750
    const/4 v0, 0x1

    if-ne v8, v0, :cond_4

    .line 751
    const-string v0, "core_sleep_end_time_key"

    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    :cond_4
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 754
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 758
    :cond_5
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x44

    if-ne v0, v1, :cond_6

    .line 759
    iget v0, p0, Lo/fag;->x:I

    iget v1, v4, Lo/eux;->b:I

    iget v2, v4, Lo/eux;->c:I

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lo/fag;->x:I

    .line 762
    :cond_6
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_7

    .line 763
    iget v0, p0, Lo/fag;->y:I

    iget v1, v4, Lo/eux;->b:I

    iget v2, v4, Lo/eux;->c:I

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lo/fag;->y:I

    .line 766
    :cond_7
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-eq v0, v1, :cond_a

    .line 767
    iget v0, p0, Lo/fag;->u:I

    if-nez v0, :cond_9

    iget v0, p0, Lo/fag;->t:I

    if-nez v0, :cond_9

    .line 768
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x43

    if-eq v0, v1, :cond_8

    .line 769
    invoke-virtual {v4}, Lo/eux;->e()I

    move-result v0

    iput v0, p0, Lo/fag;->u:I

    goto :goto_2

    .line 771
    :cond_8
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_9

    .line 772
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->e()I

    move-result v0

    iput v0, p0, Lo/fag;->u:I

    .line 776
    :cond_9
    :goto_2
    invoke-virtual {v4}, Lo/eux;->d()I

    move-result v0

    iput v0, p0, Lo/fag;->t:I

    .line 724
    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 779
    :cond_b
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_c

    .line 780
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fag;->C:I

    .line 781
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fag;->v:I

    goto/16 :goto_4

    .line 782
    :cond_c
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_e

    .line 783
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 784
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 785
    const/4 v0, 0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_start_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 786
    const/4 v0, 0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "core_sleep_end_time_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 788
    sub-int v0, v10, v9

    sub-int v1, v12, v11

    if-le v0, v1, :cond_d

    .line 789
    iput v9, p0, Lo/fag;->C:I

    .line 790
    iput v10, p0, Lo/fag;->v:I

    goto :goto_3

    .line 792
    :cond_d
    iput v11, p0, Lo/fag;->C:I

    .line 793
    iput v12, p0, Lo/fag;->v:I

    .line 795
    :goto_3
    goto :goto_4

    .line 796
    :cond_e
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_f

    .line 797
    invoke-static {v6}, Lo/fag;->d(Ljava/util/List;)Ljava/util/Map;

    move-result-object v9

    .line 798
    const-string v0, "core_sleep_start_time_key"

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fag;->C:I

    .line 799
    const-string v0, "core_sleep_end_time_key"

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fag;->v:I

    .line 803
    :cond_f
    :goto_4
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " copyOfFitnessDataList mStartSleepPoint = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fag;->C:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " copyOfFitnessDataList mNightEndPoint = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fag;->v:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 806
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 28

    .line 837
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 839
    :cond_0
    return-void

    .line 842
    :cond_1
    const/4 v8, 0x0

    .line 844
    const/4 v9, 0x0

    .line 846
    const/4 v10, 0x0

    .line 848
    const/4 v11, 0x0

    .line 850
    const/4 v12, 0x0

    .line 852
    const/4 v13, 0x0

    .line 854
    const/4 v14, 0x0

    .line 856
    move-object/from16 v0, p0

    iget v11, v0, Lo/fag;->h:F

    .line 861
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v17

    .line 862
    const/16 v18, 0x0

    :goto_0
    move/from16 v0, v18

    move/from16 v1, v17

    if-ge v0, v1, :cond_31

    .line 863
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v19

    .line 865
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v21

    .line 867
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->i:Ljava/util/List;

    move/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/eux;

    .line 868
    invoke-virtual {v15}, Lo/eux;->e()I

    move-result v22

    .line 869
    invoke-virtual {v15}, Lo/eux;->d()I

    move-result v23

    .line 870
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fag;->g:Z

    if-eqz v0, :cond_11

    .line 871
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v9, v11}, Lo/fag;->d(IFF)Lo/fag$c;

    move-result-object v24

    .line 872
    move/from16 v0, v22

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v8, v0, v1

    .line 873
    move/from16 v0, v23

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v10, v0, v1

    .line 876
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 877
    move/from16 v25, v8

    .line 878
    move/from16 v26, v10

    .line 879
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v8, v0, v26

    .line 880
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v10, v0, v25

    .line 883
    :cond_2
    add-int/lit8 v0, v18, 0x1

    move/from16 v1, v17

    if-ge v0, v1, :cond_10

    .line 884
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->i:Ljava/util/List;

    add-int/lit8 v1, v18, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/eux;

    .line 885
    move/from16 v0, v22

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v12, v0, v1

    .line 886
    move/from16 v0, v23

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v13, v0, v1

    .line 888
    sub-float v0, v10, v12

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    const/16 v25, 0x1

    goto :goto_1

    :cond_3
    const/16 v25, 0x0

    .line 890
    :goto_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 891
    move/from16 v26, v12

    .line 892
    move/from16 v27, v13

    .line 893
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v12, v0, v27

    .line 894
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v13, v0, v26

    .line 895
    sub-float v0, v8, v13

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_4

    const/16 v25, 0x1

    goto :goto_2

    :cond_4
    const/16 v25, 0x0

    .line 897
    :cond_5
    :goto_2
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v9, v11}, Lo/fag;->d(IFF)Lo/fag$c;

    move-result-object v14

    .line 898
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fag;->f:Z

    if-nez v0, :cond_f

    if-eqz v25, :cond_f

    .line 900
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setCurrentRectColor(I)V

    .line 903
    move-object/from16 v0, v24

    iget v0, v0, Lo/fag$c;->a:F

    iget v1, v14, Lo/fag$c;->a:F

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_a

    .line 904
    sub-float v0, v10, v8

    cmpg-float v0, v0, v19

    if-gez v0, :cond_6

    .line 905
    sub-float v0, v10, v8

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_3

    .line 907
    :cond_6
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 911
    :goto_3
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomStartColor(I)V

    .line 914
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 916
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    add-float v4, v8, v20

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 918
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v8

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_4

    .line 921
    :cond_7
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v10, v20

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 923
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v10, v2

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 925
    :goto_4
    sub-float v0, v13, v12

    cmpg-float v0, v0, v19

    if-gez v0, :cond_8

    .line 926
    sub-float v0, v13, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_5

    .line 928
    :cond_8
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 932
    :goto_5
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomEndColor(I)V

    .line 934
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomLineStartColor(I)V

    .line 935
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomLineEndColor(I)V

    .line 936
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 938
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v13, v20

    iget v3, v14, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v13

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 940
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v13, v2

    iget v3, v14, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    move v4, v13

    iget v5, v14, Lo/fag$c;->b:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 942
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    add-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v8

    iget v5, v14, Lo/fag$c;->a:F

    sub-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_9

    .line 945
    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    add-float v4, v12, v20

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 947
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v12

    iget v5, v14, Lo/fag$c;->b:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 949
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    add-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v10

    iget v5, v14, Lo/fag$c;->a:F

    sub-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_9

    .line 954
    :cond_a
    sub-float v0, v10, v8

    cmpg-float v0, v0, v19

    if-gez v0, :cond_b

    .line 955
    sub-float v0, v10, v8

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_6

    .line 957
    :cond_b
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 961
    :goto_6
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopStartColor(I)V

    .line 962
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 964
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    add-float v4, v8, v20

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 966
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v8

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_7

    .line 969
    :cond_c
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v10, v20

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 971
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v10, v2

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 973
    :goto_7
    sub-float v0, v13, v12

    cmpg-float v0, v0, v19

    if-gez v0, :cond_d

    .line 974
    sub-float v0, v13, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_8

    .line 976
    :cond_d
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 980
    :goto_8
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopEndColor(I)V

    .line 982
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopLineStartColor(I)V

    .line 983
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopLineEndColor(I)V

    .line 984
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 986
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v13, v20

    iget v3, v14, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    move v4, v13

    iget v5, v14, Lo/fag$c;->a:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 988
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v13, v2

    iget v3, v14, Lo/fag$c;->a:F

    move v4, v13

    iget v5, v14, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 990
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    sub-float v3, v3, v21

    move v4, v8

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    add-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto :goto_9

    .line 993
    :cond_e
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    add-float v4, v12, v20

    iget v5, v14, Lo/fag$c;->a:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 995
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->a:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v12

    iget v5, v14, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 997
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    sub-float v3, v3, v21

    move v4, v10

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    add-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto :goto_9

    .line 1001
    :cond_f
    move-object/from16 v0, p0

    const/16 v1, 0x2bc

    invoke-direct {v0, v1}, Lo/fag;->setCurrentRectColor(I)V

    .line 1003
    :goto_9
    goto :goto_a

    .line 1004
    :cond_10
    move-object/from16 v0, p0

    const/16 v1, 0x2bc

    invoke-direct {v0, v1}, Lo/fag;->setCurrentRectColor(I)V

    .line 1006
    :goto_a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    invoke-direct/range {v0 .. v5}, Lo/fag;->c(Landroid/graphics/Canvas;FFFF)V

    .line 1007
    goto/16 :goto_1d

    :cond_11
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fag;->q:Z

    if-eqz v0, :cond_21

    .line 1009
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_12

    .line 1010
    goto/16 :goto_1d

    .line 1012
    :cond_12
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v9, v11}, Lo/fag;->a(IFF)Lo/fag$c;

    move-result-object v24

    .line 1013
    invoke-virtual {v15}, Lo/eux;->e()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->u:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->t:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fag;->u:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v8, v0, v1

    .line 1014
    invoke-virtual {v15}, Lo/eux;->d()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->u:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->t:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fag;->u:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v10, v0, v1

    .line 1015
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setCurrentRectColor(I)V

    .line 1017
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1018
    move/from16 v25, v8

    .line 1019
    move/from16 v26, v10

    .line 1020
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v8, v0, v26

    .line 1021
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v10, v0, v25

    .line 1024
    :cond_13
    add-int/lit8 v0, v18, 0x1

    move/from16 v1, v17

    if-ge v0, v1, :cond_20

    .line 1025
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->i:Ljava/util/List;

    add-int/lit8 v1, v18, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/eux;

    .line 1026
    invoke-virtual/range {v16 .. v16}, Lo/eux;->e()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->u:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->t:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fag;->u:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v12, v0, v1

    .line 1027
    invoke-virtual/range {v16 .. v16}, Lo/eux;->d()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->u:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->t:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/fag;->u:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v13, v0, v1

    .line 1029
    sub-float v0, v10, v12

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_14

    const/16 v25, 0x1

    goto :goto_b

    :cond_14
    const/16 v25, 0x0

    .line 1031
    :goto_b
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1032
    move/from16 v26, v12

    .line 1033
    move/from16 v27, v13

    .line 1034
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v12, v0, v27

    .line 1035
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v13, v0, v26

    .line 1036
    sub-float v0, v8, v13

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_15

    const/16 v25, 0x1

    goto :goto_c

    :cond_15
    const/16 v25, 0x0

    .line 1038
    :cond_16
    :goto_c
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v9, v11}, Lo/fag;->a(IFF)Lo/fag$c;

    move-result-object v14

    .line 1039
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fag;->f:Z

    if-nez v0, :cond_20

    if-eqz v25, :cond_20

    .line 1042
    move-object/from16 v0, v24

    iget v0, v0, Lo/fag$c;->a:F

    iget v1, v14, Lo/fag$c;->a:F

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1b

    .line 1043
    sub-float v0, v10, v8

    cmpg-float v0, v0, v19

    if-gez v0, :cond_17

    .line 1044
    sub-float v0, v10, v8

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_d

    .line 1046
    :cond_17
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1050
    :goto_d
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomStartColor(I)V

    .line 1052
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 1054
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    add-float v4, v8, v20

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1056
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v8

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_e

    .line 1059
    :cond_18
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v10, v20

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    add-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1061
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v10, v2

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1064
    :goto_e
    sub-float v0, v13, v12

    cmpg-float v0, v0, v19

    if-gez v0, :cond_19

    .line 1065
    sub-float v0, v13, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_f

    .line 1067
    :cond_19
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1071
    :goto_f
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomEndColor(I)V

    .line 1073
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomLineStartColor(I)V

    .line 1074
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomLineEndColor(I)V

    .line 1075
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1077
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v13, v20

    iget v3, v14, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v13

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1079
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v13, v2

    iget v3, v14, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    move v4, v13

    iget v5, v14, Lo/fag$c;->b:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1081
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    add-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v8

    iget v5, v14, Lo/fag$c;->a:F

    sub-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_13

    .line 1084
    :cond_1a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    add-float v4, v12, v20

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1086
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v12

    iget v5, v14, Lo/fag$c;->b:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1088
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    add-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v10

    iget v5, v14, Lo/fag$c;->a:F

    sub-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_13

    .line 1093
    :cond_1b
    sub-float v0, v10, v8

    cmpg-float v0, v0, v19

    if-gez v0, :cond_1c

    .line 1094
    sub-float v0, v10, v8

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_10

    .line 1096
    :cond_1c
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1100
    :goto_10
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopStartColor(I)V

    .line 1101
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 1103
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    add-float v4, v8, v20

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1105
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v8

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_11

    .line 1108
    :cond_1d
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v10, v20

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1110
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v10, v2

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1113
    :goto_11
    sub-float v0, v13, v12

    cmpg-float v0, v0, v19

    if-gez v0, :cond_1e

    .line 1114
    sub-float v0, v13, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_12

    .line 1116
    :cond_1e
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1120
    :goto_12
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopEndColor(I)V

    .line 1122
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopLineStartColor(I)V

    .line 1123
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopLineEndColor(I)V

    .line 1125
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 1127
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v13, v20

    iget v3, v14, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    move v4, v13

    iget v5, v14, Lo/fag$c;->a:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1129
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v13, v2

    iget v3, v14, Lo/fag$c;->a:F

    move v4, v13

    iget v5, v14, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1131
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    sub-float v3, v3, v21

    move v4, v8

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    add-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto :goto_13

    .line 1134
    :cond_1f
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    add-float v4, v12, v20

    iget v5, v14, Lo/fag$c;->a:F

    add-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1136
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->a:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v12

    iget v5, v14, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1138
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    sub-float v3, v3, v21

    move v4, v10

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    add-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    .line 1143
    :cond_20
    :goto_13
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    invoke-direct/range {v0 .. v5}, Lo/fag;->c(Landroid/graphics/Canvas;FFFF)V

    .line 1144
    goto/16 :goto_1d

    .line 1146
    :cond_21
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x45

    if-ne v0, v1, :cond_22

    .line 1147
    goto/16 :goto_1d

    .line 1149
    :cond_22
    move/from16 v0, v22

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v8, v0, v1

    .line 1150
    move/from16 v0, v23

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v10, v0, v1

    .line 1151
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v9, v11}, Lo/fag;->e(IFF)Lo/fag$c;

    move-result-object v24

    .line 1152
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setCurrentRectColor(I)V

    .line 1154
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 1155
    move/from16 v25, v8

    .line 1156
    move/from16 v26, v10

    .line 1157
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v8, v0, v26

    .line 1158
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v10, v0, v25

    .line 1161
    :cond_23
    add-int/lit8 v0, v18, 0x1

    move/from16 v1, v17

    if-ge v0, v1, :cond_30

    .line 1162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->i:Ljava/util/List;

    add-int/lit8 v1, v18, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/eux;

    .line 1163
    invoke-virtual/range {v16 .. v16}, Lo/eux;->e()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v12, v0, v1

    .line 1164
    invoke-virtual/range {v16 .. v16}, Lo/eux;->d()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->k:F

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->b:F

    add-float v13, v0, v1

    .line 1166
    sub-float v0, v10, v12

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_24

    const/16 v25, 0x1

    goto :goto_14

    :cond_24
    const/16 v25, 0x0

    .line 1168
    :goto_14
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 1169
    move/from16 v26, v12

    .line 1170
    move/from16 v27, v13

    .line 1171
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v12, v0, v27

    .line 1172
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    sub-float v13, v0, v26

    .line 1173
    sub-float v0, v8, v13

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_25

    const/16 v25, 0x1

    goto :goto_15

    :cond_25
    const/16 v25, 0x0

    .line 1175
    :cond_26
    :goto_15
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v9, v11}, Lo/fag;->e(IFF)Lo/fag$c;

    move-result-object v14

    .line 1177
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fag;->f:Z

    if-nez v0, :cond_30

    if-eqz v25, :cond_30

    .line 1180
    move-object/from16 v0, v24

    iget v0, v0, Lo/fag$c;->a:F

    iget v1, v14, Lo/fag$c;->a:F

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2b

    .line 1181
    sub-float v0, v10, v8

    cmpg-float v0, v0, v19

    if-gez v0, :cond_27

    .line 1182
    sub-float v0, v10, v8

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_16

    .line 1184
    :cond_27
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1188
    :goto_16
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomStartColor(I)V

    .line 1190
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 1192
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    add-float v4, v8, v20

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    add-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1194
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v8

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_17

    .line 1197
    :cond_28
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v10, v20

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    add-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1199
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v10, v2

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1202
    :goto_17
    sub-float v0, v13, v12

    cmpg-float v0, v0, v19

    if-gez v0, :cond_29

    .line 1203
    sub-float v0, v13, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_18

    .line 1205
    :cond_29
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1209
    :goto_18
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomEndColor(I)V

    .line 1211
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomLineStartColor(I)V

    .line 1212
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setTopToBottomLineEndColor(I)V

    .line 1213
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 1215
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v13, v20

    iget v3, v14, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v13

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1217
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v13, v2

    iget v3, v14, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    move v4, v13

    iget v5, v14, Lo/fag$c;->b:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1219
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    add-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v8

    iget v5, v14, Lo/fag$c;->a:F

    sub-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_1c

    .line 1222
    :cond_2a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    add-float v4, v12, v20

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1224
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v12

    iget v5, v14, Lo/fag$c;->b:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1226
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    add-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v10

    iget v5, v14, Lo/fag$c;->a:F

    sub-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto/16 :goto_1c

    .line 1231
    :cond_2b
    sub-float v0, v10, v8

    cmpg-float v0, v0, v19

    if-gez v0, :cond_2c

    .line 1232
    sub-float v0, v10, v8

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_19

    .line 1234
    :cond_2c
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1238
    :goto_19
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopStartColor(I)V

    .line 1239
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 1241
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    add-float v4, v8, v20

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1243
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v8

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    goto :goto_1a

    .line 1246
    :cond_2d
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v10, v20

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    sub-float v3, v3, v20

    add-float v3, v3, v21

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    add-float v5, v5, v20

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1248
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v10, v2

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v3, v4

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->b:F

    const/4 v6, 0x0

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1250
    :goto_1a
    sub-float v0, v13, v12

    cmpg-float v0, v0, v19

    if-gez v0, :cond_2e

    .line 1251
    sub-float v0, v13, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float v20, v0, v1

    goto :goto_1b

    .line 1253
    :cond_2e
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v20

    .line 1257
    :goto_1b
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopEndColor(I)V

    .line 1259
    invoke-virtual {v15}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopLineStartColor(I)V

    .line 1260
    invoke-virtual/range {v16 .. v16}, Lo/eux;->b()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->setBottomToTopLineEndColor(I)V

    .line 1261
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 1263
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sub-float v2, v13, v20

    iget v3, v14, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    move v4, v13

    iget v5, v14, Lo/fag$c;->a:F

    add-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1265
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v20

    add-float v2, v2, v21

    sub-float v2, v13, v2

    iget v3, v14, Lo/fag$c;->a:F

    move v4, v13

    iget v5, v14, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/4 v6, 0x0

    const/high16 v7, -0x3d4c0000    # -90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1267
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    sub-float v3, v3, v21

    move v4, v8

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    add-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    goto :goto_1c

    .line 1270
    :cond_2f
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    add-float v4, v12, v20

    iget v5, v14, Lo/fag$c;->a:F

    add-float v5, v5, v20

    sub-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->a(Landroid/graphics/Canvas;FFFF)V

    .line 1272
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    iget v3, v14, Lo/fag$c;->a:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    add-float v4, v4, v21

    add-float/2addr v4, v12

    iget v5, v14, Lo/fag$c;->a:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v20

    add-float/2addr v5, v6

    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v7, 0x42b40000    # 90.0f

    invoke-direct/range {v0 .. v7}, Lo/fag;->e(Landroid/graphics/Canvas;FFFFFF)V

    .line 1274
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->a:F

    sub-float v3, v3, v20

    sub-float v3, v3, v21

    move v4, v10

    iget v5, v14, Lo/fag$c;->b:F

    add-float v5, v5, v20

    add-float v5, v5, v21

    invoke-direct/range {v0 .. v5}, Lo/fag;->d(Landroid/graphics/Canvas;FFFF)V

    .line 1279
    :cond_30
    :goto_1c
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v8

    move-object/from16 v3, v24

    iget v3, v3, Lo/fag$c;->b:F

    move v4, v10

    move-object/from16 v5, v24

    iget v5, v5, Lo/fag$c;->a:F

    invoke-direct/range {v0 .. v5}, Lo/fag;->c(Landroid/graphics/Canvas;FFFF)V

    .line 862
    :goto_1d
    add-int/lit8 v18, v18, 0x1

    goto/16 :goto_0

    .line 1282
    :cond_31
    return-void
.end method

.method private e(Landroid/graphics/Canvas;FFFFFF)V
    .locals 8

    .line 1489
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 1490
    invoke-virtual {p0}, Lo/fag;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1492
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1493
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1495
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1497
    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7, p2, p3, p4, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1498
    move-object v0, p1

    move-object v1, v7

    move v2, p6

    move v3, p7

    move-object v5, v6

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 1499
    return-void
.end method

.method private e(Landroid/graphics/Canvas;IIFF)V
    .locals 19

    .line 473
    div-int/lit8 v0, p2, 0x3c

    add-int/lit8 v4, v0, 0x14

    .line 474
    rem-int/lit8 v5, p2, 0x3c

    .line 475
    const/16 v0, 0x18

    if-lt v4, v0, :cond_0

    .line 476
    add-int/lit8 v4, v4, -0x18

    .line 478
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    invoke-direct {v1, v4}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v5}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 480
    div-int/lit8 v0, p3, 0x3c

    add-int/lit8 v7, v0, 0x14

    .line 481
    rem-int/lit8 v8, p3, 0x3c

    .line 482
    const/16 v0, 0x18

    if-lt v7, v0, :cond_1

    .line 483
    add-int/lit8 v7, v7, -0x18

    .line 486
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    invoke-direct {v1, v7}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v8}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fag;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 488
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 489
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_list_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 490
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fag;->c:Landroid/content/Context;

    .line 491
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_10:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 490
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/dbk;->c(IF)F

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 492
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 493
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fag;->q:Z

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/fag;->g:Z

    if-nez v0, :cond_2

    .line 494
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v10, v6, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v11, v0

    .line 495
    sub-float v0, p4, v11

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->E:F

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->H:F

    move-object/from16 v2, p1

    invoke-virtual {v2, v6, v0, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 496
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->E:F

    add-float v0, v0, p5

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->H:F

    move-object/from16 v2, p1

    invoke-virtual {v2, v9, v0, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 497
    goto/16 :goto_2

    .line 498
    :cond_2
    const-string v11, ""

    .line 499
    const-string v12, ""

    .line 500
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 501
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5}, Lo/fag;->c(II)Ljava/lang/String;

    move-result-object v12

    .line 502
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8}, Lo/fag;->c(II)Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    .line 504
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5}, Lo/fag;->c(II)Ljava/lang/String;

    move-result-object v11

    .line 505
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8}, Lo/fag;->c(II)Ljava/lang/String;

    move-result-object v12

    .line 508
    :goto_0
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v10, v11, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v13, v0

    .line 509
    sub-float v0, p4, v13

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->E:F

    sub-float v14, v0, v1

    .line 510
    const/4 v15, 0x0

    .line 511
    const/16 v16, 0x0

    .line 512
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    sub-float v0, v14, v0

    const/4 v1, 0x0

    cmpl-float v0, v1, v0

    if-ltz v0, :cond_4

    .line 513
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v14

    .line 514
    const/4 v15, 0x1

    .line 516
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->E:F

    add-float v0, v0, p5

    add-float v17, v0, v13

    .line 517
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    add-float v0, v0, v17

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->d:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 518
    const/16 v16, 0x1

    goto :goto_1

    .line 520
    :cond_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->E:F

    add-float v17, p5, v0

    .line 522
    :goto_1
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tipEndX="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "   tipStartX="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startTextWidth= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mDiagramWidth="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fag;->k:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    if-nez v15, :cond_6

    if-nez v16, :cond_6

    .line 524
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fag;->d(Landroid/graphics/Canvas;FF)V

    .line 525
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fag;->d(Landroid/graphics/Canvas;FF)V

    .line 526
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->H:F

    move-object/from16 v1, p1

    invoke-virtual {v1, v11, v14, v0, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 527
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->H:F

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v1, v12, v2, v0, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 529
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 530
    if-eqz v16, :cond_7

    .line 531
    move-object/from16 v0, p0

    iget v0, v0, Lo/fag;->d:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->E:F

    sub-float/2addr v0, v1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    move-object/from16 v2, v18

    const/4 v3, 0x0

    invoke-virtual {v10, v2, v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float v17, v0, v1

    .line 532
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->H:F

    move-object/from16 v2, p1

    move/from16 v3, v17

    invoke-virtual {v2, v0, v3, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 533
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fag;->d(Landroid/graphics/Canvas;FF)V

    .line 534
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fag;->d(Landroid/graphics/Canvas;FF)V

    .line 536
    :cond_7
    if-eqz v15, :cond_8

    .line 537
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fag;->d(Landroid/graphics/Canvas;FF)V

    .line 538
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const/high16 v3, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v3}, Lo/fag;->d(Landroid/graphics/Canvas;FF)V

    .line 539
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fag;->H:F

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v14, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 543
    :cond_8
    :goto_2
    return-void
.end method

.method private getChartLabels()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 336
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 338
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 339
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x14

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 340
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 341
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 344
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v9

    .line 345
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 348
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v10

    .line 349
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0xe

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 352
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v11

    .line 353
    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    move-object v0, v7

    invoke-static {}, Lo/dbu;->d()I

    move-result v1

    invoke-static {}, Lo/dbu;->e()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x14

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Calendar;->set(IIIII)V

    .line 356
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const/16 v1, 0x81

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v12

    .line 357
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 359
    return-object v6
.end method

.method private getSleepSumList()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/eux;>;"
        }
    .end annotation

    .line 629
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 631
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 632
    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eux;

    .line 634
    invoke-virtual {v4}, Lo/eux;->b()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    .line 635
    goto :goto_1

    .line 637
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 638
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 641
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eux;

    .line 642
    iget v0, v3, Lo/eux;->b:I

    iget v1, v4, Lo/eux;->c:I

    if-ne v0, v1, :cond_2

    .line 643
    iget v0, v4, Lo/eux;->b:I

    iput v0, v3, Lo/eux;->b:I

    goto :goto_1

    .line 645
    :cond_2
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 631
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 649
    :cond_3
    return-object v2
.end method

.method private getTimeLabel()V
    .locals 13

    .line 213
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 214
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 215
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 216
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    .line 219
    iget-boolean v0, p0, Lo/fag;->q:Z

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Lo/fag;->g:Z

    if-nez v0, :cond_b

    .line 220
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mStartSleepPoint: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fag;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mLastNightEndPoint:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fag;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mStartPoint:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fag;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mEndPoint:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fag;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    .line 223
    iget v0, p0, Lo/fag;->C:I

    div-int/lit8 v0, v0, 0x3c

    add-int/lit8 v5, v0, 0x14

    .line 224
    iget v0, p0, Lo/fag;->C:I

    rem-int/lit8 v6, v0, 0x3c

    .line 227
    const/16 v0, 0x14

    if-gt v0, v5, :cond_0

    const/16 v0, 0x18

    if-ge v5, v0, :cond_0

    .line 228
    iget-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fag;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->K:Ljava/lang/String;

    goto :goto_0

    .line 230
    :cond_0
    iget-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    invoke-direct {p0, v0}, Lo/fag;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->K:Ljava/lang/String;

    .line 233
    :goto_0
    const/16 v0, 0x18

    if-lt v5, v0, :cond_1

    .line 234
    add-int/lit8 v5, v5, -0x18

    .line 236
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v5}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, v6}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fag;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 237
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_start_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 240
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_start_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 244
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v7, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v8, v0

    .line 246
    const/4 v9, 0x0

    .line 247
    iget v0, p0, Lo/fag;->t:I

    iget v1, p0, Lo/fag;->u:I

    if-eq v0, v1, :cond_3

    .line 248
    iget v0, p0, Lo/fag;->C:I

    iget v1, p0, Lo/fag;->u:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fag;->t:I

    iget v2, p0, Lo/fag;->u:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lo/fag;->d:F

    const/high16 v2, 0x42a00000    # 80.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float v9, v0, v1

    goto :goto_2

    .line 250
    :cond_3
    const/high16 v0, 0x42200000    # 40.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float v9, v0, v1

    .line 252
    :goto_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 253
    iget v0, p0, Lo/fag;->d:F

    sub-float/2addr v0, v8

    sub-float v9, v0, v9

    .line 255
    :cond_4
    iput v9, p0, Lo/fag;->N:F

    .line 257
    iget v0, p0, Lo/fag;->v:I

    div-int/lit8 v0, v0, 0x3c

    add-int/lit8 v10, v0, 0x14

    .line 258
    iget v0, p0, Lo/fag;->v:I

    rem-int/lit8 v11, v0, 0x3c

    .line 259
    const/16 v0, 0x18

    if-lt v10, v0, :cond_5

    .line 260
    add-int/lit8 v10, v10, -0x18

    .line 263
    :cond_5
    const/16 v0, 0x14

    if-gt v0, v10, :cond_6

    const/16 v0, 0x18

    if-ge v10, v0, :cond_6

    .line 264
    iget-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    .line 265
    iget-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fag;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->M:Ljava/lang/String;

    goto :goto_3

    .line 267
    :cond_6
    iget-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    invoke-direct {p0, v0}, Lo/fag;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->M:Ljava/lang/String;

    .line 270
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v10}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, v11}, Lo/fag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fag;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 271
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_end_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_4

    .line 274
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_end_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 278
    :goto_4
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v12, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v8, v0

    .line 279
    iget v0, p0, Lo/fag;->t:I

    iget v1, p0, Lo/fag;->u:I

    if-eq v0, v1, :cond_8

    .line 280
    iget v0, p0, Lo/fag;->v:I

    iget v1, p0, Lo/fag;->u:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fag;->t:I

    iget v2, p0, Lo/fag;->u:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lo/fag;->d:F

    const/high16 v2, 0x42a00000    # 80.0f

    invoke-static {v2}, Lo/fiu;->e(F)F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float v9, v0, v1

    goto :goto_5

    .line 282
    :cond_8
    iget v0, p0, Lo/fag;->d:F

    sub-float/2addr v0, v8

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float v9, v0, v1

    .line 284
    :goto_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 285
    iget v0, p0, Lo/fag;->d:F

    sub-float/2addr v0, v9

    sub-float v9, v0, v8

    .line 286
    const/4 v0, 0x0

    cmpg-float v0, v9, v0

    if-gez v0, :cond_9

    .line 287
    const/4 v9, 0x0

    .line 290
    :cond_9
    iput v9, p0, Lo/fag;->P:F

    .line 292
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    .line 293
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    const/4 v1, 0x1

    aput-object v12, v0, v1

    .line 294
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->K:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 295
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->M:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 298
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 299
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    .line 300
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    const/4 v1, 0x1

    aput-object v7, v0, v1

    .line 301
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->M:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 302
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->K:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 304
    :cond_a
    goto/16 :goto_8

    .line 306
    :cond_b
    invoke-direct {p0}, Lo/fag;->getChartLabels()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->z:Ljava/util/List;

    .line 307
    iget-object v0, p0, Lo/fag;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    .line 308
    const/4 v6, 0x0

    :goto_6
    iget-object v0, p0, Lo/fag;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_d

    .line 309
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 310
    iget-object v0, p0, Lo/fag;->z:Ljava/util/List;

    iget-object v1, p0, Lo/fag;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v6

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    goto :goto_7

    .line 312
    :cond_c
    iget-object v0, p0, Lo/fag;->z:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 314
    :goto_7
    iget-object v0, p0, Lo/fag;->A:[Ljava/lang/String;

    aput-object v5, v0, v6

    .line 308
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 317
    :cond_d
    iget-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fag;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->K:Ljava/lang/String;

    .line 318
    iget-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    invoke-direct {p0, v0}, Lo/fag;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->M:Ljava/lang/String;

    .line 319
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->K:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 320
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->M:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 323
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 324
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->M:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 325
    iget-object v0, p0, Lo/fag;->D:[Ljava/lang/String;

    iget-object v1, p0, Lo/fag;->K:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 328
    :cond_e
    :goto_8
    return-void
.end method

.method private setBottomToTopEndColor(I)V
    .locals 2

    .line 1598
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1600
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1601
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1602
    goto/16 :goto_1

    .line 1604
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff06c9a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1605
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1606
    goto/16 :goto_1

    .line 1608
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffc12de0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1609
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1610
    goto :goto_1

    .line 1612
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1613
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1614
    goto :goto_1

    .line 1616
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1617
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1618
    goto :goto_1

    .line 1620
    :goto_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1623
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setBottomToTopLineEndColor(I)V
    .locals 2

    .line 1660
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1662
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1663
    goto :goto_0

    .line 1665
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1666
    goto :goto_0

    .line 1668
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1669
    goto :goto_0

    .line 1671
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff8e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1672
    goto :goto_0

    .line 1674
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1675
    .line 1679
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setBottomToTopLineStartColor(I)V
    .locals 2

    .line 1632
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1634
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1635
    goto :goto_0

    .line 1637
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1638
    goto :goto_0

    .line 1640
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1641
    goto :goto_0

    .line 1643
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff8e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1644
    goto :goto_0

    .line 1646
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1647
    .line 1651
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setBottomToTopStartColor(I)V
    .locals 2

    .line 1564
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1566
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1567
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1568
    goto/16 :goto_1

    .line 1570
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1571
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc8f6e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1572
    goto/16 :goto_1

    .line 1574
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1575
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffdb45c2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1576
    goto :goto_1

    .line 1578
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1579
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1580
    goto :goto_1

    .line 1582
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1583
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1584
    goto :goto_1

    .line 1586
    :goto_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1589
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setCurrentRectColor(I)V
    .locals 2

    .line 1291
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 1293
    :sswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->n:I

    .line 1294
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb632:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->p:I

    .line 1295
    goto/16 :goto_1

    .line 1297
    :sswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffd8b75:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->n:I

    .line 1298
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff27095:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->p:I

    .line 1299
    goto/16 :goto_1

    .line 1301
    :sswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd840c7:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->n:I

    .line 1302
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffc62cde:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->p:I

    .line 1303
    goto/16 :goto_1

    .line 1305
    :sswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9831ef:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->n:I

    .line 1306
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff8e31f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->p:I

    .line 1307
    goto :goto_1

    .line 1309
    :sswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->n:I

    .line 1310
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->p:I

    .line 1311
    goto :goto_1

    .line 1313
    :sswitch_5
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->n:I

    .line 1314
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->p:I

    .line 1315
    goto :goto_1

    .line 1317
    :goto_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->n:I

    .line 1318
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->p:I

    .line 1321
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_3
        0x42 -> :sswitch_2
        0x43 -> :sswitch_0
        0x44 -> :sswitch_1
        0x45 -> :sswitch_4
        0x2bc -> :sswitch_5
    .end sparse-switch
.end method

.method private setTopToBottomEndColor(I)V
    .locals 2

    .line 1383
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1385
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1386
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1387
    goto/16 :goto_1

    .line 1389
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc8f6e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1390
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1391
    goto/16 :goto_1

    .line 1393
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffdb45c2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1394
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1395
    goto :goto_1

    .line 1397
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1398
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1399
    goto :goto_1

    .line 1401
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1402
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1403
    goto :goto_1

    .line 1405
    :goto_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1408
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setTopToBottomLineEndColor(I)V
    .locals 2

    .line 1536
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1538
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb632:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1539
    goto :goto_0

    .line 1541
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1542
    goto :goto_0

    .line 1544
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1545
    goto :goto_0

    .line 1547
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1548
    goto :goto_0

    .line 1550
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->s:I

    .line 1551
    .line 1555
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setTopToBottomLineStartColor(I)V
    .locals 2

    .line 1508
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1510
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdc221:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1511
    goto :goto_0

    .line 1513
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffc877b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1514
    goto :goto_0

    .line 1516
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffd53bcb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1517
    goto :goto_0

    .line 1519
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9831ef:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1520
    goto :goto_0

    .line 1522
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->m:I

    .line 1523
    .line 1527
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method private setTopToBottomStartColor(I)V
    .locals 2

    .line 1349
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1351
    :pswitch_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdba2b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1352
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fffdb239:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1353
    goto/16 :goto_1

    .line 1355
    :pswitch_1
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff4748f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1356
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff06c9a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1357
    goto/16 :goto_1

    .line 1359
    :pswitch_2
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffcb2cdd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1360
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffc12de0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1361
    goto :goto_1

    .line 1363
    :pswitch_3
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9d30ed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1364
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff9330f0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1365
    goto :goto_1

    .line 1367
    :pswitch_4
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff4490c4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1368
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff008fff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->o:I

    .line 1369
    goto :goto_1

    .line 1371
    :goto_0
    iget-object v0, p0, Lo/fag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_transparent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fag;->l:I

    .line 1374
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public c(Ljava/util/List;ZDZLjava/util/Date;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;ZDZLjava/util/Date;)V"
        }
    .end annotation

    .line 659
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter refreshCoreFitnessDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    const/4 v0, 0x0

    if-eq v0, p6, :cond_0

    .line 662
    invoke-virtual {p6}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    goto :goto_0

    .line 665
    :cond_0
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lo/fag;->L:Ljava/util/Date;

    .line 667
    :goto_0
    iput-boolean p2, p0, Lo/fag;->q:Z

    .line 668
    iput-boolean p5, p0, Lo/fag;->g:Z

    .line 669
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 670
    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 671
    iget-object v0, p0, Lo/fag;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 672
    iget-object v0, p0, Lo/fag;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 673
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->x:I

    .line 674
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->y:I

    .line 675
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->u:I

    .line 676
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->t:I

    .line 678
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 679
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshCoreFitnessDataList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 683
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 684
    invoke-direct {p0}, Lo/fag;->e()V

    .line 688
    :cond_2
    if-eqz p2, :cond_3

    iget v0, p0, Lo/fag;->x:I

    if-nez v0, :cond_3

    iget v0, p0, Lo/fag;->y:I

    if-nez v0, :cond_3

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, p3

    if-eqz v0, :cond_3

    .line 689
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u79d1\u5b66\u7761\u7720\u4e0d\u663e\u793a\u666e\u901a\u7761\u7720\u56fe\u8868 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    iget-object v0, p0, Lo/fag;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 691
    iget-object v0, p0, Lo/fag;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 692
    iget-object v0, p0, Lo/fag;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 693
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->x:I

    .line 694
    const/4 v0, 0x0

    iput v0, p0, Lo/fag;->y:I

    goto :goto_1

    .line 696
    :cond_3
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u89c4\u907f\u5931\u6548 mREMSleepTimes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fag;->x:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u89c4\u907f\u5931\u6548 isScienceSleep = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshFitnessDataList \u89c4\u907f\u5931\u6548 mNoonSleepTimes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fag;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 701
    :goto_1
    invoke-virtual {p0}, Lo/fag;->invalidate()V

    .line 702
    const-string v0, "CoreSleepDayShareDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave refreshCoreFitnessDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 703
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 204
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 206
    invoke-direct {p0}, Lo/fag;->getTimeLabel()V

    .line 207
    invoke-direct {p0, p1}, Lo/fag;->e(Landroid/graphics/Canvas;)V

    .line 208
    invoke-direct {p0, p1}, Lo/fag;->d(Landroid/graphics/Canvas;)V

    .line 209
    invoke-direct {p0, p1}, Lo/fag;->a(Landroid/graphics/Canvas;)V

    .line 210
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 187
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 189
    invoke-virtual {p0}, Lo/fag;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/fag;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fag;->d:F

    .line 190
    invoke-virtual {p0}, Lo/fag;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/fag;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fag;->e:F

    .line 192
    iget v0, p0, Lo/fag;->d:F

    const/high16 v1, 0x42900000    # 72.0f

    invoke-static {v1}, Lo/fiu;->e(F)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fag;->k:F

    .line 193
    iget-boolean v0, p0, Lo/fag;->q:Z

    if-eqz v0, :cond_0

    .line 194
    const/high16 v0, 0x430a0000    # 138.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fag;->h:F

    goto :goto_0

    .line 196
    :cond_0
    const/high16 v0, 0x43300000    # 176.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    iput v0, p0, Lo/fag;->h:F

    .line 199
    :goto_0
    iget v0, p0, Lo/fag;->e:F

    iput v0, p0, Lo/fag;->J:F

    .line 200
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .line 178
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 181
    iget v0, p0, Lo/fag;->J:F

    iput v0, p0, Lo/fag;->B:F

    .line 182
    iput p1, p0, Lo/fag;->F:I

    .line 183
    return-void
.end method
