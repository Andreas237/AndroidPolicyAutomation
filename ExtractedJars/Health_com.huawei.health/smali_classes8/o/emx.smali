.class public Lo/emx;
.super Lo/nh;
.source "SourceFile"


# instance fields
.field private B:I

.field private m:Landroid/graphics/Paint;

.field private o:I

.field private p:F

.field private q:F

.field private r:Landroid/graphics/Paint;

.field private s:F

.field private t:Landroid/graphics/Path;

.field private u:Z

.field private v:[F

.field private w:Z

.field private x:F

.field private y:Lo/mt;

.field private z:Z


# direct methods
.method public constructor <init>(Lo/mo;Lo/la;Lo/oa;)V
    .locals 2

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lo/nh;-><init>(Lo/mo;Lo/la;Lo/oa;)V

    .line 25
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/emx;->m:Landroid/graphics/Paint;

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emx;->u:Z

    .line 35
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emx;->w:Z

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emx;->z:Z

    .line 45
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/emx;->v:[F

    .line 42
    return-void
.end method

.method private a()F
    .locals 2

    .line 57
    iget v0, p0, Lo/emx;->x:F

    const/high16 v1, 0x42200000    # 40.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lo/emx;->x:F

    const/high16 v1, 0x42200000    # 40.0f

    rem-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 58
    :cond_0
    iget v0, p0, Lo/emx;->x:F

    return v0

    .line 60
    :cond_1
    iget v0, p0, Lo/emx;->x:F

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x28

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x28

    int-to-float v0, v0

    return v0
.end method

.method private a(F)Ljava/lang/String;
    .locals 4

    .line 316
    iget-boolean v0, p0, Lo/emx;->u:Z

    if-eqz v0, :cond_0

    .line 317
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 319
    :cond_0
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 324
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/emx;->r:Landroid/graphics/Paint;

    .line 325
    iget-object v0, p0, Lo/emx;->r:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 326
    iget-object v0, p0, Lo/emx;->r:Landroid/graphics/Paint;

    const/16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 328
    iget-object v0, p0, Lo/emx;->r:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 329
    iget-object v0, p0, Lo/emx;->r:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 330
    iget-object v0, p0, Lo/emx;->r:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 333
    iget-object v0, p0, Lo/emx;->m:Landroid/graphics/Paint;

    const-string v1, "#FF1A1A1A"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 334
    iget-object v0, p0, Lo/emx;->m:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 335
    return-void

    :array_0
    .array-data 4
        0x40c00000    # 6.0f
        0x40c00000    # 6.0f
    .end array-data
.end method

.method private d(I)Z
    .locals 4

    .line 184
    const/4 v3, 0x1

    .line 185
    iget-boolean v0, p0, Lo/emx;->u:Z

    if-eqz v0, :cond_0

    .line 186
    const/4 v0, 0x1

    return v0

    .line 188
    :cond_0
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    rsub-int/lit8 v1, p1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/emx;->p:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-direct {p0}, Lo/emx;->a()F

    move-result v1

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr v1, v2

    div-float/2addr v0, v1

    const v1, 0x3eb33333    # 0.35f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 189
    const/4 v3, 0x0

    .line 192
    :cond_1
    return v3
.end method


# virtual methods
.method public b(Landroid/content/Context;IFFFZ)V
    .locals 0

    .line 338
    iput p2, p0, Lo/emx;->o:I

    .line 339
    iput p3, p0, Lo/emx;->p:F

    .line 340
    iput p4, p0, Lo/emx;->q:F

    .line 341
    iput p5, p0, Lo/emx;->s:F

    .line 343
    iput-boolean p6, p0, Lo/emx;->u:Z

    .line 344
    return-void
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 2

    .line 64
    iget-object v0, p0, Lo/emx;->y:Lo/mt;

    iget v1, p0, Lo/emx;->B:I

    invoke-virtual {p0, p1, v0, v1}, Lo/emx;->c(Landroid/graphics/Canvas;Lo/mt;I)V

    .line 65
    return-void
.end method

.method public b(Landroid/graphics/Canvas;Lo/nv;)V
    .locals 10

    .line 69
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 70
    const/4 v0, 0x2

    new-array v5, v0, [F

    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v5, v1

    .line 74
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 75
    const-string v0, "#1A000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 76
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 77
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 78
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 80
    new-instance v8, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v8, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 81
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 85
    new-instance v9, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v9, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 86
    const-string v0, "#FF7FBEFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 87
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 89
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 91
    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 92
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v6, v0

    .line 96
    :cond_0
    iget v0, p0, Lo/emx;->x:F

    iget v1, p0, Lo/emx;->p:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/emx;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 98
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 99
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 100
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 101
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 102
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 103
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_0

    .line 105
    :cond_1
    iget v0, p0, Lo/emx;->p:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 106
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 107
    iget v0, p0, Lo/emx;->p:F

    iget v1, p0, Lo/emx;->x:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 108
    iget v0, p0, Lo/emx;->p:F

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 112
    :cond_2
    :goto_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/emx;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 113
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 114
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 115
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 116
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 117
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 118
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 119
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_1

    .line 121
    :cond_3
    iget v0, p0, Lo/emx;->p:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 122
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 123
    iget v0, p0, Lo/emx;->p:F

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 126
    :goto_1
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/emx;->d(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 127
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 128
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 129
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 130
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 131
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 132
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 133
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_2

    .line 135
    :cond_4
    iget v0, p0, Lo/emx;->p:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 136
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 137
    iget v0, p0, Lo/emx;->p:F

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 140
    :goto_2
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/emx;->d(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 141
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 142
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 143
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 144
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 145
    invoke-direct {p0}, Lo/emx;->a()F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 146
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 147
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    goto :goto_3

    .line 149
    :cond_5
    iget v0, p0, Lo/emx;->p:F

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 150
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 151
    iget v0, p0, Lo/emx;->p:F

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 153
    :goto_3
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 154
    invoke-virtual {p2, v5}, Lo/nv;->e([F)V

    .line 155
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 156
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 157
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v5, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 158
    invoke-virtual {p1, v4, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 159
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 161
    invoke-direct {p0}, Lo/emx;->c()V

    .line 163
    iget-boolean v0, p0, Lo/emx;->u:Z

    if-nez v0, :cond_7

    iget v0, p0, Lo/emx;->p:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 164
    iget-object v0, p0, Lo/emx;->v:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 165
    iget-object v0, p0, Lo/emx;->v:[F

    iget v1, p0, Lo/emx;->p:F

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 166
    iget-object v0, p0, Lo/emx;->v:[F

    invoke-virtual {p2, v0}, Lo/nv;->e([F)V

    .line 167
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/emx;->t:Landroid/graphics/Path;

    .line 169
    iget-object v0, p0, Lo/emx;->v:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    .line 170
    iget-object v0, p0, Lo/emx;->t:Landroid/graphics/Path;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 171
    iget-object v0, p0, Lo/emx;->t:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_4

    .line 173
    :cond_6
    iget-object v0, p0, Lo/emx;->t:Landroid/graphics/Path;

    iget-object v1, p0, Lo/emx;->v:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 174
    iget-object v0, p0, Lo/emx;->t:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lo/emx;->v:[F

    const/4 v3, 0x1

    aget v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 177
    :goto_4
    iget-object v0, p0, Lo/emx;->r:Landroid/graphics/Paint;

    iget v1, p0, Lo/emx;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 178
    iget-object v0, p0, Lo/emx;->t:Landroid/graphics/Path;

    iget-object v1, p0, Lo/emx;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 179
    iget-object v0, p0, Lo/emx;->t:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 181
    :cond_7
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 351
    iput-boolean p1, p0, Lo/emx;->z:Z

    .line 352
    return-void
.end method

.method public b()Z
    .locals 1

    .line 347
    iget-boolean v0, p0, Lo/emx;->z:Z

    return v0
.end method

.method protected c(Landroid/graphics/Canvas;Lo/mt;I)V
    .locals 16

    .line 206
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_0

    .line 207
    return-void

    .line 210
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->e:Lo/mo;

    invoke-interface/range {p2 .. p2}, Lo/mt;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mo;->b(Lo/lp$b;)Lo/nv;

    move-result-object v7

    .line 211
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->b:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->b:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->c()F

    move-result v1

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->c:[Lo/lb;

    aget-object v8, v0, p3

    .line 216
    move/from16 v0, p3

    invoke-virtual {v8, v0}, Lo/lb;->e(I)V

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->e:Lo/mo;

    invoke-interface/range {p2 .. p2}, Lo/mt;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mo;->c(Lo/lp$b;)Z

    move-result v0

    invoke-virtual {v8, v0}, Lo/lb;->b(Z)V

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->e:Lo/mo;

    invoke-interface {v0}, Lo/mo;->getBarData()Lo/lo;

    move-result-object v0

    invoke-virtual {v0}, Lo/lo;->a()F

    move-result v0

    invoke-virtual {v8, v0}, Lo/lb;->d(F)V

    .line 220
    move-object/from16 v0, p2

    invoke-virtual {v8, v0}, Lo/lb;->e(Lo/mt;)V

    .line 221
    iget-object v0, v8, Lo/lb;->e:[F

    invoke-virtual {v7, v0}, Lo/nv;->e([F)V

    .line 223
    invoke-interface/range {p2 .. p2}, Lo/mt;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    .line 225
    :goto_0
    if-eqz v9, :cond_2

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->h:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 228
    :cond_2
    const/4 v10, 0x0

    .line 229
    iget-object v0, v8, Lo/lb;->e:[F

    array-length v0, v0

    if-lez v0, :cond_3

    .line 230
    iget-object v0, v8, Lo/lb;->e:[F

    const/4 v1, 0x1

    aget v10, v0, v1

    .line 232
    :cond_3
    const/4 v11, 0x1

    :goto_1
    invoke-virtual {v8}, Lo/lb;->a()I

    move-result v0

    if-ge v11, v0, :cond_5

    .line 233
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v11

    cmpg-float v0, v0, v10

    if-gez v0, :cond_4

    .line 234
    iget-object v0, v8, Lo/lb;->e:[F

    aget v10, v0, v11

    .line 232
    :cond_4
    add-int/lit8 v11, v11, 0x4

    goto :goto_1

    .line 239
    :cond_5
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/emx;->u:Z

    if-nez v0, :cond_7

    .line 240
    move-object/from16 v0, p0

    iget v0, v0, Lo/emx;->q:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/emx;->p:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 241
    move-object/from16 v0, p0

    iget v0, v0, Lo/emx;->q:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/elu;->a(II)I

    move-result v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/emx;->x:F

    goto :goto_2

    .line 243
    :cond_6
    move-object/from16 v0, p0

    iget v0, v0, Lo/emx;->p:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/elu;->a(II)I

    move-result v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/emx;->x:F

    goto :goto_2

    .line 246
    :cond_7
    move-object/from16 v0, p0

    iget v0, v0, Lo/emx;->q:F

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v10

    invoke-virtual/range {p0 .. p0}, Lo/emx;->d()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    add-float/2addr v1, v2

    mul-float/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v10

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/emx;->x:F

    .line 248
    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v7}, Lo/emx;->b(Landroid/graphics/Canvas;Lo/nv;)V

    .line 249
    const/4 v11, 0x0

    .line 250
    iget-object v0, v8, Lo/lb;->e:[F

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_8

    .line 251
    iget-object v0, v8, Lo/lb;->e:[F

    const/4 v1, 0x2

    aget v0, v0, v1

    iget-object v1, v8, Lo/lb;->e:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    sub-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/emx;->s:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 253
    :cond_8
    invoke-virtual {v8}, Lo/lb;->a()I

    move-result v0

    add-int/lit8 v12, v0, -0x4

    .line 254
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 255
    const/4 v12, 0x0

    .line 257
    :cond_9
    const/4 v13, 0x0

    :goto_3
    invoke-virtual {v8}, Lo/lb;->a()I

    move-result v0

    if-ge v13, v0, :cond_12

    .line 259
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->l:Lo/oa;

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v13, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-nez v0, :cond_a

    .line 260
    goto/16 :goto_6

    .line 262
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->l:Lo/oa;

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v13

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_b

    .line 263
    goto/16 :goto_7

    .line 265
    :cond_b
    if-nez v9, :cond_c

    .line 268
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->h:Landroid/graphics/Paint;

    div-int/lit8 v1, v13, 0x4

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Lo/mt;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 270
    :cond_c
    iget-object v0, v8, Lo/lb;->e:[F

    add-int/lit8 v1, v13, 0x1

    aget v0, v0, v1

    cmpl-float v0, v10, v0

    if-nez v0, :cond_f

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/emx;->w:Z

    if-eqz v0, :cond_f

    .line 272
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->m:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/emx;->q:F

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v14

    .line 273
    invoke-virtual/range {p0 .. p0}, Lo/emx;->b()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 274
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 275
    move-object/from16 v0, p0

    iget v0, v0, Lo/emx;->q:F

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v13

    add-float/2addr v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v14, v2

    sub-float/2addr v1, v2

    move-object/from16 v2, p0

    iget v2, v2, Lo/emx;->s:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v13, 0x1

    aget v2, v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    sub-float/2addr v2, v3

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/emx;->m:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 277
    :cond_d
    move-object/from16 v0, p0

    iget v0, v0, Lo/emx;->q:F

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v13

    add-float/2addr v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v14, v2

    sub-float/2addr v1, v2

    move-object/from16 v2, p0

    iget v2, v2, Lo/emx;->s:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v2}, Lo/oc;->b(F)F

    move-result v2

    add-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v13, 0x1

    aget v2, v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    sub-float/2addr v2, v3

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/emx;->m:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 281
    :cond_e
    move-object/from16 v0, p0

    iget v0, v0, Lo/emx;->q:F

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/emx;->a(F)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v13

    add-float/2addr v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v14, v2

    sub-float/2addr v1, v2

    move-object/from16 v2, p0

    iget v2, v2, Lo/emx;->s:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v13, 0x1

    aget v2, v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v3}, Lo/oc;->b(F)F

    move-result v3

    sub-float/2addr v2, v3

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/emx;->m:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 283
    :goto_4
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/emx;->w:Z

    .line 287
    :cond_f
    if-ne v13, v12, :cond_10

    .line 288
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/emx;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_5

    .line 290
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->h:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, Lo/mt;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 294
    :goto_5
    const/4 v0, 0x2

    new-array v14, v0, [F

    .line 295
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v14, v1

    .line 296
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v14, v1

    .line 297
    invoke-virtual {v7, v14}, Lo/nv;->e([F)V

    .line 299
    const/4 v0, 0x1

    aget v0, v14, v0

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v13, 0x1

    aget v1, v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v13, 0x2

    aget v2, v2, v3

    iget-object v3, v8, Lo/lb;->e:[F

    aget v3, v3, v13

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v11

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_11

    .line 300
    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/RectF;

    iget-object v2, v8, Lo/lb;->e:[F

    aget v2, v2, v13

    add-float/2addr v2, v11

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v13, 0x1

    aget v3, v3, v4

    iget-object v4, v8, Lo/lb;->e:[F

    add-int/lit8 v5, v13, 0x2

    aget v4, v4, v5

    sub-float/2addr v4, v11

    iget-object v5, v8, Lo/lb;->e:[F

    add-int/lit8 v6, v13, 0x1

    aget v5, v5, v6

    move-object/from16 v6, p0

    iget v6, v6, Lo/emx;->s:F

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v2, p0

    iget-object v5, v2, Lo/emx;->h:Landroid/graphics/Paint;

    const/high16 v2, 0x43340000    # 180.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 302
    move-object/from16 v0, p1

    iget-object v1, v8, Lo/lb;->e:[F

    aget v1, v1, v13

    add-float/2addr v1, v11

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v13, 0x1

    aget v2, v2, v3

    move-object/from16 v3, p0

    iget v3, v3, Lo/emx;->s:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v2, v3

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v13, 0x2

    aget v3, v3, v4

    sub-float/2addr v3, v11

    iget-object v4, v8, Lo/lb;->e:[F

    add-int/lit8 v5, v13, 0x3

    aget v4, v4, v5

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/emx;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_6

    .line 305
    :cond_11
    new-instance v15, Landroid/graphics/Path;

    invoke-direct {v15}, Landroid/graphics/Path;-><init>()V

    .line 306
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v13

    add-float/2addr v0, v11

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v13, 0x3

    aget v1, v1, v2

    invoke-virtual {v15, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 307
    iget-object v0, v8, Lo/lb;->e:[F

    aget v0, v0, v13

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v13, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, v8, Lo/lb;->e:[F

    add-int/lit8 v2, v13, 0x1

    aget v1, v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v13, 0x3

    aget v2, v2, v3

    sub-float/2addr v1, v2

    iget-object v2, v8, Lo/lb;->e:[F

    add-int/lit8 v3, v13, 0x2

    aget v2, v2, v3

    sub-float/2addr v2, v11

    iget-object v3, v8, Lo/lb;->e:[F

    add-int/lit8 v4, v13, 0x3

    aget v3, v3, v4

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 308
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/emx;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual {v1, v15, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 257
    :goto_6
    add-int/lit8 v13, v13, 0x4

    goto/16 :goto_3

    .line 312
    :cond_12
    :goto_7
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/emx;->w:Z

    .line 313
    return-void
.end method

.method public d()I
    .locals 4

    .line 49
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 50
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 51
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    .line 52
    iget v0, v3, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method protected d(Landroid/graphics/Canvas;Lo/mt;I)V
    .locals 0

    .line 200
    iput-object p2, p0, Lo/emx;->y:Lo/mt;

    .line 201
    iput p3, p0, Lo/emx;->B:I

    .line 202
    return-void
.end method
