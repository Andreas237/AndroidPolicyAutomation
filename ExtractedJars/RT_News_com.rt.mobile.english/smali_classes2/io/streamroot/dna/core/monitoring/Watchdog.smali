.class public final Lio/streamroot/dna/core/monitoring/Watchdog;
.super Ljava/lang/Object;
.source "Watchdog.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;
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
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0008\u0010\u0017\u001a\u00020\u0015H\u0016R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/streamroot/dna/core/monitoring/Watchdog;",
        "Ljava/lang/AutoCloseable;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "adaptiveResourceHandler",
        "Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;",
        "watchers",
        "",
        "Lio/streamroot/dna/core/monitoring/Watcher;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "refreshDelayInMs",
        "",
        "(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;[Lio/streamroot/dna/core/monitoring/Watcher;Lkotlin/coroutines/CoroutineContext;J)V",
        "threatLevelCountReference",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lorg/json/JSONObject;",
        "watchdogJob",
        "Lkotlinx/coroutines/Job;",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "close",
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
.field private threatLevelCountReference:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private watchdogJob:Lkotlinx/coroutines/Job;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;[Lio/streamroot/dna/core/monitoring/Watcher;Lkotlin/coroutines/CoroutineContext;J)V
    .locals 12
    .param p1    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [Lio/streamroot/dna/core/monitoring/Watcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object v8, p0

    move-object/from16 v0, p4

    const-string v1, "stateManager"

    move-object v6, p1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "adaptiveResourceHandler"

    move-object v5, p2

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "watchers"

    move-object v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v8, Lio/streamroot/dna/core/monitoring/Watchdog;->threatLevelCountReference:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    sget-object v1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v9, v1

    check-cast v9, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v10

    new-instance v11, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;

    const/4 v7, 0x0

    move-object v0, v11

    move-object v1, v8

    move-wide/from16 v2, p5

    invoke-direct/range {v0 .. v7}, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;-><init>(Lio/streamroot/dna/core/monitoring/Watchdog;J[Lio/streamroot/dna/core/monitoring/Watcher;Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;Lio/streamroot/dna/core/context/state/StateManager;Lkotlin/coroutines/Continuation;)V

    move-object v5, v11

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x0

    const/4 v6, 0x2

    move-object v2, v9

    move-object v3, v10

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    iput-object v0, v8, Lio/streamroot/dna/core/monitoring/Watchdog;->watchdogJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getThreatLevelCountReference$p(Lio/streamroot/dna/core/monitoring/Watchdog;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object p0, p0, Lio/streamroot/dna/core/monitoring/Watchdog;->threatLevelCountReference:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic access$setThreatLevelCountReference$p(Lio/streamroot/dna/core/monitoring/Watchdog;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/atomic/AtomicReference;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 20
    iput-object p1, p0, Lio/streamroot/dna/core/monitoring/Watchdog;->threatLevelCountReference:Ljava/util/concurrent/atomic/AtomicReference;

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

    const/4 v0, 0x2

    .line 54
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "watchdog"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "threatLevels"

    .line 55
    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/Watchdog;->threatLevelCountReference:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

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

.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    .line 60
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/monitoring/Watchdog;->watchdogJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 59
    monitor-exit p0

    throw v0
.end method

.method public priority()I
    .locals 1

    .line 20
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method
