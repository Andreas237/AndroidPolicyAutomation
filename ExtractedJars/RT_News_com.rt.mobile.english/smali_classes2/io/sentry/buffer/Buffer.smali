.class public interface abstract Lio/sentry/buffer/Buffer;
.super Ljava/lang/Object;
.source "Buffer.java"


# virtual methods
.method public abstract add(Lio/sentry/event/Event;)V
.end method

.method public abstract discard(Lio/sentry/event/Event;)V
.end method

.method public abstract getEvents()Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lio/sentry/event/Event;",
            ">;"
        }
    .end annotation
.end method
