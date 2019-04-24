.class public Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final CLASS_NAME:Ljava/lang/String; = "DisconnectedMessageBuffer"

.field private static final log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;


# instance fields
.field private bufLock:Ljava/lang/Object;

.field private buffer:Ljava/util/ArrayList;

.field private bufferOpts:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

.field private callback:Lorg/eclipse/paho/client/mqttv3/internal/IDisconnectedBufferCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    const-string v1, "DisconnectedMessageBuffer"

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufLock:Ljava/lang/Object;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufferOpts:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public deleteMessage(I)V
    .locals 2

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getMessage(I)Lorg/eclipse/paho/client/mqttv3/BufferedMessage;
    .locals 2

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getMessageCount()I
    .locals 2

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public putMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 2

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    invoke-direct {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufLock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufferOpts:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;->getBufferSize()I

    move-result v1

    if-ge p2, v1, :cond_0

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->bufferOpts:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;->isDeleteOldestMessages()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->buffer:Ljava/util/ArrayList;

    goto :goto_0

    :goto_1
    monitor-exit p1

    return-void

    :cond_1
    new-instance p2, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v0, 0x7dcb

    invoke-direct {p2, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public run()V
    .locals 4

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    const-string v1, "DisconnectedMessageBuffer"

    const-string v2, "run"

    const-string v3, "516"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->getMessageCount()I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->getMessage(I)Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    move-result-object v1

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->callback:Lorg/eclipse/paho/client/mqttv3/internal/IDisconnectedBufferCallback;

    invoke-interface {v2, v1}, Lorg/eclipse/paho/client/mqttv3/internal/IDisconnectedBufferCallback;->publishBufferedMessage(Lorg/eclipse/paho/client/mqttv3/BufferedMessage;)V

    invoke-virtual {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->deleteMessage(I)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    const-string v1, "DisconnectedMessageBuffer"

    const-string v2, "run"

    const-string v3, "517"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->warning(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setPublishCallback(Lorg/eclipse/paho/client/mqttv3/internal/IDisconnectedBufferCallback;)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->callback:Lorg/eclipse/paho/client/mqttv3/internal/IDisconnectedBufferCallback;

    return-void
.end method
