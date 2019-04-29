.class public final Lio/streamroot/dna/core/proxy/ProxyRequestFactory;
.super Ljava/lang/Object;
.source "ProxyRequestFactory.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProxyRequestFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProxyRequestFactory.kt\nio/streamroot/dna/core/proxy/ProxyRequestFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1561#2,2:48\n*E\n*S KotlinDebug\n*F\n+ 1 ProxyRequestFactory.kt\nio/streamroot/dna/core/proxy/ProxyRequestFactory\n*L\n34#1,2:48\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/ProxyRequestFactory;",
        "",
        "targetUrlManager",
        "Lio/streamroot/dna/core/proxy/TargetUrlManager;",
        "(Lio/streamroot/dna/core/proxy/TargetUrlManager;)V",
        "buildManifestRequest",
        "Lokhttp3/Request;",
        "request",
        "Lio/streamroot/dna/core/proxy/server/ProxyRequest;",
        "buildRegularRequest",
        "mapHeaders",
        "Lokhttp3/Headers;",
        "originHeaders",
        "",
        "",
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
.field private final targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/proxy/TargetUrlManager;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/proxy/TargetUrlManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "targetUrlManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    return-void
.end method

.method private final mapHeaders(Ljava/util/Map;)Lokhttp3/Headers;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lokhttp3/Headers;"
        }
    .end annotation

    .line 32
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    .line 34
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 48
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 35
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 37
    :try_start_0
    invoke-static {v2}, Lio/streamroot/dna/core/utils/HttpHeaderValidator;->isNotHost(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, Lio/streamroot/dna/core/utils/HttpHeaderValidator;->isNotAcceptEncoding(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 38
    invoke-virtual {v0, v2, v3}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 41
    :catch_0
    sget-object v4, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    const-string v5, "Header %s value invalid %s"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v2, 0x1

    aput-object v3, v6, v2

    invoke-virtual {v4, v5, v6}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object p1

    const-string v0, "builder.build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final buildManifestRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lokhttp3/Request;
    .locals 3
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getQueryParameterString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/streamroot/dna/core/proxy/TargetUrlManager;->forgeManifestTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    .line 23
    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getHeaders()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;->mapHeaders(Ljava/util/Map;)Lokhttp3/Headers;

    move-result-object p1

    .line 24
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 25
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    move-result-object v1

    .line 26
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 27
    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    const-string v0, "Request.Builder()\n      \u2026ers)\n            .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final buildRegularRequest(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lokhttp3/Request;
    .locals 3
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;->targetUrlManager:Lio/streamroot/dna/core/proxy/TargetUrlManager;

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getQueryParameterString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/streamroot/dna/core/proxy/TargetUrlManager;->forgeTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lio/streamroot/dna/core/proxy/server/ProxyRequest;->getHeaders()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;->mapHeaders(Ljava/util/Map;)Lokhttp3/Headers;

    move-result-object p1

    .line 14
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 15
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    const-string v0, "Request.Builder()\n      \u2026ers)\n            .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
