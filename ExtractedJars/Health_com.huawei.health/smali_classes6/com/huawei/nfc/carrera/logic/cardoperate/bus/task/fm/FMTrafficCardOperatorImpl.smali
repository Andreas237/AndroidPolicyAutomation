.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    .line 52
    return-void
.end method


# virtual methods
.method public applyPayOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
    .locals 10

    .line 140
    const-string v0, "FMTrafficCardOperatorImpl, applyPayOrder begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 141
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    move-wide v2, p2

    move v4, p4

    move v5, p5

    move-object v6, p1

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;-><init>(Landroid/content/Context;DIILcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V

    move-object v9, v0

    .line 142
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/ApplyPayOrderFMOperator;->applyPayOrder()V

    .line 143
    return-void
.end method

.method public applyPayOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
    .locals 1

    .line 190
    const-string v0, "applyPayOrder"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 191
    return-void
.end method

.method public getIssueCardCoupon(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
    .locals 4

    .line 113
    const-string v0, "FMTrafficCardOperatorImpl, getIssueCardCoupon begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 114
    const/4 v2, 0x0

    .line 115
    const-string v0, "5943542E55534552"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 117
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->getIssueCardCoupon()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    move-result-object v2

    .line 118
    goto :goto_0

    .line 120
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;-><init>()V

    .line 121
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 123
    :goto_0
    return-object v2
.end method

.method public getRechargeCoupon(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
    .locals 2

    .line 129
    const-string v0, "FMTrafficCardOperatorImpl, getRechargeCoupon begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 131
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;-><init>()V

    .line 132
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 133
    return-object v1
.end method

.method public issueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V
    .locals 2

    .line 65
    const-string v0, "FMTrafficCardOperatorImpl, issueTrafficCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 66
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V

    .line 67
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->issueTrafficCard()I

    .line 68
    return-void
.end method

.method public preIssueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 2

    .line 57
    const-string v0, "FMTrafficCardOperatorImpl, preIssueTrafficCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 58
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 59
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->preIssueTrafficCard()V

    .line 60
    return-void
.end method

.method public queryAndHandleUnfinfishedOrders(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V
    .locals 2

    .line 90
    const-string v0, "FMTrafficCardOperatorImpl, queryAndHandleUnfinfishedOrders begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 91
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V

    .line 93
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->queryAndHandleUnfinishedOrders()V

    .line 94
    return-void
.end method

.method public queryOfflineCardInfo(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)V
    .locals 8

    .line 149
    const/4 v3, 0x0

    .line 150
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 153
    const/4 v3, 0x1

    .line 155
    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    .line 158
    or-int/lit8 v3, v3, 0x2

    .line 160
    :cond_1
    and-int/lit8 v0, p2, 0x4

    if-eqz v0, :cond_2

    .line 163
    or-int/lit8 v3, v3, 0x20

    .line 165
    :cond_2
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;-><init>()V

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryOfflineCardInfo myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;

    move-result-object v5

    .line 168
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->resultCode:I

    if-eqz v0, :cond_3

    .line 170
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 171
    const-string v7, "FMTrafficCardOperatorImpl queryOfflineCardInfo, query card info fail"

    .line 172
    const-string v0, "fail_reason"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    const-string v0, "fail_code"

    iget v1, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    const v0, 0x3611a41d

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v6, v7, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 175
    const/16 v0, 0x63

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V

    .line 176
    return-void

    .line 178
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getCardNo()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->setCardNo(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getBalance()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertFenToYuan(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->setBalance(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getTime4Validity()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 182
    .line 183
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getTime4Validity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyyMMdd"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/TimeUtil;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy/MM/dd"

    .line 182
    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/TimeUtil;->d(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->setExpireDate(Ljava/lang/String;)V

    .line 185
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p3, v0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V

    .line 186
    return-void
.end method

.method public queryRecords(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V
    .locals 3

    .line 99
    const-string v0, "FMTrafficCardOperatorImpl, queryRecords begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 100
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, p2, p3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;-><init>(Landroid/content/Context;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->queryRecords()V

    .line 102
    return-void
.end method

.method public recharge(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V
    .locals 3

    .line 81
    const-string v0, "FMTrafficCardOperatorImpl, recharge begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 82
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, p2, p3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;Ljava/lang/String;)V

    .line 83
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/recharge/RechargeFMOperator;->recharge()V

    .line 84
    return-void
.end method

.method public refund(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)V
    .locals 1

    .line 107
    const-string v0, "FMTrafficCardOperatorImpl, refund begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 108
    return-void
.end method

.method public uninstallTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;)V
    .locals 2

    .line 73
    const-string v0, "FMTrafficCardOperatorImpl, uninstallTrafficCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 74
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1, p4, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Z)V

    .line 75
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/uninstall/UninstallTrafficCardFMOperator;->uninstall()V

    .line 76
    return-void
.end method
