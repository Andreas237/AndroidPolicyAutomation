.class public final Lcom/squareup/okhttp/internal/http/HttpEngine;
.super Ljava/lang/Object;
.source "HttpEngine.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;
    }
.end annotation


# static fields
.field private static final EMPTY_BODY:Lcom/squareup/okhttp/ResponseBody;

.field public static final MAX_FOLLOW_UPS:I = 0x14


# instance fields
.field public final bufferRequestBody:Z

.field private bufferedRequestBody:Lokio/BufferedSink;

.field private cacheResponse:Lcom/squareup/okhttp/Response;

.field private cacheStrategy:Lcom/squareup/okhttp/internal/http/CacheStrategy;

.field private final callerWritesRequestBody:Z

.field final client:Lcom/squareup/okhttp/OkHttpClient;

.field private final forWebSocket:Z

.field private httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

.field private networkRequest:Lcom/squareup/okhttp/Request;

.field private final priorResponse:Lcom/squareup/okhttp/Response;

.field private requestBodyOut:Lokio/Sink;

.field sentRequestMillis:J

.field private storeRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

.field public final streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

.field private transparentGzip:Z

.field private final userRequest:Lcom/squareup/okhttp/Request;

.field private userResponse:Lcom/squareup/okhttp/Response;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 94
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpEngine$1;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine$1;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->EMPTY_BODY:Lcom/squareup/okhttp/ResponseBody;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;ZZZLcom/squareup/okhttp/internal/http/StreamAllocation;Lcom/squareup/okhttp/internal/http/RetryableSink;Lcom/squareup/okhttp/Response;)V
    .locals 2

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 113
    iput-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    .line 175
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 176
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    .line 177
    iput-boolean p3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferRequestBody:Z

    .line 178
    iput-boolean p4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->callerWritesRequestBody:Z

    .line 179
    iput-boolean p5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->forWebSocket:Z

    if-eqz p6, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    new-instance p6, Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object p3

    invoke-static {p1, p2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->createAddress(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Address;

    move-result-object p1

    invoke-direct {p6, p3, p1}, Lcom/squareup/okhttp/internal/http/StreamAllocation;-><init>(Lcom/squareup/okhttp/ConnectionPool;Lcom/squareup/okhttp/Address;)V

    :goto_0
    iput-object p6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    .line 183
    iput-object p7, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    .line 184
    iput-object p8, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->priorResponse:Lcom/squareup/okhttp/Response;

    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/internal/http/HttpEngine;)Lcom/squareup/okhttp/internal/http/HttpStream;
    .locals 0

    .line 87
    iget-object p0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    return-object p0
.end method

.method static synthetic access$102(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Request;
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    return-object p1
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/internal/http/HttpEngine;)Lcom/squareup/okhttp/Response;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 87
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->readNetworkResponse()Lcom/squareup/okhttp/Response;

    move-result-object p0

    return-object p0
.end method

.method private cacheWritingResponse(Lcom/squareup/okhttp/internal/http/CacheRequest;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-object p2

    .line 767
    :cond_0
    invoke-interface {p1}, Lcom/squareup/okhttp/internal/http/CacheRequest;->body()Lokio/Sink;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p2

    .line 770
    :cond_1
    instance-of v1, p2, Lcom/squareup/okhttp/Response;

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, p2

    check-cast v1, Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Lcom/squareup/okhttp/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v1

    .line 771
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    .line 773
    new-instance v2, Lcom/squareup/okhttp/internal/http/HttpEngine$2;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine$2;-><init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Lokio/BufferedSource;Lcom/squareup/okhttp/internal/http/CacheRequest;Lokio/BufferedSink;)V

    .line 815
    instance-of p1, p2, Lcom/squareup/okhttp/Response$Builder;

    if-nez p1, :cond_3

    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, p2

    check-cast p1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    :goto_1
    new-instance v0, Lcom/squareup/okhttp/internal/http/RealResponseBody;

    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p2

    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/squareup/okhttp/internal/http/RealResponseBody;-><init>(Lcom/squareup/okhttp/Headers;Lokio/BufferedSource;)V

    instance-of p2, p1, Lcom/squareup/okhttp/Response$Builder;

    if-nez p2, :cond_4

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    goto :goto_2

    :cond_4
    check-cast p1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response$Builder;Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    :goto_2
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object p1

    return-object p1
.end method

.method private static combine(Lcom/squareup/okhttp/Headers;Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Headers;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 849
    new-instance v0, Lcom/squareup/okhttp/Headers$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Headers$Builder;-><init>()V

    .line 851
    invoke-virtual {p0}, Lcom/squareup/okhttp/Headers;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 852
    invoke-virtual {p0, v3}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v4

    .line 853
    invoke-virtual {p0, v3}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Warning"

    .line 854
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 857
    :cond_0
    invoke-static {v4}, Lcom/squareup/okhttp/internal/http/OkHeaders;->isEndToEnd(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p1, v4}, Lcom/squareup/okhttp/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    .line 858
    :cond_1
    invoke-virtual {v0, v4, v5}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 862
    :cond_3
    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->size()I

    move-result p0

    :goto_2
    if-ge v2, p0, :cond_6

    .line 863
    invoke-virtual {p1, v2}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Content-Length"

    .line 864
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    .line 867
    :cond_4
    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/OkHeaders;->isEndToEnd(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 868
    invoke-virtual {p1, v2}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 872
    :cond_6
    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object p0

    return-object p0
.end method

.method private connect()Lcom/squareup/okhttp/internal/http/HttpStream;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/squareup/okhttp/internal/http/RouteException;,
            Lcom/squareup/okhttp/internal/http/RequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 280
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v6, v0, 0x1

    .line 281
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getConnectTimeout()I

    move-result v2

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v3

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getWriteTimeout()I

    move-result v4

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getRetryOnConnectionFailure()Z

    move-result v5

    invoke-virtual/range {v1 .. v6}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->newStream(IIIZZ)Lcom/squareup/okhttp/internal/http/HttpStream;

    move-result-object v0

    return-object v0
.end method

.method private static createAddress(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Address;
    .locals 16

    .line 976
    invoke-virtual/range {p1 .. p1}, Lcom/squareup/okhttp/Request;->isHttps()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 977
    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    .line 978
    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    .line 979
    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getCertificatePinner()Lcom/squareup/okhttp/CertificatePinner;

    move-result-object v2

    move-object v9, v0

    move-object v8, v1

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object v8, v1

    move-object v9, v8

    move-object v10, v9

    .line 982
    :goto_0
    new-instance v0, Lcom/squareup/okhttp/Address;

    invoke-virtual/range {p1 .. p1}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/HttpUrl;->host()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/HttpUrl;->port()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getDns()Lcom/squareup/okhttp/Dns;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getSocketFactory()Ljavax/net/SocketFactory;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getAuthenticator()Lcom/squareup/okhttp/Authenticator;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getProtocols()Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionSpecs()Ljava/util/List;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/OkHttpClient;->getProxySelector()Ljava/net/ProxySelector;

    move-result-object v15

    move-object v3, v0

    invoke-direct/range {v3 .. v15}, Lcom/squareup/okhttp/Address;-><init>(Ljava/lang/String;ILcom/squareup/okhttp/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lcom/squareup/okhttp/CertificatePinner;Lcom/squareup/okhttp/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v0
.end method

.method public static hasBody(Lcom/squareup/okhttp/Response;)Z
    .locals 8

    .line 490
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->request()Lcom/squareup/okhttp/Request;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 494
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->code()I

    move-result v0

    const/16 v2, 0x64

    const/4 v3, 0x1

    if-lt v0, v2, :cond_1

    const/16 v2, 0xc8

    if-lt v0, v2, :cond_2

    :cond_1
    const/16 v2, 0xcc

    if-eq v0, v2, :cond_2

    const/16 v2, 0x130

    if-eq v0, v2, :cond_2

    return v3

    .line 504
    :cond_2
    invoke-static {p0}, Lcom/squareup/okhttp/internal/http/OkHeaders;->contentLength(Lcom/squareup/okhttp/Response;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    const-string v0, "chunked"

    const-string v2, "Transfer-Encoding"

    invoke-virtual {p0, v2}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    :goto_0
    return v3
.end method

.method private maybeCache()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 388
    sget-object v0, Lcom/squareup/okhttp/internal/Internal;->instance:Lcom/squareup/okhttp/internal/Internal;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/Internal;->internalCache(Lcom/squareup/okhttp/OkHttpClient;)Lcom/squareup/okhttp/internal/InternalCache;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 392
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/http/CacheStrategy;->isCacheable(Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/Request;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 393
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/HttpMethod;->invalidatesCache(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 395
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-interface {v0, v1}, Lcom/squareup/okhttp/internal/InternalCache;->remove(Lcom/squareup/okhttp/Request;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void

    .line 404
    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/squareup/okhttp/internal/InternalCache;->put(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/CacheRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->storeRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    return-void
.end method

.method private networkRequest(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Request;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 519
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->newBuilder()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    const-string v1, "Host"

    .line 521
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "Host"

    .line 522
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v2

    invoke-static {v2}, Lcom/squareup/okhttp/internal/Util;->hostHeader(Lcom/squareup/okhttp/HttpUrl;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    :cond_0
    const-string v1, "Connection"

    .line 525
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "Connection"

    const-string v2, "Keep-Alive"

    .line 526
    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    :cond_1
    const-string v1, "Accept-Encoding"

    .line 529
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 530
    iput-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transparentGzip:Z

    const-string v1, "Accept-Encoding"

    const-string v2, "gzip"

    .line 531
    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 534
    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v1}, Lcom/squareup/okhttp/OkHttpClient;->getCookieHandler()Ljava/net/CookieHandler;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 539
    instance-of v2, v0, Lcom/squareup/okhttp/Request$Builder;

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v2

    goto :goto_0

    :cond_3
    move-object v2, v0

    check-cast v2, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {v2}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object v2

    :goto_0
    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/http/OkHeaders;->toMultimap(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 541
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->uri()Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ljava/net/CookieHandler;->get(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 544
    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/OkHeaders;->addCookies(Lcom/squareup/okhttp/Request$Builder;Ljava/util/Map;)V

    :cond_4
    const-string v1, "User-Agent"

    .line 547
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    const-string p1, "User-Agent"

    .line 548
    invoke-static {}, Lcom/squareup/okhttp/internal/Version;->userAgent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 551
    :cond_5
    instance-of p1, v0, Lcom/squareup/okhttp/Request$Builder;

    if-nez p1, :cond_6

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object p1

    goto :goto_1

    :cond_6
    check-cast v0, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private readNetworkResponse()Lcom/squareup/okhttp/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 735
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    invoke-interface {v0}, Lcom/squareup/okhttp/internal/http/HttpStream;->finishRequest()V

    .line 737
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    invoke-interface {v0}, Lcom/squareup/okhttp/internal/http/HttpStream;->readResponseHeaders()Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connection()Lcom/squareup/okhttp/internal/io/RealConnection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/io/RealConnection;->getHandshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->handshake(Lcom/squareup/okhttp/Handshake;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    sget-object v1, Lcom/squareup/okhttp/internal/http/OkHeaders;->SENT_MILLIS:Ljava/lang/String;

    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Response$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    sget-object v1, Lcom/squareup/okhttp/internal/http/OkHeaders;->RECEIVED_MILLIS:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Response$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object v0

    .line 744
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->forWebSocket:Z

    if-nez v1, :cond_2

    .line 745
    instance-of v1, v0, Lcom/squareup/okhttp/Response$Builder;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    check-cast v1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    invoke-interface {v2, v0}, Lcom/squareup/okhttp/internal/http/HttpStream;->openResponseBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    instance-of v2, v1, Lcom/squareup/okhttp/Response$Builder;

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    goto :goto_1

    :cond_1
    check-cast v1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response$Builder;Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object v0

    :cond_2
    const-string v1, "close"

    .line 750
    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->request()Lcom/squareup/okhttp/Request;

    move-result-object v2

    const-string v3, "Connection"

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "close"

    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 752
    :cond_3
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->noNewStreams()V

    :cond_4
    return-object v0
.end method

.method private static stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;
    .locals 2

    if-eqz p0, :cond_3

    .line 287
    instance-of v0, p0, Lcom/squareup/okhttp/Response;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/squareup/okhttp/Response;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    instance-of v0, p0, Lcom/squareup/okhttp/Response$Builder;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    goto :goto_1

    :cond_1
    check-cast p0, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    :goto_1
    const/4 v0, 0x0

    instance-of v1, p0, Lcom/squareup/okhttp/Response$Builder;

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    goto :goto_2

    :cond_2
    check-cast p0, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {p0, v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response$Builder;Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    :goto_2
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method private unzip(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 465
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transparentGzip:Z

    if-eqz v0, :cond_6

    const-string v0, "gzip"

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    const-string v2, "Content-Encoding"

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 469
    :cond_0
    instance-of v0, p1, Lcom/squareup/okhttp/Response;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    return-object p1

    .line 473
    :cond_2
    new-instance v1, Lokio/GzipSource;

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, p1

    check-cast v0, Lcom/squareup/okhttp/Response;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    invoke-direct {v1, v0}, Lokio/GzipSource;-><init>(Lokio/Source;)V

    .line 474
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers;->newBuilder()Lcom/squareup/okhttp/Headers$Builder;

    move-result-object v0

    const-string v2, "Content-Encoding"

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Headers$Builder;->removeAll(Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    move-result-object v0

    const-string v2, "Content-Length"

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Headers$Builder;->removeAll(Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    .line 478
    instance-of v2, p1, Lcom/squareup/okhttp/Response$Builder;

    if-nez v2, :cond_4

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    goto :goto_2

    :cond_4
    check-cast p1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    :goto_2
    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/Response$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    new-instance v2, Lcom/squareup/okhttp/internal/http/RealResponseBody;

    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lcom/squareup/okhttp/internal/http/RealResponseBody;-><init>(Lcom/squareup/okhttp/Headers;Lokio/BufferedSource;)V

    instance-of v0, p1, Lcom/squareup/okhttp/Response$Builder;

    if-nez v0, :cond_5

    invoke-virtual {p1, v2}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    goto :goto_3

    :cond_5
    check-cast p1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {p1, v2}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response$Builder;Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    :goto_3
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_4
    return-object p1
.end method

.method private static validate(Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/Response;)Z
    .locals 4

    .line 825
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x130

    if-ne v0, v2, :cond_0

    return v1

    .line 832
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p0

    const-string v0, "Last-Modified"

    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/Headers;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 834
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    const-string v0, "Last-Modified"

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/Headers;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 835
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    cmp-long v0, v2, p0

    if-gez v0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 426
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->cancel()V

    return-void
.end method

.method public close()Lcom/squareup/okhttp/internal/http/StreamAllocation;
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    if-eqz v0, :cond_0

    .line 436
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 437
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    if-eqz v0, :cond_1

    .line 438
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 441
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    if-eqz v0, :cond_3

    .line 442
    instance-of v1, v0, Lcom/squareup/okhttp/Response;

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    goto :goto_1

    :cond_2
    check-cast v0, Lcom/squareup/okhttp/Response;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_2

    .line 445
    :cond_3
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connectionFailed()V

    .line 448
    :goto_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    return-object v0
.end method

.method public followUpRequest()Lcom/squareup/okhttp/Request;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 888
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    if-eqz v0, :cond_e

    .line 889
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connection()Lcom/squareup/okhttp/internal/io/RealConnection;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 890
    invoke-interface {v0}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 893
    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    .line 896
    :goto_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    .line 898
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v3}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x191

    if-eq v2, v4, :cond_d

    const/16 v4, 0x197

    if-eq v2, v4, :cond_b

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    return-object v1

    :pswitch_0
    const-string v0, "GET"

    .line 912
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "HEAD"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    .line 921
    :cond_2
    :pswitch_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getFollowRedirects()Z

    move-result v0

    if-nez v0, :cond_3

    return-object v1

    .line 923
    :cond_3
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    const-string v2, "Location"

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    return-object v1

    .line 925
    :cond_4
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/squareup/okhttp/HttpUrl;->resolve(Ljava/lang/String;)Lcom/squareup/okhttp/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_5

    return-object v1

    .line 931
    :cond_5
    invoke-virtual {v0}, Lcom/squareup/okhttp/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v4}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v4

    invoke-virtual {v4}, Lcom/squareup/okhttp/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 932
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getFollowSslRedirects()Z

    move-result v2

    if-nez v2, :cond_6

    return-object v1

    .line 935
    :cond_6
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->newBuilder()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v2

    .line 936
    invoke-static {v3}, Lcom/squareup/okhttp/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 937
    invoke-static {v3}, Lcom/squareup/okhttp/internal/http/HttpMethod;->redirectsToGet(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v3, "GET"

    .line 938
    invoke-virtual {v2, v3, v1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    goto :goto_2

    .line 940
    :cond_7
    invoke-virtual {v2, v3, v1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    :goto_2
    const-string v1, "Transfer-Encoding"

    .line 942
    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/Request$Builder;->removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    const-string v1, "Content-Length"

    .line 943
    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/Request$Builder;->removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    const-string v1, "Content-Type"

    .line 944
    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/Request$Builder;->removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 950
    :cond_8
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->sameConnection(Lcom/squareup/okhttp/HttpUrl;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "Authorization"

    .line 951
    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/Request$Builder;->removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 954
    :cond_9
    invoke-virtual {v2, v0}, Lcom/squareup/okhttp/Request$Builder;->url(Lcom/squareup/okhttp/HttpUrl;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    instance-of v1, v0, Lcom/squareup/okhttp/Request$Builder;

    if-nez v1, :cond_a

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v0

    goto :goto_3

    :cond_a
    check-cast v0, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    :goto_3
    return-object v0

    .line 901
    :cond_b
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v1, v2, :cond_c

    goto :goto_4

    .line 902
    :cond_c
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 906
    :cond_d
    :goto_4
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v1}, Lcom/squareup/okhttp/OkHttpClient;->getAuthenticator()Lcom/squareup/okhttp/Authenticator;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v1, v2, v0}, Lcom/squareup/okhttp/internal/http/OkHeaders;->processAuthHeader(Lcom/squareup/okhttp/Authenticator;Lcom/squareup/okhttp/Response;Ljava/net/Proxy;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    return-object v0

    .line 888
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x133
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getBufferedRequestBody()Lokio/BufferedSink;
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    if-eqz v0, :cond_0

    return-object v0

    .line 315
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestBody()Lokio/Sink;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 316
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getConnection()Lcom/squareup/okhttp/Connection;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->connection()Lcom/squareup/okhttp/internal/io/RealConnection;

    move-result-object v0

    return-object v0
.end method

.method public getRequest()Lcom/squareup/okhttp/Request;
    .locals 1

    .line 326
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    return-object v0
.end method

.method public getRequestBody()Lokio/Sink;
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheStrategy:Lcom/squareup/okhttp/internal/http/CacheStrategy;

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    return-object v0

    .line 308
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public getResponse()Lcom/squareup/okhttp/Response;
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public hasResponse()Z
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method permitsRequestBody(Lcom/squareup/okhttp/Request;)Z
    .locals 0

    .line 303
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public readResponse()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 559
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    if-eqz v0, :cond_0

    return-void

    .line 562
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 563
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call sendRequest() first!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 565
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    if-nez v0, :cond_3

    return-void

    .line 571
    :cond_3
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->forWebSocket:Z

    if-eqz v1, :cond_4

    .line 572
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    invoke-interface {v1, v0}, Lcom/squareup/okhttp/internal/http/HttpStream;->writeRequestHeaders(Lcom/squareup/okhttp/Request;)V

    .line 573
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->readNetworkResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    goto/16 :goto_3

    .line 575
    :cond_4
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->callerWritesRequestBody:Z

    if-nez v1, :cond_5

    .line 576
    new-instance v1, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;-><init>(Lcom/squareup/okhttp/internal/http/HttpEngine;ILcom/squareup/okhttp/Request;)V

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v1, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine$NetworkInterceptorChain;->proceed(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    goto/16 :goto_3

    .line 580
    :cond_5
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lokio/BufferedSink;->buffer()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_6

    .line 581
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->emit()Lokio/BufferedSink;

    .line 585
    :cond_6
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_9

    .line 586
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/OkHeaders;->contentLength(Lcom/squareup/okhttp/Request;)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-nez v4, :cond_8

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    instance-of v1, v0, Lcom/squareup/okhttp/internal/http/RetryableSink;

    if-eqz v1, :cond_8

    .line 588
    check-cast v0, Lcom/squareup/okhttp/internal/http/RetryableSink;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/RetryableSink;->contentLength()J

    move-result-wide v0

    .line 589
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->newBuilder()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v2

    const-string v3, "Content-Length"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    instance-of v1, v0, Lcom/squareup/okhttp/Request$Builder;

    if-nez v1, :cond_7

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v0

    goto :goto_1

    :cond_7
    check-cast v0, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    .line 593
    :cond_8
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-interface {v0, v1}, Lcom/squareup/okhttp/internal/http/HttpStream;->writeRequestHeaders(Lcom/squareup/okhttp/Request;)V

    .line 597
    :cond_9
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    if-eqz v0, :cond_b

    .line 598
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    if-eqz v1, :cond_a

    .line 600
    invoke-interface {v1}, Lokio/BufferedSink;->close()V

    goto :goto_2

    .line 602
    :cond_a
    invoke-interface {v0}, Lokio/Sink;->close()V

    .line 604
    :goto_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    instance-of v1, v0, Lcom/squareup/okhttp/internal/http/RetryableSink;

    if-eqz v1, :cond_b

    .line 605
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    check-cast v0, Lcom/squareup/okhttp/internal/http/RetryableSink;

    invoke-interface {v1, v0}, Lcom/squareup/okhttp/internal/http/HttpStream;->writeRequestBody(Lcom/squareup/okhttp/internal/http/RetryableSink;)V

    .line 609
    :cond_b
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->readNetworkResponse()Lcom/squareup/okhttp/Response;

    move-result-object v0

    .line 612
    :goto_3
    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->receiveHeaders(Lcom/squareup/okhttp/Headers;)V

    .line 615
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    if-eqz v1, :cond_10

    .line 616
    invoke-static {v1, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->validate(Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/Response;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 617
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    instance-of v2, v1, Lcom/squareup/okhttp/Response$Builder;

    if-nez v2, :cond_c

    invoke-virtual {v1}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    goto :goto_4

    :cond_c
    check-cast v1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    :goto_4
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->priorResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->priorResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v2

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->combine(Lcom/squareup/okhttp/Headers;Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Headers;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->cacheResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->networkResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    .line 624
    instance-of v1, v0, Lcom/squareup/okhttp/Response;

    if-nez v1, :cond_d

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    goto :goto_5

    :cond_d
    check-cast v0, Lcom/squareup/okhttp/Response;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    :goto_5
    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->close()V

    .line 625
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->releaseStreamAllocation()V

    .line 629
    sget-object v0, Lcom/squareup/okhttp/internal/Internal;->instance:Lcom/squareup/okhttp/internal/Internal;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/Internal;->internalCache(Lcom/squareup/okhttp/OkHttpClient;)Lcom/squareup/okhttp/internal/InternalCache;

    move-result-object v0

    .line 630
    invoke-interface {v0}, Lcom/squareup/okhttp/internal/InternalCache;->trackConditionalCacheHit()V

    .line 631
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/squareup/okhttp/internal/InternalCache;->update(Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/Response;)V

    .line 632
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->unzip(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    return-void

    .line 635
    :cond_e
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    instance-of v2, v1, Lcom/squareup/okhttp/Response;

    if-nez v2, :cond_f

    invoke-virtual {v1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    goto :goto_6

    :cond_f
    check-cast v1, Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    :goto_6
    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 639
    :cond_10
    instance-of v1, v0, Lcom/squareup/okhttp/Response$Builder;

    if-nez v1, :cond_11

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    goto :goto_7

    :cond_11
    move-object v1, v0

    check-cast v1, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    :goto_7
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->priorResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->priorResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->cacheResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/squareup/okhttp/Response$Builder;->networkResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    .line 646
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasBody(Lcom/squareup/okhttp/Response;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 647
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->maybeCache()V

    .line 648
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->storeRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-direct {p0, v0, v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheWritingResponse(Lcom/squareup/okhttp/internal/http/CacheRequest;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->unzip(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    :cond_12
    return-void
.end method

.method public receiveHeaders(Lcom/squareup/okhttp/Headers;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 876
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getCookieHandler()Ljava/net/CookieHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 878
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Request;->uri()Ljava/net/URI;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v2}, Lcom/squareup/okhttp/internal/http/OkHeaders;->toMultimap(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/net/CookieHandler;->put(Ljava/net/URI;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public recover(Lcom/squareup/okhttp/internal/http/RouteException;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 10

    .line 346
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->recover(Lcom/squareup/okhttp/internal/http/RouteException;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 350
    :cond_0
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getRetryOnConnectionFailure()Z

    move-result p1

    if-nez p1, :cond_1

    return-object v0

    .line 354
    :cond_1
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->close()Lcom/squareup/okhttp/internal/http/StreamAllocation;

    move-result-object v7

    .line 357
    new-instance p1, Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    iget-boolean v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferRequestBody:Z

    iget-boolean v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->callerWritesRequestBody:Z

    iget-boolean v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->forWebSocket:Z

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    move-object v8, v0

    check-cast v8, Lcom/squareup/okhttp/internal/http/RetryableSink;

    iget-object v9, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->priorResponse:Lcom/squareup/okhttp/Response;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/squareup/okhttp/internal/http/HttpEngine;-><init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;ZZZLcom/squareup/okhttp/internal/http/StreamAllocation;Lcom/squareup/okhttp/internal/http/RetryableSink;Lcom/squareup/okhttp/Response;)V

    return-object p1
.end method

.method public recover(Ljava/io/IOException;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    invoke-virtual {p0, p1, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->recover(Ljava/io/IOException;Lokio/Sink;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object p1

    return-object p1
.end method

.method public recover(Ljava/io/IOException;Lokio/Sink;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 10

    .line 368
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->recover(Ljava/io/IOException;Lokio/Sink;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 372
    :cond_0
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {p1}, Lcom/squareup/okhttp/OkHttpClient;->getRetryOnConnectionFailure()Z

    move-result p1

    if-nez p1, :cond_1

    return-object v0

    .line 376
    :cond_1
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->close()Lcom/squareup/okhttp/internal/http/StreamAllocation;

    move-result-object v7

    .line 379
    new-instance p1, Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    iget-boolean v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferRequestBody:Z

    iget-boolean v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->callerWritesRequestBody:Z

    iget-boolean v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->forWebSocket:Z

    move-object v8, p2

    check-cast v8, Lcom/squareup/okhttp/internal/http/RetryableSink;

    iget-object v9, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->priorResponse:Lcom/squareup/okhttp/Response;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/squareup/okhttp/internal/http/HttpEngine;-><init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;ZZZLcom/squareup/okhttp/internal/http/StreamAllocation;Lcom/squareup/okhttp/internal/http/RetryableSink;Lcom/squareup/okhttp/Response;)V

    return-object p1
.end method

.method public releaseStreamAllocation()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 413
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/StreamAllocation;->release()V

    return-void
.end method

.method public sameConnection(Lcom/squareup/okhttp/HttpUrl;)Z
    .locals 3

    .line 966
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v0

    .line 967
    invoke-virtual {v0}, Lcom/squareup/okhttp/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/squareup/okhttp/HttpUrl;->host()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/squareup/okhttp/HttpUrl;->port()I

    move-result v1

    invoke-virtual {p1}, Lcom/squareup/okhttp/HttpUrl;->port()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/squareup/okhttp/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/okhttp/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public sendRequest()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/squareup/okhttp/internal/http/RequestException;,
            Lcom/squareup/okhttp/internal/http/RouteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 200
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheStrategy:Lcom/squareup/okhttp/internal/http/CacheStrategy;

    if-eqz v0, :cond_0

    return-void

    .line 201
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    if-nez v0, :cond_d

    .line 203
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    .line 205
    sget-object v1, Lcom/squareup/okhttp/internal/Internal;->instance:Lcom/squareup/okhttp/internal/Internal;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/internal/Internal;->internalCache(Lcom/squareup/okhttp/OkHttpClient;)Lcom/squareup/okhttp/internal/InternalCache;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 206
    invoke-interface {v1, v0}, Lcom/squareup/okhttp/internal/InternalCache;->get(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 210
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 211
    new-instance v5, Lcom/squareup/okhttp/internal/http/CacheStrategy$Factory;

    invoke-direct {v5, v3, v4, v0, v2}, Lcom/squareup/okhttp/internal/http/CacheStrategy$Factory;-><init>(JLcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Response;)V

    invoke-virtual {v5}, Lcom/squareup/okhttp/internal/http/CacheStrategy$Factory;->get()Lcom/squareup/okhttp/internal/http/CacheStrategy;

    move-result-object v3

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheStrategy:Lcom/squareup/okhttp/internal/http/CacheStrategy;

    .line 212
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheStrategy:Lcom/squareup/okhttp/internal/http/CacheStrategy;

    iget-object v3, v3, Lcom/squareup/okhttp/internal/http/CacheStrategy;->networkRequest:Lcom/squareup/okhttp/Request;

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    .line 213
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheStrategy:Lcom/squareup/okhttp/internal/http/CacheStrategy;

    iget-object v3, v3, Lcom/squareup/okhttp/internal/http/CacheStrategy;->cacheResponse:Lcom/squareup/okhttp/Response;

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    if-eqz v1, :cond_2

    .line 216
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheStrategy:Lcom/squareup/okhttp/internal/http/CacheStrategy;

    invoke-interface {v1, v3}, Lcom/squareup/okhttp/internal/InternalCache;->trackResponse(Lcom/squareup/okhttp/internal/http/CacheStrategy;)V

    :cond_2
    if-eqz v2, :cond_4

    .line 219
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    if-nez v1, :cond_4

    .line 220
    instance-of v1, v2, Lcom/squareup/okhttp/Response;

    if-nez v1, :cond_3

    invoke-virtual {v2}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    goto :goto_1

    :cond_3
    check-cast v2, Lcom/squareup/okhttp/Response;

    invoke-static {v2}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    :goto_1
    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 223
    :cond_4
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    if-eqz v1, :cond_8

    .line 224
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->connect()Lcom/squareup/okhttp/internal/http/HttpStream;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    .line 225
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    invoke-interface {v1, p0}, Lcom/squareup/okhttp/internal/http/HttpStream;->setHttpEngine(Lcom/squareup/okhttp/internal/http/HttpEngine;)V

    .line 231
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->callerWritesRequestBody:Z

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {p0, v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->permitsRequestBody(Lcom/squareup/okhttp/Request;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    if-nez v1, :cond_c

    .line 232
    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/OkHeaders;->contentLength(Lcom/squareup/okhttp/Request;)J

    move-result-wide v0

    .line 233
    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->bufferRequestBody:Z

    if-eqz v2, :cond_7

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_6

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_5

    .line 241
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-interface {v2, v3}, Lcom/squareup/okhttp/internal/http/HttpStream;->writeRequestHeaders(Lcom/squareup/okhttp/Request;)V

    .line 242
    new-instance v2, Lcom/squareup/okhttp/internal/http/RetryableSink;

    long-to-int v1, v0

    invoke-direct {v2, v1}, Lcom/squareup/okhttp/internal/http/RetryableSink;-><init>(I)V

    iput-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    goto/16 :goto_5

    .line 247
    :cond_5
    new-instance v0, Lcom/squareup/okhttp/internal/http/RetryableSink;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/RetryableSink;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    goto/16 :goto_5

    .line 235
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 250
    :cond_7
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-interface {v2, v3}, Lcom/squareup/okhttp/internal/http/HttpStream;->writeRequestHeaders(Lcom/squareup/okhttp/Request;)V

    .line 251
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->httpStream:Lcom/squareup/okhttp/internal/http/HttpStream;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->networkRequest:Lcom/squareup/okhttp/Request;

    invoke-interface {v2, v3, v0, v1}, Lcom/squareup/okhttp/internal/http/HttpStream;->createRequestBody(Lcom/squareup/okhttp/Request;J)Lokio/Sink;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    goto/16 :goto_5

    .line 256
    :cond_8
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    if-eqz v0, :cond_a

    .line 258
    instance-of v1, v0, Lcom/squareup/okhttp/Response$Builder;

    if-nez v1, :cond_9

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    goto :goto_2

    :cond_9
    check-cast v0, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    :goto_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->priorResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->priorResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->cacheResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    goto :goto_4

    .line 265
    :cond_a
    new-instance v0, Lcom/squareup/okhttp/Response$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Response$Builder;-><init>()V

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userRequest:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->priorResponse:Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->stripBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->priorResponse(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    sget-object v1, Lcom/squareup/okhttp/Protocol;->HTTP_1_1:Lcom/squareup/okhttp/Protocol;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->protocol(Lcom/squareup/okhttp/Protocol;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    const/16 v1, 0x1f8

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->code(I)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->message(Ljava/lang/String;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    sget-object v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->EMPTY_BODY:Lcom/squareup/okhttp/ResponseBody;

    instance-of v2, v0, Lcom/squareup/okhttp/Response$Builder;

    if-nez v2, :cond_b

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    goto :goto_3

    :cond_b
    check-cast v0, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response$Builder;Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    :goto_3
    invoke-virtual {v0}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    .line 275
    :goto_4
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->unzip(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->userResponse:Lcom/squareup/okhttp/Response;

    :cond_c
    :goto_5
    return-void

    .line 201
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public writingRequestHeaders()V
    .locals 5

    .line 298
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 299
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    return-void

    .line 298
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
