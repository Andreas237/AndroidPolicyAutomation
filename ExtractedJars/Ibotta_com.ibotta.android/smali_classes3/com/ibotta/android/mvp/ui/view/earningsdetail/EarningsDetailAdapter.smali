.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "EarningsDetailAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 17
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;->getType()I

    move-result p1

    return p1
.end method

.method public getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;I)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 29
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 32
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->notifyDataSetChanged()V

    return-void
.end method
