.class Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;
.super Ljava/lang/Object;
.source "SpdyTransport.java"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/SpdyTransport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SpdySource"
.end annotation


# instance fields
.field private final cacheBody:Lokio/Sink;

.field private final cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

.field private closed:Z

.field private inputExhausted:Z

.field private final source:Lokio/Source;

.field private final stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;Lcom/squareup/okhttp/internal/http/CacheRequest;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .line 251
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->getSource()Lokio/Source;

    move-result-object p1

    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->source:Lokio/Source;

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    .line 254
    invoke-interface {p2}, Lcom/squareup/okhttp/internal/http/CacheRequest;->body()Lokio/Sink;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, p2

    .line 259
    :goto_1
    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->cacheBody:Lokio/Sink;

    .line 260
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    return-void
.end method

.method private discardStream()Z
    .locals 6

    .line 308
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeout()Lokio/Timeout;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Timeout;->timeoutNanos()J

    move-result-wide v0

    .line 309
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeout()Lokio/Timeout;

    move-result-object v2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x64

    invoke-virtual {v2, v4, v5, v3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    const/16 v2, 0x64

    .line 311
    :try_start_0
    invoke-static {p0, v2}, Lcom/squareup/okhttp/internal/Util;->skipAll(Lokio/Source;I)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    .line 316
    :goto_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeout()Lokio/Timeout;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    return v2

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->readTimeout()Lokio/Timeout;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    throw v2

    :catch_0
    const/4 v2, 0x0

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 291
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->closed:Z

    if-eqz v0, :cond_0

    return-void

    .line 293
    :cond_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->inputExhausted:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->cacheBody:Lokio/Sink;

    if-eqz v0, :cond_1

    .line 294
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->discardStream()Z

    :cond_1
    const/4 v0, 0x1

    .line 297
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->closed:Z

    .line 299
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->inputExhausted:Z

    if-nez v0, :cond_2

    .line 300
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->CANCEL:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->closeLater(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 301
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    if-eqz v0, :cond_2

    .line 302
    invoke-interface {v0}, Lcom/squareup/okhttp/internal/http/CacheRequest;->abort()V

    :cond_2
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_5

    .line 266
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->closed:Z

    if-nez v0, :cond_4

    .line 267
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->inputExhausted:Z

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_0

    return-wide v1

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->source:Lokio/Source;

    invoke-interface {v0, p1, p2, p3}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide p2

    cmp-long v0, p2, v1

    if-nez v0, :cond_2

    const/4 p1, 0x1

    .line 271
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->inputExhausted:Z

    .line 272
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    if-eqz p1, :cond_1

    .line 273
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->cacheBody:Lokio/Sink;

    invoke-interface {p1}, Lokio/Sink;->close()V

    :cond_1
    return-wide v1

    .line 278
    :cond_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->cacheBody:Lokio/Sink;

    if-eqz v0, :cond_3

    .line 280
    invoke-virtual {p1}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object p1

    invoke-interface {v0, p1, p2, p3}, Lokio/Sink;->write(Lokio/Buffer;J)V

    :cond_3
    return-wide p2

    .line 266
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 265
    :cond_5
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

    .line 287
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport$SpdySource;->source:Lokio/Source;

    invoke-interface {v0}, Lokio/Source;->timeout()Lokio/Timeout;

    move-result-object v0

    return-object v0
.end method
