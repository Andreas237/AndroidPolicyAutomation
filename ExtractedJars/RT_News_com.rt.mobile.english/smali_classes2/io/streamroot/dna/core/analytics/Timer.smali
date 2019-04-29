.class public final Lio/streamroot/dna/core/analytics/Timer;
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
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/Timer;",
        "",
        "clock",
        "Lio/streamroot/dna/core/utils/Clock;",
        "(Lio/streamroot/dna/core/utils/Clock;)V",
        "lastTime",
        "",
        "elapseMillis",
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

.field private volatile lastTime:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/streamroot/dna/core/analytics/Timer;-><init>(Lio/streamroot/dna/core/utils/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/utils/Clock;)V
    .locals 2
    .param p1    # Lio/streamroot/dna/core/utils/Clock;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/Timer;->clock:Lio/streamroot/dna/core/utils/Clock;

    .line 70
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/Timer;->clock:Lio/streamroot/dna/core/utils/Clock;

    invoke-interface {p1}, Lio/streamroot/dna/core/utils/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/streamroot/dna/core/analytics/Timer;->lastTime:J

    return-void
.end method

.method public synthetic constructor <init>(Lio/streamroot/dna/core/utils/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 69
    sget-object p1, Lio/streamroot/dna/core/utils/SystemClock;->INSTANCE:Lio/streamroot/dna/core/utils/SystemClock;

    check-cast p1, Lio/streamroot/dna/core/utils/Clock;

    :cond_0
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/analytics/Timer;-><init>(Lio/streamroot/dna/core/utils/Clock;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized elapseMillis()J
    .locals 6

    monitor-enter p0

    .line 74
    :try_start_0
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/Timer;->lastTime:J

    .line 75
    iget-object v2, p0, Lio/streamroot/dna/core/analytics/Timer;->clock:Lio/streamroot/dna/core/utils/Clock;

    invoke-interface {v2}, Lio/streamroot/dna/core/utils/Clock;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lio/streamroot/dna/core/analytics/Timer;->lastTime:J

    .line 76
    iget-wide v2, p0, Lio/streamroot/dna/core/analytics/Timer;->lastTime:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long v4, v2, v0

    monitor-exit p0

    return-wide v4

    :catchall_0
    move-exception v0

    .line 73
    monitor-exit p0

    throw v0
.end method
