.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
.source "ProductRowViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

.field private final prvProductRow:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

.field private row:Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->prvProductRow:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    .line 22
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->prvProductRow:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;

    .line 30
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->prvProductRow:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;->getProductItem()Lcom/ibotta/android/view/model/content/ProductItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/ProductItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/ProductModel;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setup(Lcom/ibotta/api/model/ProductModel;)V

    return-void
.end method

.method public onProductRowClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;->getProductItem()Lcom/ibotta/android/view/model/content/ProductItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->row:Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;->getProductItem()Lcom/ibotta/android/view/model/content/ProductItem;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
