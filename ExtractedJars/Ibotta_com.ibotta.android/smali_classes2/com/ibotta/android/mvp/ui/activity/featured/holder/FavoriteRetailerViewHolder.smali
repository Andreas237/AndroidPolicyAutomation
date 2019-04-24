.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "FavoriteRetailerViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;"
    }
.end annotation


# instance fields
.field private final fsmhFavoriteStore:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->fsmhFavoriteStore:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 2

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 33
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->fsmhFavoriteStore:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    invoke-virtual {p2, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;)V

    .line 34
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->fsmhFavoriteStore:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->getModule()Lcom/ibotta/api/model/module/RetailerModule;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->getModels()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->setup(Lcom/ibotta/api/model/module/RetailerModule;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public onActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 75
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V

    :cond_0
    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 40
    check-cast p2, Lcom/ibotta/api/model/module/RetailerModule;

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onContentClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    :cond_0
    return-void
.end method

.method public onRetailerViewAllClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onRetailerViewAllClicked(Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 61
    check-cast p2, Lcom/ibotta/api/model/module/RetailerModule;

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onShopClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    :cond_0
    return-void
.end method

.method public onTitleMenuActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 82
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onTitleMenuActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V

    :cond_0
    return-void
.end method

.method public onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 89
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V

    :cond_0
    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 47
    check-cast p2, Lcom/ibotta/api/model/module/RetailerModule;

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onUnlockClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    :cond_0
    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 54
    check-cast p2, Lcom/ibotta/api/model/module/RetailerModule;

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onUnlockedClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/ContentModel;)V

    :cond_0
    return-void
.end method
