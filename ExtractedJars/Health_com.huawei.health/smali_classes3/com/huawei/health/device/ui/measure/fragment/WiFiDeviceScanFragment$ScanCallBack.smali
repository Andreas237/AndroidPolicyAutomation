.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;
.super Lo/ajk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ScanCallBack"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ajk<Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V
    .locals 0

    .line 237
    invoke-direct {p0, p1}, Lo/ajk;-><init>(Ljava/lang/Object;)V

    .line 238
    return-void
.end method


# virtual methods
.method public onDeviceDiscovered(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/List<Lo/ajd;>;)V"
        }
    .end annotation

    .line 242
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 243
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDeviceDiscovered deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    return-void

    .line 246
    :cond_0
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDeviceDiscovered deviceInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 247
    invoke-virtual {p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->removeRepeatDevice(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    .line 248
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDeviceDiscovered mDevices "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 249
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 250
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 251
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 252
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 253
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 255
    :cond_1
    return-void
.end method

.method public bridge synthetic onDeviceDiscovered(Ljava/lang/Object;Ljava/util/List;)V
    .locals 1

    .line 235
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;->onDeviceDiscovered(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/List;)V

    return-void
.end method

.method public onDeviceDiscoveryFinished(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V
    .locals 2

    .line 259
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 260
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 262
    :cond_0
    return-void
.end method

.method public bridge synthetic onDeviceDiscoveryFinished(Ljava/lang/Object;)V
    .locals 1

    .line 235
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;->onDeviceDiscoveryFinished(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V

    return-void
.end method

.method public onFailure(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/lang/Object;)V
    .locals 2

    .line 266
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 267
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 269
    :cond_0
    return-void
.end method

.method public bridge synthetic onFailure(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 235
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;->onFailure(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/lang/Object;)V

    return-void
.end method
