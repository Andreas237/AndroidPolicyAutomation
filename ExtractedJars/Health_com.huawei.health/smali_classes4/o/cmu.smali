.class public abstract Lo/cmu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cmu$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final b:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field private a:Landroid/content/Intent;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:Z

.field private h:I

.field private i:Ljava/util/concurrent/CountDownLatch;

.field private k:Landroid/content/ServiceConnection;

.field private n:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lo/cmu;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/cmu;-><init>(Landroid/content/Context;Landroid/content/Intent;Z)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmu;->d:Landroid/content/Context;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmu;->a:Landroid/content/Intent;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmu;->e:Ljava/lang/Object;

    .line 35
    new-instance v0, Lo/cmu$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/cmu$d;-><init>(Lo/cmu;Lo/cmu$2;)V

    iput-object v0, p0, Lo/cmu;->k:Landroid/content/ServiceConnection;

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/cmu;->h:I

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cmu;->g:Z

    .line 121
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cmu;->f:Z

    .line 123
    new-instance v0, Lo/cmu$2;

    invoke-direct {v0, p0}, Lo/cmu$2;-><init>(Lo/cmu;)V

    iput-object v0, p0, Lo/cmu;->n:Ljava/lang/Runnable;

    .line 45
    iput-boolean p3, p0, Lo/cmu;->g:Z

    .line 46
    iput-object p1, p0, Lo/cmu;->d:Landroid/content/Context;

    .line 47
    iput-object p2, p0, Lo/cmu;->a:Landroid/content/Intent;

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceRef_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    .line 49
    invoke-direct {p0}, Lo/cmu;->f()Z

    .line 50
    return-void
.end method

.method static synthetic a(Lo/cmu;)Z
    .locals 1

    .line 20
    invoke-direct {p0}, Lo/cmu;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/cmu;)Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lo/cmu;Z)Z
    .locals 0

    .line 20
    iput-boolean p1, p0, Lo/cmu;->f:Z

    return p1
.end method

.method static synthetic c(Lo/cmu;I)I
    .locals 0

    .line 20
    iput p1, p0, Lo/cmu;->h:I

    return p1
.end method

.method static synthetic c(Lo/cmu;)Z
    .locals 1

    .line 20
    invoke-direct {p0}, Lo/cmu;->g()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/cmu;)I
    .locals 1

    .line 20
    iget v0, p0, Lo/cmu;->h:I

    return v0
.end method

.method static synthetic d(Lo/cmu;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    iput-object p1, p0, Lo/cmu;->e:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic e(Lo/cmu;)I
    .locals 2

    .line 20
    iget v0, p0, Lo/cmu;->h:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/cmu;->h:I

    return v0
.end method

.method static synthetic f(Lo/cmu;)Ljava/lang/Runnable;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/cmu;->n:Ljava/lang/Runnable;

    return-object v0
.end method

.method private f()Z
    .locals 5

    .line 84
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindService mSelf = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cmu;->e:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    iget-object v0, p0, Lo/cmu;->e:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 86
    const/4 v0, 0x1

    return v0

    .line 89
    :cond_0
    iget-boolean v0, p0, Lo/cmu;->g:Z

    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    const-string v1, "start service!!!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    iget-object v0, p0, Lo/cmu;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/cmu;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 94
    :cond_1
    iget-object v0, p0, Lo/cmu;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/cmu;->a:Landroid/content/Intent;

    iget-object v2, p0, Lo/cmu;->k:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v4

    .line 95
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindService ret = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    if-nez v4, :cond_2

    .line 97
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    const-string v1, "bind ret false"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    invoke-virtual {p0}, Lo/cmu;->a()V

    .line 99
    const/4 v0, 0x0

    return v0

    .line 101
    :cond_2
    return v4
.end method

.method private g()Z
    .locals 8

    .line 62
    const/4 v4, 0x0

    .line 63
    iget-object v0, p0, Lo/cmu;->e:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    const-string v1, "waitForReady: null != mSelf"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    const/4 v0, 0x1

    return v0

    .line 67
    :cond_0
    const-class v5, Lo/cmu$d;

    monitor-enter v5

    .line 68
    :try_start_0
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lo/cmu;->i:Ljava/util/concurrent/CountDownLatch;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    :try_start_1
    iget-object v0, p0, Lo/cmu;->i:Ljava/util/concurrent/CountDownLatch;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    move v4, v0

    .line 71
    if-nez v4, :cond_1

    .line 72
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rebind "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cmu;->a:Landroid/content/Intent;

    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " time out"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    :cond_1
    goto :goto_0

    .line 74
    :catch_0
    move-exception v6

    .line 75
    :try_start_2
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ServiceRef_ InterruptedException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmu;->i:Ljava/util/concurrent/CountDownLatch;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    .line 79
    :goto_1
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "waitForReady success = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    return v4
.end method

.method static synthetic g(Lo/cmu;)Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lo/cmu;->f:Z

    return v0
.end method

.method static synthetic h(Lo/cmu;)Ljava/util/concurrent/CountDownLatch;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/cmu;->i:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method static synthetic h()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 20
    sget-object v0, Lo/cmu;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 105
    iget-object v0, p0, Lo/cmu;->e:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 106
    return-void

    .line 108
    :cond_0
    iget-object v0, p0, Lo/cmu;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/cmu;->k:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmu;->e:Ljava/lang/Object;

    .line 111
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b(Landroid/os/IBinder;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/IBinder;)TT;"
        }
    .end annotation
.end method

.method public abstract b()V
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public e()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get mSelf = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cmu;->e:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    iget-object v0, p0, Lo/cmu;->e:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Lo/cmu;->c:Ljava/lang/String;

    const-string v1, "get mSelf null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    :cond_0
    iget-object v0, p0, Lo/cmu;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public i()V
    .locals 0

    .line 178
    invoke-direct {p0}, Lo/cmu;->k()V

    .line 179
    return-void
.end method
