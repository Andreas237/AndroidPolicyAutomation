.class public Lo/eqg;
.super Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;
.source "SourceFile"


# instance fields
.field private final b:Lo/epy;

.field private final d:Lo/epz;


# direct methods
.method constructor <init>(Lo/epy;Lo/epz;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;-><init>()V

    .line 13
    iput-object p1, p0, Lo/eqg;->b:Lo/epy;

    .line 14
    iput-object p2, p0, Lo/eqg;->d:Lo/epz;

    .line 15
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 5

    .line 75
    new-instance v4, Landroid/view/animation/ScaleAnimation;

    const v0, 0x3f8ccccd    # 1.1f

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3f8ccccd    # 1.1f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/view/animation/ScaleAnimation;-><init>(FFFF)V

    .line 76
    const-wide/16 v0, 0x64

    invoke-virtual {v4, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 77
    invoke-virtual {p1, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 78
    return-void
.end method


# virtual methods
.method public canDropOver(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;Landroid/support/v7/widget/RecyclerView$ViewHolder;)Z
    .locals 1

    .line 40
    const/4 v0, 0x1

    return v0
.end method

.method public clearView(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 55
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;->clearView(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 56
    iget-object v0, p0, Lo/eqg;->d:Lo/epz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 57
    iget-object v0, p0, Lo/eqg;->d:Lo/epz;

    invoke-virtual {v0}, Lo/epz;->getScrollState()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/eqg;->d:Lo/epz;

    .line 58
    invoke-virtual {v0}, Lo/epz;->isComputingLayout()Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/eqg;->d:Lo/epz;

    invoke-virtual {v0}, Lo/epz;->getRecycledViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->clear()V

    .line 60
    iget-object v0, p0, Lo/eqg;->b:Lo/epy;

    invoke-virtual {v0}, Lo/epy;->notifyDataSetChanged()V

    .line 63
    :cond_0
    return-void
.end method

.method public getMovementFlags(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;)I
    .locals 3

    .line 20
    const/16 v1, 0xc

    .line 22
    const/16 v2, 0xc

    .line 24
    invoke-static {v2, v1}, Lo/eqg;->makeMovementFlags(II)I

    move-result v0

    return v0
.end method

.method public isItemViewSwipeEnabled()Z
    .locals 1

    .line 45
    const/4 v0, 0x1

    return v0
.end method

.method public isLongPressDragEnabled()Z
    .locals 1

    .line 50
    const/4 v0, 0x1

    return v0
.end method

.method public onMove(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$ViewHolder;Landroid/support/v7/widget/RecyclerView$ViewHolder;)Z
    .locals 3

    .line 29
    iget-object v0, p0, Lo/eqg;->b:Lo/epy;

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result v1

    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/epy;->b(II)Z

    .line 30
    const/4 v0, 0x1

    return v0
.end method

.method public onSelectedChanged(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 67
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;->onSelectedChanged(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 68
    if-eqz p1, :cond_0

    .line 70
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-direct {p0, v0}, Lo/eqg;->d(Landroid/view/View;)V

    .line 72
    :cond_0
    return-void
.end method

.method public onSwiped(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 35
    return-void
.end method
