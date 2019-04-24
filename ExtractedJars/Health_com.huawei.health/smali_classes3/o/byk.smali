.class public Lo/byk;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Landroid/graphics/RectF;

.field private c:F

.field private d:Landroid/graphics/PointF;

.field private e:Landroid/graphics/Paint;

.field private f:F

.field private g:I

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 20
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/byk;->c:F

    .line 21
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/byk;->d:Landroid/graphics/PointF;

    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/byk;->a:F

    .line 23
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/byk;->f:F

    .line 29
    invoke-direct {p0, p1}, Lo/byk;->a(Landroid/content/Context;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/byk;->c:F

    .line 21
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/byk;->d:Landroid/graphics/PointF;

    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/byk;->a:F

    .line 23
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/byk;->f:F

    .line 34
    invoke-direct {p0, p1}, Lo/byk;->a(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/byk;->c:F

    .line 21
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/byk;->d:Landroid/graphics/PointF;

    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/byk;->a:F

    .line 23
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/byk;->f:F

    .line 39
    invoke-direct {p0, p1}, Lo/byk;->a(Landroid/content/Context;)V

    .line 40
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .line 43
    sget v0, Lcom/huawei/health/suggestion/R$color;->common_white_30alpha:I

    invoke-static {p1, v0}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lo/byk;->i:I

    .line 44
    sget v0, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {p1, v0}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lo/byk;->g:I

    .line 45
    return-void
.end method


# virtual methods
.method public d(F)Lo/byk;
    .locals 0

    .line 82
    iput p1, p0, Lo/byk;->f:F

    .line 83
    invoke-virtual {p0}, Lo/byk;->postInvalidate()V

    .line 84
    return-object p0
.end method

.method public e(F)Lo/byk;
    .locals 0

    .line 75
    iput p1, p0, Lo/byk;->a:F

    .line 76
    invoke-virtual {p0}, Lo/byk;->postInvalidate()V

    .line 77
    return-object p0
.end method

.method public getCurrProgress()I
    .locals 1

    .line 88
    iget v0, p0, Lo/byk;->f:F

    float-to-int v0, v0

    return v0
.end method

.method public getMax()F
    .locals 1

    .line 92
    iget v0, p0, Lo/byk;->a:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 67
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 68
    iget-object v0, p0, Lo/byk;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/byk;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    move-object v0, p1

    iget-object v1, p0, Lo/byk;->b:Landroid/graphics/RectF;

    iget-object v5, p0, Lo/byk;->e:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 70
    iget-object v0, p0, Lo/byk;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/byk;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 71
    move-object v0, p1

    iget-object v1, p0, Lo/byk;->b:Landroid/graphics/RectF;

    iget v2, p0, Lo/byk;->f:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    iget v3, p0, Lo/byk;->a:F

    div-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v3, v2

    iget-object v5, p0, Lo/byk;->e:Landroid/graphics/Paint;

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 72
    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 49
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 50
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/byk;->e:Landroid/graphics/Paint;

    .line 51
    invoke-virtual {p0}, Lo/byk;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/byk;->c:F

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/byk;->c:F

    .line 52
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    .line 56
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 57
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/byk;->c:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v5, v0, v1

    .line 58
    new-instance v0, Landroid/graphics/PointF;

    int-to-float v1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    int-to-float v2, p2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lo/byk;->d:Landroid/graphics/PointF;

    .line 59
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/byk;->d:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v5

    iget-object v2, p0, Lo/byk;->d:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v5

    iget-object v3, p0, Lo/byk;->d:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    add-float/2addr v3, v5

    iget-object v4, p0, Lo/byk;->d:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/byk;->b:Landroid/graphics/RectF;

    .line 60
    iget-object v0, p0, Lo/byk;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/byk;->c:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 61
    iget-object v0, p0, Lo/byk;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 62
    return-void
.end method
