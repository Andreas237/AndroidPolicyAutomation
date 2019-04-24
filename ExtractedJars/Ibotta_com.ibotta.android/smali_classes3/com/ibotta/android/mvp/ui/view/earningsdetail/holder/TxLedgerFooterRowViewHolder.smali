.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;
.source "TxLedgerFooterRowViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;",
        ">;",
        "Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

.field private final txLedgerFooterView:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/earnings/TxLedgerFooterView;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;-><init>(Landroid/view/View;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->txLedgerFooterView:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 1

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;->getTxLedgerData()Lcom/ibotta/android/earnings/TxLedgerData;

    move-result-object p1

    .line 32
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->txLedgerFooterView:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->setup(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 34
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->txLedgerFooterView:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f070165

    .line 35
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    const v0, 0x7f07018d

    .line 36
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->txLedgerFooterView:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    invoke-virtual {v0, p2, p1, p2, p1}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->setPadding(IIII)V

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->txLedgerFooterView:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    const p2, 0x7f0600fd

    invoke-virtual {p1, p2}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->setBackgroundResource(I)V

    .line 41
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->txLedgerFooterView:Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->setListener(Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;)V

    return-void
.end method

.method public onNeedHelpClicked()V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    if-eqz v0, :cond_0

    .line 47
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;->onHelpButtonClicked()V

    :cond_0
    return-void
.end method
