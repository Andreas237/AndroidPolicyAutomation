.class public Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;
.super Ljava/util/prefs/AbstractPreferences;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Base64Encoder"
.end annotation


# instance fields
.field private base64String:Ljava/lang/String;

.field final this$0:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;)V
    .locals 1

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->this$0:Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64;

    const-string p1, ""

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Ljava/util/prefs/AbstractPreferences;-><init>(Ljava/util/prefs/AbstractPreferences;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->base64String:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected childSpi(Ljava/lang/String;)Ljava/util/prefs/AbstractPreferences;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected childrenNamesSpi()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected flushSpi()V
    .locals 0

    return-void
.end method

.method public getBase64String()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->base64String:Ljava/lang/String;

    return-object v0
.end method

.method protected getSpi(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected keysSpi()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected putSpi(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/websocket/Base64$Base64Encoder;->base64String:Ljava/lang/String;

    return-void
.end method

.method protected removeNodeSpi()V
    .locals 0

    return-void
.end method

.method protected removeSpi(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected syncSpi()V
    .locals 0

    return-void
.end method
