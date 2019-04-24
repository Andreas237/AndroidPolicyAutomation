.class public final Lo/cwt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b([B)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 114
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public static c(Ljava/io/Closeable;)V
    .locals 5

    .line 97
    if-eqz p0, :cond_0

    .line 99
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    goto :goto_0

    .line 100
    :catch_0
    move-exception v4

    .line 101
    const-string v0, "IOUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "An exception occurred while closing the \'Closeable\' object."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :cond_0
    :goto_0
    return-void
.end method

.method public static c(Ljava/io/InputStream;)V
    .locals 0

    .line 79
    invoke-static {p0}, Lo/cwt;->c(Ljava/io/Closeable;)V

    .line 80
    return-void
.end method

.method public static c(Ljava/io/Reader;)V
    .locals 0

    .line 61
    invoke-static {p0}, Lo/cwt;->c(Ljava/io/Closeable;)V

    .line 62
    return-void
.end method
