.class public final Lcom/squareup/okhttp/internal/huc/CacheAdapter;
.super Ljava/lang/Object;
.source "CacheAdapter.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/InternalCache;


# instance fields
.field private final delegate:Ljava/net/ResponseCache;


# direct methods
.method public constructor <init>(Ljava/net/ResponseCache;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter;->delegate:Ljava/net/ResponseCache;

    return-void
.end method

.method private getJavaCachedResponse(Lcom/squareup/okhttp/Request;)Ljava/net/CacheResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 102
    invoke-static {p1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->extractJavaHeaders(Lcom/squareup/okhttp/Request;)Ljava/util/Map;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter;->delegate:Ljava/net/ResponseCache;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->uri()Ljava/net/URI;

    move-result-object v2

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Ljava/net/ResponseCache;->get(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Ljava/net/CacheResponse;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public get(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/huc/CacheAdapter;->getJavaCachedResponse(Lcom/squareup/okhttp/Request;)Ljava/net/CacheResponse;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 51
    :cond_0
    invoke-static {p1, v0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->createOkResponse(Lcom/squareup/okhttp/Request;Ljava/net/CacheResponse;)Lcom/squareup/okhttp/Response;

    move-result-object p1

    return-object p1
.end method

.method public getDelegate()Ljava/net/ResponseCache;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter;->delegate:Ljava/net/ResponseCache;

    return-object v0
.end method

.method public put(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/CacheRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->request()Lcom/squareup/okhttp/Request;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->uri()Ljava/net/URI;

    move-result-object v0

    .line 56
    invoke-static {p1}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->createJavaUrlConnection(Lcom/squareup/okhttp/Response;)Ljava/net/HttpURLConnection;

    move-result-object p1

    .line 57
    iget-object v1, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter;->delegate:Ljava/net/ResponseCache;

    invoke-virtual {v1, v0, p1}, Ljava/net/ResponseCache;->put(Ljava/net/URI;Ljava/net/URLConnection;)Ljava/net/CacheRequest;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 61
    :cond_0
    new-instance v0, Lcom/squareup/okhttp/internal/huc/CacheAdapter$1;

    invoke-direct {v0, p0, p1}, Lcom/squareup/okhttp/internal/huc/CacheAdapter$1;-><init>(Lcom/squareup/okhttp/internal/huc/CacheAdapter;Ljava/net/CacheRequest;)V

    return-object v0
.end method

.method public remove(Lcom/squareup/okhttp/Request;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public trackConditionalCacheHit()V
    .locals 0

    return-void
.end method

.method public trackResponse(Lcom/squareup/okhttp/internal/http/CacheStrategy;)V
    .locals 0

    return-void
.end method

.method public update(Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/Response;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method
