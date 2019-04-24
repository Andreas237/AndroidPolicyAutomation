.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;


# static fields
.field private static final TAG:Ljava/lang/String; = "ServerAccessImp"


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    .line 41
    return-void
.end method


# virtual methods
.method public applyPayOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
    .locals 0

    .line 73
    return-void
.end method

.method public applyPayOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
    .locals 2

    .line 86
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V

    .line 87
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ApplyPayOrderOperator;->doApplyPayOrder()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;

    .line 88
    return-void
.end method

.method public getIssueCardCoupon(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
    .locals 3

    .line 143
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;

    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, v1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 145
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->queryAmount()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    move-result-object v0

    return-object v0
.end method

.method public getRechargeCoupon(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
    .locals 5

    .line 157
    const-string v0, "ServerAccessImp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getRechargeCoupon "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;

    const-string v0, "2"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0, v1, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 159
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->queryAmount()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    move-result-object v0

    return-object v0
.end method

.method public issueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V
    .locals 2

    .line 66
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V

    .line 67
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->issueTrafficCard()I

    .line 68
    return-void
.end method

.method public preIssueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 5

    .line 51
    const-string v0, "ServerAccessImp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter preIssueTrafficCard "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {v4, v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Z)V

    .line 53
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;->excute()I

    .line 54
    return-void
.end method

.method public queryAndHandleUnfinfishedOrders(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V
    .locals 7

    .line 122
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    move-object v2, p1

    move v3, p2

    move-object v5, p3

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;IZLcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V

    move-object v6, v0

    .line 124
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->queryAndHandleUnfinishedOrders()V

    .line 125
    return-void
.end method

.method public queryOfflineCardInfo(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)V
    .locals 7

    .line 166
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v2

    .line 167
    const/4 v3, 0x0

    .line 168
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 171
    const/4 v3, 0x1

    .line 173
    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    .line 176
    or-int/lit8 v3, v3, 0x2

    .line 178
    :cond_1
    and-int/lit8 v0, p2, 0x4

    if-eqz v0, :cond_2

    .line 181
    or-int/lit8 v3, v3, 0x4

    .line 184
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;->createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;

    move-result-object v0

    .line 185
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    .line 184
    invoke-interface {v0, v2, v1, v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;->readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    move-result-object v4

    .line 186
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_4

    .line 188
    if-eqz p3, :cond_3

    .line 190
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->geteSEErrorCode(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V

    .line 192
    :cond_3
    return-void

    .line 194
    :cond_4
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;-><init>()V

    .line 195
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getData()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    .line 196
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->setCardNo(Ljava/lang/String;)V

    .line 198
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_5

    .line 200
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getFormatedBalanceByYuanUnit()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->setBalance(Ljava/lang/String;)V

    .line 202
    :cond_5
    and-int/lit8 v0, p2, 0x4

    if-eqz v0, :cond_6

    .line 204
    const-string v0, "yyyy/MM/dd"

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getFormatedExpireDate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->setExpireDate(Ljava/lang/String;)V

    .line 206
    :cond_6
    if-eqz p3, :cond_7

    .line 208
    const/4 v0, 0x0

    invoke-virtual {p3, v0, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V

    .line 210
    :cond_7
    return-void
.end method

.method public queryRecords(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V
    .locals 2

    .line 132
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V

    .line 133
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->queryRecords()V

    .line 134
    return-void
.end method

.method public recharge(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V
    .locals 5

    .line 115
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V

    .line 116
    const-string v0, "0"

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->recharge(Ljava/lang/String;)I

    .line 117
    const-string v0, "ServerAccessImp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recharge end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    return-void
.end method

.method public refund(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)V
    .locals 0

    .line 139
    return-void
.end method

.method public uninstallTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;)V
    .locals 5

    .line 100
    const-string v0, "ServerAccessImp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter uninstallTrafficCard "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0, p1, p4, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Z)V

    .line 102
    invoke-virtual {v4, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->uninstall(Ljava/lang/String;)Z

    .line 103
    return-void
.end method
