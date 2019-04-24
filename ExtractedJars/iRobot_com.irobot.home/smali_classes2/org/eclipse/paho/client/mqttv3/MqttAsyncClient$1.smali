.class Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;


# instance fields
.field final this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

.field private final val$automaticReconnect:Z


# direct methods
.method constructor <init>(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;Z)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$1;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    iput-boolean p2, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$1;->val$automaticReconnect:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public connectComplete(ZLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public connectionLost(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$1;->val$automaticReconnect:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$1;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->setRestingState(Z)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$1;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-static {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$3(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;Z)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$1;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$4(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)V

    :cond_0
    return-void
.end method

.method public deliveryComplete(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)V
    .locals 0

    return-void
.end method

.method public messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 0

    return-void
.end method
