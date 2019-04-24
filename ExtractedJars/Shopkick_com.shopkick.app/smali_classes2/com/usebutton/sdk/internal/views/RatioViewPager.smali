.class public Lcom/usebutton/sdk/internal/views/RatioViewPager;
.super Landroid/support/v4/view/ViewPager;
.source "RatioViewPager.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "RatioViewPager"


# instance fields
.field private mHeightToWidth:F

.field private mWidthToHeight:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/views/RatioViewPager;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private init(Landroid/util/AttributeSet;)V
    .locals 5

    .line 30
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/RatioViewPager;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_RatioViewPager:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_2

    .line 34
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 36
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_RatioViewPager_btn_width_to_height_ratio:I

    if-ne v3, v4, :cond_0

    .line 37
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, p0, Lcom/usebutton/sdk/internal/views/RatioViewPager;->mWidthToHeight:F

    .line 39
    :cond_0
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_internal_views_RatioViewPager_btn_height_to_width_ratio:I

    if-ne v3, v4, :cond_1

    .line 40
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lcom/usebutton/sdk/internal/views/RatioViewPager;->mHeightToWidth:F

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 43
    :cond_2
    iget v0, p0, Lcom/usebutton/sdk/internal/views/RatioViewPager;->mWidthToHeight:F

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_3

    iget v0, p0, Lcom/usebutton/sdk/internal/views/RatioViewPager;->mHeightToWidth:F

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_3

    const-string v0, "RatioViewPager"

    const-string v1, "No width or height ratio specified, please set using e.g. \"button:btn_height_to_width_ratio=\"1.5\" or \"button:btn_width_to_height_ratio=\"0.4\".  "

    .line 44
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 45
    iput v0, p0, Lcom/usebutton/sdk/internal/views/RatioViewPager;->mWidthToHeight:F

    .line 47
    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 7

    .line 52
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 54
    iget p2, p0, Lcom/usebutton/sdk/internal/views/RatioViewPager;->mWidthToHeight:F

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x3

    const/4 v5, 0x0

    if-lez v1, :cond_0

    int-to-float v0, p1

    mul-float/2addr v0, p2

    float-to-int v0, v0

    const-string v1, "RatioViewPager"

    const-string v6, "Measured with fraction (W/H) %f to %dx%d"

    .line 56
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v4, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v4, v2

    invoke-static {v1, v6, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 57
    :cond_0
    iget v1, p0, Lcom/usebutton/sdk/internal/views/RatioViewPager;->mHeightToWidth:F

    cmpl-float v0, v1, v0

    if-lez v0, :cond_1

    int-to-float v0, p1

    div-float/2addr v0, v1

    float-to-int v0, v0

    const-string v1, "RatioViewPager"

    const-string v6, "Measured with fraction %f (H/W) to %dx%d"

    .line 59
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v4, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v4, v2

    invoke-static {v1, v6, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move v0, v5

    :goto_0
    const/high16 p2, 0x40000000    # 2.0f

    .line 61
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->onMeasure(II)V

    return-void
.end method
