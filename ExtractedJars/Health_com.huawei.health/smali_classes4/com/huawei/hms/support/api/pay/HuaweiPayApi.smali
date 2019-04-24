.class public interface abstract Lcom/huawei/hms/support/api/pay/HuaweiPayApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addWithholdingPlan(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/WithholdRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/WithholdRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation
.end method

.method public abstract getOrderDetail(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/OrderRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/OrderRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/OrderResult;>;"
        }
    .end annotation
.end method

.method public abstract getPayResultInfoFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/pay/PayResultInfo;
.end method

.method public abstract getProductDetails(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductDetailRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductDetailRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/ProductDetailResult;>;"
        }
    .end annotation
.end method

.method public abstract getProductPayResultFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;
.end method

.method public abstract getPurchaseInfo(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;>;"
        }
    .end annotation
.end method

.method public abstract internalPay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/InternalPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/InternalPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation
.end method

.method public abstract pay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PayReq;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PayReq;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation
.end method

.method public abstract productPay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/ProductPayRequest;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/pay/PayResult;>;"
        }
    .end annotation
.end method
