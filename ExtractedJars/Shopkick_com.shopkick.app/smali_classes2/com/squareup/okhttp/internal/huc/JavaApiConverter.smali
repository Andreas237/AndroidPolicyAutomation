.class public final Lcom/squareup/okhttp/internal/huc/JavaApiConverter;
.super Ljava/lang/Object;
.source "JavaApiConverter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;,
        Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/RuntimeException;
    .locals 1

    .line 51
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->throwRequestModificationException()Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/RuntimeException;
    .locals 1

    .line 51
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->throwRequestHeaderAccessException()Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200()Ljava/lang/RuntimeException;
    .locals 1

    .line 51
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->throwResponseBodyAccessException()Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400()Ljava/lang/RuntimeException;
    .locals 1

    .line 51
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->throwRequestSslAccessException()Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method public static createJavaCacheResponse(Lcom/squareup/okhttp/Response;)Ljava/net/CacheResponse;
    .locals 4

    .line 181
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    .line 182
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    .line 183
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->request()Lcom/squareup/okhttp/Request;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->isHttps()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 184
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->handshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v2

    .line 185
    new-instance v3, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$1;

    invoke-direct {v3, v2, v0, p0, v1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$1;-><init>(Lcom/squareup/okhttp/Handshake;Lcom/squareup/okhttp/Headers;Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/ResponseBody;)V

    return-object v3

    .line 232
    :cond_0
    new-instance v2, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;

    invoke-direct {v2, v0, p0, v1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;-><init>(Lcom/squareup/okhttp/Headers;Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/ResponseBody;)V

    return-object v2
.end method

.method static createJavaUrlConnection(Lcom/squareup/okhttp/Response;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 253
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->request()Lcom/squareup/okhttp/Request;

    move-result-object v0

    .line 255
    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->isHttps()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    new-instance v0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;

    new-instance v1, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;

    invoke-direct {v1, p0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;-><init>(Lcom/squareup/okhttp/Response;)V

    invoke-direct {v0, v1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;-><init>(Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;)V

    return-object v0

    .line 258
    :cond_0
    new-instance v0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;

    invoke-direct {v0, p0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;-><init>(Lcom/squareup/okhttp/Response;)V

    return-object v0
.end method

.method private static createOkBody(Lcom/squareup/okhttp/Headers;Ljava/io/InputStream;)Lcom/squareup/okhttp/ResponseBody;
    .locals 1

    .line 343
    invoke-static {p1}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    move-result-object p1

    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object p1

    .line 344
    new-instance v0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$3;

    invoke-direct {v0, p0, p1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$3;-><init>(Lcom/squareup/okhttp/Headers;Lokio/BufferedSource;)V

    return-object v0
.end method

.method public static createOkRequest(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Lcom/squareup/okhttp/Request;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/squareup/okhttp/Request;"
        }
    .end annotation

    .line 165
    new-instance v0, Lcom/squareup/okhttp/Request$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Request$Builder;-><init>()V

    invoke-virtual {p0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 170
    invoke-static {p2}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractOkHeaders(Ljava/util/Map;)Lcom/squareup/okhttp/Headers;

    move-result-object p1

    .line 171
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/Request$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Request$Builder;

    .line 173
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object p0

    return-object p0
.end method

.method static createOkResponse(Lcom/squareup/okhttp/Request;Ljava/net/CacheResponse;)Lcom/squareup/okhttp/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 113
    new-instance v0, Lcom/squareup/okhttp/Response$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Response$Builder;-><init>()V

    .line 116
    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    .line 119
    invoke-static {p1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractStatusLine(Ljava/net/CacheResponse;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/okhttp/internal/http/StatusLine;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/internal/http/StatusLine;

    move-result-object p0

    .line 120
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->protocol:Lcom/squareup/okhttp/Protocol;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->protocol(Lcom/squareup/okhttp/Protocol;)Lcom/squareup/okhttp/Response$Builder;

    .line 121
    iget v1, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->code:I

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->code(I)Lcom/squareup/okhttp/Response$Builder;

    .line 122
    iget-object p0, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->message:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Response$Builder;->message(Ljava/lang/String;)Lcom/squareup/okhttp/Response$Builder;

    .line 125
    invoke-static {p1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractOkHeaders(Ljava/net/CacheResponse;)Lcom/squareup/okhttp/Headers;

    move-result-object p0

    .line 126
    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Response$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Response$Builder;

    .line 129
    invoke-virtual {p1}, Ljava/net/CacheResponse;->getBody()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->createOkBody(Lcom/squareup/okhttp/Headers;Ljava/io/InputStream;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p0

    .line 130
    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    .line 133
    instance-of p0, p1, Ljava/net/SecureCacheResponse;

    if-eqz p0, :cond_1

    .line 134
    check-cast p1, Ljava/net/SecureCacheResponse;

    .line 139
    :try_start_0
    invoke-virtual {p1}, Ljava/net/SecureCacheResponse;->getServerCertificateChain()Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 141
    :catch_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    .line 143
    :goto_0
    invoke-virtual {p1}, Ljava/net/SecureCacheResponse;->getLocalCertificateChain()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    .line 145
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 147
    :cond_0
    invoke-virtual {p1}, Ljava/net/SecureCacheResponse;->getCipherSuite()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0, v1}, Lcom/squareup/okhttp/Handshake;->get(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/squareup/okhttp/Handshake;

    move-result-object p0

    .line 149
    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Response$Builder;->handshake(Lcom/squareup/okhttp/Handshake;)Lcom/squareup/okhttp/Response$Builder;

    .line 152
    :cond_1
    invoke-virtual {v0}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object p0

    return-object p0
.end method

.method public static createOkResponse(Ljava/net/URI;Ljava/net/URLConnection;)Lcom/squareup/okhttp/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 61
    move-object v0, p1

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 63
    new-instance v1, Lcom/squareup/okhttp/Response$Builder;

    invoke-direct {v1}, Lcom/squareup/okhttp/Response$Builder;-><init>()V

    .line 68
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p0, v2, v3}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->createOkRequest(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Lcom/squareup/okhttp/Request;

    move-result-object p0

    .line 69
    invoke-virtual {v1, p0}, Lcom/squareup/okhttp/Response$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response$Builder;

    .line 72
    invoke-static {v0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractStatusLine(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/okhttp/internal/http/StatusLine;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/internal/http/StatusLine;

    move-result-object p0

    .line 73
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->protocol:Lcom/squareup/okhttp/Protocol;

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->protocol(Lcom/squareup/okhttp/Protocol;)Lcom/squareup/okhttp/Response$Builder;

    .line 74
    iget v2, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->code:I

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->code(I)Lcom/squareup/okhttp/Response$Builder;

    .line 75
    iget-object p0, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->message:Ljava/lang/String;

    invoke-virtual {v1, p0}, Lcom/squareup/okhttp/Response$Builder;->message(Ljava/lang/String;)Lcom/squareup/okhttp/Response$Builder;

    .line 78
    invoke-static {v0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractOkResponseHeaders(Ljava/net/HttpURLConnection;)Lcom/squareup/okhttp/Headers;

    move-result-object p0

    .line 79
    invoke-virtual {v1, p0}, Lcom/squareup/okhttp/Response$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Response$Builder;

    .line 82
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->createOkBody(Lcom/squareup/okhttp/Headers;Ljava/io/InputStream;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p0

    .line 83
    invoke-virtual {v1, p0}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    .line 86
    instance-of p0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz p0, :cond_0

    .line 87
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 91
    :try_start_0
    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getServerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v3
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    :catch_0
    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object p0

    .line 98
    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getCipherSuite()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->nullSafeImmutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->nullSafeImmutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1, v0, p0}, Lcom/squareup/okhttp/Handshake;->get(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/squareup/okhttp/Handshake;

    move-result-object p0

    .line 101
    invoke-virtual {v1, p0}, Lcom/squareup/okhttp/Response$Builder;->handshake(Lcom/squareup/okhttp/Handshake;)Lcom/squareup/okhttp/Response$Builder;

    .line 104
    :cond_0
    invoke-virtual {v1}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object p0

    return-object p0
.end method

.method static extractJavaHeaders(Lcom/squareup/okhttp/Request;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/okhttp/Request;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 266
    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/squareup/okhttp/internal/http/OkHeaders;->toMultimap(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static extractOkHeaders(Ljava/net/CacheResponse;)Lcom/squareup/okhttp/Headers;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 274
    invoke-virtual {p0}, Ljava/net/CacheResponse;->getHeaders()Ljava/util/Map;

    move-result-object p0

    .line 275
    invoke-static {p0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractOkHeaders(Ljava/util/Map;)Lcom/squareup/okhttp/Headers;

    move-result-object p0

    return-object p0
.end method

.method static extractOkHeaders(Ljava/util/Map;)Lcom/squareup/okhttp/Headers;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/squareup/okhttp/Headers;"
        }
    .end annotation

    .line 293
    new-instance v0, Lcom/squareup/okhttp/Headers$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Headers$Builder;-><init>()V

    .line 294
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 295
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_0

    .line 303
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 304
    invoke-virtual {v0, v2, v3}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    goto :goto_1

    .line 307
    :cond_2
    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object p0

    return-object p0
.end method

.method private static extractOkResponseHeaders(Ljava/net/HttpURLConnection;)Lcom/squareup/okhttp/Headers;
    .locals 0

    .line 283
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object p0

    .line 284
    invoke-static {p0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractOkHeaders(Ljava/util/Map;)Lcom/squareup/okhttp/Headers;

    move-result-object p0

    return-object p0
.end method

.method private static extractStatusLine(Ljava/net/CacheResponse;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 326
    invoke-virtual {p0}, Ljava/net/CacheResponse;->getHeaders()Ljava/util/Map;

    move-result-object p0

    .line 327
    invoke-static {p0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractStatusLine(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static extractStatusLine(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 317
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static extractStatusLine(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 332
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_1

    .line 333
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 336
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static nullSafeImmutableList([Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 683
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/squareup/okhttp/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static throwRequestHeaderAccessException()Ljava/lang/RuntimeException;
    .locals 2

    .line 671
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "ResponseCache cannot access request headers"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static throwRequestModificationException()Ljava/lang/RuntimeException;
    .locals 2

    .line 667
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "ResponseCache cannot modify the request."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static throwRequestSslAccessException()Ljava/lang/RuntimeException;
    .locals 2

    .line 675
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "ResponseCache cannot access SSL internals"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static throwResponseBodyAccessException()Ljava/lang/RuntimeException;
    .locals 2

    .line 679
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "ResponseCache cannot access the response body."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
