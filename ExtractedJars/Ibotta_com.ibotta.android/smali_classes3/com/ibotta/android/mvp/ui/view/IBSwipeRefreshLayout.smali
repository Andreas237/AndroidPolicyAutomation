.class public Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
.super Landroid/support/v4/widget/SwipeRefreshLayout;
.source "IBSwipeRefreshLayout.java"


# static fields
.field private static final MINIMUM_CHILD_COUNT:I = 0x2


# instance fields
.field private enabled:Z

.field private previousX:F

.field private previousY:F

.field private touchSlop:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->touchSlop:I

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    return v1

    .line 44
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->enabled:Z

    if-eqz v0, :cond_1

    .line 45
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 51
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 53
    iget v3, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->previousX:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 54
    iget v3, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->previousY:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 55
    iget v3, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->touchSlop:I

    int-to-float v3, v3

    cmpl-float v3, v0, v3

    if-lez v3, :cond_1

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    .line 56
    invoke-super {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    return v1

    :pswitch_1
    const/4 v0, 0x1

    .line 61
    invoke-super {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    goto :goto_0

    .line 47
    :pswitch_2
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->previousX:F

    .line 48
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->previousY:F

    .line 64
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 69
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;->enabled:Z

    .line 70
    invoke-super {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    return-void
.end method
