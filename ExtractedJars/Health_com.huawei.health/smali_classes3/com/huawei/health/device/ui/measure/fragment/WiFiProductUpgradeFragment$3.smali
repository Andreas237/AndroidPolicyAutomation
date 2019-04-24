.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getDeviceStatus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;Ljava/lang/String;Z)V
    .locals 9

    .line 268
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 269
    if-eqz p3, :cond_5

    .line 270
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 271
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;->getDeviceServiceInfo()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;->getDeviceServiceInfo()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 272
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;->getDeviceServiceInfo()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;

    .line 273
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device service info size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;->getDeviceServiceInfo()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 274
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->getData()Ljava/util/Map;

    move-result-object v7

    .line 275
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    const-string v1, "fwNewVer"

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$602(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    const-string v1, "fwCurVer"

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$702(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    const-string v1, "releaseNote"

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$802(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    const-string v0, "status"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 279
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->getSid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", note: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    .line 280
    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", newver: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    .line 281
    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", curver: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    .line 282
    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 279
    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    :cond_0
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 286
    goto :goto_1

    .line 287
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz v8, :cond_2

    const-string v0, "1"

    .line 288
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 289
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 290
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exist new version curver: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", new ver: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 291
    goto :goto_1

    .line 293
    :cond_2
    goto/16 :goto_0

    :cond_3
    :goto_1
    goto :goto_2

    .line 295
    :cond_4
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 296
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get device info is empty."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 298
    :goto_2
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "res: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", text: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 300
    :cond_5
    if-eqz p1, :cond_6

    .line 301
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 302
    const v0, 0x6acfc00

    if-ne v0, v5, :cond_6

    .line 303
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->sendEmptyMessage(I)Z

    .line 306
    :cond_6
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 307
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get device status fail. text: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :goto_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->sendMessage(Landroid/os/Message;)Z

    .line 310
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 265
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;->operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;Ljava/lang/String;Z)V

    return-void
.end method
