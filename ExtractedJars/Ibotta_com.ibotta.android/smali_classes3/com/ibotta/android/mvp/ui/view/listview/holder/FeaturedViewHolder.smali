.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "FeaturedViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/views/featured/PagingBannerViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/featured/PagingBannerViewState;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewEvents;"
    }
.end annotation


# instance fields
.field private final featuredView:Lcom/ibotta/android/view/featured/FeaturedView;

.field private viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

.field private viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/featured/FeaturedView;)V
    .locals 1

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    .line 17
    sget-object v0, Lcom/ibotta/android/views/featured/PagingBannerViewState;->EMPTY:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->featuredView:Lcom/ibotta/android/view/featured/FeaturedView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    .line 28
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->featuredView:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/featured/FeaturedView;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method

.method public onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/featured/PagingBannerViewEvents;->onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 34
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->featuredView:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/featured/FeaturedView;->startAutoRotation()V

    goto :goto_0

    .line 36
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->featuredView:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/featured/FeaturedView;->stopAutoRotation()V

    :goto_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->viewState:Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/featured/PagingBannerViewState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->featuredView:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/featured/FeaturedView;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->featuredView:Lcom/ibotta/android/view/featured/FeaturedView;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView;->restore(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    return-void
.end method
