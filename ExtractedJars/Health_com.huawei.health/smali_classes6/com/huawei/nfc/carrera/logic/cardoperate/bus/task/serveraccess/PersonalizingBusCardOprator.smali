.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private final mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field private final mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 56
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 57
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    .line 58
    return-void
.end method

.method private addTaCard()V
    .locals 4

    .line 263
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 264
    if-eqz v2, :cond_0

    .line 266
    const-string v0, "add bus card to TA, allready add, do nothing."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 267
    return-void

    .line 270
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;-><init>()V

    .line 271
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setAid(Ljava/lang/String;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setIssuerId(Ljava/lang/String;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setProductId(Ljava/lang/String;)V

    .line 274
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setCardGroupType(I)V

    .line 275
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setDefaultCard(Z)V

    .line 276
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setDpanDigest(Ljava/lang/String;)V

    .line 277
    const-string v0, ""

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setDpanFour(Ljava/lang/String;)V

    .line 278
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setCardType(I)V

    .line 279
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setStatusUpdateTime(J)V

    .line 280
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setCardStatus(I)V

    .line 283
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->addCard(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_3

    .line 300
    goto :goto_0

    .line 285
    :catch_0
    move-exception v3

    .line 287
    const-string v0, "WalletTaCardAlreadyExistException "

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 300
    goto :goto_0

    .line 289
    :catch_1
    move-exception v3

    .line 291
    const-string v0, "WalletTaCardNumReachMaxException "

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 300
    goto :goto_0

    .line 293
    :catch_2
    move-exception v3

    .line 295
    const-string v0, "WalletTaBadParammeterException "

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 300
    goto :goto_0

    .line 297
    :catch_3
    move-exception v3

    .line 299
    const-string v0, "WalletTaSystemErrorException "

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    :goto_0
    return-void
.end method

.method private checkDownloadResult()I
    .locals 5

    .line 174
    const-string v0, "===aaa==delete =\u5f00\u5361\u68c0\u67e5"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 175
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Z)V

    .line 176
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/InitDmsdAndDownloadAppletOperator;->excute()I

    move-result v4

    .line 177
    const/16 v0, 0x63

    if-ne v4, v0, :cond_0

    .line 179
    const/16 v0, 0x450

    return v0

    .line 181
    :cond_0
    return v4
.end method

.method private getCardNum()Ljava/lang/String;
    .locals 8

    .line 239
    const/4 v5, 0x1

    .line 240
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;->createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 241
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;->readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    move-result-object v6

    .line 242
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PersonalizingBusCardOperator getCardNum failed. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 245
    const-string v0, "1102"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3611a46f

    invoke-static {v2, v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 246
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 247
    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 248
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "orderNo"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 249
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayInfo()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getRequestId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "aid"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 250
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 251
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1102"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "issue card,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 255
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 253
    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 256
    const/4 v0, 0x0

    return-object v0

    .line 258
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getOrderID()Ljava/lang/String;
    .locals 8

    .line 305
    const/4 v2, 0x0

    .line 306
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getHasUnusedIssueOrder()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->getUnfinishedOrderID()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_2

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getApplyOrders()Ljava/util/List;

    move-result-object v3

    .line 313
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    .line 315
    :cond_1
    const-string v0, "IssueTrafficCardSAOperator issueTrafficCard, query orders err!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 316
    const/4 v0, 0x0

    return-object v0

    .line 319
    :cond_2
    const/4 v4, 0x0

    .line 320
    const/4 v5, 0x0

    .line 321
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;

    .line 323
    const-string v0, "0"

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 325
    move-object v4, v7

    goto :goto_1

    .line 327
    :cond_3
    const-string v0, "2"

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 329
    move-object v5, v7

    .line 331
    :cond_4
    :goto_1
    goto :goto_0

    .line 333
    :cond_5
    if-eqz v4, :cond_6

    .line 335
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderId()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 337
    :cond_6
    if-eqz v5, :cond_7

    .line 339
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderId()Ljava/lang/String;

    move-result-object v2

    .line 342
    :cond_7
    :goto_2
    return-object v2
.end method

.method private getUnfinishedOrderID()Ljava/lang/String;
    .locals 7

    .line 347
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getQueryOrders()Ljava/util/List;

    move-result-object v2

    .line 348
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 350
    :cond_0
    const-string v0, "IssueTrafficCardSAOperator issueTrafficCard, query orders err!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 351
    const/4 v0, 0x0

    return-object v0

    .line 354
    :cond_1
    const/4 v3, 0x0

    .line 355
    const/4 v4, 0x0

    .line 356
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 358
    const-string v0, "0"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 360
    move-object v3, v6

    goto :goto_1

    .line 362
    :cond_2
    const-string v0, "2"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 364
    move-object v4, v6

    .line 366
    :cond_3
    :goto_1
    goto :goto_0

    .line 368
    :cond_4
    if-eqz v3, :cond_5

    .line 370
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 372
    :cond_5
    if-eqz v4, :cond_6

    .line 374
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 376
    :cond_6
    const/4 v0, 0x0

    return-object v0
.end method

.method private handleErrCode(ILjava/lang/String;)I
    .locals 3

    .line 390
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PersonalizingBusCardOprator, code ="

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

    .line 392
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 395
    :pswitch_0
    const/16 v2, 0xa

    .line 396
    goto :goto_1

    .line 398
    :pswitch_1
    const/16 v2, 0xb

    .line 399
    goto :goto_1

    .line 401
    :pswitch_2
    const/16 v2, 0x19

    .line 402
    goto :goto_1

    .line 415
    :goto_0
    const/16 v2, 0x4af

    .line 418
    :goto_1
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleResult(I)V

    .line 419
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private handleResult(I)V
    .locals 1

    .line 381
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;->handleResult(I)V

    .line 385
    :cond_0
    return-void
.end method

.method private report(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 424
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v7

    .line 425
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    move-object v1, p1

    move-object v3, v7

    move-object v4, p3

    move-object v5, p2

    const/4 v2, 0x0

    const/16 v6, 0xb

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 427
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    const/16 v1, 0xb

    invoke-static {v0, p1, v7, p2, v1}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 429
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    const-string v1, "1000"

    const-string v2, "open card success"

    const/16 v3, 0xb

    invoke-virtual {v0, p2, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 434
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    const-string v3, "open card success"

    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 437
    return-void
.end method

.method private updateTaInfo(Ljava/lang/String;)I
    .locals 6

    .line 186
    const/16 v2, 0x63

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 188
    if-eqz v3, :cond_0

    .line 190
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setFpanFour(Ljava/lang/String;)V

    .line 191
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setCardStatus(I)V

    .line 192
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setStatusUpdateTime(J)V

    .line 193
    const/4 v4, 0x0

    .line 196
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 197
    const/4 v4, 0x1

    .line 207
    goto :goto_0

    .line 199
    :catch_0
    move-exception v5

    .line 201
    const-string v0, "WalletTaCardNotExistException "

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 202
    const/4 v4, 0x1

    .line 207
    goto :goto_0

    .line 204
    :catch_1
    move-exception v5

    .line 206
    const-string v0, "WalletTaSystemErrorException "

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    :goto_0
    if-eqz v4, :cond_0

    .line 213
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->addCard(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    :try_end_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_1 .. :try_end_1} :catch_5

    .line 214
    const/4 v2, 0x0

    .line 232
    goto :goto_1

    .line 216
    :catch_2
    move-exception v5

    .line 218
    const-string v0, "WalletTaCardAlreadyExistException "

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    goto :goto_1

    .line 220
    :catch_3
    move-exception v5

    .line 222
    const/16 v2, 0x44d

    .line 223
    const-string v0, "WalletTaSystemErrorException "

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    goto :goto_1

    .line 225
    :catch_4
    move-exception v5

    .line 227
    const-string v0, "WalletTaSystemErrorException "

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    goto :goto_1

    .line 229
    :catch_5
    move-exception v5

    .line 231
    const-string v0, "WalletTaSystemErrorException "

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 235
    :cond_0
    :goto_1
    return v2
.end method


# virtual methods
.method public issueTrafficCard()I
    .locals 22

    .line 62
    const-string v0, "IssueTrafficCardSAOperator issueTrafficCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 63
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    if-nez v0, :cond_1

    .line 65
    :cond_0
    const-string v7, "IssueTrafficCardSAOperator issueTrafficCard, param is null"

    .line 66
    invoke-static {v7}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 67
    const v0, 0x3611a46f

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "1199"

    .line 68
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setFailCode(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 69
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 70
    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 72
    move-object/from16 v0, p0

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleResult(I)V

    .line 73
    const/16 v0, 0xa

    return v0

    .line 76
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->checkDownloadResult()I

    move-result v7

    .line 77
    if-eqz v7, :cond_2

    .line 79
    const-string v8, "IssueTrafficCardSAOperator issueTrafficCard, checkDownloadResult failed!"

    .line 80
    invoke-static {v8}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 81
    const-string v0, "1199"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3611a46f

    invoke-static {v2, v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 82
    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 83
    invoke-virtual {v0, v8}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 84
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 86
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleResult(I)V

    .line 87
    return v7

    .line 90
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v8

    .line 91
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v9

    .line 92
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v10

    .line 93
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v11

    .line 94
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v12

    .line 95
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->getOrderID()Ljava/lang/String;

    move-result-object v13

    .line 96
    if-nez v13, :cond_3

    .line 98
    const-string v14, "IssueTrafficCardSAOperator issueTrafficCard err, get orderID err."

    .line 99
    const-string v0, "1199"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3611a46f

    invoke-static {v2, v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 100
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 101
    invoke-virtual {v0, v14}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 102
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 104
    move-object/from16 v0, p0

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleResult(I)V

    .line 105
    const/16 v0, 0xa

    return v0

    .line 108
    :cond_3
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->addTaCard()V

    .line 110
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v13

    move-object v3, v9

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 111
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v4

    move-object v5, v11

    move-object v6, v12

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v14, v0

    .line 112
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v15

    .line 113
    invoke-virtual {v15}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/nfc/PluginPayAdapter;

    .line 114
    invoke-interface/range {v16 .. v16}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v14, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setImei(Ljava/lang/String;)V

    .line 117
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    .line 118
    invoke-interface {v0, v14}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->personalizeApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;

    move-result-object v17

    .line 119
    const-string v0, "IssueTrafficCardSAOperator issueTrafficCard end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 121
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->getResultCode()I

    move-result v0

    if-nez v0, :cond_6

    .line 123
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->getCardNum()Ljava/lang/String;

    move-result-object v19

    .line 124
    move-object/from16 v0, v19

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 126
    move-object/from16 v0, p0

    const/16 v1, 0x451

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleResult(I)V

    .line 127
    const-string v0, "PersonalizingBusCardOprator SA issuerCard failed. getCardNum failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 128
    const/16 v0, 0x451

    return v0

    .line 131
    :cond_4
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->updateTaInfo(Ljava/lang/String;)I

    move-result v20

    .line 132
    const/4 v0, 0x0

    move/from16 v1, v20

    if-eq v0, v1, :cond_5

    .line 134
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleResult(I)V

    .line 135
    const-string v21, "PersonalizingBusCardOprator SA issuerCard failed. getCardNum failed."

    .line 136
    invoke-static/range {v21 .. v21}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 137
    const-string v0, "1102"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3611a46f

    invoke-static {v2, v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 138
    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 139
    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 140
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "orderNo"

    .line 141
    invoke-virtual {v0, v1, v13}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "aid"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 142
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1102"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "issue card,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v4, v20

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 148
    return v20

    .line 150
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    move-object/from16 v3, v19

    invoke-direct {v2, v0, v1, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->report(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const/16 v18, 0x0

    .line 152
    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleResult(I)V

    .line 153
    goto/16 :goto_0

    .line 156
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PersonalizingBusCardOperator SA issuerCard failed."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 157
    const-string v0, "1102"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3611a46f

    invoke-static {v2, v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 158
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 159
    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 160
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "orderNo"

    .line 161
    invoke-virtual {v0, v1, v13}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 162
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 164
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1102"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "issue card,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 166
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->getResultCode()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 164
    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 167
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->getResultCode()I

    move-result v0

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/PersonalizingBusCardOprator;->handleErrCode(ILjava/lang/String;)I

    move-result v18

    .line 169
    :goto_0
    return v18
.end method
