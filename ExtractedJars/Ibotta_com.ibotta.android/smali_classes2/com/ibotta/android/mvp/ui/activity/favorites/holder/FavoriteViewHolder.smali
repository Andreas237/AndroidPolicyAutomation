.class public Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "FavoriteViewHolder.java"


# instance fields
.field private fvFavorite:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->fvFavorite:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    return-void
.end method


# virtual methods
.method public bind(Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;)V
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->fvFavorite:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->fvFavorite:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->setCategory(Lcom/ibotta/api/model/retailer/Category;)V

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->fvFavorite:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->setListener(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;)V

    .line 28
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->fvFavorite:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f060171

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->setBackgroundColor(I)V

    return-void
.end method

.method public getFavoriteView()Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;->fvFavorite:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;

    return-object v0
.end method
