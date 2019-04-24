.class public Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final CLASS_NAME:Ljava/lang/String;

.field static class$0:Ljava/lang/Class;

.field private static final log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;


# instance fields
.field private input:Ljava/io/InputStream;

.field private lifecycle:Ljava/lang/Object;

.field private pipedOutputStream:Ljava/io/PipedOutputStream;

.field private receiverThread:Ljava/lang/Thread;

.field private volatile receiving:Z

.field private running:Z

.field private stopping:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->class$0:Ljava/lang/Class;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "org.eclipse.paho.client.mqttv3.internal.websocket.WebSocketReceiver"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->class$0:Ljava/lang/Class;

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/NoClassDefFoundError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NoClassDefFoundError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->CLASS_NAME:Ljava/lang/String;

    const-string v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->CLASS_NAME:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/io/PipedInputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->running:Z

    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->stopping:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->lifecycle:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiverThread:Ljava/lang/Thread;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->input:Ljava/io/InputStream;

    new-instance p1, Ljava/io/PipedOutputStream;

    invoke-direct {p1}, Ljava/io/PipedOutputStream;-><init>()V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->pipedOutputStream:Ljava/io/PipedOutputStream;

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->pipedOutputStream:Ljava/io/PipedOutputStream;

    invoke-virtual {p2, p1}, Ljava/io/PipedInputStream;->connect(Ljava/io/PipedOutputStream;)V

    return-void
.end method

.method private closeOutputStream()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->pipedOutputStream:Ljava/io/PipedOutputStream;

    invoke-virtual {v0}, Ljava/io/PipedOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public isReceiving()Z
    .locals 1

    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiving:Z

    return v0
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->running:Z

    return v0
.end method

.method public run()V
    .locals 5

    :goto_0
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->running:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->input:Ljava/io/InputStream;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->CLASS_NAME:Ljava/lang/String;

    const-string v2, "run"

    const-string v3, "852"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->input:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiving:Z

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->input:Ljava/io/InputStream;

    invoke-direct {v0, v2}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;->isCloseFlag()Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;->getPayload()[B

    move-result-object v3

    array-length v3, v3

    if-lt v2, v3, :cond_2

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->pipedOutputStream:Ljava/io/PipedOutputStream;

    invoke-virtual {v0}, Ljava/io/PipedOutputStream;->flush()V

    goto :goto_3

    :cond_2
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->pipedOutputStream:Ljava/io/PipedOutputStream;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;->getPayload()[B

    move-result-object v4

    aget-byte v4, v4, v2

    invoke-virtual {v3, v4}, Ljava/io/PipedOutputStream;->write(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->stopping:Z

    if-nez v0, :cond_4

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Server sent a WebSocket Frame with the Stop OpCode"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiving:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->stop()V

    goto :goto_0

    :cond_5
    return-void
.end method

.method public start(Ljava/lang/String;)V
    .locals 4

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->CLASS_NAME:Ljava/lang/String;

    const-string v2, "start"

    const-string v3, "855"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->lifecycle:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->running:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->running:Z

    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiverThread:Ljava/lang/Thread;

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiverThread:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public stop()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->stopping:Z

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->lifecycle:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->CLASS_NAME:Ljava/lang/String;

    const-string v3, "stop"

    const-string v4, "850"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->running:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->running:Z

    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiving:Z

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->closeOutputStream()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiverThread:Ljava/lang/Thread;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    :try_start_1
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiverThread:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->receiverThread:Ljava/lang/Thread;

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->CLASS_NAME:Ljava/lang/String;

    const-string v2, "stop"

    const-string v3, "851"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method
