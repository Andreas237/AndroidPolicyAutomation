.class Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;
.super Ljava/lang/Object;
.source "GzipRequestInterceptor.java"

# interfaces
.implements Lcom/squareup/okhttp/Interceptor;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private forceContentLength(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/RequestBody;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 44
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 45
    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/RequestBody;->writeTo(Lokio/BufferedSink;)V

    .line 46
    new-instance v1, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;

    invoke-direct {v1, p0, p1, v0}, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;-><init>(Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;Lcom/squareup/okhttp/RequestBody;Lokio/Buffer;)V

    return-object v1
.end method

.method private gzip(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/RequestBody;
    .locals 1

    .line 65
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$2;-><init>(Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;Lcom/squareup/okhttp/RequestBody;)V

    return-object v0
.end method


# virtual methods
.method public intercept(Lcom/squareup/okhttp/Interceptor$Chain;)Lcom/squareup/okhttp/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31
    invoke-interface {p1}, Lcom/squareup/okhttp/Interceptor$Chain;->request()Lcom/squareup/okhttp/Request;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/RequestBody;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "Content-Encoding"

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->newBuilder()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v1

    const-string v2, "Content-Encoding"

    const-string v3, "gzip"

    .line 37
    invoke-virtual {v1, v2, v3}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v1

    .line 38
    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/RequestBody;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;->gzip(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/RequestBody;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;->forceContentLength(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/RequestBody;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    .line 39
    instance-of v1, v0, Lcom/squareup/okhttp/Request$Builder;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v0

    goto :goto_0

    :cond_1
    check-cast v0, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {p1, v0}, Lcom/squareup/okhttp/Interceptor$Chain;->proceed(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;

    move-result-object p1

    return-object p1

    .line 33
    :cond_2
    :goto_1
    invoke-interface {p1, v0}, Lcom/squareup/okhttp/Interceptor$Chain;->proceed(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;

    move-result-object p1

    return-object p1
.end method
