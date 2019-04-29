.class public Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;
.super Landroid/widget/HorizontalScrollView;
.source "SlidingTabLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabClickListener;,
        Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;,
        Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;
    }
.end annotation


# static fields
.field private static final TAB_VIEW_PADDING_DIPS:I = 0x10

.field private static final TITLE_OFFSET_DIPS:I = 0x40


# instance fields
.field private final mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

.field private mTabViewLayoutId:I

.field private mTabViewTextViewId:I

.field private mTitleOffset:I

.field private mViewPager:Landroid/support/v4/view/ViewPager;

.field private mViewPagerPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 85
    invoke-direct {p0, p1, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 89
    invoke-direct {p0, p1, p2, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 93
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 96
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setHorizontalScrollBarEnabled(Z)V

    const/4 p3, 0x1

    .line 98
    invoke-virtual {p0, p3}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setFillViewport(Z)V

    .line 100
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x11

    if-lt p3, v0, :cond_0

    .line 101
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setLayoutDirection(I)V

    :cond_0
    const/high16 p3, 0x42800000    # 64.0f

    .line 104
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p3, v0

    float-to-int p3, p3

    iput p3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTitleOffset:I

    .line 106
    new-instance p3, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-direct {p3, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    .line 107
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->isRtlDirectionSupports()Z

    move-result p1

    const p3, 0x7f0700f3

    if-eqz p1, :cond_1

    .line 108
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p2, p3, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setPadding(IIII)V

    goto :goto_0

    .line 110
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p3, p2, p2, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setPadding(IIII)V

    .line 114
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    const/4 p2, -0x1

    const/4 p3, -0x2

    invoke-virtual {p0, p1, p2, p3}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->addView(Landroid/view/View;II)V

    return-void
.end method

.method static synthetic access$200(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    return-object p0
.end method

.method static synthetic access$300(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;II)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->scrollToTab(II)V

    return-void
.end method

.method static synthetic access$400(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mViewPagerPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mViewPager:Landroid/support/v4/view/ViewPager;

    return-object p0
.end method

.method private populateTabStrip()V
    .locals 8

    .line 214
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    .line 215
    new-instance v1, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabClickListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabClickListener;-><init>(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$1;)V

    const/4 v3, 0x0

    move v4, v3

    .line 217
    :goto_0
    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v5

    if-ge v4, v5, :cond_3

    .line 221
    iget v5, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabViewLayoutId:I

    if-eqz v5, :cond_0

    .line 223
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    iget v6, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabViewLayoutId:I

    iget-object v7, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v5, v6, v7, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 225
    iget v6, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabViewTextViewId:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    goto :goto_1

    :cond_0
    move-object v5, v2

    move-object v6, v5

    :goto_1
    if-nez v5, :cond_1

    .line 229
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->createDefaultTabView(Landroid/content/Context;)Landroid/widget/TextView;

    move-result-object v5

    :cond_1
    if-nez v6, :cond_2

    .line 232
    const-class v7, Landroid/widget/TextView;

    invoke-virtual {v7, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 233
    move-object v6, v5

    check-cast v6, Landroid/widget/TextView;

    .line 236
    :cond_2
    invoke-virtual {v0, v4}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 239
    iget-object v6, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v6, v5}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->addView(Landroid/view/View;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private scrollToTab(II)V
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_2

    if-ltz p1, :cond_2

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 260
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    add-int/2addr p1, p2

    .line 264
    iget p2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTitleOffset:I

    sub-int/2addr p1, p2

    const/4 p2, 0x0

    .line 267
    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->scrollTo(II)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected createDefaultTabView(Landroid/content/Context;)Landroid/widget/TextView;
    .locals 4

    .line 188
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/16 v1, 0x11

    .line 189
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    const v1, 0x7f1100f5

    .line 190
    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 191
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0600b3

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0xb

    if-lt p1, v2, :cond_0

    .line 196
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 197
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x101030e

    invoke-virtual {v2, v3, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 199
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 202
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt p1, v2, :cond_1

    .line 204
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_1
    const/high16 p1, 0x41800000    # 16.0f

    .line 207
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v1

    float-to-int p1, p1

    .line 208
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 245
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    .line 247
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->scrollToTab(II)V

    :cond_0
    return-void
.end method

.method public setCustomTabColorizer(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setCustomTabColorizer(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;)V

    return-void
.end method

.method public setCustomTabView(II)V
    .locals 0

    .line 162
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabViewLayoutId:I

    .line 163
    iput p2, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabViewTextViewId:I

    return-void
.end method

.method public varargs setDividerColors([I)V
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setDividerColors([I)V

    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mViewPagerPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method public varargs setSelectedIndicatorColors([I)V
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->setSelectedIndicatorColors([I)V

    return-void
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;)V
    .locals 2

    .line 171
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mTabStrip:Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->removeAllViews()V

    .line 173
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 175
    invoke-direct {p0, v0, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->scrollToTab(II)V

    .line 176
    new-instance v0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;-><init>(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$1;)V

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 177
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->populateTabStrip()V

    :cond_0
    return-void
.end method
