.class public interface abstract Lcom/rt/mobile/english/data/videos/VideoService;
.super Ljava/lang/Object;
.source "VideoService.java"


# virtual methods
.method public abstract listEpisodes(Lretrofit/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/videos/VideoEpisode;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/inmotion/videos"
    .end annotation
.end method

.method public abstract listVideoClub(Lretrofit/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/videos/VideoEpisode;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/inmotion"
    .end annotation
.end method

.method public abstract listVideoRTOnline(Lretrofit/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/videos/VideoEpisode;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/rtonline"
    .end annotation
.end method

.method public abstract listVideoRTPlay(Lretrofit/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/videos/VideoEpisode;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/rtplay"
    .end annotation
.end method
