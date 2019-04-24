.class public Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public commonRechargeAmounts:[Ljava/lang/String;

.field public description:Ljava/lang/String;

.field private fontColor:Ljava/lang/String;

.field public issueCardActCd:Ljava/lang/String;

.field public issueCardDiscountCost:I

.field public issueCardRechargeAmounts:[Ljava/lang/String;

.field public issueCardStdCost:I

.field public issuerId:Ljava/lang/String;

.field public mktInfo:Ljava/lang/String;

.field public pictureUrl:Ljava/lang/String;

.field public productId:Ljava/lang/String;

.field public productName:Ljava/lang/String;

.field public rechargeActCd:Ljava/lang/String;

.field public rechargeDiscountAmounts:[Ljava/lang/String;

.field private reserved1:Ljava/lang/String;

.field private reserved2:Ljava/lang/String;

.field private reserved3:Ljava/lang/String;

.field private reserved4:Ljava/lang/String;

.field private reserved5:Ljava/lang/String;

.field private reserved6:Ljava/lang/String;

.field public reservedInfo:Ljava/lang/String;

.field public snbCardId:Ljava/lang/String;

.field public snbCityBusCode:Ljava/lang/String;

.field public timeStamp:J

.field public type:I

.field public version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardDiscountCost:I

    .line 188
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;)V
    .locals 3

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardDiscountCost:I

    .line 192
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getBundle()Landroid/os/Bundle;

    move-result-object v2

    .line 193
    const-string v0, "productId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    .line 194
    const-string v0, "productName"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    .line 195
    const-string v0, "pictureUrl"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->pictureUrl:Ljava/lang/String;

    .line 196
    const-string v0, "description"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->description:Ljava/lang/String;

    .line 197
    const-string v0, "type"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->type:I

    .line 198
    const-string v0, "timeStamp"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->timeStamp:J

    .line 199
    const-string v0, "version"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->version:Ljava/lang/String;

    .line 200
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issuerId:Ljava/lang/String;

    .line 201
    const-string v0, "mktInfo"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->mktInfo:Ljava/lang/String;

    .line 202
    const-string v0, "reservedInfo"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reservedInfo:Ljava/lang/String;

    .line 203
    const-string v0, "fontColor"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->fontColor:Ljava/lang/String;

    .line 204
    const-string v0, "reserved1"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved1:Ljava/lang/String;

    .line 205
    const-string v0, "reserved2"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved2:Ljava/lang/String;

    .line 206
    const-string v0, "reserved3"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved3:Ljava/lang/String;

    .line 207
    const-string v0, "reserved4"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved4:Ljava/lang/String;

    .line 208
    const-string v0, "reserved5"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved5:Ljava/lang/String;

    .line 209
    const-string v0, "reserved6"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved6:Ljava/lang/String;

    .line 210
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->parseMktInfoJson()V

    .line 211
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->parseReservedJson()V

    .line 212
    return-void
.end method

.method private addString(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 653
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 655
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 657
    :cond_0
    return-void
.end method


# virtual methods
.method public getCommonRechargeAmounts()[Ljava/lang/String;
    .locals 1

    .line 451
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->commonRechargeAmounts:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->commonRechargeAmounts:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :goto_0
    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 486
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->description:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getFontColor()Ljava/lang/String;
    .locals 1

    .line 389
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->fontColor:Ljava/lang/String;

    return-object v0
.end method

.method public getIssueCardActCd()Ljava/lang/String;
    .locals 1

    .line 571
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardActCd:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getIssueCardDiscountCost()I
    .locals 1

    .line 581
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardDiscountCost:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIssueCardRechargeAmounts()[Ljava/lang/String;
    .locals 1

    .line 556
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardRechargeAmounts:[Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getIssueCardStdCost()I
    .locals 1

    .line 591
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardStdCost:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 526
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issuerId:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMktInfo()Ljava/lang/String;
    .locals 1

    .line 536
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->mktInfo:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPictureUrl()Ljava/lang/String;
    .locals 1

    .line 476
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->pictureUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 456
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeActCd()Ljava/lang/String;
    .locals 1

    .line 601
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeActCd:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeDiscountAmounts()[Ljava/lang/String;
    .locals 1

    .line 446
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeDiscountAmounts:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeDiscountAmounts:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :goto_0
    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getReserved1()Ljava/lang/String;
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved1:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved2()Ljava/lang/String;
    .locals 1

    .line 405
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved2:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved3()Ljava/lang/String;
    .locals 1

    .line 413
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved3:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved4()Ljava/lang/String;
    .locals 1

    .line 421
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved4:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved5()Ljava/lang/String;
    .locals 1

    .line 429
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved5:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved6()Ljava/lang/String;
    .locals 1

    .line 437
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved6:Ljava/lang/String;

    return-object v0
.end method

.method public getReservedInfo()Ljava/lang/String;
    .locals 1

    .line 546
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reservedInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getReservedNField()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 641
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 642
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved1:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->addString(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 643
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved2:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->addString(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 644
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved3:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->addString(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved4:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->addString(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 646
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved5:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->addString(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 647
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved6:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->addString(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 648
    return-object v1
.end method

.method public getSnbCardId()Ljava/lang/String;
    .locals 1

    .line 616
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->snbCardId:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSnbCityBusCode()Ljava/lang/String;
    .locals 1

    .line 626
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->snbCityBusCode:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 506
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->timeStamp:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 496
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 516
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->version:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final parseMktInfoJson()V
    .locals 4

    .line 218
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->mktInfo:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 220
    new-instance v2, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->mktInfo:Ljava/lang/String;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 243
    const-string v0, "issuecard_act_cd"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    const-string v0, "issuecard_act_cd"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardActCd:Ljava/lang/String;

    .line 248
    :cond_0
    const-string v0, "issuecard_discount_cost"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 250
    const-string v0, "issuecard_discount_cost"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardDiscountCost:I

    .line 253
    :cond_1
    const-string v0, "recharge_act_cd"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 255
    const-string v0, "recharge_act_cd"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeActCd:Ljava/lang/String;

    .line 258
    :cond_2
    const-string v0, "recharge_discount_amounts"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 260
    const-string v0, "recharge_discount_amounts"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 261
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 263
    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeDiscountAmounts:[Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 275
    :cond_3
    goto :goto_0

    .line 272
    :catch_0
    move-exception v2

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseMktInfoJson : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 276
    :goto_0
    return-void
.end method

.method public final parseReservedJson()V
    .locals 4

    .line 282
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reservedInfo:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 284
    new-instance v2, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reservedInfo:Ljava/lang/String;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 285
    const-string v0, "issuecard_recharge"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    const-string v0, "issuecard_recharge"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 288
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 290
    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardRechargeAmounts:[Ljava/lang/String;

    .line 294
    :cond_0
    const-string v0, "common_recharge"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 296
    const-string v0, "common_recharge"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 297
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 299
    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->commonRechargeAmounts:[Ljava/lang/String;

    .line 303
    :cond_1
    const-string v0, "issuecard_std_cost"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 305
    const-string v0, "issuecard_std_cost"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardStdCost:I

    .line 308
    :cond_2
    const-string v0, "card_id"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 310
    const-string v0, "card_id"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 311
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 313
    iput-object v3, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->snbCardId:Ljava/lang/String;

    .line 317
    :cond_3
    const-string v0, "city_bus_code"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 319
    const-string v0, "city_bus_code"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 320
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 322
    iput-object v3, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->snbCityBusCode:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 329
    :cond_4
    goto :goto_0

    .line 326
    :catch_0
    move-exception v2

    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseReservedJson : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 330
    :goto_0
    return-void
.end method

.method public setCommonRechargeAmounts([Ljava/lang/String;)V
    .locals 1

    .line 566
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->commonRechargeAmounts:[Ljava/lang/String;

    .line 567
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 1

    .line 491
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->description:Ljava/lang/String;

    .line 492
    return-void
.end method

.method public setFontColor(Ljava/lang/String;)V
    .locals 0

    .line 393
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->fontColor:Ljava/lang/String;

    .line 394
    return-void
.end method

.method public setIssueCardActCd(Ljava/lang/String;)V
    .locals 1

    .line 576
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardActCd:Ljava/lang/String;

    .line 577
    return-void
.end method

.method public setIssueCardDiscountCost(I)V
    .locals 1

    .line 586
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardDiscountCost:I

    .line 587
    return-void
.end method

.method public setIssueCardRechargeAmounts([Ljava/lang/String;)V
    .locals 1

    .line 561
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardRechargeAmounts:[Ljava/lang/String;

    .line 562
    return-void
.end method

.method public setIssueCardStdCost(I)V
    .locals 1

    .line 596
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issueCardStdCost:I

    .line 597
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 1

    .line 531
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issuerId:Ljava/lang/String;

    .line 532
    return-void
.end method

.method public setMktInfo(Ljava/lang/String;)V
    .locals 1

    .line 541
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->mktInfo:Ljava/lang/String;

    .line 542
    return-void
.end method

.method public setPictureUrl(Ljava/lang/String;)V
    .locals 1

    .line 481
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->pictureUrl:Ljava/lang/String;

    .line 482
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 1

    .line 461
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    .line 462
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 1

    .line 471
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    .line 472
    return-void
.end method

.method public setRechargeActCd(Ljava/lang/String;)V
    .locals 1

    .line 606
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeActCd:Ljava/lang/String;

    .line 607
    return-void
.end method

.method public setRechargeDiscountAmounts([Ljava/lang/String;)V
    .locals 1

    .line 611
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->rechargeDiscountAmounts:[Ljava/lang/String;

    .line 612
    return-void
.end method

.method public setReserved1(Ljava/lang/String;)V
    .locals 0

    .line 401
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved1:Ljava/lang/String;

    .line 402
    return-void
.end method

.method public setReserved2(Ljava/lang/String;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved2:Ljava/lang/String;

    .line 410
    return-void
.end method

.method public setReserved3(Ljava/lang/String;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved3:Ljava/lang/String;

    .line 418
    return-void
.end method

.method public setReserved4(Ljava/lang/String;)V
    .locals 0

    .line 425
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved4:Ljava/lang/String;

    .line 426
    return-void
.end method

.method public setReserved5(Ljava/lang/String;)V
    .locals 0

    .line 433
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved5:Ljava/lang/String;

    .line 434
    return-void
.end method

.method public setReserved6(Ljava/lang/String;)V
    .locals 0

    .line 441
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved6:Ljava/lang/String;

    .line 442
    return-void
.end method

.method public setReservedInfo(Ljava/lang/String;)V
    .locals 1

    .line 551
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reservedInfo:Ljava/lang/String;

    .line 552
    return-void
.end method

.method public setSnbCardId(Ljava/lang/String;)V
    .locals 1

    .line 621
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->snbCardId:Ljava/lang/String;

    .line 622
    return-void
.end method

.method public setSnbCityBusCode(Ljava/lang/String;)V
    .locals 1

    .line 631
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->snbCityBusCode:Ljava/lang/String;

    .line 632
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 2

    .line 511
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->timeStamp:J

    .line 512
    return-void
.end method

.method public setType(I)V
    .locals 1

    .line 501
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->type:I

    .line 502
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 1

    .line 521
    invoke-static {p1}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->version:Ljava/lang/String;

    .line 522
    return-void
.end method

.method public toContentValues()Landroid/content/ContentValues;
    .locals 4

    .line 366
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 367
    const-string v0, "product_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    const-string v0, "pic_url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->pictureUrl:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    const-string v0, "description"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->description:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    const-string v0, "card_type"

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 372
    const-string v0, "timestamp"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->timeStamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 373
    const-string v0, "version"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->version:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    const-string v0, "issuer_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    const-string v0, "mkt_info"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->mktInfo:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    const-string v0, "reserved_info"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reservedInfo:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    const-string v0, "font_color"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->fontColor:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    const-string v0, "reserved_1"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved1:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    const-string v0, "reserved_2"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved2:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    const-string v0, "reserved_3"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved3:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    const-string v0, "reserved_4"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved4:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    const-string v0, "reserved_5"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved5:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    const-string v0, "reserved_6"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reserved6:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    return-object v3
.end method
