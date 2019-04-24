.class public Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;
.super Ljava/lang/Object;
.source "TrackingHeaderInterceptor.java"

# interfaces
.implements Lcom/squareup/okhttp/Interceptor;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;->headers:Ljava/util/Map;

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;->headers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public intercept(Lcom/squareup/okhttp/Interceptor$Chain;)Lcom/squareup/okhttp/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22
    invoke-interface {p1}, Lcom/squareup/okhttp/Interceptor$Chain;->request()Lcom/squareup/okhttp/Request;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->newBuilder()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;->headers:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/tracking/network/-$$Lambda$i9kiJtG2CQHycz0GKwHVW1yBWNg;

    invoke-direct {v2, v0}, Lcom/ibotta/android/tracking/network/-$$Lambda$i9kiJtG2CQHycz0GKwHVW1yBWNg;-><init>(Lcom/squareup/okhttp/Request$Builder;)V

    invoke-static {v1, v2}, Ljava9/util/Maps;->forEach(Ljava/util/Map;Ljava9/util/function/BiConsumer;)V

    .line 26
    instance-of v1, v0, Lcom/squareup/okhttp/Request$Builder;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Lcom/squareup/okhttp/Interceptor$Chain;->proceed(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;

    move-result-object p1

    return-object p1
.end method
