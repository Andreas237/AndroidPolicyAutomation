.class public interface abstract Lio/sentry/connection/Connection;
.super Ljava/lang/Object;
.source "Connection.java"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract addEventSendCallback(Lio/sentry/connection/EventSendCallback;)V
.end method

.method public abstract send(Lio/sentry/event/Event;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/sentry/connection/ConnectionException;
        }
    .end annotation
.end method
