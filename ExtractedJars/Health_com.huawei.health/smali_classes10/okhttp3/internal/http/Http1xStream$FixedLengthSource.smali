.class Lokhttp3/internal/http/Http1xStream$FixedLengthSource;
.super Lokhttp3/internal/http/Http1xStream$AbstractSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http/Http1xStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "FixedLengthSource"
.end annotation


# instance fields
.field private bytesRemaining:J

.field final synthetic this$0:Lokhttp3/internal/http/Http1xStream;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http/Http1xStream;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 369
    iput-object p1, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lokhttp3/internal/http/Http1xStream$AbstractSource;-><init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V

    .line 370
    iput-wide p2, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    .line 371
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 372
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->endOfInput(Z)V

    .line 374
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

    .line 395
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->closed:Z

    if-eqz v0, :cond_0

    return-void

    .line 397
    :cond_0
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/16 v1, 0x64

    invoke-static {p0, v1, v0}, Lokhttp3/internal/Util;->discard(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 398
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->endOfInput(Z)V

    .line 401
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->closed:Z

    .line 402
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 377
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 378
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->closed:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 379
    :cond_1
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const-wide/16 v0, -0x1

    return-wide v0

    .line 381
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$600(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSource;

    move-result-object v0

    iget-wide v1, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J

    move-result-wide v4

    .line 382
    const-wide/16 v0, -0x1

    cmp-long v0, v4, v0

    if-nez v0, :cond_3

    .line 383
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->endOfInput(Z)V

    .line 384
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 387
    :cond_3
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    sub-long/2addr v0, v4

    iput-wide v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    .line 388
    iget-wide v0, p0, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->bytesRemaining:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 389
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$FixedLengthSource;->endOfInput(Z)V

    .line 391
    :cond_4
    return-wide v4
.end method
