.class Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->updataDataByWifiDeviceStatus(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

.field final synthetic val$userUuid:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;Ljava/lang/String;)V
    .locals 0

    .line 386
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;->val$userUuid:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;Ljava/lang/String;Z)V
    .locals 6

    .line 389
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get device status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", text: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", is success: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 390
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;->getStatus()Ljava/lang/String;

    move-result-object v0

    const-string v1, "online"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 391
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is online"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const-string v4, ""

    .line 393
    const-string v0, "huawei"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ahu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 394
    const-string v4, "huawei"

    goto :goto_0

    .line 395
    :cond_0
    const-string v0, "honor"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ahu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 396
    const-string v4, "honor"

    .line 398
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "wifi_devuserinfo_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;->val$userUuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 399
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 400
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 399
    const/4 v3, 0x0

    invoke-static {v0, v1, v5, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 401
    goto :goto_1

    .line 402
    :cond_2
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is offline"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 404
    :goto_1
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 386
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;->operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;Ljava/lang/String;Z)V

    return-void
.end method
