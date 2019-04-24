.class final Lcom/huawei/hms/support/api/a/b;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/ConnectResp;>;Lcom/huawei/hms/support/api/entity/core/ConnectResp;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/core/ConnectResp;)Lcom/huawei/hms/support/api/ResolveResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/entity/core/ConnectResp;)Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/ConnectResp;>;"
        }
    .end annotation

    .line 47
    new-instance v2, Lcom/huawei/hms/support/api/ResolveResult;

    invoke-direct {v2, p1}, Lcom/huawei/hms/support/api/ResolveResult;-><init>(Ljava/lang/Object;)V

    .line 48
    sget-object v0, Lcom/huawei/hms/support/api/client/Status;->SUCCESS:Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {v2, v0}, Lcom/huawei/hms/support/api/ResolveResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 49
    const-string v0, "connectservice"

    const-string v1, "connect - onComplete: success"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    return-object v2
.end method

.method public checkApiClient(Lcom/huawei/hms/support/api/client/ApiClient;)Z
    .locals 1

    .line 55
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 44
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/core/ConnectResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/a/b;->a(Lcom/huawei/hms/support/api/entity/core/ConnectResp;)Lcom/huawei/hms/support/api/ResolveResult;

    move-result-object v0

    return-object v0
.end method
