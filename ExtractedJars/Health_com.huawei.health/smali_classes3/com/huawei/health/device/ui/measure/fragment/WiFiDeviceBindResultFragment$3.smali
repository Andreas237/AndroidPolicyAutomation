.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getCloudDevice()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;Ljava/lang/String;Z)V
    .locals 7

    .line 361
    if-eqz p3, :cond_4

    .line 362
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCloudDevice reg device success :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 364
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->getDeviceDetailInfoList()Ljava/util/List;

    move-result-object v4

    .line 365
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 366
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCloudDevice reg device success devices is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 367
    return-void

    .line 369
    :cond_0
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCloudDevice reg device success devices size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 370
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 371
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    iget-object v0, v0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 372
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/afj;

    move-result-object v1

    iget-object v1, v1, Lo/afj;->h:Lo/ace;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    iget-object v2, v2, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    iget-object v2, v2, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->prodId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Lo/ace;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    iget-object v1, v1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1600(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Ljava/lang/String;)V

    goto :goto_1

    .line 375
    :cond_1
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCloudDevice reg device bind the other wifi Device goto fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 376
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 377
    const/4 v0, 0x5

    iput v0, v6, Landroid/os/Message;->what:I

    .line 378
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)I

    move-result v0

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 379
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 380
    goto :goto_1

    .line 382
    :cond_2
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCloudDevice reg device success deviceid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 370
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 385
    :cond_3
    goto :goto_2

    .line 386
    :cond_4
    const/16 v4, 0x7cf

    .line 387
    const-string v5, "unknown error"

    .line 388
    if-eqz p1, :cond_5

    .line 389
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 390
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 392
    :cond_5
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCloudDevice() errCode = "

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

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 394
    :goto_2
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 359
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;->operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;Ljava/lang/String;Z)V

    return-void
.end method
