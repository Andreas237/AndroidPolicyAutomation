.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "VerifyRebatesRecyclerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 19
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;I)V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 27
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 30
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method
