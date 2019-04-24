.class public Lorg/apache/commons/io/output/WriterOutputStream;
.super Ljava/io/OutputStream;
.source "SourceFile"


# static fields
.field private static final DEFAULT_BUFFER_SIZE:I = 0x400


# instance fields
.field private final decoder:Ljava/nio/charset/CharsetDecoder;

.field private final decoderIn:Ljava/nio/ByteBuffer;

.field private final decoderOut:Ljava/nio/CharBuffer;

.field private final writeImmediately:Z

.field private final writer:Ljava/io/Writer;


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 203
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    const/16 v1, 0x400

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/apache/commons/io/output/WriterOutputStream;-><init>(Ljava/io/Writer;Ljava/nio/charset/Charset;IZ)V

    .line 204
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 2

    .line 190
    const/16 v0, 0x400

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/apache/commons/io/output/WriterOutputStream;-><init>(Ljava/io/Writer;Ljava/lang/String;IZ)V

    .line 191
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Ljava/lang/String;IZ)V
    .locals 1

    .line 178
    invoke-static {p2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3, p4}, Lorg/apache/commons/io/output/WriterOutputStream;-><init>(Ljava/io/Writer;Ljava/nio/charset/Charset;IZ)V

    .line 179
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Ljava/nio/charset/Charset;)V
    .locals 2

    .line 161
    const/16 v0, 0x400

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/apache/commons/io/output/WriterOutputStream;-><init>(Ljava/io/Writer;Ljava/nio/charset/Charset;IZ)V

    .line 162
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Ljava/nio/charset/Charset;IZ)V
    .locals 2

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    .line 145
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    .line 146
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    const-string v1, "?"

    .line 147
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->replaceWith(Ljava/lang/String;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    .line 143
    invoke-direct {p0, p1, v0, p3, p4}, Lorg/apache/commons/io/output/WriterOutputStream;-><init>(Ljava/io/Writer;Ljava/nio/charset/CharsetDecoder;IZ)V

    .line 150
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Ljava/nio/charset/CharsetDecoder;)V
    .locals 2

    .line 104
    const/16 v0, 0x400

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/apache/commons/io/output/WriterOutputStream;-><init>(Ljava/io/Writer;Ljava/nio/charset/CharsetDecoder;IZ)V

    .line 105
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Ljava/nio/charset/CharsetDecoder;IZ)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 85
    const/16 v0, 0x80

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderIn:Ljava/nio/ByteBuffer;

    .line 122
    invoke-virtual {p2}, Ljava/nio/charset/CharsetDecoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/output/WriterOutputStream;->checkIbmJdkWithBrokenUTF16(Ljava/nio/charset/Charset;)V

    .line 123
    iput-object p1, p0, Lorg/apache/commons/io/output/WriterOutputStream;->writer:Ljava/io/Writer;

    .line 124
    iput-object p2, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoder:Ljava/nio/charset/CharsetDecoder;

    .line 125
    iput-boolean p4, p0, Lorg/apache/commons/io/output/WriterOutputStream;->writeImmediately:Z

    .line 126
    invoke-static {p3}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderOut:Ljava/nio/CharBuffer;

    .line 127
    return-void
.end method

.method private static checkIbmJdkWithBrokenUTF16(Ljava/nio/charset/Charset;)V
    .locals 10

    .line 319
    const-string v0, "UTF-16"

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 320
    return-void

    .line 322
    :cond_0
    const-string v2, "v\u00e9s"

    .line 323
    const-string v0, "v\u00e9s"

    invoke-virtual {v0, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 325
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    .line 326
    const/16 v0, 0x10

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 327
    const-string v0, "v\u00e9s"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v6

    .line 328
    array-length v7, v3

    .line 329
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    .line 330
    aget-byte v0, v3, v8

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 331
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 333
    add-int/lit8 v0, v7, -0x1

    if-ne v8, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    :try_start_0
    invoke-virtual {v4, v5, v6, v0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 337
    goto :goto_2

    .line 334
    :catch_0
    move-exception v9

    .line 335
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 338
    :goto_2
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 329
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 340
    :cond_2
    invoke-virtual {v6}, Ljava/nio/CharBuffer;->rewind()Ljava/nio/Buffer;

    .line 341
    const-string v0, "v\u00e9s"

    invoke-virtual {v6}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 342
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 346
    :cond_3
    return-void
.end method

.method private flushOutput()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 307
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderOut:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->position()I

    move-result v0

    if-lez v0, :cond_0

    .line 308
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->writer:Ljava/io/Writer;

    iget-object v1, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderOut:Ljava/nio/CharBuffer;

    invoke-virtual {v1}, Ljava/nio/CharBuffer;->array()[C

    move-result-object v1

    iget-object v2, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderOut:Ljava/nio/CharBuffer;

    invoke-virtual {v2}, Ljava/nio/CharBuffer;->position()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 309
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderOut:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->rewind()Ljava/nio/Buffer;

    .line 311
    :cond_0
    return-void
.end method

.method private processInput(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 283
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderIn:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 286
    :goto_0
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoder:Ljava/nio/charset/CharsetDecoder;

    iget-object v1, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderIn:Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderOut:Ljava/nio/CharBuffer;

    invoke-virtual {v0, v1, v2, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v3

    .line 287
    invoke-virtual {v3}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    invoke-direct {p0}, Lorg/apache/commons/io/output/WriterOutputStream;->flushOutput()V

    goto :goto_0

    .line 289
    :cond_0
    invoke-virtual {v3}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 290
    goto :goto_1

    .line 294
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected coder result"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 298
    :goto_1
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderIn:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 299
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 270
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/apache/commons/io/output/WriterOutputStream;->processInput(Z)V

    .line 271
    invoke-direct {p0}, Lorg/apache/commons/io/output/WriterOutputStream;->flushOutput()V

    .line 272
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->writer:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 273
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 258
    invoke-direct {p0}, Lorg/apache/commons/io/output/WriterOutputStream;->flushOutput()V

    .line 259
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->writer:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 260
    return-void
.end method

.method public write(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 247
    const/4 v0, 0x1

    new-array v0, v0, [B

    int-to-byte v1, p1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lorg/apache/commons/io/output/WriterOutputStream;->write([BII)V

    .line 248
    return-void
.end method

.method public write([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 236
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lorg/apache/commons/io/output/WriterOutputStream;->write([BII)V

    .line 237
    return-void
.end method

.method public write([BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 216
    :goto_0
    if-lez p3, :cond_0

    .line 217
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderIn:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 218
    iget-object v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->decoderIn:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 219
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/apache/commons/io/output/WriterOutputStream;->processInput(Z)V

    .line 220
    sub-int/2addr p3, v1

    .line 221
    add-int/2addr p2, v1

    .line 222
    goto :goto_0

    .line 223
    :cond_0
    iget-boolean v0, p0, Lorg/apache/commons/io/output/WriterOutputStream;->writeImmediately:Z

    if-eqz v0, :cond_1

    .line 224
    invoke-direct {p0}, Lorg/apache/commons/io/output/WriterOutputStream;->flushOutput()V

    .line 226
    :cond_1
    return-void
.end method
