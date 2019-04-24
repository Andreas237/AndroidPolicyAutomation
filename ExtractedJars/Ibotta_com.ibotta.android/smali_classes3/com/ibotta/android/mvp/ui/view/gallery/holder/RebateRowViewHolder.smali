.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
.source "RebateRowViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private row:Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;

.field private final rrvRebateRow:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->rrvRebateRow:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    .line 22
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->rrvRebateRow:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setContentCardViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 1

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;

    .line 30
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->rrvRebateRow:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->getOfferItem()Lcom/ibotta/android/view/model/content/OfferItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/content/OfferItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setup(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->getOfferItem()Lcom/ibotta/android/view/model/content/OfferItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

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
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->getOfferItem()Lcom/ibotta/android/view/model/content/OfferItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->getOfferItem()Lcom/ibotta/android/view/model/content/OfferItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->getOfferItem()Lcom/ibotta/android/view/model/content/OfferItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
