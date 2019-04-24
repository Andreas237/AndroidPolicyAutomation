.class public Lorg/eclipse/paho/client/mqttv3/MqttTopic;
.super Ljava/lang/Object;


# static fields
.field private static final MAX_TOPIC_LEN:I = 0xffff

.field private static final MIN_TOPIC_LEN:I = 0x1

.field public static final MULTI_LEVEL_WILDCARD:Ljava/lang/String; = "#"

.field public static final MULTI_LEVEL_WILDCARD_PATTERN:Ljava/lang/String; = "/#"

.field private static final NUL:C = '\u0000'

.field public static final SINGLE_LEVEL_WILDCARD:Ljava/lang/String; = "+"

.field public static final TOPIC_LEVEL_SEPARATOR:Ljava/lang/String; = "/"

.field public static final TOPIC_WILDCARDS:Ljava/lang/String; = "#+"


# instance fields
.field private comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->name:Ljava/lang/String;

    return-void
.end method

.method private createPublish(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;
    .locals 2

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;-><init>(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    return-object v0
.end method

.method public static isMatched(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p0, v2}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->validate(Ljava/lang/String;Z)V

    const/4 v3, 0x0

    invoke-static {p1, v3}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->validate(Ljava/lang/String;Z)V

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v2

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v1, :cond_7

    if-lt v5, v0, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2f

    if-ne v6, v7, :cond_2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v6, v7, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v8, 0x23

    const/16 v9, 0x2b

    if-eq v6, v9, :cond_3

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v6, v8, :cond_3

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v6, v10, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v9, :cond_5

    :goto_1
    add-int/lit8 v6, v5, 0x1

    if-ge v6, v0, :cond_6

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v8, :cond_6

    add-int/lit8 v5, v0, -0x1

    :cond_6
    :goto_2
    add-int/lit8 v4, v4, 0x1

    add-int/2addr v5, v2

    goto :goto_0

    :cond_7
    :goto_3
    if-ne v5, v0, :cond_8

    if-ne v4, v1, :cond_8

    return v2

    :cond_8
    return v3
.end method

.method public static validate(Ljava/lang/String;Z)V
    .locals 5

    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    const v1, 0xffff

    const/4 v2, 0x1

    if-lt v0, v2, :cond_6

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_4

    const-string p1, "#"

    const-string v0, "+"

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lorg/eclipse/paho/client/mqttv3/util/Strings;->equalsAny(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    const-string p1, "#"

    invoke-static {p0, p1}, Lorg/eclipse/paho/client/mqttv3/util/Strings;->countMatches(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result p1

    if-gt p1, v2, :cond_3

    const-string p1, "#"

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "/#"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->validateSingleLevelWildcard(Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuffer;

    const-string v1, "Invalid usage of multi-level wildcard in topic string: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p1, "#+"

    invoke-static {p0, p1}, Lorg/eclipse/paho/client/mqttv3/util/Strings;->containsAny(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The topic name MUST NOT contain any wildcard characters (#+)"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    return-void

    :cond_6
    :goto_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid topic length, should be in range[%d, %d]!"

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v2}, Ljava/lang/Integer;-><init>(I)V

    aput-object v4, v0, v3

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v1}, Ljava/lang/Integer;-><init>(I)V

    aput-object v3, v0, v2

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method private static validateSingleLevelWildcard(Ljava/lang/String;)V
    .locals 9

    const-string v0, "+"

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const-string v2, "/"

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-lt v5, v4, :cond_0

    return-void

    :cond_0
    add-int/lit8 v6, v5, -0x1

    if-ltz v6, :cond_1

    aget-char v6, v3, v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v7, v5, 0x1

    if-ge v7, v4, :cond_2

    aget-char v8, v3, v7

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    aget-char v5, v3, v5

    if-ne v5, v0, :cond_5

    if-eq v6, v2, :cond_3

    if-nez v6, :cond_4

    :cond_3
    if-eq v8, v2, :cond_5

    if-eqz v8, :cond_5

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid usage of single-level wildcard in topic string \'%s\'!"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move v5, v7

    goto :goto_0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->name:Ljava/lang/String;

    return-object v0
.end method

.method public publish(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;
    .locals 2

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v1

    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;->setMessage(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->createPublish(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->sendNoWait(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    iget-object p1, v0, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->waitUntilSent()V

    return-object v0
.end method

.method public publish([BIZ)Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;
    .locals 1

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;-><init>([B)V

    invoke-virtual {v0, p2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setQos(I)V

    invoke-virtual {v0, p3}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setRetained(Z)V

    invoke-virtual {p0, v0}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->publish(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
