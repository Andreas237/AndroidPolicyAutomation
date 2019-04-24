.class public Lo/bwl;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:F

.field private c:Landroid/graphics/PointF;

.field private d:F

.field private e:Landroid/graphics/RectF;

.field private g:I

.field private h:I

.field private i:F

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 25
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/bwl;->b:F

    .line 26
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    .line 28
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/bwl;->i:F

    .line 35
    invoke-direct {p0, p1}, Lo/bwl;->d(Landroid/content/Context;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/bwl;->b:F

    .line 26
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    .line 28
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/bwl;->i:F

    .line 40
    invoke-direct {p0, p1}, Lo/bwl;->d(Landroid/content/Context;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/bwl;->b:F

    .line 26
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    .line 28
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/bwl;->i:F

    .line 45
    invoke-direct {p0, p1}, Lo/bwl;->d(Landroid/content/Context;)V

    .line 46
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 49
    invoke-virtual {p0}, Lo/bwl;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_timeprogress_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bwl;->g:I

    .line 50
    invoke-virtual {p0}, Lo/bwl;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_press:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bwl;->h:I

    .line 51
    invoke-virtual {p0}, Lo/bwl;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_press:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bwl;->k:I

    .line 52
    return-void
.end method


# virtual methods
.method public b(F)Lo/bwl;
    .locals 1

    .line 99
    iput p1, p0, Lo/bwl;->i:F

    .line 100
    iget v0, p0, Lo/bwl;->k:I

    iput v0, p0, Lo/bwl;->h:I

    .line 101
    invoke-virtual {p0}, Lo/bwl;->postInvalidate()V

    .line 102
    return-object p0
.end method

.method public c(F)Lo/bwl;
    .locals 0

    .line 83
    iput p1, p0, Lo/bwl;->d:F

    .line 84
    invoke-virtual {p0}, Lo/bwl;->postInvalidate()V

    .line 85
    return-object p0
.end method

.method public getCurrProgress()I
    .locals 1

    .line 106
    iget v0, p0, Lo/bwl;->i:F

    float-to-int v0, v0

    return v0
.end method

.method public getMax()F
    .locals 1

    .line 110
    iget v0, p0, Lo/bwl;->d:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 75
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 76
    iget-object v0, p0, Lo/bwl;->a:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwl;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    move-object v0, p1

    iget-object v1, p0, Lo/bwl;->e:Landroid/graphics/RectF;

    iget-object v5, p0, Lo/bwl;->a:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 78
    iget-object v0, p0, Lo/bwl;->a:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwl;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 79
    move-object v0, p1

    iget-object v1, p0, Lo/bwl;->e:Landroid/graphics/RectF;

    iget v2, p0, Lo/bwl;->i:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    iget v3, p0, Lo/bwl;->d:F

    div-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v3, v2

    iget-object v5, p0, Lo/bwl;->a:Landroid/graphics/Paint;

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 80
    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 56
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 57
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwl;->a:Landroid/graphics/Paint;

    .line 58
    invoke-virtual {p0}, Lo/bwl;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/bwl;->b:F

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/bwl;->b:F

    .line 59
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    .line 63
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 64
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bwl;->b:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v5, v0, v1

    .line 65
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

    iput-object v0, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    .line 66
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v5

    iget-object v2, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v5

    iget-object v3, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    add-float/2addr v3, v5

    iget-object v4, p0, Lo/bwl;->c:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/bwl;->e:Landroid/graphics/RectF;

    .line 67
    iget-object v0, p0, Lo/bwl;->a:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwl;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 68
    iget-object v0, p0, Lo/bwl;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 70
    return-void
.end method
