.class final Lcom/squareup/okhttp/internal/spdy/Http2$Reader;
.super Ljava/lang/Object;
.source "Http2.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/FrameReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Http2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Reader"
.end annotation


# instance fields
.field private final client:Z

.field private final continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

.field final hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

.field private final source:Lokio/BufferedSource;


# direct methods
.method constructor <init>(Lokio/BufferedSource;IZ)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    .line 97
    iput-boolean p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->client:Z

    .line 98
    new-instance p1, Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-direct {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;-><init>(Lokio/BufferedSource;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    .line 99
    new-instance p1, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    invoke-direct {p1, p2, p3}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;-><init>(ILokio/Source;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    return-void
.end method

.method private readData(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v3, p3, 0x20

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v1, :cond_2

    const-string p1, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 222
    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_3

    .line 225
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-short v2, v1

    .line 226
    :cond_3
    invoke-static {p2, p3, v2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$400(IBS)I

    move-result p2

    .line 228
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p1, v0, p4, p3, p2}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->data(ZILokio/BufferedSource;I)V

    .line 229
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    int-to-long p2, v2

    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    return-void
.end method

.method private readGoAway(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x1

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-ge p2, v0, :cond_0

    const-string p1, "TYPE_GOAWAY length < 8: %s"

    .line 334
    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v1

    invoke-static {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    if-eqz p4, :cond_1

    const-string p1, "TYPE_GOAWAY streamId != 0"

    .line 335
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 336
    :cond_1
    iget-object p4, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p4}, Lokio/BufferedSource;->readInt()I

    move-result p4

    .line 337
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v2}, Lokio/BufferedSource;->readInt()I

    move-result v2

    sub-int/2addr p2, v0

    .line 339
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromHttp2(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p1, "TYPE_GOAWAY unexpected error code: %d"

    .line 341
    new-array p2, p3, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 343
    :cond_2
    sget-object p3, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    if-lez p2, :cond_3

    .line 345
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    int-to-long v1, p2

    invoke-interface {p3, v1, v2}, Lokio/BufferedSource;->readByteString(J)Lokio/ByteString;

    move-result-object p3

    .line 347
    :cond_3
    invoke-interface {p1, p4, v0, p3}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->goAway(ILcom/squareup/okhttp/internal/spdy/ErrorCode;Lokio/ByteString;)V

    return-void
.end method

.method private readHeaderBlock(ISBI)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ISBI)",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/spdy/Header;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    iput p1, v1, Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;->left:I

    iput p1, v0, Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;->length:I

    .line 206
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    iput-short p2, p1, Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;->padding:S

    .line 207
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    iput-byte p3, p1, Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;->flags:B

    .line 208
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;

    iput p4, p1, Lcom/squareup/okhttp/internal/spdy/Http2$ContinuationSource;->streamId:I

    .line 212
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;->readHeaders()V

    .line 213
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;->getAndResetHeaderList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private readHeaders(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p4, :cond_0

    const-string p1, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 185
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v4, v1

    goto :goto_0

    :cond_1
    move v4, v0

    :goto_0
    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_2

    .line 189
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    :cond_2
    and-int/lit8 v1, p3, 0x20

    if-eqz v1, :cond_3

    .line 192
    invoke-direct {p0, p1, p4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;I)V

    add-int/lit8 p2, p2, -0x5

    .line 196
    :cond_3
    invoke-static {p2, p3, v0}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$400(IBS)I

    move-result p2

    .line 198
    invoke-direct {p0, p2, v0, p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readHeaderBlock(ISBI)Ljava/util/List;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v6, -0x1

    .line 200
    sget-object v8, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->HTTP_20_HEADERS:Lcom/squareup/okhttp/internal/spdy/HeadersMode;

    move-object v2, p1

    move v5, p4

    invoke-interface/range {v2 .. v8}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->headers(ZZIILjava/util/List;Lcom/squareup/okhttp/internal/spdy/HeadersMode;)V

    return-void
.end method

.method private readPing(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-eq p2, v2, :cond_0

    const-string p1, "TYPE_PING length != 8: %s"

    .line 324
    new-array p3, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v0

    invoke-static {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    if-eqz p4, :cond_1

    const-string p1, "TYPE_PING streamId != 0"

    .line 325
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 326
    :cond_1
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->readInt()I

    move-result p2

    .line 327
    iget-object p4, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p4}, Lokio/BufferedSource;->readInt()I

    move-result p4

    and-int/2addr p3, v1

    if-eqz p3, :cond_2

    move v0, v1

    .line 329
    :cond_2
    invoke-interface {p1, v0, p2, p4}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->ping(ZII)V

    return-void
.end method

.method private readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 240
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readInt()I

    move-result v0

    const/high16 v1, -0x80000000

    and-int/2addr v1, v0

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const v3, 0x7fffffff

    and-int/2addr v0, v3

    .line 243
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v3}, Lokio/BufferedSource;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v3, v2

    .line 244
    invoke-interface {p1, p2, v0, v3, v1}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->priority(IIIZ)V

    return-void
.end method

.method private readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x0

    const/4 v0, 0x5

    if-eq p2, v0, :cond_0

    const-string p1, "TYPE_PRIORITY length: %d != 5"

    const/4 p4, 0x1

    .line 234
    new-array p4, p4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p4, p3

    invoke-static {p1, p4}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    if-nez p4, :cond_1

    const-string p1, "TYPE_PRIORITY streamId == 0"

    .line 235
    new-array p2, p3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 236
    :cond_1
    invoke-direct {p0, p1, p4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;I)V

    return-void
.end method

.method private readPushPromise(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p4, :cond_0

    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 312
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_1

    .line 314
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    .line 315
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    add-int/lit8 p2, p2, -0x4

    .line 317
    invoke-static {p2, p3, v0}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$400(IBS)I

    move-result p2

    .line 318
    invoke-direct {p0, p2, v0, p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readHeaderBlock(ISBI)Ljava/util/List;

    move-result-object p2

    .line 319
    invoke-interface {p1, p4, v1, p2}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->pushPromise(IILjava/util/List;)V

    return-void
.end method

.method private readRstStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-eq p2, v1, :cond_0

    const-string p1, "TYPE_RST_STREAM length: %d != 4"

    .line 249
    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v0

    invoke-static {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    if-nez p4, :cond_1

    const-string p1, "TYPE_RST_STREAM streamId == 0"

    .line 250
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 251
    :cond_1
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->readInt()I

    move-result p2

    .line 252
    invoke-static {p2}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromHttp2(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v1

    if-nez v1, :cond_2

    const-string p1, "TYPE_RST_STREAM unexpected error code: %d"

    .line 254
    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v0

    invoke-static {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 256
    :cond_2
    invoke-interface {p1, p4, v1}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->rstStream(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    return-void
.end method

.method private readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    const-string p1, "TYPE_SETTINGS streamId != 0"

    .line 261
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_2

    if-eqz p2, :cond_1

    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 263
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 264
    :cond_1
    invoke-interface {p1}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->ackSettings()V

    return-void

    .line 268
    :cond_2
    rem-int/lit8 p3, p2, 0x6

    if-eqz p3, :cond_3

    const-string p1, "TYPE_SETTINGS length %% 6 != 0: %s"

    new-array p3, p4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v0

    invoke-static {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 269
    :cond_3
    new-instance p3, Lcom/squareup/okhttp/internal/spdy/Settings;

    invoke-direct {p3}, Lcom/squareup/okhttp/internal/spdy/Settings;-><init>()V

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_6

    .line 271
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v2}, Lokio/BufferedSource;->readShort()S

    move-result v2

    .line 272
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v3}, Lokio/BufferedSource;->readInt()I

    move-result v3

    packed-switch v2, :pswitch_data_0

    const-string p1, "PROTOCOL_ERROR invalid settings id: %s"

    .line 299
    new-array p2, p4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p3

    aput-object p3, p2, v0

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :pswitch_0
    const/16 v4, 0x4000

    if-lt v3, v4, :cond_4

    const v4, 0xffffff

    if-le v3, v4, :cond_5

    :cond_4
    const-string p1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    .line 293
    new-array p2, p4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v0

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :pswitch_1
    const/4 v2, 0x7

    if-gez v3, :cond_5

    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 288
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :pswitch_2
    const/4 v2, 0x4

    goto :goto_1

    :pswitch_3
    if-eqz v3, :cond_5

    if-eq v3, p4, :cond_5

    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 279
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 301
    :cond_5
    :goto_1
    :pswitch_4
    invoke-virtual {p3, v2, v0, v3}, Lcom/squareup/okhttp/internal/spdy/Settings;->set(III)Lcom/squareup/okhttp/internal/spdy/Settings;

    add-int/lit8 v1, v1, 0x6

    goto :goto_0

    .line 303
    :cond_6
    invoke-interface {p1, v0, p3}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->settings(ZLcom/squareup/okhttp/internal/spdy/Settings;)V

    .line 304
    invoke-virtual {p3}, Lcom/squareup/okhttp/internal/spdy/Settings;->getHeaderTableSize()I

    move-result p1

    if-ltz p1, :cond_7

    .line 305
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    invoke-virtual {p3}, Lcom/squareup/okhttp/internal/spdy/Settings;->getHeaderTableSize()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;->headerTableSizeSetting(I)V

    :cond_7
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private readWindowUpdate(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x4

    if-eq p2, v1, :cond_0

    const-string p1, "TYPE_WINDOW_UPDATE length !=4: %s"

    .line 352
    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p4, p3

    invoke-static {p1, p4}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 353
    :cond_0
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->readInt()I

    move-result p2

    int-to-long v1, p2

    const-wide/32 v3, 0x7fffffff

    and-long v5, v1, v3

    const-wide/16 v1, 0x0

    cmp-long p2, v5, v1

    if-nez p2, :cond_1

    const-string p1, "windowSizeIncrement was 0"

    .line 354
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    aput-object p4, p2, p3

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 355
    :cond_1
    invoke-interface {p1, p4, v5, v6}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->windowUpdate(IJ)V

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

    .line 359
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->close()V

    return-void
.end method

.method public nextFrame(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 113
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    const-wide/16 v2, 0x9

    invoke-interface {v1, v2, v3}, Lokio/BufferedSource;->require(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$300(Lokio/BufferedSource;)I

    move-result v1

    const/4 v2, 0x1

    if-ltz v1, :cond_2

    const/16 v3, 0x4000

    if-le v1, v3, :cond_0

    goto :goto_1

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 135
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v3}, Lokio/BufferedSource;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 136
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v4}, Lokio/BufferedSource;->readInt()I

    move-result v4

    const v5, 0x7fffffff

    and-int/2addr v4, v5

    .line 137
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v5

    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v5, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v5

    invoke-static {v2, v4, v1, v0, v3}, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->formatHeader(ZIIBB)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_1
    packed-switch v0, :pswitch_data_0

    .line 178
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    int-to-long v0, v1

    invoke-interface {p1, v0, v1}, Lokio/BufferedSource;->skip(J)V

    goto :goto_0

    .line 173
    :pswitch_0
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readWindowUpdate(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 169
    :pswitch_1
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readGoAway(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 165
    :pswitch_2
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readPing(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 161
    :pswitch_3
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readPushPromise(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 157
    :pswitch_4
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 153
    :pswitch_5
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readRstStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 149
    :pswitch_6
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 145
    :pswitch_7
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readHeaders(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 141
    :pswitch_8
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->readData(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    :goto_0
    return v2

    :cond_2
    :goto_1
    const-string p1, "FRAME_SIZE_ERROR: %s"

    .line 132
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v0

    invoke-static {p1, v2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readConnectionPreface()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 103
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->client:Z

    if-eqz v0, :cond_0

    return-void

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Reader;->source:Lokio/BufferedSource;

    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$000()Lokio/ByteString;

    move-result-object v1

    invoke-virtual {v1}, Lokio/ByteString;->size()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->readByteString(J)Lokio/ByteString;

    move-result-object v0

    .line 105
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v1

    const-string v4, "<< CONNECTION %s"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 106
    :cond_1
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$000()Lokio/ByteString;

    move-result-object v1

    invoke-virtual {v1, v0}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "Expected a connection header but was %s"

    .line 107
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v2

    invoke-static {v1, v3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$200(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_2
    return-void
.end method
