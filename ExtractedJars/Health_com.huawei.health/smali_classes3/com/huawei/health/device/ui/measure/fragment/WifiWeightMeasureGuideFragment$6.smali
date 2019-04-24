.class Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->checkDevice()V
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
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

.field final synthetic val$device:Lo/aja;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Lo/aja;)V
    .locals 0

    .line 470
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;->val$device:Lo/aja;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V
    .locals 7

    .line 472
    if-nez p3, :cond_1

    .line 473
    const/16 v4, 0x7cf

    .line 474
    const-string v5, "unknown error"

    .line 475
    if-eqz p1, :cond_0

    .line 476
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 477
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 478
    const v0, 0x6acfc00

    if-ne v0, v4, :cond_0

    .line 479
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device already not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 480
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 481
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;->val$device:Lo/aja;

    invoke-virtual {v0}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 482
    const/16 v0, 0x68

    iput v0, v6, Landroid/os/Message;->what:I

    .line 483
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 486
    :cond_0
    const-string v0, "WifiWeightMeasureGuideFragment"

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

    .line 487
    goto :goto_0

    .line 488
    :cond_1
    iget-object v0, p1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->deviceDetailInfo:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 489
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDevice() device already not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 490
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 491
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;->val$device:Lo/aja;

    invoke-virtual {v0}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 492
    const/16 v0, 0x68

    iput v0, v4, Landroid/os/Message;->what:I

    .line 493
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 494
    return-void

    .line 496
    :cond_2
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDevice() device already exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 498
    :goto_0
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 470
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;->operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V

    return-void
.end method
