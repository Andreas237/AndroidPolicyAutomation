.class Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aby;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BindCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;)V
    .locals 0

    .line 359
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Lo/acl;)V
    .locals 5

    .line 362
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Callback, onDeviceFound: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 365
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 366
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 367
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 369
    return-void
.end method

.method public onScanFailed(I)V
    .locals 5

    .line 374
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onScanFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 376
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 377
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 378
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 380
    :cond_0
    return-void
.end method

.method public onStateChanged(I)V
    .locals 6

    .line 384
    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_0

    .line 385
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v2

    .line 386
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/agc;->c(Ljava/lang/String;)Z

    move-result v3

    .line 387
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    .line 388
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/agc;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v4

    .line 389
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 390
    const/4 v0, 0x0

    iput v0, v5, Landroid/os/Message;->what:I

    .line 391
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 392
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 395
    :cond_0
    return-void
.end method
