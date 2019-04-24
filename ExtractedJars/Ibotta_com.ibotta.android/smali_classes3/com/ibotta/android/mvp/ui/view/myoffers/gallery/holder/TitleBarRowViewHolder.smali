.class public Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;
.source "TitleBarRowViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;ZZ)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;ZZ)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;ZZ)V
    .locals 0

    .line 21
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 23
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f070165

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 24
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f07019d

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 25
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p3}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const p4, 0x7f070173

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 26
    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p4, p1, p2, p1, p3}, Lcom/ibotta/android/views/base/title/TitleBarView;->setPadding(IIII)V

    return-void
.end method
