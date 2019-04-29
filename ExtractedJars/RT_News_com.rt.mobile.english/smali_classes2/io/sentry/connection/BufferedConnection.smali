.class public Lio/sentry/connection/BufferedConnection;
.super Ljava/lang/Object;
.source "BufferedConnection.java"

# interfaces
.implements Lio/sentry/connection/Connection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/connection/BufferedConnection$ShutDownHook;,
        Lio/sentry/connection/BufferedConnection$Flusher;
    }
.end annotation


# static fields
.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private actualConnection:Lio/sentry/connection/Connection;

.field private buffer:Lio/sentry/buffer/Buffer;

.field private volatile closed:Z

.field private final executorService:Ljava/util/concurrent/ScheduledExecutorService;

.field private gracefulShutdown:Z

.field private final shutDownHook:Lio/sentry/connection/BufferedConnection$ShutDownHook;

.field private shutdownTimeout:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Lio/sentry/connection/BufferedConnection;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    return-void
.end method

.method public constructor <init>(Lio/sentry/connection/Connection;Lio/sentry/buffer/Buffer;JZJ)V
    .locals 7

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Lio/sentry/connection/BufferedConnection$ShutDownHook;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/sentry/connection/BufferedConnection$ShutDownHook;-><init>(Lio/sentry/connection/BufferedConnection;Lio/sentry/connection/BufferedConnection$1;)V

    iput-object v0, p0, Lio/sentry/connection/BufferedConnection;->shutDownHook:Lio/sentry/connection/BufferedConnection$ShutDownHook;

    .line 46
    new-instance v0, Lio/sentry/connection/BufferedConnection$1;

    invoke-direct {v0, p0}, Lio/sentry/connection/BufferedConnection$1;-><init>(Lio/sentry/connection/BufferedConnection;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/connection/BufferedConnection;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v0, 0x0

    .line 74
    iput-boolean v0, p0, Lio/sentry/connection/BufferedConnection;->closed:Z

    .line 89
    iput-object p1, p0, Lio/sentry/connection/BufferedConnection;->actualConnection:Lio/sentry/connection/Connection;

    .line 90
    iput-object p2, p0, Lio/sentry/connection/BufferedConnection;->buffer:Lio/sentry/buffer/Buffer;

    .line 91
    iput-boolean p5, p0, Lio/sentry/connection/BufferedConnection;->gracefulShutdown:Z

    .line 92
    iput-wide p6, p0, Lio/sentry/connection/BufferedConnection;->shutdownTimeout:J

    if-eqz p5, :cond_0

    .line 95
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    iget-object p2, p0, Lio/sentry/connection/BufferedConnection;->shutDownHook:Lio/sentry/connection/BufferedConnection$ShutDownHook;

    invoke-virtual {p1, p2}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    .line 98
    :cond_0
    new-instance v1, Lio/sentry/connection/BufferedConnection$Flusher;

    invoke-direct {v1, p0, p3, p4}, Lio/sentry/connection/BufferedConnection$Flusher;-><init>(Lio/sentry/connection/BufferedConnection;J)V

    .line 99
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v2, p3

    move-wide v4, p3

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method static synthetic access$200(Lio/sentry/connection/BufferedConnection;)Lio/sentry/buffer/Buffer;
    .locals 0

    .line 34
    iget-object p0, p0, Lio/sentry/connection/BufferedConnection;->buffer:Lio/sentry/buffer/Buffer;

    return-object p0
.end method

.method static synthetic access$300()Lorg/slf4j/Logger;
    .locals 1

    .line 34
    sget-object v0, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    return-object v0
.end method

.method static synthetic access$400(Lio/sentry/connection/BufferedConnection;)Z
    .locals 0

    .line 34
    iget-boolean p0, p0, Lio/sentry/connection/BufferedConnection;->closed:Z

    return p0
.end method


# virtual methods
.method public addEventSendCallback(Lio/sentry/connection/EventSendCallback;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->actualConnection:Lio/sentry/connection/Connection;

    invoke-interface {v0, p1}, Lio/sentry/connection/Connection;->addEventSendCallback(Lio/sentry/connection/EventSendCallback;)V

    return-void
.end method

.method public close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 134
    iget-boolean v0, p0, Lio/sentry/connection/BufferedConnection;->gracefulShutdown:Z

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->shutDownHook:Lio/sentry/connection/BufferedConnection$ShutDownHook;

    invoke-static {v0}, Lio/sentry/util/Util;->safelyRemoveShutdownHook(Ljava/lang/Thread;)Z

    .line 136
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->shutDownHook:Lio/sentry/connection/BufferedConnection$ShutDownHook;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/sentry/connection/BufferedConnection$ShutDownHook;->access$102(Lio/sentry/connection/BufferedConnection$ShutDownHook;Z)Z

    .line 139
    :cond_0
    sget-object v0, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    const-string v1, "Gracefully shutting down Sentry buffer threads."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Lio/sentry/connection/BufferedConnection;->closed:Z

    .line 141
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 143
    :try_start_0
    iget-wide v0, p0, Lio/sentry/connection/BufferedConnection;->shutdownTimeout:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    const-wide/16 v0, 0x1388

    .line 147
    :goto_0
    iget-object v2, p0, Lio/sentry/connection/BufferedConnection;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v0, v1, v3}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 150
    :cond_1
    sget-object v2, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    const-string v3, "Still waiting on buffer flusher executor to terminate."

    invoke-interface {v2, v3}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_2
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v1, p0, Lio/sentry/connection/BufferedConnection;->shutdownTimeout:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 153
    sget-object v0, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    const-string v1, "Graceful shutdown took too much time, forcing the shutdown."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    move-result-object v0

    .line 155
    sget-object v1, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    const-string v2, "{} tasks failed to execute before the shutdown."

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    :cond_3
    :goto_1
    sget-object v0, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    const-string v1, "Shutdown finished."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    :goto_2
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->actualConnection:Lio/sentry/connection/Connection;

    invoke-interface {v0}, Lio/sentry/connection/Connection;->close()V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    .line 159
    :catch_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 160
    sget-object v0, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    const-string v1, "Graceful shutdown interrupted, forcing the shutdown."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    move-result-object v0

    .line 162
    sget-object v1, Lio/sentry/connection/BufferedConnection;->logger:Lorg/slf4j/Logger;

    const-string v2, "{} tasks failed to execute before the shutdown."

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_3
    return-void

    .line 164
    :goto_4
    iget-object v1, p0, Lio/sentry/connection/BufferedConnection;->actualConnection:Lio/sentry/connection/Connection;

    invoke-interface {v1}, Lio/sentry/connection/Connection;->close()V

    throw v0
.end method

.method public send(Lio/sentry/event/Event;)V
    .locals 3

    .line 105
    :try_start_0
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->actualConnection:Lio/sentry/connection/Connection;

    invoke-interface {v0, p1}, Lio/sentry/connection/Connection;->send(Lio/sentry/event/Event;)V
    :try_end_0
    .catch Lio/sentry/connection/ConnectionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection;->buffer:Lio/sentry/buffer/Buffer;

    invoke-interface {v0, p1}, Lio/sentry/buffer/Buffer;->discard(Lio/sentry/event/Event;)V

    return-void

    :catch_0
    move-exception v0

    .line 107
    invoke-virtual {v0}, Lio/sentry/connection/ConnectionException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/io/NotSerializableException;

    .line 109
    invoke-virtual {v0}, Lio/sentry/connection/ConnectionException;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    if-nez v1, :cond_0

    if-eqz v2, :cond_1

    .line 110
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x1ad

    if-eq v1, v2, :cond_1

    .line 114
    :cond_0
    iget-object v1, p0, Lio/sentry/connection/BufferedConnection;->buffer:Lio/sentry/buffer/Buffer;

    invoke-interface {v1, p1}, Lio/sentry/buffer/Buffer;->discard(Lio/sentry/event/Event;)V

    .line 118
    :cond_1
    throw v0
.end method

.method public wrapConnectionWithBufferWriter(Lio/sentry/connection/Connection;)Lio/sentry/connection/Connection;
    .locals 1

    .line 181
    new-instance v0, Lio/sentry/connection/BufferedConnection$2;

    invoke-direct {v0, p0, p1}, Lio/sentry/connection/BufferedConnection$2;-><init>(Lio/sentry/connection/BufferedConnection;Lio/sentry/connection/Connection;)V

    return-object v0
.end method
