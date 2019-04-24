.class public Lcom/usebutton/sdk/internal/core/CommandExecutor;
.super Ljava/lang/Object;
.source "CommandExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/core/CommandExecutor$HandlerMessenger;,
        Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;
    }
.end annotation


# static fields
.field public static final KILL_PILL:Lcom/usebutton/sdk/internal/core/Command;

.field private static final TAG:Ljava/lang/String; = "CommandExecutor"


# instance fields
.field private final mExceptionHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/core/ExceptionHandler;",
            ">;"
        }
    .end annotation
.end field

.field private mExecutorService:Ljava/util/concurrent/ExecutorService;

.field private final mMessenger:Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;

.field private mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingDeque<",
            "Lcom/usebutton/sdk/internal/core/Command;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 145
    new-instance v0, Lcom/usebutton/sdk/internal/core/CommandExecutor$3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor$3;-><init>(Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    sput-object v0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->KILL_PILL:Lcom/usebutton/sdk/internal/core/Command;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 31
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mMessenger:Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExceptionHandlers:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/core/ExceptionHandler;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 26
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mMessenger:Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;

    .line 27
    iput-object p2, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExceptionHandlers:Ljava/util/List;

    return-void
.end method

.method public static defaultExecutor()Lcom/usebutton/sdk/internal/core/CommandExecutor;
    .locals 5

    .line 36
    new-instance v0, Lcom/usebutton/sdk/internal/core/CommandExecutor;

    new-instance v1, Lcom/usebutton/sdk/internal/core/CommandExecutor$HandlerMessenger;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/internal/core/CommandExecutor$HandlerMessenger;-><init>(Landroid/os/Handler;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/usebutton/sdk/internal/core/ExceptionHandler;

    new-instance v3, Lcom/usebutton/sdk/internal/core/InvalidSessionHandler;

    invoke-direct {v3}, Lcom/usebutton/sdk/internal/core/InvalidSessionHandler;-><init>()V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Lcom/usebutton/sdk/internal/core/LoggingHandler;

    invoke-direct {v3}, Lcom/usebutton/sdk/internal/core/LoggingHandler;-><init>()V

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 37
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/core/CommandExecutor;-><init>(Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;Ljava/util/List;)V

    return-object v0
.end method

.method private handleException(Ljava/lang/Throwable;)V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExceptionHandlers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/core/ExceptionHandler;

    .line 141
    invoke-interface {v1, p1}, Lcom/usebutton/sdk/internal/core/ExceptionHandler;->handle(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    return-void
.end method

.method private declared-synchronized isRunning()Z
    .locals 1

    monitor-enter p0

    .line 66
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExecutorService:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public blockingLoop()V
    .locals 4

    .line 103
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->takeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/core/Command;

    .line 104
    sget-object v1, Lcom/usebutton/sdk/internal/core/CommandExecutor;->KILL_PILL:Lcom/usebutton/sdk/internal/core/Command;

    if-ne v0, v1, :cond_0

    .line 105
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "Swallowed the wrong pill, shutting down CommandExecutor."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    .line 108
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Command;->isCancelled()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 110
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Command;->execute()Ljava/lang/Object;

    move-result-object v1

    .line 111
    iget-object v2, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mMessenger:Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;

    new-instance v3, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;-><init>(Lcom/usebutton/sdk/internal/core/CommandExecutor;Lcom/usebutton/sdk/internal/core/Command;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;->post(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 119
    :try_start_2
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->handleException(Ljava/lang/Throwable;)V

    .line 120
    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mMessenger:Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;

    new-instance v2, Lcom/usebutton/sdk/internal/core/CommandExecutor$2;

    invoke-direct {v2, p0, v0}, Lcom/usebutton/sdk/internal/core/CommandExecutor$2;-><init>(Lcom/usebutton/sdk/internal/core/CommandExecutor;Lcom/usebutton/sdk/internal/core/Command;)V

    invoke-interface {v1, v2}, Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;->post(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 129
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    const-string v0, "CommandExecutor"

    const-string v1, "Command executor got interrupted."

    .line 130
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public dispatch(Lcom/usebutton/sdk/internal/core/Command;)V
    .locals 7

    .line 70
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->isRunning()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const-string v0, "CommandExecutor"

    const-string v3, "Ignoring command submitted while stopped: %s"

    .line 71
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v0, v3, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/usebutton/sdk/internal/core/Command;

    .line 75
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/core/Command;->isCancelled()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v0, "CommandExecutor"

    const-string v4, "Joined command %s with pending command %s (%s)"

    const/4 v5, 0x2

    .line 76
    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v2

    invoke-static {v0, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-virtual {v3, p1}, Lcom/usebutton/sdk/internal/core/Command;->join(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void

    .line 81
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public dispatchFirst(Lcom/usebutton/sdk/internal/core/Command;)V
    .locals 6

    .line 85
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/core/Command;

    .line 86
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/core/Command;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "CommandExecutor"

    const-string v2, "Joined command %s with pending command %s (%s)"

    const/4 v3, 0x2

    .line 87
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/core/Command;->key()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    invoke-virtual {v1, p1}, Lcom/usebutton/sdk/internal/core/Command;->join(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mPendingCommands:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->addFirst(Ljava/lang/Object;)V

    return-void
.end method

.method public run()V
    .locals 0

    .line 97
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->blockingLoop()V

    return-void
.end method

.method public declared-synchronized start()V
    .locals 2

    monitor-enter p0

    .line 44
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CommandExecutor"

    const-string/jumbo v1, "start() called while already running"

    .line 45
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit p0

    return-void

    .line 48
    :cond_0
    :try_start_1
    new-instance v0, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;

    const-string v1, "CommandExecutor"

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 49
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized stop()V
    .locals 2

    monitor-enter p0

    .line 56
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "CommandExecutor"

    const-string/jumbo v1, "stop() called while already running"

    .line 57
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    monitor-exit p0

    return-void

    .line 60
    :cond_0
    :try_start_1
    sget-object v0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->KILL_PILL:Lcom/usebutton/sdk/internal/core/Command;

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatch(Lcom/usebutton/sdk/internal/core/Command;)V

    .line 61
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor;->mExecutorService:Ljava/util/concurrent/ExecutorService;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
