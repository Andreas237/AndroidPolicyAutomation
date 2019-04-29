.class public Lcom/rt/mobile/english/ui/widget/LockableScrollView;
.super Landroid/widget/ScrollView;
.source "LockableScrollView.java"


# instance fields
.field private mScrollable:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    return-void
.end method


# virtual methods
.method public isScrollable()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 53
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 40
    :cond_0
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 42
    :cond_1
    iget-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    return p1
.end method

.method public setScrollingEnabled(Z)V
    .locals 0

    .line 28
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/widget/LockableScrollView;->mScrollable:Z

    return-void
.end method
