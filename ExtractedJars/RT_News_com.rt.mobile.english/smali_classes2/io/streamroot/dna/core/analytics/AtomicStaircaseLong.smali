.class public final Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;
.super Ljava/lang/Object;
.source "AnalyticTools.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\t\"\u0004\u0008\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\t\"\u0004\u0008\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\t\"\u0004\u0008\u0014\u0010\u000b\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;",
        "",
        "initValue",
        "",
        "clock",
        "Lio/streamroot/dna/core/utils/Clock;",
        "(JLio/streamroot/dna/core/utils/Clock;)V",
        "lastGetTime",
        "getLastGetTime",
        "()J",
        "setLastGetTime",
        "(J)V",
        "lastTime",
        "getLastTime",
        "setLastTime",
        "latestValue",
        "getLatestValue",
        "setLatestValue",
        "metricSum",
        "getMetricSum",
        "setMetricSum",
        "add",
        "",
        "value",
        "get",
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
.field private final clock:Lio/streamroot/dna/core/utils/Clock;

.field private volatile lastGetTime:J

.field private volatile lastTime:J

.field private volatile latestValue:J

.field private volatile metricSum:J


# direct methods
.method public constructor <init>(JLio/streamroot/dna/core/utils/Clock;)V
    .locals 1
    .param p3    # Lio/streamroot/dna/core/utils/Clock;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->clock:Lio/streamroot/dna/core/utils/Clock;

    .line 81
    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->latestValue:J

    .line 83
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->clock:Lio/streamroot/dna/core/utils/Clock;

    invoke-interface {p1}, Lio/streamroot/dna/core/utils/Clock;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastTime:J

    .line 84
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->clock:Lio/streamroot/dna/core/utils/Clock;

    invoke-interface {p1}, Lio/streamroot/dna/core/utils/Clock;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastGetTime:J

    return-void
.end method

.method public synthetic constructor <init>(JLio/streamroot/dna/core/utils/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 80
    sget-object p3, Lio/streamroot/dna/core/utils/SystemClock;->INSTANCE:Lio/streamroot/dna/core/utils/SystemClock;

    check-cast p3, Lio/streamroot/dna/core/utils/Clock;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;-><init>(JLio/streamroot/dna/core/utils/Clock;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized add(J)V
    .locals 6

    monitor-enter p0

    .line 88
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->clock:Lio/streamroot/dna/core/utils/Clock;

    invoke-interface {v0}, Lio/streamroot/dna/core/utils/Clock;->currentTimeMillis()J

    move-result-wide v0

    .line 89
    iget-wide v2, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastTime:J

    sub-long v4, v0, v2

    .line 91
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->metricSum:J

    iget-wide v2, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->latestValue:J

    mul-long/2addr v2, v4

    add-long v4, v0, v2

    iput-wide v4, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->metricSum:J

    .line 92
    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->latestValue:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 87
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized get()J
    .locals 8

    monitor-enter p0

    .line 97
    :try_start_0
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->latestValue:J

    invoke-virtual {p0, v0, v1}, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->add(J)V

    .line 98
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->clock:Lio/streamroot/dna/core/utils/Clock;

    invoke-interface {v0}, Lio/streamroot/dna/core/utils/Clock;->currentTimeMillis()J

    move-result-wide v0

    .line 100
    iget-wide v2, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastGetTime:J

    sub-long v4, v0, v2

    const-wide/16 v2, 0x0

    cmp-long v6, v4, v2

    if-nez v6, :cond_0

    .line 101
    iget-wide v4, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->metricSum:J

    goto :goto_0

    :cond_0
    iget-wide v6, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->metricSum:J

    div-long v4, v6, v4

    .line 103
    :goto_0
    iput-wide v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastGetTime:J

    .line 104
    iput-wide v2, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->metricSum:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    monitor-exit p0

    return-wide v4

    :catchall_0
    move-exception v0

    .line 96
    monitor-exit p0

    throw v0
.end method

.method public final getLastGetTime()J
    .locals 2

    .line 84
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastGetTime:J

    return-wide v0
.end method

.method public final getLastTime()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastTime:J

    return-wide v0
.end method

.method public final getLatestValue()J
    .locals 2

    .line 81
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->latestValue:J

    return-wide v0
.end method

.method public final getMetricSum()J
    .locals 2

    .line 82
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->metricSum:J

    return-wide v0
.end method

.method public final setLastGetTime(J)V
    .locals 0

    .line 84
    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastGetTime:J

    return-void
.end method

.method public final setLastTime(J)V
    .locals 0

    .line 83
    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->lastTime:J

    return-void
.end method

.method public final setLatestValue(J)V
    .locals 0

    .line 81
    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->latestValue:J

    return-void
.end method

.method public final setMetricSum(J)V
    .locals 0

    .line 82
    iput-wide p1, p0, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->metricSum:J

    return-void
.end method
