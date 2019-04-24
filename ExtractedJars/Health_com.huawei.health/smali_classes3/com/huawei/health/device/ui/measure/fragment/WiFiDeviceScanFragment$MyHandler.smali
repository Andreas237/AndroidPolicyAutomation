.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 67
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Landroid/os/Message;)V
    .locals 5

    .line 71
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 72
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler what:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 75
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 77
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 78
    invoke-static {p1, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/ArrayList;)V

    .line 80
    :cond_0
    goto :goto_1

    .line 83
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V

    .line 84
    goto :goto_1

    .line 86
    :pswitch_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Z)V

    .line 87
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 88
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;

    invoke-direct {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;-><init>()V

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    goto :goto_1

    .line 92
    :goto_0
    const-string v0, "MyHandler what is other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 96
    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 64
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Landroid/os/Message;)V

    return-void
.end method
