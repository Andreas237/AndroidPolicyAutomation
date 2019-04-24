.class public Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubAck;
.super Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    const/16 p1, 0xb

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;-><init>(B)V

    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p2, Ljava/io/DataInputStream;

    invoke-direct {p2, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p1

    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubAck;->msgId:I

    invoke-virtual {p2}, Ljava/io/DataInputStream;->close()V

    return-void
.end method


# virtual methods
.method protected getVariableHeader()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
