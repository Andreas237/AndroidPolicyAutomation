.class public Lo/fnd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fnb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fnd$4;,
        Lo/fnd$b;,
        Lo/fnd$e;
    }
.end annotation


# static fields
.field private static final d:Lo/fty;


# instance fields
.field private a:Z

.field private volatile b:I

.field private final c:[Lo/fnd$b;

.field private e:Ljava/util/concurrent/ScheduledExecutorService;

.field private volatile f:I

.field private final h:Lo/fnd$e;

.field private final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const-class v0, Lo/fnd;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnd;->d:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;)V
    .locals 3

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fnd;->a:Z

    .line 72
    new-instance v0, Lo/fnd$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/fnd$e;-><init>(Lo/fnd;Lo/fnd$4;)V

    iput-object v0, p0, Lo/fnd;->h:Lo/fnd$e;

    .line 73
    const/4 v0, 0x3

    new-array v0, v0, [Lo/fnd$b;

    iput-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    .line 74
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    new-instance v1, Lo/fnd$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/fnd$b;-><init>(Lo/fnd$4;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 75
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    new-instance v1, Lo/fnd$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/fnd$b;-><init>(Lo/fnd$4;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 76
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    new-instance v1, Lo/fnd$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/fnd$b;-><init>(Lo/fnd$4;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/fnd;->b:I

    .line 78
    const/4 v0, 0x1

    iput v0, p0, Lo/fnd;->f:I

    .line 79
    const-string v0, "CROP_ROTATION_PERIOD"

    invoke-virtual {p1, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lo/fnd;->i:J

    .line 80
    return-void
.end method

.method static synthetic a(Lo/fnd;)[Lo/fnd$b;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    return-object v0
.end method

.method static synthetic b(Lo/fnd;)J
    .locals 2

    .line 48
    iget-wide v0, p0, Lo/fnd;->i:J

    return-wide v0
.end method

.method static synthetic c(Lo/fnd;)I
    .locals 1

    .line 48
    iget v0, p0, Lo/fnd;->f:I

    return v0
.end method

.method static synthetic c(Lo/fnd;I)I
    .locals 0

    .line 48
    iput p1, p0, Lo/fnd;->f:I

    return p1
.end method

.method static synthetic d(Lo/fnd;I)I
    .locals 0

    .line 48
    iput p1, p0, Lo/fnd;->b:I

    return p1
.end method

.method static synthetic d(Lo/fnd;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/fnd;->e:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method static synthetic d()Lo/fty;
    .locals 1

    .line 48
    sget-object v0, Lo/fnd;->d:Lo/fty;

    return-object v0
.end method

.method static synthetic e(Lo/fnd;)I
    .locals 1

    .line 48
    iget v0, p0, Lo/fnd;->b:I

    return v0
.end method


# virtual methods
.method public a(Lo/fmb$e;)Lo/fmb;
    .locals 4

    .line 116
    iget v1, p0, Lo/fnd;->b:I

    .line 117
    iget v2, p0, Lo/fnd;->f:I

    .line 118
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lo/fnd$b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fmb;

    .line 119
    if-nez v3, :cond_0

    if-ne v1, v2, :cond_1

    .line 120
    :cond_0
    return-object v3

    .line 121
    :cond_1
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    aget-object v0, v0, v2

    invoke-virtual {v0, p1}, Lo/fnd$b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fmb;

    .line 122
    return-object v3
.end method

.method public a(Lo/fmb$e;Lo/fmb;)Lo/fmb;
    .locals 4

    .line 105
    iget v1, p0, Lo/fnd;->b:I

    .line 106
    iget v2, p0, Lo/fnd;->f:I

    .line 107
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Lo/fnd$b;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fmb;

    .line 108
    if-nez v3, :cond_0

    if-ne v1, v2, :cond_1

    .line 109
    :cond_0
    return-object v3

    .line 110
    :cond_1
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    aget-object v0, v0, v2

    invoke-virtual {v0, p1, p2}, Lo/fnd$b;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fmb;

    .line 111
    return-object v3
.end method

.method public declared-synchronized a()V
    .locals 3

    monitor-enter p0

    .line 84
    :try_start_0
    iget-boolean v0, p0, Lo/fnd;->a:Z

    if-nez v0, :cond_2

    .line 85
    iget-object v0, p0, Lo/fnd;->e:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fnd;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    :cond_0
    new-instance v0, Lo/fpn;

    const-string v1, "Deduplicator"

    invoke-direct {v0, v1}, Lo/fpn;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/fnd;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 88
    :cond_1
    iget-object v0, p0, Lo/fnd;->h:Lo/fnd$e;

    invoke-static {v0}, Lo/fnd$e;->b(Lo/fnd$e;)V

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fnd;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public b()V
    .locals 4

    .line 127
    iget-object v2, p0, Lo/fnd;->c:[Lo/fnd$b;

    monitor-enter v2

    .line 128
    :try_start_0
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/fnd$b;->clear()V

    .line 129
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/fnd$b;->clear()V

    .line 130
    iget-object v0, p0, Lo/fnd;->c:[Lo/fnd$b;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/fnd$b;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 132
    :goto_0
    return-void
.end method

.method public declared-synchronized e()V
    .locals 2

    monitor-enter p0

    .line 95
    :try_start_0
    iget-boolean v0, p0, Lo/fnd;->a:Z

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lo/fnd;->h:Lo/fnd$e;

    invoke-static {v0}, Lo/fnd$e;->d(Lo/fnd$e;)V

    .line 97
    iget-object v0, p0, Lo/fnd;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 98
    invoke-virtual {p0}, Lo/fnd;->b()V

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fnd;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method
