.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai11;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai10;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai9;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai8;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai7;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai6;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai5;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai4;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai3;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai2;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder$ApplyOrderSai1;
    }
.end annotation


# static fields
.field public static final ORDER_TYPE_OPEN_CARD:Ljava/lang/String; = "0"

.field public static final ORDER_TYPE_OPEN_CARD_AND_RECHARGE:Ljava/lang/String; = "2"

.field public static final ORDER_TYPE_RECHARGE:Ljava/lang/String; = "1"

.field public static final ORDER_TYPE_TRANSFER_IN:Ljava/lang/String; = "4"

.field public static final ORDER_TYPE_TRANSFER_IN_RECHARGE:Ljava/lang/String; = "7"

.field public static final ORDER_TYPE_TRANSFER_OUT:Ljava/lang/String; = "3"


# instance fields
.field private SPMerchantId:Ljava/lang/String;

.field private accessMode:Ljava/lang/String;

.field private amount:Ljava/lang/String;

.field private appId:Ljava/lang/String;

.field private applicationId:Ljava/lang/String;

.field private applyOrderTn:Ljava/lang/String;

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

.field private url:Ljava/lang/String;

.field private urlVer:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderId:Ljava/lang/String;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->SPMerchantId:Ljava/lang/String;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->merchantName:Ljava/lang/String;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->applicationId:Ljava/lang/String;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->packageName:Ljava/lang/String;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->accessMode:Ljava/lang/String;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->serviceCatalog:Ljava/lang/String;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->productName:Ljava/lang/String;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->productDesc:Ljava/lang/String;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->signType:Ljava/lang/String;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->sign:Ljava/lang/String;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->amount:Ljava/lang/String;

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->currency:Ljava/lang/String;

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderType:Ljava/lang/String;

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderTime:Ljava/lang/String;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->url:Ljava/lang/String;

    .line 133
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->sdkChannel:Ljava/lang/String;

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->urlVer:Ljava/lang/String;

    .line 143
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->applyOrderTn:Ljava/lang/String;

    .line 341
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->appId:Ljava/lang/String;

    .line 343
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->nonceStr:Ljava/lang/String;

    .line 345
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->partnerId:Ljava/lang/String;

    .line 347
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->prepayId:Ljava/lang/String;

    .line 349
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->timeStamp:Ljava/lang/String;

    .line 351
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->packageValue:Ljava/lang/String;

    .line 148
    return-void
.end method


# virtual methods
.method public getAccessMode()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->accessMode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 292
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->amount:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationId()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->applicationId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getApplyOrderTn()Ljava/lang/String;
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->applyOrderTn:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->currency:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantName()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->merchantName:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderTime()Ljava/lang/String;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderTime:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderType()Ljava/lang/String;
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderType:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->packageName:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProductDesc()Ljava/lang/String;
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->productDesc:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->productName:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSPMerchantId()Ljava/lang/String;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->SPMerchantId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSdkChannel()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->sdkChannel:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getServiceCatalog()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->serviceCatalog:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->sign:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSignType()Ljava/lang/String;
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->signType:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->url:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getUrlVer()Ljava/lang/String;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->urlVer:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getWechatPayAppId()Ljava/lang/String;
    .locals 1

    .line 366
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getWechatPayNonceStr()Ljava/lang/String;
    .locals 1

    .line 376
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->nonceStr:Ljava/lang/String;

    return-object v0
.end method

.method public getWechatPayPackageValue()Ljava/lang/String;
    .locals 1

    .line 355
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->packageValue:Ljava/lang/String;

    return-object v0
.end method

.method public getWechatPayPartnerId()Ljava/lang/String;
    .locals 1

    .line 386
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public getWechatPayPrepayId()Ljava/lang/String;
    .locals 1

    .line 396
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->prepayId:Ljava/lang/String;

    return-object v0
.end method

.method public getWechatPayTimeStamp()Ljava/lang/String;
    .locals 1

    .line 406
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->timeStamp:Ljava/lang/String;

    return-object v0
.end method

.method public setAccessMode(Ljava/lang/String;)V
    .locals 1

    .line 237
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->accessMode:Ljava/lang/String;

    .line 238
    return-void
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 1

    .line 297
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->amount:Ljava/lang/String;

    .line 298
    return-void
.end method

.method public setApplicationId(Ljava/lang/String;)V
    .locals 1

    .line 217
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->applicationId:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public setApplyOrderTn(Ljava/lang/String;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->applyOrderTn:Ljava/lang/String;

    .line 338
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 1

    .line 307
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->currency:Ljava/lang/String;

    .line 308
    return-void
.end method

.method public setMerchantName(Ljava/lang/String;)V
    .locals 1

    .line 207
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->merchantName:Ljava/lang/String;

    .line 208
    return-void
.end method

.method public setOrderId(Ljava/lang/String;)V
    .locals 1

    .line 187
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderId:Ljava/lang/String;

    .line 188
    return-void
.end method

.method public setOrderTime(Ljava/lang/String;)V
    .locals 1

    .line 327
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderTime:Ljava/lang/String;

    .line 328
    return-void
.end method

.method public setOrderType(Ljava/lang/String;)V
    .locals 1

    .line 317
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->orderType:Ljava/lang/String;

    .line 318
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 1

    .line 227
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->packageName:Ljava/lang/String;

    .line 228
    return-void
.end method

.method public setProductDesc(Ljava/lang/String;)V
    .locals 1

    .line 267
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->productDesc:Ljava/lang/String;

    .line 268
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 1

    .line 257
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->productName:Ljava/lang/String;

    .line 258
    return-void
.end method

.method public setSPMerchantId(Ljava/lang/String;)V
    .locals 1

    .line 197
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->SPMerchantId:Ljava/lang/String;

    .line 198
    return-void
.end method

.method public setSdkChannel(Ljava/lang/String;)V
    .locals 1

    .line 157
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->sdkChannel:Ljava/lang/String;

    .line 158
    return-void
.end method

.method public setServiceCatalog(Ljava/lang/String;)V
    .locals 1

    .line 247
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->serviceCatalog:Ljava/lang/String;

    .line 248
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 1

    .line 287
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->sign:Ljava/lang/String;

    .line 288
    return-void
.end method

.method public setSignType(Ljava/lang/String;)V
    .locals 1

    .line 277
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->signType:Ljava/lang/String;

    .line 278
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 1

    .line 167
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->url:Ljava/lang/String;

    .line 168
    return-void
.end method

.method public setUrlVer(Ljava/lang/String;)V
    .locals 1

    .line 177
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->urlVer:Ljava/lang/String;

    .line 178
    return-void
.end method

.method public setWechatPayAppId(Ljava/lang/String;)V
    .locals 0

    .line 371
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->appId:Ljava/lang/String;

    .line 372
    return-void
.end method

.method public setWechatPayNonceStr(Ljava/lang/String;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->nonceStr:Ljava/lang/String;

    .line 382
    return-void
.end method

.method public setWechatPayPackageValue(Ljava/lang/String;)V
    .locals 0

    .line 360
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->packageValue:Ljava/lang/String;

    .line 361
    return-void
.end method

.method public setWechatPayPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 391
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->partnerId:Ljava/lang/String;

    .line 392
    return-void
.end method

.method public setWechatPayPrepayId(Ljava/lang/String;)V
    .locals 0

    .line 401
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->prepayId:Ljava/lang/String;

    .line 402
    return-void
.end method

.method public setWechatPayTimeStamp(Ljava/lang/String;)V
    .locals 0

    .line 411
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->timeStamp:Ljava/lang/String;

    .line 412
    return-void
.end method
