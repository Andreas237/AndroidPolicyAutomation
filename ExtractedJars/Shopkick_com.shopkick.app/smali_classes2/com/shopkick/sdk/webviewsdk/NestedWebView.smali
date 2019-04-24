.class public Lcom/shopkick/sdk/webviewsdk/NestedWebView;
.super Landroid/webkit/WebView;
.source "NestedWebView.java"

# interfaces
.implements Landroid/support/v4/view/NestedScrollingChild;


# instance fields
.field private mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

.field private mLastY:I

.field private mNestedOffsetY:I

.field private final mScrollConsumed:[I

.field private final mScrollOffset:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0}, Lcom/shopkick/sdk/webviewsdk/NestedWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010085

    .line 24
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/sdk/webviewsdk/NestedWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x2

    .line 14
    new-array p2, p1, [I

    iput-object p2, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollOffset:[I

    .line 15
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollConsumed:[I

    .line 29
    new-instance p1, Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-direct {p1, p0}, Landroid/support/v4/view/NestedScrollingChildHelper;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    const/4 p1, 0x1

    .line 30
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->setNestedScrollingEnabled(Z)V

    return-void
.end method


# virtual methods
.method public dispatchNestedFling(FFZ)Z
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[I)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    .line 108
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[I)Z

    move-result p1

    return p1
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->hasNestedScrollingParent()Z

    move-result v0

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 37
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    .line 38
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 40
    iput v1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mNestedOffsetY:I

    .line 42
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 43
    iget v3, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mNestedOffsetY:I

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 46
    :pswitch_0
    iget v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mLastY:I

    sub-int/2addr v0, v2

    .line 48
    iget-object v3, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollConsumed:[I

    iget-object v5, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollOffset:[I

    invoke-virtual {p0, v1, v0, v3, v5}, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->dispatchNestedPreScroll(II[I[I)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 49
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollConsumed:[I

    aget v1, v1, v3

    sub-int/2addr v0, v1

    .line 50
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollOffset:[I

    aget v5, v1, v3

    sub-int/2addr v2, v5

    iput v2, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mLastY:I

    .line 51
    aget v1, v1, v3

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p1, v4, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 52
    iget v1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mNestedOffsetY:I

    iget-object v2, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollOffset:[I

    aget v2, v2, v3

    add-int/2addr v1, v2

    iput v1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mNestedOffsetY:I

    move v9, v0

    goto :goto_0

    :cond_1
    move v9, v0

    .line 54
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    const/4 v6, 0x0

    .line 57
    iget-object v10, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollOffset:[I

    aget v7, v10, v3

    const/4 v8, 0x0

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->dispatchNestedScroll(IIII[I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 58
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollOffset:[I

    aget v0, v0, v3

    int-to-float v0, v0

    invoke-virtual {p1, v4, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 59
    iget p1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mNestedOffsetY:I

    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mScrollOffset:[I

    aget v2, v0, v3

    add-int/2addr p1, v2

    iput p1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mNestedOffsetY:I

    .line 60
    iget p1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mLastY:I

    aget v0, v0, v3

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mLastY:I

    goto :goto_1

    .line 71
    :pswitch_1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 73
    invoke-virtual {p0}, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->stopNestedScroll()V

    goto :goto_1

    .line 64
    :pswitch_2
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 65
    iput v2, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mLastY:I

    const/4 p1, 0x2

    .line 67
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->startNestedScroll(I)Z

    :cond_2
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/NestedScrollingChildHelper;->startNestedScroll(I)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/NestedWebView;->mChildHelper:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->stopNestedScroll()V

    return-void
.end method
