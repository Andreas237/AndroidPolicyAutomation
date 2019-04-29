.class public final Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;
.super Ljava/lang/Object;
.source "BandwidthNetworkInterceptor.kt"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;",
        "Lokhttp3/Interceptor;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "transferListener",
        "Lio/streamroot/dna/core/http/bandwidth/TransferListener;",
        "streamFormat",
        "Lio/streamroot/dna/core/context/config/StreamFormat;",
        "(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/http/bandwidth/TransferListener;Lio/streamroot/dna/core/context/config/StreamFormat;)V",
        "intercept",
        "Lokhttp3/Response;",
        "chain",
        "Lokhttp3/Interceptor$Chain;",
        "TransferNotifierResponseBody",
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
.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field private final streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

.field private final transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/http/bandwidth/TransferListener;Lio/streamroot/dna/core/context/config/StreamFormat;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/http/bandwidth/TransferListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/context/config/StreamFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "stateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transferListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamFormat"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    iput-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;->transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    iput-object p3, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;->streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 6
    .param p1    # Lokhttp3/Interceptor$Chain;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 21
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v2

    .line 22
    invoke-interface {p1, v2}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    .line 24
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 26
    iget-object v4, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {v4}, Lio/streamroot/dna/core/context/state/StateManager;->isInError()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 27
    iget-object v4, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;->streamFormat:Lio/streamroot/dna/core/context/config/StreamFormat;

    invoke-virtual {v2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    const-string v5, "request.url()"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lio/streamroot/dna/core/context/config/StreamFormat;->isSegmentUrl(Lokhttp3/HttpUrl;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 29
    invoke-virtual {p1}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v2

    .line 30
    new-instance v4, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;

    iget-object v5, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;->transferListener:Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    invoke-direct {v4, v3, v5, v0, v1}, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;-><init>(Lokhttp3/ResponseBody;Lio/streamroot/dna/core/http/bandwidth/TransferListener;J)V

    check-cast v4, Lokhttp3/ResponseBody;

    invoke-virtual {v2, v4}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    const-string v1, "response\n               \u2026                 .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 34
    sget-object v1, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/Throwable;)V

    :cond_0
    const-string v0, "response"

    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
