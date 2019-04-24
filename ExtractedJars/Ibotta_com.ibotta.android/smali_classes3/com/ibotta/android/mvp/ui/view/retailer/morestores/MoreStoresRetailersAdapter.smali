.class public Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "MoreStoresRetailersAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;I)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;
    .locals 1

    .line 33
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;)V

    return-object p2
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 28
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersAdapter;->notifyDataSetChanged()V

    return-void
.end method
