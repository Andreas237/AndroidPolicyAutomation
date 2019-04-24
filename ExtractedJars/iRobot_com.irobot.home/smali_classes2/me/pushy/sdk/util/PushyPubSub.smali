.class public Lme/pushy/sdk/util/PushyPubSub;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static subscribe([Ljava/lang/String;Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lme/pushy/sdk/util/PushyAuthentication;->getDeviceCredentials(Landroid/content/Context;)Lme/pushy/sdk/model/PushyDeviceCredentials;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    const-string p1, "Subscribe failed: The device is not registered for push notifications."

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    iget-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    invoke-static {v1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-static {v1, p1}, Lme/pushy/sdk/util/PushyAuthentication;->obtainDeviceAuthKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subscribe failed due to a missing device auth key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_1
    new-instance v1, Lme/pushy/sdk/model/api/PushyPubSubRequest;

    invoke-direct {v1, p0, v0}, Lme/pushy/sdk/model/api/PushyPubSubRequest;-><init>([Ljava/lang/String;Lme/pushy/sdk/model/PushyDeviceCredentials;)V

    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object p0

    invoke-virtual {p0, v1}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lme/pushy/sdk/util/PushyEndpoints;->getAPIEndpoint(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/devices/subscribe"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lme/pushy/sdk/util/PushyHTTP;->post(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :try_start_2
    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object p1

    const-class v0, Lme/pushy/sdk/model/api/PushyPubSubResponse;

    invoke-virtual {p1, p0, v0}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    iget-object p1, p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;->error:Ljava/lang/String;

    invoke-static {p1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subscribe failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;->error:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p0, p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;->success:Z

    if-nez p0, :cond_3

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    const-string p1, "Subscribe failed: An unexpected response was encountered."

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void

    :catch_1
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subscribe failed due to invalid response:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_2
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subscribe failed due to invalid JSON:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static unsubscribe([Ljava/lang/String;Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lme/pushy/sdk/util/PushyAuthentication;->getDeviceCredentials(Landroid/content/Context;)Lme/pushy/sdk/model/PushyDeviceCredentials;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    const-string p1, "Unsubscribe failed: The device is not registered for push notifications."

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    iget-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    invoke-static {v1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-static {v1, p1}, Lme/pushy/sdk/util/PushyAuthentication;->obtainDeviceAuthKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsubscribe failed due to a missing device auth key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_1
    new-instance v1, Lme/pushy/sdk/model/api/PushyPubSubRequest;

    invoke-direct {v1, p0, v0}, Lme/pushy/sdk/model/api/PushyPubSubRequest;-><init>([Ljava/lang/String;Lme/pushy/sdk/model/PushyDeviceCredentials;)V

    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object p0

    invoke-virtual {p0, v1}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lme/pushy/sdk/util/PushyEndpoints;->getAPIEndpoint(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/devices/unsubscribe"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lme/pushy/sdk/util/PushyHTTP;->post(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :try_start_2
    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object p1

    const-class v0, Lme/pushy/sdk/model/api/PushyPubSubResponse;

    invoke-virtual {p1, p0, v0}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    iget-object p1, p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;->error:Ljava/lang/String;

    invoke-static {p1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsubscribe failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;->error:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p0, p0, Lme/pushy/sdk/model/api/PushyPubSubResponse;->success:Z

    if-nez p0, :cond_3

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    const-string p1, "Unsubscribe failed: An unexpected response was encountered."

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void

    :catch_1
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsubscribe failed due to invalid response:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_2
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyPubSubException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsubscribe failed due to invalid JSON:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyPubSubException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
