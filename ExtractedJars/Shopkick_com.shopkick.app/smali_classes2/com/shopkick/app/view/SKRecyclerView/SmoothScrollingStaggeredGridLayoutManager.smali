.class public Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;
.super Landroid/support/v7/widget/StaggeredGridLayoutManager;
.source "SmoothScrollingStaggeredGridLayoutManager.java"


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(II)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;I)I
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->calculateScrollDirectionForPosition(I)I

    move-result p0

    return p0
.end method

.method private calculateScrollDirectionForPosition(I)I
    .locals 4

    .line 46
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->getChildCount()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 47
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->getReverseLayout()Z

    move-result p1

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->getPosition(Landroid/view/View;)I

    move-result v3

    if-ge p1, v3, :cond_2

    move v0, v2

    .line 50
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->getReverseLayout()Z

    move-result p1

    if-eq v0, p1, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    return v1
.end method


# virtual methods
.method public smoothScrollToPosition(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;I)V
    .locals 0

    .line 21
    new-instance p2, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager$1;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager$1;-><init>(Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;Landroid/content/Context;)V

    .line 41
    invoke-virtual {p2, p3}, Landroid/support/v7/widget/LinearSmoothScroller;->setTargetPosition(I)V

    .line 42
    invoke-virtual {p0, p2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->startSmoothScroll(Landroid/support/v7/widget/RecyclerView$SmoothScroller;)V

    return-void
.end method
