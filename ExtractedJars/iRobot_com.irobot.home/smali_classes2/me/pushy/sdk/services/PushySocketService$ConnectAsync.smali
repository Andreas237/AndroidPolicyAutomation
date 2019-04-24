.class public Lme/pushy/sdk/services/PushySocketService$ConnectAsync;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/pushy/sdk/services/PushySocketService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ConnectAsync"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lme/pushy/sdk/services/PushySocketService;


# direct methods
.method public constructor <init>(Lme/pushy/sdk/services/PushySocketService;)V
    .locals 1

    iput-object p1, p0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->setConnecting(Z)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 4

    const-string p1, "Pushy"

    const-string v0, "Connecting..."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v0}, Lme/pushy/sdk/services/PushySocketService;->access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    move-result-object v0

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->connect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Pushy"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Connect exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lme/pushy/sdk/util/exceptions/PushyFatalException;

    if-ne v1, v2, :cond_0

    const-string v0, "Pushy"

    const-string v1, "Fatal error encountered, stopping service"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService;->stopSelf()V

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lme/pushy/sdk/lib/paho/MqttSecurityException;

    if-ne v1, v2, :cond_1

    check-cast v0, Lme/pushy/sdk/lib/paho/MqttSecurityException;

    invoke-virtual {v0}, Lme/pushy/sdk/lib/paho/MqttSecurityException;->getReasonCode()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    const-string v0, "Pushy"

    const-string v1, "MQTT connect returned error code 5, clearing the device credentials"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v0}, Lme/pushy/sdk/util/PushyAuthentication;->clearDeviceCredentials(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v0}, Lme/pushy/sdk/services/PushySocketService;->access$100(Lme/pushy/sdk/services/PushySocketService;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService;->scheduleReconnect()V

    :cond_2
    :goto_2
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {v0}, Lme/pushy/sdk/services/PushySocketService;->access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->setConnecting(Z)V

    goto :goto_1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->doInBackground([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
