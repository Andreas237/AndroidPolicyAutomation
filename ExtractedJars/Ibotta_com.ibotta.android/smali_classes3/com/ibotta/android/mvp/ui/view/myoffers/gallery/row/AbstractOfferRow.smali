.class public abstract Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;
.super Ljava/lang/Object;
.source "AbstractOfferRow.java"


# instance fields
.field private final galleryRowType:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;->galleryRowType:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;->galleryRowType:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->ordinal()I

    move-result v0

    return v0
.end method

.method public getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;->galleryRowType:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    return-object v0
.end method
