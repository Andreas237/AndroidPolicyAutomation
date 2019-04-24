.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "VerifiedRebatesRecyclerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;",
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
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;->getType()I

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;I)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->factory:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 29
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method
