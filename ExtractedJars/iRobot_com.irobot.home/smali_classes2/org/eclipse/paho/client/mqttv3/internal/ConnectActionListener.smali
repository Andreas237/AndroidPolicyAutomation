.class public Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# instance fields
.field private client:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

.field private comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

.field private mqttCallbackExtended:Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

.field private options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

.field private originalMqttVersion:I

.field private persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

.field private reconnect:Z

.field private userCallback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

.field private userContext:Ljava/lang/Object;

.field private userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Lorg/eclipse/paho/client/mqttv3/MqttToken;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->client:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    iput-object p3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    iput-object p4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    iput-object p5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iput-object p6, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userContext:Ljava/lang/Object;

    iput-object p7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userCallback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    invoke-virtual {p4}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMqttVersion()I

    move-result p1

    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->originalMqttVersion:I

    iput-boolean p8, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->reconnect:Z

    return-void
.end method


# virtual methods
.method public connect()V
    .locals 4

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->client:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->setActionCallback(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    invoke-virtual {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->setUserContext(Ljava/lang/Object;)V

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->client:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->client:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {v3}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->getServerURI()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->open(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->clear()V

    :cond_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMqttVersion()I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setMqttVersion(I)V

    :cond_1
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1, v2, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {p0, v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getNetworkModules()[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    move-result-object v0

    array-length v0, v0

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getNetworkModuleIndex()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x4

    if-lt v1, v0, :cond_3

    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->originalMqttVersion:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMqttVersion()I

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->originalMqttVersion:I

    if-nez p1, :cond_1

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setMqttVersion(I)V

    :cond_1
    instance-of p1, p2, Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-eqz p1, :cond_2

    move-object p1, p2

    check-cast p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    goto :goto_0

    :cond_2
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v0, v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->markComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->notifyComplete()V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->client:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setClient(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userCallback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userContext:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->setUserContext(Ljava/lang/Object;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userCallback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-interface {p1, v0, p2}, Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;->onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_1
    iget p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->originalMqttVersion:I

    if-nez p2, :cond_5

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMqttVersion()I

    move-result p2

    if-ne p2, v2, :cond_4

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setMqttVersion(I)V

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {p2, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setMqttVersion(I)V

    :cond_5
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {p2, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->setNetworkModuleIndex(I)V

    :goto_2
    :try_start_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->connect()V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    invoke-virtual {p0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V

    :cond_6
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 2

    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->originalMqttVersion:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->options:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setMqttVersion(I)V

    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v0, v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getResponse()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->markComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->notifyComplete()V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->client:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setClient(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    iget-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->reconnect:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->notifyReconnect()V

    :cond_1
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userCallback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userContext:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->setUserContext(Ljava/lang/Object;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userCallback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->userToken:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-interface {p1, v0}, Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;->onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V

    :cond_2
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->mqttCallbackExtended:Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getNetworkModules()[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    move-result-object p1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getNetworkModuleIndex()I

    move-result v0

    aget-object p1, p1, v0

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;->getServerURI()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->mqttCallbackExtended:Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->reconnect:Z

    invoke-interface {v0, v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;->connectComplete(ZLjava/lang/String;)V

    :cond_3
    return-void
.end method

.method public setMqttCallbackExtended(Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ConnectActionListener;->mqttCallbackExtended:Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

    return-void
.end method
