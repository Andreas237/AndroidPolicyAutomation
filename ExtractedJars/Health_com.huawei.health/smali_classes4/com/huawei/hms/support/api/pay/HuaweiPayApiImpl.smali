.class public Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/pay/HuaweiPayApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$f;,
        Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;,
        Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$c;,
        Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$a;,
        Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$b;,
        Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addWithholdingPlan(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/WithholdRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/WithholdRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation

    .line 78
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "Enter addWithholdingPlan"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-virtual {p1}, Lcom/huawei/hms/api/HuaweiApiClient;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/c/j;->b(Landroid/content/Context;)I

    move-result v2

    .line 81
    const v0, 0x138ddc0

    if-ge v2, v0, :cond_0

    .line 82
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$d;

    const v1, 0x3611c81f

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$d;-><init>(I)V

    return-object v0

    .line 85
    :cond_0
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;

    const-string v1, "pay.withhold"

    invoke-direct {v0, p1, v1, p2}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public getOrderDetail(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/OrderRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/OrderRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/OrderResult;>;"
        }
    .end annotation

    .line 112
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "Enter getOrderDetail"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$a;

    const-string v1, "pay.getOrderDetail"

    invoke-direct {v0, p1, v1, p2}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$a;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public getPayResultInfoFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/pay/PayResultInfo;
    .locals 5

    .line 207
    if-nez p1, :cond_0

    .line 208
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "getPayResultInfoFromIntent intent is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    const/4 v0, 0x0

    return-object v0

    .line 211
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 213
    if-nez v3, :cond_1

    .line 214
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "getPayResultInfoFromIntent bundle is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const/4 v0, 0x0

    return-object v0

    .line 218
    :cond_1
    new-instance v4, Lcom/huawei/hms/support/api/pay/PayResultInfo;

    invoke-direct {v4}, Lcom/huawei/hms/support/api/pay/PayResultInfo;-><init>()V

    .line 219
    const-string v0, "returnCode"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setReturnCode(I)V

    .line 220
    const-string v0, "userName"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setUserName(Ljava/lang/String;)V

    .line 221
    const-string v0, "orderID"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setOrderID(Ljava/lang/String;)V

    .line 222
    const-string v0, "amount"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setAmount(Ljava/lang/String;)V

    .line 223
    const-string v0, "errMsg"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setErrMsg(Ljava/lang/String;)V

    .line 224
    const-string v0, "time"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setTime(Ljava/lang/String;)V

    .line 225
    const-string v0, "country"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setCountry(Ljava/lang/String;)V

    .line 226
    const-string v0, "currency"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setCurrency(Ljava/lang/String;)V

    .line 227
    const-string v0, "withholdID"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setWithholdID(Ljava/lang/String;)V

    .line 228
    const-string v0, "requestId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setRequestId(Ljava/lang/String;)V

    .line 229
    const-string v0, "sign"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->setSign(Ljava/lang/String;)V

    .line 230
    const-string v0, "HuaweiPayApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "final pay result info::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    return-object v4
.end method

.method public getProductDetails(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductDetailRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductDetailRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/ProductDetailResult;>;"
        }
    .end annotation

    .line 243
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "Enter getProductDetails"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$f;

    const-string v1, "pay.productdetail"

    invoke-direct {v0, p1, v1, p2}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$f;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public getProductPayResultFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;
    .locals 5

    .line 293
    if-nez p1, :cond_0

    .line 294
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "getProductPayResultFromIntent intent is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const/4 v0, 0x0

    return-object v0

    .line 297
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 299
    if-nez v3, :cond_1

    .line 300
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "getProductPayResultFromIntent bundle is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const/4 v0, 0x0

    return-object v0

    .line 304
    :cond_1
    new-instance v4, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;

    invoke-direct {v4}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;-><init>()V

    .line 305
    const-string v0, "returnCode"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setReturnCode(I)V

    .line 306
    const-string v0, "orderID"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setOrderID(Ljava/lang/String;)V

    .line 307
    const-string v0, "errMsg"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setErrMsg(Ljava/lang/String;)V

    .line 308
    const-string v0, "productNo"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setProductNo(Ljava/lang/String;)V

    .line 309
    const-string v0, "microsAmount"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setMicrosAmount(J)V

    .line 310
    const-string v0, "time"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setTime(Ljava/lang/String;)V

    .line 311
    const-string v0, "country"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setCountry(Ljava/lang/String;)V

    .line 312
    const-string v0, "currency"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setCurrency(Ljava/lang/String;)V

    .line 313
    const-string v0, "requestId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setRequestId(Ljava/lang/String;)V

    .line 314
    const-string v0, "merchantId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setMerchantId(Ljava/lang/String;)V

    .line 315
    const-string v0, "sign"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->setSign(Ljava/lang/String;)V

    .line 316
    const-string v0, "HuaweiPayApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "final product pay result info::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->getReturnCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    return-object v4
.end method

.method public getPurchaseInfo(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;>;"
        }
    .end annotation

    .line 151
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "Enter getPurchaseInfo"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    invoke-virtual {p1}, Lcom/huawei/hms/api/HuaweiApiClient;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/c/j;->b(Landroid/content/Context;)I

    move-result v3

    .line 154
    const v0, 0x13a58a8

    if-ge v3, v0, :cond_0

    .line 155
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$b;

    const v1, 0x3611c81f

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$b;-><init>(I)V

    return-object v0

    .line 158
    :cond_0
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$c;

    const-string v1, "pay.purchaseinfo"

    new-instance v2, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoInnerRequest;

    invoke-direct {v2, p2}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoInnerRequest;-><init>(Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoRequest;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public internalPay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/InternalPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/InternalPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation

    .line 328
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "Enter internalPay"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    invoke-virtual {p1}, Lcom/huawei/hms/api/HuaweiApiClient;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/c/j;->b(Landroid/content/Context;)I

    move-result v2

    .line 331
    const v0, 0x13a58a8

    if-ge v2, v0, :cond_0

    .line 332
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$d;

    const v1, 0x3611c81f

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$d;-><init>(I)V

    return-object v0

    .line 335
    :cond_0
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;

    const-string v1, "pay.inner.walletPay"

    invoke-direct {v0, p1, v1, p2}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public pay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PayReq;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PayReq;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation

    .line 61
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "Enter pay"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hms/api/HuaweiApiClient;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "15110106"

    iget-object v3, p2, Lcom/huawei/hms/support/api/entity/pay/PayReq;->requestId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/support/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;

    const-string v1, "pay.pay"

    new-instance v2, Lcom/huawei/hms/support/api/entity/pay/GamePayReq;

    invoke-virtual {p1}, Lcom/huawei/hms/api/HuaweiApiClient;->getCpID()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p2, v3}, Lcom/huawei/hms/support/api/entity/pay/GamePayReq;-><init>(Lcom/huawei/hms/support/api/entity/pay/PayReq;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public productPay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation

    .line 280
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "Enter productPay"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    new-instance v0, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;

    const-string v1, "pay.productPay"

    new-instance v2, Lcom/huawei/hms/support/api/entity/pay/GameProductPayReq;

    invoke-virtual {p1}, Lcom/huawei/hms/api/HuaweiApiClient;->getCpID()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p2, v3}, Lcom/huawei/hms/support/api/entity/pay/GameProductPayReq;-><init>(Lcom/huawei/hms/support/api/entity/pay/ProductPayRequest;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method
