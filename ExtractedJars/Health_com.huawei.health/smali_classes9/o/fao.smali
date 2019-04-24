.class public Lo/fao;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static e:Ljava/lang/String;


# instance fields
.field private A:I

.field private a:[I

.field private b:Landroid/content/Context;

.field private c:I

.field private d:[I

.field private f:I

.field private g:I

.field private h:I

.field private i:Landroid/graphics/RectF;

.field private j:I

.field private k:I

.field private l:F

.field private m:F

.field private n:[F

.field private o:Landroid/graphics/Paint;

.field private p:Landroid/graphics/Paint;

.field private q:Landroid/graphics/Paint;

.field private r:F

.field private s:F

.field private t:Landroid/graphics/Paint;

.field private u:F

.field private v:F

.field private w:F

.field private x:Landroid/graphics/Paint;

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-string v0, "SleepPieChart"

    sput-object v0, Lo/fao;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fao;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 76
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fao;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 80
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    const/4 v0, 0x3

    iput v0, p0, Lo/fao;->c:I

    .line 31
    const/4 v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lo/fao;->d:[I

    .line 33
    const/4 v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lo/fao;->a:[I

    .line 45
    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/fao;->n:[F

    .line 48
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->l:F

    .line 49
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x424e0000    # 51.5f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->m:F

    .line 52
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->s:F

    .line 55
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->u:F

    .line 57
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->r:F

    .line 60
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->v:F

    .line 61
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41ec0000    # 29.5f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->w:F

    .line 62
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41d00000    # 26.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->y:F

    .line 65
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fao;->z:F

    .line 81
    iput-object p1, p0, Lo/fao;->b:Landroid/content/Context;

    .line 82
    iget-object v0, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/fao;->e(Landroid/content/Context;)V

    .line 84
    invoke-direct {p0}, Lo/fao;->b()V

    .line 85
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private b(IF)F
    .locals 2

    .line 378
    iget-object v0, p0, Lo/fao;->n:[F

    aget v0, v0, p1

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 379
    iget-object v0, p0, Lo/fao;->n:[F

    aget v0, v0, p1

    add-float/2addr v0, p2

    const/high16 v1, 0x41200000    # 10.0f

    sub-float p2, v0, v1

    .line 380
    iget-object v0, p0, Lo/fao;->n:[F

    const/high16 v1, 0x41200000    # 10.0f

    aput v1, v0, p1

    goto :goto_0

    .line 382
    :cond_0
    const/4 p2, 0x0

    .line 384
    :goto_0
    return p2
.end method

.method private b()V
    .locals 4

    .line 126
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPaint"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fao;->o:Landroid/graphics/Paint;

    .line 129
    iget-object v0, p0, Lo/fao;->o:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 130
    iget-object v0, p0, Lo/fao;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 131
    iget-object v0, p0, Lo/fao;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/fao;->l:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 134
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    .line 135
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 136
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 137
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    iget v1, p0, Lo/fao;->u:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 139
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fao;->t:Landroid/graphics/Paint;

    .line 140
    iget-object v0, p0, Lo/fao;->t:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 141
    iget-object v0, p0, Lo/fao;->t:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 142
    iget-object v0, p0, Lo/fao;->t:Landroid/graphics/Paint;

    iget v1, p0, Lo/fao;->v:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 145
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fao;->p:Landroid/graphics/Paint;

    .line 146
    iget-object v0, p0, Lo/fao;->p:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 147
    iget-object v0, p0, Lo/fao;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 148
    iget-object v0, p0, Lo/fao;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/fao;->s:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 150
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fao;->x:Landroid/graphics/Paint;

    .line 151
    iget-object v0, p0, Lo/fao;->x:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 152
    iget-object v0, p0, Lo/fao;->x:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 153
    iget-object v0, p0, Lo/fao;->x:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 154
    iget-object v0, p0, Lo/fao;->x:Landroid/graphics/Paint;

    iget v1, p0, Lo/fao;->z:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 155
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 8

    .line 206
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawDivide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/fao;->n:[F

    array-length v0, v0

    if-ge v6, v0, :cond_2

    .line 209
    iget-object v0, p0, Lo/fao;->n:[F

    aget v7, v0, v6

    .line 210
    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-nez v0, :cond_0

    .line 211
    goto :goto_1

    .line 213
    :cond_0
    const/high16 v0, 0x43b40000    # 360.0f

    cmpl-float v0, v7, v0

    if-nez v0, :cond_1

    .line 214
    return-void

    .line 217
    :cond_1
    iget-object v0, p0, Lo/fao;->p:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 219
    move-object v0, p1

    iget v1, p0, Lo/fao;->h:I

    int-to-float v1, v1

    iget v2, p0, Lo/fao;->w:F

    add-float/2addr v1, v2

    iget v2, p0, Lo/fao;->v:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/fao;->b:Landroid/content/Context;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/fao;->f:I

    int-to-float v2, v2

    iget v3, p0, Lo/fao;->h:I

    int-to-float v3, v3

    iget v4, p0, Lo/fao;->m:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fao;->u:F

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    add-float/2addr v3, v4

    iget v4, p0, Lo/fao;->f:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/fao;->p:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 220
    iget v0, p0, Lo/fao;->h:I

    int-to-float v0, v0

    iget v1, p0, Lo/fao;->f:I

    int-to-float v1, v1

    invoke-virtual {p1, v7, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 208
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 222
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 223
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 225
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 13

    .line 287
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawInnerCycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lo/fao;->t:Landroid/graphics/Paint;

    iget v1, p0, Lo/fao;->j:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 289
    iget-object v0, p0, Lo/fao;->x:Landroid/graphics/Paint;

    iget v1, p0, Lo/fao;->A:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 292
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_sleep_ratio:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 294
    iget-object v0, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 295
    iget-object v0, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_ratio:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 297
    iget-object v0, p0, Lo/fao;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v11

    .line 298
    iget-object v0, p0, Lo/fao;->b:Landroid/content/Context;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v12, v0

    .line 299
    iget v0, p0, Lo/fao;->g:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float v1, v11, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fao;->k:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget-object v2, p0, Lo/fao;->b:Landroid/content/Context;

    const/high16 v3, 0x41100000    # 9.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iget-object v2, p0, Lo/fao;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v10, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 300
    iget v0, p0, Lo/fao;->g:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float v1, v11, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fao;->k:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v12, v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/fao;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 303
    :cond_0
    move-object v0, p1

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/fao;->h:I

    int-to-float v2, v2

    iget v3, p0, Lo/fao;->y:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fao;->v:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fao;->f:I

    int-to-float v3, v3

    iget v4, p0, Lo/fao;->y:F

    sub-float/2addr v3, v4

    iget v4, p0, Lo/fao;->v:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lo/fao;->h:I

    int-to-float v4, v4

    iget v5, p0, Lo/fao;->y:F

    add-float/2addr v4, v5

    iget v5, p0, Lo/fao;->v:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    iget v5, p0, Lo/fao;->f:I

    int-to-float v5, v5

    iget v6, p0, Lo/fao;->y:F

    add-float/2addr v5, v6

    iget v6, p0, Lo/fao;->v:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v5, p0, Lo/fao;->t:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 304
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 15

    .line 163
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawCycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-virtual {p0}, Lo/fao;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v7, v0

    .line 165
    const/4 v8, 0x0

    .line 166
    const/4 v9, 0x0

    .line 168
    iget v0, p0, Lo/fao;->f:I

    int-to-float v0, v0

    sub-float v10, v0, v7

    .line 170
    iget v0, p0, Lo/fao;->f:I

    int-to-float v0, v0

    add-float v11, v0, v7

    .line 172
    iget v0, p0, Lo/fao;->h:I

    int-to-float v0, v0

    iget v1, p0, Lo/fao;->w:F

    float-to-double v1, v1

    iget v3, p0, Lo/fao;->w:F

    float-to-double v3, v3

    mul-double/2addr v1, v3

    mul-float v3, v7, v7

    float-to-double v3, v3

    sub-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    add-float v12, v0, v1

    .line 174
    const/4 v13, 0x0

    :goto_0
    iget-object v0, p0, Lo/fao;->a:[I

    array-length v0, v0

    if-ge v13, v0, :cond_1

    .line 175
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fao;->d:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 176
    iget-object v0, p0, Lo/fao;->o:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fao;->a:[I

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 177
    iget-object v0, p0, Lo/fao;->n:[F

    aget v9, v0, v13

    .line 179
    const/4 v0, 0x0

    cmpl-float v0, v9, v0

    if-nez v0, :cond_0

    .line 180
    goto/16 :goto_1

    .line 183
    :cond_0
    move-object/from16 v0, p1

    iget-object v1, p0, Lo/fao;->i:Landroid/graphics/RectF;

    move v2, v8

    move v3, v9

    iget-object v5, p0, Lo/fao;->o:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 185
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v14

    .line 187
    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/RectF;

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v14, v2

    const/4 v3, 0x0

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v14, v3

    iget v4, p0, Lo/fao;->k:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v14, v5

    sub-float/2addr v4, v5

    iget v5, p0, Lo/fao;->g:I

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v14, v6

    sub-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    move v2, v8

    move v3, v9

    iget-object v5, p0, Lo/fao;->q:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 190
    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lo/fao;->h:I

    int-to-float v2, v2

    iget v3, p0, Lo/fao;->r:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fao;->f:I

    int-to-float v3, v3

    iget v4, p0, Lo/fao;->r:F

    sub-float/2addr v3, v4

    iget v4, p0, Lo/fao;->h:I

    int-to-float v4, v4

    iget v5, p0, Lo/fao;->r:F

    add-float/2addr v4, v5

    iget v5, p0, Lo/fao;->f:I

    int-to-float v5, v5

    iget v6, p0, Lo/fao;->r:F

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    move v2, v8

    move v3, v9

    iget-object v5, p0, Lo/fao;->q:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 194
    add-float/2addr v8, v9

    .line 174
    :goto_1
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 196
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 198
    move-object/from16 v0, p1

    invoke-direct {p0, v0}, Lo/fao;->b(Landroid/graphics/Canvas;)V

    .line 200
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v11, v12}, Lo/fao;->e(Landroid/graphics/Canvas;FF)Ljava/util/List;

    move-result-object v13

    .line 202
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v10, v12, v13}, Lo/fao;->e(Landroid/graphics/Canvas;FFLjava/util/List;)V

    .line 203
    return-void
.end method

.method private e(Landroid/graphics/Canvas;FF)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;FF)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 228
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawDownDivide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 230
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/fao;->a:[I

    array-length v0, v0

    if-ge v7, v0, :cond_2

    .line 231
    iget-object v0, p0, Lo/fao;->n:[F

    aget v8, v0, v7

    .line 232
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-nez v0, :cond_0

    .line 233
    goto :goto_1

    .line 235
    :cond_0
    const/high16 v0, 0x43b40000    # 360.0f

    cmpl-float v0, v8, v0

    if-nez v0, :cond_1

    .line 236
    const/4 v0, 0x0

    return-object v0

    .line 238
    :cond_1
    iget-object v0, p0, Lo/fao;->d:[I

    aget v0, v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fao;->d:[I

    aget v1, v1, v7

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 241
    move-object v0, p1

    move v1, p3

    move v2, p2

    iget v3, p0, Lo/fao;->l:F

    add-float/2addr v3, p3

    move v4, p2

    iget-object v5, p0, Lo/fao;->q:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 242
    iget v0, p0, Lo/fao;->h:I

    int-to-float v0, v0

    iget v1, p0, Lo/fao;->f:I

    int-to-float v1, v1

    invoke-virtual {p1, v8, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 230
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 244
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 245
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 246
    return-object v6
.end method

.method private e(Landroid/content/Context;)V
    .locals 3

    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_1a000000:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fao;->j:I

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_801a1a1a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fao;->A:I

    .line 90
    iget-object v0, p0, Lo/fao;->d:[I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff8a2be2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 91
    iget-object v0, p0, Lo/fao;->d:[I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffc64be4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 92
    iget-object v0, p0, Lo/fao;->d:[I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_fffc8282:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 94
    iget-object v0, p0, Lo/fao;->a:[I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_808a2be2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 95
    iget-object v0, p0, Lo/fao;->a:[I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_80c64be4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 96
    iget-object v0, p0, Lo/fao;->a:[I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_80fc8282:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 97
    return-void
.end method

.method private e(Landroid/graphics/Canvas;FFLjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;FFLjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 251
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawUpDivide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    if-nez p4, :cond_0

    .line 253
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStrokeUpColorList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    return-void

    .line 256
    :cond_0
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStrokeUpColorList is isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    return-void

    .line 260
    :cond_1
    const/4 v6, 0x0

    .line 261
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/fao;->a:[I

    array-length v0, v0

    if-ge v7, v0, :cond_5

    .line 262
    iget-object v0, p0, Lo/fao;->n:[F

    aget v8, v0, v7

    .line 263
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-nez v0, :cond_2

    .line 264
    goto :goto_2

    .line 266
    :cond_2
    const/high16 v0, 0x43b40000    # 360.0f

    cmpl-float v0, v8, v0

    if-nez v0, :cond_3

    .line 267
    return-void

    .line 270
    :cond_3
    if-lez v6, :cond_4

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 271
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    add-int/lit8 v1, v6, -0x1

    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 273
    :cond_4
    iget-object v0, p0, Lo/fao;->q:Landroid/graphics/Paint;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 275
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 276
    move-object v0, p1

    move v1, p3

    move v2, p2

    iget v3, p0, Lo/fao;->l:F

    add-float/2addr v3, p3

    move v4, p2

    iget-object v5, p0, Lo/fao;->q:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 277
    iget v0, p0, Lo/fao;->h:I

    int-to-float v0, v0

    iget v1, p0, Lo/fao;->f:I

    int-to-float v1, v1

    invoke-virtual {p1, v8, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 261
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 279
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 280
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 392
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initPieChartPara():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    if-eqz p1, :cond_0

    .line 395
    const/4 v0, 0x3

    iput v0, p0, Lo/fao;->c:I

    .line 397
    iget v0, p0, Lo/fao;->c:I

    new-array v0, v0, [I

    iput-object v0, p0, Lo/fao;->d:[I

    .line 398
    iget-object v0, p0, Lo/fao;->d:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff8a2be2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 399
    iget-object v0, p0, Lo/fao;->d:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffc64be4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 400
    iget-object v0, p0, Lo/fao;->d:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_fffc8282:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 402
    iget v0, p0, Lo/fao;->c:I

    new-array v0, v0, [I

    iput-object v0, p0, Lo/fao;->a:[I

    .line 403
    iget-object v0, p0, Lo/fao;->a:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_808a2be2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 404
    iget-object v0, p0, Lo/fao;->a:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_80c64be4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 405
    iget-object v0, p0, Lo/fao;->a:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_80fc8282:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 406
    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/fao;->n:[F

    goto :goto_0

    .line 409
    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lo/fao;->c:I

    .line 411
    iget v0, p0, Lo/fao;->c:I

    new-array v0, v0, [I

    iput-object v0, p0, Lo/fao;->d:[I

    .line 412
    iget-object v0, p0, Lo/fao;->d:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ff8a2be2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 413
    iget-object v0, p0, Lo/fao;->d:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffc64be4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 415
    iget v0, p0, Lo/fao;->c:I

    new-array v0, v0, [I

    iput-object v0, p0, Lo/fao;->a:[I

    .line 416
    iget-object v0, p0, Lo/fao;->a:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_808a2be2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 417
    iget-object v0, p0, Lo/fao;->a:[I

    iget-object v1, p0, Lo/fao;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_80c64be4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 418
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/fao;->n:[F

    .line 421
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 113
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 115
    invoke-direct {p0, p1}, Lo/fao;->d(Landroid/graphics/Canvas;)V

    .line 117
    invoke-direct {p0, p1}, Lo/fao;->c(Landroid/graphics/Canvas;)V

    .line 119
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 7

    .line 101
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 102
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSizeChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iput p1, p0, Lo/fao;->k:I

    .line 104
    iput p2, p0, Lo/fao;->g:I

    .line 105
    div-int/lit8 v0, p1, 0x2

    iput v0, p0, Lo/fao;->h:I

    .line 106
    div-int/lit8 v0, p2, 0x2

    iput v0, p0, Lo/fao;->f:I

    .line 108
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fao;->h:I

    int-to-float v1, v1

    iget v2, p0, Lo/fao;->m:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/fao;->l:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/fao;->f:I

    int-to-float v2, v2

    iget v3, p0, Lo/fao;->m:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/fao;->l:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lo/fao;->h:I

    int-to-float v3, v3

    iget v4, p0, Lo/fao;->m:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/fao;->l:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lo/fao;->f:I

    int-to-float v4, v4

    iget v5, p0, Lo/fao;->m:F

    add-float/2addr v4, v5

    iget v5, p0, Lo/fao;->l:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/fao;->i:Landroid/graphics/RectF;

    .line 109
    return-void
.end method

.method public setTime(Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 308
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v4, 0x0

    .line 310
    if-nez p1, :cond_0

    .line 311
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime: is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    return-void

    .line 314
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lo/fao;->c:I

    if-le v0, v1, :cond_1

    .line 315
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime: is  invaliable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    return-void

    .line 318
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 319
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v4, v0

    .line 320
    goto :goto_0

    .line 321
    :cond_2
    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-nez v0, :cond_3

    .line 322
    sget-object v0, Lo/fao;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTime sum is  0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    return-void

    .line 326
    :cond_3
    const/4 v5, 0x0

    .line 328
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 330
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_4

    .line 331
    iget-object v0, p0, Lo/fao;->n:[F

    const/4 v1, 0x0

    aput v1, v0, v6

    goto :goto_2

    .line 333
    :cond_4
    iget-object v0, p0, Lo/fao;->n:[F

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    div-float/2addr v1, v4

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    aput v1, v0, v6

    .line 328
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 337
    :cond_5
    const/4 v6, 0x0

    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_7

    .line 338
    iget-object v0, p0, Lo/fao;->n:[F

    aget v0, v0, v6

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    iget-object v0, p0, Lo/fao;->n:[F

    aget v0, v0, v6

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 339
    invoke-direct {p0, v6, v5}, Lo/fao;->b(IF)F

    move-result v5

    .line 337
    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 343
    :cond_7
    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_9

    .line 344
    const/4 v6, 0x0

    :goto_4
    iget-object v0, p0, Lo/fao;->n:[F

    array-length v0, v0

    if-ge v6, v0, :cond_9

    .line 345
    iget-object v0, p0, Lo/fao;->n:[F

    aget v0, v0, v6

    add-float/2addr v0, v5

    const/high16 v1, 0x41200000    # 10.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_8

    .line 346
    iget-object v0, p0, Lo/fao;->n:[F

    aget v1, v0, v6

    add-float/2addr v1, v5

    aput v1, v0, v6

    .line 347
    goto :goto_5

    .line 344
    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 351
    :cond_9
    :goto_5
    const/4 v6, 0x0

    .line 352
    iget-object v0, p0, Lo/fao;->n:[F

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_a

    .line 353
    iget-object v0, p0, Lo/fao;->n:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    iget-object v1, p0, Lo/fao;->n:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    add-float v6, v0, v1

    goto :goto_6

    .line 354
    :cond_a
    iget-object v0, p0, Lo/fao;->n:[F

    array-length v0, v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_b

    .line 355
    iget-object v0, p0, Lo/fao;->n:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    iget-object v1, p0, Lo/fao;->n:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/fao;->n:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    add-float v6, v0, v1

    .line 357
    :cond_b
    :goto_6
    const/high16 v0, 0x43b40000    # 360.0f

    cmpg-float v0, v6, v0

    if-gez v0, :cond_e

    .line 359
    const/4 v7, 0x0

    .line 360
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v8, v0, -0x1

    :goto_7
    if-lez v8, :cond_e

    .line 361
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_d

    .line 362
    const/4 v9, 0x0

    :goto_8
    if-ge v9, v8, :cond_c

    .line 363
    int-to-float v0, v7

    iget-object v1, p0, Lo/fao;->n:[F

    aget v1, v1, v9

    add-float/2addr v0, v1

    float-to-int v7, v0

    .line 362
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    .line 365
    :cond_c
    iget-object v0, p0, Lo/fao;->n:[F

    rsub-int v1, v7, 0x168

    int-to-float v1, v1

    aput v1, v0, v8

    .line 366
    invoke-virtual {p0}, Lo/fao;->invalidate()V

    .line 367
    return-void

    .line 360
    :cond_d
    add-int/lit8 v8, v8, -0x1

    goto :goto_7

    .line 371
    :cond_e
    invoke-virtual {p0}, Lo/fao;->invalidate()V

    .line 372
    return-void
.end method
