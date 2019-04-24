.class public Lcom/shopkick/app/util/FrameConfigurator;
.super Ljava/lang/Object;
.source "FrameConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;
    }
.end annotation


# static fields
.field public static final ANDROID:Ljava/lang/String; = "android"

.field public static final DIMEN:Ljava/lang/String; = "dimen"

.field public static final NAVIGATION_BAR_HEIGHT:Ljava/lang/String; = "navigation_bar_height"

.field public static final STATUS_BAR_HEIGHT:Ljava/lang/String; = "status_bar_height"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static density(Landroid/view/View;)F
    .locals 0

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    return p0
.end method

.method public static dipDimension(ILandroid/view/View;)I
    .locals 0

    if-nez p1, :cond_0

    return p0

    :cond_0
    int-to-float p0, p0

    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method private static displayMetrics(Landroid/content/Context;)Landroid/util/DisplayMetrics;
    .locals 0

    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    return-object p0
.end method

.method public static getMaxScaleFactor(FFFIIIIII)F
    .locals 0

    add-int/2addr p5, p7

    int-to-float p5, p5

    mul-float/2addr p5, p0

    sub-float/2addr p1, p5

    int-to-float p3, p3

    mul-float/2addr p3, p0

    div-float/2addr p1, p3

    add-int/2addr p6, p8

    int-to-float p3, p6

    mul-float/2addr p3, p0

    sub-float p5, p2, p3

    int-to-float p4, p4

    mul-float/2addr p4, p0

    div-float/2addr p5, p4

    mul-float/2addr p4, p1

    add-float/2addr p4, p3

    cmpl-float p0, p4, p2

    if-lez p0, :cond_0

    return p5

    :cond_0
    return p1
.end method

.method public static getOnScreenSoftKeysHeight(Landroid/content/res/Resources;)I
    .locals 3

    const-string v0, "navigation_bar_height"

    const-string v1, "dimen"

    const-string v2, "android"

    .line 208
    invoke-virtual {p0, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 210
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static getStatusBarHeight(Landroid/content/res/Resources;)I
    .locals 3

    const-string/jumbo v0, "status_bar_height"

    const-string v1, "dimen"

    const-string v2, "android"

    .line 217
    invoke-virtual {p0, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 219
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0

    :cond_0
    const/high16 v0, 0x41c80000    # 25.0f

    .line 221
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p0, v0

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    return p0
.end method

.method public static maxScreenHeight(Landroid/content/Context;)I
    .locals 0

    .line 64
    invoke-static {p0}, Lcom/shopkick/app/util/FrameConfigurator;->displayMetrics(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object p0

    .line 65
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    return p0
.end method

.method public static maxScreenWidth(Landroid/content/Context;)I
    .locals 0

    .line 77
    invoke-static {p0}, Lcom/shopkick/app/util/FrameConfigurator;->displayMetrics(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    return p0
.end method

.method public static pixelDimension(ILandroid/content/Context;)I
    .locals 0

    if-nez p1, :cond_0

    return p0

    :cond_0
    int-to-float p0, p0

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static pixelDimension(ILandroid/view/View;)I
    .locals 0

    if-nez p1, :cond_0

    return p0

    :cond_0
    int-to-float p0, p0

    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static screenHeightWithoutStatusBar(Landroid/content/Context;)I
    .locals 1

    .line 70
    invoke-static {p0}, Lcom/shopkick/app/util/FrameConfigurator;->displayMetrics(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p0}, Lcom/shopkick/app/util/FrameConfigurator;->getStatusBarHeight(Landroid/content/res/Resources;)I

    move-result p0

    .line 72
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    sub-int/2addr v0, p0

    return v0
.end method

.method public static setFrameForView(Lcom/shopkick/app/fetchers/api/skapi/Rectangle;Landroid/view/View;)Z
    .locals 14

    .line 123
    invoke-static {p1}, Lcom/shopkick/app/util/FrameConfigurator;->density(Landroid/view/View;)F

    move-result v0

    .line 126
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/Rectangle;->width:Ljava/lang/Double;

    const/4 v2, -0x1

    const-wide v3, 0x40f86a0000000000L    # 100000.0

    const/4 v5, -0x2

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v1, :cond_1

    .line 128
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    cmpl-double v9, v9, v3

    if-nez v9, :cond_0

    move v1, v2

    move v9, v8

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Double;->intValue()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    add-float/2addr v1, v6

    float-to-int v1, v1

    move v9, v7

    goto :goto_0

    :cond_1
    move v1, v5

    move v9, v7

    .line 137
    :goto_0
    iget-object v10, p0, Lcom/shopkick/app/fetchers/api/skapi/Rectangle;->height:Ljava/lang/Double;

    if-eqz v10, :cond_3

    .line 139
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    cmpl-double v3, v11, v3

    if-nez v3, :cond_2

    move v9, v8

    goto :goto_1

    .line 143
    :cond_2
    invoke-virtual {v10}, Ljava/lang/Double;->intValue()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    add-float/2addr v2, v6

    float-to-int v2, v2

    goto :goto_1

    :cond_3
    move v2, v5

    .line 152
    :goto_1
    iget-object v3, p0, Lcom/shopkick/app/fetchers/api/skapi/Rectangle;->x:Ljava/lang/Double;

    if-eqz v3, :cond_6

    .line 154
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    const-wide v10, 0x4109a28000000000L    # 210000.0

    cmpl-double v4, v4, v10

    if-nez v4, :cond_4

    move v4, v7

    move v5, v4

    move v3, v8

    move v9, v3

    goto :goto_2

    .line 157
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    const-wide v10, 0x410adb0000000000L    # 220000.0

    cmpl-double v4, v4, v10

    if-nez v4, :cond_5

    move v3, v7

    move v4, v3

    move v5, v8

    move v9, v5

    goto :goto_2

    .line 161
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Double;->intValue()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v0

    add-float/2addr v3, v6

    float-to-int v3, v3

    move v4, v3

    move v3, v7

    move v5, v3

    goto :goto_2

    :cond_6
    move v3, v7

    move v4, v3

    move v5, v4

    .line 166
    :goto_2
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/Rectangle;->y:Ljava/lang/Double;

    if-eqz p0, :cond_9

    .line 168
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    const-wide v12, 0x4112ebc000000000L    # 310000.0

    cmpl-double v10, v10, v12

    if-nez v10, :cond_7

    move p0, v7

    move v0, p0

    move v9, v8

    goto :goto_3

    .line 171
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    const-wide v12, 0x4113880000000000L    # 320000.0

    cmpl-double v10, v10, v12

    if-nez v10, :cond_8

    move p0, v7

    move v0, v8

    move v9, v0

    move v8, p0

    goto :goto_3

    .line 175
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Double;->intValue()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr p0, v0

    add-float/2addr p0, v6

    float-to-int p0, p0

    move v0, v7

    move v8, v0

    goto :goto_3

    :cond_9
    move p0, v7

    move v0, p0

    move v8, v0

    .line 179
    :goto_3
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v6, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 180
    invoke-virtual {v6, v4, p0, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    if-eqz v8, :cond_a

    const/16 p0, 0xa

    .line 183
    invoke-virtual {v6, p0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_4

    :cond_a
    if-eqz v0, :cond_b

    const/16 p0, 0xc

    .line 185
    invoke-virtual {v6, p0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :cond_b
    :goto_4
    if-eqz v3, :cond_c

    const/16 p0, 0x9

    .line 190
    invoke-virtual {v6, p0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_5

    :cond_c
    if-eqz v5, :cond_d

    const/16 p0, 0xb

    .line 192
    invoke-virtual {v6, p0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 194
    :cond_d
    :goto_5
    invoke-virtual {p1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return v9
.end method

.method public static setHeight(Landroid/view/View;I)V
    .locals 1

    .line 199
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {p1, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p0

    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return-void
.end method

.method public static setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V
    .locals 7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 81
    invoke-static/range {v0 .. v6}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;IIIIII)V

    return-void
.end method

.method public static setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;IIIIII)V
    .locals 2

    .line 91
    invoke-static {p0}, Lcom/shopkick/app/util/FrameConfigurator;->density(Landroid/view/View;)F

    move-result v0

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    add-int/2addr p3, p5

    int-to-float p3, p3

    mul-float/2addr p3, v0

    sub-float p3, v1, p3

    int-to-float p1, p1

    mul-float/2addr p1, v0

    div-float/2addr p3, p1

    int-to-float p1, p2

    mul-float/2addr p1, v0

    mul-float/2addr p1, p3

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 96
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p3

    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 97
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    int-to-float p1, p1

    add-int/2addr p4, p6

    int-to-float p3, p4

    mul-float/2addr p3, v0

    add-float/2addr p1, p3

    float-to-int p1, p1

    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 98
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static setLayoutParamsWithScaleFactor(Landroid/view/View;FZ)V
    .locals 1

    .line 264
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez p2, :cond_0

    .line 266
    iget p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float p2, p2

    mul-float/2addr p2, p1

    float-to-int p2, p2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 268
    :cond_0
    iget p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float p2, p2

    mul-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 269
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static setLayoutParamsWithScaling(Landroid/view/View;I)V
    .locals 2

    .line 103
    invoke-static {p0}, Lcom/shopkick/app/util/FrameConfigurator;->density(Landroid/view/View;)F

    move-result v0

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    int-to-float p1, p1

    mul-float/2addr p1, v0

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 107
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    float-to-int p1, p1

    .line 108
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 109
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static setWidth(Landroid/view/View;I)V
    .locals 1

    .line 203
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {p1, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p0

    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    return-void
.end method
