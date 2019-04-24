.class Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$a;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/pay/OrderResult;Lcom/huawei/hms/support/api/entity/pay/OrderResp;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 119
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 120
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/pay/OrderResp;)Lcom/huawei/hms/support/api/pay/OrderResult;
    .locals 5

    .line 125
    if-nez p1, :cond_0

    .line 126
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "order resp is null or orderResp.returnCode is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const/4 v0, 0x0

    return-object v0

    .line 130
    :cond_0
    const-string v0, "HuaweiPayApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOrderDetail resp :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getReturnCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    new-instance v3, Lcom/huawei/hms/support/api/pay/OrderResult;

    invoke-direct {v3, p1}, Lcom/huawei/hms/support/api/pay/OrderResult;-><init>(Lcom/huawei/hms/support/api/entity/pay/OrderResp;)V

    .line 133
    new-instance v4, Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getReturnCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getReturnDesc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    .line 134
    invoke-virtual {v3, v4}, Lcom/huawei/hms/support/api/pay/OrderResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 135
    return-object v3
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 116
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/pay/OrderResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$a;->a(Lcom/huawei/hms/support/api/entity/pay/OrderResp;)Lcom/huawei/hms/support/api/pay/OrderResult;

    move-result-object v0

    return-object v0
.end method
