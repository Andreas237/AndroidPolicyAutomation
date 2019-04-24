.class public Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "FeaturedRecyclerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final factory:Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private final rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;"
        }
    .end annotation
.end field

.field private final viewStateMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/images/ImageCache;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->rows:Ljava/util/List;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->viewStateMap:Ljava/util/Map;

    .line 31
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/images/ImageCache;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;I)V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->onViewAttachedToWindow(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;)V

    return-void
.end method

.method public onViewAttachedToWindow(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;)V
    .locals 0

    .line 81
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->onViewAttachedToWindow()V

    return-void
.end method

.method public bridge synthetic onViewDetachedFromWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->onViewDetachedFromWindow(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;)V
    .locals 1

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->saveStateForViewHolder(ILandroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->onViewDetachedToWindow()V

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->onViewDetachedFromWindow(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public bridge synthetic onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroid/support/v7/widget/RecyclerView$ViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->onViewRecycled(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->saveStateForViewHolder(ILandroid/support/v7/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public resetViewStates()V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public saveStateForViewHolder(ILandroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 1

    .line 98
    instance-of v0, p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->getRowViewState()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;)V"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method
