.class Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;
.super Ljava/lang/Object;
.source "ProductDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ProductDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ScreenRecyclerViewModule"
.end annotation


# instance fields
.field screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field shouldShowActionButton:Z


# direct methods
.method public constructor <init>(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Z)V
    .locals 0

    .line 469
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 470
    iput-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 471
    iput-boolean p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->shouldShowActionButton:Z

    return-void
.end method


# virtual methods
.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 2

    .line 489
    iget-boolean p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->shouldShowActionButton:Z

    if-nez p2, :cond_0

    return-void

    .line 491
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result p2

    const/4 p3, 0x4

    const/4 v0, 0x3

    if-le p2, v0, :cond_1

    .line 493
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    if-ne p2, v0, :cond_3

    .line 495
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 496
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForLayoutPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p1

    iget-object p1, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 497
    invoke-virtual {p1, p2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 498
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p1

    iget-object p2, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p2, p2, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    if-lt p1, p2, :cond_2

    .line 499
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 501
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 504
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen$ScreenRecyclerViewModule;->screenFloatingButtonsViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method
