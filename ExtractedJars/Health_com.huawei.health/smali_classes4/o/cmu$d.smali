.class Lo/cmu$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic e:Lo/cmu;


# direct methods
.method private constructor <init>(Lo/cmu;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cmu;Lo/cmu$2;)V
    .locals 0

    .line 150
    invoke-direct {p0, p1}, Lo/cmu$d;-><init>(Lo/cmu;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 154
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->b(Lo/cmu;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onServiceConnected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    iget-object v1, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-virtual {v1, p2}, Lo/cmu;->b(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cmu;->d(Lo/cmu;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    const-class v3, Lo/cmu$d;

    monitor-enter v3

    .line 157
    :try_start_0
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->h(Lo/cmu;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->h(Lo/cmu;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 161
    :goto_0
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->b()V

    .line 162
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    .line 167
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->b(Lo/cmu;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onServiceDisconnected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmu;->d(Lo/cmu;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->d()V

    .line 171
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cmu;->b(Lo/cmu;Z)Z

    .line 172
    iget-object v0, p0, Lo/cmu$d;->e:Lo/cmu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmu;->c(Lo/cmu;I)I

    .line 173
    invoke-static {}, Lo/cmu;->h()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo/cmu$d;->e:Lo/cmu;

    invoke-static {v1}, Lo/cmu;->f(Lo/cmu;)Ljava/lang/Runnable;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x3e8

    invoke-interface {v0, v1, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 174
    return-void
.end method
