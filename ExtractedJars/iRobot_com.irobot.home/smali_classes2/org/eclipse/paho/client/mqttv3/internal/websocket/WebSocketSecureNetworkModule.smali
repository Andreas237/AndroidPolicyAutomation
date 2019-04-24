.class public Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;
.super Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;


# static fields
.field private static final CLASS_NAME:Ljava/lang/String;

.field static class$0:Ljava/lang/Class;

.field private static final log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;


# instance fields
.field private host:Ljava/lang/String;

.field private outputStream:Ljava/io/ByteArrayOutputStream;

.field private pipedInputStream:Ljava/io/PipedInputStream;

.field private port:I

.field recievedPayload:Ljava/nio/ByteBuffer;

.field private uri:Ljava/lang/String;

.field private webSocketReceiver:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->class$0:Ljava/lang/Class;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "org.eclipse.paho.client.mqttv3.internal.websocket.WebSocketSecureNetworkModule"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->class$0:Ljava/lang/Class;

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

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->CLASS_NAME:Ljava/lang/String;

    const-string v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->CLASS_NAME:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLSocketFactory;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p3, p4, p5}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;-><init>(Ljavax/net/ssl/SSLSocketFactory;Ljava/lang/String;ILjava/lang/String;)V

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;

    invoke-direct {p1, p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule$1;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;)V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->outputStream:Ljava/io/ByteArrayOutputStream;

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->uri:Ljava/lang/String;

    iput-object p3, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->host:Ljava/lang/String;

    iput p4, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->port:I

    new-instance p1, Ljava/io/PipedInputStream;

    invoke-direct {p1}, Ljava/io/PipedInputStream;-><init>()V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->pipedInputStream:Ljava/io/PipedInputStream;

    sget-object p1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    invoke-interface {p1, p5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->setResourceName(Ljava/lang/String;)V

    return-void
.end method

.method static access$0(Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;)Ljava/io/OutputStream;
    .locals 0

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->getSocketOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    return-object p0
.end method

.method private getSocketInputStream()Ljava/io/InputStream;
    .locals 1

    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method private getSocketOutputStream()Ljava/io/OutputStream;
    .locals 1

    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getInputStream()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->pipedInputStream:Ljava/io/PipedInputStream;

    return-object v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->outputStream:Ljava/io/ByteArrayOutputStream;

    return-object v0
.end method

.method public getServerURI()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuffer;

    const-string v1, "wss://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->host:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public start()V
    .locals 7

    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->start()V

    new-instance v6, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketHandshake;

    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->uri:Ljava/lang/String;

    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->host:Ljava/lang/String;

    iget v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->port:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketHandshake;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v6}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketHandshake;->execute()V

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->getSocketInputStream()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->pipedInputStream:Ljava/io/PipedInputStream;

    invoke-direct {v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;-><init>(Ljava/io/InputStream;Ljava/io/PipedInputStream;)V

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->webSocketReceiver:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->webSocketReceiver:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;

    const-string v1, "WssSocketReceiver"

    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->start(Ljava/lang/String;)V

    return-void
.end method

.method public stop()V
    .locals 4

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;

    const-string v1, "1000"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const/16 v2, 0x8

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;-><init>(BZ[B)V

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketFrame;->encodeFrame()[B

    move-result-object v0

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->getSocketOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->getSocketOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->webSocketReceiver:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketSecureNetworkModule;->webSocketReceiver:Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/WebSocketReceiver;->stop()V

    :cond_0
    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->stop()V

    return-void
.end method
