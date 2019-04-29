.class final Lcom/squareup/okhttp/internal/spdy/Http2$Writer;
.super Ljava/lang/Object;
.source "Http2.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/FrameWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Http2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Writer"
.end annotation


# instance fields
.field private final client:Z

.field private closed:Z

.field private final hpackBuffer:Lokio/Buffer;

.field private final hpackWriter:Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

.field private maxFrameSize:I

.field private final sink:Lokio/BufferedSink;


# direct methods
.method constructor <init>(Lokio/BufferedSink;Z)V
    .locals 0

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 372
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    .line 373
    iput-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->client:Z

    .line 374
    new-instance p1, Lokio/Buffer;

    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    .line 375
    new-instance p1, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-direct {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;-><init>(Lokio/Buffer;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackWriter:Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

    const/16 p1, 0x4000

    .line 376
    iput p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    return-void
.end method

.method private writeContinuationFrames(IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    .line 460
    iget v2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    int-to-long v2, v2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    int-to-long v3, v2

    sub-long v5, p2, v3

    const/16 p2, 0x9

    cmp-long p3, v5, v0

    if-nez p3, :cond_0

    const/4 p3, 0x4

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    .line 462
    :goto_1
    invoke-virtual {p0, p1, v2, p2, p3}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 463
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-interface {p2, p3, v3, v4}, Lokio/BufferedSink;->write(Lokio/Buffer;J)V

    move-wide p2, v5

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized ackSettings(Lcom/squareup/okhttp/internal/spdy/Settings;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 385
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 386
    :cond_0
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/internal/spdy/Settings;->getMaxFrameSize(I)I

    move-result p1

    iput p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    const/4 p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 391
    invoke-virtual {p0, v1, v1, p1, v0}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 392
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 393
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 384
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x1

    .line 564
    :try_start_0
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    .line 565
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 566
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 563
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized connectionPreface()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 396
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 397
    :cond_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->client:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    .line 398
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 399
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, ">> CONNECTION %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$000()Lokio/ByteString;

    move-result-object v4

    invoke-virtual {v4}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 401
    :cond_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$000()Lokio/ByteString;

    move-result-object v1

    invoke-virtual {v1}, Lokio/ByteString;->toByteArray()[B

    move-result-object v1

    invoke-interface {v0, v1}, Lokio/BufferedSink;->write([B)Lokio/BufferedSink;

    .line 402
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 403
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 395
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized data(ZILokio/Buffer;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 486
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    int-to-byte v0, p1

    .line 489
    :cond_1
    invoke-virtual {p0, p2, v0, p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->dataFrame(IBLokio/Buffer;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 485
    monitor-exit p0

    throw p1
.end method

.method dataFrame(IBLokio/Buffer;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 494
    invoke-virtual {p0, p1, p4, v0, p2}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    if-lez p4, :cond_0

    .line 496
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    int-to-long v0, p4

    invoke-interface {p1, p3, v0, v1}, Lokio/BufferedSink;->write(Lokio/Buffer;J)V

    :cond_0
    return-void
.end method

.method public declared-synchronized flush()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 380
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 381
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 379
    monitor-exit p0

    throw v0
.end method

.method frameHeader(IIBB)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 569
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$100()Ljava/util/logging/Logger;

    move-result-object v0

    invoke-static {v1, p1, p2, p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->formatHeader(ZIIBB)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 570
    :cond_0
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    const/4 v2, 0x1

    if-le p2, v0, :cond_1

    const-string p1, "FRAME_SIZE_ERROR length > %d: %d"

    const/4 p3, 0x2

    .line 571
    new-array p3, p3, [Ljava/lang/Object;

    iget p4, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p3, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p3, v2

    invoke-static {p1, p3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$500(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    const/high16 v0, -0x80000000

    and-int/2addr v0, p1

    if-eqz v0, :cond_2

    const-string p2, "reserved bit set: %s"

    .line 573
    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p3, v1

    invoke-static {p2, p3}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$500(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 574
    :cond_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-static {v0, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$600(Lokio/BufferedSink;I)V

    .line 575
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    and-int/lit16 p3, p3, 0xff

    invoke-interface {p2, p3}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 576
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    and-int/lit16 p3, p4, 0xff

    invoke-interface {p2, p3}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 577
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    const p3, 0x7fffffff

    and-int/2addr p1, p3

    invoke-interface {p2, p1}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    return-void
.end method

.method public declared-synchronized goAway(ILcom/squareup/okhttp/internal/spdy/ErrorCode;[B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 533
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 534
    :cond_0
    iget v0, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->httpCode:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    const-string p1, "errorCode.httpCode == -1"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$500(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    const/16 v0, 0x8

    .line 535
    array-length v1, p3

    add-int/2addr v0, v1

    const/4 v1, 0x7

    .line 539
    invoke-virtual {p0, v2, v0, v1, v2}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 540
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {v0, p1}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 541
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    iget p2, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->httpCode:I

    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 542
    array-length p1, p3

    if-lez p1, :cond_2

    .line 543
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1, p3}, Lokio/BufferedSink;->write([B)Lokio/BufferedSink;

    .line 545
    :cond_2
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 546
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 532
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized headers(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/spdy/Header;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 421
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x0

    .line 422
    invoke-virtual {p0, v0, p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->headers(ZILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 423
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 420
    monitor-exit p0

    throw p1
.end method

.method headers(ZILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/spdy/Header;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 443
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 444
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 445
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackWriter:Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

    invoke-virtual {v0, p3}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->writeHeaders(Ljava/util/List;)V

    .line 447
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-virtual {p3}, Lokio/Buffer;->size()J

    move-result-wide v0

    .line 448
    iget p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    int-to-long v2, p3

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    int-to-long v2, p3

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    const/4 v4, 0x4

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-eqz p1, :cond_3

    or-int/lit8 p1, v4, 0x1

    int-to-byte v4, p1

    :cond_3
    const/4 p1, 0x1

    .line 452
    invoke-virtual {p0, p2, p3, p1, v4}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 453
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-interface {p1, p3, v2, v3}, Lokio/BufferedSink;->write(Lokio/Buffer;J)V

    cmp-long p1, v0, v2

    if-lez p1, :cond_4

    sub-long v4, v0, v2

    .line 455
    invoke-direct {p0, p2, v4, v5}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->writeContinuationFrames(IJ)V

    :cond_4
    return-void
.end method

.method public maxDataLength()I
    .locals 1

    .line 481
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    return v0
.end method

.method public declared-synchronized ping(ZII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 520
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/16 v0, 0x8

    const/4 v1, 0x6

    const/4 v2, 0x0

    .line 525
    invoke-virtual {p0, v2, v0, v1, p1}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 526
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 527
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1, p3}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 528
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 529
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 519
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized pushPromise(IILjava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/spdy/Header;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 427
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 428
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 429
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackWriter:Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

    invoke-virtual {v0, p3}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->writeHeaders(Ljava/util/List;)V

    .line 431
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-virtual {p3}, Lokio/Buffer;->size()J

    move-result-wide v0

    .line 432
    iget p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->maxFrameSize:I

    const/4 v2, 0x4

    sub-int/2addr p3, v2

    int-to-long v3, p3

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int p3, v3

    const/4 v3, 0x5

    int-to-long v4, p3

    cmp-long v6, v0, v4

    if-nez v6, :cond_2

    move v6, v2

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    add-int/2addr p3, v2

    .line 435
    invoke-virtual {p0, p1, p3, v3, v6}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 436
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    const v2, 0x7fffffff

    and-int/2addr p2, v2

    invoke-interface {p3, p2}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 437
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->hpackBuffer:Lokio/Buffer;

    invoke-interface {p2, p3, v4, v5}, Lokio/BufferedSink;->write(Lokio/Buffer;J)V

    cmp-long p2, v0, v4

    if-lez p2, :cond_3

    sub-long p2, v0, v4

    .line 439
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->writeContinuationFrames(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 440
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 426
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized rstStream(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 469
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 470
    :cond_0
    iget v0, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyRstCode:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x0

    .line 475
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 476
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    iget p2, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->httpCode:I

    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 477
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 478
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 468
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized settings(Lcom/squareup/okhttp/internal/spdy/Settings;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 501
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 502
    :cond_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/Settings;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x4

    .line 506
    invoke-virtual {p0, v1, v0, v2, v1}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    :goto_0
    const/16 v0, 0xa

    if-ge v1, v0, :cond_4

    .line 508
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Settings;->isSet(I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    if-ne v1, v2, :cond_2

    const/4 v0, 0x3

    goto :goto_1

    :cond_2
    const/4 v0, 0x7

    if-ne v1, v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    .line 512
    :goto_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {v3, v0}, Lokio/BufferedSink;->writeShort(I)Lokio/BufferedSink;

    .line 513
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Settings;->get(I)I

    move-result v3

    invoke-interface {v0, v3}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 515
    :cond_4
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 516
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 500
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized synReply(ZILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/spdy/Header;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 415
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 416
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->headers(ZILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 417
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 414
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized synStream(ZZIILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/spdy/Header;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    if-eqz p2, :cond_0

    .line 408
    :try_start_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 409
    :cond_0
    iget-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz p2, :cond_1

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 410
    :cond_1
    invoke-virtual {p0, p1, p3, p5}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->headers(ZILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    monitor-exit p0

    return-void

    .line 407
    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized windowUpdate(IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 550
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->closed:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    const-wide/32 v1, 0x7fffffff

    cmp-long v3, p2, v1

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    const/16 v2, 0x8

    .line 558
    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->frameHeader(IIBB)V

    .line 559
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    long-to-int p2, p2

    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeInt(I)Lokio/BufferedSink;

    .line 560
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Http2$Writer;->sink:Lokio/BufferedSink;

    invoke-interface {p1}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 561
    monitor-exit p0

    return-void

    :cond_2
    :goto_0
    :try_start_1
    const-string p1, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s"

    const/4 v1, 0x1

    .line 552
    new-array v1, v1, [Ljava/lang/Object;

    .line 553
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v1, v0

    .line 552
    invoke-static {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Http2;->access$500(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 549
    monitor-exit p0

    throw p1
.end method
