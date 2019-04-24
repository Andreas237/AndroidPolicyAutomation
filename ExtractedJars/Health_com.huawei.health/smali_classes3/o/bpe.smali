.class public Lo/bpe;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 132
    const/16 v0, 0x1000

    new-array v0, v0, [B

    invoke-static {p0, p1, v0}, Lo/bpe;->e(Ljava/io/InputStream;Ljava/io/OutputStream;[B)J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(Landroid/database/Cursor;)V
    .locals 0

    .line 49
    if-eqz p0, :cond_0

    .line 51
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 53
    :cond_0
    return-void
.end method

.method public static b(Ljava/io/OutputStream;)V
    .locals 0

    .line 92
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 93
    return-void
.end method

.method public static d(Ljava/io/Closeable;)V
    .locals 3

    .line 117
    if-eqz p0, :cond_0

    .line 121
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    goto :goto_0

    .line 123
    :catch_0
    move-exception v2

    .line 125
    const-string v0, "IoUtils"

    const-string v1, "close io exception"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :cond_0
    :goto_0
    return-void
.end method

.method public static d(Ljava/io/InputStream;)V
    .locals 0

    .line 82
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 83
    return-void
.end method

.method public static e(Ljava/io/InputStream;Ljava/io/OutputStream;[B)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 97
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 98
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 100
    :cond_1
    const-wide/16 v2, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    :goto_0
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_2

    .line 104
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 105
    int-to-long v0, v4

    add-long/2addr v2, v0

    goto :goto_0

    .line 107
    :cond_2
    return-wide v2
.end method

.method public static e(Ljava/io/InputStream;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 137
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 138
    invoke-static {p0, v2}, Lo/bpe;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 139
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method
