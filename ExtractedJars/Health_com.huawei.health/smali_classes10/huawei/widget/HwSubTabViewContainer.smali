.class public Lhuawei/widget/HwSubTabViewContainer;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;
    }
.end annotation


# static fields
.field private static final ANIMATION_DURATION:I = 0xc8


# instance fields
.field private mScrollAnimator:Landroid/animation/ValueAnimator;

.field private mSubTabItemMargin:I

.field private final mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSubTabViewContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwSubTabViewContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer;->setHorizontalScrollBarEnabled(Z)V

    .line 46
    new-instance v0, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-direct {v0, p1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    .line 47
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/4 v2, 0x0

    invoke-super {p0, v0, v2, v1}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 49
    return-void
.end method

.method private calculateScrollXForTab(IF)I
    .locals 9

    .line 160
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, p1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 161
    add-int/lit8 v0, p1, 0x1

    iget-object v1, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    add-int/lit8 v1, p1, 0x1

    .line 162
    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 164
    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 165
    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 168
    :goto_2
    const/4 v7, 0x0

    .line 169
    if-eqz v3, :cond_3

    .line 170
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v0

    div-int/lit8 v1, v5, 0x2

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int v7, v0, v1

    .line 173
    :cond_3
    add-int v0, v5, v6

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    iget v1, p0, Lhuawei/widget/HwSubTabViewContainer;->mSubTabItemMargin:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v0, v1

    mul-float/2addr v0, p2

    float-to-int v8, v0

    .line 175
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getLayoutDirection()I

    move-result v0

    if-nez v0, :cond_4

    add-int v0, v7, v8

    goto :goto_3

    :cond_4
    sub-int v0, v7, v8

    :goto_3
    return v0
.end method

.method private ensureScrollAnimator()V
    .locals 3

    .line 113
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    .line 114
    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    .line 115
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    sget-object v1, Lhuawei/widget/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 116
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 117
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lhuawei/widget/HwSubTabViewContainer$1;

    invoke-direct {v1, p0}, Lhuawei/widget/HwSubTabViewContainer$1;-><init>(Lhuawei/widget/HwSubTabViewContainer;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 124
    :cond_0
    return-void
.end method


# virtual methods
.method public animateToTab(I)V
    .locals 5

    .line 87
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 88
    return-void

    .line 90
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    .line 91
    invoke-virtual {v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->childrenNeedLayout()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lhuawei/widget/HwSubTabViewContainer;->setScrollPosition(IF)V

    .line 95
    return-void

    .line 98
    :cond_2
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getScrollX()I

    move-result v3

    .line 99
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwSubTabViewContainer;->calculateScrollXForTab(IF)I

    move-result v4

    .line 101
    if-eq v3, v4, :cond_3

    .line 102
    invoke-direct {p0}, Lhuawei/widget/HwSubTabViewContainer;->ensureScrollAnimator()V

    .line 104
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v3, v1, v2

    const/4 v2, 0x1

    aput v4, v1, v2

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 105
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 109
    :cond_3
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    const/16 v1, 0xc8

    invoke-virtual {v0, p1, v1}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->animateIndicatorToPosition(II)V

    .line 110
    return-void
.end method

.method public canScroll()Z
    .locals 5

    .line 181
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 182
    if-eqz v3, :cond_1

    .line 183
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 184
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getPaddingStart()I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getPaddingEnd()I

    move-result v2

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 186
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method dpToPx(I)I
    .locals 2

    .line 392
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float v1, p1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method protected getLeftFadingEdgeStrength()F
    .locals 1

    .line 74
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method protected getRightFadingEdgeStrength()F
    .locals 1

    .line 69
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getmTabStrip()Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;
    .locals 1

    .line 79
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .line 53
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->canScroll()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_fading_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 58
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_item_margin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    sub-float/2addr v0, v1

    float-to-int v4, v0

    .line 59
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v3, v4, v0, v4, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 60
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer;->setHorizontalFadingEdgeEnabled(Z)V

    .line 61
    invoke-virtual {p0}, Lhuawei/widget/HwSubTabViewContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_fading_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSubTabViewContainer;->setFadingEdgeLength(I)V

    goto :goto_0

    .line 63
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v3, v4, v0, v4, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 65
    :goto_0
    return-void
.end method

.method public setScrollPosition(IF)V
    .locals 1

    .line 135
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lhuawei/widget/HwSubTabViewContainer;->setScrollPosition(IFZ)V

    .line 136
    return-void
.end method

.method public setScrollPosition(IFZ)V
    .locals 3

    .line 140
    int-to-float v0, p1

    add-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 141
    if-ltz v2, :cond_0

    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->getChildCount()I

    move-result v0

    if-lt v2, v0, :cond_1

    .line 142
    :cond_0
    return-void

    .line 146
    :cond_1
    if-eqz p3, :cond_2

    .line 147
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mTabStrip:Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;

    invoke-virtual {v0, p1, p2}, Lhuawei/widget/HwSubTabViewContainer$SlidingTabStrip;->setIndicatorPositionFromTabPosition(IF)V

    .line 151
    :cond_2
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    iget-object v0, p0, Lhuawei/widget/HwSubTabViewContainer;->mScrollAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 154
    :cond_3
    invoke-direct {p0, p1, p2}, Lhuawei/widget/HwSubTabViewContainer;->calculateScrollXForTab(IF)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lhuawei/widget/HwSubTabViewContainer;->scrollTo(II)V

    .line 155
    return-void
.end method

.method setSubTabItemMargin(I)V
    .locals 0

    .line 83
    iput p1, p0, Lhuawei/widget/HwSubTabViewContainer;->mSubTabItemMargin:I

    .line 84
    return-void
.end method
