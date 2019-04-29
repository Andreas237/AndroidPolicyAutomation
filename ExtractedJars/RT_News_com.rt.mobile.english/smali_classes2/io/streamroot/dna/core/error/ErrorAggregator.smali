.class public final Lio/streamroot/dna/core/error/ErrorAggregator;
.super Ljava/lang/Object;
.source "ErrorAggregator.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "()V",
        "errorFunnel",
        "Lio/streamroot/dna/core/error/ErrorFunnel;",
        "getErrorFunnel$dna_core_release",
        "()Lio/streamroot/dna/core/error/ErrorFunnel;",
        "setErrorFunnel$dna_core_release",
        "(Lio/streamroot/dna/core/error/ErrorFunnel;)V",
        "jsErrorCount",
        "Lio/streamroot/dna/core/analytics/Counter;",
        "runtimeErrorCount",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "error",
        "throwable",
        "",
        "jsError",
        "message",
        "",
        "wtf",
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
.field private errorFunnel:Lio/streamroot/dna/core/error/ErrorFunnel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final jsErrorCount:Lio/streamroot/dna/core/analytics/Counter;

.field private final runtimeErrorCount:Lio/streamroot/dna/core/analytics/Counter;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Lio/streamroot/dna/core/error/DefaultErrorFunnel;

    invoke-direct {v0}, Lio/streamroot/dna/core/error/DefaultErrorFunnel;-><init>()V

    check-cast v0, Lio/streamroot/dna/core/error/ErrorFunnel;

    iput-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->errorFunnel:Lio/streamroot/dna/core/error/ErrorFunnel;

    .line 11
    new-instance v0, Lio/streamroot/dna/core/analytics/Counter;

    const-string v1, "jsErrorCount"

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/analytics/Counter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->jsErrorCount:Lio/streamroot/dna/core/analytics/Counter;

    .line 12
    new-instance v0, Lio/streamroot/dna/core/analytics/Counter;

    const-string v1, "runtimeErrorCount"

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/analytics/Counter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->runtimeErrorCount:Lio/streamroot/dna/core/analytics/Counter;

    return-void
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

    .line 9
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

    const/4 v0, 0x2

    .line 32
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "exceptions"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 33
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->jsErrorCount:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/analytics/Counter;->dump(Lorg/json/JSONObject;)V

    .line 34
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->runtimeErrorCount:Lio/streamroot/dna/core/analytics/Counter;

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

    .line 9
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

    .line 9
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final error(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->runtimeErrorCount:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0}, Lio/streamroot/dna/core/analytics/Counter;->inc()V

    .line 21
    sget-object v0, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1, v2}, Lio/streamroot/dna/core/log/Logger;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->errorFunnel:Lio/streamroot/dna/core/error/ErrorFunnel;

    invoke-interface {v0, p1}, Lio/streamroot/dna/core/error/ErrorFunnel;->sendError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final getErrorFunnel$dna_core_release()Lio/streamroot/dna/core/error/ErrorFunnel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->errorFunnel:Lio/streamroot/dna/core/error/ErrorFunnel;

    return-object v0
.end method

.method public final jsError(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->jsErrorCount:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0}, Lio/streamroot/dna/core/analytics/Counter;->inc()V

    .line 16
    sget-object v0, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[JS] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public priority()I
    .locals 1

    .line 9
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

.method public final setErrorFunnel$dna_core_release(Lio/streamroot/dna/core/error/ErrorFunnel;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/error/ErrorFunnel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iput-object p1, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->errorFunnel:Lio/streamroot/dna/core/error/ErrorFunnel;

    return-void
.end method

.method public final wtf(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->runtimeErrorCount:Lio/streamroot/dna/core/analytics/Counter;

    invoke-virtual {v0}, Lio/streamroot/dna/core/analytics/Counter;->inc()V

    .line 27
    sget-object v0, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1, v2}, Lio/streamroot/dna/core/log/Logger;->wtf(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorAggregator;->errorFunnel:Lio/streamroot/dna/core/error/ErrorFunnel;

    invoke-interface {v0, p1}, Lio/streamroot/dna/core/error/ErrorFunnel;->sendWtf(Ljava/lang/Throwable;)V

    return-void
.end method
