.class Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$f;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/pay/ProductDetailResult;Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 249
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 250
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;)Lcom/huawei/hms/support/api/pay/ProductDetailResult;
    .locals 5

    .line 254
    if-nez p1, :cond_0

    .line 255
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "produuctDetailResp is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const/4 v0, 0x0

    return-object v0

    .line 259
    :cond_0
    const-string v0, "HuaweiPayApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "produuctDetail resp :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;->returnCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    new-instance v3, Lcom/huawei/hms/support/api/pay/ProductDetailResult;

    invoke-direct {v3}, Lcom/huawei/hms/support/api/pay/ProductDetailResult;-><init>()V

    .line 262
    new-instance v4, Lcom/huawei/hms/support/api/client/Status;

    iget v0, p1, Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;->returnCode:I

    iget-object v1, p1, Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;->errMsg:Ljava/lang/String;

    invoke-direct {v4, v0, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    .line 263
    invoke-virtual {v3, v4}, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 264
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;->getFailList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->setFailList(Ljava/util/List;)V

    .line 265
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;->getProductList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->setProductList(Ljava/util/List;)V

    .line 266
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;->getRequestId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->setRequestId(Ljava/lang/String;)V

    .line 267
    return-object v3
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 247
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$f;->a(Lcom/huawei/hms/support/api/entity/pay/ProductDetailResp;)Lcom/huawei/hms/support/api/pay/ProductDetailResult;

    move-result-object v0

    return-object v0
.end method
