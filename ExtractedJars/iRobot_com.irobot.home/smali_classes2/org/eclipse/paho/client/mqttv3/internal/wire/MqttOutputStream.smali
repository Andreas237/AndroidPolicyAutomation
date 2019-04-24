.class public Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;
.super Ljava/io/OutputStream;


# static fields
.field private static final CLASS_NAME:Ljava/lang/String;

.field static class$0:Ljava/lang/Class;

.field private static final log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;


# instance fields
.field private clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

.field private out:Ljava/io/BufferedOutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->class$0:Ljava/lang/Class;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "org.eclipse.paho.client.mqttv3.internal.wire.MqttOutputStream"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->class$0:Ljava/lang/Class;

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/NoClassDefFoundError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NoClassDefFoundError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->CLASS_NAME:Ljava/lang/String;

    const-string v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->CLASS_NAME:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/internal/ClientState;Ljava/io/OutputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    new-instance p1, Ljava/io/BufferedOutputStream;

    invoke-direct {p1, p2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    return-void
.end method

.method public write(I)V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/BufferedOutputStream;->write(I)V

    return-void
.end method

.method public write(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V
    .locals 6

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getHeader()[B

    move-result-object v0

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getPayload()[B

    move-result-object v1

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    array-length v3, v0

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v3}, Ljava/io/BufferedOutputStream;->write([BII)V

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    array-length v0, v0

    invoke-virtual {v2, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifySentBytes(I)V

    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-lt v0, v2, :cond_0

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->CLASS_NAME:Ljava/lang/String;

    const-string v2, "write"

    const-string v3, "500"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v4

    invoke-interface {v0, v1, v2, v3, v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    array-length v2, v1

    sub-int/2addr v2, v0

    const/16 v3, 0x400

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    invoke-virtual {v3, v1, v0, v2}, Ljava/io/BufferedOutputStream;->write([BII)V

    add-int/lit16 v0, v0, 0x400

    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    invoke-virtual {v3, v2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifySentBytes(I)V

    goto :goto_0
.end method

.method public write([B)V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/BufferedOutputStream;->write([B)V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    array-length p1, p1

    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifySentBytes(I)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->out:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/BufferedOutputStream;->write([BII)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttOutputStream;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    invoke-virtual {p1, p3}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifySentBytes(I)V

    return-void
.end method
