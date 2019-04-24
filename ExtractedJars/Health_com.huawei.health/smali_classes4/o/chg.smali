.class public Lo/chg;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private A:I

.field private C:I

.field private D:I

.field private a:I

.field private b:Landroid/content/Context;

.field private c:[I

.field private e:[I

.field private f:[F

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Landroid/graphics/RectF;

.field private l:Landroid/graphics/Paint;

.field private m:F

.field private n:F

.field private o:Landroid/graphics/Paint;

.field private p:F

.field private q:F

.field private r:F

.field private s:Landroid/graphics/Paint;

.field private t:F

.field private u:Landroid/graphics/Paint;

.field private v:F

.field private w:F

.field private x:I

.field private y:Landroid/graphics/Paint;

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-string v0, "Track_HeartRateView"

    sput-object v0, Lo/chg;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 79
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/chg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 80
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 83
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/chg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 84
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 87
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/chg;->c:[I

    .line 32
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/chg;->e:[I

    .line 44
    const/4 v0, 0x5

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    iput-object v0, p0, Lo/chg;->f:[F

    .line 47
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->m:F

    .line 48
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42460000    # 49.5f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->n:F

    .line 51
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->p:F

    .line 54
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->t:F

    .line 56
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41e00000    # 28.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->r:F

    .line 59
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3f4ccccd    # 0.8f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->q:F

    .line 60
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41e00000    # 28.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->z:F

    .line 61
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x41c33333    # 24.4f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->w:F

    .line 64
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chg;->v:F

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lo/chg;->x:I

    .line 72
    const v0, 0x7fffffff

    iput v0, p0, Lo/chg;->D:I

    .line 73
    const v0, 0x66ffffff

    iput v0, p0, Lo/chg;->j:I

    .line 74
    const/high16 v0, 0x1a000000

    iput v0, p0, Lo/chg;->A:I

    .line 75
    const/high16 v0, 0x4d000000    # 1.34217728E8f

    iput v0, p0, Lo/chg;->C:I

    .line 88
    iput-object p1, p0, Lo/chg;->b:Landroid/content/Context;

    .line 90
    invoke-direct {p0}, Lo/chg;->b()V

    .line 91
    return-void

    nop

    :array_0
    .array-data 4
        -0xaa600c
        -0xff29a7
        -0x82fe5
        -0x129000
        -0x10000
    .end array-data

    :array_1
    .array-data 4
        0x7f559ff4
        0x7f00d659
        0x7ff7d01b
        0x7fed7000
        0x7fff0000
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private a(Landroid/graphics/Canvas;FFLjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;FFLjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 247
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawUpDivide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    if-nez p4, :cond_0

    .line 249
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStrokeUpColorList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    return-void

    .line 252
    :cond_0
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStrokeUpColorList is isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    return-void

    .line 256
    :cond_1
    const/4 v6, 0x0

    .line 257
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/chg;->e:[I

    array-length v0, v0

    if-ge v7, v0, :cond_5

    .line 258
    iget-object v0, p0, Lo/chg;->f:[F

    aget v8, v0, v7

    .line 259
    const/4 v0, 0x0

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_2

    .line 260
    goto :goto_2

    .line 262
    :cond_2
    const/high16 v0, 0x43b40000    # 360.0f

    cmpl-float v0, v8, v0

    if-ltz v0, :cond_3

    .line 263
    return-void

    .line 266
    :cond_3
    if-lez v6, :cond_4

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 267
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    add-int/lit8 v1, v6, -0x1

    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 269
    :cond_4
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 271
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 272
    move-object v0, p1

    move v1, p3

    move v2, p2

    iget v3, p0, Lo/chg;->m:F

    add-float/2addr v3, p3

    move v4, p2

    iget-object v5, p0, Lo/chg;->u:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 273
    iget v0, p0, Lo/chg;->g:I

    int-to-float v0, v0

    iget v1, p0, Lo/chg;->h:I

    int-to-float v1, v1

    invoke-virtual {p1, v8, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 257
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 275
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 276
    return-void
.end method

.method private b()V
    .locals 4

    .line 120
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPaint"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chg;->o:Landroid/graphics/Paint;

    .line 123
    iget-object v0, p0, Lo/chg;->o:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 124
    iget-object v0, p0, Lo/chg;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 125
    iget-object v0, p0, Lo/chg;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->m:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 128
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    .line 129
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 130
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 131
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->t:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 133
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chg;->s:Landroid/graphics/Paint;

    .line 134
    iget-object v0, p0, Lo/chg;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 135
    iget-object v0, p0, Lo/chg;->s:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 136
    iget-object v0, p0, Lo/chg;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->q:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 139
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chg;->l:Landroid/graphics/Paint;

    .line 140
    iget-object v0, p0, Lo/chg;->l:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 141
    iget-object v0, p0, Lo/chg;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 142
    iget-object v0, p0, Lo/chg;->l:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->p:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 144
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    .line 145
    iget-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 146
    iget-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 147
    iget-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 148
    iget-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->v:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 149
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 11

    .line 279
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawInnerCycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget v0, p0, Lo/chg;->x:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 281
    iget-object v0, p0, Lo/chg;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->j:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 282
    iget-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->D:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 284
    :cond_0
    iget-object v0, p0, Lo/chg;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->A:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 285
    iget-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    iget v1, p0, Lo/chg;->C:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 289
    :goto_0
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 290
    iget-object v0, p0, Lo/chg;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_rate_zone_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 291
    iget-object v0, p0, Lo/chg;->y:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    .line 292
    iget-object v0, p0, Lo/chg;->b:Landroid/content/Context;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v10, v0

    .line 293
    iget v0, p0, Lo/chg;->a:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v9, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chg;->i:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v10, v2

    add-float/2addr v1, v2

    iget-object v2, p0, Lo/chg;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 296
    :cond_1
    move-object v0, p1

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/chg;->g:I

    int-to-float v2, v2

    iget v3, p0, Lo/chg;->w:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/chg;->q:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lo/chg;->h:I

    int-to-float v3, v3

    iget v4, p0, Lo/chg;->w:F

    sub-float/2addr v3, v4

    iget v4, p0, Lo/chg;->q:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lo/chg;->g:I

    int-to-float v4, v4

    iget v5, p0, Lo/chg;->w:F

    add-float/2addr v4, v5

    iget v5, p0, Lo/chg;->q:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    iget v5, p0, Lo/chg;->h:I

    int-to-float v5, v5

    iget v6, p0, Lo/chg;->w:F

    add-float/2addr v5, v6

    iget v6, p0, Lo/chg;->q:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v5, p0, Lo/chg;->s:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 298
    return-void
.end method

.method private d(Landroid/graphics/Canvas;FF)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;FF)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 224
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawDownDivide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 226
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/chg;->e:[I

    array-length v0, v0

    if-ge v7, v0, :cond_2

    .line 227
    iget-object v0, p0, Lo/chg;->f:[F

    aget v8, v0, v7

    .line 228
    const/4 v0, 0x0

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_0

    .line 229
    goto :goto_1

    .line 231
    :cond_0
    const/high16 v0, 0x43b40000    # 360.0f

    cmpl-float v0, v8, v0

    if-ltz v0, :cond_1

    .line 232
    const/4 v0, 0x0

    return-object v0

    .line 234
    :cond_1
    iget-object v0, p0, Lo/chg;->c:[I

    aget v0, v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/chg;->c:[I

    aget v1, v1, v7

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 237
    move-object v0, p1

    move v1, p3

    move v2, p2

    iget v3, p0, Lo/chg;->m:F

    add-float/2addr v3, p3

    move v4, p2

    iget-object v5, p0, Lo/chg;->u:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 238
    iget v0, p0, Lo/chg;->g:I

    int-to-float v0, v0

    iget v1, p0, Lo/chg;->h:I

    int-to-float v1, v1

    invoke-virtual {p1, v8, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 226
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 240
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 241
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 242
    return-object v6
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 15

    .line 156
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawCycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-virtual {p0}, Lo/chg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v7, v0

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 161
    iget v0, p0, Lo/chg;->h:I

    int-to-float v0, v0

    sub-float v10, v0, v7

    .line 163
    iget v0, p0, Lo/chg;->h:I

    int-to-float v0, v0

    add-float v11, v0, v7

    .line 165
    iget v0, p0, Lo/chg;->g:I

    int-to-float v0, v0

    iget v1, p0, Lo/chg;->z:F

    float-to-double v1, v1

    iget v3, p0, Lo/chg;->z:F

    float-to-double v3, v3

    mul-double/2addr v1, v3

    mul-float v3, v7, v7

    float-to-double v3, v3

    sub-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    add-float v12, v0, v1

    .line 167
    const/4 v13, 0x0

    :goto_0
    iget-object v0, p0, Lo/chg;->e:[I

    array-length v0, v0

    if-ge v13, v0, :cond_1

    .line 168
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/chg;->c:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 169
    iget-object v0, p0, Lo/chg;->o:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/chg;->e:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 170
    iget-object v0, p0, Lo/chg;->f:[F

    aget v9, v0, v13

    .line 172
    const/4 v0, 0x0

    cmpl-float v0, v9, v0

    if-nez v0, :cond_0

    .line 173
    goto/16 :goto_1

    .line 176
    :cond_0
    move-object/from16 v0, p1

    iget-object v1, p0, Lo/chg;->k:Landroid/graphics/RectF;

    move v2, v8

    move v3, v9

    iget-object v5, p0, Lo/chg;->o:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 178
    iget-object v0, p0, Lo/chg;->u:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v14

    .line 180
    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/RectF;

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v14, v2

    const/4 v3, 0x0

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v14, v3

    iget v4, p0, Lo/chg;->i:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v14, v5

    sub-float/2addr v4, v5

    iget v5, p0, Lo/chg;->a:I

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v14, v6

    sub-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    move v2, v8

    move v3, v9

    iget-object v5, p0, Lo/chg;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 183
    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/chg;->g:I

    int-to-float v2, v2

    iget v3, p0, Lo/chg;->r:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/chg;->h:I

    int-to-float v3, v3

    iget v4, p0, Lo/chg;->r:F

    sub-float/2addr v3, v4

    iget v4, p0, Lo/chg;->g:I

    int-to-float v4, v4

    iget v5, p0, Lo/chg;->r:F

    add-float/2addr v4, v5

    iget v5, p0, Lo/chg;->h:I

    int-to-float v5, v5

    iget v6, p0, Lo/chg;->r:F

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    move v2, v8

    move v3, v9

    iget-object v5, p0, Lo/chg;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 187
    add-float/2addr v8, v9

    .line 167
    :goto_1
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 189
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 191
    move-object/from16 v0, p1

    invoke-direct {p0, v0}, Lo/chg;->e(Landroid/graphics/Canvas;)V

    .line 193
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v11, v12}, Lo/chg;->d(Landroid/graphics/Canvas;FF)Ljava/util/List;

    move-result-object v13

    .line 195
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v10, v12, v13}, Lo/chg;->a(Landroid/graphics/Canvas;FFLjava/util/List;)V

    .line 196
    return-void
.end method

.method private e(I)F
    .locals 3

    .line 387
    const/4 v2, 0x0

    .line 388
    iget-object v0, p0, Lo/chg;->b:Landroid/content/Context;

    if-eqz v0, :cond_3

    .line 389
    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x3c

    if-ge p1, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    .line 390
    const/high16 v2, 0x3f000000    # 0.5f

    goto :goto_2

    .line 392
    :cond_2
    int-to-float v0, p1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v2, v0, v1

    .line 396
    :cond_3
    :goto_2
    return v2
.end method

.method private e(IF)F
    .locals 2

    .line 404
    iget-object v0, p0, Lo/chg;->f:[F

    aget v0, v0, p1

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 405
    iget-object v0, p0, Lo/chg;->f:[F

    aget v0, v0, p1

    add-float/2addr v0, p2

    const/high16 v1, 0x41200000    # 10.0f

    sub-float p2, v0, v1

    .line 406
    iget-object v0, p0, Lo/chg;->f:[F

    const/high16 v1, 0x41200000    # 10.0f

    aput v1, v0, p1

    goto :goto_0

    .line 408
    :cond_0
    const/4 p2, 0x0

    .line 410
    :goto_0
    return p2
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 8

    .line 199
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawDivide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/chg;->f:[F

    array-length v0, v0

    if-ge v6, v0, :cond_3

    .line 202
    iget-object v0, p0, Lo/chg;->f:[F

    aget v7, v0, v6

    .line 203
    const/4 v0, 0x0

    cmpg-float v0, v7, v0

    if-gtz v0, :cond_0

    .line 204
    goto :goto_2

    .line 206
    :cond_0
    const/high16 v0, 0x43b40000    # 360.0f

    cmpl-float v0, v7, v0

    if-ltz v0, :cond_1

    .line 207
    return-void

    .line 209
    :cond_1
    iget v0, p0, Lo/chg;->x:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 210
    iget-object v0, p0, Lo/chg;->l:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 213
    :cond_2
    iget-object v0, p0, Lo/chg;->l:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 216
    :goto_1
    move-object v0, p1

    iget v1, p0, Lo/chg;->g:I

    int-to-float v1, v1

    iget v2, p0, Lo/chg;->z:F

    add-float/2addr v1, v2

    iget v2, p0, Lo/chg;->q:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/chg;->b:Landroid/content/Context;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/chg;->h:I

    int-to-float v2, v2

    iget v3, p0, Lo/chg;->g:I

    int-to-float v3, v3

    iget v4, p0, Lo/chg;->n:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/chg;->t:F

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    add-float/2addr v3, v4

    iget v4, p0, Lo/chg;->h:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/chg;->l:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 217
    iget v0, p0, Lo/chg;->g:I

    int-to-float v0, v0

    iget v1, p0, Lo/chg;->h:I

    int-to-float v1, v1

    invoke-virtual {p1, v7, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 201
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 219
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 220
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 222
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 107
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 109
    invoke-direct {p0, p1}, Lo/chg;->d(Landroid/graphics/Canvas;)V

    .line 111
    invoke-direct {p0, p1}, Lo/chg;->b(Landroid/graphics/Canvas;)V

    .line 113
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 7

    .line 95
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 96
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSizeChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iput p1, p0, Lo/chg;->i:I

    .line 98
    iput p2, p0, Lo/chg;->a:I

    .line 99
    div-int/lit8 v0, p1, 0x2

    iput v0, p0, Lo/chg;->g:I

    .line 100
    div-int/lit8 v0, p2, 0x2

    iput v0, p0, Lo/chg;->h:I

    .line 102
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/chg;->g:I

    int-to-float v1, v1

    iget v2, p0, Lo/chg;->n:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/chg;->m:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/chg;->h:I

    int-to-float v2, v2

    iget v3, p0, Lo/chg;->n:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/chg;->m:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lo/chg;->g:I

    int-to-float v3, v3

    iget v4, p0, Lo/chg;->n:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/chg;->m:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lo/chg;->h:I

    int-to-float v4, v4

    iget v5, p0, Lo/chg;->n:F

    add-float/2addr v4, v5

    iget v5, p0, Lo/chg;->m:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/chg;->k:Landroid/graphics/RectF;

    .line 103
    return-void
.end method

.method public setTime(Ljava/util/ArrayList;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 302
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iput p2, p0, Lo/chg;->x:I

    .line 304
    const/4 v4, 0x0

    .line 305
    if-nez p1, :cond_0

    .line 306
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime: is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    return-void

    .line 309
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    .line 310
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime: is  invaliable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    return-void

    .line 313
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 315
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 316
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/chg;->e(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    goto :goto_0

    .line 318
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Float;

    .line 319
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v4, v0

    .line 320
    goto :goto_1

    .line 321
    :cond_3
    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-nez v0, :cond_4

    .line 322
    sget-object v0, Lo/chg;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime sum is  0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    return-void

    .line 326
    :cond_4
    const/4 v6, 0x0

    .line 328
    const/4 v7, 0x0

    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_6

    .line 330
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_5

    .line 331
    iget-object v0, p0, Lo/chg;->f:[F

    const/4 v1, 0x0

    aput v1, v0, v7

    goto :goto_3

    .line 333
    :cond_5
    iget-object v0, p0, Lo/chg;->f:[F

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    div-float/2addr v1, v4

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    aput v1, v0, v7

    .line 328
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 337
    :cond_6
    const/4 v7, 0x0

    :goto_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_8

    .line 338
    iget-object v0, p0, Lo/chg;->f:[F

    aget v0, v0, v7

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_7

    iget-object v0, p0, Lo/chg;->f:[F

    aget v0, v0, v7

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 339
    invoke-direct {p0, v7, v6}, Lo/chg;->e(IF)F

    move-result v6

    .line 337
    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 343
    :cond_8
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 344
    const/4 v0, 0x0

    cmpg-float v0, v6, v0

    if-gez v0, :cond_a

    .line 345
    const/4 v8, 0x0

    :goto_5
    iget-object v0, p0, Lo/chg;->f:[F

    array-length v0, v0

    if-ge v8, v0, :cond_a

    .line 346
    iget-object v0, p0, Lo/chg;->f:[F

    aget v0, v0, v8

    add-float/2addr v0, v6

    const/high16 v1, 0x41200000    # 10.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 347
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    .line 352
    :cond_a
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-eqz v0, :cond_b

    .line 353
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-float v0, v0

    div-float v8, v6, v0

    .line 354
    const/4 v9, 0x0

    :goto_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_b

    .line 355
    iget-object v0, p0, Lo/chg;->f:[F

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget v2, v0, v1

    add-float/2addr v2, v8

    aput v2, v0, v1

    .line 354
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 359
    :cond_b
    const/4 v8, 0x0

    :goto_7
    iget-object v0, p0, Lo/chg;->f:[F

    array-length v0, v0

    if-ge v8, v0, :cond_e

    .line 360
    iget-object v0, p0, Lo/chg;->f:[F

    aget v0, v0, v8

    const/high16 v1, 0x43af0000    # 350.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_c

    .line 361
    iget-object v0, p0, Lo/chg;->f:[F

    const/high16 v1, 0x43b40000    # 360.0f

    aput v1, v0, v8

    goto :goto_8

    .line 362
    :cond_c
    iget-object v0, p0, Lo/chg;->f:[F

    aget v0, v0, v8

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_d

    .line 363
    iget-object v0, p0, Lo/chg;->f:[F

    const/4 v1, 0x0

    aput v1, v0, v8

    .line 359
    :cond_d
    :goto_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 366
    :cond_e
    iget-object v0, p0, Lo/chg;->f:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    iget-object v1, p0, Lo/chg;->f:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/chg;->f:[F

    const/4 v2, 0x3

    aget v1, v1, v2

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/chg;->f:[F

    const/4 v2, 0x4

    aget v1, v1, v2

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/chg;->f:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    add-float v8, v0, v1

    .line 367
    const/high16 v0, 0x43b40000    # 360.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_11

    .line 369
    const/4 v9, 0x0

    .line 370
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v10, v0, -0x1

    :goto_9
    if-lez v10, :cond_11

    .line 371
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_10

    .line 372
    const/4 v11, 0x0

    :goto_a
    if-ge v11, v10, :cond_f

    .line 373
    int-to-float v0, v9

    iget-object v1, p0, Lo/chg;->f:[F

    aget v1, v1, v11

    add-float/2addr v0, v1

    float-to-int v9, v0

    .line 372
    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    .line 375
    :cond_f
    iget-object v0, p0, Lo/chg;->f:[F

    rsub-int v1, v9, 0x168

    int-to-float v1, v1

    aput v1, v0, v10

    .line 376
    invoke-virtual {p0}, Lo/chg;->invalidate()V

    .line 377
    return-void

    .line 370
    :cond_10
    add-int/lit8 v10, v10, -0x1

    goto :goto_9

    .line 381
    :cond_11
    invoke-virtual {p0}, Lo/chg;->invalidate()V

    .line 382
    return-void
.end method
