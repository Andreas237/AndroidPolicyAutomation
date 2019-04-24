.class public Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ORDER_TYPE_OPEN_CARD:Ljava/lang/String; = "0"

.field public static final ORDER_TYPE_OPEN_CARD_AND_RECHARGE:Ljava/lang/String; = "2"

.field public static final ORDER_TYPE_RECHARGE:Ljava/lang/String; = "1"


# instance fields
.field private SPMerchantId:Ljava/lang/String;

.field private accessMode:Ljava/lang/String;

.field private amount:Ljava/lang/String;

.field private appId:Ljava/lang/String;

.field private applicationID:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private merchantName:Ljava/lang/String;

.field private nonceStr:Ljava/lang/String;

.field private orderId:Ljava/lang/String;

.field private orderTime:Ljava/lang/String;

.field private orderType:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private packageValue:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private prepayId:Ljava/lang/String;

.field private productDesc:Ljava/lang/String;

.field private productName:Ljava/lang/String;

.field private sdkChannel:Ljava/lang/String;

.field private serviceCatalog:Ljava/lang/String;

.field private sign:Ljava/lang/String;

.field private signType:Ljava/lang/String;

.field private timeStamp:Ljava/lang/String;

.field private tn:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private urlVer:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderId:Ljava/lang/String;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->SPMerchantId:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->merchantName:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->applicationID:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->packageName:Ljava/lang/String;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->accessMode:Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->serviceCatalog:Ljava/lang/String;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->productName:Ljava/lang/String;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->productDesc:Ljava/lang/String;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->signType:Ljava/lang/String;

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->sign:Ljava/lang/String;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->amount:Ljava/lang/String;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->currency:Ljava/lang/String;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderType:Ljava/lang/String;

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderTime:Ljava/lang/String;

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->url:Ljava/lang/String;

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->urlVer:Ljava/lang/String;

    .line 124
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->sdkChannel:Ljava/lang/String;

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->tn:Ljava/lang/String;

    .line 133
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->appId:Ljava/lang/String;

    .line 135
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->nonceStr:Ljava/lang/String;

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->partnerId:Ljava/lang/String;

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->prepayId:Ljava/lang/String;

    .line 141
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->timeStamp:Ljava/lang/String;

    .line 143
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->packageValue:Ljava/lang/String;

    return-void
.end method

.method public static buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;
    .locals 3

    .line 397
    if-nez p0, :cond_0

    .line 399
    const/4 v0, 0x0

    return-object v0

    .line 401
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;-><init>()V

    .line 405
    const-string v0, "requestId"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setOrderId(Ljava/lang/String;)V

    .line 406
    const-string v0, "orderType"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setOrderType(Ljava/lang/String;)V

    .line 407
    const-string v0, "orderTime"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setOrderTime(Ljava/lang/String;)V

    .line 408
    const-string v0, "merchantId"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setSPMerchantId(Ljava/lang/String;)V

    .line 409
    const-string v0, "merchantName"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setMerchantName(Ljava/lang/String;)V

    .line 410
    const-string v0, "applicationID"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setApplicationID(Ljava/lang/String;)V

    .line 411
    const-string v0, "packageName"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setPackageName(Ljava/lang/String;)V

    .line 412
    const-string v0, "accessMode"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setAccessMode(Ljava/lang/String;)V

    .line 413
    const-string v0, "serviceCatalog"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setServiceCatalog(Ljava/lang/String;)V

    .line 414
    const-string v0, "currency"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setCurrency(Ljava/lang/String;)V

    .line 415
    const-string v0, "amount"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setAmount(Ljava/lang/String;)V

    .line 416
    const-string v0, "productName"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setProductName(Ljava/lang/String;)V

    .line 417
    const-string v0, "productDesc"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setProductDesc(Ljava/lang/String;)V

    .line 418
    const-string v0, "signType"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setSignType(Ljava/lang/String;)V

    .line 419
    const-string v0, "sign"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setSign(Ljava/lang/String;)V

    .line 420
    const-string v0, "url"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setUrl(Ljava/lang/String;)V

    .line 421
    const-string v0, "urlver"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setUrlVer(Ljava/lang/String;)V

    .line 422
    const-string v0, "tn"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setTn(Ljava/lang/String;)V

    .line 424
    const-string v0, "appid"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setWxAppId(Ljava/lang/String;)V

    .line 425
    const-string v0, "noncestr"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setWxNonceStr(Ljava/lang/String;)V

    .line 426
    const-string v0, "partnerid"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setWxPartnerId(Ljava/lang/String;)V

    .line 427
    const-string v0, "prepayid"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setWxPrepayId(Ljava/lang/String;)V

    .line 428
    const-string v0, "timestamp"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setWxTimeStamp(Ljava/lang/String;)V

    .line 429
    const-string v0, "packageValue"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setWxPackageValue(Ljava/lang/String;)V

    .line 431
    const-string v0, "sdkChannel"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 433
    const-string v0, "sdkChannel"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setSdkChannel(Ljava/lang/String;)V

    goto :goto_0

    .line 437
    :cond_1
    const-string v0, "0"

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->setSdkChannel(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 444
    :goto_0
    goto :goto_1

    .line 440
    :catch_0
    move-exception v2

    .line 442
    const-string v0, "ServerAccessApplyOrder buildFromJson, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 443
    const/4 v1, 0x0

    .line 446
    :goto_1
    return-object v1
.end method


# virtual methods
.method public getAccessMode()Ljava/lang/String;
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->accessMode:Ljava/lang/String;

    return-object v0
.end method

.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationID()Ljava/lang/String;
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->applicationID:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 357
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantName()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderTime()Ljava/lang/String;
    .locals 1

    .line 377
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderTime:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderType()Ljava/lang/String;
    .locals 1

    .line 367
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderType:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getProductDesc()Ljava/lang/String;
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->productDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 307
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public getSPMerchantId()Ljava/lang/String;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->SPMerchantId:Ljava/lang/String;

    return-object v0
.end method

.method public getSdkChannel()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->sdkChannel:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceCatalog()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->serviceCatalog:Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public getSignType()Ljava/lang/String;
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->signType:Ljava/lang/String;

    return-object v0
.end method

.method public getTn()Ljava/lang/String;
    .locals 1

    .line 387
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->tn:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getUrlVer()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->urlVer:Ljava/lang/String;

    return-object v0
.end method

.method public getWxAppId()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getWxNonceStr()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->nonceStr:Ljava/lang/String;

    return-object v0
.end method

.method public getWxPackageValue()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->packageValue:Ljava/lang/String;

    return-object v0
.end method

.method public getWxPartnerId()Ljava/lang/String;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public getWxPrepayId()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->prepayId:Ljava/lang/String;

    return-object v0
.end method

.method public getWxTimeStamp()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->timeStamp:Ljava/lang/String;

    return-object v0
.end method

.method public setAccessMode(Ljava/lang/String;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->accessMode:Ljava/lang/String;

    .line 293
    return-void
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 352
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->amount:Ljava/lang/String;

    .line 353
    return-void
.end method

.method public setApplicationID(Ljava/lang/String;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->applicationID:Ljava/lang/String;

    .line 273
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 362
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->currency:Ljava/lang/String;

    .line 363
    return-void
.end method

.method public setMerchantName(Ljava/lang/String;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->merchantName:Ljava/lang/String;

    .line 263
    return-void
.end method

.method public setOrderId(Ljava/lang/String;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderId:Ljava/lang/String;

    .line 243
    return-void
.end method

.method public setOrderTime(Ljava/lang/String;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderTime:Ljava/lang/String;

    .line 383
    return-void
.end method

.method public setOrderType(Ljava/lang/String;)V
    .locals 0

    .line 372
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->orderType:Ljava/lang/String;

    .line 373
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->packageName:Ljava/lang/String;

    .line 283
    return-void
.end method

.method public setProductDesc(Ljava/lang/String;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->productDesc:Ljava/lang/String;

    .line 323
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 312
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->productName:Ljava/lang/String;

    .line 313
    return-void
.end method

.method public setSPMerchantId(Ljava/lang/String;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->SPMerchantId:Ljava/lang/String;

    .line 253
    return-void
.end method

.method public setSdkChannel(Ljava/lang/String;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->sdkChannel:Ljava/lang/String;

    .line 213
    return-void
.end method

.method public setServiceCatalog(Ljava/lang/String;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->serviceCatalog:Ljava/lang/String;

    .line 303
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->sign:Ljava/lang/String;

    .line 343
    return-void
.end method

.method public setSignType(Ljava/lang/String;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->signType:Ljava/lang/String;

    .line 333
    return-void
.end method

.method public setTn(Ljava/lang/String;)V
    .locals 0

    .line 392
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->tn:Ljava/lang/String;

    .line 393
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->url:Ljava/lang/String;

    .line 223
    return-void
.end method

.method public setUrlVer(Ljava/lang/String;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->urlVer:Ljava/lang/String;

    .line 233
    return-void
.end method

.method public setWxAppId(Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->appId:Ljava/lang/String;

    .line 163
    return-void
.end method

.method public setWxNonceStr(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->nonceStr:Ljava/lang/String;

    .line 173
    return-void
.end method

.method public setWxPackageValue(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->packageValue:Ljava/lang/String;

    .line 153
    return-void
.end method

.method public setWxPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->partnerId:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public setWxPrepayId(Ljava/lang/String;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->prepayId:Ljava/lang/String;

    .line 193
    return-void
.end method

.method public setWxTimeStamp(Ljava/lang/String;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->timeStamp:Ljava/lang/String;

    .line 203
    return-void
.end method
