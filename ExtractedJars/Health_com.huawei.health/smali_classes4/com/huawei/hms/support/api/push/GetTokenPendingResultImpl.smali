.class public Lcom/huawei/hms/support/api/push/GetTokenPendingResultImpl;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/push/TokenResult;Lcom/huawei/hms/support/api/entity/push/TokenResp;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 21
    return-void
.end method


# virtual methods
.method public bridge synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 16
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/push/TokenResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/push/GetTokenPendingResultImpl;->onComplete(Lcom/huawei/hms/support/api/entity/push/TokenResp;)Lcom/huawei/hms/support/api/push/TokenResult;

    move-result-object v0

    return-object v0
.end method

.method public onComplete(Lcom/huawei/hms/support/api/entity/push/TokenResp;)Lcom/huawei/hms/support/api/push/TokenResult;
    .locals 4

    .line 25
    new-instance v3, Lcom/huawei/hms/support/api/push/TokenResult;

    invoke-direct {v3}, Lcom/huawei/hms/support/api/push/TokenResult;-><init>()V

    .line 26
    const-string v0, "GetTokenPendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get token complete, the return code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/push/TokenResp;->getRetCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/push/TokenResp;->getRetCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/push/TokenResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 28
    invoke-virtual {v3, p1}, Lcom/huawei/hms/support/api/push/TokenResult;->setTokenRes(Lcom/huawei/hms/support/api/entity/push/TokenResp;)V

    .line 29
    return-object v3
.end method

.method public bridge synthetic onError(I)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 16
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/push/GetTokenPendingResultImpl;->onError(I)Lcom/huawei/hms/support/api/push/TokenResult;

    move-result-object v0

    return-object v0
.end method

.method protected onError(I)Lcom/huawei/hms/support/api/push/TokenResult;
    .locals 2

    .line 34
    new-instance v1, Lcom/huawei/hms/support/api/push/TokenResult;

    invoke-direct {v1}, Lcom/huawei/hms/support/api/push/TokenResult;-><init>()V

    .line 35
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    invoke-direct {v0, p1}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    invoke-virtual {v1, v0}, Lcom/huawei/hms/support/api/push/TokenResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 36
    return-object v1
.end method
