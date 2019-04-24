.class Lo/akl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akl;->e()V
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
.field final synthetic a:Lo/akl;


# direct methods
.method constructor <init>(Lo/akl;)V
    .locals 0

    .line 624
    iput-object p1, p0, Lo/akl$5;->a:Lo/akl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V
    .locals 6

    .line 626
    if-eqz p3, :cond_2

    .line 627
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getDeviceDetailInfo()Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 628
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOuthedDeviceFromCloud reg device success but rsp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 630
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 631
    new-instance v5, Lo/aja;

    invoke-direct {v5}, Lo/aja;-><init>()V

    .line 632
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getDeviceDetailInfo()Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/aja;->e(Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V

    .line 633
    iput-object v5, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 634
    const/16 v0, 0x9

    iput v0, v4, Landroid/os/Message;->what:I

    .line 635
    iget-object v0, p0, Lo/akl$5;->a:Lo/akl;

    invoke-static {v0}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/akl$c;->sendMessage(Landroid/os/Message;)Z

    .line 636
    const-string v0, "SoftApOuthManager"

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

    .line 637
    goto :goto_0

    .line 639
    :cond_2
    const/16 v4, 0x7cf

    .line 640
    const-string v5, "unknown error"

    .line 641
    if-eqz p1, :cond_3

    .line 642
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 643
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 645
    :cond_3
    const-string v0, "SoftApOuthManager"

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

    .line 647
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 624
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/akl$5;->b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;Ljava/lang/String;Z)V

    return-void
.end method
