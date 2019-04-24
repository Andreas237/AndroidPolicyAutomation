.class public Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/AbstractMyRetailersViewHolder;
.source "RetailerCardViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/AbstractMyRetailersViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;

.field private final rcvRetailerCard:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;

.field private row:Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/AbstractMyRetailersViewHolder;-><init>(Landroid/view/View;)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->rcvRetailerCard:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V
    .locals 2

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;

    .line 26
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->rcvRetailerCard:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;

    invoke-virtual {p2, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;)V

    .line 27
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->rcvRetailerCard:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRebateCount()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->isFavorited()Z

    move-result p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->setup(Lcom/ibotta/api/model/RetailerModel;IZ)V

    return-void
.end method

.method public onRetailerCardClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;->onTrackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/RetailerCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;->onRetailerCardClicked(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
