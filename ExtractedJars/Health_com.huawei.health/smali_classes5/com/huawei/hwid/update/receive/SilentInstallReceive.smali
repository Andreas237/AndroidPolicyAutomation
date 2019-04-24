.class public Lcom/huawei/hwid/update/receive/SilentInstallReceive;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/huawei/hwid/update/receive/SilentInstallReceive;->a:Landroid/os/Handler;

    .line 31
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 35
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 37
    const-string v0, "SilentInstallReceive"

    const-string v1, "intent is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    return-void

    .line 42
    :cond_0
    const-string v0, "TestIntent"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_0

    .line 43
    :catch_0
    move-exception v2

    .line 44
    const-string v0, "SilentInstallReceive"

    const-string v1, "intent has some error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-void

    .line 48
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 50
    const-string v0, "com.huawei.appmarket.service.downloadservice.Receiver"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 52
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 53
    const-string v0, "SilentInstallReceive"

    const-string v1, "bundle == null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    return-void

    .line 57
    :cond_1
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 58
    const/16 v0, 0x65

    iput v0, v4, Landroid/os/Message;->what:I

    .line 59
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 60
    iget-object v0, p0, Lcom/huawei/hwid/update/receive/SilentInstallReceive;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 62
    goto :goto_1

    :cond_2
    const-string v0, "com.huawei.appmarket.service.downloadservice.progress.Receiver"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 63
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 64
    if-nez v3, :cond_3

    .line 66
    return-void

    .line 69
    :cond_3
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 70
    const/16 v0, 0x66

    iput v0, v4, Landroid/os/Message;->what:I

    .line 71
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 72
    iget-object v0, p0, Lcom/huawei/hwid/update/receive/SilentInstallReceive;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 73
    goto :goto_1

    :cond_4
    const-string v0, "com.huawei.appmarket.service.installerservice.Receiver"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 74
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 75
    if-nez v3, :cond_5

    .line 77
    return-void

    .line 79
    :cond_5
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 80
    const/16 v0, 0x67

    iput v0, v4, Landroid/os/Message;->what:I

    .line 81
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 82
    iget-object v0, p0, Lcom/huawei/hwid/update/receive/SilentInstallReceive;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 84
    :cond_6
    :goto_1
    return-void
.end method
