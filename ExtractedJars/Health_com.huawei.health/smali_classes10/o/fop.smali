.class public Lo/fop;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lo/fop;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lo/fop;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    if-nez p1, :cond_0

    .line 55
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "observe option must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_0
    iget-object v0, p0, Lo/fop;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 58
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fop;->e:J

    .line 59
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 82
    iget-object v0, p0, Lo/fop;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public declared-synchronized e(Lo/fly;)Z
    .locals 11

    monitor-enter p0

    .line 92
    :try_start_0
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->N()Ljava/lang/Integer;

    move-result-object v4

    .line 93
    if-nez v4, :cond_0

    .line 95
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 102
    :cond_0
    iget-wide v5, p0, Lo/fop;->e:J

    .line 103
    iget-object v0, p0, Lo/fop;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v7

    .line 104
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    .line 105
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 106
    if-ge v7, v10, :cond_1

    sub-int v0, v10, v7

    int-to-long v0, v0

    const-wide/32 v2, 0x800000

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    :cond_1
    if-le v7, v10, :cond_2

    sub-int v0, v7, v10

    int-to-long v0, v0

    const-wide/32 v2, 0x800000

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    :cond_2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x80

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    add-long/2addr v0, v5

    cmp-long v0, v8, v0

    if-lez v0, :cond_4

    .line 110
    :cond_3
    iput-wide v8, p0, Lo/fop;->e:J

    .line 111
    iget-object v0, p0, Lo/fop;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v10}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 114
    :cond_4
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
