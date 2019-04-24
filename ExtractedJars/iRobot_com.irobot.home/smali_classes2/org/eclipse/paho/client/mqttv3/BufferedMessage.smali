.class public Lorg/eclipse/paho/client/mqttv3/BufferedMessage;
.super Ljava/lang/Object;


# instance fields
.field private message:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

.field private token:Lorg/eclipse/paho/client/mqttv3/MqttToken;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->message:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->token:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    return-void
.end method


# virtual methods
.method public getMessage()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->message:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    return-object v0
.end method

.method public getToken()Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->token:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    return-object v0
.end method
