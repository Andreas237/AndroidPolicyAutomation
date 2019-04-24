.class public Lme/pushy/sdk/util/PushyEndpoints;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAPIEndpoint(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, "pushyEnterpriseAPIEndpoint"

    const-string v1, "https://api.pushy.me"

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getString(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getMQTTEndpoint(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, "pushyEnterpriseMQTTEndpoint"

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getString(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "pushyDirectConnectivity"

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getBoolean(Ljava/lang/String;ZLandroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "tcp://mqtt.pushy.me:1883"

    return-object p0

    :cond_1
    const-string p0, "https://mqtt.pushy.me/ip"

    const-string v0, "tcp"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    invoke-static {p0}, Lme/pushy/sdk/util/PushyHTTP;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p0, Ljava/lang/Exception;

    const-string v0, "Failed to retrieve MQTT broker IP."

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tcp://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x75b

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
