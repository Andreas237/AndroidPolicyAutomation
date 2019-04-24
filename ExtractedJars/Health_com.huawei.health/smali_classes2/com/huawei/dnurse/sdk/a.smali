.class Lcom/huawei/dnurse/sdk/a;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;


# direct methods
.method constructor <init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "HWHealthSDK"

    const-string v1, "Get event"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.HEADSET_PLUG"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "state"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "microphone"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Model: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ver: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->wakeupDevice()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->e(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    const-string v0, "HWHealthSDK"

    const-string v1, "Headset removed"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    return-void
.end method
