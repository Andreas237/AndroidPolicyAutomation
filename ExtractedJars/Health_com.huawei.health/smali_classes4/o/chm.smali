.class public Lo/chm;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final c:I

.field private static final d:I


# instance fields
.field private A:F

.field private D:F

.field private a:Landroid/content/Context;

.field private b:Landroid/graphics/Paint;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;>;"
        }
    .end annotation
.end field

.field private f:Landroid/graphics/Paint;

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Paint;

.field private i:Landroid/graphics/Paint;

.field private k:Landroid/graphics/Paint;

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:I

.field private t:F

.field private u:F

.field private v:F

.field private w:F

.field private x:F

.field private y:F

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-string v0, "#7ffb6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/chm;->d:I

    .line 28
    const-string v0, "#fb6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/chm;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 109
    iput-object p1, p0, Lo/chm;->a:Landroid/content/Context;

    .line 110
    invoke-direct {p0}, Lo/chm;->a()V

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 60
    iput-object p1, p0, Lo/chm;->a:Landroid/content/Context;

    .line 61
    invoke-direct {p0}, Lo/chm;->a()V

    .line 62
    return-void
.end method

.method private a()V
    .locals 5

    .line 65
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/chm;->c(IF)F

    move-result v3

    .line 66
    const/4 v0, 0x1

    const/high16 v1, 0x40200000    # 2.5f

    invoke-static {v0, v1}, Lo/chm;->c(IF)F

    move-result v0

    iput v0, p0, Lo/chm;->p:F

    .line 67
    const/4 v0, 0x1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/chm;->c(IF)F

    move-result v0

    iput v0, p0, Lo/chm;->l:F

    .line 68
    const/4 v0, 0x1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/chm;->c(IF)F

    move-result v0

    iput v0, p0, Lo/chm;->o:F

    .line 69
    const/4 v0, 0x1

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/chm;->c(IF)F

    move-result v0

    iput v0, p0, Lo/chm;->A:F

    .line 71
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chm;->b:Landroid/graphics/Paint;

    .line 72
    iget-object v0, p0, Lo/chm;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 73
    iget-object v0, p0, Lo/chm;->b:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    iget-object v0, p0, Lo/chm;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 76
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chm;->f:Landroid/graphics/Paint;

    .line 77
    iget-object v0, p0, Lo/chm;->f:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 78
    iget-object v0, p0, Lo/chm;->f:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->q:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 79
    iget-object v0, p0, Lo/chm;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 80
    new-instance v4, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v4, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 81
    iget-object v0, p0, Lo/chm;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 83
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chm;->h:Landroid/graphics/Paint;

    .line 84
    iget-object v0, p0, Lo/chm;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 85
    iget-object v0, p0, Lo/chm;->h:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->q:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    iget-object v0, p0, Lo/chm;->h:Landroid/graphics/Paint;

    iget v1, p0, Lo/chm;->A:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 88
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chm;->k:Landroid/graphics/Paint;

    .line 89
    iget-object v0, p0, Lo/chm;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 90
    iget-object v0, p0, Lo/chm;->k:Landroid/graphics/Paint;

    sget v1, Lo/chm;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 91
    iget-object v0, p0, Lo/chm;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Lo/chm;->c(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 92
    iget-object v0, p0, Lo/chm;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 94
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chm;->i:Landroid/graphics/Paint;

    .line 95
    iget-object v0, p0, Lo/chm;->i:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 96
    iget-object v0, p0, Lo/chm;->i:Landroid/graphics/Paint;

    sget v1, Lo/chm;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 97
    iget-object v0, p0, Lo/chm;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 99
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    .line 100
    iget-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 101
    iget-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->s:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 102
    iget-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    iget v1, p0, Lo/chm;->A:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 104
    iget-object v0, p0, Lo/chm;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/chm;->z:Z

    .line 105
    return-void

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 7

    .line 219
    iget v0, p0, Lo/chm;->m:F

    iget v1, p0, Lo/chm;->o:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v0, v1

    .line 220
    move-object v0, p1

    move v2, v6

    iget v3, p0, Lo/chm;->t:F

    move v4, v6

    iget-object v5, p0, Lo/chm;->f:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 221
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 12

    .line 224
    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/chm;->s:I

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 225
    :cond_0
    return-void

    .line 227
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 228
    iget v0, p0, Lo/chm;->s:I

    div-int/lit8 v5, v0, 0x4

    .line 229
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    mul-int/lit8 v0, v5, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    mul-int/lit8 v0, v5, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    iget v0, p0, Lo/chm;->s:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    iget v0, p0, Lo/chm;->n:F

    const/4 v1, 0x1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Lo/chm;->c(IF)F

    move-result v1

    add-float v7, v0, v1

    .line 236
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 237
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 238
    iget-object v0, p0, Lo/chm;->h:Landroid/graphics/Paint;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v11

    .line 239
    iget-boolean v0, p0, Lo/chm;->z:Z

    if-eqz v0, :cond_2

    .line 240
    iget v0, p0, Lo/chm;->t:F

    iget v1, p0, Lo/chm;->p:F

    sub-float/2addr v0, v1

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chm;->D:F

    mul-float/2addr v1, v2

    sub-float v6, v0, v1

    goto :goto_1

    .line 242
    :cond_2
    iget v0, p0, Lo/chm;->p:F

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chm;->D:F

    mul-float/2addr v1, v2

    add-float v6, v0, v1

    .line 244
    :goto_1
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v11, v0

    sub-float/2addr v6, v0

    .line 245
    const/4 v0, 0x0

    cmpg-float v0, v6, v0

    if-gez v0, :cond_3

    .line 246
    const/4 v6, 0x0

    goto :goto_2

    .line 247
    :cond_3
    add-float v0, v6, v11

    iget v1, p0, Lo/chm;->t:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 248
    iget v0, p0, Lo/chm;->t:F

    sub-float v6, v0, v11

    .line 250
    :cond_4
    :goto_2
    iget v0, p0, Lo/chm;->A:F

    add-float/2addr v0, v7

    iget-object v1, p0, Lo/chm;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v10, v6, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 251
    goto/16 :goto_0

    .line 252
    :cond_5
    return-void
.end method

.method private c(F)F
    .locals 5

    .line 208
    iget v0, p0, Lo/chm;->y:F

    iget v1, p0, Lo/chm;->x:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 209
    iget v0, p0, Lo/chm;->m:F

    iget v1, p0, Lo/chm;->o:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0

    .line 211
    :cond_0
    iget v0, p0, Lo/chm;->o:F

    iget v1, p0, Lo/chm;->p:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/chm;->y:F

    sub-float/2addr v1, p1

    iget v2, p0, Lo/chm;->y:F

    iget v3, p0, Lo/chm;->x:F

    sub-float/2addr v2, v3

    div-float/2addr v1, v2

    iget v2, p0, Lo/chm;->m:F

    iget v3, p0, Lo/chm;->o:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/chm;->p:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private static c(IF)F
    .locals 2

    .line 270
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    .line 271
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 12

    .line 162
    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/chm;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 163
    :cond_0
    return-void

    .line 165
    :cond_1
    const/4 v4, 0x0

    .line 168
    iget v0, p0, Lo/chm;->t:F

    iget v1, p0, Lo/chm;->p:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chm;->s:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/chm;->D:F

    .line 169
    const/4 v7, 0x0

    .line 170
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 171
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 172
    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x989680

    div-int v10, v0, v1

    .line 173
    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v11

    .line 174
    iget-boolean v0, p0, Lo/chm;->z:Z

    if-eqz v0, :cond_2

    .line 175
    iget v0, p0, Lo/chm;->t:F

    iget v1, p0, Lo/chm;->p:F

    sub-float/2addr v0, v1

    add-int/lit8 v1, v10, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chm;->D:F

    mul-float/2addr v1, v2

    sub-float v5, v0, v1

    goto :goto_1

    .line 177
    :cond_2
    iget v0, p0, Lo/chm;->p:F

    add-int/lit8 v1, v10, -0x1

    int-to-float v1, v1

    iget v2, p0, Lo/chm;->D:F

    mul-float/2addr v1, v2

    add-float v5, v0, v1

    .line 179
    :goto_1
    invoke-direct {p0, v11}, Lo/chm;->c(F)F

    move-result v6

    .line 180
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    iget v0, p0, Lo/chm;->x:F

    cmpl-float v0, v11, v0

    if-nez v0, :cond_3

    if-nez v4, :cond_3

    .line 182
    const/4 v4, 0x1

    .line 183
    iput v5, p0, Lo/chm;->u:F

    .line 184
    iput v6, p0, Lo/chm;->q:F

    .line 186
    :cond_3
    cmpl-float v0, v11, v7

    if-lez v0, :cond_4

    .line 187
    move v7, v11

    .line 188
    iput v5, p0, Lo/chm;->w:F

    .line 189
    iput v6, p0, Lo/chm;->v:F

    .line 171
    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 192
    :cond_5
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 193
    const/4 v10, 0x0

    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v10, v0, :cond_7

    .line 194
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/graphics/PointF;

    .line 195
    if-nez v10, :cond_6

    .line 196
    iget v0, v11, Landroid/graphics/PointF;->x:F

    iget v1, v11, Landroid/graphics/PointF;->y:F

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_3

    .line 198
    :cond_6
    iget v0, v11, Landroid/graphics/PointF;->x:F

    iget v1, v11, Landroid/graphics/PointF;->y:F

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 193
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 201
    :cond_7
    iget-object v0, p0, Lo/chm;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 202
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/graphics/PointF;

    .line 203
    iget v0, v11, Landroid/graphics/PointF;->x:F

    iget v1, v11, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lo/chm;->p:F

    iget-object v3, p0, Lo/chm;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 204
    goto :goto_4

    .line 205
    :cond_8
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 132
    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chm;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    :cond_0
    return-void

    .line 135
    :cond_1
    iget v0, p0, Lo/chm;->x:F

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v3

    .line 136
    iget-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v4

    .line 137
    iget v0, p0, Lo/chm;->y:F

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v5

    .line 138
    iget-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v6

    .line 141
    iget v0, p0, Lo/chm;->u:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 142
    const/4 v7, 0x0

    goto :goto_0

    .line 143
    :cond_2
    iget v0, p0, Lo/chm;->u:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/chm;->t:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 144
    iget v0, p0, Lo/chm;->t:F

    sub-float v7, v0, v4

    goto :goto_0

    .line 146
    :cond_3
    iget v0, p0, Lo/chm;->u:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    sub-float v7, v0, v1

    .line 148
    :goto_0
    iget v0, p0, Lo/chm;->q:F

    iget v1, p0, Lo/chm;->p:F

    add-float v8, v0, v1

    .line 149
    iget v0, p0, Lo/chm;->A:F

    add-float/2addr v0, v8

    iget-object v1, p0, Lo/chm;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v7, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 150
    iget v0, p0, Lo/chm;->w:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 151
    const/4 v7, 0x0

    goto :goto_1

    .line 152
    :cond_4
    iget v0, p0, Lo/chm;->w:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/chm;->t:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 153
    iget v0, p0, Lo/chm;->t:F

    sub-float v7, v0, v6

    goto :goto_1

    .line 155
    :cond_5
    iget v0, p0, Lo/chm;->w:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float v7, v0, v1

    .line 157
    :goto_1
    iget v0, p0, Lo/chm;->v:F

    iget v1, p0, Lo/chm;->p:F

    sub-float/2addr v0, v1

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lo/chm;->c(IF)F

    move-result v1

    sub-float v8, v0, v1

    .line 158
    iget-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v7, v8, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 159
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 6

    .line 255
    move-object v0, p1

    iget v2, p0, Lo/chm;->l:F

    iget v3, p0, Lo/chm;->t:F

    iget v4, p0, Lo/chm;->l:F

    iget-object v5, p0, Lo/chm;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 256
    move-object v0, p1

    iget v2, p0, Lo/chm;->n:F

    iget v3, p0, Lo/chm;->t:F

    iget v4, p0, Lo/chm;->n:F

    iget-object v5, p0, Lo/chm;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 257
    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 275
    iget-object v0, p0, Lo/chm;->h:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 276
    iget-object v0, p0, Lo/chm;->b:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 277
    iget-object v0, p0, Lo/chm;->f:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 278
    iget-object v0, p0, Lo/chm;->g:Landroid/graphics/Paint;

    sget v1, Lo/cdw;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 279
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 124
    invoke-direct {p0, p1}, Lo/chm;->e(Landroid/graphics/Canvas;)V

    .line 125
    invoke-direct {p0, p1}, Lo/chm;->a(Landroid/graphics/Canvas;)V

    .line 126
    invoke-direct {p0, p1}, Lo/chm;->c(Landroid/graphics/Canvas;)V

    .line 127
    invoke-direct {p0, p1}, Lo/chm;->d(Landroid/graphics/Canvas;)V

    .line 128
    invoke-direct {p0, p1}, Lo/chm;->b(Landroid/graphics/Canvas;)V

    .line 129
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 115
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 116
    invoke-virtual {p0}, Lo/chm;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/chm;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chm;->t:F

    .line 117
    invoke-virtual {p0}, Lo/chm;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/chm;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/chm;->r:F

    .line 118
    iget v0, p0, Lo/chm;->r:F

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Lo/chm;->c(IF)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chm;->n:F

    .line 119
    iget v0, p0, Lo/chm;->r:F

    const/4 v1, 0x1

    const/high16 v2, 0x41d80000    # 27.0f

    invoke-static {v1, v2}, Lo/chm;->c(IF)F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chm;->m:F

    .line 120
    return-void
.end method
