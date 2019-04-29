.class public interface abstract Lcom/rt/mobile/english/data/galleries/GalleriesService;
.super Ljava/lang/Object;
.source "GalleriesService.java"


# virtual methods
.method public abstract listGalleries(Lretrofit/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/galleries/Gallery;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/invision"
    .end annotation
.end method

.method public abstract listGalleryPhotos(Ljava/lang/String;Lretrofit/Callback;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit/http/Path;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/galleries/GalleryPhoto;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/invision/{id}/photos"
    .end annotation
.end method
