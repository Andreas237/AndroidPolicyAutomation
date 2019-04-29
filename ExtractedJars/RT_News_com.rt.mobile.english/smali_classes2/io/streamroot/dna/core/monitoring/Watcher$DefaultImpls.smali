.class public final Lio/streamroot/dna/core/monitoring/Watcher$DefaultImpls;
.super Ljava/lang/Object;
.source "Watcher.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/monitoring/Watcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static appendControlAnalytics(Lio/streamroot/dna/core/monitoring/Watcher;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static appendStatsAnalytics(Lio/streamroot/dna/core/monitoring/Watcher;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendStatsAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static appendSupportAnalytics(Lio/streamroot/dna/core/monitoring/Watcher;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static appendTrafficAnalytics(Lio/streamroot/dna/core/monitoring/Watcher;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static priority(Lio/streamroot/dna/core/monitoring/Watcher;)I
    .locals 0

    check-cast p0, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result p0

    return p0
.end method
