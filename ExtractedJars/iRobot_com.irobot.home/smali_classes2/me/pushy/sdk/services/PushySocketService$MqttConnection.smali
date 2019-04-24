.class Lme/pushy/sdk/services/PushySocketService$MqttConnection;
.super Ljava/lang/Object;

# interfaces
.implements Lme/pushy/sdk/lib/paho/MqttCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/pushy/sdk/services/PushySocketService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MqttConnection"
.end annotation


# instance fields
.field mClient:Lme/pushy/sdk/lib/paho/MqttClient;

.field mIsConnecting:Z

.field mNetwork:I

.field final synthetic this$0:Lme/pushy/sdk/services/PushySocketService;


# direct methods
.method private constructor <init>(Lme/pushy/sdk/services/PushySocketService;)V
    .locals 0

    iput-object p1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lme/pushy/sdk/services/PushySocketService;Lme/pushy/sdk/services/PushySocketService$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;-><init>(Lme/pushy/sdk/services/PushySocketService;)V

    return-void
.end method

.method private publish(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {v0}, Lme/pushy/sdk/lib/paho/MqttClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-static {}, Lme/pushy/sdk/services/PushySocketService;->access$1100()I

    move-result v1

    invoke-static {}, Lme/pushy/sdk/services/PushySocketService;->access$1200()Z

    move-result v2

    invoke-virtual {v0, p1, p2, v1, v2}, Lme/pushy/sdk/lib/paho/MqttClient;->publish(Ljava/lang/String;[BIZ)V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Publish failed: not connected"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private subscribeToTopic(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-static {}, Lme/pushy/sdk/services/PushySocketService;->access$1100()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lme/pushy/sdk/lib/paho/MqttClient;->subscribe(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public connect()V
    .locals 8

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->disconnectExistingClient()V

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v0}, Lme/pushy/sdk/services/PushySocketService;->access$500(Lme/pushy/sdk/services/PushySocketService;)I

    move-result v0

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v1}, Lme/pushy/sdk/util/PushyEndpoints;->getMQTTEndpoint(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v2}, Lme/pushy/sdk/util/PushyAuthentication;->getDeviceCredentials(Landroid/content/Context;)Lme/pushy/sdk/model/PushyDeviceCredentials;

    move-result-object v2

    iget-object v3, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-static {v3}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "The device is not registered."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v3, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    invoke-static {v3}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    iget-object v4, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v3, v4}, Lme/pushy/sdk/util/PushyAuthentication;->obtainDeviceAuthKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    :cond_1
    const-string v3, "Pushy"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Broker: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v3, "Pushy"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Client ID: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v3, "Pushy"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Client Auth: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    const/16 v6, 0x16

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "... [truncated]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Lme/pushy/sdk/lib/paho/MqttClient;

    iget-object v4, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    new-instance v5, Lme/pushy/sdk/lib/paho/persist/MemoryPersistence;

    invoke-direct {v5}, Lme/pushy/sdk/lib/paho/persist/MemoryPersistence;-><init>()V

    invoke-direct {v3, v1, v4, v5}, Lme/pushy/sdk/lib/paho/MqttClient;-><init>(Ljava/lang/String;Ljava/lang/String;Lme/pushy/sdk/lib/paho/MqttClientPersistence;)V

    iput-object v3, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {v1, p0}, Lme/pushy/sdk/lib/paho/MqttClient;->setCallback(Lme/pushy/sdk/lib/paho/MqttCallback;)V

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-static {}, Lme/pushy/sdk/services/PushySocketService;->access$600()S

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v1, v3, v4}, Lme/pushy/sdk/lib/paho/MqttClient;->setTimeToWait(J)V

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v1}, Lme/pushy/sdk/services/PushySocketService;->access$400(Lme/pushy/sdk/services/PushySocketService;)I

    move-result v1

    iput v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mNetwork:I

    new-instance v1, Lme/pushy/sdk/lib/paho/MqttConnectOptions;

    invoke-direct {v1}, Lme/pushy/sdk/lib/paho/MqttConnectOptions;-><init>()V

    iget-object v3, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lme/pushy/sdk/lib/paho/MqttConnectOptions;->setUserName(Ljava/lang/String;)V

    iget-object v2, v2, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    invoke-virtual {v1, v2}, Lme/pushy/sdk/lib/paho/MqttConnectOptions;->setPassword([C)V

    invoke-virtual {v1, v7}, Lme/pushy/sdk/lib/paho/MqttConnectOptions;->setAutomaticReconnect(Z)V

    invoke-virtual {v1, v7}, Lme/pushy/sdk/lib/paho/MqttConnectOptions;->setCleanSession(Z)V

    invoke-static {}, Lme/pushy/sdk/services/PushySocketService;->access$700()S

    move-result v2

    invoke-virtual {v1, v2}, Lme/pushy/sdk/lib/paho/MqttConnectOptions;->setConnectionTimeout(I)V

    invoke-virtual {v1, v0}, Lme/pushy/sdk/lib/paho/MqttConnectOptions;->setKeepAliveInterval(I)V

    iget-object v2, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {v2, v1}, Lme/pushy/sdk/lib/paho/MqttClient;->connect(Lme/pushy/sdk/lib/paho/MqttConnectOptions;)V

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {v1}, Lme/pushy/sdk/lib/paho/MqttClient;->getClientId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->subscribeToTopic(Ljava/lang/String;)V

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v1}, Lme/pushy/sdk/services/PushySocketService;->access$800(Lme/pushy/sdk/services/PushySocketService;)V

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v2, v3}, Lme/pushy/sdk/services/PushySocketService;->access$902(Lme/pushy/sdk/services/PushySocketService;J)J

    const-string v1, "Pushy"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Connected successfully (sending keep alive every "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " seconds)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v0}, Lme/pushy/sdk/services/PushySocketService;->access$1000(Lme/pushy/sdk/services/PushySocketService;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->disconnectExistingClient()V

    const-string v0, "Pushy"

    const-string v1, "Service destroyed, aborting connection"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public connectionLost(Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "Pushy"

    const-string v0, "Connection lost"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$300(Lme/pushy/sdk/services/PushySocketService;)V

    return-void
.end method

.method public deliveryComplete(Lme/pushy/sdk/lib/paho/IMqttDeliveryToken;)V
    .locals 0

    return-void
.end method

.method public disconnectExistingClient()V
    .locals 3

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {v0}, Lme/pushy/sdk/lib/paho/MqttClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2, v1, v2}, Lme/pushy/sdk/lib/paho/MqttClient;->disconnectForcibly(JJ)V

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {v0}, Lme/pushy/sdk/lib/paho/MqttClient;->close()V
    :try_end_0
    .catch Lme/pushy/sdk/lib/paho/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public getNetwork()I
    .locals 1

    iget v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mNetwork:I

    return v0
.end method

.method public isConnected()Z
    .locals 1

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mClient:Lme/pushy/sdk/lib/paho/MqttClient;

    invoke-virtual {v0}, Lme/pushy/sdk/lib/paho/MqttClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isConnecting()Z
    .locals 1

    iget-boolean v0, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mIsConnecting:Z

    return v0
.end method

.method public messageArrived(Ljava/lang/String;Lme/pushy/sdk/lib/paho/MqttMessage;)V
    .locals 3

    const-string v0, "Pushy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received push for package "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p2}, Lme/pushy/sdk/lib/paho/MqttMessage;->getPayload()[B

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->parsePayload([BLandroid/content/Intent;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "pushy.me"

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-virtual {p1, v0}, Lme/pushy/sdk/services/PushySocketService;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method parsePayload([BLandroid/content/Intent;)V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object p1

    const-class v1, Ljava/util/Map;

    invoke-virtual {p1, v0, v1}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    if-ne v1, v2, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    if-ne v1, v2, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Integer;

    if-ne v1, v2, :cond_4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Long;

    if-ne v1, v2, :cond_5

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_5
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Double;

    if-eq v1, v2, :cond_6

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Float;

    if-ne v1, v2, :cond_7

    :cond_6
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_7
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/ArrayList;

    if-ne v1, v2, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Pushy"

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    return-void
.end method

.method public sendKeepAlive()V
    .locals 2

    const-string v0, "keepalive"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->publish(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setConnecting(Z)V
    .locals 0

    iput-boolean p1, p0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->mIsConnecting:Z

    return-void
.end method
