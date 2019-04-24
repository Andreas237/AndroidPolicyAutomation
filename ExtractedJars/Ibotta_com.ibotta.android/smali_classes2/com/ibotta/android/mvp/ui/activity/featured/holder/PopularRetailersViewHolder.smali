.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "PopularRetailersViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private module:Lcom/ibotta/api/model/base/Module;

.field private prmvPopularRetailer:Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->prmvPopularRetailer:Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 2

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    .line 31
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->prmvPopularRetailer:Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/PopularRetailersRow;->getModels()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->setup(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)V

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->prmvPopularRetailer:Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;)V

    return-void
.end method

.method public onRetailerRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 43
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V

    :cond_0
    return-void
.end method
