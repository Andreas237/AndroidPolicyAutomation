.class public final Lio/streamroot/dna/core/analytics/AnalyticsService;
.super Ljava/lang/Object;
.source "AnalyticsService.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
    disposable = false
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/AnalyticsService;",
        "Ljava/lang/AutoCloseable;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "cdnAnalyticsReporter",
        "Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "analyticsHandler",
        "Lio/streamroot/dna/core/analytics/AnalyticsHandler;",
        "(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;Lio/streamroot/dna/core/error/ErrorAggregator;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/analytics/AnalyticsHandler;)V",
        "latestCdn",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "latestDna",
        "latestUpload",
        "supervisor",
        "Lkotlinx/coroutines/Job;",
        "close",
        "",
        "getPublicAnalytics",
        "informationCallback",
        "Lio/streamroot/dna/core/InformationCallback;",
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
.field private analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

.field private final cdnAnalyticsReporter:Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

.field private final context:Lkotlin/coroutines/CoroutineContext;

.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final latestCdn:Ljava/util/concurrent/atomic/AtomicLong;

.field private final latestDna:Ljava/util/concurrent/atomic/AtomicLong;

.field private final latestUpload:Ljava/util/concurrent/atomic/AtomicLong;

.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field private final supervisor:Lkotlinx/coroutines/Job;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;Lio/streamroot/dna/core/error/ErrorAggregator;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/analytics/AnalyticsHandler;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lio/streamroot/dna/core/analytics/AnalyticsHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "stateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cdnAnalyticsReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    iput-object p2, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->cdnAnalyticsReporter:Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    iput-object p3, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    iput-object p4, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->context:Lkotlin/coroutines/CoroutineContext;

    iput-object p5, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 24
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->supervisor:Lkotlinx/coroutines/Job;

    .line 25
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestCdn:Ljava/util/concurrent/atomic/AtomicLong;

    .line 26
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestDna:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestUpload:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public static final synthetic access$getAnalyticsHandler$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/analytics/AnalyticsHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    return-object p0
.end method

.method public static final synthetic access$getCdnAnalyticsReporter$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->cdnAnalyticsReporter:Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    return-object p0
.end method

.method public static final synthetic access$getErrorAggregator$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/error/ErrorAggregator;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-object p0
.end method

.method public static final synthetic access$getLatestCdn$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestCdn:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static final synthetic access$getLatestDna$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestDna:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static final synthetic access$getLatestUpload$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestUpload:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static final synthetic access$getStateManager$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/context/state/StateManager;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    return-object p0
.end method

.method public static final synthetic access$setAnalyticsHandler$p(Lio/streamroot/dna/core/analytics/AnalyticsService;Lio/streamroot/dna/core/analytics/AnalyticsHandler;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/analytics/AnalyticsHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 17
    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 70
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->supervisor:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    const/4 v0, 0x0

    .line 71
    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    iput-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    return-void
.end method

.method public final getPublicAnalytics(Lio/streamroot/dna/core/InformationCallback;)V
    .locals 11
    .param p1    # Lio/streamroot/dna/core/InformationCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "informationCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/state/StateManager;->isDnaRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    if-eqz v0, :cond_0

    .line 31
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->context:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->supervisor:Lkotlinx/coroutines/Job;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsService;Lio/streamroot/dna/core/InformationCallback;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/state/StateManager;->getCurrentState()Lio/streamroot/dna/core/State;

    move-result-object v2

    .line 62
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestCdn:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v3, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->cdnAnalyticsReporter:Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    invoke-virtual {v3}, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->getTotalCdn()J

    move-result-wide v3

    add-long v5, v0, v3

    .line 63
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestDna:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v7

    .line 64
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsService;->latestUpload:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    const/4 v0, 0x0

    move-object v1, p1

    move-wide v3, v5

    move-wide v5, v7

    move-wide v7, v9

    move v9, v0

    .line 60
    invoke-interface/range {v1 .. v9}, Lio/streamroot/dna/core/InformationCallback;->onInformation(Lio/streamroot/dna/core/State;JJJI)V

    :goto_0
    return-void
.end method
