.class public interface abstract Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;
.super Ljava/lang/Object;
.source "GalleryOrganizer.java"


# virtual methods
.method public abstract getGallerySections()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation
.end method

.method public abstract setSourceData(Lcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/common/VerificationType;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)V"
        }
    .end annotation
.end method
