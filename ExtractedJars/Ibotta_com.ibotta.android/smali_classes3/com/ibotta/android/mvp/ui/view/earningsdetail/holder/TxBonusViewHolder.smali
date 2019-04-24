.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;
.source "TxBonusViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;"
    }
.end annotation


# instance fields
.field private ebrvEarningsBonusRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->ebrvEarningsBonusRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 1

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    .line 27
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->ebrvEarningsBonusRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->isFirstBonus()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setShowTopDivider(Z)V

    .line 28
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->ebrvEarningsBonusRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->isLastBonus()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setShowBottomSpace(Z)V

    .line 29
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->ebrvEarningsBonusRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->getBonusModel()Lcom/ibotta/api/model/BonusModel;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setup(Lcom/ibotta/api/model/BonusModel;)V

    .line 30
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->ebrvEarningsBonusRowView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;)V

    return-void
.end method

.method public onBonusRowClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxBonusViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    if-eqz v0, :cond_0

    .line 36
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;->onBonusRowClicked(Lcom/ibotta/api/model/BonusModel;)V

    :cond_0
    return-void
.end method
