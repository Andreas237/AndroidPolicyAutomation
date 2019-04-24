.class public Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;
.source "MyOffersGalleryRowViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;"
    }
.end annotation


# instance fields
.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private final itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private row:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;ZZ)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;ZZ)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;ZZ)V
    .locals 8

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    .line 40
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->itemLevelOfferCardView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    new-instance v7, Lcom/ibotta/android/content/OfferDisplayContent;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    .line 41
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    .line 42
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    .line 44
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v4

    const/4 v3, 0x0

    move-object v0, v7

    move v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/android/views/content/ContentStyle;ZZ)V

    .line 40
    invoke-virtual {p2, v7}, Lcom/ibotta/android/content/card/ContentCardReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentImageClicked()V
    .locals 0

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 67
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 62
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
