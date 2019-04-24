.class public Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "PersonalStoresAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 18
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;I)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->notifyDataSetChanged()V

    return-void
.end method
