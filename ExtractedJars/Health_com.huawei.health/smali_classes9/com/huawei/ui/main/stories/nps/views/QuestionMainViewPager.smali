.class public Lcom/huawei/ui/main/stories/nps/views/QuestionMainViewPager;
.super Landroid/support/v4/view/ViewPager;
.source "SourceFile"


# instance fields
.field private isCloseSroll:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 10
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/views/QuestionMainViewPager;->isCloseSroll:Z

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 17
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/views/QuestionMainViewPager;->isCloseSroll:Z

    .line 18
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/views/QuestionMainViewPager;->isCloseSroll:Z

    if-eqz v0, :cond_0

    .line 27
    const/4 v0, 0x0

    return v0

    .line 29
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/views/QuestionMainViewPager;->isCloseSroll:Z

    if-eqz v0, :cond_0

    .line 35
    const/4 v0, 0x0

    return v0

    .line 37
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setDisableScroll(Z)V
    .locals 0

    .line 21
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/views/QuestionMainViewPager;->isCloseSroll:Z

    .line 22
    return-void
.end method
