.class public Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttPersistable;


# instance fields
.field private hLength:I

.field private hOffset:I

.field private header:[B

.field private key:Ljava/lang/String;

.field private pLength:I

.field private pOffset:I

.field private payload:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[BII[BII)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->key:Ljava/lang/String;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->header:[B

    const/4 v1, 0x0

    iput v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->hOffset:I

    iput v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->hLength:I

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->payload:[B

    iput v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->pOffset:I

    iput v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->pLength:I

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->key:Ljava/lang/String;

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->header:[B

    iput p3, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->hOffset:I

    iput p4, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->hLength:I

    iput-object p5, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->payload:[B

    iput p6, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->pOffset:I

    iput p7, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->pLength:I

    return-void
.end method


# virtual methods
.method public getHeaderBytes()[B
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->header:[B

    return-object v0
.end method

.method public getHeaderLength()I
    .locals 1

    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->hLength:I

    return v0
.end method

.method public getHeaderOffset()I
    .locals 1

    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->hOffset:I

    return v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getPayloadBytes()[B
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->payload:[B

    return-object v0
.end method

.method public getPayloadLength()I
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->payload:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->pLength:I

    return v0
.end method

.method public getPayloadOffset()I
    .locals 1

    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;->pOffset:I

    return v0
.end method
