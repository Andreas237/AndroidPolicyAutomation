.class public Lokio/AsyncTimeout;
.super Lokio/Timeout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokio/AsyncTimeout$Watchdog;
    }
.end annotation


# static fields
.field private static head:Lokio/AsyncTimeout;


# instance fields
.field private inQueue:Z

.field private next:Lokio/AsyncTimeout;

.field private timeoutAt:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lokio/Timeout;-><init>()V

    .line 277
    return-void
.end method

.method static synthetic access$000()Lokio/AsyncTimeout;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 40
    invoke-static {}, Lokio/AsyncTimeout;->awaitTimeout()Lokio/AsyncTimeout;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized awaitTimeout()Lokio/AsyncTimeout;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-class v7, Lokio/AsyncTimeout;

    monitor-enter v7

    .line 307
    :try_start_0
    sget-object v0, Lokio/AsyncTimeout;->head:Lokio/AsyncTimeout;

    iget-object v2, v0, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    .line 310
    if-nez v2, :cond_0

    .line 311
    const-class v0, Lokio/AsyncTimeout;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 312
    monitor-exit v7

    const/4 v0, 0x0

    return-object v0

    .line 315
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-direct {v2, v0, v1}, Lokio/AsyncTimeout;->remainingNanos(J)J

    move-result-wide v3

    .line 318
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_1

    .line 321
    const-wide/32 v0, 0xf4240

    div-long v5, v3, v0

    .line 322
    const-wide/32 v0, 0xf4240

    mul-long/2addr v0, v5

    sub-long/2addr v3, v0

    .line 323
    const-class v0, Lokio/AsyncTimeout;

    long-to-int v1, v3

    invoke-virtual {v0, v5, v6, v1}, Ljava/lang/Object;->wait(JI)V

    .line 324
    monitor-exit v7

    const/4 v0, 0x0

    return-object v0

    .line 328
    :cond_1
    sget-object v0, Lokio/AsyncTimeout;->head:Lokio/AsyncTimeout;

    iget-object v1, v2, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    iput-object v1, v0, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    .line 329
    const/4 v0, 0x0

    iput-object v0, v2, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    monitor-exit v7

    return-object v2

    :catchall_0
    move-exception v2

    monitor-exit v7

    throw v2
.end method

.method private static declared-synchronized cancelScheduledTimeout(Lokio/AsyncTimeout;)Z
    .locals 3

    const-class v2, Lokio/AsyncTimeout;

    monitor-enter v2

    .line 117
    :try_start_0
    sget-object v1, Lokio/AsyncTimeout;->head:Lokio/AsyncTimeout;

    :goto_0
    if-eqz v1, :cond_1

    .line 118
    iget-object v0, v1, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    if-ne v0, p0, :cond_0

    .line 119
    iget-object v0, p0, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    iput-object v0, v1, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    .line 121
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 117
    :cond_0
    iget-object v1, v1, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 126
    :cond_1
    monitor-exit v2

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method private remainingNanos(J)J
    .locals 2

    .line 134
    iget-wide v0, p0, Lokio/AsyncTimeout;->timeoutAt:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method private static declared-synchronized scheduleTimeout(Lokio/AsyncTimeout;JZ)V
    .locals 8

    const-class v7, Lokio/AsyncTimeout;

    monitor-enter v7

    .line 75
    :try_start_0
    sget-object v0, Lokio/AsyncTimeout;->head:Lokio/AsyncTimeout;

    if-nez v0, :cond_0

    .line 76
    new-instance v0, Lokio/AsyncTimeout;

    invoke-direct {v0}, Lokio/AsyncTimeout;-><init>()V

    sput-object v0, Lokio/AsyncTimeout;->head:Lokio/AsyncTimeout;

    .line 77
    new-instance v0, Lokio/AsyncTimeout$Watchdog;

    invoke-direct {v0}, Lokio/AsyncTimeout$Watchdog;-><init>()V

    invoke-virtual {v0}, Lokio/AsyncTimeout$Watchdog;->start()V

    .line 80
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 81
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    .line 84
    invoke-virtual {p0}, Lokio/AsyncTimeout;->deadlineNanoTime()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/AsyncTimeout;->timeoutAt:J

    goto :goto_0

    .line 85
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_2

    .line 86
    add-long v0, v2, p1

    iput-wide v0, p0, Lokio/AsyncTimeout;->timeoutAt:J

    goto :goto_0

    .line 87
    :cond_2
    if-eqz p3, :cond_3

    .line 88
    invoke-virtual {p0}, Lokio/AsyncTimeout;->deadlineNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lokio/AsyncTimeout;->timeoutAt:J

    goto :goto_0

    .line 90
    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 94
    :goto_0
    invoke-direct {p0, v2, v3}, Lokio/AsyncTimeout;->remainingNanos(J)J

    move-result-wide v4

    .line 95
    sget-object v6, Lokio/AsyncTimeout;->head:Lokio/AsyncTimeout;

    .line 96
    :goto_1
    iget-object v0, v6, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    if-eqz v0, :cond_4

    iget-object v0, v6, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    invoke-direct {v0, v2, v3}, Lokio/AsyncTimeout;->remainingNanos(J)J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-gez v0, :cond_5

    .line 97
    :cond_4
    iget-object v0, v6, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    iput-object v0, p0, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    .line 98
    iput-object p0, v6, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;

    .line 99
    sget-object v0, Lokio/AsyncTimeout;->head:Lokio/AsyncTimeout;

    if-ne v6, v0, :cond_6

    .line 100
    const-class v0, Lokio/AsyncTimeout;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    goto :goto_2

    .line 95
    :cond_5
    iget-object v6, v6, Lokio/AsyncTimeout;->next:Lokio/AsyncTimeout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 105
    :cond_6
    :goto_2
    monitor-exit v7

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v7

    throw p0
.end method


# virtual methods
.method public final enter()V
    .locals 5

    .line 62
    iget-boolean v0, p0, Lokio/AsyncTimeout;->inQueue:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unbalanced enter/exit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_0
    invoke-virtual {p0}, Lokio/AsyncTimeout;->timeoutNanos()J

    move-result-wide v2

    .line 64
    invoke-virtual {p0}, Lokio/AsyncTimeout;->hasDeadline()Z

    move-result v4

    .line 65
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    if-nez v4, :cond_1

    .line 66
    return-void

    .line 68
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokio/AsyncTimeout;->inQueue:Z

    .line 69
    invoke-static {p0, v2, v3, v4}, Lokio/AsyncTimeout;->scheduleTimeout(Lokio/AsyncTimeout;JZ)V

    .line 70
    return-void
.end method

.method final exit(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 260
    invoke-virtual {p0}, Lokio/AsyncTimeout;->exit()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 261
    :cond_0
    invoke-virtual {p0, p1}, Lokio/AsyncTimeout;->newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    return-object v0
.end method

.method final exit(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 249
    invoke-virtual {p0}, Lokio/AsyncTimeout;->exit()Z

    move-result v1

    .line 250
    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lokio/AsyncTimeout;->newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 251
    :cond_0
    return-void
.end method

.method public final exit()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Lokio/AsyncTimeout;->inQueue:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 110
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokio/AsyncTimeout;->inQueue:Z

    .line 111
    invoke-static {p0}, Lokio/AsyncTimeout;->cancelScheduledTimeout(Lokio/AsyncTimeout;)Z

    move-result v0

    return v0
.end method

.method protected newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 270
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v0, "timeout"

    invoke-direct {v1, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 271
    if-eqz p1, :cond_0

    .line 272
    invoke-virtual {v1, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 274
    :cond_0
    return-object v1
.end method

.method public final sink(Lokio/Sink;)Lokio/Sink;
    .locals 1

    .line 150
    new-instance v0, Lokio/AsyncTimeout$1;

    invoke-direct {v0, p0, p1}, Lokio/AsyncTimeout$1;-><init>(Lokio/AsyncTimeout;Lokio/Sink;)V

    return-object v0
.end method

.method public final source(Lokio/Source;)Lokio/Source;
    .locals 1

    .line 206
    new-instance v0, Lokio/AsyncTimeout$2;

    invoke-direct {v0, p0, p1}, Lokio/AsyncTimeout$2;-><init>(Lokio/AsyncTimeout;Lokio/Source;)V

    return-object v0
.end method

.method protected timedOut()V
    .locals 0

    .line 142
    return-void
.end method
