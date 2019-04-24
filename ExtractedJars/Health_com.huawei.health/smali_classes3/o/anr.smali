.class public Lo/anr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:J

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Lo/ald;

.field private e:Lo/anp;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anr;->e:Lo/anp;

    .line 16
    new-instance v0, Lo/ald;

    invoke-direct {v0}, Lo/ald;-><init>()V

    iput-object v0, p0, Lo/anr;->d:Lo/ald;

    .line 18
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/anr;->a:J

    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/anr;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    new-instance v0, Lo/anp;

    invoke-direct {v0, p1}, Lo/anp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/anr;->e:Lo/anp;

    .line 23
    return-void
.end method

.method private e(J)V
    .locals 4

    .line 68
    iget-wide v0, p0, Lo/anr;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lo/anr;->a:J

    invoke-static {p1, p2, v0, v1}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    :cond_0
    invoke-virtual {p0}, Lo/anr;->b()V

    .line 70
    iput-wide p1, p0, Lo/anr;->a:J

    .line 72
    :cond_1
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 6

    .line 95
    move-object v4, p0

    monitor-enter v4

    .line 96
    :try_start_0
    iget-wide v0, p0, Lo/anr;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/anr;->d:Lo/ald;

    invoke-virtual {v0}, Lo/ald;->e()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 97
    :cond_0
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 99
    :cond_1
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 100
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method b()V
    .locals 4

    .line 75
    move-object v2, p0

    monitor-enter v2

    .line 76
    const-wide/16 v0, 0x0

    :try_start_0
    iput-wide v0, p0, Lo/anr;->a:J

    .line 77
    iget-object v0, p0, Lo/anr;->d:Lo/ald;

    invoke-virtual {v0}, Lo/ald;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 79
    :goto_0
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 82
    move-object v1, p0

    monitor-enter v1

    .line 83
    :try_start_0
    iget-object v0, p0, Lo/anr;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p0}, Lo/anr;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 85
    monitor-exit v1

    return-void

    .line 88
    :cond_0
    :try_start_1
    new-instance v2, Lo/ald;

    invoke-direct {v2}, Lo/ald;-><init>()V

    .line 89
    iget-object v0, p0, Lo/anr;->d:Lo/ald;

    invoke-virtual {v2, v0}, Lo/ald;->a(Lo/ald;)V

    .line 90
    iget-object v0, p0, Lo/anr;->e:Lo/anp;

    invoke-virtual {v0, v2, p1}, Lo/anp;->e(Lo/ald;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 92
    :goto_0
    return-void
.end method

.method public d()Lo/ald;
    .locals 3

    .line 122
    move-object v1, p0

    monitor-enter v1

    .line 123
    :try_start_0
    iget-object v0, p0, Lo/anr;->d:Lo/ald;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 124
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public d(Lo/alb;)V
    .locals 3

    .line 26
    move-object v1, p0

    monitor-enter v1

    .line 27
    :try_start_0
    iget-object v0, p0, Lo/anr;->e:Lo/anp;

    invoke-virtual {v0, p1}, Lo/anp;->d(Lo/alb;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 29
    :goto_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 116
    move-object v2, p0

    monitor-enter v2

    .line 117
    :try_start_0
    iget-object v0, p0, Lo/anr;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 119
    :goto_0
    return-void
.end method

.method public e(JLo/ald;)V
    .locals 3

    .line 57
    move-object v1, p0

    monitor-enter v1

    .line 58
    :try_start_0
    iget-object v0, p0, Lo/anr;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    invoke-direct {p0, p1, p2}, Lo/anr;->e(J)V

    .line 62
    :cond_0
    iget-object v0, p0, Lo/anr;->d:Lo/ald;

    invoke-virtual {v0, p3}, Lo/ald;->a(Lo/ald;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 64
    :goto_0
    return-void
.end method
