.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cplc:Ljava/lang/String;

.field private mBussnessType:I

.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mIsDeal:Z

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

.field private trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;IZLcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mIsDeal:Z

    .line 69
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    .line 70
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 71
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    .line 72
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mBussnessType:I

    .line 73
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->cplc:Ljava/lang/String;

    .line 74
    iput-boolean p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mIsDeal:Z

    .line 75
    return-void
.end method

.method private checkLocalAppletStatus()Z
    .locals 9

    .line 223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 224
    const/4 v5, 0x0

    .line 225
    if-eqz v4, :cond_4

    .line 227
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 229
    const/4 v0, 0x1

    return v0

    .line 231
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;->createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 232
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;->readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    move-result-object v6

    .line 233
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 235
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->updateTaInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;Ljava/lang/String;)Z

    move-result v5

    goto :goto_0

    .line 240
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->isDeleteApplet(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 241
    const-string v0, "===aaa===\u672a\u5b8c\u6210\u8ba2\u5355"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 242
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v7, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Z)V

    .line 243
    const-string v0, "6"

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->uninstall(Ljava/lang/String;)Z

    move-result v8

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator remove the ta card for re-openning. The old card deleted["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 245
    if-eqz v8, :cond_2

    .line 247
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->removeTACardInfo()Z

    .line 249
    :cond_2
    const/4 v5, 0x0

    .line 250
    goto :goto_0

    .line 251
    :cond_3
    const/4 v5, 0x1

    .line 256
    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator checkCardExist="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 258
    return v5
.end method

.method private cleanTrafficCardApplet(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 7

    .line 516
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->get2DelRstIssueId(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v4

    .line 517
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 519
    :cond_0
    const-string v0, "QueryAndHandleUnfinishedOrdersSAOperator get2DelRstIssueId result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 520
    return-void

    .line 524
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 525
    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 527
    const-string v0, "QueryAndHandleUnfinishedOrdersSAOperator get2DelRstIssueId remove result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 528
    return-void

    .line 531
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

    .line 532
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator uninstallTrafficCard begin issueId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 533
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    move-result-object v0

    const-string v1, "7"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v6, v2, v1, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->uninstallTrafficCard(Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/UninstallTrafficCardCallback;)V

    .line 534
    goto :goto_0

    .line 537
    :cond_3
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;-><init>(Landroid/content/Context;)V

    .line 538
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitNowLoader;->excuteEseInit()I

    move-result v6

    .line 539
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator excuteEseInit initResult = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 540
    return-void
.end method

.method private handleCommenErr(I)Z
    .locals 5

    .line 473
    const/4 v3, 0x1

    .line 474
    const/16 v4, 0x63

    .line 475
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 478
    :pswitch_0
    const/16 v4, 0xa

    .line 479
    goto :goto_1

    .line 481
    :pswitch_1
    const/16 v4, 0xb

    .line 482
    goto :goto_1

    .line 484
    :pswitch_2
    const/16 v4, 0x19

    .line 485
    goto :goto_1

    .line 487
    :pswitch_3
    const/16 v4, 0xe

    .line 488
    goto :goto_1

    .line 490
    :goto_0
    const/4 v3, 0x0

    .line 494
    :goto_1
    if-eqz v3, :cond_0

    .line 496
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x2710

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 499
    :cond_0
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private handleOpenCardOrders()V
    .locals 6

    .line 188
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getQueryOrders()Ljava/util/List;

    move-result-object v2

    .line 190
    const/4 v3, 0x0

    .line 191
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 193
    const-string v0, "2"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "0"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    :cond_0
    move-object v3, v5

    .line 196
    goto :goto_1

    .line 198
    :cond_1
    goto :goto_0

    .line 200
    :cond_2
    :goto_1
    if-eqz v3, :cond_6

    .line 202
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v4

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 205
    const-string v0, "801"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 207
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->retryInstallSSD(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;)V

    goto :goto_2

    .line 209
    :cond_3
    const-string v0, "802"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "803"

    .line 210
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 212
    :cond_4
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->retryInstallApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;)V

    goto :goto_2

    .line 214
    :cond_5
    const-string v0, "900"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 216
    const-string v0, "1"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->retryOpenCardRecharge(Ljava/lang/String;)V

    .line 219
    :cond_6
    :goto_2
    return-void
.end method

.method private handleRechargeOrders()V
    .locals 11

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getQueryOrders()Ljava/util/List;

    move-result-object v4

    .line 150
    const/4 v5, 0x0

    .line 151
    const/16 v6, 0x577

    .line 152
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 154
    const-string v0, "900"

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator o.getStatus()="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 157
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 158
    new-instance v9, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v3, 0x0

    invoke-direct {v9, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V

    .line 159
    invoke-virtual {v9, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->recharge(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;)I

    move-result v10

    .line 161
    if-nez v10, :cond_0

    .line 163
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 167
    :cond_0
    move v6, v10

    .line 170
    :cond_1
    :goto_1
    goto :goto_0

    .line 171
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator rechargeOrderCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 173
    if-lez v5, :cond_3

    .line 175
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v7, v0, v5, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 176
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2712

    invoke-virtual {v0, v1, v2, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 178
    goto :goto_2

    .line 181
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x2712

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 184
    :goto_2
    return-void
.end method

.method private queryOrders()Z
    .locals 18

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v6

    .line 408
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v7

    .line 409
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v8

    .line 411
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->cplc:Ljava/lang/String;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v3

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v9, v0

    .line 413
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v10

    .line 414
    invoke-virtual {v10}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/nfc/PluginPayAdapter;

    .line 415
    invoke-interface {v11}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 416
    const-string v0, "1"

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setOrderStatus(Ljava/lang/String;)V

    .line 417
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v9}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;

    move-result-object v12

    .line 419
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryOrder err : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 422
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->handleCommenErr(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 424
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryOrder err : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 425
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 424
    move-object/from16 v2, p0

    const v3, 0x3611a46b

    invoke-direct {v2, v3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->reportErr(IILjava/lang/String;)V

    .line 426
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x63

    const/16 v2, 0x2710

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 429
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 432
    :cond_1
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 434
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v13

    .line 435
    if-eqz v13, :cond_6

    .line 437
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 438
    const/4 v15, 0x0

    .line 439
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 441
    const-string v0, "900"

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "803"

    .line 442
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "802"

    .line 443
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "801"

    .line 444
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 446
    :cond_2
    move-object/from16 v0, v17

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    const-string v0, "2"

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "0"

    .line 448
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 450
    :cond_3
    const/4 v15, 0x1

    .line 453
    :cond_4
    goto :goto_0

    .line 454
    :cond_5
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator, there is unfinished orders, size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 457
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 456
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 458
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 459
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0, v14}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setQueryOrders(Ljava/util/List;)V

    .line 460
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0, v15}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setHasUnusedIssueOrder(Z)V

    .line 463
    :cond_6
    goto :goto_1

    .line 466
    :cond_7
    const-string v0, "QueryAndHandleUnfinishedOrdersSAOperator, there is no unfinished order!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 468
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method private removeTACardInfo()Z
    .locals 4

    .line 283
    const/4 v2, 0x0

    .line 286
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 287
    const/4 v2, 0x1

    .line 297
    goto :goto_0

    .line 289
    :catch_0
    move-exception v3

    .line 291
    const-string v0, "WalletTaCardNotExistException "

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    const/4 v2, 0x1

    .line 297
    goto :goto_0

    .line 294
    :catch_1
    move-exception v3

    .line 296
    const-string v0, "WalletTaSystemErrorException "

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 298
    :goto_0
    return v2
.end method

.method private reportErr(IILjava/lang/String;)V
    .locals 4

    .line 504
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 505
    const-string v0, "fail_reason"

    invoke-interface {v3, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    const-string v0, "fail_code"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    const-string v0, "issuerID"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApplyPayOrderOperator err : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 509
    return-void
.end method

.method private retryInstallApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;)V
    .locals 7

    .line 326
    const-string v0, "do retryInstallApplet"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 327
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V

    .line 328
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->issueTrafficCard()I

    move-result v5

    .line 329
    if-nez v5, :cond_1

    .line 331
    const-string v0, "retryInstallApplet success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 332
    const-string v0, "2"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 334
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->retryOpenCardRecharge(Ljava/lang/String;)V

    goto :goto_0

    .line 338
    :cond_0
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v6, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2712

    invoke-virtual {v0, v1, v2, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 341
    goto :goto_0

    .line 345
    :cond_1
    const-string v0, "retryInstallApplet fail!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 346
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->handleCommenErr(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 348
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x4af

    const/16 v2, 0x2711

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 352
    :cond_2
    :goto_0
    return-void
.end method

.method private retryInstallSSD(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;)V
    .locals 8

    .line 356
    const-string v0, "do retryInstallSSD"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 357
    const/16 v3, 0x4af

    .line 358
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;-><init>(Landroid/content/Context;)V

    .line 359
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->excuteEseInit()I

    move-result v5

    .line 360
    const v0, 0x186a0

    if-eq v5, v0, :cond_0

    .line 362
    const-string v0, "retryInstallSSD fail! Init eSE fail!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 363
    const-string v0, "retryInstallSSD fail! Init eSE fail!"

    const v1, 0x3611a467

    invoke-direct {p0, v1, v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->reportErr(IILjava/lang/String;)V

    .line 365
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 368
    :pswitch_0
    const/16 v3, 0xb

    .line 369
    goto :goto_1

    .line 372
    :pswitch_1
    const/16 v3, 0x19

    .line 373
    goto :goto_1

    .line 376
    :pswitch_2
    const/16 v3, 0xc

    .line 377
    goto :goto_1

    .line 379
    :goto_0
    :pswitch_3
    const/16 v3, 0x4af

    .line 382
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x2711

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 384
    return-void

    .line 386
    :cond_0
    const-string v0, "===aaa==delete==\u672a\u5b8c\u6210\u8ba2\u5355123"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 387
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    const/4 v2, 0x0

    invoke-direct {v6, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Z)V

    .line 388
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;->excute()I

    move-result v7

    .line 389
    if-nez v7, :cond_1

    .line 391
    const-string v0, "retryInstallSSD success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 392
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->retryInstallApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;)V

    goto :goto_2

    .line 396
    :cond_1
    const-string v0, "retryInstallSSD fail!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x2711

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 400
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x186a2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method private retryOpenCardRecharge(Ljava/lang/String;)V
    .locals 7

    .line 303
    const-string v0, "do retryOpenCardRecharge"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 304
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V

    .line 305
    invoke-virtual {v4, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->recharge(Ljava/lang/String;)I

    move-result v5

    .line 306
    if-nez v5, :cond_0

    .line 308
    const-string v0, "retryOpenCardRecharge success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 309
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v6, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 310
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2712

    invoke-virtual {v0, v1, v2, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 312
    goto :goto_0

    .line 315
    :cond_0
    const-string v0, "retryOpenCardRecharge fail!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 316
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->handleCommenErr(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 318
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0x577

    const/16 v2, 0x2711

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 322
    :cond_1
    :goto_0
    return-void
.end method

.method private updateTaInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;Ljava/lang/String;)Z
    .locals 3

    .line 263
    invoke-virtual {p1, p2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setFpanFour(Ljava/lang/String;)V

    .line 264
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setCardStatus(I)V

    .line 265
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->removeTACardInfo()Z

    move-result v1

    .line 266
    if-eqz v1, :cond_0

    .line 270
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->addCard(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    const/4 v0, 0x1

    return v0

    .line 273
    :catch_0
    move-exception v2

    .line 275
    const-string v0, "WalletTaCardAlreadyExistException "

    invoke-static {v0, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 278
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public queryAndHandleUnfinishedOrders()V
    .locals 7

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator queryAndHandleUnfinishedOrders begin bussness type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mBussnessType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v4

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v5

    .line 83
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator queryAndHandleUnfinishedOrders failed. aid or productId is illegal. aid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/16 v1, 0xa

    const/16 v2, 0x2710

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 89
    return-void

    .line 92
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->queryOrders()Z

    move-result v0

    if-nez v0, :cond_2

    .line 94
    const-string v0, "QueryAndHandleUnfinishedOrdersSAOperator, queryOrders fail!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 95
    return-void

    .line 97
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator trafficOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->cleanTrafficCardApplet(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    if-eqz v0, :cond_4

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2711

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator mIsDeal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mIsDeal:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 109
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mIsDeal:Z

    if-eqz v0, :cond_6

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator trafficOrder.getHasUnusedIssueOrder()="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 112
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getHasUnusedIssueOrder()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 111
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 113
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mBussnessType:I

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 114
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getHasUnusedIssueOrder()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 116
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->handleOpenCardOrders()V

    goto :goto_0

    .line 118
    :cond_3
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mBussnessType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 120
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->handleRechargeOrders()V

    goto :goto_0

    .line 127
    :cond_4
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mBussnessType:I

    if-nez v0, :cond_5

    .line 128
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->checkLocalAppletStatus()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 130
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v6, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;-><init>(IIII)V

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2711

    invoke-virtual {v0, v1, v2, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2712

    invoke-virtual {v0, v1, v2, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 138
    goto :goto_0

    .line 141
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAndHandleUnfinishedOrdersSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    const/4 v1, 0x0

    const/16 v2, 0x2710

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 145
    :cond_6
    :goto_0
    return-void
.end method
