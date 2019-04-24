.class public Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;
.super Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;


# static fields
.field public static final KEY:Ljava/lang/String; = "Con"


# instance fields
.field private returnCode:I

.field private sessionPresent:Z


# direct methods
.method public constructor <init>(B[B)V
    .locals 1

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;-><init>(B)V

    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p2, Ljava/io/DataInputStream;

    invoke-direct {p2, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result p1

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->sessionPresent:Z

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result p1

    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->returnCode:I

    invoke-virtual {p2}, Ljava/io/DataInputStream;->close()V

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    const-string v0, "Con"

    return-object v0
.end method

.method public getReturnCode()I
    .locals 1

    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->returnCode:I

    return v0
.end method

.method public getSessionPresent()Z
    .locals 1

    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->sessionPresent:Z

    return v0
.end method

.method protected getVariableHeader()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public isMessageIdRequired()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v1, " session present:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->sessionPresent:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    const-string v1, " return code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
