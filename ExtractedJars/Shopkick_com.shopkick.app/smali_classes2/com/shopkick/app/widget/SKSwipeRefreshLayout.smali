.class public Lcom/shopkick/app/widget/SKSwipeRefreshLayout;
.super Landroid/support/v4/widget/SwipeRefreshLayout;
.source "SKSwipeRefreshLayout.java"

# interfaces
.implements Lcom/shopkick/app/view/ISKListViewModule;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# instance fields
.field private shouldDisableOverScrollDetection:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x3

    .line 27
    new-array p1, p1, [I

    fill-array-data p1, :array_0

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setColorSchemeResources([I)V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f060120
        0x7f060120
        0x7f060120
    .end array-data
.end method


# virtual methods
.method public onAttach(Lcom/shopkick/app/logging/IUserEventListView;)V
    .locals 0

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onMovedToScrapHeap(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onScroll(Lcom/shopkick/app/logging/IUserEventListView;III)V
    .locals 0

    .line 77
    iget-boolean p2, p0, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->shouldDisableOverScrollDetection:Z

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setShouldDisableOverScrollDetection(Lcom/shopkick/app/logging/IUserEventListView;Z)V

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/logging/IUserEventListView;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    .line 107
    iget-boolean p2, p0, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->shouldDisableOverScrollDetection:Z

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setShouldDisableOverScrollDetection(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Z)V

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public setShouldDisableOverScrollDetection(Lcom/shopkick/app/logging/IUserEventListView;Z)V
    .locals 2

    .line 32
    iput-boolean p2, p0, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->shouldDisableOverScrollDetection:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 35
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setEnabled(Z)V

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_4

    .line 38
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventListView;->getChildCount()I

    move-result p2

    if-lez p2, :cond_4

    instance-of p2, p1, Landroid/widget/ListView;

    if-eqz p2, :cond_4

    .line 39
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventListView;->getFirstVisiblePosition()I

    move-result p2

    const/4 v1, 0x1

    if-nez p2, :cond_1

    move p2, v1

    goto :goto_0

    :cond_1
    move p2, v0

    .line 40
    :goto_0
    check-cast p1, Landroid/widget/ListView;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    if-nez p1, :cond_2

    move p1, v1

    goto :goto_1

    :cond_2
    move p1, v0

    :goto_1
    if-eqz p2, :cond_3

    if-eqz p1, :cond_3

    move v0, v1

    .line 41
    :cond_3
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setEnabled(Z)V

    :cond_4
    :goto_2
    return-void
.end method

.method public setShouldDisableOverScrollDetection(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Z)V
    .locals 2

    .line 48
    iput-boolean p2, p0, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->shouldDisableOverScrollDetection:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 51
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setEnabled(Z)V

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_4

    .line 54
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildCount()I

    move-result p2

    if-lez p2, :cond_4

    .line 55
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p2

    const/4 v1, 0x1

    if-nez p2, :cond_1

    move p2, v1

    goto :goto_0

    :cond_1
    move p2, v0

    :goto_0
    if-nez p2, :cond_2

    .line 57
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setEnabled(Z)V

    return-void

    .line 60
    :cond_2
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p2

    .line 61
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getDecoratedTop(Landroid/view/View;)I

    move-result p1

    if-ltz p1, :cond_3

    move v0, v1

    :cond_3
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setEnabled(Z)V

    :cond_4
    :goto_1
    return-void
.end method
