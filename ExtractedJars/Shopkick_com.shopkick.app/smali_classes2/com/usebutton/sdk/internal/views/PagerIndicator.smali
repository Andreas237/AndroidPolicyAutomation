.class public Lcom/usebutton/sdk/internal/views/PagerIndicator;
.super Landroid/widget/LinearLayout;
.source "PagerIndicator.java"


# instance fields
.field private mOnPageChanged:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private mPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance p1, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;-><init>(Lcom/usebutton/sdk/internal/views/PagerIndicator;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mOnPageChanged:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    new-instance p1, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;-><init>(Lcom/usebutton/sdk/internal/views/PagerIndicator;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mOnPageChanged:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    new-instance p1, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;-><init>(Lcom/usebutton/sdk/internal/views/PagerIndicator;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mOnPageChanged:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 45
    new-instance p1, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;-><init>(Lcom/usebutton/sdk/internal/views/PagerIndicator;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mOnPageChanged:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/views/PagerIndicator;)Landroid/support/v4/view/ViewPager;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mPager:Landroid/support/v4/view/ViewPager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/views/PagerIndicator;I)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->refresh(I)V

    return-void
.end method

.method private createChildren(I)V
    .locals 1

    .line 87
    :goto_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getChildCount()I

    move-result v0

    if-le v0, p1, :cond_0

    const/4 v0, 0x0

    .line 88
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->removeViewAt(I)V

    goto :goto_0

    .line 91
    :cond_0
    :goto_1
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getChildCount()I

    move-result v0

    if-ge v0, p1, :cond_1

    .line 92
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->createDot()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private createDot()Landroid/view/View;
    .locals 4

    .line 97
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 98
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$dimen;->btn_pager_dot_size:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 99
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/usebutton/sdk/R$dimen;->btn_pager_dot_margin:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 100
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 101
    invoke-virtual {v3, v2, v2, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 102
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    sget v1, Lcom/usebutton/sdk/R$drawable;->btn_dot:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    return-object v0
.end method

.method private refresh(I)V
    .locals 4

    .line 76
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    .line 77
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getChildCount()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 78
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->createChildren(I)V

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    .line 80
    :goto_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 81
    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne v1, p1, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public setPager(Landroid/support/v4/view/ViewPager;)V
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mPager:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 37
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mOnPageChanged:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->removeOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 39
    :cond_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mPager:Landroid/support/v4/view/ViewPager;

    .line 40
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mOnPageChanged:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 41
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->refresh(I)V

    .line 42
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->setVisibility(I)V

    return-void
.end method
