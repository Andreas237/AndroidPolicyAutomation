.class public Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "MoreStoresRetailerViewHolder.java"


# instance fields
.field private final msrrvRow:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;)V
    .locals 3

    .line 15
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;->msrrvRow:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;

    .line 18
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 20
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public bind(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersRecyclerListener;)V
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;->msrrvRow:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView$MoreStoresRetailerRowListener;)V

    .line 25
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerViewHolder;->msrrvRow:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->getAddedCount()I

    move-result p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setup(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/retailer/Category;I)V

    return-void
.end method
