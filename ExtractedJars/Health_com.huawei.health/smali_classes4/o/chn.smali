.class public Lo/chn;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final e:I


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;>;"
        }
    .end annotation
.end field

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/content/Context;

.field private d:Landroid/graphics/Paint;

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:Landroid/graphics/Paint;

.field private q:Landroid/graphics/Paint;

.field private r:Landroid/graphics/Paint;

.field private s:Landroid/graphics/Paint;

.field private t:F

.field private u:Z

.field private v:I

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-string v0, "#fb6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/chn;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 106
    iput-object p1, p0, Lo/chn;->c:Landroid/content/Context;

    .line 107
    invoke-direct {p0}, Lo/chn;->a()V

    .line 108
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    iput-object p1, p0, Lo/chn;->c:Landroid/content/Context;

    .line 57
    invoke-direct {p0}, Lo/chn;->a()V

    .line 58
    return-void
.end method

.method private a()V
    .locals 4

    .line 61
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/chn;->d(IF)F

    move-result v0

    iput v0, p0, Lo/chn;->f:F

    .line 62
    const/4 v0, 0x1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/chn;->d(IF)F

    move-result v0

    iput v0, p0, Lo/chn;->h:F

    .line 63
    const/4 v0, 0x1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/chn;->d(IF)F

    move-result v0

    iput v0, p0, Lo/chn;->g:F

    .line 64
    const/4 v0, 0x1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/chn;->d(IF)F

    move-result v0

    iput v0, p0, Lo/chn;->o:F

    .line 65
    const/4 v0, 0x1

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/chn;->d(IF)F

    move-result v0

    iput v0, p0, Lo/chn;->k:F

    .line 66
    iget-object v0, p0, Lo/chn;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/chn;->u:Z

    .line 68
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    .line 69
    iget-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 70
    iget-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 71
    iget-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->q:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 72
    iget-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/chn;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 73
    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v3, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 74
    iget-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 76
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chn;->b:Landroid/graphics/Paint;

    .line 77
    iget-object v0, p0, Lo/chn;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 78
    iget-object v0, p0, Lo/chn;->b:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 79
    iget-object v0, p0, Lo/chn;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/chn;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 81
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chn;->r:Landroid/graphics/Paint;

    .line 82
    iget-object v0, p0, Lo/chn;->r:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 83
    iget-object v0, p0, Lo/chn;->r:Landroid/graphics/Paint;

    sget v1, Lo/chn;->e:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    iget-object v0, p0, Lo/chn;->r:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v1, v2}, Lo/chn;->d(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 85
    iget-object v0, p0, Lo/chn;->r:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chn;->q:Landroid/graphics/Paint;

    .line 88
    iget-object v0, p0, Lo/chn;->q:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 89
    iget-object v0, p0, Lo/chn;->q:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->q:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 90
    iget-object v0, p0, Lo/chn;->q:Landroid/graphics/Paint;

    iget v1, p0, Lo/chn;->k:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 92
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chn;->s:Landroid/graphics/Paint;

    .line 93
    iget-object v0, p0, Lo/chn;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 94
    iget-object v0, p0, Lo/chn;->s:Landroid/graphics/Paint;

    sget v1, Lo/chn;->e:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 95
    iget-object v0, p0, Lo/chn;->s:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 97
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chn;->d:Landroid/graphics/Paint;

    .line 98
    iget-object v0, p0, Lo/chn;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 99
    iget-object v0, p0, Lo/chn;->d:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->s:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 100
    iget-object v0, p0, Lo/chn;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/chn;->k:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 102
    return-void

    nop

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 9

    .line 184
    iget v0, p0, Lo/chn;->n:F

    iget v1, p0, Lo/chn;->o:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v4, v0, v1

    .line 185
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 186
    const/4 v0, 0x0

    invoke-virtual {v5, v0, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 187
    iget v0, p0, Lo/chn;->l:F

    invoke-virtual {v5, v0, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 188
    iget-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 189
    iget v0, p0, Lo/chn;->x:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 190
    iget v0, p0, Lo/chn;->x:F

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 191
    iget-object v0, p0, Lo/chn;->q:Landroid/graphics/Paint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v7

    .line 193
    iget-boolean v0, p0, Lo/chn;->u:Z

    if-eqz v0, :cond_0

    .line 194
    iget v8, p0, Lo/chn;->h:F

    goto :goto_0

    .line 196
    :cond_0
    iget v0, p0, Lo/chn;->l:F

    iget v1, p0, Lo/chn;->h:F

    sub-float/2addr v0, v1

    sub-float v8, v0, v7

    .line 198
    :goto_0
    iget v0, p0, Lo/chn;->k:F

    add-float/2addr v0, v4

    iget v1, p0, Lo/chn;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/chn;->q:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v8, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 200
    :cond_1
    return-void
.end method

.method private a(Landroid/graphics/Canvas;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;Ljava/util/ArrayList<Landroid/graphics/PointF;>;)V"
        }
    .end annotation

    .line 159
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 160
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lo/chn;->h:F

    iget-object v3, p0, Lo/chn;->s:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_2

    .line 162
    :cond_0
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 163
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v8, v0, :cond_3

    .line 164
    invoke-virtual {p2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/graphics/PointF;

    .line 165
    if-nez v8, :cond_1

    .line 166
    iget v0, v9, Landroid/graphics/PointF;->x:F

    iget v1, v9, Landroid/graphics/PointF;->y:F

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_1

    .line 168
    :cond_1
    iget v0, v9, Landroid/graphics/PointF;->x:F

    iget v1, v9, Landroid/graphics/PointF;->y:F

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 171
    :goto_1
    if-nez v8, :cond_2

    .line 172
    iget v0, v9, Landroid/graphics/PointF;->x:F

    iget v1, v9, Landroid/graphics/PointF;->y:F

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 174
    :cond_2
    add-int/lit8 v0, v8, 0x1

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/graphics/PointF;

    .line 175
    iget v0, v9, Landroid/graphics/PointF;->x:F

    iget v1, v10, Landroid/graphics/PointF;->x:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 176
    move-object v0, v7

    move v1, v11

    iget v2, v9, Landroid/graphics/PointF;->y:F

    move v3, v11

    iget v4, v10, Landroid/graphics/PointF;->y:F

    iget v5, v10, Landroid/graphics/PointF;->x:F

    iget v6, v10, Landroid/graphics/PointF;->y:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 163
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 179
    :cond_3
    iget-object v0, p0, Lo/chn;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v7, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 181
    :goto_2
    return-void
.end method

.method private b(F)F
    .locals 4

    .line 204
    iget v0, p0, Lo/chn;->z:F

    iget v1, p0, Lo/chn;->y:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 205
    iget v0, p0, Lo/chn;->n:F

    iget v1, p0, Lo/chn;->o:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0

    .line 207
    :cond_0
    iget v0, p0, Lo/chn;->o:F

    iget v1, p0, Lo/chn;->z:F

    sub-float/2addr v1, p1

    iget v2, p0, Lo/chn;->z:F

    iget v3, p0, Lo/chn;->y:F

    sub-float/2addr v2, v3

    div-float/2addr v1, v2

    iget v2, p0, Lo/chn;->n:F

    iget v3, p0, Lo/chn;->o:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 11

    .line 212
    iget-object v0, p0, Lo/chn;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chn;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/chn;->v:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 213
    :cond_0
    return-void

    .line 215
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 216
    iget v0, p0, Lo/chn;->v:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_3

    .line 217
    iget v0, p0, Lo/chn;->v:I

    div-int/lit8 v5, v0, 0x4

    .line 218
    const/4 v0, 0x1

    if-eq v5, v0, :cond_2

    .line 219
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    mul-int/lit8 v0, v5, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    mul-int/lit8 v0, v5, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    iget v0, p0, Lo/chn;->v:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    goto :goto_1

    :cond_3
    iget v0, p0, Lo/chn;->v:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_5

    .line 226
    const/4 v5, 0x1

    :goto_0
    iget v0, p0, Lo/chn;->v:I

    if-gt v5, v0, :cond_4

    .line 227
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    goto :goto_1

    .line 230
    :cond_5
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    :goto_1
    iget v0, p0, Lo/chn;->m:F

    const/4 v1, 0x1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Lo/chn;->d(IF)F

    move-result v1

    add-float v5, v0, v1

    .line 237
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 238
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 239
    iget-object v0, p0, Lo/chn;->q:Landroid/graphics/Paint;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v9, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v10

    .line 240
    iget-boolean v0, p0, Lo/chn;->u:Z

    if-eqz v0, :cond_6

    .line 241
    iget v0, p0, Lo/chn;->l:F

    iget v1, p0, Lo/chn;->h:F

    sub-float/2addr v0, v1

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chn;->i:F

    mul-float/2addr v1, v2

    sub-float v6, v0, v1

    goto :goto_3

    .line 243
    :cond_6
    iget v0, p0, Lo/chn;->h:F

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chn;->i:F

    mul-float/2addr v1, v2

    add-float v6, v0, v1

    .line 245
    :goto_3
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v10, v0

    sub-float/2addr v6, v0

    .line 246
    const/4 v0, 0x0

    cmpg-float v0, v6, v0

    if-gez v0, :cond_7

    .line 247
    const/4 v6, 0x0

    goto :goto_4

    .line 248
    :cond_7
    add-float v0, v6, v10

    iget v1, p0, Lo/chn;->l:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_8

    .line 249
    iget v0, p0, Lo/chn;->l:F

    sub-float v6, v0, v10

    .line 251
    :cond_8
    :goto_4
    iget v0, p0, Lo/chn;->k:F

    add-float/2addr v0, v5

    iget-object v1, p0, Lo/chn;->q:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v6, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 252
    goto/16 :goto_2

    .line 253
    :cond_9
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 6

    .line 275
    move-object v0, p1

    iget v2, p0, Lo/chn;->g:F

    iget v3, p0, Lo/chn;->l:F

    iget v4, p0, Lo/chn;->g:F

    iget-object v5, p0, Lo/chn;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 276
    move-object v0, p1

    iget v2, p0, Lo/chn;->m:F

    iget v3, p0, Lo/chn;->l:F

    iget v4, p0, Lo/chn;->m:F

    iget-object v5, p0, Lo/chn;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 277
    return-void
.end method

.method private static d(IF)F
    .locals 2

    .line 287
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    .line 288
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 129
    iget-object v0, p0, Lo/chn;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chn;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/chn;->v:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 130
    :cond_0
    return-void

    .line 134
    :cond_1
    iget v0, p0, Lo/chn;->v:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_2

    .line 135
    iget v0, p0, Lo/chn;->l:F

    iget v1, p0, Lo/chn;->h:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chn;->v:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/chn;->i:F

    goto :goto_0

    .line 137
    :cond_2
    iget v0, p0, Lo/chn;->l:F

    iget v1, p0, Lo/chn;->h:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/chn;->i:F

    .line 139
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 140
    const/4 v6, 0x0

    :goto_1
    iget-object v0, p0, Lo/chn;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 141
    iget-object v0, p0, Lo/chn;->a:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x989680

    div-int v7, v0, v1

    .line 142
    iget-object v0, p0, Lo/chn;->a:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v8

    .line 143
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-nez v0, :cond_3

    .line 144
    goto :goto_3

    .line 146
    :cond_3
    invoke-direct {p0, v8}, Lo/chn;->e(F)F

    move-result v8

    .line 147
    iget-boolean v0, p0, Lo/chn;->u:Z

    if-eqz v0, :cond_4

    .line 148
    iget v0, p0, Lo/chn;->l:F

    iget v1, p0, Lo/chn;->h:F

    sub-float/2addr v0, v1

    add-int/lit8 v1, v7, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chn;->i:F

    mul-float/2addr v1, v2

    sub-float v3, v0, v1

    goto :goto_2

    .line 150
    :cond_4
    iget v0, p0, Lo/chn;->h:F

    add-int/lit8 v1, v7, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chn;->i:F

    mul-float/2addr v1, v2

    add-float v3, v0, v1

    .line 152
    :goto_2
    invoke-direct {p0, v8}, Lo/chn;->b(F)F

    move-result v4

    .line 153
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    .line 155
    :cond_5
    invoke-direct {p0, p1, v5}, Lo/chn;->a(Landroid/graphics/Canvas;Ljava/util/ArrayList;)V

    .line 156
    return-void
.end method

.method private e(F)F
    .locals 1

    .line 292
    const/high16 v0, 0x45610000    # 3600.0f

    div-float/2addr v0, p1

    return v0
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 280
    iget-object v0, p0, Lo/chn;->q:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 281
    iget-object v0, p0, Lo/chn;->b:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 282
    iget-object v0, p0, Lo/chn;->p:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 283
    iget-object v0, p0, Lo/chn;->d:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 284
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 112
    invoke-direct {p0, p1}, Lo/chn;->c(Landroid/graphics/Canvas;)V

    .line 113
    invoke-direct {p0, p1}, Lo/chn;->a(Landroid/graphics/Canvas;)V

    .line 114
    invoke-direct {p0, p1}, Lo/chn;->d(Landroid/graphics/Canvas;)V

    .line 115
    invoke-direct {p0, p1}, Lo/chn;->b(Landroid/graphics/Canvas;)V

    .line 116
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 120
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 121
    invoke-virtual {p0}, Lo/chn;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/chn;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chn;->l:F

    .line 122
    invoke-virtual {p0}, Lo/chn;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/chn;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chn;->t:F

    .line 123
    iget v0, p0, Lo/chn;->t:F

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Lo/chn;->d(IF)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chn;->m:F

    .line 124
    iget v0, p0, Lo/chn;->t:F

    const/4 v1, 0x1

    const/high16 v2, 0x41d80000    # 27.0f

    invoke-static {v1, v2}, Lo/chn;->d(IF)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chn;->n:F

    .line 125
    return-void
.end method
