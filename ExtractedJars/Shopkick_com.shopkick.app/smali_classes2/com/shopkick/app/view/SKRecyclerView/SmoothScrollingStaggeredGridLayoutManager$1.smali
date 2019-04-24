.class Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager$1;
.super Landroid/support/v7/widget/LinearSmoothScroller;
.source "SmoothScrollingStaggeredGridLayoutManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->smoothScrollToPosition(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;Landroid/content/Context;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/LinearSmoothScroller;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;

    invoke-static {v0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->access$000(Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;

    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;->getOrientation()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 35
    new-instance v0, Landroid/graphics/PointF;

    int-to-float p1, p1

    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0

    .line 37
    :cond_1
    new-instance v0, Landroid/graphics/PointF;

    int-to-float p1, p1

    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method protected getVerticalSnapPreference()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
