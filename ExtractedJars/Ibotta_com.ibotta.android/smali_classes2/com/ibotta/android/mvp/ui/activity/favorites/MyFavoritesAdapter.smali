.class public Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "MyFavoritesAdapter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/list/move/ItemTouchHelperAdapter;"
    }
.end annotation


# instance fields
.field private dragStartListener:Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;

.field private listener:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->rows:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;)Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->dragStartListener:Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;

    return-object p0
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;I)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;)V

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->getFavoriteView()Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->getDragImageView()Landroid/widget/ImageView;

    move-result-object p2

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnTouchListener(Landroid/view/View;Landroid/view/View$OnTouchListener;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;
    .locals 1

    .line 50
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;)V

    return-object p2
.end method

.method public onItemClear()V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->dragStartListener:Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;

    if-eqz v0, :cond_0

    .line 92
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;->onEndDrag()V

    :cond_0
    return-void
.end method

.method public onItemDismiss(I)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 79
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->notifyItemRemoved(I)V

    return-void
.end method

.method public onItemMove(II)Z
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->rows:Ljava/util/List;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 85
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->notifyItemMoved(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public setDragStartListener(Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->dragStartListener:Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 42
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 45
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->notifyDataSetChanged()V

    return-void
.end method
