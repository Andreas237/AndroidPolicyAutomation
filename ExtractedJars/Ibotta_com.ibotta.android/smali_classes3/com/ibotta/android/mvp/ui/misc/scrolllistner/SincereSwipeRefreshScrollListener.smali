.class public Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SincereSwipeRefreshScrollListener.java"


# instance fields
.field private final srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private state:I

.field private y:I


# direct methods
.method public constructor <init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;->state:I

    .line 22
    iput v0, p0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;->y:I

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .line 30
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 31
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget p2, p0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;->state:I

    if-nez p2, :cond_0

    iget p2, p0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;->y:I

    if-gtz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 36
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 37
    iput p3, p0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;->y:I

    return-void
.end method
