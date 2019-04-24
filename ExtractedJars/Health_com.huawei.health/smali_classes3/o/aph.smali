.class public final Lo/aph;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Landroid/os/HandlerThread;

.field private static e:Landroid/os/HandlerThread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const/4 v0, 0x0

    sput-object v0, Lo/aph;->b:Landroid/os/HandlerThread;

    .line 22
    const/4 v0, 0x0

    sput-object v0, Lo/aph;->e:Landroid/os/HandlerThread;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized a()V
    .locals 4

    const-class v2, Lo/aph;

    monitor-enter v2

    .line 26
    :try_start_0
    sget-object v0, Lo/aph;->b:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lo/aph;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-ne v0, v1, :cond_1

    .line 28
    :cond_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "MessageHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/aph;->b:Landroid/os/HandlerThread;

    .line 29
    sget-object v0, Lo/aph;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    goto :goto_0

    .line 31
    :cond_1
    sget-object v0, Lo/aph;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_2

    .line 33
    sget-object v0, Lo/aph;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    :cond_2
    :goto_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private static declared-synchronized c()V
    .locals 4

    const-class v2, Lo/aph;

    monitor-enter v2

    .line 40
    :try_start_0
    sget-object v0, Lo/aph;->e:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lo/aph;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-ne v0, v1, :cond_1

    .line 42
    :cond_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "msgLoaderHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/aph;->e:Landroid/os/HandlerThread;

    .line 43
    sget-object v0, Lo/aph;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    goto :goto_0

    .line 45
    :cond_1
    sget-object v0, Lo/aph;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_2

    .line 47
    sget-object v0, Lo/aph;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :cond_2
    :goto_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static declared-synchronized d()Landroid/os/HandlerThread;
    .locals 3

    const-class v1, Lo/aph;

    monitor-enter v1

    .line 58
    :try_start_0
    invoke-static {}, Lo/aph;->a()V

    .line 59
    sget-object v0, Lo/aph;->b:Landroid/os/HandlerThread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static declared-synchronized e()Landroid/os/HandlerThread;
    .locals 3

    const-class v1, Lo/aph;

    monitor-enter v1

    .line 69
    :try_start_0
    invoke-static {}, Lo/aph;->c()V

    .line 70
    sget-object v0, Lo/aph;->e:Landroid/os/HandlerThread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method
