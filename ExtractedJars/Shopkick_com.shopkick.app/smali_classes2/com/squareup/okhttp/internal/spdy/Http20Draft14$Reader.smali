.class final Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;
.super Ljava/lang/Object;
.source "Http20Draft14.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/FrameReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Http20Draft14;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Reader"
.end annotation


# instance fields
.field private final client:Z

.field private final continuation:Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;

.field final hpackReader:Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;

.field private final source:Lokio/BufferedSource;


# direct methods
.method constructor <init>(Lokio/BufferedSource;IZ)V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    .line 95
    iput-boolean p3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->client:Z

    .line 96
    new-instance p1, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-direct {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;-><init>(Lokio/BufferedSource;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;

    .line 97
    new-instance p1, Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;

    invoke-direct {p1, p2, p3}, Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;-><init>(ILokio/Source;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;

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
    if-nez v1, :cond_3

    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_2

    .line 223
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-short v2, v1

    .line 224
    :cond_2
    invoke-static {p2, p3, v2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$300(IBS)I

    move-result p2

    .line 226
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p1, v0, p4, p3, p2}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->data(ZILokio/BufferedSource;I)V

    .line 227
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    int-to-long p2, v2

    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    return-void

    .line 220
    :cond_3
    new-array p1, v2, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
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

    if-lt p2, v0, :cond_3

    if-nez p4, :cond_2

    .line 334
    iget-object p4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p4}, Lokio/BufferedSource;->readInt()I

    move-result p4

    .line 335
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v2}, Lokio/BufferedSource;->readInt()I

    move-result v2

    sub-int/2addr p2, v0

    .line 337
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromHttp2(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 341
    sget-object p3, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    if-lez p2, :cond_0

    .line 343
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    int-to-long v1, p2

    invoke-interface {p3, v1, v2}, Lokio/BufferedSource;->readByteString(J)Lokio/ByteString;

    move-result-object p3

    .line 345
    :cond_0
    invoke-interface {p1, p4, v0, p3}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->goAway(ILcom/squareup/okhttp/internal/spdy/ErrorCode;Lokio/ByteString;)V

    return-void

    .line 339
    :cond_1
    new-array p1, p3, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v1

    const-string p2, "TYPE_GOAWAY unexpected error code: %d"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 333
    :cond_2
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "TYPE_GOAWAY streamId != 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 332
    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v1

    const-string p2, "TYPE_GOAWAY length < 8: %s"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private readHeaderBlock(ISBI)Ljava/util/List;
    .locals 1
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

    .line 203
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->continuation:Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;

    iput p1, v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;->left:I

    iput p1, v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;->length:I

    .line 204
    iput-short p2, v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;->padding:S

    .line 205
    iput-byte p3, v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;->flags:B

    .line 206
    iput p4, v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;->streamId:I

    .line 210
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;->readHeaders()V

    .line 211
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;->getAndResetHeaderList()Ljava/util/List;

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

    if-eqz p4, :cond_3

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v4, v1

    goto :goto_0

    :cond_0
    move v4, v0

    :goto_0
    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_1

    .line 187
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    :cond_1
    and-int/lit8 v1, p3, 0x20

    if-eqz v1, :cond_2

    .line 190
    invoke-direct {p0, p1, p4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;I)V

    add-int/lit8 p2, p2, -0x5

    .line 194
    :cond_2
    invoke-static {p2, p3, v0}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$300(IBS)I

    move-result p2

    .line 196
    invoke-direct {p0, p2, v0, p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readHeaderBlock(ISBI)Ljava/util/List;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v6, -0x1

    .line 198
    sget-object v8, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->HTTP_20_HEADERS:Lcom/squareup/okhttp/internal/spdy/HeadersMode;

    move-object v2, p1

    move v5, p4

    invoke-interface/range {v2 .. v8}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->headers(ZZIILjava/util/List;Lcom/squareup/okhttp/internal/spdy/HeadersMode;)V

    return-void

    .line 183
    :cond_3
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
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

    if-ne p2, v2, :cond_2

    if-nez p4, :cond_1

    .line 324
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->readInt()I

    move-result p2

    .line 325
    iget-object p4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p4}, Lokio/BufferedSource;->readInt()I

    move-result p4

    and-int/2addr p3, v1

    if-eqz p3, :cond_0

    move v0, v1

    .line 327
    :cond_0
    invoke-interface {p1, v0, p2, p4}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->ping(ZII)V

    return-void

    .line 323
    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_PING streamId != 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 322
    :cond_2
    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_PING length != 8: %s"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

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

    .line 241
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v3}, Lokio/BufferedSource;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v3, v2

    .line 242
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

    if-ne p2, v0, :cond_1

    if-eqz p4, :cond_0

    .line 234
    invoke-direct {p0, p1, p4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;I)V

    return-void

    .line 233
    :cond_0
    new-array p1, p3, [Ljava/lang/Object;

    const-string p2, "TYPE_PRIORITY streamId == 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x1

    .line 232
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, p3

    const-string p2, "TYPE_PRIORITY length: %d != 5"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private readPushPromise(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_0

    .line 312
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    .line 313
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    add-int/lit8 p2, p2, -0x4

    .line 315
    invoke-static {p2, p3, v0}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$300(IBS)I

    move-result p2

    .line 316
    invoke-direct {p0, p2, v0, p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readHeaderBlock(ISBI)Ljava/util/List;

    move-result-object p2

    .line 317
    invoke-interface {p1, p4, v1, p2}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->pushPromise(IILjava/util/List;)V

    return-void

    .line 310
    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
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

    if-ne p2, v1, :cond_2

    if-eqz p4, :cond_1

    .line 249
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->readInt()I

    move-result p2

    .line 250
    invoke-static {p2}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromHttp2(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 254
    invoke-interface {p1, p4, v1}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->rstStream(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    return-void

    .line 252
    :cond_0
    new-array p1, p3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_RST_STREAM unexpected error code: %d"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 248
    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_RST_STREAM streamId == 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 247
    :cond_2
    new-array p1, p3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_RST_STREAM length: %d != 4"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p4, :cond_9

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_1

    if-nez p2, :cond_0

    .line 262
    invoke-interface {p1}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->ackSettings()V

    return-void

    .line 261
    :cond_0
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "FRAME_SIZE_ERROR ack frame should be empty!"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 266
    :cond_1
    rem-int/lit8 p3, p2, 0x6

    if-nez p3, :cond_8

    .line 267
    new-instance p3, Lcom/squareup/okhttp/internal/spdy/Settings;

    invoke-direct {p3}, Lcom/squareup/okhttp/internal/spdy/Settings;-><init>()V

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_6

    .line 269
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v2}, Lokio/BufferedSource;->readShort()S

    move-result v2

    .line 270
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v3}, Lokio/BufferedSource;->readInt()I

    move-result v3

    packed-switch v2, :pswitch_data_0

    .line 297
    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "PROTOCOL_ERROR invalid settings id: %s"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :pswitch_0
    const/16 v4, 0x4000

    if-lt v3, v4, :cond_2

    const v4, 0xffffff

    if-gt v3, v4, :cond_2

    goto :goto_1

    .line 291
    :cond_2
    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :pswitch_1
    const/4 v2, 0x7

    if-ltz v3, :cond_3

    goto :goto_1

    .line 286
    :cond_3
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :pswitch_2
    const/4 v2, 0x4

    goto :goto_1

    :pswitch_3
    if-eqz v3, :cond_5

    if-ne v3, p4, :cond_4

    goto :goto_1

    .line 277
    :cond_4
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 299
    :cond_5
    :goto_1
    :pswitch_4
    invoke-virtual {p3, v2, v0, v3}, Lcom/squareup/okhttp/internal/spdy/Settings;->set(III)Lcom/squareup/okhttp/internal/spdy/Settings;

    add-int/lit8 v1, v1, 0x6

    goto :goto_0

    .line 301
    :cond_6
    invoke-interface {p1, v0, p3}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->settings(ZLcom/squareup/okhttp/internal/spdy/Settings;)V

    .line 302
    invoke-virtual {p3}, Lcom/squareup/okhttp/internal/spdy/Settings;->getHeaderTableSize()I

    move-result p1

    if-ltz p1, :cond_7

    .line 303
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;

    invoke-virtual {p3}, Lcom/squareup/okhttp/internal/spdy/Settings;->getHeaderTableSize()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/internal/spdy/HpackDraft09$Reader;->maxHeaderTableByteCountSetting(I)V

    :cond_7
    return-void

    .line 266
    :cond_8
    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "TYPE_SETTINGS length %% 6 != 0: %s"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 259
    :cond_9
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_SETTINGS streamId != 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    nop

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
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    .line 351
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->readInt()I

    move-result p2

    int-to-long v1, p2

    const-wide/32 v3, 0x7fffffff

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-eqz p2, :cond_0

    .line 353
    invoke-interface {p1, p4, v1, v2}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->windowUpdate(IJ)V

    return-void

    .line 352
    :cond_0
    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, p1, p3

    const-string/jumbo p2, "windowSizeIncrement was 0"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 350
    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, p3

    const-string p2, "TYPE_WINDOW_UPDATE length !=4: %s"

    invoke-static {p2, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 357
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

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

    .line 111
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    const-wide/16 v2, 0x9

    invoke-interface {v1, v2, v3}, Lokio/BufferedSource;->require(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$200(Lokio/BufferedSource;)I

    move-result v1

    const/4 v2, 0x1

    if-ltz v1, :cond_1

    const/16 v3, 0x4000

    if-gt v1, v3, :cond_1

    .line 132
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 133
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v3}, Lokio/BufferedSource;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 134
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v4}, Lokio/BufferedSource;->readInt()I

    move-result v4

    const v5, 0x7fffffff

    and-int/2addr v4, v5

    .line 135
    sget-object v5, Lcom/squareup/okhttp/internal/Internal;->logger:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v5, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Lcom/squareup/okhttp/internal/Internal;->logger:Ljava/util/logging/Logger;

    invoke-static {v2, v4, v1, v0, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->formatHeader(ZIIBB)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 176
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    int-to-long v0, v1

    invoke-interface {p1, v0, v1}, Lokio/BufferedSource;->skip(J)V

    goto :goto_0

    .line 171
    :pswitch_0
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readWindowUpdate(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 167
    :pswitch_1
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readGoAway(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 163
    :pswitch_2
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readPing(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 159
    :pswitch_3
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readPushPromise(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 155
    :pswitch_4
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 151
    :pswitch_5
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readRstStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 147
    :pswitch_6
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 143
    :pswitch_7
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readHeaders(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    goto :goto_0

    .line 139
    :pswitch_8
    invoke-direct {p0, p1, v1, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->readData(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;IBI)V

    :goto_0
    return v2

    .line 130
    :cond_1
    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p1, v0

    const-string v0, "FRAME_SIZE_ERROR: %s"

    invoke-static {v0, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_0
    return v0

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

    .line 101
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->client:Z

    if-eqz v0, :cond_0

    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;->source:Lokio/BufferedSource;

    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$000()Lokio/ByteString;

    move-result-object v1

    invoke-virtual {v1}, Lokio/ByteString;->size()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->readByteString(J)Lokio/ByteString;

    move-result-object v0

    .line 103
    sget-object v1, Lcom/squareup/okhttp/internal/Internal;->logger:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/squareup/okhttp/internal/Internal;->logger:Ljava/util/logging/Logger;

    const-string v4, "<< CONNECTION %s"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 104
    :cond_1
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$000()Lokio/ByteString;

    move-result-object v1

    invoke-virtual {v1, v0}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    .line 105
    :cond_2
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    const-string v0, "Expected a connection header but was %s"

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
