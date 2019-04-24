.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;
.source "AddRebatesViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;"
    }
.end annotation


# instance fields
.field private final arvAddRebates:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;->arvAddRebates:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

    .line 21
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;->arvAddRebates:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->setListener(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .locals 1

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    .line 27
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;->arvAddRebates:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->getState()Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->getFoundRebateCount()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->setup(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;I)V

    return-void
.end method

.method public onAddRebatesClicked()V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 33
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;->onAddRebatesClicked()V

    :cond_0
    return-void
.end method
