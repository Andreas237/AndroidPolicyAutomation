.class public final Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;
.super Ljava/lang/Object;
.source "ProxyRequestForwarder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;",
        "",
        "cdnAnalyticsReporter",
        "Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "proxyRequestFactory",
        "Lio/streamroot/dna/core/proxy/ProxyRequestFactory;",
        "(Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;Lokhttp3/Call$Factory;Lio/streamroot/dna/core/proxy/ProxyRequestFactory;)V",
        "forward",
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        "request",
        "Lio/streamroot/dna/core/proxy/server/ProxyRequest;",
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

.field private final cdnAnalyticsReporter:Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

.field private final proxyRequestFactory:Lio/streamroot/dna/core/proxy/ProxyRequestFactory;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;Lokhttp3/Call$Factory;Lio/streamroot/dna/core/proxy/ProxyRequestFactory;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/proxy/ProxyRequestFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cdnAnalyticsReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->cdnAnalyticsReporter:Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    iput-object p2, p0, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->callFactory:Lokhttp3/Call$Factory;

    iput-object p3, p0, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->proxyRequestFactory:Lio/streamroot/dna/core/proxy/ProxyRequestFactory;

    return-void
.end method


# virtual methods
.method public final forward(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 10
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->proxyRequestFactory:Lio/streamroot/dna/core/proxy/ProxyRequestFactory;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;->buildRegularRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lokhttp3/Request;

    move-result-object p1

    .line 19
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->callFactory:Lokhttp3/Call$Factory;

    invoke-interface {v0, p1}, Lokhttp3/Call$Factory;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p1

    invoke-interface {p1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    .line 22
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;->cdnAnalyticsReporter:Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    const-string v2, "response"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->contentLength(Lokhttp3/Response;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->addTransfer(J)V

    .line 24
    new-instance v1, Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    .line 25
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v5

    .line 26
    invoke-static {p1}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->contentType(Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v6

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 28
    :goto_1
    invoke-static {p1}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->contentLength(Lokhttp3/Response;)J

    move-result-wide v8

    move-object v4, v1

    .line 24
    invoke-direct/range {v4 .. v9}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;-><init>(ILjava/lang/String;Ljava/io/InputStream;J)V

    .line 29
    invoke-static {v1, p1}, Lio/streamroot/dna/core/utils/ResponseExtensionKt;->injectHeaders(Lio/streamroot/dna/core/proxy/server/ProxyResponse;Lokhttp3/Response;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p1

    return-object p1
.end method
