.class public interface abstract Lcom/launchdarkly/eventsource/EventHandler;
.super Ljava/lang/Object;
.source "EventHandler.java"


# virtual methods
.method public abstract onClosed()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract onComment(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract onError(Ljava/lang/Throwable;)V
.end method

.method public abstract onMessage(Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract onOpen()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
