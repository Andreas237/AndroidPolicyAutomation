.class public Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "FindRebatesRecyclerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final factory:Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 20
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;I)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;)V"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method
