.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;
.source "TxLedgerRow.java"


# instance fields
.field private txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TX_LEDGER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;)V

    return-void
.end method


# virtual methods
.method public getTxLedgerData()Lcom/ibotta/android/earnings/TxLedgerData;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    return-object v0
.end method

.method public setTxLedgerData(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    return-void
.end method
