.class public Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "ConnectedAccountsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;I)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;
    .locals 1

    .line 24
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;)V

    return-object p2
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 48
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsAdapter;->notifyDataSetChanged()V

    return-void
.end method
