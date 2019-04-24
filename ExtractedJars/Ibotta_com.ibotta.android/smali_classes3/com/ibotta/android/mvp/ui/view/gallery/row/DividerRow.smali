.class public Lcom/ibotta/android/mvp/ui/view/gallery/row/DividerRow;
.super Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;
.source "DividerRow.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->DIVIDER:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V

    return-void
.end method
