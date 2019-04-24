.class public final Lokhttp3/internal/http/HttpEngine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;
    }
.end annotation


# static fields
.field private static final EMPTY_BODY:Lokhttp3/ResponseBody;

.field public static final MAX_FOLLOW_UPS:I = 0x14


# instance fields
.field public final bufferRequestBody:Z

.field private bufferedRequestBody:Lokio/BufferedSink;

.field private cacheResponse:Lokhttp3/Response;

.field private cacheStrategy:Lokhttp3/internal/http/CacheStrategy;

.field private final callerWritesRequestBody:Z

.field final client:Lokhttp3/OkHttpClient;

.field private final forWebSocket:Z

.field private httpStream:Lokhttp3/internal/http/HttpStream;

.field private networkRequest:Lokhttp3/Request;

.field private final priorResponse:Lokhttp3/Response;

.field private requestBodyOut:Lokio/Sink;

.field sentRequestMillis:J

.field private storeRequest:Lokhttp3/internal/http/CacheRequest;

.field public final streamAllocation:Lokhttp3/internal/http/StreamAllocation;

.field private transparentGzip:Z

.field private final userRequest:Lokhttp3/Request;

.field private userResponse:Lokhttp3/Response;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 88
    new-instance v0, Lokhttp3/internal/http/HttpEngine$1;

    invoke-direct {v0}, Lokhttp3/internal/http/HttpEngine$1;-><init>()V

    sput-object v0, Lokhttp3/internal/http/HttpEngine;->EMPTY_BODY:Lokhttp3/ResponseBody;

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;ZZZLokhttp3/internal/http/StreamAllocation;Lokhttp3/internal/http/RetryableSink;Lokhttp3/Response;)V
    .locals 3

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lokhttp3/internal/http/HttpEngine;->sentRequestMillis:J

    .line 168
    iput-object p1, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    .line 169
    iput-object p2, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    .line 170
    iput-boolean p3, p0, Lokhttp3/internal/http/HttpEngine;->bufferRequestBody:Z

    .line 171
    iput-boolean p4, p0, Lokhttp3/internal/http/HttpEngine;->callerWritesRequestBody:Z

    .line 172
    iput-boolean p5, p0, Lokhttp3/internal/http/HttpEngine;->forWebSocket:Z

    .line 173
    if-eqz p6, :cond_0

    move-object v0, p6

    goto :goto_0

    :cond_0
    new-instance v0, Lokhttp3/internal/http/StreamAllocation;

    .line 175
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->connectionPool()Lokhttp3/ConnectionPool;

    move-result-object v1

    invoke-static {p1, p2}, Lokhttp3/internal/http/HttpEngine;->createAddress(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Address;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http/StreamAllocation;-><init>(Lokhttp3/ConnectionPool;Lokhttp3/Address;)V

    :goto_0
    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    .line 176
    iput-object p7, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    .line 177
    iput-object p8, p0, Lokhttp3/internal/http/HttpEngine;->priorResponse:Lokhttp3/Response;

    .line 178
    return-void
.end method

.method static synthetic access$000(Lokhttp3/internal/http/HttpEngine;)Lokhttp3/internal/http/HttpStream;
    .locals 1

    .line 81
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    return-object v0
.end method

.method static synthetic access$102(Lokhttp3/internal/http/HttpEngine;Lokhttp3/Request;)Lokhttp3/Request;
    .locals 0

    .line 81
    iput-object p1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    return-object p1
.end method

.method static synthetic access$200(Lokhttp3/internal/http/HttpEngine;)Lokhttp3/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 81
    invoke-direct {p0}, Lokhttp3/internal/http/HttpEngine;->readNetworkResponse()Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method private cacheWritingResponse(Lokhttp3/internal/http/CacheRequest;Lokhttp3/Response;)Lokhttp3/Response;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 752
    if-nez p1, :cond_0

    return-object p2

    .line 753
    :cond_0
    invoke-interface {p1}, Lokhttp3/internal/http/CacheRequest;->body()Lokio/Sink;

    move-result-object v4

    .line 754
    if-nez v4, :cond_1

    return-object p2

    .line 756
    :cond_1
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v5

    .line 757
    invoke-static {v4}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v6

    .line 759
    new-instance v7, Lokhttp3/internal/http/HttpEngine$2;

    invoke-direct {v7, p0, v5, p1, v6}, Lokhttp3/internal/http/HttpEngine$2;-><init>(Lokhttp3/internal/http/HttpEngine;Lokio/BufferedSource;Lokhttp3/internal/http/CacheRequest;Lokio/BufferedSink;)V

    .line 801
    invoke-virtual {p2}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    new-instance v1, Lokhttp3/internal/http/RealResponseBody;

    .line 802
    invoke-virtual {p2}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v2

    invoke-static {v7}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lokhttp3/internal/http/RealResponseBody;-><init>(Lokhttp3/Headers;Lokio/BufferedSource;)V

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 803
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method private static combine(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 834
    new-instance v1, Lokhttp3/Headers$Builder;

    invoke-direct {v1}, Lokhttp3/Headers$Builder;-><init>()V

    .line 836
    const/4 v2, 0x0

    invoke-virtual {p0}, Lokhttp3/Headers;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_3

    .line 837
    invoke-virtual {p0, v2}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v4

    .line 838
    invoke-virtual {p0, v2}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v5

    .line 839
    const-string v0, "Warning"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 840
    goto :goto_1

    .line 842
    :cond_0
    invoke-static {v4}, Lokhttp3/internal/http/OkHeaders;->isEndToEnd(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v4}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 843
    :cond_1
    invoke-virtual {v1, v4, v5}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 836
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 847
    :cond_3
    const/4 v2, 0x0

    invoke-virtual {p1}, Lokhttp3/Headers;->size()I

    move-result v3

    :goto_2
    if-ge v2, v3, :cond_6

    .line 848
    invoke-virtual {p1, v2}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v4

    .line 849
    const-string v0, "Content-Length"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 850
    goto :goto_3

    .line 852
    :cond_4
    invoke-static {v4}, Lokhttp3/internal/http/OkHeaders;->isEndToEnd(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 853
    invoke-virtual {p1, v2}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 847
    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 857
    :cond_6
    invoke-virtual {v1}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v0

    return-object v0
.end method

.method private connect()Lokhttp3/internal/http/HttpStream;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lokhttp3/internal/http/RouteException;,
            Lokhttp3/internal/http/RequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 288
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 289
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->connectTimeoutMillis()I

    move-result v1

    iget-object v2, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    .line 290
    invoke-virtual {v2}, Lokhttp3/OkHttpClient;->readTimeoutMillis()I

    move-result v2

    iget-object v3, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v3}, Lokhttp3/OkHttpClient;->writeTimeoutMillis()I

    move-result v3

    iget-object v4, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    .line 291
    invoke-virtual {v4}, Lokhttp3/OkHttpClient;->retryOnConnectionFailure()Z

    move-result v4

    move v5, v6

    .line 289
    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/http/StreamAllocation;->newStream(IIIZZ)Lokhttp3/internal/http/HttpStream;

    move-result-object v0

    return-object v0
.end method

.method private cookieHeader(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lokhttp3/Cookie;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 531
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 532
    const/4 v3, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_1

    .line 533
    if-lez v3, :cond_0

    .line 534
    const-string v0, "; "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    :cond_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lokhttp3/Cookie;

    .line 537
    invoke-virtual {v5}, Lokhttp3/Cookie;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lokhttp3/Cookie;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 539
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static createAddress(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Address;
    .locals 16

    .line 971
    const/4 v13, 0x0

    .line 972
    const/4 v14, 0x0

    .line 973
    const/4 v15, 0x0

    .line 974
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->isHttps()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 975
    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v13

    .line 976
    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v14

    .line 977
    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->certificatePinner()Lokhttp3/CertificatePinner;

    move-result-object v15

    .line 980
    :cond_0
    new-instance v0, Lokhttp3/Address;

    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->port()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->dns()Lokhttp3/Dns;

    move-result-object v3

    .line 981
    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->socketFactory()Ljavax/net/SocketFactory;

    move-result-object v4

    .line 982
    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->proxyAuthenticator()Lokhttp3/Authenticator;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->proxy()Ljava/net/Proxy;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->protocols()Ljava/util/List;

    move-result-object v10

    .line 983
    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->connectionSpecs()Ljava/util/List;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lokhttp3/OkHttpClient;->proxySelector()Ljava/net/ProxySelector;

    move-result-object v12

    move-object v5, v13

    move-object v6, v14

    move-object v7, v15

    invoke-direct/range {v0 .. v12}, Lokhttp3/Address;-><init>(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v0
.end method

.method public static hasBody(Lokhttp3/Response;)Z
    .locals 5

    .line 473
    invoke-virtual {p0}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 474
    const/4 v0, 0x0

    return v0

    .line 477
    :cond_0
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    move-result v4

    .line 478
    const/16 v0, 0x64

    if-lt v4, v0, :cond_1

    const/16 v0, 0xc8

    if-lt v4, v0, :cond_2

    :cond_1
    const/16 v0, 0xcc

    if-eq v4, v0, :cond_2

    const/16 v0, 0x130

    if-eq v4, v0, :cond_2

    .line 481
    const/4 v0, 0x1

    return v0

    .line 487
    :cond_2
    invoke-static {p0}, Lokhttp3/internal/http/OkHeaders;->contentLength(Lokhttp3/Response;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const-string v0, "chunked"

    const-string v1, "Transfer-Encoding"

    .line 488
    invoke-virtual {p0, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 489
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 492
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method private maybeCache()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 373
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lokhttp3/internal/Internal;->internalCache(Lokhttp3/OkHttpClient;)Lokhttp3/internal/InternalCache;

    move-result-object v2

    .line 374
    if-nez v2, :cond_0

    return-void

    .line 377
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-static {v0, v1}, Lokhttp3/internal/http/CacheStrategy;->isCacheable(Lokhttp3/Response;Lokhttp3/Request;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 378
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/HttpMethod;->invalidatesCache(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 380
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-interface {v2, v0}, Lokhttp3/internal/InternalCache;->remove(Lokhttp3/Request;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 383
    goto :goto_0

    .line 381
    :catch_0
    move-exception v3

    .line 385
    :cond_1
    :goto_0
    return-void

    .line 389
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-static {v0}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    invoke-interface {v2, v0}, Lokhttp3/internal/InternalCache;->put(Lokhttp3/Response;)Lokhttp3/internal/http/CacheRequest;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->storeRequest:Lokhttp3/internal/http/CacheRequest;

    .line 390
    return-void
.end method

.method private networkRequest(Lokhttp3/Request;)Lokhttp3/Request;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 502
    invoke-virtual {p1}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v3

    .line 504
    const-string v0, "Host"

    invoke-virtual {p1, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 505
    const-string v0, "Host"

    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lokhttp3/internal/Util;->hostHeader(Lokhttp3/HttpUrl;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 508
    :cond_0
    const-string v0, "Connection"

    invoke-virtual {p1, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 509
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v3, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 512
    :cond_1
    const-string v0, "Accept-Encoding"

    invoke-virtual {p1, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 513
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->transparentGzip:Z

    .line 514
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v3, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 517
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->cookieJar()Lokhttp3/CookieJar;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-interface {v0, v1}, Lokhttp3/CookieJar;->loadForRequest(Lokhttp3/HttpUrl;)Ljava/util/List;

    move-result-object v4

    .line 518
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 519
    const-string v0, "Cookie"

    invoke-direct {p0, v4}, Lokhttp3/internal/http/HttpEngine;->cookieHeader(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 522
    :cond_3
    const-string v0, "User-Agent"

    invoke-virtual {p1, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    .line 523
    const-string v0, "User-Agent"

    invoke-static {}, Lokhttp3/internal/Version;->userAgent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 526
    :cond_4
    invoke-virtual {v3}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method

.method private readNetworkResponse()Lokhttp3/Response;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 721
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    invoke-interface {v0}, Lokhttp3/internal/http/HttpStream;->finishRequest()V

    .line 723
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    invoke-interface {v0}, Lokhttp3/internal/http/HttpStream;->readResponseHeaders()Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    .line 724
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    .line 725
    invoke-virtual {v1}, Lokhttp3/internal/http/StreamAllocation;->connection()Lokhttp3/internal/io/RealConnection;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/internal/io/RealConnection;->handshake()Lokhttp3/Handshake;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;

    move-result-object v0

    sget-object v1, Lokhttp3/internal/http/OkHeaders;->SENT_MILLIS:Ljava/lang/String;

    iget-wide v2, p0, Lokhttp3/internal/http/HttpEngine;->sentRequestMillis:J

    .line 726
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Response$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v0

    sget-object v1, Lokhttp3/internal/http/OkHeaders;->RECEIVED_MILLIS:Ljava/lang/String;

    .line 727
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Response$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 728
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v4

    .line 730
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->forWebSocket:Z

    if-nez v0, :cond_0

    .line 731
    invoke-virtual {v4}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    .line 732
    invoke-interface {v1, v4}, Lokhttp3/internal/http/HttpStream;->openResponseBody(Lokhttp3/Response;)Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 733
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v4

    .line 736
    :cond_0
    const-string v0, "close"

    invoke-virtual {v4}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v1

    const-string v2, "Connection"

    invoke-virtual {v1, v2}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "close"

    const-string v1, "Connection"

    .line 737
    invoke-virtual {v4, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 738
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->noNewStreams()V

    .line 741
    :cond_2
    return-object v4
.end method

.method private static stripBody(Lokhttp3/Response;)Lokhttp3/Response;
    .locals 2

    .line 295
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 296
    invoke-virtual {p0}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method private unzip(Lokhttp3/Response;)Lokhttp3/Response;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 449
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->transparentGzip:Z

    if-eqz v0, :cond_0

    const-string v0, "gzip"

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    const-string v2, "Content-Encoding"

    invoke-virtual {v1, v2}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 450
    :cond_0
    return-object p1

    .line 453
    :cond_1
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-nez v0, :cond_2

    .line 454
    return-object p1

    .line 457
    :cond_2
    new-instance v3, Lokio/GzipSource;

    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    invoke-direct {v3, v0}, Lokio/GzipSource;-><init>(Lokio/Source;)V

    .line 458
    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Headers;->newBuilder()Lokhttp3/Headers$Builder;

    move-result-object v0

    const-string v1, "Content-Encoding"

    .line 459
    invoke-virtual {v0, v1}, Lokhttp3/Headers$Builder;->removeAll(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    move-result-object v0

    const-string v1, "Content-Length"

    .line 460
    invoke-virtual {v0, v1}, Lokhttp3/Headers$Builder;->removeAll(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    move-result-object v0

    .line 461
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v4

    .line 462
    invoke-virtual {p1}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    .line 463
    invoke-virtual {v0, v4}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object v0

    new-instance v1, Lokhttp3/internal/http/RealResponseBody;

    .line 464
    invoke-static {v3}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v2

    invoke-direct {v1, v4, v2}, Lokhttp3/internal/http/RealResponseBody;-><init>(Lokhttp3/Headers;Lokio/BufferedSource;)V

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 465
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method private static validate(Lokhttp3/Response;Lokhttp3/Response;)Z
    .locals 6

    .line 811
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v0

    const/16 v1, 0x130

    if-ne v0, v1, :cond_0

    .line 812
    const/4 v0, 0x1

    return v0

    .line 818
    :cond_0
    invoke-virtual {p0}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    const-string v1, "Last-Modified"

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 819
    if-eqz v4, :cond_1

    .line 820
    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    const-string v1, "Last-Modified"

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 821
    if-eqz v5, :cond_1

    .line 822
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 823
    const/4 v0, 0x1

    return v0

    .line 827
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private writeRequestHeadersEagerly()Z
    .locals 1

    .line 282
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->callerWritesRequestBody:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    .line 283
    invoke-virtual {p0, v0}, Lokhttp3/internal/http/HttpEngine;->permitsRequestBody(Lokhttp3/Request;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 410
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->cancel()V

    .line 411
    return-void
.end method

.method public close()Lokhttp3/internal/http/StreamAllocation;
    .locals 2

    .line 418
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    if-eqz v0, :cond_0

    .line 420
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 421
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    if-eqz v0, :cond_1

    .line 422
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 425
    :cond_1
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    if-eqz v0, :cond_2

    .line 426
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_1

    .line 429
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lokhttp3/internal/http/StreamAllocation;->connectionFailed(Ljava/io/IOException;)V

    .line 432
    :goto_1
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    return-object v0
.end method

.method public followUpRequest()Lokhttp3/Request;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 875
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 876
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->connection()Lokhttp3/internal/io/RealConnection;

    move-result-object v2

    .line 877
    if-eqz v2, :cond_1

    .line 878
    invoke-interface {v2}, Lokhttp3/Connection;->route()Lokhttp3/Route;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 880
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    move-result v4

    .line 882
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v5

    .line 883
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_4

    .line 885
    :sswitch_0
    if-eqz v3, :cond_2

    .line 886
    invoke-virtual {v3}, Lokhttp3/Route;->proxy()Ljava/net/Proxy;

    move-result-object v6

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    .line 887
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->proxy()Ljava/net/Proxy;

    move-result-object v6

    .line 888
    :goto_1
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_3

    .line 889
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 893
    :cond_3
    :sswitch_1
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->authenticator()Lokhttp3/Authenticator;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-interface {v0, v3, v1}, Lokhttp3/Authenticator;->authenticate(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    move-result-object v0

    return-object v0

    .line 899
    :sswitch_2
    const-string v0, "GET"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "HEAD"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 900
    const/4 v0, 0x0

    return-object v0

    .line 908
    :cond_4
    :sswitch_3
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->followRedirects()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    return-object v0

    .line 910
    :cond_5
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    const-string v1, "Location"

    invoke-virtual {v0, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 911
    if-nez v7, :cond_6

    const/4 v0, 0x0

    return-object v0

    .line 912
    :cond_6
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0, v7}, Lokhttp3/HttpUrl;->resolve(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v8

    .line 915
    if-nez v8, :cond_7

    const/4 v0, 0x0

    return-object v0

    .line 918
    :cond_7
    invoke-virtual {v8}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    .line 919
    if-nez v9, :cond_8

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->followSslRedirects()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x0

    return-object v0

    .line 922
    :cond_8
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v10

    .line 923
    invoke-static {v5}, Lokhttp3/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 924
    invoke-static {v5}, Lokhttp3/internal/http/HttpMethod;->redirectsToGet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 925
    const-string v0, "GET"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    goto :goto_2

    .line 927
    :cond_9
    const/4 v0, 0x0

    invoke-virtual {v10, v5, v0}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 929
    :goto_2
    const-string v0, "Transfer-Encoding"

    invoke-virtual {v10, v0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 930
    const-string v0, "Content-Length"

    invoke-virtual {v10, v0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 931
    const-string v0, "Content-Type"

    invoke-virtual {v10, v0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 937
    :cond_a
    invoke-virtual {p0, v8}, Lokhttp3/internal/http/HttpEngine;->sameConnection(Lokhttp3/HttpUrl;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 938
    const-string v0, "Authorization"

    invoke-virtual {v10, v0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 941
    :cond_b
    invoke-virtual {v10, v8}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    return-object v0

    .line 947
    :sswitch_4
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    instance-of v0, v0, Lokhttp3/internal/http/RetryableSink;

    if-eqz v0, :cond_d

    :cond_c
    const/4 v11, 0x1

    goto :goto_3

    :cond_d
    const/4 v11, 0x0

    .line 948
    :goto_3
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->callerWritesRequestBody:Z

    if-eqz v0, :cond_e

    if-nez v11, :cond_e

    .line 949
    const/4 v0, 0x0

    return-object v0

    .line 952
    :cond_e
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    return-object v0

    .line 955
    :goto_4
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x12c -> :sswitch_3
        0x12d -> :sswitch_3
        0x12e -> :sswitch_3
        0x12f -> :sswitch_3
        0x133 -> :sswitch_2
        0x134 -> :sswitch_2
        0x191 -> :sswitch_1
        0x197 -> :sswitch_0
        0x198 -> :sswitch_4
    .end sparse-switch
.end method

.method public getBufferedRequestBody()Lokio/BufferedSink;
    .locals 3

    .line 320
    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    .line 321
    if-eqz v1, :cond_0

    return-object v1

    .line 322
    :cond_0
    invoke-virtual {p0}, Lokhttp3/internal/http/HttpEngine;->getRequestBody()Lokio/Sink;

    move-result-object v2

    .line 323
    if-eqz v2, :cond_1

    .line 324
    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getConnection()Lokhttp3/Connection;
    .locals 1

    .line 344
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->connection()Lokhttp3/internal/io/RealConnection;

    move-result-object v0

    return-object v0
.end method

.method public getRequest()Lokhttp3/Request;
    .locals 1

    .line 333
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    return-object v0
.end method

.method public getRequestBody()Lokio/Sink;
    .locals 1

    .line 315
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheStrategy:Lokhttp3/internal/http/CacheStrategy;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 316
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    return-object v0
.end method

.method public getResponse()Lokhttp3/Response;
    .locals 1

    .line 339
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 340
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    return-object v0
.end method

.method public hasResponse()Z
    .locals 1

    .line 329
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method permitsRequestBody(Lokhttp3/Request;)Z
    .locals 1

    .line 310
    invoke-virtual {p1}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public readResponse()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 547
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    if-eqz v0, :cond_0

    .line 548
    return-void

    .line 550
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    if-nez v0, :cond_1

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    if-nez v0, :cond_1

    .line 551
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call sendRequest() first!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 553
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    if-nez v0, :cond_2

    .line 554
    return-void

    .line 559
    :cond_2
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->forWebSocket:Z

    if-eqz v0, :cond_3

    .line 560
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-interface {v0, v1}, Lokhttp3/internal/http/HttpStream;->writeRequestHeaders(Lokhttp3/Request;)V

    .line 561
    invoke-direct {p0}, Lokhttp3/internal/http/HttpEngine;->readNetworkResponse()Lokhttp3/Response;

    move-result-object v4

    goto/16 :goto_1

    .line 562
    :cond_3
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->callerWritesRequestBody:Z

    if-nez v0, :cond_4

    .line 563
    new-instance v0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;-><init>(Lokhttp3/internal/http/HttpEngine;ILokhttp3/Request;)V

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-virtual {v0, v1}, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v4

    goto/16 :goto_1

    .line 566
    :cond_4
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->buffer()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 567
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->emit()Lokio/BufferedSink;

    .line 571
    :cond_5
    iget-wide v0, p0, Lokhttp3/internal/http/HttpEngine;->sentRequestMillis:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    .line 572
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-static {v0}, Lokhttp3/internal/http/OkHeaders;->contentLength(Lokhttp3/Request;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    instance-of v0, v0, Lokhttp3/internal/http/RetryableSink;

    if-eqz v0, :cond_6

    .line 574
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    check-cast v0, Lokhttp3/internal/http/RetryableSink;

    invoke-virtual {v0}, Lokhttp3/internal/http/RetryableSink;->contentLength()J

    move-result-wide v5

    .line 575
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "Content-Length"

    .line 576
    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 577
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    .line 579
    :cond_6
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-interface {v0, v1}, Lokhttp3/internal/http/HttpStream;->writeRequestHeaders(Lokhttp3/Request;)V

    .line 583
    :cond_7
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    if-eqz v0, :cond_9

    .line 584
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    if-eqz v0, :cond_8

    .line 586
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferedRequestBody:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    goto :goto_0

    .line 588
    :cond_8
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    invoke-interface {v0}, Lokio/Sink;->close()V

    .line 590
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    instance-of v0, v0, Lokhttp3/internal/http/RetryableSink;

    if-eqz v0, :cond_9

    .line 591
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    check-cast v1, Lokhttp3/internal/http/RetryableSink;

    invoke-interface {v0, v1}, Lokhttp3/internal/http/HttpStream;->writeRequestBody(Lokhttp3/internal/http/RetryableSink;)V

    .line 595
    :cond_9
    invoke-direct {p0}, Lokhttp3/internal/http/HttpEngine;->readNetworkResponse()Lokhttp3/Response;

    move-result-object v4

    .line 598
    :goto_1
    invoke-virtual {v4}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/HttpEngine;->receiveHeaders(Lokhttp3/Headers;)V

    .line 601
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    if-eqz v0, :cond_b

    .line 602
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    invoke-static {v0, v4}, Lokhttp3/internal/http/HttpEngine;->validate(Lokhttp3/Response;Lokhttp3/Response;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 603
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    .line 604
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->priorResponse:Lokhttp3/Response;

    .line 605
    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->priorResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    .line 606
    invoke-virtual {v1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v1

    invoke-virtual {v4}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v2

    invoke-static {v1, v2}, Lokhttp3/internal/http/HttpEngine;->combine(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    .line 607
    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->cacheResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 608
    invoke-static {v4}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->networkResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 609
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    .line 610
    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    .line 611
    invoke-virtual {p0}, Lokhttp3/internal/http/HttpEngine;->releaseStreamAllocation()V

    .line 615
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lokhttp3/internal/Internal;->internalCache(Lokhttp3/OkHttpClient;)Lokhttp3/internal/InternalCache;

    move-result-object v5

    .line 616
    invoke-interface {v5}, Lokhttp3/internal/InternalCache;->trackConditionalCacheHit()V

    .line 617
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lokhttp3/internal/InternalCache;->update(Lokhttp3/Response;Lokhttp3/Response;)V

    .line 618
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-direct {p0, v0}, Lokhttp3/internal/http/HttpEngine;->unzip(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    .line 619
    return-void

    .line 621
    :cond_a
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 625
    :cond_b
    invoke-virtual {v4}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    .line 626
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->priorResponse:Lokhttp3/Response;

    .line 627
    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->priorResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    .line 628
    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->cacheResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 629
    invoke-static {v4}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->networkResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 630
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    .line 632
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-static {v0}, Lokhttp3/internal/http/HttpEngine;->hasBody(Lokhttp3/Response;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 633
    invoke-direct {p0}, Lokhttp3/internal/http/HttpEngine;->maybeCache()V

    .line 634
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->storeRequest:Lokhttp3/internal/http/CacheRequest;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-direct {p0, v0, v1}, Lokhttp3/internal/http/HttpEngine;->cacheWritingResponse(Lokhttp3/internal/http/CacheRequest;Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    invoke-direct {p0, v0}, Lokhttp3/internal/http/HttpEngine;->unzip(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    .line 636
    :cond_c
    return-void
.end method

.method public receiveHeaders(Lokhttp3/Headers;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 861
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->cookieJar()Lokhttp3/CookieJar;

    move-result-object v0

    sget-object v1, Lokhttp3/CookieJar;->NO_COOKIES:Lokhttp3/CookieJar;

    if-ne v0, v1, :cond_0

    return-void

    .line 863
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-static {v0, p1}, Lokhttp3/Cookie;->parseAll(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;

    move-result-object v2

    .line 864
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 866
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->cookieJar()Lokhttp3/CookieJar;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lokhttp3/CookieJar;->saveFromResponse(Lokhttp3/HttpUrl;Ljava/util/List;)V

    .line 867
    return-void
.end method

.method public recover(Ljava/io/IOException;)Lokhttp3/internal/http/HttpEngine;
    .locals 1

    .line 369
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    invoke-virtual {p0, p1, v0}, Lokhttp3/internal/http/HttpEngine;->recover(Ljava/io/IOException;Lokio/Sink;)Lokhttp3/internal/http/HttpEngine;

    move-result-object v0

    return-object v0
.end method

.method public recover(Ljava/io/IOException;Lokio/Sink;)Lokhttp3/internal/http/HttpEngine;
    .locals 10

    .line 353
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0, p1, p2}, Lokhttp3/internal/http/StreamAllocation;->recover(Ljava/io/IOException;Lokio/Sink;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 354
    const/4 v0, 0x0

    return-object v0

    .line 357
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->retryOnConnectionFailure()Z

    move-result v0

    if-nez v0, :cond_1

    .line 358
    const/4 v0, 0x0

    return-object v0

    .line 361
    :cond_1
    invoke-virtual {p0}, Lokhttp3/internal/http/HttpEngine;->close()Lokhttp3/internal/http/StreamAllocation;

    move-result-object v9

    .line 364
    new-instance v0, Lokhttp3/internal/http/HttpEngine;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    iget-object v2, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    iget-boolean v3, p0, Lokhttp3/internal/http/HttpEngine;->bufferRequestBody:Z

    iget-boolean v4, p0, Lokhttp3/internal/http/HttpEngine;->callerWritesRequestBody:Z

    iget-boolean v5, p0, Lokhttp3/internal/http/HttpEngine;->forWebSocket:Z

    move-object v7, p2

    check-cast v7, Lokhttp3/internal/http/RetryableSink;

    iget-object v8, p0, Lokhttp3/internal/http/HttpEngine;->priorResponse:Lokhttp3/Response;

    move-object v6, v9

    invoke-direct/range {v0 .. v8}, Lokhttp3/internal/http/HttpEngine;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;ZZZLokhttp3/internal/http/StreamAllocation;Lokhttp3/internal/http/RetryableSink;Lokhttp3/Response;)V

    return-object v0
.end method

.method public releaseStreamAllocation()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 397
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->release()V

    .line 398
    return-void
.end method

.method public sameConnection(Lokhttp3/HttpUrl;)Z
    .locals 3

    .line 964
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    .line 965
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 966
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->port()I

    move-result v0

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->port()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 967
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public sendRequest()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lokhttp3/internal/http/RequestException;,
            Lokhttp3/internal/http/RouteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 191
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheStrategy:Lokhttp3/internal/http/CacheStrategy;

    if-eqz v0, :cond_0

    return-void

    .line 192
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 194
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    invoke-direct {p0, v0}, Lokhttp3/internal/http/HttpEngine;->networkRequest(Lokhttp3/Request;)Lokhttp3/Request;

    move-result-object v2

    .line 196
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lokhttp3/internal/Internal;->internalCache(Lokhttp3/OkHttpClient;)Lokhttp3/internal/InternalCache;

    move-result-object v3

    .line 197
    if-eqz v3, :cond_2

    .line 198
    invoke-interface {v3, v2}, Lokhttp3/internal/InternalCache;->get(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v4

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 201
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 202
    new-instance v0, Lokhttp3/internal/http/CacheStrategy$Factory;

    invoke-direct {v0, v5, v6, v2, v4}, Lokhttp3/internal/http/CacheStrategy$Factory;-><init>(JLokhttp3/Request;Lokhttp3/Response;)V

    invoke-virtual {v0}, Lokhttp3/internal/http/CacheStrategy$Factory;->get()Lokhttp3/internal/http/CacheStrategy;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheStrategy:Lokhttp3/internal/http/CacheStrategy;

    .line 203
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheStrategy:Lokhttp3/internal/http/CacheStrategy;

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy;->networkRequest:Lokhttp3/Request;

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    .line 204
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheStrategy:Lokhttp3/internal/http/CacheStrategy;

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy;->cacheResponse:Lokhttp3/Response;

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    .line 206
    if-eqz v3, :cond_3

    .line 207
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheStrategy:Lokhttp3/internal/http/CacheStrategy;

    invoke-interface {v3, v0}, Lokhttp3/internal/InternalCache;->trackResponse(Lokhttp3/internal/http/CacheStrategy;)V

    .line 210
    :cond_3
    if-eqz v4, :cond_4

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    if-nez v0, :cond_4

    .line 211
    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 215
    :cond_4
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    if-nez v0, :cond_5

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    if-nez v0, :cond_5

    .line 216
    new-instance v0, Lokhttp3/Response$Builder;

    invoke-direct {v0}, Lokhttp3/Response$Builder;-><init>()V

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    .line 217
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->priorResponse:Lokhttp3/Response;

    .line 218
    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->priorResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    sget-object v1, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 219
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 220
    const/16 v1, 0x1f8

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object v0

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    .line 221
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v0

    sget-object v1, Lokhttp3/internal/http/HttpEngine;->EMPTY_BODY:Lokhttp3/ResponseBody;

    .line 222
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 223
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    .line 224
    return-void

    .line 228
    :cond_5
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    if-nez v0, :cond_6

    .line 229
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->userRequest:Lokhttp3/Request;

    .line 230
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->priorResponse:Lokhttp3/Response;

    .line 231
    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->priorResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->cacheResponse:Lokhttp3/Response;

    .line 232
    invoke-static {v1}, Lokhttp3/internal/http/HttpEngine;->stripBody(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->cacheResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 233
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    .line 234
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    invoke-direct {p0, v0}, Lokhttp3/internal/http/HttpEngine;->unzip(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->userResponse:Lokhttp3/Response;

    .line 235
    return-void

    .line 239
    :cond_6
    const/4 v7, 0x0

    .line 241
    :try_start_0
    invoke-direct {p0}, Lokhttp3/internal/http/HttpEngine;->connect()Lokhttp3/internal/http/HttpStream;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    .line 242
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    invoke-interface {v0, p0}, Lokhttp3/internal/http/HttpStream;->setHttpEngine(Lokhttp3/internal/http/HttpEngine;)V

    .line 244
    invoke-direct {p0}, Lokhttp3/internal/http/HttpEngine;->writeRequestHeadersEagerly()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 245
    invoke-static {v2}, Lokhttp3/internal/http/OkHeaders;->contentLength(Lokhttp3/Request;)J

    move-result-wide v8

    .line 246
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine;->bufferRequestBody:Z

    if-eqz v0, :cond_9

    .line 247
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v8, v0

    if-lez v0, :cond_7

    .line 248
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 252
    :cond_7
    const-wide/16 v0, -0x1

    cmp-long v0, v8, v0

    if-eqz v0, :cond_8

    .line 254
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-interface {v0, v1}, Lokhttp3/internal/http/HttpStream;->writeRequestHeaders(Lokhttp3/Request;)V

    .line 255
    new-instance v0, Lokhttp3/internal/http/RetryableSink;

    long-to-int v1, v8

    invoke-direct {v0, v1}, Lokhttp3/internal/http/RetryableSink;-><init>(I)V

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    goto :goto_1

    .line 259
    :cond_8
    new-instance v0, Lokhttp3/internal/http/RetryableSink;

    invoke-direct {v0}, Lokhttp3/internal/http/RetryableSink;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;

    goto :goto_1

    .line 262
    :cond_9
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-interface {v0, v1}, Lokhttp3/internal/http/HttpStream;->writeRequestHeaders(Lokhttp3/Request;)V

    .line 263
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine;->httpStream:Lokhttp3/internal/http/HttpStream;

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine;->networkRequest:Lokhttp3/Request;

    invoke-interface {v0, v1, v8, v9}, Lokhttp3/internal/http/HttpStream;->createRequestBody(Lokhttp3/Request;J)Lokio/Sink;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/HttpEngine;->requestBodyOut:Lokio/Sink;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    :cond_a
    :goto_1
    const/4 v7, 0x1

    .line 269
    goto :goto_2

    .line 269
    .line 270
    :catchall_0
    move-exception v10

    if-nez v7, :cond_b

    if-eqz v4, :cond_b

    .line 270
    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    :cond_b
    throw v10

    .line 273
    :goto_2
    return-void
.end method

.method public writingRequestHeaders()V
    .locals 4

    .line 305
    iget-wide v0, p0, Lokhttp3/internal/http/HttpEngine;->sentRequestMillis:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 306
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/internal/http/HttpEngine;->sentRequestMillis:J

    .line 307
    return-void
.end method
