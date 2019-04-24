.class public Lcom/shopkick/app/widget/PageIndicator;
.super Ljava/lang/Object;
.source "PageIndicator.java"


# static fields
.field public static final INDICATOR_LAYOUT_TAG:Ljava/lang/String; = "INDICATOR_LAYOUT_TAG"

.field public static final PAGE_INDICATOR_MARGIN:I = 0x5


# instance fields
.field private activeIndicatorResId:I

.field private context:Landroid/content/Context;

.field private density:F

.field private inactiveIndicatorResId:I

.field private indicatorMargin:I

.field private lastSelected:I

.field private parentView:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/widget/PageIndicator;->context:Landroid/content/Context;

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->density:F

    const p1, 0x7f080235

    .line 27
    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->activeIndicatorResId:I

    const p1, 0x7f080236

    .line 28
    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->inactiveIndicatorResId:I

    const/4 p1, 0x5

    .line 29
    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->indicatorMargin:I

    return-void
.end method

.method private getIndicators(IIII)Landroid/widget/LinearLayout;
    .locals 7

    .line 83
    iput p2, p0, Lcom/shopkick/app/widget/PageIndicator;->lastSelected:I

    .line 84
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/shopkick/app/widget/PageIndicator;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v1, "INDICATOR_LAYOUT_TAG"

    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0x11

    .line 86
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_1

    .line 88
    new-instance v3, Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/shopkick/app/widget/PageIndicator;->context:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 89
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v4, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 91
    iget v5, p0, Lcom/shopkick/app/widget/PageIndicator;->indicatorMargin:I

    invoke-direct {p0, v5}, Lcom/shopkick/app/widget/PageIndicator;->scalePixels(I)I

    move-result v5

    iget v6, p0, Lcom/shopkick/app/widget/PageIndicator;->indicatorMargin:I

    .line 93
    invoke-direct {p0, v6}, Lcom/shopkick/app/widget/PageIndicator;->scalePixels(I)I

    move-result v6

    .line 91
    invoke-virtual {v3, v5, v1, v6, v1}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 95
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    if-ne v2, p2, :cond_0

    .line 98
    invoke-virtual {v3, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 100
    :cond_0
    invoke-virtual {v3, p4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 102
    :goto_1
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private removePreviousIndicator(Landroid/widget/RelativeLayout;)V
    .locals 1

    const-string v0, "INDICATOR_LAYOUT_TAG"

    .line 58
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private scalePixels(I)I
    .locals 1

    int-to-float p1, p1

    .line 51
    iget v0, p0, Lcom/shopkick/app/widget/PageIndicator;->density:F

    mul-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method


# virtual methods
.method public configureIndicators(Landroid/widget/RelativeLayout;II)V
    .locals 2

    .line 68
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/PageIndicator;->removePreviousIndicator(Landroid/widget/RelativeLayout;)V

    .line 69
    iput-object p1, p0, Lcom/shopkick/app/widget/PageIndicator;->parentView:Landroid/widget/RelativeLayout;

    .line 70
    iget v0, p0, Lcom/shopkick/app/widget/PageIndicator;->activeIndicatorResId:I

    iget v1, p0, Lcom/shopkick/app/widget/PageIndicator;->inactiveIndicatorResId:I

    invoke-direct {p0, p2, p3, v0, v1}, Lcom/shopkick/app/widget/PageIndicator;->getIndicators(IIII)Landroid/widget/LinearLayout;

    move-result-object p2

    .line 74
    new-instance p3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x1

    invoke-direct {p3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 76
    iget v0, p0, Lcom/shopkick/app/widget/PageIndicator;->indicatorMargin:I

    invoke-direct {p0, v0}, Lcom/shopkick/app/widget/PageIndicator;->scalePixels(I)I

    move-result v0

    iput v0, p3, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    const/16 v0, 0xb

    .line 77
    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 78
    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 79
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public selectIndicator(I)V
    .locals 3

    .line 111
    iget v0, p0, Lcom/shopkick/app/widget/PageIndicator;->lastSelected:I

    if-eq v0, p1, :cond_0

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/widget/PageIndicator;->parentView:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 116
    iget-object v1, p0, Lcom/shopkick/app/widget/PageIndicator;->parentView:Landroid/widget/RelativeLayout;

    iget v2, p0, Lcom/shopkick/app/widget/PageIndicator;->lastSelected:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 118
    iget v2, p0, Lcom/shopkick/app/widget/PageIndicator;->activeIndicatorResId:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 119
    iget v0, p0, Lcom/shopkick/app/widget/PageIndicator;->inactiveIndicatorResId:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 120
    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->lastSelected:I

    :cond_0
    return-void
.end method

.method public setActiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;
    .locals 0

    .line 33
    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->activeIndicatorResId:I

    return-object p0
.end method

.method public setInactiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;
    .locals 0

    .line 38
    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->inactiveIndicatorResId:I

    return-object p0
.end method

.method public setIndicatorMargin(I)Lcom/shopkick/app/widget/PageIndicator;
    .locals 0

    .line 43
    iput p1, p0, Lcom/shopkick/app/widget/PageIndicator;->indicatorMargin:I

    return-object p0
.end method
