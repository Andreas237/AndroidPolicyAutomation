.class Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;
.super Ljava/io/ByteArrayOutputStream;


# instance fields
.field final this$0:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;


# direct methods
.method constructor <init>(Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;

    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public flush()V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;->reset()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;-><init>(BZ[B)V

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;->encodeFrame()[B

    move-result-object v0

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;

    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->access$0(Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;)Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;

    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->access$0(Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;)Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
