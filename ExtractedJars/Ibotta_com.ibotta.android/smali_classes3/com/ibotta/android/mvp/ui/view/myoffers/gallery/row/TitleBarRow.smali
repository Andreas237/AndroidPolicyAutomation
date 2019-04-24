.class public Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;
.super Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;
.source "TitleBarRow.java"


# instance fields
.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V

    .line 11
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
