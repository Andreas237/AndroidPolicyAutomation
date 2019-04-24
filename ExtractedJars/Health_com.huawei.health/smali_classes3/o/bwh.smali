.class public Lo/bwh;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/RectF;

.field private b:Landroid/graphics/RectF;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:I

.field private f:Landroid/graphics/Path;

.field private g:I

.field private h:F

.field private i:I

.field private k:I

.field private l:F

.field private m:Landroid/graphics/RectF;

.field private p:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 42
    invoke-direct {p0, p1}, Lo/bwh;->c(Landroid/content/Context;)V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    invoke-direct {p0, p1}, Lo/bwh;->c(Landroid/content/Context;)V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    invoke-direct {p0, p1}, Lo/bwh;->c(Landroid/content/Context;)V

    .line 53
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 6

    .line 56
    invoke-virtual {p0}, Lo/bwh;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_download_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bwh;->i:I

    .line 57
    invoke-virtual {p0}, Lo/bwh;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_download_progress:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bwh;->g:I

    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    sget v2, Lcom/huawei/health/suggestion/R$attr;->sug_theme_fitness_color:I

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    const/4 v0, 0x0

    const v1, -0xffff01

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/bwh;->i:I

    .line 62
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 64
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    sget v2, Lcom/huawei/health/suggestion/R$attr;->sug_theme_fitness_prog_color:I

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    const/4 v0, 0x0

    const/high16 v1, -0x10000

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/bwh;->g:I

    .line 67
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 69
    :cond_1
    invoke-virtual {p0}, Lo/bwh;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwh;->l:F

    .line 70
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwh;->c:Landroid/graphics/Paint;

    .line 71
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwh;->p:Landroid/graphics/Paint;

    .line 72
    iget-object v0, p0, Lo/bwh;->c:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwh;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    iget-object v0, p0, Lo/bwh;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwh;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    iget-object v0, p0, Lo/bwh;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 75
    iget-object v0, p0, Lo/bwh;->p:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/bwh;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 76
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwh;->d:Landroid/graphics/Paint;

    .line 77
    iget-object v0, p0, Lo/bwh;->d:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwh;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 133
    iget v0, p0, Lo/bwh;->h:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 104
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 106
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 107
    iget-object v0, p0, Lo/bwh;->f:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 108
    iget v0, p0, Lo/bwh;->h:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lo/bwh;->h:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 109
    :cond_0
    iget-object v0, p0, Lo/bwh;->p:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 110
    iget-object v0, p0, Lo/bwh;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lo/bwh;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 112
    :cond_1
    iget-object v0, p0, Lo/bwh;->p:Landroid/graphics/Paint;

    const/16 v1, 0x4c

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 113
    iget-object v0, p0, Lo/bwh;->b:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwh;->e:I

    iget v2, p0, Lo/bwh;->k:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lo/bwh;->h:F

    mul-float/2addr v1, v2

    iget-object v2, p0, Lo/bwh;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 115
    iget-object v0, p0, Lo/bwh;->b:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwh;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 117
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 118
    iget-object v0, p0, Lo/bwh;->a:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwh;->l:F

    iget v2, p0, Lo/bwh;->l:F

    iget-object v3, p0, Lo/bwh;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 119
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 99
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 100
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 7

    .line 82
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 83
    invoke-virtual {p0}, Lo/bwh;->getWidth()I

    move-result v0

    iput v0, p0, Lo/bwh;->e:I

    .line 84
    invoke-virtual {p0}, Lo/bwh;->getHeight()I

    move-result v5

    .line 85
    invoke-virtual {p0}, Lo/bwh;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bwh;->k:I

    .line 87
    invoke-virtual {p0}, Lo/bwh;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3e4ccccd    # 0.2f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v6, v0

    .line 88
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/bwh;->k:I

    int-to-float v1, v1

    iget v2, p0, Lo/bwh;->k:I

    int-to-float v2, v2

    iget v3, p0, Lo/bwh;->e:I

    iget v4, p0, Lo/bwh;->k:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lo/bwh;->k:I

    sub-int v4, v5, v4

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/bwh;->a:Landroid/graphics/RectF;

    .line 90
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/bwh;->k:I

    int-to-float v1, v1

    add-float/2addr v1, v6

    iget v2, p0, Lo/bwh;->k:I

    int-to-float v2, v2

    add-float/2addr v2, v6

    iget v3, p0, Lo/bwh;->e:I

    iget v4, p0, Lo/bwh;->k:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    sub-float/2addr v3, v6

    iget v4, p0, Lo/bwh;->k:I

    sub-int v4, v5, v4

    int-to-float v4, v4

    sub-float/2addr v4, v6

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/bwh;->b:Landroid/graphics/RectF;

    .line 91
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/bwh;->k:I

    int-to-float v1, v1

    add-float/2addr v1, v6

    iget v2, p0, Lo/bwh;->k:I

    int-to-float v2, v2

    add-float/2addr v2, v6

    iget v3, p0, Lo/bwh;->e:I

    iget v4, p0, Lo/bwh;->k:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    sub-float/2addr v3, v6

    iget v4, p0, Lo/bwh;->k:I

    sub-int v4, v5, v4

    int-to-float v4, v4

    sub-float/2addr v4, v6

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/bwh;->m:Landroid/graphics/RectF;

    .line 92
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwh;->f:Landroid/graphics/Path;

    .line 93
    iget-object v0, p0, Lo/bwh;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lo/bwh;->m:Landroid/graphics/RectF;

    iget v2, p0, Lo/bwh;->l:F

    iget v3, p0, Lo/bwh;->l:F

    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 95
    return-void
.end method

.method public setProgress(F)V
    .locals 2

    .line 127
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lo/bwh;->h:F

    .line 128
    iget-object v0, p0, Lo/bwh;->d:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 129
    invoke-virtual {p0}, Lo/bwh;->postInvalidate()V

    .line 130
    return-void
.end method
