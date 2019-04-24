.class public Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;
.super Landroid/support/v7/widget/LinearLayoutManager;
.source "SmoothScrollingLinearLayoutManager.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public smoothScrollToPosition(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;I)V
    .locals 0

    .line 17
    new-instance p2, Lcom/shopkick/app/view/SKLinearSmoothScroller;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/shopkick/app/view/SKLinearSmoothScroller;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKLinearSmoothScroller;->setTargetPosition(I)V

    .line 19
    invoke-virtual {p0, p2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->startSmoothScroll(Landroid/support/v7/widget/RecyclerView$SmoothScroller;)V

    return-void
.end method
