.class public final Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;
.super Ljava/lang/Object;
.source "SegmentProxyEndpoint.kt"

# interfaces
.implements Lio/streamroot/dna/core/proxy/ProxyEndpoint;
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;",
        "Lio/streamroot/dna/core/proxy/ProxyEndpoint;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "segmentHandler",
        "Lio/streamroot/dna/core/binary/SegmentHandler;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "proxyRequestForwarder",
        "Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;",
        "targetUrlManager",
        "Lio/streamroot/dna/core/proxy/TargetUrlManager;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "streamFormat",
        "Lio/streamroot/dna/core/context/config/StreamFormat;",
        "(Lio/streamroot/dna/core/binary/SegmentHandler;Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;Lio/streamroot/dna/core/proxy/TargetUrlManager;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/context/config/StreamFormat;)V",
        "forwardedCounter",
        "Lio/streamroot/dna/core/analytics/Counter;",
        "httpEndpointRecorder",
        "Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;",
        "peerAgentTimeoutCounter",
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
.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final forwardedCounter:Lio/streamroot/dna/core/analytics/Counter;

.field private final httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

.field private final peerAgentTimeoutCounter:Lio/streamroot/dna/core/analytics/Counter;

.field private final proxyRequestForwarder:Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;

.field private final segmentHandler:Lio/streamroot/dna/core/binary/SegmentHandler;

.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field private final streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

.field private final targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/binary/SegmentHandler;Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;Lio/streamroot/dna/core/proxy/TargetUrlManager;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/context/config/StreamFormat;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/binary/SegmentHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;
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

    const-string v0, "segmentHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyRequestForwarder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUrlManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFormat"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->segmentHandler:Lio/streamroot/dna/core/binary/SegmentHandler;

    iput-object p2, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    iput-object p3, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->proxyRequestForwarder:Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;

    iput-object p4, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    iput-object p5, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    iput-object p6, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

    .line 28
    new-instance p1, Lio/streamroot/dna/core/analytics/Counter;

    const-string p2, "forwardedCount"

    invoke-direct {p1, p2}, Lio/streamroot/dna/core/analytics/Counter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->forwardedCounter:Lio/streamroot/dna/core/analytics/Counter;

    .line 29
    new-instance p1, Lio/streamroot/dna/core/analytics/Counter;

    const-string p2, "peerAgentTimeoutCount"

    invoke-direct {p1, p2}, Lio/streamroot/dna/core/analytics/Counter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->peerAgentTimeoutCounter:Lio/streamroot/dna/core/analytics/Counter;

    .line 30
    new-instance p1, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    invoke-direct {p1}, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    return-void
.end method

.method public static final synthetic access$executeHttpRequest(Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 0
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->executeHttpRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p0

    return-object p0
.end method

.method private final executeHttpRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 5

    .line 45
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/state/StateManager;->isDnaEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getQueryParameterString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/streamroot/dna/core/proxy/TargetUrlManager;->forgeTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    .line 47
    iget-object v1, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->segmentHandler:Lio/streamroot/dna/core/binary/SegmentHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lio/streamroot/dna/core/binary/SegmentHandler;->getSegment(Lokhttp3/HttpUrl;Ljava/util/Map;)Lio/streamroot/dna/core/binary/SegmentResponse;

    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lio/streamroot/dna/core/binary/SegmentResponse;->getBinaryData()Lio/streamroot/dna/core/binary/store/BinaryData;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 50
    new-instance v0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    const/16 v2, 0xc8

    const-string v3, "application/octet-stream"

    invoke-direct {v0, v2, v3, v1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;-><init>(ILjava/lang/String;Lio/streamroot/dna/core/binary/store/BinaryData;)V

    return-object v0

    .line 55
    :cond_0
    iget-object v1, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->peerAgentTimeoutCounter:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0}, Lio/streamroot/dna/core/binary/SegmentResponse;->getTimeout()Z

    move-result v0

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/analytics/Counter;->incIf(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 58
    iget-object v1, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    .line 61
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->forwardedCounter:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0}, Lio/streamroot/dna/core/analytics/Counter;->inc()V

    .line 62
    sget-object v0, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    const-string v1, "[REQUEST] Forwarding segment request: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getUri()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lio/streamroot/dna/core/log/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->proxyRequestForwarder:Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->forward(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1

    return-object p1
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

    .line 32
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/context/config/StreamFormat;->isSegmentUrl(Ljava/lang/String;)Z

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

    .line 20
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

    .line 67
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "proxy"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "segmentRequests"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 68
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;->dump(Lorg/json/JSONObject;)V

    .line 69
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->peerAgentTimeoutCounter:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/analytics/Counter;->dump(Lorg/json/JSONObject;)V

    .line 70
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->forwardedCounter:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/analytics/Counter;->dump(Lorg/json/JSONObject;)V

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

    .line 20
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

    .line 20
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

    .line 36
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->httpEndpointRecorder:Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;

    new-instance v1, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint$execute$1;

    invoke-direct {v1, p0, p1}, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint$execute$1;-><init>(Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;Lio/streamroot/dna/core/proxy/server/ProxyRequest;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/analytics/HttpEndpointRecorder;->record(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 38
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    .line 39
    invoke-static {p1}, Lio/streamroot/dna/core/utils/ExectionsKt;->wrapProxyException(Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public priority()I
    .locals 1

    .line 20
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method
