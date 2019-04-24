.class public Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "EarningsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private earningIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private factory:Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
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
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->rows:Ljava/util/List;

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->earningIds:Ljava/util/Set;

    return-void
.end method

.method private setFilteredEarningsRow(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
            ">;)V"
        }
    .end annotation

    .line 64
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->earningIds:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;->getEarning()Lcom/ibotta/api/model/earnings/Earning;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/earnings/Earning;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 66
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->rows:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->earningIds:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;->getEarning()Lcom/ibotta/api/model/earnings/Earning;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;->getType()I

    move-result p1

    return p1
.end method

.method public getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->rows:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;I)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->setFilteredEarningsRow(Ljava/util/List;)V

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->notifyDataSetChanged()V

    return-void
.end method
