.class public Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "DividerItemDecoration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;
    }
.end annotation


# static fields
.field protected static final SPACING:I = 0x1


# instance fields
.field protected positionsToIgnore:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected postionToRuleMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->postionToRuleMap:Ljava/util/HashMap;

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public addPositionToIgnore(I)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->postionToRuleMap:Ljava/util/HashMap;

    iget v1, p1, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->position:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public clearRule()V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->postionToRuleMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 3

    .line 50
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    move-result p2

    .line 51
    iget-object p4, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    if-eqz p4, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    return-void

    .line 54
    :cond_0
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p4

    iget p4, p4, Landroid/util/DisplayMetrics;->density:F

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->postionToRuleMap:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    if-eqz v0, :cond_1

    .line 56
    iget v0, v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->spacing:I

    int-to-float v0, v0

    mul-float/2addr v0, p4

    float-to-int p4, v0

    goto :goto_0

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    mul-float/2addr p4, v0

    float-to-int p4, p4

    .line 57
    :goto_0
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    .line 58
    instance-of v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 59
    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    .line 60
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->findViewHolderForLayoutPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p2

    if-nez p2, :cond_2

    return-void

    .line 62
    :cond_2
    iget-object p2, p2, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 63
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 64
    invoke-virtual {p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->isFullSpan()Z

    move-result p3

    if-nez p3, :cond_3

    invoke-virtual {p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->getSpanIndex()I

    move-result p2

    add-int/lit8 v0, v0, -0x1

    if-ge p2, v0, :cond_3

    .line 65
    invoke-virtual {p1, v2, v2, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {p1, v2, v2, v2, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_1

    .line 69
    :cond_4
    instance-of v1, v0, Landroid/support/v7/widget/GridLayoutManager;

    if-eqz v1, :cond_7

    .line 70
    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    .line 71
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->findViewHolderForLayoutPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p2

    if-nez p2, :cond_5

    return-void

    .line 73
    :cond_5
    iget-object p2, p2, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 74
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    .line 75
    invoke-virtual {p2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->getSpanIndex()I

    move-result p2

    add-int/lit8 v0, v0, -0x1

    if-ge p2, v0, :cond_6

    .line 76
    invoke-virtual {p1, v2, v2, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_1

    .line 78
    :cond_6
    invoke-virtual {p1, v2, v2, v2, p4}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_1

    .line 80
    :cond_7
    instance-of p2, v0, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz p2, :cond_9

    .line 81
    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->getOrientation()I

    move-result p2

    if-nez p2, :cond_8

    .line 82
    invoke-virtual {p1, v2, v2, p4, v2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_1

    .line 84
    :cond_8
    invoke-virtual {p1, v2, v2, v2, p4}, Landroid/graphics/Rect;->set(IIII)V

    :cond_9
    :goto_1
    return-void
.end method

.method public removePositionToIgnore(I)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->positionsToIgnore:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeRule(I)V
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->postionToRuleMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
