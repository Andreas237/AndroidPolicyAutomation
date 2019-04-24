.class public Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;
.super Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;
.source "TitleBarRow.java"


# instance fields
.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

.field private underBannerOrCards:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public isUnderBannerOrCards()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->underBannerOrCards:Z

    return v0
.end method

.method public setUnderBannerOrCards(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->underBannerOrCards:Z

    return-void
.end method
