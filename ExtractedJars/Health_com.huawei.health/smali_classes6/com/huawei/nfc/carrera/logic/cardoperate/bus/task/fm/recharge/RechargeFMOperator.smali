.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "RechargeFMOperator"


# instance fields
.field private mAid:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    .line 39
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 40
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    .line 41
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    .line 42
    return-void
.end method

.method private checkOrderState(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;)Z
    .locals 9

    .line 123
    new-instance v3, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;-><init>()V

    .line 124
    iget-object v0, p1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    iput-object v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;->order:[B

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkOrderState  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;

    move-result-object v4

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RechargeFMOperator checkOrderState res="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 128
    iget v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    if-nez v0, :cond_8

    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    if-eqz v0, :cond_8

    .line 131
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    .line 133
    const-string v0, " CardEvent doUnsolvedOrder bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    .line 135
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 137
    new-instance v5, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;-><init>()V

    .line 138
    iget-object v0, p1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setOrder([B)V

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setAid(Ljava/lang/String;)V

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkOrderState  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    .line 142
    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->doUnsolvedOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v6

    .line 144
    const-string v0, " CardEvent doUnsolvedOrder bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    .line 146
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 148
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-nez v0, :cond_3

    .line 150
    new-instance v7, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;-><init>()V

    .line 151
    iget-object v0, p1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    iput-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;->order:[B

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkOrderState  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;

    move-result-object v8

    .line 154
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    if-nez v0, :cond_1

    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    if-eqz v0, :cond_1

    .line 156
    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 158
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 161
    :cond_1
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    .line 163
    const-string v0, "RechargeFMOperator checkOrderState, query order info res2=NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 165
    const/4 v0, 0x0

    return v0

    .line 167
    :cond_2
    goto :goto_0

    .line 168
    :cond_3
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_4

    .line 170
    const-string v0, "RechargeFMOperator checkOrderState, do unsolved order res1=NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 172
    const/4 v0, 0x0

    return v0

    .line 176
    :cond_4
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 177
    const-string v8, "RechargeFMOperator checkOrderState, do unsolved order fail"

    .line 178
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    const-string v0, "order_id"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    const v0, 0x3611a420

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 183
    const/4 v0, 0x0

    return v0

    .line 185
    :goto_0
    goto :goto_1

    .line 186
    :cond_5
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_6

    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 188
    :cond_6
    const/4 v0, 0x1

    return v0

    .line 190
    :cond_7
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    .line 192
    const-string v0, "RechargeFMOperator checkOrderState, ORDER_STATUS_SUCCESS"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 194
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_8
    iget v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_9

    .line 199
    const-string v0, "RechargeFMOperator checkOrderState, query order info res=NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 201
    const/4 v0, 0x0

    return v0

    .line 204
    :cond_9
    :goto_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 205
    const-string v6, "RechargeFMOperator checkOrderState, query order fail"

    .line 206
    const-string v0, "fail_reason"

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const-string v0, "fail_code"

    iget v1, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    const-string v0, "order_id"

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;->order:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    const v0, 0x3611a422

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v5, v6, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 211
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public recharge()V
    .locals 9

    .line 46
    const-string v0, "RechargeFMOperator recharge begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 48
    const/4 v4, 0x0

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosMainOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosMainOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->businessOrders:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosMainOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->businessOrders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 54
    const-string v0, "RechargeFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " order.businessOrderType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v6, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget v0, v6, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 57
    move-object v4, v6

    .line 58
    goto :goto_1

    .line 60
    :cond_0
    goto :goto_0

    :cond_1
    :goto_1
    goto :goto_2

    .line 63
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosBusinessOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 65
    const-string v0, "RechargeFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mOrder.getNfcosBusinessOrder().businessOrderType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosBusinessOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v3

    iget v3, v3, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosBusinessOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v0

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosBusinessOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v4

    .line 71
    :cond_3
    :goto_2
    if-nez v4, :cond_4

    .line 73
    const-string v0, "RechargeFMOperator recharge, rechargeOrder == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 75
    return-void

    .line 79
    :cond_4
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->checkOrderState(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 81
    const-string v0, "RechargeFMOperator recharge, checkOrderState fail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 82
    return-void

    .line 85
    :cond_5
    const-string v0, " CardEvent RECHARGE bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    .line 87
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 89
    new-instance v5, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;-><init>()V

    .line 90
    iget-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setOrder([B)V

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setAid(Ljava/lang/String;)V

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recharge  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    .line 94
    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->recharge(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v6

    .line 96
    const-string v0, " CardEvent RECHARGE bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mAid:Ljava/lang/String;

    .line 98
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 100
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-nez v0, :cond_6

    .line 102
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 103
    return-void

    .line 105
    :cond_6
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_7

    .line 107
    const-string v0, "RechargeFMOperator recharge, NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 109
    return-void

    .line 112
    :cond_7
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 113
    const-string v8, "RechargeFMOperator recharge fail"

    .line 114
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    const-string v0, "order_id"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    const v0, 0x3611a421

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 118
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    const/16 v1, 0x63

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 119
    return-void
.end method
