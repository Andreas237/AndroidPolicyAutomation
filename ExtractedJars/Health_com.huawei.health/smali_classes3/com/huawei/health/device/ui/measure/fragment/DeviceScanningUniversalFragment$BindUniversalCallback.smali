.class Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IDeviceEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BindUniversalCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$1;)V
    .locals 0

    .line 365
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Lcom/huawei/hihealth/device/open/HealthDevice;)V
    .locals 5

    .line 368
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Callback, onDeviceFound: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 371
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 372
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 373
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 374
    return-void
.end method

.method public onScanFailed(I)V
    .locals 5

    .line 379
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onScanFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 381
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 382
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 383
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 385
    :cond_0
    return-void
.end method

.method public onStateChanged(I)V
    .locals 4

    .line 389
    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_0

    .line 390
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v2

    .line 391
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/agc;->c(Ljava/lang/String;)Z

    move-result v3

    .line 392
    if-eqz v2, :cond_0

    .line 400
    :cond_0
    return-void
.end method
