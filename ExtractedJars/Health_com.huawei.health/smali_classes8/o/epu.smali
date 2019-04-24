.class public Lo/epu;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Landroid/content/Context;

.field private c:F

.field private d:F

.field private e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/RectF;

.field private g:F

.field private h:F

.field private i:F

.field private k:F

.field private l:F

.field private m:Landroid/graphics/Paint;

.field private n:F

.field private o:Landroid/graphics/Paint;

.field private p:Landroid/graphics/RectF;

.field private q:F

.field private r:Landroid/graphics/Paint;

.field private s:F

.field private t:F

.field private u:F

.field private x:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/epu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/epu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    invoke-virtual {p0}, Lo/epu;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epu;->d:F

    .line 21
    invoke-virtual {p0}, Lo/epu;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42460000    # 49.5f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epu;->c:F

    .line 22
    invoke-virtual {p0}, Lo/epu;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x40a9999a    # 5.3f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epu;->a:F

    .line 36
    invoke-virtual {p0}, Lo/epu;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epu;->n:F

    .line 37
    invoke-virtual {p0}, Lo/epu;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3f666666    # 0.9f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epu;->t:F

    .line 39
    invoke-virtual {p0}, Lo/epu;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epu;->q:F

    .line 57
    iput-object p1, p0, Lo/epu;->b:Landroid/content/Context;

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/epu;->u:F

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/epu;->s:F

    .line 60
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/epu;->setLayerType(ILandroid/graphics/Paint;)V

    .line 62
    invoke-direct {p0}, Lo/epu;->b()V

    .line 64
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 12

    .line 214
    iget v0, p0, Lo/epu;->u:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 215
    return-void

    .line 217
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 218
    iget v0, p0, Lo/epu;->u:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, v0, v1

    .line 219
    iget v0, p0, Lo/epu;->g:F

    iget v1, p0, Lo/epu;->i:F

    invoke-virtual {p1, v4, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 220
    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    mul-double/2addr v0, v2

    double-to-float v5, v0

    .line 221
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v6

    .line 223
    iget v0, p0, Lo/epu;->g:F

    int-to-float v1, v6

    sub-float v7, v0, v1

    .line 224
    iget v0, p0, Lo/epu;->i:F

    iget v1, p0, Lo/epu;->c:F

    sub-float/2addr v0, v1

    int-to-float v1, v6

    sub-float v8, v0, v1

    .line 226
    iget v0, p0, Lo/epu;->g:F

    int-to-float v1, v6

    sub-float v9, v0, v1

    .line 227
    iget v0, p0, Lo/epu;->i:F

    iget v1, p0, Lo/epu;->c:F

    sub-float/2addr v0, v1

    int-to-float v1, v6

    add-float v10, v0, v1

    .line 228
    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    .line 229
    invoke-virtual {v11, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 230
    iget v0, p0, Lo/epu;->g:F

    iget v1, p0, Lo/epu;->i:F

    iget v2, p0, Lo/epu;->c:F

    sub-float/2addr v1, v2

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 231
    invoke-virtual {v11, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 232
    iget-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v11, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 233
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 236
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FFFLandroid/graphics/RectF;)V
    .locals 7

    .line 199
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p4, v0

    if-ltz v0, :cond_0

    .line 200
    iget v0, p0, Lo/epu;->c:F

    iget-object v1, p0, Lo/epu;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 202
    invoke-direct {p0, p4}, Lo/epu;->b(F)F

    move-result v6

    .line 203
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 204
    const/high16 v0, 0x43b40000    # 360.0f

    mul-float/2addr v0, v6

    invoke-virtual {p1, v0, p2, p3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 205
    iget v0, p0, Lo/epu;->c:F

    sub-float v0, p3, v0

    iget v1, p0, Lo/epu;->a:F

    iget-object v2, p0, Lo/epu;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 206
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 207
    goto :goto_0

    .line 208
    :cond_0
    move-object v0, p1

    move-object v1, p5

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v3, v2, p4

    iget-object v5, p0, Lo/epu;->m:Landroid/graphics/Paint;

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 210
    :goto_0
    return-void
.end method

.method private b(F)F
    .locals 4

    .line 282
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v2, v0

    .line 283
    sub-float v3, p1, v2

    .line 284
    return v3
.end method

.method private b()V
    .locals 5

    .line 69
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epu;->e:Landroid/graphics/Paint;

    .line 70
    iget-object v0, p0, Lo/epu;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 71
    iget-object v0, p0, Lo/epu;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    iget-object v0, p0, Lo/epu;->e:Landroid/graphics/Paint;

    const v1, 0x33ffffff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    iget-object v0, p0, Lo/epu;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/epu;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 75
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epu;->m:Landroid/graphics/Paint;

    .line 76
    iget-object v0, p0, Lo/epu;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    iget-object v0, p0, Lo/epu;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 78
    iget-object v0, p0, Lo/epu;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 79
    iget-object v0, p0, Lo/epu;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 80
    iget-object v0, p0, Lo/epu;->m:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    iget-object v0, p0, Lo/epu;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/epu;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 84
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epu;->x:Landroid/graphics/Paint;

    .line 85
    iget-object v0, p0, Lo/epu;->x:Landroid/graphics/Paint;

    iget v1, p0, Lo/epu;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 86
    iget-object v0, p0, Lo/epu;->x:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    iget-object v0, p0, Lo/epu;->x:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 88
    iget-object v0, p0, Lo/epu;->x:Landroid/graphics/Paint;

    const/16 v1, 0xb4

    const/16 v2, 0xff

    const/16 v3, 0x78

    const/16 v4, 0x1b

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/high16 v2, 0x40b00000    # 5.5f

    const/high16 v3, 0x41100000    # 9.0f

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 90
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epu;->o:Landroid/graphics/Paint;

    .line 91
    iget-object v0, p0, Lo/epu;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 92
    iget-object v0, p0, Lo/epu;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/epu;->t:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 94
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    .line 95
    iget-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 96
    iget-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 97
    iget-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 98
    iget-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 99
    iget-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    iget v1, p0, Lo/epu;->q:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 102
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 4

    .line 239
    iget v0, p0, Lo/epu;->g:F

    iget v1, p0, Lo/epu;->i:F

    iget v2, p0, Lo/epu;->c:F

    iget-object v3, p0, Lo/epu;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 240
    iget v0, p0, Lo/epu;->k:F

    iget v1, p0, Lo/epu;->l:F

    iget v2, p0, Lo/epu;->c:F

    iget-object v3, p0, Lo/epu;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 241
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 6

    .line 188
    const-string v0, "StepView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawCircle l "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/epu;->u:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " r "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/epu;->s:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/epu;->k:F

    iget v3, p0, Lo/epu;->l:F

    iget v4, p0, Lo/epu;->s:F

    iget-object v5, p0, Lo/epu;->p:Landroid/graphics/RectF;

    invoke-direct/range {v0 .. v5}, Lo/epu;->a(Landroid/graphics/Canvas;FFFLandroid/graphics/RectF;)V

    .line 194
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/epu;->g:F

    iget v3, p0, Lo/epu;->i:F

    iget v4, p0, Lo/epu;->u:F

    iget-object v5, p0, Lo/epu;->f:Landroid/graphics/RectF;

    invoke-direct/range {v0 .. v5}, Lo/epu;->a(Landroid/graphics/Canvas;FFFLandroid/graphics/RectF;)V

    .line 196
    return-void
.end method

.method private c(Landroid/graphics/Canvas;FFF)V
    .locals 5

    .line 161
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x1e

    if-ge v3, v0, :cond_3

    .line 162
    rem-int/lit8 v0, v3, 0x5

    if-nez v0, :cond_1

    .line 163
    int-to-float v0, v3

    const/high16 v1, 0x41400000    # 12.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    div-float v4, v0, v1

    .line 164
    const v0, 0x3d088889

    add-float/2addr v0, p2

    cmpg-float v0, v4, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    .line 165
    iget-object v0, p0, Lo/epu;->o:Landroid/graphics/Paint;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 167
    :cond_0
    iget-object v0, p0, Lo/epu;->o:Landroid/graphics/Paint;

    const v1, -0x40000001    # -1.9999999f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 169
    :goto_1
    iget v0, p0, Lo/epu;->c:F

    sub-float v0, p4, v0

    iget v1, p0, Lo/epu;->n:F

    iget-object v2, p0, Lo/epu;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 171
    goto :goto_3

    .line 172
    :cond_1
    int-to-float v0, v3

    const/high16 v1, 0x41400000    # 12.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    div-float v4, v0, v1

    .line 173
    const v0, 0x3c7a4fa5

    add-float/2addr v0, p2

    cmpg-float v0, v4, v0

    if-gtz v0, :cond_2

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_2

    .line 174
    iget-object v0, p0, Lo/epu;->o:Landroid/graphics/Paint;

    const v1, -0x12031

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 176
    :cond_2
    iget-object v0, p0, Lo/epu;->o:Landroid/graphics/Paint;

    const v1, 0x33ffffff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 178
    :goto_2
    iget v0, p0, Lo/epu;->c:F

    sub-float v0, p4, v0

    iget v1, p0, Lo/epu;->t:F

    iget-object v2, p0, Lo/epu;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 181
    :goto_3
    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {p1, v0, p3, p4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 161
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 183
    :cond_3
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 12

    .line 139
    iget v0, p0, Lo/epu;->s:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 140
    return-void

    .line 142
    :cond_0
    iget v0, p0, Lo/epu;->s:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, v0, v1

    .line 143
    iget v0, p0, Lo/epu;->k:F

    iget v1, p0, Lo/epu;->l:F

    invoke-virtual {p1, v4, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 144
    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    mul-double/2addr v0, v2

    double-to-float v5, v0

    .line 145
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v6

    .line 147
    iget v0, p0, Lo/epu;->k:F

    int-to-float v1, v6

    sub-float v7, v0, v1

    .line 148
    iget v0, p0, Lo/epu;->l:F

    iget v1, p0, Lo/epu;->c:F

    sub-float/2addr v0, v1

    int-to-float v1, v6

    sub-float v8, v0, v1

    .line 150
    iget v0, p0, Lo/epu;->k:F

    int-to-float v1, v6

    sub-float v9, v0, v1

    .line 151
    iget v0, p0, Lo/epu;->l:F

    iget v1, p0, Lo/epu;->c:F

    sub-float/2addr v0, v1

    int-to-float v1, v6

    add-float v10, v0, v1

    .line 152
    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    .line 153
    invoke-virtual {v11, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 154
    iget v0, p0, Lo/epu;->k:F

    iget v1, p0, Lo/epu;->l:F

    iget v2, p0, Lo/epu;->c:F

    sub-float/2addr v1, v2

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 155
    invoke-virtual {v11, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 156
    iget-object v0, p0, Lo/epu;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v11, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 158
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 122
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 124
    invoke-direct {p0, p1}, Lo/epu;->b(Landroid/graphics/Canvas;)V

    .line 126
    invoke-direct {p0, p1}, Lo/epu;->c(Landroid/graphics/Canvas;)V

    .line 128
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    iget v0, p0, Lo/epu;->u:F

    iget v1, p0, Lo/epu;->g:F

    iget v2, p0, Lo/epu;->i:F

    invoke-direct {p0, p1, v0, v1, v2}, Lo/epu;->c(Landroid/graphics/Canvas;FFF)V

    goto :goto_0

    .line 131
    :cond_0
    iget v0, p0, Lo/epu;->s:F

    iget v1, p0, Lo/epu;->k:F

    iget v2, p0, Lo/epu;->l:F

    invoke-direct {p0, p1, v0, v1, v2}, Lo/epu;->c(Landroid/graphics/Canvas;FFF)V

    .line 133
    :goto_0
    invoke-direct {p0, p1}, Lo/epu;->a(Landroid/graphics/Canvas;)V

    .line 134
    invoke-direct {p0, p1}, Lo/epu;->e(Landroid/graphics/Canvas;)V

    .line 136
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    .line 106
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 107
    int-to-float v0, p1

    iput v0, p0, Lo/epu;->h:F

    .line 109
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    const/high16 v1, 0x42460000    # 49.5f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo/epu;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/epu;->g:F

    .line 110
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    const/high16 v1, 0x42460000    # 49.5f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo/epu;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/epu;->i:F

    .line 111
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epu;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/epu;->d:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget v3, p0, Lo/epu;->g:F

    iget v4, p0, Lo/epu;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epu;->i:F

    iget v5, p0, Lo/epu;->c:F

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/epu;->f:Landroid/graphics/RectF;

    .line 114
    iget v0, p0, Lo/epu;->h:F

    iget-object v1, p0, Lo/epu;->b:Landroid/content/Context;

    const/high16 v2, 0x42460000    # 49.5f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lo/epu;->d:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lo/epu;->k:F

    .line 115
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    const/high16 v1, 0x42460000    # 49.5f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo/epu;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/epu;->l:F

    .line 116
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/epu;->k:F

    iget v2, p0, Lo/epu;->c:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/epu;->l:F

    iget v3, p0, Lo/epu;->c:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epu;->k:F

    iget v4, p0, Lo/epu;->c:F

    add-float/2addr v3, v4

    iget v4, p0, Lo/epu;->l:F

    iget v5, p0, Lo/epu;->c:F

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/epu;->p:Landroid/graphics/RectF;

    .line 118
    return-void
.end method

.method public setLeftProgress(F)V
    .locals 5

    .line 244
    const-string v0, "StepView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " left"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/epu;->u:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 246
    invoke-direct {p0, p1}, Lo/epu;->b(F)F

    move-result v4

    .line 247
    const/high16 v0, 0x3f800000    # 1.0f

    add-float p1, v0, v4

    .line 249
    :cond_0
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 250
    iget v0, p0, Lo/epu;->u:F

    invoke-virtual {p0, v0, p1}, Lo/epu;->setProgress(FF)V

    goto :goto_0

    .line 252
    :cond_1
    iget v0, p0, Lo/epu;->s:F

    invoke-virtual {p0, p1, v0}, Lo/epu;->setProgress(FF)V

    .line 255
    :goto_0
    return-void
.end method

.method public setProgress(FF)V
    .locals 4

    .line 274
    const-string v0, "StepView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setProgress "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iput p1, p0, Lo/epu;->u:F

    .line 276
    iput p2, p0, Lo/epu;->s:F

    .line 277
    invoke-virtual {p0}, Lo/epu;->postInvalidate()V

    .line 279
    return-void
.end method

.method public setRightProgress(F)V
    .locals 5

    .line 258
    const-string v0, "StepView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " right"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/epu;->s:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 260
    invoke-direct {p0, p1}, Lo/epu;->b(F)F

    move-result v4

    .line 261
    const/high16 v0, 0x3f800000    # 1.0f

    add-float p1, v0, v4

    .line 263
    :cond_0
    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/epu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    iget v0, p0, Lo/epu;->s:F

    invoke-virtual {p0, p1, v0}, Lo/epu;->setProgress(FF)V

    goto :goto_0

    .line 266
    :cond_1
    iget v0, p0, Lo/epu;->u:F

    invoke-virtual {p0, v0, p1}, Lo/epu;->setProgress(FF)V

    .line 268
    :goto_0
    return-void
.end method
