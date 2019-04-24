.class Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/pay/PayResult;Lcom/huawei/hms/support/api/entity/pay/PayResp;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 181
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 182
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/pay/PayResp;)Lcom/huawei/hms/support/api/pay/PayResult;
    .locals 5

    .line 186
    if-nez p1, :cond_0

    .line 187
    const-string v0, "HuaweiPayApiImpl"

    const-string v1, "pay resp is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const/4 v0, 0x0

    return-object v0

    .line 191
    :cond_0
    const-string v0, "HuaweiPayApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pay resp :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/hms/support/api/entity/pay/PayResp;->retCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    new-instance v3, Lcom/huawei/hms/support/api/pay/PayResult;

    invoke-direct {v3}, Lcom/huawei/hms/support/api/pay/PayResult;-><init>()V

    .line 194
    new-instance v4, Lcom/huawei/hms/support/api/client/Status;

    iget v0, p1, Lcom/huawei/hms/support/api/entity/pay/PayResp;->retCode:I

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PayResp;->getPendingIntent()Landroid/app/PendingIntent;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 195
    invoke-virtual {v3, v4}, Lcom/huawei/hms/support/api/pay/PayResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 196
    return-object v3
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 179
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/pay/PayResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/pay/HuaweiPayApiImpl$e;->a(Lcom/huawei/hms/support/api/entity/pay/PayResp;)Lcom/huawei/hms/support/api/pay/PayResult;

    move-result-object v0

    return-object v0
.end method
