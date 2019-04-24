.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
.source "BannersViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/views/featured/PagingBannerViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;",
        ">;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewEvents;"
    }
.end annotation


# instance fields
.field private featurePosition:I

.field private final fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/featured/FeaturedView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    .line 22
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/featured/FeaturedView;->bindViewEvents(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 4

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    .line 28
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    new-instance v0, Lcom/ibotta/android/featured/BannerReducer;

    invoke-direct {v0}, Lcom/ibotta/android/featured/BannerReducer;-><init>()V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->getFeatures()Ljava/util/List;

    move-result-object v1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v2

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->getRetailerCategoryId()I

    move-result v3

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->getRetailerId()Ljava/lang/Integer;

    move-result-object p1

    .line 28
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/ibotta/android/featured/BannerReducer;->create(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;)Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/view/featured/FeaturedView;->updateViewState(Lcom/ibotta/android/views/featured/PagingBannerViewState;)V

    return-void
.end method

.method public onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    if-eqz v0, :cond_0

    .line 52
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V

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

    .line 37
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;->onViewAttachedToWindow()V

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->featurePosition:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/featured/FeaturedView;->restore(Ljava/lang/Integer;)V

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/featured/FeaturedView;->startAutoRotation()V

    return-void
.end method

.method public onViewDetachedToWindow()V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/featured/FeaturedView;->stopAutoRotation()V

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->fvFeatured:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/featured/FeaturedView;->getPosition()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;->featurePosition:I

    .line 46
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;->onViewDetachedToWindow()V

    return-void
.end method
