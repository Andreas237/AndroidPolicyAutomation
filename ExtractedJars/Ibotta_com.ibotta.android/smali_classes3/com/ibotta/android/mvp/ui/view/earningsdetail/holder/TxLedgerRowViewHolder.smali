.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;
.source "TxLedgerRowViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;",
        ">;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

.field private final txLedgerView:Lcom/ibotta/android/view/earnings/TxLedgerView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/earnings/TxLedgerView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;->txLedgerView:Lcom/ibotta/android/view/earnings/TxLedgerView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 2

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;->getTxLedgerData()Lcom/ibotta/android/earnings/TxLedgerData;

    move-result-object p1

    .line 29
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;->txLedgerView:Lcom/ibotta/android/view/earnings/TxLedgerView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/view/earnings/TxLedgerView;->setup(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 31
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;->txLedgerView:Lcom/ibotta/android/view/earnings/TxLedgerView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f070165

    .line 32
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    const v0, 0x7f07018d

    .line 33
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;->txLedgerView:Lcom/ibotta/android/view/earnings/TxLedgerView;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, p2, v1}, Lcom/ibotta/android/view/earnings/TxLedgerView;->setPadding(IIII)V

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;->txLedgerView:Lcom/ibotta/android/view/earnings/TxLedgerView;

    const p2, 0x7f0600fd

    invoke-virtual {p1, p2}, Lcom/ibotta/android/view/earnings/TxLedgerView;->setBackgroundResource(I)V

    return-void
.end method
