.class public Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/pushy/sdk/services/PushySocketService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SendKeepAliveAsync"
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
    .locals 0

    iput-object p1, p0, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 4

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    move-result-object p1

    invoke-virtual {p1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->isConnected()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Pushy"

    const-string v1, "Sending keep alive"

    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    move-result-object p1

    invoke-virtual {p1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->sendKeepAlive()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Pushy"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Keep alive error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p1, p0, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;->this$0:Lme/pushy/sdk/services/PushySocketService;

    invoke-static {p1}, Lme/pushy/sdk/services/PushySocketService;->access$300(Lme/pushy/sdk/services/PushySocketService;)V

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;->doInBackground([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
