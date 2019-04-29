.class public final Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;
.super Ljava/lang/Object;
.source "ManifestProxyEndpoint.kt"

# interfaces
.implements Lio/streamroot/dna/core/proxy/ProxyEndpoint;
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nManifestProxyEndpoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManifestProxyEndpoint.kt\nio/streamroot/dna/core/stream/ManifestProxyEndpoint\n*L\n1#1,81:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;",
        "Lio/streamroot/dna/core/proxy/ProxyEndpoint;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "manifestService",
        "Lio/streamroot/dna/core/stream/ManifestService;",
        "proxyRequestFactory",
        "Lio/streamroot/dna/core/proxy/ProxyRequestFactory;",
        "targetUrlManager",
        "Lio/streamroot/dna/core/proxy/TargetUrlManager;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "streamFormat",
        "Lio/streamroot/dna/core/context/config/StreamFormat;",
        "(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/stream/ManifestService;Lio/streamroot/dna/core/proxy/ProxyRequestFactory;Lio/streamroot/dna/core/proxy/TargetUrlManager;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/context/config/StreamFormat;)V",
        "httpEndpointRecorder",
        "Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;",
        "accept",
        "",
        "url",
        "",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "execute",
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        "request",
        "Lio/streamroot/dna/core/proxy/server/ProxyRequest;",
        "executeHttpRequest",
        "proxyRequest",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final callFactory:Lokhttp3/Call$Factory;

.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

.field private final manifestService:Lio/streamroot/dna/core/stream/ManifestService;

.field private final proxyRequestFactory:Lio/streamroot/dna/core/proxy/ProxyRequestFactory;

.field private final streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

.field private final targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;


# direct methods
.method public constructor <init>(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/stream/ManifestService;Lio/streamroot/dna/core/proxy/ProxyRequestFactory;Lio/streamroot/dna/core/proxy/TargetUrlManager;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/context/config/StreamFormat;)V
    .locals 1
    .param p1    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/stream/ManifestService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/proxy/ProxyRequestFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/proxy/TargetUrlManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lio/streamroot/dna/core/context/config/StreamFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manifestService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUrlManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFormat"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->callFactory:Lokhttp3/Call$Factory;

    iput-object p2, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->manifestService:Lio/streamroot/dna/core/stream/ManifestService;

    iput-object p3, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->proxyRequestFactory:Lio/streamroot/dna/core/proxy/ProxyRequestFactory;

    iput-object p4, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    iput-object p5, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    iput-object p6, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

    .line 27
    new-instance p1, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    invoke-direct {p1}, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    return-void
.end method

.method public static final synthetic access$executeHttpRequest(Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 0
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->executeHttpRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p0

    return-object p0
.end method

.method private final executeHttpRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 10

    .line 41
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->proxyRequestFactory:Lio/streamroot/dna/core/proxy/ProxyRequestFactory;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;->buildManifestRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lokhttp3/Request;

    move-result-object p1

    .line 42
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->callFactory:Lokhttp3/Call$Factory;

    invoke-interface {v0, p1}, Lokhttp3/Call$Factory;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v0

    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v0

    check-cast v0, Ljava/io/Closeable;

    const/4 v1, 0x0

    move-object v2, v1

    check-cast v2, Ljava/lang/Throwable;

    :try_start_0
    move-object v3, v0

    check-cast v3, Lokhttp3/Response;

    const-string v4, "response"

    .line 43
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lokhttp3/Response;->isSuccessful()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 44
    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v4

    .line 45
    iget-object v5, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    const-string v6, "manifestUri"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lio/streamroot/dna/core/proxy/TargetUrlManager;->isMainManifest(Lokhttp3/HttpUrl;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 46
    invoke-virtual {v3}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v6

    if-eq v6, p1, :cond_0

    .line 47
    iget-object p1, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    invoke-virtual {v3}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v4

    invoke-virtual {v4}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v4

    const-string v6, "response.request().url()"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Lio/streamroot/dna/core/proxy/TargetUrlManager;->redirectMainManifestUrl(Lokhttp3/HttpUrl;)V

    .line 48
    invoke-virtual {v3}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v4

    .line 51
    :cond_0
    invoke-virtual {v3}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_3

    if-eqz v5, :cond_2

    .line 54
    iget-object p1, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->manifestService:Lio/streamroot/dna/core/stream/ManifestService;

    const-string v5, "manifestUri"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v4, v1}, Lio/streamroot/dna/core/stream/ManifestService;->loadMainManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 56
    :cond_2
    iget-object p1, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->manifestService:Lio/streamroot/dna/core/stream/ManifestService;

    const-string v5, "manifestUri"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v4, v1}, Lio/streamroot/dna/core/stream/ManifestService;->loadPlaylistManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 61
    :cond_3
    :goto_0
    sget-object p1, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->Companion:Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;

    .line 62
    invoke-virtual {v3}, Lokhttp3/Response;->code()I

    move-result v4

    .line 63
    invoke-static {v3}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->contentType(Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v5

    .line 61
    invoke-virtual {p1, v4, v5, v1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;->newFixedLengthResponse(ILjava/lang/String;Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1

    .line 65
    invoke-static {p1, v3}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->injectHeaders(Lio/streamroot/dna/core/proxy/server/ProxyResponse;Lokhttp3/Response;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1

    goto :goto_2

    .line 67
    :cond_4
    new-instance p1, Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    .line 68
    invoke-virtual {v3}, Lokhttp3/Response;->code()I

    move-result v5

    .line 69
    invoke-static {v3}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->contentType(Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v6

    .line 70
    invoke-virtual {v3}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v1

    :cond_5
    move-object v7, v1

    .line 71
    invoke-virtual {v3}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v8

    goto :goto_1

    :cond_6
    const-wide/16 v8, -0x1

    :goto_1
    move-object v4, p1

    .line 67
    invoke-direct/range {v4 .. v9}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;-><init>(ILjava/lang/String;Ljava/io/InputStream;J)V

    .line 72
    invoke-static {p1, v3}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->injectHeaders(Lio/streamroot/dna/core/proxy/server/ProxyResponse;Lokhttp3/Response;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    :goto_2
    invoke-static {v0, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v2, p1

    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    invoke-static {v0, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public accept(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/context/config/StreamFormat;->isManifestUrl(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 78
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "proxy"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "manifestRequests"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 79
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;->dump(Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public execute(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 2
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    new-instance v1, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;

    invoke-direct {v1, p0, p1}, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;-><init>(Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;Lio/streamroot/dna/core/proxy/server/ProxyRequest;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;->record(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 35
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    .line 36
    invoke-static {p1}, Lio/streamroot/dna/core/utils/ExectionsKt;->wrapProxyException(Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public priority()I
    .locals 1

    .line 19
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method
