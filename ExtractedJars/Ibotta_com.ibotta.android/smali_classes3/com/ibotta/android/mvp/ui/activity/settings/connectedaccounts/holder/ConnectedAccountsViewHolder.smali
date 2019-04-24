.class public Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "ConnectedAccountsViewHolder.java"


# instance fields
.field private final cavAccount:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;->cavAccount:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;

    return-void
.end method


# virtual methods
.method public bind(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;->cavAccount:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setListener(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;)V

    .line 24
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;->cavAccount:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;->getConnectedAccount()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setConnectedAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V

    .line 25
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/holder/ConnectedAccountsViewHolder;->cavAccount:Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;->isConnected()Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setConnected(Z)V

    return-void
.end method
