.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "ProductsModuleViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private module:Lcom/ibotta/api/model/base/Module;

.field private productsModuleView:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->productsModuleView:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 2

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    .line 33
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->productsModuleView:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;->getModels()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->setup(Lcom/ibotta/api/model/base/Module;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 34
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->productsModuleView:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;)V

    return-void
.end method

.method public onActionClicked(Lcom/ibotta/api/model/base/Actionable;)V
    .locals 2

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 54
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V

    :cond_0
    return-void
.end method

.method public onProductRowClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 40
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    :cond_0
    return-void
.end method

.method public onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    :cond_0
    return-void
.end method

.method public onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 61
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V

    :cond_0
    return-void
.end method
