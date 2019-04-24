.class public abstract Lo/aka;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private final b:J

.field private final c:J

.field private d:J

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(JJ)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aka;->a:Z

    .line 80
    new-instance v0, Lo/aka$2;

    invoke-direct {v0, p0}, Lo/aka$2;-><init>(Lo/aka;)V

    iput-object v0, p0, Lo/aka;->e:Landroid/os/Handler;

    .line 37
    iput-wide p1, p0, Lo/aka;->b:J

    .line 38
    iput-wide p3, p0, Lo/aka;->c:J

    .line 39
    return-void
.end method

.method static synthetic a(Lo/aka;)J
    .locals 2

    .line 10
    iget-wide v0, p0, Lo/aka;->d:J

    return-wide v0
.end method

.method static synthetic c(Lo/aka;)J
    .locals 2

    .line 10
    iget-wide v0, p0, Lo/aka;->c:J

    return-wide v0
.end method

.method static synthetic d(Lo/aka;)Z
    .locals 1

    .line 10
    iget-boolean v0, p0, Lo/aka;->a:Z

    return v0
.end method


# virtual methods
.method public abstract b()V
.end method

.method public abstract c(J)V
.end method

.method public final declared-synchronized d()V
    .locals 3

    monitor-enter p0

    .line 45
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lo/aka;->a:Z

    .line 46
    iget-object v0, p0, Lo/aka;->e:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public final declared-synchronized e()Lo/aka;
    .locals 5

    monitor-enter p0

    .line 53
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lo/aka;->a:Z

    .line 54
    iget-wide v0, p0, Lo/aka;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 55
    invoke-virtual {p0}, Lo/aka;->b()V

    .line 56
    monitor-exit p0

    return-object p0

    .line 58
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/aka;->b:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/aka;->d:J

    .line 59
    iget-object v0, p0, Lo/aka;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/aka;->e:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method
