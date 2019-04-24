.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LIMITED_BALANCE:I = 0x186a0


# instance fields
.field private mAmount:D

.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mOrderType:I

.field private mPayType:I

.field private mProductCode:Ljava/lang/String;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;DIILcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
    .locals 3

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    .line 81
    iput-wide p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mAmount:D

    .line 82
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mOrderType:I

    .line 83
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 84
    iput-object p8, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    .line 85
    iput-object p7, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mProductCode:Ljava/lang/String;

    .line 86
    iput p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mPayType:I

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator mAmount : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mAmount:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; mOrderType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mOrderType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; mProductCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mProductCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; mPayType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mPayType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 88
    return-void
.end method

.method private applyIssuerOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;I)V
    .locals 21

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator applyIssuerOrder begin, item.issueCardActCd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardActCd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->querySeid()[B

    move-result-object v7

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v8

    .line 165
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mAmount:D

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v9, v0

    .line 168
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    move-object/from16 v2, p1

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardActCd:Ljava/lang/String;

    move-object/from16 v3, p1

    iget v3, v3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardStdCost:I

    mul-int/lit8 v4, v3, 0x64

    move-object/from16 v3, p1

    iget v3, v3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardDiscountCost:I

    mul-int/lit8 v5, v3, 0x64

    move v3, v9

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;-><init>(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;)V

    .line 171
    const/4 v1, 0x1

    invoke-virtual {v0, v1, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->buildServiceCode(ILjava/lang/String;)[B

    move-result-object v10

    .line 173
    if-eqz v10, :cond_0

    array-length v0, v10

    if-nez v0, :cond_1

    .line 175
    :cond_0
    const-string v0, "ApplyPayOrderFMOperator applyIssuerOrder, empty actCode"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 177
    return-void

    .line 180
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator issueCardActCd : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardActCd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issueCardStdCost "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    iget v1, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardStdCost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issueCardDiscountCost "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    iget v1, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardDiscountCost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator applyIssuerOrder, actCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 185
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v11

    .line 188
    const/4 v12, 0x0

    .line 189
    const/4 v13, 0x0

    .line 190
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mProductCode:Ljava/lang/String;

    .line 191
    const/4 v15, 0x0

    .line 192
    move/from16 v0, p2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 194
    const/16 v15, 0x59

    goto :goto_0

    .line 196
    :cond_2
    move/from16 v0, p2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 198
    const/16 v15, 0xb

    .line 200
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyIssuerOrder  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; mode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 201
    const-string v0, "5943542E55534552"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 202
    invoke-static {v14, v7, v11, v10, v8}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->build(Ljava/lang/String;[BLjava/lang/String;[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;

    move-result-object v12

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0, v8}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v12, v15}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->applyIssueOrderByproduct(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;

    move-result-object v13

    goto :goto_1

    .line 205
    :cond_4
    invoke-static {v9, v7, v11, v10, v8}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->build(I[BLjava/lang/String;[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;

    move-result-object v12

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0, v8}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v12, v15}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->applyIssueOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;

    move-result-object v13

    .line 208
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator applyIssuerOrder, response.resultCode ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 209
    iget v0, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    if-nez v0, :cond_b

    .line 211
    const/16 v16, 0x0

    .line 212
    const/16 v17, 0x0

    .line 213
    const/16 v18, 0x0

    .line 214
    iget-object v0, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    if-eqz v0, :cond_a

    .line 216
    iget-object v0, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->payOrders:Ljava/util/List;

    if-eqz v0, :cond_7

    .line 218
    iget-object v0, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->payOrders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator channel : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    iget v1, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 223
    move-object/from16 v0, v20

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    const/16 v1, 0x59

    if-ne v0, v1, :cond_5

    .line 225
    move-object/from16 v0, v20

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v17

    .line 226
    goto :goto_3

    .line 227
    :cond_5
    move-object/from16 v0, v20

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_6

    .line 228
    move-object/from16 v0, v20

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v18

    .line 229
    goto :goto_3

    .line 231
    :cond_6
    const-string v0, " applyIssuerOrder payOrder channel else "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 233
    goto :goto_2

    .line 236
    :cond_7
    :goto_3
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_8

    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_9

    .line 238
    :cond_8
    new-instance v16, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 239
    iget-object v0, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNfcosMainOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;)V

    .line 240
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;)V

    .line 241
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mPayType:I

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayType(I)V

    .line 242
    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setWXPayInfo(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;)V

    goto :goto_4

    .line 246
    :cond_9
    const-string v0, "ApplyPayOrderFMOperator applyIssuerOrder, payInfo == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 247
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 248
    return-void

    .line 253
    :cond_a
    const-string v0, "ApplyPayOrderFMOperator applyIssuerOrder, esponse.order == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 254
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 255
    return-void

    .line 258
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/4 v1, 0x0

    move-object/from16 v2, v16

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 259
    return-void

    .line 261
    :cond_b
    iget v0, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    .line 263
    const-string v0, "ApplyPayOrderFMOperator applyIssuerOrder, EXIST_HAS_PAIED_ORDER"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 264
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 265
    const-string v17, "ApplyPayOrderFMOperator applyIssuerOrder, EXIST_HAS_PAIED_ORDER"

    .line 266
    const-string v0, "fail_reason"

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    const-string v0, "fail_code"

    iget v1, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    const v0, 0x3611a419

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 270
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->queryHasPaiedIssueOrder()V

    .line 271
    return-void

    .line 273
    :cond_c
    iget v0, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_d

    .line 275
    const-string v0, "ApplyPayOrderFMOperator applyIssuerOrder, NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 276
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 277
    return-void

    .line 280
    :cond_d
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 281
    const-string v17, "ApplyPayOrderFMOperator applyIssuerOrder fail"

    .line 282
    const-string v0, "fail_reason"

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    const-string v0, "fail_code"

    iget v1, v13, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    const v0, 0x3611a419

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 285
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 286
    return-void
.end method

.method private checkBalance(Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)Z
    .locals 7

    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkBalance  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 449
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;

    move-result-object v4

    .line 450
    iget v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->resultCode:I

    if-nez v0, :cond_1

    .line 453
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mAmount:D

    invoke-direct {p0, v0, v1, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->getRechargeAmountByOrderAmount(DLcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)D

    move-result-wide v5

    .line 454
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getBalance()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v2, v5

    add-double/2addr v0, v2

    const-wide v2, 0x40f86a0000000000L    # 100000.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 456
    const-string v0, "ApplyPayOrderFMOperator checkBalance, LIMITED_BALANCE"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 458
    const/4 v0, 0x0

    return v0

    .line 461
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 464
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 465
    const-string v6, "ApplyPayOrderFMOperator checkBalance, query balance fail"

    .line 466
    const-string v0, "fail_reason"

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    const-string v0, "fail_code"

    iget v1, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    const v0, 0x3611a41d

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v5, v6, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 469
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 471
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator checkBalance,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getBalance()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 472
    const/4 v0, 0x0

    return v0
.end method

.method private checkUnfinishedOrders()Z
    .locals 3

    .line 483
    const-string v0, "ApplyPayOrderFMOperator checkUnfinishedOrders begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 485
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->handleUnknownRechargeOrder()Z

    move-result v0

    if-nez v0, :cond_0

    .line 487
    const-string v0, "ApplyPayOrderFMOperator checkUnfinishedOrders, handleUnknownRechargeOrder fail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x3ea

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 489
    const/4 v0, 0x0

    return v0

    .line 493
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->handleUnfinishedOrders()Z

    move-result v0

    if-nez v0, :cond_1

    .line 495
    const-string v0, "ApplyPayOrderFMOperator checkUnfinishedOrders, handleUnfinishedOrders fail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x3ea

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 497
    const/4 v0, 0x0

    return v0

    .line 500
    :cond_1
    const-string v0, "ApplyPayOrderFMOperator checkUnfinishedOrders end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 501
    const/4 v0, 0x1

    return v0
.end method

.method private getRechargeAmountByOrderAmount(DLcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)D
    .locals 5

    .line 133
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 134
    iget-object v0, p3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeDiscountAmounts:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->commonRechargeAmounts:[Ljava/lang/String;

    if-nez v0, :cond_1

    .line 136
    :cond_0
    const-string v0, "ApplyPayOrderFMOperator getRechargeAmountByOrderAmount, empty item.rechargeDiscountAmounts or item.commonRechargeAmounts"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 137
    return-wide v2

    .line 142
    :cond_1
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeDiscountAmounts:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_3

    .line 144
    iget-object v0, p3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeDiscountAmounts:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    .line 145
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-nez v0, :cond_2

    .line 147
    iget-object v0, p3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->commonRechargeAmounts:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 142
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 155
    :cond_3
    goto :goto_1

    .line 151
    :catch_0
    move-exception v4

    .line 153
    const-string v0, "ApplyPayOrderFMOperator getRechargeAmountByOrderAmount, NumberFormatException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 154
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 156
    :goto_1
    return-wide v2
.end method

.method private handleUnfinishedOrders()Z
    .locals 15

    .line 591
    const/4 v3, 0x0

    .line 592
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUnfinishedOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 593
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;

    move-result-object v4

    .line 594
    iget v0, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->resultCode:I

    if-nez v0, :cond_0

    .line 596
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getBalance()I

    move-result v3

    goto :goto_0

    .line 600
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 601
    const-string v6, "ApplyPayOrderFMOperator handleUnfinishedOrders, query balance fail"

    .line 602
    const-string v0, "fail_reason"

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    const-string v0, "fail_code"

    iget v1, v4, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    const v0, 0x3611a41d

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v5, v6, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 608
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->queryAllUnfinishedOrders(I)Ljava/util/ArrayList;

    move-result-object v5

    .line 609
    const/4 v6, 0x0

    .line 610
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    .line 611
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_5

    .line 613
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 614
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosBusinessOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v10

    .line 615
    if-eqz v10, :cond_1

    iget v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 618
    :cond_1
    const-string v0, "ApplyPayOrderFMOperator handleUnfinishedOrders, illegal rechargeOrder"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 619
    goto/16 :goto_2

    .line 623
    :cond_2
    iget v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->amount:I

    add-int/2addr v0, v3

    const v1, 0x186a0

    if-le v0, v1, :cond_3

    .line 625
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 626
    const-string v12, "ApplyPayOrderFMOperator handleUnfinishedOrders, LIMITED_BALANCE"

    .line 627
    const-string v0, "fail_reason"

    invoke-interface {v11, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    const v0, 0x3611a421

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v11, v12, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 629
    goto/16 :goto_3

    .line 632
    :cond_3
    new-instance v11, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;

    invoke-direct {v11}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;-><init>()V

    .line 633
    iget-object v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setOrder([B)V

    .line 634
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setAid(Ljava/lang/String;)V

    .line 635
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUnfinishedOrdersaa  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v11}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->recharge(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v12

    .line 637
    iget v0, v12, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-nez v0, :cond_4

    .line 639
    add-int/lit8 v6, v6, 0x1

    .line 640
    iget v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->amount:I

    add-int/2addr v3, v0

    goto :goto_2

    .line 644
    :cond_4
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 645
    const-string v14, "ApplyPayOrderFMOperator handleUnfinishedOrders, recharge fail"

    .line 646
    const-string v0, "fail_reason"

    invoke-interface {v13, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    const-string v0, "fail_code"

    iget v1, v12, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    const-string v0, "order_id"

    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    const v0, 0x3611a421

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v13, v14, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 611
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 653
    :cond_5
    :goto_3
    if-ne v6, v7, :cond_6

    .line 655
    const-string v0, "ApplyPayOrderFMOperator handleUnfinishedOrders, handledCnt == len"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 656
    const/4 v0, 0x1

    return v0

    .line 659
    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method private handleUnknownRechargeOrder()Z
    .locals 11

    .line 512
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->queryAllUnknownOrders(I)Ljava/util/ArrayList;

    move-result-object v3

    .line 513
    new-instance v4, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;-><init>()V

    .line 514
    const/4 v5, 0x0

    .line 515
    const/4 v6, 0x0

    .line 516
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 518
    iget-object v0, v8, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setOrder([B)V

    .line 519
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setAid(Ljava/lang/String;)V

    .line 520
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUnknownRechargeOrder  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 521
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->doUnsolvedOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v5

    .line 522
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-eqz v0, :cond_0

    .line 524
    add-int/lit8 v6, v6, 0x1

    .line 525
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 526
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator handleUnknownRechargeOrder fail, num="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 527
    const-string v0, "fail_reason"

    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    const-string v0, "fail_code"

    iget v1, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    const-string v0, "order_id"

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    const v0, 0x3611a420

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v9, v10, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 532
    :cond_0
    goto/16 :goto_0

    .line 534
    :cond_1
    if-lez v6, :cond_2

    .line 536
    const/4 v0, 0x0

    return v0

    .line 539
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private queryAllUnfinishedOrders(I)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;>;"
        }
    .end annotation

    .line 671
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 672
    const/4 v4, 0x2

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 673
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 674
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    .line 673
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v4, v1, v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v5

    .line 675
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAllUnfinishedOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 676
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v6

    .line 677
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-nez v0, :cond_1

    .line 679
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 681
    const/4 v7, 0x0

    .line 682
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 684
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 685
    invoke-virtual {v7, v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNfcosBusinessOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;)V

    .line 686
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    goto :goto_0

    .line 688
    :cond_0
    goto :goto_1

    .line 692
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 693
    const-string v8, "ApplyPayOrderFMOperator queryAllUnfinishedOrders, query orders fail"

    .line 694
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    const v0, 0x3611a41f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 700
    :cond_2
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    .line 702
    add-int/lit8 v0, p1, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->queryAllUnfinishedOrders(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 705
    :cond_3
    return-object v3

    nop

    :array_0
    .array-data 4
        0x2
        0x4
    .end array-data
.end method

.method private queryAllUnknownOrders(I)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;>;"
        }
    .end annotation

    .line 551
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 552
    const/4 v4, 0x1

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 553
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 554
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    .line 553
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v4, v1, v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v5

    .line 555
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAllUnknownOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v6

    .line 557
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-nez v0, :cond_0

    .line 559
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 561
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 566
    :cond_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 567
    const-string v8, "ApplyPayOrderFMOperator queryAllUnknownOrders fail"

    .line 568
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    const v0, 0x3611a41f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 574
    :cond_1
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_2

    .line 576
    add-int/lit8 v0, p1, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->queryAllUnknownOrders(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 579
    :cond_2
    return-object v3

    :array_0
    .array-data 4
        0x5
    .end array-data
.end method

.method private queryHasPaiedIssueOrder()V
    .locals 9

    .line 290
    const-string v0, "ApplyPayOrderFMOperator queryHasPaiedIssueOrder begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 291
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 292
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->querySeid()[B

    move-result-object v4

    .line 293
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 294
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    .line 293
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v1, v3, v2, v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v5

    .line 295
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryHasPaiedIssueOrder  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v6

    .line 297
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-nez v0, :cond_0

    .line 300
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 302
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 303
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNfcosMainOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;)V

    .line 304
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setHasUnusedIssueOrder(Z)V

    .line 305
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNfcosBusinessOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 307
    return-void

    .line 310
    :cond_0
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_1

    .line 312
    const-string v0, "ApplyPayOrderFMOperator queryHasPaiedIssueOrder, NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 314
    return-void

    .line 317
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 318
    const-string v8, "ApplyPayOrderFMOperator queryHasPaiedIssueOrder fail"

    .line 319
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    const v0, 0x3611a41f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 322
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 323
    return-void

    :array_0
    .array-data 4
        0x2
    .end array-data
.end method


# virtual methods
.method public applyPayOrder()V
    .locals 6

    .line 92
    const-string v0, "ApplyPayOrderFMOperator applyPayOrder begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v3

    .line 94
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    const-string v0, "ApplyPayOrderFMOperator applyPayOrder, empty productId"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 98
    return-void

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v4

    .line 102
    if-nez v4, :cond_1

    .line 104
    const-string v0, "ApplyPayOrderFMOperator applyPayOrder, item == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 106
    return-void

    .line 110
    :cond_1
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mOrderType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mOrderType:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    :cond_2
    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    .line 111
    :goto_0
    if-eqz v5, :cond_4

    .line 114
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mPayType:I

    invoke-direct {p0, v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->applyIssuerOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;I)V

    goto :goto_1

    .line 119
    :cond_4
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mPayType:I

    invoke-virtual {p0, v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->applyRechargeOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;I)V

    .line 121
    :goto_1
    const-string v0, "ApplyPayOrderFMOperator applyPayOrder end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 122
    return-void
.end method

.method protected applyRechargeOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;I)V
    .locals 12

    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderFMOperator applyRechargeOrder begin, item.rechargeActCd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeActCd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 329
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->checkUnfinishedOrders()Z

    move-result v0

    if-nez v0, :cond_0

    .line 331
    const-string v0, "ApplyPayOrderFMOperator applyRechargeOrder, checkUnfinishedOrders fail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 332
    return-void

    .line 336
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->checkBalance(Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 338
    const-string v0, "ApplyPayOrderFMOperator applyRechargeOrder, checkBalance fail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 339
    return-void

    .line 342
    :cond_1
    new-instance v4, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;-><init>()V

    .line 344
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v2, p1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeActCd:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->buildServiceCode(ILjava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->setActCode([B)V

    .line 345
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->getActCode()[B

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->getActCode()[B

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_3

    .line 347
    :cond_2
    const-string v0, "ApplyPayOrderFMOperator applyRechargeOrder, empty actCode"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 349
    return-void

    .line 351
    :cond_3
    const/4 v5, 0x0

    .line 352
    const/4 v0, 0x1

    if-ne p2, v0, :cond_5

    .line 353
    const-string v0, "A00000000386980701"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 354
    const/16 v5, 0x45

    goto :goto_0

    .line 356
    :cond_4
    const/16 v5, 0x59

    goto :goto_0

    .line 358
    :cond_5
    const/4 v0, 0x2

    if-ne p2, v0, :cond_7

    .line 359
    const-string v0, "A00000000386980701"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 360
    const/16 v5, 0xa

    goto :goto_0

    .line 362
    :cond_6
    const/16 v5, 0xb

    .line 365
    :cond_7
    :goto_0
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mAmount:D

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->setAmount(I)V

    .line 367
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->setAid(Ljava/lang/String;)V

    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyRechargeOrder  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; mode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v4, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->applyRechargeOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;

    move-result-object v6

    .line 370
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "payOrder.response.resultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 371
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    if-nez v0, :cond_10

    .line 373
    const/4 v7, 0x0

    .line 374
    const/4 v8, 0x0

    .line 375
    const/4 v9, 0x0

    .line 376
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    if-eqz v0, :cond_f

    .line 378
    const-string v0, "response.order != null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 379
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->payOrders:Ljava/util/List;

    if-eqz v0, :cond_c

    .line 381
    const-string v0, "response.order.payOrders != null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 382
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->payOrders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;

    .line 384
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "payOrder.channel : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 386
    iget v0, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    const/16 v1, 0x59

    if-eq v0, v1, :cond_8

    iget v0, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    const/16 v1, 0x45

    if-ne v0, v1, :cond_9

    .line 387
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ISSUE_MODE_HW payOrder.thirdPayInfo : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 388
    iget-object v0, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v8

    .line 389
    goto :goto_2

    .line 390
    :cond_9
    iget v0, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    const/16 v1, 0xa

    if-eq v0, v1, :cond_a

    iget v0, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_b

    .line 391
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CARD_MODE_WX payOrder.thirdPayInfo : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 392
    iget-object v0, v11, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v9

    .line 393
    goto :goto_2

    .line 395
    :cond_b
    const-string v0, " applyRechargeOrder payOrder channel else "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 397
    goto/16 :goto_1

    .line 400
    :cond_c
    :goto_2
    const/4 v0, 0x0

    if-ne v0, v8, :cond_d

    const/4 v0, 0x0

    if-eq v0, v9, :cond_e

    .line 402
    :cond_d
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 403
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNfcosMainOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;)V

    .line 404
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mPayType:I

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayType(I)V

    .line 405
    invoke-virtual {v7, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPayInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;)V

    .line 406
    invoke-virtual {v7, v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setWXPayInfo(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;)V

    goto :goto_3

    .line 410
    :cond_e
    const-string v0, "ApplyPayOrderFMOperator applyRechargeOrder, payInfo == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 411
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 412
    return-void

    .line 417
    :cond_f
    const-string v0, "ApplyPayOrderFMOperator applyRechargeOrder, response.order == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 419
    return-void

    .line 422
    :goto_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 423
    return-void

    .line 425
    :cond_10
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_11

    .line 427
    const-string v0, "ApplyPayOrderFMOperator applyRechargeOrder, NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 429
    return-void

    .line 432
    :cond_11
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 433
    const-string v8, "ApplyPayOrderFMOperator applyRechargeOrder fail"

    .line 434
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    const v0, 0x3611a419

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 437
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    const/16 v1, 0x63

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 438
    return-void
.end method
