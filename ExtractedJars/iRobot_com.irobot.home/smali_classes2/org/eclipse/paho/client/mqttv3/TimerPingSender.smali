.class public Lorg/eclipse/paho/client/mqttv3/TimerPingSender;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttPingSender;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/eclipse/paho/client/mqttv3/TimerPingSender$PingTask;
    }
.end annotation


# static fields
.field private static final CLASS_NAME:Ljava/lang/String;

.field static class$0:Ljava/lang/Class;

.field private static final log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;


# instance fields
.field private comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

.field private timer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->class$0:Ljava/lang/Class;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "org.eclipse.paho.client.mqttv3.TimerPingSender"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->class$0:Ljava/lang/Class;

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

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->CLASS_NAME:Ljava/lang/String;

    const-string v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->CLASS_NAME:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static access$0()Lorg/eclipse/paho/client/mqttv3/logging/Logger;
    .locals 1

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    return-object v0
.end method

.method static access$1()Ljava/lang/String;
    .locals 1

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->CLASS_NAME:Ljava/lang/String;

    return-object v0
.end method

.method static access$2(Lorg/eclipse/paho/client/mqttv3/TimerPingSender;)Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;
    .locals 0

    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    return-object p0
.end method


# virtual methods
.method public init(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ClientComms cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    return-void
.end method

.method public schedule(J)V
    .locals 3

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->timer:Ljava/util/Timer;

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/TimerPingSender$PingTask;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lorg/eclipse/paho/client/mqttv3/TimerPingSender$PingTask;-><init>(Lorg/eclipse/paho/client/mqttv3/TimerPingSender;Lorg/eclipse/paho/client/mqttv3/TimerPingSender$PingTask;)V

    invoke-virtual {v0, v1, p1, p2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public start()V
    .locals 7

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v0

    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v2, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->CLASS_NAME:Ljava/lang/String;

    const-string v3, "start"

    const-string v4, "659"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-interface {v1, v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Ljava/util/Timer;

    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "MQTT Ping: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->timer:Ljava/util/Timer;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->timer:Ljava/util/Timer;

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/TimerPingSender$PingTask;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lorg/eclipse/paho/client/mqttv3/TimerPingSender$PingTask;-><init>(Lorg/eclipse/paho/client/mqttv3/TimerPingSender;Lorg/eclipse/paho/client/mqttv3/TimerPingSender$PingTask;)V

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getKeepAlive()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public stop()V
    .locals 5

    sget-object v0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->CLASS_NAME:Ljava/lang/String;

    const-string v2, "stop"

    const-string v3, "661"

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/TimerPingSender;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    return-void
.end method
