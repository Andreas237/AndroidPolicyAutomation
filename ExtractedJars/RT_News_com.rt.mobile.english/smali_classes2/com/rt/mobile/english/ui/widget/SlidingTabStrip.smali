.class Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;
.super Landroid/widget/LinearLayout;
.source "SlidingTabStrip.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;
    }
.end annotation


# static fields
.field private static final DEFAULT_BOTTOM_BORDER_COLOR_ALPHA:B = 0x26t

.field private static final DEFAULT_BOTTOM_BORDER_THICKNESS_DIPS:I = 0x2

.field private static final DEFAULT_DIVIDER_COLOR_ALPHA:B = 0x20t

.field private static final DEFAULT_DIVIDER_HEIGHT:F = 0.0f

.field private static final DEFAULT_SELECTED_INDICATOR_COLOR:I = -0x8843e1

.field private static final SELECTED_INDICATOR_THICKNESS_DIPS:I = 0x5


# instance fields
.field private final mBottomBorderPaint:Landroid/graphics/Paint;

.field private mCustomTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;

.field private final mDefaultBottomBorderColor:I

.field private final mDefaultTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

.field private final mSelectedIndicatorPaint:Landroid/graphics/Paint;

.field private final mSelectedIndicatorThickness:I

.field private mSelectedPosition:I

.field private mSelectionOffset:F


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 58
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 59
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setWillNotDraw(Z)V

    .line 61
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 62
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->isRtlDirectionSupports()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x5

    .line 63
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setGravity(I)V

    .line 65
    :cond_0
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v2, 0x1010030

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 67
    iget p1, v1, Landroid/util/TypedValue;->data:I

    const/16 v1, 0x26

    .line 69
    invoke-static {p1, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setColorAlpha(IB)I

    move-result v1

    iput v1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultBottomBorderColor:I

    .line 72
    new-instance v1, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;-><init>(Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$1;)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

    .line 73
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

    new-array v2, v3, [I

    const v4, -0x8843e1

    aput v4, v2, p2

    invoke-virtual {v1, v2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;->setIndicatorColors([I)V

    .line 74
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

    new-array v2, v3, [I

    const/16 v3, 0x20

    invoke-static {p1, v3}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setColorAlpha(IB)I

    move-result p1

    aput p1, v2, p2

    invoke-virtual {v1, v2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;->setDividerColors([I)V

    .line 77
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mBottomBorderPaint:Landroid/graphics/Paint;

    .line 78
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mBottomBorderPaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultBottomBorderColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p1, 0x40a00000    # 5.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    .line 80
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorThickness:I

    .line 81
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    return-void
.end method

.method private static blendColors(IIF)I
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    .line 189
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    .line 190
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p2

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v0

    add-float/2addr v2, v3

    .line 191
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr p0, p2

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, v0

    add-float/2addr p0, p1

    float-to-int p1, v1

    float-to-int p2, v2

    float-to-int p0, p0

    .line 192
    invoke-static {p1, p2, p0}, Landroid/graphics/Color;->rgb(III)I

    move-result p0

    return p0
.end method

.method private static setColorAlpha(IB)I
    .locals 2

    .line 178
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    invoke-static {p1, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 112
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getHeight()I

    move-result v0

    .line 113
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildCount()I

    move-result v1

    .line 114
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mCustomTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mCustomTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

    :goto_0
    if-lez v1, :cond_6

    .line 120
    iget v1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v1, :cond_3

    .line 121
    iget v1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 122
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v5

    .line 123
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    .line 124
    iget v6, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    invoke-interface {v2, v6}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;->getIndicatorColor(I)I

    move-result v6

    .line 126
    iget v7, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    cmpl-float v3, v7, v3

    if-lez v3, :cond_2

    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildCount()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ge v3, v7, :cond_2

    .line 127
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v2, v3}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;->getIndicatorColor(I)I

    move-result v2

    if-eq v6, v2, :cond_1

    .line 129
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    invoke-static {v2, v6, v3}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->blendColors(IIF)I

    move-result v2

    move v6, v2

    .line 133
    :cond_1
    iget v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 134
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v3, v7

    iget v7, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    sub-float v7, v4, v7

    int-to-float v5, v5

    mul-float/2addr v7, v5

    add-float/2addr v3, v7

    float-to-int v5, v3

    .line 136
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v3, v2

    iget v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    sub-float/2addr v4, v2

    int-to-float v1, v1

    mul-float/2addr v4, v1

    add-float/2addr v3, v4

    float-to-int v1, v3

    .line 140
    :cond_2
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v8, v5

    .line 142
    iget v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorThickness:I

    sub-int v2, v0, v2

    int-to-float v9, v2

    int-to-float v10, v1

    int-to-float v11, v0

    iget-object v12, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 145
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 146
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v5

    .line 147
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    .line 148
    iget v6, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    invoke-interface {v2, v6}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;->getIndicatorColor(I)I

    move-result v6

    .line 150
    iget v7, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    cmpl-float v3, v7, v3

    if-lez v3, :cond_5

    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildCount()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ge v3, v7, :cond_5

    .line 151
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v2, v3}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;->getIndicatorColor(I)I

    move-result v2

    if-eq v6, v2, :cond_4

    .line 153
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    invoke-static {v2, v6, v3}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->blendColors(IIF)I

    move-result v2

    move v6, v2

    .line 157
    :cond_4
    iget v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 158
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v3, v7

    iget v7, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    sub-float v7, v4, v7

    int-to-float v5, v5

    mul-float/2addr v7, v5

    add-float/2addr v3, v7

    float-to-int v5, v3

    .line 160
    iget v3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v3, v2

    iget v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    sub-float/2addr v4, v2

    int-to-float v1, v1

    mul-float/2addr v4, v1

    add-float/2addr v3, v4

    float-to-int v1, v3

    .line 164
    :cond_5
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v8, v5

    .line 166
    iget v2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorThickness:I

    sub-int v2, v0, v2

    int-to-float v9, v2

    int-to-float v10, v1

    int-to-float v11, v0

    iget-object v12, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedIndicatorPaint:Landroid/graphics/Paint;

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_6
    :goto_1
    return-void
.end method

.method onViewPagerPageChanged(IF)V
    .locals 0

    .line 105
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectedPosition:I

    .line 106
    iput p2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mSelectionOffset:F

    .line 107
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->invalidate()V

    return-void
.end method

.method setCustomTabColorizer(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mCustomTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;

    .line 87
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->invalidate()V

    return-void
.end method

.method varargs setDividerColors([I)V
    .locals 1

    const/4 v0, 0x0

    .line 99
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mCustomTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;

    .line 100
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;->setDividerColors([I)V

    .line 101
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->invalidate()V

    return-void
.end method

.method varargs setSelectedIndicatorColors([I)V
    .locals 1

    const/4 v0, 0x0

    .line 92
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mCustomTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;

    .line 93
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->mDefaultTabColorizer:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip$SimpleTabColorizer;->setIndicatorColors([I)V

    .line 94
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->invalidate()V

    return-void
.end method
