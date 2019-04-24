.class Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V
    .locals 0

    .line 578
    iput-object p1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;->d:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 582
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mNonLocalBroadcastReceiver(): intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    const-string v0, "deviceinfo"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 585
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;->d:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 587
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 588
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceInfo tatatee:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    const/16 v0, 0x66

    iput v0, v5, Landroid/os/Message;->what:I

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;->d:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 591
    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;->d:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;->d:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 594
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 595
    const/16 v0, 0x67

    iput v0, v5, Landroid/os/Message;->what:I

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;->d:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 600
    :cond_1
    :goto_0
    goto :goto_1

    .line 598
    :catch_0
    move-exception v4

    .line 599
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceInfo deviceInfo error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    :goto_1
    return-void
.end method
