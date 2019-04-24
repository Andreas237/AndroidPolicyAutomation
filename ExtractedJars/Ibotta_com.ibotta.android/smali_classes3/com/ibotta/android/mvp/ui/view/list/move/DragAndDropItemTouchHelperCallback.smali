.class public Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;
.super Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;
.source "DragAndDropItemTouchHelperCallback.java"


# static fields
.field public static final ALPHA_FULL:F = 1.0f


# instance fields
.field private final mAdapter:Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;->mAdapter:Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;

    return-void
.end method


# virtual methods
.method public clearView(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 1

    .line 118
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;->clearView(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 120
    iget-object p1, p2, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 122
    instance-of p1, p2, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperViewHolder;

    if-eqz p1, :cond_0

    .line 124
    check-cast p2, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperViewHolder;

    .line 125
    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperViewHolder;->onItemClear()V

    .line 128
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;->mAdapter:Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;->onItemClear()V

    return-void
.end method

.method public getMovementFlags(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;)I
    .locals 0

    .line 60
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p1

    instance-of p1, p1, Landroid/support/v7/widget/GridLayoutManager;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/16 p1, 0xf

    .line 64
    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;->makeMovementFlags(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x3

    .line 68
    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;->makeMovementFlags(II)I

    move-result p1

    return p1
.end method

.method public isItemViewSwipeEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isLongPressDragEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onChildDraw(Landroid/graphics/Canvas;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;FFIZ)V
    .locals 1

    const/4 v0, 0x1

    if-ne p6, v0, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 94
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget-object p5, p3, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    move-result p5

    int-to-float p5, p5

    div-float/2addr p2, p5

    sub-float/2addr p1, p2

    .line 95
    iget-object p2, p3, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 96
    iget-object p1, p3, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, p4}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_0

    .line 98
    :cond_0
    invoke-super/range {p0 .. p7}, Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;->onChildDraw(Landroid/graphics/Canvas;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;FFIZ)V

    :goto_0
    return-void
.end method

.method public onMove(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;Landroid/support/v7/widget/RecyclerView$ViewHolder;)Z
    .locals 1

    .line 74
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result p1

    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v0

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 79
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;->mAdapter:Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result p2

    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result p3

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;->onItemMove(II)Z

    const/4 p1, 0x1

    return p1
.end method

.method public onSelectedChanged(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    if-eqz p2, :cond_0

    .line 106
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperViewHolder;

    if-eqz v0, :cond_0

    .line 108
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperViewHolder;

    .line 109
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperViewHolder;->onItemSelected()V

    .line 113
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;->onSelectedChanged(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    return-void
.end method

.method public onSwiped(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 86
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/list/move/DragAndDropItemTouchHelperCallback;->mAdapter:Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;->onItemDismiss(I)V

    return-void
.end method
