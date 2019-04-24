.class public Lorg/apache/commons/io/CopyUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final DEFAULT_BUFFER_SIZE:I = 0x1000


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 196
    const/16 v0, 0x1000

    new-array v2, v0, [B

    .line 197
    const/4 v3, 0x0

    .line 198
    const/4 v4, 0x0

    .line 199
    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 200
    const/4 v0, 0x0

    invoke-virtual {p1, v2, v0, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 201
    add-int/2addr v3, v4

    goto :goto_0

    .line 203
    :cond_0
    return v3
.end method

.method public static copy(Ljava/io/Reader;Ljava/io/Writer;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 221
    const/16 v0, 0x1000

    new-array v2, v0, [C

    .line 222
    const/4 v3, 0x0

    .line 223
    const/4 v4, 0x0

    .line 224
    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/Reader;->read([C)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 225
    const/4 v0, 0x0

    invoke-virtual {p1, v2, v0, v4}, Ljava/io/Writer;->write([CII)V

    .line 226
    add-int/2addr v3, v4

    goto :goto_0

    .line 228
    :cond_0
    return v3
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 250
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 251
    invoke-static {v1, p1}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 252
    return-void
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 269
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p0, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 270
    invoke-static {v1, p1}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 271
    return-void
.end method

.method public static copy(Ljava/io/Reader;Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 293
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 294
    invoke-static {p0, v1}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 297
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->flush()V

    .line 298
    return-void
.end method

.method public static copy(Ljava/io/Reader;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 316
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 317
    invoke-static {p0, v1}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 320
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->flush()V

    .line 321
    return-void
.end method

.method public static copy(Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 342
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 344
    new-instance v2, Ljava/io/OutputStreamWriter;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 345
    invoke-static {v1, v2}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 348
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->flush()V

    .line 349
    return-void
.end method

.method public static copy(Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 368
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 369
    new-instance v2, Ljava/io/OutputStreamWriter;

    invoke-direct {v2, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 370
    invoke-static {v1, v2}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 373
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->flush()V

    .line 374
    return-void
.end method

.method public static copy(Ljava/lang/String;Ljava/io/Writer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 388
    invoke-virtual {p1, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 389
    return-void
.end method

.method public static copy([BLjava/io/OutputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 136
    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V

    .line 137
    return-void
.end method

.method public static copy([BLjava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 155
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 156
    invoke-static {v0, p1}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/InputStream;Ljava/io/Writer;)V

    .line 157
    return-void
.end method

.method public static copy([BLjava/io/Writer;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 175
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 176
    invoke-static {v0, p1, p2}, Lorg/apache/commons/io/CopyUtils;->copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/lang/String;)V

    .line 177
    return-void
.end method
