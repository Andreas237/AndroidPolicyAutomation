.class Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V
    .locals 0

    .line 1212
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1215
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1216
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 1217
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$302(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1218
    const-string v0, "payType"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1219
    const-string v0, "returnCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 1220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BuscardRechargeAcitvity handleMessage, user issuer to set handler, returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BuscardRechargeAcitvity handleMessage, user issuer to set handler, payType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1222
    if-nez v4, :cond_0

    .line 1223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$402(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;Z)Z

    .line 1225
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$300(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPromotionInfoList(Ljava/util/ArrayList;)V

    .line 1226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPrePaytypes(Ljava/lang/String;)V

    .line 1227
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$500(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1228
    const-string v0, "BuscardRechargeAcitvity handleMessage, getPayTypeScene == GET_PAY_TYPE_SCENE_ENTRY_TO_ACTIVITY"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    goto :goto_0

    .line 1230
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$600(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Lo/egn;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$700(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;Lo/egn;)V

    .line 1231
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$800(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    .line 1233
    :goto_0
    return-void
.end method
