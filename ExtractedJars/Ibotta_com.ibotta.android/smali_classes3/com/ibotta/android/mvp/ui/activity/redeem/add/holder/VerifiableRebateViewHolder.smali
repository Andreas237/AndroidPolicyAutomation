.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;
.source "VerifiableRebateViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;-><init>(Landroid/view/View;)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    .line 23
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;)V
    .locals 6

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->vrrvRebate:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->getCount()I

    move-result v2

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->isVerified()Z

    move-result v5

    const/4 v3, 0x1

    const/4 v4, 0x1

    .line 30
    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setup(Lcom/ibotta/api/model/OfferModel;IZZZ)V

    return-void
.end method

.method public onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;->onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method

.method public onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 55
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;->onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method

.method public onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 48
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;->onRowClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method
