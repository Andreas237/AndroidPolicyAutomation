.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->checkDevice()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V
    .locals 6

    .line 123
    if-nez p3, :cond_1

    .line 124
    const/16 v4, 0x7cf

    .line 125
    const-string v5, "unknown error"

    .line 126
    if-eqz p1, :cond_0

    .line 127
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 128
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 129
    const v0, 0x6acfc00

    if-ne v0, v4, :cond_0

    .line 130
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device already not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->sendEmptyMessage(I)Z

    .line 134
    :cond_0
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkDevice() errCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",resultDesc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 135
    goto :goto_0

    .line 136
    :cond_1
    iget-object v0, p1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->deviceDetailInfo:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 137
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDevice() device already not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 140
    :cond_2
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDevice() device already exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 143
    :goto_0
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 121
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$1;->operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V

    return-void
.end method
