.class public Lo/cij;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final t:I

.field private static final v:I

.field private static final w:I

.field private static final y:I

.field private static final z:I


# instance fields
.field private A:I

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private C:I

.field private a:Landroid/graphics/Paint;

.field private b:Landroid/text/TextPaint;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/Path;

.field private g:Landroid/graphics/Path;

.field private h:J

.field private i:Landroid/graphics/Paint;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private k:J

.field private l:F

.field private m:F

.field private n:I

.field private o:F

.field private p:F

.field private q:F

.field private r:Z

.field private s:F

.field private u:F

.field private x:[D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    const-string v0, "#7F000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cij;->t:I

    .line 74
    const-string v0, "#27000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cij;->v:I

    .line 75
    const-string v0, "#ff0DD3D5"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cij;->y:I

    .line 76
    const-string v0, "#7FFFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cij;->w:I

    .line 77
    const-string v0, "#27FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cij;->z:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 94
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->c:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->d:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    .line 45
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->i:Landroid/graphics/Paint;

    .line 47
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/cij;->f:Landroid/graphics/Path;

    .line 48
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/cij;->g:Landroid/graphics/Path;

    .line 50
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lo/cij;->k:J

    .line 51
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lo/cij;->h:J

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/cij;->n:I

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cij;->r:Z

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cij;->B:Ljava/util/List;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cij;->j:Ljava/util/List;

    .line 87
    const/4 v0, 0x3

    iput v0, p0, Lo/cij;->C:I

    .line 89
    const/4 v0, 0x1

    iput v0, p0, Lo/cij;->A:I

    .line 95
    invoke-direct {p0}, Lo/cij;->a()V

    .line 96
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 99
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->c:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->d:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    .line 45
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/cij;->i:Landroid/graphics/Paint;

    .line 47
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/cij;->f:Landroid/graphics/Path;

    .line 48
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/cij;->g:Landroid/graphics/Path;

    .line 50
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lo/cij;->k:J

    .line 51
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lo/cij;->h:J

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/cij;->n:I

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cij;->r:Z

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cij;->B:Ljava/util/List;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cij;->j:Ljava/util/List;

    .line 87
    const/4 v0, 0x3

    iput v0, p0, Lo/cij;->C:I

    .line 89
    const/4 v0, 0x1

    iput v0, p0, Lo/cij;->A:I

    .line 100
    invoke-direct {p0}, Lo/cij;->a()V

    .line 101
    return-void
.end method

.method private a(F)F
    .locals 6

    .line 423
    iget-wide v0, p0, Lo/cij;->k:J

    iget-wide v2, p0, Lo/cij;->h:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 424
    iget v0, p0, Lo/cij;->p:F

    iget v1, p0, Lo/cij;->s:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0

    .line 426
    :cond_0
    iget v0, p0, Lo/cij;->s:F

    iget v1, p0, Lo/cij;->u:F

    add-float/2addr v0, v1

    iget-wide v1, p0, Lo/cij;->k:J

    long-to-float v1, v1

    sub-float/2addr v1, p1

    iget-wide v2, p0, Lo/cij;->k:J

    iget-wide v4, p0, Lo/cij;->h:J

    sub-long/2addr v2, v4

    long-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lo/cij;->p:F

    iget v3, p0, Lo/cij;->s:F

    sub-float/2addr v2, v3

    iget v3, p0, Lo/cij;->u:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private a()V
    .locals 6

    .line 106
    invoke-virtual {p0}, Lo/cij;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 107
    invoke-static {v3}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cij;->r:Z

    .line 109
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Lo/xy;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v4, v0

    .line 111
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v3, v0}, Lo/xy;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/cij;->s:F

    .line 112
    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v3, v0}, Lo/xy;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/cij;->q:F

    .line 114
    iput v4, p0, Lo/cij;->u:F

    .line 117
    iget-object v0, p0, Lo/cij;->c:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 118
    iget-object v0, p0, Lo/cij;->c:Landroid/graphics/Paint;

    sget v1, Lo/cij;->y:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 119
    iget-object v0, p0, Lo/cij;->c:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, v4

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 120
    iget-object v0, p0, Lo/cij;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 121
    iget-object v0, p0, Lo/cij;->c:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/CornerPathEffect;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-direct {v1, v2}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 123
    iget-object v0, p0, Lo/cij;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 126
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 127
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    const-string v1, "#556A73"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 128
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 129
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 130
    new-instance v5, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v5, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 131
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 133
    iget-object v0, p0, Lo/cij;->i:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 134
    iget-object v0, p0, Lo/cij;->i:Landroid/graphics/Paint;

    sget v1, Lo/cij;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 135
    iget-object v0, p0, Lo/cij;->i:Landroid/graphics/Paint;

    iget v1, p0, Lo/cij;->q:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 139
    iget-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 140
    iget-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    sget v1, Lo/cij;->v:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 141
    iget-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 142
    iget-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 145
    iget-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 146
    iget-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    sget v1, Lo/cij;->t:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 147
    iget-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    iget v1, p0, Lo/cij;->q:F

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 149
    invoke-static {v3}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cij;->r:Z

    .line 151
    return-void

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40800000    # 4.0f
    .end array-data
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 6

    .line 315
    move-object v0, p1

    iget v2, p0, Lo/cij;->p:F

    iget v3, p0, Lo/cij;->o:F

    iget v4, p0, Lo/cij;->p:F

    iget-object v5, p0, Lo/cij;->a:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 316
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 11

    .line 347
    iget-object v0, p0, Lo/cij;->j:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cij;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 348
    :cond_0
    return-void

    .line 351
    :cond_1
    iget-object v0, p0, Lo/cij;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 354
    invoke-direct {p0}, Lo/cij;->getMinsByPointSize()I

    move-result v6

    .line 355
    iget v0, p0, Lo/cij;->C:I

    iget v1, p0, Lo/cij;->A:I

    mul-int/2addr v0, v1

    if-le v6, v0, :cond_2

    move v7, v6

    goto :goto_0

    :cond_2
    iget v0, p0, Lo/cij;->C:I

    iget v1, p0, Lo/cij;->A:I

    mul-int v7, v0, v1

    .line 359
    :goto_0
    const/4 v0, 0x3

    if-le v6, v0, :cond_3

    .line 360
    iget v0, p0, Lo/cij;->o:F

    iget-object v1, p0, Lo/cij;->b:Landroid/text/TextPaint;

    iget-object v2, p0, Lo/cij;->j:Ljava/util/List;

    iget-object v3, p0, Lo/cij;->j:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v7

    div-float/2addr v0, v1

    iget v1, p0, Lo/cij;->A:I

    int-to-float v1, v1

    mul-float v8, v0, v1

    goto :goto_1

    .line 362
    :cond_3
    iget v0, p0, Lo/cij;->o:F

    iget-object v1, p0, Lo/cij;->b:Landroid/text/TextPaint;

    iget-object v2, p0, Lo/cij;->j:Ljava/util/List;

    iget-object v3, p0, Lo/cij;->j:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x42100000    # 36.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/cij;->A:I

    mul-int/lit8 v1, v1, 0xc

    int-to-float v1, v1

    mul-float v8, v0, v1

    .line 366
    :goto_1
    iget v0, p0, Lo/cij;->p:F

    iget-object v1, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/text/TextPaint;->descent()F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/text/TextPaint;->ascent()F

    move-result v1

    sub-float v9, v0, v1

    .line 368
    iget-boolean v0, p0, Lo/cij;->r:Z

    if-eqz v0, :cond_5

    .line 369
    add-int/lit8 v10, v5, -0x1

    :goto_2
    if-ltz v10, :cond_4

    .line 370
    iget-object v0, p0, Lo/cij;->j:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sub-int v1, v5, v10

    int-to-float v1, v1

    mul-float/2addr v1, v8

    iget-object v2, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, v1, v9, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 369
    add-int/lit8 v10, v10, -0x1

    goto :goto_2

    :cond_4
    goto :goto_4

    .line 373
    :cond_5
    const/4 v10, 0x0

    :goto_3
    if-ge v10, v5, :cond_6

    .line 374
    iget-object v0, p0, Lo/cij;->j:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    int-to-float v1, v10

    mul-float/2addr v1, v8

    iget-object v2, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, v1, v9, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 373
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 380
    :cond_6
    :goto_4
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 7

    .line 401
    iget-object v0, p0, Lo/cij;->B:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cij;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 402
    :cond_0
    return-void

    .line 405
    :cond_1
    iget-object v0, p0, Lo/cij;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 408
    iget v0, p0, Lo/cij;->p:F

    iget v1, p0, Lo/cij;->s:F

    sub-float/2addr v0, v1

    int-to-float v1, v3

    div-float v4, v0, v1

    .line 410
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 411
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_2

    .line 412
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 413
    iget v0, p0, Lo/cij;->s:F

    int-to-float v1, v6

    mul-float/2addr v1, v4

    add-float/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 414
    iget v0, p0, Lo/cij;->o:F

    iget v1, p0, Lo/cij;->s:F

    int-to-float v2, v6

    mul-float/2addr v2, v4

    add-float/2addr v1, v2

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 415
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 411
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 418
    :cond_2
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 7

    .line 323
    iget-object v0, p0, Lo/cij;->B:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cij;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 324
    :cond_0
    return-void

    .line 328
    :cond_1
    iget v0, p0, Lo/cij;->p:F

    iget v1, p0, Lo/cij;->s:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/cij;->B:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 329
    iget-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->descent()F

    move-result v0

    iget-object v1, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/text/TextPaint;->ascent()F

    move-result v1

    sub-float v4, v0, v1

    .line 330
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/cij;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 331
    iget-object v0, p0, Lo/cij;->B:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 332
    iget-boolean v0, p0, Lo/cij;->r:Z

    if-eqz v0, :cond_2

    .line 333
    iget v0, p0, Lo/cij;->s:F

    int-to-float v1, v5

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    add-float/2addr v0, v4

    iget-object v1, p0, Lo/cij;->b:Landroid/text/TextPaint;

    const/4 v2, 0x0

    invoke-virtual {p1, v6, v2, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 335
    :cond_2
    iget v0, p0, Lo/cij;->o:F

    iget-object v1, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {v1, v6}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/cij;->s:F

    int-to-float v2, v5

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    add-float/2addr v1, v4

    iget-object v2, p0, Lo/cij;->b:Landroid/text/TextPaint;

    invoke-virtual {p1, v6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 330
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 340
    :cond_3
    return-void
.end method

.method private e()V
    .locals 15

    .line 431
    iget v0, p0, Lo/cij;->n:I

    if-nez v0, :cond_0

    .line 432
    return-void

    .line 439
    :cond_0
    const/high16 v6, 0x3f800000    # 1.0f

    .line 442
    invoke-direct {p0}, Lo/cij;->getMinsByPointSize()I

    move-result v7

    .line 443
    const/4 v0, 0x3

    if-gt v7, v0, :cond_1

    .line 444
    iget v0, p0, Lo/cij;->C:I

    iget v1, p0, Lo/cij;->A:I

    mul-int/2addr v0, v1

    mul-int/lit8 v4, v0, 0xc

    .line 445
    iget v5, p0, Lo/cij;->n:I

    goto :goto_0

    .line 449
    :cond_1
    iget v0, p0, Lo/cij;->C:I

    iget v1, p0, Lo/cij;->A:I

    mul-int v8, v0, v1

    .line 450
    if-le v7, v8, :cond_3

    .line 452
    iget v0, p0, Lo/cij;->n:I

    const/16 v1, 0x96

    if-le v0, v1, :cond_2

    .line 453
    const/16 v4, 0x96

    .line 454
    iget v0, p0, Lo/cij;->n:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    div-float v6, v0, v1

    .line 455
    const/16 v5, 0x96

    goto :goto_0

    .line 457
    :cond_2
    iget v4, p0, Lo/cij;->n:I

    .line 458
    iget v5, p0, Lo/cij;->n:I

    goto :goto_0

    .line 462
    :cond_3
    mul-int/lit8 v0, v8, 0x3c

    div-int/lit8 v9, v0, 0x5

    .line 463
    const/16 v0, 0x96

    if-le v9, v0, :cond_4

    .line 465
    const/16 v4, 0x96

    .line 466
    int-to-float v0, v9

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    div-float v6, v0, v1

    .line 467
    iget v0, p0, Lo/cij;->n:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v9

    div-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v5, v0

    goto :goto_0

    .line 469
    :cond_4
    move v4, v9

    .line 470
    iget v5, p0, Lo/cij;->n:I

    .line 475
    :goto_0
    const-string v0, "Track_TrackDetailCurveView"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCurveAndFillPath xPoints = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " stepOfPoints = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mDrawingAltiDataNums = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    iget v0, p0, Lo/cij;->n:I

    if-le v5, v0, :cond_5

    .line 478
    const-string v0, "Track_TrackDetailCurveView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDrawingAltiDataNums > mPointSize!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget v5, p0, Lo/cij;->n:I

    .line 485
    :cond_5
    iget v0, p0, Lo/cij;->o:F

    int-to-float v1, v4

    div-float v8, v0, v1

    .line 489
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 490
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v5, :cond_7

    .line 493
    :try_start_0
    iget-object v0, p0, Lo/cij;->x:[D

    int-to-float v1, v12

    mul-float/2addr v1, v6

    float-to-int v1, v1

    aget-wide v0, v0, v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    double-to-float v13, v0

    .line 497
    goto :goto_2

    .line 494
    :catch_0
    move-exception v14

    .line 495
    const-string v0, "Track_TrackDetailCurveView"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v14}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    int-to-float v2, v12

    mul-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    iget-object v0, p0, Lo/cij;->x:[D

    add-int/lit8 v1, v5, -0x1

    aget-wide v0, v0, v1

    double-to-float v13, v0

    .line 499
    :goto_2
    iget-boolean v0, p0, Lo/cij;->r:Z

    if-eqz v0, :cond_6

    .line 500
    iget v0, p0, Lo/cij;->o:F

    iget v1, p0, Lo/cij;->u:F

    sub-float/2addr v0, v1

    int-to-float v1, v12

    mul-float/2addr v1, v8

    sub-float v9, v0, v1

    goto :goto_3

    .line 502
    :cond_6
    iget v0, p0, Lo/cij;->u:F

    int-to-float v1, v12

    mul-float/2addr v1, v8

    add-float v9, v0, v1

    .line 505
    :goto_3
    invoke-direct {p0, v13}, Lo/cij;->a(F)F

    move-result v10

    .line 506
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 509
    :cond_7
    iget-object v0, p0, Lo/cij;->g:Landroid/graphics/Path;

    iget v1, p0, Lo/cij;->p:F

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 510
    const/4 v12, 0x0

    :goto_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v12, v0, :cond_9

    .line 511
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/graphics/PointF;

    .line 512
    iget-object v0, p0, Lo/cij;->g:Landroid/graphics/Path;

    iget v1, v13, Landroid/graphics/PointF;->x:F

    iget v2, v13, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 513
    if-nez v12, :cond_8

    .line 514
    iget-object v0, p0, Lo/cij;->f:Landroid/graphics/Path;

    iget v1, v13, Landroid/graphics/PointF;->x:F

    iget v2, v13, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_5

    .line 516
    :cond_8
    iget-object v0, p0, Lo/cij;->f:Landroid/graphics/Path;

    iget v1, v13, Landroid/graphics/PointF;->x:F

    iget v2, v13, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 510
    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    .line 519
    :cond_9
    iget-object v0, p0, Lo/cij;->g:Landroid/graphics/Path;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lo/cij;->p:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 520
    return-void
.end method

.method private getMinsByPointSize()I
    .locals 2

    .line 609
    iget v0, p0, Lo/cij;->n:I

    mul-int/lit8 v0, v0, 0x5

    add-int/lit8 v0, v0, -0x5

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method


# virtual methods
.method public e(Landroid/graphics/Canvas;)V
    .locals 2

    .line 305
    invoke-direct {p0}, Lo/cij;->e()V

    .line 306
    iget-object v0, p0, Lo/cij;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lo/cij;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 307
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 295
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 296
    invoke-direct {p0, p1}, Lo/cij;->c(Landroid/graphics/Canvas;)V

    .line 297
    invoke-virtual {p0, p1}, Lo/cij;->e(Landroid/graphics/Canvas;)V

    .line 298
    invoke-direct {p0, p1}, Lo/cij;->b(Landroid/graphics/Canvas;)V

    .line 299
    invoke-direct {p0, p1}, Lo/cij;->d(Landroid/graphics/Canvas;)V

    .line 300
    invoke-direct {p0, p1}, Lo/cij;->a(Landroid/graphics/Canvas;)V

    .line 301
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 286
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 287
    invoke-virtual {p0}, Lo/cij;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/cij;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/cij;->o:F

    .line 288
    invoke-virtual {p0}, Lo/cij;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/cij;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/cij;->l:F

    .line 289
    iget v0, p0, Lo/cij;->l:F

    invoke-virtual {p0}, Lo/cij;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v1, v2}, Lo/xy;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/cij;->p:F

    .line 290
    const-string v0, "Track_TrackDetailCurveView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--------onMeasure"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cij;->l:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cij;->o:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cij;->m:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cij;->p:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    return-void
.end method

.method public setAllTextColorStyle(I)V
    .locals 2

    .line 525
    const/16 v0, 0x65

    if-ne p1, v0, :cond_0

    .line 526
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    sget v1, Lo/cij;->w:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 527
    iget-object v0, p0, Lo/cij;->i:Landroid/graphics/Paint;

    sget v1, Lo/cij;->w:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 528
    iget-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    sget v1, Lo/cij;->z:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 529
    iget-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    sget v1, Lo/cij;->w:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    goto :goto_0

    .line 531
    :cond_0
    iget-object v0, p0, Lo/cij;->e:Landroid/graphics/Paint;

    sget v1, Lo/cij;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 532
    iget-object v0, p0, Lo/cij;->i:Landroid/graphics/Paint;

    sget v1, Lo/cij;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 533
    iget-object v0, p0, Lo/cij;->a:Landroid/graphics/Paint;

    sget v1, Lo/cij;->v:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 534
    iget-object v0, p0, Lo/cij;->b:Landroid/text/TextPaint;

    sget v1, Lo/cij;->t:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 536
    :goto_0
    return-void
.end method
