.class Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/internal/IDisconnectedBufferCallback;


# instance fields
.field final this$0:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;


# direct methods
.method constructor <init>(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public publishBufferedMessage(Lorg/eclipse/paho/client/mqttv3/BufferedMessage;)V
    .locals 7

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->access$5(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    move-result-object v0

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getActualInFlight()I

    move-result v0

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->access$5(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    move-result-object v1

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getMaxInFlight()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->access$0()Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object v0

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->access$1()Ljava/lang/String;

    move-result-object v1

    const-string v3, "notifyReconnect"

    const-string v4, "510"

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    move-result-object v6

    invoke-virtual {v6}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v5

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    move-result-object v1

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getToken()Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->internalSend(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$1;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->access$5(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    move-result-object v0

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->unPersistBufferedMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_1
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->access$0()Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object p1

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->access$1()Ljava/lang/String;

    move-result-object v0

    const-string v1, "notifyReconnect"

    const-string v2, "208"

    invoke-interface {p1, v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7d68

    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1
.end method
