.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "BannersViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/views/featured/PagingBannerViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;",
        ">;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewEvents;"
    }
.end annotation


# instance fields
.field private featurePosition:I

.field private final fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/featured/FeaturedView;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    .line 23
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/featured/FeaturedView;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 3

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 29
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    new-instance v0, Lcom/ibotta/android/featured/BannerReducer;

    invoke-direct {v0}, Lcom/ibotta/android/featured/BannerReducer;-><init>()V

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->getModels()Ljava/util/List;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/ibotta/android/featured/BannerReducer;->create(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;I)Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/view/featured/FeaturedView;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    return-void
.end method

.method public onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 49
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V

    :cond_0
    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onViewAttachedToWindow()V
    .locals 2

    .line 34
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->onViewAttachedToWindow()V

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->featurePosition:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/featured/FeaturedView;->restore(Ljava/lang/Integer;)V

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/featured/FeaturedView;->startAutoRotation()V

    return-void
.end method

.method public onViewDetachedToWindow()V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/featured/FeaturedView;->stopAutoRotation()V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/featured/FeaturedView;->getPosition()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;->featurePosition:I

    .line 43
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->onViewDetachedToWindow()V

    return-void
.end method
