.class public Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;
.super Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;


# instance fields
.field private count:I

.field private names:[Ljava/lang/String;


# direct methods
.method public constructor <init>(B[B)V
    .locals 3

    const/16 p1, 0xa

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;-><init>(B)V

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p2, Ljava/io/DataInputStream;

    invoke-direct {p2, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    iput v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->msgId:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->count:I

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->names:[Ljava/lang/String;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/io/DataInputStream;->close()V

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->names:[Ljava/lang/String;

    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->count:I

    invoke-virtual {p0, p2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->decodeUTF8(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, p1, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public constructor <init>([Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;-><init>(B)V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->names:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected getMessageInfo()B
    .locals 1

    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->duplicate:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    or-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    return v0
.end method

.method public getPayload()[B
    .locals 4

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->names:[Ljava/lang/String;

    array-length v3, v3

    if-lt v2, v3, :cond_0

    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->names:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {p0, v1, v3}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->encodeUTF8(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected getVariableHeader()[B
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iget v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->msgId:I

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public isRetryable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " names:["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->count:I

    if-lt v1, v2, :cond_0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    if-lez v1, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;->names:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
