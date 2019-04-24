.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APPLY_ORDER_ERRORCODE:I = 0x6f

.field private static final LIMITED_BALANCE:I = 0x186a0

.field private static final TAG:Ljava/lang/String; = "ApplyPayOrderOperator"


# instance fields
.field private failCode:Ljava/lang/String;

.field private logUploadEventId:I

.field private mAppCode:Ljava/lang/String;

.field private final mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

.field private final mContext:Landroid/content/Context;

.field private final mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private final mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

.field private final partnerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    .line 84
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    .line 85
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 86
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->isBeijingAppMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1504209900006276"

    goto :goto_0

    :cond_0
    const-string v0, "1504209900006271"

    :goto_0
    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->partnerId:Ljava/lang/String;

    .line 88
    return-void
.end method

.method private buildOrderAndPayInfo(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;
    .locals 8

    .line 190
    const/4 v2, 0x0

    .line 191
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v3

    .line 193
    const/4 v4, 0x0

    .line 194
    if-eqz v3, :cond_1

    .line 195
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;

    .line 196
    invoke-direct {p0, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->isOrderValid(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;)Z

    move-result v7

    .line 197
    if-eqz v7, :cond_0

    .line 198
    move-object v4, v6

    .line 199
    goto :goto_1

    .line 201
    :cond_0
    goto :goto_0

    .line 203
    :cond_1
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderOperator buildOrderAndPayInfo: orderList size:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-nez v3, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 205
    if-eqz v4, :cond_4

    .line 206
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 207
    invoke-virtual {v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setApplyOrders(Ljava/util/List;)V

    .line 208
    const/4 v5, 0x0

    .line 209
    const/4 v6, 0x0

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getPayType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 212
    new-instance v6, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;-><init>()V

    .line 213
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getWechatPayAppId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->setAppId(Ljava/lang/String;)V

    .line 214
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getWechatPayNonceStr()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->setNonceStr(Ljava/lang/String;)V

    .line 215
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getWechatPayPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->setPartnerId(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getWechatPayPrepayId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->setPrepayId(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getSign()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->setSign(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getWechatPayTimeStamp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->setTimeStamp(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getWechatPayPackageValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->setPackageValue(Ljava/lang/String;)V

    goto :goto_3

    .line 221
    :cond_3
    invoke-static {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->build(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v5

    .line 224
    :goto_3
    invoke-virtual {v2, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;)V

    .line 225
    invoke-virtual {v2, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setWXPayInfo(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;)V

    .line 226
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNewPayVersion(Z)V

    .line 227
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getPayType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayType(I)V

    .line 228
    goto :goto_4

    .line 232
    :cond_4
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getWxTrafficOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    move-result-object v2

    .line 234
    :goto_4
    return-object v2
.end method

.method private bulidApplyOrderRequest()Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;
    .locals 19

    .line 585
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v7

    .line 586
    const-string v8, "01"

    .line 588
    const/4 v10, 0x0

    .line 589
    const/4 v11, 0x0

    .line 590
    const/4 v12, 0x0

    .line 591
    const/4 v13, 0x0

    .line 592
    const/4 v14, 0x0

    .line 593
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 594
    const-string v9, "0"

    .line 595
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getActualIssuePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v10

    .line 596
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getTheoreticalIssuePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v11

    goto/16 :goto_0

    .line 597
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 598
    const-string v9, "1"

    .line 600
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getActualRechargePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v12

    .line 602
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getTheoreticalRechargePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v13

    .line 604
    const-string v0, "ApplyPayOrderOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TA aRechargePayment : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; tRechargePayment : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v15

    .line 608
    const/4 v0, 0x0

    if-eq v0, v15, :cond_1

    .line 609
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v14

    .line 610
    const-string v0, "ApplyPayOrderOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TA cardNum : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    :cond_1
    goto :goto_0

    .line 613
    :cond_2
    const-string v9, "2"

    .line 614
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getActualIssuePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v10

    .line 615
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getTheoreticalIssuePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v11

    .line 616
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getActualRechargePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v12

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getTheoreticalRechargePayment()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getPayment(I)Ljava/lang/String;

    move-result-object v13

    .line 619
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v15

    .line 620
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v3

    move-object v4, v9

    move-object v5, v15

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 622
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setActualIssuePayment(Ljava/lang/String;)V

    .line 623
    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setTheoreticalIssuePayment(Ljava/lang/String;)V

    .line 624
    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setActualRecharegePayment(Ljava/lang/String;)V

    .line 625
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setTheoreticalRecharegePayment(Ljava/lang/String;)V

    .line 626
    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setTrafficCardId(Ljava/lang/String;)V

    .line 627
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v17

    .line 628
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/nfc/PluginPayAdapter;

    .line 629
    invoke-interface/range {v18 .. v18}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 630
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getPayType()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getOderPayType(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setPayType(Ljava/lang/String;)V

    .line 631
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mAppCode:Ljava/lang/String;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setAppCode(Ljava/lang/String;)V

    .line 632
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->partnerId:Ljava/lang/String;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setPartnerId(Ljava/lang/String;)V

    .line 633
    return-object v16
.end method

.method private checkBalance()Z
    .locals 6

    .line 314
    const/4 v4, 0x1

    .line 315
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 316
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getBalance()I

    move-result v5

    .line 317
    const-string v0, "ApplyPayOrderOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentBalance : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; TheoreticalPayment : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getTheoreticalPayment()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    if-ltz v5, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getTheoreticalPayment()I

    move-result v0

    add-int/2addr v0, v5

    const v1, 0x186a0

    if-le v0, v1, :cond_0

    .line 319
    const/4 v4, 0x0

    .line 320
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 324
    :cond_0
    return v4
.end method

.method private getAppCode()Ljava/lang/String;
    .locals 3

    .line 160
    const-string v0, "90000029"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;-><init>(Landroid/content/Context;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->queryAppCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mAppCode:Ljava/lang/String;

    .line 164
    goto :goto_0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCityCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mAppCode:Ljava/lang/String;

    .line 170
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mAppCode:Ljava/lang/String;

    return-object v0
.end method

.method private getBalance()I
    .locals 7

    .line 328
    const-string v0, "ApplyPayOrderOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBalance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const/4 v4, 0x2

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;->createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 331
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;->readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    move-result-object v5

    .line 332
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v1

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->geteSEErrorCode(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 334
    const/4 v0, -0x1

    return v0

    .line 336
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getData()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    .line 337
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getBalanceByFenUnit()I

    move-result v0

    return v0
.end method

.method private getLoggerParamByOrderType()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v1

    .line 176
    const/4 v0, 0x1

    if-eq v1, v0, :cond_0

    const/4 v0, 0x3

    if-ne v1, v0, :cond_1

    .line 178
    :cond_0
    const v0, 0x3611a46f

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->logUploadEventId:I

    .line 179
    const-string v0, "1300"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->failCode:Ljava/lang/String;

    goto :goto_0

    .line 180
    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    .line 181
    const v0, 0x3611a470

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->logUploadEventId:I

    .line 182
    const-string v0, "1501"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->failCode:Ljava/lang/String;

    goto :goto_0

    .line 183
    :cond_2
    const/4 v0, 0x5

    if-ne v1, v0, :cond_3

    .line 184
    const v0, 0x3611a474

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->logUploadEventId:I

    .line 185
    const-string v0, "2202"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->failCode:Ljava/lang/String;

    .line 187
    :cond_3
    :goto_0
    return-void
.end method

.method private getOderPayType(I)Ljava/lang/String;
    .locals 3

    .line 637
    const/4 v2, 0x0

    .line 638
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 640
    const-string v2, "huaweipayonline"

    goto :goto_0

    .line 642
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 644
    const-string v2, "wechat"

    goto :goto_0

    .line 646
    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 648
    const-string v2, "IAP"

    goto :goto_0

    .line 652
    :cond_2
    const-string v2, "Huaweipay"

    .line 654
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderSAOperator doApplyPayOrder PayType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",orderPaytype = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 655
    return-object v2
.end method

.method private getPayment(I)Ljava/lang/String;
    .locals 4

    .line 660
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 661
    rem-int/lit8 v3, p1, 0x64

    .line 662
    div-int/lit8 v0, p1, 0x64

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 663
    const/16 v0, 0xa

    if-ge v3, v0, :cond_0

    .line 664
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 666
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 667
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getWxTrafficOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;
    .locals 13

    .line 244
    const-string v0, "ApplyPayOrderOperator buildOrderAndPayInfo: getWxTrafficOrder."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 246
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 248
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 250
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getWxOrderListJsonString()Ljava/lang/String;

    move-result-object v4

    .line 251
    const/4 v5, 0x0

    .line 254
    :try_start_0
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 255
    const/4 v7, 0x0

    .line 256
    const/4 v8, 0x0

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_1

    .line 258
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 259
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v0

    move-object v5, v0

    .line 261
    const-string v0, "requestId"

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 262
    const-string v0, "orderType"

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 264
    new-instance v12, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;

    invoke-direct {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;-><init>()V

    .line 265
    invoke-virtual {v12, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setOrderId(Ljava/lang/String;)V

    .line 266
    invoke-virtual {v12, v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setOrderType(Ljava/lang/String;)V

    .line 267
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    if-eqz v5, :cond_0

    const/4 v0, 0x1

    invoke-static {v10, v0}, Lcom/huawei/wallet/utils/StringUtil;->e(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    .line 271
    goto :goto_1

    .line 256
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 278
    :cond_1
    :goto_1
    goto :goto_2

    .line 275
    :catch_0
    move-exception v6

    .line 277
    const-string v0, "buildOrderAndPayInfo get WXOrder JSONException."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 280
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderOperator buildOrderAndPayInfo, getWxTrafficOrder orderList size:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 282
    invoke-virtual {v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setApplyOrders(Ljava/util/List;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->partnerId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setSpId(Ljava/lang/String;)V

    .line 284
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNewPayVersion(Z)V

    .line 285
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getPayType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayType(I)V

    .line 286
    invoke-virtual {v2, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setWXPayInfo(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;)V

    .line 288
    return-object v2
.end method

.method private handleCommenErr(ILjava/lang/String;)Z
    .locals 4

    .line 561
    const/4 v2, 0x1

    .line 562
    const/16 v3, 0x44b

    .line 563
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 565
    :pswitch_0
    const/16 v3, 0xa

    .line 566
    goto :goto_1

    .line 568
    :pswitch_1
    const/16 v3, 0xb

    .line 569
    goto :goto_1

    .line 571
    :pswitch_2
    const/16 v3, 0x19

    .line 572
    goto :goto_1

    .line 574
    :goto_0
    const/4 v2, 0x0

    .line 578
    :goto_1
    if-eqz v2, :cond_0

    .line 579
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v3, v1, v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    :cond_0
    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private handleErrCode(ILjava/lang/String;)V
    .locals 3

    .line 505
    const/4 v2, 0x0

    .line 506
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderOperator, applyOrder err, code ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 507
    const/16 v0, 0x64

    if-ge p1, v0, :cond_0

    .line 509
    const/16 v0, 0x6f

    invoke-static {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/util/ErrorTranslateUtil;->translateServerAccessErrorCode(II)I

    move-result v2

    .line 510
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v2, v1, v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    return-void

    .line 513
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 516
    :sswitch_0
    const/16 v2, 0x32ca

    .line 517
    goto :goto_1

    .line 519
    :sswitch_1
    const/16 v2, 0x32cb

    .line 520
    goto :goto_1

    .line 522
    :sswitch_2
    const/16 v2, 0x32cc

    .line 523
    goto :goto_1

    .line 525
    :sswitch_3
    const/16 v2, 0x32cd

    .line 526
    goto :goto_1

    .line 528
    :sswitch_4
    const/16 v2, 0x32ce

    .line 529
    goto :goto_1

    .line 532
    :sswitch_5
    const/16 v2, 0x32cf

    .line 533
    goto :goto_1

    .line 535
    :sswitch_6
    const/16 v2, 0x32d0

    .line 536
    goto :goto_1

    .line 538
    :sswitch_7
    const/16 v2, 0x32d1

    .line 539
    goto :goto_1

    .line 542
    :sswitch_8
    const/16 v2, 0x32d2

    .line 543
    goto :goto_1

    .line 545
    :sswitch_9
    const/16 v2, 0x32d3

    .line 546
    goto :goto_1

    .line 548
    :sswitch_a
    const/16 v2, 0x32d5

    .line 549
    goto :goto_1

    .line 551
    :goto_0
    const/16 v0, 0x44b

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->getSnbResultCode(II)I

    move-result v2

    .line 555
    :goto_1
    const/16 v0, 0x6f

    invoke-static {v0, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/util/ErrorTranslateUtil;->translateErrorCode(II)I

    move-result v2

    .line 557
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v2, v1, v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3ea -> :sswitch_1
        0x3eb -> :sswitch_2
        0x3ec -> :sswitch_3
        0x3ed -> :sswitch_4
        0x3ee -> :sswitch_5
        0x3ef -> :sswitch_6
        0x3f0 -> :sswitch_7
        0x3f1 -> :sswitch_8
        0x3f2 -> :sswitch_9
        0x2711 -> :sswitch_a
    .end sparse-switch
.end method

.method private handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderSAOperator handleResult resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",respCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",msg ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 673
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 675
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 677
    :cond_0
    return-void
.end method

.method private hasUnfinishedIssueOrder()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;
    .locals 20

    .line 341
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    .line 342
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 344
    const/4 v0, 0x0

    return-object v0

    .line 347
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v6

    .line 348
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v7

    .line 349
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v8

    .line 350
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v9

    .line 351
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v3

    move-object v4, v8

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v0

    .line 352
    const-string v0, "ApplyPayOrderOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryOrder, request.getIssuerId() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getCplc() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getAppletAid() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getDeviceModel() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 353
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getSeChipManuFacturer() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 352
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v11

    .line 355
    invoke-virtual {v11}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/nfc/PluginPayAdapter;

    .line 356
    invoke-interface {v12}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 357
    const-string v0, "1"

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setOrderStatus(Ljava/lang/String;)V

    .line 358
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mAppCode:Ljava/lang/String;

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAppCode(Ljava/lang/String;)V

    .line 359
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->isBeijingAppMode()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1504209900006276"

    goto :goto_0

    :cond_1
    const-string v0, "1504209900006271"

    :goto_0
    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setPartnerId(Ljava/lang/String;)V

    .line 360
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;

    move-result-object v13

    .line 361
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    if-nez v0, :cond_8

    .line 363
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 365
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v14

    .line 366
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 367
    const/16 v16, 0x0

    .line 368
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 370
    const-string v0, "801"

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "802"

    .line 371
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "803"

    .line 372
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "900"

    .line 373
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v19, 0x1

    goto :goto_2

    :cond_3
    const/16 v19, 0x0

    .line 374
    :goto_2
    if-eqz v19, :cond_5

    .line 376
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderOperator, order.getOrderType()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 377
    const-string v0, "2"

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "0"

    .line 378
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 380
    :cond_4
    const/16 v16, 0x1

    .line 381
    move-object/from16 v0, v18

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 384
    :cond_5
    goto/16 :goto_1

    .line 385
    :cond_6
    if-eqz v16, :cond_7

    .line 387
    const-string v0, "ApplyPayOrderOperator, hasRetriableOrder"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 388
    new-instance v17, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 389
    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setQueryOrders(Ljava/util/List;)V

    .line 390
    move-object/from16 v0, v17

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setHasUnusedIssueOrder(Z)V

    .line 391
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getPayType()I

    move-result v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayType(I)V

    .line 392
    return-object v17

    .line 396
    :cond_7
    const-string v0, "ApplyPayOrderOperator, no unfinished orders."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 397
    const/4 v0, 0x0

    return-object v0

    .line 400
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderOperator, applyOrder err, code ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 401
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 400
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 402
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleCommenErr(ILjava/lang/String;)Z

    .line 403
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->reportUnfinishErr(II)V

    .line 404
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->reportErr(ILjava/lang/String;)V

    .line 405
    const/4 v0, 0x0

    return-object v0
.end method

.method private isOrderValid(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;)Z
    .locals 8

    .line 298
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 299
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getApplyOrderTn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 300
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 301
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getApplyOrderTn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 302
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 303
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getApplyOrderTn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    .line 304
    :goto_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    .line 305
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getApplyOrderTn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    const/4 v5, 0x1

    goto :goto_3

    :cond_7
    const/4 v5, 0x0

    .line 306
    :goto_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_9

    .line 307
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getApplyOrderTn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    const/4 v6, 0x1

    goto :goto_4

    :cond_9
    const/4 v6, 0x0

    .line 308
    :goto_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_b

    .line 309
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "7"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getApplyOrderTn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    const/4 v7, 0x1

    goto :goto_5

    :cond_b
    const/4 v7, 0x0

    .line 310
    :goto_5
    if-nez v2, :cond_c

    if-nez v3, :cond_c

    if-nez v4, :cond_c

    if-nez v5, :cond_c

    if-nez v6, :cond_c

    if-eqz v7, :cond_d

    :cond_c
    const/4 v0, 0x1

    goto :goto_6

    :cond_d
    const/4 v0, 0x0

    :goto_6
    return v0
.end method

.method private queryUnusedTransferOrder()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;
    .locals 20

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    .line 411
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 413
    const/4 v0, 0x0

    return-object v0

    .line 416
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v6

    .line 417
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v7

    .line 418
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v8

    .line 419
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v9

    .line 420
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v3

    move-object v4, v8

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v0

    .line 421
    const-string v0, "ApplyPayOrderOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryOrder, request.getIssuerId() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getCplc() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getAppletAid() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getDeviceModel() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 422
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getSeChipManuFacturer() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 421
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v11

    .line 424
    invoke-virtual {v11}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/nfc/PluginPayAdapter;

    .line 425
    invoke-interface {v12}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 426
    const-string v0, "1"

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setOrderStatus(Ljava/lang/String;)V

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->isBeijingAppMode()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1504209900006276"

    goto :goto_0

    :cond_1
    const-string v0, "1504209900006271"

    :goto_0
    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setPartnerId(Ljava/lang/String;)V

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mAppCode:Ljava/lang/String;

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAppCode(Ljava/lang/String;)V

    .line 429
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;

    move-result-object v13

    .line 431
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_2

    .line 433
    const/4 v0, 0x0

    return-object v0

    .line 436
    :cond_2
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 438
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v14

    .line 439
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 440
    const/16 v16, 0x0

    .line 441
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 443
    const-string v0, "911"

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "912"

    .line 444
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/16 v19, 0x1

    goto :goto_2

    :cond_4
    const/16 v19, 0x0

    .line 445
    :goto_2
    if-eqz v19, :cond_5

    .line 447
    move-object/from16 v0, v18

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    const/16 v16, 0x1

    .line 450
    :cond_5
    goto :goto_1

    .line 451
    :cond_6
    if-eqz v16, :cond_8

    .line 453
    const-string v0, "ApplyPayOrderOperator, hasRetriableOrder"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 454
    new-instance v17, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 455
    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setQueryOrders(Ljava/util/List;)V

    .line 456
    move-object/from16 v0, v17

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setHasUnusedIssueOrder(Z)V

    .line 458
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    .line 459
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_8

    .line 462
    :cond_7
    const/16 v18, 0x0

    .line 463
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ApplyPayOrderOperator hasUnfinishedTransferOrder "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 464
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 463
    move-object/from16 v2, p0

    move/from16 v3, v18

    move-object/from16 v4, v17

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    return-object v17

    .line 471
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderOperator, applyOrder err, code ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 472
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 471
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 473
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleCommenErr(ILjava/lang/String;)Z

    .line 474
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mApplyOrderInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->reportUnfinishErr(II)V

    .line 475
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->reportErr(ILjava/lang/String;)V

    .line 476
    const/4 v0, 0x0

    return-object v0
.end method

.method private reportErr(ILjava/lang/String;)V
    .locals 3

    .line 497
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->logUploadEventId:I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->failCode:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 498
    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ApplyPayOrderOperator err : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 499
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 500
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 501
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 502
    return-void
.end method

.method private reportUnfinishErr(II)V
    .locals 5

    .line 480
    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    .line 483
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1103"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "query issue order,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 487
    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    .line 489
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1501"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "apply_recharge_order,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 494
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public doApplyPayOrder()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;>;"
        }
    .end annotation

    .line 91
    const-string v0, "ApplyPayOrderSAOperator doApplyPayOrder begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 92
    const/16 v5, 0x44b

    .line 93
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getLoggerParamByOrderType()V

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v6

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v7

    .line 97
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderSAOperator doApplyPayOrder failed. aid or productId is illegal. aid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 101
    invoke-static {v8}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 102
    const/16 v0, 0xa

    invoke-direct {p0, v0, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleErrCode(ILjava/lang/String;)V

    .line 104
    const/16 v5, 0xa

    .line 105
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;

    const-string v1, "Param error"

    invoke-direct {v0, v5, v5, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;-><init>(IILjava/lang/String;)V

    return-object v0

    .line 107
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->getAppCode()Ljava/lang/String;

    .line 108
    const/4 v8, 0x0

    .line 110
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->hasUnfinishedIssueOrder()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    move-result-object v8

    .line 111
    if-eqz v8, :cond_2

    .line 113
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getRespCd()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ApplyPayOrderSAOperator doApplyPayOrder "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 114
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getRespMsg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 113
    const/4 v2, 0x0

    invoke-direct {p0, v2, v8, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const/4 v5, 0x0

    .line 116
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;

    const-string v1, "Has unused issuer order"

    invoke-direct {v0, v5, v5, v1, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;-><init>(IILjava/lang/String;Ljava/lang/Object;)V

    return-object v0

    .line 120
    :cond_2
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->queryUnusedTransferOrder()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    move-result-object v8

    .line 121
    if-eqz v8, :cond_3

    .line 123
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getRespCd()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ApplyPayOrderSAOperator applyPayOrder "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 124
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getRespMsg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 123
    const/4 v2, 0x0

    invoke-direct {p0, v2, v8, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const/4 v5, 0x0

    .line 126
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;

    const-string v1, "Has unused transfer order"

    invoke-direct {v0, v5, v5, v1, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;-><init>(IILjava/lang/String;Ljava/lang/Object;)V

    return-object v0

    .line 129
    :cond_3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->checkBalance()Z

    move-result v0

    if-nez v0, :cond_4

    .line 130
    const/16 v5, 0x3e9

    .line 131
    const-string v0, "ApplyPayOrderOperator err, recharge amount over limit."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 132
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;

    const-string v1, "recharge amount over limit."

    invoke-direct {v0, v5, v5, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;-><init>(IILjava/lang/String;)V

    return-object v0

    .line 134
    :cond_4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->bulidApplyOrderRequest()Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;

    move-result-object v9

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v9}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->applyOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;

    move-result-object v10

    .line 136
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_5

    .line 137
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v0

    const/16 v1, 0x3eb

    if-ne v0, v1, :cond_6

    .line 138
    :cond_5
    invoke-direct {p0, v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->buildOrderAndPayInfo(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    move-result-object v11

    .line 139
    const/4 v5, 0x0

    .line 140
    .line 141
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    .line 140
    invoke-direct {p0, v5, v11, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v5, v1, v2, v11}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;-><init>(IILjava/lang/String;Ljava/lang/Object;)V

    return-object v0

    .line 145
    :cond_6
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->handleErrCode(ILjava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->mItem:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1300"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "apply issue order,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 149
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 147
    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 151
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->reportErr(ILjava/lang/String;)V

    .line 152
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v5, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;-><init>(IILjava/lang/String;)V

    return-object v0
.end method
