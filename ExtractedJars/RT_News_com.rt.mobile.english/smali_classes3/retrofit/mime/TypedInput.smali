.class public interface abstract Lretrofit/mime/TypedInput;
.super Ljava/lang/Object;
.source "TypedInput.java"


# virtual methods
.method public abstract in()Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract length()J
.end method

.method public abstract mimeType()Ljava/lang/String;
.end method
