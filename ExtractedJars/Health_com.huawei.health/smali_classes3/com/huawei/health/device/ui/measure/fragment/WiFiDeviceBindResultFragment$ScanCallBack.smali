.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;
.super Lo/ajk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ScanCallBack"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ajk<Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 950
    invoke-direct {p0, p1}, Lo/ajk;-><init>(Ljava/lang/Object;)V

    .line 951
    return-void
.end method


# virtual methods
.method public onDeviceDiscovered(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Ljava/util/List<Lo/ajd;>;)V"
        }
    .end annotation

    .line 955
    const-string v0, "WiFiDeviceBindResultFragment"

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

    .line 956
    invoke-virtual {p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->removeRepeatDevice(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v4

    .line 957
    const-string v0, "WiFiDeviceBindResultFragment"

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

    .line 958
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 959
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akj;

    move-result-object v0

    invoke-virtual {v0}, Lo/akj;->d()V

    .line 960
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ajd;

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$602(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Lo/ajd;)Lo/ajd;

    .line 961
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 962
    const/4 v0, 0x4

    iput v0, v5, Landroid/os/Message;->what:I

    .line 963
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 964
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 966
    :cond_0
    return-void
.end method

.method public bridge synthetic onDeviceDiscovered(Ljava/lang/Object;Ljava/util/List;)V
    .locals 1

    .line 948
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;->onDeviceDiscovered(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Ljava/util/List;)V

    return-void
.end method

.method public onDeviceDiscoveryFinished(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 5

    .line 970
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDeviceDiscoveryFinished "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 971
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 972
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 973
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 974
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 975
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 977
    :cond_0
    return-void
.end method

.method public bridge synthetic onDeviceDiscoveryFinished(Ljava/lang/Object;)V
    .locals 1

    .line 948
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;->onDeviceDiscoveryFinished(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    return-void
.end method

.method public onFailure(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Ljava/lang/Object;)V
    .locals 5

    .line 981
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure scan "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 982
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 983
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 984
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 985
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 986
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 988
    :cond_0
    return-void
.end method

.method public bridge synthetic onFailure(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 948
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;->onFailure(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Ljava/lang/Object;)V

    return-void
.end method
