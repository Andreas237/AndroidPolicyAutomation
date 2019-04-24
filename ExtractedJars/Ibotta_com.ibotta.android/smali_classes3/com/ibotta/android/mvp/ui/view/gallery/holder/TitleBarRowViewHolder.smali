.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
.source "TitleBarRowViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;-><init>(Landroid/view/View;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 3

    .line 21
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 23
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f070165

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->isUnderBannerOrCards()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 25
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0701bb

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f07018d

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 27
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 28
    invoke-virtual {v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070181

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 27
    invoke-virtual {v0, p2, p1, p2, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->setPadding(IIII)V

    return-void
.end method
