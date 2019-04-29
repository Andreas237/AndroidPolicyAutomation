.class public final Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;
.super Ljava/lang/Object;
.source "CdnAnalyticsReporter.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "(Lio/streamroot/dna/core/context/state/StateManager;)V",
        "forwardedCdnConsumed",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "preloadCdnConsumed",
        "totalCdn",
        "",
        "getTotalCdn",
        "()J",
        "totalForwarderCdn",
        "totalPreloadCdn",
        "trafficCdnConsumed",
        "addTransfer",
        "",
        "cdn",
        "appendStatsAnalytics",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "appendTrafficAnalytics",
        "trafficPayload",
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
.field private final forwardedCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

.field private final preloadCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field private final totalForwarderCdn:Ljava/util/concurrent/atomic/AtomicLong;

.field private final totalPreloadCdn:Ljava/util/concurrent/atomic/AtomicLong;

.field private final trafficCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/state/StateManager;)V
    .locals 2
    .param p1    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "stateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    .line 13
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->trafficCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->forwardedCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->preloadCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->totalForwarderCdn:Ljava/util/concurrent/atomic/AtomicLong;

    .line 18
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->totalPreloadCdn:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public final addTransfer(J)V
    .locals 2

    .line 24
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/state/StateManager;->getCurrentState()Lio/streamroot/dna/core/State;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/State;->RUNNING:Lio/streamroot/dna/core/State;

    check-cast v1, Ljava/lang/Enum;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/State;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    .line 25
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->totalPreloadCdn:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->sum(Ljava/util/concurrent/atomic/AtomicLong;J)V

    .line 26
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->preloadCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->sum(Ljava/util/concurrent/atomic/AtomicLong;J)V

    .line 27
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->trafficCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->sum(Ljava/util/concurrent/atomic/AtomicLong;J)V

    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->totalForwarderCdn:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->sum(Ljava/util/concurrent/atomic/AtomicLong;J)V

    .line 30
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->forwardedCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->sum(Ljava/util/concurrent/atomic/AtomicLong;J)V

    .line 31
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->trafficCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->sum(Ljava/util/concurrent/atomic/AtomicLong;J)V

    :goto_0
    return-void
.end method

.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 7
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 36
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "transfers"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "cdnConsumed"

    const-wide/16 v1, 0x0

    .line 37
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-string v0, "cdnConsumedPreload"

    .line 39
    iget-object v5, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->preloadCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v5

    invoke-virtual {p1, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "cdnConsumed"

    .line 40
    iget-object v5, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->forwardedCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v1

    add-long v5, v3, v1

    invoke-virtual {p1, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

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

    .line 12
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 7
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->trafficCdnConsumed:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v3

    const-string v0, "cdn"

    .line 45
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-string v2, "cdn"

    add-long v5, v0, v3

    .line 46
    invoke-virtual {p1, v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-void
.end method

.method public final getTotalCdn()J
    .locals 6

    .line 21
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->totalForwarderCdn:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p0, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->totalPreloadCdn:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    add-long v4, v0, v2

    return-wide v4
.end method

.method public priority()I
    .locals 1

    .line 12
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method
