.class Lo/aka$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aka;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aka;


# direct methods
.method constructor <init>(Lo/aka;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/aka$2;->a:Lo/aka;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 85
    iget-object v4, p0, Lo/aka$2;->a:Lo/aka;

    monitor-enter v4

    .line 86
    :try_start_0
    iget-object v0, p0, Lo/aka$2;->a:Lo/aka;

    invoke-static {v0}, Lo/aka;->d(Lo/aka;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    monitor-exit v4

    return-void

    .line 90
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/aka$2;->a:Lo/aka;

    invoke-static {v0}, Lo/aka;->a(Lo/aka;)J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long v5, v0, v2

    .line 92
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_1

    .line 93
    iget-object v0, p0, Lo/aka$2;->a:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->b()V

    goto :goto_1

    .line 94
    :cond_1
    iget-object v0, p0, Lo/aka$2;->a:Lo/aka;

    invoke-static {v0}, Lo/aka;->c(Lo/aka;)J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-gez v0, :cond_2

    .line 96
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/aka$2;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0, v5, v6}, Lo/aka$2;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_1

    .line 98
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    .line 99
    iget-object v0, p0, Lo/aka$2;->a:Lo/aka;

    invoke-virtual {v0, v5, v6}, Lo/aka;->c(J)V

    .line 102
    iget-object v0, p0, Lo/aka$2;->a:Lo/aka;

    invoke-static {v0}, Lo/aka;->c(Lo/aka;)J

    move-result-wide v0

    add-long/2addr v0, v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long v9, v0, v2

    .line 106
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v9, v0

    if-gez v0, :cond_3

    iget-object v0, p0, Lo/aka$2;->a:Lo/aka;

    invoke-static {v0}, Lo/aka;->c(Lo/aka;)J

    move-result-wide v0

    add-long/2addr v9, v0

    goto :goto_0

    .line 108
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/aka$2;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0, v9, v10}, Lo/aka$2;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v11

    monitor-exit v4

    throw v11

    .line 111
    :goto_2
    return-void
.end method
