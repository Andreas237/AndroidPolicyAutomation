.class Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$2;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# instance fields
.field final this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;


# direct methods
.method constructor <init>(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$2;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 5

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$0()Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object p2

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$1()Ljava/lang/String;

    move-result-object v0

    const-string v1, "attemptReconnect"

    const-string v2, "502"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p1

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-interface {p2, v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$6()I

    move-result p1

    const p2, 0x1f400

    if-ge p1, p2, :cond_0

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$6()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$7(I)V

    :cond_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$2;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$6()I

    move-result p2

    invoke-static {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$8(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;I)V

    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 6

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$0()Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object v0

    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$1()Ljava/lang/String;

    move-result-object v1

    const-string v2, "attemptReconnect"

    const-string v3, "501"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p1

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$2;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {p1, v5}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->setRestingState(Z)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$2;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$5(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)V

    return-void
.end method
