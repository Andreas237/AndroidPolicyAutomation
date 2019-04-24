.class Lo/aly$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aly;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/aly;


# direct methods
.method private constructor <init>(Lo/aly;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/aly$b;->d:Lo/aly;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/aly;Lo/aly$3;)V
    .locals 0

    .line 114
    invoke-direct {p0, p1}, Lo/aly$b;-><init>(Lo/aly;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    .line 122
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onServiceConnected"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lo/aly$b;->d:Lo/aly;

    invoke-static {p2}, Lo/dqk$b;->d(Landroid/os/IBinder;)Lo/dqk;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aly;->e(Lo/aly;Lo/dqk;)Lo/dqk;

    .line 125
    :try_start_0
    iget-object v0, p0, Lo/aly$b;->d:Lo/aly;

    invoke-static {v0}, Lo/aly;->b(Lo/aly;)Lo/dqk;

    move-result-object v0

    invoke-interface {v0}, Lo/dqk;->a()I

    move-result v4

    .line 126
    iget-object v0, p0, Lo/aly$b;->d:Lo/aly;

    invoke-static {v0, v4}, Lo/aly;->c(Lo/aly;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    goto :goto_0

    .line 127
    :catch_0
    move-exception v4

    .line 128
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    :goto_0
    iget-object v0, p0, Lo/aly$b;->d:Lo/aly;

    invoke-virtual {v0}, Lo/aly;->d()V

    .line 132
    iget-object v0, p0, Lo/aly$b;->d:Lo/aly;

    invoke-static {v0}, Lo/aly;->d(Lo/aly;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 133
    :try_start_1
    iget-object v0, p0, Lo/aly$b;->d:Lo/aly;

    invoke-static {v0}, Lo/aly;->d(Lo/aly;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 135
    :goto_1
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 117
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MockService disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    return-void
.end method
