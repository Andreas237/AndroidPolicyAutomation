.class public Lcom/shopkick/app/view/FinderView;
.super Landroid/view/View;
.source "FinderView.java"


# instance fields
.field private animator:Landroid/animation/ValueAnimator;

.field private cutoutPaint:Landroid/graphics/Paint;

.field private finderColor:I

.field private finderPaint:Landroid/graphics/Paint;

.field private heightPercent:F

.field private overlayColor:I

.field private radius:I

.field private roundedRectF:Landroid/graphics/RectF;

.field private srcHeightPercent:F

.field private srcWidthPercent:F

.field private widthPercent:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 p1, 0x42c80000    # 100.0f

    .line 22
    iput p1, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    .line 23
    iput p1, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lcom/shopkick/app/view/FinderView;->radius:I

    const-string p1, "#66000000"

    .line 26
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/view/FinderView;->overlayColor:I

    const-string p1, "#ffffffff"

    .line 27
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/view/FinderView;->finderColor:I

    .line 35
    iget p1, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    iput p1, p0, Lcom/shopkick/app/view/FinderView;->srcWidthPercent:F

    .line 36
    iget p1, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    iput p1, p0, Lcom/shopkick/app/view/FinderView;->srcHeightPercent:F

    .line 41
    invoke-direct {p0}, Lcom/shopkick/app/view/FinderView;->initOnDraw()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x42c80000    # 100.0f

    .line 22
    iput v0, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    .line 23
    iput v0, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lcom/shopkick/app/view/FinderView;->radius:I

    const-string v0, "#66000000"

    .line 26
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/view/FinderView;->overlayColor:I

    const-string v0, "#ffffffff"

    .line 27
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/view/FinderView;->finderColor:I

    .line 35
    iget v0, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    iput v0, p0, Lcom/shopkick/app/view/FinderView;->srcWidthPercent:F

    .line 36
    iget v0, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    iput v0, p0, Lcom/shopkick/app/view/FinderView;->srcHeightPercent:F

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/view/FinderView;->initValues(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    invoke-direct {p0}, Lcom/shopkick/app/view/FinderView;->initOnDraw()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p3, 0x42c80000    # 100.0f

    .line 22
    iput p3, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    .line 23
    iput p3, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    const/4 p3, 0x0

    .line 24
    iput p3, p0, Lcom/shopkick/app/view/FinderView;->radius:I

    const-string p3, "#66000000"

    .line 26
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lcom/shopkick/app/view/FinderView;->overlayColor:I

    const-string p3, "#ffffffff"

    .line 27
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lcom/shopkick/app/view/FinderView;->finderColor:I

    .line 35
    iget p3, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    iput p3, p0, Lcom/shopkick/app/view/FinderView;->srcWidthPercent:F

    .line 36
    iget p3, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    iput p3, p0, Lcom/shopkick/app/view/FinderView;->srcHeightPercent:F

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/view/FinderView;->initValues(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    invoke-direct {p0}, Lcom/shopkick/app/view/FinderView;->initOnDraw()V

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/view/FinderView;F)F
    .locals 0

    .line 20
    iput p1, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/view/FinderView;)F
    .locals 0

    .line 20
    iget p0, p0, Lcom/shopkick/app/view/FinderView;->srcWidthPercent:F

    return p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/view/FinderView;F)F
    .locals 0

    .line 20
    iput p1, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/view/FinderView;)F
    .locals 0

    .line 20
    iget p0, p0, Lcom/shopkick/app/view/FinderView;->srcHeightPercent:F

    return p0
.end method

.method static synthetic access$402(Lcom/shopkick/app/view/FinderView;Landroid/animation/ValueAnimator;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    return-object p1
.end method

.method private initOnDraw()V
    .locals 4

    const/4 v0, 0x0

    .line 136
    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/FinderView;->setWillNotDraw(Z)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 137
    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/view/FinderView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 139
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/shopkick/app/view/FinderView;->cutoutPaint:Landroid/graphics/Paint;

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->cutoutPaint:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 142
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/shopkick/app/view/FinderView;->finderPaint:Landroid/graphics/Paint;

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->finderPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/shopkick/app/view/FinderView;->finderColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->finderPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->finderPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 147
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/view/FinderView;->roundedRectF:Landroid/graphics/RectF;

    return-void
.end method

.method private initValues(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 122
    :cond_0
    sget-object v0, Lcom/shopkick/app/R$styleable;->FinderView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x4

    const/high16 v0, 0x42c80000    # 100.0f

    .line 124
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    const/4 p2, 0x1

    .line 125
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    const/4 p2, 0x3

    const/4 v0, 0x0

    .line 126
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/view/FinderView;->radius:I

    const/4 p2, 0x2

    .line 128
    iget v1, p0, Lcom/shopkick/app/view/FinderView;->overlayColor:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/view/FinderView;->overlayColor:I

    .line 129
    iget p2, p0, Lcom/shopkick/app/view/FinderView;->finderColor:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/view/FinderView;->finderColor:I

    .line 131
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public cancelAnimation()V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 101
    iput-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 58
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    :cond_0
    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 152
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 154
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    .line 155
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v2, v0

    .line 156
    iget v3, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    mul-float/2addr v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v4, v1

    .line 157
    iget v5, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    mul-float/2addr v4, v5

    div-float/2addr v4, v3

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v3

    sub-int/2addr v1, v3

    .line 158
    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v2

    .line 159
    div-int/lit8 v0, v0, 0x2

    .line 161
    iget-object v4, p0, Lcom/shopkick/app/view/FinderView;->roundedRectF:Landroid/graphics/RectF;

    int-to-float v5, v0

    int-to-float v6, v1

    add-int/2addr v0, v2

    int-to-float v0, v0

    add-int/2addr v1, v3

    int-to-float v1, v1

    invoke-virtual {v4, v5, v6, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 162
    iget v0, p0, Lcom/shopkick/app/view/FinderView;->overlayColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->roundedRectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/shopkick/app/view/FinderView;->radius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/shopkick/app/view/FinderView;->cutoutPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->roundedRectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/shopkick/app/view/FinderView;->radius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/shopkick/app/view/FinderView;->finderPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public setFinderSize(FF)V
    .locals 0

    .line 106
    invoke-virtual {p0}, Lcom/shopkick/app/view/FinderView;->cancelAnimation()V

    .line 108
    iput p1, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    .line 109
    iput p2, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    .line 110
    invoke-virtual {p0}, Lcom/shopkick/app/view/FinderView;->invalidate()V

    return-void
.end method

.method public setRadius(I)V
    .locals 0

    .line 114
    iput p1, p0, Lcom/shopkick/app/view/FinderView;->radius:I

    .line 115
    invoke-virtual {p0}, Lcom/shopkick/app/view/FinderView;->invalidate()V

    return-void
.end method

.method public startAnimation(FFJ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    .line 68
    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/view/FinderView;->startAnimation(FFJLandroid/animation/TimeInterpolator;)V

    return-void
.end method

.method public startAnimation(FFJLandroid/animation/TimeInterpolator;)V
    .locals 1

    .line 72
    invoke-virtual {p0}, Lcom/shopkick/app/view/FinderView;->cancelAnimation()V

    .line 74
    iget v0, p0, Lcom/shopkick/app/view/FinderView;->widthPercent:F

    iput v0, p0, Lcom/shopkick/app/view/FinderView;->srcWidthPercent:F

    .line 75
    iget v0, p0, Lcom/shopkick/app/view/FinderView;->heightPercent:F

    iput v0, p0, Lcom/shopkick/app/view/FinderView;->srcHeightPercent:F

    const/4 v0, 0x2

    .line 77
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p3, p4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 79
    iget-object p3, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {p3, p5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 80
    iget-object p3, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    new-instance p4, Lcom/shopkick/app/view/FinderView$1;

    invoke-direct {p4, p0, p1, p2}, Lcom/shopkick/app/view/FinderView$1;-><init>(Lcom/shopkick/app/view/FinderView;FF)V

    invoke-virtual {p3, p4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/shopkick/app/view/FinderView$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/view/FinderView$2;-><init>(Lcom/shopkick/app/view/FinderView;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/view/FinderView;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
