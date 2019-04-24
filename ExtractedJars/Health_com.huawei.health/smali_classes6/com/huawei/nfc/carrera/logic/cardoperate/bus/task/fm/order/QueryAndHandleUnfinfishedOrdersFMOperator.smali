.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;
    }
.end annotation


# static fields
.field private static final LIMITED_BALANCE:I = 0x186a0


# instance fields
.field private mBussnessType:I

.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

.field private unfinishedStatus:[I

.field private unknownStatus:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->unknownStatus:[I

    .line 59
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->unfinishedStatus:[I

    .line 65
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    .line 66
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 67
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    .line 68
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mBussnessType:I

    .line 69
    return-void

    :array_0
    .array-data 4
        0x5
    .end array-data

    :array_1
    .array-data 4
        0x2
        0x4
    .end array-data
.end method

.method private cleanTrafficCardApplet(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 7

    .line 502
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->get2DelRstIssueId(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v4

    .line 503
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 505
    :cond_0
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator get2DelRstIssueId result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 506
    return-void

    .line 509
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 510
    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 512
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator get2DelRstIssueId remove result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 513
    return-void

    .line 516
    :cond_2
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 518
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinfishedOrdersFMOperator uninstallTrafficCard begin issueId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    move-result-object v0

    const-string v1, "7"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v6, v2, v1, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->uninstallTrafficCard(Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/UninstallTrafficCardCallback;)V

    .line 522
    goto :goto_0

    .line 525
    :cond_3
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;-><init>(Landroid/content/Context;)V

    .line 526
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;->excuteEseInit()I

    move-result v6

    .line 527
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinfishedOrdersFMOperator excuteEseInit initResult = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 528
    return-void
.end method

.method private handleSpecialIssuerOrder()Z
    .locals 8

    .line 450
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator handleSpecialIssuerOrder being"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 453
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    .line 452
    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;

    move-result-object v4

    .line 454
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getCardNo()Ljava/lang/String;

    move-result-object v5

    .line 455
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v6

    .line 456
    if-eqz v6, :cond_1

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUnfinishedOrders checkExistsAndGetTaCardInfo failed. card exists in SE ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-nez v6, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 461
    const-string v3, "handleUnfinishedOrders handleSpecialIssuerOrder failed. remove ta cardinfo for reopenning card is available."

    .line 462
    :try_start_0
    invoke-static {v3}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 470
    goto :goto_1

    .line 464
    :catch_0
    move-exception v7

    .line 465
    const-string v3, "handleUnfinishedOrders handleSpecialIssuerOrder failed WalletTaCardNotExistException"

    .line 466
    invoke-static {v3}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 470
    goto :goto_1

    .line 467
    :catch_1
    move-exception v7

    .line 468
    const-string v3, "handleUnfinishedOrders handleSpecialIssuerOrder failed WalletTaSystemErrorException"

    .line 469
    invoke-static {v3}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 472
    :goto_1
    const/4 v0, 0x0

    return v0

    .line 477
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->updateTaCardAvailable()Z

    move-result v0

    return v0
.end method

.method private handleUnfinishedOrders(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;)V
    .locals 18

    .line 164
    const/4 v5, 0x0

    .line 165
    const-string v0, " CardEvent queryCardInfo bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 167
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUnfinishedOrderssss  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;

    move-result-object v6

    .line 171
    const-string v0, " CardEvent queryCardInfo bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 173
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 174
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->resultCode:I

    if-nez v0, :cond_0

    .line 176
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getBalance()I

    move-result v5

    goto :goto_0

    .line 180
    :cond_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 181
    const-string v8, "QueryAndHandleUnfinfishedOrdersFMOperator handleUnfinishedOrders, query balance fail"

    .line 182
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    const v0, 0x3611a41d

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 188
    :goto_0
    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;->mUnfinishedOrders:Ljava/util/List;

    .line 189
    const/4 v8, 0x0

    .line 190
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    .line 191
    const/4 v10, 0x0

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    :goto_1
    if-ge v10, v11, :cond_5

    .line 193
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 194
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosBusinessOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v13

    .line 195
    if-eqz v13, :cond_1

    iget v0, v13, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 198
    :cond_1
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator handleUnfinishedOrders, illegal rechargeOrder"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 199
    goto/16 :goto_2

    .line 202
    :cond_2
    iget v0, v13, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->amount:I

    add-int/2addr v0, v5

    const v1, 0x186a0

    if-le v0, v1, :cond_3

    .line 204
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 205
    const-string v15, "QueryAndHandleUnfinfishedOrdersFMOperator handleUnfinishedOrders, LIMITED_BALANCE"

    .line 206
    const-string v0, "fail_reason"

    invoke-interface {v14, v0, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const v0, 0x3611a421

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v14, v15, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 208
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    move v1, v9

    move v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    move-object/from16 v16, v0

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x4b1

    move-object/from16 v3, v16

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 211
    return-void

    .line 214
    :cond_3
    const-string v0, " CardEvent RECHARGE bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 216
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 218
    new-instance v14, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;

    invoke-direct {v14}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;-><init>()V

    .line 219
    iget-object v0, v13, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-virtual {v14, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setOrder([B)V

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setAid(Ljava/lang/String;)V

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUnfinishedOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v14}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->recharge(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v15

    .line 224
    const-string v0, " CardEvent RECHARGE bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 226
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 227
    iget v0, v15, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-nez v0, :cond_4

    .line 229
    add-int/lit8 v8, v8, 0x1

    .line 230
    iget v0, v13, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->amount:I

    add-int/2addr v5, v0

    goto :goto_2

    .line 234
    :cond_4
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 235
    const-string v17, "QueryAndHandleUnfinfishedOrdersFMOperator handleUnfinishedOrders, recharge fail"

    .line 236
    const-string v0, "fail_reason"

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    const-string v0, "fail_code"

    iget v1, v15, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    const-string v0, "order_id"

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    const v0, 0x3611a421

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 191
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 242
    :cond_5
    new-instance v10, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {v10, v9, v8, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2712

    invoke-virtual {v0, v1, v2, v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 245
    return-void
.end method

.method private handleUnknownOrders()V
    .locals 11

    .line 314
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->queryAllUnknownOrders(I)Ljava/util/ArrayList;

    move-result-object v3

    .line 315
    new-instance v4, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;-><init>()V

    .line 316
    const/4 v5, 0x0

    .line 317
    const/4 v6, 0x0

    .line 318
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

    .line 320
    iget-object v0, v8, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setOrder([B)V

    .line 321
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setAid(Ljava/lang/String;)V

    .line 322
    const-string v0, " CardEvent doUnsolvedOrder bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 324
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 325
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUnknownOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->doUnsolvedOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v5

    .line 328
    const-string v0, " CardEvent doUnsolvedOrder bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 330
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 332
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-eqz v0, :cond_0

    .line 334
    add-int/lit8 v6, v6, 0x1

    .line 335
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinfishedOrdersFMOperator handleUnknownOrders fail, num="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 337
    const-string v0, "fail_reason"

    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    const-string v0, "fail_code"

    iget v1, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    const-string v0, "order_id"

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    const v0, 0x3611a420

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v9, v10, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 342
    :cond_0
    goto/16 :goto_0

    .line 343
    :cond_1
    return-void
.end method

.method private queryAllUnfinishedOrders(I)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;>;"
        }
    .end annotation

    .line 271
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 272
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->unfinishedStatus:[I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 273
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    .line 272
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v0, v2, v3, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v5

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAllUnfinishedOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v6

    .line 276
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-nez v0, :cond_1

    .line 278
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 280
    const/4 v7, 0x0

    .line 281
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

    .line 283
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 284
    invoke-virtual {v7, v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNfcosBusinessOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;)V

    .line 285
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    goto :goto_0

    .line 287
    :cond_0
    goto :goto_1

    .line 291
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 292
    const-string v8, "QueryAndHandleUnfinfishedOrdersFMOperator queryAllUnfinishedOrders, query orders fail"

    .line 293
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    const v0, 0x3611a41f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 299
    :cond_2
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    .line 301
    add-int/lit8 v0, p1, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->queryAllUnfinishedOrders(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 304
    :cond_3
    return-object v4
.end method

.method private queryAllUnknownOrders(I)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;>;"
        }
    .end annotation

    .line 354
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 355
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->unknownStatus:[I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 356
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    .line 355
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v0, v2, v3, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v5

    .line 357
    const-string v0, " CardEvent queryBusinessOrders bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 359
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 360
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAllUnknownOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 361
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v6

    .line 362
    const-string v0, " CardEvent queryBusinessOrders bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 364
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 366
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-nez v0, :cond_0

    .line 368
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 370
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 375
    :cond_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 376
    const-string v8, "QueryAndHandleUnfinfishedOrdersFMOperator queryAllUnknownOrders fail"

    .line 377
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    const-string v0, "fail_code"

    iget v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    const v0, 0x3611a41f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v7, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 383
    :cond_1
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_2

    .line 385
    add-int/lit8 v0, p1, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->queryAllUnknownOrders(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 388
    :cond_2
    return-object v4
.end method

.method private queryIssueBusinessOrders()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;
    .locals 10

    .line 393
    const/4 v4, 0x2

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 395
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->querySeid()[B

    move-result-object v5

    .line 396
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 397
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    .line 396
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v1, v4, v2, v5, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v6

    .line 398
    const-string v0, " CardEvent queryBusinessOrders bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 399
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 400
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 401
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryIssueBusinessOrders  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 402
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v7

    .line 403
    const-string v0, " CardEvent queryBusinessOrders bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 405
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 407
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-nez v0, :cond_0

    .line 410
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 412
    new-instance v8, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    .line 413
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setNfcosBusinessOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;)V

    .line 414
    return-object v8

    .line 417
    :cond_0
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_1

    .line 419
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator queryIssueBusinessOrders, NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 420
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0xb

    const/16 v2, 0x2710

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 422
    const/4 v0, 0x0

    return-object v0

    .line 425
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->handleSpecialIssuerOrder()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 426
    new-instance v8, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v8, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 427
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2712

    invoke-virtual {v0, v1, v2, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 429
    goto :goto_0

    .line 430
    :cond_2
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 431
    const-string v9, "QueryAndHandleUnfinfishedOrdersFMOperator queryIssueBusinessOrders, query issue order fail"

    .line 432
    const-string v0, "fail_reason"

    invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    const-string v0, "fail_code"

    iget v1, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    const v0, 0x3611a41f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v8, v9, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 435
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x63

    const/16 v2, 0x2710

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 438
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x2
        0x3
    .end array-data
.end method

.method private queryUnfinishedOrders()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;
    .locals 6

    .line 144
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator queryUnfinishedOrders begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 146
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->handleUnknownOrders()V

    .line 148
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->queryAllUnfinishedOrders(I)Ljava/util/ArrayList;

    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 150
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {v4, v3, v3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 151
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;

    invoke-direct {v5, v2, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;-><init>(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 152
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator queryUnfinishedOrders end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 153
    return-object v5
.end method

.method private updateTaCardAvailable()Z
    .locals 6

    .line 480
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v2

    .line 481
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 482
    const-string v4, "updateTaCardAvailable success."

    .line 483
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 484
    const/4 v0, 0x1

    return v0

    .line 486
    :cond_0
    const/4 v5, 0x0

    .line 487
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 488
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setCardStatus(I)V

    .line 489
    invoke-virtual {v2, v3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Z

    move-result v5

    .line 492
    :cond_1
    const-string v4, "handleUnfinishedOrders updateTaCardAvailable success"

    .line 493
    invoke-static {v4}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 494
    return v5
.end method


# virtual methods
.method public queryAndHandleUnfinishedOrders()V
    .locals 8

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinfishedOrdersFMOperator queryAndHandleUnfinishedOrders begin bussness type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mBussnessType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 77
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mBussnessType:I

    if-nez v0, :cond_2

    .line 80
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->queryIssueBusinessOrders()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    move-result-object v4

    .line 81
    if-nez v4, :cond_0

    .line 83
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator queryIssueBusinessOrders failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 84
    return-void

    .line 86
    :cond_0
    const-string v0, " CardEvent issueTrafficCard bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 88
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->cleanTrafficCardApplet(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 94
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    const/4 v2, 0x0

    invoke-direct {v5, v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V

    .line 95
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->issueTrafficCard()I

    move-result v6

    .line 97
    const-string v0, " CardEvent issueTrafficCard bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 99
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 101
    const/4 v7, 0x0

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinfishedOrdersFMOperator queryAndHandleUnfinishedOrders, issueTrafficCard result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 103
    if-nez v6, :cond_1

    .line 106
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->doRecharge()V

    .line 107
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v7, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 108
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x2712

    invoke-virtual {v0, v6, v1, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 110
    return-void

    .line 113
    :cond_1
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v7, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x2711

    invoke-virtual {v0, v6, v1, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 116
    return-void

    .line 123
    :cond_2
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->queryUnfinishedOrders()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;

    move-result-object v4

    .line 124
    iget-object v5, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;->mUnfinishedOrders:Ljava/util/List;

    .line 125
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 128
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator queryAndHandleUnfinishedOrders, no unfinished orders"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2710

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 131
    return-void

    .line 134
    :cond_3
    const-string v0, "QueryAndHandleUnfinfishedOrdersFMOperator queryAndHandleUnfinishedOrders, exist unfinished orders"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 135
    iget-object v6, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;->mResultInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2711

    invoke-virtual {v0, v1, v2, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 139
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;->handleUnfinishedOrders(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;)V

    .line 140
    return-void
.end method
