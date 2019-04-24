.class public Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;
.super Ljava/lang/Object;
.source "TMonitorClientImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
.implements Ljava/lang/Runnable;


# static fields
.field private static final FLUSH_DELAY:I = 0x1f4

.field private static final MAX_CONNECTION_ATTEMPTS:I = 0x64

.field private static final RETRY_CONNECTION_DELAY:J = 0x1388L

.field private static final SOCKET_TIMEOUT:I = 0x1388

.field private static final T_MONITOR_IP:Ljava/lang/String; = "10.0.2.2"

.field private static final T_MONITOR_PORT:I = 0x1e61


# instance fields
.field private final buffer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;"
        }
    .end annotation
.end field

.field private connectionAttempts:I

.field private final events:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private thread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->buffer:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->events:Ljava/util/List;

    const/4 v0, 0x0

    .line 38
    iput v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->connectionAttempts:I

    return-void
.end method

.method private closeOutput(Ljava/io/PrintWriter;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 158
    invoke-virtual {p1}, Ljava/io/PrintWriter;->close()V

    :cond_0
    return-void
.end method

.method private closeSocket(Ljava/net/Socket;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 165
    :try_start_0
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private flushEvents(Ljava/io/InputStream;Ljava/io/PrintWriter;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 175
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->events:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->buffer:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->buffer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->events:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 182
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 184
    sget-object v2, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 185
    invoke-virtual {v2, v4, v3}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v2

    invoke-interface {v2, v1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 184
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 187
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v1

    if-ne v1, v4, :cond_0

    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 188
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Detected error sending data to SocketServer."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 178
    iget-object p2, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method private openOutput(Ljava/net/Socket;)Ljava/io/PrintWriter;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 153
    new-instance v0, Ljava/io/PrintWriter;

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V

    return-object v0
.end method

.method private openSocket()Ljava/net/Socket;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 144
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0}, Ljava/net/Socket;-><init>()V

    const/4 v1, 0x1

    .line 145
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setKeepAlive(Z)V

    const/16 v1, 0x1388

    .line 146
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 147
    new-instance v2, Ljava/net/InetSocketAddress;

    const-string v3, "10.0.2.2"

    const/16 v4, 0x1e61

    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v2, v1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    return-object v0
.end method

.method private shouldStillRun()Z
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 135
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 137
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->buffer:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    iget-object p1, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public notify(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)V"
        }
    .end annotation

    .line 81
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 82
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public run()V
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    .line 91
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->shouldStillRun()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->connectionAttempts:I

    const/16 v4, 0x64

    if-ge v2, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 92
    iput v2, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->connectionAttempts:I

    const-string v2, "Attempting TMonitor connection: attempt #%1$d"

    const/4 v4, 0x1

    .line 93
    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->connectionAttempts:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->openSocket()Ljava/net/Socket;

    move-result-object v0

    const-string v2, "Successfully connected with SocketServer"

    .line 98
    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->openOutput(Ljava/net/Socket;)Ljava/io/PrintWriter;

    move-result-object v1

    .line 101
    iput v3, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->connectionAttempts:I

    :goto_1
    const-wide/16 v4, 0x1f4

    .line 104
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 105
    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->flushEvents(Ljava/io/InputStream;Ljava/io/PrintWriter;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    const-string v4, "Failed to communicate with SocketServer."

    .line 108
    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v2, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    instance-of v2, v2, Ljava/lang/InterruptedException;

    if-eqz v2, :cond_0

    const-string v2, "Interrupted while working."

    .line 111
    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->closeOutput(Ljava/io/PrintWriter;)V

    .line 116
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->closeSocket(Ljava/net/Socket;)V

    goto :goto_3

    .line 115
    :cond_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->closeOutput(Ljava/io/PrintWriter;)V

    .line 116
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->closeSocket(Ljava/net/Socket;)V

    const-wide/16 v4, 0x1388

    .line 120
    :try_start_2
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    const-string v0, "Interrupted waiting for connection retry."

    .line 122
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 115
    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->closeOutput(Ljava/io/PrintWriter;)V

    .line 116
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->closeSocket(Ljava/net/Socket;)V

    throw v2

    :cond_1
    :goto_3
    const-string v0, "Stopped."

    .line 127
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public start()V
    .locals 3

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Already running."

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    .line 49
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/Thread;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const-string v0, "Started."

    .line 51
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public stop()V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 61
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->thread:Ljava/lang/Thread;

    const-string v0, "Stop requested."

    const/4 v1, 0x0

    .line 64
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
