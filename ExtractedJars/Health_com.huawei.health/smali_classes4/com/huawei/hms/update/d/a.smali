.class public Lcom/huawei/hms/update/d/a;
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
    iput-object p1, p0, Lcom/huawei/hms/update/d/a;->a:Landroid/os/Handler;

    .line 31
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 35
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 37
    return-void

    .line 41
    :cond_0
    const-string v0, "TestIntent"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    goto :goto_0

    .line 42
    :catch_0
    move-exception v3

    .line 43
    const-string v0, "SilentInstallReceive"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intent has some error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-void

    .line 47
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 49
    const-string v0, "com.huawei.appmarket.service.downloadservice.Receiver"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 50
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 51
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 52
    return-void

    .line 55
    :cond_1
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 56
    const/16 v0, 0x65

    iput v0, v5, Landroid/os/Message;->what:I

    .line 57
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/huawei/hms/update/d/a;->a:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 60
    goto :goto_1

    :cond_2
    const-string v0, "com.huawei.appmarket.service.downloadservice.progress.Receiver"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 61
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 62
    if-nez v4, :cond_3

    .line 64
    return-void

    .line 67
    :cond_3
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 68
    const/16 v0, 0x66

    iput v0, v5, Landroid/os/Message;->what:I

    .line 69
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 70
    iget-object v0, p0, Lcom/huawei/hms/update/d/a;->a:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 71
    goto :goto_1

    :cond_4
    const-string v0, "com.huawei.appmarket.service.installerservice.Receiver"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 72
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 73
    if-nez v4, :cond_5

    .line 75
    return-void

    .line 77
    :cond_5
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 78
    const/16 v0, 0x67

    iput v0, v5, Landroid/os/Message;->what:I

    .line 79
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 80
    iget-object v0, p0, Lcom/huawei/hms/update/d/a;->a:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 82
    :cond_6
    :goto_1
    return-void
.end method
