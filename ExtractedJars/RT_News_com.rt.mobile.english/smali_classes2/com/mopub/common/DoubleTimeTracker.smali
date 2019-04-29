.class public Lcom/mopub/common/DoubleTimeTracker;
.super Ljava/lang/Object;
.source "DoubleTimeTracker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/DoubleTimeTracker$SystemClockClock;,
        Lcom/mopub/common/DoubleTimeTracker$State;,
        Lcom/mopub/common/DoubleTimeTracker$Clock;
    }
.end annotation


# instance fields
.field private interval:J

.field private final mClock:Lcom/mopub/common/DoubleTimeTracker$Clock;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private startedTimestamp:J

.field private volatile state:Lcom/mopub/common/DoubleTimeTracker$State;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    new-instance v0, Lcom/mopub/common/DoubleTimeTracker$SystemClockClock;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mopub/common/DoubleTimeTracker$SystemClockClock;-><init>(Lcom/mopub/common/DoubleTimeTracker$1;)V

    invoke-direct {p0, v0}, Lcom/mopub/common/DoubleTimeTracker;-><init>(Lcom/mopub/common/DoubleTimeTracker$Clock;)V

    return-void
.end method

.method public constructor <init>(Lcom/mopub/common/DoubleTimeTracker$Clock;)V
    .locals 0
    .param p1    # Lcom/mopub/common/DoubleTimeTracker$Clock;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/mopub/common/DoubleTimeTracker;->mClock:Lcom/mopub/common/DoubleTimeTracker$Clock;

    .line 34
    sget-object p1, Lcom/mopub/common/DoubleTimeTracker$State;->PAUSED:Lcom/mopub/common/DoubleTimeTracker$State;

    iput-object p1, p0, Lcom/mopub/common/DoubleTimeTracker;->state:Lcom/mopub/common/DoubleTimeTracker$State;

    return-void
.end method

.method private declared-synchronized computeIntervalDiff()J
    .locals 6

    monitor-enter p0

    .line 65
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/DoubleTimeTracker;->state:Lcom/mopub/common/DoubleTimeTracker$State;

    sget-object v1, Lcom/mopub/common/DoubleTimeTracker$State;->PAUSED:Lcom/mopub/common/DoubleTimeTracker$State;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    const-wide/16 v0, 0x0

    .line 66
    monitor-exit p0

    return-wide v0

    .line 69
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/mopub/common/DoubleTimeTracker;->mClock:Lcom/mopub/common/DoubleTimeTracker$Clock;

    invoke-interface {v0}, Lcom/mopub/common/DoubleTimeTracker$Clock;->elapsedRealTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/mopub/common/DoubleTimeTracker;->startedTimestamp:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long v4, v0, v2

    monitor-exit p0

    return-wide v4

    :catchall_0
    move-exception v0

    .line 64
    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized getInterval()D
    .locals 6

    monitor-enter p0

    .line 61
    :try_start_0
    iget-wide v0, p0, Lcom/mopub/common/DoubleTimeTracker;->interval:J

    invoke-direct {p0}, Lcom/mopub/common/DoubleTimeTracker;->computeIntervalDiff()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long v4, v0, v2

    long-to-double v0, v4

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized pause()V
    .locals 6

    monitor-enter p0

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/DoubleTimeTracker;->state:Lcom/mopub/common/DoubleTimeTracker$State;

    sget-object v1, Lcom/mopub/common/DoubleTimeTracker$State;->PAUSED:Lcom/mopub/common/DoubleTimeTracker$State;

    if-ne v0, v1, :cond_0

    const-string v0, "DoubleTimeTracker already paused."

    .line 49
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->v(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit p0

    return-void

    .line 54
    :cond_0
    :try_start_1
    iget-wide v0, p0, Lcom/mopub/common/DoubleTimeTracker;->interval:J

    invoke-direct {p0}, Lcom/mopub/common/DoubleTimeTracker;->computeIntervalDiff()J

    move-result-wide v2

    add-long v4, v0, v2

    iput-wide v4, p0, Lcom/mopub/common/DoubleTimeTracker;->interval:J

    const-wide/16 v0, 0x0

    .line 55
    iput-wide v0, p0, Lcom/mopub/common/DoubleTimeTracker;->startedTimestamp:J

    .line 56
    sget-object v0, Lcom/mopub/common/DoubleTimeTracker$State;->PAUSED:Lcom/mopub/common/DoubleTimeTracker$State;

    iput-object v0, p0, Lcom/mopub/common/DoubleTimeTracker;->state:Lcom/mopub/common/DoubleTimeTracker$State;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 47
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized start()V
    .locals 2

    monitor-enter p0

    .line 38
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/DoubleTimeTracker;->state:Lcom/mopub/common/DoubleTimeTracker$State;

    sget-object v1, Lcom/mopub/common/DoubleTimeTracker$State;->STARTED:Lcom/mopub/common/DoubleTimeTracker$State;

    if-ne v0, v1, :cond_0

    const-string v0, "DoubleTimeTracker already started."

    .line 39
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->v(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    monitor-exit p0

    return-void

    .line 43
    :cond_0
    :try_start_1
    sget-object v0, Lcom/mopub/common/DoubleTimeTracker$State;->STARTED:Lcom/mopub/common/DoubleTimeTracker$State;

    iput-object v0, p0, Lcom/mopub/common/DoubleTimeTracker;->state:Lcom/mopub/common/DoubleTimeTracker$State;

    .line 44
    iget-object v0, p0, Lcom/mopub/common/DoubleTimeTracker;->mClock:Lcom/mopub/common/DoubleTimeTracker$Clock;

    invoke-interface {v0}, Lcom/mopub/common/DoubleTimeTracker$Clock;->elapsedRealTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mopub/common/DoubleTimeTracker;->startedTimestamp:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 37
    monitor-exit p0

    throw v0
.end method
