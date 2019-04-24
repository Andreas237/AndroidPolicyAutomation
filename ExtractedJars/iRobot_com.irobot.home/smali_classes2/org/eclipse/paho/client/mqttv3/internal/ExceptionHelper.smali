.class public Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;
    .locals 1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(I)V

    return-object v0
.end method

.method public static createMqttException(Ljava/lang/Throwable;)Lorg/eclipse/paho/client/mqttv3/MqttException;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.security.GeneralSecurityException"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static isClassAvailable(Ljava/lang/String;)Z
    .locals 0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method
