.class public final Lcom/squareup/okhttp/internal/http/HttpTransport;
.super Ljava/lang/Object;
.source "HttpTransport.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/http/Transport;


# instance fields
.field private final httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

.field private final httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/internal/http/HttpConnection;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    .line 31
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    return-void
.end method


# virtual methods
.method public canReuseConnection()Z
    .locals 4

    const-string v0, "close"

    .line 91
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequest()Lcom/squareup/okhttp/Request;

    move-result-object v1

    const-string v2, "Connection"

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "close"

    .line 96
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v2

    const-string v3, "Connection"

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public createRequestBody(Lcom/squareup/okhttp/Request;J)Lokio/Sink;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "chunked"

    const-string v1, "Transfer-Encoding"

    .line 35
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 37
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->newChunkedSink()Lokio/Sink;

    move-result-object p1

    return-object p1

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    .line 42
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {p1, p2, p3}, Lcom/squareup/okhttp/internal/http/HttpConnection;->newFixedLengthSink(J)Lokio/Sink;

    move-result-object p1

    return-object p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public disconnect(Lcom/squareup/okhttp/internal/http/HttpEngine;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->closeIfOwnedBy(Ljava/lang/Object;)V

    return-void
.end method

.method public emptyTransferStream()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->emptyResponseBody()V

    return-void
.end method

.method public flushRequest()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->flush()V

    return-void
.end method

.method public getTransferStream(Lcom/squareup/okhttp/internal/http/CacheRequest;)Lokio/Source;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponseBody()Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/okhttp/internal/http/HttpConnection;->newFixedLengthSource(Lcom/squareup/okhttp/internal/http/CacheRequest;J)Lokio/Source;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "chunked"

    .line 116
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v1

    const-string v2, "Transfer-Encoding"

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0, p1, v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->newChunkedSource(Lcom/squareup/okhttp/internal/http/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpEngine;)Lokio/Source;

    move-result-object p1

    return-object p1

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/OkHeaders;->contentLength(Lcom/squareup/okhttp/Response;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    .line 122
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v2, p1, v0, v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->newFixedLengthSource(Lcom/squareup/okhttp/internal/http/CacheRequest;J)Lokio/Source;

    move-result-object p1

    return-object p1

    .line 128
    :cond_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->newUnknownLengthSource(Lcom/squareup/okhttp/internal/http/CacheRequest;)Lokio/Source;

    move-result-object p1

    return-object p1
.end method

.method public readResponseHeaders()Lcom/squareup/okhttp/Response$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->readResponse()Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    return-object v0
.end method

.method public releaseConnectionOnIdle()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport;->canReuseConnection()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->poolOnIdle()V

    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->closeOnIdle()V

    :goto_0
    return-void
.end method

.method public writeRequestBody(Lcom/squareup/okhttp/internal/http/RetryableSink;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->writeRequestBody(Lcom/squareup/okhttp/internal/http/RetryableSink;)V

    return-void
.end method

.method public writeRequestHeaders(Lcom/squareup/okhttp/Request;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->writingRequestHeaders()V

    .line 71
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/Connection;->getProtocol()Lcom/squareup/okhttp/Protocol;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/squareup/okhttp/internal/http/RequestLine;->get(Lcom/squareup/okhttp/Request;Ljava/net/Proxy$Type;Lcom/squareup/okhttp/Protocol;)Ljava/lang/String;

    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpConnection:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->writeRequest(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)V

    return-void
.end method
