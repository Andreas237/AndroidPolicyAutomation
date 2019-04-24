.class Lme/pushy/sdk/services/PushySocketService$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/pushy/sdk/services/PushySocketService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/pushy/sdk/services/PushySocketService;


# direct methods
.method constructor <init>(Lme/pushy/sdk/services/PushySocketService;)V
    .locals 0

    iput-object p1, p0, Lme/pushy/sdk/services/PushySocketService$1;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$1;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$100(Lme/pushy/sdk/services/PushySocketService;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Pushy"

    const-string p2, "Internet connected"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$1;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    move-result-object p1

    invoke-virtual {p1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->isConnected()Z

    move-result p1

    if-nez p1, :cond_0

    :goto_0
    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$1;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$300(Lme/pushy/sdk/services/PushySocketService;)V

    return-void

    :cond_0
    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$1;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$400(Lme/pushy/sdk/services/PushySocketService;)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$1;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    move-result-object p1

    invoke-virtual {p1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->getNetwork()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    const-string p1, "Pushy"

    const-string p2, "Internet disconnected"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$1;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-virtual {p1}, Lme/pushy/sdk/services/PushySocketService;->cancelReconnect()V

    :cond_2
    return-void
.end method
