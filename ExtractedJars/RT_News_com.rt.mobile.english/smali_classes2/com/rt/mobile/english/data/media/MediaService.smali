.class public interface abstract Lcom/rt/mobile/english/data/media/MediaService;
.super Ljava/lang/Object;
.source "MediaService.java"


# virtual methods
.method public abstract getListMedia(Lretrofit/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/media/Media;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/media"
    .end annotation
.end method

.method public abstract listGalleries(Ljava/lang/String;Lretrofit/Callback;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit/http/Path;
            value = "url"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/galleries/Gallery;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/{url}"
    .end annotation
.end method

.method public abstract listVideo(Ljava/lang/String;Lretrofit/Callback;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit/http/Path;
            value = "url"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/videos/VideoEpisode;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/{url}"
    .end annotation
.end method
