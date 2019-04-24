.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory;
.super Ljava/lang/Object;
.source "EarningsDetailViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;
    .locals 2

    .line 20
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/EarningsDetailViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$earningsdetail$EarningsDetailRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->values()[Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 34
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V

    goto :goto_0

    .line 31
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)V

    goto :goto_0

    .line 28
    :pswitch_2
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;

    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    goto :goto_0

    .line 25
    :pswitch_3
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;

    new-instance v0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerFooterRowViewHolder;-><init>(Lcom/ibotta/android/view/earnings/TxLedgerFooterView;)V

    goto :goto_0

    .line 22
    :pswitch_4
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;

    new-instance v0, Lcom/ibotta/android/view/earnings/TxLedgerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/earnings/TxLedgerView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxLedgerRowViewHolder;-><init>(Lcom/ibotta/android/view/earnings/TxLedgerView;)V

    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
