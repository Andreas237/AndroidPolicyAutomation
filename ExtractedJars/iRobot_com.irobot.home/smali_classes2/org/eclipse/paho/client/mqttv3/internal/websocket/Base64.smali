.class public Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;
    }
.end annotation


# static fields
.field private static final encoder:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;

.field private static final instance:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;

    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;-><init>()V

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;->instance:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;->instance:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;)V

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;->encoder:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;->encoder:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;

    const-string v1, "akey"

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->putByteArray(Ljava/lang/String;[B)V

    sget-object p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;->encoder:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->getBase64String()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static encodeBytes([B)Ljava/lang/String;
    .locals 2

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;->encoder:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;

    const-string v1, "aKey"

    invoke-virtual {v0, v1, p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->putByteArray(Ljava/lang/String;[B)V

    sget-object p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;->encoder:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->getBase64String()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
