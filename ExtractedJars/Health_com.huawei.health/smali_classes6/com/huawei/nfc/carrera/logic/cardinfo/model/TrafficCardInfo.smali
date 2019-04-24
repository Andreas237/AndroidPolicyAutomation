.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BUSCARD_NOT_SUPPORT_DELETE:I = 0x0

.field public static final BUSCARD_SUPPORT_DELETE:I = 0x1


# instance fields
.field private agreementUrl:Ljava/lang/String;

.field private aid:Ljava/lang/String;

.field private cardIcon:Landroid/graphics/Bitmap;

.field private cardLogo:Landroid/graphics/Bitmap;

.field private cardNum:Ljava/lang/String;

.field private cardStatus:I

.field private contactHuaweiNum:Ljava/lang/String;

.field private isSupportDelete:I

.field public issueAmounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;>;"
        }
    .end annotation
.end field

.field private licUrl:Ljava/lang/String;

.field private mIssuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mode:I

.field private name:Ljava/lang/String;

.field private proUrl:Ljava/lang/String;

.field private productCode:Ljava/lang/String;

.field private productDesc:Ljava/lang/String;

.field public rechargeAmounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;>;"
        }
    .end annotation
.end field

.field private wxLedger:Z

.field private wxPaySupport:Z


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)V
    .locals 6

    .line 284
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->issueAmounts:Ljava/util/List;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->rechargeAmounts:Ljava/util/List;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxLedger:Z

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxPaySupport:Z

    .line 285
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->mIssuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 286
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->name:Ljava/lang/String;

    .line 287
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->aid:Ljava/lang/String;

    .line 288
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getDebitTcUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->licUrl:Ljava/lang/String;

    .line 289
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCreditTcUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->proUrl:Ljava/lang/String;

    .line 290
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getBusAgreementUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->agreementUrl:Ljava/lang/String;

    .line 291
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getDescription()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->productDesc:Ljava/lang/String;

    .line 292
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getContactNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->contactHuaweiNum:Ljava/lang/String;

    .line 293
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIsSupportDelete()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isSupportDelete:I

    .line 294
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->mode:I

    .line 295
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->isWxLedgerSupport()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxLedger:Z

    .line 296
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->isWxPaySupport()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxPaySupport:Z

    .line 297
    move-object v0, p0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getIssueCardRechargeAmounts()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getIssueCardStdCost()I

    move-result v2

    int-to-double v2, v2

    .line 298
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getIssueCardDiscountCost()I

    move-result v4

    int-to-double v4, v4

    .line 297
    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->parseIssueMoney([Ljava/lang/String;DD)V

    .line 299
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getCommonRechargeAmounts()[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getRechargeDiscountAmounts()[Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->parseRechargeMoney([Ljava/lang/String;[Ljava/lang/String;)V

    .line 300
    return-void
.end method

.method public static getBuscardNotSupportDelete()I
    .locals 1

    .line 204
    const/4 v0, 0x0

    return v0
.end method

.method public static getBuscardSupportDelete()I
    .locals 1

    .line 208
    const/4 v0, 0x1

    return v0
.end method

.method private parseIssueMoney([Ljava/lang/String;DD)V
    .locals 10

    .line 303
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 304
    :cond_0
    const-string v0, "parseRechargeMoney input param is not illegal.issueAmounts"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 305
    return-void

    .line 307
    :cond_1
    const/4 v4, 0x0

    .line 308
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->issueAmounts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 309
    move-object v5, p1

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    .line 310
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;-><init>()V

    .line 311
    invoke-virtual {v4, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueStdMoney(D)V

    .line 312
    invoke-virtual {v4, p4, p5}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueMoney(D)V

    .line 316
    :try_start_0
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setPayMoney(D)V

    .line 317
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getPayMoney()D

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setRechargeMoney(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 322
    goto :goto_1

    .line 318
    :catch_0
    move-exception v9

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseRechargeMoney amount is not number. amount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issueCardCost = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 321
    goto :goto_2

    .line 323
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->issueAmounts:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 325
    :cond_2
    return-void
.end method

.method private parseRechargeMoney([Ljava/lang/String;[Ljava/lang/String;)V
    .locals 10

    .line 328
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 329
    :cond_0
    const-string v0, "parseRechargeMoney input param is not illegal.rechargeStdMoney"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 330
    return-void

    .line 332
    :cond_1
    if-eqz p2, :cond_2

    array-length v0, p2

    if-gtz v0, :cond_3

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    .line 333
    :goto_0
    if-eqz p2, :cond_4

    array-length v0, p2

    array-length v1, p1

    if-eq v0, v1, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    .line 334
    :goto_1
    if-eqz v3, :cond_5

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseRechargeMoney : discount amounts info is not illegal.StdMoney = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 336
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " DiscountMoney = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 335
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 338
    :cond_5
    const/4 v4, 0x0

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->rechargeAmounts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 340
    const-wide/16 v5, 0x0

    .line 341
    const-wide/16 v7, 0x0

    .line 342
    const/4 v9, 0x0

    :goto_2
    array-length v0, p1

    if-ge v9, v0, :cond_a

    .line 343
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;-><init>()V

    .line 344
    aget-object v0, p1, v9

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v5

    .line 345
    if-nez v2, :cond_6

    if-eqz v3, :cond_7

    :cond_6
    const-wide/16 v7, 0x0

    goto :goto_3

    :cond_7
    aget-object v0, p2, v9

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 346
    :goto_3
    const-wide/16 v0, 0x0

    cmpg-double v0, v5, v0

    if-ltz v0, :cond_8

    const-wide/16 v0, 0x0

    cmpg-double v0, v7, v0

    if-gez v0, :cond_9

    .line 347
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseIssueMoney amount is not a number.rechargeStdMoney = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " rechargeDiscountMoney = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 348
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 347
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 349
    goto :goto_4

    .line 351
    :cond_9
    invoke-virtual {v4, v5, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->setRechargeMoney(D)V

    .line 352
    invoke-virtual {v4, v7, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->setPayMoney(D)V

    .line 353
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->rechargeAmounts:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseIssueMoney amount rechargeMoney"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ---payMoney--- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 342
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 356
    :cond_a
    return-void
.end method


# virtual methods
.method public clearRechargeAmounts()V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->rechargeAmounts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 114
    return-void
.end method

.method public getAgreementUrl()Ljava/lang/String;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->agreementUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAid()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->aid:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCardIcon()Landroid/graphics/Bitmap;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardIcon:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getCardLogo()Landroid/graphics/Bitmap;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardLogo:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getCardNum()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardNum:Ljava/lang/String;

    return-object v0
.end method

.method public getCardStatus()I
    .locals 1

    .line 117
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardStatus:I

    return v0
.end method

.method public getContactHuaweiNum()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->contactHuaweiNum:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getIsSupportDelete()I
    .locals 1

    .line 196
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isSupportDelete:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIssueAmounts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;>;"
        }
    .end annotation

    .line 220
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->issueAmounts:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getIssuerCardSupport()Z
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->mIssuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerCardSupport()Z

    move-result v0

    return v0
.end method

.method public getLicUrl()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->licUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 269
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->mode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->name:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProUrl()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->proUrl:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProductCode()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->productCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProductDesc()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->productDesc:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeAmounts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;>;"
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->rechargeAmounts:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getRechargeSupport()Z
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->mIssuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getRechargeSupport()Z

    move-result v0

    return v0
.end method

.method public getTransferUrl()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->mIssuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getTransferUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isWxLedger()Z
    .locals 1

    .line 377
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxLedger:Z

    return v0
.end method

.method public isWxPaySupport()Z
    .locals 1

    .line 277
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxPaySupport:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public setAgreementUrl(Ljava/lang/String;)V
    .locals 1

    .line 192
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->agreementUrl:Ljava/lang/String;

    .line 193
    return-void
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 1

    .line 137
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->aid:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setCardIcon(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 176
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardIcon:Landroid/graphics/Bitmap;

    .line 177
    return-void
.end method

.method public setCardLogo(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 184
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardLogo:Landroid/graphics/Bitmap;

    .line 185
    return-void
.end method

.method public setCardNum(Ljava/lang/String;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardNum:Ljava/lang/String;

    .line 235
    return-void
.end method

.method public setCardStatus(I)V
    .locals 0

    .line 121
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardStatus:I

    .line 122
    return-void
.end method

.method public setContactHuaweiNum(Ljava/lang/String;)V
    .locals 1

    .line 216
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->contactHuaweiNum:Ljava/lang/String;

    .line 217
    return-void
.end method

.method public setIsSupportDelete(I)V
    .locals 1

    .line 200
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isSupportDelete:I

    .line 201
    return-void
.end method

.method public setIssueAmounts(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;>;)V"
        }
    .end annotation

    .line 224
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->issueAmounts:Ljava/util/List;

    .line 225
    return-void
.end method

.method public setLicUrl(Ljava/lang/String;)V
    .locals 1

    .line 145
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->licUrl:Ljava/lang/String;

    .line 146
    return-void
.end method

.method public setMode(I)V
    .locals 1

    .line 273
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->mode:I

    .line 274
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 1

    .line 129
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->name:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setProUrl(Ljava/lang/String;)V
    .locals 1

    .line 160
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->proUrl:Ljava/lang/String;

    .line 161
    return-void
.end method

.method public setProductCode(Ljava/lang/String;)V
    .locals 1

    .line 250
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->productCode:Ljava/lang/String;

    .line 251
    return-void
.end method

.method public setProductDesc(Ljava/lang/String;)V
    .locals 1

    .line 168
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->productDesc:Ljava/lang/String;

    .line 169
    return-void
.end method

.method public setRechargeAmounts(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;>;)V"
        }
    .end annotation

    .line 242
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->rechargeAmounts:Ljava/util/List;

    .line 243
    return-void
.end method

.method public setWxLedger(Z)V
    .locals 0

    .line 381
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxLedger:Z

    .line 382
    return-void
.end method

.method public setWxPaySupport(Z)V
    .locals 1

    .line 281
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->wxPaySupport:Z

    .line 282
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 360
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TrafficCardInfo{name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", licUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->licUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", proUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->proUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", productDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->productDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardLogo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->cardLogo:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", agreementUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->agreementUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSupportDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isSupportDelete:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contactHuaweiNum=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->contactHuaweiNum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", issueAmounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->issueAmounts:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rechargeAmounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->rechargeAmounts:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public trafficCardInfoSai1()V
    .locals 0

    .line 385
    return-void
.end method

.method public trafficCardInfoSai2()V
    .locals 0

    .line 388
    return-void
.end method

.method public trafficCardInfoSai3()V
    .locals 0

    .line 391
    return-void
.end method

.method public trafficCardInfoSai4()V
    .locals 0

    .line 394
    return-void
.end method

.method public trafficCardInfoSai5()V
    .locals 0

    .line 397
    return-void
.end method

.method public trafficCardInfoSai6()V
    .locals 0

    .line 400
    return-void
.end method

.method public trafficCardInfoSai7()V
    .locals 0

    .line 403
    return-void
.end method

.method public trafficCardInfoSai8()V
    .locals 0

    .line 406
    return-void
.end method

.method public trafficCardInfoSai9()V
    .locals 0

    .line 409
    return-void
.end method
