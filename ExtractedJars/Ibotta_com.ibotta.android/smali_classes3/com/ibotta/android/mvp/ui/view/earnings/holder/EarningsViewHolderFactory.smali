.class public Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory;
.super Ljava/lang/Object;
.source "EarningsViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;
    .locals 2

    .line 17
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningsViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$earnings$row$EarningsRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;->values()[Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 22
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/earnings/holder/LoadingSpinnerViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/LoadingSpinnerViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;)V

    goto :goto_0

    .line 19
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)V

    :goto_0
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
