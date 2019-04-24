.class public Lcom/newrelic/agent/android/background/ApplicationStateMonitor;
.super Ljava/lang/Object;
.source "ApplicationStateMonitor.java"


# static fields
.field private static instance:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private activityCount:Ljava/util/concurrent/atomic/AtomicLong;

.field protected final applicationStateListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/newrelic/agent/android/background/ApplicationStateListener;",
            ">;"
        }
    .end annotation
.end field

.field protected final executor:Ljava/util/concurrent/ExecutorService;

.field protected foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const/4 v0, 0x0

    .line 23
    sput-object v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->instance:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    new-instance v0, Lcom/newrelic/agent/android/util/NamedThreadFactory;

    const-string v1, "AppStateMon"

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    .line 28
    sget-object v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Application state monitor has started"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 14
    sget-object v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method static synthetic access$100(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->notifyApplicationInBackground()V

    return-void
.end method

.method static synthetic access$200(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityCount:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method static synthetic access$300(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->notifyApplicationInForeground()V

    return-void
.end method

.method public static getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;
    .locals 1

    .line 32
    sget-object v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->instance:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    invoke-direct {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;-><init>()V

    invoke-static {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->setInstance(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V

    .line 35
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->instance:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    return-object v0
.end method

.method public static isAppInBackground()Z
    .locals 1

    .line 127
    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getForegrounded()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private notifyApplicationInBackground()V
    .locals 3

    .line 96
    sget-object v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Application appears to have gone to the background"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    monitor-enter v0

    .line 99
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    new-instance v0, Lcom/newrelic/agent/android/background/ApplicationStateEvent;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/background/ApplicationStateEvent;-><init>(Ljava/lang/Object;)V

    .line 102
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/background/ApplicationStateListener;

    .line 103
    invoke-interface {v2, v0}, Lcom/newrelic/agent/android/background/ApplicationStateListener;->applicationBackgrounded(Lcom/newrelic/agent/android/background/ApplicationStateEvent;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 100
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private notifyApplicationInForeground()V
    .locals 3

    .line 109
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    monitor-enter v0

    .line 110
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 111
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    new-instance v0, Lcom/newrelic/agent/android/background/ApplicationStateEvent;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/background/ApplicationStateEvent;-><init>(Ljava/lang/Object;)V

    .line 113
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/background/ApplicationStateListener;

    .line 114
    invoke-interface {v2, v0}, Lcom/newrelic/agent/android/background/ApplicationStateListener;->applicationForegrounded(Lcom/newrelic/agent/android/background/ApplicationStateEvent;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 111
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static setInstance(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V
    .locals 0

    .line 39
    sput-object p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->instance:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    return-void
.end method


# virtual methods
.method public activityStarted()V
    .locals 2

    .line 82
    new-instance v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;-><init>(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V

    .line 92
    iget-object v1, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public activityStopped()V
    .locals 2

    .line 69
    new-instance v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$2;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$2;-><init>(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V

    .line 78
    iget-object v1, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public addApplicationStateListener(Lcom/newrelic/agent/android/background/ApplicationStateListener;)V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    monitor-enter v0

    .line 44
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getForegrounded()Z
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public removeApplicationStateListener(Lcom/newrelic/agent/android/background/ApplicationStateListener;)V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 51
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public uiHidden()V
    .locals 2

    .line 55
    new-instance v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$1;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$1;-><init>(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V

    .line 65
    iget-object v1, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
