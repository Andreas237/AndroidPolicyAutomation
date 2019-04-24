.class Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 0

    .line 1581
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 1584
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1585
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 1586
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1302(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1587
    const-string v0, "payType"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1588
    const-string v0, "returnCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 1589
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindBusCardAddActivity handleMessage, user issuer to set handler, returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1590
    if-nez v4, :cond_0

    .line 1591
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1402(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Z)Z

    .line 1593
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPromotionInfoList(Ljava/util/ArrayList;)V

    .line 1594
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPrePaytypes(Ljava/lang/String;)V

    .line 1595
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1596
    const-string v0, "BindBusCardAddActivity handleMessage, getPayTypeScene == GET_PAY_TYPE_SCENE_ENTRY_TO_ACTIVITY"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    goto :goto_0

    .line 1599
    :cond_1
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 1600
    iput v4, v5, Landroid/os/Message;->arg1:I

    .line 1601
    const/16 v0, 0x6b

    iput v0, v5, Landroid/os/Message;->what:I

    .line 1602
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1604
    :goto_0
    return-void
.end method
