.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;
.source "VerifiableRebateViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

.field private final vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    .line 21
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .locals 6

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->getCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    .line 28
    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setup(Lcom/ibotta/api/model/OfferModel;IZZZ)V

    return-void
.end method

.method public onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 39
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;->onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method

.method public onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 53
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;->onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method

.method public onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 46
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;->onRowClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method
