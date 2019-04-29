.class public final Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;
.super Ljava/lang/Object;
.source "BandwidthMeter.kt"

# interfaces
.implements Lio/streamroot/dna/core/http/bandwidth/TransferListener;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;",
        "Lio/streamroot/dna/core/http/bandwidth/TransferListener;",
        "Ljava/lang/AutoCloseable;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "bandwidthListener",
        "Lio/streamroot/dna/core/BandwidthListener;",
        "dnaCoroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "dispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "(Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/BandwidthListener;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;)V",
        "slidingPercentile",
        "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;",
        "supervisor",
        "Lkotlinx/coroutines/Job;",
        "totalBytesTransferred",
        "",
        "totalElapsedTimeMs",
        "close",
        "",
        "notifyBandwidthSample",
        "estimatedBandwidth",
        "onTransferEnd",
        "bytesTransferred",
        "durationMs",
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
.field private static final BYTES_TRANSFERRED_FOR_ESTIMATE:I = 0x80000

.field public static final Companion:Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter$Companion;

.field private static final ELAPSED_MILLIS_FOR_ESTIMATE:I = 0x7d0

.field private static final NO_ESTIMATE:J = -0x1L


# instance fields
.field private final bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;

.field private final dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

.field private final dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final slidingPercentile:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;

.field private final supervisor:Lkotlinx/coroutines/Job;

.field private totalBytesTransferred:J

.field private totalElapsedTimeMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->Companion:Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter$Companion;

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/BandwidthListener;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/BandwidthListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/CoroutineDispatcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorAggregator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bandwidthListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dnaCoroutineContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    iput-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;

    iput-object p3, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p4, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 19
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->supervisor:Lkotlinx/coroutines/Job;

    .line 20
    new-instance p1, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;

    invoke-direct {p1}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->slidingPercentile:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;

    return-void
.end method

.method public synthetic constructor <init>(Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/BandwidthListener;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 17
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p4

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;-><init>(Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/BandwidthListener;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;)V

    return-void
.end method

.method public static final synthetic access$getBandwidthListener$p(Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;)Lio/streamroot/dna/core/BandwidthListener;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object p0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;

    return-object p0
.end method

.method private final notifyBandwidthSample(J)V
    .locals 7

    .line 50
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->supervisor:Lkotlinx/coroutines/Job;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    iget-object v2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance v0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter$notifyBandwidthSample$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, p2, v3}, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter$notifyBandwidthSample$1;-><init>(Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;JLkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 46
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->supervisor:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    return-void
.end method

.method public declared-synchronized onTransferEnd(JJ)V
    .locals 4

    monitor-enter p0

    .line 27
    :try_start_0
    iget-wide v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->totalBytesTransferred:J

    add-long v2, v0, p1

    iput-wide v2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->totalBytesTransferred:J

    .line 28
    iget-wide v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->totalElapsedTimeMs:J

    add-long v2, v0, p3

    iput-wide v2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->totalElapsedTimeMs:J

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-lez v2, :cond_2

    const/16 v0, 0x1f40

    int-to-long v0, v0

    mul-long/2addr v0, p1

    long-to-float v0, v0

    long-to-float p3, p3

    div-float/2addr v0, p3

    mul-long/2addr p1, p1

    long-to-int p1, p1

    .line 33
    iget-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->slidingPercentile:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;

    invoke-virtual {p2, p1, v0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->addSample(IF)V

    .line 35
    iget-wide p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->totalElapsedTimeMs:J

    const/16 p3, 0x7d0

    int-to-long p3, p3

    cmp-long v0, p1, p3

    if-gez v0, :cond_0

    iget-wide p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->totalBytesTransferred:J

    const/high16 p3, 0x80000

    int-to-long p3, p3

    cmp-long v0, p1, p3

    if-ltz v0, :cond_2

    .line 36
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->slidingPercentile:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;

    const/high16 p2, 0x3f000000    # 0.5f

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->getPercentile(F)F

    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_1

    const-wide/16 p1, -0x1

    goto :goto_0

    :cond_1
    float-to-long p1, p1

    :goto_0
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->notifyBandwidthSample(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 41
    :try_start_1
    iget-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    .line 25
    :goto_2
    monitor-exit p0

    throw p1
.end method
