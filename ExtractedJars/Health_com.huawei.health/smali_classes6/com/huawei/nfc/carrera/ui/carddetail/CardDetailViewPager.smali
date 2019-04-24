.class public Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;
.super Landroid/support/v4/view/ViewPager;
.source "SourceFile"


# instance fields
.field private isAllowScroll:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    .line 33
    return-void
.end method


# virtual methods
.method public isCanScroll()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    if-eqz v0, :cond_0

    .line 63
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 67
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    if-eqz v0, :cond_0

    .line 49
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 53
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    return v0
.end method

.method public setAllowScroll(Z)V
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->isAllowScroll:Z

    .line 27
    return-void
.end method
