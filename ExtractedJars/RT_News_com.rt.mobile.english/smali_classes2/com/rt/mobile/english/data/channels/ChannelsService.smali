.class public interface abstract Lcom/rt/mobile/english/data/channels/ChannelsService;
.super Ljava/lang/Object;
.source "ChannelsService.java"


# virtual methods
.method public abstract listChannels(Lretrofit/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/Channel;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/video"
    .end annotation
.end method

.method public abstract listScheduleItems(Ljava/lang/String;Lretrofit/Callback;)V
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
            "Lcom/rt/mobile/english/data/channels/ScheduleItem;",
            ">;>;>;)V"
        }
    .end annotation

    .annotation runtime Lretrofit/http/GET;
        value = "/video/{id}/schedule"
    .end annotation
.end method
