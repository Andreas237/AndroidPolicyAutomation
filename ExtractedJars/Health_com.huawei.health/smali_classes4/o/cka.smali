.class public final Lo/cka;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Lo/cjq;->e(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    invoke-static {p1}, Lo/cjh;->b(Landroid/content/Context;)Lo/cjh;

    move-result-object v4

    invoke-virtual {v4}, Lo/cjh;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, [B

    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/cjq;->e(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/io/OutputStream;)V
    .locals 3

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "StreamUtil"

    const-string v1, "closeStream(): IOException: close OutputStream error!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public static d(Ljava/io/InputStream;)V
    .locals 3

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "StreamUtil"

    const-string v1, "closeStream(): IOException: close InputStream error!"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public static e(Ljava/io/InputStream;I)Ljava/lang/String;
    .locals 6

    new-instance v3, Lo/cjk;

    invoke-direct {v3, p1}, Lo/cjk;-><init>(I)V

    new-array v4, p1, [B

    :goto_0
    invoke-virtual {p0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {v3, v4, v5}, Lo/cjk;->a([BI)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lo/cjk;->d()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v3}, Lo/cjk;->e()[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    invoke-static {p1}, Lo/cjh;->b(Landroid/content/Context;)Lo/cjh;

    move-result-object v1

    invoke-static {}, Lo/cjq;->c()[B

    move-result-object v2

    invoke-virtual {v1}, Lo/cjh;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2, p0}, Lo/cjq;->d(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo/cjq;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e([B)[B
    .locals 6

    const/4 v1, 0x0

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v3, Ljava/util/zip/Deflater;

    invoke-direct {v3}, Ljava/util/zip/Deflater;-><init>()V

    invoke-virtual {v3, p0}, Ljava/util/zip/Deflater;->setInput([B)V

    invoke-virtual {v3}, Ljava/util/zip/Deflater;->finish()V

    const/16 v0, 0x400

    new-array v4, v0, [B

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v3}, Ljava/util/zip/Deflater;->finished()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/zip/Deflater;->deflate([B)I

    move-result v5

    const/4 v0, 0x0

    invoke-virtual {v2, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v3}, Ljava/util/zip/Deflater;->end()V

    invoke-static {v2}, Lo/cka;->c(Ljava/io/OutputStream;)V

    return-object v1
.end method
