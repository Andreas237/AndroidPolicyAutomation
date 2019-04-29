.class public final Lio/streamroot/dna/core/proxy/server/WebServer;
.super Ljava/lang/Object;
.source "WebServer.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;
.implements Lio/streamroot/dna/core/proxy/server/SessionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/proxy/server/WebServer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebServer.kt\nio/streamroot/dna/core/proxy/server/WebServer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n241#2,2:137\n*E\n*S KotlinDebug\n*F\n+ 1 WebServer.kt\nio/streamroot/dna/core/proxy/server/WebServer\n*L\n101#1,2:137\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0019\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006%"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/server/WebServer;",
        "Ljava/lang/AutoCloseable;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "Lio/streamroot/dna/core/proxy/server/SessionHandler;",
        "proxyRequestForwarder",
        "Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;",
        "proxyEndpoints",
        "",
        "Lio/streamroot/dna/core/proxy/ProxyEndpoint;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "proxyPort",
        "",
        "(Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;I)V",
        "failedCount",
        "Lio/streamroot/dna/core/analytics/Counter;",
        "serverSocketJob",
        "Lkotlinx/coroutines/Job;",
        "sessionCounter",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "supervisor",
        "totalCount",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "close",
        "fallbackHttp",
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        "request",
        "Lio/streamroot/dna/core/proxy/server/ProxyRequest;",
        "handleSession",
        "acceptSocket",
        "Ljava/net/Socket;",
        "(Ljava/net/Socket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "processRequest",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/proxy/server/WebServer$Companion;

.field private static final SOCKET_READ_TIMEOUT:I = 0x493e0


# instance fields
.field private final failedCount:Lio/streamroot/dna/core/analytics/Counter;

.field private final proxyEndpoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/streamroot/dna/core/proxy/ProxyEndpoint;",
            ">;"
        }
    .end annotation
.end field

.field private final proxyRequestForwarder:Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;

.field private final serverSocketJob:Lkotlinx/coroutines/Job;

.field private final sessionCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final supervisor:Lkotlinx/coroutines/Job;

.field private final totalCount:Lio/streamroot/dna/core/analytics/Counter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/proxy/server/WebServer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/proxy/server/WebServer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/proxy/server/WebServer;->Companion:Lio/streamroot/dna/core/proxy/server/WebServer$Companion;

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;I)V
    .locals 7
    .param p1    # Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;",
            "Ljava/util/List<",
            "+",
            "Lio/streamroot/dna/core/proxy/ProxyEndpoint;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "I)V"
        }
    .end annotation

    const-string v0, "proxyRequestForwarder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyEndpoints"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->proxyRequestForwarder:Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;

    iput-object p2, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->proxyEndpoints:Ljava/util/List;

    .line 39
    new-instance p1, Lio/streamroot/dna/core/analytics/Counter;

    const-string p2, "totalCount"

    invoke-direct {p1, p2}, Lio/streamroot/dna/core/analytics/Counter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->totalCount:Lio/streamroot/dna/core/analytics/Counter;

    .line 40
    new-instance p1, Lio/streamroot/dna/core/analytics/Counter;

    const-string p2, "failedCount"

    invoke-direct {p1, p2}, Lio/streamroot/dna/core/analytics/Counter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->failedCount:Lio/streamroot/dna/core/analytics/Counter;

    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->sessionCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p1, 0x0

    .line 43
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->supervisor:Lkotlinx/coroutines/Job;

    .line 46
    new-instance v0, Ljava/net/ServerSocket;

    invoke-direct {v0, p4}, Ljava/net/ServerSocket;-><init>(I)V

    .line 47
    invoke-virtual {v0, p2}, Ljava/net/ServerSocket;->setReuseAddress(Z)V

    .line 49
    sget-object p2, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, p2

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p2

    check-cast p2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p3, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance p2, Lio/streamroot/dna/core/proxy/server/WebServer$1;

    invoke-direct {p2, p0, v0, p1}, Lio/streamroot/dna/core/proxy/server/WebServer$1;-><init>(Lio/streamroot/dna/core/proxy/server/WebServer;Ljava/net/ServerSocket;Lkotlin/coroutines/Continuation;)V

    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->serverSocketJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final fallbackHttp(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 1

    .line 107
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->totalCount:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0}, Lio/streamroot/dna/core/analytics/Counter;->inc()V

    .line 108
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->proxyRequestForwarder:Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->forward(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 110
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->failedCount:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0}, Lio/streamroot/dna/core/analytics/Counter;->inc()V

    .line 111
    invoke-static {p1}, Lio/streamroot/dna/core/utils/ExectionsKt;->wrapProxyException(Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method


# virtual methods
.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
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

    .line 116
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "proxy"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "fallbackRequests"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 117
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->failedCount:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/analytics/Counter;->dump(Lorg/json/JSONObject;)V

    .line 118
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->totalCount:Lio/streamroot/dna/core/analytics/Counter;

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

    .line 33
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

    .line 33
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public close()V
    .locals 1

    .line 122
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->serverSocketJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 123
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->supervisor:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    return-void
.end method

.method final synthetic handleSession(Ljava/net/Socket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/net/Socket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/Socket;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 65
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->sessionCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    .line 66
    sget-object v1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    invoke-interface {p2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->supervisor:Lkotlinx/coroutines/Job;

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p2, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    new-instance p2, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;

    const/4 v1, 0x0

    invoke-direct {p2, p0, p1, v0, v1}, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;-><init>(Lio/streamroot/dna/core/proxy/server/WebServer;Ljava/net/Socket;ILkotlin/coroutines/Continuation;)V

    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 95
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public priority()I
    .locals 1

    .line 33
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

.method public processRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 4
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getMethod()Lio/streamroot/dna/core/proxy/server/Method;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/proxy/server/Method;->GET:Lio/streamroot/dna/core/proxy/server/Method;

    if-eq v0, v1, :cond_0

    .line 99
    new-instance p1, Lio/streamroot/dna/core/proxy/server/ResponseException;

    const/16 v0, 0x190

    const-string v1, "Only GET Request are allowed"

    invoke-direct {p1, v0, v1}, Lio/streamroot/dna/core/proxy/server/ResponseException;-><init>(ILjava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 101
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer;->proxyEndpoints:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 137
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/streamroot/dna/core/proxy/ProxyEndpoint;

    .line 101
    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getUri()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lio/streamroot/dna/core/proxy/ProxyEndpoint;->accept(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lio/streamroot/dna/core/proxy/ProxyEndpoint;

    if-eqz v1, :cond_3

    .line 102
    invoke-interface {v1, p1}, Lio/streamroot/dna/core/proxy/ProxyEndpoint;->execute(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/proxy/server/WebServer;->fallbackHttp(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object v0

    :goto_1
    return-object v0
.end method
