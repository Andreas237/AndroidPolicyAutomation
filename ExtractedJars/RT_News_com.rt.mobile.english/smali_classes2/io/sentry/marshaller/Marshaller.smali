.class public interface abstract Lio/sentry/marshaller/Marshaller;
.super Ljava/lang/Object;
.source "Marshaller.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/marshaller/Marshaller$UncloseableOutputStream;
    }
.end annotation


# virtual methods
.method public abstract getContentEncoding()Ljava/lang/String;
.end method

.method public abstract getContentType()Ljava/lang/String;
.end method

.method public abstract marshall(Lio/sentry/event/Event;Ljava/io/OutputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
