.class public Lcom/shopkick/app/widget/SKViewPager;
.super Landroid/support/v4/view/ViewPager;
.source "SKViewPager.java"


# instance fields
.field private mScroller:Ljava/lang/reflect/Field;

.field private pagingEnabled:Z

.field private scroller:Lcom/shopkick/app/widget/ViewPagerScroller;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lcom/shopkick/app/widget/SKViewPager;->mScroller:Ljava/lang/reflect/Field;

    .line 13
    iput-object p1, p0, Lcom/shopkick/app/widget/SKViewPager;->scroller:Lcom/shopkick/app/widget/ViewPagerScroller;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lcom/shopkick/app/widget/SKViewPager;->mScroller:Ljava/lang/reflect/Field;

    .line 13
    iput-object p1, p0, Lcom/shopkick/app/widget/SKViewPager;->scroller:Lcom/shopkick/app/widget/ViewPagerScroller;

    return-void
.end method


# virtual methods
.method protected canScroll(Landroid/view/View;ZIII)Z
    .locals 0

    .line 41
    invoke-super/range {p0 .. p5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z

    move-result p1

    return p1
.end method

.method public gotoBackPage()V
    .locals 1

    .line 77
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 79
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKViewPager;->setCurrentItem(I)V

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKViewPager;->requestLayout()V

    :cond_0
    return-void
.end method

.method public gotoNextPage()V
    .locals 2

    .line 69
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    .line 70
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKViewPager;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 71
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKViewPager;->setCurrentItem(I)V

    .line 72
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKViewPager;->requestLayout()V

    :cond_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 59
    :try_start_0
    iget-boolean v0, p0, Lcom/shopkick/app/widget/SKViewPager;->pagingEnabled:Z

    if-eqz v0, :cond_0

    .line 60
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/shopkick/app/widget/SKViewPager;->pagingEnabled:Z

    if-eqz v0, :cond_0

    .line 51
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setPagingEnabled(Z)V
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/shopkick/app/widget/SKViewPager;->pagingEnabled:Z

    return-void
.end method

.method public setViewPagerScrollerDelay(I)V
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/shopkick/app/widget/SKViewPager;->mScroller:Ljava/lang/reflect/Field;

    if-nez v0, :cond_0

    .line 27
    :try_start_0
    const-class v0, Landroid/support/v4/view/ViewPager;

    const-string v1, "mScroller"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/widget/SKViewPager;->mScroller:Ljava/lang/reflect/Field;

    .line 28
    iget-object v0, p0, Lcom/shopkick/app/widget/SKViewPager;->mScroller:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 29
    new-instance v0, Lcom/shopkick/app/widget/ViewPagerScroller;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKViewPager;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/shopkick/app/widget/ViewPagerScroller;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/shopkick/app/widget/SKViewPager;->scroller:Lcom/shopkick/app/widget/ViewPagerScroller;

    .line 30
    iget-object p1, p0, Lcom/shopkick/app/widget/SKViewPager;->mScroller:Ljava/lang/reflect/Field;

    iget-object v0, p0, Lcom/shopkick/app/widget/SKViewPager;->scroller:Lcom/shopkick/app/widget/ViewPagerScroller;

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
