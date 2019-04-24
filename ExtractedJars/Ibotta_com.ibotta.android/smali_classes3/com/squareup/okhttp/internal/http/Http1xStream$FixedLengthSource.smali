.class Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;
.super Lcom/squareup/okhttp/internal/http/Http1xStream$AbstractSource;
.source "Http1xStream.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/Http1xStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FixedLengthSource"
.end annotation


# instance fields
.field private bytesRemaining:J

.field final synthetic this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/internal/http/Http1xStream;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 381
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/squareup/okhttp/internal/http/Http1xStream$AbstractSource;-><init>(Lcom/squareup/okhttp/internal/http/Http1xStream;Lcom/squareup/okhttp/internal/http/Http1xStream$1;)V

    .line 382
    iput-wide p2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    .line 383
    iget-wide p1, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    .line 384
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->endOfInput()V

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 407
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->closed:Z

    if-eqz v0, :cond_0

    return-void

    .line 409
    :cond_0
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, Lcom/squareup/okhttp/internal/Util;->discard(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 411
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->unexpectedEndOfInput()V

    :cond_1
    const/4 v0, 0x1

    .line 414
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->closed:Z

    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4

    .line 390
    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->closed:Z

    if-nez v2, :cond_3

    .line 391
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v0

    if-nez v6, :cond_0

    return-wide v4

    .line 393
    :cond_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/Http1xStream;->access$600(Lcom/squareup/okhttp/internal/http/Http1xStream;)Lokio/BufferedSource;

    move-result-object v2

    iget-wide v6, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    invoke-static {v6, v7, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v2, p1, p2, p3}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J

    move-result-wide p1

    cmp-long p3, p1, v4

    if-eqz p3, :cond_2

    .line 399
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    .line 400
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    cmp-long p3, v2, v0

    if-nez p3, :cond_1

    .line 401
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->endOfInput()V

    :cond_1
    return-wide p1

    .line 395
    :cond_2
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSource;->unexpectedEndOfInput()V

    .line 396
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 390
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 389
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
