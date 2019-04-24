.class Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

    .line 1190
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v5

    .line 1195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v6

    .line 1196
    new-instance v7, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$200(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v5, v0, v6}, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1197
    invoke-static {}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getInstance()Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;

    move-result-object v0

    const-string v1, "nfc.get.paytype"

    const-string v2, "TransportationCard"

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getAddress(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 1198
    new-instance v9, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-direct {v9, v0, v8}, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 1199
    invoke-virtual {v9, v7}, Lcom/huawei/nfc/carrera/server/card/impl/QueryPayChannelListTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;

    .line 1200
    new-instance v11, Landroid/os/Message;

    invoke-direct {v11}, Landroid/os/Message;-><init>()V

    .line 1201
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->getPromotionInfoList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1202
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 1203
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->getPayType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1204
    const-string v0, "payType"

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->getPayType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1206
    :cond_0
    const-string v0, "returnCode"

    iget v1, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->returnCode:I

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1207
    invoke-virtual {v11, v12}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1208
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeHandler:Landroid/os/Handler;

    invoke-virtual {v0, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1209
    return-void
.end method
