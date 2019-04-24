.class public Lcom/shopkick/app/view/SKRecyclerView/SlowSmoothScrollingLinearLayoutManager;
.super Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;
.source "SlowSmoothScrollingLinearLayoutManager.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public smoothScrollToPosition(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;I)V
    .locals 0

    .line 15
    new-instance p2, Lcom/shopkick/app/view/SKSlowLinearSmoothScroller;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/shopkick/app/view/SKSlowLinearSmoothScroller;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKSlowLinearSmoothScroller;->setTargetPosition(I)V

    .line 17
    invoke-virtual {p0, p2}, Lcom/shopkick/app/view/SKRecyclerView/SlowSmoothScrollingLinearLayoutManager;->startSmoothScroll(Landroid/support/v7/widget/RecyclerView$SmoothScroller;)V

    return-void
.end method
