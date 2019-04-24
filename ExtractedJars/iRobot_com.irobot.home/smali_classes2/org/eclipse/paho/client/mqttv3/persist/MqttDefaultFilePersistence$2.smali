.class Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/FileFilter;


# instance fields
.field final this$0:Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;


# direct methods
.method constructor <init>(Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence$2;->this$0:Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".bup"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
