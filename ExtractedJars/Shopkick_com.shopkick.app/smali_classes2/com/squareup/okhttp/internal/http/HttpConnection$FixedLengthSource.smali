.class Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;
.super Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;
.source "HttpConnection.java"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/HttpConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FixedLengthSource"
.end annotation


# instance fields
.field private bytesRemaining:J

.field final synthetic this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/internal/http/HttpConnection;Lcom/squareup/okhttp/internal/http/CacheRequest;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 444
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    .line 445
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;-><init>(Lcom/squareup/okhttp/internal/http/HttpConnection;Lcom/squareup/okhttp/internal/http/CacheRequest;)V

    .line 446
    iput-wide p3, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    .line 447
    iget-wide p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 448
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->endOfInput(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 477
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->closed:Z

    if-eqz v0, :cond_0

    return-void

    .line 479
    :cond_0
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    const/16 v1, 0x64

    invoke-virtual {v0, p0, v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->discard(Lokio/Source;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 480
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->unexpectedEndOfInput()V

    :cond_1
    const/4 v0, 0x1

    .line 483
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->closed:Z

    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4

    .line 455
    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->closed:Z

    if-nez v2, :cond_3

    .line 456
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    cmp-long v2, v2, v0

    const-wide/16 v3, -0x1

    if-nez v2, :cond_0

    return-wide v3

    .line 458
    :cond_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$900(Lcom/squareup/okhttp/internal/http/HttpConnection;)Lokio/BufferedSource;

    move-result-object v2

    iget-wide v5, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    invoke-static {v5, v6, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v2, p1, p2, p3}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J

    move-result-wide p2

    cmp-long v2, p2, v3

    if-eqz v2, :cond_2

    .line 464
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    sub-long/2addr v2, p2

    iput-wide v2, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    .line 465
    invoke-virtual {p0, p1, p2, p3}, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->cacheWrite(Lokio/Buffer;J)V

    .line 466
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->bytesRemaining:J

    cmp-long p1, v2, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 467
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->endOfInput(Z)V

    :cond_1
    return-wide p2

    .line 460
    :cond_2
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->unexpectedEndOfInput()V

    .line 461
    new-instance p1, Ljava/net/ProtocolException;

    const-string/jumbo p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 455
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 454
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

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 473
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$FixedLengthSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$900(Lcom/squareup/okhttp/internal/http/HttpConnection;)Lokio/BufferedSource;

    move-result-object v0

    invoke-interface {v0}, Lokio/BufferedSource;->timeout()Lokio/Timeout;

    move-result-object v0

    return-object v0
.end method
