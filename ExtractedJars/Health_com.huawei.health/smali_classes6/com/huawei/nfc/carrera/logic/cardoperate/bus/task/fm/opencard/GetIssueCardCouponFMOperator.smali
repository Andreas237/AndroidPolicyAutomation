.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "GetIssueCardCouponFMOperator"


# instance fields
.field private mCityCode:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mContext:Landroid/content/Context;

    .line 34
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 35
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mCityCode:Ljava/lang/String;

    .line 36
    return-void
.end method


# virtual methods
.method public getIssueCardCoupon()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
    .locals 16

    .line 39
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;-><init>()V

    .line 40
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v5

    .line 41
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v6

    .line 42
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v7

    .line 43
    if-nez v7, :cond_0

    .line 44
    const-string v0, "GetIssueCardCouponFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GetIssueCardCouponFMOperator getIssueCardCoupon failed. card info does not exists. productId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const/16 v0, 0x63

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 47
    return-object v4

    .line 49
    :cond_0
    const-string v0, "GetIssueCardCouponFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GetIssueCardCouponFMOperator befor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mCityCode:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/NfcCityCode;->getFMCityCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 52
    const-string v0, "GetIssueCardCouponFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GetIssueCardCouponFMOperator end cityCode \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    const-string v0, ""

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    :cond_1
    const-string v0, "GetIssueCardCouponFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GetIssueCardCouponFMOperator getCityCode is null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const-string v8, "01"

    .line 58
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v9

    .line 60
    new-instance v10, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;

    invoke-direct {v10}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;-><init>()V

    .line 61
    invoke-virtual {v10, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->setAid(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v10, v9}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v10, v8}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->setCity4Current(Ljava/lang/String;)V

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getIssueCardCoupon myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 65
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mContext:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/GetIssueCardCouponFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryProducts(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;

    move-result-object v11

    .line 66
    const-string v0, "GetIssueCardCouponFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GetIssueCardCouponFMOperator response.resultCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v11, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->resultCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget v0, v11, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->resultCode:I

    if-eqz v0, :cond_3

    .line 68
    const/16 v0, 0x63

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 69
    return-object v4

    .line 71
    :cond_3
    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->getList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_5

    .line 72
    :cond_4
    const-string v0, "GetIssueCardCouponFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GetIssueCardCouponFMOperator Product List is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const/16 v0, 0x63

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 74
    return-object v4

    .line 77
    :cond_5
    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->getList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcn/com/fmsh/tsm/business/bean/Product;

    .line 78
    invoke-virtual {v12}, Lcn/com/fmsh/tsm/business/bean/Product;->getPrice()I

    move-result v13

    .line 79
    invoke-virtual {v12}, Lcn/com/fmsh/tsm/business/bean/Product;->getName()Ljava/lang/String;

    move-result-object v14

    .line 80
    invoke-virtual {v12}, Lcn/com/fmsh/tsm/business/bean/Product;->getCode()Ljava/lang/String;

    move-result-object v15

    .line 81
    const-string v0, "GetIssueCardCouponFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GetIssueCardCouponFMOperator price : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; name : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; productCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setIssueActCode(Ljava/lang/String;)V

    .line 85
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setIssueActAmount(Ljava/lang/String;)V

    .line 86
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setIssueStdAmount(Ljava/lang/String;)V

    .line 87
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 88
    invoke-virtual {v4, v15}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setProductCode(Ljava/lang/String;)V

    .line 89
    return-object v4
.end method
