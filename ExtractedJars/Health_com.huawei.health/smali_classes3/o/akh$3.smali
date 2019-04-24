.class Lo/akh$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akh;->b()V
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
.field final synthetic b:Lo/akh;


# direct methods
.method constructor <init>(Lo/akh;)V
    .locals 0

    .line 570
    iput-object p1, p0, Lo/akh$3;->b:Lo/akh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V
    .locals 6

    .line 572
    if-eqz p3, :cond_3

    .line 573
    if-nez p1, :cond_0

    .line 574
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOuthedDeviceFromCloud reg device success but rsp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 575
    return-void

    .line 577
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getDeviceDetailInfo()Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 578
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOuthedDeviceFromCloud reg device success but rsp.getDeviceDetailInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 580
    :cond_1
    iget-object v0, p0, Lo/akh$3;->b:Lo/akh;

    invoke-static {v0}, Lo/akh;->a(Lo/akh;)Lo/akh$d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 581
    new-instance v4, Lo/aja;

    invoke-direct {v4}, Lo/aja;-><init>()V

    .line 582
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 583
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getDeviceDetailInfo()Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aja;->e(Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V

    .line 584
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 585
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 586
    iget-object v0, p0, Lo/akh$3;->b:Lo/akh;

    invoke-static {v0}, Lo/akh;->a(Lo/akh;)Lo/akh$d;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/akh$d;->sendMessage(Landroid/os/Message;)Z

    .line 589
    :cond_2
    :goto_0
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOuthedDeviceFromCloud reg device success :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 591
    :cond_3
    const/16 v4, 0x7cf

    .line 592
    const-string v5, "unknown error"

    .line 593
    if-eqz p1, :cond_4

    .line 594
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 595
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 597
    :cond_4
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOuthedDeviceFromCloud() getSingleDevice errCode = "

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

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 599
    :goto_1
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 570
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/akh$3;->a(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V

    return-void
.end method
