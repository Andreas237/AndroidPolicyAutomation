.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;
.source "TxOfferViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final eorvEarningsOfferRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;-><init>(Landroid/view/View;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;->eorvEarningsOfferRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 1

    .line 21
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;->eorvEarningsOfferRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isFirstOffer()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->setShowTopDivider(Z)V

    .line 22
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;->eorvEarningsOfferRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isLastOffer()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->setShowBottomSpace(Z)V

    .line 23
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxOfferViewHolder;->eorvEarningsOfferRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isVerified()Z

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->setup(Lcom/ibotta/api/model/OfferModel;Z)V

    return-void
.end method
