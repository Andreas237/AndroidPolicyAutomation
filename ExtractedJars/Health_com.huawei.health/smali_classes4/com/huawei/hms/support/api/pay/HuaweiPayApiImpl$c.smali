.class Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$c;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 164
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 165
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;)Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;
    .locals 3

    .line 169
    if-nez p1, :cond_0

    .line 170
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "order resp is null or orderResp.returnCode is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const/4 v0, 0x0

    return-object v0

    .line 174
    :cond_0
    const-string v0, "HuaweiPayApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPurchaseInfo resp :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;->getRtnCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    new-instance v0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;

    invoke-direct {v0, p1}, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;-><init>(Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;)V

    return-object v0
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 161
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$c;->a(Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;)Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;

    move-result-object v0

    return-object v0
.end method
