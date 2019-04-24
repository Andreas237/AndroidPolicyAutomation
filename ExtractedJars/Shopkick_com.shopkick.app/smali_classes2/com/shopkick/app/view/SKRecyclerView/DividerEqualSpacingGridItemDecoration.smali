.class public Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;
.super Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;
.source "DividerEqualSpacingGridItemDecoration.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 4

    .line 20
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    move-result p2

    .line 21
    iget-object p4, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    if-eqz p4, :cond_0

    iget-object p4, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    return-void

    .line 24
    :cond_0
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p4

    iget p4, p4, Landroid/util/DisplayMetrics;->density:F

    .line 25
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerEqualSpacingGridItemDecoration;->postionToRuleMap:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    if-eqz v0, :cond_1

    .line 26
    iget v1, v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->spacing:I

    int-to-float v1, v1

    mul-float/2addr v1, p4

    float-to-int p4, v1

    goto :goto_0

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr p4, v1

    float-to-int p4, p4

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 27
    iget-boolean v0, v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->hasTopSpacing:Z

    if-eqz v0, :cond_2

    move v0, p4

    goto :goto_1

    :cond_2
    move v0, v1

    .line 28
    :goto_1
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v2

    .line 29
    instance-of v3, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    if-eqz v3, :cond_7

    .line 30
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->findViewHolderForLayoutPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p2

    if-nez p2, :cond_3

    return-void

    .line 32
    :cond_3
    iget-object p2, p2, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 33
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 34
    invoke-virtual {p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->isFullSpan()Z

    move-result p3

    if-nez p3, :cond_6

    .line 35
    invoke-virtual {p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->getSpanIndex()I

    move-result p3

    if-nez p3, :cond_4

    .line 36
    div-int/lit8 p2, p4, 0x2

    invoke-virtual {p1, p4, v0, p2, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto/16 :goto_2

    .line 37
    :cond_4
    invoke-virtual {p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->getSpanIndex()I

    move-result p2

    check-cast v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    if-ne p2, p3, :cond_5

    .line 38
    div-int/lit8 p2, p4, 0x2

    invoke-virtual {p1, p2, v0, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 40
    :cond_5
    div-int/lit8 p2, p4, 0x2

    invoke-virtual {p1, p2, v0, p2, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 43
    :cond_6
    invoke-virtual {p1, v1, v0, v1, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 45
    :cond_7
    instance-of v3, v2, Landroid/support/v7/widget/GridLayoutManager;

    if-eqz v3, :cond_c

    .line 46
    check-cast v2, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v2

    .line 47
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->findViewHolderForLayoutPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p2

    if-nez p2, :cond_8

    return-void

    .line 49
    :cond_8
    iget-object p2, p2, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 50
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    add-int/lit8 v2, v2, -0x1

    if-gtz v2, :cond_9

    .line 52
    invoke-virtual {p1, v1, v0, v1, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 53
    :cond_9
    invoke-virtual {p2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->getSpanIndex()I

    move-result p3

    if-nez p3, :cond_a

    .line 54
    div-int/lit8 p2, p4, 0x2

    invoke-virtual {p1, p4, v0, p2, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 55
    :cond_a
    invoke-virtual {p2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->getSpanIndex()I

    move-result p2

    if-ne p2, v2, :cond_b

    .line 56
    div-int/lit8 p2, p4, 0x2

    invoke-virtual {p1, p2, v0, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 58
    :cond_b
    div-int/lit8 p2, p4, 0x2

    invoke-virtual {p1, p2, v0, p2, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 60
    :cond_c
    instance-of p2, v2, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz p2, :cond_e

    .line 61
    check-cast v2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager;->getOrientation()I

    move-result p2

    if-nez p2, :cond_d

    .line 62
    invoke-virtual {p1, v0, v1, p4, v1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    .line 64
    :cond_d
    invoke-virtual {p1, v1, v0, v1, p4}, Landroid/graphics/Rect;->set(IIII)V

    :cond_e
    :goto_2
    return-void
.end method
