.class public Lhuawei/widget/HwProgressBar;
.super Landroid/widget/ProgressBar;
.source "SourceFile"


# static fields
.field private static final DEFAULT_COLOR:I = -0x99999a


# instance fields
.field private mFillColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 25
    invoke-direct {p0, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 26
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lhuawei/widget/HwProgressBar;->initialize(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwProgressBar;->initialize(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lhuawei/widget/HwProgressBar;->initialize(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    return-void
.end method

.method private initEmuiStyle()V
    .locals 6

    .line 48
    invoke-virtual {p0}, Lhuawei/widget/HwProgressBar;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p0}, Lhuawei/widget/HwProgressBar;->getMinimumHeight()I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lhuawei/widget/HwProgressBar;->getMinimumHeight()I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwProgressBar;->getMinimumWidth()I

    move-result v5

    .line 49
    :goto_0
    new-instance v0, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;

    invoke-virtual {p0}, Lhuawei/widget/HwProgressBar;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lhuawei/widget/HwProgressBar;->mFillColor:I

    invoke-direct {v0, v1, v5, v2}, Lhuawei/graphics/drawable/HwLoadingDrawableImpl;-><init>(Landroid/content/res/Resources;II)V

    invoke-virtual {p0, v0}, Lhuawei/widget/HwProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    new-instance v0, Lo/flf;

    const v1, 0x3ec28f5c    # 0.38f

    const v2, 0x3dcccccd    # 0.1f

    const/4 v3, 0x0

    const v4, 0x3f6e147b    # 0.93f

    invoke-direct {v0, v1, v2, v3, v4}, Lo/flf;-><init>(FFFF)V

    invoke-virtual {p0, v0}, Lhuawei/widget/HwProgressBar;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 52
    return-void
.end method

.method private initialize(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 40
    sget-object v0, Lhuawei/widget/hwprogressbar/R$styleable;->HwProgressBar:[I

    sget v1, Lhuawei/widget/hwprogressbar/R$style;->Widget_Emui_ProgressBar:I

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 42
    sget v0, Lhuawei/widget/hwprogressbar/R$styleable;->HwProgressBar_fillColor:I

    const v1, -0x99999a

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwProgressBar;->mFillColor:I

    .line 43
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 44
    invoke-direct {p0}, Lhuawei/widget/HwProgressBar;->initEmuiStyle()V

    .line 45
    return-void
.end method
