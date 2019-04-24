.class public Lcom/usebutton/sdk/internal/events/SyncManager;
.super Ljava/lang/Object;
.source "SyncManager.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "SyncManager"


# instance fields
.field private final api:Lcom/usebutton/sdk/internal/api/ButtonApi;

.field private final executor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

.field private final handler:Landroid/os/Handler;

.field private final storage:Lcom/usebutton/sdk/internal/core/Storage;

.field private final syncEventsRunnable:Ljava/lang/Runnable;

.field private syncScheduled:Z

.field private final tracker:Lcom/usebutton/sdk/internal/events/EventTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/core/CommandExecutor;Landroid/os/Handler;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lcom/usebutton/sdk/internal/events/SyncManager$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/events/SyncManager$1;-><init>(Lcom/usebutton/sdk/internal/events/SyncManager;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->syncEventsRunnable:Ljava/lang/Runnable;

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->syncScheduled:Z

    .line 45
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->api:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 46
    iput-object p2, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    .line 47
    iput-object p3, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->tracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    .line 48
    iput-object p4, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->executor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    .line 49
    iput-object p5, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$002(Lcom/usebutton/sdk/internal/events/SyncManager;Z)Z
    .locals 0

    .line 16
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->syncScheduled:Z

    return p1
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/events/SyncManager;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/SyncManager;->syncEventsNow()V

    return-void
.end method

.method private syncEventsNow()V
    .locals 5

    .line 76
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->executor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v1, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->api:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->storage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->tracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-direct {v1, v2, v3, v4}, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/events/EventTracker;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    .line 77
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->executor:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v1, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->api:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method


# virtual methods
.method public removeCallbacks()V
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->syncEventsRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public declared-synchronized syncEventsSoon()V
    .locals 4

    monitor-enter p0

    .line 56
    :try_start_0
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->syncScheduled:Z

    if-nez v0, :cond_0

    .line 57
    sget-object v0, Lcom/usebutton/sdk/internal/events/SyncManager;->TAG:Ljava/lang/String;

    const-string v1, "syncEventsSoon: scheduling sync"

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getEventFlushSeconds()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    .line 60
    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->handler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->syncEventsRunnable:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager;->syncScheduled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
