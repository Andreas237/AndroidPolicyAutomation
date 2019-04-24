.class public Lo/epo;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static final c:[I

.field private static final d:[I


# instance fields
.field private b:Z

.field private e:Z

.field private f:Landroid/graphics/Paint;

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Paint;

.field private i:F

.field private k:F

.field private l:Landroid/graphics/Paint;

.field private m:Landroid/graphics/LinearGradient;

.field private n:Landroid/graphics/RectF;

.field private o:Landroid/content/Context;

.field private p:Landroid/graphics/RectF;

.field private s:Landroid/graphics/LinearGradient;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 21
    const-class v0, Lo/epo;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/epo;->a:Ljava/lang/String;

    .line 45
    const/4 v0, 0x2

    new-array v0, v0, [I

    const-string v1, "#2D78FC"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const-string v1, "#7B6EF9"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    sput-object v0, Lo/epo;->c:[I

    .line 46
    const/4 v0, 0x2

    new-array v0, v0, [I

    const-string v1, "#05D88D"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const-string v1, "#01DCDD"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    sput-object v0, Lo/epo;->d:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epo;->b:Z

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epo;->e:Z

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->n:Landroid/graphics/RectF;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->p:Landroid/graphics/RectF;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->m:Landroid/graphics/LinearGradient;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->s:Landroid/graphics/LinearGradient;

    .line 57
    iput-object p1, p0, Lo/epo;->o:Landroid/content/Context;

    .line 58
    invoke-direct {p0}, Lo/epo;->c()V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 62
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epo;->b:Z

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epo;->e:Z

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->n:Landroid/graphics/RectF;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->p:Landroid/graphics/RectF;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->m:Landroid/graphics/LinearGradient;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/epo;->s:Landroid/graphics/LinearGradient;

    .line 63
    iput-object p1, p0, Lo/epo;->o:Landroid/content/Context;

    .line 64
    invoke-direct {p0}, Lo/epo;->c()V

    .line 65
    return-void
.end method

.method private c(F)I
    .locals 3

    .line 204
    invoke-virtual {p0}, Lo/epo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 205
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private c()V
    .locals 2

    .line 130
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epo;->f:Landroid/graphics/Paint;

    .line 131
    iget-object v0, p0, Lo/epo;->f:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 132
    iget-object v0, p0, Lo/epo;->f:Landroid/graphics/Paint;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-direct {p0, v1}, Lo/epo;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 133
    iget-object v0, p0, Lo/epo;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 134
    iget-object v0, p0, Lo/epo;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 136
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epo;->g:Landroid/graphics/Paint;

    .line 137
    iget-object v0, p0, Lo/epo;->g:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 138
    iget-object v0, p0, Lo/epo;->g:Landroid/graphics/Paint;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-direct {p0, v1}, Lo/epo;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 139
    iget-object v0, p0, Lo/epo;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 140
    iget-object v0, p0, Lo/epo;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 141
    iget-object v0, p0, Lo/epo;->g:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 142
    iget-object v0, p0, Lo/epo;->g:Landroid/graphics/Paint;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 144
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epo;->h:Landroid/graphics/Paint;

    .line 145
    iget-object v0, p0, Lo/epo;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 146
    iget-object v0, p0, Lo/epo;->h:Landroid/graphics/Paint;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-direct {p0, v1}, Lo/epo;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 147
    iget-object v0, p0, Lo/epo;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 148
    iget-object v0, p0, Lo/epo;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 150
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epo;->l:Landroid/graphics/Paint;

    .line 151
    iget-object v0, p0, Lo/epo;->l:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 152
    iget-object v0, p0, Lo/epo;->l:Landroid/graphics/Paint;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-direct {p0, v1}, Lo/epo;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 153
    iget-object v0, p0, Lo/epo;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 154
    iget-object v0, p0, Lo/epo;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 155
    iget-object v0, p0, Lo/epo;->l:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 156
    iget-object v0, p0, Lo/epo;->l:Landroid/graphics/Paint;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 158
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 69
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 71
    invoke-virtual {p0}, Lo/epo;->getWidth()I

    move-result v8

    .line 72
    invoke-virtual {p0}, Lo/epo;->getHeight()I

    move-result v9

    .line 73
    iget-object v0, p0, Lo/epo;->n:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    .line 74
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-direct {p0, v1}, Lo/epo;->c(F)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x41100000    # 9.0f

    invoke-direct {p0, v2}, Lo/epo;->c(F)I

    move-result v2

    int-to-float v2, v2

    .line 75
    const/high16 v3, 0x41100000    # 9.0f

    invoke-direct {p0, v3}, Lo/epo;->c(F)I

    move-result v3

    sub-int v3, v8, v3

    int-to-float v3, v3

    .line 76
    const/high16 v4, 0x41100000    # 9.0f

    invoke-direct {p0, v4}, Lo/epo;->c(F)I

    move-result v4

    sub-int v4, v8, v4

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/epo;->n:Landroid/graphics/RectF;

    .line 80
    :cond_0
    iget-object v0, p0, Lo/epo;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v10

    .line 81
    iget v0, p0, Lo/epo;->i:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 82
    iget v0, p0, Lo/epo;->i:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 83
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/epo;->i:F

    .line 87
    :cond_1
    iget-object v0, p0, Lo/epo;->m:Landroid/graphics/LinearGradient;

    if-nez v0, :cond_2

    .line 88
    new-instance v0, Landroid/graphics/LinearGradient;

    add-int/lit8 v1, v8, -0x3

    int-to-float v1, v1

    iget v2, p0, Lo/epo;->i:F

    mul-float v3, v1, v2

    add-int/lit8 v1, v9, -0x3

    int-to-float v4, v1

    sget-object v5, Lo/epo;->c:[I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    const/high16 v1, 0x40400000    # 3.0f

    const/high16 v2, 0x40400000    # 3.0f

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lo/epo;->m:Landroid/graphics/LinearGradient;

    .line 90
    :cond_2
    iget-object v0, p0, Lo/epo;->f:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epo;->m:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 91
    if-eqz v10, :cond_3

    .line 92
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->n:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->i:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x43340000    # 180.0f

    sub-float/2addr v3, v2

    iget-object v5, p0, Lo/epo;->g:Landroid/graphics/Paint;

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 93
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->n:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->i:F

    neg-float v2, v2

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    iget v3, p0, Lo/epo;->i:F

    const/high16 v4, 0x43b40000    # 360.0f

    mul-float/2addr v3, v4

    iget-object v5, p0, Lo/epo;->f:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    .line 95
    :cond_3
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->n:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->i:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x43340000    # 180.0f

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epo;->i:F

    const/high16 v4, 0x43b40000    # 360.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x43340000    # 180.0f

    sub-float v3, v4, v3

    iget-object v5, p0, Lo/epo;->g:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 96
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->n:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->i:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v3, v2

    iget-object v5, p0, Lo/epo;->f:Landroid/graphics/Paint;

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    .line 100
    :cond_4
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->n:Landroid/graphics/RectF;

    iget-object v5, p0, Lo/epo;->g:Landroid/graphics/Paint;

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 103
    :goto_0
    iget-object v0, p0, Lo/epo;->p:Landroid/graphics/RectF;

    if-nez v0, :cond_5

    .line 104
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-direct {p0, v1}, Lo/epo;->c(F)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x41c80000    # 25.0f

    invoke-direct {p0, v2}, Lo/epo;->c(F)I

    move-result v2

    int-to-float v2, v2

    .line 105
    const/high16 v3, 0x41c80000    # 25.0f

    invoke-direct {p0, v3}, Lo/epo;->c(F)I

    move-result v3

    sub-int v3, v8, v3

    int-to-float v3, v3

    .line 106
    const/high16 v4, 0x41c80000    # 25.0f

    invoke-direct {p0, v4}, Lo/epo;->c(F)I

    move-result v4

    sub-int v4, v8, v4

    add-int/lit8 v4, v4, 0x14

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/epo;->p:Landroid/graphics/RectF;

    .line 108
    :cond_5
    iget v0, p0, Lo/epo;->k:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 109
    iget v0, p0, Lo/epo;->k:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 110
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/epo;->k:F

    .line 113
    :cond_6
    iget-object v0, p0, Lo/epo;->s:Landroid/graphics/LinearGradient;

    if-nez v0, :cond_7

    .line 114
    new-instance v0, Landroid/graphics/LinearGradient;

    add-int/lit8 v1, v8, -0x3

    int-to-float v1, v1

    iget v2, p0, Lo/epo;->k:F

    mul-float v3, v1, v2

    add-int/lit8 v1, v8, -0x3

    int-to-float v4, v1

    sget-object v5, Lo/epo;->d:[I

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    const/high16 v1, 0x40400000    # 3.0f

    const/high16 v2, 0x40400000    # 3.0f

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lo/epo;->s:Landroid/graphics/LinearGradient;

    .line 116
    :cond_7
    iget-object v0, p0, Lo/epo;->h:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epo;->s:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 117
    if-eqz v10, :cond_8

    .line 118
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->p:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->k:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x43340000    # 180.0f

    sub-float/2addr v3, v2

    iget-object v5, p0, Lo/epo;->l:Landroid/graphics/Paint;

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 119
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->p:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->k:F

    neg-float v2, v2

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    iget v3, p0, Lo/epo;->k:F

    const/high16 v4, 0x43b40000    # 360.0f

    mul-float/2addr v3, v4

    iget-object v5, p0, Lo/epo;->h:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_1

    .line 121
    :cond_8
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->p:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->k:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x43340000    # 180.0f

    sub-float/2addr v2, v3

    iget v3, p0, Lo/epo;->k:F

    const/high16 v4, 0x43b40000    # 360.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x43340000    # 180.0f

    sub-float v3, v4, v3

    iget-object v5, p0, Lo/epo;->l:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 122
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->p:Landroid/graphics/RectF;

    iget v2, p0, Lo/epo;->k:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v3, v2

    iget-object v5, p0, Lo/epo;->h:Landroid/graphics/Paint;

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_1

    .line 125
    :cond_9
    move-object v0, p1

    iget-object v1, p0, Lo/epo;->p:Landroid/graphics/RectF;

    iget-object v5, p0, Lo/epo;->l:Landroid/graphics/Paint;

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 127
    :goto_1
    return-void
.end method

.method public setGoalProgress(F)V
    .locals 1

    .line 161
    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 162
    const/high16 p1, 0x3f000000    # 0.5f

    .line 164
    :cond_0
    iput p1, p0, Lo/epo;->i:F

    .line 176
    invoke-virtual {p0}, Lo/epo;->invalidate()V

    .line 177
    return-void
.end method

.method public setStepsFirst(Z)V
    .locals 0

    .line 31
    iput-boolean p1, p0, Lo/epo;->b:Z

    .line 32
    return-void
.end method

.method public setTimeFirst(Z)V
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/epo;->e:Z

    .line 40
    return-void
.end method

.method public setTimeProgress(F)V
    .locals 1

    .line 180
    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 181
    const/high16 p1, 0x3f000000    # 0.5f

    .line 183
    :cond_0
    iput p1, p0, Lo/epo;->k:F

    .line 194
    invoke-virtual {p0}, Lo/epo;->invalidate()V

    .line 195
    return-void
.end method
