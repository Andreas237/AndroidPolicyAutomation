.class public Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;
.super Ljava/net/HttpURLConnection;
.source "HttpURLConnectionImpl.java"


# instance fields
.field final client:Lcom/squareup/okhttp/OkHttpClient;

.field private fixedContentLength:J

.field handshake:Lcom/squareup/okhttp/Handshake;

.field protected httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

.field protected httpEngineFailure:Ljava/io/IOException;

.field private redirectionCount:I

.field private requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

.field private responseHeaders:Lcom/squareup/okhttp/Headers;

.field private route:Lcom/squareup/okhttp/Route;


# direct methods
.method public constructor <init>(Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V
    .locals 2

    .line 97
    invoke-direct {p0, p1}, Ljava/net/HttpURLConnection;-><init>(Ljava/net/URL;)V

    .line 74
    new-instance p1, Lcom/squareup/okhttp/Headers$Builder;

    invoke-direct {p1}, Lcom/squareup/okhttp/Headers$Builder;-><init>()V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    const-wide/16 v0, -0x1

    .line 77
    iput-wide v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->fixedContentLength:J

    .line 98
    iput-object p2, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    return-void
.end method

.method private defaultUserAgent()Ljava/lang/String;
    .locals 2

    const-string v0, "http.agent"

    .line 357
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 358
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Java"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "java.version"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private execute(Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 423
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->sendRequest()V

    .line 424
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->route:Lcom/squareup/okhttp/Route;

    .line 425
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Connection;->getHandshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->handshake:Lcom/squareup/okhttp/Handshake;

    if-eqz p1, :cond_1

    .line 429
    iget-object p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->readResponse()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 434
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->recover(Ljava/io/IOException;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 436
    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    const/4 p1, 0x0

    return p1

    .line 441
    :cond_2
    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngineFailure:Ljava/io/IOException;

    .line 442
    throw p1
.end method

.method private getHeaders()Lcom/squareup/okhttp/Headers;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->responseHeaders:Lcom/squareup/okhttp/Headers;

    if-nez v0, :cond_0

    .line 140
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v1

    .line 143
    invoke-virtual {v1}, Lcom/squareup/okhttp/Headers;->newBuilder()Lcom/squareup/okhttp/Headers$Builder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v3

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/Platform;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-Response-Source"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->responseSourceHeader(Lcom/squareup/okhttp/Response;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->responseHeaders:Lcom/squareup/okhttp/Headers;

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->responseHeaders:Lcom/squareup/okhttp/Headers;

    return-object v0
.end method

.method private getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 367
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->initHttpEngine()V

    .line 369
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    return-object v0

    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 374
    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->execute(Z)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 378
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v1

    .line 379
    iget-object v2, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->followUpRequest()Lcom/squareup/okhttp/Request;

    move-result-object v2

    if-nez v2, :cond_2

    .line 382
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->releaseConnection()V

    .line 383
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    return-object v0

    .line 386
    :cond_2
    invoke-virtual {v1}, Lcom/squareup/okhttp/Response;->isRedirect()Z

    move-result v3

    if-eqz v3, :cond_4

    iget v3, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->redirectionCount:I

    add-int/2addr v3, v0

    iput v3, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->redirectionCount:I

    const/16 v0, 0x14

    if-gt v3, v0, :cond_3

    goto :goto_1

    .line 387
    :cond_3
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many redirects: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->redirectionCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 391
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->url:Ljava/net/URL;

    .line 392
    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers;->newBuilder()Lcom/squareup/okhttp/Headers$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    .line 397
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestBody()Lokio/Sink;

    move-result-object v0

    .line 398
    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    const/4 v0, 0x0

    :cond_5
    if-eqz v0, :cond_7

    .line 402
    instance-of v3, v0, Lcom/squareup/okhttp/internal/http/RetryableSink;

    if-eqz v3, :cond_6

    goto :goto_2

    .line 403
    :cond_6
    new-instance v0, Ljava/net/HttpRetryException;

    iget v1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->responseCode:I

    const-string v2, "Cannot retry streamed HTTP body"

    invoke-direct {v0, v2, v1}, Ljava/net/HttpRetryException;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 406
    :cond_7
    :goto_2
    iget-object v3, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->sameConnection(Ljava/net/URL;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 407
    iget-object v3, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->releaseConnection()V

    .line 410
    :cond_8
    iget-object v3, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->close()Lcom/squareup/okhttp/Connection;

    move-result-object v3

    .line 411
    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Lcom/squareup/okhttp/internal/http/RetryableSink;

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->newHttpEngine(Ljava/lang/String;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableSink;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    goto/16 :goto_0
.end method

.method private initHttpEngine()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngineFailure:Ljava/io/IOException;

    if-nez v0, :cond_4

    .line 291
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 295
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->connected:Z

    .line 297
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->doOutput:Z

    if-eqz v0, :cond_3

    .line 298
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "POST"

    .line 300
    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    goto :goto_0

    .line 301
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 302
    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " does not support writing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 306
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v1, v1}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->newHttpEngine(Ljava/lang/String;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableSink;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 308
    iput-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngineFailure:Ljava/io/IOException;

    .line 309
    throw v0

    .line 290
    :cond_4
    throw v0
.end method

.method private newHttpEngine(Ljava/lang/String;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableSink;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 15

    move-object v0, p0

    .line 315
    new-instance v1, Lcom/squareup/okhttp/Request$Builder;

    invoke-direct {v1}, Lcom/squareup/okhttp/Request$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getURL()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/net/URL;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v2}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v1

    .line 318
    iget-object v4, v0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v4}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    .line 319
    :goto_0
    invoke-virtual {v4}, Lcom/squareup/okhttp/Headers;->size()I

    move-result v7

    if-ge v6, v7, :cond_0

    .line 320
    invoke-virtual {v4, v6}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Lcom/squareup/okhttp/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 324
    :cond_0
    invoke-static/range {p1 .. p1}, Lcom/squareup/okhttp/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 326
    iget-wide v6, v0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->fixedContentLength:J

    const-wide/16 v8, -0x1

    cmp-long v3, v6, v8

    if-eqz v3, :cond_1

    const-string v3, "Content-Length"

    .line 327
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v3, v6}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    goto :goto_1

    .line 328
    :cond_1
    iget v3, v0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->chunkLength:I

    if-lez v3, :cond_2

    const-string v3, "Transfer-Encoding"

    const-string v6, "chunked"

    .line 329
    invoke-virtual {v1, v3, v6}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    goto :goto_1

    :cond_2
    const/4 v5, 0x1

    :goto_1
    const-string v3, "Content-Type"

    .line 335
    invoke-virtual {v4, v3}, Lcom/squareup/okhttp/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    const-string v3, "Content-Type"

    const-string v6, "application/x-www-form-urlencoded"

    .line 336
    invoke-virtual {v1, v3, v6}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    :cond_3
    move v10, v5

    goto :goto_2

    :cond_4
    move v10, v5

    :goto_2
    const-string v3, "User-Agent"

    .line 340
    invoke-virtual {v4, v3}, Lcom/squareup/okhttp/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    const-string v3, "User-Agent"

    .line 341
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->defaultUserAgent()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 344
    :cond_5
    invoke-virtual {v1}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v9

    .line 347
    iget-object v1, v0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 348
    sget-object v3, Lcom/squareup/okhttp/internal/Internal;->instance:Lcom/squareup/okhttp/internal/Internal;

    invoke-virtual {v3, v1}, Lcom/squareup/okhttp/internal/Internal;->internalCache(Lcom/squareup/okhttp/OkHttpClient;)Lcom/squareup/okhttp/internal/InternalCache;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getUseCaches()Z

    move-result v3

    if-nez v3, :cond_6

    .line 349
    iget-object v1, v0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v1}, Lcom/squareup/okhttp/OkHttpClient;->clone()Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/OkHttpClient;->setCache(Lcom/squareup/okhttp/Cache;)Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v1

    move-object v8, v1

    goto :goto_3

    :cond_6
    move-object v8, v1

    .line 352
    :goto_3
    new-instance v1, Lcom/squareup/okhttp/internal/http/HttpEngine;

    const/4 v12, 0x0

    move-object v7, v1

    move-object/from16 v11, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    invoke-direct/range {v7 .. v14}, Lcom/squareup/okhttp/internal/http/HttpEngine;-><init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;ZLcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RouteSelector;Lcom/squareup/okhttp/internal/http/RetryableSink;Lcom/squareup/okhttp/Response;)V

    return-object v1
.end method

.method private static responseSourceHeader(Lcom/squareup/okhttp/Response;)Ljava/lang/String;
    .locals 2

    .line 151
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->networkResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    if-nez v0, :cond_1

    .line 152
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->cacheResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p0, "NONE"

    return-object p0

    .line 155
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CACHE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->code()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 157
    :cond_1
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->cacheResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    if-nez v0, :cond_2

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NETWORK "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->code()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 160
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONDITIONAL_CACHE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->networkResponse()Lcom/squareup/okhttp/Response;

    move-result-object p0

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->code()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private setProtocols(Ljava/lang/String;Z)V
    .locals 3

    .line 538
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_0

    .line 540
    iget-object p2, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {p2}, Lcom/squareup/okhttp/OkHttpClient;->getProtocols()Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    const-string p2, ","

    const/4 v1, -0x1

    .line 542
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    array-length p2, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v2, p1, v1

    .line 544
    :try_start_0
    invoke-static {v2}, Lcom/squareup/okhttp/Protocol;->get(Ljava/lang/String;)Lcom/squareup/okhttp/Protocol;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 546
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 549
    :cond_1
    iget-object p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/OkHttpClient;->setProtocols(Ljava/util/List;)Lcom/squareup/okhttp/OkHttpClient;

    return-void
.end method


# virtual methods
.method public final addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 507
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->connected:Z

    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    .line 519
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring header "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " because its value was null."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/squareup/okhttp/internal/Platform;->logW(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "X-Android-Transports"

    .line 524
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "X-Android-Protocols"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 527
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 525
    invoke-direct {p0, p2, p1}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->setProtocols(Ljava/lang/String;Z)V

    :goto_1
    return-void

    .line 511
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "field == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 508
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot add request property after connection is made"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final connect()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 102
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->initHttpEngine()V

    :cond_0
    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->execute(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final disconnect()V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    if-nez v0, :cond_0

    return-void

    .line 113
    :cond_0
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->disconnect()V

    return-void
.end method

.method public getConnectTimeout()I
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public final getErrorStream()Ljava/io/InputStream;
    .locals 4

    const/4 v0, 0x0

    .line 128
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponseBody()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    const/16 v3, 0x190

    if-lt v2, v3, :cond_0

    .line 130
    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseBodyBytes()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    return-object v0

    :catch_0
    return-object v0
.end method

.method public final getHeaderField(I)Ljava/lang/String;
    .locals 1

    .line 169
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getHeaders()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    .line 182
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object p1

    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/StatusLine;->get(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/StatusLine;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/StatusLine;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getHeaders()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    .line 192
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getHeaders()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getHeaderFields()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 200
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getHeaders()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v1

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/StatusLine;->get(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/StatusLine;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/StatusLine;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/OkHeaders;->toMultimap(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 203
    :catch_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 217
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->doInput:Z

    if-eqz v0, :cond_2

    .line 221
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    .line 227
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponseCode()I

    move-result v1

    const/16 v2, 0x190

    if-ge v1, v2, :cond_1

    .line 231
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseBodyBytes()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 233
    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No response body exists; responseCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponseCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 228
    :cond_1
    new-instance v0, Ljava/io/FileNotFoundException;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "This protocol does not support input"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 239
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->connect()V

    .line 241
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getBufferedRequestBody()Lokio/BufferedSink;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 244
    iget-object v1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponse()Z

    move-result v1

    if-nez v1, :cond_0

    .line 248
    invoke-interface {v0}, Lokio/BufferedSink;->outputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0

    .line 245
    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "cannot write request body after response has been read"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "method does not support a request body: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getPermission()Ljava/security/Permission;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 252
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 253
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getURL()Ljava/net/URL;

    move-result-object v1

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URL;)I

    move-result v1

    .line 254
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->usingProxy()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 255
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    .line 256
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    .line 257
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    move-object v4, v1

    move v1, v0

    move-object v0, v4

    .line 259
    :cond_0
    new-instance v2, Ljava/net/SocketPermission;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connect, resolve"

    invoke-direct {v2, v0, v1}, Ljava/net/SocketPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public getReadTimeout()I
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public final getRequestProperties()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 208
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->connected:Z

    if-nez v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/OkHeaders;->toMultimap(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 209
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access request header fields after connection is set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Headers$Builder;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getResponseCode()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 469
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->code()I

    move-result v0

    return v0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 465
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->message()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setConnectTimeout(I)V
    .locals 3

    .line 268
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    int-to-long v1, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/okhttp/OkHttpClient;->setConnectTimeout(JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 2

    int-to-long v0, p1

    .line 561
    invoke-virtual {p0, v0, v1}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->setFixedLengthStreamingMode(J)V

    return-void
.end method

.method public setFixedLengthStreamingMode(J)V
    .locals 2

    .line 565
    iget-boolean v0, p0, Ljava/net/HttpURLConnection;->connected:Z

    if-nez v0, :cond_2

    .line 566
    iget v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->chunkLength:I

    if-gtz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 568
    iput-wide p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->fixedContentLength:J

    const-wide/32 v0, 0x7fffffff

    .line 569
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p1, p1

    iput p1, p0, Ljava/net/HttpURLConnection;->fixedContentLength:I

    return-void

    .line 567
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "contentLength < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 566
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already in chunked mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 565
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already connected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setIfModifiedSince(J)V
    .locals 3

    .line 498
    invoke-super {p0, p1, p2}, Ljava/net/HttpURLConnection;->setIfModifiedSince(J)V

    .line 499
    iget-wide p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->ifModifiedSince:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    .line 500
    iget-object p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    const-string p2, "If-Modified-Since"

    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->ifModifiedSince:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpDate;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/squareup/okhttp/Headers$Builder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    goto :goto_0

    .line 502
    :cond_0
    iget-object p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    const-string p2, "If-Modified-Since"

    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/Headers$Builder;->removeAll(Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    :goto_0
    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/OkHttpClient;->setFollowRedirects(Z)V

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 3

    .line 281
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    int-to-long v1, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/okhttp/OkHttpClient;->setReadTimeout(JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .line 553
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpMethod;->METHODS:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 557
    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->method:Ljava/lang/String;

    return-void

    .line 554
    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected one of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/squareup/okhttp/internal/http/HttpMethod;->METHODS:Ljava/util/Set;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 473
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->connected:Z

    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    .line 485
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring header "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " because its value was null."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/squareup/okhttp/internal/Platform;->logW(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "X-Android-Transports"

    .line 490
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "X-Android-Protocols"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 493
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->requestHeaders:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Headers$Builder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 491
    invoke-direct {p0, p2, p1}, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->setProtocols(Ljava/lang/String;Z)V

    :goto_1
    return-void

    .line 477
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "field == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 474
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot set request property after connection is made"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final usingProxy()Z
    .locals 2

    .line 458
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->route:Lcom/squareup/okhttp/Route;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 461
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method
