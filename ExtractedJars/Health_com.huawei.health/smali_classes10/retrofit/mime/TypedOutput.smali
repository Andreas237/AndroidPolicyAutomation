.class public interface abstract Lretrofit/mime/TypedOutput;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract fileName()Ljava/lang/String;
.end method

.method public abstract length()J
.end method

.method public abstract mimeType()Ljava/lang/String;
.end method

.method public abstract writeTo(Ljava/io/OutputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
