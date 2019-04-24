.class public Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;
.super Lcom/shopkick/app/widget/UserEventConstraintLayout;
.source "CutoutAnimUserEventConstraintLayout.java"


# instance fields
.field private animator:Landroid/animation/ValueAnimator;

.field private cutoutPaint:Landroid/graphics/Paint;

.field private cutoutRadius:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/UserEventConstraintLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->initOnDraw()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/UserEventConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->initOnDraw()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/widget/UserEventConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->initOnDraw()V

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;F)F
    .locals 0

    .line 14
    iput p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    return p1
.end method

.method private initOnDraw()V
    .locals 3

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->setWillNotDraw(Z)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 82
    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->setLayerType(ILandroid/graphics/Paint;)V

    .line 84
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutPaint:Landroid/graphics/Paint;

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutPaint:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method


# virtual methods
.method public cancelAnimation()V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 70
    iput-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 104
    iget v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/16 v0, 0x1f

    const/4 v1, 0x0

    .line 105
    invoke-virtual {p1, v1, v1, v0}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 106
    invoke-super {p0, p1}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 108
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    .line 109
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-double v2, v0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 110
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    int-to-double v6, v1

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    add-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    iget v6, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    float-to-double v6, v6

    mul-double/2addr v2, v6

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 111
    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    int-to-float v2, v2

    iget-object v3, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 112
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0

    .line 115
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method

.method public hideWithAnimation(JLandroid/animation/AnimatorListenerAdapter;)V
    .locals 1

    .line 49
    invoke-virtual {p0}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cancelAnimation()V

    const/4 v0, 0x2

    .line 51
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    new-instance p2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 54
    iget-object p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout$1;-><init>(Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    if-eqz p3, :cond_0

    .line 61
    iget-object p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1, p3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 63
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    :cond_0
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->animator:Landroid/animation/ValueAnimator;

    .line 45
    invoke-super {p0}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 90
    invoke-super {p0, p1}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 93
    iget v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 94
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    .line 95
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-double v2, v0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 96
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    int-to-double v6, v1

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    add-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    iget v6, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    float-to-double v6, v6

    mul-double/2addr v2, v6

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 97
    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    int-to-float v2, v2

    iget-object v3, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public setCutoutRadius(F)V
    .locals 1

    const/4 v0, 0x0

    .line 74
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 75
    iput p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->cutoutRadius:F

    .line 76
    invoke-virtual {p0}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->invalidate()V

    return-void
.end method
